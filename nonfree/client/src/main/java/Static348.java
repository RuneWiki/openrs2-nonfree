import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static348 {

	@OriginalMember(owner = "client!mm", name = "s", descriptor = "Z")
	public static boolean aBoolean425;

	@OriginalMember(owner = "client!mm", name = "u", descriptor = "Lclient!la;")
	public static Class207 aClass207_69;

	@OriginalMember(owner = "client!mm", name = "m", descriptor = "Lclient!tm;")
	public static final Class337 aClass337_111 = new Class337(11, -2);

	@OriginalMember(owner = "client!mm", name = "q", descriptor = "Lclient!ib;")
	public static final Class155 aClass155_2 = new Class155(false);

	@OriginalMember(owner = "client!mm", name = "r", descriptor = "Lclient!ib;")
	public static Class155 aClass155_3 = aClass155_2;

	@OriginalMember(owner = "client!mm", name = "t", descriptor = "[[I")
	public static final int[][] anIntArrayArray44 = new int[128][128];

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIIIIIZ)V")
	public static void method5208(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		@Pc(16) int local16 = Static320.anInt5442;
		Static294.anInt5132 = 0;
		@Pc(20) int[] local20 = Static278.anIntArray264;
		@Pc(188) int local188;
		@Pc(229) int local229;
		@Pc(275) int local275;
		@Pc(346) int local346;
		@Pc(349) int local349;
		@Pc(1142) int local1142;
		@Pc(1188) int local1188;
		@Pc(1190) int local1190;
		@Pc(437) int local437;
		@Pc(1045) int local1045;
		@Pc(545) int local545;
		for (@Pc(22) int local22 = 0; local22 < Static280.anInt4989 + local16; local22++) {
			@Pc(26) Class225 local26 = null;
			@Pc(39) Class4_Sub2_Sub1_Sub1 local39;
			if (local22 < local16) {
				local39 = Static393.aClass4_Sub2_Sub1_Sub1_Sub1Array12[local20[local22]];
			} else {
				local39 = ((Class5_Sub3) Static445.aClass273_29.method6581((long) Static209.anIntArray198[local22 - local16])).aClass4_Sub2_Sub1_Sub1_Sub2_1;
				local26 = ((Class4_Sub2_Sub1_Sub1_Sub2) local39).aClass225_1;
				if (local26.anIntArray304 != null) {
					local26 = local26.method4990(Static301.aClass59_1);
					if (local26 == null) {
						continue;
					}
				}
			}
			if (local39.anInt1261 >= 0 && (Static96.anInt1932 == local39.anInt1227 || Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.aByte132 == local39.aByte132)) {
				Static591.method8516(arg2 >> 1, local39.method1023(), local39, arg1 >> 1);
				if (Static120.anIntArray136[0] >= 0) {
					if (local39.aString20 != null && (local22 >= local16 || Static98.anInt6103 == 0 || Static98.anInt6103 == 3 || Static98.anInt6103 == 1 && Static624.method8847(((Class4_Sub2_Sub1_Sub1_Sub1) local39).aString17)) && Static14.anInt241 > Static294.anInt5132) {
						Static14.anIntArray8[Static294.anInt5132] = Static485.aClass272_16.method6570(local39.aString20) / 2;
						Static14.anIntArray7[Static294.anInt5132] = Static120.anIntArray136[0];
						Static14.anIntArray10[Static294.anInt5132] = Static120.anIntArray136[1];
						Static14.anIntArray9[Static294.anInt5132] = local39.anInt1238;
						Static14.anIntArray4[Static294.anInt5132] = local39.anInt1235;
						Static14.anIntArray5[Static294.anInt5132] = local39.anInt1253;
						Static14.aStringArray5[Static294.anInt5132] = local39.aString20;
						Static294.anInt5132++;
					}
					local188 = Static120.anIntArray136[1] + arg3;
					@Pc(260) Class28[] local260;
					@Pc(267) Class131[] local267;
					@Pc(319) Class28 local319;
					if (local39.aBoolean71 || local39.anInt1275 <= Static631.anInt10493) {
						local188 -= Math.max(Static485.aClass272_16.anInt7414, Static146.aClass28Array3[0].method4037());
					} else {
						@Pc(211) byte local211 = 1;
						if (local16 > local22) {
							@Pc(224) Class4_Sub2_Sub1_Sub1_Sub1 local224 = Static393.aClass4_Sub2_Sub1_Sub1_Sub1Array12[local20[local22]];
							local229 = local39.method1025().anInt7266;
							if (local224.aBoolean48) {
								local211 = 2;
							}
						} else {
							local229 = local26.anInt5647;
							if (local229 == -1) {
								local229 = local39.method1025().anInt7266;
							}
						}
						@Pc(249) Class28[] local249 = Static146.aClass28Array3;
						if (local229 != -1) {
							local260 = (Class28[]) Static579.aClass87_234.method1805((long) local229);
							if (local260 == null) {
								local267 = Static649.method2892(Static441.aClass207_89, local229);
								if (local267 != null) {
									local260 = new Class28[local267.length];
									for (local275 = 0; local275 < local267.length; local275++) {
										local260[local275] = Static213.aClass133_5.method7297(local267[local275], true);
									}
									Static579.aClass87_234.method1792((long) local229, local260);
								}
							}
							if (local260 != null && local260.length >= 2) {
								local249 = local260;
							}
						}
						if (local211 >= local249.length) {
							local211 = 1;
						}
						@Pc(315) Class28 local315 = local249[0];
						local319 = local249[local211];
						local188 -= Math.max(Static485.aClass272_16.anInt7414, local315.method4037());
						local275 = arg0 + Static120.anIntArray136[0] - (local315.method4032() >> 1);
						local346 = local315.method4032() * local39.lb / 255;
						local349 = local315.method4037();
						if (local39.lb > 0 && local346 < 2) {
							local346 = 2;
						}
						local315.method4040(local275, local188);
						Static213.aClass133_5.T(local275, local188, local346 + local275, local188 - -local349);
						local319.method4040(local275, local188);
						Static213.aClass133_5.KA(arg0, arg3, arg0 + arg1, arg2 + arg3);
						Static562.method5062(local188, local188 + local349, local315.method4035() + local275, local275);
					}
					local188 -= 2;
					if (!local39.aBoolean71) {
						@Pc(418) Class28 local418;
						@Pc(427) Class28 local427;
						if (local39.anInt1218 > Static631.anInt10493) {
							local418 = Static217.aClass28Array9[local39.aBoolean72 ? 2 : 0];
							local427 = Static217.aClass28Array9[local39.aBoolean72 ? 3 : 1];
							if (local39 instanceof Class4_Sub2_Sub1_Sub1_Sub2) {
								local437 = local26.anInt5627;
								if (local437 == -1) {
									local437 = local39.method1025().anInt7269;
								}
							} else {
								local437 = local39.method1025().anInt7269;
							}
							if (local437 != -1) {
								local260 = (Class28[]) Static167.aClass87_91.method1805((long) local437);
								if (local260 == null) {
									local267 = Static649.method2892(Static441.aClass207_89, local437);
									if (local267 != null) {
										local260 = new Class28[local267.length];
										for (local275 = 0; local275 < local267.length; local275++) {
											local260[local275] = Static213.aClass133_5.method7297(local267[local275], true);
										}
										Static167.aClass87_91.method1792((long) local437, local260);
									}
								}
								if (local260 != null && local260.length == 4) {
									local427 = local260[local39.aBoolean72 ? 3 : 1];
									local418 = local260[local39.aBoolean72 ? 2 : 0];
								}
							}
							@Pc(534) int local534 = local39.anInt1218 - Static631.anInt10493;
							if (local534 <= local39.anInt1219) {
								local545 = local418.method4032();
							} else {
								local534 -= local39.anInt1219;
								local275 = local39.anInt1203 == 0 ? 0 : local39.anInt1203 * ((local39.anInt1193 - local534) / local39.anInt1203);
								local545 = local275 * local418.method4032() / local39.anInt1193;
							}
							local275 = local418.method4037();
							local188 -= local275;
							local346 = Static120.anIntArray136[0] + arg0 - (local418.method4032() >> 1);
							local418.method4040(local346, local188);
							Static213.aClass133_5.T(local346, local188, local545 + local346, local188 + local275);
							local427.method4040(local346, local188);
							Static213.aClass133_5.KA(arg0, arg3, arg1 + arg0, arg2 + arg3);
							Static562.method5062(local188, local275 + local188, local346 + local418.method4035(), local346);
							local188 -= 2;
						}
						if (local16 > local22) {
							@Pc(648) Class4_Sub2_Sub1_Sub1_Sub1 local648 = (Class4_Sub2_Sub1_Sub1_Sub1) local39;
							if (local648.anInt913 != -1) {
								local188 -= 25;
								local427 = Static613.aClass28Array21[local648.anInt913];
								local427.method4040(arg0 + Static120.anIntArray136[0] - 12, local188);
								Static562.method5062(local188, local188 + local427.method4042(), Static120.anIntArray136[0] + arg0 - (12 - local427.method4035()), arg0 + Static120.anIntArray136[0] - 12);
								local188 -= 2;
							}
							if (local648.anInt894 != -1) {
								local188 -= 25;
								local427 = Static207.aClass28Array8[local648.anInt894];
								local427.method4040(arg0 + Static120.anIntArray136[0] - 12, local188);
								Static562.method5062(local188, local427.method4042() + local188, Static120.anIntArray136[0] + -12 + arg0 + local427.method4035(), Static120.anIntArray136[0] + arg0 - 12);
								local188 -= 2;
							}
						} else if (local26.anInt5619 >= 0 && local26.anInt5619 < Static207.aClass28Array8.length) {
							local418 = Static207.aClass28Array8[local26.anInt5619];
							local188 -= 25;
							local418.method4040(arg0 + Static120.anIntArray136[0] - (local418.method4032() >> 1), local188);
							Static562.method5062(local188, local188 + local418.method4042(), arg0 - (-Static120.anIntArray136[0] + (local418.method4032() >> 1) + -local418.method4035()), Static120.anIntArray136[0] + arg0 - (local418.method4032() >> 1));
							local188 -= 2;
						}
					}
					@Pc(814) Class154[] local814;
					@Pc(822) Class154 local822;
					if (!(local39 instanceof Class4_Sub2_Sub1_Sub1_Sub1)) {
						local229 = 0;
						local814 = Static82.aClass154Array1;
						for (local437 = 0; local437 < local814.length; local437++) {
							local822 = local814[local437];
							if (local822 != null && local822.anInt4132 == 1 && local822.anInt4129 == Static209.anIntArray198[local22 - local16]) {
								local319 = Static160.aClass28Array20[local822.anInt4130];
								if (local229 < local319.method4037()) {
									local229 = local319.method4037();
								}
								if (Static631.anInt10493 % 20 < 10) {
									local319.method4040(Static120.anIntArray136[0] + arg0 - 12, local188 + -local319.method4037());
									Static562.method5062(local188 - local319.method4037(), -local319.method4037() + local188 - -local319.method4042(), Static120.anIntArray136[0] + arg0 + local319.method4035() - 12, Static120.anIntArray136[0] + -12 + arg0);
								}
							}
						}
						if (local229 > 0) {
						}
					} else if (local22 >= 0) {
						local229 = 0;
						local814 = Static82.aClass154Array1;
						for (local437 = 0; local437 < local814.length; local437++) {
							local822 = local814[local437];
							if (local822 != null && local822.anInt4132 == 10 && local20[local22] == local822.anInt4129) {
								local319 = Static160.aClass28Array20[local822.anInt4130];
								if (local229 < local319.method4037()) {
									local229 = local319.method4037();
								}
								local319.method4040(Static120.anIntArray136[0] + arg0 - 12, -local319.method4037() + local188);
								Static562.method5062(local188 - local319.method4037(), local188 + -local319.method4037() + local319.method4042(), Static120.anIntArray136[0] + arg0 + local319.method4035() - 12, Static120.anIntArray136[0] + arg0 + -12);
							}
						}
						if (local229 > 0) {
						}
					}
					for (local229 = 0; local229 < Static429.anInt7408; local229++) {
						local1045 = local39.anIntArray90[local229];
						local437 = local39.anIntArray91[local229];
						@Pc(1052) Class163 local1052 = null;
						local545 = 0;
						if (local437 >= 0) {
							if (local1045 <= Static631.anInt10493) {
								continue;
							}
							local1052 = Static634.aClass372_2.method8809(local39.anIntArray91[local229]);
							local545 = local1052.anInt4300;
						} else if (local1045 < 0) {
							continue;
						}
						local275 = local39.anIntArray86[local229];
						@Pc(1087) Class163 local1087 = null;
						if (local275 >= 0) {
							local1087 = Static634.aClass372_2.method8809(local275);
						}
						if (Static631.anInt10493 >= local1045 - local545) {
							local349 = local39.anIntArray93[local229];
							if (local349 >= 0) {
								local39.anInt1275 = Static631.anInt10493 + 300;
								local39.lb = local349;
								local39.anIntArray93[local229] = -1;
							}
							if (local1052 == null) {
								local39.anIntArray90[local229] = -1;
							} else {
								local1142 = local39.method1023() / 2;
								Static591.method8516(arg2 >> 1, local1142, local39, arg1 >> 1);
								if (Static120.anIntArray136[0] > -1) {
									Static120.anIntArray136[0] += Static417.anIntArray383[local229];
									Static120.anIntArray136[1] += Static157.anIntArray159[local229];
									local1188 = 0;
									local1190 = 0;
									@Pc(1192) int local1192 = 0;
									@Pc(1194) int local1194 = 0;
									@Pc(1196) int local1196 = 0;
									@Pc(1198) int local1198 = 0;
									@Pc(1200) int local1200 = 0;
									@Pc(1202) int local1202 = 0;
									@Pc(1204) Class28 local1204 = null;
									@Pc(1206) Class28 local1206 = null;
									@Pc(1208) Class28 local1208 = null;
									@Pc(1210) Class28 local1210 = null;
									@Pc(1212) int local1212 = 0;
									@Pc(1214) int local1214 = 0;
									@Pc(1216) int local1216 = 0;
									@Pc(1218) int local1218 = 0;
									@Pc(1220) int local1220 = 0;
									@Pc(1222) int local1222 = 0;
									@Pc(1224) int local1224 = 0;
									@Pc(1226) int local1226 = 0;
									@Pc(1231) Class28 local1231 = local1052.method3904(Static213.aClass133_5);
									@Pc(1233) int local1233 = 0;
									@Pc(1241) int local1241;
									if (local1231 != null) {
										local1188 = local1231.method4032();
										local1241 = local1231.method4037();
										if (local1241 > 0) {
											local1233 = local1241;
										}
										local1231.method4044(Static288.anIntArray271);
										local1196 = Static288.anIntArray271[0];
									}
									@Pc(1262) Class28 local1262 = local1052.method3901(Static213.aClass133_5);
									if (local1262 != null) {
										local1190 = local1262.method4032();
										local1241 = local1262.method4037();
										local1262.method4044(Static288.anIntArray271);
										if (local1233 < local1241) {
											local1233 = local1241;
										}
										local1198 = Static288.anIntArray271[0];
									}
									@Pc(1287) Class28 local1287 = local1052.method3903(Static213.aClass133_5);
									if (local1287 != null) {
										local1192 = local1287.method4032();
										local1241 = local1287.method4037();
										local1287.method4044(Static288.anIntArray271);
										if (local1233 < local1241) {
											local1233 = local1241;
										}
										local1200 = Static288.anIntArray271[0];
									}
									@Pc(1312) Class28 local1312 = local1052.method3902(Static213.aClass133_5);
									if (local1312 != null) {
										local1194 = local1312.method4032();
										local1241 = local1312.method4037();
										local1312.method4044(Static288.anIntArray271);
										if (local1241 > local1233) {
											local1233 = local1241;
										}
										local1202 = Static288.anIntArray271[0];
									}
									if (local1087 != null) {
										local1204 = local1087.method3904(Static213.aClass133_5);
										if (local1204 != null) {
											local1212 = local1204.method4032();
											local1241 = local1204.method4037();
											local1204.method4044(Static288.anIntArray271);
											if (local1233 < local1241) {
												local1233 = local1241;
											}
											local1220 = Static288.anIntArray271[0];
										}
										local1206 = local1087.method3901(Static213.aClass133_5);
										if (local1206 != null) {
											local1214 = local1206.method4032();
											local1241 = local1206.method4037();
											local1206.method4044(Static288.anIntArray271);
											if (local1241 > local1233) {
												local1233 = local1241;
											}
											local1222 = Static288.anIntArray271[0];
										}
										local1208 = local1087.method3903(Static213.aClass133_5);
										if (local1208 != null) {
											local1216 = local1208.method4032();
											local1241 = local1208.method4037();
											local1208.method4044(Static288.anIntArray271);
											if (local1241 > local1233) {
												local1233 = local1241;
											}
											local1224 = Static288.anIntArray271[0];
										}
										local1210 = local1087.method3902(Static213.aClass133_5);
										if (local1210 != null) {
											local1218 = local1210.method4032();
											local1241 = local1210.method4037();
											local1210.method4044(Static288.anIntArray271);
											if (local1233 < local1241) {
												local1233 = local1241;
											}
											local1226 = Static288.anIntArray271[0];
										}
									}
									@Pc(1444) Class55 local1444 = Static602.aClass55_16;
									@Pc(1446) Class55 local1446 = Static602.aClass55_16;
									@Pc(1448) Class272 local1448 = Static1.aClass272_18;
									local1241 = local1052.anInt4310;
									@Pc(1453) Class272 local1453 = Static1.aClass272_18;
									@Pc(1464) Class55 local1464;
									@Pc(1469) Class272 local1469;
									if (local1241 >= 0) {
										local1464 = Static170.method2646(local1241, Static213.aClass133_5, true);
										local1469 = Static567.method8236(Static213.aClass133_5, local1241);
										if (local1464 != null && local1469 != null) {
											local1444 = local1464;
											local1448 = local1469;
										}
									}
									if (local1087 != null) {
										local1241 = local1087.anInt4310;
										if (local1241 >= 0) {
											local1464 = Static170.method2646(local1241, Static213.aClass133_5, true);
											local1469 = Static567.method8236(Static213.aClass133_5, local1241);
											if (local1464 != null && local1469 != null) {
												local1453 = local1469;
												local1446 = local1464;
											}
										}
									}
									@Pc(1510) String local1510 = null;
									@Pc(1520) String local1520 = local1052.method3907(local39.anIntArray92[local229]);
									@Pc(1522) int local1522 = 0;
									@Pc(1527) int local1527 = local1448.method6570(local1520);
									if (local1087 != null) {
										local1510 = local1087.method3907(local39.anIntArray88[local229]);
										local1522 = local1453.method6570(local1510);
									}
									@Pc(1544) int local1544 = 0;
									@Pc(1546) int local1546 = 0;
									if (local1190 > 0) {
										local1544 = local1527 / local1190 + 1;
									}
									if (local1087 != null && local1214 > 0) {
										local1546 = local1522 / local1214 + 1;
									}
									@Pc(1572) int local1572 = 0;
									if (local1188 > 0) {
										local1572 = local1188;
									}
									local1572 += 2;
									@Pc(1583) int local1583 = local1572;
									if (local1192 > 0) {
										local1572 += local1192;
									}
									@Pc(1594) int local1594 = local1572;
									@Pc(1596) int local1596 = local1572;
									@Pc(1611) int local1611;
									if (local1190 <= 0) {
										local1572 += local1527;
									} else {
										local1611 = local1190 * local1544;
										local1596 = local1572 + (local1611 - local1527) / 2;
										local1572 += local1611;
									}
									local1611 = local1572;
									if (local1194 > 0) {
										local1572 += local1194;
									}
									@Pc(1637) int local1637 = 0;
									@Pc(1639) int local1639 = 0;
									@Pc(1641) int local1641 = 0;
									@Pc(1643) int local1643 = 0;
									@Pc(1645) int local1645 = 0;
									@Pc(1681) int local1681;
									if (local1087 != null) {
										local1572 += 2;
										local1637 = local1572;
										if (local1212 > 0) {
											local1572 += local1212;
										}
										local1572 += 2;
										local1639 = local1572;
										if (local1216 > 0) {
											local1572 += local1216;
										}
										local1645 = local1572;
										local1641 = local1572;
										if (local1214 > 0) {
											local1681 = local1546 * local1214;
											local1572 += local1681;
											local1645 += (local1681 - local1522) / 2;
										} else {
											local1572 += local1522;
										}
										local1643 = local1572;
										if (local1218 > 0) {
											local1572 += local1218;
										}
									}
									local1681 = local39.anIntArray90[local229] - Static631.anInt10493;
									@Pc(1727) int local1727 = local1052.anInt4317 - local1052.anInt4317 * local1681 / local1052.anInt4300;
									@Pc(1740) int local1740 = local1681 * local1052.anInt4308 / local1052.anInt4300 - local1052.anInt4308;
									@Pc(1754) int local1754 = local1727 + arg0 + Static120.anIntArray136[0] - (local1572 >> 1);
									@Pc(1764) int local1764 = local1740 + Static120.anIntArray136[1] + arg3 - 12;
									@Pc(1766) int local1766 = local1764;
									@Pc(1770) int local1770 = local1233 + local1764;
									@Pc(1777) int local1777 = local1052.anInt4319 + local1764 + 15;
									@Pc(1782) int local1782 = local1777 - local1448.anInt7414;
									if (local1764 > local1782) {
										local1766 = local1782;
									}
									@Pc(1792) int local1792 = local1448.anInt7417 + local1777;
									if (local1792 > local1770) {
										local1770 = local1792;
									}
									@Pc(1803) int local1803 = 0;
									@Pc(1817) int local1817;
									@Pc(1828) int local1828;
									if (local1087 != null) {
										local1803 = local1764 + local1087.anInt4319 + 15;
										local1817 = local1803 - local1453.anInt7414;
										if (local1766 > local1817) {
											local1766 = local1817;
										}
										local1828 = local1803 + local1453.anInt7417;
										if (local1828 > local1770) {
											local1770 = local1828;
										}
									}
									local1817 = 255;
									if (local1052.anInt4311 >= 0) {
										local1817 = (local1681 << 8) / (local1052.anInt4300 - local1052.anInt4311);
									}
									if (local1817 >= 0 && local1817 < 255) {
										local1828 = local1817 << 24;
										@Pc(2015) int local2015 = local1828 | 0xFFFFFF;
										if (local1231 != null) {
											local1231.method4034(local1754 - local1196, local1764, 0, local2015, 1);
										}
										if (local1287 != null) {
											local1287.method4034(local1754 + local1583 - local1200, local1764, 0, local2015, 1);
										}
										@Pc(2049) int local2049;
										if (local1262 != null) {
											for (local2049 = 0; local2049 < local1544; local2049++) {
												local1262.method4034(local1754 + local1594 + local1190 * local2049 - local1198, local1764, 0, local2015, 1);
											}
										}
										if (local1312 != null) {
											local1312.method4034(local1611 + local1754 - local1202, local1764, 0, local2015, 1);
										}
										local1444.method6023(local1828 | local1052.anInt4307, local1754 + local1596, local1520, local1777, 0);
										if (local1087 != null) {
											if (local1204 != null) {
												local1204.method4034(local1637 + local1754 - local1220, local1764, 0, local2015, 1);
											}
											if (local1208 != null) {
												local1208.method4034(local1639 + local1754 - local1224, local1764, 0, local2015, 1);
											}
											if (local1206 != null) {
												for (local2049 = 0; local2049 < local1546; local2049++) {
													local1206.method4034(local1214 * local2049 + local1641 + local1754 - local1222, local1764, 0, local2015, 1);
												}
											}
											if (local1210 != null) {
												local1210.method4034(local1754 + local1643 - local1226, local1764, 0, local2015, 1);
											}
											local1446.method6023(local1087.anInt4307 | local1828, local1645 + local1754, local1510, local1803, 0);
										}
									} else {
										if (local1231 != null) {
											local1231.method4040(local1754 - local1196, local1764);
										}
										if (local1287 != null) {
											local1287.method4040(local1583 + local1754 - local1200, local1764);
										}
										if (local1262 != null) {
											for (local1828 = 0; local1828 < local1544; local1828++) {
												local1262.method4040(local1754 + local1594 + local1190 * local1828 - local1198, local1764);
											}
										}
										if (local1312 != null) {
											local1312.method4040(local1754 + local1611 - local1202, local1764);
										}
										local1444.method6023(local1052.anInt4307 | 0xFF000000, local1596 + local1754, local1520, local1777, 0);
										if (local1087 != null) {
											if (local1204 != null) {
												local1204.method4040(local1637 + local1754 - local1220, local1764);
											}
											if (local1208 != null) {
												local1208.method4040(local1754 + local1639 - local1224, local1764);
											}
											if (local1206 != null) {
												for (local1828 = 0; local1828 < local1546; local1828++) {
													local1206.method4040(local1754 + local1641 + local1214 * local1828 - local1222, local1764);
												}
											}
											if (local1210 != null) {
												local1210.method4040(local1643 + local1754 - local1226, local1764);
											}
											local1446.method6023(local1087.anInt4307 | 0xFF000000, local1754 + local1645, local1510, local1803, 0);
										}
									}
									Static562.method5062(local1766, local1770 + 1, local1754 + local1572, local1754);
								}
							}
						}
					}
				}
			}
		}
		@Pc(2222) int local2222;
		for (@Pc(2216) int local2216 = 0; local2216 < Static256.anInt4674; local2216++) {
			local2222 = Static57.anIntArray75[local2216];
			@Pc(2235) Class4_Sub2_Sub1_Sub1 local2235;
			if (local2222 >= 2048) {
				local2235 = ((Class5_Sub3) Static445.aClass273_29.method6581((long) (local2222 - 2048))).aClass4_Sub2_Sub1_Sub1_Sub2_1;
			} else {
				local2235 = Static393.aClass4_Sub2_Sub1_Sub1_Sub1Array12[local2222];
			}
			local229 = Static424.anIntArray392[local2216];
			@Pc(2254) Class4_Sub2_Sub1_Sub1 local2254;
			if (local229 < 2048) {
				local2254 = Static393.aClass4_Sub2_Sub1_Sub1_Sub1Array12[local229];
			} else {
				local2254 = ((Class5_Sub3) Static445.aClass273_29.method6581((long) (local229 - 2048))).aClass4_Sub2_Sub1_Sub1_Sub2_1;
			}
			Static531.method7863(arg2, local2235, arg3, arg0, local2254, --local2235.anInt1243, arg1);
		}
		local2222 = Static485.aClass272_16.anInt7417 + Static485.aClass272_16.anInt7414 + 2;
		for (local188 = 0; local188 < Static294.anInt5132; local188++) {
			local229 = Static14.anIntArray7[local188];
			local1045 = Static14.anIntArray10[local188];
			local437 = Static14.anIntArray8[local188];
			@Pc(2313) boolean local2313 = true;
			while (local2313) {
				local2313 = false;
				for (local545 = 0; local545 < local188; local545++) {
					if (local1045 + 2 > -local2222 + Static14.anIntArray10[local545] && local1045 - local2222 < Static14.anIntArray10[local545] + 2 && local229 - local437 < Static14.anIntArray7[local545] - -Static14.anIntArray8[local545] && local437 + local229 > Static14.anIntArray7[local545] + -Static14.anIntArray8[local545] && local1045 > Static14.anIntArray10[local545] - local2222) {
						local1045 = Static14.anIntArray10[local545] - local2222;
						local2313 = true;
					}
				}
			}
			Static14.anIntArray10[local188] = local1045;
			@Pc(2409) String local2409 = Static14.aStringArray5[local188];
			local275 = Static485.aClass272_16.method6570(local2409);
			local346 = local229 + arg0;
			local349 = arg3 + local1045 - Static485.aClass272_16.anInt7414;
			local1142 = local275 + local346;
			@Pc(2437) int local2437 = Static485.aClass272_16.anInt7417 + arg3 + local1045;
			if (Static487.anInt8276 == 0) {
				@Pc(2441) int local2441 = 16776960;
				if (Static14.anIntArray9[local188] < 6) {
					local2441 = Static559.anIntArray517[Static14.anIntArray9[local188]];
				}
				if (Static14.anIntArray9[local188] == 6) {
					local2441 = Static96.anInt1932 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static14.anIntArray9[local188] == 7) {
					local2441 = Static96.anInt1932 % 20 >= 10 ? 65535 : 255;
				}
				if (Static14.anIntArray9[local188] == 8) {
					local2441 = Static96.anInt1932 % 20 >= 10 ? 8454016 : 45056;
				}
				@Pc(2512) int local2512;
				if (Static14.anIntArray9[local188] == 9) {
					local2512 = 150 - Static14.anIntArray5[local188];
					if (local2512 < 50) {
						local2441 = local2512 * 1280 + 16711680;
					} else if (local2512 < 100) {
						local2441 = 16384000 + 16776960 - local2512 * 327680;
					} else if (local2512 < 150) {
						local2441 = local2512 * 5 + 64780;
					}
				}
				if (Static14.anIntArray9[local188] == 10) {
					local2512 = 150 - Static14.anIntArray5[local188];
					if (local2512 < 50) {
						local2441 = local2512 * 5 + 16711680;
					} else if (local2512 < 100) {
						local2441 = 16711935 + 16384000 - local2512 * 327680;
					} else if (local2512 < 150) {
						local2441 = local2512 * 327680 + 500 + 255 - local2512 * 5 - 32768000;
					}
				}
				if (Static14.anIntArray9[local188] == 11) {
					local2512 = 150 - Static14.anIntArray5[local188];
					if (local2512 < 50) {
						local2441 = 16777215 - local2512 * 327685;
					} else if (local2512 < 100) {
						local2441 = local2512 * 327685 + 65280 - 16384250;
					} else if (local2512 < 150) {
						local2441 = 16777215 - (local2512 - 100) * 327680;
					}
				}
				local2512 = local2441 | 0xFF000000;
				if (Static14.anIntArray4[local188] == 0) {
					Static16.aClass55_1.method6013(-16777216, local2409, arg3 + local1045, local2512, local229 + arg0);
					local346 -= local275 >> 1;
					local1142 -= local275 >> 1;
				}
				if (Static14.anIntArray4[local188] == 1) {
					local346 -= local275 >> 1;
					local2437 += 5;
					local1142 -= local275 >> 1;
					local349 -= 5;
					Static16.aClass55_1.method6026(Static96.anInt1932, local2512, arg3 + local1045, local229 + arg0, local2409);
				}
				if (Static14.anIntArray4[local188] == 2) {
					local2437 += 5;
					local1142 -= (local275 >> 1) - 5;
					local346 -= (local275 >> 1) + 5;
					Static16.aClass55_1.method6017(Static96.anInt1932, local1045 + arg3, local2512, local229 + arg0, local2409);
					local349 -= 5;
				}
				if (Static14.anIntArray4[local188] == 3) {
					local1142 -= local275 >> 1;
					local346 -= local275 >> 1;
					local349 -= 7;
					local2437 += 7;
					Static16.aClass55_1.method6019(local2512, local2409, local229 + arg0, -Static14.anIntArray5[local188] + 150, Static96.anInt1932, arg3 + local1045);
				}
				@Pc(2821) int local2821;
				if (Static14.anIntArray4[local188] == 4) {
					local2821 = (150 - Static14.anIntArray5[local188]) * (Static485.aClass272_16.method6570(local2409) + 100) / 150;
					Static213.aClass133_5.T(local229 + arg0 - 50, arg3, local229 + arg0 + 50, arg3 - -arg2);
					local1142 += 50 - local2821;
					Static16.aClass55_1.method6023(local2512, arg0 + local229 + 50 - local2821, local2409, arg3 + local1045, -16777216);
					local346 += 50 - local2821;
					Static213.aClass133_5.KA(arg0, arg3, arg1 + arg0, arg3 - -arg2);
				}
				if (Static14.anIntArray4[local188] == 5) {
					local2821 = 150 - Static14.anIntArray5[local188];
					local1188 = 0;
					if (local2821 < 25) {
						local1188 = local2821 - 25;
					} else if (local2821 > 125) {
						local1188 = local2821 - 125;
					}
					local1190 = Static485.aClass272_16.anInt7414 + Static485.aClass272_16.anInt7417;
					Static213.aClass133_5.T(arg0, arg3 + local1045 - local1190 - 1, arg1 + arg0, arg3 + local1045 + 5);
					Static16.aClass55_1.method6013(-16777216, local2409, arg3 + local1045 + local1188, local2512, arg0 + local229);
					local2437 += local1188;
					local1142 -= local275 >> 1;
					local346 -= local275 >> 1;
					local349 += local1188;
					Static213.aClass133_5.KA(arg0, arg3, arg0 + arg1, arg3 - -arg2);
				}
			} else {
				local346 -= local275 >> 1;
				local1142 -= local275 >> 1;
				Static16.aClass55_1.method6013(-16777216, local2409, local1045 + arg3, -256, arg0 + local229);
			}
			Static562.method5062(local349, local2437 + 1, local1142 - -1, local346);
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(BLclient!ofa;)Lclient!ir;")
	public static Class119_Sub2 method5210(@OriginalArg(1) Class5_Sub22 arg0) {
		@Pc(12) Class119 local12 = Static605.method8635(arg0);
		@Pc(16) int local16 = arg0.method5913();
		@Pc(20) int local20 = arg0.method5913();
		return new Class119_Sub2(local12.aClass245_14, local12.aClass183_12, local12.anInt10375, local12.anInt10374, local12.anInt10371, local12.anInt10373, local12.anInt10367, local12.anInt10370, local12.anInt10369, local16, local20);
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIZZI)V")
	public static void method5212(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		Static75.method1292(Static103.aClass33_Sub1Array2.length - 1, arg1, arg2, arg0, 0, arg3);
		Static104.aClass5_Sub19_2 = null;
		Static467.anInt7848 = 0;
	}
}
