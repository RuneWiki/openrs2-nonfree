import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static199 {

	@OriginalMember(owner = "client!gka", name = "m", descriptor = "I")
	public static int anInt4052;

	@OriginalMember(owner = "client!gka", name = "a", descriptor = "(I)V")
	public static void method3720() {
		for (@Pc(12) Class6_Sub33 local12 = (Class6_Sub33) Static252.aClass74_67.method1404(); local12 != null; local12 = (Class6_Sub33) Static252.aClass74_67.method1405()) {
			if (local12.aClass115_Sub1_1.method3242()) {
				Static277.method4643(local12.anInt5790);
			} else {
				local12.aClass115_Sub1_1.method3257();
				try {
					local12.aClass115_Sub1_1.method3250();
				} catch (@Pc(39) Exception local39) {
					Static550.method7785(local39, "TV: " + local12.anInt5790);
					Static277.method4643(local12.anInt5790);
				}
				if (!local12.aBoolean429 && !local12.aBoolean426) {
					@Pc(69) Class6_Sub37_Sub3 local69 = local12.aClass115_Sub1_1.method3243();
					if (local69 != null) {
						@Pc(75) Class6_Sub17_Sub5 local75 = local69.method8692();
						if (local75 != null) {
							local75.method8151(local12.anInt5792);
							Static544.aClass6_Sub17_Sub3_2.method4661(local75);
							local12.aBoolean429 = true;
						}
					}
				}
			}
		}
		if (-8785 != -8785) {
			method3721((byte) 59);
		}
	}

	@OriginalMember(owner = "client!gka", name = "a", descriptor = "(B)V")
	public static void method3721(@OriginalArg(0) byte arg0) {
		if (arg0 >= -84) {
			method3721((byte) 32);
		}
		Static512.aClass74_59.method1398();
		Static685.aClass74_77.method1398();
	}

	@OriginalMember(owner = "client!gka", name = "a", descriptor = "(IIIIIII)V")
	public static void method3722(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		@Pc(7) int local7 = Static661.anInt10532;
		Static153.anInt3235 = 0;
		@Pc(11) int[] local11 = Static591.anIntArray611;
		@Pc(202) int local202;
		@Pc(229) int local229;
		@Pc(278) int local278;
		@Pc(363) int local363;
		@Pc(366) int local366;
		@Pc(1209) int local1209;
		@Pc(1254) int local1254;
		@Pc(1256) int local1256;
		@Pc(471) int local471;
		@Pc(1108) int local1108;
		@Pc(621) int local621;
		for (@Pc(13) int local13 = 0; local13 < Static201.anInt4069 + local7; local13++) {
			@Pc(17) Class294 local17 = null;
			@Pc(30) Class60_Sub1_Sub1_Sub3 local30;
			if (local7 > local13) {
				local30 = Static171.aClass60_Sub1_Sub1_Sub3_Sub1Array1[local11[local13]];
			} else {
				local30 = ((Class6_Sub11) Static419.aClass74_45.method1401((long) Static531.anIntArray580[local13 - local7])).aClass60_Sub1_Sub1_Sub3_Sub2_1;
				local17 = ((Class60_Sub1_Sub1_Sub3_Sub2) local30).aClass294_1;
				if (local17.anIntArray511 != null) {
					local17 = local17.method7168(Static303.aClass55_2);
					if (local17 == null) {
						continue;
					}
				}
			}
			if (local30.anInt4825 >= 0 && (Static227.anInt4418 == local30.anInt4834 || Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.aByte135 == local30.aByte135)) {
				Static100.method1962(local30.method4426(), arg3 >> 1, arg1 >> 1, local30);
				if (Static609.anIntArray627[0] >= 0) {
					if (local30.aString50 != null && (local13 >= local7 || Static535.anInt4139 == 0 || Static535.anInt4139 == 3 || Static535.anInt4139 == 1 && Static346.method5316(((Class60_Sub1_Sub1_Sub3_Sub1) local30).aString23)) && Static153.anInt3235 < Static300.anInt8497) {
						Static300.anIntArray534[Static153.anInt3235] = Static228.aClass53_7.method824(local30.aString50) / 2;
						Static300.anIntArray535[Static153.anInt3235] = Static609.anIntArray627[0];
						Static300.anIntArray537[Static153.anInt3235] = Static609.anIntArray627[1];
						Static300.anIntArray539[Static153.anInt3235] = local30.anInt4848;
						Static300.anIntArray538[Static153.anInt3235] = local30.anInt4826;
						Static300.anIntArray536[Static153.anInt3235] = local30.anInt4860;
						Static300.aStringArray35[Static153.anInt3235] = local30.aString50;
						Static153.anInt3235++;
					}
					local202 = arg0 + Static609.anIntArray627[1];
					@Pc(263) Class49[] local263;
					@Pc(270) Class64[] local270;
					@Pc(334) Class49 local334;
					if (local30.aBoolean370 || local30.anInt4853 <= Static141.anInt8737) {
						local202 -= Math.max(Static228.aClass53_7.anInt817, Static448.aClass49Array12[0].method8993());
					} else {
						@Pc(215) byte local215 = 1;
						if (local13 < local7) {
							@Pc(224) Class60_Sub1_Sub1_Sub3_Sub1 local224 = Static171.aClass60_Sub1_Sub1_Sub3_Sub1Array1[local11[local13]];
							local229 = local30.method4417(27750).anInt10401;
							if (local224.aBoolean226) {
								local215 = 2;
							}
						} else {
							local229 = local17.anInt8139;
							if (local229 == -1) {
								local229 = local30.method4417(27750).anInt10401;
							}
						}
						@Pc(251) Class49[] local251 = Static448.aClass49Array12;
						if (local229 != -1) {
							local263 = (Class49[]) Static324.aClass359_45.method8517((long) local229);
							if (local263 == null) {
								local270 = Static691.method1239(Static583.aClass223_113, local229);
								if (local270 != null) {
									local263 = new Class49[local270.length];
									for (local278 = 0; local278 < local270.length; local278++) {
										local263[local278] = Static202.aClass75_5.method6714(local270[local278], true);
									}
									Static324.aClass359_45.method8515((long) local229, local263);
								}
							}
							if (local263 != null && local263.length >= 2) {
								local251 = local263;
							}
						}
						if (local251.length <= local215) {
							local215 = 1;
						}
						@Pc(330) Class49 local330 = local251[0];
						local334 = local251[local215];
						local202 -= Math.max(Static228.aClass53_7.anInt817, local330.method8993());
						local278 = arg2 + Static609.anIntArray627[0] - (local330.method8988() >> 1);
						local363 = local330.method8988() * local30.anInt4838 / 255;
						local366 = local330.method8993();
						if (local30.anInt4838 > 0 && local363 < 2) {
							local363 = 2;
						}
						local330.method8997(local278, local202);
						Static202.aClass75_5.T(local278, local202, local363 + local278, local202 - -local366);
						local334.method8997(local278, local202);
						Static202.aClass75_5.KA(arg2, arg0, arg3 + arg2, arg1 + arg0);
						Static494.method3707(local202, local278, local366 + local202, local330.method8991() + local278);
					}
					local202 -= 2;
					if (!local30.aBoolean370) {
						@Pc(453) Class49 local453;
						@Pc(463) Class49 local463;
						if (local30.anInt4828 > Static141.anInt8737) {
							local453 = Static607.aClass49Array15[local30.aBoolean371 ? 2 : 0];
							local463 = Static607.aClass49Array15[local30.aBoolean371 ? 3 : 1];
							if (local30 instanceof Class60_Sub1_Sub1_Sub3_Sub2) {
								local471 = local17.anInt8157;
								if (local471 == -1) {
									local471 = local30.method4417(27750).anInt10397;
								}
							} else {
								local471 = local30.method4417(27750).anInt10397;
							}
							if (local471 != -1) {
								local263 = (Class49[]) Static22.aClass359_38.method8517((long) local471);
								if (local263 == null) {
									local270 = Static691.method1239(Static583.aClass223_113, local471);
									if (local270 != null) {
										local263 = new Class49[local270.length];
										for (local278 = 0; local278 < local270.length; local278++) {
											local263[local278] = Static202.aClass75_5.method6714(local270[local278], true);
										}
										Static22.aClass359_38.method8515((long) local471, local263);
									}
								}
								if (local263 != null && local263.length == 4) {
									local463 = local263[local30.aBoolean371 ? 3 : 1];
									local453 = local263[local30.aBoolean371 ? 2 : 0];
								}
							}
							@Pc(579) int local579 = local30.anInt4828 - Static141.anInt8737;
							if (local579 > local30.anInt4847) {
								local579 -= local30.anInt4847;
								local278 = local30.anInt4833 == 0 ? 0 : (local30.anInt4863 - local579) / local30.anInt4833 * local30.anInt4833;
								local621 = local278 * local453.method8988() / local30.anInt4863;
							} else {
								local621 = local453.method8988();
							}
							local278 = local453.method8993();
							local202 -= local278;
							local363 = arg2 + Static609.anIntArray627[0] - (local453.method8988() >> 1);
							local453.method8997(local363, local202);
							Static202.aClass75_5.T(local363, local202, local363 + local621, local278 + local202);
							local463.method8997(local363, local202);
							Static202.aClass75_5.KA(arg2, arg0, arg2 + arg3, arg1 + arg0);
							Static494.method3707(local202, local363, local278 + local202, local453.method8991() + local363);
							local202 -= 2;
						}
						if (local7 > local13) {
							@Pc(764) Class60_Sub1_Sub1_Sub3_Sub1 local764 = (Class60_Sub1_Sub1_Sub3_Sub1) local30;
							if (local764.anInt2872 != -1) {
								local202 -= 25;
								local463 = Static329.aClass49Array8[local764.anInt2872];
								local463.method8997(arg2 + Static609.anIntArray627[0] - 12, local202);
								Static494.method3707(local202, arg2 + Static609.anIntArray627[0] - 12, local202 - -local463.method8987(), Static609.anIntArray627[0] + arg2 + local463.method8991() - 12);
								local202 -= 2;
							}
							if (local764.anInt2852 != -1) {
								local202 -= 25;
								local463 = Static648.aClass49Array17[local764.anInt2852];
								local463.method8997(Static609.anIntArray627[0] + arg2 - 12, local202);
								Static494.method3707(local202, arg2 + Static609.anIntArray627[0] - 12, local202 + local463.method8987(), Static609.anIntArray627[0] + arg2 + local463.method8991() - 12);
								local202 -= 2;
							}
						} else if (local17.anInt8168 >= 0 && Static648.aClass49Array17.length > local17.anInt8168) {
							local202 -= 25;
							local453 = Static648.aClass49Array17[local17.anInt8168];
							local453.method8997(arg2 + Static609.anIntArray627[0] - (local453.method8988() >> 1), local202);
							Static494.method3707(local202, arg2 + Static609.anIntArray627[0] - (local453.method8988() >> 1), local453.method8987() + local202, arg2 + Static609.anIntArray627[0] - (local453.method8988() >> 1) + local453.method8991());
							local202 -= 2;
						}
					}
					@Pc(868) Class232[] local868;
					@Pc(876) Class232 local876;
					if (!(local30 instanceof Class60_Sub1_Sub1_Sub3_Sub1)) {
						local229 = 0;
						local868 = Static236.aClass232Array1;
						for (local471 = 0; local471 < local868.length; local471++) {
							local876 = local868[local471];
							if (local876 != null && local876.anInt6164 == 1 && Static531.anIntArray580[local13 - local7] == local876.anInt6165) {
								local334 = Static323.aClass49Array7[local876.anInt6162];
								if (local334.method8993() > local229) {
									local229 = local334.method8993();
								}
								if (Static141.anInt8737 % 20 < 10) {
									local334.method8997(Static609.anIntArray627[0] + arg2 - 12, -local334.method8993() + local202);
									Static494.method3707(local202 - local334.method8993(), arg2 - -Static609.anIntArray627[0] - 12, local202 - local334.method8993() + local334.method8987(), Static609.anIntArray627[0] + arg2 + -12 + local334.method8991());
								}
							}
						}
						if (local229 > 0) {
						}
					} else if (local13 >= 0) {
						local229 = 0;
						local868 = Static236.aClass232Array1;
						for (local471 = 0; local471 < local868.length; local471++) {
							local876 = local868[local471];
							if (local876 != null && local876.anInt6164 == 10 && local11[local13] == local876.anInt6165) {
								local334 = Static323.aClass49Array7[local876.anInt6162];
								if (local334.method8993() > local229) {
									local229 = local334.method8993();
								}
								local334.method8997(arg2 + Static609.anIntArray627[0] - 12, local202 - local334.method8993());
								Static494.method3707(local202 - local334.method8993(), Static609.anIntArray627[0] + arg2 + -12, local202 - local334.method8993() + local334.method8987(), arg2 + -12 + (Static609.anIntArray627[0] - -local334.method8991()));
							}
						}
						if (local229 > 0) {
						}
					}
					for (local229 = 0; local229 < Static454.anInt7816; local229++) {
						local1108 = local30.anIntArray260[local229];
						local471 = local30.anIntArray254[local229];
						@Pc(1115) Class14 local1115 = null;
						local621 = 0;
						if (local471 >= 0) {
							if (Static141.anInt8737 >= local1108) {
								continue;
							}
							local1115 = Static597.aClass313_2.method7516(local30.anIntArray254[local229]);
							local621 = local1115.anInt209;
						} else if (local1108 < 0) {
							continue;
						}
						local278 = local30.anIntArray258[local229];
						@Pc(1153) Class14 local1153 = null;
						if (local278 >= 0) {
							local1153 = Static597.aClass313_2.method7516(local278);
						}
						if (local1108 - local621 <= Static141.anInt8737) {
							local366 = local30.anIntArray259[local229];
							if (local366 >= 0) {
								local30.anInt4838 = local366;
								local30.anInt4853 = Static141.anInt8737 + 300;
								local30.anIntArray259[local229] = -1;
							}
							if (local1115 == null) {
								local30.anIntArray260[local229] = -1;
							} else {
								local1209 = local30.method4426() / 2;
								Static100.method1962(local1209, arg3 >> 1, arg1 >> 1, local30);
								if (Static609.anIntArray627[0] > -1) {
									Static609.anIntArray627[0] += Static325.anIntArray328[local229];
									Static609.anIntArray627[1] += Static108.anIntArray102[local229];
									local1254 = 0;
									local1256 = 0;
									@Pc(1258) int local1258 = 0;
									@Pc(1260) int local1260 = 0;
									@Pc(1262) int local1262 = 0;
									@Pc(1264) int local1264 = 0;
									@Pc(1266) int local1266 = 0;
									@Pc(1268) int local1268 = 0;
									@Pc(1270) Class49 local1270 = null;
									@Pc(1272) Class49 local1272 = null;
									@Pc(1274) Class49 local1274 = null;
									@Pc(1276) Class49 local1276 = null;
									@Pc(1278) int local1278 = 0;
									@Pc(1280) int local1280 = 0;
									@Pc(1282) int local1282 = 0;
									@Pc(1284) int local1284 = 0;
									@Pc(1286) int local1286 = 0;
									@Pc(1288) int local1288 = 0;
									@Pc(1290) int local1290 = 0;
									@Pc(1292) int local1292 = 0;
									@Pc(1294) int local1294 = 0;
									@Pc(1299) Class49 local1299 = local1115.method185(Static202.aClass75_5);
									@Pc(1307) int local1307;
									if (local1299 != null) {
										local1254 = local1299.method8988();
										local1307 = local1299.method8993();
										if (local1307 > 0) {
											local1294 = local1307;
										}
										local1299.method8984(Static172.anIntArray190);
										local1262 = Static172.anIntArray190[0];
									}
									@Pc(1328) Class49 local1328 = local1115.method190(Static202.aClass75_5);
									if (local1328 != null) {
										local1256 = local1328.method8988();
										local1307 = local1328.method8993();
										local1328.method8984(Static172.anIntArray190);
										if (local1307 > local1294) {
											local1294 = local1307;
										}
										local1264 = Static172.anIntArray190[0];
									}
									@Pc(1353) Class49 local1353 = local1115.method187(Static202.aClass75_5);
									if (local1353 != null) {
										local1258 = local1353.method8988();
										local1307 = local1353.method8993();
										if (local1307 > local1294) {
											local1294 = local1307;
										}
										local1353.method8984(Static172.anIntArray190);
										local1266 = Static172.anIntArray190[0];
									}
									@Pc(1378) Class49 local1378 = local1115.method192(Static202.aClass75_5);
									if (local1378 != null) {
										local1260 = local1378.method8988();
										local1307 = local1378.method8993();
										if (local1294 < local1307) {
											local1294 = local1307;
										}
										local1378.method8984(Static172.anIntArray190);
										local1268 = Static172.anIntArray190[0];
									}
									if (local1153 != null) {
										local1270 = local1153.method185(Static202.aClass75_5);
										if (local1270 != null) {
											local1278 = local1270.method8988();
											local1307 = local1270.method8993();
											local1270.method8984(Static172.anIntArray190);
											if (local1307 > local1294) {
												local1294 = local1307;
											}
											local1286 = Static172.anIntArray190[0];
										}
										local1272 = local1153.method190(Static202.aClass75_5);
										if (local1272 != null) {
											local1280 = local1272.method8988();
											local1307 = local1272.method8993();
											local1272.method8984(Static172.anIntArray190);
											if (local1294 < local1307) {
												local1294 = local1307;
											}
											local1288 = Static172.anIntArray190[0];
										}
										local1274 = local1153.method187(Static202.aClass75_5);
										if (local1274 != null) {
											local1282 = local1274.method8988();
											local1307 = local1274.method8993();
											local1274.method8984(Static172.anIntArray190);
											if (local1294 < local1307) {
												local1294 = local1307;
											}
											local1290 = Static172.anIntArray190[0];
										}
										local1276 = local1153.method192(Static202.aClass75_5);
										if (local1276 != null) {
											local1284 = local1276.method8988();
											local1307 = local1276.method8993();
											if (local1294 < local1307) {
												local1294 = local1307;
											}
											local1276.method8984(Static172.anIntArray190);
											local1292 = Static172.anIntArray190[0];
										}
									}
									@Pc(1518) Class67 local1518 = Static23.aClass67_1;
									@Pc(1520) Class67 local1520 = Static23.aClass67_1;
									@Pc(1522) Class53 local1522 = Static574.aClass53_13;
									@Pc(1524) Class53 local1524 = Static574.aClass53_13;
									local1307 = local1115.anInt213;
									@Pc(1540) Class67 local1540;
									@Pc(1545) Class53 local1545;
									if (local1307 >= 0) {
										local1540 = Static539.method7689(Static202.aClass75_5, local1307, true);
										local1545 = Static234.method4144(Static202.aClass75_5, local1307);
										if (local1540 != null && local1545 != null) {
											local1522 = local1545;
											local1518 = local1540;
										}
									}
									if (local1153 != null) {
										local1307 = local1153.anInt213;
										if (local1307 >= 0) {
											local1540 = Static539.method7689(Static202.aClass75_5, local1307, true);
											local1545 = Static234.method4144(Static202.aClass75_5, local1307);
											if (local1540 != null && local1545 != null) {
												local1520 = local1540;
												local1524 = local1545;
											}
										}
									}
									@Pc(1587) String local1587 = null;
									@Pc(1597) String local1597 = local1115.method186(local30.anIntArray257[local229]);
									@Pc(1599) int local1599 = 0;
									@Pc(1606) int local1606 = local1522.method824(local1597);
									if (local1153 != null) {
										local1587 = local1153.method186(local30.anIntArray261[local229]);
										local1599 = local1524.method824(local1587);
									}
									@Pc(1625) int local1625 = 0;
									@Pc(1627) int local1627 = 0;
									if (local1256 > 0) {
										local1625 = local1606 / local1256 + 1;
									}
									if (local1153 != null && local1280 > 0) {
										local1627 = local1599 / local1280 + 1;
									}
									@Pc(1649) int local1649 = 0;
									if (local1254 > 0) {
										local1649 = local1254;
									}
									local1649 += 2;
									@Pc(1663) int local1663 = local1649;
									if (local1258 > 0) {
										local1649 += local1258;
									}
									@Pc(1671) int local1671 = local1649;
									@Pc(1673) int local1673 = local1649;
									@Pc(1685) int local1685;
									if (local1256 <= 0) {
										local1649 += local1606;
									} else {
										local1685 = local1256 * local1625;
										local1649 += local1685;
										local1673 += (local1685 - local1606) / 2;
									}
									local1685 = local1649;
									if (local1260 > 0) {
										local1649 += local1260;
									}
									@Pc(1711) int local1711 = 0;
									@Pc(1713) int local1713 = 0;
									@Pc(1715) int local1715 = 0;
									@Pc(1717) int local1717 = 0;
									@Pc(1719) int local1719 = 0;
									@Pc(1752) int local1752;
									if (local1153 != null) {
										local1649 += 2;
										local1711 = local1649;
										if (local1278 > 0) {
											local1649 += local1278;
										}
										local1649 += 2;
										local1713 = local1649;
										if (local1282 > 0) {
											local1649 += local1282;
										}
										local1719 = local1649;
										local1715 = local1649;
										if (local1280 > 0) {
											local1752 = local1280 * local1627;
											local1649 += local1752;
											local1719 += (local1752 - local1599) / 2;
										} else {
											local1649 += local1599;
										}
										local1717 = local1649;
										if (local1284 > 0) {
											local1649 += local1284;
										}
									}
									local1752 = local30.anIntArray260[local229] - Static141.anInt8737;
									@Pc(1801) int local1801 = local1115.anInt193 - local1752 * local1115.anInt193 / local1115.anInt209;
									@Pc(1813) int local1813 = local1752 * local1115.anInt208 / local1115.anInt209 - local1115.anInt208;
									@Pc(1828) int local1828 = arg2 + Static609.anIntArray627[0] + local1801 - (local1649 >> 1);
									@Pc(1838) int local1838 = arg0 + Static609.anIntArray627[1] + local1813 - 12;
									@Pc(1840) int local1840 = local1838;
									@Pc(1844) int local1844 = local1838 + local1294;
									@Pc(1851) int local1851 = local1838 + local1115.anInt216 + 15;
									@Pc(1857) int local1857 = local1851 - local1522.anInt817;
									@Pc(1862) int local1862 = local1851 + local1522.anInt811;
									if (local1838 > local1857) {
										local1840 = local1857;
									}
									if (local1862 > local1844) {
										local1844 = local1862;
									}
									@Pc(1878) int local1878 = 0;
									@Pc(1893) int local1893;
									@Pc(1903) int local1903;
									if (local1153 != null) {
										local1878 = local1838 + local1153.anInt216 + 15;
										local1893 = local1878 - local1524.anInt817;
										if (local1893 < local1840) {
											local1840 = local1893;
										}
										local1903 = local1878 + local1524.anInt811;
										if (local1844 < local1903) {
											local1844 = local1903;
										}
									}
									local1893 = 255;
									if (local1115.anInt201 >= 0) {
										local1893 = (local1752 << 8) / (local1115.anInt209 - local1115.anInt201);
									}
									if (local1893 >= 0 && local1893 < 255) {
										local1903 = local1893 << 24;
										@Pc(1944) int local1944 = local1903 | 0xFFFFFF;
										if (local1299 != null) {
											local1299.method8981(local1828 - local1262, local1838, 0, local1944, 1);
										}
										if (local1353 != null) {
											local1353.method8981(local1663 + local1828 - local1266, local1838, 0, local1944, 1);
										}
										@Pc(1980) int local1980;
										if (local1328 != null) {
											for (local1980 = 0; local1980 < local1625; local1980++) {
												local1328.method8981(local1980 * local1256 + local1671 + local1828 - local1264, local1838, 0, local1944, 1);
											}
										}
										if (local1378 != null) {
											local1378.method8981(local1685 + local1828 - local1268, local1838, 0, local1944, 1);
										}
										local1518.method8294(local1851, local1597, 0, local1828 + local1673, local1115.anInt202 | local1903);
										if (local1153 != null) {
											if (local1270 != null) {
												local1270.method8981(local1828 + local1711 - local1286, local1838, 0, local1944, 1);
											}
											if (local1274 != null) {
												local1274.method8981(local1828 + local1713 - local1290, local1838, 0, local1944, 1);
											}
											if (local1272 != null) {
												for (local1980 = 0; local1980 < local1627; local1980++) {
													local1272.method8981(local1828 + local1715 + local1280 * local1980 - local1288, local1838, 0, local1944, 1);
												}
											}
											if (local1276 != null) {
												local1276.method8981(local1828 + local1717 - local1292, local1838, 0, local1944, 1);
											}
											local1520.method8294(local1878, local1587, 0, local1828 + local1719, local1903 | local1153.anInt202);
										}
									} else {
										if (local1299 != null) {
											local1299.method8997(local1828 - local1262, local1838);
										}
										if (local1353 != null) {
											local1353.method8997(local1663 + local1828 - local1266, local1838);
										}
										if (local1328 != null) {
											for (local1903 = 0; local1903 < local1625; local1903++) {
												local1328.method8997(local1903 * local1256 + local1828 + local1671 - local1264, local1838);
											}
										}
										if (local1378 != null) {
											local1378.method8997(local1685 + local1828 - local1268, local1838);
										}
										local1518.method8294(local1851, local1597, 0, local1673 + local1828, local1115.anInt202 | 0xFF000000);
										if (local1153 != null) {
											if (local1270 != null) {
												local1270.method8997(local1828 + local1711 - local1286, local1838);
											}
											if (local1274 != null) {
												local1274.method8997(local1828 + local1713 - local1290, local1838);
											}
											if (local1272 != null) {
												for (local1903 = 0; local1903 < local1627; local1903++) {
													local1272.method8997(local1280 * local1903 + local1715 + local1828 - local1288, local1838);
												}
											}
											if (local1276 != null) {
												local1276.method8997(local1717 + local1828 - local1292, local1838);
											}
											local1520.method8294(local1878, local1587, 0, local1719 + local1828, local1153.anInt202 | 0xFF000000);
										}
									}
									Static494.method3707(local1840, local1828, local1844 + 1, local1649 + local1828);
								}
							}
						}
					}
				}
			}
		}
		@Pc(2344) int local2344;
		for (@Pc(2338) int local2338 = 0; local2338 < Static275.anInt5075; local2338++) {
			local2344 = Static558.anIntArray592[local2338];
			@Pc(2353) Class60_Sub1_Sub1_Sub3 local2353;
			if (local2344 < 2048) {
				local2353 = Static171.aClass60_Sub1_Sub1_Sub3_Sub1Array1[local2344];
			} else {
				local2353 = ((Class6_Sub11) Static419.aClass74_45.method1401((long) (local2344 - 2048))).aClass60_Sub1_Sub1_Sub3_Sub2_1;
			}
			local229 = Static312.anIntArray313[local2338];
			@Pc(2382) Class60_Sub1_Sub1_Sub3 local2382;
			if (local229 >= 2048) {
				local2382 = ((Class6_Sub11) Static419.aClass74_45.method1401((long) (local229 - 2048))).aClass60_Sub1_Sub1_Sub3_Sub2_1;
			} else {
				local2382 = Static171.aClass60_Sub1_Sub1_Sub3_Sub1Array1[local229];
			}
			Static156.method3097(local2353, --local2353.anInt4839, arg2, local2382, arg1, arg0, arg3);
		}
		local2344 = Static228.aClass53_7.anInt817 + Static228.aClass53_7.anInt811 + 2;
		for (local202 = 0; local202 < Static153.anInt3235; local202++) {
			local229 = Static300.anIntArray535[local202];
			local1108 = Static300.anIntArray537[local202];
			local471 = Static300.anIntArray534[local202];
			@Pc(2440) boolean local2440 = true;
			while (local2440) {
				local2440 = false;
				for (local621 = 0; local621 < local202; local621++) {
					if (local1108 + 2 > Static300.anIntArray537[local621] + -local2344 && local1108 - local2344 < Static300.anIntArray537[local621] - -2 && local229 - local471 < Static300.anIntArray535[local621] + Static300.anIntArray534[local621] && Static300.anIntArray535[local621] - Static300.anIntArray534[local621] < local471 + local229 && Static300.anIntArray537[local621] - local2344 < local1108) {
						local2440 = true;
						local1108 = Static300.anIntArray537[local621] - local2344;
					}
				}
			}
			Static300.anIntArray537[local202] = local1108;
			@Pc(2541) String local2541 = Static300.aStringArray35[local202];
			local278 = Static228.aClass53_7.method824(local2541);
			local363 = arg2 + local229;
			local366 = local1108 + arg0 - Static228.aClass53_7.anInt817;
			local1209 = local278 + local363;
			@Pc(2570) int local2570 = local1108 + arg0 + Static228.aClass53_7.anInt811;
			if (Static583.anInt9304 == 0) {
				@Pc(2602) int local2602 = 16776960;
				if (Static300.anIntArray539[local202] < 6) {
					local2602 = Static90.anIntArray614[Static300.anIntArray539[local202]];
				}
				if (Static300.anIntArray539[local202] == 6) {
					local2602 = Static227.anInt4418 % 20 < 10 ? 16711680 : 16776960;
				}
				if (Static300.anIntArray539[local202] == 7) {
					local2602 = Static227.anInt4418 % 20 < 10 ? 255 : 65535;
				}
				if (Static300.anIntArray539[local202] == 8) {
					local2602 = Static227.anInt4418 % 20 < 10 ? 45056 : 8454016;
				}
				@Pc(2687) int local2687;
				if (Static300.anIntArray539[local202] == 9) {
					local2687 = 150 - Static300.anIntArray536[local202];
					if (local2687 < 50) {
						local2602 = local2687 * 1280 + 16711680;
					} else if (local2687 < 100) {
						local2602 = 16776960 - (local2687 - 50) * 327680;
					} else if (local2687 < 150) {
						local2602 = local2687 * 5 + 65280 - 500;
					}
				}
				if (Static300.anIntArray539[local202] == 10) {
					local2687 = 150 - Static300.anIntArray536[local202];
					if (local2687 < 50) {
						local2602 = local2687 * 5 + 16711680;
					} else if (local2687 < 100) {
						local2602 = 16711935 - (local2687 - 50) * 327680;
					} else if (local2687 < 150) {
						local2602 = (local2687 - 100) * 327680 + 500 + 255 - local2687 * 5;
					}
				}
				if (Static300.anIntArray539[local202] == 11) {
					local2687 = 150 - Static300.anIntArray536[local202];
					if (local2687 < 50) {
						local2602 = 16777215 - local2687 * 327685;
					} else if (local2687 < 100) {
						local2602 = local2687 * 327685 - 16318970;
					} else if (local2687 < 150) {
						local2602 = 32768000 + 16777215 - local2687 * 327680;
					}
				}
				local2687 = local2602 | 0xFF000000;
				if (Static300.anIntArray538[local202] == 0) {
					local363 -= local278 >> 1;
					local1209 -= local278 >> 1;
					Static205.aClass67_6.method8291(arg0 + local1108, arg2 - -local229, local2687, -16777216, local2541);
				}
				if (Static300.anIntArray538[local202] == 1) {
					local366 -= 5;
					local363 -= local278 >> 1;
					Static205.aClass67_6.method8289(local2687, local1108 + arg0, local2541, arg2 + local229, Static227.anInt4418);
					local1209 -= local278 >> 1;
					local2570 += 5;
				}
				if (Static300.anIntArray538[local202] == 2) {
					local366 -= 5;
					local363 -= (local278 >> 1) + 5;
					Static205.aClass67_6.method8284(arg0 + local1108, local2541, arg2 + local229, local2687, Static227.anInt4418);
					local1209 -= (local278 >> 1) - 5;
					local2570 += 5;
				}
				if (Static300.anIntArray538[local202] == 3) {
					local363 -= local278 >> 1;
					local1209 -= local278 >> 1;
					local366 -= 7;
					Static205.aClass67_6.method8283(local2541, Static227.anInt4418, 150 - Static300.anIntArray536[local202], arg2 + local229, arg0 + local1108, local2687);
					local2570 += 7;
				}
				@Pc(3020) int local3020;
				if (Static300.anIntArray538[local202] == 4) {
					local3020 = (150 - Static300.anIntArray536[local202]) * (Static228.aClass53_7.method824(local2541) + 100) / 150;
					Static202.aClass75_5.T(arg2 + local229 - 50, arg0, local229 + arg2 + 50, arg1 + arg0);
					Static205.aClass67_6.method8294(local1108 + arg0, local2541, -16777216, local229 + arg2 + 50 - local3020, local2687);
					local1209 += 50 - local3020;
					local363 += 50 - local3020;
					Static202.aClass75_5.KA(arg2, arg0, arg3 + arg2, arg1 + arg0);
				}
				if (Static300.anIntArray538[local202] == 5) {
					local3020 = 150 - Static300.anIntArray536[local202];
					local1254 = 0;
					if (local3020 < 25) {
						local1254 = local3020 - 25;
					} else if (local3020 > 125) {
						local1254 = local3020 - 125;
					}
					local1256 = Static228.aClass53_7.anInt817 + Static228.aClass53_7.anInt811;
					Static202.aClass75_5.T(arg2, local1108 + arg0 - local1256 - 1, arg3 + arg2, local1108 + arg0 + 5);
					local1209 -= local278 >> 1;
					local2570 += local1254;
					local366 += local1254;
					local363 -= local278 >> 1;
					Static205.aClass67_6.method8291(local1254 + arg0 + local1108, local229 + arg2, local2687, -16777216, local2541);
					Static202.aClass75_5.KA(arg2, arg0, arg3 + arg2, arg1 + arg0);
				}
			} else {
				local1209 -= local278 >> 1;
				Static205.aClass67_6.method8291(arg0 + local1108, local229 + arg2, -256, -16777216, local2541);
				local363 -= local278 >> 1;
			}
			Static494.method3707(local366, local363, local2570 + 1, local1209 + 1);
		}
	}

	@OriginalMember(owner = "client!gka", name = "a", descriptor = "(Lclient!ns;)V")
	public static void method3723(@OriginalArg(0) Class256 arg0) {
		if (Static259.anInt4979 >= 65535) {
			return;
		}
		@Pc(7) Class6_Sub10 local7 = arg0.aClass6_Sub10_3;
		Static483.aClass256Array1[Static259.anInt4979] = arg0;
		Static78.aBooleanArray6[Static259.anInt4979] = false;
		Static259.anInt4979++;
		@Pc(22) int local22 = arg0.anInt7105;
		if (arg0.aBoolean531) {
			local22 = 0;
		}
		@Pc(30) int local30 = arg0.anInt7105;
		if (arg0.aBoolean532) {
			local30 = Static66.anInt802 - 1;
		}
		for (@Pc(39) int local39 = local22; local39 <= local30; local39++) {
			@Pc(42) int local42 = 0;
			@Pc(54) int local54 = local7.method8329() + Static430.anInt3928 - local7.method8331() >> Static594.anInt9440;
			if (local54 < 0) {
				local42 = -local54;
				local54 = 0;
			}
			@Pc(74) int local74 = local7.method8329() + local7.method8331() - Static430.anInt3928 >> Static594.anInt9440;
			if (local74 >= Static63.anInt777) {
				local74 = Static63.anInt777 - 1;
			}
			for (@Pc(83) int local83 = local54; local83 <= local74; local83++) {
				@Pc(90) short local90 = arg0.aShortArray78[local42++];
				@Pc(106) int local106 = (local7.method8332() + Static430.anInt3928 - local7.method8331() >> Static594.anInt9440) + (local90 >>> 8);
				@Pc(114) int local114 = local106 + (local90 & 0xFF) - 1;
				if (local106 < 0) {
					local106 = 0;
				}
				if (local114 >= Static230.anInt4470) {
					local114 = Static230.anInt4470 - 1;
				}
				for (@Pc(127) int local127 = local106; local127 <= local114; local127++) {
					@Pc(136) long local136 = Static191.aLongArrayArrayArray1[local39][local127][local83];
					if ((local136 & 0xFFFFL) == 0L) {
						Static191.aLongArrayArrayArray1[local39][local127][local83] = local136 | (long) Static259.anInt4979;
					} else if ((local136 & 0xFFFF0000L) == 0L) {
						Static191.aLongArrayArrayArray1[local39][local127][local83] = local136 | (long) Static259.anInt4979 << 16;
					} else if ((local136 & 0xFFFF00000000L) == 0L) {
						Static191.aLongArrayArrayArray1[local39][local127][local83] = local136 | (long) Static259.anInt4979 << 32;
					} else if ((local136 & 0xFFFF000000000000L) == 0L) {
						Static191.aLongArrayArrayArray1[local39][local127][local83] = local136 | (long) Static259.anInt4979 << 48;
					}
				}
			}
		}
	}
}
