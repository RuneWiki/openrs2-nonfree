import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static345 {

	@OriginalMember(owner = "client!rg", name = "g", descriptor = "Lclient!o;")
	public static Class183 aClass183_1;

	@OriginalMember(owner = "client!rg", name = "j", descriptor = "I")
	public static int anInt5779;

	@OriginalMember(owner = "client!rg", name = "l", descriptor = "Lclient!ke;")
	public static final Class137 aClass137_29 = new Class137(512);

	@OriginalMember(owner = "client!rg", name = "m", descriptor = "[I")
	public static final int[] anIntArray507 = new int[1024];

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIIIII)V")
	public static void method4850(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		@Pc(7) int local7 = Static416.anInt4773;
		@Pc(9) int[] local9 = Static5.anIntArray3;
		Static16.anInt284 = 0;
		@Pc(188) int local188;
		@Pc(213) int local213;
		@Pc(267) int local267;
		@Pc(345) int local345;
		@Pc(435) int local435;
		@Pc(874) int local874;
		@Pc(538) int local538;
		for (@Pc(13) int local13 = 0; local13 < local7 + Static147.anInt7038; local13++) {
			@Pc(17) Class17 local17 = null;
			@Pc(33) Class3_Sub3_Sub6 local33;
			if (local7 <= local13) {
				local33 = Static450.aClass3_Sub3_Sub6_Sub2Array1[anIntArray507[local13 - local7]];
				local17 = ((Class3_Sub3_Sub6_Sub2) local33).aClass17_1;
				if (local17.anIntArray26 != null) {
					local17 = local17.method288(Static71.aClass126_1);
					if (local17 == null) {
						continue;
					}
				}
			} else {
				local33 = Static355.aClass3_Sub3_Sub6_Sub1Array1[local9[local13]];
			}
			if (local33.anInt6693 >= 0 && (Static75.anInt1503 == local33.anInt6696 || local33.aByte93 == Static134.aClass3_Sub3_Sub6_Sub1_1.aByte93)) {
				Static291.method5978(arg2 >> 1, local33.method5519(), arg3 >> 1, local33);
				if (Static363.anIntArray538[0] >= 0) {
					if (local33.aString63 != null && (local13 >= local7 || Static56.anInt1177 == 0 || Static56.anInt1177 == 3 || Static56.anInt1177 == 1 && Static364.method5130(((Class3_Sub3_Sub6_Sub1) local33).aString48)) && Static16.anInt284 < Static293.anInt4887) {
						Static293.anIntArray444[Static16.anInt284] = Static252.aClass201_5.method4452(local33.aString63) / 2;
						Static293.anIntArray442[Static16.anInt284] = Static363.anIntArray538[0];
						Static293.anIntArray445[Static16.anInt284] = Static363.anIntArray538[1];
						Static293.anIntArray446[Static16.anInt284] = local33.anInt6701;
						Static293.anIntArray441[Static16.anInt284] = local33.anInt6750;
						Static293.anIntArray443[Static16.anInt284] = local33.anInt6721;
						Static293.aStringArray35[Static16.anInt284] = local33.aString63;
						Static16.anInt284++;
					}
					local188 = arg1 + Static363.anIntArray538[1];
					@Pc(252) Class12[] local252;
					@Pc(259) Class77[] local259;
					@Pc(317) Class12 local317;
					if (local33.aBoolean451 || local33.anInt6746 <= Static125.anInt2225) {
						local188 -= Math.max(Static252.aClass201_5.anInt5071, Static63.aClass12Array5[0].method5664());
					} else {
						@Pc(203) byte local203 = 1;
						if (local13 >= local7) {
							local213 = local17.anInt365;
							if (local213 == -1) {
								local213 = local33.method5511().anInt5572;
							}
						} else {
							@Pc(229) Class3_Sub3_Sub6_Sub1 local229 = Static355.aClass3_Sub3_Sub6_Sub1Array1[local9[local13]];
							local213 = local33.method5511().anInt5572;
							if (local229.aBoolean377) {
								local203 = 2;
							}
						}
						@Pc(241) Class12[] local241 = Static63.aClass12Array5;
						if (local213 != -1) {
							local252 = (Class12[]) Static403.aClass220_53.method4990((long) local213);
							if (local252 == null) {
								local259 = Static455.method1708(Static76.aClass158_17, local213);
								if (local259 != null) {
									local252 = new Class12[local259.length];
									for (local267 = 0; local267 < local259.length; local267++) {
										local252[local267] = Static44.aClass28_14.method3540(local259[local267]);
									}
									Static403.aClass220_53.method4996(local252, (long) local213);
								}
							}
							if (local252 != null && local252.length >= 2) {
								local241 = local252;
							}
						}
						if (local203 >= local241.length) {
							local203 = 1;
						}
						@Pc(313) Class12 local313 = local241[0];
						local317 = local241[local203];
						local188 -= Math.max(Static252.aClass201_5.anInt5071, local313.method5664());
						local267 = arg0 + Static363.anIntArray538[0] - (local313.method5672() >> 1);
						local345 = local313.method5672() * local33.anInt6714 / 255;
						if (local33.anInt6714 > 0 && local345 < 2) {
							local345 = 2;
						}
						local313.method5665(local267, local188);
						Static44.aClass28_14.method3536(local267, local188, local267 + local345, local188 - -local313.method5664());
						local317.method5665(local267, local188);
						Static44.aClass28_14.method3570(arg0, arg1, arg3 + arg0, arg2 + arg1);
					}
					local188 -= 2;
					if (!local33.aBoolean451) {
						@Pc(416) Class12 local416;
						if (Static125.anInt2225 < local33.anInt6689) {
							local416 = Static62.aClass12Array4[local33.aBoolean454 ? 2 : 0];
							@Pc(425) Class12 local425 = Static62.aClass12Array4[local33.aBoolean454 ? 3 : 1];
							if (local33 instanceof Class3_Sub3_Sub6_Sub2) {
								local435 = local17.anInt357;
								if (local435 == -1) {
									local435 = local33.method5511().anInt5565;
								}
							} else {
								local435 = local33.method5511().anInt5565;
							}
							if (local435 != -1) {
								local252 = (Class12[]) Static117.aClass220_14.method4990((long) local435);
								if (local252 == null) {
									local259 = Static455.method1708(Static76.aClass158_17, local435);
									if (local259 != null) {
										local252 = new Class12[local259.length];
										for (local267 = 0; local267 < local259.length; local267++) {
											local252[local267] = Static44.aClass28_14.method3540(local259[local267]);
										}
										Static117.aClass220_14.method4996(local252, (long) local435);
									}
								}
								if (local252 != null && local252.length == 4) {
									local416 = local252[local33.aBoolean454 ? 2 : 0];
									local425 = local252[local33.aBoolean454 ? 3 : 1];
								}
							}
							@Pc(527) int local527 = local33.anInt6689 - Static125.anInt2225;
							if (local527 <= local33.anInt6682) {
								local538 = local416.method5672();
							} else {
								local527 -= local33.anInt6682;
								local267 = local33.anInt6720 == 0 ? 0 : (local33.anInt6711 - local527) / local33.anInt6720 * local33.anInt6720;
								local538 = local267 * local416.method5672() / local33.anInt6711;
							}
							local267 = local416.method5664();
							local188 -= local267;
							local345 = Static363.anIntArray538[0] + arg0 - (local416.method5672() >> 1);
							local416.method5665(local345, local188);
							Static44.aClass28_14.method3536(local345, local188, local345 + local538, local267 + local188);
							local425.method5665(local345, local188);
							Static44.aClass28_14.method3570(arg0, arg1, arg3 + arg0, arg2 + arg1);
							local188 -= 2;
						}
						if (local7 > local13) {
							@Pc(663) Class3_Sub3_Sub6_Sub1 local663 = (Class3_Sub3_Sub6_Sub1) local33;
							if (local663.anInt5514 != -1) {
								local188 -= 25;
								Static396.aClass12Array18[local663.anInt5514].method5665(arg0 + Static363.anIntArray538[0] - 12, local188);
								local188 -= 2;
							}
							if (local663.anInt5532 != -1) {
								local188 -= 25;
								Static260.aClass12Array14[local663.anInt5532].method5665(Static363.anIntArray538[0] + arg0 - 12, local188);
								local188 -= 2;
							}
						} else if (local17.anInt364 >= 0 && local17.anInt364 < Static260.aClass12Array14.length) {
							local188 -= 25;
							local416 = Static260.aClass12Array14[local17.anInt364];
							local416.method5665(Static363.anIntArray538[0] + arg0 - (local416.method5672() >> 1), local188);
							local188 -= 2;
						}
					}
					@Pc(708) Class107[] local708;
					@Pc(716) Class107 local716;
					if (!(local33 instanceof Class3_Sub3_Sub6_Sub1)) {
						local213 = 0;
						local708 = Static190.aClass107Array1;
						for (local435 = 0; local435 < local708.length; local435++) {
							local716 = local708[local435];
							if (local716 != null && local716.anInt2681 == 1 && anIntArray507[local13 - local7] == local716.anInt2683) {
								local317 = Static252.aClass12Array13[local716.anInt2690];
								if (local317.method5664() > local213) {
									local213 = local317.method5664();
								}
								if (Static125.anInt2225 % 20 < 10) {
									local317.method5665(arg0 + Static363.anIntArray538[0] - 12, local188 - local317.method5664());
								}
							}
						}
						if (local213 > 0) {
						}
					} else if (local13 >= 0) {
						local213 = 0;
						local708 = Static190.aClass107Array1;
						for (local435 = 0; local435 < local708.length; local435++) {
							local716 = local708[local435];
							if (local716 != null && local716.anInt2681 == 10 && local716.anInt2683 == local9[local13]) {
								local317 = Static252.aClass12Array13[local716.anInt2690];
								if (local317.method5664() > local213) {
									local213 = local317.method5664();
								}
								local317.method5665(arg0 + Static363.anIntArray538[0] - 12, -local317.method5664() + local188);
							}
						}
						if (local213 > 0) {
						}
					}
					for (local213 = 0; local213 < 4; local213++) {
						if (Static125.anInt2225 < local33.anIntArray579[local213]) {
							local874 = local33.method5519() / 2;
							Static291.method5978(arg2 >> 1, local874, arg3 >> 1, local33);
							if (Static363.anIntArray538[0] > -1) {
								if (local213 == 1) {
									Static363.anIntArray538[1] -= 20;
								}
								if (local213 == 2) {
									Static363.anIntArray538[1] -= 10;
									Static363.anIntArray538[0] -= 15;
								}
								if (local213 == 3) {
									Static363.anIntArray538[0] += 15;
									Static363.anIntArray538[1] -= 10;
								}
								Static63.aClass12Array6[local33.anIntArray580[local213]].method5665(Static363.anIntArray538[0] + arg0 - 12, arg1 + -12 + Static363.anIntArray538[1]);
								Static120.aClass92_3.method5633(arg0 + Static363.anIntArray538[0] - 1, arg1 - (-Static363.anIntArray538[1] - 3), -1, 0, Integer.toString(local33.anIntArray581[local213]));
							}
						}
					}
				}
			}
		}
		@Pc(1007) int local1007;
		for (@Pc(1001) int local1001 = 0; local1001 < Static42.anInt910; local1001++) {
			local1007 = Static160.anIntArray265[local1001];
			@Pc(1016) Class3_Sub3_Sub6 local1016;
			if (local1007 < 2048) {
				local1016 = Static355.aClass3_Sub3_Sub6_Sub1Array1[local1007];
			} else {
				local1016 = Static450.aClass3_Sub3_Sub6_Sub2Array1[local1007 - 2048];
			}
			local213 = Static179.anIntArray288[local1001];
			@Pc(1039) Class3_Sub3_Sub6 local1039;
			if (local213 >= 2048) {
				local1039 = Static450.aClass3_Sub3_Sub6_Sub2Array1[local213 - 2048];
			} else {
				local1039 = Static355.aClass3_Sub3_Sub6_Sub1Array1[local213];
			}
			Static88.method1551(arg1, local1016, local1039, arg2, arg0, --local1016.anInt6687, arg3);
		}
		local1007 = Static252.aClass201_5.anInt5071 + Static252.aClass201_5.anInt5070 + 2;
		for (local188 = 0; local188 < Static16.anInt284; local188++) {
			local213 = Static293.anIntArray442[local188];
			local874 = Static293.anIntArray445[local188];
			local435 = Static293.anIntArray444[local188];
			@Pc(1097) boolean local1097 = true;
			while (local1097) {
				local1097 = false;
				for (local538 = 0; local538 < local188; local538++) {
					if (local874 + 2 > -local1007 + Static293.anIntArray445[local538] && Static293.anIntArray445[local538] + 2 > -local1007 + local874 && Static293.anIntArray442[local538] + Static293.anIntArray444[local538] > local213 - local435 && local213 + local435 > Static293.anIntArray442[local538] - Static293.anIntArray444[local538] && local874 > Static293.anIntArray445[local538] - local1007) {
						local1097 = true;
						local874 = Static293.anIntArray445[local538] - local1007;
					}
				}
			}
			Static293.anIntArray445[local188] = local874;
			@Pc(1187) String local1187 = Static293.aStringArray35[local188];
			if (Static23.anInt415 == 0) {
				local267 = 16776960;
				if (Static293.anIntArray446[local188] < 6) {
					local267 = Static361.anIntArray535[Static293.anIntArray446[local188]];
				}
				if (Static293.anIntArray446[local188] == 6) {
					local267 = Static75.anInt1503 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static293.anIntArray446[local188] == 7) {
					local267 = Static75.anInt1503 % 20 >= 10 ? 65535 : 255;
				}
				if (Static293.anIntArray446[local188] == 8) {
					local267 = Static75.anInt1503 % 20 >= 10 ? 8454016 : 45056;
				}
				if (Static293.anIntArray446[local188] == 9) {
					local345 = 150 - Static293.anIntArray443[local188];
					if (local345 < 50) {
						local267 = local345 * 1280 + 16711680;
					} else if (local345 < 100) {
						local267 = 16776960 - (local345 - 50) * 327680;
					} else if (local345 < 150) {
						local267 = (local345 - 100) * 5 + 65280;
					}
				}
				if (Static293.anIntArray446[local188] == 10) {
					local345 = 150 - Static293.anIntArray443[local188];
					if (local345 < 50) {
						local267 = local345 * 5 + 16711680;
					} else if (local345 < 100) {
						local267 = 16384000 + 16711935 - local345 * 327680;
					} else if (local345 < 150) {
						local267 = local345 * 327680 + 255 - (local345 - 100) * 5 - 32768000;
					}
				}
				if (Static293.anIntArray446[local188] == 11) {
					local345 = 150 - Static293.anIntArray443[local188];
					if (local345 < 50) {
						local267 = 16777215 - local345 * 327685;
					} else if (local345 < 100) {
						local267 = (local345 - 50) * 327685 + 65280;
					} else if (local345 < 150) {
						local267 = 32768000 + 16777215 - local345 * 327680;
					}
				}
				local345 = local267 | 0xFF000000;
				if (Static293.anIntArray441[local188] == 0) {
					Static45.aClass92_1.method5633(local213 + arg0, local874 + arg1, local345, -16777216, local1187);
				}
				if (Static293.anIntArray441[local188] == 1) {
					Static45.aClass92_1.method5628(local345, arg1 + local874, local213 + arg0, Static75.anInt1503, local1187);
				}
				if (Static293.anIntArray441[local188] == 2) {
					Static45.aClass92_1.method5645(local1187, Static75.anInt1503, local345, local213 + arg0, local874 + arg1);
				}
				if (Static293.anIntArray441[local188] == 3) {
					Static45.aClass92_1.method5646(local345, local1187, Static75.anInt1503, arg0 + local213, arg1 + local874, 150 - Static293.anIntArray443[local188]);
				}
				@Pc(1527) int local1527;
				if (Static293.anIntArray441[local188] == 4) {
					local1527 = (150 - Static293.anIntArray443[local188]) * (Static252.aClass201_5.method4452(local1187) - -100) / 150;
					Static44.aClass28_14.method3536(local213 + arg0 - 50, arg1, arg0 + local213 + 50, arg1 - -arg2);
					Static45.aClass92_1.method5638(local345, local874 + arg1, -local1527 + 50 + local213 + arg0, local1187, -16777216);
					Static44.aClass28_14.method3570(arg0, arg1, arg0 + arg3, arg1 - -arg2);
				}
				if (Static293.anIntArray441[local188] == 5) {
					local1527 = 150 - Static293.anIntArray443[local188];
					@Pc(1587) int local1587 = 0;
					if (local1527 < 25) {
						local1587 = local1527 - 25;
					} else if (local1527 > 125) {
						local1587 = local1527 - 125;
					}
					@Pc(1609) int local1609 = Static252.aClass201_5.anInt5070 + Static252.aClass201_5.anInt5071;
					Static44.aClass28_14.method3536(arg0, arg1 + local874 - local1609 - 1, arg0 - -arg3, local874 + arg1 + 5);
					Static45.aClass92_1.method5633(local213 + arg0, local1587 + arg1 + local874, local345, -16777216, local1187);
					Static44.aClass28_14.method3570(arg0, arg1, arg3 + arg0, arg1 - -arg2);
				}
			} else {
				Static45.aClass92_1.method5633(arg0 + local213, local874 + arg1, -256, -16777216, local1187);
			}
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIIIZ)V")
	public static void method4853(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(13) int local13 = arg0 * arg0;
		@Pc(17) int local17 = arg3 * arg3;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg3 << 1;
		@Pc(39) int local39 = (1 - local29) * local13 + local21;
		@Pc(47) int local47 = local17 - (local29 - 1) * local25;
		@Pc(51) int local51 = local13 << 2;
		@Pc(55) int local55 = local17 << 2;
		@Pc(63) int local63 = local21 * 3;
		@Pc(82) int local82 = ((arg3 << 1) - 3) * local25;
		@Pc(88) int local88 = local55;
		Static73.method1404(Static347.anIntArrayArray54[arg4], arg1 + arg0, arg2, arg1 - arg0);
		@Pc(107) int local107 = local51 * (arg3 - 1);
		while (local9 > 0) {
			if (local39 < 0) {
				while (local39 < 0) {
					local47 += local88;
					local39 += local63;
					local63 += local55;
					local7++;
					local88 += local55;
				}
			}
			if (local47 < 0) {
				local47 += local88;
				local39 += local63;
				local7++;
				local88 += local55;
				local63 += local55;
			}
			local39 += -local107;
			local47 += -local82;
			local107 -= local51;
			local82 -= local51;
			local9--;
			@Pc(181) int local181 = arg4 - local9;
			@Pc(185) int local185 = local9 + arg4;
			@Pc(189) int local189 = arg1 + local7;
			@Pc(194) int local194 = arg1 - local7;
			Static73.method1404(Static347.anIntArrayArray54[local181], local189, arg2, local194);
			Static73.method1404(Static347.anIntArrayArray54[local185], local189, arg2, local194);
		}
	}
}
