import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!f", name = "ib", descriptor = "J")
	public static long aLong38;

	@OriginalMember(owner = "client!f", name = "Mb", descriptor = "Lclient!md;")
	public static Class40_Sub1 aClass40_Sub1_12;

	@OriginalMember(owner = "client!f", name = "Z", descriptor = "I")
	public static int anInt1065 = 0;

	@OriginalMember(owner = "client!f", name = "Kb", descriptor = "Lclient!rc;")
	private static Class55 aClass55_397 = Static34.method846("shake:");

	@OriginalMember(owner = "client!f", name = "sb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_393 = aClass55_397;

	@OriginalMember(owner = "client!f", name = "ub", descriptor = "Lclient!rc;")
	public static Class55 aClass55_394 = Static34.method846("");

	@OriginalMember(owner = "client!f", name = "ec", descriptor = "Lclient!rc;")
	private static Class55 aClass55_399 = Static34.method846("Login limit exceeded)3");

	@OriginalMember(owner = "client!f", name = "vb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_395 = aClass55_399;

	@OriginalMember(owner = "client!f", name = "Ub", descriptor = "Lclient!rc;")
	private static Class55 aClass55_398 = Static34.method846("cyan:");

	@OriginalMember(owner = "client!f", name = "zb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_396 = aClass55_398;

	@OriginalMember(owner = "client!f", name = "Fb", descriptor = "I")
	public static int anInt1088 = 0;

	@OriginalMember(owner = "client!f", name = "Ib", descriptor = "I")
	public static int anInt1089 = 2;

	@OriginalMember(owner = "client!f", name = "Vb", descriptor = "I")
	public static int anInt1098 = -1;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!me;IIII)V")
	public static void method696(@OriginalArg(0) Class6_Sub2_Sub2_Sub4 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static103.aClass21_23.method1445();
		Static111.aClass6_Sub2_Sub2_Sub1_25.method318(0, 0);
		arg0.method1312(Static94.aClass55_1133, 55, 28, 16777215, true);
		if (arg2 == 0) {
			arg0.method1312(Static45.aClass55_569, 55, 41, 65280, true);
		}
		if (arg2 == 1) {
			arg0.method1312(Static83.aClass55_950, 55, 41, 16776960, true);
		}
		if (arg2 == 2) {
			arg0.method1312(Static91.aClass55_1055, 55, 41, 16711680, true);
		}
		if (arg2 == 3) {
			arg0.method1312(Static49.aClass55_602, 55, 41, 65535, true);
		}
		arg0.method1312(Static103.aClass55_1280, 184, 28, 16777215, true);
		if (arg1 == 0) {
			arg0.method1312(Static45.aClass55_569, 184, 41, 65280, true);
		}
		if (arg1 == 1) {
			arg0.method1312(Static83.aClass55_950, 184, 41, 16776960, true);
		}
		if (arg1 == 2) {
			arg0.method1312(Static91.aClass55_1055, 184, 41, 16711680, true);
		}
		arg0.method1312(Static101.aClass55_1262, 324, 28, 16777215, true);
		if (arg3 == 0) {
			arg0.method1312(Static45.aClass55_569, 324, 41, 65280, true);
		}
		if (arg3 == 1) {
			arg0.method1312(Static83.aClass55_950, 324, 41, 16776960, true);
		}
		if (arg3 == 2) {
			arg0.method1312(Static91.aClass55_1055, 324, 41, 16711680, true);
		}
		arg0.method1308(Static3.aClass55_10, 417, 17, 85, 25, 16777215, true, 1, 1, 0);
		try {
			@Pc(160) Graphics local160 = Static32.aCanvas1.getGraphics();
			Static103.aClass21_23.method1442(0, local160, 453);
		} catch (@Pc(168) Exception local168) {
			Static32.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(III)I")
	public static int method697(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = arg0 + arg1 * 57;
		@Pc(20) int local20 = local14 ^ local14 << 13;
		@Pc(34) int local34 = (local20 * local20 * 15731 + 789221) * local20 + 1376312589 & Integer.MAX_VALUE;
		return local34 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!f", name = "c", descriptor = "(B)V")
	public static void method701() {
		aClass55_399 = null;
		aClass40_Sub1_12 = null;
		aClass55_396 = null;
		aClass55_393 = null;
		aClass55_395 = null;
		aClass55_394 = null;
		aClass55_398 = null;
		aClass55_397 = null;
	}

	@OriginalMember(owner = "client!f", name = "g", descriptor = "(I)V")
	public static void method704() {
		Static8.aClass19_1.method1164();
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			Static49.aLongArray4[local10] = 0L;
		}
		for (@Pc(24) int local24 = 0; local24 < 32; local24++) {
			Static28.aLongArray2[local24] = 0L;
		}
		Static64.anInt1916 = 0;
	}
}
