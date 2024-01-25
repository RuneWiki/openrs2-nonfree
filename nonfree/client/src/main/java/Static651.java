import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static651 {

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "Lclient!in;")
	public static final Class169 aClass169_252 = new Class169(129, 4);

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)V")
	public static void method9222(@OriginalArg(1) int arg0) {
		Static423.aLong213 = 1000000000L / (long) arg0;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIIII)V")
	public static void method9224(@OriginalArg(1) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		@Pc(7) int local7 = Static383.anInt7249;
		@Pc(9) int[] local9 = Static404.anIntArray362;
		Static421.anInt7736 = 0;
		@Pc(182) int local182;
		@Pc(211) int local211;
		@Pc(258) int local258;
		@Pc(330) int local330;
		@Pc(333) int local333;
		@Pc(1142) int local1142;
		@Pc(1188) int local1188;
		@Pc(1190) int local1190;
		@Pc(428) int local428;
		@Pc(1046) int local1046;
		@Pc(535) int local535;
		for (@Pc(13) int local13 = 0; local13 < local7 + Static532.anInt9330; local13++) {
			@Pc(17) Class312 local17 = null;
			@Pc(30) Class15_Sub3_Sub3_Sub1 local30;
			if (local13 < local7) {
				local30 = Static28.aClass15_Sub3_Sub3_Sub1_Sub1Array1[local9[local13]];
			} else {
				local30 = ((Class2_Sub6) Static630.aClass335_29.method8357((long) Static84.anIntArray73[local13 - local7])).aClass15_Sub3_Sub3_Sub1_Sub2_1;
				local17 = ((Class15_Sub3_Sub3_Sub1_Sub2) local30).aClass312_1;
				if (local17.anIntArray458 != null) {
					local17 = local17.method7953(Static113.aClass282_1);
					if (local17 == null) {
						continue;
					}
				}
			}
			if (local30.anInt3975 >= 0 && (local30.anInt4022 == Static125.anInt2441 || local30.aByte142 == Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.aByte142)) {
				Static280.method4713(arg3 >> 1, arg0 >> 1, local30, local30.method3680());
				if (Static91.anIntArray83[0] >= 0) {
					if (local30.aString45 != null && (local7 <= local13 || Static54.anInt1089 == 0 || Static54.anInt1089 == 3 || Static54.anInt1089 == 1 && Static51.method1035(((Class15_Sub3_Sub3_Sub1_Sub1) local30).aString29)) && Static471.anInt8436 > Static421.anInt7736) {
						Static471.anIntArray425[Static421.anInt7736] = Static648.aClass324_12.method8181(local30.aString45) / 2;
						Static471.anIntArray429[Static421.anInt7736] = Static91.anIntArray83[0];
						Static471.anIntArray430[Static421.anInt7736] = Static91.anIntArray83[1];
						Static471.anIntArray428[Static421.anInt7736] = local30.anInt4025;
						Static471.anIntArray426[Static421.anInt7736] = local30.anInt4002;
						Static471.anIntArray427[Static421.anInt7736] = local30.anInt4011;
						Static471.aStringArray50[Static421.anInt7736] = local30.aString45;
						Static421.anInt7736++;
					}
					local182 = arg1 + Static91.anIntArray83[1];
					@Pc(243) Class71[] local243;
					@Pc(250) Class67[] local250;
					@Pc(302) Class71 local302;
					if (local30.aBoolean315 || Static62.anInt1184 >= local30.anInt4032) {
						local182 -= Math.max(Static648.aClass324_12.anInt9272, Static668.aClass71Array47[0].method7707());
					} else {
						@Pc(197) byte local197 = 1;
						if (local13 < local7) {
							@Pc(206) Class15_Sub3_Sub3_Sub1_Sub1 local206 = Static28.aClass15_Sub3_Sub3_Sub1_Sub1Array1[local9[local13]];
							local211 = local30.method3673().anInt7469;
							if (local206.aBoolean172) {
								local197 = 2;
							}
						} else {
							local211 = local17.anInt9057;
							if (local211 == -1) {
								local211 = local30.method3673().anInt7469;
							}
						}
						@Pc(232) Class71[] local232 = Static668.aClass71Array47;
						if (local211 != -1) {
							local243 = (Class71[]) Static603.aClass22_63.method462((long) local211);
							if (local243 == null) {
								local250 = Static676.method1697(Static409.aClass124_84, local211);
								if (local250 != null) {
									local243 = new Class71[local250.length];
									for (local258 = 0; local258 < local250.length; local258++) {
										local243[local258] = Static607.aClass101_15.method8063(local250[local258], true);
									}
									Static603.aClass22_63.method470((long) local211, local243);
								}
							}
							if (local243 != null && local243.length >= 2) {
								local232 = local243;
							}
						}
						if (local232.length <= local197) {
							local197 = 1;
						}
						@Pc(298) Class71 local298 = local232[0];
						local302 = local232[local197];
						local182 -= Math.max(Static648.aClass324_12.anInt9272, local298.method7707());
						local258 = arg2 + Static91.anIntArray83[0] - (local298.method7691() >> 1);
						local330 = local298.method7691() * local30.anInt3972 / 255;
						local333 = local298.method7707();
						if (local30.anInt3972 > 0 && local330 < 2) {
							local330 = 2;
						}
						local298.method7703(local258, local182);
						Static607.aClass101_15.T(local258, local182, local330 + local258, local182 + local333);
						local302.method7703(local258, local182);
						Static607.aClass101_15.KA(arg2, arg1, arg0 + arg2, arg1 + arg3);
						Static220.method4070(local333 + local182, local182, local258, local298.method7709() + local258);
					}
					local182 -= 2;
					if (!local30.aBoolean315) {
						@Pc(409) Class71 local409;
						@Pc(418) Class71 local418;
						if (local30.anInt4012 > Static62.anInt1184) {
							local409 = Static386.aClass71Array32[local30.aBoolean313 ? 2 : 0];
							local418 = Static386.aClass71Array32[local30.aBoolean313 ? 3 : 1];
							if (local30 instanceof Class15_Sub3_Sub3_Sub1_Sub2) {
								local428 = local17.anInt9098;
								if (local428 == -1) {
									local428 = local30.method3673().anInt7453;
								}
							} else {
								local428 = local30.method3673().anInt7453;
							}
							if (local428 != -1) {
								local243 = (Class71[]) Static433.aClass22_38.method462((long) local428);
								if (local243 == null) {
									local250 = Static676.method1697(Static409.aClass124_84, local428);
									if (local250 != null) {
										local243 = new Class71[local250.length];
										for (local258 = 0; local258 < local250.length; local258++) {
											local243[local258] = Static607.aClass101_15.method8063(local250[local258], true);
										}
										Static433.aClass22_38.method470((long) local428, local243);
									}
								}
								if (local243 != null && local243.length == 4) {
									local409 = local243[local30.aBoolean313 ? 2 : 0];
									local418 = local243[local30.aBoolean313 ? 3 : 1];
								}
							}
							@Pc(524) int local524 = local30.anInt4012 - Static62.anInt1184;
							if (local30.anInt4020 >= local524) {
								local535 = local409.method7691();
							} else {
								local524 -= local30.anInt4020;
								local258 = local30.anInt4023 == 0 ? 0 : local30.anInt4023 * ((local30.anInt3992 - local524) / local30.anInt4023);
								local535 = local258 * local409.method7691() / local30.anInt3992;
							}
							local258 = local409.method7707();
							local182 -= local258;
							local330 = arg2 + Static91.anIntArray83[0] - (local409.method7691() >> 1);
							local409.method7703(local330, local182);
							Static607.aClass101_15.T(local330, local182, local330 + local535, local258 + local182);
							local418.method7703(local330, local182);
							Static607.aClass101_15.KA(arg2, arg1, arg0 + arg2, arg1 - -arg3);
							Static220.method4070(local182 + local258, local182, local330, local409.method7709() + local330);
							local182 -= 2;
						}
						if (local7 > local13) {
							@Pc(710) Class15_Sub3_Sub3_Sub1_Sub1 local710 = (Class15_Sub3_Sub3_Sub1_Sub1) local30;
							if (local710.anInt2377 != -1) {
								local182 -= 25;
								local418 = Static665.aClass71Array46[local710.anInt2377];
								local418.method7703(Static91.anIntArray83[0] + arg2 - 12, local182);
								Static220.method4070(local418.method7711() + local182, local182, Static91.anIntArray83[0] + arg2 - 12, arg2 + -12 - (-Static91.anIntArray83[0] - local418.method7709()));
								local182 -= 2;
							}
							if (local710.anInt2398 != -1) {
								local182 -= 25;
								local418 = Static277.aClass71Array48[local710.anInt2398];
								local418.method7703(Static91.anIntArray83[0] + arg2 - 12, local182);
								Static220.method4070(local418.method7711() + local182, local182, arg2 + Static91.anIntArray83[0] - 12, Static91.anIntArray83[0] + arg2 - 12 - -local418.method7709());
								local182 -= 2;
							}
						} else if (local17.anInt9062 >= 0 && local17.anInt9062 < Static277.aClass71Array48.length) {
							local409 = Static277.aClass71Array48[local17.anInt9062];
							local182 -= 25;
							local409.method7703(Static91.anIntArray83[0] + arg2 - (local409.method7691() >> 1), local182);
							Static220.method4070(local409.method7711() + local182, local182, Static91.anIntArray83[0] + arg2 - (local409.method7691() >> 1), arg2 - (-Static91.anIntArray83[0] + (local409.method7691() >> 1) - local409.method7709()));
							local182 -= 2;
						}
					}
					@Pc(817) Class326[] local817;
					@Pc(825) Class326 local825;
					if (!(local30 instanceof Class15_Sub3_Sub3_Sub1_Sub1)) {
						local211 = 0;
						local817 = Static382.aClass326Array3;
						for (local428 = 0; local428 < local817.length; local428++) {
							local825 = local817[local428];
							if (local825 != null && local825.anInt9321 == 1 && Static84.anIntArray73[local13 - local7] == local825.anInt9316) {
								local302 = Static200.aClass71Array21[local825.anInt9319];
								if (local211 < local302.method7707()) {
									local211 = local302.method7707();
								}
								if (Static62.anInt1184 % 20 < 10) {
									local302.method7703(Static91.anIntArray83[0] + arg2 - 12, local182 - local302.method7707());
									Static220.method4070(local182 - local302.method7707() + local302.method7711(), local182 + -local302.method7707(), arg2 + Static91.anIntArray83[0] - 12, arg2 + -12 + Static91.anIntArray83[0] + local302.method7709());
								}
							}
						}
						if (local211 > 0) {
						}
					} else if (local13 >= 0) {
						local211 = 0;
						local817 = Static382.aClass326Array3;
						for (local428 = 0; local428 < local817.length; local428++) {
							local825 = local817[local428];
							if (local825 != null && local825.anInt9321 == 10 && local825.anInt9316 == local9[local13]) {
								local302 = Static200.aClass71Array21[local825.anInt9319];
								if (local211 < local302.method7707()) {
									local211 = local302.method7707();
								}
								local302.method7703(arg2 + Static91.anIntArray83[0] - 12, -local302.method7707() + local182);
								Static220.method4070(local182 - local302.method7707() + local302.method7711(), local182 + -local302.method7707(), arg2 + Static91.anIntArray83[0] - 12, Static91.anIntArray83[0] + -12 + arg2 + local302.method7709());
							}
						}
						if (local211 > 0) {
						}
					}
					for (local211 = 0; local211 < Static2.anInt44; local211++) {
						local1046 = local30.anIntArray181[local211];
						local428 = local30.anIntArray179[local211];
						@Pc(1053) Class213 local1053 = null;
						local535 = 0;
						if (local428 >= 0) {
							if (Static62.anInt1184 >= local1046) {
								continue;
							}
							local1053 = Static226.aClass102_1.method3166(local30.anIntArray179[local211]);
							local535 = local1053.anInt6364;
						} else if (local1046 < 0) {
							continue;
						}
						local258 = local30.anIntArray182[local211];
						@Pc(1089) Class213 local1089 = null;
						if (local258 >= 0) {
							local1089 = Static226.aClass102_1.method3166(local258);
						}
						if (Static62.anInt1184 >= local1046 - local535) {
							local333 = local30.anIntArray183[local211];
							if (local333 >= 0) {
								local30.anInt4032 = Static62.anInt1184 + 300;
								local30.anInt3972 = local333;
								local30.anIntArray183[local211] = -1;
							}
							if (local1053 == null) {
								local30.anIntArray181[local211] = -1;
							} else {
								local1142 = local30.method3680() / 2;
								Static280.method4713(arg3 >> 1, arg0 >> 1, local30, local1142);
								if (Static91.anIntArray83[0] > -1) {
									Static91.anIntArray83[0] += Static378.anIntArray348[local211];
									Static91.anIntArray83[1] += Static298.anIntArray275[local211];
									local1188 = 0;
									local1190 = 0;
									@Pc(1192) int local1192 = 0;
									@Pc(1194) int local1194 = 0;
									@Pc(1196) int local1196 = 0;
									@Pc(1198) int local1198 = 0;
									@Pc(1200) int local1200 = 0;
									@Pc(1202) int local1202 = 0;
									@Pc(1204) Class71 local1204 = null;
									@Pc(1206) Class71 local1206 = null;
									@Pc(1208) Class71 local1208 = null;
									@Pc(1210) Class71 local1210 = null;
									@Pc(1212) int local1212 = 0;
									@Pc(1214) int local1214 = 0;
									@Pc(1216) int local1216 = 0;
									@Pc(1218) int local1218 = 0;
									@Pc(1220) int local1220 = 0;
									@Pc(1222) int local1222 = 0;
									@Pc(1224) int local1224 = 0;
									@Pc(1226) int local1226 = 0;
									@Pc(1233) Class71 local1233 = local1053.method5698(Static607.aClass101_15);
									@Pc(1235) int local1235 = 0;
									@Pc(1243) int local1243;
									if (local1233 != null) {
										local1188 = local1233.method7691();
										local1243 = local1233.method7707();
										local1233.method7689(Static258.anIntArray252);
										if (local1243 > 0) {
											local1235 = local1243;
										}
										local1196 = Static258.anIntArray252[0];
									}
									@Pc(1262) Class71 local1262 = local1053.method5700(Static607.aClass101_15);
									if (local1262 != null) {
										local1190 = local1262.method7691();
										local1243 = local1262.method7707();
										if (local1235 < local1243) {
											local1235 = local1243;
										}
										local1262.method7689(Static258.anIntArray252);
										local1198 = Static258.anIntArray252[0];
									}
									@Pc(1289) Class71 local1289 = local1053.method5703(Static607.aClass101_15);
									if (local1289 != null) {
										local1192 = local1289.method7691();
										local1243 = local1289.method7707();
										local1289.method7689(Static258.anIntArray252);
										if (local1243 > local1235) {
											local1235 = local1243;
										}
										local1200 = Static258.anIntArray252[0];
									}
									@Pc(1314) Class71 local1314 = local1053.method5697(Static607.aClass101_15);
									if (local1314 != null) {
										local1194 = local1314.method7691();
										local1243 = local1314.method7707();
										if (local1235 < local1243) {
											local1235 = local1243;
										}
										local1314.method7689(Static258.anIntArray252);
										local1202 = Static258.anIntArray252[0];
									}
									if (local1089 != null) {
										local1204 = local1089.method5698(Static607.aClass101_15);
										if (local1204 != null) {
											local1212 = local1204.method7691();
											local1243 = local1204.method7707();
											if (local1235 < local1243) {
												local1235 = local1243;
											}
											local1204.method7689(Static258.anIntArray252);
											local1220 = Static258.anIntArray252[0];
										}
										local1206 = local1089.method5700(Static607.aClass101_15);
										if (local1206 != null) {
											local1214 = local1206.method7691();
											local1243 = local1206.method7707();
											local1206.method7689(Static258.anIntArray252);
											if (local1235 < local1243) {
												local1235 = local1243;
											}
											local1222 = Static258.anIntArray252[0];
										}
										local1208 = local1089.method5703(Static607.aClass101_15);
										if (local1208 != null) {
											local1216 = local1208.method7691();
											local1243 = local1208.method7707();
											local1208.method7689(Static258.anIntArray252);
											if (local1235 < local1243) {
												local1235 = local1243;
											}
											local1224 = Static258.anIntArray252[0];
										}
										local1210 = local1089.method5697(Static607.aClass101_15);
										if (local1210 != null) {
											local1218 = local1210.method7691();
											local1243 = local1210.method7707();
											local1210.method7689(Static258.anIntArray252);
											if (local1243 > local1235) {
												local1235 = local1243;
											}
											local1226 = Static258.anIntArray252[0];
										}
									}
									@Pc(1456) Class59 local1456 = Static514.aClass59_13;
									@Pc(1458) Class59 local1458 = Static514.aClass59_13;
									@Pc(1460) Class324 local1460 = Static6.aClass324_1;
									local1243 = local1053.anInt6377;
									@Pc(1465) Class324 local1465 = Static6.aClass324_1;
									@Pc(1476) Class59 local1476;
									@Pc(1481) Class324 local1481;
									if (local1243 >= 0) {
										local1476 = Static341.method5719(Static607.aClass101_15, true, local1243);
										local1481 = Static138.method2435(Static607.aClass101_15, local1243);
										if (local1476 != null && local1481 != null) {
											local1460 = local1481;
											local1456 = local1476;
										}
									}
									if (local1089 != null) {
										local1243 = local1089.anInt6377;
										if (local1243 >= 0) {
											local1476 = Static341.method5719(Static607.aClass101_15, true, local1243);
											local1481 = Static138.method2435(Static607.aClass101_15, local1243);
											if (local1476 != null && local1481 != null) {
												local1465 = local1481;
												local1458 = local1476;
											}
										}
									}
									@Pc(1524) String local1524 = null;
									@Pc(1534) String local1534 = local1053.method5702(local30.anIntArray187[local211]);
									@Pc(1536) int local1536 = 0;
									@Pc(1541) int local1541 = local1460.method8181(local1534);
									if (local1089 != null) {
										local1524 = local1089.method5702(local30.anIntArray180[local211]);
										local1536 = local1465.method8181(local1524);
									}
									@Pc(1558) int local1558 = 0;
									@Pc(1560) int local1560 = 0;
									if (local1190 > 0) {
										local1558 = local1541 / local1190 + 1;
									}
									if (local1089 != null && local1214 > 0) {
										local1560 = local1536 / local1214 + 1;
									}
									@Pc(1586) int local1586 = 0;
									if (local1188 > 0) {
										local1586 = local1188;
									}
									local1586 += 2;
									@Pc(1597) int local1597 = local1586;
									if (local1192 > 0) {
										local1586 += local1192;
									}
									@Pc(1608) int local1608 = local1586;
									@Pc(1610) int local1610 = local1586;
									@Pc(1619) int local1619;
									if (local1190 > 0) {
										local1619 = local1190 * local1558;
										local1586 += local1619;
										local1610 += (local1619 - local1541) / 2;
									} else {
										local1586 += local1541;
									}
									local1619 = local1586;
									if (local1194 > 0) {
										local1586 += local1194;
									}
									@Pc(1651) int local1651 = 0;
									@Pc(1653) int local1653 = 0;
									@Pc(1655) int local1655 = 0;
									@Pc(1657) int local1657 = 0;
									@Pc(1659) int local1659 = 0;
									@Pc(1698) int local1698;
									if (local1089 != null) {
										local1586 += 2;
										local1651 = local1586;
										if (local1212 > 0) {
											local1586 += local1212;
										}
										local1586 += 2;
										local1653 = local1586;
										if (local1216 > 0) {
											local1586 += local1216;
										}
										local1655 = local1586;
										local1659 = local1586;
										if (local1214 <= 0) {
											local1586 += local1536;
										} else {
											local1698 = local1560 * local1214;
											local1659 = local1586 + (local1698 - local1536) / 2;
											local1586 += local1698;
										}
										local1657 = local1586;
										if (local1218 > 0) {
											local1586 += local1218;
										}
									}
									local1698 = local30.anIntArray181[local211] - Static62.anInt1184;
									@Pc(1739) int local1739 = local1053.anInt6379 - local1698 * local1053.anInt6379 / local1053.anInt6364;
									@Pc(1751) int local1751 = local1698 * local1053.anInt6366 / local1053.anInt6364 - local1053.anInt6366;
									@Pc(1764) int local1764 = arg2 + Static91.anIntArray83[0] + local1739 - (local1586 >> 1);
									@Pc(1774) int local1774 = Static91.anIntArray83[1] + arg1 + local1751 - 12;
									@Pc(1776) int local1776 = local1774;
									@Pc(1780) int local1780 = local1774 + local1235;
									@Pc(1788) int local1788 = local1774 + local1053.anInt6373 + 15;
									@Pc(1793) int local1793 = local1788 - local1460.anInt9272;
									if (local1774 > local1793) {
										local1776 = local1793;
									}
									@Pc(1803) int local1803 = local1460.anInt9271 + local1788;
									if (local1803 > local1780) {
										local1780 = local1803;
									}
									@Pc(1810) int local1810 = 0;
									@Pc(1825) int local1825;
									@Pc(1839) int local1839;
									if (local1089 != null) {
										local1810 = local1089.anInt6373 + local1774 + 15;
										local1825 = local1810 - local1465.anInt9272;
										if (local1776 > local1825) {
											local1776 = local1825;
										}
										local1839 = local1810 + local1465.anInt9271;
										if (local1780 < local1839) {
											local1780 = local1839;
										}
									}
									local1825 = 255;
									if (local1053.anInt6365 >= 0) {
										local1825 = (local1698 << 8) / (local1053.anInt6364 - local1053.anInt6365);
									}
									if (local1825 >= 0 && local1825 < 255) {
										local1839 = local1825 << 24;
										@Pc(2030) int local2030 = local1839 | 0xFFFFFF;
										if (local1233 != null) {
											local1233.method7697(local1764 - local1196, local1774, 0, local2030, 1);
										}
										if (local1289 != null) {
											local1289.method7697(local1597 + local1764 - local1200, local1774, 0, local2030, 1);
										}
										@Pc(2063) int local2063;
										if (local1262 != null) {
											for (local2063 = 0; local2063 < local1558; local2063++) {
												local1262.method7697(local1608 + local1764 + local2063 * local1190 - local1198, local1774, 0, local2030, 1);
											}
										}
										if (local1314 != null) {
											local1314.method7697(local1764 + local1619 - local1202, local1774, 0, local2030, 1);
										}
										local1456.method9577(local1053.anInt6381 | local1839, local1534, local1764 + local1610, local1788, 0);
										if (local1089 != null) {
											if (local1204 != null) {
												local1204.method7697(local1764 + local1651 - local1220, local1774, 0, local2030, 1);
											}
											if (local1208 != null) {
												local1208.method7697(local1653 + local1764 - local1224, local1774, 0, local2030, 1);
											}
											if (local1206 != null) {
												for (local2063 = 0; local2063 < local1560; local2063++) {
													local1206.method7697(local2063 * local1214 + local1655 + local1764 - local1222, local1774, 0, local2030, 1);
												}
											}
											if (local1210 != null) {
												local1210.method7697(local1764 + local1657 - local1226, local1774, 0, local2030, 1);
											}
											local1458.method9577(local1089.anInt6381 | local1839, local1524, local1659 + local1764, local1810, 0);
										}
									} else {
										if (local1233 != null) {
											local1233.method7703(local1764 - local1196, local1774);
										}
										if (local1289 != null) {
											local1289.method7703(local1597 + local1764 - local1200, local1774);
										}
										if (local1262 != null) {
											for (local1839 = 0; local1839 < local1558; local1839++) {
												local1262.method7703(local1190 * local1839 + local1608 + local1764 - local1198, local1774);
											}
										}
										if (local1314 != null) {
											local1314.method7703(local1764 + local1619 - local1202, local1774);
										}
										local1456.method9577(local1053.anInt6381 | 0xFF000000, local1534, local1764 + local1610, local1788, 0);
										if (local1089 != null) {
											if (local1204 != null) {
												local1204.method7703(local1651 + local1764 - local1220, local1774);
											}
											if (local1208 != null) {
												local1208.method7703(local1653 + local1764 - local1224, local1774);
											}
											if (local1206 != null) {
												for (local1839 = 0; local1839 < local1560; local1839++) {
													local1206.method7703(local1764 + local1655 + local1839 * local1214 - local1222, local1774);
												}
											}
											if (local1210 != null) {
												local1210.method7703(local1764 + local1657 - local1226, local1774);
											}
											local1458.method9577(local1089.anInt6381 | 0xFF000000, local1524, local1764 + local1659, local1810, 0);
										}
									}
									Static220.method4070(local1780 + 1, local1776, local1764, local1764 + local1586);
								}
							}
						}
					}
				}
			}
		}
		@Pc(2224) int local2224;
		for (@Pc(2218) int local2218 = 0; local2218 < Static667.anInt10610; local2218++) {
			local2224 = Static359.anIntArray327[local2218];
			@Pc(2231) Class15_Sub3_Sub3_Sub1 local2231;
			if (local2224 < 2048) {
				local2231 = Static28.aClass15_Sub3_Sub3_Sub1_Sub1Array1[local2224];
			} else {
				local2231 = ((Class2_Sub6) Static630.aClass335_29.method8357((long) (local2224 - 2048))).aClass15_Sub3_Sub3_Sub1_Sub2_1;
			}
			local211 = Static447.anIntArray404[local2218];
			@Pc(2256) Class15_Sub3_Sub3_Sub1 local2256;
			if (local211 < 2048) {
				local2256 = Static28.aClass15_Sub3_Sub3_Sub1_Sub1Array1[local211];
			} else {
				local2256 = ((Class2_Sub6) Static630.aClass335_29.method8357((long) (local211 - 2048))).aClass15_Sub3_Sub3_Sub1_Sub2_1;
			}
			Static605.method9055(local2231, arg3, local2256, arg0, --local2231.anInt3981, arg2, arg1);
		}
		local2224 = Static648.aClass324_12.anInt9271 + Static648.aClass324_12.anInt9272 + 2;
		for (local182 = 0; local182 < Static421.anInt7736; local182++) {
			local211 = Static471.anIntArray429[local182];
			local1046 = Static471.anIntArray430[local182];
			local428 = Static471.anIntArray425[local182];
			@Pc(2323) boolean local2323 = true;
			while (local2323) {
				local2323 = false;
				for (local535 = 0; local535 < local182; local535++) {
					if (local1046 + 2 > Static471.anIntArray430[local535] + -local2224 && Static471.anIntArray430[local535] + 2 > -local2224 + local1046 && local211 - local428 < Static471.anIntArray429[local535] - -Static471.anIntArray425[local535] && local428 + local211 > -Static471.anIntArray425[local535] + Static471.anIntArray429[local535] && Static471.anIntArray430[local535] - local2224 < local1046) {
						local1046 = Static471.anIntArray430[local535] - local2224;
						local2323 = true;
					}
				}
			}
			Static471.anIntArray430[local182] = local1046;
			@Pc(2418) String local2418 = Static471.aStringArray50[local182];
			local258 = Static648.aClass324_12.method8181(local2418);
			local330 = arg2 + local211;
			local333 = local1046 + arg1 - Static648.aClass324_12.anInt9272;
			local1142 = local258 + local330;
			@Pc(2447) int local2447 = arg1 + local1046 + Static648.aClass324_12.anInt9271;
			if (Static142.anInt2654 == 0) {
				@Pc(2454) int local2454 = 16776960;
				if (Static471.anIntArray428[local182] < 6) {
					local2454 = Static101.anIntArray93[Static471.anIntArray428[local182]];
				}
				if (Static471.anIntArray428[local182] == 6) {
					local2454 = Static125.anInt2441 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static471.anIntArray428[local182] == 7) {
					local2454 = Static125.anInt2441 % 20 >= 10 ? 65535 : 255;
				}
				if (Static471.anIntArray428[local182] == 8) {
					local2454 = Static125.anInt2441 % 20 >= 10 ? 8454016 : 45056;
				}
				@Pc(2531) int local2531;
				if (Static471.anIntArray428[local182] == 9) {
					local2531 = 150 - Static471.anIntArray427[local182];
					if (local2531 < 50) {
						local2454 = local2531 * 1280 + 16711680;
					} else if (local2531 < 100) {
						local2454 = 16776960 + 16384000 - local2531 * 327680;
					} else if (local2531 < 150) {
						local2454 = (local2531 - 100) * 5 + 65280;
					}
				}
				if (Static471.anIntArray428[local182] == 10) {
					local2531 = 150 - Static471.anIntArray427[local182];
					if (local2531 < 50) {
						local2454 = local2531 * 5 + 16711680;
					} else if (local2531 < 100) {
						local2454 = 16384000 + 16711935 - local2531 * 327680;
					} else if (local2531 < 150) {
						local2454 = (local2531 - 100) * 327680 + 500 + 255 - local2531 * 5;
					}
				}
				if (Static471.anIntArray428[local182] == 11) {
					local2531 = 150 - Static471.anIntArray427[local182];
					if (local2531 < 50) {
						local2454 = 16777215 - local2531 * 327685;
					} else if (local2531 < 100) {
						local2454 = (local2531 - 50) * 327685 + 65280;
					} else if (local2531 < 150) {
						local2454 = 16777215 - (local2531 - 100) * 327680;
					}
				}
				local2531 = local2454 | 0xFF000000;
				if (Static471.anIntArray426[local182] == 0) {
					local1142 -= local258 >> 1;
					Static253.aClass59_5.method9585(arg2 + local211, local2418, local2531, -16777216, local1046 + arg1);
					local330 -= local258 >> 1;
				}
				if (Static471.anIntArray426[local182] == 1) {
					local1142 -= local258 >> 1;
					local2447 += 5;
					Static253.aClass59_5.method9575(arg1 + local1046, local2531, Static125.anInt2441, arg2 + local211, local2418);
					local333 -= 5;
					local330 -= local258 >> 1;
				}
				if (Static471.anIntArray426[local182] == 2) {
					local1142 -= (local258 >> 1) - 5;
					local330 -= (local258 >> 1) + 5;
					local333 -= 5;
					Static253.aClass59_5.method9574(local1046 + arg1, local211 + arg2, local2531, local2418, Static125.anInt2441);
					local2447 += 5;
				}
				if (Static471.anIntArray426[local182] == 3) {
					local2447 += 7;
					local1142 -= local258 >> 1;
					Static253.aClass59_5.method9586(arg1 + local1046, Static125.anInt2441, local211 + arg2, local2531, 150 - Static471.anIntArray427[local182], local2418);
					local330 -= local258 >> 1;
					local333 -= 7;
				}
				@Pc(2847) int local2847;
				if (Static471.anIntArray426[local182] == 4) {
					local2847 = (150 - Static471.anIntArray427[local182]) * (Static648.aClass324_12.method8181(local2418) + 100) / 150;
					Static607.aClass101_15.T(arg2 + local211 - 50, arg1, local211 + arg2 + 50, arg3 + arg1);
					local330 += 50 - local2847;
					local1142 += 50 - local2847;
					Static253.aClass59_5.method9577(local2531, local2418, arg2 + local211 + 50 - local2847, arg1 + local1046, -16777216);
					Static607.aClass101_15.KA(arg2, arg1, arg0 + arg2, arg3 + arg1);
				}
				if (Static471.anIntArray426[local182] == 5) {
					local2847 = 150 - Static471.anIntArray427[local182];
					local1188 = 0;
					if (local2847 < 25) {
						local1188 = local2847 - 25;
					} else if (local2847 > 125) {
						local1188 = local2847 - 125;
					}
					local1190 = Static648.aClass324_12.anInt9271 + Static648.aClass324_12.anInt9272;
					Static607.aClass101_15.T(arg2, arg1 + local1046 - local1190 - 1, arg2 + arg0, arg1 + local1046 + 5);
					Static253.aClass59_5.method9585(arg2 + local211, local2418, local2531, -16777216, local1188 + arg1 + local1046);
					local2447 += local1188;
					local333 += local1188;
					local1142 -= local258 >> 1;
					local330 -= local258 >> 1;
					Static607.aClass101_15.KA(arg2, arg1, arg0 + arg2, arg3 + arg1);
				}
			} else {
				local1142 -= local258 >> 1;
				Static253.aClass59_5.method9585(arg2 + local211, local2418, -256, -16777216, local1046 + arg1);
				local330 -= local258 >> 1;
			}
			Static220.method4070(local2447 + 1, local333, local330, local1142 + 1);
		}
	}
}
