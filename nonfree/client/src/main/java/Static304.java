import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static304 {

	@OriginalMember(owner = "client!kja", name = "p", descriptor = "Lclient!gda;")
	public static Class126 aClass126_148;

	@OriginalMember(owner = "client!kja", name = "x", descriptor = "I")
	public static int anInt5289;

	@OriginalMember(owner = "client!kja", name = "u", descriptor = "Lclient!vn;")
	public static final Class381 aClass381_133 = new Class381(4, -1);

	@OriginalMember(owner = "client!kja", name = "z", descriptor = "[I")
	public static final int[] anIntArray312 = new int[8];

	@OriginalMember(owner = "client!kja", name = "t", descriptor = "I")
	public static int anInt5288 = 0;

	@OriginalMember(owner = "client!kja", name = "w", descriptor = "[I")
	public static int[] anIntArray313 = new int[1];

	@OriginalMember(owner = "client!kja", name = "a", descriptor = "(IIBIIII)V")
	public static void method4755(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		@Pc(7) int local7 = Static274.anInt4921;
		Static168.anInt3265 = 0;
		@Pc(11) int[] local11 = Static605.anIntArray544;
		@Pc(214) int local214;
		@Pc(253) int local253;
		@Pc(299) int local299;
		@Pc(387) int local387;
		@Pc(390) int local390;
		@Pc(1231) int local1231;
		@Pc(1277) int local1277;
		@Pc(1279) int local1279;
		@Pc(1281) int local1281;
		@Pc(488) int local488;
		@Pc(1120) int local1120;
		@Pc(592) int local592;
		for (@Pc(13) int local13 = 0; local13 < local7 + Static438.anInt7239; local13++) {
			@Pc(17) Class105 local17 = null;
			@Pc(30) Class4_Sub1_Sub1_Sub2 local30;
			if (local7 > local13) {
				local30 = Static574.aClass4_Sub1_Sub1_Sub2_Sub1Array1[local11[local13]];
			} else {
				local30 = ((Class5_Sub9) Static677.aClass306_37.method6943((long) Static558.anIntArray500[local13 - local7])).aClass4_Sub1_Sub1_Sub2_Sub2_1;
				local17 = ((Class4_Sub1_Sub1_Sub2_Sub2) local30).aClass105_1;
				if (local17.anIntArray134 != null) {
					local17 = local17.method2622(Static23.aClass247_1);
					if (local17 == null) {
						continue;
					}
				}
			}
			if (local30.anInt6838 >= 0 && (local30.anInt6841 == Static154.anInt3001 || local30.aByte139 == Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.aByte139)) {
				Static500.method6962(local30.method5940(), arg0 >> 1, arg1 >> 1, local30);
				if (Static663.anIntArray616[0] >= 0) {
					if (local30.aString79 != null && (local13 >= local7 || Static446.anInt7316 == 0 || Static446.anInt7316 == 3 || Static446.anInt7316 == 1 && Static134.method1971(((Class4_Sub1_Sub1_Sub2_Sub1) local30).aString44)) && Static17.anInt234 > Static168.anInt3265) {
						Static17.anIntArray21[Static168.anInt3265] = Static73.aClass196_5.method4556(local30.aString79) / 2;
						Static17.anIntArray24[Static168.anInt3265] = Static663.anIntArray616[0];
						Static17.anIntArray25[Static168.anInt3265] = Static663.anIntArray616[1];
						Static17.anIntArray22[Static168.anInt3265] = local30.anInt6846;
						Static17.anIntArray23[Static168.anInt3265] = local30.anInt6860;
						Static17.anIntArray26[Static168.anInt3265] = local30.anInt6873;
						Static17.aStringArray3[Static168.anInt3265] = local30.aString79;
						Static168.anInt3265++;
					}
					local214 = Static663.anIntArray616[1] + arg2;
					@Pc(284) Class155[] local284;
					@Pc(291) Class362[] local291;
					@Pc(359) Class155 local359;
					if (local30.aBoolean455 || Static565.anInt8921 >= local30.anInt6850) {
						local214 -= Math.max(Static73.aClass196_5.anInt5054, Static630.aClass155Array21[0].method7198());
					} else {
						@Pc(239) byte local239 = 1;
						if (local7 > local13) {
							@Pc(248) Class4_Sub1_Sub1_Sub2_Sub1 local248 = Static574.aClass4_Sub1_Sub1_Sub2_Sub1Array1[local11[local13]];
							local253 = local30.method5930().anInt1921;
							if (local248.aBoolean303) {
								local239 = 2;
							}
						} else {
							local253 = local17.anInt2829;
							if (local253 == -1) {
								local253 = local30.method5930().anInt1921;
							}
						}
						@Pc(273) Class155[] local273 = Static630.aClass155Array21;
						if (local253 != -1) {
							local284 = (Class155[]) Static95.aClass168_17.method3860((long) local253);
							if (local284 == null) {
								local291 = Static692.method8280(Static27.aClass126_18, local253);
								if (local291 != null) {
									local284 = new Class155[local291.length];
									for (local299 = 0; local299 < local291.length; local299++) {
										local284[local299] = Static273.aClass100_6.method8640(local291[local299], true);
									}
									Static95.aClass168_17.method3853((long) local253, local284);
								}
							}
							if (local284 != null && local284.length >= 2) {
								local273 = local284;
							}
						}
						if (local273.length <= local239) {
							local239 = 1;
						}
						@Pc(355) Class155 local355 = local273[0];
						local359 = local273[local239];
						local214 -= Math.max(Static73.aClass196_5.anInt5054, local355.method7198());
						local299 = arg3 + Static663.anIntArray616[0] - (local355.method7213() >> 1);
						local387 = local355.method7213() * local30.lb / 255;
						local390 = local355.method7198();
						if (local30.lb > 0 && local387 < 2) {
							local387 = 2;
						}
						local355.method7202(local299, local214);
						Static273.aClass100_6.T(local299, local214, local299 + local387, local390 + local214);
						local359.method7202(local299, local214);
						Static273.aClass100_6.KA(arg3, arg2, arg0 + arg3, arg2 - -arg1);
						Static395.method5811(local214, local299 + local355.method7206(), local390 + local214, local299);
					}
					local214 -= 2;
					@Pc(599) int local599;
					if (!local30.aBoolean455) {
						@Pc(468) Class155 local468;
						@Pc(478) Class155 local478;
						if (local30.anInt6868 > Static565.anInt8921) {
							local468 = Static120.aClass155Array6[local30.aBoolean457 ? 2 : 0];
							local478 = Static120.aClass155Array6[local30.aBoolean457 ? 3 : 1];
							if (local30 instanceof Class4_Sub1_Sub1_Sub2_Sub2) {
								local488 = local17.anInt2805;
								if (local488 == -1) {
									local488 = local30.method5930().anInt1906;
								}
							} else {
								local488 = local30.method5930().anInt1906;
							}
							if (local488 != -1) {
								local284 = (Class155[]) Static250.aClass168_43.method3860((long) local488);
								if (local284 == null) {
									local291 = Static692.method8280(Static27.aClass126_18, local488);
									if (local291 != null) {
										local284 = new Class155[local291.length];
										for (local299 = 0; local299 < local291.length; local299++) {
											local284[local299] = Static273.aClass100_6.method8640(local291[local299], true);
										}
										Static250.aClass168_43.method3853((long) local488, local284);
									}
								}
								if (local284 != null && local284.length == 4) {
									local468 = local284[local30.aBoolean457 ? 2 : 0];
									local478 = local284[local30.aBoolean457 ? 3 : 1];
								}
							}
							local592 = local30.anInt6868 - Static565.anInt8921;
							if (local592 <= local30.anInt6882) {
								local599 = local468.method7213();
							} else {
								local592 -= local30.anInt6882;
								local299 = local30.anInt6884 == 0 ? 0 : (local30.anInt6847 - local592) / local30.anInt6884 * local30.anInt6884;
								local599 = local299 * local468.method7213() / local30.anInt6847;
							}
							local299 = local468.method7198();
							local214 -= local299;
							local387 = arg3 + Static663.anIntArray616[0] - (local468.method7213() >> 1);
							local468.method7202(local387, local214);
							Static273.aClass100_6.T(local387, local214, local387 + local599, local214 - -local299);
							local478.method7202(local387, local214);
							Static273.aClass100_6.KA(arg3, arg2, arg0 + arg3, arg2 - -arg1);
							Static395.method5811(local214, local468.method7206() + local387, local299 + local214, local387);
							local214 -= 2;
						}
						if (local13 < local7) {
							@Pc(702) Class4_Sub1_Sub1_Sub2_Sub1 local702 = (Class4_Sub1_Sub1_Sub2_Sub1) local30;
							if (local702.anInt4564 != -1) {
								local214 -= 25;
								local478 = Static256.aClass155Array14[local702.anInt4564];
								local478.method7202(arg3 + Static663.anIntArray616[0] - 12, local214);
								Static395.method5811(local214, Static663.anIntArray616[0] + arg3 + local478.method7206() - 12, local478.method7209() + local214, Static663.anIntArray616[0] + arg3 - 12);
								local214 -= 2;
							}
							if (local702.anInt4542 != -1) {
								local214 -= 25;
								local478 = Static225.aClass155Array12[local702.anInt4542];
								local478.method7202(arg3 + Static663.anIntArray616[0] - 12, local214);
								Static395.method5811(local214, Static663.anIntArray616[0] + arg3 + local478.method7206() - 12, local478.method7209() + local214, arg3 + Static663.anIntArray616[0] - 12);
								local214 -= 2;
							}
						} else if (local17.anInt2807 >= 0 && local17.anInt2807 < Static225.aClass155Array12.length) {
							local468 = Static225.aClass155Array12[local17.anInt2807];
							local214 -= 25;
							local468.method7202(arg3 + Static663.anIntArray616[0] - (local468.method7213() >> 1), local214);
							Static395.method5811(local214, arg3 + Static663.anIntArray616[0] - (local468.method7213() >> 1) + local468.method7206(), local214 + local468.method7209(), arg3 + Static663.anIntArray616[0] - (local468.method7213() >> 1));
							local214 -= 2;
						}
					}
					@Pc(881) Class212[] local881;
					@Pc(889) Class212 local889;
					if (!(local30 instanceof Class4_Sub1_Sub1_Sub2_Sub1)) {
						local253 = 0;
						local881 = Static8.aClass212Array1;
						for (local488 = 0; local488 < local881.length; local488++) {
							local889 = local881[local488];
							if (local889 != null && local889.anInt5367 == 1 && local889.anInt5376 == Static558.anIntArray500[local13 - local7]) {
								local359 = Static453.aClass155Array19[local889.anInt5370];
								if (local359.method7198() > local253) {
									local253 = local359.method7198();
								}
								if (Static565.anInt8921 % 20 < 10) {
									local359.method7202(Static663.anIntArray616[0] + arg3 - 12, local214 - local359.method7198());
									Static395.method5811(local214 - local359.method7198(), arg3 - (-Static663.anIntArray616[0] + 12) + local359.method7206(), local214 - local359.method7198() + local359.method7209(), Static663.anIntArray616[0] + -12 + arg3);
								}
							}
						}
						if (local253 > 0) {
						}
					} else if (local13 >= 0) {
						local253 = 0;
						local881 = Static8.aClass212Array1;
						for (local488 = 0; local488 < local881.length; local488++) {
							local889 = local881[local488];
							if (local889 != null && local889.anInt5367 == 10 && local889.anInt5376 == local11[local13]) {
								local359 = Static453.aClass155Array19[local889.anInt5370];
								if (local359.method7198() > local253) {
									local253 = local359.method7198();
								}
								local359.method7202(arg3 + Static663.anIntArray616[0] - 12, -local359.method7198() + local214);
								Static395.method5811(local214 - local359.method7198(), Static663.anIntArray616[0] + (arg3 - (-local359.method7206() + 12)), local214 - local359.method7198() + local359.method7209(), arg3 + -12 - -Static663.anIntArray616[0]);
							}
						}
						if (local253 > 0) {
						}
					}
					for (local253 = 0; local253 < Static197.anInt3594; local253++) {
						local1120 = local30.anIntArray401[local253];
						local488 = local30.anIntArray397[local253];
						@Pc(1127) Class213 local1127 = null;
						local599 = 0;
						if (local488 >= 0) {
							if (local1120 <= Static565.anInt8921) {
								continue;
							}
							local1127 = Static140.aClass312_1.method7055(local30.anIntArray397[local253]);
							local599 = local1127.anInt5402;
						} else if (local1120 < 0) {
							continue;
						}
						local299 = local30.anIntArray402[local253];
						@Pc(1169) Class213 local1169 = null;
						if (local299 >= 0) {
							local1169 = Static140.aClass312_1.method7055(local299);
						}
						if (local1120 - local599 <= Static565.anInt8921) {
							local390 = local30.anIntArray400[local253];
							if (local390 >= 0) {
								local30.anInt6850 = Static565.anInt8921 + 300;
								local30.lb = local390;
								local30.anIntArray400[local253] = -1;
							}
							if (local1127 == null) {
								local30.anIntArray401[local253] = -1;
							} else {
								local1231 = local30.method5940() / 2;
								Static500.method6962(local1231, arg0 >> 1, arg1 >> 1, local30);
								if (Static663.anIntArray616[0] > -1) {
									Static663.anIntArray616[0] += Static254.anIntArray252[local253];
									Static663.anIntArray616[1] += Static125.anIntArray124[local253];
									local1277 = 0;
									local1279 = 0;
									local1281 = 0;
									@Pc(1283) int local1283 = 0;
									@Pc(1285) int local1285 = 0;
									@Pc(1287) int local1287 = 0;
									@Pc(1289) int local1289 = 0;
									@Pc(1291) int local1291 = 0;
									@Pc(1293) Class155 local1293 = null;
									@Pc(1295) Class155 local1295 = null;
									@Pc(1297) Class155 local1297 = null;
									@Pc(1299) Class155 local1299 = null;
									@Pc(1301) int local1301 = 0;
									@Pc(1303) int local1303 = 0;
									@Pc(1305) int local1305 = 0;
									@Pc(1307) int local1307 = 0;
									@Pc(1309) int local1309 = 0;
									@Pc(1311) int local1311 = 0;
									@Pc(1313) int local1313 = 0;
									@Pc(1315) int local1315 = 0;
									@Pc(1317) int local1317 = 0;
									@Pc(1322) Class155 local1322 = local1127.method4848(Static273.aClass100_6);
									@Pc(1330) int local1330;
									if (local1322 != null) {
										local1277 = local1322.method7213();
										local1330 = local1322.method7198();
										local1322.method7208(Static33.anIntArray41);
										if (local1330 > 0) {
											local1317 = local1330;
										}
										local1285 = Static33.anIntArray41[0];
									}
									@Pc(1351) Class155 local1351 = local1127.method4849(Static273.aClass100_6);
									if (local1351 != null) {
										local1279 = local1351.method7213();
										local1330 = local1351.method7198();
										if (local1330 > local1317) {
											local1317 = local1330;
										}
										local1351.method7208(Static33.anIntArray41);
										local1287 = Static33.anIntArray41[0];
									}
									@Pc(1380) Class155 local1380 = local1127.method4845(Static273.aClass100_6);
									if (local1380 != null) {
										local1281 = local1380.method7213();
										local1330 = local1380.method7198();
										local1380.method7208(Static33.anIntArray41);
										if (local1317 < local1330) {
											local1317 = local1330;
										}
										local1289 = Static33.anIntArray41[0];
									}
									@Pc(1405) Class155 local1405 = local1127.method4842(Static273.aClass100_6);
									if (local1405 != null) {
										local1283 = local1405.method7213();
										local1330 = local1405.method7198();
										local1405.method7208(Static33.anIntArray41);
										if (local1317 < local1330) {
											local1317 = local1330;
										}
										local1291 = Static33.anIntArray41[0];
									}
									if (local1169 != null) {
										local1293 = local1169.method4848(Static273.aClass100_6);
										if (local1293 != null) {
											local1301 = local1293.method7213();
											local1330 = local1293.method7198();
											local1293.method7208(Static33.anIntArray41);
											if (local1330 > local1317) {
												local1317 = local1330;
											}
											local1309 = Static33.anIntArray41[0];
										}
										local1295 = local1169.method4849(Static273.aClass100_6);
										if (local1295 != null) {
											local1303 = local1295.method7213();
											local1330 = local1295.method7198();
											if (local1317 < local1330) {
												local1317 = local1330;
											}
											local1295.method7208(Static33.anIntArray41);
											local1311 = Static33.anIntArray41[0];
										}
										local1297 = local1169.method4845(Static273.aClass100_6);
										if (local1297 != null) {
											local1305 = local1297.method7213();
											local1330 = local1297.method7198();
											if (local1317 < local1330) {
												local1317 = local1330;
											}
											local1297.method7208(Static33.anIntArray41);
											local1313 = Static33.anIntArray41[0];
										}
										local1299 = local1169.method4842(Static273.aClass100_6);
										if (local1299 != null) {
											local1307 = local1299.method7213();
											local1330 = local1299.method7198();
											if (local1317 < local1330) {
												local1317 = local1330;
											}
											local1299.method7208(Static33.anIntArray41);
											local1315 = Static33.anIntArray41[0];
										}
									}
									@Pc(1541) Class70 local1541 = Static510.aClass70_11;
									@Pc(1543) Class70 local1543 = Static510.aClass70_11;
									@Pc(1545) Class196 local1545 = Static511.aClass196_36;
									local1330 = local1127.anInt5399;
									@Pc(1550) Class196 local1550 = Static511.aClass196_36;
									@Pc(1561) Class70 local1561;
									@Pc(1566) Class196 local1566;
									if (local1330 >= 0) {
										local1561 = Static306.method4763(local1330, Static273.aClass100_6, true);
										local1566 = Static600.method8236(local1330, Static273.aClass100_6);
										if (local1561 != null && local1566 != null) {
											local1545 = local1566;
											local1541 = local1561;
										}
									}
									if (local1169 != null) {
										local1330 = local1169.anInt5399;
										if (local1330 >= 0) {
											local1561 = Static306.method4763(local1330, Static273.aClass100_6, true);
											local1566 = Static600.method8236(local1330, Static273.aClass100_6);
											if (local1561 != null && local1566 != null) {
												local1550 = local1566;
												local1543 = local1561;
											}
										}
									}
									@Pc(1611) String local1611 = null;
									@Pc(1615) int local1615 = 0;
									@Pc(1623) String local1623 = local1127.method4840(local30.anIntArray395[local253]);
									@Pc(1628) int local1628 = local1545.method4556(local1623);
									if (local1169 != null) {
										local1611 = local1169.method4840(local30.anIntArray396[local253]);
										local1615 = local1550.method4556(local1611);
									}
									@Pc(1645) int local1645 = 0;
									if (local1279 > 0) {
										local1645 = local1628 / local1279 + 1;
									}
									@Pc(1655) int local1655 = 0;
									if (local1169 != null && local1303 > 0) {
										local1655 = local1615 / local1303 + 1;
									}
									@Pc(1672) int local1672 = 0;
									if (local1277 > 0) {
										local1672 = local1277;
									}
									local1672 += 2;
									@Pc(1686) int local1686 = local1672;
									if (local1281 > 0) {
										local1672 += local1281;
									}
									@Pc(1697) int local1697 = local1672;
									@Pc(1699) int local1699 = local1672;
									@Pc(1714) int local1714;
									if (local1279 <= 0) {
										local1672 += local1628;
									} else {
										local1714 = local1645 * local1279;
										local1699 = local1672 + (local1714 - local1628) / 2;
										local1672 += local1714;
									}
									local1714 = local1672;
									if (local1283 > 0) {
										local1672 += local1283;
									}
									@Pc(1740) int local1740 = 0;
									@Pc(1742) int local1742 = 0;
									@Pc(1744) int local1744 = 0;
									@Pc(1746) int local1746 = 0;
									@Pc(1748) int local1748 = 0;
									@Pc(1784) int local1784;
									if (local1169 != null) {
										local1672 += 2;
										local1740 = local1672;
										if (local1301 > 0) {
											local1672 += local1301;
										}
										local1672 += 2;
										local1742 = local1672;
										if (local1305 > 0) {
											local1672 += local1305;
										}
										local1744 = local1672;
										local1748 = local1672;
										if (local1303 > 0) {
											local1784 = local1303 * local1655;
											local1748 = local1672 + (local1784 - local1615) / 2;
											local1672 += local1784;
										} else {
											local1672 += local1615;
										}
										local1746 = local1672;
										if (local1307 > 0) {
											local1672 += local1307;
										}
									}
									local1784 = local30.anIntArray401[local253] - Static565.anInt8921;
									@Pc(1831) int local1831 = local1127.anInt5410 - local1127.anInt5410 * local1784 / local1127.anInt5402;
									@Pc(1843) int local1843 = local1784 * local1127.anInt5398 / local1127.anInt5402 - local1127.anInt5398;
									@Pc(1857) int local1857 = Static663.anIntArray616[0] + arg3 + local1831 - (local1672 >> 1);
									@Pc(1869) int local1869 = arg2 + Static663.anIntArray616[1] + local1843 - 12;
									@Pc(1871) int local1871 = local1869;
									@Pc(1875) int local1875 = local1869 + local1317;
									@Pc(1883) int local1883 = local1869 + local1127.anInt5409 + 15;
									@Pc(1889) int local1889 = local1883 - local1545.anInt5054;
									if (local1869 > local1889) {
										local1871 = local1889;
									}
									@Pc(1903) int local1903 = local1883 + local1545.anInt5056;
									if (local1903 > local1875) {
										local1875 = local1903;
									}
									@Pc(1914) int local1914 = 0;
									@Pc(1930) int local1930;
									@Pc(1936) int local1936;
									if (local1169 != null) {
										local1914 = local1869 + local1169.anInt5409 + 15;
										local1930 = local1914 - local1550.anInt5054;
										local1936 = local1914 + local1550.anInt5056;
										if (local1871 > local1930) {
											local1871 = local1930;
										}
										if (local1936 > local1875) {
											local1875 = local1936;
										}
									}
									local1930 = 255;
									if (local1127.anInt5403 >= 0) {
										local1930 = (local1784 << 8) / (local1127.anInt5402 - local1127.anInt5403);
									}
									if (local1930 >= 0 && local1930 < 255) {
										local1936 = local1930 << 24;
										@Pc(2151) int local2151 = local1936 | 0xFFFFFF;
										if (local1322 != null) {
											local1322.method7205(local1857 - local1285, local1869, 0, local2151, 1);
										}
										if (local1380 != null) {
											local1380.method7205(local1857 + local1686 - local1289, local1869, 0, local2151, 1);
										}
										@Pc(2186) int local2186;
										if (local1351 != null) {
											for (local2186 = 0; local2186 < local1645; local2186++) {
												local1351.method7205(local1697 + local1857 + local2186 * local1279 - local1287, local1869, 0, local2151, 1);
											}
										}
										if (local1405 != null) {
											local1405.method7205(local1714 + local1857 - local1291, local1869, 0, local2151, 1);
										}
										local1541.method8433(local1857 + local1699, 0, local1936 | local1127.anInt5407, local1623, local1883);
										if (local1169 != null) {
											if (local1293 != null) {
												local1293.method7205(local1857 + local1740 - local1309, local1869, 0, local2151, 1);
											}
											if (local1297 != null) {
												local1297.method7205(local1857 + local1742 - local1313, local1869, 0, local2151, 1);
											}
											if (local1295 != null) {
												for (local2186 = 0; local2186 < local1655; local2186++) {
													local1295.method7205(local1744 + local1857 + local1303 * local2186 - local1311, local1869, 0, local2151, 1);
												}
											}
											if (local1299 != null) {
												local1299.method7205(local1746 + local1857 - local1315, local1869, 0, local2151, 1);
											}
											local1543.method8433(local1857 + local1748, 0, local1936 | local1169.anInt5407, local1611, local1914);
										}
									} else {
										if (local1322 != null) {
											local1322.method7202(local1857 - local1285, local1869);
										}
										if (local1380 != null) {
											local1380.method7202(local1686 + local1857 - local1289, local1869);
										}
										if (local1351 != null) {
											for (local1936 = 0; local1936 < local1645; local1936++) {
												local1351.method7202(local1936 * local1279 + local1697 + local1857 - local1287, local1869);
											}
										}
										if (local1405 != null) {
											local1405.method7202(local1857 + local1714 - local1291, local1869);
										}
										local1541.method8433(local1857 + local1699, 0, local1127.anInt5407 | 0xFF000000, local1623, local1883);
										if (local1169 != null) {
											if (local1293 != null) {
												local1293.method7202(local1740 + local1857 - local1309, local1869);
											}
											if (local1297 != null) {
												local1297.method7202(local1742 + local1857 - local1313, local1869);
											}
											if (local1295 != null) {
												for (local1936 = 0; local1936 < local1655; local1936++) {
													local1295.method7202(local1936 * local1303 + local1744 + local1857 - local1311, local1869);
												}
											}
											if (local1299 != null) {
												local1299.method7202(local1857 + local1746 - local1315, local1869);
											}
											local1543.method8433(local1748 + local1857, 0, local1169.anInt5407 | 0xFF000000, local1611, local1914);
										}
									}
									Static395.method5811(local1871, local1857 + local1672, local1875 + 1, local1857);
								}
							}
						}
					}
				}
			}
		}
		for (@Pc(2376) int local2376 = 0; local2376 < Static667.anInt10783; local2376++) {
			local214 = Static84.anIntArray74[local2376];
			@Pc(2391) Class4_Sub1_Sub1_Sub2 local2391;
			if (local214 < 2048) {
				local2391 = Static574.aClass4_Sub1_Sub1_Sub2_Sub1Array1[local214];
			} else {
				local2391 = ((Class5_Sub9) Static677.aClass306_37.method6943((long) (local214 - 2048))).aClass4_Sub1_Sub1_Sub2_Sub2_1;
			}
			local1120 = Static177.anIntArray154[local2376];
			@Pc(2414) Class4_Sub1_Sub1_Sub2 local2414;
			if (local1120 < 2048) {
				local2414 = Static574.aClass4_Sub1_Sub1_Sub2_Sub1Array1[local1120];
			} else {
				local2414 = ((Class5_Sub9) Static677.aClass306_37.method6943((long) (local1120 - 2048))).aClass4_Sub1_Sub1_Sub2_Sub2_1;
			}
			Static343.method5121(arg1, local2391, arg3, arg2, arg0, local2414, --local2391.anInt6874);
		}
		local214 = Static73.aClass196_5.anInt5056 + Static73.aClass196_5.anInt5054 + 2;
		for (local253 = 0; local253 < Static168.anInt3265; local253++) {
			local1120 = Static17.anIntArray24[local253];
			local488 = Static17.anIntArray25[local253];
			local592 = Static17.anIntArray21[local253];
			@Pc(2479) boolean local2479 = true;
			while (local2479) {
				local2479 = false;
				for (local299 = 0; local299 < local253; local299++) {
					if (local488 + 2 > Static17.anIntArray25[local299] - local214 && Static17.anIntArray25[local299] + 2 > -local214 + local488 && local1120 - local592 < Static17.anIntArray21[local299] + Static17.anIntArray24[local299] && Static17.anIntArray24[local299] - Static17.anIntArray21[local299] < local1120 - -local592 && Static17.anIntArray25[local299] - local214 < local488) {
						local2479 = true;
						local488 = Static17.anIntArray25[local299] - local214;
					}
				}
			}
			Static17.anIntArray25[local253] = local488;
			@Pc(2577) String local2577 = Static17.aStringArray3[local253];
			local387 = Static73.aClass196_5.method4556(local2577);
			local390 = arg3 + local1120;
			local1231 = arg2 + local488 - Static73.aClass196_5.anInt5054;
			@Pc(2598) int local2598 = local390 + local387;
			@Pc(2606) int local2606 = Static73.aClass196_5.anInt5056 + arg2 + local488;
			if (Static559.anInt8804 == 0) {
				@Pc(2638) int local2638 = 16776960;
				if (Static17.anIntArray22[local253] < 6) {
					local2638 = Static522.anIntArray476[Static17.anIntArray22[local253]];
				}
				if (Static17.anIntArray22[local253] == 6) {
					local2638 = Static154.anInt3001 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static17.anIntArray22[local253] == 7) {
					local2638 = Static154.anInt3001 % 20 >= 10 ? 65535 : 255;
				}
				if (Static17.anIntArray22[local253] == 8) {
					local2638 = Static154.anInt3001 % 20 >= 10 ? 8454016 : 45056;
				}
				@Pc(2722) int local2722;
				if (Static17.anIntArray22[local253] == 9) {
					local2722 = 150 - Static17.anIntArray26[local253];
					if (local2722 < 50) {
						local2638 = local2722 * 1280 + 16711680;
					} else if (local2722 < 100) {
						local2638 = 16776960 - (local2722 - 50) * 327680;
					} else if (local2722 < 150) {
						local2638 = (local2722 - 100) * 5 + 65280;
					}
				}
				if (Static17.anIntArray22[local253] == 10) {
					local2722 = 150 - Static17.anIntArray26[local253];
					if (local2722 < 50) {
						local2638 = local2722 * 5 + 16711680;
					} else if (local2722 < 100) {
						local2638 = 16711935 - (local2722 - 50) * 327680;
					} else if (local2722 < 150) {
						local2638 = local2722 * 327680 + 255 - (local2722 - 100) * 5 - 32768000;
					}
				}
				if (Static17.anIntArray22[local253] == 11) {
					local2722 = 150 - Static17.anIntArray26[local253];
					if (local2722 < 50) {
						local2638 = 16777215 - local2722 * 327685;
					} else if (local2722 < 100) {
						local2638 = (local2722 - 50) * 327685 + 65280;
					} else if (local2722 < 150) {
						local2638 = 16777215 + 32768000 - local2722 * 327680;
					}
				}
				local2722 = local2638 | 0xFF000000;
				if (Static17.anIntArray23[local253] == 0) {
					local390 -= local387 >> 1;
					local2598 -= local387 >> 1;
					Static196.aClass70_3.method8434(arg2 + local488, -16777216, local1120 + arg3, local2722, local2577);
				}
				if (Static17.anIntArray23[local253] == 1) {
					local2598 -= local387 >> 1;
					local2606 += 5;
					local390 -= local387 >> 1;
					local1231 -= 5;
					Static196.aClass70_3.method8439(local2722, local2577, arg3 + local1120, Static154.anInt3001, local488 + arg2);
				}
				if (Static17.anIntArray23[local253] == 2) {
					local2598 -= (local387 >> 1) - 5;
					local390 -= (local387 >> 1) + 5;
					Static196.aClass70_3.method8440(Static154.anInt3001, local2577, local2722, arg3 + local1120, local488 + arg2);
					local2606 += 5;
					local1231 -= 5;
				}
				if (Static17.anIntArray23[local253] == 3) {
					local2598 -= local387 >> 1;
					local390 -= local387 >> 1;
					Static196.aClass70_3.method8436(150 - Static17.anIntArray26[local253], local488 + arg2, local2722, local2577, Static154.anInt3001, arg3 + local1120);
					local2606 += 7;
					local1231 -= 7;
				}
				if (Static17.anIntArray23[local253] == 4) {
					local1277 = (150 - Static17.anIntArray26[local253]) * (Static73.aClass196_5.method4556(local2577) - -100) / 150;
					Static273.aClass100_6.T(local1120 + arg3 - 50, arg2, arg3 + local1120 + 50, arg2 + arg1);
					Static196.aClass70_3.method8433(local1120 + arg3 + 50 - local1277, -16777216, local2722, local2577, local488 + arg2);
					local2598 += 50 - local1277;
					local390 += 50 - local1277;
					Static273.aClass100_6.KA(arg3, arg2, arg3 + arg0, arg1 + arg2);
				}
				if (Static17.anIntArray23[local253] == 5) {
					local1277 = 150 - Static17.anIntArray26[local253];
					local1279 = 0;
					if (local1277 < 25) {
						local1279 = local1277 - 25;
					} else if (local1277 > 125) {
						local1279 = local1277 - 125;
					}
					local1281 = Static73.aClass196_5.anInt5056 + Static73.aClass196_5.anInt5054;
					Static273.aClass100_6.T(arg3, arg2 + local488 - local1281 - 1, arg0 + arg3, local488 + arg2 + 5);
					local390 -= local387 >> 1;
					local2598 -= local387 >> 1;
					local1231 += local1279;
					Static196.aClass70_3.method8434(local1279 + arg2 + local488, -16777216, local1120 + arg3, local2722, local2577);
					local2606 += local1279;
					Static273.aClass100_6.KA(arg3, arg2, arg3 + arg0, arg1 + arg2);
				}
			} else {
				Static196.aClass70_3.method8434(local488 + arg2, -16777216, local1120 + arg3, -256, local2577);
				local390 -= local387 >> 1;
				local2598 -= local387 >> 1;
			}
			Static395.method5811(local1231, local2598 + 1, local2606 + 1, local390);
		}
	}

	@OriginalMember(owner = "client!kja", name = "a", descriptor = "(Ljava/lang/String;Z)Z")
	public static boolean method4757(@OriginalArg(0) String arg0) {
		return Static96.aHashtable19.containsKey(arg0);
	}
}
