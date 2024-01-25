import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static502 {

	@OriginalMember(owner = "client!pka", name = "j", descriptor = "[I")
	public static final int[] anIntArray580 = new int[5];

	@OriginalMember(owner = "client!pka", name = "i", descriptor = "I")
	public static int anInt8004 = 0;

	@OriginalMember(owner = "client!pka", name = "A", descriptor = "[I")
	public static int[] anIntArray581 = new int[2];

	@OriginalMember(owner = "client!pka", name = "k", descriptor = "[I")
	public static final int[] anIntArray582 = new int[5];

	@OriginalMember(owner = "client!pka", name = "a", descriptor = "(B)V")
	public static void method6853() {
		@Pc(1) Class307 local1 = Static91.aClass307_21;
		synchronized (Static91.aClass307_21) {
			Static91.aClass307_21.method6998();
		}
		local1 = Static386.aClass307_61;
		synchronized (Static386.aClass307_61) {
			Static386.aClass307_61.method6998();
		}
	}

	@OriginalMember(owner = "client!pka", name = "a", descriptor = "(IIIIIII)V")
	public static void method6854(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		@Pc(7) int local7 = Static607.anInt9201;
		@Pc(9) int[] local9 = Static384.anIntArray436;
		Static140.anInt2618 = 0;
		@Pc(19) int local19;
		if (Static103.anInt2245 == 3) {
			local19 = Static470.aClass7Array1.length;
		} else {
			local19 = local7 + Static28.anInt1087;
		}
		@Pc(243) int local243;
		@Pc(297) int local297;
		@Pc(381) int local381;
		@Pc(384) int local384;
		@Pc(1263) int local1263;
		@Pc(1310) int local1310;
		@Pc(1312) int local1312;
		@Pc(1314) int local1314;
		@Pc(1316) int local1316;
		@Pc(221) int local221;
		@Pc(492) int local492;
		@Pc(1163) int local1163;
		@Pc(610) int local610;
		for (@Pc(26) int local26 = 0; local26 < local19; local26++) {
			@Pc(30) Class219 local30 = null;
			@Pc(56) Class9_Sub1_Sub1_Sub2 local56;
			if (Static103.anInt2245 == 3) {
				@Pc(104) Class7 local104 = Static470.aClass7Array1[local26];
				if (!local104.aBoolean4) {
					continue;
				}
				local56 = local104.method249();
				if (local56.anInt8778 != Static247.anInt3877) {
					continue;
				}
				if (local104.anInt240 >= 0) {
					local30 = ((Class9_Sub1_Sub1_Sub2_Sub2) local56).aClass219_1;
					if (local30.anIntArray405 != null) {
						local30 = local30.method5035(Static380.aClass127_1);
						if (local30 == null) {
							continue;
						}
					}
				}
			} else {
				if (local26 >= local7) {
					local56 = ((Class3_Sub52) Static94.aClass313_8.method7104((long) Static633.anIntArray705[local26 - local7])).aClass9_Sub1_Sub1_Sub2_Sub2_2;
					local30 = ((Class9_Sub1_Sub1_Sub2_Sub2) local56).aClass219_1;
					if (local30.anIntArray405 != null) {
						local30 = local30.method5035(Static380.aClass127_1);
						if (local30 == null) {
							continue;
						}
					}
				} else {
					local56 = Static19.aClass9_Sub1_Sub1_Sub2_Sub1Array1[local9[local26]];
				}
				if (local56.anInt8770 < 0 || local56.anInt8778 != Static247.anInt3877 && local56.aByte139 != Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.aByte139) {
					continue;
				}
			}
			Static275.method4890(arg3 >> 1, local56, arg2 >> 1, local56.method7498());
			if (Static143.anIntArray165[0] >= 0) {
				if (local56.method7478()) {
					@Pc(171) Class279 local171 = local56.method7491();
					if (local171 != null && Static434.anInt10640 > Static140.anInt2618) {
						Static434.anIntArray764[Static140.anInt2618] = Static677.aClass169_12.method3653(local171.method6372()) / 2;
						Static434.anIntArray763[Static140.anInt2618] = Static143.anIntArray165[0];
						Static434.anIntArray762[Static140.anInt2618] = Static143.anIntArray165[1];
						Static434.aClass279Array6[Static140.anInt2618] = local171;
						Static140.anInt2618++;
					}
				}
				local221 = arg0 + Static143.anIntArray165[1];
				@Pc(282) Class178[] local282;
				@Pc(289) Class361[] local289;
				@Pc(353) Class178 local353;
				if (local56.aBoolean591 || local56.anInt8769 <= Static716.anInt11157) {
					local221 -= Math.max(Static677.aClass169_12.anInt4041, Static661.aClass178Array16[0].method7618());
				} else {
					@Pc(238) byte local238 = 1;
					if (local30 == null) {
						@Pc(260) Class9_Sub1_Sub1_Sub2_Sub1 local260 = Static19.aClass9_Sub1_Sub1_Sub2_Sub1Array1[local9[local26]];
						local243 = local56.method7489().anInt5781;
						if (local260.aBoolean36) {
							local238 = 2;
						}
					} else {
						local243 = local30.anInt5691;
						if (local243 == -1) {
							local243 = local56.method7489().anInt5781;
						}
					}
					@Pc(272) Class178[] local272 = Static661.aClass178Array16;
					if (local243 != -1) {
						local282 = (Class178[]) Static645.aClass307_88.method7002((long) local243);
						if (local282 == null) {
							local289 = Static735.method8277(Static218.aClass182_59, local243);
							if (local289 != null) {
								local282 = new Class178[local289.length];
								for (local297 = 0; local297 < local289.length; local297++) {
									local282[local297] = Static153.aClass22_4.method9363(local289[local297], true);
								}
								Static645.aClass307_88.method7000(local282, (long) local243);
							}
						}
						if (local282 != null && local282.length >= 2) {
							local272 = local282;
						}
					}
					if (local272.length <= local238) {
						local238 = 1;
					}
					@Pc(349) Class178 local349 = local272[0];
					local353 = local272[local238];
					local221 -= Math.max(Static677.aClass169_12.anInt4041, local349.method7618());
					local297 = arg1 + Static143.anIntArray165[0] - (local349.method7636() >> 1);
					local381 = local349.method7636() * local56.anInt8771 / 255;
					local384 = local349.method7618();
					if (local56.anInt8771 > 0 && local381 < 2) {
						local381 = 2;
					}
					local349.method7637(local297, local221);
					Static153.aClass22_4.T(local297, local221, local381 + local297, local384 + local221);
					local353.method7637(local297, local221);
					Static153.aClass22_4.KA(arg1, arg0, arg1 + arg3, arg0 - -arg2);
					Static218.method3251(local384 + local221, local297, local297 + local349.method7627(), local221);
				}
				local221 -= 2;
				if (!local56.aBoolean591) {
					@Pc(474) Class178 local474;
					@Pc(484) Class178 local484;
					if (Static716.anInt11157 < local56.anInt8797) {
						local474 = Static410.aClass178Array5[local56.aBoolean592 ? 2 : 0];
						local484 = Static410.aClass178Array5[local56.aBoolean592 ? 3 : 1];
						if (local56 instanceof Class9_Sub1_Sub1_Sub2_Sub2) {
							local492 = local30.anInt5708;
							if (local492 == -1) {
								local492 = local56.method7489().anInt5794;
							}
						} else {
							local492 = local56.method7489().anInt5794;
						}
						if (local492 != -1) {
							local282 = (Class178[]) Static317.aClass307_56.method7002((long) local492);
							if (local282 == null) {
								local289 = Static735.method8277(Static218.aClass182_59, local492);
								if (local289 != null) {
									local282 = new Class178[local289.length];
									for (local297 = 0; local297 < local289.length; local297++) {
										local282[local297] = Static153.aClass22_4.method9363(local289[local297], true);
									}
									Static317.aClass307_56.method7000(local282, (long) local492);
								}
							}
							if (local282 != null && local282.length == 4) {
								local484 = local282[local56.aBoolean592 ? 3 : 1];
								local474 = local282[local56.aBoolean592 ? 2 : 0];
							}
						}
						@Pc(599) int local599 = local56.anInt8797 - Static716.anInt11157;
						if (local599 <= local56.anInt8779) {
							local610 = local474.method7636();
						} else {
							local599 -= local56.anInt8779;
							local297 = local56.anInt8777 == 0 ? 0 : local56.anInt8777 * ((local56.anInt8788 - local599) / local56.anInt8777);
							local610 = local297 * local474.method7636() / local56.anInt8788;
						}
						local297 = local474.method7618();
						local221 -= local297;
						local381 = Static143.anIntArray165[0] + arg1 - (local474.method7636() >> 1);
						local474.method7637(local381, local221);
						Static153.aClass22_4.T(local381, local221, local610 + local381, local297 + local221);
						local484.method7637(local381, local221);
						Static153.aClass22_4.KA(arg1, arg0, arg1 + arg3, arg2 + arg0);
						Static218.method3251(local297 + local221, local381, local474.method7627() + local381, local221);
						local221 -= 2;
					}
					if (local30 == null) {
						@Pc(710) Class9_Sub1_Sub1_Sub2_Sub1 local710 = (Class9_Sub1_Sub1_Sub2_Sub1) local56;
						if (local710.anInt538 != -1) {
							local484 = Static128.aClass178Array2[local710.anInt538];
							local221 -= local484.method7618();
							local484.method7637(arg1 + Static143.anIntArray165[0] - 12, local221);
							Static218.method3251(local484.method7632() + local221, arg1 + Static143.anIntArray165[0] + -12, Static143.anIntArray165[0] + arg1 + local484.method7627() - 12, local221);
							local221 -= 2;
						}
						if (local710.anInt523 != -1) {
							local484 = Static619.aClass178Array14[local710.anInt523];
							local221 -= local484.method7618();
							local484.method7637(Static143.anIntArray165[0] + arg1 - 12, local221);
							Static218.method3251(local221 + local484.method7632(), arg1 + -12 - -Static143.anIntArray165[0], arg1 + Static143.anIntArray165[0] + local484.method7627() - 12, local221);
							local221 -= 2;
						}
					} else if (local30.anInt5690 >= 0 && local30.anInt5690 < Static619.aClass178Array14.length) {
						local474 = Static619.aClass178Array14[local30.anInt5690];
						local221 -= local474.method7618();
						local474.method7637(arg1 + Static143.anIntArray165[0] - (local474.method7636() >> 1), local221);
						Static218.method3251(local474.method7632() + local221, arg1 - -Static143.anIntArray165[0] - (local474.method7636() >> 1), Static143.anIntArray165[0] + arg1 - (local474.method7636() >> 1) + local474.method7627(), local221);
						local221 -= 2;
					}
				}
				@Pc(898) Class197[] local898;
				@Pc(906) Class197 local906;
				if (!(local56 instanceof Class9_Sub1_Sub1_Sub2_Sub1)) {
					local243 = 0;
					local898 = Static110.aClass197Array1;
					for (local492 = 0; local492 < local898.length; local492++) {
						local906 = local898[local492];
						if (local906 != null && local906.anInt5073 == 1 && Static633.anIntArray705[local26 - local7] == local906.anInt5082) {
							local353 = Static708.aClass178Array18[local906.anInt5072];
							if (local243 < local353.method7618()) {
								local243 = local353.method7618();
							}
							@Pc(946) boolean local946;
							if (local906.anInt5084 == 0) {
								local946 = true;
							} else {
								local381 = Static163.method2669() * 1000 / local906.anInt5084 / 2;
								local946 = Static716.anInt11157 % (local381 * 2) < local381;
							}
							if (local946) {
								local353.method7637(arg1 + Static143.anIntArray165[0] - 12, local221 + -local353.method7618());
								Static218.method3251(local221 - local353.method7618() + local353.method7632(), arg1 + -12 + Static143.anIntArray165[0], arg1 + Static143.anIntArray165[0] + local353.method7627() - 12, local221 + -local353.method7618());
							}
						}
					}
					if (local243 > 0) {
					}
				} else if (local26 >= 0) {
					local243 = 0;
					local898 = Static110.aClass197Array1;
					for (local492 = 0; local492 < local898.length; local492++) {
						local906 = local898[local492];
						if (local906 != null && local906.anInt5073 == 10 && local906.anInt5082 == local9[local26]) {
							local353 = Static708.aClass178Array18[local906.anInt5072];
							if (local353.method7618() > local243) {
								local243 = local353.method7618();
							}
							local353.method7637(arg1 + Static143.anIntArray165[0] - 12, local221 - local353.method7618());
							Static218.method3251(local221 - local353.method7618() + local353.method7632(), arg1 - -Static143.anIntArray165[0] + -12, Static143.anIntArray165[0] + arg1 + local353.method7627() - 12, local221 + -local353.method7618());
						}
					}
					if (local243 > 0) {
					}
				}
				for (local243 = 0; local243 < Static29.aClass378_1.anInt10091; local243++) {
					local1163 = local56.anIntArray637[local243];
					local492 = local56.anIntArray635[local243];
					@Pc(1170) Class261 local1170 = null;
					local610 = 0;
					if (local492 >= 0) {
						if (Static716.anInt11157 >= local1163) {
							continue;
						}
						local1170 = Static346.aClass295_1.method6907(local56.anIntArray635[local243]);
						local610 = local1170.anInt6657;
					} else if (local1163 < 0) {
						continue;
					}
					local297 = local56.anIntArray638[local243];
					@Pc(1208) Class261 local1208 = null;
					if (local297 >= 0) {
						local1208 = Static346.aClass295_1.method6907(local297);
					}
					if (Static716.anInt11157 >= local1163 - local610) {
						local384 = local56.anIntArray634[local243];
						if (local384 >= 0) {
							local56.anInt8769 = Static716.anInt11157 + 300;
							local56.anInt8771 = local384;
							local56.anIntArray634[local243] = -1;
						}
						if (local1170 == null) {
							local56.anIntArray637[local243] = -1;
						} else {
							local1263 = local56.method7498() / 2;
							Static275.method4890(arg3 >> 1, local56, arg2 >> 1, local1263);
							if (Static143.anIntArray165[0] > -1) {
								Static143.anIntArray165[0] += Static29.aClass378_1.anIntArray735[local243];
								Static143.anIntArray165[1] += Static29.aClass378_1.anIntArray734[local243];
								local1310 = 0;
								local1312 = 0;
								local1314 = 0;
								local1316 = 0;
								@Pc(1318) int local1318 = 0;
								@Pc(1320) int local1320 = 0;
								@Pc(1322) int local1322 = 0;
								@Pc(1324) int local1324 = 0;
								@Pc(1326) Class178 local1326 = null;
								@Pc(1328) Class178 local1328 = null;
								@Pc(1330) Class178 local1330 = null;
								@Pc(1332) Class178 local1332 = null;
								@Pc(1334) int local1334 = 0;
								@Pc(1336) int local1336 = 0;
								@Pc(1338) int local1338 = 0;
								@Pc(1340) int local1340 = 0;
								@Pc(1342) int local1342 = 0;
								@Pc(1344) int local1344 = 0;
								@Pc(1346) int local1346 = 0;
								@Pc(1348) int local1348 = 0;
								@Pc(1353) Class178 local1353 = local1170.method5775(Static153.aClass22_4);
								@Pc(1355) int local1355 = 0;
								@Pc(1363) int local1363;
								if (local1353 != null) {
									local1310 = local1353.method7636();
									local1363 = local1353.method7618();
									local1353.method7625(Static100.anIntArray120);
									if (local1363 > 0) {
										local1355 = local1363;
									}
									local1318 = Static100.anIntArray120[0];
								}
								@Pc(1384) Class178 local1384 = local1170.method5777(Static153.aClass22_4);
								if (local1384 != null) {
									local1312 = local1384.method7636();
									local1363 = local1384.method7618();
									local1384.method7625(Static100.anIntArray120);
									if (local1355 < local1363) {
										local1355 = local1363;
									}
									local1320 = Static100.anIntArray120[0];
								}
								@Pc(1413) Class178 local1413 = local1170.method5774(Static153.aClass22_4);
								if (local1413 != null) {
									local1314 = local1413.method7636();
									local1363 = local1413.method7618();
									if (local1355 < local1363) {
										local1355 = local1363;
									}
									local1413.method7625(Static100.anIntArray120);
									local1322 = Static100.anIntArray120[0];
								}
								@Pc(1438) Class178 local1438 = local1170.method5771(Static153.aClass22_4);
								if (local1438 != null) {
									local1316 = local1438.method7636();
									local1363 = local1438.method7618();
									local1438.method7625(Static100.anIntArray120);
									if (local1355 < local1363) {
										local1355 = local1363;
									}
									local1324 = Static100.anIntArray120[0];
								}
								if (local1208 != null) {
									local1326 = local1208.method5775(Static153.aClass22_4);
									if (local1326 != null) {
										local1334 = local1326.method7636();
										local1363 = local1326.method7618();
										local1326.method7625(Static100.anIntArray120);
										if (local1355 < local1363) {
											local1355 = local1363;
										}
										local1342 = Static100.anIntArray120[0];
									}
									local1328 = local1208.method5777(Static153.aClass22_4);
									if (local1328 != null) {
										local1336 = local1328.method7636();
										local1363 = local1328.method7618();
										if (local1363 > local1355) {
											local1355 = local1363;
										}
										local1328.method7625(Static100.anIntArray120);
										local1344 = Static100.anIntArray120[0];
									}
									local1330 = local1208.method5774(Static153.aClass22_4);
									if (local1330 != null) {
										local1338 = local1330.method7636();
										local1363 = local1330.method7618();
										local1330.method7625(Static100.anIntArray120);
										if (local1363 > local1355) {
											local1355 = local1363;
										}
										local1346 = Static100.anIntArray120[0];
									}
									local1332 = local1208.method5771(Static153.aClass22_4);
									if (local1332 != null) {
										local1340 = local1332.method7636();
										local1363 = local1332.method7618();
										if (local1363 > local1355) {
											local1355 = local1363;
										}
										local1332.method7625(Static100.anIntArray120);
										local1348 = Static100.anIntArray120[0];
									}
								}
								@Pc(1562) Class57 local1562 = Static607.aClass57_12;
								@Pc(1564) Class57 local1564 = Static607.aClass57_12;
								@Pc(1566) Class169 local1566 = Static286.aClass169_5;
								local1363 = local1170.anInt6666;
								@Pc(1571) Class169 local1571 = Static286.aClass169_5;
								@Pc(1580) Class57 local1580;
								@Pc(1585) Class169 local1585;
								if (local1363 >= 0) {
									local1580 = Static99.method1979(Static153.aClass22_4, true, local1363, true);
									local1585 = Static279.method3944(local1363, Static153.aClass22_4);
									if (local1580 != null && local1585 != null) {
										local1562 = local1580;
										local1566 = local1585;
									}
								}
								if (local1208 != null) {
									local1363 = local1208.anInt6666;
									if (local1363 >= 0) {
										local1580 = Static99.method1979(Static153.aClass22_4, true, local1363, true);
										local1585 = Static279.method3944(local1363, Static153.aClass22_4);
										if (local1580 != null && local1585 != null) {
											local1571 = local1585;
											local1564 = local1580;
										}
									}
								}
								@Pc(1631) String local1631 = null;
								@Pc(1635) int local1635 = 0;
								@Pc(1643) String local1643 = local1170.method5768(local56.anIntArray636[local243]);
								@Pc(1648) int local1648 = local1566.method3653(local1643);
								if (local1208 != null) {
									local1631 = local1208.method5768(local56.anIntArray639[local243]);
									local1635 = local1571.method3653(local1631);
								}
								@Pc(1665) int local1665 = 0;
								if (local1312 > 0) {
									local1665 = local1648 / local1312 + 1;
								}
								@Pc(1678) int local1678 = 0;
								if (local1208 != null && local1336 > 0) {
									local1678 = local1635 / local1336 + 1;
								}
								@Pc(1692) int local1692 = 0;
								if (local1310 > 0) {
									local1692 = local1310;
								}
								local1692 += 2;
								@Pc(1703) int local1703 = local1692;
								if (local1314 > 0) {
									local1692 += local1314;
								}
								@Pc(1714) int local1714 = local1692;
								@Pc(1716) int local1716 = local1692;
								@Pc(1728) int local1728;
								if (local1312 <= 0) {
									local1692 += local1648;
								} else {
									local1728 = local1312 * local1665;
									local1692 += local1728;
									local1716 += (local1728 - local1648) / 2;
								}
								local1728 = local1692;
								if (local1316 > 0) {
									local1692 += local1316;
								}
								@Pc(1751) int local1751 = 0;
								@Pc(1753) int local1753 = 0;
								@Pc(1755) int local1755 = 0;
								@Pc(1757) int local1757 = 0;
								@Pc(1759) int local1759 = 0;
								@Pc(1798) int local1798;
								if (local1208 != null) {
									local1692 += 2;
									local1751 = local1692;
									if (local1334 > 0) {
										local1692 += local1334;
									}
									local1692 += 2;
									local1753 = local1692;
									if (local1338 > 0) {
										local1692 += local1338;
									}
									local1759 = local1692;
									local1755 = local1692;
									if (local1336 <= 0) {
										local1692 += local1635;
									} else {
										local1798 = local1678 * local1336;
										local1759 = local1692 + (local1798 - local1635) / 2;
										local1692 += local1798;
									}
									local1757 = local1692;
									if (local1340 > 0) {
										local1692 += local1340;
									}
								}
								local1798 = local56.anIntArray637[local243] - Static716.anInt11157;
								@Pc(1838) int local1838 = local1170.anInt6654 - local1798 * local1170.anInt6654 / local1170.anInt6657;
								@Pc(1851) int local1851 = local1170.anInt6661 * local1798 / local1170.anInt6657 - local1170.anInt6661;
								@Pc(1863) int local1863 = local1838 + arg1 + Static143.anIntArray165[0] - (local1692 >> 1);
								@Pc(1874) int local1874 = Static143.anIntArray165[1] + arg0 + local1851 - 12;
								@Pc(1876) int local1876 = local1874;
								@Pc(1880) int local1880 = local1355 + local1874;
								@Pc(1887) int local1887 = local1170.anInt6644 + local1874 + 15;
								@Pc(1893) int local1893 = local1887 - local1566.anInt4041;
								if (local1893 < local1874) {
									local1876 = local1893;
								}
								@Pc(1907) int local1907 = local1887 + local1566.anInt4042;
								if (local1907 > local1880) {
									local1880 = local1907;
								}
								@Pc(1918) int local1918 = 0;
								@Pc(1934) int local1934;
								@Pc(1948) int local1948;
								if (local1208 != null) {
									local1918 = local1874 + local1208.anInt6644 + 15;
									local1934 = local1918 - local1571.anInt4041;
									if (local1876 > local1934) {
										local1876 = local1934;
									}
									local1948 = local1918 + local1571.anInt4042;
									if (local1880 < local1948) {
										local1880 = local1948;
									}
								}
								local1934 = 255;
								if (local1170.anInt6648 >= 0) {
									local1934 = (local1798 << 8) / (local1170.anInt6657 - local1170.anInt6648);
								}
								if (local1934 >= 0 && local1934 < 255) {
									local1948 = local1934 << 24;
									@Pc(1987) int local1987 = local1948 | 0xFFFFFF;
									if (local1353 != null) {
										local1353.method7616(local1863 - local1318, local1874, 0, local1987, 1);
									}
									if (local1413 != null) {
										local1413.method7616(local1863 + local1703 - local1322, local1874, 0, local1987, 1);
									}
									@Pc(2024) int local2024;
									if (local1384 != null) {
										for (local2024 = 0; local2024 < local1665; local2024++) {
											local1384.method7616(local2024 * local1312 + local1714 + local1863 - local1320, local1874, 0, local1987, 1);
										}
									}
									if (local1438 != null) {
										local1438.method7616(local1863 + local1728 - local1324, local1874, 0, local1987, 1);
									}
									local1562.method9131(0, local1887, local1170.anInt6665 | local1948, local1863 + local1716, local1643);
									if (local1208 != null) {
										if (local1326 != null) {
											local1326.method7616(local1751 + local1863 - local1342, local1874, 0, local1987, 1);
										}
										if (local1330 != null) {
											local1330.method7616(local1863 + local1753 - local1346, local1874, 0, local1987, 1);
										}
										if (local1328 != null) {
											for (local2024 = 0; local2024 < local1678; local2024++) {
												local1328.method7616(local1755 + local1863 + local2024 * local1336 - local1344, local1874, 0, local1987, 1);
											}
										}
										if (local1332 != null) {
											local1332.method7616(local1757 + local1863 - local1348, local1874, 0, local1987, 1);
										}
										local1564.method9131(0, local1918, local1948 | local1208.anInt6665, local1863 + local1759, local1631);
									}
								} else {
									if (local1353 != null) {
										local1353.method7637(local1863 - local1318, local1874);
									}
									if (local1413 != null) {
										local1413.method7637(local1863 + local1703 - local1322, local1874);
									}
									if (local1384 != null) {
										for (local1948 = 0; local1948 < local1665; local1948++) {
											local1384.method7637(local1312 * local1948 + local1863 + local1714 - local1320, local1874);
										}
									}
									if (local1438 != null) {
										local1438.method7637(local1863 + local1728 - local1324, local1874);
									}
									local1562.method9131(0, local1887, local1170.anInt6665 | 0xFF000000, local1863 + local1716, local1643);
									if (local1208 != null) {
										if (local1326 != null) {
											local1326.method7637(local1863 + local1751 - local1342, local1874);
										}
										if (local1330 != null) {
											local1330.method7637(local1753 + local1863 - local1346, local1874);
										}
										if (local1328 != null) {
											for (local1948 = 0; local1948 < local1678; local1948++) {
												local1328.method7637(local1755 + local1863 + local1336 * local1948 - local1344, local1874);
											}
										}
										if (local1332 != null) {
											local1332.method7637(local1863 + local1757 - local1348, local1874);
										}
										local1564.method9131(0, local1918, local1208.anInt6665 | 0xFF000000, local1863 + local1759, local1631);
									}
								}
								Static218.method3251(local1880 + 1, local1863, local1863 + local1692, local1876);
							}
						}
					}
				}
			}
		}
		@Pc(2383) int local2383;
		for (@Pc(2377) int local2377 = 0; local2377 < Static94.anInt2117; local2377++) {
			local2383 = Static83.anIntArray793[local2377];
			@Pc(2390) Class9_Sub1_Sub1_Sub2 local2390;
			if (local2383 < 2048) {
				local2390 = Static19.aClass9_Sub1_Sub1_Sub2_Sub1Array1[local2383];
			} else {
				local2390 = ((Class3_Sub52) Static94.aClass313_8.method7104((long) (local2383 - 2048))).aClass9_Sub1_Sub1_Sub2_Sub2_2;
			}
			local243 = Static308.anIntArray368[local2377];
			@Pc(2413) Class9_Sub1_Sub1_Sub2 local2413;
			if (local243 < 2048) {
				local2413 = Static19.aClass9_Sub1_Sub1_Sub2_Sub1Array1[local243];
			} else {
				local2413 = ((Class3_Sub52) Static94.aClass313_8.method7104((long) (local243 - 2048))).aClass9_Sub1_Sub1_Sub2_Sub2_2;
			}
			Static499.method6813(arg1, local2413, arg2, local2390, arg0, arg3, --local2390.anInt8762);
		}
		local2383 = Static677.aClass169_12.anInt4042 + Static677.aClass169_12.anInt4041 + 2;
		for (local221 = 0; local221 < Static140.anInt2618; local221++) {
			local243 = Static434.anIntArray763[local221];
			local1163 = Static434.anIntArray762[local221];
			local492 = Static434.anIntArray764[local221];
			@Pc(2480) boolean local2480 = true;
			while (local2480) {
				local2480 = false;
				for (local610 = 0; local610 < local221; local610++) {
					if (local1163 + 2 > Static434.anIntArray762[local610] - local2383 && Static434.anIntArray762[local610] + 2 > -local2383 + local1163 && Static434.anIntArray763[local610] + Static434.anIntArray764[local610] > -local492 + local243 && Static434.anIntArray763[local610] - Static434.anIntArray764[local610] < local243 + local492 && local1163 > Static434.anIntArray762[local610] - local2383) {
						local1163 = Static434.anIntArray762[local610] - local2383;
						local2480 = true;
					}
				}
			}
			Static434.anIntArray762[local221] = local1163;
			@Pc(2589) String local2589 = Static434.aClass279Array6[local221].method6372();
			local297 = Static677.aClass169_12.method3653(local2589);
			local381 = local243 + arg1;
			local384 = local1163 + arg0 - Static677.aClass169_12.anInt4041;
			local1263 = local297 + local381;
			@Pc(2617) int local2617 = local1163 + arg0 + Static677.aClass169_12.anInt4042;
			if (Static712.anInt2538 == 0) {
				@Pc(2649) int local2649 = 16776960;
				@Pc(2655) int local2655 = Static434.aClass279Array6[local221].method6374();
				if (local2655 < 6) {
					local2649 = Static412.anIntArray486[local2655];
				}
				if (local2655 == 6) {
					local2649 = Static247.anInt3877 % 20 < 10 ? 16711680 : 16776960;
				}
				if (local2655 == 7) {
					local2649 = Static247.anInt3877 % 20 >= 10 ? 65535 : 255;
				}
				if (local2655 == 8) {
					local2649 = Static247.anInt3877 % 20 < 10 ? 45056 : 8454016;
				}
				@Pc(2733) int local2733;
				if (local2655 == 9) {
					local2733 = 150 - Static434.aClass279Array6[local221].method6376() * 150 / Static434.aClass279Array6[local221].method6375();
					if (local2733 < 50) {
						local2649 = local2733 * 1280 + 16711680;
					} else if (local2733 < 100) {
						local2649 = 16776960 - (local2733 - 50) * 327680;
					} else if (local2733 < 150) {
						local2649 = local2733 * 5 + 65280 - 500;
					}
				}
				if (local2655 == 10) {
					local2733 = 150 - Static434.aClass279Array6[local221].method6376() * 150 / Static434.aClass279Array6[local221].method6375();
					if (local2733 < 50) {
						local2649 = local2733 * 5 + 16711680;
					} else if (local2733 < 100) {
						local2649 = 16711935 - (local2733 - 50) * 327680;
					} else if (local2733 < 150) {
						local2649 = (local2733 - 100) * 327680 + 255 - (local2733 + -100) * 5;
					}
				}
				if (local2655 == 11) {
					local2733 = 150 - Static434.aClass279Array6[local221].method6376() * 150 / Static434.aClass279Array6[local221].method6375();
					if (local2733 < 50) {
						local2649 = 16777215 - local2733 * 327685;
					} else if (local2733 < 100) {
						local2649 = (local2733 - 50) * 327685 + 65280;
					} else if (local2733 < 150) {
						local2649 = 32768000 + 16777215 - local2733 * 327680;
					}
				}
				local2733 = local2649 | 0xFF000000;
				local1310 = Static434.aClass279Array6[local221].method6377();
				if (local1310 == 0) {
					local381 -= local297 >> 1;
					Static561.aClass57_10.method9146(local243 + arg1, local1163 + arg0, local2733, local2589, -16777216);
					local1263 -= local297 >> 1;
				}
				if (local1310 == 1) {
					local2617 += 5;
					local381 -= local297 >> 1;
					Static561.aClass57_10.method9148(local2589, Static247.anInt3877, local243 + arg1, local2733, local1163 + arg0);
					local1263 -= local297 >> 1;
					local384 -= 5;
				}
				if (local1310 == 2) {
					local1263 -= (local297 >> 1) - 5;
					Static561.aClass57_10.method9142(local2589, arg1 + local243, Static247.anInt3877, arg0 + local1163, local2733);
					local381 -= (local297 >> 1) + 5;
					local384 -= 5;
					local2617 += 5;
				}
				if (local1310 == 3) {
					local1312 = 150 - Static434.aClass279Array6[local221].method6376() * 150 / Static434.aClass279Array6[local221].method6375();
					local1263 -= local297 >> 1;
					local384 -= 7;
					local2617 += 7;
					local381 -= local297 >> 1;
					Static561.aClass57_10.method9139(arg0 + local1163, local2733, local2589, local243 + arg1, local1312, Static247.anInt3877);
				}
				if (local1310 == 4) {
					local1312 = 150 - Static434.aClass279Array6[local221].method6376() * 150 / Static434.aClass279Array6[local221].method6375();
					local1314 = local1312 * (Static677.aClass169_12.method3653(local2589) + 100) / 150;
					Static153.aClass22_4.T(local243 + arg1 - 50, arg0, arg1 + local243 + 50, arg0 + arg2);
					Static561.aClass57_10.method9131(-16777216, local1163 + arg0, local2733, arg1 + local243 + 50 - local1314, local2589);
					local1263 += 50 - local1314;
					local381 += 50 - local1314;
					Static153.aClass22_4.KA(arg1, arg0, arg3 + arg1, arg0 - -arg2);
				}
				if (local1310 == 5) {
					local1312 = 150 - Static434.aClass279Array6[local221].method6376() * 150 / Static434.aClass279Array6[local221].method6375();
					local1314 = 0;
					if (local1312 < 25) {
						local1314 = local1312 - 25;
					} else if (local1312 > 125) {
						local1314 = local1312 - 125;
					}
					local1316 = Static677.aClass169_12.anInt4042 + Static677.aClass169_12.anInt4041;
					Static153.aClass22_4.T(arg1, local1163 + arg0 - local1316 - 1, arg3 + arg1, local1163 + arg0 + 5);
					local1263 -= local297 >> 1;
					local2617 += local1314;
					local384 += local1314;
					local381 -= local297 >> 1;
					Static561.aClass57_10.method9146(local243 + arg1, local1314 + local1163 + arg0, local2733, local2589, -16777216);
					Static153.aClass22_4.KA(arg1, arg0, arg1 + arg3, arg2 + arg0);
				}
			} else {
				Static561.aClass57_10.method9146(local243 + arg1, local1163 + arg0, -256, local2589, -16777216);
				local381 -= local297 >> 1;
				local1263 -= local297 >> 1;
			}
			Static218.method3251(local2617 + 1, local381, local1263 + 1, local384);
		}
		if (126 <= 44) {
			method6858(-72);
		}
	}

	@OriginalMember(owner = "client!pka", name = "a", descriptor = "(IIII)V")
	public static void method6857(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = arg2 * Static580.aClass3_Sub22_24.aClass21_Sub16_4.method5404() >> 8;
		if (local8 == 0 || arg0 == -1) {
			return;
		}
		if (!Static627.aBoolean651 && Static659.anInt10097 != -1 && Static38.method1145() && !Static426.method5678()) {
			Static638.aClass3_Sub33_Sub3_3 = Static523.method7004();
			@Pc(49) Class3_Sub33_Sub3 local49 = Static551.method7224(Static638.aClass3_Sub33_Sub3_3);
			Static666.method8675(local49);
		}
		Static356.method4981(local8, Static372.aClass182_80, arg0);
		Static592.method7648(-1, 255);
		Static627.aBoolean651 = true;
	}
}
