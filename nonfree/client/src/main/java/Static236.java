import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static236 {

	@OriginalMember(owner = "client!lr", name = "W", descriptor = "I")
	public static int anInt3837;

	@OriginalMember(owner = "client!lr", name = "J", descriptor = "I")
	public static int anInt3825 = 2;

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(JIBI)V")
	public static void method3109(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = (int) arg0 >> 14 & 0x1F;
		@Pc(17) int local17 = (int) arg0 >> 20 & 0x3;
		@Pc(31) int local31 = (int) (arg0 >>> 32) & Integer.MAX_VALUE;
		if (local10 != 10 && local10 != 11 && local10 != 22) {
			Static308.method4012(arg1, 0, arg2, 0, true, 0, local17, local10);
			return;
		}
		@Pc(51) Class141 local51 = Static259.aClass95_3.method1821(local31);
		@Pc(67) int local67;
		@Pc(64) int local64;
		if (local17 == 0 || local17 == 2) {
			local64 = local51.anInt3403;
			local67 = local51.anInt3423;
		} else {
			local64 = local51.anInt3423;
			local67 = local51.anInt3403;
		}
		@Pc(78) int local78 = local51.anInt3411;
		if (local17 != 0) {
			local78 = (local78 << local17 & 0xF) + (local78 >> 4 - local17);
		}
		Static308.method4012(arg1, local64, arg2, local67, true, local78, 0, 0);
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(III)V")
	public static void method3110(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class210 local9 = Static167.aClass210ArrayArray1[arg1][arg0];
		if (local9 != null) {
			Static337.anInt1768 = local9.anInt5569;
			Static195.anInt3124 = local9.anInt5572;
			Static20.anInt438 = local9.anInt5579;
		}
		Static284.method3698();
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIIIILclient!uo;)V")
	public static void method3111(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class1_Sub42 arg4) {
		if (arg4.anInt6729 == -1 && arg4.anIntArray449 == null) {
			return;
		}
		@Pc(24) int local24 = 0;
		@Pc(32) int local32 = arg4.anInt6734 * Static336.aClass106_Sub1_1.anInt5682 >> 8;
		if (arg3 > arg4.anInt6721) {
			local24 = arg3 - arg4.anInt6721;
		} else if (arg3 < arg4.anInt6733) {
			local24 = arg4.anInt6733 - arg3;
		}
		if (arg0 > arg4.anInt6728) {
			local24 += arg0 - arg4.anInt6728;
		} else if (arg0 < arg4.anInt6732) {
			local24 += arg4.anInt6732 - arg0;
		}
		if (arg4.anInt6723 == 0 || arg4.anInt6723 < local24 - 64 || Static336.aClass106_Sub1_1.anInt5682 == 0 || arg2 != arg4.anInt6731) {
			if (arg4.aClass1_Sub9_Sub1_3 != null) {
				Static155.aClass1_Sub9_Sub2_1.method1038(arg4.aClass1_Sub9_Sub1_3);
				arg4.aClass1_Sub9_Sub1_3 = null;
			}
			if (arg4.aClass1_Sub9_Sub1_4 != null) {
				Static155.aClass1_Sub9_Sub2_1.method1038(arg4.aClass1_Sub9_Sub1_4);
				arg4.aClass1_Sub9_Sub1_4 = null;
			}
			return;
		}
		local24 -= 64;
		if (local24 < 0) {
			local24 = 0;
		}
		@Pc(159) int local159 = (arg4.anInt6723 - local24) * local32 / arg4.anInt6723;
		if (arg4.aClass1_Sub9_Sub1_3 != null) {
			arg4.aClass1_Sub9_Sub1_3.method938(local159);
		} else if (arg4.anInt6729 >= 0) {
			@Pc(180) Class39 local180 = Static456.method736(Static12.aClass113_7, arg4.anInt6729, 0);
			if (local180 != null) {
				@Pc(187) Class1_Sub28_Sub1 local187 = local180.method738().method3469(Static80.aClass233_1);
				@Pc(192) Class1_Sub9_Sub1 local192 = Static457.method942(local187, local159);
				local192.method934(-1);
				Static155.aClass1_Sub9_Sub2_1.method1036(local192);
				arg4.aClass1_Sub9_Sub1_3 = local192;
			}
		}
		if (arg4.aClass1_Sub9_Sub1_4 != null) {
			arg4.aClass1_Sub9_Sub1_4.method938(local159);
			if (!arg4.aClass1_Sub9_Sub1_4.method5618()) {
				arg4.aClass1_Sub9_Sub1_4 = null;
			}
		} else if (arg4.anIntArray449 != null && (arg4.anInt6730 -= arg1) <= 0) {
			@Pc(236) int local236 = (int) ((double) arg4.anIntArray449.length * Math.random());
			@Pc(244) Class39 local244 = Static456.method736(Static12.aClass113_7, arg4.anIntArray449[local236], 0);
			if (local244 != null) {
				@Pc(251) Class1_Sub28_Sub1 local251 = local244.method738().method3469(Static80.aClass233_1);
				@Pc(256) Class1_Sub9_Sub1 local256 = Static457.method942(local251, local159);
				local256.method934(0);
				Static155.aClass1_Sub9_Sub2_1.method1036(local256);
				arg4.aClass1_Sub9_Sub1_4 = local256;
				arg4.anInt6730 = (int) (Math.random() * (double) (arg4.anInt6722 - arg4.anInt6724)) + arg4.anInt6724;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!lr", name = "e", descriptor = "(I)V")
	public static void method3113() {
		Static391.aClass49_20 = null;
		Static316.aClass49_19 = null;
		Static415.aClass49_6 = null;
		Static9.aClass49_1 = null;
		Static453.aClass49_22 = null;
		Static26.aClass49_2 = null;
		Static240.aClass49_11 = null;
		Static283.aClass49_12 = null;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIIIIII)V")
	public static void method3114(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		@Pc(12) int local12 = Static31.anInt624;
		@Pc(14) int[] local14 = Static363.anIntArray373;
		Static196.anInt3135 = 0;
		@Pc(184) int local184;
		@Pc(229) int local229;
		@Pc(275) int local275;
		@Pc(356) int local356;
		@Pc(429) int local429;
		@Pc(890) int local890;
		@Pc(539) int local539;
		for (@Pc(18) int local18 = 0; local18 < local12 + Static411.anInt6695; local18++) {
			@Pc(22) Class246 local22 = null;
			@Pc(31) Class20_Sub3_Sub3 local31;
			if (local18 < local12) {
				local31 = Static73.aClass20_Sub3_Sub3_Sub1Array1[local14[local18]];
			} else {
				local31 = Static98.aClass20_Sub3_Sub3_Sub2Array1[Static220.anIntArray193[local18 - local12]];
				local22 = ((Class20_Sub3_Sub3_Sub2) local31).aClass246_1;
				if (local22.anIntArray459 != null) {
					local22 = local22.method5255(Static364.aClass259_1);
					if (local22 == null) {
						continue;
					}
				}
			}
			if (local31.anInt6020 >= 0 && (local31.anInt6061 == Static116.anInt5420 || local31.aByte89 == Static239.aClass20_Sub3_Sub3_Sub1_1.aByte89)) {
				Static455.method5632(arg3 >> 1, local31.method4684(), arg1 >> 1, local31);
				if (Static80.anIntArray72[0] >= 0) {
					if (local31.aString53 != null && (local12 <= local18 || Static224.anInt3659 == 0 || Static224.anInt3659 == 3 || Static224.anInt3659 == 1 && Static249.method3243(((Class20_Sub3_Sub3_Sub1) local31).aString48)) && Static196.anInt3135 < Static282.anInt4464) {
						Static282.anIntArray244[Static196.anInt3135] = Static6.aClass122_1.method2464(local31.aString53) / 2;
						Static282.anIntArray240[Static196.anInt3135] = Static80.anIntArray72[0];
						Static282.anIntArray241[Static196.anInt3135] = Static80.anIntArray72[1];
						Static282.anIntArray239[Static196.anInt3135] = local31.anInt6032;
						Static282.anIntArray243[Static196.anInt3135] = local31.anInt6038;
						Static282.anIntArray245[Static196.anInt3135] = local31.anInt6021;
						Static282.aStringArray39[Static196.anInt3135] = local31.aString53;
						Static196.anInt3135++;
					}
					local184 = arg0 + Static80.anIntArray72[1];
					@Pc(260) Class49[] local260;
					@Pc(267) Class100[] local267;
					@Pc(327) Class49 local327;
					if (local31.aBoolean503 || Static368.anInt6250 >= local31.anInt6058) {
						local184 -= Math.max(Static6.aClass122_1.anInt3003, Static241.aClass49Array86[0].qa());
					} else {
						@Pc(211) byte local211 = 1;
						if (local12 > local18) {
							@Pc(224) Class20_Sub3_Sub3_Sub1 local224 = Static73.aClass20_Sub3_Sub3_Sub1Array1[local14[local18]];
							local229 = local31.method4676().anInt1288;
							if (local224.aBoolean395) {
								local211 = 2;
							}
						} else {
							local229 = local22.anInt6850;
							if (local229 == -1) {
								local229 = local31.method4676().anInt1288;
							}
						}
						@Pc(249) Class49[] local249 = Static241.aClass49Array86;
						if (local229 != -1) {
							local260 = (Class49[]) Static104.aClass167_99.method3386((long) local229);
							if (local260 == null) {
								local267 = Static458.method1923(Static169.aClass113_55, local229);
								if (local267 != null) {
									local260 = new Class49[local267.length];
									for (local275 = 0; local275 < local267.length; local275++) {
										local260[local275] = Static213.aClass128_22.method3540(local267[local275]);
									}
									Static104.aClass167_99.method3392(local260, (long) local229);
								}
							}
							if (local260 != null && local260.length >= 2) {
								local249 = local260;
							}
						}
						if (local211 >= local249.length) {
							local211 = 1;
						}
						@Pc(323) Class49 local323 = local249[0];
						local327 = local249[local211];
						local184 -= Math.max(Static6.aClass122_1.anInt3003, local323.qa());
						local275 = arg2 + Static80.anIntArray72[0] - (local323.UA() >> 1);
						local356 = local323.UA() * local31.anInt6036 / 255;
						if (local31.anInt6036 > 0 && local356 < 2) {
							local356 = 2;
						}
						local323.method5636(local275, local184);
						Static213.aClass128_22.Z(local275, local184, local275 + local356, local323.qa() + local184);
						local327.method5636(local275, local184);
						Static213.aClass128_22.pa(arg2, arg0, arg3 + arg2, arg1 + arg0);
					}
					local184 -= 2;
					if (!local31.aBoolean503) {
						@Pc(412) Class49 local412;
						if (local31.anInt6054 > Static368.anInt6250) {
							local412 = Static374.aClass49Array125[local31.aBoolean500 ? 2 : 0];
							@Pc(421) Class49 local421 = Static374.aClass49Array125[local31.aBoolean500 ? 3 : 1];
							if (local31 instanceof Class20_Sub3_Sub3_Sub2) {
								local429 = local22.anInt6838;
								if (local429 == -1) {
									local429 = local31.method4676().anInt1297;
								}
							} else {
								local429 = local31.method4676().anInt1297;
							}
							if (local429 != -1) {
								local260 = (Class49[]) Static322.aClass167_103.method3386((long) local429);
								if (local260 == null) {
									local267 = Static458.method1923(Static169.aClass113_55, local429);
									if (local267 != null) {
										local260 = new Class49[local267.length];
										for (local275 = 0; local275 < local267.length; local275++) {
											local260[local275] = Static213.aClass128_22.method3540(local267[local275]);
										}
										Static322.aClass167_103.method3392(local260, (long) local429);
									}
								}
								if (local260 != null && local260.length == 4) {
									local421 = local260[local31.aBoolean500 ? 3 : 1];
									local412 = local260[local31.aBoolean500 ? 2 : 0];
								}
							}
							@Pc(528) int local528 = local31.anInt6054 - Static368.anInt6250;
							if (local528 <= local31.anInt6052) {
								local539 = local412.UA();
							} else {
								local528 -= local31.anInt6052;
								local275 = local31.anInt6027 == 0 ? 0 : local31.anInt6027 * ((local31.anInt6026 - local528) / local31.anInt6027);
								local539 = local412.UA() * local275 / local31.anInt6026;
							}
							local275 = local412.qa();
							local184 -= local275;
							local356 = Static80.anIntArray72[0] + arg2 - (local412.UA() >> 1);
							local412.method5636(local356, local184);
							Static213.aClass128_22.Z(local356, local184, local356 + local539, local275 + local184);
							local421.method5636(local356, local184);
							local184 -= 2;
							Static213.aClass128_22.pa(arg2, arg0, arg2 + arg3, arg0 - -arg1);
						}
						if (local18 < local12) {
							@Pc(630) Class20_Sub3_Sub3_Sub1 local630 = (Class20_Sub3_Sub3_Sub1) local31;
							if (local630.anInt4936 != -1) {
								local184 -= 25;
								Static201.aClass49Array71[local630.anInt4936].method5636(Static80.anIntArray72[0] + arg2 - 12, local184);
								local184 -= 2;
							}
							if (local630.anInt4937 != -1) {
								local184 -= 25;
								Static66.aClass49Array31[local630.anInt4937].method5636(arg2 + Static80.anIntArray72[0] - 12, local184);
								local184 -= 2;
							}
						} else if (local22.anInt6840 >= 0 && Static66.aClass49Array31.length > local22.anInt6840) {
							local184 -= 25;
							local412 = Static66.aClass49Array31[local22.anInt6840];
							local412.method5636(Static80.anIntArray72[0] + arg2 - (local412.UA() >> 1), local184);
							local184 -= 2;
						}
					}
					@Pc(716) Class209[] local716;
					@Pc(724) Class209 local724;
					if (!(local31 instanceof Class20_Sub3_Sub3_Sub1)) {
						local229 = 0;
						local716 = Static162.aClass209Array1;
						for (local429 = 0; local429 < local716.length; local429++) {
							local724 = local716[local429];
							if (local724 != null && local724.anInt5510 == 1 && Static220.anIntArray193[local18 - local12] == local724.anInt5517) {
								local327 = Static454.aClass49Array146[local724.anInt5509];
								if (local229 < local327.qa()) {
									local229 = local327.qa();
								}
								if (Static368.anInt6250 % 20 < 10) {
									local327.method5636(Static80.anIntArray72[0] + arg2 - 12, local184 + -local327.qa());
								}
							}
						}
						if (local229 > 0) {
						}
					} else if (local18 >= 0) {
						local229 = 0;
						local716 = Static162.aClass209Array1;
						for (local429 = 0; local429 < local716.length; local429++) {
							local724 = local716[local429];
							if (local724 != null && local724.anInt5510 == 10 && local724.anInt5517 == local14[local18]) {
								local327 = Static454.aClass49Array146[local724.anInt5509];
								if (local327.qa() > local229) {
									local229 = local327.qa();
								}
								local327.method5636(arg2 + Static80.anIntArray72[0] - 12, local184 - local327.qa());
							}
						}
						if (local229 > 0) {
						}
					}
					for (local229 = 0; local229 < 4; local229++) {
						if (Static368.anInt6250 < local31.anIntArray367[local229]) {
							local890 = local31.method4684() / 2;
							Static455.method5632(arg3 >> 1, local890, arg1 >> 1, local31);
							if (Static80.anIntArray72[0] > -1) {
								if (local229 == 1) {
									Static80.anIntArray72[1] -= 20;
								}
								if (local229 == 2) {
									Static80.anIntArray72[0] -= 15;
									Static80.anIntArray72[1] -= 10;
								}
								if (local229 == 3) {
									Static80.anIntArray72[1] -= 10;
									Static80.anIntArray72[0] += 15;
								}
								Static9.aClass49Array9[local31.anIntArray366[local229]].method5636(Static80.anIntArray72[0] + arg2 - 12, Static80.anIntArray72[1] + arg0 + -12);
								Static439.aClass16_4.method5495(-1, 0, arg2 + Static80.anIntArray72[0] - 1, arg0 + Static80.anIntArray72[1] - -3, Integer.toString(local31.anIntArray368[local229]));
							}
						}
					}
				}
			}
		}
		@Pc(1018) int local1018;
		for (@Pc(1012) int local1012 = 0; local1012 < Static101.anInt6648; local1012++) {
			local1018 = Static350.anIntArray344[local1012];
			@Pc(1029) Class20_Sub3_Sub3 local1029;
			if (local1018 >= 2048) {
				local1029 = Static98.aClass20_Sub3_Sub3_Sub2Array1[local1018 - 2048];
			} else {
				local1029 = Static73.aClass20_Sub3_Sub3_Sub1Array1[local1018];
			}
			local229 = Static28.anIntArray31[local1012];
			@Pc(1048) Class20_Sub3_Sub3 local1048;
			if (local229 >= 2048) {
				local1048 = Static98.aClass20_Sub3_Sub3_Sub2Array1[local229 - 2048];
			} else {
				local1048 = Static73.aClass20_Sub3_Sub3_Sub1Array1[local229];
			}
			Static122.method1694(local1048, arg0, --local1029.anInt6025, arg1, local1029, arg2, arg3);
		}
		local1018 = Static6.aClass122_1.anInt3010 + Static6.aClass122_1.anInt3003 + 2;
		for (local184 = 0; local184 < Static196.anInt3135; local184++) {
			local229 = Static282.anIntArray240[local184];
			local890 = Static282.anIntArray241[local184];
			local429 = Static282.anIntArray244[local184];
			@Pc(1105) boolean local1105 = true;
			while (local1105) {
				local1105 = false;
				for (local539 = 0; local539 < local184; local539++) {
					if (Static282.anIntArray241[local539] - local1018 < local890 + 2 && Static282.anIntArray241[local539] + 2 > local890 + -local1018 && Static282.anIntArray244[local539] + Static282.anIntArray240[local539] > -local429 + local229 && Static282.anIntArray240[local539] - Static282.anIntArray244[local539] < local229 - -local429 && Static282.anIntArray241[local539] - local1018 < local890) {
						local1105 = true;
						local890 = Static282.anIntArray241[local539] - local1018;
					}
				}
			}
			Static282.anIntArray241[local184] = local890;
			@Pc(1200) String local1200 = Static282.aStringArray39[local184];
			if (Static382.anInt6348 == 0) {
				local275 = 16776960;
				if (Static282.anIntArray239[local184] < 6) {
					local275 = Static121.anIntArray98[Static282.anIntArray239[local184]];
				}
				if (Static282.anIntArray239[local184] == 6) {
					local275 = Static116.anInt5420 % 20 < 10 ? 16711680 : 16776960;
				}
				if (Static282.anIntArray239[local184] == 7) {
					local275 = Static116.anInt5420 % 20 >= 10 ? 65535 : 255;
				}
				if (Static282.anIntArray239[local184] == 8) {
					local275 = Static116.anInt5420 % 20 >= 10 ? 8454016 : 45056;
				}
				if (Static282.anIntArray239[local184] == 9) {
					local356 = 150 - Static282.anIntArray245[local184];
					if (local356 < 50) {
						local275 = local356 * 1280 + 16711680;
					} else if (local356 < 100) {
						local275 = 16384000 + 16776960 - local356 * 327680;
					} else if (local356 < 150) {
						local275 = local356 * 5 + 65280 - 500;
					}
				}
				if (Static282.anIntArray239[local184] == 10) {
					local356 = 150 - Static282.anIntArray245[local184];
					if (local356 < 50) {
						local275 = local356 * 5 + 16711680;
					} else if (local356 < 100) {
						local275 = 16384000 + 16711935 - local356 * 327680;
					} else if (local356 < 150) {
						local275 = local356 * 327680 + 255 + 500 - local356 * 5 - 32768000;
					}
				}
				if (Static282.anIntArray239[local184] == 11) {
					local356 = 150 - Static282.anIntArray245[local184];
					if (local356 < 50) {
						local275 = 16777215 - local356 * 327685;
					} else if (local356 < 100) {
						local275 = local356 * 327685 - 16318970;
					} else if (local356 < 150) {
						local275 = 16777215 + 32768000 - local356 * 327680;
					}
				}
				local356 = local275 | 0xFF000000;
				if (Static282.anIntArray243[local184] == 0) {
					Static227.aClass16_1.method5495(local356, -16777216, local229 + arg2, local890 + arg0, local1200);
				}
				if (Static282.anIntArray243[local184] == 1) {
					Static227.aClass16_1.method5486(arg2 + local229, local890 + arg0, Static116.anInt5420, local1200, local356);
				}
				if (Static282.anIntArray243[local184] == 2) {
					Static227.aClass16_1.method5480(Static116.anInt5420, local356, local229 + arg2, arg0 + local890, local1200);
				}
				if (Static282.anIntArray243[local184] == 3) {
					Static227.aClass16_1.method5488(arg2 + local229, local356, 150 - Static282.anIntArray245[local184], local1200, Static116.anInt5420, arg0 + local890);
				}
				@Pc(1539) int local1539;
				if (Static282.anIntArray243[local184] == 4) {
					local1539 = (150 - Static282.anIntArray245[local184]) * (Static6.aClass122_1.method2464(local1200) + 100) / 150;
					Static213.aClass128_22.Z(arg2 + local229 - 50, arg0, local229 + arg2 + 50, arg1 + arg0);
					Static227.aClass16_1.method5478(local229 + arg2 + 50 - local1539, arg0 + local890, -16777216, local1200, local356);
					Static213.aClass128_22.pa(arg2, arg0, arg2 + arg3, arg1 + arg0);
				}
				if (Static282.anIntArray243[local184] == 5) {
					local1539 = 150 - Static282.anIntArray245[local184];
					@Pc(1599) int local1599 = 0;
					if (local1539 < 25) {
						local1599 = local1539 - 25;
					} else if (local1539 > 125) {
						local1599 = local1539 - 125;
					}
					@Pc(1621) int local1621 = Static6.aClass122_1.anInt3003 + Static6.aClass122_1.anInt3010;
					Static213.aClass128_22.Z(arg2, local890 + arg0 - local1621 - 1, arg2 - -arg3, local890 + arg0 + 5);
					Static227.aClass16_1.method5495(local356, -16777216, arg2 + local229, arg0 - (-local890 - local1599), local1200);
					Static213.aClass128_22.pa(arg2, arg0, arg2 + arg3, arg0 + arg1);
				}
			} else {
				Static227.aClass16_1.method5495(-256, -16777216, arg2 + local229, arg0 - -local890, local1200);
			}
		}
	}
}
