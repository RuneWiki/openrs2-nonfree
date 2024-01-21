import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!tb", name = "Zb", descriptor = "[I")
	public static int[] anIntArray342;

	@OriginalMember(owner = "client!tb", name = "ac", descriptor = "[Lclient!he;")
	public static Class1_Sub1_Sub5_Sub2[] aClass1_Sub1_Sub5_Sub2Array11;

	@OriginalMember(owner = "client!tb", name = "cc", descriptor = "Lclient!pb;")
	public static Class41 aClass41_59;

	@OriginalMember(owner = "client!tb", name = "kb", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1475 = Static69.method1153("");

	@OriginalMember(owner = "client!tb", name = "mb", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1476 = Static69.method1153("(U");

	@OriginalMember(owner = "client!tb", name = "tb", descriptor = "Lclient!rd;")
	private static Class64 aClass64_1478 = Static69.method1153("Examine");

	@OriginalMember(owner = "client!tb", name = "ub", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1479 = Static69.method1153(")1");

	@OriginalMember(owner = "client!tb", name = "Db", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1480 = aClass64_1478;

	@OriginalMember(owner = "client!tb", name = "Hb", descriptor = "Lclient!dd;")
	public static Class19 aClass19_88 = new Class19(64);

	@OriginalMember(owner = "client!tb", name = "Pb", descriptor = "[Z")
	public static boolean[] aBooleanArray10 = new boolean[5];

	@OriginalMember(owner = "client!tb", name = "Vb", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1481 = Static69.method1153("Hier klicken)1 um fortzufahren)3)3)3");

	@OriginalMember(owner = "client!tb", name = "Wb", descriptor = "Lclient!dd;")
	public static Class19 aClass19_89 = new Class19(64);

	@OriginalMember(owner = "client!tb", name = "Xb", descriptor = "[I")
	public static int[] anIntArray341 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!tb", name = "Yb", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray5 = new int[4][105][105];

	@OriginalMember(owner = "client!tb", name = "bc", descriptor = "Lclient!rd;")
	private static Class64 aClass64_1482 = Static69.method1153("Loaded input handler");

	@OriginalMember(owner = "client!tb", name = "dc", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1483 = aClass64_1482;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!gb;Lclient!gb;I)V")
	public static void method1647(@OriginalArg(0) Class1_Sub1_Sub5_Sub1 arg0, @OriginalArg(1) Class1_Sub1_Sub5_Sub1 arg1) {
		Static77.aClass37_28.method1459();
		if (Static64.anInt1487 == 0 || Static64.anInt1487 == 5) {
			arg1.method665(Static66.aClass64_953, 180, 54, 16777215);
			Static47.method1950(28, 62, 304, 34, 9179409);
			Static47.method1950(29, 63, 302, 32, 0);
			Static47.method1957(30, 64, Static93.anInt2092 * 3, 30, 9179409);
			Static47.method1957(Static93.anInt2092 * 3 + 30, 64, 300 - Static93.anInt2092 * 3, 30, 0);
			arg1.method665(Static34.aClass64_499, 180, 85, 16777215);
		}
		@Pc(83) byte local83;
		@Pc(91) int local91;
		if (Static64.anInt1487 == 20) {
			Static92.aClass1_Sub1_Sub5_Sub3_16.method1290(0, 0);
			local83 = 40;
			arg1.method663(Static34.aClass64_503, 180, 40, 16776960, true);
			local91 = local83 + 15;
			arg1.method663(Static34.aClass64_497, 180, 55, 16776960, true);
			@Pc(99) int local99 = local91 + 15;
			arg1.method663(Static34.aClass64_498, 180, 70, 16776960, true);
			@Pc(107) int local107 = local99 + 15;
			@Pc(108) int local108 = local107 + 10;
			arg1.method666(Static82.method1383(new Class64[] { Static25.aClass64_1770, Static34.aClass64_496 }), 90, 95, 16777215, true);
			@Pc(127) int local127 = local108 + 15;
			arg1.method666(Static82.method1383(new Class64[] { Static81.aClass64_879, Static34.aClass64_502.method1493() }), 92, 110, 16777215, true);
			@Pc(148) int local148 = local127 + 15;
		}
		if (Static64.anInt1487 == 10) {
			Static92.aClass1_Sub1_Sub5_Sub3_16.method1290(0, 0);
			if (Static40.anInt919 == 0) {
				local83 = 80;
				arg1.method663(Static62.aClass64_908, 180, 80, 16776960, true);
				local91 = local83 + 30;
				Static20.aClass1_Sub1_Sub5_Sub3_4.method1290(27, 100);
				arg1.method658(Static83.aClass64_1190, 27, 100, 144, 40, 16777215, true, 1, 1, 0);
				Static20.aClass1_Sub1_Sub5_Sub3_4.method1290(187, 100);
				arg1.method658(Static38.aClass64_591, 187, 100, 144, 40, 16777215, true, 1, 1, 0);
			} else if (Static40.anInt919 == 2) {
				local83 = 40;
				arg1.method663(Static34.aClass64_503, 180, 40, 16776960, true);
				local91 = local83 + 15;
				arg1.method663(Static34.aClass64_497, 180, 55, 16776960, true);
				local91 += 15;
				arg1.method663(Static34.aClass64_498, 180, 70, 16776960, true);
				local91 += 15;
				local91 += 10;
				arg1.method666(Static82.method1383(new Class64[] { Static25.aClass64_1770, Static34.aClass64_496, Static31.anInt799 == 0 & Static15.anInt471 % 40 < 20 ? Static27.aClass64_581 : Static34.aClass64_501 }), 90, 95, 16777215, true);
				local91 += 15;
				arg1.method666(Static82.method1383(new Class64[] { Static81.aClass64_879, Static34.aClass64_502.method1493(), Static31.anInt799 == 1 & Static15.anInt471 % 40 < 20 ? Static27.aClass64_581 : Static34.aClass64_501 }), 92, 110, 16777215, true);
				Static20.aClass1_Sub1_Sub5_Sub3_4.method1290(27, 130);
				local91 += 15;
				arg1.method663(Static105.aClass64_1573, 100, 155, 16777215, true);
				Static20.aClass1_Sub1_Sub5_Sub3_4.method1290(187, 130);
				arg1.method663(Static38.aClass64_593, 260, 155, 16777215, true);
			} else if (Static40.anInt919 == 3) {
				arg1.method663(Static99.aClass64_1404, 180, 40, 16776960, true);
				local83 = 65;
				arg1.method663(Static39.aClass64_594, 180, 65, 16777215, true);
				local91 = local83 + 15;
				arg1.method663(Static114.aClass64_1745, 180, 80, 16777215, true);
				local91 += 15;
				arg1.method663(Static99.aClass64_1412, 180, 95, 16777215, true);
				local91 += 15;
				arg1.method663(Static92.aClass64_1300, 180, 110, 16777215, true);
				local91 += 15;
				Static20.aClass1_Sub1_Sub5_Sub3_4.method1290(107, 130);
				arg1.method663(Static38.aClass64_593, 180, 155, 16777215, true);
			}
		}
		Static118.method2083();
		try {
			@Pc(463) Graphics local463 = Static93.aCanvas1.getGraphics();
			Static77.aClass37_28.method1457(202, 171, local463);
			Static61.aClass37_21.method1457(0, 0, local463);
			Static105.aClass37_35.method1457(637, 0, local463);
			if (Static27.aBoolean59) {
				Static27.aBoolean59 = false;
				Static62.aClass37_23.method1457(128, 0, local463);
				Static51.aClass37_16.method1457(202, 371, local463);
				Static58.aClass37_19.method1457(0, 265, local463);
				Static20.aClass37_9.method1457(562, 265, local463);
				Static98.aClass37_30.method1457(128, 171, local463);
				Static94.aClass37_29.method1457(562, 171, local463);
			}
		} catch (@Pc(530) Exception local530) {
			Static93.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!tb", name = "g", descriptor = "(I)V")
	public static void method1650() {
		aClass64_1475 = null;
		aClass19_88 = null;
		aClass64_1476 = null;
		aClass41_59 = null;
		aClass64_1478 = null;
		aClass64_1479 = null;
		aClass64_1481 = null;
		aClass64_1482 = null;
		aClass64_1480 = null;
		aClass64_1483 = null;
		anIntArray341 = null;
		anIntArrayArrayArray5 = null;
		aClass1_Sub1_Sub5_Sub2Array11 = null;
		anIntArray342 = null;
		aClass19_89 = null;
		aBooleanArray10 = null;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(BLclient!pb;I)Lclient!oa;")
	public static Class1_Sub1_Sub5_Sub3 method1653(@OriginalArg(1) Class41 arg0, @OriginalArg(2) int arg1) {
		return Static117.method2068(arg1, arg0) ? Static80.method1366() : null;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "([BIIB[Lclient!nc;II)V")
	public static void method1654(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class52[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11;
		for (@Pc(3) int local3 = 0; local3 < 4; local3++) {
			for (@Pc(7) int local7 = 0; local7 < 64; local7++) {
				for (local11 = 0; local11 < 64; local11++) {
					if (arg1 + local7 > 0 && local7 + arg1 < 103 && arg2 + local11 > 0 && local11 + arg2 < 103) {
						arg3[local3].anIntArrayArray22[local7 + arg1][arg2 + local11] &= 0xFEFFFFFF;
					}
				}
			}
		}
		@Pc(84) Class1_Sub6 local84 = new Class1_Sub6(arg0);
		for (local11 = 0; local11 < 4; local11++) {
			for (@Pc(90) int local90 = 0; local90 < 64; local90++) {
				for (@Pc(94) int local94 = 0; local94 < 64; local94++) {
					Static104.method1700(0, local90 + arg1, arg5, local84, arg4, arg2 + local94, local11);
				}
			}
		}
	}
}
