import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!hc", name = "e", descriptor = "Lclient!bc;")
	public static Class16 aClass16_3 = null;

	@OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
	public static int anInt2145 = 0;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)Lclient!gl;")
	public static Class79 method2021() {
		try {
			return (Class79) Class.forName("Class79_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)J")
	public static long method2023() {
		return Static185.aClass10_1.method3937();
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILclient!jq;)V")
	public static void method2024(@OriginalArg(1) Class4_Sub5_Sub2 arg0) {
		arg0.aBoolean445 = false;
		@Pc(15) Class89 local15;
		if (arg0.anInt5361 != -1) {
			local15 = Static162.method2849(arg0.anInt5361);
			if (local15 == null || local15.anIntArray245 == null) {
				arg0.aBoolean446 = false;
				arg0.anInt5361 = -1;
			} else {
				label297: {
					arg0.anInt5396++;
					if (local15.anIntArray245.length > arg0.anInt5385 && local15.anIntArray244[arg0.anInt5385] < arg0.anInt5396) {
						arg0.anInt5385++;
						arg0.anInt5384++;
						arg0.anInt5396 = 1;
						Static311.method3258(local15, arg0.anInt6631, arg0 == Static192.aClass4_Sub5_Sub2_Sub1_2, arg0.anInt5385, arg0.anInt6632);
					}
					if (arg0.anInt5385 >= local15.anIntArray245.length) {
						arg0.anInt5385 = 0;
						arg0.anInt5396 = 0;
						if (arg0.aBoolean446) {
							arg0.anInt5361 = arg0.method4805().method2144();
							if (arg0.anInt5361 == -1) {
								arg0.aBoolean446 = false;
								break label297;
							}
							local15 = Static162.method2849(arg0.anInt5361);
						}
						Static311.method3258(local15, arg0.anInt6631, arg0 == Static192.aClass4_Sub5_Sub2_Sub1_2, arg0.anInt5385, arg0.anInt6632);
					}
					arg0.anInt5384 = arg0.anInt5385 + 1;
					if (arg0.anInt5384 >= local15.anIntArray245.length) {
						arg0.anInt5384 = 0;
					}
				}
			}
		}
		@Pc(184) Class89 local184;
		if (arg0.anInt5398 != -1 && Static283.anInt5563 >= arg0.anInt5395) {
			@Pc(173) Class163 local173 = Static325.method5628(arg0.anInt5398);
			@Pc(176) int local176 = local173.anInt5031;
			if (local176 == -1) {
				arg0.anInt5398 = -1;
			} else {
				label299: {
					local184 = Static162.method2849(local176);
					if (local173.aBoolean418) {
						if (local184.anInt2454 == 3) {
							if (arg0.anInt5419 > 0 && arg0.anInt5390 <= Static283.anInt5563 && arg0.anInt5377 < Static283.anInt5563) {
								arg0.anInt5398 = -1;
								break label299;
							}
						} else if (local184.anInt2454 == 1 && arg0.anInt5419 > 0 && Static283.anInt5563 >= arg0.anInt5390 && arg0.anInt5377 < Static283.anInt5563) {
							arg0.anInt5395 = Static283.anInt5563 + 1;
							break label299;
						}
					}
					if (local184 == null || local184.anIntArray245 == null) {
						arg0.anInt5398 = -1;
					} else {
						if (arg0.anInt5404 < 0) {
							arg0.anInt5404 = 0;
							Static311.method3258(local184, arg0.anInt6631, arg0 == Static192.aClass4_Sub5_Sub2_Sub1_2, 0, arg0.anInt6632);
						}
						arg0.anInt5358++;
						if (local184.anIntArray245.length > arg0.anInt5404 && arg0.anInt5358 > local184.anIntArray244[arg0.anInt5404]) {
							arg0.anInt5358 = 1;
							arg0.anInt5404++;
							Static311.method3258(local184, arg0.anInt6631, Static192.aClass4_Sub5_Sub2_Sub1_2 == arg0, arg0.anInt5404, arg0.anInt6632);
						}
						if (arg0.anInt5404 >= local184.anIntArray245.length) {
							if (local173.aBoolean418) {
								arg0.anInt5404 -= local184.anInt2466;
								arg0.anInt5371++;
								if (arg0.anInt5371 >= local184.anInt2458) {
									arg0.anInt5398 = -1;
								} else if (arg0.anInt5404 >= 0 && local184.anIntArray245.length > arg0.anInt5404) {
									Static311.method3258(local184, arg0.anInt6631, arg0 == Static192.aClass4_Sub5_Sub2_Sub1_2, arg0.anInt5404, arg0.anInt6632);
								} else {
									arg0.anInt5398 = -1;
								}
							} else {
								arg0.anInt5398 = -1;
							}
						}
						arg0.anInt5369 = arg0.anInt5404 + 1;
						if (arg0.anInt5369 >= local184.anIntArray245.length) {
							if (local173.aBoolean418) {
								arg0.anInt5369 -= local184.anInt2466;
								if (local184.anInt2458 <= arg0.anInt5371 + 1) {
									arg0.anInt5369 = -1;
								} else if (arg0.anInt5369 < 0 || local184.anIntArray245.length <= arg0.anInt5369) {
									arg0.anInt5369 = -1;
								}
							} else {
								arg0.anInt5369 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt5383 != -1 && arg0.anInt5382 <= 1) {
			local15 = Static162.method2849(arg0.anInt5383);
			if (local15.anInt2454 == 3) {
				if (arg0.anInt5419 > 0 && Static283.anInt5563 >= arg0.anInt5390 && Static283.anInt5563 > arg0.anInt5377) {
					arg0.anInt5383 = -1;
				}
			} else if (local15.anInt2454 == 1 && arg0.anInt5419 > 0 && arg0.anInt5390 <= Static283.anInt5563 && Static283.anInt5563 > arg0.anInt5377) {
				arg0.anInt5382 = 2;
			}
		}
		if (arg0.anInt5383 != -1 && arg0.anInt5382 == 0) {
			local15 = Static162.method2849(arg0.anInt5383);
			if (local15 == null || local15.anIntArray245 == null) {
				arg0.anInt5383 = -1;
			} else {
				arg0.anInt5389++;
				if (local15.anIntArray245.length > arg0.anInt5365 && local15.anIntArray244[arg0.anInt5365] < arg0.anInt5389) {
					arg0.anInt5365++;
					arg0.anInt5389 = 1;
					Static311.method3258(local15, arg0.anInt6631, Static192.aClass4_Sub5_Sub2_Sub1_2 == arg0, arg0.anInt5365, arg0.anInt6632);
				}
				if (arg0.anInt5365 >= local15.anIntArray245.length) {
					arg0.anInt5365 -= local15.anInt2466;
					arg0.anInt5353++;
					if (arg0.anInt5353 >= local15.anInt2458) {
						arg0.anInt5383 = -1;
					} else if (arg0.anInt5365 >= 0 && arg0.anInt5365 < local15.anIntArray245.length) {
						Static311.method3258(local15, arg0.anInt6631, arg0 == Static192.aClass4_Sub5_Sub2_Sub1_2, arg0.anInt5365, arg0.anInt6632);
					} else {
						arg0.anInt5383 = -1;
					}
				}
				arg0.anInt5409 = arg0.anInt5365 + 1;
				if (arg0.anInt5409 >= local15.anIntArray245.length) {
					arg0.anInt5409 -= local15.anInt2466;
					if (arg0.anInt5353 + 1 >= local15.anInt2458) {
						arg0.anInt5409 = -1;
					} else if (arg0.anInt5409 < 0 || local15.anIntArray245.length <= arg0.anInt5409) {
						arg0.anInt5409 = -1;
					}
				}
				arg0.aBoolean445 = local15.aBoolean186;
			}
		}
		if (arg0.anInt5382 > 0) {
			arg0.anInt5382--;
		}
		for (@Pc(705) int local705 = 0; local705 < arg0.aClass193Array3.length; local705++) {
			@Pc(711) Class193 local711 = arg0.aClass193Array3[local705];
			if (local711 != null) {
				if (local711.anInt6184 > 0) {
					local711.anInt6184--;
				} else {
					local184 = Static162.method2849(local711.anInt6179);
					if (local184 == null || local184.anIntArray245 == null) {
						arg0.aClass193Array3[local705] = null;
					} else {
						local711.anInt6182++;
						if (local711.anInt6177 < local184.anIntArray245.length && local184.anIntArray244[local711.anInt6177] < local711.anInt6182) {
							local711.anInt6182 = 1;
							local711.anInt6177++;
							Static311.method3258(local184, arg0.anInt6631, Static192.aClass4_Sub5_Sub2_Sub1_2 == arg0, local711.anInt6177, arg0.anInt6632);
						}
						if (local184.anIntArray245.length <= local711.anInt6177) {
							local711.anInt6181++;
							local711.anInt6177 -= local184.anInt2466;
							if (local184.anInt2458 <= local711.anInt6181) {
								arg0.aClass193Array3[local705] = null;
							} else if (local711.anInt6177 >= 0 && local711.anInt6177 < local184.anIntArray245.length) {
								Static311.method3258(local184, arg0.anInt6631, Static192.aClass4_Sub5_Sub2_Sub1_2 == arg0, local711.anInt6177, arg0.anInt6632);
							} else {
								arg0.aClass193Array3[local705] = null;
							}
						}
						local711.anInt6178 = local711.anInt6177 + 1;
						if (local184.anIntArray245.length <= local711.anInt6178) {
							local711.anInt6178 -= local184.anInt2466;
							if (local711.anInt6181 + 1 >= local184.anInt2458) {
								local711.anInt6178 = -1;
							} else if (local711.anInt6178 < 0 || local711.anInt6178 >= local184.anIntArray245.length) {
								local711.anInt6178 = -1;
							}
						}
					}
				}
			}
		}
	}
}
