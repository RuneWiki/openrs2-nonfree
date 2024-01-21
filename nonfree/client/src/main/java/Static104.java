import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!nc", name = "u", descriptor = "I")
	public static int anInt2685;

	@OriginalMember(owner = "client!nc", name = "s", descriptor = "Lclient!eh;")
	public static Class28 aClass28_862 = Static170.method3101("(U0a )2 in: ");

	@OriginalMember(owner = "client!nc", name = "t", descriptor = "Lclient!pa;")
	public static Class63 aClass63_18 = new Class63(64);

	@OriginalMember(owner = "client!nc", name = "A", descriptor = "Lclient!eh;")
	public static Class28 aClass28_863 = Static170.method3101(" loggt sich ein)3");

	@OriginalMember(owner = "client!nc", name = "C", descriptor = "Lclient!ea;")
	public static Class23 aClass23_10 = new Class23();

	@OriginalMember(owner = "client!nc", name = "D", descriptor = "Lclient!eh;")
	private static Class28 aClass28_864 = Static170.method3101("Please subscribe)1 or use a different world)3");

	@OriginalMember(owner = "client!nc", name = "E", descriptor = "Lclient!eh;")
	public static Class28 aClass28_865 = aClass28_864;

	@OriginalMember(owner = "client!nc", name = "F", descriptor = "I")
	public static volatile int anInt2690 = -1;

	@OriginalMember(owner = "client!nc", name = "G", descriptor = "I")
	public static int anInt2691 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!nc", name = "H", descriptor = "Lclient!eh;")
	public static Class28 aClass28_866 = Static170.method3101("Bitte warten Sie)3)3)3");

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "(I)V")
	public static void method2128() {
		try {
			if (Static86.anInt2525 == 0) {
				if (Static52.aClass38_1 != null) {
					Static52.aClass38_1.method1632();
					Static52.aClass38_1 = null;
				}
				Static146.aClass61_7 = null;
				Static86.anInt2525 = 1;
				Static161.aBoolean186 = false;
				Static160.anInt3909 = 0;
			}
			if (Static86.anInt2525 == 1) {
				if (Static146.aClass61_7 == null) {
					Static146.aClass61_7 = Static123.aClass68_4.method2528(Static128.anInt3275, Static81.aString1);
				}
				if (Static146.aClass61_7.anInt2845 == 2) {
					throw new IOException();
				}
				if (Static146.aClass61_7.anInt2845 == 1) {
					Static52.aClass38_1 = new Class38((Socket) Static146.aClass61_7.anObject4, Static123.aClass68_4);
					Static86.anInt2525 = 2;
					Static146.aClass61_7 = null;
				}
			}
			if (Static86.anInt2525 == 2) {
				@Pc(70) long local70 = Static151.aLong124 = Static140.aClass28_1189.method924();
				@Pc(77) int local77 = (int) (local70 >> 16 & 0x1FL);
				Static51.aClass3_Sub8_Sub1_2.anInt1948 = 0;
				Static51.aClass3_Sub8_Sub1_2.method1550(14);
				Static51.aClass3_Sub8_Sub1_2.method1550(local77);
				Static52.aClass38_1.method1633(2, Static51.aClass3_Sub8_Sub1_2.aByteArray19);
				Static18.aClass3_Sub8_Sub1_1.anInt1948 = 0;
				Static86.anInt2525 = 3;
			}
			@Pc(117) int local117;
			if (Static86.anInt2525 == 3) {
				if (Static166.aClass30_2 != null) {
					Static166.aClass30_2.method2681();
				}
				if (Static45.aClass30_1 != null) {
					Static45.aClass30_1.method2681();
				}
				local117 = Static52.aClass38_1.method1635();
				if (Static166.aClass30_2 != null) {
					Static166.aClass30_2.method2681();
				}
				if (Static45.aClass30_1 != null) {
					Static45.aClass30_1.method2681();
				}
				if (local117 != 0) {
					Static95.method2090(local117);
					return;
				}
				Static18.aClass3_Sub8_Sub1_1.anInt1948 = 0;
				Static86.anInt2525 = 4;
			}
			if (Static86.anInt2525 == 4) {
				if (Static18.aClass3_Sub8_Sub1_1.anInt1948 < 8) {
					local117 = Static52.aClass38_1.method1634();
					if (local117 > 8 - Static18.aClass3_Sub8_Sub1_1.anInt1948) {
						local117 = 8 - Static18.aClass3_Sub8_Sub1_1.anInt1948;
					}
					if (local117 > 0) {
						Static52.aClass38_1.method1636(Static18.aClass3_Sub8_Sub1_1.anInt1948, Static18.aClass3_Sub8_Sub1_1.aByteArray19, local117);
						Static18.aClass3_Sub8_Sub1_1.anInt1948 += local117;
					}
				}
				if (Static18.aClass3_Sub8_Sub1_1.anInt1948 == 8) {
					Static18.aClass3_Sub8_Sub1_1.anInt1948 = 0;
					Static7.aLong9 = Static18.aClass3_Sub8_Sub1_1.method1511();
					Static86.anInt2525 = 5;
				}
			}
			if (Static86.anInt2525 == 5) {
				Static51.aClass3_Sub8_Sub1_2.anInt1948 = 0;
				@Pc(209) int[] local209 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static7.aLong9 >> 32), (int) Static7.aLong9 };
				Static51.aClass3_Sub8_Sub1_2.method1550(10);
				Static51.aClass3_Sub8_Sub1_2.method1547(local209[0]);
				Static51.aClass3_Sub8_Sub1_2.method1547(local209[1]);
				Static51.aClass3_Sub8_Sub1_2.method1547(local209[2]);
				Static51.aClass3_Sub8_Sub1_2.method1547(local209[3]);
				Static51.aClass3_Sub8_Sub1_2.method1541(Static140.aClass28_1189.method924());
				Static51.aClass3_Sub8_Sub1_2.method1538(Static140.aClass28_1183);
				Static51.aClass3_Sub8_Sub1_2.method1529(Static150.aBigInteger2, Static146.aBigInteger1);
				Static85.aClass3_Sub8_Sub1_3.anInt1948 = 0;
				if (Static137.anInt3514 == 40) {
					Static85.aClass3_Sub8_Sub1_3.method1550(18);
				} else {
					Static85.aClass3_Sub8_Sub1_3.method1550(16);
				}
				Static85.aClass3_Sub8_Sub1_3.method1550(Static51.aClass3_Sub8_Sub1_2.anInt1948 + 93);
				Static85.aClass3_Sub8_Sub1_3.method1547(481);
				Static85.aClass3_Sub8_Sub1_3.method1550(Static179.aBoolean202 ? 1 : 0);
				Static82.method1882(Static85.aClass3_Sub8_Sub1_3);
				Static85.aClass3_Sub8_Sub1_3.method1547(Static181.aClass7_Sub1_19.anInt1207);
				Static85.aClass3_Sub8_Sub1_3.method1547(Static79.aClass7_Sub1_11.anInt1207);
				Static85.aClass3_Sub8_Sub1_3.method1547(Static108.aClass7_Sub1_12.anInt1207);
				Static85.aClass3_Sub8_Sub1_3.method1547(Static144.aClass7_Sub1_7.anInt1207);
				Static85.aClass3_Sub8_Sub1_3.method1547(Static127.aClass7_Sub1_14.anInt1207);
				Static85.aClass3_Sub8_Sub1_3.method1547(Static76.aClass7_Sub1_10.anInt1207);
				Static85.aClass3_Sub8_Sub1_3.method1547(Static164.aClass7_Sub1_17.anInt1207);
				Static85.aClass3_Sub8_Sub1_3.method1547(Static41.aClass7_Sub1_5.anInt1207);
				Static85.aClass3_Sub8_Sub1_3.method1547(Static2.aClass7_Sub1_1.anInt1207);
				Static85.aClass3_Sub8_Sub1_3.method1547(Static177.aClass7_Sub1_18.anInt1207);
				Static85.aClass3_Sub8_Sub1_3.method1547(Static21.aClass7_Sub1_3.anInt1207);
				Static85.aClass3_Sub8_Sub1_3.method1547(Static61.aClass7_Sub1_8.anInt1207);
				Static85.aClass3_Sub8_Sub1_3.method1547(Static127.aClass7_Sub1_13.anInt1207);
				Static85.aClass3_Sub8_Sub1_3.method1547(Static7.aClass7_Sub1_2.anInt1207);
				Static85.aClass3_Sub8_Sub1_3.method1547(Static68.aClass7_Sub1_9.anInt1207);
				Static85.aClass3_Sub8_Sub1_3.method1547(Static132.aClass7_Sub1_15.anInt1207);
				Static85.aClass3_Sub8_Sub1_3.method1512(Static51.aClass3_Sub8_Sub1_2.aByteArray19, Static51.aClass3_Sub8_Sub1_2.anInt1948);
				Static52.aClass38_1.method1633(Static85.aClass3_Sub8_Sub1_3.anInt1948, Static85.aClass3_Sub8_Sub1_3.aByteArray19);
				Static51.aClass3_Sub8_Sub1_2.method1561(local209);
				for (@Pc(418) int local418 = 0; local418 < 4; local418++) {
					local209[local418] += 50;
				}
				Static18.aClass3_Sub8_Sub1_1.method1561(local209);
				Static86.anInt2525 = 6;
			}
			if (Static86.anInt2525 == 6 && Static52.aClass38_1.method1634() > 0) {
				local117 = Static52.aClass38_1.method1635();
				if (local117 == 21 && Static137.anInt3514 == 20) {
					Static86.anInt2525 = 7;
				} else if (local117 == 2) {
					Static86.anInt2525 = 9;
				} else if (local117 == 15 && Static137.anInt3514 == 40) {
					Static1.method7();
					return;
				} else if (local117 == 23 && Static91.anInt4137 < 1) {
					Static91.anInt4137++;
					Static86.anInt2525 = 0;
				} else {
					Static95.method2090(local117);
					return;
				}
			}
			if (Static86.anInt2525 == 7 && Static52.aClass38_1.method1634() > 0) {
				Static156.anInt3879 = Static52.aClass38_1.method1635() * 60 + 180;
				Static86.anInt2525 = 8;
			}
			if (Static86.anInt2525 == 8) {
				Static160.anInt3909 = 0;
				Static42.method1010(Static62.aClass28_567, Static170.aClass28_1432, Static4.method96(new Class28[] { Static146.method2793(Static156.anInt3879 / 60), Static58.aClass28_586 }));
				if (--Static156.anInt3879 <= 0) {
					Static86.anInt2525 = 0;
				}
			} else {
				if (Static86.anInt2525 == 9 && Static52.aClass38_1.method1634() >= 9) {
					Static32.anInt991 = Static52.aClass38_1.method1635();
					Static26.anInt716 = Static52.aClass38_1.method1635();
					Static135.aBoolean167 = Static52.aClass38_1.method1635() == 1;
					Static155.anInt3857 = Static52.aClass38_1.method1635();
					Static155.anInt3857 <<= 0x8;
					Static155.anInt3857 += Static52.aClass38_1.method1635();
					Static22.anInt598 = Static52.aClass38_1.method1635();
					Static52.aClass38_1.method1636(0, Static18.aClass3_Sub8_Sub1_1.aByteArray19, 1);
					Static18.aClass3_Sub8_Sub1_1.anInt1948 = 0;
					Static159.anInt3903 = Static18.aClass3_Sub8_Sub1_1.method1558();
					Static52.aClass38_1.method1636(0, Static18.aClass3_Sub8_Sub1_1.aByteArray19, 2);
					Static18.aClass3_Sub8_Sub1_1.anInt1948 = 0;
					Static11.anInt410 = Static18.aClass3_Sub8_Sub1_1.method1510();
					Static86.anInt2525 = 10;
				}
				if (Static86.anInt2525 != 10) {
					Static160.anInt3909++;
					if (Static160.anInt3909 > 2000) {
						if (Static91.anInt4137 < 1) {
							Static86.anInt2525 = 0;
							Static91.anInt4137++;
							if (Static128.anInt3275 == Static74.anInt2214) {
								Static128.anInt3275 = Static23.anInt602;
							} else {
								Static128.anInt3275 = Static74.anInt2214;
							}
						} else {
							Static95.method2090(-3);
						}
					}
				} else if (Static52.aClass38_1.method1634() >= Static11.anInt410) {
					Static18.aClass3_Sub8_Sub1_1.anInt1948 = 0;
					Static52.aClass38_1.method1636(0, Static18.aClass3_Sub8_Sub1_1.aByteArray19, Static11.anInt410);
					Static160.method2983();
					Static119.anInt3081 = -1;
					Static153.method2893(false);
					Static159.anInt3903 = -1;
				}
			}
		} catch (@Pc(698) IOException local698) {
			if (Static91.anInt4137 < 1) {
				Static91.anInt4137++;
				if (Static74.anInt2214 == Static128.anInt3275) {
					Static128.anInt3275 = Static23.anInt602;
				} else {
					Static128.anInt3275 = Static74.anInt2214;
				}
				Static86.anInt2525 = 0;
			} else {
				Static95.method2090(-2);
			}
		}
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(Z)V")
	public static void method2129() {
		Static16.method534(Static22.aClass33_2);
		Static167.anInt4075++;
		if (Static108.aBoolean136 && Static176.aBoolean193) {
			@Pc(22) int local22 = Static73.anInt2181;
			local22 -= Static122.anInt3147;
			@Pc(28) int local28 = Static35.anInt1049;
			local28 -= Static155.anInt3860;
			if (Static168.anInt4083 > local22) {
				local22 = Static168.anInt4083;
			}
			if (Static168.anInt4083 + Static54.aClass33_8.anInt1457 < Static22.aClass33_2.anInt1457 + local22) {
				local22 = Static54.aClass33_8.anInt1457 + Static168.anInt4083 - Static22.aClass33_2.anInt1457;
			}
			if (Static34.anInt1034 > local28) {
				local28 = Static34.anInt1034;
			}
			@Pc(65) int local65 = local22 - Static121.anInt3119;
			@Pc(68) int local68 = Static22.aClass33_2.anInt1525;
			if (Static34.anInt1034 + Static54.aClass33_8.anInt1515 < local28 - -Static22.aClass33_2.anInt1515) {
				local28 = Static54.aClass33_8.anInt1515 + Static34.anInt1034 - Static22.aClass33_2.anInt1515;
			}
			@Pc(93) int local93 = local28 - Static95.anInt2629;
			@Pc(107) int local107 = local22 + Static54.aClass33_8.anInt1524 - Static168.anInt4083;
			if (Static22.aClass33_2.anInt1513 < Static167.anInt4075 && (local68 < local65 || -local68 > local65 || local93 > local68 || -local68 > local93)) {
				Static58.aBoolean106 = true;
			}
			@Pc(146) int local146 = local28 + Static54.aClass33_8.anInt1490 - Static34.anInt1034;
			@Pc(155) Class3_Sub6 local155;
			if (Static22.aClass33_2.anObjectArray11 != null && Static58.aBoolean106) {
				local155 = new Class3_Sub6();
				local155.anObjectArray2 = Static22.aClass33_2.anObjectArray11;
				local155.anInt1085 = local146;
				local155.aClass33_3 = Static22.aClass33_2;
				local155.anInt1084 = local107;
				Static163.method3014(local155);
			}
			if (Static136.anInt3480 == 0) {
				if (Static58.aBoolean106) {
					if (Static22.aClass33_2.anObjectArray20 != null) {
						local155 = new Class3_Sub6();
						local155.anObjectArray2 = Static22.aClass33_2.anObjectArray20;
						local155.anInt1084 = local107;
						local155.aClass33_4 = Static75.aClass33_10;
						local155.anInt1085 = local146;
						local155.aClass33_3 = Static22.aClass33_2;
						Static163.method3014(local155);
					}
					if (Static75.aClass33_10 != null && Static96.method3164(Static22.aClass33_2) != null) {
						Static51.aClass3_Sub8_Sub1_2.method1559(48);
						Static51.aClass3_Sub8_Sub1_2.method1531(Static22.aClass33_2.anInt1496);
						Static51.aClass3_Sub8_Sub1_2.method1524(Static75.aClass33_10.anInt1496);
						Static51.aClass3_Sub8_Sub1_2.method1513(Static75.aClass33_10.anInt1471);
						Static51.aClass3_Sub8_Sub1_2.method1513(Static22.aClass33_2.anInt1471);
					}
				} else if ((Static5.anInt131 == 1 || Static38.method892(Static82.anInt2400 - 1)) && Static82.anInt2400 > 2) {
					Static73.method1680();
				} else if (Static82.anInt2400 > 0) {
					Static131.method2558(Static82.anInt2400 - 1);
				}
				Static22.aClass33_2 = null;
			}
		} else if (Static167.anInt4075 > 1) {
			Static22.aClass33_2 = null;
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZLclient!jh;Lclient!jh;)V")
	public static void method2130(@OriginalArg(1) Class3_Sub2_Sub2_Sub1_Sub1 arg0, @OriginalArg(2) Class3_Sub2_Sub2_Sub1_Sub1 arg1) {
		if (Static170.aClass3_Sub2_Sub2_Sub4Array10 == null) {
			Static170.aClass3_Sub2_Sub2_Sub4Array10 = Static76.method1734(Static140.aClass28_1184, Static155.aClass28_1299, Static2.aClass7_Sub1_1);
		}
		if (Static153.aClass3_Sub2_Sub2_Sub3Array9 == null) {
			Static153.aClass3_Sub2_Sub2_Sub3Array9 = Static58.method1528(Static140.aClass28_1184, Static2.aClass7_Sub1_1, Static94.aClass28_821);
		}
		if (Static55.aClass3_Sub2_Sub2_Sub3Array4 == null) {
			Static55.aClass3_Sub2_Sub2_Sub3Array4 = Static58.method1528(Static140.aClass28_1184, Static2.aClass7_Sub1_1, Static58.aClass28_587);
		}
		if (Static34.aClass3_Sub2_Sub2_Sub3Array3 == null) {
			Static34.aClass3_Sub2_Sub2_Sub3Array3 = Static58.method1528(Static140.aClass28_1184, Static2.aClass7_Sub1_1, Static68.aClass28_621);
		}
		Static147.method1775(0, 23, 765, 480, 0);
		Static147.method1772(0, 0, 125, 23, 12425273, 9135624);
		Static147.method1772(125, 0, 640, 23, 5197647, 2697513);
		arg1.method1787(Static34.aClass28_343, 62, 15, 0, -1);
		if (Static34.aClass3_Sub2_Sub2_Sub3Array3 != null) {
			Static34.aClass3_Sub2_Sub2_Sub3Array3[1].method840(140, 1);
			arg0.method1811(Static12.aClass28_169, 152, 10, 16777215, -1);
			Static34.aClass3_Sub2_Sub2_Sub3Array3[0].method840(140, 12);
			arg0.method1811(Static21.aClass28_230, 152, 21, 16777215, -1);
		}
		if (Static55.aClass3_Sub2_Sub2_Sub3Array4 != null) {
			if (Static96.anIntArray697[0] == 0 && Static109.anIntArray492[0] == 0) {
				Static55.aClass3_Sub2_Sub2_Sub3Array4[2].method840(280, 4);
			} else {
				Static55.aClass3_Sub2_Sub2_Sub3Array4[0].method840(280, 4);
			}
			if (Static96.anIntArray697[0] == 0 && Static109.anIntArray492[0] == 1) {
				Static55.aClass3_Sub2_Sub2_Sub3Array4[3].method840(295, 4);
			} else {
				Static55.aClass3_Sub2_Sub2_Sub3Array4[1].method840(295, 4);
			}
			arg1.method1811(Static26.aClass28_268, 312, 17, 16777215, -1);
			if (Static96.anIntArray697[0] == 1 && Static109.anIntArray492[0] == 0) {
				Static55.aClass3_Sub2_Sub2_Sub3Array4[2].method840(390, 4);
			} else {
				Static55.aClass3_Sub2_Sub2_Sub3Array4[0].method840(390, 4);
			}
			if (Static96.anIntArray697[0] == 1 && Static109.anIntArray492[0] == 1) {
				Static55.aClass3_Sub2_Sub2_Sub3Array4[3].method840(405, 4);
			} else {
				Static55.aClass3_Sub2_Sub2_Sub3Array4[1].method840(405, 4);
			}
			arg1.method1811(Static138.aClass28_1165, 422, 17, 16777215, -1);
			if (Static96.anIntArray697[0] == 2 && Static109.anIntArray492[0] == 0) {
				Static55.aClass3_Sub2_Sub2_Sub3Array4[2].method840(500, 4);
			} else {
				Static55.aClass3_Sub2_Sub2_Sub3Array4[0].method840(500, 4);
			}
			if (Static96.anIntArray697[0] == 2 && Static109.anIntArray492[0] == 1) {
				Static55.aClass3_Sub2_Sub2_Sub3Array4[3].method840(515, 4);
			} else {
				Static55.aClass3_Sub2_Sub2_Sub3Array4[1].method840(515, 4);
			}
			arg1.method1811(Static177.aClass28_1478, 532, 17, 16777215, -1);
			if (Static96.anIntArray697[0] == 3 && Static109.anIntArray492[0] == 0) {
				Static55.aClass3_Sub2_Sub2_Sub3Array4[2].method840(610, 4);
			} else {
				Static55.aClass3_Sub2_Sub2_Sub3Array4[0].method840(610, 4);
			}
			if (Static96.anIntArray697[0] == 3 && Static109.anIntArray492[0] == 1) {
				Static55.aClass3_Sub2_Sub2_Sub3Array4[3].method840(625, 4);
			} else {
				Static55.aClass3_Sub2_Sub2_Sub3Array4[1].method840(625, 4);
			}
			arg1.method1811(Static110.aClass28_917, 642, 17, 16777215, -1);
		}
		Static147.method1775(708, 4, 50, 16, 0);
		arg0.method1787(Static107.aClass28_893, 733, 16, 16777215, -1);
		Static102.anInt2668 = -1;
		if (Static170.aClass3_Sub2_Sub2_Sub4Array10 == null) {
			return;
		}
		@Pc(384) int local384 = 8;
		@Pc(392) int local392 = 24;
		@Pc(394) int local394;
		@Pc(396) int local396;
		do {
			local394 = local392;
			local396 = local384;
			if (Static83.anInt2455 <= (local384 - 1) * local392) {
				local384--;
			}
			if (Static83.anInt2455 <= (local392 - 1) * local384) {
				local392--;
			}
			if (Static83.anInt2455 <= local384 * (local392 - 1)) {
				local392--;
			}
		} while (local392 != local394 || local384 != local396);
		local394 = (765 - local384 * 88) / (local384 + 1);
		local396 = (480 - local392 * 19) / (local392 + 1);
		if (local394 > 5) {
			local394 = 5;
		}
		if (local396 > 5) {
			local396 = 5;
		}
		@Pc(478) int local478 = (765 - local384 * 88 - (local384 + -1) * local394) / 2;
		@Pc(493) int local493 = (480 - (local392 - 1) * local396 - local392 * 19) / 2;
		@Pc(497) int local497 = local493 + 23;
		@Pc(499) int local499 = 0;
		@Pc(501) int local501 = local478;
		for (@Pc(503) int local503 = 0; local503 < Static83.anInt2455; local503++) {
			@Pc(509) Class67 local509 = Static59.aClass67Array1[local503];
			@Pc(511) boolean local511 = true;
			@Pc(516) Class28 local516 = Static146.method2793(local509.anInt3286);
			if (local509.anInt3286 == -1) {
				local516 = Static177.aClass28_1485;
				local511 = false;
			} else if (local509.anInt3286 > 1980) {
				local516 = Static98.aClass28_1145;
				local511 = false;
			}
			if (local501 <= Static73.anInt2181 && local497 <= Static35.anInt1049 && Static73.anInt2181 < local501 + 88 && Static35.anInt1049 < local497 + 19 && local511) {
				Static102.anInt2668 = local503;
				Static170.aClass3_Sub2_Sub2_Sub4Array10[local509.aBoolean155 ? 1 : 0].method991(local501, local497);
			} else {
				Static170.aClass3_Sub2_Sub2_Sub4Array10[local509.aBoolean155 ? 1 : 0].method986(local501, local497);
			}
			if (Static153.aClass3_Sub2_Sub2_Sub3Array9 != null) {
				Static153.aClass3_Sub2_Sub2_Sub3Array9[local509.anInt3283 + (local509.aBoolean155 ? 8 : 0)].method840(local501 + 29, local497);
			}
			arg1.method1787(Static146.method2793(local509.anInt3279), local501 + 15, local497 - -5 + 9, 0, -1);
			arg0.method1787(local516, local501 + 60, local497 - -9 + 5, 268435455, -1);
			local497 += local396 + 19;
			@Pc(646) int local646 = ~local392;
			local499++;
			if (local646 >= ~local499) {
				local497 = local493 + 23;
				local501 += local394 + 88;
				local499 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIILclient!kb;Lclient!kb;IIIIJ)V")
	public static void method2131(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class3_Sub2_Sub1 arg4, @OriginalArg(5) Class3_Sub2_Sub1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) long arg10) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class55 local6 = new Class55();
		local6.aLong89 = arg10;
		local6.anInt2664 = arg1 * 128 + 64;
		local6.anInt2660 = arg2 * 128 + 64;
		local6.anInt2665 = arg3;
		local6.aClass3_Sub2_Sub1_7 = arg4;
		local6.aClass3_Sub2_Sub1_8 = arg5;
		local6.anInt2655 = arg6;
		local6.anInt2666 = arg7;
		local6.anInt2659 = arg8;
		local6.anInt2662 = arg9;
		for (@Pc(46) int local46 = arg0; local46 >= 0; local46--) {
			if (Static149.aClass3_Sub20ArrayArrayArray1[local46][arg1][arg2] == null) {
				Static149.aClass3_Sub20ArrayArrayArray1[local46][arg1][arg2] = new Class3_Sub20(local46, arg1, arg2);
			}
		}
		Static149.aClass3_Sub20ArrayArrayArray1[arg0][arg1][arg2].aClass55_1 = local6;
	}

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "(I)V")
	public static void method2132() {
		aClass23_10 = null;
		aClass28_863 = null;
		aClass28_866 = null;
		aClass28_864 = null;
		aClass28_862 = null;
		aClass63_18 = null;
		aClass28_865 = null;
	}
}
