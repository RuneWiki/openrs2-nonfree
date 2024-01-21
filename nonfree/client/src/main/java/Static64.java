import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!kc", name = "e", descriptor = "[I")
	public static int[] anIntArray211;

	@OriginalMember(owner = "client!kc", name = "f", descriptor = "[Lclient!ae;")
	public static Class1_Sub1_Sub2_Sub1[] aClass1_Sub1_Sub2_Sub1Array6;

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "[Lclient!id;")
	public static Class34[] aClass34Array14 = new Class34[100];

	@OriginalMember(owner = "client!kc", name = "g", descriptor = "Z")
	public static boolean aBoolean94 = false;

	@OriginalMember(owner = "client!kc", name = "p", descriptor = "Lclient!id;")
	private static Class34 aClass34_807 = Static9.method266("Loaded wordpack");

	@OriginalMember(owner = "client!kc", name = "t", descriptor = "Lclient!id;")
	public static Class34 aClass34_808 = Static9.method266("Bitte geben Sie Ihr Passwort ein)3");

	@OriginalMember(owner = "client!kc", name = "v", descriptor = "I")
	public static int anInt1731 = 0;

	@OriginalMember(owner = "client!kc", name = "w", descriptor = "Lclient!id;")
	public static Class34 aClass34_809 = aClass34_807;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!te;B)V")
	public static void method1104(@OriginalArg(0) Applet_Sub1 arg0) {
		if (Static55.anInt1547 != 1) {
			return;
		}
		if (Static119.anInt2832 >= 280 && Static119.anInt2832 <= 294 && Static118.anInt2830 >= 4 && Static118.anInt2830 <= 18) {
			Static26.method503(0, 0);
			return;
		}
		if (Static119.anInt2832 >= 295 && Static119.anInt2832 <= 360 && Static118.anInt2830 >= 4 && Static118.anInt2830 <= 18) {
			Static26.method503(0, 1);
			return;
		}
		if (Static119.anInt2832 >= 390 && Static119.anInt2832 <= 404 && Static118.anInt2830 >= 4 && Static118.anInt2830 <= 18) {
			Static26.method503(1, 0);
			return;
		}
		if (Static119.anInt2832 >= 405 && Static119.anInt2832 <= 470 && Static118.anInt2830 >= 4 && Static118.anInt2830 <= 18) {
			Static26.method503(1, 1);
			return;
		}
		if (Static119.anInt2832 >= 500 && Static119.anInt2832 <= 514 && Static118.anInt2830 >= 4 && Static118.anInt2830 <= 18) {
			Static26.method503(2, 0);
			return;
		}
		if (Static119.anInt2832 >= 515 && Static119.anInt2832 <= 580 && Static118.anInt2830 >= 4 && Static118.anInt2830 <= 18) {
			Static26.method503(2, 1);
			return;
		}
		if (Static119.anInt2832 >= 610 && Static119.anInt2832 <= 624 && Static118.anInt2830 >= 4 && Static118.anInt2830 <= 18) {
			Static26.method503(3, 0);
			return;
		}
		if (Static119.anInt2832 >= 625 && Static119.anInt2832 <= 690 && Static118.anInt2830 >= 4 && Static118.anInt2830 <= 18) {
			Static26.method503(3, 1);
			return;
		}
		if (Static119.anInt2832 >= 708 && Static118.anInt2830 >= 4 && Static119.anInt2832 <= 758 && Static118.anInt2830 <= 20) {
			Static110.aBoolean136 = false;
			Static21.aClass1_Sub1_Sub2_Sub1_1.method192(0, 0);
			Static75.aClass1_Sub1_Sub2_Sub1_4.method192(382, 0);
			Static60.aClass1_Sub1_Sub2_Sub2_6.method542(382 - Static60.aClass1_Sub1_Sub2_Sub2_6.anInt883 / 2, 18);
			return;
		}
		if (Static8.anInt438 == -1) {
			return;
		}
		@Pc(267) Class18 local267 = Static71.aClass18Array1[Static8.anInt438];
		if (local267.aBoolean45 == Static28.aBoolean177) {
			@Pc(287) byte[] local287 = Static91.method1554(new Class34[] { local267.aClass34_438, Static132.aClass34_1587 }).method975();
			Static51.aString5 = new String(local287, 0, local287.length);
			Static15.anInt614 = local267.anInt886;
			if (Static31.anInt921 != 0) {
				Static78.anInt2088 = 43594;
				Static55.anInt1525 = 43594;
				Static106.anInt2604 = 443;
				Static31.anInt921 = 0;
			}
			Static110.aBoolean136 = false;
			Static21.aClass1_Sub1_Sub2_Sub1_1.method192(0, 0);
			Static75.aClass1_Sub1_Sub2_Sub1_4.method192(382, 0);
			Static60.aClass1_Sub1_Sub2_Sub2_6.method542(382 - Static60.aClass1_Sub1_Sub2_Sub2_6.anInt883 / 2, 18);
			return;
		}
		@Pc(385) Class34 local385 = Static91.method1554(new Class34[] { Static2.aClass34_107, local267.aClass34_438, Static132.aClass34_1587, Static81.aClass34_1057, Static47.aClass34_675, Static85.method1456(Static21.aBoolean39 ? 1 : 0), Static94.aClass34_1200, Static85.method1456(Static88.anInt2289), Static58.aClass34_766, Static85.method1456(Static16.anInt633) });
		try {
			arg0.getAppletContext().showDocument(local385.method987(), "_self");
			return;
		} catch (@Pc(394) Exception local394) {
			return;
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILclient!fd;)V")
	public static void method1105(@OriginalArg(1) Class1_Sub9 arg0) {
		@Pc(6) int local6 = arg0.anInt1030;
		if (local6 == 324) {
			if (Static13.anInt573 == -1) {
				Static13.anInt573 = arg0.anInt1083;
				Static80.anInt2127 = arg0.anInt1023;
			}
			if (Static62.aClass10_2.aBoolean29) {
				arg0.anInt1083 = Static13.anInt573;
			} else {
				arg0.anInt1083 = Static80.anInt2127;
			}
		} else if (local6 == 325) {
			if (Static13.anInt573 == -1) {
				Static13.anInt573 = arg0.anInt1083;
				Static80.anInt2127 = arg0.anInt1023;
			}
			if (Static62.aClass10_2.aBoolean29) {
				arg0.anInt1083 = Static80.anInt2127;
			} else {
				arg0.anInt1083 = Static13.anInt573;
			}
		} else if (local6 == 327) {
			arg0.anInt1022 = 150;
			arg0.anInt1039 = (int) (Math.sin((double) Static73.anInt1947 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt1040 = 5;
			arg0.anInt1027 = 0;
		} else if (local6 == 328) {
			arg0.anInt1022 = 150;
			arg0.anInt1039 = (int) (Math.sin((double) Static73.anInt1947 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt1040 = 5;
			arg0.anInt1027 = 1;
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IZ)V")
	public static void method1106(@OriginalArg(1) boolean arg0) {
		Static118.method1873();
		Static14.anInt599++;
		if (Static14.anInt599 < 50 && !arg0) {
			return;
		}
		Static14.anInt599 = 0;
		if (Static100.aBoolean133 || Static3.aClass51_1 == null) {
			return;
		}
		Static21.aClass1_Sub19_Sub1_1.method2105(240);
		try {
			Static3.aClass51_1.method1362(Static21.aClass1_Sub19_Sub1_1.aByteArray42, Static21.aClass1_Sub19_Sub1_1.anInt3111);
			Static21.aClass1_Sub19_Sub1_1.anInt3111 = 0;
		} catch (@Pc(52) IOException local52) {
			Static100.aBoolean133 = true;
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V")
	public static void method1107() {
		aClass34_809 = null;
		aClass34_808 = null;
		aClass34Array14 = null;
		aClass1_Sub1_Sub2_Sub1Array6 = null;
		anIntArray211 = null;
		aClass34_807 = null;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(BI)V")
	public static void method1108(@OriginalArg(1) int arg0) {
		Static118.method1875();
		Static58.method1026();
		@Pc(14) int local14 = Static100.method1666(arg0).anInt394;
		if (local14 == 0) {
			return;
		}
		@Pc(24) int local24 = Static39.anIntArray116[arg0];
		if (local14 == 1) {
			if (local24 == 1) {
				Static108.method1771(0.9D);
				((Class74) Static108.anInterface2_1).method1871(0.9D);
			}
			if (local24 == 2) {
				Static108.method1771(0.8D);
				((Class74) Static108.anInterface2_1).method1871(0.8D);
			}
			if (local24 == 3) {
				Static108.method1771(0.7D);
				((Class74) Static108.anInterface2_1).method1871(0.7D);
			}
			if (local24 == 4) {
				Static108.method1771(0.6D);
				((Class74) Static108.anInterface2_1).method1871(0.6D);
			}
			Static128.method1991();
		}
		if (local14 == 3) {
			@Pc(80) short local80 = 0;
			if (local24 == 0) {
				local80 = 255;
			}
			if (local24 == 1) {
				local80 = 192;
			}
			if (local24 == 2) {
				local80 = 128;
			}
			if (local24 == 3) {
				local80 = 64;
			}
			if (local24 == 4) {
				local80 = 0;
			}
			if (Static7.anInt426 != local80) {
				if (Static7.anInt426 == 0 && Static5.anInt361 != -1) {
					Static87.method1485(Static5.anInt361, 0, Static32.aClass35_Sub1_12, local80);
					aBoolean94 = false;
				} else if (local80 == 0) {
					Static98.method1651();
					aBoolean94 = false;
				} else {
					Static97.method1646(local80);
				}
				Static7.anInt426 = local80;
			}
		}
		if (local14 == 5) {
			Static56.anInt2386 = local24;
		}
		if (local14 == 10) {
			if (local24 == 0) {
				Static66.anInt1753 = 127;
			}
			if (local24 == 1) {
				Static66.anInt1753 = 96;
			}
			if (local24 == 2) {
				Static66.anInt1753 = 64;
			}
			if (local24 == 3) {
				Static66.anInt1753 = 32;
			}
			if (local24 == 4) {
				Static66.anInt1753 = 0;
			}
		}
		if (local14 == 4) {
			if (local24 == 0) {
				Static60.anInt1655 = 127;
			}
			if (local24 == 1) {
				Static60.anInt1655 = 96;
			}
			if (local24 == 2) {
				Static60.anInt1655 = 64;
			}
			if (local24 == 3) {
				Static60.anInt1655 = 32;
			}
			if (local24 == 4) {
				Static60.anInt1655 = 0;
			}
		}
		if (local14 == 9) {
			Static35.anInt1003 = local24;
		}
		if (local14 == 6) {
			Static50.anInt1475 = local24;
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(III)Z")
	public static boolean method1109(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 >> arg0 + 1 & 0x1) != 0;
	}
}
