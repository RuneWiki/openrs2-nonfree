import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "F")
	public static float aFloat44;

	@OriginalMember(owner = "client!kt", name = "c", descriptor = "[I")
	public static int[] anIntArray275;

	@OriginalMember(owner = "client!kt", name = "d", descriptor = "Lclient!ap;")
	public static final Class15 aClass15_59 = new Class15("cyan:", "blaugrün:", "cyan:", "cyan:");

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(ILclient!bf;)V")
	public static void method2938(@OriginalArg(1) Class8_Sub3_Sub1 arg0) {
		arg0.aBoolean521 = false;
		@Pc(19) Class119 local19;
		if (arg0.anInt7389 != -1) {
			local19 = Static170.aClass125_3.method2389(arg0.anInt7389);
			if (local19 == null || local19.anIntArray244 == null) {
				arg0.aBoolean519 = false;
				arg0.anInt7389 = -1;
			} else {
				label394: {
					arg0.anInt7390++;
					if (arg0.anInt7371 < local19.anIntArray244.length && local19.anIntArray242[arg0.anInt7371] < arg0.anInt7390) {
						arg0.anInt7390 = 1;
						arg0.anInt7371++;
						arg0.anInt7403++;
						Static334.method4419(arg0.anInt7339, local19, arg0.aByte99, Static401.aClass8_Sub3_Sub1_Sub1_2 == arg0, arg0.anInt7371, arg0.anInt7343);
					}
					if (local19.anIntArray244.length <= arg0.anInt7371) {
						arg0.anInt7390 = 0;
						arg0.anInt7371 = 0;
						if (arg0.aBoolean519) {
							arg0.anInt7389 = arg0.method5892().method816();
							if (arg0.anInt7389 == -1) {
								arg0.aBoolean519 = false;
								break label394;
							}
							local19 = Static170.aClass125_3.method2389(arg0.anInt7389);
						}
						Static334.method4419(arg0.anInt7339, local19, arg0.aByte99, Static401.aClass8_Sub3_Sub1_Sub1_2 == arg0, arg0.anInt7371, arg0.anInt7343);
					}
					arg0.anInt7403 = arg0.anInt7371 + 1;
					if (arg0.anInt7403 >= local19.anIntArray244.length) {
						arg0.anInt7403 = 0;
					}
				}
			}
		}
		@Pc(185) int local185;
		@Pc(193) Class119 local193;
		@Pc(182) Class172 local182;
		if (arg0.anInt7387 != -1 && arg0.anInt7407 <= Static265.anInt4371) {
			local182 = Static452.aClass246_2.method5323(arg0.anInt7387);
			local185 = local182.anInt4088;
			if (local185 == -1) {
				arg0.anInt7387 = -1;
			} else {
				label396: {
					local193 = Static170.aClass125_3.method2389(local185);
					if (local182.aBoolean302) {
						if (local193.anInt3010 == 3) {
							if (arg0.anInt7428 > 0 && Static265.anInt4371 >= arg0.anInt7351 && Static265.anInt4371 > arg0.anInt7349) {
								arg0.anInt7387 = -1;
								break label396;
							}
						} else if (local193.anInt3010 == 1 && arg0.anInt7428 > 0 && arg0.anInt7351 <= Static265.anInt4371 && Static265.anInt4371 > arg0.anInt7349) {
							arg0.anInt7407 = Static265.anInt4371 + 1;
							break label396;
						}
					}
					if (local193 == null || local193.anIntArray244 == null) {
						arg0.anInt7387 = -1;
					} else {
						if (arg0.anInt7367 < 0) {
							arg0.anInt7367 = 0;
							Static334.method4419(arg0.anInt7339, local193, arg0.aByte99, arg0 == Static401.aClass8_Sub3_Sub1_Sub1_2, 0, arg0.anInt7343);
						}
						arg0.anInt7421++;
						if (arg0.anInt7367 < local193.anIntArray244.length && arg0.anInt7421 > local193.anIntArray242[arg0.anInt7367]) {
							arg0.anInt7421 = 1;
							arg0.anInt7367++;
							Static334.method4419(arg0.anInt7339, local193, arg0.aByte99, arg0 == Static401.aClass8_Sub3_Sub1_Sub1_2, arg0.anInt7367, arg0.anInt7343);
						}
						if (arg0.anInt7367 >= local193.anIntArray244.length) {
							if (local182.aBoolean302) {
								arg0.anInt7381++;
								arg0.anInt7367 -= local193.anInt2995;
								if (local193.anInt3004 <= arg0.anInt7381) {
									arg0.anInt7387 = -1;
								} else if (arg0.anInt7367 >= 0 && local193.anIntArray244.length > arg0.anInt7367) {
									Static334.method4419(arg0.anInt7339, local193, arg0.aByte99, Static401.aClass8_Sub3_Sub1_Sub1_2 == arg0, arg0.anInt7367, arg0.anInt7343);
								} else {
									arg0.anInt7387 = -1;
								}
							} else {
								arg0.anInt7387 = -1;
							}
						}
						arg0.anInt7386 = arg0.anInt7367 + 1;
						if (local193.anIntArray244.length <= arg0.anInt7386) {
							if (local182.aBoolean302) {
								arg0.anInt7386 -= local193.anInt2995;
								if (arg0.anInt7381 + 1 >= local193.anInt3004) {
									arg0.anInt7386 = -1;
								} else if (arg0.anInt7386 < 0 || local193.anIntArray244.length <= arg0.anInt7386) {
									arg0.anInt7386 = -1;
								}
							} else {
								arg0.anInt7386 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt7402 != -1 && Static265.anInt4371 >= arg0.anInt7392) {
			local182 = Static452.aClass246_2.method5323(arg0.anInt7402);
			local185 = local182.anInt4088;
			if (local185 == -1) {
				arg0.anInt7402 = -1;
			} else {
				label399: {
					local193 = Static170.aClass125_3.method2389(local185);
					if (local182.aBoolean302) {
						if (local193.anInt3010 == 3) {
							if (arg0.anInt7428 > 0 && Static265.anInt4371 >= arg0.anInt7351 && Static265.anInt4371 > arg0.anInt7349) {
								arg0.anInt7402 = -1;
								break label399;
							}
						} else if (local193.anInt3010 == 1 && arg0.anInt7428 > 0 && arg0.anInt7351 <= Static265.anInt4371 && arg0.anInt7349 < Static265.anInt4371) {
							arg0.anInt7392 = Static265.anInt4371 + 1;
							break label399;
						}
					}
					if (local193 == null || local193.anIntArray244 == null) {
						arg0.anInt7402 = -1;
					} else {
						if (arg0.anInt7384 < 0) {
							arg0.anInt7384 = 0;
							Static334.method4419(arg0.anInt7339, local193, arg0.aByte99, arg0 == Static401.aClass8_Sub3_Sub1_Sub1_2, 0, arg0.anInt7343);
						}
						arg0.anInt7377++;
						if (local193.anIntArray244.length > arg0.anInt7384 && arg0.anInt7377 > local193.anIntArray242[arg0.anInt7384]) {
							arg0.anInt7377 = 1;
							arg0.anInt7384++;
							Static334.method4419(arg0.anInt7339, local193, arg0.aByte99, Static401.aClass8_Sub3_Sub1_Sub1_2 == arg0, arg0.anInt7384, arg0.anInt7343);
						}
						if (local193.anIntArray244.length <= arg0.anInt7384) {
							if (local182.aBoolean302) {
								arg0.anInt7384 -= local193.anInt2995;
								arg0.anInt7393++;
								if (local193.anInt3004 <= arg0.anInt7393) {
									arg0.anInt7402 = -1;
								} else if (arg0.anInt7384 >= 0 && local193.anIntArray244.length > arg0.anInt7384) {
									Static334.method4419(arg0.anInt7339, local193, arg0.aByte99, Static401.aClass8_Sub3_Sub1_Sub1_2 == arg0, arg0.anInt7384, arg0.anInt7343);
								} else {
									arg0.anInt7402 = -1;
								}
							} else {
								arg0.anInt7402 = -1;
							}
						}
						arg0.anInt7360 = arg0.anInt7384 + 1;
						if (local193.anIntArray244.length <= arg0.anInt7360) {
							if (local182.aBoolean302) {
								arg0.anInt7360 -= local193.anInt2995;
								if (arg0.anInt7393 + 1 >= local193.anInt3004) {
									arg0.anInt7360 = -1;
								} else if (arg0.anInt7360 < 0 || arg0.anInt7360 >= local193.anIntArray244.length) {
									arg0.anInt7360 = -1;
								}
							} else {
								arg0.anInt7360 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt7365 != -1 && arg0.anInt7359 <= 1) {
			local19 = Static170.aClass125_3.method2389(arg0.anInt7365);
			if (local19.anInt3010 == 3) {
				if (arg0.anInt7428 > 0 && arg0.anInt7351 <= Static265.anInt4371 && arg0.anInt7349 < Static265.anInt4371) {
					arg0.anInt7365 = -1;
				}
			} else if (local19.anInt3010 == 1 && arg0.anInt7428 > 0 && arg0.anInt7351 <= Static265.anInt4371 && arg0.anInt7349 < Static265.anInt4371) {
				arg0.anInt7359 = 2;
			}
		}
		if (arg0.anInt7365 != -1 && arg0.anInt7359 == 0) {
			local19 = Static170.aClass125_3.method2389(arg0.anInt7365);
			if (local19 == null || local19.anIntArray244 == null) {
				arg0.anInt7365 = -1;
			} else {
				arg0.anInt7373++;
				if (local19.anIntArray244.length > arg0.anInt7375 && local19.anIntArray242[arg0.anInt7375] < arg0.anInt7373) {
					arg0.anInt7375++;
					arg0.anInt7373 = 1;
					Static334.method4419(arg0.anInt7339, local19, arg0.aByte99, Static401.aClass8_Sub3_Sub1_Sub1_2 == arg0, arg0.anInt7375, arg0.anInt7343);
				}
				if (local19.anIntArray244.length <= arg0.anInt7375) {
					arg0.anInt7358++;
					arg0.anInt7375 -= local19.anInt2995;
					if (arg0.anInt7358 >= local19.anInt3004) {
						arg0.anInt7365 = -1;
					} else if (arg0.anInt7375 >= 0 && arg0.anInt7375 < local19.anIntArray244.length) {
						Static334.method4419(arg0.anInt7339, local19, arg0.aByte99, Static401.aClass8_Sub3_Sub1_Sub1_2 == arg0, arg0.anInt7375, arg0.anInt7343);
					} else {
						arg0.anInt7365 = -1;
					}
				}
				arg0.anInt7382 = arg0.anInt7375 + 1;
				if (arg0.anInt7382 >= local19.anIntArray244.length) {
					arg0.anInt7382 -= local19.anInt2995;
					if (local19.anInt3004 <= arg0.anInt7358 + 1) {
						arg0.anInt7382 = -1;
					} else if (arg0.anInt7382 < 0 || local19.anIntArray244.length <= arg0.anInt7382) {
						arg0.anInt7382 = -1;
					}
				}
				arg0.aBoolean521 = local19.aBoolean221;
			}
		}
		if (arg0.anInt7359 > 0) {
			arg0.anInt7359--;
		}
		for (@Pc(1069) int local1069 = 0; local1069 < arg0.aClass39Array3.length; local1069++) {
			@Pc(1076) Class39 local1076 = arg0.aClass39Array3[local1069];
			if (local1076 != null) {
				if (local1076.anInt731 > 0) {
					local1076.anInt731--;
				} else {
					local193 = Static170.aClass125_3.method2389(local1076.anInt732);
					if (local193 == null || local193.anIntArray244 == null) {
						arg0.aClass39Array3[local1069] = null;
					} else {
						local1076.anInt736++;
						if (local1076.anInt734 < local193.anIntArray244.length && local1076.anInt736 > local193.anIntArray242[local1076.anInt734]) {
							local1076.anInt734++;
							local1076.anInt736 = 1;
							Static334.method4419(arg0.anInt7339, local193, arg0.aByte99, arg0 == Static401.aClass8_Sub3_Sub1_Sub1_2, local1076.anInt734, arg0.anInt7343);
						}
						if (local193.anIntArray244.length <= local1076.anInt734) {
							local1076.anInt734 -= local193.anInt2995;
							local1076.anInt729++;
							if (local193.anInt3004 <= local1076.anInt729) {
								arg0.aClass39Array3[local1069] = null;
							} else if (local1076.anInt734 >= 0 && local1076.anInt734 < local193.anIntArray244.length) {
								Static334.method4419(arg0.anInt7339, local193, arg0.aByte99, Static401.aClass8_Sub3_Sub1_Sub1_2 == arg0, local1076.anInt734, arg0.anInt7343);
							} else {
								arg0.aClass39Array3[local1069] = null;
							}
						}
						local1076.anInt738 = local1076.anInt734 + 1;
						if (local1076.anInt738 >= local193.anIntArray244.length) {
							local1076.anInt738 -= local193.anInt2995;
							if (local1076.anInt729 + 1 >= local193.anInt3004) {
								local1076.anInt738 = -1;
							} else if (local1076.anInt738 < 0 || local1076.anInt738 >= local193.anIntArray244.length) {
								local1076.anInt738 = -1;
							}
						}
					}
				}
			}
		}
	}
}
