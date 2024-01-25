import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static199 {

	@OriginalMember(owner = "client!ms", name = "k", descriptor = "I")
	public static int anInt4061;

	@OriginalMember(owner = "client!ms", name = "c", descriptor = "[I")
	public static final int[] anIntArray480 = new int[6];

	@OriginalMember(owner = "client!ms", name = "i", descriptor = "I")
	public static int anInt4059 = 2;

	@OriginalMember(owner = "client!ms", name = "l", descriptor = "I")
	public static int anInt4062 = -50;

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "([Lclient!rg;II)V")
	public static void method3740(@OriginalArg(0) Class177[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(25) Class177 local25 = arg0[local7];
			if (local25 != null && local25.anInt5236 == arg1 && (!local25.aBoolean445 || !Static47.method1090(local25))) {
				if (local25.anInt5208 == 0) {
					if (!local25.aBoolean445 && Static47.method1090(local25) && Static118.aClass177_17 != local25) {
						continue;
					}
					method3740(arg0, local25.anInt5219);
					if (local25.aClass177Array2 != null) {
						method3740(local25.aClass177Array2, local25.anInt5219);
					}
					@Pc(75) Class1_Sub9 local75 = (Class1_Sub9) Static348.aClass26_20.method870((long) local25.anInt5219);
					if (local75 != null) {
						Static217.method3977(local75.anInt1104);
					}
				}
				if (local25.anInt5208 == 6) {
					@Pc(107) int local107;
					if (local25.anInt5243 != -1 || local25.anInt5256 != -1) {
						@Pc(102) boolean local102 = Static179.method3489(local25);
						if (local102) {
							local107 = local25.anInt5256;
						} else {
							local107 = local25.anInt5243;
						}
						if (local107 != -1) {
							@Pc(120) Class121 local120 = Static133.method2520(local107);
							if (local120 != null) {
								local25.anInt5187 += Static78.anInt1579;
								while (local120.anIntArray444[local25.anInt5176] < local25.anInt5187) {
									local25.anInt5187 -= local120.anIntArray444[local25.anInt5176];
									local25.anInt5176++;
									if (local120.anIntArray446.length <= local25.anInt5176) {
										local25.anInt5176 -= local120.anInt3769;
										if (local25.anInt5176 < 0 || local120.anIntArray446.length <= local25.anInt5176) {
											local25.anInt5176 = 0;
										}
									}
									local25.anInt5238 = local25.anInt5176 + 1;
									if (local25.anInt5238 >= local120.anIntArray446.length) {
										local25.anInt5238 -= local120.anInt3769;
										if (local25.anInt5238 < 0 || local25.anInt5238 >= local120.anIntArray446.length) {
											local25.anInt5238 = -1;
										}
									}
									Static133.method2517(local25);
								}
							}
						}
					}
					if (local25.anInt5224 != 0 && !local25.aBoolean445) {
						@Pc(243) int local243 = local25.anInt5224 >> 16;
						@Pc(247) int local247 = local243 * Static78.anInt1579;
						local107 = local25.anInt5224 << 16 >> 16;
						local107 *= Static78.anInt1579;
						local25.anInt5260 = local25.anInt5260 + local247 & 0x3FFF;
						local25.anInt5268 = local107 + local25.anInt5268 & 0x3FFF;
						Static133.method2517(local25);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(Z)V")
	public static void method3741() {
		if (Static291.aBoolean495) {
			return;
		}
		Static291.aBoolean495 = true;
		if (Static102.aBoolean179) {
			Static304.aFloat110 = (int) Static304.aFloat110 + 191 & 0xFFFFFF80;
		} else {
			Static302.aFloat90 += (24.0F - Static302.aFloat90) / 2.0F;
		}
		Static1.aBoolean13 = true;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(BIIIIII)Lclient!vm;")
	public static Class113 method3742(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(33) long local33 = (long) arg4 * 32147369L ^ (long) arg3 * 475427L ^ (long) arg2 * 67481L ^ (long) arg1 * 97549L ^ (long) arg5 * 986053L ^ (long) arg0 * 76724863L;
		@Pc(39) Class113 local39 = (Class113) Static306.aClass140_154.method3816(local33);
		if (local39 == null) {
			local39 = Static176.aClass2_9.method3333(arg2, arg1, arg3, arg5, arg4, arg0);
			Static306.aClass140_154.method3817(local33, local39);
			return local39;
		} else {
			return local39;
		}
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(IIIIIII)V")
	public static void method3743(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		Static49.anInt1123 = 0;
		@Pc(174) int local174;
		@Pc(221) int local221;
		@Pc(384) int local384;
		@Pc(501) int local501;
		@Pc(271) int local271;
		@Pc(627) int local627;
		@Pc(440) int local440;
		for (@Pc(9) int local9 = -1; local9 < Static338.anInt6419 + Static334.anInt6370; local9++) {
			@Pc(13) Class122 local13 = null;
			@Pc(20) Class5_Sub3_Sub3 local20;
			if (local9 < 0) {
				local20 = Static130.aClass5_Sub3_Sub3_Sub1_1;
			} else if (local9 < Static334.anInt6370) {
				local20 = Static254.aClass5_Sub3_Sub3_Sub1Array1[Static123.anIntArray290[local9]];
			} else {
				local20 = Static169.aClass5_Sub3_Sub3_Sub2Array2[Static25.anIntArray83[local9 - Static334.anInt6370]];
				local13 = ((Class5_Sub3_Sub3_Sub2) local20).aClass122_1;
				if (local13.anIntArray451 != null) {
					local13 = local13.method3573();
					if (local13 == null) {
						continue;
					}
				}
			}
			if (local20.anInt4915 >= 0) {
				Static25.method756(arg2 >> 1, local20.method4538(), arg0 >> 1, local20);
				if (Static87.anIntArray215[0] >= 0) {
					if (local20.aString199 != null && (Static334.anInt6370 <= local9 || Static194.anInt3965 == 0 || Static194.anInt3965 == 3 || Static194.anInt3965 == 1 && Static339.method5607(((Class5_Sub3_Sub3_Sub1) local20).aString130)) && Static49.anInt1123 < Static216.anInt4259) {
						Static216.anIntArray548[Static49.anInt1123] = Static180.aClass38_5.method1316(local20.aString199) / 2;
						Static216.anIntArray547[Static49.anInt1123] = Static87.anIntArray215[0];
						Static216.anIntArray545[Static49.anInt1123] = Static87.anIntArray215[1];
						Static216.anIntArray543[Static49.anInt1123] = local20.anInt4928;
						Static216.anIntArray546[Static49.anInt1123] = local20.anInt4947;
						Static216.anIntArray544[Static49.anInt1123] = local20.anInt4945;
						Static216.aStringArray30[Static49.anInt1123] = local20.aString199;
						Static49.anInt1123++;
					}
					@Pc(161) Class90 local161 = Static43.aClass90Array8[0];
					local174 = arg3 + Static87.anIntArray215[1] - Math.max(Static180.aClass38_5.anInt1347, local161.method5466());
					@Pc(189) Class90 local189;
					@Pc(283) int local283;
					if (!local20.aBoolean413 && Static215.anInt4246 < local20.anInt4926) {
						local189 = Static43.aClass90Array8[1];
						if (local20 instanceof Class5_Sub3_Sub3_Sub2) {
							@Pc(195) Class5_Sub3_Sub3_Sub2 local195 = (Class5_Sub3_Sub3_Sub2) local20;
							@Pc(204) Class90[] local204 = (Class90[]) Static122.aClass140_67.method3816((long) local195.aClass122_1.anInt3787);
							if (local204 == null) {
								@Pc(213) Class138[] local213 = Static363.method3773(Static297.aClass165_88, local195.aClass122_1.anInt3787);
								if (local213 != null) {
									local204 = new Class90[local213.length];
									for (local221 = 0; local221 < local213.length; local221++) {
										local204[local221] = Static34.aClass2_6.method3322(local213[local221]);
									}
									Static122.aClass140_67.method3817((long) local195.aClass122_1.anInt3787, local204);
								}
							}
							if (local204 != null && local204.length == 2) {
								local189 = local204[1];
								local161 = local204[0];
							}
						}
						local271 = Static87.anIntArray215[0] + arg1 - (local161.method5471() >> 1);
						local161.method5454(local271, local174);
						local283 = local161.method5471() * local20.anInt4962 / 255;
						Static34.aClass2_6.method3291(local271, local174, local283 + local271, local161.method5466() + local174);
						local189.method5454(local271, local174);
						Static34.aClass2_6.method3250(arg1, arg3, arg2 + arg1, arg0 + arg3);
					}
					local174 -= 2;
					if (!local20.aBoolean413) {
						if (local20.anInt4917 > Static215.anInt4246) {
							local189 = Static87.aClass90Array7[local20.aBoolean415 ? 2 : 0];
							@Pc(334) Class90 local334 = Static87.aClass90Array7[local20.aBoolean415 ? 3 : 1];
							if (local20 instanceof Class5_Sub3_Sub3_Sub2) {
								local283 = local13.anInt3799;
								if (local283 == -1) {
									local283 = local20.method4533().anInt1462;
								}
							} else {
								local283 = local20.method4533().anInt1462;
							}
							if (local283 != -1) {
								@Pc(369) Class90[] local369 = (Class90[]) Static326.aClass140_166.method3816((long) local283);
								if (local369 == null) {
									@Pc(376) Class138[] local376 = Static363.method3773(Static297.aClass165_88, local283);
									if (local376 != null) {
										local369 = new Class90[local376.length];
										for (local384 = 0; local384 < local376.length; local384++) {
											local369[local384] = Static34.aClass2_6.method3322(local376[local384]);
										}
										Static326.aClass140_166.method3817((long) local283, local369);
									}
								}
								if (local369 != null && local369.length == 4) {
									local334 = local369[local20.aBoolean415 ? 3 : 1];
									local189 = local369[local20.aBoolean415 ? 2 : 0];
								}
							}
							local440 = local20.anInt4917 - Static215.anInt4246;
							if (local20.anInt4943 >= local440) {
								local221 = local189.method5471();
							} else {
								local440 -= local20.anInt4943;
								local384 = local20.anInt4967 == 0 ? 0 : (local20.anInt4974 - local440) / local20.anInt4967 * local20.anInt4967;
								local221 = local384 * local189.method5471() / local20.anInt4974;
							}
							local384 = local189.method5466();
							local174 -= local384;
							local501 = Static87.anIntArray215[0] + arg1 - (local189.method5471() >> 1);
							local189.method5454(local501, local174);
							Static34.aClass2_6.method3291(local501, local174, local501 + local221, local174 + local384);
							local334.method5454(local501, local174);
							local174 -= 2;
							Static34.aClass2_6.method3250(arg1, arg3, arg1 + arg2, arg3 - -arg0);
						}
						if (local9 < Static334.anInt6370) {
							@Pc(581) Class5_Sub3_Sub3_Sub1 local581 = (Class5_Sub3_Sub3_Sub1) local20;
							if (local581.anInt3310 != -1) {
								local174 -= 25;
								Static75.aClass90Array6[local581.anInt3310].method5454(arg1 + Static87.anIntArray215[0] - 12, local174);
								local174 -= 2;
							}
							if (local581.anInt3306 != -1) {
								local174 -= 25;
								Static278.aClass90Array14[local581.anInt3306].method5454(Static87.anIntArray215[0] + arg1 - 12, local174);
								local174 -= 2;
							}
						} else if (local13.anInt3784 >= 0 && local13.anInt3784 < Static278.aClass90Array14.length) {
							local189 = Static278.aClass90Array14[local13.anInt3784];
							local174 -= 25;
							local189.method5454(arg1 + Static87.anIntArray215[0] - (local189.method5471() >> 1), local174);
							local174 -= 2;
						}
					}
					@Pc(629) Class136[] local629;
					@Pc(637) Class136 local637;
					@Pc(656) Class90 local656;
					if (!(local20 instanceof Class5_Sub3_Sub3_Sub1)) {
						local627 = 0;
						local629 = Static135.aClass136Array1;
						for (local283 = 0; local283 < local629.length; local283++) {
							local637 = local629[local283];
							if (local637 != null && local637.anInt4068 == 1 && Static25.anIntArray83[local9 - Static334.anInt6370] == local637.anInt4063) {
								local656 = Static163.aClass90Array9[local637.anInt4066];
								if (local656.method5466() > local627) {
									local627 = local656.method5466();
								}
								if (Static215.anInt4246 % 20 < 10) {
									local656.method5454(Static87.anIntArray215[0] + arg1 - 12, local174 + -local656.method5466());
								}
							}
						}
						if (local627 > 0) {
						}
					} else if (local9 >= 0) {
						local627 = 0;
						local629 = Static135.aClass136Array1;
						for (local283 = 0; local283 < local629.length; local283++) {
							local637 = local629[local283];
							if (local637 != null && local637.anInt4068 == 10 && local637.anInt4063 == Static123.anIntArray290[local9]) {
								local656 = Static163.aClass90Array9[local637.anInt4066];
								if (local627 < local656.method5466()) {
									local627 = local656.method5466();
								}
								local656.method5454(arg1 + Static87.anIntArray215[0] - 12, -local656.method5466() + local174);
							}
						}
						if (local627 > 0) {
						}
					}
					for (local627 = 0; local627 < 4; local627++) {
						if (local20.anIntArray634[local627] > Static215.anInt4246) {
							local271 = local20.method4538() / 2;
							Static25.method756(arg2 >> 1, local271, arg0 >> 1, local20);
							if (Static87.anIntArray215[0] > -1) {
								if (local627 == 1) {
									Static87.anIntArray215[1] -= 20;
								}
								if (local627 == 2) {
									Static87.anIntArray215[1] -= 10;
									Static87.anIntArray215[0] -= 15;
								}
								if (local627 == 3) {
									Static87.anIntArray215[1] -= 10;
									Static87.anIntArray215[0] += 15;
								}
								Static338.aClass90Array17[local20.anIntArray633[local627]].method5454(arg1 + Static87.anIntArray215[0] - 12, Static87.anIntArray215[1] + -12 + arg3);
								Static105.aClass13_4.method4455(arg3 + Static87.anIntArray215[1] + 3, Integer.toString(local20.anIntArray635[local627]), Static87.anIntArray215[0] + arg1 - 1, 0, -1);
							}
						}
					}
				}
			}
		}
		@Pc(931) int local931;
		for (@Pc(925) int local925 = 0; local925 < Static268.anInt5172; local925++) {
			local931 = Static144.anIntArray333[local925];
			@Pc(940) Class5_Sub3_Sub3 local940;
			if (local931 >= 2048) {
				local940 = Static169.aClass5_Sub3_Sub3_Sub2Array2[local931 - 2048];
			} else {
				local940 = Static254.aClass5_Sub3_Sub3_Sub1Array1[local931];
			}
			local174 = Static201.anIntArray484[local925];
			@Pc(959) Class5_Sub3_Sub3 local959;
			if (local174 >= 2048) {
				local959 = Static169.aClass5_Sub3_Sub3_Sub2Array2[local174 - 2048];
			} else {
				local959 = Static254.aClass5_Sub3_Sub3_Sub1Array1[local174];
			}
			Static148.method4530(local959, --local940.anInt4924, arg3, arg1, arg2, local940, arg0);
		}
		local931 = Static180.aClass38_5.anInt1355 + Static180.aClass38_5.anInt1347 + 2;
		for (@Pc(996) int local996 = 0; local996 < Static49.anInt1123; local996++) {
			local174 = Static216.anIntArray547[local996];
			local627 = Static216.anIntArray545[local996];
			local271 = Static216.anIntArray548[local996];
			@Pc(1012) boolean local1012 = true;
			while (local1012) {
				local1012 = false;
				for (local440 = 0; local440 < local996; local440++) {
					if (local627 + 2 > -local931 + Static216.anIntArray545[local440] && Static216.anIntArray545[local440] + 2 > -local931 + local627 && local174 - local271 < Static216.anIntArray547[local440] - -Static216.anIntArray548[local440] && Static216.anIntArray547[local440] - Static216.anIntArray548[local440] < local174 - -local271 && local627 > Static216.anIntArray545[local440] - local931) {
						local627 = Static216.anIntArray545[local440] - local931;
						local1012 = true;
					}
				}
			}
			Static216.anIntArray545[local996] = local627;
			@Pc(1109) String local1109 = Static216.aStringArray30[local996];
			if (Static186.anInt3870 == 0) {
				local221 = 16776960;
				if (Static216.anIntArray543[local996] < 6) {
					local221 = Static297.anIntArray722[Static216.anIntArray543[local996]];
				}
				if (Static216.anIntArray543[local996] == 6) {
					local221 = Static108.anInt2197 % 20 < 10 ? 16711680 : 16776960;
				}
				if (Static216.anIntArray543[local996] == 7) {
					local221 = Static108.anInt2197 % 20 < 10 ? 255 : 65535;
				}
				if (Static216.anIntArray543[local996] == 8) {
					local221 = Static108.anInt2197 % 20 < 10 ? 45056 : 8454016;
				}
				if (Static216.anIntArray543[local996] == 9) {
					local384 = 150 - Static216.anIntArray544[local996];
					if (local384 < 50) {
						local221 = local384 * 1280 + 16711680;
					} else if (local384 < 100) {
						local221 = 16776960 - (local384 - 50) * 327680;
					} else if (local384 < 150) {
						local221 = local384 * 5 + 65280 - 500;
					}
				}
				if (Static216.anIntArray543[local996] == 10) {
					local384 = 150 - Static216.anIntArray544[local996];
					if (local384 < 50) {
						local221 = local384 * 5 + 16711680;
					} else if (local384 < 100) {
						local221 = 16711935 - (local384 - 50) * 327680;
					} else if (local384 < 150) {
						local221 = (local384 + -100) * 327680 + 255 - (local384 - 100) * 5;
					}
				}
				if (Static216.anIntArray543[local996] == 11) {
					local384 = 150 - Static216.anIntArray544[local996];
					if (local384 < 50) {
						local221 = 16777215 - local384 * 327685;
					} else if (local384 < 100) {
						local221 = (local384 - 50) * 327685 + 65280;
					} else if (local384 < 150) {
						local221 = 16777215 - (local384 - 100) * 327680;
					}
				}
				local384 = local221 | 0xFF000000;
				if (Static216.anIntArray546[local996] == 0) {
					Static302.aClass13_7.method4455(local627 + arg3, local1109, arg1 + local174, -16777216, local384);
				}
				if (Static216.anIntArray546[local996] == 1) {
					Static302.aClass13_7.method4449(local627 + arg3, arg1 + local174, local1109, Static108.anInt2197, local384);
				}
				if (Static216.anIntArray546[local996] == 2) {
					Static302.aClass13_7.method4445(arg1 + local174, arg3 + local627, Static108.anInt2197, local1109, local384);
				}
				if (Static216.anIntArray546[local996] == 3) {
					Static302.aClass13_7.method4446(Static108.anInt2197, local174 + arg1, local627 + arg3, local384, 150 - Static216.anIntArray544[local996], local1109);
				}
				if (Static216.anIntArray546[local996] == 4) {
					local501 = (150 - Static216.anIntArray544[local996]) * (Static180.aClass38_5.method1316(local1109) + 100) / 150;
					Static34.aClass2_6.method3291(arg1 + local174 - 50, arg3, local174 + arg1 + 50, arg0 + arg3);
					Static302.aClass13_7.method4456(local384, local627 + arg3, -16777216, local1109, arg1 + local174 + 50 - local501);
					Static34.aClass2_6.method3250(arg1, arg3, arg2 + arg1, arg0 + arg3);
				}
				if (Static216.anIntArray546[local996] == 5) {
					local501 = 150 - Static216.anIntArray544[local996];
					@Pc(1495) int local1495 = 0;
					if (local501 < 25) {
						local1495 = local501 - 25;
					} else if (local501 > 125) {
						local1495 = local501 - 125;
					}
					@Pc(1517) int local1517 = Static180.aClass38_5.anInt1355 + Static180.aClass38_5.anInt1347;
					Static34.aClass2_6.method3291(arg1, local627 + arg3 - local1517 - 1, arg2 + arg1, arg3 + local627 + 5);
					Static302.aClass13_7.method4455(local627 + arg3 + local1495, local1109, arg1 + local174, -16777216, local384);
					Static34.aClass2_6.method3250(arg1, arg3, arg1 + arg2, arg0 + arg3);
				}
			} else {
				Static302.aClass13_7.method4455(arg3 + local627, local1109, local174 + arg1, -16777216, -256);
			}
		}
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(IIIILclient!j;)V")
	public static void method3745(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class5_Sub2 arg4) {
		arg4.anInt865 = (arg1 << 7) + 64;
		arg4.anInt860 = arg3;
		arg4.anInt863 = (arg2 << 7) + 64;
		@Pc(24) Class204 local24 = Static138.aClass204ArrayArrayArray1[arg0][arg1][arg2];
		if (local24 != null) {
			@Pc(28) int local28 = 0;
			for (@Pc(31) Class17 local31 = local24.aClass17_3; local31 != null; local31 = local31.aClass17_1) {
				if (local31.aClass5_Sub3_1.aBoolean417) {
					@Pc(41) int local41 = local31.aClass5_Sub3_1.method4586();
					if (local41 != -32768 && local41 < local28) {
						local28 = local41;
					}
				}
			}
			if (local28 < 0) {
				arg4.anInt860 += local28;
				arg4.aBoolean78 = true;
			}
		}
		if (Static138.aClass204ArrayArrayArray1[arg0][arg1][arg2] == null) {
			Static148.method4534(arg0, arg1, arg2);
		}
		Static138.aClass204ArrayArrayArray1[arg0][arg1][arg2].aClass5_Sub2_1 = arg4;
	}
}
