import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!dp", name = "u", descriptor = "I")
	public static int anInt1987;

	@OriginalMember(owner = "client!dp", name = "r", descriptor = "Lclient!jo;")
	public static final Class187 aClass187_33 = new Class187(35, -1);

	@OriginalMember(owner = "client!dp", name = "t", descriptor = "Lclient!ke;")
	public static final Class196 aClass196_77 = new Class196(95, 6);

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(IIIIIII)V")
	public static void method1804(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		@Pc(5) int local5 = Static72.anInt9084;
		Static254.anInt4061 = 0;
		@Pc(9) int[] local9 = Static388.anIntArray381;
		@Pc(176) int local176;
		@Pc(212) int local212;
		@Pc(271) int local271;
		@Pc(344) int local344;
		@Pc(347) int local347;
		@Pc(1126) int local1126;
		@Pc(1172) int local1172;
		@Pc(1174) int local1174;
		@Pc(438) int local438;
		@Pc(1033) int local1033;
		@Pc(536) int local536;
		for (@Pc(11) int local11 = 0; local11 < Static386.anInt6720 + local5; local11++) {
			@Pc(14) Class311 local14 = null;
			@Pc(27) Class41_Sub1_Sub1_Sub3 local27;
			if (local5 > local11) {
				local27 = Static389.aClass41_Sub1_Sub1_Sub3_Sub2Array2[local9[local11]];
			} else {
				local27 = ((Class5_Sub34) Static223.aClass335_19.method7766((long) Static662.anIntArray600[local11 - local5])).aClass41_Sub1_Sub1_Sub3_Sub1_1;
				local14 = ((Class41_Sub1_Sub1_Sub3_Sub1) local27).aClass311_1;
				if (local14.anIntArray476 != null) {
					local14 = local14.method7325(Static413.aClass63_1);
					if (local14 == null) {
						continue;
					}
				}
			}
			if (local27.anInt9473 >= 0 && (local27.anInt9514 == Static219.anInt3472 || local27.aByte149 == Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.aByte149)) {
				Static528.method7373(arg3 >> 1, arg0 >> 1, local27, local27.method7931());
				if (Static340.anIntArray352[0] >= 0) {
					if (local27.aString99 != null && (local11 >= local5 || Static557.anInt9100 == 0 || Static557.anInt9100 == 3 || Static557.anInt9100 == 1 && Static466.method6894(((Class41_Sub1_Sub1_Sub3_Sub2) local27).aString100)) && Static254.anInt4061 < Static428.anInt7580) {
						Static428.anIntArray421[Static254.anInt4061] = Static358.aClass198_7.method4076(local27.aString99) / 2;
						Static428.anIntArray422[Static254.anInt4061] = Static340.anIntArray352[0];
						Static428.anIntArray424[Static254.anInt4061] = Static340.anIntArray352[1];
						Static428.anIntArray419[Static254.anInt4061] = local27.anInt9486;
						Static428.anIntArray423[Static254.anInt4061] = local27.anInt9495;
						Static428.anIntArray420[Static254.anInt4061] = local27.anInt9467;
						Static428.aStringArray27[Static254.anInt4061] = local27.aString99;
						Static254.anInt4061++;
					}
					local176 = arg2 + Static340.anIntArray352[1];
					@Pc(256) Class59[] local256;
					@Pc(263) Class301[] local263;
					@Pc(316) Class59 local316;
					if (local27.aBoolean692 || local27.anInt9522 <= Static421.anInt7434) {
						local176 -= Math.max(Static358.aClass198_7.anInt4647, Static574.aClass59Array17[0].method8061());
					} else {
						@Pc(202) byte local202 = 1;
						if (local5 <= local11) {
							local212 = local14.anInt8669;
							if (local212 == -1) {
								local212 = local27.method7933().anInt4784;
							}
						} else {
							@Pc(229) Class41_Sub1_Sub1_Sub3_Sub2 local229 = Static389.aClass41_Sub1_Sub1_Sub3_Sub2Array2[local9[local11]];
							local212 = local27.method7933().anInt4784;
							if (local229.aBoolean698) {
								local202 = 2;
							}
						}
						@Pc(243) Class59[] local243 = Static574.aClass59Array17;
						if (local212 != -1) {
							local256 = (Class59[]) Static405.aClass265_44.method6577((long) local212);
							if (local256 == null) {
								local263 = Static684.method7227(Static471.aClass50_136, local212);
								if (local263 != null) {
									local256 = new Class59[local263.length];
									for (local271 = 0; local271 < local263.length; local271++) {
										local256[local271] = Static563.aClass143_13.method6247(local263[local271], true);
									}
									Static405.aClass265_44.method6566(local256, (long) local212);
								}
							}
							if (local256 != null && local256.length >= 2) {
								local243 = local256;
							}
						}
						if (local202 >= local243.length) {
							local202 = 1;
						}
						@Pc(312) Class59 local312 = local243[0];
						local316 = local243[local202];
						local176 -= Math.max(Static358.aClass198_7.anInt4647, local312.method8061());
						local271 = arg1 + Static340.anIntArray352[0] - (local312.method8049() >> 1);
						local344 = local312.method8049() * local27.anInt9492 / 255;
						local347 = local312.method8061();
						if (local27.anInt9492 > 0 && local344 < 2) {
							local344 = 2;
						}
						local312.method8057(local271, local176);
						Static563.aClass143_13.T(local271, local176, local271 + local344, local176 + local347);
						local316.method8057(local271, local176);
						Static563.aClass143_13.KA(arg1, arg2, arg1 + arg0, arg2 + arg3);
						Static430.method7439(local176, local347 + local176, local271, local312.method8053() + local271);
					}
					local176 -= 2;
					if (!local27.aBoolean692) {
						@Pc(419) Class59 local419;
						@Pc(428) Class59 local428;
						if (local27.anInt9458 > Static421.anInt7434) {
							local419 = Static267.aClass59Array9[local27.aBoolean691 ? 2 : 0];
							local428 = Static267.aClass59Array9[local27.aBoolean691 ? 3 : 1];
							if (local27 instanceof Class41_Sub1_Sub1_Sub3_Sub1) {
								local438 = local14.anInt8645;
								if (local438 == -1) {
									local438 = local27.method7933().anInt4755;
								}
							} else {
								local438 = local27.method7933().anInt4755;
							}
							if (local438 != -1) {
								local256 = (Class59[]) Static395.aClass265_41.method6577((long) local438);
								if (local256 == null) {
									local263 = Static684.method7227(Static471.aClass50_136, local438);
									if (local263 != null) {
										local256 = new Class59[local263.length];
										for (local271 = 0; local271 < local263.length; local271++) {
											local256[local271] = Static563.aClass143_13.method6247(local263[local271], true);
										}
										Static395.aClass265_41.method6566(local256, (long) local438);
									}
								}
								if (local256 != null && local256.length == 4) {
									local419 = local256[local27.aBoolean691 ? 2 : 0];
									local428 = local256[local27.aBoolean691 ? 3 : 1];
								}
							}
							@Pc(529) int local529 = local27.anInt9458 - Static421.anInt7434;
							if (local27.anInt9493 >= local529) {
								local536 = local419.method8049();
							} else {
								local529 -= local27.anInt9493;
								local271 = local27.anInt9497 == 0 ? 0 : local27.anInt9497 * ((local27.anInt9510 - local529) / local27.anInt9497);
								local536 = local419.method8049() * local271 / local27.anInt9510;
							}
							local271 = local419.method8061();
							local176 -= local271;
							local344 = Static340.anIntArray352[0] + arg1 - (local419.method8049() >> 1);
							local419.method8057(local344, local176);
							Static563.aClass143_13.T(local344, local176, local536 + local344, local176 + local271);
							local428.method8057(local344, local176);
							Static563.aClass143_13.KA(arg1, arg2, arg1 + arg0, arg3 + arg2);
							Static430.method7439(local176, local176 + local271, local344, local344 + local419.method8053());
							local176 -= 2;
						}
						if (local5 > local11) {
							@Pc(635) Class41_Sub1_Sub1_Sub3_Sub2 local635 = (Class41_Sub1_Sub1_Sub3_Sub2) local27;
							if (local635.anInt9552 != -1) {
								local176 -= 25;
								local428 = Static177.aClass59Array6[local635.anInt9552];
								local428.method8057(arg1 + Static340.anIntArray352[0] - 12, local176);
								Static430.method7439(local176, local428.method8064() + local176, Static340.anIntArray352[0] + arg1 + -12, Static340.anIntArray352[0] + arg1 + local428.method8053() - 12);
								local176 -= 2;
							}
							if (local635.anInt9535 != -1) {
								local176 -= 25;
								local428 = Static474.aClass59Array15[local635.anInt9535];
								local428.method8057(arg1 + Static340.anIntArray352[0] - 12, local176);
								Static430.method7439(local176, local176 + local428.method8064(), Static340.anIntArray352[0] + (arg1 - 12), arg1 + Static340.anIntArray352[0] + local428.method8053() - 12);
								local176 -= 2;
							}
						} else if (local14.anInt8649 >= 0 && local14.anInt8649 < Static474.aClass59Array15.length) {
							local176 -= 25;
							local419 = Static474.aClass59Array15[local14.anInt8649];
							local419.method8057(Static340.anIntArray352[0] + arg1 - (local419.method8049() >> 1), local176);
							Static430.method7439(local176, local176 + local419.method8064(), arg1 - (-Static340.anIntArray352[0] + (local419.method8049() >> 1)), arg1 + Static340.anIntArray352[0] - (local419.method8049() >> 1) + local419.method8053());
							local176 -= 2;
						}
					}
					@Pc(808) Class358[] local808;
					@Pc(815) Class358 local815;
					if (!(local27 instanceof Class41_Sub1_Sub1_Sub3_Sub2)) {
						local212 = 0;
						local808 = Static217.aClass358Array1;
						for (local438 = 0; local438 < local808.length; local438++) {
							local815 = local808[local438];
							if (local815 != null && local815.anInt9736 == 1 && local815.anInt9743 == Static662.anIntArray600[local11 - local5]) {
								local316 = Static283.aClass59Array10[local815.anInt9738];
								if (local316.method8061() > local212) {
									local212 = local316.method8061();
								}
								if (Static421.anInt7434 % 20 < 10) {
									local316.method8057(arg1 + Static340.anIntArray352[0] - 12, local176 - local316.method8061());
									Static430.method7439(local176 - local316.method8061(), -local316.method8061() + local176 - -local316.method8064(), arg1 + Static340.anIntArray352[0] - 12, Static340.anIntArray352[0] + -12 + arg1 + local316.method8053());
								}
							}
						}
						if (local212 > 0) {
						}
					} else if (local11 >= 0) {
						local212 = 0;
						local808 = Static217.aClass358Array1;
						for (local438 = 0; local438 < local808.length; local438++) {
							local815 = local808[local438];
							if (local815 != null && local815.anInt9736 == 10 && local9[local11] == local815.anInt9743) {
								local316 = Static283.aClass59Array10[local815.anInt9738];
								if (local212 < local316.method8061()) {
									local212 = local316.method8061();
								}
								local316.method8057(arg1 + Static340.anIntArray352[0] - 12, -local316.method8061() + local176);
								Static430.method7439(local176 - local316.method8061(), -local316.method8061() + local176 + local316.method8064(), arg1 + Static340.anIntArray352[0] - 12, Static340.anIntArray352[0] + (arg1 - (-local316.method8053() + 12)));
							}
						}
						if (local212 > 0) {
						}
					}
					for (local212 = 0; local212 < Static467.anInt8128; local212++) {
						local1033 = local27.anIntArray523[local212];
						local438 = local27.anIntArray525[local212];
						@Pc(1040) Class126 local1040 = null;
						local536 = 0;
						if (local438 >= 0) {
							if (local1033 <= Static421.anInt7434) {
								continue;
							}
							local1040 = Static239.aClass115_2.method2374(local27.anIntArray525[local212]);
							local536 = local1040.anInt2965;
						} else if (local1033 < 0) {
							continue;
						}
						local271 = local27.anIntArray522[local212];
						@Pc(1070) Class126 local1070 = null;
						if (local271 >= 0) {
							local1070 = Static239.aClass115_2.method2374(local271);
						}
						if (Static421.anInt7434 >= local1033 - local536) {
							local347 = local27.anIntArray526[local212];
							if (local347 >= 0) {
								local27.anInt9522 = Static421.anInt7434 + 300;
								local27.anInt9492 = local347;
								local27.anIntArray526[local212] = -1;
							}
							if (local1040 == null) {
								local27.anIntArray523[local212] = -1;
							} else {
								local1126 = local27.method7931() / 2;
								Static528.method7373(arg3 >> 1, arg0 >> 1, local27, local1126);
								if (Static340.anIntArray352[0] > -1) {
									Static340.anIntArray352[0] += Static502.anIntArray466[local212];
									Static340.anIntArray352[1] += Static221.anIntArray195[local212];
									local1172 = 0;
									local1174 = 0;
									@Pc(1176) int local1176 = 0;
									@Pc(1178) int local1178 = 0;
									@Pc(1180) int local1180 = 0;
									@Pc(1182) int local1182 = 0;
									@Pc(1184) int local1184 = 0;
									@Pc(1186) int local1186 = 0;
									@Pc(1188) Class59 local1188 = null;
									@Pc(1190) Class59 local1190 = null;
									@Pc(1192) Class59 local1192 = null;
									@Pc(1194) Class59 local1194 = null;
									@Pc(1196) int local1196 = 0;
									@Pc(1198) int local1198 = 0;
									@Pc(1200) int local1200 = 0;
									@Pc(1202) int local1202 = 0;
									@Pc(1204) int local1204 = 0;
									@Pc(1206) int local1206 = 0;
									@Pc(1208) int local1208 = 0;
									@Pc(1210) int local1210 = 0;
									@Pc(1212) int local1212 = 0;
									@Pc(1217) Class59 local1217 = local1040.method2640(Static563.aClass143_13);
									@Pc(1225) int local1225;
									if (local1217 != null) {
										local1172 = local1217.method8049();
										local1225 = local1217.method8061();
										local1217.method8059(Static362.anIntArray358);
										if (local1225 > 0) {
											local1212 = local1225;
										}
										local1180 = Static362.anIntArray358[0];
									}
									@Pc(1248) Class59 local1248 = local1040.method2646(Static563.aClass143_13);
									if (local1248 != null) {
										local1174 = local1248.method8049();
										local1225 = local1248.method8061();
										if (local1212 < local1225) {
											local1212 = local1225;
										}
										local1248.method8059(Static362.anIntArray358);
										local1182 = Static362.anIntArray358[0];
									}
									@Pc(1275) Class59 local1275 = local1040.method2643(Static563.aClass143_13);
									if (local1275 != null) {
										local1176 = local1275.method8049();
										local1225 = local1275.method8061();
										local1275.method8059(Static362.anIntArray358);
										if (local1225 > local1212) {
											local1212 = local1225;
										}
										local1184 = Static362.anIntArray358[0];
									}
									@Pc(1300) Class59 local1300 = local1040.method2645(Static563.aClass143_13);
									if (local1300 != null) {
										local1178 = local1300.method8049();
										local1225 = local1300.method8061();
										local1300.method8059(Static362.anIntArray358);
										if (local1225 > local1212) {
											local1212 = local1225;
										}
										local1186 = Static362.anIntArray358[0];
									}
									if (local1070 != null) {
										local1188 = local1070.method2640(Static563.aClass143_13);
										if (local1188 != null) {
											local1196 = local1188.method8049();
											local1225 = local1188.method8061();
											local1188.method8059(Static362.anIntArray358);
											if (local1225 > local1212) {
												local1212 = local1225;
											}
											local1204 = Static362.anIntArray358[0];
										}
										local1190 = local1070.method2646(Static563.aClass143_13);
										if (local1190 != null) {
											local1198 = local1190.method8049();
											local1225 = local1190.method8061();
											local1190.method8059(Static362.anIntArray358);
											if (local1225 > local1212) {
												local1212 = local1225;
											}
											local1206 = Static362.anIntArray358[0];
										}
										local1192 = local1070.method2643(Static563.aClass143_13);
										if (local1192 != null) {
											local1200 = local1192.method8049();
											local1225 = local1192.method8061();
											if (local1212 < local1225) {
												local1212 = local1225;
											}
											local1192.method8059(Static362.anIntArray358);
											local1208 = Static362.anIntArray358[0];
										}
										local1194 = local1070.method2645(Static563.aClass143_13);
										if (local1194 != null) {
											local1202 = local1194.method8049();
											local1225 = local1194.method8061();
											local1194.method8059(Static362.anIntArray358);
											if (local1212 < local1225) {
												local1212 = local1225;
											}
											local1210 = Static362.anIntArray358[0];
										}
									}
									@Pc(1432) Class72 local1432 = Static383.aClass72_10;
									@Pc(1434) Class72 local1434 = Static383.aClass72_10;
									@Pc(1436) Class198 local1436 = Static172.aClass198_4;
									local1225 = local1040.anInt2973;
									@Pc(1441) Class198 local1441 = Static172.aClass198_4;
									@Pc(1452) Class72 local1452;
									@Pc(1459) Class198 local1459;
									if (local1225 >= 0) {
										local1452 = Static250.method3527(local1225, Static563.aClass143_13, true);
										local1459 = Static403.method5900(Static563.aClass143_13, local1225);
										if (local1452 != null && local1459 != null) {
											local1436 = local1459;
											local1432 = local1452;
										}
									}
									if (local1070 != null) {
										local1225 = local1070.anInt2973;
										if (local1225 >= 0) {
											local1452 = Static250.method3527(local1225, Static563.aClass143_13, true);
											local1459 = Static403.method5900(Static563.aClass143_13, local1225);
											if (local1452 != null && local1459 != null) {
												local1434 = local1452;
												local1441 = local1459;
											}
										}
									}
									@Pc(1497) String local1497 = null;
									@Pc(1501) int local1501 = 0;
									@Pc(1509) String local1509 = local1040.method2648(local27.anIntArray518[local212]);
									@Pc(1514) int local1514 = local1436.method4076(local1509);
									if (local1070 != null) {
										local1497 = local1070.method2648(local27.anIntArray519[local212]);
										local1501 = local1441.method4076(local1497);
									}
									@Pc(1531) int local1531 = 0;
									if (local1174 > 0) {
										local1531 = local1514 / local1174 + 1;
									}
									@Pc(1544) int local1544 = 0;
									if (local1070 != null && local1198 > 0) {
										local1544 = local1501 / local1198 + 1;
									}
									@Pc(1559) int local1559 = 0;
									if (local1172 > 0) {
										local1559 = local1172;
									}
									local1559 += 2;
									@Pc(1573) int local1573 = local1559;
									if (local1176 > 0) {
										local1559 += local1176;
									}
									@Pc(1581) int local1581 = local1559;
									@Pc(1583) int local1583 = local1559;
									@Pc(1594) int local1594;
									if (local1174 <= 0) {
										local1559 += local1514;
									} else {
										local1594 = local1174 * local1531;
										local1583 = local1559 + (local1594 - local1514) / 2;
										local1559 += local1594;
									}
									local1594 = local1559;
									if (local1178 > 0) {
										local1559 += local1178;
									}
									@Pc(1620) int local1620 = 0;
									@Pc(1622) int local1622 = 0;
									@Pc(1624) int local1624 = 0;
									@Pc(1626) int local1626 = 0;
									@Pc(1628) int local1628 = 0;
									@Pc(1663) int local1663;
									if (local1070 != null) {
										local1559 += 2;
										local1620 = local1559;
										if (local1196 > 0) {
											local1559 += local1196;
										}
										local1559 += 2;
										local1622 = local1559;
										if (local1200 > 0) {
											local1559 += local1200;
										}
										local1624 = local1559;
										local1628 = local1559;
										if (local1198 <= 0) {
											local1559 += local1501;
										} else {
											local1663 = local1198 * local1544;
											local1628 = local1559 + (local1663 - local1501) / 2;
											local1559 += local1663;
										}
										local1626 = local1559;
										if (local1202 > 0) {
											local1559 += local1202;
										}
									}
									local1663 = local27.anIntArray523[local212] - Static421.anInt7434;
									@Pc(1706) int local1706 = local1040.anInt2981 - local1040.anInt2981 * local1663 / local1040.anInt2965;
									@Pc(1718) int local1718 = local1040.anInt2984 * local1663 / local1040.anInt2965 - local1040.anInt2984;
									@Pc(1731) int local1731 = Static340.anIntArray352[0] + arg1 + local1706 - (local1559 >> 1);
									@Pc(1742) int local1742 = arg2 + Static340.anIntArray352[1] + local1718 - 12;
									@Pc(1744) int local1744 = local1742;
									@Pc(1748) int local1748 = local1742 + local1212;
									@Pc(1755) int local1755 = local1040.anInt2970 + local1742 + 15;
									@Pc(1761) int local1761 = local1755 - local1436.anInt4647;
									if (local1761 < local1742) {
										local1744 = local1761;
									}
									@Pc(1775) int local1775 = local1755 + local1436.anInt4648;
									if (local1748 < local1775) {
										local1748 = local1775;
									}
									@Pc(1782) int local1782 = 0;
									@Pc(1797) int local1797;
									@Pc(1808) int local1808;
									if (local1070 != null) {
										local1782 = local1742 + local1070.anInt2970 + 15;
										local1797 = local1782 - local1441.anInt4647;
										if (local1797 < local1744) {
											local1744 = local1797;
										}
										local1808 = local1782 + local1441.anInt4648;
										if (local1748 < local1808) {
											local1748 = local1808;
										}
									}
									local1797 = 255;
									if (local1040.anInt2977 >= 0) {
										local1797 = (local1663 << 8) / (local1040.anInt2965 - local1040.anInt2977);
									}
									if (local1797 >= 0 && local1797 < 255) {
										local1808 = local1797 << 24;
										@Pc(1985) int local1985 = local1808 | 0xFFFFFF;
										if (local1217 != null) {
											local1217.method8067(local1731 - local1180, local1742, 0, local1985, 1);
										}
										if (local1275 != null) {
											local1275.method8067(local1731 + local1573 - local1184, local1742, 0, local1985, 1);
										}
										@Pc(2017) int local2017;
										if (local1248 != null) {
											for (local2017 = 0; local2017 < local1531; local2017++) {
												local1248.method8067(local2017 * local1174 + local1581 + local1731 - local1182, local1742, 0, local1985, 1);
											}
										}
										if (local1300 != null) {
											local1300.method8067(local1594 + local1731 - local1186, local1742, 0, local1985, 1);
										}
										local1432.method6925(local1755, local1509, local1731 + local1583, 0, local1040.anInt2985 | local1808);
										if (local1070 != null) {
											if (local1188 != null) {
												local1188.method8067(local1620 + local1731 - local1204, local1742, 0, local1985, 1);
											}
											if (local1192 != null) {
												local1192.method8067(local1731 + local1622 - local1208, local1742, 0, local1985, 1);
											}
											if (local1190 != null) {
												for (local2017 = 0; local2017 < local1544; local2017++) {
													local1190.method8067(local1624 + local1731 + local1198 * local2017 - local1206, local1742, 0, local1985, 1);
												}
											}
											if (local1194 != null) {
												local1194.method8067(local1626 + local1731 - local1210, local1742, 0, local1985, 1);
											}
											local1434.method6925(local1782, local1497, local1628 + local1731, 0, local1808 | local1070.anInt2985);
										}
									} else {
										if (local1217 != null) {
											local1217.method8057(local1731 - local1180, local1742);
										}
										if (local1275 != null) {
											local1275.method8057(local1573 + local1731 - local1184, local1742);
										}
										if (local1248 != null) {
											for (local1808 = 0; local1808 < local1531; local1808++) {
												local1248.method8057(local1581 + local1731 + local1174 * local1808 - local1182, local1742);
											}
										}
										if (local1300 != null) {
											local1300.method8057(local1594 + local1731 - local1186, local1742);
										}
										local1432.method6925(local1755, local1509, local1731 + local1583, 0, local1040.anInt2985 | 0xFF000000);
										if (local1070 != null) {
											if (local1188 != null) {
												local1188.method8057(local1731 + local1620 - local1204, local1742);
											}
											if (local1192 != null) {
												local1192.method8057(local1731 + local1622 - local1208, local1742);
											}
											if (local1190 != null) {
												for (local1808 = 0; local1808 < local1544; local1808++) {
													local1190.method8057(local1808 * local1198 + local1624 + local1731 - local1206, local1742);
												}
											}
											if (local1194 != null) {
												local1194.method8057(local1731 + local1626 - local1210, local1742);
											}
											local1434.method6925(local1782, local1497, local1628 + local1731, 0, local1070.anInt2985 | 0xFF000000);
										}
									}
									Static430.method7439(local1744, local1748 + 1, local1731, local1731 + local1559);
								}
							}
						}
					}
				}
			}
		}
		@Pc(2178) int local2178;
		for (@Pc(2173) int local2173 = 0; local2173 < Static251.anInt3743; local2173++) {
			local2178 = Static553.anIntArray496[local2173];
			@Pc(2191) Class41_Sub1_Sub1_Sub3 local2191;
			if (local2178 >= 2048) {
				local2191 = ((Class5_Sub34) Static223.aClass335_19.method7766((long) (local2178 - 2048))).aClass41_Sub1_Sub1_Sub3_Sub1_1;
			} else {
				local2191 = Static389.aClass41_Sub1_Sub1_Sub3_Sub2Array2[local2178];
			}
			local212 = Static434.anIntArray428[local2173];
			@Pc(2207) Class41_Sub1_Sub1_Sub3 local2207;
			if (local212 < 2048) {
				local2207 = Static389.aClass41_Sub1_Sub1_Sub3_Sub2Array2[local212];
			} else {
				local2207 = ((Class5_Sub34) Static223.aClass335_19.method7766((long) (local212 - 2048))).aClass41_Sub1_Sub1_Sub3_Sub1_1;
			}
			Static239.method3446(local2191, arg1, arg3, arg2, local2207, arg0, --local2191.anInt9506);
		}
		local2178 = Static358.aClass198_7.anInt4647 + Static358.aClass198_7.anInt4648 + 2;
		for (local176 = 0; local176 < Static254.anInt4061; local176++) {
			local212 = Static428.anIntArray422[local176];
			local1033 = Static428.anIntArray424[local176];
			local438 = Static428.anIntArray421[local176];
			@Pc(2270) boolean local2270 = true;
			while (local2270) {
				local2270 = false;
				for (local536 = 0; local536 < local176; local536++) {
					if (local1033 + 2 > -local2178 + Static428.anIntArray424[local536] && Static428.anIntArray424[local536] + 2 > local1033 + -local2178 && Static428.anIntArray421[local536] + Static428.anIntArray422[local536] > local212 + -local438 && Static428.anIntArray422[local536] - Static428.anIntArray421[local536] < local438 + local212 && Static428.anIntArray424[local536] - local2178 < local1033) {
						local2270 = true;
						local1033 = Static428.anIntArray424[local536] - local2178;
					}
				}
			}
			Static428.anIntArray424[local176] = local1033;
			@Pc(2371) String local2371 = Static428.aStringArray27[local176];
			local271 = Static358.aClass198_7.method4076(local2371);
			local344 = local212 + arg1;
			local347 = local1033 + arg2 - Static358.aClass198_7.anInt4647;
			local1126 = local271 + local344;
			@Pc(2400) int local2400 = local1033 + arg2 + Static358.aClass198_7.anInt4648;
			if (Static94.anInt1556 == 0) {
				@Pc(2404) int local2404 = 16776960;
				if (Static428.anIntArray419[local176] < 6) {
					local2404 = Static368.anIntArray364[Static428.anIntArray419[local176]];
				}
				if (Static428.anIntArray419[local176] == 6) {
					local2404 = Static219.anInt3472 % 20 < 10 ? 16711680 : 16776960;
				}
				if (Static428.anIntArray419[local176] == 7) {
					local2404 = Static219.anInt3472 % 20 >= 10 ? 65535 : 255;
				}
				if (Static428.anIntArray419[local176] == 8) {
					local2404 = Static219.anInt3472 % 20 < 10 ? 45056 : 8454016;
				}
				@Pc(2476) int local2476;
				if (Static428.anIntArray419[local176] == 9) {
					local2476 = 150 - Static428.anIntArray420[local176];
					if (local2476 < 50) {
						local2404 = local2476 * 1280 + 16711680;
					} else if (local2476 < 100) {
						local2404 = 33160960 - local2476 * 327680;
					} else if (local2476 < 150) {
						local2404 = local2476 * 5 + 65280 - 500;
					}
				}
				if (Static428.anIntArray419[local176] == 10) {
					local2476 = 150 - Static428.anIntArray420[local176];
					if (local2476 < 50) {
						local2404 = local2476 * 5 + 16711680;
					} else if (local2476 < 100) {
						local2404 = 16711935 - (local2476 - 50) * 327680;
					} else if (local2476 < 150) {
						local2404 = (local2476 - 100) * 327680 + 255 - (local2476 + -100) * 5;
					}
				}
				if (Static428.anIntArray419[local176] == 11) {
					local2476 = 150 - Static428.anIntArray420[local176];
					if (local2476 < 50) {
						local2404 = 16777215 - local2476 * 327685;
					} else if (local2476 < 100) {
						local2404 = local2476 * 327685 + 65280 - 16384250;
					} else if (local2476 < 150) {
						local2404 = 16777215 - (local2476 - 100) * 327680;
					}
				}
				local2476 = local2404 | 0xFF000000;
				if (Static428.anIntArray423[local176] == 0) {
					Static32.aClass72_2.method6919(local2476, local212 + arg1, local2371, arg2 + local1033, -16777216);
					local1126 -= local271 >> 1;
					local344 -= local271 >> 1;
				}
				if (Static428.anIntArray423[local176] == 1) {
					local1126 -= local271 >> 1;
					local344 -= local271 >> 1;
					local2400 += 5;
					local347 -= 5;
					Static32.aClass72_2.method6921(Static219.anInt3472, local1033 + arg2, local2476, arg1 + local212, local2371);
				}
				if (Static428.anIntArray423[local176] == 2) {
					local347 -= 5;
					local1126 -= (local271 >> 1) - 5;
					local344 -= (local271 >> 1) + 5;
					Static32.aClass72_2.method6914(local2476, local1033 + arg2, local2371, Static219.anInt3472, arg1 + local212);
					local2400 += 5;
				}
				if (Static428.anIntArray423[local176] == 3) {
					Static32.aClass72_2.method6909(local2371, local1033 + arg2, local2476, Static219.anInt3472, 150 - Static428.anIntArray420[local176], local212 + arg1);
					local2400 += 7;
					local1126 -= local271 >> 1;
					local347 -= 7;
					local344 -= local271 >> 1;
				}
				@Pc(2780) int local2780;
				if (Static428.anIntArray423[local176] == 4) {
					local2780 = (150 - Static428.anIntArray420[local176]) * (Static358.aClass198_7.method4076(local2371) + 100) / 150;
					Static563.aClass143_13.T(local212 + arg1 - 50, arg2, arg1 + local212 + 50, arg3 + arg2);
					Static32.aClass72_2.method6925(local1033 + arg2, local2371, local212 + arg1 + 50 - local2780, -16777216, local2476);
					local344 += 50 - local2780;
					local1126 += 50 - local2780;
					Static563.aClass143_13.KA(arg1, arg2, arg1 + arg0, arg2 - -arg3);
				}
				if (Static428.anIntArray423[local176] == 5) {
					local2780 = 150 - Static428.anIntArray420[local176];
					local1172 = 0;
					if (local2780 < 25) {
						local1172 = local2780 - 25;
					} else if (local2780 > 125) {
						local1172 = local2780 - 125;
					}
					local1174 = Static358.aClass198_7.anInt4648 + Static358.aClass198_7.anInt4647;
					Static563.aClass143_13.T(arg1, arg2 + local1033 - local1174 - 1, arg1 + arg0, arg2 + local1033 + 5);
					local2400 += local1172;
					Static32.aClass72_2.method6919(local2476, arg1 + local212, local2371, arg2 + local1033 + local1172, -16777216);
					local344 -= local271 >> 1;
					local347 += local1172;
					local1126 -= local271 >> 1;
					Static563.aClass143_13.KA(arg1, arg2, arg0 + arg1, arg3 + arg2);
				}
			} else {
				Static32.aClass72_2.method6919(-256, local212 + arg1, local2371, local1033 + arg2, -16777216);
				local1126 -= local271 >> 1;
				local344 -= local271 >> 1;
			}
			Static430.method7439(local347, local2400 + 1, local344, local1126 + 1);
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(Z)V")
	public static void method1808() {
		@Pc(5) int local5 = 0;
		for (@Pc(12) int local12 = 0; local12 < Static124.anInt2150; local12++) {
			for (@Pc(15) int local15 = 0; local15 < Static64.anInt1015; local15++) {
				if (Static406.method5941(local5, local15, true, Static129.aClass313ArrayArrayArray7, local12)) {
					local5++;
				}
				if (local5 >= 512) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!dp", name = "d", descriptor = "(I)V")
	public static void method1812() {
		@Pc(7) int local7 = Static72.anInt9084;
		@Pc(9) int[] local9 = Static388.anIntArray381;
		for (@Pc(16) int local16 = 0; local16 < local7; local16++) {
			@Pc(24) Class41_Sub1_Sub1_Sub3_Sub2 local24 = Static389.aClass41_Sub1_Sub1_Sub3_Sub2Array2[local9[local16]];
			if (local24 != null && local24.anInt9467 > 0) {
				local24.anInt9467--;
				if (local24.anInt9467 == 0) {
					local24.aString99 = null;
				}
			}
		}
		for (@Pc(51) int local51 = 0; local51 < Static386.anInt6720; local51++) {
			@Pc(58) long local58 = (long) Static662.anIntArray600[local51];
			@Pc(64) Class5_Sub34 local64 = (Class5_Sub34) Static223.aClass335_19.method7766(local58);
			if (local64 != null) {
				@Pc(69) Class41_Sub1_Sub1_Sub3_Sub1 local69 = local64.aClass41_Sub1_Sub1_Sub3_Sub1_1;
				if (local69.anInt9467 > 0) {
					local69.anInt9467--;
					if (local69.anInt9467 == 0) {
						local69.aString99 = null;
					}
				}
			}
		}
	}
}
