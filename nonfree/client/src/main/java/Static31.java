import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!fa", name = "k", descriptor = "I")
	public static int anInt795;

	@OriginalMember(owner = "client!fa", name = "n", descriptor = "Lclient!pe;")
	public static Class26_Sub1 aClass26_Sub1_26;

	@OriginalMember(owner = "client!fa", name = "g", descriptor = "I")
	public static final int anInt793 = 50;

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "[I")
	public static int[] anIntArray85 = new int[anInt793];

	@OriginalMember(owner = "client!fa", name = "d", descriptor = "I")
	public static int anInt791 = 0;

	@OriginalMember(owner = "client!fa", name = "e", descriptor = "[I")
	public static int[] anIntArray86 = new int[anInt793];

	@OriginalMember(owner = "client!fa", name = "h", descriptor = "[I")
	public static int[] anIntArray87 = new int[anInt793];

	@OriginalMember(owner = "client!fa", name = "j", descriptor = "[I")
	public static int[] anIntArray88 = new int[anInt793];

	@OriginalMember(owner = "client!fa", name = "l", descriptor = "I")
	public static volatile int anInt796 = -1;

	@OriginalMember(owner = "client!fa", name = "m", descriptor = "[I")
	public static int[] anIntArray89 = new int[anInt793];

	@OriginalMember(owner = "client!fa", name = "o", descriptor = "Lclient!u;")
	public static Class74 aClass74_575 = Static72.method1077("Welt");

	@OriginalMember(owner = "client!fa", name = "p", descriptor = "[Lclient!u;")
	public static Class74[] aClass74Array5 = new Class74[anInt793];

	@OriginalMember(owner = "client!fa", name = "q", descriptor = "Lclient!u;")
	public static Class74 aClass74_576 = Static72.method1077("Benutzen Sie die (WPasswort -=ndern(W Option");

	@OriginalMember(owner = "client!fa", name = "r", descriptor = "[I")
	public static int[] anIntArray90 = new int[anInt793];

	@OriginalMember(owner = "client!fa", name = "s", descriptor = "[I")
	public static int[] anIntArray91 = new int[anInt793];

	@OriginalMember(owner = "client!fa", name = "u", descriptor = "Lclient!u;")
	public static Class74 aClass74_577 = Static72.method1077("m-Ochte mit Ihnen handeln)3");

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Z)V")
	public static void method574() {
		if (Static98.aClass22_2 != null) {
			Static98.aClass22_2.method1087();
		}
		if (Static79.aClass22_1 != null) {
			Static79.aClass22_1.method1087();
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILclient!ve;)V")
	public static void method575(@OriginalArg(1) Class2_Sub2_Sub17 arg0) {
		@Pc(4) int local4 = arg0.anInt2794 >> 16;
		if (local4 == Static42.anInt982 || Static83.anInt1804 == local4) {
			Static55.aBoolean16 = true;
		}
		if (local4 == Static66.anInt1458 || Static16.anIntArray49[Static42.anInt980] == local4) {
			Static116.aBoolean107 = true;
		}
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(Z)V")
	public static void method576() {
		anIntArray87 = null;
		aClass26_Sub1_26 = null;
		anIntArray90 = null;
		anIntArray86 = null;
		aClass74_577 = null;
		aClass74_575 = null;
		aClass74_576 = null;
		anIntArray85 = null;
		anIntArray91 = null;
		aClass74Array5 = null;
		anIntArray88 = null;
		anIntArray89 = null;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(B)V")
	public static void method577() {
		while (Static103.method1588()) {
			if (Static90.anInt1905 != -1 && Static7.anInt2699 == Static90.anInt1905) {
				if (Static39.anInt951 == 85 && Static97.aClass74_1722.method1695() > 0) {
					Static97.aClass74_1722 = Static97.aClass74_1722.method1706(0, Static97.aClass74_1722.method1695() - 1);
				}
				if ((Static48.method792(Static27.anInt676) || Static27.anInt676 == 32) && Static97.aClass74_1722.method1695() < 12) {
					Static97.aClass74_1722 = Static97.aClass74_1722.method1702(Static27.anInt676);
				}
			} else {
				@Pc(111) int local111;
				if (Static29.aBoolean25) {
					if (Static39.anInt951 == 85 && Static97.aClass74_1733.method1695() > 0) {
						Static97.aClass74_1733 = Static97.aClass74_1733.method1706(0, Static97.aClass74_1733.method1695() - 1);
						Static55.aBoolean16 = true;
					}
					if (Static98.method1468(Static27.anInt676) && Static97.aClass74_1733.method1695() < 80) {
						Static97.aClass74_1733 = Static97.aClass74_1733.method1702(Static27.anInt676);
						Static55.aBoolean16 = true;
					}
					if (Static39.anInt951 == 84) {
						Static55.aBoolean16 = true;
						Static29.aBoolean25 = false;
						@Pc(1222) long local1222;
						if (Static121.anInt2602 == 1) {
							local1222 = Static97.aClass74_1733.method1696();
							Static29.method520(local1222);
						}
						if (Static121.anInt2602 == 2 && Static65.anInt1450 > 0) {
							local1222 = Static97.aClass74_1733.method1696();
							Static71.method1073(local1222);
						}
						if (Static121.anInt2602 == 3 && Static97.aClass74_1733.method1695() > 0) {
							Static128.aClass2_Sub10_Sub1_3.method1533(69);
							Static128.aClass2_Sub10_Sub1_3.method1486(0);
							local111 = Static128.aClass2_Sub10_Sub1_3.anInt2187;
							Static128.aClass2_Sub10_Sub1_3.method1495(Static32.aLong34);
							Static43.method680(Static97.aClass74_1733, Static128.aClass2_Sub10_Sub1_3);
							Static128.aClass2_Sub10_Sub1_3.method1510(Static128.aClass2_Sub10_Sub1_3.anInt2187 - local111);
							if (Static41.anInt964 == 2) {
								Static36.aBoolean29 = true;
								Static41.anInt964 = 1;
								Static128.aClass2_Sub10_Sub1_3.method1533(37);
								Static128.aClass2_Sub10_Sub1_3.method1486(Static65.anInt1443);
								Static128.aClass2_Sub10_Sub1_3.method1486(Static41.anInt964);
								Static128.aClass2_Sub10_Sub1_3.method1486(Static107.anInt2345);
							}
						}
						if (Static121.anInt2602 == 4 && Static101.anInt2247 < 100) {
							local1222 = Static97.aClass74_1733.method1696();
							Static42.method675(local1222);
						}
						if (Static121.anInt2602 == 5 && Static101.anInt2247 > 0) {
							local1222 = Static97.aClass74_1733.method1696();
							Static67.method1030(local1222);
						}
					}
				} else if (Static36.anInt869 == 1) {
					if (Static39.anInt951 == 85 && Static97.aClass74_1724.method1695() > 0) {
						Static97.aClass74_1724 = Static97.aClass74_1724.method1706(0, Static97.aClass74_1724.method1695() - 1);
						Static55.aBoolean16 = true;
					}
					if (Static120.method1768(Static27.anInt676) && Static97.aClass74_1724.method1695() < 10) {
						Static97.aClass74_1724 = Static97.aClass74_1724.method1702(Static27.anInt676);
						Static55.aBoolean16 = true;
					}
					if (Static39.anInt951 == 84) {
						if (Static97.aClass74_1724.method1695() > 0) {
							local111 = 0;
							if (Static97.aClass74_1724.method1727()) {
								local111 = Static97.aClass74_1724.method1704();
							}
							Static128.aClass2_Sub10_Sub1_3.method1533(203);
							Static128.aClass2_Sub10_Sub1_3.method1497(local111);
						}
						Static55.aBoolean16 = true;
						Static36.anInt869 = 0;
					}
				} else if (Static36.anInt869 == 2) {
					if (Static39.anInt951 == 85 && Static97.aClass74_1724.method1695() > 0) {
						Static97.aClass74_1724 = Static97.aClass74_1724.method1706(0, Static97.aClass74_1724.method1695() - 1);
						Static55.aBoolean16 = true;
					}
					if ((Static48.method792(Static27.anInt676) || Static27.anInt676 == 32) && Static97.aClass74_1724.method1695() < 12) {
						Static97.aClass74_1724 = Static97.aClass74_1724.method1702(Static27.anInt676);
						Static55.aBoolean16 = true;
					}
					if (Static39.anInt951 == 84) {
						if (Static97.aClass74_1724.method1695() > 0) {
							Static128.aClass2_Sub10_Sub1_3.method1533(156);
							Static128.aClass2_Sub10_Sub1_3.method1495(Static97.aClass74_1724.method1696());
						}
						Static36.anInt869 = 0;
						Static55.aBoolean16 = true;
					}
				} else if (Static36.anInt869 == 3) {
					if (Static39.anInt951 == 85 && Static97.aClass74_1724.method1695() > 0) {
						Static97.aClass74_1724 = Static97.aClass74_1724.method1706(0, Static97.aClass74_1724.method1695() - 1);
						Static55.aBoolean16 = true;
					}
					if (Static98.method1468(Static27.anInt676) && Static97.aClass74_1724.method1695() < 40) {
						Static97.aClass74_1724 = Static97.aClass74_1724.method1702(Static27.anInt676);
						Static55.aBoolean16 = true;
					}
				} else if (Static36.anInt869 == 4) {
					if (Static39.anInt951 == 85 && Static97.aClass74_1724.method1695() > 0) {
						Static97.aClass74_1724 = Static97.aClass74_1724.method1706(0, Static97.aClass74_1724.method1695() - 1);
						Static55.aBoolean16 = true;
					}
					if ((Static98.method1468(Static27.anInt676) || Static27.anInt676 == 32) && Static97.aClass74_1724.method1695() < 80) {
						Static97.aClass74_1724 = Static97.aClass74_1724.method1702(Static27.anInt676);
						Static55.aBoolean16 = true;
					}
					if (Static39.anInt951 == 84) {
						if (Static97.aClass74_1724.method1695() > 0) {
							Static128.aClass2_Sub10_Sub1_3.method1533(108);
							Static128.aClass2_Sub10_Sub1_3.method1486(Static97.aClass74_1724.method1695() + 1);
							Static128.aClass2_Sub10_Sub1_3.method1494(Static97.aClass74_1724);
						}
						Static55.aBoolean16 = true;
						Static36.anInt869 = 0;
					}
				} else if (Static42.anInt982 == -1 && Static14.anInt401 == -1) {
					if (Static37.anInt1938 != 0 || Static5.anInt64 > 1) {
						Static107.method1607();
					}
					if (Static39.anInt951 == 85 && Static97.aClass74_1737.method1695() > 0) {
						Static97.aClass74_1737 = Static97.aClass74_1737.method1706(0, Static97.aClass74_1737.method1695() - 1);
						Static55.aBoolean16 = true;
					}
					if (Static98.method1468(Static27.anInt676) && Static97.aClass74_1737.method1695() < 80) {
						Static97.aClass74_1737 = Static97.aClass74_1737.method1702(Static27.anInt676);
						Static55.aBoolean16 = true;
					}
					if (Static39.anInt951 == 84 && Static97.aClass74_1737.method1695() > 0) {
						if (Static37.anInt1938 != 0 || Static5.anInt64 > 1) {
							Static24.aClass74Array4[Static50.anInt1174++] = Static97.aClass74_1737;
							Static18.anInt558 = -1;
							if (Static50.anInt1174 >= 20) {
								Static50.anInt1174 = 0;
							}
						}
						if (Static5.anInt64 == 2) {
							if (Static97.aClass74_1737.method1701(Static84.aClass74_1238)) {
								System.gc();
							}
							if (Static97.aClass74_1737.method1701(Static47.aClass74_807)) {
								Static79.method1244();
							}
							if (Static97.aClass74_1737.method1701(Static70.aClass74_1085)) {
								Static87.aBoolean50 = true;
							}
							if (Static97.aClass74_1737.method1701(Static32.aClass74_603)) {
								Static87.aBoolean50 = false;
							}
							if (Static97.aClass74_1737.method1701(Static62.aClass74_987)) {
								for (local111 = 0; local111 < 4; local111++) {
									for (@Pc(418) int local418 = 1; local418 < 103; local418++) {
										for (@Pc(422) int local422 = 1; local422 < 103; local422++) {
											Static50.aClass55Array1[local111].anIntArrayArray18[local418][local422] = 0;
										}
									}
								}
							}
							if (Static97.aClass74_1737.method1701(Static81.aClass74_1219) && Static37.anInt1938 == 2) {
								throw new RuntimeException();
							}
							if (Static97.aClass74_1737.method1701(Static121.aClass74_1623)) {
								Static67.aBoolean58 = true;
							}
						}
						if (Static97.aClass74_1737.method1719(Static85.aClass74_1240)) {
							Static128.aClass2_Sub10_Sub1_3.method1533(252);
							Static128.aClass2_Sub10_Sub1_3.method1486(Static97.aClass74_1737.method1695() - 1);
							Static128.aClass2_Sub10_Sub1_3.method1494(Static97.aClass74_1737.method1697(2));
						} else {
							@Pc(506) Class74 local506 = Static97.aClass74_1737.method1729();
							@Pc(508) byte local508 = 0;
							if (local506.method1719(Static113.aClass74_1546)) {
								Static97.aClass74_1737 = Static97.aClass74_1737.method1697(Static113.aClass74_1546.method1695());
								local508 = 0;
							} else if (local506.method1719(Static33.aClass74_617)) {
								local508 = 1;
								Static97.aClass74_1737 = Static97.aClass74_1737.method1697(Static33.aClass74_617.method1695());
							} else if (local506.method1719(Static78.aClass74_1176)) {
								local508 = 2;
								Static97.aClass74_1737 = Static97.aClass74_1737.method1697(Static78.aClass74_1176.method1695());
							} else if (local506.method1719(Static91.aClass74_1304)) {
								Static97.aClass74_1737 = Static97.aClass74_1737.method1697(Static91.aClass74_1304.method1695());
								local508 = 3;
							} else if (local506.method1719(Static36.aClass74_651)) {
								local508 = 4;
								Static97.aClass74_1737 = Static97.aClass74_1737.method1697(Static36.aClass74_651.method1695());
							} else if (local506.method1719(Static6.aClass74_125)) {
								local508 = 5;
								Static97.aClass74_1737 = Static97.aClass74_1737.method1697(Static6.aClass74_125.method1695());
							} else if (local506.method1719(Static103.aClass74_1480)) {
								Static97.aClass74_1737 = Static97.aClass74_1737.method1697(Static103.aClass74_1480.method1695());
								local508 = 6;
							} else if (local506.method1719(Static98.aClass74_1418)) {
								Static97.aClass74_1737 = Static97.aClass74_1737.method1697(Static98.aClass74_1418.method1695());
								local508 = 7;
							} else if (local506.method1719(Static25.aClass74_521)) {
								Static97.aClass74_1737 = Static97.aClass74_1737.method1697(Static25.aClass74_521.method1695());
								local508 = 8;
							} else if (local506.method1719(Static80.aClass74_1214)) {
								Static97.aClass74_1737 = Static97.aClass74_1737.method1697(Static80.aClass74_1214.method1695());
								local508 = 9;
							} else if (local506.method1719(Static5.aClass74_46)) {
								local508 = 10;
								Static97.aClass74_1737 = Static97.aClass74_1737.method1697(Static5.aClass74_46.method1695());
							} else if (local506.method1719(Static9.aClass74_232)) {
								Static97.aClass74_1737 = Static97.aClass74_1737.method1697(Static9.aClass74_232.method1695());
								local508 = 11;
							} else if (Static95.anInt2095 != 0) {
								if (local506.method1719(Static113.aClass74_1549)) {
									local508 = 0;
									Static97.aClass74_1737 = Static97.aClass74_1737.method1697(Static113.aClass74_1549.method1695());
								} else if (local506.method1719(Static33.aClass74_616)) {
									Static97.aClass74_1737 = Static97.aClass74_1737.method1697(Static33.aClass74_616.method1695());
									local508 = 1;
								} else if (local506.method1719(Static78.aClass74_1180)) {
									local508 = 2;
									Static97.aClass74_1737 = Static97.aClass74_1737.method1697(Static78.aClass74_1180.method1695());
								} else if (local506.method1719(Static91.aClass74_1306)) {
									local508 = 3;
									Static97.aClass74_1737 = Static97.aClass74_1737.method1697(Static91.aClass74_1306.method1695());
								} else if (local506.method1719(Static36.aClass74_652)) {
									local508 = 4;
									Static97.aClass74_1737 = Static97.aClass74_1737.method1697(Static36.aClass74_652.method1695());
								} else if (local506.method1719(Static6.aClass74_123)) {
									local508 = 5;
									Static97.aClass74_1737 = Static97.aClass74_1737.method1697(Static6.aClass74_123.method1695());
								} else if (local506.method1719(Static103.aClass74_1474)) {
									Static97.aClass74_1737 = Static97.aClass74_1737.method1697(Static103.aClass74_1474.method1695());
									local508 = 6;
								} else if (local506.method1719(Static98.aClass74_1416)) {
									Static97.aClass74_1737 = Static97.aClass74_1737.method1697(Static98.aClass74_1416.method1695());
									local508 = 7;
								} else if (local506.method1719(Static25.aClass74_522)) {
									local508 = 8;
									Static97.aClass74_1737 = Static97.aClass74_1737.method1697(Static25.aClass74_522.method1695());
								} else if (local506.method1719(Static80.aClass74_1218)) {
									local508 = 9;
									Static97.aClass74_1737 = Static97.aClass74_1737.method1697(Static80.aClass74_1218.method1695());
								} else if (local506.method1719(Static5.aClass74_48)) {
									Static97.aClass74_1737 = Static97.aClass74_1737.method1697(Static5.aClass74_48.method1695());
									local508 = 10;
								} else if (local506.method1719(Static9.aClass74_229)) {
									Static97.aClass74_1737 = Static97.aClass74_1737.method1697(Static9.aClass74_229.method1695());
									local508 = 11;
								}
							}
							local506 = Static97.aClass74_1737.method1729();
							@Pc(898) byte local898 = 0;
							if (local506.method1719(Static62.aClass74_993)) {
								Static97.aClass74_1737 = Static97.aClass74_1737.method1697(Static62.aClass74_993.method1695());
								local898 = 1;
							} else if (local506.method1719(Static65.aClass74_1015)) {
								Static97.aClass74_1737 = Static97.aClass74_1737.method1697(Static65.aClass74_1015.method1695());
								local898 = 2;
							} else if (local506.method1719(Static66.aClass74_1027)) {
								local898 = 3;
								Static97.aClass74_1737 = Static97.aClass74_1737.method1697(Static66.aClass74_1027.method1695());
							} else if (local506.method1719(Static50.aClass74_865)) {
								local898 = 4;
								Static97.aClass74_1737 = Static97.aClass74_1737.method1697(Static50.aClass74_865.method1695());
							} else if (local506.method1719(Static23.aClass74_505)) {
								local898 = 5;
								Static97.aClass74_1737 = Static97.aClass74_1737.method1697(Static23.aClass74_505.method1695());
							} else if (Static95.anInt2095 != 0) {
								if (local506.method1719(Static62.aClass74_992)) {
									Static97.aClass74_1737 = Static97.aClass74_1737.method1697(Static62.aClass74_992.method1695());
									local898 = 1;
								} else if (local506.method1719(Static65.aClass74_1007)) {
									local898 = 2;
									Static97.aClass74_1737 = Static97.aClass74_1737.method1697(Static65.aClass74_1007.method1695());
								} else if (local506.method1719(Static66.aClass74_1026)) {
									Static97.aClass74_1737 = Static97.aClass74_1737.method1697(Static66.aClass74_1026.method1695());
									local898 = 3;
								} else if (local506.method1719(Static50.aClass74_868)) {
									local898 = 4;
									Static97.aClass74_1737 = Static97.aClass74_1737.method1697(Static50.aClass74_868.method1695());
								} else if (local506.method1719(Static23.aClass74_507)) {
									local898 = 5;
									Static97.aClass74_1737 = Static97.aClass74_1737.method1697(Static23.aClass74_507.method1695());
								}
							}
							Static128.aClass2_Sub10_Sub1_3.method1533(62);
							Static128.aClass2_Sub10_Sub1_3.method1486(0);
							@Pc(1072) int local1072 = Static128.aClass2_Sub10_Sub1_3.anInt2187;
							Static128.aClass2_Sub10_Sub1_3.method1486(local508);
							Static128.aClass2_Sub10_Sub1_3.method1486(local898);
							Static43.method680(Static97.aClass74_1737, Static128.aClass2_Sub10_Sub1_3);
							Static128.aClass2_Sub10_Sub1_3.method1510(Static128.aClass2_Sub10_Sub1_3.anInt2187 - local1072);
							if (Static65.anInt1443 == 2) {
								Static65.anInt1443 = 3;
								Static36.aBoolean29 = true;
								Static128.aClass2_Sub10_Sub1_3.method1533(37);
								Static128.aClass2_Sub10_Sub1_3.method1486(Static65.anInt1443);
								Static128.aClass2_Sub10_Sub1_3.method1486(Static41.anInt964);
								Static128.aClass2_Sub10_Sub1_3.method1486(Static107.anInt2345);
							}
						}
						Static55.aBoolean16 = true;
						Static97.aClass74_1737 = Static97.aClass74_1736;
					}
				}
			}
		}
	}
}
