import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!se", name = "c", descriptor = "[I")
	public static int[] anIntArray422;

	@OriginalMember(owner = "client!se", name = "l", descriptor = "I")
	public static int anInt2791;

	@OriginalMember(owner = "client!se", name = "m", descriptor = "I")
	public static int anInt2792;

	@OriginalMember(owner = "client!se", name = "u", descriptor = "Ljava/awt/FontMetrics;")
	public static FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!se", name = "a", descriptor = "Lclient!kd;")
	private static Class39 aClass39_1336 = Static108.method1915("To");

	@OriginalMember(owner = "client!se", name = "b", descriptor = "I")
	public static int anInt2786 = -1;

	@OriginalMember(owner = "client!se", name = "d", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1337 = Static108.method1915("da dieser Computer gegen unsere ");

	@OriginalMember(owner = "client!se", name = "f", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1338 = Static108.method1915("Lade Titelbild )2 ");

	@OriginalMember(owner = "client!se", name = "g", descriptor = "I")
	public static int anInt2788 = 0;

	@OriginalMember(owner = "client!se", name = "o", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1339 = aClass39_1336;

	@OriginalMember(owner = "client!se", name = "p", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1340 = Static108.method1915(":: (X");

	@OriginalMember(owner = "client!se", name = "r", descriptor = "I")
	public static int anInt2795 = 0;

	@OriginalMember(owner = "client!se", name = "v", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1341 = Static108.method1915("sl_button");

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(B)V")
	public static void method1941() {
		while (Static117.method2022()) {
			if (Static48.anInt1318 != -1 && Static52.anInt1457 == Static48.anInt1318) {
				if (anInt2791 == 85 && Static8.aClass39_152.method1175() > 0) {
					Static8.aClass39_152 = Static8.aClass39_152.method1173(Static8.aClass39_152.method1175() - 1, 0);
				}
				if ((Static93.method1573(Static77.anInt1931) || Static77.anInt1931 == 32) && Static8.aClass39_152.method1175() < 12) {
					Static8.aClass39_152 = Static8.aClass39_152.method1150(Static77.anInt1931);
				}
			} else {
				@Pc(156) int local156;
				if (Static90.aBoolean179) {
					if (anInt2791 == 85 && Static8.aClass39_148.method1175() > 0) {
						Static8.aClass39_148 = Static8.aClass39_148.method1173(Static8.aClass39_148.method1175() - 1, 0);
						Static113.aBoolean226 = true;
					}
					if (Static70.method1228(Static77.anInt1931) && Static8.aClass39_148.method1175() < 80) {
						Static8.aClass39_148 = Static8.aClass39_148.method1150(Static77.anInt1931);
						Static113.aBoolean226 = true;
					}
					if (anInt2791 == 84) {
						Static113.aBoolean226 = true;
						Static90.aBoolean179 = false;
						@Pc(114) long local114;
						if (Static64.anInt1672 == 1) {
							local114 = Static8.aClass39_148.method1186();
							Static51.method880(local114);
						}
						if (Static64.anInt1672 == 2 && Static12.anInt502 > 0) {
							local114 = Static8.aClass39_148.method1186();
							Static18.method356(local114);
						}
						if (Static64.anInt1672 == 3 && Static8.aClass39_148.method1175() > 0) {
							Static103.aClass1_Sub18_Sub1_5.method2203(205);
							Static103.aClass1_Sub18_Sub1_5.method2168(0);
							local156 = Static103.aClass1_Sub18_Sub1_5.anInt3078;
							Static103.aClass1_Sub18_Sub1_5.method2179(Static62.aLong96);
							Static103.method1842(Static8.aClass39_148, Static103.aClass1_Sub18_Sub1_5);
							Static103.aClass1_Sub18_Sub1_5.method2180(Static103.aClass1_Sub18_Sub1_5.anInt3078 - local156);
							if (Static24.anInt816 == 2) {
								Static24.anInt816 = 1;
								Static66.aBoolean145 = true;
								Static103.aClass1_Sub18_Sub1_5.method2203(161);
								Static103.aClass1_Sub18_Sub1_5.method2168(Static114.anInt2845);
								Static103.aClass1_Sub18_Sub1_5.method2168(Static24.anInt816);
								Static103.aClass1_Sub18_Sub1_5.method2168(Static11.anInt495);
							}
						}
						if (Static64.anInt1672 == 4 && Static108.anInt2750 < 100) {
							local114 = Static8.aClass39_148.method1186();
							Static94.method1583(local114);
						}
						if (Static64.anInt1672 == 5 && Static108.anInt2750 > 0) {
							local114 = Static8.aClass39_148.method1186();
							Static120.method2134(local114);
						}
					}
				} else if (Static2.anInt133 == 1) {
					if (anInt2791 == 85 && Static8.aClass39_145.method1175() > 0) {
						Static8.aClass39_145 = Static8.aClass39_145.method1173(Static8.aClass39_145.method1175() - 1, 0);
						Static113.aBoolean226 = true;
					}
					if (Static107.method1887(Static77.anInt1931) && Static8.aClass39_145.method1175() < 10) {
						Static8.aClass39_145 = Static8.aClass39_145.method1150(Static77.anInt1931);
						Static113.aBoolean226 = true;
					}
					if (anInt2791 == 84) {
						if (Static8.aClass39_145.method1175() > 0) {
							local156 = 0;
							if (Static8.aClass39_145.method1179()) {
								local156 = Static8.aClass39_145.method1161();
							}
							Static103.aClass1_Sub18_Sub1_5.method2203(40);
							Static103.aClass1_Sub18_Sub1_5.method2149(local156);
						}
						Static2.anInt133 = 0;
						Static113.aBoolean226 = true;
					}
				} else if (Static2.anInt133 == 2) {
					if (anInt2791 == 85 && Static8.aClass39_145.method1175() > 0) {
						Static8.aClass39_145 = Static8.aClass39_145.method1173(Static8.aClass39_145.method1175() - 1, 0);
						Static113.aBoolean226 = true;
					}
					if ((Static93.method1573(Static77.anInt1931) || Static77.anInt1931 == 32) && Static8.aClass39_145.method1175() < 12) {
						Static8.aClass39_145 = Static8.aClass39_145.method1150(Static77.anInt1931);
						Static113.aBoolean226 = true;
					}
					if (anInt2791 == 84) {
						if (Static8.aClass39_145.method1175() > 0) {
							Static103.aClass1_Sub18_Sub1_5.method2203(100);
							Static103.aClass1_Sub18_Sub1_5.method2179(Static8.aClass39_145.method1186());
						}
						Static2.anInt133 = 0;
						Static113.aBoolean226 = true;
					}
				} else if (Static2.anInt133 == 3) {
					if (anInt2791 == 85 && Static8.aClass39_145.method1175() > 0) {
						Static8.aClass39_145 = Static8.aClass39_145.method1173(Static8.aClass39_145.method1175() - 1, 0);
						Static113.aBoolean226 = true;
					}
					if (Static70.method1228(Static77.anInt1931) && Static8.aClass39_145.method1175() < 40) {
						Static8.aClass39_145 = Static8.aClass39_145.method1150(Static77.anInt1931);
						Static113.aBoolean226 = true;
					}
				} else if (Static2.anInt133 == 4) {
					if (anInt2791 == 85 && Static8.aClass39_145.method1175() > 0) {
						Static8.aClass39_145 = Static8.aClass39_145.method1173(Static8.aClass39_145.method1175() - 1, 0);
						Static113.aBoolean226 = true;
					}
					if ((Static70.method1228(Static77.anInt1931) || Static77.anInt1931 == 32) && Static8.aClass39_145.method1175() < 80) {
						Static8.aClass39_145 = Static8.aClass39_145.method1150(Static77.anInt1931);
						Static113.aBoolean226 = true;
					}
					if (anInt2791 == 84) {
						if (Static8.aClass39_145.method1175() > 0) {
							Static103.aClass1_Sub18_Sub1_5.method2203(117);
							Static103.aClass1_Sub18_Sub1_5.method2168(Static8.aClass39_145.method1175() + 1);
							Static103.aClass1_Sub18_Sub1_5.method2165(Static8.aClass39_145);
						}
						Static2.anInt133 = 0;
						Static113.aBoolean226 = true;
					}
				} else if (anInt2786 == -1 && Static72.anInt1798 == -1) {
					if (Static46.anInt2784 != 0 || Static58.anInt1566 > 1) {
						Static44.method786();
					}
					if (anInt2791 == 85 && Static8.aClass39_151.method1175() > 0) {
						Static8.aClass39_151 = Static8.aClass39_151.method1173(Static8.aClass39_151.method1175() - 1, 0);
						Static113.aBoolean226 = true;
					}
					if (Static70.method1228(Static77.anInt1931) && Static8.aClass39_151.method1175() < 80) {
						Static8.aClass39_151 = Static8.aClass39_151.method1150(Static77.anInt1931);
						Static113.aBoolean226 = true;
					}
					if (anInt2791 == 84 && Static8.aClass39_151.method1175() > 0) {
						if (Static46.anInt2784 != 0 || Static58.anInt1566 > 1) {
							Static59.aClass39Array16[Static86.anInt2060++] = Static8.aClass39_151;
							if (Static86.anInt2060 >= 20) {
								Static86.anInt2060 = 0;
							}
							Static74.anInt1854 = -1;
						}
						if (Static58.anInt1566 == 2) {
							if (Static8.aClass39_151.method1158(Static48.aClass39_634)) {
								System.gc();
							}
							if (Static8.aClass39_151.method1158(Static89.aClass39_1065)) {
								Static67.method1198();
							}
							if (Static8.aClass39_151.method1158(Static30.aClass39_468)) {
								Static81.aBoolean166 = true;
							}
							if (Static8.aClass39_151.method1158(Static66.aClass39_844)) {
								Static81.aBoolean166 = false;
							}
							if (Static8.aClass39_151.method1158(Static116.aClass39_1384)) {
								for (local156 = 0; local156 < 4; local156++) {
									for (@Pc(545) int local545 = 1; local545 < 103; local545++) {
										for (@Pc(549) int local549 = 1; local549 < 103; local549++) {
											Static62.aClass23Array2[local156].anIntArrayArray9[local545][local549] = 0;
										}
									}
								}
							}
							if (Static8.aClass39_151.method1158(Static126.aClass39_1513) && Static46.anInt2784 == 2) {
								throw new RuntimeException();
							}
							if (Static8.aClass39_151.method1158(Static65.aClass39_837)) {
								Static120.aBoolean252 = true;
							}
						}
						if (Static8.aClass39_151.method1185(Static121.aClass39_1425)) {
							Static103.aClass1_Sub18_Sub1_5.method2203(138);
							Static103.aClass1_Sub18_Sub1_5.method2168(Static8.aClass39_151.method1175() - 1);
							Static103.aClass1_Sub18_Sub1_5.method2165(Static8.aClass39_151.method1181(2));
						} else {
							@Pc(635) Class39 local635 = Static8.aClass39_151.method1151();
							@Pc(637) byte local637 = 0;
							if (local635.method1185(Static65.aClass39_836)) {
								local637 = 0;
								Static8.aClass39_151 = Static8.aClass39_151.method1181(Static65.aClass39_836.method1175());
							} else if (local635.method1185(Static121.aClass39_1422)) {
								Static8.aClass39_151 = Static8.aClass39_151.method1181(Static121.aClass39_1422.method1175());
								local637 = 1;
							} else if (local635.method1185(Static54.aClass39_727)) {
								Static8.aClass39_151 = Static8.aClass39_151.method1181(Static54.aClass39_727.method1175());
								local637 = 2;
							} else if (local635.method1185(Static97.aClass39_1526)) {
								local637 = 3;
								Static8.aClass39_151 = Static8.aClass39_151.method1181(Static97.aClass39_1526.method1175());
							} else if (local635.method1185(Static22.aClass39_371)) {
								Static8.aClass39_151 = Static8.aClass39_151.method1181(Static22.aClass39_371.method1175());
								local637 = 4;
							} else if (local635.method1185(Static44.aClass39_595)) {
								local637 = 5;
								Static8.aClass39_151 = Static8.aClass39_151.method1181(Static44.aClass39_595.method1175());
							} else if (local635.method1185(Static74.aClass39_923)) {
								Static8.aClass39_151 = Static8.aClass39_151.method1181(Static74.aClass39_923.method1175());
								local637 = 6;
							} else if (local635.method1185(Static85.aClass39_1026)) {
								Static8.aClass39_151 = Static8.aClass39_151.method1181(Static85.aClass39_1026.method1175());
								local637 = 7;
							} else if (local635.method1185(Static87.aClass39_1014)) {
								Static8.aClass39_151 = Static8.aClass39_151.method1181(Static87.aClass39_1014.method1175());
								local637 = 8;
							} else if (local635.method1185(Static10.aClass39_220)) {
								Static8.aClass39_151 = Static8.aClass39_151.method1181(Static10.aClass39_220.method1175());
								local637 = 9;
							} else if (local635.method1185(Static126.aClass39_1512)) {
								Static8.aClass39_151 = Static8.aClass39_151.method1181(Static126.aClass39_1512.method1175());
								local637 = 10;
							} else if (local635.method1185(Static101.aClass39_1242)) {
								local637 = 11;
								Static8.aClass39_151 = Static8.aClass39_151.method1181(Static101.aClass39_1242.method1175());
							} else if (Static122.anInt2972 != 0) {
								if (local635.method1185(Static65.aClass39_835)) {
									local637 = 0;
									Static8.aClass39_151 = Static8.aClass39_151.method1181(Static65.aClass39_835.method1175());
								} else if (local635.method1185(Static121.aClass39_1427)) {
									Static8.aClass39_151 = Static8.aClass39_151.method1181(Static121.aClass39_1427.method1175());
									local637 = 1;
								} else if (local635.method1185(Static54.aClass39_724)) {
									Static8.aClass39_151 = Static8.aClass39_151.method1181(Static54.aClass39_724.method1175());
									local637 = 2;
								} else if (local635.method1185(Static97.aClass39_1531)) {
									local637 = 3;
									Static8.aClass39_151 = Static8.aClass39_151.method1181(Static97.aClass39_1531.method1175());
								} else if (local635.method1185(Static22.aClass39_381)) {
									local637 = 4;
									Static8.aClass39_151 = Static8.aClass39_151.method1181(Static22.aClass39_381.method1175());
								} else if (local635.method1185(Static44.aClass39_599)) {
									Static8.aClass39_151 = Static8.aClass39_151.method1181(Static44.aClass39_599.method1175());
									local637 = 5;
								} else if (local635.method1185(Static74.aClass39_920)) {
									local637 = 6;
									Static8.aClass39_151 = Static8.aClass39_151.method1181(Static74.aClass39_920.method1175());
								} else if (local635.method1185(Static85.aClass39_1028)) {
									local637 = 7;
									Static8.aClass39_151 = Static8.aClass39_151.method1181(Static85.aClass39_1028.method1175());
								} else if (local635.method1185(Static87.aClass39_1006)) {
									local637 = 8;
									Static8.aClass39_151 = Static8.aClass39_151.method1181(Static87.aClass39_1006.method1175());
								} else if (local635.method1185(Static10.aClass39_217)) {
									Static8.aClass39_151 = Static8.aClass39_151.method1181(Static10.aClass39_217.method1175());
									local637 = 9;
								} else if (local635.method1185(Static126.aClass39_1509)) {
									local637 = 10;
									Static8.aClass39_151 = Static8.aClass39_151.method1181(Static126.aClass39_1509.method1175());
								} else if (local635.method1185(Static101.aClass39_1237)) {
									local637 = 11;
									Static8.aClass39_151 = Static8.aClass39_151.method1181(Static101.aClass39_1237.method1175());
								}
							}
							local635 = Static8.aClass39_151.method1151();
							@Pc(1054) byte local1054 = 0;
							if (local635.method1185(Static112.aClass39_1342)) {
								Static8.aClass39_151 = Static8.aClass39_151.method1181(Static112.aClass39_1342.method1175());
								local1054 = 1;
							} else if (local635.method1185(Static128.aClass39_1544)) {
								Static8.aClass39_151 = Static8.aClass39_151.method1181(Static128.aClass39_1544.method1175());
								local1054 = 2;
							} else if (local635.method1185(Static30.aClass39_463)) {
								Static8.aClass39_151 = Static8.aClass39_151.method1181(Static30.aClass39_463.method1175());
								local1054 = 3;
							} else if (local635.method1185(Static30.aClass39_469)) {
								local1054 = 4;
								Static8.aClass39_151 = Static8.aClass39_151.method1181(Static30.aClass39_469.method1175());
							} else if (local635.method1185(Static129.aClass39_1554)) {
								local1054 = 5;
								Static8.aClass39_151 = Static8.aClass39_151.method1181(Static129.aClass39_1554.method1175());
							} else if (Static122.anInt2972 != 0) {
								if (local635.method1185(Static112.aClass39_1344)) {
									Static8.aClass39_151 = Static8.aClass39_151.method1181(Static112.aClass39_1344.method1175());
									local1054 = 1;
								} else if (local635.method1185(Static128.aClass39_1543)) {
									Static8.aClass39_151 = Static8.aClass39_151.method1181(Static128.aClass39_1543.method1175());
									local1054 = 2;
								} else if (local635.method1185(Static30.aClass39_467)) {
									local1054 = 3;
									Static8.aClass39_151 = Static8.aClass39_151.method1181(Static30.aClass39_467.method1175());
								} else if (local635.method1185(Static30.aClass39_465)) {
									Static8.aClass39_151 = Static8.aClass39_151.method1181(Static30.aClass39_465.method1175());
									local1054 = 4;
								} else if (local635.method1185(Static129.aClass39_1557)) {
									Static8.aClass39_151 = Static8.aClass39_151.method1181(Static129.aClass39_1557.method1175());
									local1054 = 5;
								}
							}
							Static103.aClass1_Sub18_Sub1_5.method2203(244);
							Static103.aClass1_Sub18_Sub1_5.method2168(0);
							@Pc(1232) int local1232 = Static103.aClass1_Sub18_Sub1_5.anInt3078;
							Static103.aClass1_Sub18_Sub1_5.method2168(local637);
							Static103.aClass1_Sub18_Sub1_5.method2168(local1054);
							Static103.method1842(Static8.aClass39_151, Static103.aClass1_Sub18_Sub1_5);
							Static103.aClass1_Sub18_Sub1_5.method2180(Static103.aClass1_Sub18_Sub1_5.anInt3078 - local1232);
							if (Static114.anInt2845 == 2) {
								Static66.aBoolean145 = true;
								Static114.anInt2845 = 3;
								Static103.aClass1_Sub18_Sub1_5.method2203(161);
								Static103.aClass1_Sub18_Sub1_5.method2168(Static114.anInt2845);
								Static103.aClass1_Sub18_Sub1_5.method2168(Static24.anInt816);
								Static103.aClass1_Sub18_Sub1_5.method2168(Static11.anInt495);
							}
						}
						Static8.aClass39_151 = Static8.aClass39_147;
						Static113.aBoolean226 = true;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IIZLclient!pb;)V")
	public static void method1943(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class1_Sub1_Sub4_Sub4 arg2) {
		@Pc(7) int local7 = arg1 * arg1 + arg0 * arg0;
		if (local7 <= 4225 || local7 >= 90000) {
			Static31.method606(arg0, arg1, arg2);
			return;
		}
		@Pc(31) int local31 = Static75.anInt1879 + Static51.anInt1408 & 0x7FF;
		@Pc(35) int local35 = Class1_Sub1_Sub4_Sub2.anIntArray138[local31];
		@Pc(39) int local39 = Class1_Sub1_Sub4_Sub2.anIntArray142[local31];
		@Pc(47) int local47 = local39 * 256 / (Static39.anInt1165 + 256);
		@Pc(55) int local55 = local35 * 256 / (Static39.anInt1165 + 256);
		@Pc(66) int local66 = local47 * arg1 - local55 * arg0 >> 16;
		@Pc(76) int local76 = local55 * arg1 + local47 * arg0 >> 16;
		@Pc(82) double local82 = Math.atan2((double) local76, (double) local66);
		@Pc(88) int local88 = (int) (Math.sin(local82) * 63.0D);
		@Pc(94) int local94 = (int) (Math.cos(local82) * 57.0D);
		Static24.aClass1_Sub1_Sub4_Sub4_1.method1542(local88 + 98 - 10, -local94 + -20 + 83, local82);
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(B)V")
	public static void method1944() {
		aClass39_1336 = null;
		aClass39_1338 = null;
		anIntArray422 = null;
		aClass39_1337 = null;
		aClass39_1339 = null;
		aClass39_1341 = null;
		aFontMetrics1 = null;
		aClass39_1340 = null;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IIILclient!b;IILclient!ge;IB)V")
	public static void method1945(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class5 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class23 arg6, @OriginalArg(7) int arg7) {
		if (Static68.aBoolean149 && (Static51.aByteArrayArrayArray3[0][arg7][arg1] & 0x2) == 0) {
			if ((Static51.aByteArrayArrayArray3[arg0][arg7][arg1] & 0x10) != 0) {
				return;
			}
			if (Static100.method1808(arg7, arg0, arg1) != Static94.anInt2217) {
				return;
			}
		}
		if (arg0 < Static4.anInt161) {
			Static4.anInt161 = arg0;
		}
		@Pc(59) int local59 = Static51.anIntArrayArrayArray6[arg0][arg7 + 1][arg1];
		@Pc(67) int local67 = Static51.anIntArrayArrayArray6[arg0][arg7][arg1];
		@Pc(79) int local79 = Static51.anIntArrayArrayArray6[arg0][arg7 + 1][arg1 + 1];
		@Pc(89) int local89 = Static51.anIntArrayArrayArray6[arg0][arg7][arg1 + 1];
		@Pc(93) Class1_Sub1_Sub18 local93 = Static104.method1862(arg5);
		@Pc(106) int local106 = (arg1 << 7) + arg7 + (arg5 << 14) + 1073741824;
		if (local93.anInt3060 == 0) {
			local106 += Integer.MIN_VALUE;
		}
		@Pc(127) int local127 = local89 + local59 + local67 + local79 >> 2;
		@Pc(133) int local133 = arg2 + (arg4 << 6);
		if (local93.anInt3041 == 1) {
			local133 += 256;
		}
		if (local93.method2115()) {
			Static40.method700(arg4, arg1, arg0, local93, arg7);
		}
		@Pc(194) Class1_Sub1_Sub2 local194;
		if (arg2 != 22) {
			@Pc(283) int local283;
			if (arg2 == 10 || arg2 == 11) {
				if (local93.anInt3059 == -1 && local93.anIntArray477 == null) {
					local194 = local93.method2121(local59, 10, local67, arg4, local89, local79);
				} else {
					local194 = new Class1_Sub1_Sub2_Sub4(arg5, 10, arg4, local67, local59, local79, local89, local93.anInt3059, true, null);
				}
				if (local194 != null) {
					@Pc(286) int local286;
					if (arg4 == 1 || arg4 == 3) {
						local283 = local93.anInt3029;
						local286 = local93.anInt3039;
					} else {
						local283 = local93.anInt3039;
						local286 = local93.anInt3029;
					}
					@Pc(296) int local296 = 0;
					if (arg2 == 11) {
						local296 += 256;
					}
					if (arg3.method128(arg0, arg7, arg1, local127, local283, local286, local194, local296, local106, local133) && local93.aBoolean250) {
						@Pc(318) int local318 = 15;
						if (local194 instanceof Class1_Sub1_Sub2_Sub7) {
							local318 = ((Class1_Sub1_Sub2_Sub7) local194).method1365() / 4;
							if (local318 > 30) {
								local318 = 30;
							}
						}
						for (@Pc(336) int local336 = 0; local336 <= local283; local336++) {
							for (@Pc(340) int local340 = 0; local340 <= local286; local340++) {
								if (Static55.aByteArrayArrayArray5[arg0][arg7 + local336][local340 + arg1] < local318) {
									Static55.aByteArrayArrayArray5[arg0][arg7 + local336][local340 + arg1] = (byte) local318;
								}
							}
						}
					}
				}
				if (local93.anInt3033 != 0 && arg6 != null) {
					arg6.method770(arg1, arg7, arg4, local93.anInt3039, local93.anInt3029, local93.aBoolean243);
				}
			} else if (arg2 >= 12) {
				if (local93.anInt3059 == -1 && local93.anIntArray477 == null) {
					local194 = local93.method2121(local59, arg2, local67, arg4, local89, local79);
				} else {
					local194 = new Class1_Sub1_Sub2_Sub4(arg5, arg2, arg4, local67, local59, local79, local89, local93.anInt3059, true, null);
				}
				arg3.method128(arg0, arg7, arg1, local127, 1, 1, local194, 0, local106, local133);
				if (arg2 >= 12 && arg2 <= 17 && arg2 != 13 && arg0 > 0) {
					Static9.anIntArrayArrayArray9[arg0][arg7][arg1] |= 0x924;
				}
				if (local93.anInt3033 != 0 && arg6 != null) {
					arg6.method770(arg1, arg7, arg4, local93.anInt3039, local93.anInt3029, local93.aBoolean243);
				}
			} else if (arg2 == 0) {
				if (local93.anInt3059 == -1 && local93.anIntArray477 == null) {
					local194 = local93.method2121(local59, 0, local67, arg4, local89, local79);
				} else {
					local194 = new Class1_Sub1_Sub2_Sub4(arg5, 0, arg4, local67, local59, local79, local89, local93.anInt3059, true, null);
				}
				arg3.method133(arg0, arg7, arg1, local127, local194, null, Static96.anIntArray345[arg4], 0, local106, local133);
				if (arg4 == 0) {
					if (local93.aBoolean250) {
						Static55.aByteArrayArrayArray5[arg0][arg7][arg1] = 50;
						Static55.aByteArrayArrayArray5[arg0][arg7][arg1 + 1] = 50;
					}
					if (local93.aBoolean245) {
						Static9.anIntArrayArrayArray9[arg0][arg7][arg1] |= 0x249;
					}
				} else if (arg4 == 1) {
					if (local93.aBoolean250) {
						Static55.aByteArrayArrayArray5[arg0][arg7][arg1 + 1] = 50;
						Static55.aByteArrayArrayArray5[arg0][arg7 + 1][arg1 + 1] = 50;
					}
					if (local93.aBoolean245) {
						Static9.anIntArrayArrayArray9[arg0][arg7][arg1 + 1] |= 0x492;
					}
				} else if (arg4 == 2) {
					if (local93.aBoolean250) {
						Static55.aByteArrayArrayArray5[arg0][arg7 + 1][arg1] = 50;
						Static55.aByteArrayArrayArray5[arg0][arg7 + 1][arg1 + 1] = 50;
					}
					if (local93.aBoolean245) {
						Static9.anIntArrayArrayArray9[arg0][arg7 + 1][arg1] |= 0x249;
					}
				} else if (arg4 == 3) {
					if (local93.aBoolean250) {
						Static55.aByteArrayArrayArray5[arg0][arg7][arg1] = 50;
						Static55.aByteArrayArrayArray5[arg0][arg7 + 1][arg1] = 50;
					}
					if (local93.aBoolean245) {
						Static9.anIntArrayArrayArray9[arg0][arg7][arg1] |= 0x492;
					}
				}
				if (local93.anInt3033 != 0 && arg6 != null) {
					arg6.method769(arg2, arg7, arg4, local93.aBoolean243, arg1);
				}
				if (local93.anInt3057 != 16) {
					arg3.method103(arg0, arg7, arg1, local93.anInt3057);
				}
			} else if (arg2 == 1) {
				if (local93.anInt3059 == -1 && local93.anIntArray477 == null) {
					local194 = local93.method2121(local59, 1, local67, arg4, local89, local79);
				} else {
					local194 = new Class1_Sub1_Sub2_Sub4(arg5, 1, arg4, local67, local59, local79, local89, local93.anInt3059, true, null);
				}
				arg3.method133(arg0, arg7, arg1, local127, local194, null, Static86.anIntArray319[arg4], 0, local106, local133);
				if (local93.aBoolean250) {
					if (arg4 == 0) {
						Static55.aByteArrayArrayArray5[arg0][arg7][arg1 + 1] = 50;
					} else if (arg4 == 1) {
						Static55.aByteArrayArrayArray5[arg0][arg7 + 1][arg1 + 1] = 50;
					} else if (arg4 == 2) {
						Static55.aByteArrayArrayArray5[arg0][arg7 + 1][arg1] = 50;
					} else if (arg4 == 3) {
						Static55.aByteArrayArrayArray5[arg0][arg7][arg1] = 50;
					}
				}
				if (local93.anInt3033 != 0 && arg6 != null) {
					arg6.method769(arg2, arg7, arg4, local93.aBoolean243, arg1);
				}
			} else {
				@Pc(932) int local932;
				@Pc(961) Class1_Sub1_Sub2 local961;
				if (arg2 == 2) {
					local932 = arg4 + 1 & 0x3;
					@Pc(951) Class1_Sub1_Sub2 local951;
					if (local93.anInt3059 == -1 && local93.anIntArray477 == null) {
						local951 = local93.method2121(local59, 2, local67, arg4 + 4, local89, local79);
						local961 = local93.method2121(local59, 2, local67, local932, local89, local79);
					} else {
						local951 = new Class1_Sub1_Sub2_Sub4(arg5, 2, arg4 + 4, local67, local59, local79, local89, local93.anInt3059, true, null);
						local961 = new Class1_Sub1_Sub2_Sub4(arg5, 2, local932, local67, local59, local79, local89, local93.anInt3059, true, null);
					}
					arg3.method133(arg0, arg7, arg1, local127, local951, local961, Static96.anIntArray345[arg4], Static96.anIntArray345[local932], local106, local133);
					if (local93.aBoolean245) {
						if (arg4 == 0) {
							Static9.anIntArrayArrayArray9[arg0][arg7][arg1] |= 0x249;
							Static9.anIntArrayArrayArray9[arg0][arg7][arg1 + 1] |= 0x492;
						} else if (arg4 == 1) {
							Static9.anIntArrayArrayArray9[arg0][arg7][arg1 + 1] |= 0x492;
							Static9.anIntArrayArrayArray9[arg0][arg7 + 1][arg1] |= 0x249;
						} else if (arg4 == 2) {
							Static9.anIntArrayArrayArray9[arg0][arg7 + 1][arg1] |= 0x249;
							Static9.anIntArrayArrayArray9[arg0][arg7][arg1] |= 0x492;
						} else if (arg4 == 3) {
							Static9.anIntArrayArrayArray9[arg0][arg7][arg1] |= 0x492;
							Static9.anIntArrayArrayArray9[arg0][arg7][arg1] |= 0x249;
						}
					}
					if (local93.anInt3033 != 0 && arg6 != null) {
						arg6.method769(arg2, arg7, arg4, local93.aBoolean243, arg1);
					}
					if (local93.anInt3057 != 16) {
						arg3.method103(arg0, arg7, arg1, local93.anInt3057);
					}
				} else if (arg2 == 3) {
					if (local93.anInt3059 == -1 && local93.anIntArray477 == null) {
						local194 = local93.method2121(local59, 3, local67, arg4, local89, local79);
					} else {
						local194 = new Class1_Sub1_Sub2_Sub4(arg5, 3, arg4, local67, local59, local79, local89, local93.anInt3059, true, null);
					}
					arg3.method133(arg0, arg7, arg1, local127, local194, null, Static86.anIntArray319[arg4], 0, local106, local133);
					if (local93.aBoolean250) {
						if (arg4 == 0) {
							Static55.aByteArrayArrayArray5[arg0][arg7][arg1 + 1] = 50;
						} else if (arg4 == 1) {
							Static55.aByteArrayArrayArray5[arg0][arg7 + 1][arg1 + 1] = 50;
						} else if (arg4 == 2) {
							Static55.aByteArrayArrayArray5[arg0][arg7 + 1][arg1] = 50;
						} else if (arg4 == 3) {
							Static55.aByteArrayArrayArray5[arg0][arg7][arg1] = 50;
						}
					}
					if (local93.anInt3033 != 0 && arg6 != null) {
						arg6.method769(arg2, arg7, arg4, local93.aBoolean243, arg1);
					}
				} else if (arg2 == 9) {
					if (local93.anInt3059 == -1 && local93.anIntArray477 == null) {
						local194 = local93.method2121(local59, arg2, local67, arg4, local89, local79);
					} else {
						local194 = new Class1_Sub1_Sub2_Sub4(arg5, arg2, arg4, local67, local59, local79, local89, local93.anInt3059, true, null);
					}
					arg3.method128(arg0, arg7, arg1, local127, 1, 1, local194, 0, local106, local133);
					if (local93.anInt3033 != 0 && arg6 != null) {
						arg6.method770(arg1, arg7, arg4, local93.anInt3039, local93.anInt3029, local93.aBoolean243);
					}
				} else {
					if (local93.aBoolean248) {
						if (arg4 == 1) {
							local932 = local89;
							local89 = local79;
							local79 = local59;
							local59 = local67;
							local67 = local932;
						} else if (arg4 == 2) {
							local932 = local89;
							local89 = local59;
							local59 = local932;
							@Pc(1424) int local1424 = local79;
							local79 = local67;
							local67 = local1424;
						} else if (arg4 == 3) {
							local932 = local89;
							local89 = local67;
							local67 = local59;
							local59 = local79;
							local79 = local932;
						}
					}
					if (arg2 == 4) {
						if (local93.anInt3059 == -1 && local93.anIntArray477 == null) {
							local194 = local93.method2121(local59, 4, local67, 0, local89, local79);
						} else {
							local194 = new Class1_Sub1_Sub2_Sub4(arg5, 4, 0, local67, local59, local79, local89, local93.anInt3059, true, null);
						}
						arg3.method131(arg0, arg7, arg1, local127, local194, Static96.anIntArray345[arg4], arg4 * 512, 0, 0, local106, local133);
					} else if (arg2 == 5) {
						local932 = 16;
						local283 = arg3.method141(arg0, arg7, arg1);
						if (local283 != 0) {
							local932 = Static104.method1862(local283 >> 14 & 0x7FFF).anInt3057;
						}
						if (local93.anInt3059 == -1 && local93.anIntArray477 == null) {
							local961 = local93.method2121(local59, 4, local67, 0, local89, local79);
						} else {
							local961 = new Class1_Sub1_Sub2_Sub4(arg5, 4, 0, local67, local59, local79, local89, local93.anInt3059, true, null);
						}
						arg3.method131(arg0, arg7, arg1, local127, local961, Static96.anIntArray345[arg4], arg4 * 512, local932 * Static126.anIntArray473[arg4], local932 * Static123.anIntArray468[arg4], local106, local133);
					} else if (arg2 == 6) {
						if (local93.anInt3059 == -1 && local93.anIntArray477 == null) {
							local194 = local93.method2121(local59, 4, local67, 0, local89, local79);
						} else {
							local194 = new Class1_Sub1_Sub2_Sub4(arg5, 4, 0, local67, local59, local79, local89, local93.anInt3059, true, null);
						}
						arg3.method131(arg0, arg7, arg1, local127, local194, 256, arg4, 0, 0, local106, local133);
					} else if (arg2 == 7) {
						if (local93.anInt3059 == -1 && local93.anIntArray477 == null) {
							local194 = local93.method2121(local59, 4, local67, 0, local89, local79);
						} else {
							local194 = new Class1_Sub1_Sub2_Sub4(arg5, 4, 0, local67, local59, local79, local89, local93.anInt3059, true, null);
						}
						arg3.method131(arg0, arg7, arg1, local127, local194, 512, arg4, 0, 0, local106, local133);
					} else if (arg2 == 8) {
						if (local93.anInt3059 == -1 && local93.anIntArray477 == null) {
							local194 = local93.method2121(local59, 4, local67, 0, local89, local79);
						} else {
							local194 = new Class1_Sub1_Sub2_Sub4(arg5, 4, 0, local67, local59, local79, local89, local93.anInt3059, true, null);
						}
						arg3.method131(arg0, arg7, arg1, local127, local194, 768, arg4, 0, 0, local106, local133);
					}
				}
			}
		} else if (!Static68.aBoolean149 || local93.anInt3060 != 0 || local93.anInt3033 == 1 || local93.aBoolean251) {
			if (local93.anInt3059 == -1 && local93.anIntArray477 == null) {
				local194 = local93.method2121(local59, 22, local67, arg4, local89, local79);
			} else {
				local194 = new Class1_Sub1_Sub2_Sub4(arg5, 22, arg4, local67, local59, local79, local89, local93.anInt3059, true, null);
			}
			arg3.method134(arg0, arg7, arg1, local127, local194, local106, local133);
			if (local93.anInt3033 == 1 && arg6 != null) {
				arg6.method775(arg1, arg7);
			}
		}
	}
}
