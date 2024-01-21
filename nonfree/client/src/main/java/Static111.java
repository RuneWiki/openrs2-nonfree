import java.awt.Graphics;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!tb", name = "ob", descriptor = "Lclient!hb;")
	public static Class30 aClass30_1;

	@OriginalMember(owner = "client!tb", name = "B", descriptor = "Lclient!je;")
	private static Class40 aClass40_1402 = Static69.method1231("white:");

	@OriginalMember(owner = "client!tb", name = "C", descriptor = "Lclient!je;")
	public static Class40 aClass40_1403 = aClass40_1402;

	@OriginalMember(owner = "client!tb", name = "ab", descriptor = "Lclient!je;")
	private static Class40 aClass40_1409 = Static69.method1231("wishes to trade with you)3");

	@OriginalMember(owner = "client!tb", name = "D", descriptor = "Lclient!je;")
	public static Class40 aClass40_1404 = aClass40_1409;

	@OriginalMember(owner = "client!tb", name = "E", descriptor = "Lclient!je;")
	private static Class40 aClass40_1405 = Static69.method1231("Examine");

	@OriginalMember(owner = "client!tb", name = "F", descriptor = "Lclient!je;")
	public static Class40 aClass40_1406 = aClass40_1405;

	@OriginalMember(owner = "client!tb", name = "G", descriptor = "[I")
	public static int[] anIntArray294 = new int[25];

	@OriginalMember(owner = "client!tb", name = "K", descriptor = "Lclient!je;")
	public static Class40 aClass40_1407 = aClass40_1402;

	@OriginalMember(owner = "client!tb", name = "L", descriptor = "Z")
	public static boolean aBoolean214 = false;

	@OriginalMember(owner = "client!tb", name = "R", descriptor = "Lclient!je;")
	public static Class40 aClass40_1408 = Static69.method1231("Geben Sie Ihren Benutzernamen");

	@OriginalMember(owner = "client!tb", name = "X", descriptor = "I")
	public static int anInt2597 = 0;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IBI)I")
	public static int method1865(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == -2) {
			return 12345678;
		} else if (arg1 == -1) {
			if (arg0 < 2) {
				arg0 = 2;
			} else if (arg0 > 126) {
				arg0 = 126;
			}
			return arg0;
		} else {
			arg0 = arg0 * (arg1 & 0x7F) / 128;
			if (arg0 < 2) {
				arg0 = 2;
			} else if (arg0 > 126) {
				arg0 = 126;
			}
			return arg0 + (arg1 & 0xFF80);
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Z)V")
	public static void method1866() {
		aClass40_1402 = null;
		aClass30_1 = null;
		aClass40_1404 = null;
		aClass40_1407 = null;
		aClass40_1406 = null;
		aClass40_1403 = null;
		anIntArray294 = null;
		aClass40_1408 = null;
		aClass40_1409 = null;
		aClass40_1405 = null;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ZI)V")
	public static void method1867(@OriginalArg(0) boolean arg0) {
		if (Static11.aClass57_1 == null) {
			return;
		}
		try {
			@Pc(11) Class2_Sub9 local11 = new Class2_Sub9(4);
			local11.method644(arg0 ? 2 : 3);
			local11.method638(0);
			Static11.aClass57_1.method1591(local11.aByteArray16, 4);
		} catch (@Pc(37) IOException local37) {
			try {
				Static11.aClass57_1.method1596();
			} catch (@Pc(42) Exception local42) {
			}
			Static11.aClass57_1 = null;
			Static15.anInt299++;
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!oe;ZLclient!oe;)V")
	public static void method1868(@OriginalArg(0) Class2_Sub1_Sub2_Sub3_Sub1 arg0, @OriginalArg(2) Class2_Sub1_Sub2_Sub3_Sub1 arg1) {
		if (Static60.aBoolean124) {
			Static76.method1264(arg0, arg1);
			return;
		}
		if (Static105.anInt2533 == 0 || Static105.anInt2533 == 5) {
			arg0.method1547(Static96.aClass40_1277, 382, 225, 16777215, -1);
			Static6.method1693(230, 233, 304, 34, 9179409);
			Static6.method1693(231, 234, 302, 32, 0);
			Static6.method1695(232, 235, Static76.anInt1982 * 3, 30, 9179409);
			Static6.method1695(Static76.anInt1982 * 3 + 232, 235, 300 - Static76.anInt1982 * 3, 30, 0);
			arg0.method1547(Static87.aClass40_669, 382, 256, 16777215, -1);
		}
		@Pc(104) short local104;
		@Pc(112) int local112;
		if (Static105.anInt2533 == 20) {
			Static84.aClass2_Sub1_Sub2_Sub1_13.method1084(382 - Static84.aClass2_Sub1_Sub2_Sub1_13.anInt1632 / 2, 271 - Static84.aClass2_Sub1_Sub2_Sub1_13.anInt1631 / 2);
			local104 = 211;
			arg0.method1547(Static87.aClass40_668, 382, 211, 16776960, 0);
			local112 = local104 + 15;
			arg0.method1547(Static87.aClass40_662, 382, 226, 16776960, 0);
			@Pc(120) int local120 = local112 + 15;
			arg0.method1547(Static87.aClass40_660, 382, 241, 16776960, 0);
			@Pc(128) int local128 = local120 + 15;
			@Pc(129) int local129 = local128 + 10;
			arg0.method1549(Static40.method722(new Class40[] { Static57.aClass40_733, Static82.method1541(Static87.aClass40_661) }), 272, 266, 16777215, 0);
			@Pc(149) int local149 = local129 + 15;
			arg0.method1549(Static40.method722(new Class40[] { Static62.aClass40_827, Static87.aClass40_664.method962() }), 274, 281, 16777215, 0);
			@Pc(170) int local170 = local149 + 15;
		}
		if (Static105.anInt2533 == 10) {
			Static84.aClass2_Sub1_Sub2_Sub1_13.method1084(202, 171);
			if (Static118.anInt2778 == 0) {
				local104 = 251;
				arg0.method1547(Static1.aClass40_2, 382, 251, 16776960, 0);
				local112 = local104 + 30;
				Static86.aClass2_Sub1_Sub2_Sub1_14.method1084(229, 271);
				arg0.method1542(Static57.aClass40_736, 229, 271, 144, 40, 16777215, 0, 1, 1, 0);
				Static86.aClass2_Sub1_Sub2_Sub1_14.method1084(389, 271);
				arg0.method1542(Static11.aClass40_196, 389, 271, 144, 40, 16777215, 0, 1, 1, 0);
			} else if (Static118.anInt2778 == 2) {
				local104 = 211;
				arg0.method1547(Static87.aClass40_668, 382, 211, 16776960, 0);
				local112 = local104 + 15;
				arg0.method1547(Static87.aClass40_662, 382, 226, 16776960, 0);
				local112 += 15;
				arg0.method1547(Static87.aClass40_660, 382, 241, 16776960, 0);
				local112 += 15;
				local112 += 10;
				arg0.method1549(Static40.method722(new Class40[] { Static57.aClass40_733, Static82.method1541(Static87.aClass40_661), Static28.anInt704 % 40 < 20 & Static112.anInt2615 == 0 ? Static103.aClass40_1339 : Static87.aClass40_667 }), 272, 266, 16777215, 0);
				local112 += 15;
				arg0.method1549(Static40.method722(new Class40[] { Static62.aClass40_827, Static87.aClass40_664.method962(), Static112.anInt2615 == 1 & Static28.anInt704 % 40 < 20 ? Static103.aClass40_1339 : Static87.aClass40_667 }), 274, 281, 16777215, 0);
				Static86.aClass2_Sub1_Sub2_Sub1_14.method1084(229, 301);
				arg0.method1547(Static16.aClass40_253, 302, 326, 16777215, 0);
				local112 += 15;
				Static86.aClass2_Sub1_Sub2_Sub1_14.method1084(389, 301);
				arg0.method1547(Static60.aClass40_823, 462, 326, 16777215, 0);
			} else if (Static118.anInt2778 == 3) {
				arg0.method1547(Static7.aClass40_152, 382, 211, 16776960, 0);
				local104 = 236;
				arg0.method1547(Static7.aClass40_176, 382, 236, 16777215, 0);
				local112 = local104 + 15;
				arg0.method1547(Static81.aClass40_1061, 382, 251, 16777215, 0);
				local112 += 15;
				arg0.method1547(Static33.aClass40_1447, 382, 266, 16777215, 0);
				local112 += 15;
				arg0.method1547(Static84.aClass40_1160, 382, 281, 16777215, 0);
				Static86.aClass2_Sub1_Sub2_Sub1_14.method1084(309, 301);
				local112 += 15;
				arg0.method1547(Static60.aClass40_823, 382, 326, 16777215, 0);
			}
		}
		if (Static24.anInt3061 != 1) {
			if (Static102.anInt2482 > 0) {
				Static41.method728(Static102.anInt2482);
				Static102.anInt2482 = 0;
			}
			Static46.method829();
		}
		Static84.aClass2_Sub1_Sub2_Sub1Array73[aBoolean214 ? 1 : 0].method1084(725, 463);
		if (Static105.anInt2533 > 5 && Static2.anInt102 != 2 && Static17.anInt432 == 0) {
			if (Static54.aClass2_Sub1_Sub2_Sub1_10 == null) {
				Static54.aClass2_Sub1_Sub2_Sub1_10 = Static47.method863(Static87.aClass40_667, Static24.aClass40_1644, Static10.aClass24_Sub1_20);
			} else {
				Static54.aClass2_Sub1_Sub2_Sub1_10.method1084(5, 463);
				arg0.method1547(Static40.method722(new Class40[] { Static29.aClass40_427, Static118.aClass40_1494, Static49.method886(Static15.anInt298) }), 55, 478, 16777215, 0);
				if (Static69.aClass18_2 == null) {
					arg1.method1547(Static64.aClass40_854, 55, 492, 16777215, 0);
				} else {
					arg1.method1547(Static39.aClass40_547, 55, 492, 16777215, 0);
				}
			}
		}
		try {
			@Pc(621) Graphics local621 = Static80.aCanvas1.getGraphics();
			Static65.aClass7_1.method2132(local621);
		} catch (@Pc(629) Exception local629) {
			Static80.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(BLclient!fd;Lclient!fd;)I")
	public static int method1869(@OriginalArg(1) Class24 arg0, @OriginalArg(2) Class24 arg1) {
		@Pc(5) int local5 = 0;
		if (arg0.method1920(Static87.aClass40_667, Static55.aClass40_727)) {
			local5++;
		}
		if (arg1.method1920(Static87.aClass40_667, Static15.aClass40_225)) {
			local5++;
		}
		if (arg1.method1920(Static87.aClass40_667, Static123.aClass40_1553)) {
			local5++;
		}
		if (arg1.method1920(Static87.aClass40_667, Static122.aClass40_1542)) {
			local5++;
		}
		if (arg1.method1920(Static87.aClass40_667, Static119.aClass40_1497)) {
			local5++;
		}
		if (arg1.method1920(Static87.aClass40_667, Static81.aClass40_1058)) {
			local5++;
		}
		arg1.method1920(Static87.aClass40_667, Static23.aClass40_370);
		arg1.method1920(Static87.aClass40_667, Static70.aClass40_941);
		arg1.method1920(Static87.aClass40_667, Static112.aClass40_1410);
		arg1.method1920(Static87.aClass40_667, Static121.aClass40_1522);
		arg1.method1920(Static87.aClass40_667, Static24.aClass40_1644);
		return local5;
	}

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "(B)V")
	public static void method1870() {
		Static7.aClass2_Sub9_Sub1_1.method672();
		@Pc(11) int local11 = Static7.aClass2_Sub9_Sub1_1.method671(1);
		if (local11 == 0) {
			return;
		}
		@Pc(22) int local22 = Static7.aClass2_Sub9_Sub1_1.method671(2);
		if (local22 == 0) {
			Static73.anIntArray202[Static58.anInt1521++] = 2047;
			return;
		}
		@Pc(41) int local41;
		@Pc(51) int local51;
		if (local22 == 1) {
			local41 = Static7.aClass2_Sub9_Sub1_1.method671(3);
			Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.method1172(false, local41);
			local51 = Static7.aClass2_Sub9_Sub1_1.method671(1);
			if (local51 == 1) {
				Static73.anIntArray202[Static58.anInt1521++] = 2047;
			}
			return;
		}
		@Pc(93) int local93;
		if (local22 == 2) {
			local41 = Static7.aClass2_Sub9_Sub1_1.method671(3);
			Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.method1172(true, local41);
			local51 = Static7.aClass2_Sub9_Sub1_1.method671(3);
			Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.method1172(true, local51);
			local93 = Static7.aClass2_Sub9_Sub1_1.method671(1);
			if (local93 == 1) {
				Static73.anIntArray202[Static58.anInt1521++] = 2047;
			}
		} else if (local22 == 3) {
			local51 = Static7.aClass2_Sub9_Sub1_1.method671(7);
			local93 = Static7.aClass2_Sub9_Sub1_1.method671(7);
			Static105.anInt2531 = Static7.aClass2_Sub9_Sub1_1.method671(2);
			@Pc(138) int local138 = Static7.aClass2_Sub9_Sub1_1.method671(1);
			@Pc(143) int local143 = Static7.aClass2_Sub9_Sub1_1.method671(1);
			if (local143 == 1) {
				Static73.anIntArray202[Static58.anInt1521++] = 2047;
			}
			Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.method1176(local138 == 1, local93, local51);
		}
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(IBI)I")
	public static int method1871(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = 0;
		while (arg1 > 0) {
			local12 = local12 << 1 | arg0 & 0x1;
			arg0 >>>= 0x1;
			arg1--;
		}
		return local12;
	}
}
