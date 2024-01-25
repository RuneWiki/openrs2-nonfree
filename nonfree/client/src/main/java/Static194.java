import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static194 {

	@OriginalMember(owner = "client!gha", name = "s", descriptor = "[C")
	public static char[] aCharArray2 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!gha", name = "w", descriptor = "Z")
	public static boolean aBoolean260 = false;

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(B)V")
	public static void method2799() {
		if (Static566.anInt9503 == 0) {
			return;
		}
		if (Static492.aClass295_1 != null) {
			Static492.aClass295_1.method7023();
			Static492.aClass295_1 = null;
		}
		Static68.method1106();
		Static678.method9304();
	}

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(IIIZLclient!qa;)Z")
	public static boolean method2800(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class8_Sub1_Sub4 arg3) {
		if (!Static570.aBoolean734 || !Static119.aBoolean171) {
			return false;
		} else if (Static224.anInt3656 < 100) {
			return false;
		} else if (Static9.method108(arg0, arg2, 109, arg1)) {
			@Pc(33) int local33 = arg1 << Static611.anInt10115;
			@Pc(37) int local37 = arg0 << Static611.anInt10115;
			@Pc(47) int local47 = Static242.aClass22Array3[arg2].method8038(arg0, arg1) - 1;
			@Pc(53) int local53 = local47 + arg3.method8900(-2226);
			if (arg3.aShort79 == 1) {
				if (!Static33.method558(Static88.anInt7739 + local37, local37, local53, local33, local33, local33, local47, local53, local37)) {
					return false;
				} else if (Static33.method558(local37 + Static88.anInt7739, local37, local53, local33, local33, local33, local47, local47, local37 + Static88.anInt7739)) {
					Static386.anInt6607++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort79 == 2) {
				if (!Static33.method558(local37 + Static88.anInt7739, local37 - -Static88.anInt7739, local53, Static88.anInt7739 + local33, local33, local33, local47, local53, local37 + Static88.anInt7739)) {
					return false;
				} else if (Static33.method558(local37 + Static88.anInt7739, local37 - -Static88.anInt7739, local47, Static88.anInt7739 + local33, local33 - -Static88.anInt7739, local33, local47, local53, local37 + Static88.anInt7739)) {
					Static386.anInt6607++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort79 == 4) {
				if (!Static33.method558(local37 + Static88.anInt7739, local37, local53, local33 + Static88.anInt7739, Static88.anInt7739 + local33, local33 + Static88.anInt7739, local47, local53, local37)) {
					return false;
				} else if (Static33.method558(local37 + Static88.anInt7739, local37, local53, local33 + Static88.anInt7739, Static88.anInt7739 + local33, local33 + Static88.anInt7739, local47, local47, local37 + Static88.anInt7739)) {
					Static386.anInt6607++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort79 == 8) {
				if (!Static33.method558(local37, local37, local53, local33 + Static88.anInt7739, local33, local33, local47, local53, local37)) {
					return false;
				} else if (Static33.method558(local37, local37, local47, local33 + Static88.anInt7739, local33 - -Static88.anInt7739, local33, local47, local53, local37)) {
					Static386.anInt6607++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort79 == 16) {
				if (Static63.method884(local47, local53, local37 + Static349.anInt6143, local33, Static349.anInt6143, Static349.anInt6143)) {
					Static386.anInt6607++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort79 == 32) {
				if (Static63.method884(local47, local53, local37 + Static349.anInt6143, local33 - -Static349.anInt6143, Static349.anInt6143, Static349.anInt6143)) {
					Static386.anInt6607++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort79 == 64) {
				if (Static63.method884(local47, local53, local37, Static349.anInt6143 + local33, Static349.anInt6143, Static349.anInt6143)) {
					Static386.anInt6607++;
					return true;
				} else {
					return false;
				}
			} else if (arg3.aShort79 != 128) {
				return true;
			} else if (Static63.method884(local47, local53, local37, local33, Static349.anInt6143, Static349.anInt6143)) {
				Static386.anInt6607++;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method2801(@OriginalArg(0) String arg0) {
		if (Static191.aClass349Array1 != null) {
			@Pc(16) Class5_Sub50 local16 = Static457.method6722(Static119.aClass387_27, Static80.aClass313_1);
			local16.aClass5_Sub23_Sub2_2.method8502(Static228.method3239(arg0));
			local16.aClass5_Sub23_Sub2_2.method8538(arg0);
			Static494.method7120(local16);
		}
	}

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(IIIIIBI)V")
	public static void method2802(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(6) int arg3) {
		@Pc(7) int local7 = Static116.anInt3318;
		Static99.anInt1599 = 0;
		@Pc(11) int[] local11 = Static88.anIntArray464;
		@Pc(198) int local198;
		@Pc(233) int local233;
		@Pc(287) int local287;
		@Pc(372) int local372;
		@Pc(375) int local375;
		@Pc(1199) int local1199;
		@Pc(1245) int local1245;
		@Pc(1247) int local1247;
		@Pc(471) int local471;
		@Pc(1092) int local1092;
		@Pc(614) int local614;
		for (@Pc(13) int local13 = 0; local13 < local7 + Static247.anInt4256; local13++) {
			@Pc(17) Class227 local17 = null;
			@Pc(32) Class8_Sub1_Sub3_Sub2 local32;
			if (local7 <= local13) {
				local32 = ((Class5_Sub35) Static623.aClass291_43.method6993((long) Static671.anIntArray620[local13 - local7], 1)).aClass8_Sub1_Sub3_Sub2_Sub2_2;
				local17 = ((Class8_Sub1_Sub3_Sub2_Sub2) local32).aClass227_1;
				if (local17.anIntArray341 != null) {
					local17 = local17.method5322(Static413.aClass118_1);
					if (local17 == null) {
						continue;
					}
				}
			} else {
				local32 = Static165.aClass8_Sub1_Sub3_Sub2_Sub1Array1[local11[local13]];
			}
			if (local32.anInt7018 >= 0 && (Static287.anInt5060 == local32.anInt6981 || Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.aByte145 == local32.aByte145)) {
				Static680.method9331(local32.method5994(), local32, arg1 >> 1, arg2 >> 1);
				if (Static13.anIntArray19[0] >= 0) {
					if (local32.aString92 != null && (local7 <= local13 || Static539.anInt9219 == 0 || Static539.anInt9219 == 3 || Static539.anInt9219 == 1 && Static88.method6670(((Class8_Sub1_Sub3_Sub2_Sub1) local32).aString62)) && Static488.anInt8184 > Static99.anInt1599) {
						Static488.anIntArray480[Static99.anInt1599] = Static594.aClass224_12.method5256(local32.aString92) / 2;
						Static488.anIntArray485[Static99.anInt1599] = Static13.anIntArray19[0];
						Static488.anIntArray484[Static99.anInt1599] = Static13.anIntArray19[1];
						Static488.anIntArray483[Static99.anInt1599] = local32.anInt7015;
						Static488.anIntArray481[Static99.anInt1599] = local32.anInt6990;
						Static488.anIntArray482[Static99.anInt1599] = local32.anInt7022;
						Static488.aStringArray61[Static99.anInt1599] = local32.aString92;
						Static99.anInt1599++;
					}
					local198 = arg3 + Static13.anIntArray19[1];
					@Pc(272) Class134[] local272;
					@Pc(279) Class173[] local279;
					@Pc(343) Class134 local343;
					if (local32.aBoolean540 || Static44.anInt740 >= local32.anInt7000) {
						local198 -= Math.max(Static594.aClass224_12.anInt6135, Static350.aClass134Array9[0].method9219());
					} else {
						@Pc(227) byte local227 = 1;
						if (local7 <= local13) {
							local233 = local17.anInt6244;
							if (local233 == -1) {
								local233 = local32.method5991(127).anInt2166;
							}
						} else {
							@Pc(249) Class8_Sub1_Sub3_Sub2_Sub1 local249 = Static165.aClass8_Sub1_Sub3_Sub2_Sub1Array1[local11[local13]];
							local233 = local32.method5991(120).anInt2166;
							if (local249.aBoolean328) {
								local227 = 2;
							}
						}
						@Pc(261) Class134[] local261 = Static350.aClass134Array9;
						if (local233 != -1) {
							local272 = (Class134[]) Static445.aClass391_42.method9275((long) local233);
							if (local272 == null) {
								local279 = Static684.method3653(Static345.aClass208_78, local233);
								if (local279 != null) {
									local272 = new Class134[local279.length];
									for (local287 = 0; local287 < local279.length; local287++) {
										local272[local287] = Static457.aClass57_11.method7654(local279[local287], true);
									}
									Static445.aClass391_42.method9273((long) local233, local272, 1);
								}
							}
							if (local272 != null && local272.length >= 2) {
								local261 = local272;
							}
						}
						if (local227 >= local261.length) {
							local227 = 1;
						}
						@Pc(339) Class134 local339 = local261[0];
						local343 = local261[local227];
						local198 -= Math.max(Static594.aClass224_12.anInt6135, local339.method9219());
						local287 = arg0 + Static13.anIntArray19[0] - (local339.method9236() >> 1);
						local372 = local339.method9236() * local32.anInt6980 / 255;
						local375 = local339.method9219();
						if (local32.anInt6980 > 0 && local372 < 2) {
							local372 = 2;
						}
						local339.method9235(local287, local198);
						Static457.aClass57_11.T(local287, local198, local372 + local287, local375 + local198);
						local343.method9235(local287, local198);
						Static457.aClass57_11.KA(arg0, arg3, arg2 + arg0, arg1 + arg3);
						Static82.method9318(local375 + local198, local198, local287 + local339.method9231(), local287);
					}
					local198 -= 2;
					if (!local32.aBoolean540) {
						@Pc(451) Class134 local451;
						@Pc(461) Class134 local461;
						if (Static44.anInt740 < local32.anInt6983) {
							local451 = Static441.aClass134Array11[local32.aBoolean542 ? 2 : 0];
							local461 = Static441.aClass134Array11[local32.aBoolean542 ? 3 : 1];
							if (local32 instanceof Class8_Sub1_Sub3_Sub2_Sub2) {
								local471 = local17.anInt6250;
								if (local471 == -1) {
									local471 = local32.method5991(114).anInt2171;
								}
							} else {
								local471 = local32.method5991(111).anInt2171;
							}
							if (local471 != -1) {
								local272 = (Class134[]) Static539.aClass391_52.method9275((long) local471);
								if (local272 == null) {
									local279 = Static684.method3653(Static345.aClass208_78, local471);
									if (local279 != null) {
										local272 = new Class134[local279.length];
										for (local287 = 0; local287 < local279.length; local287++) {
											local272[local287] = Static457.aClass57_11.method7654(local279[local287], true);
										}
										Static539.aClass391_52.method9273((long) local471, local272, 1);
									}
								}
								if (local272 != null && local272.length == 4) {
									local451 = local272[local32.aBoolean542 ? 2 : 0];
									local461 = local272[local32.aBoolean542 ? 3 : 1];
								}
							}
							@Pc(576) int local576 = local32.anInt6983 - Static44.anInt740;
							if (local576 > local32.anInt7034) {
								local576 -= local32.anInt7034;
								local287 = local32.anInt7007 == 0 ? 0 : (local32.anInt6985 - local576) / local32.anInt7007 * local32.anInt7007;
								local614 = local287 * local451.method9236() / local32.anInt6985;
							} else {
								local614 = local451.method9236();
							}
							local287 = local451.method9219();
							local198 -= local287;
							local372 = arg0 + Static13.anIntArray19[0] - (local451.method9236() >> 1);
							local451.method9235(local372, local198);
							Static457.aClass57_11.T(local372, local198, local614 + local372, local198 + local287);
							local461.method9235(local372, local198);
							Static457.aClass57_11.KA(arg0, arg3, arg2 + arg0, arg1 + arg3);
							Static82.method9318(local287 + local198, local198, local451.method9231() + local372, local372);
							local198 -= 2;
						}
						if (local13 < local7) {
							@Pc(689) Class8_Sub1_Sub3_Sub2_Sub1 local689 = (Class8_Sub1_Sub3_Sub2_Sub1) local32;
							if (local689.anInt4192 != -1) {
								local198 -= 25;
								local461 = Static300.aClass134Array7[local689.anInt4192];
								local461.method9235(Static13.anIntArray19[0] + arg0 - 12, local198);
								Static82.method9318(local461.method9232() + local198, local198, Static13.anIntArray19[0] + arg0 + local461.method9231() - 12, arg0 + -12 + Static13.anIntArray19[0]);
								local198 -= 2;
							}
							if (local689.anInt4203 != -1) {
								local198 -= 25;
								local461 = Static34.aClass134Array1[local689.anInt4203];
								local461.method9235(Static13.anIntArray19[0] + arg0 - 12, local198);
								Static82.method9318(local198 + local461.method9232(), local198, Static13.anIntArray19[0] + arg0 + local461.method9231() - 12, arg0 + (Static13.anIntArray19[0] - 12));
								local198 -= 2;
							}
						} else if (local17.anInt6246 >= 0 && local17.anInt6246 < Static34.aClass134Array1.length) {
							local451 = Static34.aClass134Array1[local17.anInt6246];
							local198 -= 25;
							local451.method9235(Static13.anIntArray19[0] + arg0 - (local451.method9236() >> 1), local198);
							Static82.method9318(local198 + local451.method9232(), local198, Static13.anIntArray19[0] + arg0 - (local451.method9236() >> 1) + local451.method9231(), arg0 - (-Static13.anIntArray19[0] + (local451.method9236() >> 1)));
							local198 -= 2;
						}
					}
					@Pc(861) Class28[] local861;
					@Pc(869) Class28 local869;
					if (!(local32 instanceof Class8_Sub1_Sub3_Sub2_Sub1)) {
						local233 = 0;
						local861 = Static598.aClass28Array1;
						for (local471 = 0; local471 < local861.length; local471++) {
							local869 = local861[local471];
							if (local869 != null && local869.anInt500 == 1 && Static671.anIntArray620[local13 - local7] == local869.anInt502) {
								local343 = Static56.aClass134Array10[local869.anInt505];
								if (local233 < local343.method9219()) {
									local233 = local343.method9219();
								}
								if (Static44.anInt740 % 20 < 10) {
									local343.method9235(arg0 + Static13.anIntArray19[0] - 12, -local343.method9219() + local198);
									Static82.method9318(local198 - local343.method9219() + local343.method9232(), local198 - local343.method9219(), arg0 + Static13.anIntArray19[0] + local343.method9231() - 12, arg0 + Static13.anIntArray19[0] - 12);
								}
							}
						}
						if (local233 > 0) {
						}
					} else if (local13 >= 0) {
						local233 = 0;
						local861 = Static598.aClass28Array1;
						for (local471 = 0; local471 < local861.length; local471++) {
							local869 = local861[local471];
							if (local869 != null && local869.anInt500 == 10 && local869.anInt502 == local11[local13]) {
								local343 = Static56.aClass134Array10[local869.anInt505];
								if (local233 < local343.method9219()) {
									local233 = local343.method9219();
								}
								local343.method9235(Static13.anIntArray19[0] + arg0 - 12, local198 + -local343.method9219());
								Static82.method9318(local198 - local343.method9219() + local343.method9232(), local198 - local343.method9219(), arg0 + Static13.anIntArray19[0] + local343.method9231() - 12, arg0 - (-Static13.anIntArray19[0] + 12));
							}
						}
						if (local233 > 0) {
						}
					}
					for (local233 = 0; local233 < Static348.anInt6129; local233++) {
						local1092 = local32.anIntArray413[local233];
						local471 = local32.anIntArray411[local233];
						@Pc(1099) Class155 local1099 = null;
						local614 = 0;
						if (local471 >= 0) {
							if (Static44.anInt740 >= local1092) {
								continue;
							}
							local1099 = Static588.aClass237_2.method5452(local32.anIntArray411[local233]);
							local614 = local1099.anInt3488;
						} else if (local1092 < 0) {
							continue;
						}
						local287 = local32.anIntArray405[local233];
						@Pc(1140) Class155 local1140 = null;
						if (local287 >= 0) {
							local1140 = Static588.aClass237_2.method5452(local287);
						}
						if (Static44.anInt740 >= local1092 - local614) {
							local375 = local32.anIntArray407[local233];
							if (local375 >= 0) {
								local32.anInt7000 = Static44.anInt740 + 300;
								local32.anInt6980 = local375;
								local32.anIntArray407[local233] = -1;
							}
							if (local1099 == null) {
								local32.anIntArray413[local233] = -1;
							} else {
								local1199 = local32.method5994() / 2;
								Static680.method9331(local1199, local32, arg1 >> 1, arg2 >> 1);
								if (Static13.anIntArray19[0] > -1) {
									Static13.anIntArray19[0] += Static185.anIntArray168[local233];
									Static13.anIntArray19[1] += Static316.anIntArray310[local233];
									local1245 = 0;
									local1247 = 0;
									@Pc(1249) int local1249 = 0;
									@Pc(1251) int local1251 = 0;
									@Pc(1253) int local1253 = 0;
									@Pc(1255) int local1255 = 0;
									@Pc(1257) int local1257 = 0;
									@Pc(1259) int local1259 = 0;
									@Pc(1261) Class134 local1261 = null;
									@Pc(1263) Class134 local1263 = null;
									@Pc(1265) Class134 local1265 = null;
									@Pc(1267) Class134 local1267 = null;
									@Pc(1269) int local1269 = 0;
									@Pc(1271) int local1271 = 0;
									@Pc(1273) int local1273 = 0;
									@Pc(1275) int local1275 = 0;
									@Pc(1277) int local1277 = 0;
									@Pc(1279) int local1279 = 0;
									@Pc(1281) int local1281 = 0;
									@Pc(1283) int local1283 = 0;
									@Pc(1285) int local1285 = 0;
									@Pc(1290) Class134 local1290 = local1099.method3052(Static457.aClass57_11);
									@Pc(1298) int local1298;
									if (local1290 != null) {
										local1245 = local1290.method9236();
										local1298 = local1290.method9219();
										if (local1298 > 0) {
											local1285 = local1298;
										}
										local1290.method9223(Static369.anIntArray347);
										local1253 = Static369.anIntArray347[0];
									}
									@Pc(1319) Class134 local1319 = local1099.method3055(Static457.aClass57_11);
									if (local1319 != null) {
										local1247 = local1319.method9236();
										local1298 = local1319.method9219();
										if (local1298 > local1285) {
											local1285 = local1298;
										}
										local1319.method9223(Static369.anIntArray347);
										local1255 = Static369.anIntArray347[0];
									}
									@Pc(1344) Class134 local1344 = local1099.method3062(Static457.aClass57_11);
									if (local1344 != null) {
										local1249 = local1344.method9236();
										local1298 = local1344.method9219();
										local1344.method9223(Static369.anIntArray347);
										if (local1285 < local1298) {
											local1285 = local1298;
										}
										local1257 = Static369.anIntArray347[0];
									}
									@Pc(1369) Class134 local1369 = local1099.method3063(Static457.aClass57_11);
									if (local1369 != null) {
										local1251 = local1369.method9236();
										local1298 = local1369.method9219();
										if (local1285 < local1298) {
											local1285 = local1298;
										}
										local1369.method9223(Static369.anIntArray347);
										local1259 = Static369.anIntArray347[0];
									}
									if (local1140 != null) {
										local1261 = local1140.method3052(Static457.aClass57_11);
										if (local1261 != null) {
											local1269 = local1261.method9236();
											local1298 = local1261.method9219();
											local1261.method9223(Static369.anIntArray347);
											if (local1298 > local1285) {
												local1285 = local1298;
											}
											local1277 = Static369.anIntArray347[0];
										}
										local1263 = local1140.method3055(Static457.aClass57_11);
										if (local1263 != null) {
											local1271 = local1263.method9236();
											local1298 = local1263.method9219();
											if (local1285 < local1298) {
												local1285 = local1298;
											}
											local1263.method9223(Static369.anIntArray347);
											local1279 = Static369.anIntArray347[0];
										}
										local1265 = local1140.method3062(Static457.aClass57_11);
										if (local1265 != null) {
											local1273 = local1265.method9236();
											local1298 = local1265.method9219();
											local1265.method9223(Static369.anIntArray347);
											if (local1298 > local1285) {
												local1285 = local1298;
											}
											local1281 = Static369.anIntArray347[0];
										}
										local1267 = local1140.method3063(Static457.aClass57_11);
										if (local1267 != null) {
											local1275 = local1267.method9236();
											local1298 = local1267.method9219();
											local1267.method9223(Static369.anIntArray347);
											if (local1298 > local1285) {
												local1285 = local1298;
											}
											local1283 = Static369.anIntArray347[0];
										}
									}
									@Pc(1509) Class80 local1509 = Static41.aClass80_2;
									@Pc(1511) Class80 local1511 = Static41.aClass80_2;
									@Pc(1513) Class224 local1513 = Static473.aClass224_10;
									local1298 = local1099.anInt3476;
									@Pc(1518) Class224 local1518 = Static473.aClass224_10;
									@Pc(1526) Class80 local1526;
									@Pc(1531) Class224 local1531;
									if (local1298 >= 0) {
										local1526 = Static118.method228(Static457.aClass57_11, true, local1298);
										local1531 = Static607.method8685(local1298, Static457.aClass57_11);
										if (local1526 != null && local1531 != null) {
											local1509 = local1526;
											local1513 = local1531;
										}
									}
									if (local1140 != null) {
										local1298 = local1140.anInt3476;
										if (local1298 >= 0) {
											local1526 = Static118.method228(Static457.aClass57_11, true, local1298);
											local1531 = Static607.method8685(local1298, Static457.aClass57_11);
											if (local1526 != null && local1531 != null) {
												local1511 = local1526;
												local1518 = local1531;
											}
										}
									}
									@Pc(1576) String local1576 = null;
									@Pc(1580) int local1580 = 0;
									@Pc(1588) String local1588 = local1099.method3053(local32.anIntArray409[local233]);
									@Pc(1593) int local1593 = local1513.method5256(local1588);
									if (local1140 != null) {
										local1576 = local1140.method3053(local32.anIntArray406[local233]);
										local1580 = local1518.method5256(local1576);
									}
									@Pc(1610) int local1610 = 0;
									if (local1247 > 0) {
										local1610 = local1593 / local1247 + 1;
									}
									@Pc(1620) int local1620 = 0;
									if (local1140 != null && local1271 > 0) {
										local1620 = local1580 / local1271 + 1;
									}
									@Pc(1634) int local1634 = 0;
									if (local1245 > 0) {
										local1634 = local1245;
									}
									local1634 += 2;
									@Pc(1645) int local1645 = local1634;
									if (local1249 > 0) {
										local1634 += local1249;
									}
									@Pc(1653) int local1653 = local1634;
									@Pc(1655) int local1655 = local1634;
									@Pc(1664) int local1664;
									if (local1247 > 0) {
										local1664 = local1247 * local1610;
										local1634 += local1664;
										local1655 += (local1664 - local1593) / 2;
									} else {
										local1634 += local1593;
									}
									local1664 = local1634;
									if (local1251 > 0) {
										local1634 += local1251;
									}
									@Pc(1696) int local1696 = 0;
									@Pc(1698) int local1698 = 0;
									@Pc(1700) int local1700 = 0;
									@Pc(1702) int local1702 = 0;
									@Pc(1704) int local1704 = 0;
									@Pc(1746) int local1746;
									if (local1140 != null) {
										local1634 += 2;
										local1696 = local1634;
										if (local1269 > 0) {
											local1634 += local1269;
										}
										local1634 += 2;
										local1698 = local1634;
										if (local1273 > 0) {
											local1634 += local1273;
										}
										local1700 = local1634;
										local1704 = local1634;
										if (local1271 <= 0) {
											local1634 += local1580;
										} else {
											local1746 = local1271 * local1620;
											local1704 = local1634 + (local1746 - local1580) / 2;
											local1634 += local1746;
										}
										local1702 = local1634;
										if (local1275 > 0) {
											local1634 += local1275;
										}
									}
									local1746 = local32.anIntArray413[local233] - Static44.anInt740;
									@Pc(1789) int local1789 = local1099.anInt3491 - local1099.anInt3491 * local1746 / local1099.anInt3488;
									@Pc(1801) int local1801 = local1099.anInt3480 * local1746 / local1099.anInt3488 - local1099.anInt3480;
									@Pc(1814) int local1814 = arg0 + Static13.anIntArray19[0] + local1789 - (local1634 >> 1);
									@Pc(1825) int local1825 = local1801 + arg3 + Static13.anIntArray19[1] - 12;
									@Pc(1827) int local1827 = local1825;
									@Pc(1831) int local1831 = local1285 + local1825;
									@Pc(1838) int local1838 = local1099.anInt3477 + local1825 + 15;
									@Pc(1844) int local1844 = local1838 - local1513.anInt6135;
									@Pc(1850) int local1850 = local1838 + local1513.anInt6133;
									if (local1825 > local1844) {
										local1827 = local1844;
									}
									if (local1831 < local1850) {
										local1831 = local1850;
									}
									@Pc(1870) int local1870 = 0;
									@Pc(1886) int local1886;
									@Pc(1901) int local1901;
									if (local1140 != null) {
										local1870 = local1825 + local1140.anInt3477 + 15;
										local1886 = local1870 - local1518.anInt6135;
										if (local1827 > local1886) {
											local1827 = local1886;
										}
										local1901 = local1870 + local1518.anInt6133;
										if (local1831 < local1901) {
											local1831 = local1901;
										}
									}
									local1886 = 255;
									if (local1099.anInt3470 >= 0) {
										local1886 = (local1746 << 8) / (local1099.anInt3488 - local1099.anInt3470);
									}
									if (local1886 >= 0 && local1886 < 255) {
										local1901 = local1886 << 24;
										@Pc(1943) int local1943 = local1901 | 0xFFFFFF;
										if (local1290 != null) {
											local1290.method9230(local1814 - local1253, local1825, 0, local1943, 1);
										}
										if (local1344 != null) {
											local1344.method9230(local1814 + local1645 - local1257, local1825, 0, local1943, 1);
										}
										@Pc(1980) int local1980;
										if (local1319 != null) {
											for (local1980 = 0; local1980 < local1610; local1980++) {
												local1319.method9230(local1980 * local1247 + local1814 + local1653 - local1255, local1825, 0, local1943, 1);
											}
										}
										if (local1369 != null) {
											local1369.method9230(local1664 + local1814 - local1259, local1825, 0, local1943, 1);
										}
										local1509.method8780(0, local1588, local1838, local1901 | local1099.anInt3490, local1814 + local1655);
										if (local1140 != null) {
											if (local1261 != null) {
												local1261.method9230(local1696 + local1814 - local1277, local1825, 0, local1943, 1);
											}
											if (local1265 != null) {
												local1265.method9230(local1814 + local1698 - local1281, local1825, 0, local1943, 1);
											}
											if (local1263 != null) {
												for (local1980 = 0; local1980 < local1620; local1980++) {
													local1263.method9230(local1814 + local1700 + local1271 * local1980 - local1279, local1825, 0, local1943, 1);
												}
											}
											if (local1267 != null) {
												local1267.method9230(local1702 + local1814 - local1283, local1825, 0, local1943, 1);
											}
											local1511.method8780(0, local1576, local1870, local1140.anInt3490 | local1901, local1814 + local1704);
										}
									} else {
										if (local1290 != null) {
											local1290.method9235(local1814 - local1253, local1825);
										}
										if (local1344 != null) {
											local1344.method9235(local1814 + local1645 - local1257, local1825);
										}
										if (local1319 != null) {
											for (local1901 = 0; local1901 < local1610; local1901++) {
												local1319.method9235(local1653 + local1814 + local1247 * local1901 - local1255, local1825);
											}
										}
										if (local1369 != null) {
											local1369.method9235(local1814 + local1664 - local1259, local1825);
										}
										local1509.method8780(0, local1588, local1838, local1099.anInt3490 | 0xFF000000, local1814 + local1655);
										if (local1140 != null) {
											if (local1261 != null) {
												local1261.method9235(local1814 + local1696 - local1277, local1825);
											}
											if (local1265 != null) {
												local1265.method9235(local1814 + local1698 - local1281, local1825);
											}
											if (local1263 != null) {
												for (local1901 = 0; local1901 < local1620; local1901++) {
													local1263.method9235(local1700 + local1814 + local1901 * local1271 - local1279, local1825);
												}
											}
											if (local1267 != null) {
												local1267.method9235(local1814 + local1702 - local1283, local1825);
											}
											local1511.method8780(0, local1576, local1870, local1140.anInt3490 | 0xFF000000, local1814 + local1704);
										}
									}
									Static82.method9318(local1831 + 1, local1827, local1634 + local1814, local1814);
								}
							}
						}
					}
				}
			}
		}
		@Pc(2347) int local2347;
		for (@Pc(2339) int local2339 = 0; local2339 < Static249.anInt4280; local2339++) {
			local2347 = Static178.anIntArray166[local2339];
			@Pc(2362) Class8_Sub1_Sub3_Sub2 local2362;
			if (local2347 >= 2048) {
				local2362 = ((Class5_Sub35) Static623.aClass291_43.method6993((long) (local2347 - 2048), 1)).aClass8_Sub1_Sub3_Sub2_Sub2_2;
			} else {
				local2362 = Static165.aClass8_Sub1_Sub3_Sub2_Sub1Array1[local2347];
			}
			local233 = Static94.anIntArray77[local2339];
			@Pc(2381) Class8_Sub1_Sub3_Sub2 local2381;
			if (local233 < 2048) {
				local2381 = Static165.aClass8_Sub1_Sub3_Sub2_Sub1Array1[local233];
			} else {
				local2381 = ((Class5_Sub35) Static623.aClass291_43.method6993((long) (local233 - 2048), 1)).aClass8_Sub1_Sub3_Sub2_Sub2_2;
			}
			Static565.method8891(--local2362.anInt7011, local2362, arg3, arg1, arg2, local2381, arg0);
		}
		if (-108 < -112) {
			aCharArray2 = null;
		}
		local2347 = Static594.aClass224_12.anInt6135 + Static594.aClass224_12.anInt6133 + 2;
		for (local198 = 0; local198 < Static99.anInt1599; local198++) {
			local233 = Static488.anIntArray485[local198];
			local1092 = Static488.anIntArray484[local198];
			local471 = Static488.anIntArray480[local198];
			@Pc(2455) boolean local2455 = true;
			while (local2455) {
				local2455 = false;
				for (local614 = 0; local614 < local198; local614++) {
					if (Static488.anIntArray484[local614] - local2347 < local1092 + 2 && Static488.anIntArray484[local614] + 2 > local1092 - local2347 && local233 - local471 < Static488.anIntArray485[local614] - -Static488.anIntArray480[local614] && Static488.anIntArray485[local614] - Static488.anIntArray480[local614] < local471 + local233 && Static488.anIntArray484[local614] - local2347 < local1092) {
						local2455 = true;
						local1092 = Static488.anIntArray484[local614] - local2347;
					}
				}
			}
			Static488.anIntArray484[local198] = local1092;
			@Pc(2560) String local2560 = Static488.aStringArray61[local198];
			local287 = Static594.aClass224_12.method5256(local2560);
			local372 = local233 + arg0;
			local375 = arg3 + local1092 - Static594.aClass224_12.anInt6135;
			local1199 = local372 + local287;
			@Pc(2591) int local2591 = local1092 + arg3 + Static594.aClass224_12.anInt6133;
			if (Static572.anInt6194 == 0) {
				@Pc(2600) int local2600 = 16776960;
				if (Static488.anIntArray483[local198] < 6) {
					local2600 = Static297.anIntArray289[Static488.anIntArray483[local198]];
				}
				if (Static488.anIntArray483[local198] == 6) {
					local2600 = Static287.anInt5060 % 20 < 10 ? 16711680 : 16776960;
				}
				if (Static488.anIntArray483[local198] == 7) {
					local2600 = Static287.anInt5060 % 20 >= 10 ? 65535 : 255;
				}
				if (Static488.anIntArray483[local198] == 8) {
					local2600 = Static287.anInt5060 % 20 >= 10 ? 8454016 : 45056;
				}
				@Pc(2686) int local2686;
				if (Static488.anIntArray483[local198] == 9) {
					local2686 = 150 - Static488.anIntArray482[local198];
					if (local2686 < 50) {
						local2600 = local2686 * 1280 + 16711680;
					} else if (local2686 < 100) {
						local2600 = 16776960 - (local2686 - 50) * 327680;
					} else if (local2686 < 150) {
						local2600 = (local2686 - 100) * 5 + 65280;
					}
				}
				if (Static488.anIntArray483[local198] == 10) {
					local2686 = 150 - Static488.anIntArray482[local198];
					if (local2686 < 50) {
						local2600 = local2686 * 5 + 16711680;
					} else if (local2686 < 100) {
						local2600 = 16711935 - (local2686 - 50) * 327680;
					} else if (local2686 < 150) {
						local2600 = (local2686 - 100) * 327680 + 500 + 255 - local2686 * 5;
					}
				}
				if (Static488.anIntArray483[local198] == 11) {
					local2686 = 150 - Static488.anIntArray482[local198];
					if (local2686 < 50) {
						local2600 = 16777215 - local2686 * 327685;
					} else if (local2686 < 100) {
						local2600 = local2686 * 327685 - 16318970;
					} else if (local2686 < 150) {
						local2600 = 32768000 + 16777215 - local2686 * 327680;
					}
				}
				local2686 = local2600 | 0xFF000000;
				if (Static488.anIntArray481[local198] == 0) {
					Static533.aClass80_10.method8792(local233 + arg0, arg3 + local1092, local2686, -16777216, local2560);
					local1199 -= local287 >> 1;
					local372 -= local287 >> 1;
				}
				if (Static488.anIntArray481[local198] == 1) {
					local372 -= local287 >> 1;
					local2591 += 5;
					Static533.aClass80_10.method8781(local2686, Static287.anInt5060, arg0 + local233, local2560, arg3 + local1092);
					local1199 -= local287 >> 1;
					local375 -= 5;
				}
				if (Static488.anIntArray481[local198] == 2) {
					local375 -= 5;
					local2591 += 5;
					Static533.aClass80_10.method8783(Static287.anInt5060, arg0 + local233, local2560, local1092 + arg3, local2686);
					local1199 -= (local287 >> 1) - 5;
					local372 -= (local287 >> 1) + 5;
				}
				if (Static488.anIntArray481[local198] == 3) {
					local1199 -= local287 >> 1;
					local372 -= local287 >> 1;
					Static533.aClass80_10.method8795(local2560, arg0 + local233, arg3 - -local1092, local2686, 150 - Static488.anIntArray482[local198], Static287.anInt5060);
					local375 -= 7;
					local2591 += 7;
				}
				@Pc(3016) int local3016;
				if (Static488.anIntArray481[local198] == 4) {
					local3016 = (150 - Static488.anIntArray482[local198]) * (Static594.aClass224_12.method5256(local2560) + 100) / 150;
					Static457.aClass57_11.T(arg0 + local233 - 50, arg3, arg0 + local233 + 50, arg1 + arg3);
					Static533.aClass80_10.method8780(-16777216, local2560, local1092 + arg3, local2686, local233 + arg0 + 50 - local3016);
					local372 += 50 - local3016;
					local1199 += 50 - local3016;
					Static457.aClass57_11.KA(arg0, arg3, arg0 + arg2, arg1 + arg3);
				}
				if (Static488.anIntArray481[local198] == 5) {
					local3016 = 150 - Static488.anIntArray482[local198];
					local1245 = 0;
					if (local3016 < 25) {
						local1245 = local3016 - 25;
					} else if (local3016 > 125) {
						local1245 = local3016 - 125;
					}
					local1247 = Static594.aClass224_12.anInt6135 + Static594.aClass224_12.anInt6133;
					Static457.aClass57_11.T(arg0, local1092 + arg3 - local1247 - 1, arg2 + arg0, local1092 + arg3 + 5);
					local372 -= local287 >> 1;
					local1199 -= local287 >> 1;
					local375 += local1245;
					Static533.aClass80_10.method8792(local233 + arg0, local1092 + arg3 + local1245, local2686, -16777216, local2560);
					local2591 += local1245;
					Static457.aClass57_11.KA(arg0, arg3, arg2 + arg0, arg3 - -arg1);
				}
			} else {
				local372 -= local287 >> 1;
				local1199 -= local287 >> 1;
				Static533.aClass80_10.method8792(arg0 + local233, arg3 + local1092, -256, -16777216, local2560);
			}
			Static82.method9318(local2591 + 1, local375, local1199 + 1, local372);
		}
	}
}
