import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static426 {

	@OriginalMember(owner = "client!pda", name = "m", descriptor = "Lclient!ni;")
	public static Class223 aClass223_95;

	@OriginalMember(owner = "client!pda", name = "n", descriptor = "Lclient!ea;")
	public static final Class73 aClass73_140 = new Class73(86, 6);

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(IIIIBII)V")
	public static void method6610(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		@Pc(7) int local7 = Static6.anInt462;
		@Pc(9) int[] local9 = Static551.anIntArray503;
		Static126.anInt3133 = 0;
		@Pc(181) int local181;
		@Pc(202) int local202;
		@Pc(258) int local258;
		@Pc(333) int local333;
		@Pc(336) int local336;
		@Pc(1137) int local1137;
		@Pc(1183) int local1183;
		@Pc(1185) int local1185;
		@Pc(436) int local436;
		@Pc(1041) int local1041;
		@Pc(541) int local541;
		for (@Pc(13) int local13 = 0; local13 < Static288.anInt5977 + local7; local13++) {
			@Pc(17) Class158 local17 = null;
			@Pc(37) Class9_Sub4_Sub2_Sub1 local37;
			if (local13 >= local7) {
				local37 = ((Class6_Sub42) Static461.aClass380_35.method8747((long) Static562.anIntArray508[local13 - local7])).aClass9_Sub4_Sub2_Sub1_Sub1_1;
				local17 = ((Class9_Sub4_Sub2_Sub1_Sub1) local37).aClass158_1;
				if (local17.anIntArray260 != null) {
					local17 = local17.method4867(Static140.aClass157_1);
					if (local17 == null) {
						continue;
					}
				}
			} else {
				local37 = Static643.aClass9_Sub4_Sub2_Sub1_Sub2Array1[local9[local13]];
			}
			if (local37.anInt4300 >= 0 && (Static322.anInt6388 == local37.anInt4345 || local37.aByte135 == Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.aByte135)) {
				Static39.method1341(local37.method3630(), arg0 >> 1, local37, arg1 >> 1);
				if (Static456.anIntArray426[0] >= 0) {
					if (local37.aString44 != null && (local7 <= local13 || Static467.anInt8313 == 0 || Static467.anInt8313 == 3 || Static467.anInt8313 == 1 && Static534.method7568(((Class9_Sub4_Sub2_Sub1_Sub2) local37).aString46)) && Static409.anInt7604 > Static126.anInt3133) {
						Static409.anIntArray380[Static126.anInt3133] = Static2.aClass213_9.method5831(local37.aString44) / 2;
						Static409.anIntArray377[Static126.anInt3133] = Static456.anIntArray426[0];
						Static409.anIntArray381[Static126.anInt3133] = Static456.anIntArray426[1];
						Static409.anIntArray378[Static126.anInt3133] = local37.anInt4325;
						Static409.anIntArray379[Static126.anInt3133] = local37.anInt4329;
						Static409.anIntArray376[Static126.anInt3133] = local37.anInt4311;
						Static409.aStringArray23[Static126.anInt3133] = local37.aString44;
						Static126.anInt3133++;
					}
					local181 = arg3 + Static456.anIntArray426[1];
					@Pc(243) Class4[] local243;
					@Pc(250) Class331[] local250;
					@Pc(306) Class4 local306;
					if (local37.aBoolean350 || Static384.anInt7234 >= local37.anInt4346) {
						local181 -= Math.max(Static2.aClass213_9.anInt6973, Static447.aClass4Array12[0].method7694());
					} else {
						@Pc(196) byte local196 = 1;
						if (local7 <= local13) {
							local202 = local17.anInt5840;
							if (local202 == -1) {
								local202 = local37.method3625().anInt8960;
							}
						} else {
							@Pc(221) Class9_Sub4_Sub2_Sub1_Sub2 local221 = Static643.aClass9_Sub4_Sub2_Sub1_Sub2Array1[local9[local13]];
							local202 = local37.method3625().anInt8960;
							if (local221.aBoolean357) {
								local196 = 2;
							}
						}
						@Pc(233) Class4[] local233 = Static447.aClass4Array12;
						if (local202 != -1) {
							local243 = (Class4[]) Static484.aClass94_45.method2960((long) local202);
							if (local243 == null) {
								local250 = Static655.method7887(Static436.aClass223_98, local202);
								if (local250 != null) {
									local243 = new Class4[local250.length];
									for (local258 = 0; local258 < local250.length; local258++) {
										local243[local258] = Static467.aClass5_13.method6121(local250[local258], true);
									}
									Static484.aClass94_45.method2963((long) local202, local243);
								}
							}
							if (local243 != null && local243.length >= 2) {
								local233 = local243;
							}
						}
						if (local233.length <= local196) {
							local196 = 1;
						}
						@Pc(302) Class4 local302 = local233[0];
						local306 = local233[local196];
						local181 -= Math.max(Static2.aClass213_9.anInt6973, local302.method7694());
						local258 = arg2 + Static456.anIntArray426[0] - (local302.method7697() >> 1);
						local333 = local302.method7697() * local37.anInt4357 / 255;
						local336 = local302.method7694();
						if (local37.anInt4357 > 0 && local333 < 2) {
							local333 = 2;
						}
						local302.method7698(local258, local181);
						Static467.aClass5_13.T(local258, local181, local258 + local333, local336 + local181);
						local306.method7698(local258, local181);
						Static467.aClass5_13.KA(arg2, arg3, arg0 + arg2, arg3 - -arg1);
						Static215.method3836(local181 + local336, local181, local258, local302.method7700() + local258);
					}
					local181 -= 2;
					if (!local37.aBoolean350) {
						@Pc(417) Class4 local417;
						@Pc(426) Class4 local426;
						if (local37.anInt4340 > Static384.anInt7234) {
							local417 = Static333.aClass4Array8[local37.aBoolean348 ? 2 : 0];
							local426 = Static333.aClass4Array8[local37.aBoolean348 ? 3 : 1];
							if (local37 instanceof Class9_Sub4_Sub2_Sub1_Sub1) {
								local436 = local17.anInt5819;
								if (local436 == -1) {
									local436 = local37.method3625().anInt8953;
								}
							} else {
								local436 = local37.method3625().anInt8953;
							}
							if (local436 != -1) {
								local243 = (Class4[]) Static619.aClass94_37.method2960((long) local436);
								if (local243 == null) {
									local250 = Static655.method7887(Static436.aClass223_98, local436);
									if (local250 != null) {
										local243 = new Class4[local250.length];
										for (local258 = 0; local258 < local250.length; local258++) {
											local243[local258] = Static467.aClass5_13.method6121(local250[local258], true);
										}
										Static619.aClass94_37.method2963((long) local436, local243);
									}
								}
								if (local243 != null && local243.length == 4) {
									local417 = local243[local37.aBoolean348 ? 2 : 0];
									local426 = local243[local37.aBoolean348 ? 3 : 1];
								}
							}
							@Pc(530) int local530 = local37.anInt4340 - Static384.anInt7234;
							if (local37.anInt4320 >= local530) {
								local541 = local417.method7697();
							} else {
								local530 -= local37.anInt4320;
								local258 = local37.anInt4327 == 0 ? 0 : (local37.anInt4349 - local530) / local37.anInt4327 * local37.anInt4327;
								local541 = local417.method7697() * local258 / local37.anInt4349;
							}
							local258 = local417.method7694();
							local181 -= local258;
							local333 = Static456.anIntArray426[0] + arg2 - (local417.method7697() >> 1);
							local417.method7698(local333, local181);
							Static467.aClass5_13.T(local333, local181, local541 + local333, local181 - -local258);
							local426.method7698(local333, local181);
							Static467.aClass5_13.KA(arg2, arg3, arg0 + arg2, arg3 + arg1);
							Static215.method3836(local258 + local181, local181, local333, local417.method7700() + local333);
							local181 -= 2;
						}
						if (local13 < local7) {
							@Pc(712) Class9_Sub4_Sub2_Sub1_Sub2 local712 = (Class9_Sub4_Sub2_Sub1_Sub2) local37;
							if (local712.anInt4365 != -1) {
								local181 -= 25;
								local426 = Static532.aClass4Array14[local712.anInt4365];
								local426.method7698(arg2 + Static456.anIntArray426[0] - 12, local181);
								Static215.method3836(local426.method7712() + local181, local181, arg2 + Static456.anIntArray426[0] - 12, Static456.anIntArray426[0] + arg2 + -12 + local426.method7700());
								local181 -= 2;
							}
							if (local712.anInt4380 != -1) {
								local181 -= 25;
								local426 = Static6.aClass4Array1[local712.anInt4380];
								local426.method7698(arg2 + Static456.anIntArray426[0] - 12, local181);
								Static215.method3836(local181 + local426.method7712(), local181, Static456.anIntArray426[0] + arg2 - 12, arg2 + (Static456.anIntArray426[0] + -12 - -local426.method7700()));
								local181 -= 2;
							}
						} else if (local17.anInt5828 >= 0 && local17.anInt5828 < Static6.aClass4Array1.length) {
							local417 = Static6.aClass4Array1[local17.anInt5828];
							local181 -= 25;
							local417.method7698(arg2 + Static456.anIntArray426[0] - (local417.method7697() >> 1), local181);
							Static215.method3836(local417.method7712() + local181, local181, arg2 + Static456.anIntArray426[0] - (local417.method7697() >> 1), Static456.anIntArray426[0] + arg2 + -(local417.method7697() >> 1) + local417.method7700());
							local181 -= 2;
						}
					}
					@Pc(819) Class50[] local819;
					@Pc(827) Class50 local827;
					if (!(local37 instanceof Class9_Sub4_Sub2_Sub1_Sub2)) {
						local202 = 0;
						local819 = Static189.aClass50Array1;
						for (local436 = 0; local436 < local819.length; local436++) {
							local827 = local819[local436];
							if (local827 != null && local827.anInt2414 == 1 && local827.anInt2411 == Static562.anIntArray508[local13 - local7]) {
								local306 = Static530.aClass4Array13[local827.anInt2407];
								if (local306.method7694() > local202) {
									local202 = local306.method7694();
								}
								if (Static384.anInt7234 % 20 < 10) {
									local306.method7698(Static456.anIntArray426[0] + arg2 - 12, local181 + -local306.method7694());
									Static215.method3836(local181 - local306.method7694() + local306.method7712(), local181 + -local306.method7694(), Static456.anIntArray426[0] + arg2 - 12, Static456.anIntArray426[0] + -12 + arg2 + local306.method7700());
								}
							}
						}
						if (local202 > 0) {
						}
					} else if (local13 >= 0) {
						local202 = 0;
						local819 = Static189.aClass50Array1;
						for (local436 = 0; local436 < local819.length; local436++) {
							local827 = local819[local436];
							if (local827 != null && local827.anInt2414 == 10 && local827.anInt2411 == local9[local13]) {
								local306 = Static530.aClass4Array13[local827.anInt2407];
								if (local202 < local306.method7694()) {
									local202 = local306.method7694();
								}
								local306.method7698(Static456.anIntArray426[0] + arg2 - 12, -local306.method7694() + local181);
								Static215.method3836(local181 - local306.method7694() + local306.method7712(), local181 - local306.method7694(), Static456.anIntArray426[0] + arg2 - 12, arg2 - (-Static456.anIntArray426[0] + 12) - -local306.method7700());
							}
						}
						if (local202 > 0) {
						}
					}
					for (local202 = 0; local202 < Static616.anInt10413; local202++) {
						local1041 = local37.anIntArray190[local202];
						local436 = local37.anIntArray196[local202];
						@Pc(1048) Class102 local1048 = null;
						local541 = 0;
						if (local436 >= 0) {
							if (Static384.anInt7234 >= local1041) {
								continue;
							}
							local1048 = Static205.aClass137_4.method4136(local37.anIntArray196[local202]);
							local541 = local1048.anInt3637;
						} else if (local1041 < 0) {
							continue;
						}
						local258 = local37.anIntArray192[local202];
						@Pc(1086) Class102 local1086 = null;
						if (local258 >= 0) {
							local1086 = Static205.aClass137_4.method4136(local258);
						}
						if (Static384.anInt7234 >= local1041 - local541) {
							local336 = local37.anIntArray193[local202];
							if (local336 >= 0) {
								local37.anInt4346 = Static384.anInt7234 + 300;
								local37.anInt4357 = local336;
								local37.anIntArray193[local202] = -1;
							}
							if (local1048 == null) {
								local37.anIntArray190[local202] = -1;
							} else {
								local1137 = local37.method3630() / 2;
								Static39.method1341(local1137, arg0 >> 1, local37, arg1 >> 1);
								if (Static456.anIntArray426[0] > -1) {
									Static456.anIntArray426[0] += Static113.anIntArray107[local202];
									Static456.anIntArray426[1] += Static416.anIntArray384[local202];
									local1183 = 0;
									local1185 = 0;
									@Pc(1187) int local1187 = 0;
									@Pc(1189) int local1189 = 0;
									@Pc(1191) int local1191 = 0;
									@Pc(1193) int local1193 = 0;
									@Pc(1195) int local1195 = 0;
									@Pc(1197) int local1197 = 0;
									@Pc(1199) Class4 local1199 = null;
									@Pc(1201) Class4 local1201 = null;
									@Pc(1203) Class4 local1203 = null;
									@Pc(1205) Class4 local1205 = null;
									@Pc(1207) int local1207 = 0;
									@Pc(1209) int local1209 = 0;
									@Pc(1211) int local1211 = 0;
									@Pc(1213) int local1213 = 0;
									@Pc(1215) int local1215 = 0;
									@Pc(1217) int local1217 = 0;
									@Pc(1219) int local1219 = 0;
									@Pc(1221) int local1221 = 0;
									@Pc(1226) Class4 local1226 = local1048.method3115(Static467.aClass5_13);
									@Pc(1228) int local1228 = 0;
									@Pc(1236) int local1236;
									if (local1226 != null) {
										local1183 = local1226.method7697();
										local1236 = local1226.method7694();
										local1226.method7704(Static121.anIntArray117);
										if (local1236 > 0) {
											local1228 = local1236;
										}
										local1191 = Static121.anIntArray117[0];
									}
									@Pc(1257) Class4 local1257 = local1048.method3121(Static467.aClass5_13);
									if (local1257 != null) {
										local1185 = local1257.method7697();
										local1236 = local1257.method7694();
										local1257.method7704(Static121.anIntArray117);
										if (local1236 > local1228) {
											local1228 = local1236;
										}
										local1193 = Static121.anIntArray117[0];
									}
									@Pc(1284) Class4 local1284 = local1048.method3118(Static467.aClass5_13);
									if (local1284 != null) {
										local1187 = local1284.method7697();
										local1236 = local1284.method7694();
										local1284.method7704(Static121.anIntArray117);
										if (local1228 < local1236) {
											local1228 = local1236;
										}
										local1195 = Static121.anIntArray117[0];
									}
									@Pc(1309) Class4 local1309 = local1048.method3119(Static467.aClass5_13);
									if (local1309 != null) {
										local1189 = local1309.method7697();
										local1236 = local1309.method7694();
										if (local1236 > local1228) {
											local1228 = local1236;
										}
										local1309.method7704(Static121.anIntArray117);
										local1197 = Static121.anIntArray117[0];
									}
									if (local1086 != null) {
										local1199 = local1086.method3115(Static467.aClass5_13);
										if (local1199 != null) {
											local1207 = local1199.method7697();
											local1236 = local1199.method7694();
											if (local1228 < local1236) {
												local1228 = local1236;
											}
											local1199.method7704(Static121.anIntArray117);
											local1215 = Static121.anIntArray117[0];
										}
										local1201 = local1086.method3121(Static467.aClass5_13);
										if (local1201 != null) {
											local1209 = local1201.method7697();
											local1236 = local1201.method7694();
											local1201.method7704(Static121.anIntArray117);
											if (local1228 < local1236) {
												local1228 = local1236;
											}
											local1217 = Static121.anIntArray117[0];
										}
										local1203 = local1086.method3118(Static467.aClass5_13);
										if (local1203 != null) {
											local1211 = local1203.method7697();
											local1236 = local1203.method7694();
											if (local1236 > local1228) {
												local1228 = local1236;
											}
											local1203.method7704(Static121.anIntArray117);
											local1219 = Static121.anIntArray117[0];
										}
										local1205 = local1086.method3119(Static467.aClass5_13);
										if (local1205 != null) {
											local1213 = local1205.method7697();
											local1236 = local1205.method7694();
											local1205.method7704(Static121.anIntArray117);
											if (local1228 < local1236) {
												local1228 = local1236;
											}
											local1221 = Static121.anIntArray117[0];
										}
									}
									@Pc(1453) Class34 local1453 = Static588.aClass34_14;
									@Pc(1455) Class34 local1455 = Static588.aClass34_14;
									@Pc(1457) Class213 local1457 = Static150.aClass213_4;
									local1236 = local1048.anInt3641;
									@Pc(1462) Class213 local1462 = Static150.aClass213_4;
									@Pc(1470) Class34 local1470;
									@Pc(1475) Class213 local1475;
									if (local1236 >= 0) {
										local1470 = Static13.method523(local1236, Static467.aClass5_13, true);
										local1475 = Static99.method2384(local1236, Static467.aClass5_13);
										if (local1470 != null && local1475 != null) {
											local1457 = local1475;
											local1453 = local1470;
										}
									}
									if (local1086 != null) {
										local1236 = local1086.anInt3641;
										if (local1236 >= 0) {
											local1470 = Static13.method523(local1236, Static467.aClass5_13, true);
											local1475 = Static99.method2384(local1236, Static467.aClass5_13);
											if (local1470 != null && local1475 != null) {
												local1462 = local1475;
												local1455 = local1470;
											}
										}
									}
									@Pc(1516) String local1516 = null;
									@Pc(1526) String local1526 = local1048.method3117(local37.anIntArray195[local202]);
									@Pc(1528) int local1528 = 0;
									@Pc(1535) int local1535 = local1457.method5831(local1526);
									if (local1086 != null) {
										local1516 = local1086.method3117(local37.anIntArray194[local202]);
										local1528 = local1462.method5831(local1516);
									}
									@Pc(1552) int local1552 = 0;
									@Pc(1554) int local1554 = 0;
									if (local1185 > 0) {
										local1552 = local1535 / local1185 + 1;
									}
									if (local1086 != null && local1209 > 0) {
										local1554 = local1528 / local1209 + 1;
									}
									@Pc(1574) int local1574 = 0;
									if (local1183 > 0) {
										local1574 = local1183;
									}
									local1574 += 2;
									@Pc(1585) int local1585 = local1574;
									if (local1187 > 0) {
										local1574 += local1187;
									}
									@Pc(1596) int local1596 = local1574;
									@Pc(1598) int local1598 = local1574;
									@Pc(1607) int local1607;
									if (local1185 > 0) {
										local1607 = local1552 * local1185;
										local1574 += local1607;
										local1598 += (local1607 - local1535) / 2;
									} else {
										local1574 += local1535;
									}
									local1607 = local1574;
									if (local1189 > 0) {
										local1574 += local1189;
									}
									@Pc(1636) int local1636 = 0;
									@Pc(1638) int local1638 = 0;
									@Pc(1640) int local1640 = 0;
									@Pc(1642) int local1642 = 0;
									@Pc(1644) int local1644 = 0;
									@Pc(1680) int local1680;
									if (local1086 != null) {
										local1574 += 2;
										local1636 = local1574;
										if (local1207 > 0) {
											local1574 += local1207;
										}
										local1574 += 2;
										local1638 = local1574;
										if (local1211 > 0) {
											local1574 += local1211;
										}
										local1640 = local1574;
										local1644 = local1574;
										if (local1209 > 0) {
											local1680 = local1554 * local1209;
											local1644 = local1574 + (local1680 - local1528) / 2;
											local1574 += local1680;
										} else {
											local1574 += local1528;
										}
										local1642 = local1574;
										if (local1213 > 0) {
											local1574 += local1213;
										}
									}
									local1680 = local37.anIntArray190[local202] - Static384.anInt7234;
									@Pc(1729) int local1729 = local1048.anInt3640 - local1048.anInt3640 * local1680 / local1048.anInt3637;
									@Pc(1741) int local1741 = local1048.anInt3633 * local1680 / local1048.anInt3637 - local1048.anInt3633;
									@Pc(1754) int local1754 = local1729 + Static456.anIntArray426[0] + arg2 - (local1574 >> 1);
									@Pc(1764) int local1764 = local1741 + arg3 + Static456.anIntArray426[1] - 12;
									@Pc(1766) int local1766 = local1764;
									@Pc(1770) int local1770 = local1228 + local1764;
									@Pc(1777) int local1777 = local1048.anInt3626 + local1764 + 15;
									@Pc(1783) int local1783 = local1777 - local1457.anInt6973;
									if (local1783 < local1764) {
										local1766 = local1783;
									}
									@Pc(1793) int local1793 = local1457.anInt6972 + local1777;
									if (local1793 > local1770) {
										local1770 = local1793;
									}
									@Pc(1804) int local1804 = 0;
									@Pc(1819) int local1819;
									@Pc(1824) int local1824;
									if (local1086 != null) {
										local1804 = local1764 + local1086.anInt3626 + 15;
										local1819 = local1804 - local1462.anInt6973;
										local1824 = local1462.anInt6972 + local1804;
										if (local1819 < local1766) {
											local1766 = local1819;
										}
										if (local1770 < local1824) {
											local1770 = local1824;
										}
									}
									local1819 = 255;
									if (local1048.anInt3625 >= 0) {
										local1819 = (local1680 << 8) / (local1048.anInt3637 - local1048.anInt3625);
									}
									if (local1819 >= 0 && local1819 < 255) {
										local1824 = local1819 << 24;
										@Pc(1870) int local1870 = local1824 | 0xFFFFFF;
										if (local1226 != null) {
											local1226.method7711(local1754 - local1191, local1764, 0, local1870, 1);
										}
										if (local1284 != null) {
											local1284.method7711(local1585 + local1754 - local1195, local1764, 0, local1870, 1);
										}
										@Pc(1902) int local1902;
										if (local1257 != null) {
											for (local1902 = 0; local1902 < local1552; local1902++) {
												local1257.method7711(local1754 + local1596 + local1902 * local1185 - local1193, local1764, 0, local1870, 1);
											}
										}
										if (local1309 != null) {
											local1309.method7711(local1754 + local1607 - local1197, local1764, 0, local1870, 1);
										}
										local1453.method8598(local1777, local1526, local1048.anInt3632 | local1824, 0, local1598 + local1754);
										if (local1086 != null) {
											if (local1199 != null) {
												local1199.method7711(local1754 + local1636 - local1215, local1764, 0, local1870, 1);
											}
											if (local1203 != null) {
												local1203.method7711(local1754 + local1638 - local1219, local1764, 0, local1870, 1);
											}
											if (local1201 != null) {
												for (local1902 = 0; local1902 < local1554; local1902++) {
													local1201.method7711(local1209 * local1902 + local1754 + local1640 - local1217, local1764, 0, local1870, 1);
												}
											}
											if (local1205 != null) {
												local1205.method7711(local1642 + local1754 - local1221, local1764, 0, local1870, 1);
											}
											local1455.method8598(local1804, local1516, local1824 | local1086.anInt3632, 0, local1644 + local1754);
										}
									} else {
										if (local1226 != null) {
											local1226.method7698(local1754 - local1191, local1764);
										}
										if (local1284 != null) {
											local1284.method7698(local1754 + local1585 - local1195, local1764);
										}
										if (local1257 != null) {
											for (local1824 = 0; local1824 < local1552; local1824++) {
												local1257.method7698(local1754 + local1596 + local1185 * local1824 - local1193, local1764);
											}
										}
										if (local1309 != null) {
											local1309.method7698(local1754 + local1607 - local1197, local1764);
										}
										local1453.method8598(local1777, local1526, local1048.anInt3632 | 0xFF000000, 0, local1754 + local1598);
										if (local1086 != null) {
											if (local1199 != null) {
												local1199.method7698(local1754 + local1636 - local1215, local1764);
											}
											if (local1203 != null) {
												local1203.method7698(local1638 + local1754 - local1219, local1764);
											}
											if (local1201 != null) {
												for (local1824 = 0; local1824 < local1554; local1824++) {
													local1201.method7698(local1754 + local1640 + local1824 * local1209 - local1217, local1764);
												}
											}
											if (local1205 != null) {
												local1205.method7698(local1754 + local1642 - local1221, local1764);
											}
											local1455.method8598(local1804, local1516, local1086.anInt3632 | 0xFF000000, 0, local1754 + local1644);
										}
									}
									Static215.method3836(local1770 + 1, local1766, local1754, local1574 + local1754);
								}
							}
						}
					}
				}
			}
		}
		@Pc(2215) int local2215;
		for (@Pc(2209) int local2209 = 0; local2209 < Static230.anInt5094; local2209++) {
			local2215 = Static19.anIntArray20[local2209];
			@Pc(2222) Class9_Sub4_Sub2_Sub1 local2222;
			if (local2215 < 2048) {
				local2222 = Static643.aClass9_Sub4_Sub2_Sub1_Sub2Array1[local2215];
			} else {
				local2222 = ((Class6_Sub42) Static461.aClass380_35.method8747((long) (local2215 - 2048))).aClass9_Sub4_Sub2_Sub1_Sub1_1;
			}
			local202 = Static312.anIntArray290[local2209];
			@Pc(2253) Class9_Sub4_Sub2_Sub1 local2253;
			if (local202 >= 2048) {
				local2253 = ((Class6_Sub42) Static461.aClass380_35.method8747((long) (local202 - 2048))).aClass9_Sub4_Sub2_Sub1_Sub1_1;
			} else {
				local2253 = Static643.aClass9_Sub4_Sub2_Sub1_Sub2Array1[local202];
			}
			Static501.method7248(arg2, local2222, arg3, local2253, --local2222.anInt4287, arg0, arg1);
		}
		local2215 = Static2.aClass213_9.anInt6972 + Static2.aClass213_9.anInt6973 + 2;
		for (local181 = 0; local181 < Static126.anInt3133; local181++) {
			local202 = Static409.anIntArray377[local181];
			local1041 = Static409.anIntArray381[local181];
			local436 = Static409.anIntArray380[local181];
			@Pc(2314) boolean local2314 = true;
			while (local2314) {
				local2314 = false;
				for (local541 = 0; local541 < local181; local541++) {
					if (Static409.anIntArray381[local541] - local2215 < local1041 + 2 && Static409.anIntArray381[local541] + 2 > -local2215 + local1041 && local202 - local436 < Static409.anIntArray380[local541] + Static409.anIntArray377[local541] && Static409.anIntArray377[local541] - Static409.anIntArray380[local541] < local202 - -local436 && local1041 > Static409.anIntArray381[local541] - local2215) {
						local1041 = Static409.anIntArray381[local541] - local2215;
						local2314 = true;
					}
				}
			}
			Static409.anIntArray381[local181] = local1041;
			@Pc(2410) String local2410 = Static409.aStringArray23[local181];
			local258 = Static2.aClass213_9.method5831(local2410);
			local333 = arg2 + local202;
			local336 = local1041 + arg3 - Static2.aClass213_9.anInt6973;
			local1137 = local258 + local333;
			@Pc(2439) int local2439 = local1041 + arg3 + Static2.aClass213_9.anInt6972;
			if (Static248.anInt5406 == 0) {
				@Pc(2443) int local2443 = 16776960;
				if (Static409.anIntArray378[local181] < 6) {
					local2443 = Static97.anIntArray91[Static409.anIntArray378[local181]];
				}
				if (Static409.anIntArray378[local181] == 6) {
					local2443 = Static322.anInt6388 % 20 < 10 ? 16711680 : 16776960;
				}
				if (Static409.anIntArray378[local181] == 7) {
					local2443 = Static322.anInt6388 % 20 >= 10 ? 65535 : 255;
				}
				if (Static409.anIntArray378[local181] == 8) {
					local2443 = Static322.anInt6388 % 20 < 10 ? 45056 : 8454016;
				}
				@Pc(2518) int local2518;
				if (Static409.anIntArray378[local181] == 9) {
					local2518 = 150 - Static409.anIntArray376[local181];
					if (local2518 < 50) {
						local2443 = local2518 * 1280 + 16711680;
					} else if (local2518 < 100) {
						local2443 = 16776960 + 16384000 - local2518 * 327680;
					} else if (local2518 < 150) {
						local2443 = (local2518 - 100) * 5 + 65280;
					}
				}
				if (Static409.anIntArray378[local181] == 10) {
					local2518 = 150 - Static409.anIntArray376[local181];
					if (local2518 < 50) {
						local2443 = local2518 * 5 + 16711680;
					} else if (local2518 < 100) {
						local2443 = 16384000 + 16711935 - local2518 * 327680;
					} else if (local2518 < 150) {
						local2443 = local2518 * 327680 + 255 - (local2518 + -100) * 5 - 32768000;
					}
				}
				if (Static409.anIntArray378[local181] == 11) {
					local2518 = 150 - Static409.anIntArray376[local181];
					if (local2518 < 50) {
						local2443 = 16777215 - local2518 * 327685;
					} else if (local2518 < 100) {
						local2443 = local2518 * 327685 + 65280 - 16384250;
					} else if (local2518 < 150) {
						local2443 = 16777215 - (local2518 - 100) * 327680;
					}
				}
				local2518 = local2443 | 0xFF000000;
				if (Static409.anIntArray379[local181] == 0) {
					local1137 -= local258 >> 1;
					Static537.aClass34_12.method8602(local2518, local2410, arg2 + local202, -16777216, arg3 + local1041);
					local333 -= local258 >> 1;
				}
				if (Static409.anIntArray379[local181] == 1) {
					local336 -= 5;
					local333 -= local258 >> 1;
					Static537.aClass34_12.method8590(local202 + arg2, arg3 + local1041, Static322.anInt6388, local2410, local2518);
					local2439 += 5;
					local1137 -= local258 >> 1;
				}
				if (Static409.anIntArray379[local181] == 2) {
					local1137 -= (local258 >> 1) - 5;
					local2439 += 5;
					local336 -= 5;
					Static537.aClass34_12.method8599(local2518, local202 + arg2, local1041 + arg3, local2410, Static322.anInt6388);
					local333 -= (local258 >> 1) + 5;
				}
				if (Static409.anIntArray379[local181] == 3) {
					local1137 -= local258 >> 1;
					local2439 += 7;
					Static537.aClass34_12.method8593(arg3 + local1041, local2518, 150 - Static409.anIntArray376[local181], Static322.anInt6388, local202 + arg2, local2410);
					local336 -= 7;
					local333 -= local258 >> 1;
				}
				@Pc(2838) int local2838;
				if (Static409.anIntArray379[local181] == 4) {
					local2838 = (150 - Static409.anIntArray376[local181]) * (Static2.aClass213_9.method5831(local2410) + 100) / 150;
					Static467.aClass5_13.T(local202 + arg2 - 50, arg3, arg2 + local202 + 50, arg3 - -arg1);
					local1137 += 50 - local2838;
					local333 += 50 - local2838;
					Static537.aClass34_12.method8598(local1041 + arg3, local2410, local2518, -16777216, local202 + arg2 + 50 - local2838);
					Static467.aClass5_13.KA(arg2, arg3, arg2 + arg0, arg1 + arg3);
				}
				if (Static409.anIntArray379[local181] == 5) {
					local2838 = 150 - Static409.anIntArray376[local181];
					local1183 = 0;
					if (local2838 < 25) {
						local1183 = local2838 - 25;
					} else if (local2838 > 125) {
						local1183 = local2838 - 125;
					}
					local1185 = Static2.aClass213_9.anInt6972 + Static2.aClass213_9.anInt6973;
					Static467.aClass5_13.T(arg2, local1041 + arg3 - local1185 - 1, arg0 + arg2, arg3 + local1041 + 5);
					local336 += local1183;
					local2439 += local1183;
					local1137 -= local258 >> 1;
					Static537.aClass34_12.method8602(local2518, local2410, arg2 + local202, -16777216, local1183 + (arg3 - -local1041));
					local333 -= local258 >> 1;
					Static467.aClass5_13.KA(arg2, arg3, arg0 + arg2, arg1 + arg3);
				}
			} else {
				Static537.aClass34_12.method8602(-256, local2410, local202 + arg2, -16777216, local1041 + arg3);
				local1137 -= local258 >> 1;
				local333 -= local258 >> 1;
			}
			Static215.method3836(local2439 + 1, local336, local333, local1137 + 1);
		}
	}
}
