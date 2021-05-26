package com.reactspringcrud.simplecrud.repository;

import com.reactspringcrud.simplecrud.models.ERole;
import com.reactspringcrud.simplecrud.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role,Integer> {
    Optional<Role> findByName(ERole name);
}
