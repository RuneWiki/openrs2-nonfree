import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!fu", name = "e", descriptor = "I")
	public static int anInt3961;

	@OriginalMember(owner = "client!fu", name = "f", descriptor = "[[Lclient!pg;")
	public static Class260[][] aClass260ArrayArray1;

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "Lclient!qia;")
	public static Class276 aClass276_29 = new Class276();

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(IIIIIII)V")
	public static void method3465(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = Static385.anInt10557;
		@Pc(9) int[] local9 = Static493.anIntArray555;
		Static243.anInt5482 = 0;
		@Pc(183) int local183;
		@Pc(228) int local228;
		@Pc(277) int local277;
		@Pc(349) int local349;
		@Pc(352) int local352;
		@Pc(1143) int local1143;
		@Pc(1188) int local1188;
		@Pc(1190) int local1190;
		@Pc(438) int local438;
		@Pc(1051) int local1051;
		@Pc(577) int local577;
		for (@Pc(13) int local13 = 0; local13 < local7 + Static377.anInt7132; local13++) {
			@Pc(22) Class22 local22 = null;
			@Pc(38) Class2_Sub3_Sub1_Sub2 local38;
			if (local13 >= local7) {
				local38 = ((Class3_Sub49) Static60.aClass307_6.method7424((long) Static176.anIntArray229[local13 - local7])).aClass2_Sub3_Sub1_Sub2_Sub1_2;
				local22 = ((Class2_Sub3_Sub1_Sub2_Sub1) local38).aClass22_1;
				if (local22.anIntArray29 != null) {
					local22 = local22.method425(Static514.aClass166_1);
					if (local22 == null) {
						continue;
					}
				}
			} else {
				local38 = Static393.aClass2_Sub3_Sub1_Sub2_Sub2Array2[local9[local13]];
			}
			if (local38.anInt6342 >= 0 && (Static469.anInt8476 == local38.anInt6316 || Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.aByte128 == local38.aByte128)) {
				Static414.method6478(arg3 >> 1, local38, local38.method5306(), arg1 >> 1);
				if (Static379.anIntArray437[0] >= 0) {
					if (local38.aString66 != null && (local7 <= local13 || Static32.anInt606 == 0 || Static32.anInt606 == 3 || Static32.anInt606 == 1 && Static203.method3963(((Class2_Sub3_Sub1_Sub2_Sub2) local38).aString68)) && Static243.anInt5482 < Static453.anInt8226) {
						Static453.anIntArray516[Static243.anInt5482] = Static224.aClass315_11.method7572(local38.aString66) / 2;
						Static453.anIntArray519[Static243.anInt5482] = Static379.anIntArray437[0];
						Static453.anIntArray520[Static243.anInt5482] = Static379.anIntArray437[1];
						Static453.anIntArray514[Static243.anInt5482] = local38.anInt6332;
						Static453.anIntArray515[Static243.anInt5482] = local38.anInt6291;
						Static453.anIntArray517[Static243.anInt5482] = local38.anInt6282;
						Static453.aStringArray32[Static243.anInt5482] = local38.aString66;
						Static243.anInt5482++;
					}
					local183 = Static379.anIntArray437[1] + arg2;
					@Pc(262) Class5[] local262;
					@Pc(269) Class28[] local269;
					@Pc(321) Class5 local321;
					if (local38.aBoolean533 || local38.anInt6305 <= Static251.anInt5580) {
						local183 -= Math.max(Static224.aClass315_11.anInt9174, Static622.aClass5Array18[0].method7580());
					} else {
						@Pc(210) byte local210 = 1;
						if (local7 > local13) {
							@Pc(223) Class2_Sub3_Sub1_Sub2_Sub2 local223 = Static393.aClass2_Sub3_Sub1_Sub2_Sub2Array2[local9[local13]];
							local228 = local38.method5304().anInt7182;
							if (local223.aBoolean540) {
								local210 = 2;
							}
						} else {
							local228 = local22.anInt391;
							if (local228 == -1) {
								local228 = local38.method5304().anInt7182;
							}
						}
						@Pc(249) Class5[] local249 = Static622.aClass5Array18;
						if (local228 != -1) {
							local262 = (Class5[]) Static557.aClass112_60.method3640((long) local228);
							if (local262 == null) {
								local269 = Static649.method607(Static150.aClass181_34, local228);
								if (local269 != null) {
									local262 = new Class5[local269.length];
									for (local277 = 0; local277 < local269.length; local277++) {
										local262[local277] = Static47.aClass33_3.method6161(local269[local277], true);
									}
									Static557.aClass112_60.method3636((long) local228, local262);
								}
							}
							if (local262 != null && local262.length >= 2) {
								local249 = local262;
							}
						}
						if (local210 >= local249.length) {
							local210 = 1;
						}
						@Pc(317) Class5 local317 = local249[0];
						local321 = local249[local210];
						local183 -= Math.max(Static224.aClass315_11.anInt9174, local317.method7580());
						local277 = Static379.anIntArray437[0] + arg0 - (local317.method7588() >> 1);
						local349 = local317.method7588() * local38.anInt6262 / 255;
						local352 = local317.method7580();
						if (local38.anInt6262 > 0 && local349 < 2) {
							local349 = 2;
						}
						local317.method7577(local277, local183);
						Static47.aClass33_3.T(local277, local183, local277 + local349, local183 - -local352);
						local321.method7577(local277, local183);
						Static47.aClass33_3.KA(arg0, arg2, arg3 + arg0, arg1 + arg2);
						Static241.method4616(local352 + local183, local183, local317.method7589() + local277, local277);
					}
					local183 -= 2;
					if (!local38.aBoolean533) {
						@Pc(421) Class5 local421;
						@Pc(430) Class5 local430;
						if (Static251.anInt5580 < local38.anInt6320) {
							local421 = Static417.aClass5Array11[local38.aBoolean532 ? 2 : 0];
							local430 = Static417.aClass5Array11[local38.aBoolean532 ? 3 : 1];
							if (local38 instanceof Class2_Sub3_Sub1_Sub2_Sub1) {
								local438 = local22.anInt424;
								if (local438 == -1) {
									local438 = local38.method5304().anInt7162;
								}
							} else {
								local438 = local38.method5304().anInt7162;
							}
							if (local438 != -1) {
								local262 = (Class5[]) Static150.aClass112_16.method3640((long) local438);
								if (local262 == null) {
									local269 = Static649.method607(Static150.aClass181_34, local438);
									if (local269 != null) {
										local262 = new Class5[local269.length];
										for (local277 = 0; local277 < local269.length; local277++) {
											local262[local277] = Static47.aClass33_3.method6161(local269[local277], true);
										}
										Static150.aClass112_16.method3636((long) local438, local262);
									}
								}
								if (local262 != null && local262.length == 4) {
									local430 = local262[local38.aBoolean532 ? 3 : 1];
									local421 = local262[local38.aBoolean532 ? 2 : 0];
								}
							}
							@Pc(539) int local539 = local38.anInt6320 - Static251.anInt5580;
							if (local539 > local38.anInt6338) {
								local539 -= local38.anInt6338;
								local277 = local38.anInt6286 == 0 ? 0 : (local38.anInt6334 - local539) / local38.anInt6286 * local38.anInt6286;
								local577 = local277 * local421.method7588() / local38.anInt6334;
							} else {
								local577 = local421.method7588();
							}
							local277 = local421.method7580();
							local183 -= local277;
							local349 = arg0 + Static379.anIntArray437[0] - (local421.method7588() >> 1);
							local421.method7577(local349, local183);
							Static47.aClass33_3.T(local349, local183, local349 + local577, local277 + local183);
							local430.method7577(local349, local183);
							Static47.aClass33_3.KA(arg0, arg2, arg0 + arg3, arg2 - -arg1);
							Static241.method4616(local183 + local277, local183, local349 + local421.method7589(), local349);
							local183 -= 2;
						}
						if (local13 < local7) {
							@Pc(716) Class2_Sub3_Sub1_Sub2_Sub2 local716 = (Class2_Sub3_Sub1_Sub2_Sub2) local38;
							if (local716.anInt6378 != -1) {
								local183 -= 25;
								local430 = Static214.aClass5Array9[local716.anInt6378];
								local430.method7577(Static379.anIntArray437[0] + arg0 - 12, local183);
								Static241.method4616(local430.method7585() + local183, local183, arg0 + Static379.anIntArray437[0] + local430.method7589() - 12, Static379.anIntArray437[0] + (arg0 - 12));
								local183 -= 2;
							}
							if (local716.anInt6351 != -1) {
								local183 -= 25;
								local430 = Static488.aClass5Array16[local716.anInt6351];
								local430.method7577(arg0 + Static379.anIntArray437[0] - 12, local183);
								Static241.method4616(local183 + local430.method7585(), local183, Static379.anIntArray437[0] + arg0 + local430.method7589() - 12, Static379.anIntArray437[0] + arg0 - 12);
								local183 -= 2;
							}
						} else if (local22.anInt398 >= 0 && Static488.aClass5Array16.length > local22.anInt398) {
							local183 -= 25;
							local421 = Static488.aClass5Array16[local22.anInt398];
							local421.method7577(Static379.anIntArray437[0] + arg0 - (local421.method7588() >> 1), local183);
							Static241.method4616(local421.method7585() + local183, local183, Static379.anIntArray437[0] + arg0 - (local421.method7588() >> 1) + local421.method7589(), arg0 - -Static379.anIntArray437[0] - (local421.method7588() >> 1));
							local183 -= 2;
						}
					}
					@Pc(818) Class369[] local818;
					@Pc(826) Class369 local826;
					if (!(local38 instanceof Class2_Sub3_Sub1_Sub2_Sub2)) {
						local228 = 0;
						local818 = Static253.aClass369Array1;
						for (local438 = 0; local438 < local818.length; local438++) {
							local826 = local818[local438];
							if (local826 != null && local826.anInt10333 == 1 && local826.anInt10340 == Static176.anIntArray229[local13 - local7]) {
								local321 = Static474.aClass5Array14[local826.anInt10337];
								if (local228 < local321.method7580()) {
									local228 = local321.method7580();
								}
								if (Static251.anInt5580 % 20 < 10) {
									local321.method7577(arg0 + Static379.anIntArray437[0] - 12, -local321.method7580() + local183);
									Static241.method4616(local183 - local321.method7580() + local321.method7585(), local183 + -local321.method7580(), Static379.anIntArray437[0] + arg0 + local321.method7589() - 12, arg0 - -Static379.anIntArray437[0] + -12);
								}
							}
						}
						if (local228 > 0) {
						}
					} else if (local13 >= 0) {
						local228 = 0;
						local818 = Static253.aClass369Array1;
						for (local438 = 0; local438 < local818.length; local438++) {
							local826 = local818[local438];
							if (local826 != null && local826.anInt10333 == 10 && local9[local13] == local826.anInt10340) {
								local321 = Static474.aClass5Array14[local826.anInt10337];
								if (local228 < local321.method7580()) {
									local228 = local321.method7580();
								}
								local321.method7577(arg0 + Static379.anIntArray437[0] - 12, -local321.method7580() + local183);
								Static241.method4616(local183 - local321.method7580() + local321.method7585(), local183 + -local321.method7580(), arg0 + Static379.anIntArray437[0] + local321.method7589() - 12, arg0 + -12 + Static379.anIntArray437[0]);
							}
						}
						if (local228 > 0) {
						}
					}
					for (local228 = 0; local228 < Static445.anInt8058; local228++) {
						local1051 = local38.anIntArray368[local228];
						local438 = local38.anIntArray375[local228];
						@Pc(1058) Class301 local1058 = null;
						local577 = 0;
						if (local438 >= 0) {
							if (Static251.anInt5580 >= local1051) {
								continue;
							}
							local1058 = Static203.aClass306_1.method7417(local38.anIntArray375[local228]);
							local577 = local1058.anInt8959;
						} else if (local1051 < 0) {
							continue;
						}
						local277 = local38.anIntArray370[local228];
						@Pc(1092) Class301 local1092 = null;
						if (local277 >= 0) {
							local1092 = Static203.aClass306_1.method7417(local277);
						}
						if (local1051 - local577 <= Static251.anInt5580) {
							local352 = local38.anIntArray371[local228];
							if (local352 >= 0) {
								local38.anInt6262 = local352;
								local38.anInt6305 = Static251.anInt5580 + 300;
								local38.anIntArray371[local228] = -1;
							}
							if (local1058 == null) {
								local38.anIntArray368[local228] = -1;
							} else {
								local1143 = local38.method5306() / 2;
								Static414.method6478(arg3 >> 1, local38, local1143, arg1 >> 1);
								if (Static379.anIntArray437[0] > -1) {
									Static379.anIntArray437[0] += Static152.anIntArray203[local228];
									Static379.anIntArray437[1] += Static191.anIntArray241[local228];
									local1188 = 0;
									local1190 = 0;
									@Pc(1192) int local1192 = 0;
									@Pc(1194) int local1194 = 0;
									@Pc(1196) int local1196 = 0;
									@Pc(1198) int local1198 = 0;
									@Pc(1200) int local1200 = 0;
									@Pc(1202) int local1202 = 0;
									@Pc(1204) Class5 local1204 = null;
									@Pc(1206) Class5 local1206 = null;
									@Pc(1208) Class5 local1208 = null;
									@Pc(1210) Class5 local1210 = null;
									@Pc(1212) int local1212 = 0;
									@Pc(1214) int local1214 = 0;
									@Pc(1216) int local1216 = 0;
									@Pc(1218) int local1218 = 0;
									@Pc(1220) int local1220 = 0;
									@Pc(1222) int local1222 = 0;
									@Pc(1224) int local1224 = 0;
									@Pc(1226) int local1226 = 0;
									@Pc(1228) int local1228 = 0;
									@Pc(1233) Class5 local1233 = local1058.method7391(Static47.aClass33_3);
									@Pc(1241) int local1241;
									if (local1233 != null) {
										local1188 = local1233.method7588();
										local1241 = local1233.method7580();
										local1233.method7597(Static510.anIntArray564);
										if (local1241 > 0) {
											local1228 = local1241;
										}
										local1196 = Static510.anIntArray564[0];
									}
									@Pc(1262) Class5 local1262 = local1058.method7386(Static47.aClass33_3);
									if (local1262 != null) {
										local1190 = local1262.method7588();
										local1241 = local1262.method7580();
										local1262.method7597(Static510.anIntArray564);
										if (local1241 > local1228) {
											local1228 = local1241;
										}
										local1198 = Static510.anIntArray564[0];
									}
									@Pc(1293) Class5 local1293 = local1058.method7387(Static47.aClass33_3);
									if (local1293 != null) {
										local1192 = local1293.method7588();
										local1241 = local1293.method7580();
										if (local1228 < local1241) {
											local1228 = local1241;
										}
										local1293.method7597(Static510.anIntArray564);
										local1200 = Static510.anIntArray564[0];
									}
									@Pc(1322) Class5 local1322 = local1058.method7385(Static47.aClass33_3);
									if (local1322 != null) {
										local1194 = local1322.method7588();
										local1241 = local1322.method7580();
										if (local1228 < local1241) {
											local1228 = local1241;
										}
										local1322.method7597(Static510.anIntArray564);
										local1202 = Static510.anIntArray564[0];
									}
									if (local1092 != null) {
										local1204 = local1092.method7391(Static47.aClass33_3);
										if (local1204 != null) {
											local1212 = local1204.method7588();
											local1241 = local1204.method7580();
											if (local1241 > local1228) {
												local1228 = local1241;
											}
											local1204.method7597(Static510.anIntArray564);
											local1220 = Static510.anIntArray564[0];
										}
										local1206 = local1092.method7386(Static47.aClass33_3);
										if (local1206 != null) {
											local1214 = local1206.method7588();
											local1241 = local1206.method7580();
											if (local1241 > local1228) {
												local1228 = local1241;
											}
											local1206.method7597(Static510.anIntArray564);
											local1222 = Static510.anIntArray564[0];
										}
										local1208 = local1092.method7387(Static47.aClass33_3);
										if (local1208 != null) {
											local1216 = local1208.method7588();
											local1241 = local1208.method7580();
											if (local1228 < local1241) {
												local1228 = local1241;
											}
											local1208.method7597(Static510.anIntArray564);
											local1224 = Static510.anIntArray564[0];
										}
										local1210 = local1092.method7385(Static47.aClass33_3);
										if (local1210 != null) {
											local1218 = local1210.method7588();
											local1241 = local1210.method7580();
											if (local1241 > local1228) {
												local1228 = local1241;
											}
											local1210.method7597(Static510.anIntArray564);
											local1226 = Static510.anIntArray564[0];
										}
									}
									@Pc(1450) Class25 local1450 = Static641.aClass25_14;
									@Pc(1452) Class25 local1452 = Static641.aClass25_14;
									@Pc(1454) Class315 local1454 = Static89.aClass315_7;
									@Pc(1456) Class315 local1456 = Static89.aClass315_7;
									local1241 = local1058.anInt8960;
									@Pc(1472) Class25 local1472;
									@Pc(1477) Class315 local1477;
									if (local1241 >= 0) {
										local1472 = Static627.method8493(true, local1241, Static47.aClass33_3);
										local1477 = Static56.method8352(local1241, Static47.aClass33_3);
										if (local1472 != null && local1477 != null) {
											local1450 = local1472;
											local1454 = local1477;
										}
									}
									if (local1092 != null) {
										local1241 = local1092.anInt8960;
										if (local1241 >= 0) {
											local1472 = Static627.method8493(true, local1241, Static47.aClass33_3);
											local1477 = Static56.method8352(local1241, Static47.aClass33_3);
											if (local1472 != null && local1477 != null) {
												local1452 = local1472;
												local1456 = local1477;
											}
										}
									}
									@Pc(1515) String local1515 = null;
									@Pc(1525) String local1525 = local1058.method7388(local38.anIntArray374[local228]);
									@Pc(1527) int local1527 = 0;
									@Pc(1532) int local1532 = local1454.method7572(local1525);
									if (local1092 != null) {
										local1515 = local1092.method7388(local38.anIntArray369[local228]);
										local1527 = local1456.method7572(local1515);
									}
									@Pc(1549) int local1549 = 0;
									@Pc(1551) int local1551 = 0;
									if (local1190 > 0) {
										local1549 = local1532 / local1190 + 1;
									}
									if (local1092 != null && local1214 > 0) {
										local1551 = local1527 / local1214 + 1;
									}
									@Pc(1574) int local1574 = 0;
									if (local1188 > 0) {
										local1574 = local1188;
									}
									local1574 += 2;
									@Pc(1585) int local1585 = local1574;
									if (local1192 > 0) {
										local1574 += local1192;
									}
									@Pc(1596) int local1596 = local1574;
									@Pc(1598) int local1598 = local1574;
									@Pc(1604) int local1604;
									if (local1190 > 0) {
										local1604 = local1190 * local1549;
										local1598 = local1574 + (local1604 - local1532) / 2;
										local1574 += local1604;
									} else {
										local1574 += local1532;
									}
									local1604 = local1574;
									if (local1194 > 0) {
										local1574 += local1194;
									}
									@Pc(1636) int local1636 = 0;
									@Pc(1638) int local1638 = 0;
									@Pc(1640) int local1640 = 0;
									@Pc(1642) int local1642 = 0;
									@Pc(1644) int local1644 = 0;
									@Pc(1683) int local1683;
									if (local1092 != null) {
										local1574 += 2;
										local1636 = local1574;
										if (local1212 > 0) {
											local1574 += local1212;
										}
										local1574 += 2;
										local1638 = local1574;
										if (local1216 > 0) {
											local1574 += local1216;
										}
										local1644 = local1574;
										local1640 = local1574;
										if (local1214 <= 0) {
											local1574 += local1527;
										} else {
											local1683 = local1551 * local1214;
											local1644 = local1574 + (local1683 - local1527) / 2;
											local1574 += local1683;
										}
										local1642 = local1574;
										if (local1218 > 0) {
											local1574 += local1218;
										}
									}
									local1683 = local38.anIntArray368[local228] - Static251.anInt5580;
									@Pc(1727) int local1727 = local1058.anInt8970 - local1058.anInt8970 * local1683 / local1058.anInt8959;
									@Pc(1739) int local1739 = local1683 * local1058.anInt8962 / local1058.anInt8959 - local1058.anInt8962;
									@Pc(1753) int local1753 = arg0 + Static379.anIntArray437[0] + local1727 - (local1574 >> 1);
									@Pc(1764) int local1764 = local1739 + arg2 + Static379.anIntArray437[1] - 12;
									@Pc(1766) int local1766 = local1764;
									@Pc(1770) int local1770 = local1228 + local1764;
									@Pc(1777) int local1777 = local1058.anInt8965 + local1764 + 15;
									@Pc(1782) int local1782 = local1777 - local1454.anInt9174;
									@Pc(1787) int local1787 = local1454.anInt9180 + local1777;
									if (local1764 > local1782) {
										local1766 = local1782;
									}
									if (local1770 < local1787) {
										local1770 = local1787;
									}
									@Pc(1803) int local1803 = 0;
									@Pc(1818) int local1818;
									@Pc(1832) int local1832;
									if (local1092 != null) {
										local1803 = local1092.anInt8965 + local1764 + 15;
										local1818 = local1803 - local1456.anInt9174;
										if (local1818 < local1766) {
											local1766 = local1818;
										}
										local1832 = local1456.anInt9180 + local1803;
										if (local1832 > local1770) {
											local1770 = local1832;
										}
									}
									local1818 = 255;
									if (local1058.anInt8964 >= 0) {
										local1818 = (local1683 << 8) / (local1058.anInt8959 - local1058.anInt8964);
									}
									if (local1818 >= 0 && local1818 < 255) {
										local1832 = local1818 << 24;
										@Pc(2025) int local2025 = local1832 | 0xFFFFFF;
										if (local1233 != null) {
											local1233.method7595(local1753 - local1196, local1764, 0, local2025, 1);
										}
										if (local1293 != null) {
											local1293.method7595(local1753 + local1585 - local1200, local1764, 0, local2025, 1);
										}
										@Pc(2058) int local2058;
										if (local1262 != null) {
											for (local2058 = 0; local2058 < local1549; local2058++) {
												local1262.method7595(local1190 * local2058 + local1753 + local1596 - local1198, local1764, 0, local2025, 1);
											}
										}
										if (local1322 != null) {
											local1322.method7595(local1753 + local1604 - local1202, local1764, 0, local2025, 1);
										}
										local1450.method5838(local1832 | local1058.anInt8966, 0, local1525, local1598 + local1753, local1777);
										if (local1092 != null) {
											if (local1204 != null) {
												local1204.method7595(local1753 + local1636 - local1220, local1764, 0, local2025, 1);
											}
											if (local1208 != null) {
												local1208.method7595(local1638 + local1753 - local1224, local1764, 0, local2025, 1);
											}
											if (local1206 != null) {
												for (local2058 = 0; local2058 < local1551; local2058++) {
													local1206.method7595(local1640 + local1753 + local2058 * local1214 - local1222, local1764, 0, local2025, 1);
												}
											}
											if (local1210 != null) {
												local1210.method7595(local1753 + local1642 - local1226, local1764, 0, local2025, 1);
											}
											local1452.method5838(local1832 | local1092.anInt8966, 0, local1515, local1644 + local1753, local1803);
										}
									} else {
										if (local1233 != null) {
											local1233.method7577(local1753 - local1196, local1764);
										}
										if (local1293 != null) {
											local1293.method7577(local1585 + local1753 - local1200, local1764);
										}
										if (local1262 != null) {
											for (local1832 = 0; local1832 < local1549; local1832++) {
												local1262.method7577(local1753 + local1596 + local1832 * local1190 - local1198, local1764);
											}
										}
										if (local1322 != null) {
											local1322.method7577(local1753 + local1604 - local1202, local1764);
										}
										local1450.method5838(local1058.anInt8966 | 0xFF000000, 0, local1525, local1598 + local1753, local1777);
										if (local1092 != null) {
											if (local1204 != null) {
												local1204.method7577(local1753 + local1636 - local1220, local1764);
											}
											if (local1208 != null) {
												local1208.method7577(local1638 + local1753 - local1224, local1764);
											}
											if (local1206 != null) {
												for (local1832 = 0; local1832 < local1551; local1832++) {
													local1206.method7577(local1832 * local1214 + local1640 + local1753 - local1222, local1764);
												}
											}
											if (local1210 != null) {
												local1210.method7577(local1753 + local1642 - local1226, local1764);
											}
											local1452.method5838(local1092.anInt8966 | 0xFF000000, 0, local1515, local1644 + local1753, local1803);
										}
									}
									Static241.method4616(local1770 + 1, local1766, local1574 + local1753, local1753);
								}
							}
						}
					}
				}
			}
		}
		@Pc(2227) int local2227;
		for (@Pc(2221) int local2221 = 0; local2221 < Static383.anInt7281; local2221++) {
			local2227 = Static351.anIntArray398[local2221];
			@Pc(2242) Class2_Sub3_Sub1_Sub2 local2242;
			if (local2227 >= 2048) {
				local2242 = ((Class3_Sub49) Static60.aClass307_6.method7424((long) (local2227 - 2048))).aClass2_Sub3_Sub1_Sub2_Sub1_2;
			} else {
				local2242 = Static393.aClass2_Sub3_Sub1_Sub2_Sub2Array2[local2227];
			}
			local228 = Static442.anIntArray500[local2221];
			@Pc(2261) Class2_Sub3_Sub1_Sub2 local2261;
			if (local228 < 2048) {
				local2261 = Static393.aClass2_Sub3_Sub1_Sub2_Sub2Array2[local228];
			} else {
				local2261 = ((Class3_Sub49) Static60.aClass307_6.method7424((long) (local228 - 2048))).aClass2_Sub3_Sub1_Sub2_Sub1_2;
			}
			Static380.method6047(arg2, arg3, local2261, --local2242.anInt6269, arg1, arg0, local2242);
		}
		local2227 = Static224.aClass315_11.anInt9180 + Static224.aClass315_11.anInt9174 + 2;
		for (local183 = 0; local183 < Static243.anInt5482; local183++) {
			local228 = Static453.anIntArray519[local183];
			local1051 = Static453.anIntArray520[local183];
			local438 = Static453.anIntArray516[local183];
			@Pc(2324) boolean local2324 = true;
			while (local2324) {
				local2324 = false;
				for (local577 = 0; local577 < local183; local577++) {
					if (Static453.anIntArray520[local577] - local2227 < local1051 + 2 && Static453.anIntArray520[local577] + 2 > local1051 + -local2227 && local228 - local438 < Static453.anIntArray516[local577] + Static453.anIntArray519[local577] && local228 + local438 > Static453.anIntArray519[local577] - Static453.anIntArray516[local577] && local1051 > Static453.anIntArray520[local577] - local2227) {
						local1051 = Static453.anIntArray520[local577] - local2227;
						local2324 = true;
					}
				}
			}
			Static453.anIntArray520[local183] = local1051;
			@Pc(2425) String local2425 = Static453.aStringArray32[local183];
			local277 = Static224.aClass315_11.method7572(local2425);
			local349 = arg0 + local228;
			local352 = arg2 + local1051 - Static224.aClass315_11.anInt9174;
			local1143 = local277 + local349;
			@Pc(2458) int local2458 = arg2 + local1051 + Static224.aClass315_11.anInt9180;
			if (Static205.anInt4772 == 0) {
				@Pc(2465) int local2465 = 16776960;
				if (Static453.anIntArray514[local183] < 6) {
					local2465 = Static47.anIntArray50[Static453.anIntArray514[local183]];
				}
				if (Static453.anIntArray514[local183] == 6) {
					local2465 = Static469.anInt8476 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static453.anIntArray514[local183] == 7) {
					local2465 = Static469.anInt8476 % 20 < 10 ? 255 : 65535;
				}
				if (Static453.anIntArray514[local183] == 8) {
					local2465 = Static469.anInt8476 % 20 < 10 ? 45056 : 8454016;
				}
				@Pc(2538) int local2538;
				if (Static453.anIntArray514[local183] == 9) {
					local2538 = 150 - Static453.anIntArray517[local183];
					if (local2538 < 50) {
						local2465 = local2538 * 1280 + 16711680;
					} else if (local2538 < 100) {
						local2465 = 16776960 - (local2538 - 50) * 327680;
					} else if (local2538 < 150) {
						local2465 = (local2538 - 100) * 5 + 65280;
					}
				}
				if (Static453.anIntArray514[local183] == 10) {
					local2538 = 150 - Static453.anIntArray517[local183];
					if (local2538 < 50) {
						local2465 = local2538 * 5 + 16711680;
					} else if (local2538 < 100) {
						local2465 = 16711935 - (local2538 - 50) * 327680;
					} else if (local2538 < 150) {
						local2465 = (local2538 + -100) * 327680 + 255 - (local2538 - 100) * 5;
					}
				}
				if (Static453.anIntArray514[local183] == 11) {
					local2538 = 150 - Static453.anIntArray517[local183];
					if (local2538 < 50) {
						local2465 = 16777215 - local2538 * 327685;
					} else if (local2538 < 100) {
						local2465 = local2538 * 327685 + 65280 - 16384250;
					} else if (local2538 < 150) {
						local2465 = 16777215 - (local2538 - 100) * 327680;
					}
				}
				local2538 = local2465 | 0xFF000000;
				if (Static453.anIntArray515[local183] == 0) {
					local349 -= local277 >> 1;
					local1143 -= local277 >> 1;
					Static16.aClass25_1.method5843(arg2 + local1051, -16777216, local2538, local2425, arg0 + local228);
				}
				if (Static453.anIntArray515[local183] == 1) {
					local2458 += 5;
					local352 -= 5;
					local349 -= local277 >> 1;
					local1143 -= local277 >> 1;
					Static16.aClass25_1.method5842(local228 + arg0, Static469.anInt8476, arg2 + local1051, local2425, local2538);
				}
				if (Static453.anIntArray515[local183] == 2) {
					local1143 -= (local277 >> 1) - 5;
					local2458 += 5;
					local349 -= (local277 >> 1) + 5;
					local352 -= 5;
					Static16.aClass25_1.method5855(Static469.anInt8476, local2425, local1051 + arg2, local228 + arg0, local2538);
				}
				if (Static453.anIntArray515[local183] == 3) {
					local2458 += 7;
					local352 -= 7;
					local349 -= local277 >> 1;
					Static16.aClass25_1.method5844(arg0 + local228, local2538, 150 - Static453.anIntArray517[local183], local1051 + arg2, local2425, Static469.anInt8476);
					local1143 -= local277 >> 1;
				}
				@Pc(2861) int local2861;
				if (Static453.anIntArray515[local183] == 4) {
					local2861 = (150 - Static453.anIntArray517[local183]) * (Static224.aClass315_11.method7572(local2425) + 100) / 150;
					Static47.aClass33_3.T(local228 + arg0 - 50, arg2, arg0 + local228 + 50, arg2 + arg1);
					Static16.aClass25_1.method5838(local2538, -16777216, local2425, local228 + arg0 + 50 - local2861, local1051 + arg2);
					local349 += 50 - local2861;
					local1143 += 50 - local2861;
					Static47.aClass33_3.KA(arg0, arg2, arg0 + arg3, arg1 + arg2);
				}
				if (Static453.anIntArray515[local183] == 5) {
					local2861 = 150 - Static453.anIntArray517[local183];
					local1188 = 0;
					if (local2861 < 25) {
						local1188 = local2861 - 25;
					} else if (local2861 > 125) {
						local1188 = local2861 - 125;
					}
					local1190 = Static224.aClass315_11.anInt9180 + Static224.aClass315_11.anInt9174;
					Static47.aClass33_3.T(arg0, local1051 + arg2 - local1190 - 1, arg3 + arg0, local1051 + arg2 + 5);
					Static16.aClass25_1.method5843(local1188 + local1051 + arg2, -16777216, local2538, local2425, local228 + arg0);
					local352 += local1188;
					local1143 -= local277 >> 1;
					local349 -= local277 >> 1;
					local2458 += local1188;
					Static47.aClass33_3.KA(arg0, arg2, arg0 + arg3, arg2 - -arg1);
				}
			} else {
				local1143 -= local277 >> 1;
				local349 -= local277 >> 1;
				Static16.aClass25_1.method5843(arg2 + local1051, -16777216, -256, local2425, arg0 + local228);
			}
			Static241.method4616(local2458 + 1, local352, local1143 + 1, local349);
		}
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(IZB)Ljava/lang/String;")
	public static String method3467(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		return arg1 && arg0 >= 0 ? Static43.method788(arg0, arg1) : Integer.toString(arg0);
	}
}
