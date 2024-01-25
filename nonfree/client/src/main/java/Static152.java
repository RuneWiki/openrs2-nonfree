import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!hj", name = "K", descriptor = "I")
	public static int anInt2600;

	@OriginalMember(owner = "client!hj", name = "J", descriptor = "Lclient!uf;")
	public static final Class237 aClass237_50 = new Class237(0, -2);

	@OriginalMember(owner = "client!hj", name = "L", descriptor = "Lclient!wo;")
	public static Class266 aClass266_19 = new Class266();

	@OriginalMember(owner = "client!hj", name = "M", descriptor = "Lclient!uf;")
	public static final Class237 aClass237_51 = new Class237(94, 12);

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(ILclient!qa;)V")
	public static void method2306(@OriginalArg(1) Class109 arg0) {
		if (Static82.anInt1627 < 2 && !Static138.aBoolean128 || Static442.aClass219_14 != null) {
			return;
		}
		@Pc(34) String local34;
		if (Static138.aBoolean128 && Static82.anInt1627 < 2) {
			local34 = Static233.aString33 + Static52.aClass84_15.method1678(Static167.anInt3118) + Static254.aString36 + " ->";
		} else if (Static40.aBoolean27 && Static102.aClass163_1.method3809(81) && Static82.anInt1627 > 2) {
			local34 = Static125.method1868((Class1_Sub8) Static8.aClass266_2.aClass1_255.aClass1_262.aClass1_262);
		} else {
			@Pc(53) Class1_Sub8 local53 = (Class1_Sub8) Static8.aClass266_2.aClass1_255.aClass1_262;
			local34 = Static125.method1868(local53);
			@Pc(61) int[] local61 = null;
			if (Static396.method5372(local53.anInt1758)) {
				local61 = Static196.aClass139_1.method3228((int) local53.aLong50).anIntArray684;
			} else if (local53.anInt1757 != -1) {
				local61 = Static196.aClass139_1.method3228(local53.anInt1757).anIntArray684;
			} else if (Static302.method4317(local53.anInt1758)) {
				@Pc(90) Class26_Sub2_Sub2_Sub2 local90 = Static410.aClass26_Sub2_Sub2_Sub2Array1[(int) local53.aLong50];
				if (local90 != null) {
					@Pc(95) Class66 local95 = local90.aClass66_1;
					if (local95.anIntArray152 != null) {
						local95 = local95.method1454(Static51.aClass79_1);
					}
					if (local95 != null) {
						local61 = local95.anIntArray151;
					}
				}
			} else if (Static202.method3066(local53.anInt1758)) {
				@Pc(131) Class182 local131;
				if (local53.anInt1758 == 1003) {
					local131 = Static71.aClass105_6.method2336((int) local53.aLong50);
				} else {
					local131 = Static71.aClass105_6.method2336((int) (local53.aLong50 >>> 32 & 0x7FFFFFFFL));
				}
				if (local131.anIntArray425 != null) {
					local131 = local131.method4388(Static51.aClass79_1);
				}
				if (local131 != null) {
					local61 = local131.anIntArray430;
				}
			}
			if (local61 != null) {
				local34 = local34 + Static31.method549(local61);
			}
		}
		if (Static82.anInt1627 > 2) {
			local34 = local34 + "<col=ffffff> / " + (Static82.anInt1627 - 2) + Static350.aClass84_82.method1678(Static167.anInt3118);
		}
		if (Static373.aClass219_16 != null) {
			@Pc(220) Class129 local220 = Static373.aClass219_16.method5120(arg0);
			if (local220 == null) {
				local220 = Static139.aClass129_1;
			}
			local220.method5820(Static373.aClass219_16.anInt6405, Static373.aClass219_16.anInt6398, Static362.anInt6137, Static373.aClass219_16.anInt6363, Static373.aClass219_16.anInt6364, Static364.aClass80Array17, Static373.aClass219_16.anInt6400, local34, Static301.aRandom3, Static373.aClass219_16.anInt6339, Static63.anIntArray87, Static356.anInt6061, Static12.anIntArray20, Static12.anInt318);
			Static377.method5166(Static12.anIntArray20[2], Static12.anIntArray20[1], Static12.anIntArray20[3], Static12.anIntArray20[0]);
		} else if (Static168.aClass219_10 != null && Static288.aClass145_3 == Static248.aClass145_2) {
			@Pc(287) int local287 = Static139.aClass129_1.method5832(Static12.anInt318, local34, Static364.aClass80Array17, Static63.anIntArray87, Static301.aRandom3, Static294.anInt5923 + 4, Static408.anInt7059 + 16);
			Static377.method5166(local287 + Static167.aClass101_3.method1963(local34), Static408.anInt7059, 16, Static294.anInt5923 + 4);
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IZ)Z")
	public static boolean method2307(@OriginalArg(0) int arg0) {
		return arg0 == 2 || arg0 == 3;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIIIIZI)V")
	public static void method2309(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) int local12 = Static187.anInt4913;
		@Pc(14) int[] local14 = Static256.anIntArray370;
		Static355.anInt6056 = 0;
		@Pc(182) int local182;
		@Pc(211) int local211;
		@Pc(257) int local257;
		@Pc(335) int local335;
		@Pc(424) int local424;
		@Pc(878) int local878;
		@Pc(525) int local525;
		for (@Pc(18) int local18 = 0; local18 < local12 + Static288.anInt5039; local18++) {
			@Pc(22) Class66 local22 = null;
			@Pc(37) Class26_Sub2_Sub2 local37;
			if (local18 >= local12) {
				local37 = Static410.aClass26_Sub2_Sub2_Sub2Array1[Static212.anIntArray28[local18 - local12]];
				local22 = ((Class26_Sub2_Sub2_Sub2) local37).aClass66_1;
				if (local22.anIntArray152 != null) {
					local22 = local22.method1454(Static51.aClass79_1);
					if (local22 == null) {
						continue;
					}
				}
			} else {
				local37 = Static311.aClass26_Sub2_Sub2_Sub1Array1[local14[local18]];
			}
			if (local37.anInt7105 >= 0 && (Static243.anInt4342 == local37.anInt7145 || local37.aByte95 == Static196.aClass26_Sub2_Sub2_Sub1_1.aByte95)) {
				Static9.method237(arg0 >> 1, local37, local37.method5540(), arg1 >> 1);
				if (Static343.anIntArray470[0] >= 0) {
					if (local37.aString55 != null && (local18 >= local12 || Static118.anInt3959 == 0 || Static118.anInt3959 == 3 || Static118.anInt3959 == 1 && Static382.method5214(((Class26_Sub2_Sub2_Sub1) local37).aString51)) && Static122.anInt2158 > Static355.anInt6056) {
						Static122.anIntArray195[Static355.anInt6056] = Static167.aClass101_3.method1963(local37.aString55) / 2;
						Static122.anIntArray199[Static355.anInt6056] = Static343.anIntArray470[0];
						Static122.anIntArray198[Static355.anInt6056] = Static343.anIntArray470[1];
						Static122.anIntArray201[Static355.anInt6056] = local37.anInt7115;
						Static122.anIntArray202[Static355.anInt6056] = local37.anInt7078;
						Static122.anIntArray197[Static355.anInt6056] = local37.anInt7114;
						Static122.aStringArray24[Static355.anInt6056] = local37.aString55;
						Static355.anInt6056++;
					}
					local182 = arg3 + Static343.anIntArray470[1];
					@Pc(242) Class80[] local242;
					@Pc(249) Class159[] local249;
					@Pc(307) Class80 local307;
					if (local37.aBoolean459 || local37.anInt7139 <= Static403.anInt6978) {
						local182 -= Math.max(Static167.aClass101_3.anInt2378, Static195.aClass80Array4[0].qa());
					} else {
						@Pc(197) byte local197 = 1;
						if (local12 > local18) {
							@Pc(206) Class26_Sub2_Sub2_Sub1 local206 = Static311.aClass26_Sub2_Sub2_Sub1Array1[local14[local18]];
							local211 = local37.method5533().anInt4674;
							if (local206.aBoolean432) {
								local197 = 2;
							}
						} else {
							local211 = local22.anInt1706;
							if (local211 == -1) {
								local211 = local37.method5533().anInt4674;
							}
						}
						@Pc(232) Class80[] local232 = Static195.aClass80Array4;
						if (local211 != -1) {
							local242 = (Class80[]) Static387.aClass83_54.method1658((long) local211);
							if (local242 == null) {
								local249 = Static459.method3750(Static384.aClass250_76, local211);
								if (local249 != null) {
									local242 = new Class80[local249.length];
									for (local257 = 0; local257 < local249.length; local257++) {
										local242[local257] = Static276.aClass109_10.method4684(local249[local257]);
									}
									Static387.aClass83_54.method1675((long) local211, local242);
								}
							}
							if (local242 != null && local242.length >= 2) {
								local232 = local242;
							}
						}
						if (local197 >= local232.length) {
							local197 = 1;
						}
						@Pc(303) Class80 local303 = local232[0];
						local307 = local232[local197];
						local182 -= Math.max(Static167.aClass101_3.anInt2378, local303.qa());
						local257 = arg2 + Static343.anIntArray470[0] - (local303.UA() >> 1);
						local335 = local303.UA() * local37.anInt7118 / 255;
						if (local37.anInt7118 > 0 && local335 < 2) {
							local335 = 2;
						}
						local303.method6099(local257, local182);
						Static276.aClass109_10.Z(local257, local182, local257 + local335, local303.qa() + local182);
						local307.method6099(local257, local182);
						Static276.aClass109_10.pa(arg2, arg3, arg1 + arg2, arg0 + arg3);
					}
					local182 -= 2;
					if (!local37.aBoolean459) {
						@Pc(407) Class80 local407;
						if (Static403.anInt6978 < local37.anInt7096) {
							local407 = Static370.aClass80Array18[local37.aBoolean456 ? 2 : 0];
							@Pc(416) Class80 local416 = Static370.aClass80Array18[local37.aBoolean456 ? 3 : 1];
							if (local37 instanceof Class26_Sub2_Sub2_Sub2) {
								local424 = local22.anInt1705;
								if (local424 == -1) {
									local424 = local37.method5533().anInt4692;
								}
							} else {
								local424 = local37.method5533().anInt4692;
							}
							if (local424 != -1) {
								local242 = (Class80[]) Static63.aClass83_9.method1658((long) local424);
								if (local242 == null) {
									local249 = Static459.method3750(Static384.aClass250_76, local424);
									if (local249 != null) {
										local242 = new Class80[local249.length];
										for (local257 = 0; local257 < local249.length; local257++) {
											local242[local257] = Static276.aClass109_10.method4684(local249[local257]);
										}
										Static63.aClass83_9.method1675((long) local424, local242);
									}
								}
								if (local242 != null && local242.length == 4) {
									local416 = local242[local37.aBoolean456 ? 3 : 1];
									local407 = local242[local37.aBoolean456 ? 2 : 0];
								}
							}
							@Pc(518) int local518 = local37.anInt7096 - Static403.anInt6978;
							if (local518 <= local37.anInt7130) {
								local525 = local407.UA();
							} else {
								local518 -= local37.anInt7130;
								local257 = local37.anInt7084 == 0 ? 0 : local37.anInt7084 * ((local37.anInt7124 - local518) / local37.anInt7084);
								local525 = local407.UA() * local257 / local37.anInt7124;
							}
							local257 = local407.qa();
							local182 -= local257;
							local335 = arg2 + Static343.anIntArray470[0] - (local407.UA() >> 1);
							local407.method6099(local335, local182);
							Static276.aClass109_10.Z(local335, local182, local525 + local335, local182 - -local257);
							local416.method6099(local335, local182);
							Static276.aClass109_10.pa(arg2, arg3, arg2 + arg1, arg3 - -arg0);
							local182 -= 2;
						}
						if (local12 > local18) {
							@Pc(651) Class26_Sub2_Sub2_Sub1 local651 = (Class26_Sub2_Sub2_Sub1) local37;
							if (local651.anInt6631 != -1) {
								local182 -= 25;
								Static199.aClass80Array5[local651.anInt6631].method6099(Static343.anIntArray470[0] + arg2 - 12, local182);
								local182 -= 2;
							}
							if (local651.anInt6628 != -1) {
								local182 -= 25;
								Static337.aClass80Array19[local651.anInt6628].method6099(arg2 + Static343.anIntArray470[0] - 12, local182);
								local182 -= 2;
							}
						} else if (local22.anInt1702 >= 0 && local22.anInt1702 < Static337.aClass80Array19.length) {
							local407 = Static337.aClass80Array19[local22.anInt1702];
							local182 -= 25;
							local407.method6099(Static343.anIntArray470[0] + arg2 - (local407.UA() >> 1), local182);
							local182 -= 2;
						}
					}
					@Pc(699) Class3[] local699;
					@Pc(707) Class3 local707;
					if (!(local37 instanceof Class26_Sub2_Sub2_Sub1)) {
						local211 = 0;
						local699 = Static444.aClass3Array1;
						for (local424 = 0; local424 < local699.length; local424++) {
							local707 = local699[local424];
							if (local707 != null && local707.anInt171 == 1 && Static212.anIntArray28[local18 - local12] == local707.anInt164) {
								local307 = Static233.aClass80Array10[local707.anInt165];
								if (local211 < local307.qa()) {
									local211 = local307.qa();
								}
								if (Static403.anInt6978 % 20 < 10) {
									local307.method6099(arg2 + Static343.anIntArray470[0] - 12, local182 + -local307.qa());
								}
							}
						}
						if (local211 > 0) {
						}
					} else if (local18 >= 0) {
						local211 = 0;
						local699 = Static444.aClass3Array1;
						for (local424 = 0; local424 < local699.length; local424++) {
							local707 = local699[local424];
							if (local707 != null && local707.anInt171 == 10 && local707.anInt164 == local14[local18]) {
								local307 = Static233.aClass80Array10[local707.anInt165];
								if (local307.qa() > local211) {
									local211 = local307.qa();
								}
								local307.method6099(arg2 + Static343.anIntArray470[0] - 12, -local307.qa() + local182);
							}
						}
						if (local211 > 0) {
						}
					}
					for (local211 = 0; local211 < 4; local211++) {
						if (local37.anIntArray588[local211] > Static403.anInt6978) {
							local878 = local37.method5540() / 2;
							Static9.method237(arg0 >> 1, local37, local878, arg1 >> 1);
							if (Static343.anIntArray470[0] > -1) {
								if (local211 == 1) {
									Static343.anIntArray470[1] -= 20;
								}
								if (local211 == 2) {
									Static343.anIntArray470[1] -= 10;
									Static343.anIntArray470[0] -= 15;
								}
								if (local211 == 3) {
									Static343.anIntArray470[1] -= 10;
									Static343.anIntArray470[0] += 15;
								}
								Static381.aClass80Array13[local37.anIntArray587[local211]].method6099(arg2 + Static343.anIntArray470[0] - 12, arg3 + Static343.anIntArray470[1] - 12);
								Static197.aClass129_2.method5828(Static343.anIntArray470[1] + arg3 + 3, arg2 + -1 + Static343.anIntArray470[0], -1, 0, Integer.toString(local37.anIntArray586[local211]));
							}
						}
					}
				}
			}
		}
		@Pc(1014) int local1014;
		for (@Pc(1008) int local1008 = 0; local1008 < Static144.anInt2448; local1008++) {
			local1014 = Static166.anIntArray491[local1008];
			@Pc(1021) Class26_Sub2_Sub2 local1021;
			if (local1014 < 2048) {
				local1021 = Static311.aClass26_Sub2_Sub2_Sub1Array1[local1014];
			} else {
				local1021 = Static410.aClass26_Sub2_Sub2_Sub2Array1[local1014 - 2048];
			}
			local211 = Static412.anIntArray624[local1008];
			@Pc(1040) Class26_Sub2_Sub2 local1040;
			if (local211 < 2048) {
				local1040 = Static311.aClass26_Sub2_Sub2_Sub1Array1[local211];
			} else {
				local1040 = Static410.aClass26_Sub2_Sub2_Sub2Array1[local211 - 2048];
			}
			Static204.method3121(arg3, arg1, local1040, arg0, local1021, --local1021.anInt7112, arg2);
		}
		local1014 = Static167.aClass101_3.anInt2378 + Static167.aClass101_3.anInt2376 + 2;
		for (local182 = 0; local182 < Static355.anInt6056; local182++) {
			local211 = Static122.anIntArray199[local182];
			local878 = Static122.anIntArray198[local182];
			local424 = Static122.anIntArray195[local182];
			@Pc(1100) boolean local1100 = true;
			while (local1100) {
				local1100 = false;
				for (local525 = 0; local525 < local182; local525++) {
					if (Static122.anIntArray198[local525] - local1014 < local878 + 2 && Static122.anIntArray198[local525] + 2 > local878 - local1014 && Static122.anIntArray199[local525] + Static122.anIntArray195[local525] > local211 + -local424 && Static122.anIntArray199[local525] - Static122.anIntArray195[local525] < local211 - -local424 && Static122.anIntArray198[local525] - local1014 < local878) {
						local878 = Static122.anIntArray198[local525] - local1014;
						local1100 = true;
					}
				}
			}
			Static122.anIntArray198[local182] = local878;
			@Pc(1194) String local1194 = Static122.aStringArray24[local182];
			if (Static281.anInt4961 == 0) {
				local257 = 16776960;
				if (Static122.anIntArray201[local182] < 6) {
					local257 = Static411.anIntArray593[Static122.anIntArray201[local182]];
				}
				if (Static122.anIntArray201[local182] == 6) {
					local257 = Static243.anInt4342 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static122.anIntArray201[local182] == 7) {
					local257 = Static243.anInt4342 % 20 >= 10 ? 65535 : 255;
				}
				if (Static122.anIntArray201[local182] == 8) {
					local257 = Static243.anInt4342 % 20 < 10 ? 45056 : 8454016;
				}
				if (Static122.anIntArray201[local182] == 9) {
					local335 = 150 - Static122.anIntArray197[local182];
					if (local335 < 50) {
						local257 = local335 * 1280 + 16711680;
					} else if (local335 < 100) {
						local257 = 16776960 + 16384000 - local335 * 327680;
					} else if (local335 < 150) {
						local257 = (local335 - 100) * 5 + 65280;
					}
				}
				if (Static122.anIntArray201[local182] == 10) {
					local335 = 150 - Static122.anIntArray197[local182];
					if (local335 < 50) {
						local257 = local335 * 5 + 16711680;
					} else if (local335 < 100) {
						local257 = 16711935 + 16384000 - local335 * 327680;
					} else if (local335 < 150) {
						local257 = (local335 - 100) * 327680 + 755 - local335 * 5;
					}
				}
				if (Static122.anIntArray201[local182] == 11) {
					local335 = 150 - Static122.anIntArray197[local182];
					if (local335 < 50) {
						local257 = 16777215 - local335 * 327685;
					} else if (local335 < 100) {
						local257 = (local335 - 50) * 327685 + 65280;
					} else if (local335 < 150) {
						local257 = 16777215 + 32768000 - local335 * 327680;
					}
				}
				local335 = local257 | 0xFF000000;
				if (Static122.anIntArray202[local182] == 0) {
					Static139.aClass129_1.method5828(local878 + arg3, local211 + arg2, local335, -16777216, local1194);
				}
				if (Static122.anIntArray202[local182] == 1) {
					Static139.aClass129_1.method5827(local335, Static243.anInt4342, local1194, local878 + arg3, local211 + arg2);
				}
				if (Static122.anIntArray202[local182] == 2) {
					Static139.aClass129_1.method5823(Static243.anInt4342, local878 + arg3, local335, arg2 + local211, local1194);
				}
				if (Static122.anIntArray202[local182] == 3) {
					Static139.aClass129_1.method5816(arg3 + local878, local211 + arg2, local1194, 150 - Static122.anIntArray197[local182], local335, Static243.anInt4342);
				}
				@Pc(1550) int local1550;
				if (Static122.anIntArray202[local182] == 4) {
					local1550 = (150 - Static122.anIntArray197[local182]) * (Static167.aClass101_3.method1963(local1194) - -100) / 150;
					Static276.aClass109_10.Z(local211 + arg2 - 50, arg3, local211 + arg2 + 50, arg0 + arg3);
					Static139.aClass129_1.method5825(local1194, local335, arg2 + local211 + 50 - local1550, -16777216, arg3 + local878);
					Static276.aClass109_10.pa(arg2, arg3, arg1 + arg2, arg0 + arg3);
				}
				if (Static122.anIntArray202[local182] == 5) {
					local1550 = 150 - Static122.anIntArray197[local182];
					@Pc(1608) int local1608 = 0;
					if (local1550 < 25) {
						local1608 = local1550 - 25;
					} else if (local1550 > 125) {
						local1608 = local1550 - 125;
					}
					@Pc(1632) int local1632 = Static167.aClass101_3.anInt2376 + Static167.aClass101_3.anInt2378;
					Static276.aClass109_10.Z(arg2, arg3 + local878 - local1632 - 1, arg2 + arg1, local878 + arg3 + 5);
					Static139.aClass129_1.method5828(local1608 + local878 + arg3, arg2 - -local211, local335, -16777216, local1194);
					Static276.aClass109_10.pa(arg2, arg3, arg2 + arg1, arg0 + arg3);
				}
			} else {
				Static139.aClass129_1.method5828(local878 + arg3, local211 + arg2, -256, -16777216, local1194);
			}
		}
	}
}
