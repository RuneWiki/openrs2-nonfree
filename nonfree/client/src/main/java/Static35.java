import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!ge", name = "Eb", descriptor = "[I")
	public static int[] anIntArray363;

	@OriginalMember(owner = "client!ge", name = "ic", descriptor = "Lclient!kb;")
	public static Class2_Sub1_Sub4_Sub2 aClass2_Sub1_Sub4_Sub2_8;

	@OriginalMember(owner = "client!ge", name = "Kc", descriptor = "[I")
	public static int[] anIntArray369;

	@OriginalMember(owner = "client!ge", name = "Nc", descriptor = "Lclient!pa;")
	public static Class51 aClass51_62;

	@OriginalMember(owner = "client!ge", name = "pb", descriptor = "I")
	public static int anInt2884 = -1;

	@OriginalMember(owner = "client!ge", name = "vb", descriptor = "[J")
	public static long[] aLongArray8 = new long[32];

	@OriginalMember(owner = "client!ge", name = "xb", descriptor = "Lclient!ke;")
	private static Class39 aClass39_1308 = Static2.method66("Loaded title screen");

	@OriginalMember(owner = "client!ge", name = "Gb", descriptor = "Z")
	public static boolean aBoolean136 = false;

	@OriginalMember(owner = "client!ge", name = "Hb", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1309 = Static2.method66("Anmelde)2Zeitlimit -Uberschritten)3");

	@OriginalMember(owner = "client!ge", name = "lc", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1310 = Static2.method66("runes");

	@OriginalMember(owner = "client!ge", name = "qc", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1311 = aClass39_1308;

	@OriginalMember(owner = "client!ge", name = "Dc", descriptor = "Lclient!ke;")
	public static Class39 aClass39_1313 = Static2.method66("weiss:");

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIII)V")
	public static void method2065(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7;
		for (@Pc(3) int local3 = 0; local3 < 8; local3++) {
			for (local7 = 0; local7 < 8; local7++) {
				Static22.anIntArrayArrayArray3[arg1][arg2 + local3][local7 + arg0] = 0;
			}
		}
		if (arg2 > 0) {
			for (local7 = 1; local7 < 8; local7++) {
				Static22.anIntArrayArrayArray3[arg1][arg2][arg0 + local7] = Static22.anIntArrayArrayArray3[arg1][arg2 - 1][arg0 + local7];
			}
		}
		if (arg0 > 0) {
			for (local7 = 1; local7 < 8; local7++) {
				Static22.anIntArrayArrayArray3[arg1][arg2 + local7][arg0] = Static22.anIntArrayArrayArray3[arg1][local7 + arg2][arg0 - 1];
			}
		}
		if (arg2 > 0 && Static22.anIntArrayArrayArray3[arg1][arg2 - 1][arg0] != 0) {
			Static22.anIntArrayArrayArray3[arg1][arg2][arg0] = Static22.anIntArrayArrayArray3[arg1][arg2 - 1][arg0];
		} else if (arg0 > 0 && Static22.anIntArrayArrayArray3[arg1][arg2][arg0 - 1] != 0) {
			Static22.anIntArrayArrayArray3[arg1][arg2][arg0] = Static22.anIntArrayArrayArray3[arg1][arg2][arg0 - 1];
		} else if (arg2 > 0 && arg0 > 0 && Static22.anIntArrayArrayArray3[arg1][arg2 - 1][arg0 - 1] != 0) {
			Static22.anIntArrayArrayArray3[arg1][arg2][arg0] = Static22.anIntArrayArrayArray3[arg1][arg2 - 1][arg0 - 1];
		}
	}

	@OriginalMember(owner = "client!ge", name = "f", descriptor = "(B)V")
	public static void method2068() {
		Static45.anIntArray176 = new int[104];
		Static29.anIntArray90 = new int[104];
		Static19.anIntArrayArray6 = new int[105][105];
		Static5.anIntArray13 = new int[104];
		Static73.anIntArray259 = new int[104];
		Static83.anInt2274 = 99;
		Static96.aByteArrayArrayArray9 = new byte[4][104][104];
		Static64.aByteArrayArrayArray3 = new byte[4][105][105];
		Static62.anIntArrayArrayArray7 = new int[4][105][105];
		Static5.anIntArray15 = new int[104];
		Static69.aByteArrayArrayArray4 = new byte[4][104][104];
		Static57.aByteArrayArrayArray2 = new byte[4][104][104];
		Static96.aByteArrayArrayArray7 = new byte[4][104][104];
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILclient!ke;)Z")
	public static boolean method2069(@OriginalArg(1) Class39 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static72.anInt2061; local11++) {
			if (arg0.method1106(Static75.aClass39Array4[local11])) {
				return true;
			}
		}
		return arg0.method1106(Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.aClass39_1182);
	}

	@OriginalMember(owner = "client!ge", name = "k", descriptor = "(I)V")
	public static void method2073() {
		aClass39_1313 = null;
		aLongArray8 = null;
		aClass2_Sub1_Sub4_Sub2_8 = null;
		aClass39_1309 = null;
		aClass39_1310 = null;
		aClass39_1311 = null;
		anIntArray363 = null;
		aClass51_62 = null;
		anIntArray369 = null;
		aClass39_1308 = null;
	}
}
