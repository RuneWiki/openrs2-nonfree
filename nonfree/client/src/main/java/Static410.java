import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static410 {

	@OriginalMember(owner = "client!nv", name = "o", descriptor = "I")
	public static int anInt6962;

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(IIIIIII)V")
	public static void method5821(@OriginalArg(2) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		@Pc(7) int local7 = Static187.anInt3432;
		Static454.anInt7760 = 0;
		@Pc(11) int[] local11 = Static668.anIntArray664;
		@Pc(177) int local177;
		@Pc(212) int local212;
		@Pc(259) int local259;
		@Pc(332) int local332;
		@Pc(335) int local335;
		@Pc(1150) int local1150;
		@Pc(1195) int local1195;
		@Pc(1197) int local1197;
		@Pc(438) int local438;
		@Pc(1053) int local1053;
		@Pc(544) int local544;
		for (@Pc(13) int local13 = 0; local13 < local7 + Static308.anInt5687; local13++) {
			@Pc(17) Class5 local17 = null;
			@Pc(30) Class23_Sub2_Sub1_Sub2 local30;
			if (local7 > local13) {
				local30 = Static346.aClass23_Sub2_Sub1_Sub2_Sub1Array1[local11[local13]];
			} else {
				local30 = ((Class3_Sub11) Static500.aClass62_40.method1682((long) Static390.anIntArray424[local13 - local7])).aClass23_Sub2_Sub1_Sub2_Sub2_1;
				local17 = ((Class23_Sub2_Sub1_Sub2_Sub2) local30).aClass5_1;
				if (local17.anIntArray1 != null) {
					local17 = local17.method56(Static592.aClass47_2);
					if (local17 == null) {
						continue;
					}
				}
			}
			if (local30.anInt10170 >= 0 && (Static156.anInt5851 == local30.anInt10126 || local30.aByte142 == Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.aByte142)) {
				Static298.method4628(arg3 >> 1, arg1 >> 1, local30, local30.method8613());
				if (Static109.anIntArray149[0] >= 0) {
					if (local30.aString131 != null && (local7 <= local13 || Static579.anInt9187 == 0 || Static579.anInt9187 == 3 || Static579.anInt9187 == 1 && Static15.method144(((Class23_Sub2_Sub1_Sub2_Sub1) local30).aString34)) && Static245.anInt4574 > Static454.anInt7760) {
						Static245.anIntArray297[Static454.anInt7760] = Static17.aClass202_1.method4632(local30.aString131) / 2;
						Static245.anIntArray296[Static454.anInt7760] = Static109.anIntArray149[0];
						Static245.anIntArray300[Static454.anInt7760] = Static109.anIntArray149[1];
						Static245.anIntArray301[Static454.anInt7760] = local30.anInt10154;
						Static245.anIntArray298[Static454.anInt7760] = local30.anInt10160;
						Static245.anIntArray299[Static454.anInt7760] = local30.anInt10132;
						Static245.aStringArray34[Static454.anInt7760] = local30.aString131;
						Static454.anInt7760++;
					}
					local177 = arg2 + Static109.anIntArray149[1];
					@Pc(244) Class102[] local244;
					@Pc(251) Class150[] local251;
					@Pc(305) Class102 local305;
					if (local30.aBoolean747 || local30.anInt10136 <= Static621.anInt9665) {
						local177 -= Math.max(Static17.aClass202_1.anInt5465, Static655.aClass102Array24[0].method6962());
					} else {
						@Pc(192) byte local192 = 1;
						if (local13 < local7) {
							@Pc(205) Class23_Sub2_Sub1_Sub2_Sub1 local205 = Static346.aClass23_Sub2_Sub1_Sub2_Sub1Array1[local11[local13]];
							local212 = local30.method8630().anInt9380;
							if (local205.aBoolean262) {
								local192 = 2;
							}
						} else {
							local212 = local17.anInt79;
							if (local212 == -1) {
								local212 = local30.method8630().anInt9380;
							}
						}
						@Pc(234) Class102[] local234 = Static655.aClass102Array24;
						if (local212 != -1) {
							local244 = (Class102[]) Static309.aClass279_29.method6631((long) local212);
							if (local244 == null) {
								local251 = Static683.method3282(Static235.aClass143_57, local212);
								if (local251 != null) {
									local244 = new Class102[local251.length];
									for (local259 = 0; local259 < local251.length; local259++) {
										local244[local259] = Static582.aClass16_12.method8132(local251[local259], true);
									}
									Static309.aClass279_29.method6635(local244, (long) local212);
								}
							}
							if (local244 != null && local244.length >= 2) {
								local234 = local244;
							}
						}
						if (local192 >= local234.length) {
							local192 = 1;
						}
						@Pc(301) Class102 local301 = local234[0];
						local305 = local234[local192];
						local177 -= Math.max(Static17.aClass202_1.anInt5465, local301.method6962());
						local259 = Static109.anIntArray149[0] + arg0 - (local301.method6957() >> 1);
						local332 = local301.method6957() * local30.anInt10187 / 255;
						local335 = local301.method6962();
						if (local30.anInt10187 > 0 && local332 < 2) {
							local332 = 2;
						}
						local301.method6961(local259, local177);
						Static582.aClass16_12.T(local259, local177, local259 + local332, local335 + local177);
						local305.method6961(local259, local177);
						Static582.aClass16_12.KA(arg0, arg2, arg1 + arg0, arg2 - -arg3);
						Static120.method2177(local259, local301.method6951() + local259, local177, local177 + local335);
					}
					local177 -= 2;
					if (!local30.aBoolean747) {
						@Pc(419) Class102 local419;
						@Pc(428) Class102 local428;
						if (local30.anInt10173 > Static621.anInt9665) {
							local419 = Static544.aClass102Array21[local30.aBoolean746 ? 2 : 0];
							local428 = Static544.aClass102Array21[local30.aBoolean746 ? 3 : 1];
							if (local30 instanceof Class23_Sub2_Sub1_Sub2_Sub2) {
								local438 = local17.anInt82;
								if (local438 == -1) {
									local438 = local30.method8630().anInt9381;
								}
							} else {
								local438 = local30.method8630().anInt9381;
							}
							if (local438 != -1) {
								local244 = (Class102[]) Static207.aClass279_20.method6631((long) local438);
								if (local244 == null) {
									local251 = Static683.method3282(Static235.aClass143_57, local438);
									if (local251 != null) {
										local244 = new Class102[local251.length];
										for (local259 = 0; local259 < local251.length; local259++) {
											local244[local259] = Static582.aClass16_12.method8132(local251[local259], true);
										}
										Static207.aClass279_20.method6635(local244, (long) local438);
									}
								}
								if (local244 != null && local244.length == 4) {
									local419 = local244[local30.aBoolean746 ? 2 : 0];
									local428 = local244[local30.aBoolean746 ? 3 : 1];
								}
							}
							@Pc(533) int local533 = local30.anInt10173 - Static621.anInt9665;
							if (local30.anInt10157 >= local533) {
								local544 = local419.method6957();
							} else {
								local533 -= local30.anInt10157;
								local259 = local30.anInt10144 == 0 ? 0 : (local30.anInt10142 - local533) / local30.anInt10144 * local30.anInt10144;
								local544 = local419.method6957() * local259 / local30.anInt10142;
							}
							local259 = local419.method6962();
							local177 -= local259;
							local332 = Static109.anIntArray149[0] + arg0 - (local419.method6957() >> 1);
							local419.method6961(local332, local177);
							Static582.aClass16_12.T(local332, local177, local544 + local332, local177 + local259);
							local428.method6961(local332, local177);
							Static582.aClass16_12.KA(arg0, arg2, arg1 + arg0, arg2 + arg3);
							Static120.method2177(local332, local419.method6951() + local332, local177, local177 + local259);
							local177 -= 2;
						}
						if (local7 > local13) {
							@Pc(645) Class23_Sub2_Sub1_Sub2_Sub1 local645 = (Class23_Sub2_Sub1_Sub2_Sub1) local30;
							if (local645.anInt3279 != -1) {
								local177 -= 25;
								local428 = Static194.aClass102Array16[local645.anInt3279];
								local428.method6961(arg0 + Static109.anIntArray149[0] - 12, local177);
								Static120.method2177(Static109.anIntArray149[0] + arg0 - 12, arg0 - -Static109.anIntArray149[0] - (12 - local428.method6951()), local177, local177 + local428.method6958());
								local177 -= 2;
							}
							if (local645.anInt3277 != -1) {
								local177 -= 25;
								local428 = Static373.aClass102Array19[local645.anInt3277];
								local428.method6961(arg0 + Static109.anIntArray149[0] - 12, local177);
								Static120.method2177(Static109.anIntArray149[0] + arg0 - 12, arg0 - -Static109.anIntArray149[0] - 12 - -local428.method6951(), local177, local428.method6958() + local177);
								local177 -= 2;
							}
						} else if (local17.anInt76 >= 0 && Static373.aClass102Array19.length > local17.anInt76) {
							local419 = Static373.aClass102Array19[local17.anInt76];
							local177 -= 25;
							local419.method6961(Static109.anIntArray149[0] + arg0 - (local419.method6957() >> 1), local177);
							Static120.method2177(arg0 + Static109.anIntArray149[0] - (local419.method6957() >> 1), Static109.anIntArray149[0] + arg0 + -(local419.method6957() >> 1) - -local419.method6951(), local177, local419.method6958() + local177);
							local177 -= 2;
						}
					}
					@Pc(820) Class70[] local820;
					@Pc(828) Class70 local828;
					if (!(local30 instanceof Class23_Sub2_Sub1_Sub2_Sub1)) {
						local212 = 0;
						local820 = Static110.aClass70Array1;
						for (local438 = 0; local438 < local820.length; local438++) {
							local828 = local820[local438];
							if (local828 != null && local828.anInt2023 == 1 && local828.anInt2021 == Static390.anIntArray424[local13 - local7]) {
								local305 = Static491.aClass102Array23[local828.anInt2024];
								if (local305.method6962() > local212) {
									local212 = local305.method6962();
								}
								if (Static621.anInt9665 % 20 < 10) {
									local305.method6961(arg0 + Static109.anIntArray149[0] - 12, -local305.method6962() + local177);
									Static120.method2177(arg0 + Static109.anIntArray149[0] - 12, Static109.anIntArray149[0] + (arg0 - (-local305.method6951() + 12)), local177 - local305.method6962(), -local305.method6962() + local177 + local305.method6958());
								}
							}
						}
						if (local212 > 0) {
						}
					} else if (local13 >= 0) {
						local212 = 0;
						local820 = Static110.aClass70Array1;
						for (local438 = 0; local438 < local820.length; local438++) {
							local828 = local820[local438];
							if (local828 != null && local828.anInt2023 == 10 && local828.anInt2021 == local11[local13]) {
								local305 = Static491.aClass102Array23[local828.anInt2024];
								if (local212 < local305.method6962()) {
									local212 = local305.method6962();
								}
								local305.method6961(arg0 + Static109.anIntArray149[0] - 12, -local305.method6962() + local177);
								Static120.method2177(Static109.anIntArray149[0] + arg0 - 12, Static109.anIntArray149[0] + -12 + arg0 + local305.method6951(), local177 - local305.method6962(), local177 + -local305.method6962() + local305.method6958());
							}
						}
						if (local212 > 0) {
						}
					}
					for (local212 = 0; local212 < Static508.anInt8494; local212++) {
						local1053 = local30.anIntArray653[local212];
						local438 = local30.anIntArray654[local212];
						@Pc(1060) Class158 local1060 = null;
						local544 = 0;
						if (local438 >= 0) {
							if (local1053 <= Static621.anInt9665) {
								continue;
							}
							local1060 = Static29.aClass51_1.method1547(local30.anIntArray654[local212]);
							local544 = local1060.anInt4096;
						} else if (local1053 < 0) {
							continue;
						}
						local259 = local30.anIntArray657[local212];
						@Pc(1099) Class158 local1099 = null;
						if (local259 >= 0) {
							local1099 = Static29.aClass51_1.method1547(local259);
						}
						if (local1053 - local544 <= Static621.anInt9665) {
							local335 = local30.anIntArray655[local212];
							if (local335 >= 0) {
								local30.anInt10136 = Static621.anInt9665 + 300;
								local30.anInt10187 = local335;
								local30.anIntArray655[local212] = -1;
							}
							if (local1060 == null) {
								local30.anIntArray653[local212] = -1;
							} else {
								local1150 = local30.method8613() / 2;
								Static298.method4628(arg3 >> 1, arg1 >> 1, local30, local1150);
								if (Static109.anIntArray149[0] > -1) {
									Static109.anIntArray149[0] += Static292.anIntArray356[local212];
									Static109.anIntArray149[1] += Static656.anIntArray58[local212];
									local1195 = 0;
									local1197 = 0;
									@Pc(1199) int local1199 = 0;
									@Pc(1201) int local1201 = 0;
									@Pc(1203) int local1203 = 0;
									@Pc(1205) int local1205 = 0;
									@Pc(1207) int local1207 = 0;
									@Pc(1209) int local1209 = 0;
									@Pc(1211) Class102 local1211 = null;
									@Pc(1213) Class102 local1213 = null;
									@Pc(1215) Class102 local1215 = null;
									@Pc(1217) Class102 local1217 = null;
									@Pc(1219) int local1219 = 0;
									@Pc(1221) int local1221 = 0;
									@Pc(1223) int local1223 = 0;
									@Pc(1225) int local1225 = 0;
									@Pc(1227) int local1227 = 0;
									@Pc(1229) int local1229 = 0;
									@Pc(1231) int local1231 = 0;
									@Pc(1233) int local1233 = 0;
									@Pc(1238) Class102 local1238 = local1060.method3478(Static582.aClass16_12);
									@Pc(1240) int local1240 = 0;
									@Pc(1248) int local1248;
									if (local1238 != null) {
										local1195 = local1238.method6957();
										local1248 = local1238.method6962();
										if (local1248 > 0) {
											local1240 = local1248;
										}
										local1238.method6953(Static35.anIntArray40);
										local1203 = Static35.anIntArray40[0];
									}
									@Pc(1269) Class102 local1269 = local1060.method3480(Static582.aClass16_12);
									if (local1269 != null) {
										local1197 = local1269.method6957();
										local1248 = local1269.method6962();
										local1269.method6953(Static35.anIntArray40);
										if (local1248 > local1240) {
											local1240 = local1248;
										}
										local1205 = Static35.anIntArray40[0];
									}
									@Pc(1294) Class102 local1294 = local1060.method3485(Static582.aClass16_12);
									if (local1294 != null) {
										local1199 = local1294.method6957();
										local1248 = local1294.method6962();
										if (local1240 < local1248) {
											local1240 = local1248;
										}
										local1294.method6953(Static35.anIntArray40);
										local1207 = Static35.anIntArray40[0];
									}
									@Pc(1319) Class102 local1319 = local1060.method3481(Static582.aClass16_12);
									if (local1319 != null) {
										local1201 = local1319.method6957();
										local1248 = local1319.method6962();
										if (local1248 > local1240) {
											local1240 = local1248;
										}
										local1319.method6953(Static35.anIntArray40);
										local1209 = Static35.anIntArray40[0];
									}
									if (local1099 != null) {
										local1211 = local1099.method3478(Static582.aClass16_12);
										if (local1211 != null) {
											local1219 = local1211.method6957();
											local1248 = local1211.method6962();
											if (local1248 > local1240) {
												local1240 = local1248;
											}
											local1211.method6953(Static35.anIntArray40);
											local1227 = Static35.anIntArray40[0];
										}
										local1213 = local1099.method3480(Static582.aClass16_12);
										if (local1213 != null) {
											local1221 = local1213.method6957();
											local1248 = local1213.method6962();
											local1213.method6953(Static35.anIntArray40);
											if (local1240 < local1248) {
												local1240 = local1248;
											}
											local1229 = Static35.anIntArray40[0];
										}
										local1215 = local1099.method3485(Static582.aClass16_12);
										if (local1215 != null) {
											local1223 = local1215.method6957();
											local1248 = local1215.method6962();
											if (local1248 > local1240) {
												local1240 = local1248;
											}
											local1215.method6953(Static35.anIntArray40);
											local1231 = Static35.anIntArray40[0];
										}
										local1217 = local1099.method3481(Static582.aClass16_12);
										if (local1217 != null) {
											local1225 = local1217.method6957();
											local1248 = local1217.method6962();
											if (local1240 < local1248) {
												local1240 = local1248;
											}
											local1217.method6953(Static35.anIntArray40);
											local1233 = Static35.anIntArray40[0];
										}
									}
									@Pc(1455) Class69 local1455 = Static157.aClass69_2;
									@Pc(1457) Class69 local1457 = Static157.aClass69_2;
									@Pc(1459) Class202 local1459 = Static621.aClass202_13;
									local1248 = local1060.anInt4090;
									@Pc(1464) Class202 local1464 = Static621.aClass202_13;
									@Pc(1472) Class69 local1472;
									@Pc(1477) Class202 local1477;
									if (local1248 >= 0) {
										local1472 = Static367.method5448(local1248, Static582.aClass16_12, true);
										local1477 = Static582.method7835(Static582.aClass16_12, local1248);
										if (local1472 != null && local1477 != null) {
											local1459 = local1477;
											local1455 = local1472;
										}
									}
									if (local1099 != null) {
										local1248 = local1099.anInt4090;
										if (local1248 >= 0) {
											local1472 = Static367.method5448(local1248, Static582.aClass16_12, true);
											local1477 = Static582.method7835(Static582.aClass16_12, local1248);
											if (local1472 != null && local1477 != null) {
												local1457 = local1472;
												local1464 = local1477;
											}
										}
									}
									@Pc(1520) String local1520 = null;
									@Pc(1524) int local1524 = 0;
									@Pc(1532) String local1532 = local1060.method3483(local30.anIntArray658[local212]);
									@Pc(1537) int local1537 = local1459.method4632(local1532);
									if (local1099 != null) {
										local1520 = local1099.method3483(local30.anIntArray650[local212]);
										local1524 = local1464.method4632(local1520);
									}
									@Pc(1554) int local1554 = 0;
									if (local1197 > 0) {
										local1554 = local1537 / local1197 + 1;
									}
									@Pc(1567) int local1567 = 0;
									if (local1099 != null && local1221 > 0) {
										local1567 = local1524 / local1221 + 1;
									}
									@Pc(1579) int local1579 = 0;
									if (local1195 > 0) {
										local1579 = local1195;
									}
									local1579 += 2;
									@Pc(1593) int local1593 = local1579;
									if (local1199 > 0) {
										local1579 += local1199;
									}
									@Pc(1601) int local1601 = local1579;
									@Pc(1603) int local1603 = local1579;
									@Pc(1615) int local1615;
									if (local1197 <= 0) {
										local1579 += local1537;
									} else {
										local1615 = local1197 * local1554;
										local1579 += local1615;
										local1603 += (local1615 - local1537) / 2;
									}
									local1615 = local1579;
									if (local1201 > 0) {
										local1579 += local1201;
									}
									@Pc(1638) int local1638 = 0;
									@Pc(1640) int local1640 = 0;
									@Pc(1642) int local1642 = 0;
									@Pc(1644) int local1644 = 0;
									@Pc(1646) int local1646 = 0;
									@Pc(1679) int local1679;
									if (local1099 != null) {
										local1579 += 2;
										local1638 = local1579;
										if (local1219 > 0) {
											local1579 += local1219;
										}
										local1579 += 2;
										local1640 = local1579;
										if (local1223 > 0) {
											local1579 += local1223;
										}
										local1642 = local1579;
										local1646 = local1579;
										if (local1221 > 0) {
											local1679 = local1221 * local1567;
											local1579 += local1679;
											local1646 += (local1679 - local1524) / 2;
										} else {
											local1579 += local1524;
										}
										local1644 = local1579;
										if (local1225 > 0) {
											local1579 += local1225;
										}
									}
									local1679 = local30.anIntArray653[local212] - Static621.anInt9665;
									@Pc(1725) int local1725 = local1060.anInt4097 - local1679 * local1060.anInt4097 / local1060.anInt4096;
									@Pc(1737) int local1737 = local1060.anInt4077 * local1679 / local1060.anInt4096 - local1060.anInt4077;
									@Pc(1751) int local1751 = arg0 + Static109.anIntArray149[0] + local1725 - (local1579 >> 1);
									@Pc(1762) int local1762 = local1737 + arg2 + Static109.anIntArray149[1] - 12;
									@Pc(1764) int local1764 = local1762;
									@Pc(1769) int local1769 = local1762 + local1240;
									@Pc(1776) int local1776 = local1762 + local1060.anInt4078 + 15;
									@Pc(1782) int local1782 = local1776 - local1459.anInt5465;
									if (local1762 > local1782) {
										local1764 = local1782;
									}
									@Pc(1792) int local1792 = local1459.anInt5456 + local1776;
									if (local1769 < local1792) {
										local1769 = local1792;
									}
									@Pc(1803) int local1803 = 0;
									@Pc(1818) int local1818;
									@Pc(1824) int local1824;
									if (local1099 != null) {
										local1803 = local1762 + local1099.anInt4078 + 15;
										local1818 = local1803 - local1464.anInt5465;
										local1824 = local1803 + local1464.anInt5456;
										if (local1764 > local1818) {
											local1764 = local1818;
										}
										if (local1824 > local1769) {
											local1769 = local1824;
										}
									}
									local1818 = 255;
									if (local1060.anInt4081 >= 0) {
										local1818 = (local1679 << 8) / (local1060.anInt4096 - local1060.anInt4081);
									}
									if (local1818 >= 0 && local1818 < 255) {
										local1824 = local1818 << 24;
										@Pc(2015) int local2015 = local1824 | 0xFFFFFF;
										if (local1238 != null) {
											local1238.method6955(local1751 - local1203, local1762, 0, local2015, 1);
										}
										if (local1294 != null) {
											local1294.method6955(local1593 + local1751 - local1207, local1762, 0, local2015, 1);
										}
										@Pc(2047) int local2047;
										if (local1269 != null) {
											for (local2047 = 0; local2047 < local1554; local2047++) {
												local1269.method6955(local1601 + local1751 + local1197 * local2047 - local1205, local1762, 0, local2015, 1);
											}
										}
										if (local1319 != null) {
											local1319.method6955(local1615 + local1751 - local1209, local1762, 0, local2015, 1);
										}
										local1455.method7451(local1776, local1824 | local1060.anInt4084, 0, local1532, local1603 + local1751);
										if (local1099 != null) {
											if (local1211 != null) {
												local1211.method6955(local1638 + local1751 - local1227, local1762, 0, local2015, 1);
											}
											if (local1215 != null) {
												local1215.method6955(local1751 + local1640 - local1231, local1762, 0, local2015, 1);
											}
											if (local1213 != null) {
												for (local2047 = 0; local2047 < local1567; local2047++) {
													local1213.method6955(local1221 * local2047 + local1751 + local1642 - local1229, local1762, 0, local2015, 1);
												}
											}
											if (local1217 != null) {
												local1217.method6955(local1751 + local1644 - local1233, local1762, 0, local2015, 1);
											}
											local1457.method7451(local1803, local1824 | local1099.anInt4084, 0, local1520, local1646 + local1751);
										}
									} else {
										if (local1238 != null) {
											local1238.method6961(local1751 - local1203, local1762);
										}
										if (local1294 != null) {
											local1294.method6961(local1593 + local1751 - local1207, local1762);
										}
										if (local1269 != null) {
											for (local1824 = 0; local1824 < local1554; local1824++) {
												local1269.method6961(local1751 + local1601 + local1197 * local1824 - local1205, local1762);
											}
										}
										if (local1319 != null) {
											local1319.method6961(local1615 + local1751 - local1209, local1762);
										}
										local1455.method7451(local1776, local1060.anInt4084 | 0xFF000000, 0, local1532, local1603 + local1751);
										if (local1099 != null) {
											if (local1211 != null) {
												local1211.method6961(local1751 + local1638 - local1227, local1762);
											}
											if (local1215 != null) {
												local1215.method6961(local1640 + local1751 - local1231, local1762);
											}
											if (local1213 != null) {
												for (local1824 = 0; local1824 < local1567; local1824++) {
													local1213.method6961(local1642 + local1751 + local1221 * local1824 - local1229, local1762);
												}
											}
											if (local1217 != null) {
												local1217.method6961(local1751 + local1644 - local1233, local1762);
											}
											local1457.method7451(local1803, local1099.anInt4084 | 0xFF000000, 0, local1520, local1646 + local1751);
										}
									}
									Static120.method2177(local1751, local1579 + local1751, local1764, local1769 + 1);
								}
							}
						}
					}
				}
			}
		}
		@Pc(2221) int local2221;
		for (@Pc(2215) int local2215 = 0; local2215 < Static324.anInt6012; local2215++) {
			local2221 = Static80.anIntArray666[local2215];
			@Pc(2230) Class23_Sub2_Sub1_Sub2 local2230;
			if (local2221 < 2048) {
				local2230 = Static346.aClass23_Sub2_Sub1_Sub2_Sub1Array1[local2221];
			} else {
				local2230 = ((Class3_Sub11) Static500.aClass62_40.method1682((long) (local2221 - 2048))).aClass23_Sub2_Sub1_Sub2_Sub2_1;
			}
			local212 = Static173.anIntArray225[local2215];
			@Pc(2261) Class23_Sub2_Sub1_Sub2 local2261;
			if (local212 >= 2048) {
				local2261 = ((Class3_Sub11) Static500.aClass62_40.method1682((long) (local212 - 2048))).aClass23_Sub2_Sub1_Sub2_Sub2_1;
			} else {
				local2261 = Static346.aClass23_Sub2_Sub1_Sub2_Sub1Array1[local212];
			}
			Static355.method5365(arg3, arg2, local2230, arg0, arg1, local2261, --local2230.anInt10123);
		}
		local2221 = Static17.aClass202_1.anInt5456 + Static17.aClass202_1.anInt5465 + 2;
		for (local177 = 0; local177 < Static454.anInt7760; local177++) {
			local212 = Static245.anIntArray296[local177];
			local1053 = Static245.anIntArray300[local177];
			local438 = Static245.anIntArray297[local177];
			@Pc(2314) boolean local2314 = true;
			while (local2314) {
				local2314 = false;
				for (local544 = 0; local544 < local177; local544++) {
					if (Static245.anIntArray300[local544] - local2221 < local1053 + 2 && local1053 - local2221 < Static245.anIntArray300[local544] - -2 && Static245.anIntArray296[local544] + Static245.anIntArray297[local544] > -local438 + local212 && Static245.anIntArray296[local544] - Static245.anIntArray297[local544] < local212 + local438 && Static245.anIntArray300[local544] - local2221 < local1053) {
						local1053 = Static245.anIntArray300[local544] - local2221;
						local2314 = true;
					}
				}
			}
			Static245.anIntArray300[local177] = local1053;
			@Pc(2404) String local2404 = Static245.aStringArray34[local177];
			local259 = Static17.aClass202_1.method4632(local2404);
			local332 = arg0 + local212;
			local335 = arg2 + local1053 - Static17.aClass202_1.anInt5465;
			local1150 = local259 + local332;
			@Pc(2433) int local2433 = arg2 + local1053 + Static17.aClass202_1.anInt5456;
			if (Static585.anInt9271 == 0) {
				@Pc(2437) int local2437 = 16776960;
				if (Static245.anIntArray301[local177] < 6) {
					local2437 = Static599.anIntArray242[Static245.anIntArray301[local177]];
				}
				if (Static245.anIntArray301[local177] == 6) {
					local2437 = Static156.anInt5851 % 20 < 10 ? 16711680 : 16776960;
				}
				if (Static245.anIntArray301[local177] == 7) {
					local2437 = Static156.anInt5851 % 20 < 10 ? 255 : 65535;
				}
				if (Static245.anIntArray301[local177] == 8) {
					local2437 = Static156.anInt5851 % 20 < 10 ? 45056 : 8454016;
				}
				@Pc(2506) int local2506;
				if (Static245.anIntArray301[local177] == 9) {
					local2506 = 150 - Static245.anIntArray299[local177];
					if (local2506 < 50) {
						local2437 = local2506 * 1280 + 16711680;
					} else if (local2506 < 100) {
						local2437 = 16384000 + 16776960 - local2506 * 327680;
					} else if (local2506 < 150) {
						local2437 = local2506 * 5 + 65280 - 500;
					}
				}
				if (Static245.anIntArray301[local177] == 10) {
					local2506 = 150 - Static245.anIntArray299[local177];
					if (local2506 < 50) {
						local2437 = local2506 * 5 + 16711680;
					} else if (local2506 < 100) {
						local2437 = 16711935 + 16384000 - local2506 * 327680;
					} else if (local2506 < 150) {
						local2437 = (local2506 - 100) * 327680 + 500 + 255 - local2506 * 5;
					}
				}
				if (Static245.anIntArray301[local177] == 11) {
					local2506 = 150 - Static245.anIntArray299[local177];
					if (local2506 < 50) {
						local2437 = 16777215 - local2506 * 327685;
					} else if (local2506 < 100) {
						local2437 = local2506 * 327685 + 65280 - 16384250;
					} else if (local2506 < 150) {
						local2437 = 16777215 - (local2506 - 100) * 327680;
					}
				}
				local2506 = local2437 | 0xFF000000;
				if (Static245.anIntArray298[local177] == 0) {
					Static243.aClass69_5.method7467(arg0 + local212, -16777216, local2404, local2506, arg2 + local1053);
					local1150 -= local259 >> 1;
					local332 -= local259 >> 1;
				}
				if (Static245.anIntArray298[local177] == 1) {
					local1150 -= local259 >> 1;
					local335 -= 5;
					local332 -= local259 >> 1;
					Static243.aClass69_5.method7466(arg2 + local1053, Static156.anInt5851, local2506, local2404, arg0 + local212);
					local2433 += 5;
				}
				if (Static245.anIntArray298[local177] == 2) {
					Static243.aClass69_5.method7461(arg2 + local1053, Static156.anInt5851, local2506, local2404, arg0 + local212);
					local2433 += 5;
					local335 -= 5;
					local1150 -= (local259 >> 1) - 5;
					local332 -= (local259 >> 1) + 5;
				}
				if (Static245.anIntArray298[local177] == 3) {
					local332 -= local259 >> 1;
					Static243.aClass69_5.method7465(Static156.anInt5851, local2506, local212 + arg0, local2404, local1053 + arg2, -Static245.anIntArray299[local177] + 150);
					local1150 -= local259 >> 1;
					local335 -= 7;
					local2433 += 7;
				}
				@Pc(2815) int local2815;
				if (Static245.anIntArray298[local177] == 4) {
					local2815 = (150 - Static245.anIntArray299[local177]) * (Static17.aClass202_1.method4632(local2404) + 100) / 150;
					Static582.aClass16_12.T(local212 + arg0 - 50, arg2, local212 + arg0 + 50, arg3 + arg2);
					Static243.aClass69_5.method7451(local1053 + arg2, local2506, -16777216, local2404, arg0 + local212 + 50 - local2815);
					local332 += 50 - local2815;
					local1150 += 50 - local2815;
					Static582.aClass16_12.KA(arg0, arg2, arg0 + arg1, arg2 + arg3);
				}
				if (Static245.anIntArray298[local177] == 5) {
					local2815 = 150 - Static245.anIntArray299[local177];
					local1195 = 0;
					if (local2815 < 25) {
						local1195 = local2815 - 25;
					} else if (local2815 > 125) {
						local1195 = local2815 - 125;
					}
					local1197 = Static17.aClass202_1.anInt5456 + Static17.aClass202_1.anInt5465;
					Static582.aClass16_12.T(arg0, local1053 + arg2 - local1197 - 1, arg0 - -arg1, local1053 + arg2 + 5);
					Static243.aClass69_5.method7467(arg0 + local212, -16777216, local2404, local2506, local1195 + local1053 + arg2);
					local1150 -= local259 >> 1;
					local332 -= local259 >> 1;
					local2433 += local1195;
					local335 += local1195;
					Static582.aClass16_12.KA(arg0, arg2, arg0 + arg1, arg3 + arg2);
				}
			} else {
				Static243.aClass69_5.method7467(local212 + arg0, -16777216, local2404, -256, local1053 + arg2);
				local1150 -= local259 >> 1;
				local332 -= local259 >> 1;
			}
			Static120.method2177(local332, local1150 + 1, local335, local2433 + 1);
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lclient!ha;Lclient!ia;IB)V")
	public static void method5822(@OriginalArg(0) Class16 arg0, @OriginalArg(1) Class167 arg1, @OriginalArg(2) int arg2) {
		@Pc(17) int local17;
		if (Static641.anIntArray640 != null && arg2 <= arg1.aByte65) {
			for (local17 = 0; local17 < Static641.anIntArray640.length; local17++) {
				if (Static641.anIntArray640[local17] != -1000000 && (arg1.anIntArray292[0] <= Static641.anIntArray640[local17] || Static641.anIntArray640[local17] >= arg1.anIntArray292[1] || Static641.anIntArray640[local17] >= arg1.anIntArray292[2] || Static641.anIntArray640[local17] >= arg1.anIntArray292[3]) && (Static158.anIntArray194[local17] >= arg1.anIntArray291[0] || arg1.anIntArray291[1] <= Static158.anIntArray194[local17] || arg1.anIntArray291[2] <= Static158.anIntArray194[local17] || arg1.anIntArray291[3] <= Static158.anIntArray194[local17]) && (Static400.anIntArray427[local17] <= arg1.anIntArray291[0] || Static400.anIntArray427[local17] <= arg1.anIntArray291[1] || Static400.anIntArray427[local17] <= arg1.anIntArray291[2] || arg1.anIntArray291[3] >= Static400.anIntArray427[local17]) && (arg1.anIntArray293[0] <= Static122.anIntArray155[local17] || Static122.anIntArray155[local17] >= arg1.anIntArray293[1] || arg1.anIntArray293[2] <= Static122.anIntArray155[local17] || arg1.anIntArray293[3] <= Static122.anIntArray155[local17]) && (arg1.anIntArray293[0] >= Static269.anIntArray333[local17] || arg1.anIntArray293[1] >= Static269.anIntArray333[local17] || Static269.anIntArray333[local17] <= arg1.anIntArray293[2] || Static269.anIntArray333[local17] <= arg1.anIntArray293[3])) {
					return;
				}
			}
		}
		@Pc(262) int local262;
		@Pc(283) int local283;
		@Pc(302) boolean local302;
		@Pc(334) float local334;
		if (arg1.aByte64 == 1) {
			local17 = arg1.aShort63 + Static641.anInt9890 - Static177.anInt3330;
			if (local17 >= 0 && local17 <= Static641.anInt9890 + Static641.anInt9890) {
				local262 = Static641.anInt9890 + arg1.aShort61 - Static227.anInt4358;
				if (local262 < 0) {
					local262 = 0;
				} else if (local262 > Static641.anInt9890 + Static641.anInt9890) {
					return;
				}
				local283 = Static641.anInt9890 + arg1.aShort62 - Static227.anInt4358;
				if (local283 > Static641.anInt9890 + Static641.anInt9890) {
					local283 = Static641.anInt9890 + Static641.anInt9890;
				} else if (local283 < 0) {
					return;
				}
				local302 = false;
				while (local283 >= local262) {
					if (Static569.aBooleanArrayArray6[local17][local262++]) {
						local302 = true;
						break;
					}
				}
				if (local302) {
					local334 = (float) (Static356.anInt6401 - arg1.anIntArray291[0]);
					if (local334 < 0.0F) {
						local334 *= -1.0F;
					}
					if (!(float) Static76.anInt1725 > local334 && (Static288.method4523(0, arg1) && (Static288.method4523(1, arg1) && (Static288.method4523(2, arg1) && Static288.method4523(3, arg1))))) {
						Static142.aClass167Array12[Static447.anInt7715++] = arg1;
					}
				}
			}
		} else if (arg1.aByte64 == 2) {
			local17 = arg1.aShort61 + Static641.anInt9890 - Static227.anInt4358;
			if (local17 >= 0 && Static641.anInt9890 + Static641.anInt9890 >= local17) {
				local262 = Static641.anInt9890 + arg1.aShort63 - Static177.anInt3330;
				if (local262 < 0) {
					local262 = 0;
				} else if (Static641.anInt9890 + Static641.anInt9890 < local262) {
					return;
				}
				local283 = arg1.aShort64 + Static641.anInt9890 - Static177.anInt3330;
				if (Static641.anInt9890 + Static641.anInt9890 < local283) {
					local283 = Static641.anInt9890 + Static641.anInt9890;
				} else if (local283 < 0) {
					return;
				}
				local302 = false;
				while (local262 <= local283) {
					if (Static569.aBooleanArrayArray6[local262++][local17]) {
						local302 = true;
						break;
					}
				}
				if (local302) {
					local334 = (float) (Static6.anInt89 - arg1.anIntArray293[0]);
					if (local334 < 0.0F) {
						local334 *= -1.0F;
					}
					if (!(local334 < (float) Static76.anInt1725) && (Static288.method4523(0, arg1) && (Static288.method4523(1, arg1) && (Static288.method4523(2, arg1) && Static288.method4523(3, arg1))))) {
						Static142.aClass167Array12[Static447.anInt7715++] = arg1;
					}
				}
			}
		} else if (arg1.aByte64 == 16 || arg1.aByte64 == 8) {
			local17 = arg1.aShort63 + Static641.anInt9890 - Static177.anInt3330;
			if (local17 >= 0 && Static641.anInt9890 + Static641.anInt9890 >= local17) {
				local262 = arg1.aShort61 + Static641.anInt9890 - Static227.anInt4358;
				if (local262 >= 0 && Static641.anInt9890 + Static641.anInt9890 >= local262 && Static569.aBooleanArrayArray6[local17][local262]) {
					@Pc(601) float local601 = (float) (Static356.anInt6401 - arg1.anIntArray291[0]);
					if (local601 < 0.0F) {
						local601 *= -1.0F;
					}
					@Pc(618) float local618 = (float) (Static6.anInt89 - arg1.anIntArray293[0]);
					if (local618 < 0.0F) {
						local618 *= -1.0F;
					}
					if ((!(local601 < (float) Static76.anInt1725) || !((float) Static76.anInt1725 > local618)) && (Static288.method4523(0, arg1) && (Static288.method4523(1, arg1) && (Static288.method4523(2, arg1) && Static288.method4523(3, arg1))))) {
						Static142.aClass167Array12[Static447.anInt7715++] = arg1;
					}
				}
			}
		} else if (arg1.aByte64 == 4) {
			@Pc(683) float local683 = (float) (arg1.anIntArray292[0] - Static245.anInt4579);
			if (!((float) Static322.anInt6002 >= local683)) {
				local262 = Static641.anInt9890 + arg1.aShort61 - Static227.anInt4358;
				if (local262 < 0) {
					local262 = 0;
				} else if (Static641.anInt9890 + Static641.anInt9890 < local262) {
					return;
				}
				local283 = arg1.aShort62 + Static641.anInt9890 - Static227.anInt4358;
				if (Static641.anInt9890 + Static641.anInt9890 < local283) {
					local283 = Static641.anInt9890 + Static641.anInt9890;
				} else if (local283 < 0) {
					return;
				}
				@Pc(740) int local740 = arg1.aShort63 + Static641.anInt9890 - Static177.anInt3330;
				if (local740 < 0) {
					local740 = 0;
				} else if (Static641.anInt9890 + Static641.anInt9890 < local740) {
					return;
				}
				@Pc(764) int local764 = arg1.aShort64 + Static641.anInt9890 - Static177.anInt3330;
				if (local764 > Static641.anInt9890 + Static641.anInt9890) {
					local764 = Static641.anInt9890 + Static641.anInt9890;
				} else if (local764 < 0) {
					return;
				}
				@Pc(779) boolean local779 = false;
				label283: for (@Pc(781) int local781 = local740; local781 <= local764; local781++) {
					for (@Pc(785) int local785 = local262; local785 <= local283; local785++) {
						if (Static569.aBooleanArrayArray6[local781][local785]) {
							local779 = true;
							break label283;
						}
					}
				}
				if (local779 && (Static288.method4523(0, arg1) && (Static288.method4523(1, arg1) && (Static288.method4523(2, arg1) && Static288.method4523(3, arg1))))) {
					Static142.aClass167Array12[Static447.anInt7715++] = arg1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Ljava/lang/String;Z)Z")
	public static boolean method5823(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static173.anInt3293; local11++) {
			if (arg0.equalsIgnoreCase(Static614.aStringArray68[local11])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static93.aStringArray17[local11])) {
				return true;
			}
		}
		return false;
	}
}
