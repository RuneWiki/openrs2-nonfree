import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static432 {

	@OriginalMember(owner = "client!vj", name = "G", descriptor = "[I")
	public static final int[] anIntArray491 = new int[13];

	@OriginalMember(owner = "client!vj", name = "J", descriptor = "I")
	public static int anInt6886 = 0;

	@OriginalMember(owner = "client!vj", name = "K", descriptor = "Lclient!tn;")
	public static final Class242 aClass242_115 = new Class242(10, 3);

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lclient!jg;B)V")
	public static void method5479(@OriginalArg(0) Class11_Sub1_Sub3 arg0) {
		arg0.anInt3313 = 0;
		@Pc(25) Class64 local25;
		if (arg0.anInt3317 != -1) {
			local25 = Static402.aClass37_2.method665(arg0.anInt3317);
			if (local25 == null || local25.anIntArray127 == null) {
				arg0.aBoolean322 = false;
				arg0.anInt3317 = -1;
			} else {
				label394: {
					arg0.anInt3280++;
					if (local25.anIntArray127.length > arg0.anInt3298 && arg0.anInt3280 > local25.anIntArray126[arg0.anInt3298]) {
						arg0.anInt3307++;
						arg0.anInt3298++;
						arg0.anInt3280 = 1;
						Static379.method131(arg0.anInt3298, arg0.anInt6428, local25, arg0.aByte90, arg0 == Static94.aClass11_Sub1_Sub3_Sub2_1, arg0.anInt6430);
					}
					if (local25.anIntArray127.length <= arg0.anInt3298) {
						arg0.anInt3298 = 0;
						arg0.anInt3280 = 0;
						if (arg0.aBoolean322) {
							arg0.anInt3317 = arg0.method2640().method3665();
							if (arg0.anInt3317 == -1) {
								arg0.aBoolean322 = false;
								break label394;
							}
							local25 = Static402.aClass37_2.method665(arg0.anInt3317);
						}
						Static379.method131(arg0.anInt3298, arg0.anInt6428, local25, arg0.aByte90, Static94.aClass11_Sub1_Sub3_Sub2_1 == arg0, arg0.anInt6430);
					}
					arg0.anInt3307 = arg0.anInt3298 + 1;
					if (arg0.anInt3307 >= local25.anIntArray127.length) {
						arg0.anInt3307 = 0;
					}
				}
			}
		}
		@Pc(199) int local199;
		@Pc(207) Class64 local207;
		@Pc(196) Class121 local196;
		if (arg0.anInt3266 != -1 && Static98.anInt1304 >= arg0.anInt3285) {
			local196 = Static46.aClass123_5.method2677(arg0.anInt3266);
			local199 = local196.anInt3204;
			if (local199 == -1) {
				arg0.anInt3266 = -1;
			} else {
				label396: {
					local207 = Static402.aClass37_2.method665(local199);
					if (local196.aBoolean319) {
						if (local207.anInt1197 == 3) {
							if (arg0.anInt3344 > 0 && Static98.anInt1304 >= arg0.anInt3301 && arg0.anInt3341 < Static98.anInt1304) {
								arg0.anInt3266 = -1;
								break label396;
							}
						} else if (local207.anInt1197 == 1 && arg0.anInt3344 > 0 && Static98.anInt1304 >= arg0.anInt3301 && Static98.anInt1304 > arg0.anInt3341) {
							arg0.anInt3285 = Static98.anInt1304 + 1;
							break label396;
						}
					}
					if (local207 == null || local207.anIntArray127 == null) {
						arg0.anInt3266 = -1;
					} else {
						if (arg0.anInt3338 < 0) {
							arg0.anInt3338 = 0;
							Static379.method131(0, arg0.anInt6428, local207, arg0.aByte90, Static94.aClass11_Sub1_Sub3_Sub2_1 == arg0, arg0.anInt6430);
						}
						arg0.anInt3267++;
						if (local207.anIntArray127.length > arg0.anInt3338 && arg0.anInt3267 > local207.anIntArray126[arg0.anInt3338]) {
							arg0.anInt3338++;
							arg0.anInt3267 = 1;
							Static379.method131(arg0.anInt3338, arg0.anInt6428, local207, arg0.aByte90, Static94.aClass11_Sub1_Sub3_Sub2_1 == arg0, arg0.anInt6430);
						}
						if (local207.anIntArray127.length <= arg0.anInt3338) {
							if (local196.aBoolean319) {
								arg0.anInt3338 -= local207.anInt1191;
								arg0.anInt3283++;
								if (arg0.anInt3283 >= local207.anInt1193) {
									arg0.anInt3266 = -1;
								} else if (arg0.anInt3338 >= 0 && local207.anIntArray127.length > arg0.anInt3338) {
									Static379.method131(arg0.anInt3338, arg0.anInt6428, local207, arg0.aByte90, Static94.aClass11_Sub1_Sub3_Sub2_1 == arg0, arg0.anInt6430);
								} else {
									arg0.anInt3266 = -1;
								}
							} else {
								arg0.anInt3266 = -1;
							}
						}
						arg0.anInt3300 = arg0.anInt3338 + 1;
						if (arg0.anInt3300 >= local207.anIntArray127.length) {
							if (local196.aBoolean319) {
								arg0.anInt3300 -= local207.anInt1191;
								if (local207.anInt1193 <= arg0.anInt3283 + 1) {
									arg0.anInt3300 = -1;
								} else if (arg0.anInt3300 < 0 || local207.anIntArray127.length <= arg0.anInt3300) {
									arg0.anInt3300 = -1;
								}
							} else {
								arg0.anInt3300 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt3328 != -1 && arg0.anInt3281 <= Static98.anInt1304) {
			local196 = Static46.aClass123_5.method2677(arg0.anInt3328);
			local199 = local196.anInt3204;
			if (local199 == -1) {
				arg0.anInt3328 = -1;
			} else {
				label400: {
					local207 = Static402.aClass37_2.method665(local199);
					if (local196.aBoolean319) {
						if (local207.anInt1197 == 3) {
							if (arg0.anInt3344 > 0 && arg0.anInt3301 <= Static98.anInt1304 && Static98.anInt1304 > arg0.anInt3341) {
								arg0.anInt3328 = -1;
								break label400;
							}
						} else if (local207.anInt1197 == 1 && arg0.anInt3344 > 0 && arg0.anInt3301 <= Static98.anInt1304 && arg0.anInt3341 < Static98.anInt1304) {
							arg0.anInt3281 = Static98.anInt1304 + 1;
							break label400;
						}
					}
					if (local207 == null || local207.anIntArray127 == null) {
						arg0.anInt3328 = -1;
					} else {
						if (arg0.anInt3304 < 0) {
							arg0.anInt3304 = 0;
							Static379.method131(0, arg0.anInt6428, local207, arg0.aByte90, Static94.aClass11_Sub1_Sub3_Sub2_1 == arg0, arg0.anInt6430);
						}
						arg0.anInt3303++;
						if (arg0.anInt3304 < local207.anIntArray127.length && local207.anIntArray126[arg0.anInt3304] < arg0.anInt3303) {
							arg0.anInt3303 = 1;
							arg0.anInt3304++;
							Static379.method131(arg0.anInt3304, arg0.anInt6428, local207, arg0.aByte90, arg0 == Static94.aClass11_Sub1_Sub3_Sub2_1, arg0.anInt6430);
						}
						if (arg0.anInt3304 >= local207.anIntArray127.length) {
							if (local196.aBoolean319) {
								arg0.anInt3327++;
								arg0.anInt3304 -= local207.anInt1191;
								if (arg0.anInt3327 >= local207.anInt1193) {
									arg0.anInt3328 = -1;
								} else if (arg0.anInt3304 >= 0 && arg0.anInt3304 < local207.anIntArray127.length) {
									Static379.method131(arg0.anInt3304, arg0.anInt6428, local207, arg0.aByte90, arg0 == Static94.aClass11_Sub1_Sub3_Sub2_1, arg0.anInt6430);
								} else {
									arg0.anInt3328 = -1;
								}
							} else {
								arg0.anInt3328 = -1;
							}
						}
						arg0.anInt3323 = arg0.anInt3304 + 1;
						if (local207.anIntArray127.length <= arg0.anInt3323) {
							if (local196.aBoolean319) {
								arg0.anInt3323 -= local207.anInt1191;
								if (arg0.anInt3327 + 1 >= local207.anInt1193) {
									arg0.anInt3323 = -1;
								} else if (arg0.anInt3323 < 0 || local207.anIntArray127.length <= arg0.anInt3323) {
									arg0.anInt3323 = -1;
								}
							} else {
								arg0.anInt3323 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt3302 != -1 && arg0.anInt3337 <= 1) {
			local25 = Static402.aClass37_2.method665(arg0.anInt3302);
			if (local25.anInt1197 == 3) {
				if (arg0.anInt3344 > 0 && Static98.anInt1304 >= arg0.anInt3301 && arg0.anInt3341 < Static98.anInt1304) {
					arg0.anInt3302 = -1;
				}
			} else if (local25.anInt1197 == 1 && arg0.anInt3344 > 0 && arg0.anInt3301 <= Static98.anInt1304 && Static98.anInt1304 > arg0.anInt3341) {
				arg0.anInt3337 = 2;
			}
		}
		if (arg0.anInt3302 != -1 && arg0.anInt3337 == 0) {
			local25 = Static402.aClass37_2.method665(arg0.anInt3302);
			if (local25 == null || local25.anIntArray127 == null) {
				arg0.anInt3302 = -1;
			} else {
				arg0.anInt3268++;
				if (local25.anIntArray127.length > arg0.anInt3296 && arg0.anInt3268 > local25.anIntArray126[arg0.anInt3296]) {
					arg0.anInt3268 = 1;
					arg0.anInt3296++;
					Static379.method131(arg0.anInt3296, arg0.anInt6428, local25, arg0.aByte90, Static94.aClass11_Sub1_Sub3_Sub2_1 == arg0, arg0.anInt6430);
				}
				if (local25.anIntArray127.length <= arg0.anInt3296) {
					arg0.anInt3296 -= local25.anInt1191;
					arg0.anInt3278++;
					if (arg0.anInt3278 >= local25.anInt1193) {
						arg0.anInt3302 = -1;
					} else if (arg0.anInt3296 >= 0 && local25.anIntArray127.length > arg0.anInt3296) {
						Static379.method131(arg0.anInt3296, arg0.anInt6428, local25, arg0.aByte90, Static94.aClass11_Sub1_Sub3_Sub2_1 == arg0, arg0.anInt6430);
					} else {
						arg0.anInt3302 = -1;
					}
				}
				arg0.anInt3275 = arg0.anInt3296 + 1;
				if (arg0.anInt3275 >= local25.anIntArray127.length) {
					arg0.anInt3275 -= local25.anInt1191;
					if (arg0.anInt3278 + 1 >= local25.anInt1193) {
						arg0.anInt3275 = -1;
					} else if (arg0.anInt3275 < 0 || local25.anIntArray127.length <= arg0.anInt3275) {
						arg0.anInt3275 = -1;
					}
				}
				arg0.anInt3313 = local25.anInt1198;
			}
		}
		if (arg0.anInt3337 > 0) {
			arg0.anInt3337--;
		}
		for (@Pc(1082) int local1082 = 0; local1082 < arg0.aClass9Array3.length; local1082++) {
			@Pc(1089) Class9 local1089 = arg0.aClass9Array3[local1082];
			if (local1089 != null) {
				if (local1089.anInt103 > 0) {
					local1089.anInt103--;
				} else {
					local207 = Static402.aClass37_2.method665(local1089.anInt104);
					if (local207 == null || local207.anIntArray127 == null) {
						arg0.aClass9Array3[local1082] = null;
					} else {
						local1089.anInt105++;
						if (local1089.anInt109 < local207.anIntArray127.length && local207.anIntArray126[local1089.anInt109] < local1089.anInt105) {
							local1089.anInt105 = 1;
							local1089.anInt109++;
							Static379.method131(local1089.anInt109, arg0.anInt6428, local207, arg0.aByte90, Static94.aClass11_Sub1_Sub3_Sub2_1 == arg0, arg0.anInt6430);
						}
						if (local1089.anInt109 >= local207.anIntArray127.length) {
							local1089.anInt109 -= local207.anInt1191;
							local1089.anInt107++;
							if (local207.anInt1193 <= local1089.anInt107) {
								arg0.aClass9Array3[local1082] = null;
							} else if (local1089.anInt109 >= 0 && local1089.anInt109 < local207.anIntArray127.length) {
								Static379.method131(local1089.anInt109, arg0.anInt6428, local207, arg0.aByte90, arg0 == Static94.aClass11_Sub1_Sub3_Sub2_1, arg0.anInt6430);
							} else {
								arg0.aClass9Array3[local1082] = null;
							}
						}
						local1089.anInt108 = local1089.anInt109 + 1;
						if (local1089.anInt108 >= local207.anIntArray127.length) {
							local1089.anInt108 -= local207.anInt1191;
							if (local207.anInt1193 <= local1089.anInt107 + 1) {
								local1089.anInt108 = -1;
							} else if (local1089.anInt108 < 0 || local207.anIntArray127.length <= local1089.anInt108) {
								local1089.anInt108 = -1;
							}
						}
					}
				}
			}
		}
	}
}
