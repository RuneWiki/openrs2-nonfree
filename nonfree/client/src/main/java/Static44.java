import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "Lclient!oc;")
	public static Class54 aClass54_1;

	@OriginalMember(owner = "client!gf", name = "d", descriptor = "Lclient!q;")
	public static Class62 aClass62_11;

	@OriginalMember(owner = "client!gf", name = "p", descriptor = "I")
	public static int anInt1243;

	@OriginalMember(owner = "client!gf", name = "u", descriptor = "Lclient!bc;")
	public static Class6 aClass6_10;

	@OriginalMember(owner = "client!gf", name = "c", descriptor = "I")
	public static int anInt1239 = 0;

	@OriginalMember(owner = "client!gf", name = "e", descriptor = "Lclient!kd;")
	public static Class39 aClass39_591 = Static108.method1915("Bitte schlie-8en Sie die momentan ge-Offnete Benutzeroberfl-=che)1");

	@OriginalMember(owner = "client!gf", name = "f", descriptor = "I")
	public static final int anInt1240 = 3353893;

	@OriginalMember(owner = "client!gf", name = "g", descriptor = "Lclient!kd;")
	private static Class39 aClass39_592 = Static108.method1915("Press (Wchange your password(W on front page)3");

	@OriginalMember(owner = "client!gf", name = "q", descriptor = "Lclient!kd;")
	private static Class39 aClass39_598 = Static108.method1915("Loaded textures");

	@OriginalMember(owner = "client!gf", name = "h", descriptor = "Lclient!kd;")
	public static Class39 aClass39_593 = aClass39_598;

	@OriginalMember(owner = "client!gf", name = "i", descriptor = "Lclient!kd;")
	private static Class39 aClass39_594 = Static108.method1915("white:");

	@OriginalMember(owner = "client!gf", name = "j", descriptor = "Lclient!kd;")
	public static Class39 aClass39_595 = aClass39_594;

	@OriginalMember(owner = "client!gf", name = "m", descriptor = "Lclient!kd;")
	public static Class39 aClass39_596 = Static108.method1915(":");

	@OriginalMember(owner = "client!gf", name = "n", descriptor = "Lclient!kd;")
	public static Class39 aClass39_597 = Static108.method1915("Spiel)2Fenster geladen)3");

	@OriginalMember(owner = "client!gf", name = "t", descriptor = "I")
	public static int anInt1246 = 500;

	@OriginalMember(owner = "client!gf", name = "y", descriptor = "Lclient!kd;")
	public static Class39 aClass39_599 = aClass39_594;

	@OriginalMember(owner = "client!gf", name = "z", descriptor = "Lclient!kd;")
	public static Class39 aClass39_600 = Static108.method1915("Lade Konfiguration )2 ");

	@OriginalMember(owner = "client!gf", name = "A", descriptor = "Lclient!kd;")
	public static Class39 aClass39_601 = Static108.method1915("Sie befinden sich in einem Mitglieder)2Gebiet(Q");

	@OriginalMember(owner = "client!gf", name = "B", descriptor = "Lclient!kd;")
	public static Class39 aClass39_602 = aClass39_592;

	@OriginalMember(owner = "client!gf", name = "E", descriptor = "Lclient!kd;")
	public static Class39 aClass39_603 = Static108.method1915("Versteckt");

	@OriginalMember(owner = "client!gf", name = "G", descriptor = "[I")
	public static int[] anIntArray175 = new int[2000];

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)V")
	public static void method782() {
		if (Static110.anInt2795 < 2 && Static89.anInt2107 == 0 && !Static46.aBoolean222) {
			return;
		}
		@Pc(47) Class39 local47;
		if (Static89.anInt2107 == 1 && Static110.anInt2795 < 2) {
			local47 = Static30.method601(new Class39[] { Static77.aClass39_953, Static116.aClass39_1382, Static4.aClass39_66, Static123.aClass39_1479 });
		} else if (Static46.aBoolean222 && Static110.anInt2795 < 2) {
			local47 = Static30.method601(new Class39[] { Static52.aClass39_695, Static116.aClass39_1382, Static103.aClass39_1273, Static123.aClass39_1479 });
		} else {
			local47 = Static50.aClass39Array13[Static110.anInt2795 - 1];
		}
		if (Static110.anInt2795 > 2) {
			local47 = Static30.method601(new Class39[] { local47, Static89.aClass39_1067, Static69.method1226(Static110.anInt2795 - 2), Static70.aClass39_878 });
		}
		Static53.aClass1_Sub1_Sub4_Sub3_1.method747(local47, Static45.anInt1256 / 1000);
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(B)V")
	public static void method783() {
		aClass39_601 = null;
		aClass39_594 = null;
		aClass6_10 = null;
		aClass39_593 = null;
		aClass39_598 = null;
		aClass39_603 = null;
		aClass39_600 = null;
		aClass54_1 = null;
		aClass39_597 = null;
		aClass39_602 = null;
		anIntArray175 = null;
		aClass39_595 = null;
		aClass39_599 = null;
		aClass39_591 = null;
		aClass39_596 = null;
		aClass62_11 = null;
		aClass39_592 = null;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(III[BII[Lclient!ge;)V")
	public static void method784(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class23[] arg5) {
		@Pc(17) int local17;
		for (@Pc(9) int local9 = 0; local9 < 4; local9++) {
			for (@Pc(13) int local13 = 0; local13 < 64; local13++) {
				for (local17 = 0; local17 < 64; local17++) {
					if (arg4 + local13 > 0 && local13 + arg4 < 103 && arg0 + local17 > 0 && local17 + arg0 < 103) {
						arg5[local9].anIntArrayArray9[arg4 + local13][local17 + arg0] &= 0xFEFFFFFF;
					}
				}
			}
		}
		@Pc(97) Class1_Sub18 local97 = new Class1_Sub18(arg2);
		for (local17 = 0; local17 < 4; local17++) {
			for (@Pc(103) int local103 = 0; local103 < 64; local103++) {
				for (@Pc(107) int local107 = 0; local107 < 64; local107++) {
					Static59.method1061(arg3, arg1, local97, arg4 + local103, local17, local107 + arg0, 0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(BLclient!ee;)V")
	public static void method785(@OriginalArg(1) Applet_Sub1 arg0) {
		if (Static32.aBoolean60) {
			Static59.method1063(arg0);
			return;
		}
		if (Static91.anInt2130 == 1 && Static89.anInt2109 >= 715 && Static38.anInt1157 >= 453) {
			Static19.aBoolean57 = !Static19.aBoolean57;
			if (Static19.aBoolean57) {
				Static89.method1475();
			} else {
				Static101.method1815(Static38.aClass39_540, Static77.aClass62_Sub1_53, Static97.aClass39_1530);
			}
		}
		if (Static1.anInt62 == 5) {
			return;
		}
		Static40.anInt1178++;
		if (Static1.anInt62 != 10) {
			return;
		}
		if (Static93.anInt2200 != 2 && Static122.anInt2972 == 0) {
			if (Static91.anInt2130 == 1 && Static89.anInt2109 >= 5 && Static89.anInt2109 <= 105 && Static38.anInt1157 >= 463 && Static38.anInt1157 <= 498) {
				Static86.method1444();
				return;
			}
			if (Static37.aClass38_1 != null) {
				Static86.method1444();
			}
		}
		@Pc(112) int local112 = Static91.anInt2130;
		@Pc(114) int local114 = Static89.anInt2109;
		@Pc(116) int local116 = Static38.anInt1157;
		if (Static63.anInt1661 == 0) {
			if (local112 == 1 && local114 >= 227 && local114 <= 377 && local116 >= 271 && local116 <= 311) {
				Static63.anInt1661 = 3;
				Static47.anInt1311 = 0;
			}
			if (local112 != 1 || local114 < 387 || local114 > 537 || local116 < 271 || local116 > 311) {
				return;
			}
			Static38.aClass39_544 = Static9.aClass39_1460;
			Static38.aClass39_538 = Static116.aClass39_1387;
			Static38.aClass39_541 = Static9.aClass39_1453;
			Static63.anInt1661 = 2;
			Static47.anInt1311 = 0;
			return;
		}
		if (Static63.anInt1661 == 2) {
			@Pc(125) short local125 = 231;
			@Pc(126) int local126 = local125 + 30;
			if (local112 == 1 && local116 >= 246 && local116 < 261) {
				Static47.anInt1311 = 0;
			}
			local126 += 15;
			if (local112 == 1 && local116 >= 261 && local116 < 276) {
				Static47.anInt1311 = 1;
			}
			local126 += 15;
			if (local112 == 1 && local114 >= 227 && local114 <= 377 && local116 >= 301 && local116 <= 341) {
				Static38.aClass39_546 = Static38.aClass39_546.method1152().method1153();
				if (Static38.aClass39_546.method1175() == 0) {
					Static38.method688(Static114.aClass39_1363, Static9.aClass39_1448, Static9.aClass39_1445);
					return;
				}
				if (Static38.aClass39_535.method1175() == 0) {
					Static38.method688(Static50.aClass39_656, Static9.aClass39_1463, Static9.aClass39_1454);
					return;
				}
				Static38.method688(Static58.aClass39_762, Static9.aClass39_1468, Static9.aClass39_1470);
				Static41.method2108(20);
				return;
			}
			if (local112 == 1 && local114 >= 387 && local114 <= 537 && local116 >= 301 && local116 <= 341) {
				Static63.anInt1661 = 0;
				Static38.aClass39_546 = Static38.aClass39_540;
				Static38.aClass39_535 = Static38.aClass39_540;
			}
			while (true) {
				@Pc(290) boolean local290;
				label184: do {
					while (Static117.method2022()) {
						local290 = false;
						for (@Pc(292) int local292 = 0; local292 < Static99.aClass39_1202.method1175(); local292++) {
							if (Static77.anInt1931 == Static99.aClass39_1202.method1167(local292)) {
								local290 = true;
								break;
							}
						}
						if (Static47.anInt1311 != 0) {
							continue label184;
						}
						if (Static110.anInt2791 == 85 && Static38.aClass39_546.method1175() > 0) {
							Static38.aClass39_546 = Static38.aClass39_546.method1173(Static38.aClass39_546.method1175() - 1, 0);
						}
						if (Static110.anInt2791 == 84 || Static110.anInt2791 == 80) {
							Static47.anInt1311 = 1;
						}
						if (local290 && Static38.aClass39_546.method1175() < 12) {
							Static38.aClass39_546 = Static38.aClass39_546.method1150(Static77.anInt1931);
						}
					}
					return;
				} while (Static47.anInt1311 != 1);
				if (Static110.anInt2791 == 85 && Static38.aClass39_535.method1175() > 0) {
					Static38.aClass39_535 = Static38.aClass39_535.method1173(Static38.aClass39_535.method1175() - 1, 0);
				}
				if (Static110.anInt2791 == 84 || Static110.anInt2791 == 80) {
					Static47.anInt1311 = 0;
				}
				if (local290 && Static38.aClass39_535.method1175() < 20) {
					Static38.aClass39_535 = Static38.aClass39_535.method1150(Static77.anInt1931);
				}
			}
		}
		if (Static63.anInt1661 == 3 && local112 == 1 && local114 >= 307 && local114 <= 457 && local116 >= 301 && local116 <= 341) {
			Static63.anInt1661 = 0;
			return;
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)V")
	public static void method786() {
		if (Static110.anInt2791 == 104) {
			@Pc(11) int local11;
			if (Static74.anInt1854 == -1) {
				local11 = Static86.anInt2060;
			} else {
				local11 = Static74.anInt1854;
			}
			if (Static74.anInt1854 != Static86.anInt2060) {
				local11--;
				if (local11 < 0) {
					local11 = 19;
				}
				if (Static59.aClass39Array16[local11] != null) {
					Static8.aClass39_151 = Static59.aClass39Array16[local11];
					Static74.anInt1854 = local11;
					Static113.aBoolean226 = true;
				}
			}
		}
		if (Static110.anInt2791 != 105 || Static74.anInt1854 == -1) {
			return;
		}
		Static74.anInt1854++;
		if (Static74.anInt1854 >= 20) {
			Static74.anInt1854 = 0;
		}
		if (Static86.anInt2060 == Static74.anInt1854) {
			Static8.aClass39_151 = Static8.aClass39_147;
			Static113.aBoolean226 = true;
			Static74.anInt1854 = -1;
		} else if (Static59.aClass39Array16[Static74.anInt1854] != null) {
			Static8.aClass39_151 = Static59.aClass39Array16[Static74.anInt1854];
			Static113.aBoolean226 = true;
			return;
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lclient!q;I)I")
	public static int method788(@OriginalArg(0) Class62 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method2007(Static91.aClass39_1079, Static77.aClass39_960)) {
			local5++;
		}
		if (arg0.method2007(Static91.aClass39_1079, Static32.aClass39_338)) {
			local5++;
		}
		if (arg0.method2007(Static91.aClass39_1079, Static76.aClass39_944)) {
			local5++;
		}
		if (arg0.method2007(Static91.aClass39_1079, Static59.aClass39_778)) {
			local5++;
		}
		if (arg0.method2007(Static91.aClass39_1079, Static30.aClass39_466)) {
			local5++;
		}
		if (arg0.method2007(Static91.aClass39_1079, Static118.aClass39_1411)) {
			local5++;
		}
		if (arg0.method2007(Static91.aClass39_1079, Static77.aClass39_956)) {
			local5++;
		}
		if (arg0.method2007(Static91.aClass39_1079, Static29.aClass39_448)) {
			local5++;
		}
		if (arg0.method2007(Static91.aClass39_1079, Static77.aClass39_959)) {
			local5++;
		}
		if (arg0.method2007(Static91.aClass39_1079, Static45.aClass39_606)) {
			local5++;
		}
		if (arg0.method2007(Static91.aClass39_1079, Static88.aClass39_1057)) {
			local5++;
		}
		if (arg0.method2007(Static91.aClass39_1079, Static79.aClass39_1221)) {
			local5++;
		}
		if (arg0.method2007(Static91.aClass39_1079, Static92.aClass39_1106)) {
			local5++;
		}
		if (arg0.method2007(Static91.aClass39_1079, Static39.aClass39_551)) {
			local5++;
		}
		if (arg0.method2007(Static91.aClass39_1079, Static67.aClass39_854)) {
			local5++;
		}
		if (arg0.method2007(Static91.aClass39_1079, Static13.aClass39_282)) {
			local5++;
		}
		if (arg0.method2007(Static91.aClass39_1079, Static124.aClass39_1489)) {
			local5++;
		}
		if (arg0.method2007(Static91.aClass39_1079, Static124.aClass39_1497)) {
			local5++;
		}
		if (arg0.method2007(Static91.aClass39_1079, Static52.aClass39_696)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!gf", name = "c", descriptor = "(B)V")
	public static void method789() {
		@Pc(6) Object local6 = Static49.anObject1;
		synchronized (Static49.anObject1) {
			if (Static45.anInt1257 != 0) {
				Static45.anInt1257 = 1;
				try {
					Static49.anObject1.wait();
				} catch (@Pc(16) InterruptedException local16) {
				}
			}
		}
	}
}
