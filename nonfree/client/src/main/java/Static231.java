import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static231 {

	@OriginalMember(owner = "client!jl", name = "x", descriptor = "Lclient!tq;")
	public static Class279 aClass279_10;

	@OriginalMember(owner = "client!jl", name = "A", descriptor = "I")
	public static int anInt7332;

	@OriginalMember(owner = "client!jl", name = "l", descriptor = "Lclient!h;")
	public static final Class114 aClass114_142 = new Class114("Prepared sound engine", "Musik-Engine vorbereitet.", "Moteur son préparé", "Mecanismo de som preparado");

	@OriginalMember(owner = "client!jl", name = "v", descriptor = "Lclient!h;")
	public static final Class114 aClass114_143 = new Class114("M", "M", "M", "M");

	@OriginalMember(owner = "client!jl", name = "w", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray43 = new String[8];

	@OriginalMember(owner = "client!jl", name = "y", descriptor = "Z")
	public static boolean aBoolean483 = false;

	@OriginalMember(owner = "client!jl", name = "z", descriptor = "[F")
	public static final float[] aFloatArray62 = new float[4];

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(BLclient!faa;)V")
	public static void method6235(@OriginalArg(1) Class47_Sub2_Sub3 arg0) {
		arg0.anInt5005 = 0;
		@Pc(16) Class280 local16;
		if (arg0.anInt5039 != -1) {
			local16 = Static6.aClass126_1.method3574(arg0.anInt5039);
			if (local16 == null || local16.anIntArray629 == null) {
				arg0.anInt5039 = -1;
				arg0.aBoolean343 = false;
			} else {
				label394: {
					arg0.anInt5041++;
					if (arg0.anInt5021 < local16.anIntArray629.length && arg0.anInt5041 > local16.anIntArray630[arg0.anInt5021]) {
						arg0.anInt5041 = 1;
						arg0.anInt5021++;
						arg0.anInt5054++;
						Static351.method5589(arg0.anInt8189, local16, Static16.aClass47_Sub2_Sub3_Sub2_1 == arg0, arg0.aByte94, arg0.anInt8191, arg0.anInt5021);
					}
					if (arg0.anInt5021 >= local16.anIntArray629.length) {
						arg0.anInt5021 = 0;
						arg0.anInt5041 = 0;
						if (arg0.aBoolean343) {
							arg0.anInt5039 = arg0.method4356().method6216();
							if (arg0.anInt5039 == -1) {
								arg0.aBoolean343 = false;
								break label394;
							}
							local16 = Static6.aClass126_1.method3574(arg0.anInt5039);
						}
						Static351.method5589(arg0.anInt8189, local16, arg0 == Static16.aClass47_Sub2_Sub3_Sub2_1, arg0.aByte94, arg0.anInt8191, arg0.anInt5021);
					}
					arg0.anInt5054 = arg0.anInt5021 + 1;
					if (local16.anIntArray629.length <= arg0.anInt5054) {
						arg0.anInt5054 = 0;
					}
				}
			}
		}
		@Pc(178) int local178;
		@Pc(190) Class280 local190;
		@Pc(175) Class112 local175;
		if (arg0.anInt5052 != -1 && Static416.anInt7252 >= arg0.anInt5032) {
			local175 = Static529.aClass90_2.method2963(arg0.anInt5052);
			local178 = local175.anInt3703;
			if (local178 == -1) {
				arg0.anInt5052 = -1;
			} else {
				label396: {
					local190 = Static6.aClass126_1.method3574(local178);
					if (local175.aBoolean233) {
						if (local190.anInt8111 == 3) {
							if (arg0.anInt5080 > 0 && Static416.anInt7252 >= arg0.anInt5020 && Static416.anInt7252 > arg0.anInt5006) {
								arg0.anInt5052 = -1;
								break label396;
							}
						} else if (local190.anInt8111 == 1 && arg0.anInt5080 > 0 && arg0.anInt5020 <= Static416.anInt7252 && arg0.anInt5006 < Static416.anInt7252) {
							arg0.anInt5032 = Static416.anInt7252 + 1;
							break label396;
						}
					}
					if (local190 == null || local190.anIntArray629 == null) {
						arg0.anInt5052 = -1;
					} else {
						if (arg0.anInt5012 < 0) {
							arg0.anInt5012 = 0;
							Static351.method5589(arg0.anInt8189, local190, Static16.aClass47_Sub2_Sub3_Sub2_1 == arg0, arg0.aByte94, arg0.anInt8191, 0);
						}
						arg0.anInt5010++;
						if (local190.anIntArray629.length > arg0.anInt5012 && arg0.anInt5010 > local190.anIntArray630[arg0.anInt5012]) {
							arg0.anInt5010 = 1;
							arg0.anInt5012++;
							Static351.method5589(arg0.anInt8189, local190, Static16.aClass47_Sub2_Sub3_Sub2_1 == arg0, arg0.aByte94, arg0.anInt8191, arg0.anInt5012);
						}
						if (local190.anIntArray629.length <= arg0.anInt5012) {
							if (local175.aBoolean233) {
								arg0.anInt5012 -= local190.anInt8105;
								arg0.anInt5049++;
								if (local190.anInt8109 <= arg0.anInt5049) {
									arg0.anInt5052 = -1;
								} else if (arg0.anInt5012 >= 0 && arg0.anInt5012 < local190.anIntArray629.length) {
									Static351.method5589(arg0.anInt8189, local190, arg0 == Static16.aClass47_Sub2_Sub3_Sub2_1, arg0.aByte94, arg0.anInt8191, arg0.anInt5012);
								} else {
									arg0.anInt5052 = -1;
								}
							} else {
								arg0.anInt5052 = -1;
							}
						}
						arg0.anInt5004 = arg0.anInt5012 + 1;
						if (local190.anIntArray629.length <= arg0.anInt5004) {
							if (local175.aBoolean233) {
								arg0.anInt5004 -= local190.anInt8105;
								if (local190.anInt8109 <= arg0.anInt5049 + 1) {
									arg0.anInt5004 = -1;
								} else if (arg0.anInt5004 < 0 || local190.anIntArray629.length <= arg0.anInt5004) {
									arg0.anInt5004 = -1;
								}
							} else {
								arg0.anInt5004 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt5070 != -1 && Static416.anInt7252 >= arg0.anInt5065) {
			local175 = Static529.aClass90_2.method2963(arg0.anInt5070);
			local178 = local175.anInt3703;
			if (local178 == -1) {
				arg0.anInt5070 = -1;
			} else {
				label399: {
					local190 = Static6.aClass126_1.method3574(local178);
					if (local175.aBoolean233) {
						if (local190.anInt8111 == 3) {
							if (arg0.anInt5080 > 0 && arg0.anInt5020 <= Static416.anInt7252 && arg0.anInt5006 < Static416.anInt7252) {
								arg0.anInt5070 = -1;
								break label399;
							}
						} else if (local190.anInt8111 == 1 && arg0.anInt5080 > 0 && arg0.anInt5020 <= Static416.anInt7252 && Static416.anInt7252 > arg0.anInt5006) {
							arg0.anInt5065 = Static416.anInt7252 + 1;
							break label399;
						}
					}
					if (local190 == null || local190.anIntArray629 == null) {
						arg0.anInt5070 = -1;
					} else {
						if (arg0.anInt5022 < 0) {
							arg0.anInt5022 = 0;
							Static351.method5589(arg0.anInt8189, local190, arg0 == Static16.aClass47_Sub2_Sub3_Sub2_1, arg0.aByte94, arg0.anInt8191, 0);
						}
						arg0.anInt5009++;
						if (local190.anIntArray629.length > arg0.anInt5022 && local190.anIntArray630[arg0.anInt5022] < arg0.anInt5009) {
							arg0.anInt5022++;
							arg0.anInt5009 = 1;
							Static351.method5589(arg0.anInt8189, local190, arg0 == Static16.aClass47_Sub2_Sub3_Sub2_1, arg0.aByte94, arg0.anInt8191, arg0.anInt5022);
						}
						if (local190.anIntArray629.length <= arg0.anInt5022) {
							if (local175.aBoolean233) {
								arg0.anInt5033++;
								arg0.anInt5022 -= local190.anInt8105;
								if (arg0.anInt5033 >= local190.anInt8109) {
									arg0.anInt5070 = -1;
								} else if (arg0.anInt5022 >= 0 && arg0.anInt5022 < local190.anIntArray629.length) {
									Static351.method5589(arg0.anInt8189, local190, arg0 == Static16.aClass47_Sub2_Sub3_Sub2_1, arg0.aByte94, arg0.anInt8191, arg0.anInt5022);
								} else {
									arg0.anInt5070 = -1;
								}
							} else {
								arg0.anInt5070 = -1;
							}
						}
						arg0.anInt5044 = arg0.anInt5022 + 1;
						if (arg0.anInt5044 >= local190.anIntArray629.length) {
							if (local175.aBoolean233) {
								arg0.anInt5044 -= local190.anInt8105;
								if (local190.anInt8109 <= arg0.anInt5033 + 1) {
									arg0.anInt5044 = -1;
								} else if (arg0.anInt5044 < 0 || arg0.anInt5044 >= local190.anIntArray629.length) {
									arg0.anInt5044 = -1;
								}
							} else {
								arg0.anInt5044 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt5018 != -1 && arg0.anInt5026 <= 1) {
			local16 = Static6.aClass126_1.method3574(arg0.anInt5018);
			if (local16.anInt8111 == 3) {
				if (arg0.anInt5080 > 0 && arg0.anInt5020 <= Static416.anInt7252 && Static416.anInt7252 > arg0.anInt5006) {
					arg0.anInt5018 = -1;
				}
			} else if (local16.anInt8111 == 1 && arg0.anInt5080 > 0 && Static416.anInt7252 >= arg0.anInt5020 && Static416.anInt7252 > arg0.anInt5006) {
				arg0.anInt5026 = 2;
			}
		}
		if (arg0.anInt5018 != -1 && arg0.anInt5026 == 0) {
			local16 = Static6.aClass126_1.method3574(arg0.anInt5018);
			if (local16 == null || local16.anIntArray629 == null) {
				arg0.anInt5018 = -1;
			} else {
				arg0.anInt5063++;
				if (local16.anIntArray629.length > arg0.anInt5007 && local16.anIntArray630[arg0.anInt5007] < arg0.anInt5063) {
					arg0.anInt5007++;
					arg0.anInt5063 = 1;
					Static351.method5589(arg0.anInt8189, local16, arg0 == Static16.aClass47_Sub2_Sub3_Sub2_1, arg0.aByte94, arg0.anInt8191, arg0.anInt5007);
				}
				if (arg0.anInt5007 >= local16.anIntArray629.length) {
					arg0.anInt5073++;
					arg0.anInt5007 -= local16.anInt8105;
					if (arg0.anInt5073 >= local16.anInt8109) {
						arg0.anInt5018 = -1;
					} else if (arg0.anInt5007 >= 0 && arg0.anInt5007 < local16.anIntArray629.length) {
						Static351.method5589(arg0.anInt8189, local16, arg0 == Static16.aClass47_Sub2_Sub3_Sub2_1, arg0.aByte94, arg0.anInt8191, arg0.anInt5007);
					} else {
						arg0.anInt5018 = -1;
					}
				}
				arg0.anInt5074 = arg0.anInt5007 + 1;
				if (arg0.anInt5074 >= local16.anIntArray629.length) {
					arg0.anInt5074 -= local16.anInt8105;
					if (local16.anInt8109 <= arg0.anInt5073 + 1) {
						arg0.anInt5074 = -1;
					} else if (arg0.anInt5074 < 0 || arg0.anInt5074 >= local16.anIntArray629.length) {
						arg0.anInt5074 = -1;
					}
				}
				arg0.anInt5005 = local16.anInt8098;
			}
		}
		if (arg0.anInt5026 > 0) {
			arg0.anInt5026--;
		}
		for (@Pc(1028) int local1028 = 0; local1028 < arg0.aClass8Array3.length; local1028++) {
			@Pc(1034) Class8 local1034 = arg0.aClass8Array3[local1028];
			if (local1034 != null) {
				if (local1034.anInt123 > 0) {
					local1034.anInt123--;
				} else {
					local190 = Static6.aClass126_1.method3574(local1034.anInt127);
					if (local190 == null || local190.anIntArray629 == null) {
						arg0.aClass8Array3[local1028] = null;
					} else {
						local1034.anInt129++;
						if (local190.anIntArray629.length > local1034.anInt124 && local1034.anInt129 > local190.anIntArray630[local1034.anInt124]) {
							local1034.anInt124++;
							local1034.anInt129 = 1;
							Static351.method5589(arg0.anInt8189, local190, arg0 == Static16.aClass47_Sub2_Sub3_Sub2_1, arg0.aByte94, arg0.anInt8191, local1034.anInt124);
						}
						if (local1034.anInt124 >= local190.anIntArray629.length) {
							local1034.anInt124 -= local190.anInt8105;
							local1034.anInt125++;
							if (local1034.anInt125 >= local190.anInt8109) {
								arg0.aClass8Array3[local1028] = null;
							} else if (local1034.anInt124 >= 0 && local190.anIntArray629.length > local1034.anInt124) {
								Static351.method5589(arg0.anInt8189, local190, Static16.aClass47_Sub2_Sub3_Sub2_1 == arg0, arg0.aByte94, arg0.anInt8191, local1034.anInt124);
							} else {
								arg0.aClass8Array3[local1028] = null;
							}
						}
						local1034.anInt121 = local1034.anInt124 + 1;
						if (local190.anIntArray629.length <= local1034.anInt121) {
							local1034.anInt121 -= local190.anInt8105;
							if (local190.anInt8109 <= local1034.anInt125 + 1) {
								local1034.anInt121 = -1;
							} else if (local1034.anInt121 < 0 || local190.anIntArray629.length <= local1034.anInt121) {
								local1034.anInt121 = -1;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(I[[[BIBII)V")
	public static void method6236(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static250.anInt4850++;
		Static511.anInt9418 = 0;
		@Pc(14) int local14;
		for (@Pc(7) int local7 = Static382.anInt6687; local7 < Static538.anInt9338; local7++) {
			@Pc(12) Class206[][] local12 = Static313.aClass206ArrayArrayArray2[local7];
			for (local14 = Static530.anInt8978; local14 < Static518.anInt8804; local14++) {
				for (@Pc(17) int local17 = Static537.anInt9318; local17 < Static227.anInt8838; local17++) {
					@Pc(24) Class206 local24 = local12[local14][local17];
					if (local24 != null) {
						if (Static339.aBooleanArrayArray4[local14 + Static278.anInt5506 - Static406.anInt7107][local17 + Static278.anInt5506 - Static265.anInt5150] && (arg1 == null || local7 < arg2 || arg1[local7][local14][local17] != arg3)) {
							local24.aBoolean415 = true;
							local24.aBoolean416 = true;
							if (local24.aClass168_2 == null) {
								local24.aBoolean417 = false;
							} else {
								local24.aBoolean417 = true;
							}
							Static511.anInt9418++;
						} else {
							local24.aBoolean415 = false;
							local24.aBoolean416 = false;
							local24.aByte72 = 0;
							if (local14 >= Static406.anInt7107 - 16 && local14 <= Static406.anInt7107 + 16 && local17 >= Static265.anInt5150 - 16 && local17 <= Static265.anInt5150 + 16 && (local24.aClass47_Sub4_2 != null || local24.aClass47_Sub4_1 != null || local24.aClass47_Sub5_1 != null || local24.aClass47_Sub5_2 != null || local24.aClass47_Sub3_1 != null || local24.aClass168_2 != null)) {
								Static128.aClass43_1.method3642(local24);
							}
						}
					}
				}
			}
		}
		@Pc(145) boolean local145 = Static106.aClass10Array5 == Static290.aClass10Array7;
		for (local14 = Static382.anInt6687; local14 < Static538.anInt9338; local14++) {
			@Pc(161) float local161 = local145 ? 251.5F : 201.5F - (float) local14 * 50.0F - 0.5F;
			if (Static423.aClass9_12.method7640() && local14 >= arg2 && arg1 != null) {
				@Pc(172) int local172 = Static339.aBooleanArrayArray4.length;
				if (Static530.anInt8978 + Static339.aBooleanArrayArray4.length > Static488.anInt8353) {
					local172 -= Static530.anInt8978 + Static339.aBooleanArrayArray4.length - Static488.anInt8353;
				}
				@Pc(192) int local192 = Static339.aBooleanArrayArray4[0].length;
				if (Static537.anInt9318 + Static339.aBooleanArrayArray4[0].length > Static60.anInt1677) {
					local192 -= Static537.anInt9318 + Static339.aBooleanArrayArray4[0].length - Static60.anInt1677;
				}
				@Pc(213) int local213 = Static135.anInt3198;
				while (true) {
					if (local213 >= local172) {
						Static128.aClass43_1.method3634(local14, local161, Static290.aClass10Array7[local14], true);
						break;
					}
					@Pc(220) int local220 = local213 + Static530.anInt8978 - Static135.anInt3198;
					for (@Pc(222) int local222 = Static480.anInt8180; local222 < local192; local222++) {
						Static213.aBooleanArrayArray2[local213][local222] = false;
						if (Static339.aBooleanArrayArray4[local213][local222]) {
							@Pc(241) int local241 = local222 + Static537.anInt9318 - Static480.anInt8180;
							for (@Pc(243) int local243 = local14; local243 >= 0; local243--) {
								if (Static313.aClass206ArrayArrayArray2[local243][local220][local241] != null && Static313.aClass206ArrayArrayArray2[local243][local220][local241].aByte70 == local14) {
									Static213.aBooleanArrayArray2[local213][local222] = Static313.aClass206ArrayArrayArray2[local243][local220][local241].aBoolean415;
									break;
								}
							}
						}
					}
					local213++;
				}
			} else {
				Static128.aClass43_1.method3634(local14, local161, Static290.aClass10Array7[local14], false);
			}
			Static128.aClass43_1.method3636();
		}
		if (!Static108.method2363(true)) {
			Static108.method2363(false);
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIII)V")
	public static void method6240(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 0) {
			Static444.method6416(Static315.aClass186_88);
		}
		if (arg2 == 1) {
			Static444.method6416(Static38.aClass186_12);
		}
		Static192.aClass1_Sub13_Sub2_1.method3023(arg1 + Static517.anInt8716);
		Static192.aClass1_Sub13_Sub2_1.method3038(Static324.anInt6132 + arg0);
		Static192.aClass1_Sub13_Sub2_1.method3065(Static126.aClass60_1.method5384(82) ? 1 : 0);
		Static540.anInt9357 = arg0;
		Static79.aBoolean156 = false;
		Static417.anInt6093 = arg1;
		Static503.method7223();
	}

	@OriginalMember(owner = "client!jl", name = "d", descriptor = "(I)V")
	public static void method6243() {
		@Pc(5) int local5 = 0;
		for (@Pc(12) int local12 = 0; local12 < Static542.anInt9387; local12++) {
			for (@Pc(15) int local15 = 0; local15 < Static36.anInt1324; local15++) {
				if (Static181.method3475(local5, Static313.aClass206ArrayArrayArray2, true, local15, local12)) {
					local5++;
				}
				if (local5 >= 512) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIIIZ)V")
	public static void method6246(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static92.anInt2338 <= arg3 && Static341.anInt6379 >= arg3) {
			@Pc(27) int local27 = Static193.method3621(Static299.anInt4491, arg2, Static95.anInt2358);
			@Pc(33) int local33 = Static193.method3621(Static299.anInt4491, arg0, Static95.anInt2358);
			Static425.method6301(local33, local27, arg1, arg3);
		}
	}
}
