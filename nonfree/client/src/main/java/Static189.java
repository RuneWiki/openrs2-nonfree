import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!jm", name = "n", descriptor = "I")
	public static int anInt3810 = 0;

	@OriginalMember(owner = "client!jm", name = "q", descriptor = "Lclient!qt;")
	public static final Class212 aClass212_53 = new Class212(25, 8);

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIIIIII)V")
	public static void method3417(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		@Pc(7) int local7 = Static402.anInt7091;
		Static447.anInt7664 = 0;
		@Pc(11) int[] local11 = Static144.anIntArray244;
		@Pc(178) int local178;
		@Pc(219) int local219;
		@Pc(264) int local264;
		@Pc(339) int local339;
		@Pc(415) int local415;
		@Pc(853) int local853;
		@Pc(520) int local520;
		for (@Pc(18) int local18 = 0; local18 < Static77.anInt1870 + local7; local18++) {
			@Pc(22) Class241 local22 = null;
			@Pc(38) Class11_Sub5_Sub2 local38;
			if (local7 <= local18) {
				local38 = ((Class4_Sub44) Static80.aClass96_8.method2797((long) Static2.anIntArray1[local18 - local7])).aClass11_Sub5_Sub2_Sub2_2;
				local22 = ((Class11_Sub5_Sub2_Sub2) local38).aClass241_1;
				if (local22.anIntArray565 != null) {
					local22 = local22.method5593(Static67.aClass224_1);
					if (local22 == null) {
						continue;
					}
				}
			} else {
				local38 = Static39.aClass11_Sub5_Sub2_Sub1Array1[local11[local18]];
			}
			if (local38.anInt6514 >= 0 && (Static213.anInt4343 == local38.anInt6473 || Static52.aClass11_Sub5_Sub2_Sub1_2.aByte100 == local38.aByte100)) {
				Static342.method4990(arg3 >> 1, local38, local38.method5307(), arg1 >> 1);
				if (Static402.anIntArray573[0] >= 0) {
					if (local38.aString56 != null && (local7 <= local18 || Static263.anInt5013 == 0 || Static263.anInt5013 == 3 || Static263.anInt5013 == 1 && Static151.method2801(((Class11_Sub5_Sub2_Sub1) local38).aString31)) && Static26.anInt471 > Static447.anInt7664) {
						Static26.anIntArray34[Static447.anInt7664] = Static296.aClass84_10.method2381(local38.aString56) / 2;
						Static26.anIntArray31[Static447.anInt7664] = Static402.anIntArray573[0];
						Static26.anIntArray33[Static447.anInt7664] = Static402.anIntArray573[1];
						Static26.anIntArray35[Static447.anInt7664] = local38.anInt6485;
						Static26.anIntArray36[Static447.anInt7664] = local38.anInt6537;
						Static26.anIntArray32[Static447.anInt7664] = local38.anInt6531;
						Static26.aStringArray3[Static447.anInt7664] = local38.aString56;
						Static447.anInt7664++;
					}
					local178 = Static402.anIntArray573[1] + arg2;
					@Pc(249) Class2[] local249;
					@Pc(256) Class98[] local256;
					@Pc(312) Class2 local312;
					if (local38.aBoolean477 || local38.anInt6542 <= Static277.anInt2834) {
						local178 -= Math.max(Static296.aClass84_10.anInt2628, Static416.aClass2Array44[0].V());
					} else {
						@Pc(201) byte local201 = 1;
						if (local18 < local7) {
							@Pc(214) Class11_Sub5_Sub2_Sub1 local214 = Static39.aClass11_Sub5_Sub2_Sub1Array1[local11[local18]];
							local219 = local38.method5306().anInt6405;
							if (local214.aBoolean262) {
								local201 = 2;
							}
						} else {
							local219 = local22.anInt7004;
							if (local219 == -1) {
								local219 = local38.method5306().anInt6405;
							}
						}
						@Pc(239) Class2[] local239 = Static416.aClass2Array44;
						if (local219 != -1) {
							local249 = (Class2[]) Static285.aClass83_34.method2338((long) local219);
							if (local249 == null) {
								local256 = Static472.method2843(Static143.aClass38_30, local219);
								if (local256 != null) {
									local249 = new Class2[local256.length];
									for (local264 = 0; local264 < local256.length; local264++) {
										local249[local264] = Static30.aClass30_3.method2031(local256[local264]);
									}
									Static285.aClass83_34.method2337(local249, (long) local219);
								}
							}
							if (local249 != null && local249.length >= 2) {
								local239 = local249;
							}
						}
						if (local201 >= local239.length) {
							local201 = 1;
						}
						@Pc(308) Class2 local308 = local239[0];
						local312 = local239[local201];
						local178 -= Math.max(Static296.aClass84_10.anInt2628, local308.V());
						local264 = arg0 + Static402.anIntArray573[0] - (local308.TA() >> 1);
						local339 = local308.TA() * local38.anInt6477 / 255;
						if (local38.anInt6477 > 0 && local339 < 2) {
							local339 = 2;
						}
						local308.method5921(local264, local178);
						Static30.aClass30_3.IA(local264, local178, local264 + local339, local308.V() + local178);
						local312.method5921(local264, local178);
						Static30.aClass30_3.w(arg0, arg2, arg0 + arg1, arg2 + arg3);
					}
					local178 -= 2;
					if (!local38.aBoolean477) {
						@Pc(398) Class2 local398;
						if (local38.anInt6535 > Static277.anInt2834) {
							local398 = Static366.aClass2Array40[local38.aBoolean476 ? 2 : 0];
							@Pc(407) Class2 local407 = Static366.aClass2Array40[local38.aBoolean476 ? 3 : 1];
							if (local38 instanceof Class11_Sub5_Sub2_Sub2) {
								local415 = local22.anInt7028;
								if (local415 == -1) {
									local415 = local38.method5306().anInt6399;
								}
							} else {
								local415 = local38.method5306().anInt6399;
							}
							if (local415 != -1) {
								local249 = (Class2[]) Static274.aClass83_32.method2338((long) local415);
								if (local249 == null) {
									local256 = Static472.method2843(Static143.aClass38_30, local415);
									if (local256 != null) {
										local249 = new Class2[local256.length];
										for (local264 = 0; local264 < local256.length; local264++) {
											local249[local264] = Static30.aClass30_3.method2031(local256[local264]);
										}
										Static274.aClass83_32.method2337(local249, (long) local415);
									}
								}
								if (local249 != null && local249.length == 4) {
									local407 = local249[local38.aBoolean476 ? 3 : 1];
									local398 = local249[local38.aBoolean476 ? 2 : 0];
								}
							}
							@Pc(513) int local513 = local38.anInt6535 - Static277.anInt2834;
							if (local38.anInt6519 >= local513) {
								local520 = local398.TA();
							} else {
								local513 -= local38.anInt6519;
								local264 = local38.anInt6498 == 0 ? 0 : local38.anInt6498 * ((local38.anInt6529 - local513) / local38.anInt6498);
								local520 = local264 * local398.TA() / local38.anInt6529;
							}
							local264 = local398.V();
							local178 -= local264;
							local339 = arg0 + Static402.anIntArray573[0] - (local398.TA() >> 1);
							local398.method5921(local339, local178);
							Static30.aClass30_3.IA(local339, local178, local520 + local339, local264 + local178);
							local407.method5921(local339, local178);
							Static30.aClass30_3.w(arg0, arg2, arg0 + arg1, arg3 + arg2);
							local178 -= 2;
						}
						if (local18 < local7) {
							@Pc(641) Class11_Sub5_Sub2_Sub1 local641 = (Class11_Sub5_Sub2_Sub1) local38;
							if (local641.anInt4163 != -1) {
								local178 -= 25;
								Static433.aClass2Array12[local641.anInt4163].method5921(Static402.anIntArray573[0] + arg0 - 12, local178);
								local178 -= 2;
							}
							if (local641.anInt4193 != -1) {
								local178 -= 25;
								Static42.aClass2Array9[local641.anInt4193].method5921(arg0 + Static402.anIntArray573[0] - 12, local178);
								local178 -= 2;
							}
						} else if (local22.anInt6997 >= 0 && local22.anInt6997 < Static42.aClass2Array9.length) {
							local398 = Static42.aClass2Array9[local22.anInt6997];
							local178 -= 25;
							local398.method5921(arg0 + Static402.anIntArray573[0] - (local398.TA() >> 1), local178);
							local178 -= 2;
						}
					}
					@Pc(689) Class51[] local689;
					@Pc(697) Class51 local697;
					if (!(local38 instanceof Class11_Sub5_Sub2_Sub1)) {
						local219 = 0;
						local689 = Static209.aClass51Array1;
						for (local415 = 0; local415 < local689.length; local415++) {
							local697 = local689[local415];
							if (local697 != null && local697.anInt1749 == 1 && Static2.anIntArray1[local18 - local7] == local697.anInt1740) {
								local312 = Static355.aClass2Array37[local697.anInt1744];
								if (local312.V() > local219) {
									local219 = local312.V();
								}
								if (Static277.anInt2834 % 20 < 10) {
									local312.method5921(arg0 + Static402.anIntArray573[0] - 12, local178 - local312.V());
								}
							}
						}
						if (local219 > 0) {
						}
					} else if (local18 >= 0) {
						local219 = 0;
						local689 = Static209.aClass51Array1;
						for (local415 = 0; local415 < local689.length; local415++) {
							local697 = local689[local415];
							if (local697 != null && local697.anInt1749 == 10 && local697.anInt1740 == local11[local18]) {
								local312 = Static355.aClass2Array37[local697.anInt1744];
								if (local219 < local312.V()) {
									local219 = local312.V();
								}
								local312.method5921(Static402.anIntArray573[0] + arg0 - 12, -local312.V() + local178);
							}
						}
						if (local219 > 0) {
						}
					}
					for (local219 = 0; local219 < 4; local219++) {
						if (Static277.anInt2834 < local38.anIntArray522[local219]) {
							local853 = local38.method5307() / 2;
							Static342.method4990(arg3 >> 1, local38, local853, arg1 >> 1);
							if (Static402.anIntArray573[0] > -1) {
								local415 = Static46.aClass2Array10[local38.anIntArray521[local219]].TA();
								if (local219 == 1) {
									Static402.anIntArray573[1] -= 20;
								}
								if (local219 == 2) {
									Static402.anIntArray573[0] -= local415 - 9;
									Static402.anIntArray573[1] -= 10;
								}
								if (local219 == 3) {
									Static402.anIntArray573[1] -= 10;
									Static402.anIntArray573[0] += local415 - 9;
								}
								Static46.aClass2Array10[local38.anIntArray521[local219]].method5921(arg0 + Static402.anIntArray573[0] - (local415 >> 1), arg2 - (-Static402.anIntArray573[1] + 12));
								Static142.aClass18_1.method5772(-1, Static402.anIntArray573[0] + arg0 - 1, arg2 - -Static402.anIntArray573[1] - -3, Integer.toString(local38.anIntArray520[local219]), 0);
							}
						}
					}
				}
			}
		}
		@Pc(1004) int local1004;
		for (@Pc(998) int local998 = 0; local998 < Static382.anInt3956; local998++) {
			local1004 = Static300.anIntArray452[local998];
			@Pc(1013) Class11_Sub5_Sub2 local1013;
			if (local1004 < 2048) {
				local1013 = Static39.aClass11_Sub5_Sub2_Sub1Array1[local1004];
			} else {
				local1013 = ((Class4_Sub44) Static80.aClass96_8.method2797((long) (local1004 - 2048))).aClass11_Sub5_Sub2_Sub2_2;
			}
			local219 = Static183.anIntArray290[local998];
			@Pc(1038) Class11_Sub5_Sub2 local1038;
			if (local219 < 2048) {
				local1038 = Static39.aClass11_Sub5_Sub2_Sub1Array1[local219];
			} else {
				local1038 = ((Class4_Sub44) Static80.aClass96_8.method2797((long) (local219 - 2048))).aClass11_Sub5_Sub2_Sub2_2;
			}
			Static50.method1134(arg2, arg1, --local1013.anInt6546, arg0, local1038, arg3, local1013);
		}
		local1004 = Static296.aClass84_10.anInt2628 + Static296.aClass84_10.anInt2634 + 2;
		for (local178 = 0; local178 < Static447.anInt7664; local178++) {
			local219 = Static26.anIntArray31[local178];
			local853 = Static26.anIntArray33[local178];
			local415 = Static26.anIntArray34[local178];
			@Pc(1101) boolean local1101 = true;
			while (local1101) {
				local1101 = false;
				for (local520 = 0; local520 < local178; local520++) {
					if (Static26.anIntArray33[local520] - local1004 < local853 + 2 && Static26.anIntArray33[local520] + 2 > local853 - local1004 && local219 - local415 < Static26.anIntArray34[local520] + Static26.anIntArray31[local520] && local219 + local415 > -Static26.anIntArray34[local520] + Static26.anIntArray31[local520] && Static26.anIntArray33[local520] - local1004 < local853) {
						local853 = Static26.anIntArray33[local520] - local1004;
						local1101 = true;
					}
				}
			}
			Static26.anIntArray33[local178] = local853;
			@Pc(1198) String local1198 = Static26.aStringArray3[local178];
			if (Static84.anInt7964 == 0) {
				local264 = 16776960;
				if (Static26.anIntArray35[local178] < 6) {
					local264 = Static24.anIntArray26[Static26.anIntArray35[local178]];
				}
				if (Static26.anIntArray35[local178] == 6) {
					local264 = Static213.anInt4343 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static26.anIntArray35[local178] == 7) {
					local264 = Static213.anInt4343 % 20 >= 10 ? 65535 : 255;
				}
				if (Static26.anIntArray35[local178] == 8) {
					local264 = Static213.anInt4343 % 20 >= 10 ? 8454016 : 45056;
				}
				if (Static26.anIntArray35[local178] == 9) {
					local339 = 150 - Static26.anIntArray32[local178];
					if (local339 < 50) {
						local264 = local339 * 1280 + 16711680;
					} else if (local339 < 100) {
						local264 = 16776960 - (local339 - 50) * 327680;
					} else if (local339 < 150) {
						local264 = local339 * 5 + 65280 - 500;
					}
				}
				if (Static26.anIntArray35[local178] == 10) {
					local339 = 150 - Static26.anIntArray32[local178];
					if (local339 < 50) {
						local264 = local339 * 5 + 16711680;
					} else if (local339 < 100) {
						local264 = 16711935 - (local339 - 50) * 327680;
					} else if (local339 < 150) {
						local264 = (local339 - 100) * 327680 + 500 + 255 - local339 * 5;
					}
				}
				if (Static26.anIntArray35[local178] == 11) {
					local339 = 150 - Static26.anIntArray32[local178];
					if (local339 < 50) {
						local264 = 16777215 - local339 * 327685;
					} else if (local339 < 100) {
						local264 = local339 * 327685 + 65280 - 16384250;
					} else if (local339 < 150) {
						local264 = 16777215 + 32768000 - local339 * 327680;
					}
				}
				local339 = local264 | 0xFF000000;
				if (Static26.anIntArray36[local178] == 0) {
					Static247.aClass18_2.method5772(local339, arg0 + local219, arg2 + local853, local1198, -16777216);
				}
				if (Static26.anIntArray36[local178] == 1) {
					Static247.aClass18_2.method5776(local339, local219 + arg0, arg2 + local853, Static213.anInt4343, local1198);
				}
				if (Static26.anIntArray36[local178] == 2) {
					Static247.aClass18_2.method5761(arg0 + local219, arg2 - -local853, local1198, local339, Static213.anInt4343);
				}
				if (Static26.anIntArray36[local178] == 3) {
					Static247.aClass18_2.method5767(150 - Static26.anIntArray32[local178], local853 + arg2, local1198, Static213.anInt4343, arg0 + local219, local339);
				}
				@Pc(1537) int local1537;
				if (Static26.anIntArray36[local178] == 4) {
					local1537 = (150 - Static26.anIntArray32[local178]) * (Static296.aClass84_10.method2381(local1198) + 100) / 150;
					Static30.aClass30_3.IA(local219 + arg0 - 50, arg2, arg0 + local219 + 50, arg3 + arg2);
					Static247.aClass18_2.method5769(local1198, local219 + arg0 + 50 - local1537, -16777216, arg2 + local853, local339);
					Static30.aClass30_3.w(arg0, arg2, arg1 + arg0, arg3 + arg2);
				}
				if (Static26.anIntArray36[local178] == 5) {
					local1537 = 150 - Static26.anIntArray32[local178];
					@Pc(1595) int local1595 = 0;
					if (local1537 < 25) {
						local1595 = local1537 - 25;
					} else if (local1537 > 125) {
						local1595 = local1537 - 125;
					}
					@Pc(1619) int local1619 = Static296.aClass84_10.anInt2634 + Static296.aClass84_10.anInt2628;
					Static30.aClass30_3.IA(arg0, arg2 + local853 - local1619 - 1, arg1 + arg0, local853 + arg2 + 5);
					Static247.aClass18_2.method5772(local339, arg0 + local219, local1595 + local853 + arg2, local1198, -16777216);
					Static30.aClass30_3.w(arg0, arg2, arg1 + arg0, arg3 + arg2);
				}
			} else {
				Static247.aClass18_2.method5772(-256, local219 + arg0, arg2 + local853, local1198, -16777216);
			}
		}
	}
}
