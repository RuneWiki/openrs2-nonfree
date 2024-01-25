import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!dg", name = "e", descriptor = "I")
	public static int anInt2131;

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "Lclient!fba;")
	public static final Class100 aClass100_30 = new Class100(89, 11);

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_47 = new Class44(78, 6);

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "Z")
	public static boolean aBoolean177 = true;

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Ljava/awt/Frame;ILclient!td;)V")
	public static void method1801(@OriginalArg(0) Frame arg0, @OriginalArg(2) Class333 arg1) {
		while (true) {
			@Pc(14) Class150 local14 = arg1.method8141(arg0);
			while (local14.anInt4247 == 0) {
				Static20.method9254(10L);
			}
			if (local14.anInt4247 == 1) {
				arg0.setVisible(false);
				arg0.dispose();
				return;
			}
			Static20.method9254(100L);
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIIBI)V")
	public static void method1802(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		@Pc(7) int local7 = Static209.anInt3954;
		Static625.anInt10534 = 0;
		@Pc(11) int[] local11 = Static457.anIntArray607;
		@Pc(181) int local181;
		@Pc(214) int local214;
		@Pc(271) int local271;
		@Pc(352) int local352;
		@Pc(355) int local355;
		@Pc(1130) int local1130;
		@Pc(1175) int local1175;
		@Pc(1177) int local1177;
		@Pc(446) int local446;
		@Pc(1039) int local1039;
		@Pc(573) int local573;
		for (@Pc(17) int local17 = 0; local17 < Static471.anInt8216 + local7; local17++) {
			@Pc(21) Class283 local21 = null;
			@Pc(30) Class12_Sub2_Sub2_Sub1 local30;
			if (local17 < local7) {
				local30 = Static486.aClass12_Sub2_Sub2_Sub1_Sub2Array1[local11[local17]];
			} else {
				local30 = ((Class14_Sub44) Static579.aClass187_73.method4078((long) Static530.anIntArray671[local17 - local7])).aClass12_Sub2_Sub2_Sub1_Sub1_2;
				local21 = ((Class12_Sub2_Sub2_Sub1_Sub1) local30).aClass283_1;
				if (local21.anIntArray638 != null) {
					local21 = local21.method7129(Static595.aClass241_1);
					if (local21 == null) {
						continue;
					}
				}
			}
			if (local30.anInt2924 >= 0 && (local30.anInt2926 == Static274.anInt4757 || Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.aByte146 == local30.aByte146)) {
				Static74.method1392(arg2 >> 1, local30.method2424(), arg0 >> 1, local30);
				if (Static599.anIntArray449[0] >= 0) {
					if (local30.aString33 != null && (local7 <= local17 || Static107.anInt2234 == 0 || Static107.anInt2234 == 3 || Static107.anInt2234 == 1 && Static21.method342(((Class12_Sub2_Sub2_Sub1_Sub2) local30).aString35)) && Static625.anInt10534 < Static64.anInt1475) {
						Static64.anIntArray104[Static625.anInt10534] = Static48.aClass158_1.method3601(local30.aString33) / 2;
						Static64.anIntArray107[Static625.anInt10534] = Static599.anIntArray449[0];
						Static64.anIntArray106[Static625.anInt10534] = Static599.anIntArray449[1];
						Static64.anIntArray109[Static625.anInt10534] = local30.anInt2944;
						Static64.anIntArray108[Static625.anInt10534] = local30.anInt2922;
						Static64.anIntArray105[Static625.anInt10534] = local30.anInt2910;
						Static64.aStringArray7[Static625.anInt10534] = local30.aString33;
						Static625.anInt10534++;
					}
					local181 = Static599.anIntArray449[1] + arg3;
					@Pc(256) Class20[] local256;
					@Pc(263) Class356[] local263;
					@Pc(323) Class20 local323;
					if (local30.aBoolean221 || Static87.anInt1951 >= local30.anInt2953) {
						local181 -= Math.max(Static48.aClass158_1.anInt4354, Static241.aClass20Array5[0].method7393());
					} else {
						@Pc(208) byte local208 = 1;
						if (local7 <= local17) {
							local214 = local21.anInt8635;
							if (local214 == -1) {
								local214 = local30.method2416().anInt3635;
							}
						} else {
							@Pc(233) Class12_Sub2_Sub2_Sub1_Sub2 local233 = Static486.aClass12_Sub2_Sub2_Sub1_Sub2Array1[local11[local17]];
							local214 = local30.method2416().anInt3635;
							if (local233.aBoolean229) {
								local208 = 2;
							}
						}
						@Pc(245) Class20[] local245 = Static241.aClass20Array5;
						if (local214 != -1) {
							local256 = (Class20[]) Static372.aClass264_42.method6367((long) local214);
							if (local256 == null) {
								local263 = Static688.method8628(Static666.aClass386_141, local214);
								if (local263 != null) {
									local256 = new Class20[local263.length];
									for (local271 = 0; local271 < local263.length; local271++) {
										local256[local271] = Static677.aClass137_47.method7951(local263[local271], true);
									}
									Static372.aClass264_42.method6364((long) local214, local256);
								}
							}
							if (local256 != null && local256.length >= 2) {
								local245 = local256;
							}
						}
						if (local208 >= local245.length) {
							local208 = 1;
						}
						@Pc(319) Class20 local319 = local245[0];
						local323 = local245[local208];
						local181 -= Math.max(Static48.aClass158_1.anInt4354, local319.method7393());
						local271 = arg1 + Static599.anIntArray449[0] - (local319.method7412() >> 1);
						local352 = local319.method7412() * local30.anInt2927 / 255;
						local355 = local319.method7393();
						if (local30.anInt2927 > 0 && local352 < 2) {
							local352 = 2;
						}
						local319.method7399(local271, local181);
						Static677.aClass137_47.T(local271, local181, local352 + local271, local181 - -local355);
						local323.method7399(local271, local181);
						Static677.aClass137_47.KA(arg1, arg3, arg0 + arg1, arg2 + arg3);
						Static357.method5407(local271, local181, local355 + local181, local319.method7394() + local271);
					}
					local181 -= 2;
					if (!local30.aBoolean221) {
						@Pc(427) Class20 local427;
						@Pc(436) Class20 local436;
						if (Static87.anInt1951 < local30.anInt2961) {
							local427 = Static414.aClass20Array11[local30.aBoolean223 ? 2 : 0];
							local436 = Static414.aClass20Array11[local30.aBoolean223 ? 3 : 1];
							if (local30 instanceof Class12_Sub2_Sub2_Sub1_Sub1) {
								local446 = local21.anInt8642;
								if (local446 == -1) {
									local446 = local30.method2416().anInt3667;
								}
							} else {
								local446 = local30.method2416().anInt3667;
							}
							if (local446 != -1) {
								local256 = (Class20[]) Static283.aClass264_32.method6367((long) local446);
								if (local256 == null) {
									local263 = Static688.method8628(Static666.aClass386_141, local446);
									if (local263 != null) {
										local256 = new Class20[local263.length];
										for (local271 = 0; local271 < local263.length; local271++) {
											local256[local271] = Static677.aClass137_47.method7951(local263[local271], true);
										}
										Static283.aClass264_32.method6364((long) local446, local256);
									}
								}
								if (local256 != null && local256.length == 4) {
									local427 = local256[local30.aBoolean223 ? 2 : 0];
									local436 = local256[local30.aBoolean223 ? 3 : 1];
								}
							}
							@Pc(537) int local537 = local30.anInt2961 - Static87.anInt1951;
							if (local30.anInt2914 < local537) {
								local537 -= local30.anInt2914;
								local271 = local30.anInt2908 == 0 ? 0 : (local30.anInt2901 - local537) / local30.anInt2908 * local30.anInt2908;
								local573 = local427.method7412() * local271 / local30.anInt2901;
							} else {
								local573 = local427.method7412();
							}
							local271 = local427.method7393();
							local181 -= local271;
							local352 = arg1 + Static599.anIntArray449[0] - (local427.method7412() >> 1);
							local427.method7399(local352, local181);
							Static677.aClass137_47.T(local352, local181, local573 + local352, local271 + local181);
							local436.method7399(local352, local181);
							Static677.aClass137_47.KA(arg1, arg3, arg1 + arg0, arg3 - -arg2);
							Static357.method5407(local352, local181, local181 + local271, local427.method7394() + local352);
							local181 -= 2;
						}
						if (local7 > local17) {
							@Pc(650) Class12_Sub2_Sub2_Sub1_Sub2 local650 = (Class12_Sub2_Sub2_Sub1_Sub2) local30;
							if (local650.anInt2991 != -1) {
								local181 -= 25;
								local436 = Static634.aClass20Array15[local650.anInt2991];
								local436.method7399(arg1 + Static599.anIntArray449[0] - 12, local181);
								Static357.method5407(Static599.anIntArray449[0] + arg1 - 12, local181, local181 + local436.method7408(), arg1 + Static599.anIntArray449[0] - 12 - -local436.method7394());
								local181 -= 2;
							}
							if (local650.anInt2988 != -1) {
								local181 -= 25;
								local436 = Static367.aClass20Array9[local650.anInt2988];
								local436.method7399(arg1 + Static599.anIntArray449[0] - 12, local181);
								Static357.method5407(arg1 + Static599.anIntArray449[0] - 12, local181, local436.method7408() + local181, arg1 - -Static599.anIntArray449[0] + -12 + local436.method7394());
								local181 -= 2;
							}
						} else if (local21.anInt8630 >= 0 && local21.anInt8630 < Static367.aClass20Array9.length) {
							local427 = Static367.aClass20Array9[local21.anInt8630];
							local181 -= 25;
							local427.method7399(arg1 + Static599.anIntArray449[0] - (local427.method7412() >> 1), local181);
							Static357.method5407(arg1 + Static599.anIntArray449[0] - (local427.method7412() >> 1), local181, local181 + local427.method7408(), arg1 - -Static599.anIntArray449[0] + -(local427.method7412() >> 1) + local427.method7394());
							local181 -= 2;
						}
					}
					@Pc(812) Class390[] local812;
					@Pc(820) Class390 local820;
					if (!(local30 instanceof Class12_Sub2_Sub2_Sub1_Sub2)) {
						local214 = 0;
						local812 = Static590.aClass390Array1;
						for (local446 = 0; local446 < local812.length; local446++) {
							local820 = local812[local446];
							if (local820 != null && local820.anInt11100 == 1 && Static530.anIntArray671[local17 - local7] == local820.anInt11103) {
								local323 = Static399.aClass20Array10[local820.anInt11098];
								if (local214 < local323.method7393()) {
									local214 = local323.method7393();
								}
								if (Static87.anInt1951 % 20 < 10) {
									local323.method7399(arg1 + Static599.anIntArray449[0] - 12, local181 - local323.method7393());
									Static357.method5407(arg1 + Static599.anIntArray449[0] - 12, local181 - local323.method7393(), local181 - local323.method7393() + local323.method7408(), arg1 + -12 + Static599.anIntArray449[0] + local323.method7394());
								}
							}
						}
						if (local214 > 0) {
						}
					} else if (local17 >= 0) {
						local214 = 0;
						local812 = Static590.aClass390Array1;
						for (local446 = 0; local446 < local812.length; local446++) {
							local820 = local812[local446];
							if (local820 != null && local820.anInt11100 == 10 && local11[local17] == local820.anInt11103) {
								local323 = Static399.aClass20Array10[local820.anInt11098];
								if (local214 < local323.method7393()) {
									local214 = local323.method7393();
								}
								local323.method7399(arg1 + Static599.anIntArray449[0] - 12, -local323.method7393() + local181);
								Static357.method5407(arg1 + Static599.anIntArray449[0] - 12, -local323.method7393() + local181, local181 - local323.method7393() + local323.method7408(), arg1 + Static599.anIntArray449[0] - 12 - -local323.method7394());
							}
						}
						if (local214 > 0) {
						}
					}
					for (local214 = 0; local214 < Static534.anInt9229; local214++) {
						local1039 = local30.anIntArray235[local214];
						local446 = local30.anIntArray237[local214];
						@Pc(1046) Class259 local1046 = null;
						local573 = 0;
						if (local446 >= 0) {
							if (Static87.anInt1951 >= local1039) {
								continue;
							}
							local1046 = Static137.aClass299_1.method7428(local30.anIntArray237[local214]);
							local573 = local1046.anInt7603;
						} else if (local1039 < 0) {
							continue;
						}
						local271 = local30.anIntArray240[local214];
						@Pc(1077) Class259 local1077 = null;
						if (local271 >= 0) {
							local1077 = Static137.aClass299_1.method7428(local271);
						}
						if (local1039 - local573 <= Static87.anInt1951) {
							local355 = local30.anIntArray236[local214];
							if (local355 >= 0) {
								local30.anInt2953 = Static87.anInt1951 + 300;
								local30.anInt2927 = local355;
								local30.anIntArray236[local214] = -1;
							}
							if (local1046 == null) {
								local30.anIntArray235[local214] = -1;
							} else {
								local1130 = local30.method2424() / 2;
								Static74.method1392(arg2 >> 1, local1130, arg0 >> 1, local30);
								if (Static599.anIntArray449[0] > -1) {
									Static599.anIntArray449[0] += Static390.anIntArray526[local214];
									Static599.anIntArray449[1] += Static173.anIntArray282[local214];
									local1175 = 0;
									local1177 = 0;
									@Pc(1179) int local1179 = 0;
									@Pc(1181) int local1181 = 0;
									@Pc(1183) int local1183 = 0;
									@Pc(1185) int local1185 = 0;
									@Pc(1187) int local1187 = 0;
									@Pc(1189) int local1189 = 0;
									@Pc(1191) Class20 local1191 = null;
									@Pc(1193) Class20 local1193 = null;
									@Pc(1195) Class20 local1195 = null;
									@Pc(1197) Class20 local1197 = null;
									@Pc(1199) int local1199 = 0;
									@Pc(1201) int local1201 = 0;
									@Pc(1203) int local1203 = 0;
									@Pc(1205) int local1205 = 0;
									@Pc(1207) int local1207 = 0;
									@Pc(1209) int local1209 = 0;
									@Pc(1211) int local1211 = 0;
									@Pc(1213) int local1213 = 0;
									@Pc(1215) int local1215 = 0;
									@Pc(1220) Class20 local1220 = local1046.method6252(Static677.aClass137_47);
									@Pc(1228) int local1228;
									if (local1220 != null) {
										local1175 = local1220.method7412();
										local1228 = local1220.method7393();
										local1220.method7411(Static367.anIntArray493);
										if (local1228 > 0) {
											local1215 = local1228;
										}
										local1183 = Static367.anIntArray493[0];
									}
									@Pc(1245) Class20 local1245 = local1046.method6253(Static677.aClass137_47);
									if (local1245 != null) {
										local1177 = local1245.method7412();
										local1228 = local1245.method7393();
										if (local1215 < local1228) {
											local1215 = local1228;
										}
										local1245.method7411(Static367.anIntArray493);
										local1185 = Static367.anIntArray493[0];
									}
									@Pc(1274) Class20 local1274 = local1046.method6256(Static677.aClass137_47);
									if (local1274 != null) {
										local1179 = local1274.method7412();
										local1228 = local1274.method7393();
										local1274.method7411(Static367.anIntArray493);
										if (local1215 < local1228) {
											local1215 = local1228;
										}
										local1187 = Static367.anIntArray493[0];
									}
									@Pc(1299) Class20 local1299 = local1046.method6251(Static677.aClass137_47);
									if (local1299 != null) {
										local1181 = local1299.method7412();
										local1228 = local1299.method7393();
										local1299.method7411(Static367.anIntArray493);
										if (local1228 > local1215) {
											local1215 = local1228;
										}
										local1189 = Static367.anIntArray493[0];
									}
									if (local1077 != null) {
										local1191 = local1077.method6252(Static677.aClass137_47);
										if (local1191 != null) {
											local1199 = local1191.method7412();
											local1228 = local1191.method7393();
											local1191.method7411(Static367.anIntArray493);
											if (local1215 < local1228) {
												local1215 = local1228;
											}
											local1207 = Static367.anIntArray493[0];
										}
										local1193 = local1077.method6253(Static677.aClass137_47);
										if (local1193 != null) {
											local1201 = local1193.method7412();
											local1228 = local1193.method7393();
											local1193.method7411(Static367.anIntArray493);
											if (local1215 < local1228) {
												local1215 = local1228;
											}
											local1209 = Static367.anIntArray493[0];
										}
										local1195 = local1077.method6256(Static677.aClass137_47);
										if (local1195 != null) {
											local1203 = local1195.method7412();
											local1228 = local1195.method7393();
											if (local1228 > local1215) {
												local1215 = local1228;
											}
											local1195.method7411(Static367.anIntArray493);
											local1211 = Static367.anIntArray493[0];
										}
										local1197 = local1077.method6251(Static677.aClass137_47);
										if (local1197 != null) {
											local1205 = local1197.method7412();
											local1228 = local1197.method7393();
											if (local1215 < local1228) {
												local1215 = local1228;
											}
											local1197.method7411(Static367.anIntArray493);
											local1213 = Static367.anIntArray493[0];
										}
									}
									@Pc(1439) Class38 local1439 = Static294.aClass38_9;
									@Pc(1441) Class38 local1441 = Static294.aClass38_9;
									@Pc(1443) Class158 local1443 = Static254.aClass158_7;
									@Pc(1445) Class158 local1445 = Static254.aClass158_7;
									local1228 = local1046.anInt7599;
									@Pc(1459) Class38 local1459;
									@Pc(1464) Class158 local1464;
									if (local1228 >= 0) {
										local1459 = Static411.method6078(local1228, Static677.aClass137_47, true);
										local1464 = Static250.method3681(Static677.aClass137_47, local1228);
										if (local1459 != null && local1464 != null) {
											local1439 = local1459;
											local1443 = local1464;
										}
									}
									if (local1077 != null) {
										local1228 = local1077.anInt7599;
										if (local1228 >= 0) {
											local1459 = Static411.method6078(local1228, Static677.aClass137_47, true);
											local1464 = Static250.method3681(Static677.aClass137_47, local1228);
											if (local1459 != null && local1464 != null) {
												local1441 = local1459;
												local1445 = local1464;
											}
										}
									}
									@Pc(1502) String local1502 = null;
									@Pc(1514) String local1514 = local1046.method6261(local30.anIntArray232[local214]);
									@Pc(1516) int local1516 = 0;
									@Pc(1521) int local1521 = local1443.method3601(local1514);
									if (local1077 != null) {
										local1502 = local1077.method6261(local30.anIntArray239[local214]);
										local1516 = local1445.method3601(local1502);
									}
									@Pc(1540) int local1540 = 0;
									if (local1177 > 0) {
										local1540 = local1521 / local1177 + 1;
									}
									@Pc(1550) int local1550 = 0;
									if (local1077 != null && local1201 > 0) {
										local1550 = local1516 / local1201 + 1;
									}
									@Pc(1565) int local1565 = 0;
									if (local1175 > 0) {
										local1565 = local1175;
									}
									local1565 += 2;
									@Pc(1576) int local1576 = local1565;
									if (local1179 > 0) {
										local1565 += local1179;
									}
									@Pc(1584) int local1584 = local1565;
									@Pc(1586) int local1586 = local1565;
									@Pc(1601) int local1601;
									if (local1177 <= 0) {
										local1565 += local1521;
									} else {
										local1601 = local1540 * local1177;
										local1586 = local1565 + (local1601 - local1521) / 2;
										local1565 += local1601;
									}
									local1601 = local1565;
									if (local1181 > 0) {
										local1565 += local1181;
									}
									@Pc(1626) int local1626 = 0;
									@Pc(1628) int local1628 = 0;
									@Pc(1630) int local1630 = 0;
									@Pc(1632) int local1632 = 0;
									@Pc(1634) int local1634 = 0;
									@Pc(1667) int local1667;
									if (local1077 != null) {
										local1565 += 2;
										local1626 = local1565;
										if (local1199 > 0) {
											local1565 += local1199;
										}
										local1565 += 2;
										local1628 = local1565;
										if (local1203 > 0) {
											local1565 += local1203;
										}
										local1634 = local1565;
										local1630 = local1565;
										if (local1201 > 0) {
											local1667 = local1550 * local1201;
											local1634 = local1565 + (local1667 - local1516) / 2;
											local1565 += local1667;
										} else {
											local1565 += local1516;
										}
										local1632 = local1565;
										if (local1205 > 0) {
											local1565 += local1205;
										}
									}
									local1667 = local30.anIntArray235[local214] - Static87.anInt1951;
									@Pc(1713) int local1713 = local1046.anInt7602 - local1046.anInt7602 * local1667 / local1046.anInt7603;
									@Pc(1725) int local1725 = local1667 * local1046.anInt7618 / local1046.anInt7603 - local1046.anInt7618;
									@Pc(1738) int local1738 = local1713 + Static599.anIntArray449[0] + arg1 - (local1565 >> 1);
									@Pc(1748) int local1748 = Static599.anIntArray449[1] + arg3 + local1725 - 12;
									@Pc(1750) int local1750 = local1748;
									@Pc(1754) int local1754 = local1748 + local1215;
									@Pc(1762) int local1762 = local1748 + local1046.anInt7605 + 15;
									@Pc(1767) int local1767 = local1762 - local1443.anInt4354;
									if (local1767 < local1748) {
										local1750 = local1767;
									}
									@Pc(1781) int local1781 = local1762 + local1443.anInt4347;
									if (local1781 > local1754) {
										local1754 = local1781;
									}
									@Pc(1788) int local1788 = 0;
									@Pc(1802) int local1802;
									@Pc(1808) int local1808;
									if (local1077 != null) {
										local1788 = local1077.anInt7605 + local1748 + 15;
										local1802 = local1788 - local1445.anInt4354;
										local1808 = local1788 + local1445.anInt4347;
										if (local1802 < local1750) {
											local1750 = local1802;
										}
										if (local1808 > local1754) {
											local1754 = local1808;
										}
									}
									local1802 = 255;
									if (local1046.anInt7607 >= 0) {
										local1802 = (local1667 << 8) / (local1046.anInt7603 - local1046.anInt7607);
									}
									if (local1802 >= 0 && local1802 < 255) {
										local1808 = local1802 << 24;
										@Pc(2006) int local2006 = local1808 | 0xFFFFFF;
										if (local1220 != null) {
											local1220.method7402(local1738 - local1183, local1748, 0, local2006, 1);
										}
										if (local1274 != null) {
											local1274.method7402(local1576 + local1738 - local1187, local1748, 0, local2006, 1);
										}
										@Pc(2038) int local2038;
										if (local1245 != null) {
											for (local2038 = 0; local2038 < local1540; local2038++) {
												local1245.method7402(local1177 * local2038 + local1584 + local1738 - local1185, local1748, 0, local2006, 1);
											}
										}
										if (local1299 != null) {
											local1299.method7402(local1738 + local1601 - local1189, local1748, 0, local2006, 1);
										}
										local1439.method8985(local1514, local1046.anInt7617 | local1808, 0, local1762, local1586 + local1738);
										if (local1077 != null) {
											if (local1191 != null) {
												local1191.method7402(local1626 + local1738 - local1207, local1748, 0, local2006, 1);
											}
											if (local1195 != null) {
												local1195.method7402(local1628 + local1738 - local1211, local1748, 0, local2006, 1);
											}
											if (local1193 != null) {
												for (local2038 = 0; local2038 < local1550; local2038++) {
													local1193.method7402(local1201 * local2038 + local1630 + local1738 - local1209, local1748, 0, local2006, 1);
												}
											}
											if (local1197 != null) {
												local1197.method7402(local1738 + local1632 - local1213, local1748, 0, local2006, 1);
											}
											local1441.method8985(local1502, local1808 | local1077.anInt7617, 0, local1788, local1738 + local1634);
										}
									} else {
										if (local1220 != null) {
											local1220.method7399(local1738 - local1183, local1748);
										}
										if (local1274 != null) {
											local1274.method7399(local1576 + local1738 - local1187, local1748);
										}
										if (local1245 != null) {
											for (local1808 = 0; local1808 < local1540; local1808++) {
												local1245.method7399(local1738 + local1584 + local1808 * local1177 - local1185, local1748);
											}
										}
										if (local1299 != null) {
											local1299.method7399(local1601 + local1738 - local1189, local1748);
										}
										local1439.method8985(local1514, local1046.anInt7617 | 0xFF000000, 0, local1762, local1586 + local1738);
										if (local1077 != null) {
											if (local1191 != null) {
												local1191.method7399(local1626 + local1738 - local1207, local1748);
											}
											if (local1195 != null) {
												local1195.method7399(local1738 + local1628 - local1211, local1748);
											}
											if (local1193 != null) {
												for (local1808 = 0; local1808 < local1550; local1808++) {
													local1193.method7399(local1738 + local1630 + local1808 * local1201 - local1209, local1748);
												}
											}
											if (local1197 != null) {
												local1197.method7399(local1632 + local1738 - local1213, local1748);
											}
											local1441.method8985(local1502, local1077.anInt7617 | 0xFF000000, 0, local1788, local1634 + local1738);
										}
									}
									Static357.method5407(local1738, local1750, local1754 + 1, local1738 + local1565);
								}
							}
						}
					}
				}
			}
		}
		@Pc(2205) int local2205;
		for (@Pc(2199) int local2199 = 0; local2199 < Static534.anInt9227; local2199++) {
			local2205 = Static203.anIntArray311[local2199];
			@Pc(2220) Class12_Sub2_Sub2_Sub1 local2220;
			if (local2205 >= 2048) {
				local2220 = ((Class14_Sub44) Static579.aClass187_73.method4078((long) (local2205 - 2048))).aClass12_Sub2_Sub2_Sub1_Sub1_2;
			} else {
				local2220 = Static486.aClass12_Sub2_Sub2_Sub1_Sub2Array1[local2205];
			}
			local214 = Static364.anIntArray487[local2199];
			@Pc(2243) Class12_Sub2_Sub2_Sub1 local2243;
			if (local214 >= 2048) {
				local2243 = ((Class14_Sub44) Static579.aClass187_73.method4078((long) (local214 - 2048))).aClass12_Sub2_Sub2_Sub1_Sub1_2;
			} else {
				local2243 = Static486.aClass12_Sub2_Sub2_Sub1_Sub2Array1[local214];
			}
			Static597.method8443(local2243, arg3, arg2, arg1, arg0, local2220, --local2220.anInt2906);
		}
		local2205 = Static48.aClass158_1.anInt4347 + Static48.aClass158_1.anInt4354 + 2;
		for (local181 = 0; local181 < Static625.anInt10534; local181++) {
			local214 = Static64.anIntArray107[local181];
			local1039 = Static64.anIntArray106[local181];
			local446 = Static64.anIntArray104[local181];
			@Pc(2298) boolean local2298 = true;
			while (local2298) {
				local2298 = false;
				for (local573 = 0; local573 < local181; local573++) {
					if (Static64.anIntArray106[local573] - local2205 < local1039 + 2 && local1039 - local2205 < Static64.anIntArray106[local573] + 2 && Static64.anIntArray104[local573] + Static64.anIntArray107[local573] > local214 - local446 && Static64.anIntArray107[local573] - Static64.anIntArray104[local573] < local446 + local214 && Static64.anIntArray106[local573] - local2205 < local1039) {
						local1039 = Static64.anIntArray106[local573] - local2205;
						local2298 = true;
					}
				}
			}
			Static64.anIntArray106[local181] = local1039;
			@Pc(2394) String local2394 = Static64.aStringArray7[local181];
			local271 = Static48.aClass158_1.method3601(local2394);
			local352 = arg1 + local214;
			local355 = arg3 + local1039 - Static48.aClass158_1.anInt4354;
			local1130 = local352 + local271;
			@Pc(2425) int local2425 = Static48.aClass158_1.anInt4347 + arg3 + local1039;
			if (Static257.anInt4524 == 0) {
				@Pc(2458) int local2458 = 16776960;
				if (Static64.anIntArray109[local181] < 6) {
					local2458 = Static602.anIntArray737[Static64.anIntArray109[local181]];
				}
				if (Static64.anIntArray109[local181] == 6) {
					local2458 = Static274.anInt4757 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static64.anIntArray109[local181] == 7) {
					local2458 = Static274.anInt4757 % 20 >= 10 ? 65535 : 255;
				}
				if (Static64.anIntArray109[local181] == 8) {
					local2458 = Static274.anInt4757 % 20 >= 10 ? 8454016 : 45056;
				}
				@Pc(2532) int local2532;
				if (Static64.anIntArray109[local181] == 9) {
					local2532 = 150 - Static64.anIntArray105[local181];
					if (local2532 < 50) {
						local2458 = local2532 * 1280 + 16711680;
					} else if (local2532 < 100) {
						local2458 = 16776960 + 16384000 - local2532 * 327680;
					} else if (local2532 < 150) {
						local2458 = local2532 * 5 + 64780;
					}
				}
				if (Static64.anIntArray109[local181] == 10) {
					local2532 = 150 - Static64.anIntArray105[local181];
					if (local2532 < 50) {
						local2458 = local2532 * 5 + 16711680;
					} else if (local2532 < 100) {
						local2458 = 16711935 - (local2532 - 50) * 327680;
					} else if (local2532 < 150) {
						local2458 = local2532 * 327680 + 255 - (local2532 + -100) * 5 - 32768000;
					}
				}
				if (Static64.anIntArray109[local181] == 11) {
					local2532 = 150 - Static64.anIntArray105[local181];
					if (local2532 < 50) {
						local2458 = 16777215 - local2532 * 327685;
					} else if (local2532 < 100) {
						local2458 = (local2532 - 50) * 327685 + 65280;
					} else if (local2532 < 150) {
						local2458 = 16777215 - (local2532 - 100) * 327680;
					}
				}
				local2532 = local2458 | 0xFF000000;
				if (Static64.anIntArray108[local181] == 0) {
					local1130 -= local271 >> 1;
					local352 -= local271 >> 1;
					Static448.aClass38_10.method8989(local2394, local2532, local1039 + arg3, -16777216, local214 + arg1);
				}
				if (Static64.anIntArray108[local181] == 1) {
					local352 -= local271 >> 1;
					local2425 += 5;
					local1130 -= local271 >> 1;
					Static448.aClass38_10.method8995(arg3 + local1039, Static274.anInt4757, local2532, local2394, local214 + arg1);
					local355 -= 5;
				}
				if (Static64.anIntArray108[local181] == 2) {
					local1130 -= (local271 >> 1) - 5;
					Static448.aClass38_10.method8991(Static274.anInt4757, local2532, local1039 + arg3, local214 + arg1, local2394);
					local352 -= (local271 >> 1) + 5;
					local2425 += 5;
					local355 -= 5;
				}
				if (Static64.anIntArray108[local181] == 3) {
					local2425 += 7;
					Static448.aClass38_10.method8977(Static274.anInt4757, local2532, local214 + arg1, local2394, arg3 + local1039, -Static64.anIntArray105[local181] + 150);
					local1130 -= local271 >> 1;
					local352 -= local271 >> 1;
					local355 -= 7;
				}
				@Pc(2857) int local2857;
				if (Static64.anIntArray108[local181] == 4) {
					local2857 = (150 - Static64.anIntArray105[local181]) * (Static48.aClass158_1.method3601(local2394) + 100) / 150;
					Static677.aClass137_47.T(local214 + arg1 - 50, arg3, local214 + arg1 + 50, arg2 + arg3);
					Static448.aClass38_10.method8985(local2394, local2532, -16777216, local1039 + arg3, arg1 + local214 - -50 - local2857);
					local1130 += 50 - local2857;
					local352 += 50 - local2857;
					Static677.aClass137_47.KA(arg1, arg3, arg0 + arg1, arg3 - -arg2);
				}
				if (Static64.anIntArray108[local181] == 5) {
					local2857 = 150 - Static64.anIntArray105[local181];
					local1175 = 0;
					if (local2857 < 25) {
						local1175 = local2857 - 25;
					} else if (local2857 > 125) {
						local1175 = local2857 - 125;
					}
					local1177 = Static48.aClass158_1.anInt4347 + Static48.aClass158_1.anInt4354;
					Static677.aClass137_47.T(arg1, arg3 + local1039 - local1177 - 1, arg1 + arg0, arg3 + local1039 + 5);
					local2425 += local1175;
					local1130 -= local271 >> 1;
					Static448.aClass38_10.method8989(local2394, local2532, local1175 + local1039 + arg3, -16777216, arg1 + local214);
					local352 -= local271 >> 1;
					local355 += local1175;
					Static677.aClass137_47.KA(arg1, arg3, arg1 + arg0, arg3 + arg2);
				}
			} else {
				Static448.aClass38_10.method8989(local2394, -256, local1039 + arg3, -16777216, arg1 + local214);
				local1130 -= local271 >> 1;
				local352 -= local271 >> 1;
			}
			Static357.method5407(local352, local355, local2425 + 1, local1130 + 1);
		}
	}
}
