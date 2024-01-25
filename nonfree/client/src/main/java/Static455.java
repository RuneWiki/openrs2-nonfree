import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static455 {

	@OriginalMember(owner = "client!wv", name = "N", descriptor = "[I")
	public static int[] anIntArray674 = new int[1];

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "([Ljava/lang/String;[SB)V")
	public static void method5871(@OriginalArg(0) String[] arg0, @OriginalArg(1) short[] arg1) {
		Static163.method2389(0, arg1, arg0, arg0.length - 1);
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(IIIBIII)V")
	public static void method5872(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static95.method1548(arg4);
		@Pc(10) int local10 = 0;
		@Pc(14) int local14 = arg4 - arg3;
		if (local14 < 0) {
			local14 = 0;
		}
		@Pc(20) int local20 = arg4;
		@Pc(23) int local23 = -arg4;
		@Pc(29) int local29 = local14;
		@Pc(32) int local32 = -local14;
		@Pc(34) int local34 = -1;
		@Pc(36) int local36 = -1;
		@Pc(40) int[] local40 = Static162.anIntArrayArray58[arg1];
		@Pc(45) int local45 = arg2 - local14;
		@Pc(50) int local50 = arg2 + local14;
		Static335.method4533(local45, arg0, arg2 - arg4, local40);
		Static335.method4533(local50, arg5, local45, local40);
		Static335.method4533(arg2 + arg4, arg0, local50, local40);
		while (local10 < local20) {
			local34 += 2;
			local36 += 2;
			local23 += local34;
			local32 += local36;
			if (local32 >= 0 && local29 >= 1) {
				Static312.anIntArray480[local29] = local10;
				local29--;
				local32 -= local29 << 1;
			}
			local10++;
			@Pc(127) int[] local127;
			@Pc(134) int[] local134;
			@Pc(138) int local138;
			@Pc(143) int local143;
			@Pc(184) int local184;
			@Pc(188) int local188;
			@Pc(193) int local193;
			if (local23 >= 0) {
				local20--;
				local23 -= local20 << 1;
				if (local20 >= local14) {
					local127 = Static162.anIntArrayArray58[local20 + arg1];
					local134 = Static162.anIntArrayArray58[arg1 - local20];
					local138 = arg2 + local10;
					local143 = arg2 - local10;
					Static335.method4533(local138, arg0, local143, local127);
					Static335.method4533(local138, arg0, local143, local134);
				} else {
					local127 = Static162.anIntArrayArray58[arg1 + local20];
					local134 = Static162.anIntArrayArray58[arg1 - local20];
					local138 = Static312.anIntArray480[local20];
					local143 = local10 + arg2;
					local184 = arg2 - local10;
					local188 = local138 + arg2;
					local193 = arg2 - local138;
					Static335.method4533(local193, arg0, local184, local127);
					Static335.method4533(local188, arg5, local193, local127);
					Static335.method4533(local143, arg0, local188, local127);
					Static335.method4533(local193, arg0, local184, local134);
					Static335.method4533(local188, arg5, local193, local134);
					Static335.method4533(local143, arg0, local188, local134);
				}
			}
			local127 = Static162.anIntArrayArray58[local10 + arg1];
			local134 = Static162.anIntArrayArray58[arg1 - local10];
			local138 = arg2 + local20;
			local143 = arg2 - local20;
			if (local14 > local10) {
				local184 = local10 > local29 ? Static312.anIntArray480[local10] : local29;
				local188 = local184 + arg2;
				local193 = arg2 - local184;
				Static335.method4533(local193, arg0, local143, local127);
				Static335.method4533(local188, arg5, local193, local127);
				Static335.method4533(local138, arg0, local188, local127);
				Static335.method4533(local193, arg0, local143, local134);
				Static335.method4533(local188, arg5, local193, local134);
				Static335.method4533(local138, arg0, local188, local134);
			} else {
				Static335.method4533(local138, arg0, local143, local127);
				Static335.method4533(local138, arg0, local143, local134);
			}
		}
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(ZLclient!ns;ILjava/lang/String;)Lclient!vq;")
	public static Class257 method5874(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class166 arg1, @OriginalArg(3) String arg2) {
		@Pc(10) int local10 = arg1.method3698(arg2);
		if (local10 == -1) {
			return new Class257(0);
		}
		@Pc(24) int[] local24 = arg1.method3687(local10);
		@Pc(30) Class257 local30 = new Class257(local24.length);
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 0;
		while (true) {
			while (local37 < local30.anInt7167) {
				@Pc(53) Class4_Sub30 local53 = new Class4_Sub30(arg1.method3696(local24[local39++], local10));
				@Pc(57) int local57 = local53.method4872();
				@Pc(61) int local61 = local53.method4877();
				@Pc(65) int local65 = local53.method4864();
				if (!arg0 && local65 == 1) {
					local30.anInt7167--;
				} else {
					local30.anIntArray631[local37] = local57;
					local30.anIntArray632[local37] = local61;
					local37++;
				}
			}
			return local30;
		}
	}

	@OriginalMember(owner = "client!wv", name = "b", descriptor = "(ZI)V")
	public static void method5875(@OriginalArg(0) boolean arg0) {
		if (arg0 && Static137.aClass4_Sub1_Sub16_2 != null) {
			Static344.anInt6187 = Static137.aClass4_Sub1_Sub16_2.anInt6326;
		} else {
			Static344.anInt6187 = -1;
		}
		Static113.aClass258_17 = null;
		Static137.aClass4_Sub1_Sub16_2 = null;
		Static231.anInt4229 = 0;
		Static124.aClass126_5 = null;
		Static137.method4295();
		Static137.aClass258_37.method5527();
		Static137.aClass257_2 = null;
		Static196.aClass264_22 = null;
		Static307.aClass264_49 = null;
		Static389.aClass264_41 = null;
		Static260.aClass264_50 = null;
		Static367.anInt6516 = -1;
		Static394.aClass264_42 = null;
		Static212.aClass3_11 = null;
		Static306.aClass264_35 = null;
		Static182.aClass264_21 = null;
		Static97.anInt2094 = -1;
		Static59.aClass264_7 = null;
		Static137.aClass198_4.method4490();
		Static137.aClass212_4.method4943(64, 64);
		Static137.aClass198_4.method4493(128, 64);
		Static137.aClass74_10.method1684(64);
		Static73.aClass252_1.method5481(64);
	}

	@OriginalMember(owner = "client!wv", name = "c", descriptor = "(IIIIIII)V")
	public static void method5876(@OriginalArg(2) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		@Pc(7) int local7 = Static58.anInt4352;
		Static177.anInt3302 = 0;
		@Pc(11) int[] local11 = Static144.anIntArray186;
		@Pc(177) int local177;
		@Pc(214) int local214;
		@Pc(267) int local267;
		@Pc(349) int local349;
		@Pc(426) int local426;
		@Pc(869) int local869;
		@Pc(526) int local526;
		for (@Pc(13) int local13 = 0; local13 < Static249.anInt4520 + local7; local13++) {
			@Pc(17) Class243 local17 = null;
			@Pc(33) Class6_Sub2_Sub1 local33;
			if (local13 >= local7) {
				local33 = Static176.aClass6_Sub2_Sub1_Sub2Array1[Static128.anIntArray171[local13 - local7]];
				local17 = ((Class6_Sub2_Sub1_Sub2) local33).aClass243_1;
				if (local17.anIntArray613 != null) {
					local17 = local17.method5337(Static155.aClass149_1);
					if (local17 == null) {
						continue;
					}
				}
			} else {
				local33 = Static171.aClass6_Sub2_Sub1_Sub1Array1[local11[local13]];
			}
			if (local33.anInt6074 >= 0 && (Static203.anInt3898 == local33.anInt6076 || local33.aByte86 == Static375.aClass6_Sub2_Sub1_Sub1_3.aByte86)) {
				Static245.method3384(arg0 >> 1, local33, arg3 >> 1, local33.method4768());
				if (Static370.anIntArray573[0] >= 0) {
					if (local33.aString56 != null && (local13 >= local7 || Static202.anInt3888 == 0 || Static202.anInt3888 == 3 || Static202.anInt3888 == 1 && Static187.method2766(((Class6_Sub2_Sub1_Sub1) local33).aString11)) && Static177.anInt3302 < Static269.anInt4786) {
						Static269.anIntArray435[Static177.anInt3302] = Static266.aClass215_8.method4976(local33.aString56) / 2;
						Static269.anIntArray432[Static177.anInt3302] = Static370.anIntArray573[0];
						Static269.anIntArray433[Static177.anInt3302] = Static370.anIntArray573[1];
						Static269.anIntArray436[Static177.anInt3302] = local33.anInt6094;
						Static269.anIntArray431[Static177.anInt3302] = local33.anInt6140;
						Static269.anIntArray434[Static177.anInt3302] = local33.anInt6133;
						Static269.aStringArray31[Static177.anInt3302] = local33.aString56;
						Static177.anInt3302++;
					}
					local177 = arg1 + Static370.anIntArray573[1];
					@Pc(252) Class3[] local252;
					@Pc(259) Class205[] local259;
					@Pc(321) Class3 local321;
					if (local33.aBoolean422 || local33.anInt6119 <= Static175.anInt3261) {
						local177 -= Math.max(Static266.aClass215_8.anInt6387, Static397.aClass3Array15[0].qa());
					} else {
						@Pc(204) byte local204 = 1;
						if (local7 <= local13) {
							local214 = local17.anInt6916;
							if (local214 == -1) {
								local214 = local33.method4762().anInt3743;
							}
						} else {
							@Pc(230) Class6_Sub2_Sub1_Sub1 local230 = Static171.aClass6_Sub2_Sub1_Sub1Array1[local11[local13]];
							local214 = local33.method4762().anInt3743;
							if (local230.aBoolean54) {
								local204 = 2;
							}
						}
						@Pc(242) Class3[] local242 = Static397.aClass3Array15;
						if (local214 != -1) {
							local252 = (Class3[]) Static213.aClass69_39.method1591((long) local214);
							if (local252 == null) {
								local259 = Static464.method4784(Static149.aClass166_105, local214);
								if (local259 != null) {
									local252 = new Class3[local259.length];
									for (local267 = 0; local267 < local259.length; local267++) {
										local252[local267] = Static16.aClass30_11.method4656(local259[local267]);
									}
									Static213.aClass69_39.method1590((long) local214, local252);
								}
							}
							if (local252 != null && local252.length >= 2) {
								local242 = local252;
							}
						}
						if (local204 >= local242.length) {
							local204 = 1;
						}
						@Pc(317) Class3 local317 = local242[0];
						local321 = local242[local204];
						local177 -= Math.max(Static266.aClass215_8.anInt6387, local317.qa());
						local267 = Static370.anIntArray573[0] + arg2 - (local317.UA() >> 1);
						local349 = local317.UA() * local33.anInt6090 / 255;
						if (local33.anInt6090 > 0 && local349 < 2) {
							local349 = 2;
						}
						local317.method5877(local267, local177);
						Static16.aClass30_11.Z(local267, local177, local349 + local267, local177 + local317.qa());
						local321.method5877(local267, local177);
						Static16.aClass30_11.pa(arg2, arg1, arg0 + arg2, arg1 - -arg3);
					}
					local177 -= 2;
					if (!local33.aBoolean422) {
						@Pc(407) Class3 local407;
						if (local33.anInt6104 > Static175.anInt3261) {
							local407 = Static332.aClass3Array11[local33.aBoolean420 ? 2 : 0];
							@Pc(416) Class3 local416 = Static332.aClass3Array11[local33.aBoolean420 ? 3 : 1];
							if (local33 instanceof Class6_Sub2_Sub1_Sub2) {
								local426 = local17.anInt6882;
								if (local426 == -1) {
									local426 = local33.method4762().anInt3731;
								}
							} else {
								local426 = local33.method4762().anInt3731;
							}
							if (local426 != -1) {
								local252 = (Class3[]) Static32.aClass69_7.method1591((long) local426);
								if (local252 == null) {
									local259 = Static464.method4784(Static149.aClass166_105, local426);
									if (local259 != null) {
										local252 = new Class3[local259.length];
										for (local267 = 0; local267 < local259.length; local267++) {
											local252[local267] = Static16.aClass30_11.method4656(local259[local267]);
										}
										Static32.aClass69_7.method1590((long) local426, local252);
									}
								}
								if (local252 != null && local252.length == 4) {
									local407 = local252[local33.aBoolean420 ? 2 : 0];
									local416 = local252[local33.aBoolean420 ? 3 : 1];
								}
							}
							@Pc(519) int local519 = local33.anInt6104 - Static175.anInt3261;
							if (local519 <= local33.anInt6093) {
								local526 = local407.UA();
							} else {
								local519 -= local33.anInt6093;
								local267 = local33.anInt6138 == 0 ? 0 : local33.anInt6138 * ((local33.anInt6096 - local519) / local33.anInt6138);
								local526 = local407.UA() * local267 / local33.anInt6096;
							}
							local267 = local407.qa();
							local177 -= local267;
							local349 = arg2 + Static370.anIntArray573[0] - (local407.UA() >> 1);
							local407.method5877(local349, local177);
							Static16.aClass30_11.Z(local349, local177, local526 + local349, local267 + local177);
							local416.method5877(local349, local177);
							local177 -= 2;
							Static16.aClass30_11.pa(arg2, arg1, arg2 + arg0, arg3 + arg1);
						}
						if (local13 < local7) {
							@Pc(620) Class6_Sub2_Sub1_Sub1 local620 = (Class6_Sub2_Sub1_Sub1) local33;
							if (local620.anInt1002 != -1) {
								local177 -= 25;
								Static171.aClass3Array8[local620.anInt1002].method5877(Static370.anIntArray573[0] + arg2 - 12, local177);
								local177 -= 2;
							}
							if (local620.anInt1001 != -1) {
								local177 -= 25;
								Static136.aClass3Array6[local620.anInt1001].method5877(arg2 + Static370.anIntArray573[0] - 12, local177);
								local177 -= 2;
							}
						} else if (local17.anInt6886 >= 0 && local17.anInt6886 < Static136.aClass3Array6.length) {
							local177 -= 25;
							local407 = Static136.aClass3Array6[local17.anInt6886];
							local407.method5877(Static370.anIntArray573[0] + arg2 - (local407.UA() >> 1), local177);
							local177 -= 2;
						}
					}
					@Pc(701) Class80[] local701;
					@Pc(709) Class80 local709;
					if (!(local33 instanceof Class6_Sub2_Sub1_Sub1)) {
						local214 = 0;
						local701 = Static118.aClass80Array1;
						for (local426 = 0; local426 < local701.length; local426++) {
							local709 = local701[local426];
							if (local709 != null && local709.anInt2470 == 1 && Static128.anIntArray171[local13 - local7] == local709.anInt2465) {
								local321 = Static39.aClass3Array2[local709.anInt2468];
								if (local214 < local321.qa()) {
									local214 = local321.qa();
								}
								if (Static175.anInt3261 % 20 < 10) {
									local321.method5877(Static370.anIntArray573[0] + arg2 - 12, -local321.qa() + local177);
								}
							}
						}
						if (local214 > 0) {
						}
					} else if (local13 >= 0) {
						local214 = 0;
						local701 = Static118.aClass80Array1;
						for (local426 = 0; local426 < local701.length; local426++) {
							local709 = local701[local426];
							if (local709 != null && local709.anInt2470 == 10 && local11[local13] == local709.anInt2465) {
								local321 = Static39.aClass3Array2[local709.anInt2468];
								if (local214 < local321.qa()) {
									local214 = local321.qa();
								}
								local321.method5877(Static370.anIntArray573[0] + arg2 - 12, -local321.qa() + local177);
							}
						}
						if (local214 > 0) {
						}
					}
					for (local214 = 0; local214 < 4; local214++) {
						if (local33.anIntArray534[local214] > Static175.anInt3261) {
							local869 = local33.method4768() / 2;
							Static245.method3384(arg0 >> 1, local33, arg3 >> 1, local869);
							if (Static370.anIntArray573[0] > -1) {
								if (local214 == 1) {
									Static370.anIntArray573[1] -= 20;
								}
								if (local214 == 2) {
									Static370.anIntArray573[0] -= 15;
									Static370.anIntArray573[1] -= 10;
								}
								if (local214 == 3) {
									Static370.anIntArray573[0] += 15;
									Static370.anIntArray573[1] -= 10;
								}
								Static402.aClass3Array4[local33.anIntArray535[local214]].method5877(arg2 + Static370.anIntArray573[0] - 12, Static370.anIntArray573[1] + -12 + arg1);
								Static162.aClass105_6.method5604(0, Integer.toString(local33.anIntArray533[local214]), -1, Static370.anIntArray573[0] + arg2 - 1, Static370.anIntArray573[1] + arg1 + 3);
							}
						}
					}
				}
			}
		}
		@Pc(1008) int local1008;
		for (@Pc(1002) int local1002 = 0; local1002 < Static260.anInt7575; local1002++) {
			local1008 = Static150.anIntArray239[local1002];
			@Pc(1015) Class6_Sub2_Sub1 local1015;
			if (local1008 < 2048) {
				local1015 = Static171.aClass6_Sub2_Sub1_Sub1Array1[local1008];
			} else {
				local1015 = Static176.aClass6_Sub2_Sub1_Sub2Array1[local1008 - 2048];
			}
			local214 = Static25.anIntArray56[local1002];
			@Pc(1038) Class6_Sub2_Sub1 local1038;
			if (local214 >= 2048) {
				local1038 = Static176.aClass6_Sub2_Sub1_Sub2Array1[local214 - 2048];
			} else {
				local1038 = Static171.aClass6_Sub2_Sub1_Sub1Array1[local214];
			}
			Static225.method3044(arg0, arg3, arg1, --local1015.anInt6123, local1015, arg2, local1038);
		}
		local1008 = Static266.aClass215_8.anInt6376 + Static266.aClass215_8.anInt6387 + 2;
		for (local177 = 0; local177 < Static177.anInt3302; local177++) {
			local214 = Static269.anIntArray432[local177];
			local869 = Static269.anIntArray433[local177];
			local426 = Static269.anIntArray435[local177];
			@Pc(1095) boolean local1095 = true;
			while (local1095) {
				local1095 = false;
				for (local526 = 0; local526 < local177; local526++) {
					if (Static269.anIntArray433[local526] - local1008 < local869 + 2 && Static269.anIntArray433[local526] + 2 > -local1008 + local869 && local214 - local426 < Static269.anIntArray432[local526] - -Static269.anIntArray435[local526] && Static269.anIntArray432[local526] - Static269.anIntArray435[local526] < local426 + local214 && local869 > Static269.anIntArray433[local526] - local1008) {
						local869 = Static269.anIntArray433[local526] - local1008;
						local1095 = true;
					}
				}
			}
			Static269.anIntArray433[local177] = local869;
			@Pc(1199) String local1199 = Static269.aStringArray31[local177];
			if (Static33.anInt796 == 0) {
				local267 = 16776960;
				if (Static269.anIntArray436[local177] < 6) {
					local267 = Static124.anIntArray167[Static269.anIntArray436[local177]];
				}
				if (Static269.anIntArray436[local177] == 6) {
					local267 = Static203.anInt3898 % 20 < 10 ? 16711680 : 16776960;
				}
				if (Static269.anIntArray436[local177] == 7) {
					local267 = Static203.anInt3898 % 20 >= 10 ? 65535 : 255;
				}
				if (Static269.anIntArray436[local177] == 8) {
					local267 = Static203.anInt3898 % 20 >= 10 ? 8454016 : 45056;
				}
				if (Static269.anIntArray436[local177] == 9) {
					local349 = 150 - Static269.anIntArray434[local177];
					if (local349 < 50) {
						local267 = local349 * 1280 + 16711680;
					} else if (local349 < 100) {
						local267 = 16776960 + 16384000 - local349 * 327680;
					} else if (local349 < 150) {
						local267 = (local349 - 100) * 5 + 65280;
					}
				}
				if (Static269.anIntArray436[local177] == 10) {
					local349 = 150 - Static269.anIntArray434[local177];
					if (local349 < 50) {
						local267 = local349 * 5 + 16711680;
					} else if (local349 < 100) {
						local267 = 16711935 - (local349 - 50) * 327680;
					} else if (local349 < 150) {
						local267 = (local349 + -100) * 327680 + 500 + 255 - local349 * 5;
					}
				}
				if (Static269.anIntArray436[local177] == 11) {
					local349 = 150 - Static269.anIntArray434[local177];
					if (local349 < 50) {
						local267 = 16777215 - local349 * 327685;
					} else if (local349 < 100) {
						local267 = local349 * 327685 + 65280 - 16384250;
					} else if (local349 < 150) {
						local267 = 32768000 + 16777215 - local349 * 327680;
					}
				}
				local349 = local267 | 0xFF000000;
				if (Static269.anIntArray431[local177] == 0) {
					Static245.aClass105_4.method5604(-16777216, local1199, local349, arg2 + local214, local869 + arg1);
				}
				if (Static269.anIntArray431[local177] == 1) {
					Static245.aClass105_4.method5603(Static203.anInt3898, local349, local214 + arg2, local1199, arg1 + local869);
				}
				if (Static269.anIntArray431[local177] == 2) {
					Static245.aClass105_4.method5615(Static203.anInt3898, local1199, local349, local214 + arg2, local869 + arg1);
				}
				if (Static269.anIntArray431[local177] == 3) {
					Static245.aClass105_4.method5618(local349, arg2 + local214, -Static269.anIntArray434[local177] + 150, local1199, Static203.anInt3898, local869 + arg1);
				}
				@Pc(1549) int local1549;
				if (Static269.anIntArray431[local177] == 4) {
					local1549 = (150 - Static269.anIntArray434[local177]) * (Static266.aClass215_8.method4976(local1199) + 100) / 150;
					Static16.aClass30_11.Z(local214 + arg2 - 50, arg1, arg2 + local214 + 50, arg3 + arg1);
					Static245.aClass105_4.method5600(local1199, local349, local214 + arg2 + 50 - local1549, -16777216, local869 + arg1);
					Static16.aClass30_11.pa(arg2, arg1, arg2 + arg0, arg3 + arg1);
				}
				if (Static269.anIntArray431[local177] == 5) {
					local1549 = 150 - Static269.anIntArray434[local177];
					@Pc(1609) int local1609 = 0;
					if (local1549 < 25) {
						local1609 = local1549 - 25;
					} else if (local1549 > 125) {
						local1609 = local1549 - 125;
					}
					@Pc(1634) int local1634 = Static266.aClass215_8.anInt6387 + Static266.aClass215_8.anInt6376;
					Static16.aClass30_11.Z(arg2, arg1 + local869 - local1634 - 1, arg0 + arg2, arg1 + local869 + 5);
					Static245.aClass105_4.method5604(-16777216, local1199, local349, local214 + arg2, local869 + arg1 - -local1609);
					Static16.aClass30_11.pa(arg2, arg1, arg2 + arg0, arg1 + arg3);
				}
			} else {
				Static245.aClass105_4.method5604(-16777216, local1199, -256, local214 + arg2, arg1 + local869);
			}
		}
	}
}
