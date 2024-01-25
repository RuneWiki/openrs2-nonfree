import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static444 {

	@OriginalMember(owner = "client!ov", name = "k", descriptor = "Lclient!qja;")
	public static final Class3_Sub40 aClass3_Sub40_2 = new Class3_Sub40(0, -1);

	@OriginalMember(owner = "client!ov", name = "s", descriptor = "Lclient!rda;")
	public static Class3_Sub42 aClass3_Sub42_2 = null;

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(IIIIIIB)V")
	public static void method5565(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) int local12 = Static439.anInt7133;
		@Pc(14) int[] local14 = Static294.anIntArray593;
		Static213.anInt3691 = 0;
		@Pc(184) int local184;
		@Pc(213) int local213;
		@Pc(258) int local258;
		@Pc(330) int local330;
		@Pc(333) int local333;
		@Pc(1137) int local1137;
		@Pc(1183) int local1183;
		@Pc(1185) int local1185;
		@Pc(434) int local434;
		@Pc(1032) int local1032;
		@Pc(570) int local570;
		for (@Pc(18) int local18 = 0; local18 < Static52.anInt1140 + local12; local18++) {
			@Pc(22) Class261 local22 = null;
			@Pc(43) Class34_Sub1_Sub1_Sub2 local43;
			if (local18 >= local12) {
				local43 = ((Class3_Sub52) Static105.aClass333_11.method7489((long) Static603.anIntArray537[local18 - local12])).aClass34_Sub1_Sub1_Sub2_Sub2_2;
				local22 = ((Class34_Sub1_Sub1_Sub2_Sub2) local43).aClass261_1;
				if (local22.anIntArray364 != null) {
					local22 = local22.method5772(Static210.aClass262_1);
					if (local22 == null) {
						continue;
					}
				}
			} else {
				local43 = Static506.aClass34_Sub1_Sub1_Sub2_Sub1Array1[local14[local18]];
			}
			if (local43.anInt9670 >= 0 && (local43.anInt9644 == Static494.anInt7829 || local43.aByte132 == Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.aByte132)) {
				Static317.method4555(local43.method7861(), local43, arg2 >> 1, arg0 >> 1);
				if (Static33.anIntArray465[0] >= 0) {
					if (local43.aString108 != null && (local12 <= local18 || Static209.anInt3642 == 0 || Static209.anInt3642 == 3 || Static209.anInt3642 == 1 && Static299.method4367(((Class34_Sub1_Sub1_Sub2_Sub1) local43).aString25)) && Static306.anInt5138 > Static213.anInt3691) {
						Static306.anIntArray290[Static213.anInt3691] = Static281.aClass91_7.method1849(local43.aString108) / 2;
						Static306.anIntArray292[Static213.anInt3691] = Static33.anIntArray465[0];
						Static306.anIntArray288[Static213.anInt3691] = Static33.anIntArray465[1];
						Static306.anIntArray289[Static213.anInt3691] = local43.anInt9654;
						Static306.anIntArray291[Static213.anInt3691] = local43.anInt9663;
						Static306.anIntArray287[Static213.anInt3691] = local43.anInt9661;
						Static306.aStringArray35[Static213.anInt3691] = local43.aString108;
						Static213.anInt3691++;
					}
					local184 = arg1 + Static33.anIntArray465[1];
					@Pc(243) Class6[] local243;
					@Pc(250) Class370[] local250;
					@Pc(302) Class6 local302;
					if (local43.aBoolean674 || Static122.anInt2190 >= local43.anInt9692) {
						local184 -= Math.max(Static281.aClass91_7.anInt2198, Static225.aClass6Array5[0].method5136());
					} else {
						@Pc(199) byte local199 = 1;
						if (local12 > local18) {
							@Pc(208) Class34_Sub1_Sub1_Sub2_Sub1 local208 = Static506.aClass34_Sub1_Sub1_Sub2_Sub1Array1[local14[local18]];
							local213 = local43.method7878().anInt7506;
							if (local208.aBoolean144) {
								local199 = 2;
							}
						} else {
							local213 = local22.anInt6811;
							if (local213 == -1) {
								local213 = local43.method7878().anInt7506;
							}
						}
						@Pc(233) Class6[] local233 = Static225.aClass6Array5;
						if (local213 != -1) {
							local243 = (Class6[]) Static319.aClass295_29.method6470((long) local213);
							if (local243 == null) {
								local250 = Static688.method8597(Static142.aClass362_32, local213);
								if (local250 != null) {
									local243 = new Class6[local250.length];
									for (local258 = 0; local258 < local250.length; local258++) {
										local243[local258] = Static119.aClass95_4.method8008(local250[local258], true);
									}
									Static319.aClass295_29.method6469((long) local213, local243);
								}
							}
							if (local243 != null && local243.length >= 2) {
								local233 = local243;
							}
						}
						if (local199 >= local233.length) {
							local199 = 1;
						}
						@Pc(298) Class6 local298 = local233[0];
						local302 = local233[local199];
						local184 -= Math.max(Static281.aClass91_7.anInt2198, local298.method5136());
						local258 = arg3 + Static33.anIntArray465[0] - (local298.method5119() >> 1);
						local330 = local298.method5119() * local43.anInt9694 / 255;
						local333 = local298.method5136();
						if (local43.anInt9694 > 0 && local330 < 2) {
							local330 = 2;
						}
						local298.method5115(local258, local184);
						Static119.aClass95_4.T(local258, local184, local330 + local258, local184 + local333);
						local302.method5115(local258, local184);
						Static119.aClass95_4.KA(arg3, arg1, arg3 + arg0, arg2 + arg1);
						Static63.method1147(local184, local298.method5130() + local258, local258, local184 + local333);
					}
					local184 -= 2;
					if (!local43.aBoolean674) {
						@Pc(417) Class6 local417;
						@Pc(426) Class6 local426;
						if (Static122.anInt2190 < local43.anInt9658) {
							local417 = Static678.aClass6Array15[local43.aBoolean675 ? 2 : 0];
							local426 = Static678.aClass6Array15[local43.aBoolean675 ? 3 : 1];
							if (local43 instanceof Class34_Sub1_Sub1_Sub2_Sub2) {
								local434 = local22.anInt6798;
								if (local434 == -1) {
									local434 = local43.method7878().anInt7523;
								}
							} else {
								local434 = local43.method7878().anInt7523;
							}
							if (local434 != -1) {
								local243 = (Class6[]) Static513.aClass295_52.method6470((long) local434);
								if (local243 == null) {
									local250 = Static688.method8597(Static142.aClass362_32, local434);
									if (local250 != null) {
										local243 = new Class6[local250.length];
										for (local258 = 0; local258 < local250.length; local258++) {
											local243[local258] = Static119.aClass95_4.method8008(local250[local258], true);
										}
										Static513.aClass295_52.method6469((long) local434, local243);
									}
								}
								if (local243 != null && local243.length == 4) {
									local417 = local243[local43.aBoolean675 ? 2 : 0];
									local426 = local243[local43.aBoolean675 ? 3 : 1];
								}
							}
							@Pc(529) int local529 = local43.anInt9658 - Static122.anInt2190;
							if (local43.anInt9659 < local529) {
								local529 -= local43.anInt9659;
								local258 = local43.anInt9676 == 0 ? 0 : local43.anInt9676 * ((local43.anInt9682 - local529) / local43.anInt9676);
								local570 = local258 * local417.method5119() / local43.anInt9682;
							} else {
								local570 = local417.method5119();
							}
							local258 = local417.method5136();
							local184 -= local258;
							local330 = Static33.anIntArray465[0] + arg3 - (local417.method5119() >> 1);
							local417.method5115(local330, local184);
							Static119.aClass95_4.T(local330, local184, local570 + local330, local258 + local184);
							local426.method5115(local330, local184);
							Static119.aClass95_4.KA(arg3, arg1, arg3 + arg0, arg2 + arg1);
							Static63.method1147(local184, local417.method5130() + local330, local330, local184 + local258);
							local184 -= 2;
						}
						if (local18 < local12) {
							@Pc(712) Class34_Sub1_Sub1_Sub2_Sub1 local712 = (Class34_Sub1_Sub1_Sub2_Sub1) local43;
							if (local712.anInt1796 != -1) {
								local184 -= 25;
								local426 = Static393.aClass6Array10[local712.anInt1796];
								local426.method5115(arg3 + Static33.anIntArray465[0] - 12, local184);
								Static63.method1147(local184, Static33.anIntArray465[0] + arg3 + local426.method5130() - 12, Static33.anIntArray465[0] + -12 + arg3, local184 + local426.method5134());
								local184 -= 2;
							}
							if (local712.anInt1786 != -1) {
								local184 -= 25;
								local426 = Static348.aClass6Array9[local712.anInt1786];
								local426.method5115(Static33.anIntArray465[0] + arg3 - 12, local184);
								Static63.method1147(local184, Static33.anIntArray465[0] + arg3 + local426.method5130() - 12, Static33.anIntArray465[0] + -12 + arg3, local184 + local426.method5134());
								local184 -= 2;
							}
						} else if (local22.anInt6790 >= 0 && Static348.aClass6Array9.length > local22.anInt6790) {
							local417 = Static348.aClass6Array9[local22.anInt6790];
							local184 -= 25;
							local417.method5115(Static33.anIntArray465[0] + arg3 - (local417.method5119() >> 1), local184);
							Static63.method1147(local184, Static33.anIntArray465[0] + arg3 - (local417.method5119() >> 1) + local417.method5130(), Static33.anIntArray465[0] + (arg3 - (local417.method5119() >> 1)), local184 + local417.method5134());
							local184 -= 2;
						}
					}
					@Pc(815) Class252[] local815;
					@Pc(823) Class252 local823;
					if (!(local43 instanceof Class34_Sub1_Sub1_Sub2_Sub1)) {
						local213 = 0;
						local815 = Static171.aClass252Array1;
						for (local434 = 0; local434 < local815.length; local434++) {
							local823 = local815[local434];
							if (local823 != null && local823.anInt6681 == 1 && local823.anInt6678 == Static603.anIntArray537[local18 - local12]) {
								local302 = Static14.aClass6Array1[local823.anInt6684];
								if (local213 < local302.method5136()) {
									local213 = local302.method5136();
								}
								if (Static122.anInt2190 % 20 < 10) {
									local302.method5115(Static33.anIntArray465[0] + arg3 - 12, local184 + -local302.method5136());
									Static63.method1147(local184 - local302.method5136(), Static33.anIntArray465[0] + -12 + arg3 - -local302.method5130(), Static33.anIntArray465[0] + arg3 - 12, local184 + -local302.method5136() - -local302.method5134());
								}
							}
						}
						if (local213 > 0) {
						}
					} else if (local18 >= 0) {
						local213 = 0;
						local815 = Static171.aClass252Array1;
						for (local434 = 0; local434 < local815.length; local434++) {
							local823 = local815[local434];
							if (local823 != null && local823.anInt6681 == 10 && local823.anInt6678 == local14[local18]) {
								local302 = Static14.aClass6Array1[local823.anInt6684];
								if (local302.method5136() > local213) {
									local213 = local302.method5136();
								}
								local302.method5115(arg3 + Static33.anIntArray465[0] - 12, -local302.method5136() + local184);
								Static63.method1147(local184 - local302.method5136(), Static33.anIntArray465[0] + -12 + arg3 + local302.method5130(), arg3 + Static33.anIntArray465[0] - 12, local184 - (local302.method5136() - local302.method5134()));
							}
						}
						if (local213 > 0) {
						}
					}
					for (local213 = 0; local213 < Static258.anInt4523; local213++) {
						local1032 = local43.anIntArray523[local213];
						local434 = local43.anIntArray520[local213];
						@Pc(1039) Class369 local1039 = null;
						local570 = 0;
						if (local434 >= 0) {
							if (local1032 <= Static122.anInt2190) {
								continue;
							}
							local1039 = Static32.aClass65_1.method1506(local43.anIntArray520[local213]);
							local570 = local1039.anInt10473;
						} else if (local1032 < 0) {
							continue;
						}
						local258 = local43.anIntArray525[local213];
						@Pc(1080) Class369 local1080 = null;
						if (local258 >= 0) {
							local1080 = Static32.aClass65_1.method1506(local258);
						}
						if (local1032 - local570 <= Static122.anInt2190) {
							local333 = local43.anIntArray526[local213];
							if (local333 >= 0) {
								local43.anInt9692 = Static122.anInt2190 + 300;
								local43.anInt9694 = local333;
								local43.anIntArray526[local213] = -1;
							}
							if (local1039 == null) {
								local43.anIntArray523[local213] = -1;
							} else {
								local1137 = local43.method7861() / 2;
								Static317.method4555(local1137, local43, arg2 >> 1, arg0 >> 1);
								if (Static33.anIntArray465[0] > -1) {
									Static33.anIntArray465[0] += Static198.anIntArray186[local213];
									Static33.anIntArray465[1] += Static75.anIntArray81[local213];
									local1183 = 0;
									local1185 = 0;
									@Pc(1187) int local1187 = 0;
									@Pc(1189) int local1189 = 0;
									@Pc(1191) int local1191 = 0;
									@Pc(1193) int local1193 = 0;
									@Pc(1195) int local1195 = 0;
									@Pc(1197) int local1197 = 0;
									@Pc(1199) Class6 local1199 = null;
									@Pc(1201) Class6 local1201 = null;
									@Pc(1203) Class6 local1203 = null;
									@Pc(1205) Class6 local1205 = null;
									@Pc(1207) int local1207 = 0;
									@Pc(1209) int local1209 = 0;
									@Pc(1211) int local1211 = 0;
									@Pc(1213) int local1213 = 0;
									@Pc(1215) int local1215 = 0;
									@Pc(1217) int local1217 = 0;
									@Pc(1219) int local1219 = 0;
									@Pc(1221) int local1221 = 0;
									@Pc(1223) int local1223 = 0;
									@Pc(1228) Class6 local1228 = local1039.method8588(Static119.aClass95_4);
									@Pc(1236) int local1236;
									if (local1228 != null) {
										local1183 = local1228.method5119();
										local1236 = local1228.method5136();
										if (local1236 > 0) {
											local1223 = local1236;
										}
										local1228.method5118(Static411.anIntArray350);
										local1191 = Static411.anIntArray350[0];
									}
									@Pc(1257) Class6 local1257 = local1039.method8585(Static119.aClass95_4);
									if (local1257 != null) {
										local1185 = local1257.method5119();
										local1236 = local1257.method5136();
										if (local1236 > local1223) {
											local1223 = local1236;
										}
										local1257.method5118(Static411.anIntArray350);
										local1193 = Static411.anIntArray350[0];
									}
									@Pc(1286) Class6 local1286 = local1039.method8589(Static119.aClass95_4);
									if (local1286 != null) {
										local1187 = local1286.method5119();
										local1236 = local1286.method5136();
										local1286.method5118(Static411.anIntArray350);
										if (local1223 < local1236) {
											local1223 = local1236;
										}
										local1195 = Static411.anIntArray350[0];
									}
									@Pc(1311) Class6 local1311 = local1039.method8582(Static119.aClass95_4);
									if (local1311 != null) {
										local1189 = local1311.method5119();
										local1236 = local1311.method5136();
										if (local1236 > local1223) {
											local1223 = local1236;
										}
										local1311.method5118(Static411.anIntArray350);
										local1197 = Static411.anIntArray350[0];
									}
									if (local1080 != null) {
										local1199 = local1080.method8588(Static119.aClass95_4);
										if (local1199 != null) {
											local1207 = local1199.method5119();
											local1236 = local1199.method5136();
											local1199.method5118(Static411.anIntArray350);
											if (local1223 < local1236) {
												local1223 = local1236;
											}
											local1215 = Static411.anIntArray350[0];
										}
										local1201 = local1080.method8585(Static119.aClass95_4);
										if (local1201 != null) {
											local1209 = local1201.method5119();
											local1236 = local1201.method5136();
											local1201.method5118(Static411.anIntArray350);
											if (local1236 > local1223) {
												local1223 = local1236;
											}
											local1217 = Static411.anIntArray350[0];
										}
										local1203 = local1080.method8589(Static119.aClass95_4);
										if (local1203 != null) {
											local1211 = local1203.method5119();
											local1236 = local1203.method5136();
											if (local1223 < local1236) {
												local1223 = local1236;
											}
											local1203.method5118(Static411.anIntArray350);
											local1219 = Static411.anIntArray350[0];
										}
										local1205 = local1080.method8582(Static119.aClass95_4);
										if (local1205 != null) {
											local1213 = local1205.method5119();
											local1236 = local1205.method5136();
											local1205.method5118(Static411.anIntArray350);
											if (local1236 > local1223) {
												local1223 = local1236;
											}
											local1221 = Static411.anIntArray350[0];
										}
									}
									@Pc(1455) Class67 local1455 = Static261.aClass67_5;
									@Pc(1457) Class67 local1457 = Static261.aClass67_5;
									@Pc(1459) Class91 local1459 = Static285.aClass91_8;
									@Pc(1461) Class91 local1461 = Static285.aClass91_8;
									local1236 = local1039.anInt10480;
									@Pc(1477) Class67 local1477;
									@Pc(1482) Class91 local1482;
									if (local1236 >= 0) {
										local1477 = Static379.method5354(Static119.aClass95_4, true, local1236);
										local1482 = Static448.method6082(local1236, Static119.aClass95_4);
										if (local1477 != null && local1482 != null) {
											local1455 = local1477;
											local1459 = local1482;
										}
									}
									if (local1080 != null) {
										local1236 = local1080.anInt10480;
										if (local1236 >= 0) {
											local1477 = Static379.method5354(Static119.aClass95_4, true, local1236);
											local1482 = Static448.method6082(local1236, Static119.aClass95_4);
											if (local1477 != null && local1482 != null) {
												local1461 = local1482;
												local1457 = local1477;
											}
										}
									}
									@Pc(1525) String local1525 = null;
									@Pc(1535) String local1535 = local1039.method8583(local43.anIntArray521[local213]);
									@Pc(1537) int local1537 = 0;
									@Pc(1542) int local1542 = local1459.method1849(local1535);
									if (local1080 != null) {
										local1525 = local1080.method8583(local43.anIntArray519[local213]);
										local1537 = local1461.method1849(local1525);
									}
									@Pc(1559) int local1559 = 0;
									if (local1185 > 0) {
										local1559 = local1542 / local1185 + 1;
									}
									@Pc(1569) int local1569 = 0;
									if (local1080 != null && local1209 > 0) {
										local1569 = local1537 / local1209 + 1;
									}
									@Pc(1581) int local1581 = 0;
									if (local1183 > 0) {
										local1581 = local1183;
									}
									local1581 += 2;
									@Pc(1595) int local1595 = local1581;
									if (local1187 > 0) {
										local1581 += local1187;
									}
									@Pc(1606) int local1606 = local1581;
									@Pc(1608) int local1608 = local1581;
									@Pc(1614) int local1614;
									if (local1185 > 0) {
										local1614 = local1559 * local1185;
										local1581 += local1614;
										local1608 += (local1614 - local1542) / 2;
									} else {
										local1581 += local1542;
									}
									local1614 = local1581;
									if (local1189 > 0) {
										local1581 += local1189;
									}
									@Pc(1643) int local1643 = 0;
									@Pc(1645) int local1645 = 0;
									@Pc(1647) int local1647 = 0;
									@Pc(1649) int local1649 = 0;
									@Pc(1651) int local1651 = 0;
									@Pc(1693) int local1693;
									if (local1080 != null) {
										local1581 += 2;
										local1643 = local1581;
										if (local1207 > 0) {
											local1581 += local1207;
										}
										local1581 += 2;
										local1645 = local1581;
										if (local1211 > 0) {
											local1581 += local1211;
										}
										local1647 = local1581;
										local1651 = local1581;
										if (local1209 <= 0) {
											local1581 += local1537;
										} else {
											local1693 = local1569 * local1209;
											local1581 += local1693;
											local1651 += (local1693 - local1537) / 2;
										}
										local1649 = local1581;
										if (local1213 > 0) {
											local1581 += local1213;
										}
									}
									local1693 = local43.anIntArray523[local213] - Static122.anInt2190;
									@Pc(1733) int local1733 = local1039.anInt10485 - local1039.anInt10485 * local1693 / local1039.anInt10473;
									@Pc(1746) int local1746 = local1693 * local1039.anInt10469 / local1039.anInt10473 - local1039.anInt10469;
									@Pc(1758) int local1758 = local1733 + Static33.anIntArray465[0] + arg3 - (local1581 >> 1);
									@Pc(1769) int local1769 = Static33.anIntArray465[1] + arg1 + local1746 - 12;
									@Pc(1771) int local1771 = local1769;
									@Pc(1776) int local1776 = local1769 + local1223;
									@Pc(1783) int local1783 = local1769 + local1039.anInt10474 + 15;
									@Pc(1788) int local1788 = local1783 - local1459.anInt2198;
									if (local1788 < local1769) {
										local1771 = local1788;
									}
									@Pc(1799) int local1799 = local1783 + local1459.anInt2205;
									if (local1799 > local1776) {
										local1776 = local1799;
									}
									@Pc(1806) int local1806 = 0;
									@Pc(1821) int local1821;
									@Pc(1826) int local1826;
									if (local1080 != null) {
										local1806 = local1080.anInt10474 + local1769 + 15;
										local1821 = local1806 - local1461.anInt2198;
										local1826 = local1806 + local1461.anInt2205;
										if (local1821 < local1771) {
											local1771 = local1821;
										}
										if (local1776 < local1826) {
											local1776 = local1826;
										}
									}
									local1821 = 255;
									if (local1039.anInt10477 >= 0) {
										local1821 = (local1693 << 8) / (local1039.anInt10473 - local1039.anInt10477);
									}
									if (local1821 >= 0 && local1821 < 255) {
										local1826 = local1821 << 24;
										@Pc(2016) int local2016 = local1826 | 0xFFFFFF;
										if (local1228 != null) {
											local1228.method5133(local1758 - local1191, local1769, 0, local2016, 1);
										}
										if (local1286 != null) {
											local1286.method5133(local1758 + local1595 - local1195, local1769, 0, local2016, 1);
										}
										@Pc(2048) int local2048;
										if (local1257 != null) {
											for (local2048 = 0; local2048 < local1559; local2048++) {
												local1257.method5133(local2048 * local1185 + local1606 + local1758 - local1193, local1769, 0, local2016, 1);
											}
										}
										if (local1311 != null) {
											local1311.method5133(local1758 + local1614 - local1197, local1769, 0, local2016, 1);
										}
										local1455.method7684(local1039.anInt10489 | local1826, local1758 + local1608, local1783, local1535, 0);
										if (local1080 != null) {
											if (local1199 != null) {
												local1199.method5133(local1643 + local1758 - local1215, local1769, 0, local2016, 1);
											}
											if (local1203 != null) {
												local1203.method5133(local1645 + local1758 - local1219, local1769, 0, local2016, 1);
											}
											if (local1201 != null) {
												for (local2048 = 0; local2048 < local1569; local2048++) {
													local1201.method5133(local1209 * local2048 + local1647 + local1758 - local1217, local1769, 0, local2016, 1);
												}
											}
											if (local1205 != null) {
												local1205.method5133(local1758 + local1649 - local1221, local1769, 0, local2016, 1);
											}
											local1457.method7684(local1080.anInt10489 | local1826, local1651 + local1758, local1806, local1525, 0);
										}
									} else {
										if (local1228 != null) {
											local1228.method5115(local1758 - local1191, local1769);
										}
										if (local1286 != null) {
											local1286.method5115(local1595 + local1758 - local1195, local1769);
										}
										if (local1257 != null) {
											for (local1826 = 0; local1826 < local1559; local1826++) {
												local1257.method5115(local1826 * local1185 + local1606 + local1758 - local1193, local1769);
											}
										}
										if (local1311 != null) {
											local1311.method5115(local1758 + local1614 - local1197, local1769);
										}
										local1455.method7684(local1039.anInt10489 | 0xFF000000, local1608 + local1758, local1783, local1535, 0);
										if (local1080 != null) {
											if (local1199 != null) {
												local1199.method5115(local1643 + local1758 - local1215, local1769);
											}
											if (local1203 != null) {
												local1203.method5115(local1758 + local1645 - local1219, local1769);
											}
											if (local1201 != null) {
												for (local1826 = 0; local1826 < local1569; local1826++) {
													local1201.method5115(local1826 * local1209 + local1758 + local1647 - local1217, local1769);
												}
											}
											if (local1205 != null) {
												local1205.method5115(local1649 + local1758 - local1221, local1769);
											}
											local1457.method7684(local1080.anInt10489 | 0xFF000000, local1758 + local1651, local1806, local1525, 0);
										}
									}
									Static63.method1147(local1771, local1581 + local1758, local1758, local1776 + 1);
								}
							}
						}
					}
				}
			}
		}
		@Pc(2217) int local2217;
		for (@Pc(2211) int local2211 = 0; local2211 < Static387.anInt6472; local2211++) {
			local2217 = Static64.anIntArray68[local2211];
			@Pc(2230) Class34_Sub1_Sub1_Sub2 local2230;
			if (local2217 >= 2048) {
				local2230 = ((Class3_Sub52) Static105.aClass333_11.method7489((long) (local2217 - 2048))).aClass34_Sub1_Sub1_Sub2_Sub2_2;
			} else {
				local2230 = Static506.aClass34_Sub1_Sub1_Sub2_Sub1Array1[local2217];
			}
			local213 = Static312.anIntArray295[local2211];
			@Pc(2255) Class34_Sub1_Sub1_Sub2 local2255;
			if (local213 >= 2048) {
				local2255 = ((Class3_Sub52) Static105.aClass333_11.method7489((long) (local213 - 2048))).aClass34_Sub1_Sub1_Sub2_Sub2_2;
			} else {
				local2255 = Static506.aClass34_Sub1_Sub1_Sub2_Sub1Array1[local213];
			}
			Static431.method5944(--local2230.anInt9650, arg0, arg1, local2230, local2255, arg3, arg2);
		}
		local2217 = Static281.aClass91_7.anInt2198 + Static281.aClass91_7.anInt2205 + 2;
		for (local184 = 0; local184 < Static213.anInt3691; local184++) {
			local213 = Static306.anIntArray292[local184];
			local1032 = Static306.anIntArray288[local184];
			local434 = Static306.anIntArray290[local184];
			@Pc(2309) boolean local2309 = true;
			while (local2309) {
				local2309 = false;
				for (local570 = 0; local570 < local184; local570++) {
					if (local1032 + 2 > Static306.anIntArray288[local570] - local2217 && local1032 - local2217 < Static306.anIntArray288[local570] - -2 && Static306.anIntArray290[local570] + Static306.anIntArray292[local570] > local213 + -local434 && Static306.anIntArray292[local570] - Static306.anIntArray290[local570] < local434 + local213 && local1032 > Static306.anIntArray288[local570] - local2217) {
						local1032 = Static306.anIntArray288[local570] - local2217;
						local2309 = true;
					}
				}
			}
			Static306.anIntArray288[local184] = local1032;
			@Pc(2399) String local2399 = Static306.aStringArray35[local184];
			local258 = Static281.aClass91_7.method1849(local2399);
			local330 = arg3 + local213;
			local333 = arg1 + local1032 - Static281.aClass91_7.anInt2198;
			local1137 = local330 + local258;
			@Pc(2430) int local2430 = local1032 + arg1 + Static281.aClass91_7.anInt2205;
			if (Static448.anInt7231 == 0) {
				@Pc(2437) int local2437 = 16776960;
				if (Static306.anIntArray289[local184] < 6) {
					local2437 = Static492.anIntArray41[Static306.anIntArray289[local184]];
				}
				if (Static306.anIntArray289[local184] == 6) {
					local2437 = Static494.anInt7829 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static306.anIntArray289[local184] == 7) {
					local2437 = Static494.anInt7829 % 20 >= 10 ? 65535 : 255;
				}
				if (Static306.anIntArray289[local184] == 8) {
					local2437 = Static494.anInt7829 % 20 >= 10 ? 8454016 : 45056;
				}
				@Pc(2506) int local2506;
				if (Static306.anIntArray289[local184] == 9) {
					local2506 = 150 - Static306.anIntArray287[local184];
					if (local2506 < 50) {
						local2437 = local2506 * 1280 + 16711680;
					} else if (local2506 < 100) {
						local2437 = 16776960 - (local2506 - 50) * 327680;
					} else if (local2506 < 150) {
						local2437 = (local2506 - 100) * 5 + 65280;
					}
				}
				if (Static306.anIntArray289[local184] == 10) {
					local2506 = 150 - Static306.anIntArray287[local184];
					if (local2506 < 50) {
						local2437 = local2506 * 5 + 16711680;
					} else if (local2506 < 100) {
						local2437 = 16711935 + 16384000 - local2506 * 327680;
					} else if (local2506 < 150) {
						local2437 = local2506 * 327680 + 255 - (local2506 - 100) * 5 - 32768000;
					}
				}
				if (Static306.anIntArray289[local184] == 11) {
					local2506 = 150 - Static306.anIntArray287[local184];
					if (local2506 < 50) {
						local2437 = 16777215 - local2506 * 327685;
					} else if (local2506 < 100) {
						local2437 = (local2506 - 50) * 327685 + 65280;
					} else if (local2506 < 150) {
						local2437 = 16777215 - (local2506 - 100) * 327680;
					}
				}
				local2506 = local2437 | 0xFF000000;
				if (Static306.anIntArray291[local184] == 0) {
					Static293.aClass67_14.method7676(local2506, local2399, -16777216, arg1 + local1032, arg3 + local213);
					local1137 -= local258 >> 1;
					local330 -= local258 >> 1;
				}
				if (Static306.anIntArray291[local184] == 1) {
					Static293.aClass67_14.method7688(local213 + arg3, Static494.anInt7829, local2399, local2506, local1032 + arg1);
					local330 -= local258 >> 1;
					local1137 -= local258 >> 1;
					local2430 += 5;
					local333 -= 5;
				}
				if (Static306.anIntArray291[local184] == 2) {
					local2430 += 5;
					local333 -= 5;
					local330 -= (local258 >> 1) + 5;
					local1137 -= (local258 >> 1) - 5;
					Static293.aClass67_14.method7674(local2399, local213 + arg3, Static494.anInt7829, local1032 + arg1, local2506);
				}
				if (Static306.anIntArray291[local184] == 3) {
					local1137 -= local258 >> 1;
					local333 -= 7;
					Static293.aClass67_14.method7687(local2506, 150 - Static306.anIntArray287[local184], local213 + arg3, Static494.anInt7829, arg1 + local1032, local2399);
					local330 -= local258 >> 1;
					local2430 += 7;
				}
				@Pc(2819) int local2819;
				if (Static306.anIntArray291[local184] == 4) {
					local2819 = (150 - Static306.anIntArray287[local184]) * (Static281.aClass91_7.method1849(local2399) + 100) / 150;
					Static119.aClass95_4.T(local213 + arg3 - 50, arg1, local213 + arg3 + 50, arg2 + arg1);
					local1137 += 50 - local2819;
					local330 += 50 - local2819;
					Static293.aClass67_14.method7684(local2506, local213 + arg3 + 50 - local2819, arg1 - -local1032, local2399, -16777216);
					Static119.aClass95_4.KA(arg3, arg1, arg0 + arg3, arg2 + arg1);
				}
				if (Static306.anIntArray291[local184] == 5) {
					local2819 = 150 - Static306.anIntArray287[local184];
					local1183 = 0;
					if (local2819 < 25) {
						local1183 = local2819 - 25;
					} else if (local2819 > 125) {
						local1183 = local2819 - 125;
					}
					local1185 = Static281.aClass91_7.anInt2198 + Static281.aClass91_7.anInt2205;
					Static119.aClass95_4.T(arg3, arg1 + local1032 - local1185 - 1, arg3 + arg0, arg1 + local1032 + 5);
					local1137 -= local258 >> 1;
					local330 -= local258 >> 1;
					local2430 += local1183;
					Static293.aClass67_14.method7676(local2506, local2399, -16777216, local1183 + local1032 + arg1, local213 + arg3);
					local333 += local1183;
					Static119.aClass95_4.KA(arg3, arg1, arg0 + arg3, arg2 + arg1);
				}
			} else {
				local330 -= local258 >> 1;
				Static293.aClass67_14.method7676(-256, local2399, -16777216, local1032 + arg1, local213 + arg3);
				local1137 -= local258 >> 1;
			}
			Static63.method1147(local333, local1137 + 1, local330, local2430 + 1);
		}
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(IIILclient!mfa;)V")
	public static void method5567(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3_Sub5_Sub13 arg2) {
		if (!Static532.aBoolean580) {
			return;
		}
		@Pc(10) int local10 = 0;
		@Pc(22) int local22;
		for (@Pc(16) Class3_Sub5_Sub18 local16 = (Class3_Sub5_Sub18) arg2.aClass243_10.method5459(); local16 != null; local16 = (Class3_Sub5_Sub18) arg2.aClass243_10.method5453()) {
			local22 = Static648.method8707(local16);
			if (local10 < local22) {
				local10 = local22;
			}
		}
		local10 += 8;
		Static515.anInt8106 = arg2.anInt6245 * 16 + (Static653.aBoolean735 ? 26 : 22);
		local22 = arg2.anInt6245 * 16 + 21;
		@Pc(63) int local63 = Static517.anInt8133 + Static532.anInt8336;
		if (local63 + local10 > Static531.anInt8327) {
			local63 = Static517.anInt8133 - local10;
		}
		if (local63 < 0) {
			local63 = 0;
		}
		@Pc(90) int local90 = Static653.aBoolean735 ? 33 : 31;
		@Pc(96) int local96 = arg0 + 13 - local90;
		if (local22 + local96 > Static13.anInt306) {
			local96 = Static13.anInt306 - local22;
		}
		Static453.anInt7304 = local63;
		if (local96 < 0) {
			local96 = 0;
		}
		Static3.anInt15 = local96;
		Static352.aClass3_Sub5_Sub13_1 = arg2;
		Static473.anInt7547 = local10;
	}
}
