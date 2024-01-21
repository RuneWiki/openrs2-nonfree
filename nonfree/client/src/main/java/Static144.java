import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!rg", name = "ib", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!rg", name = "ab", descriptor = "[[S")
	public static short[][] aShortArrayArray6 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!rg", name = "cb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1379 = Static169.method2903("mapmarker");

	@OriginalMember(owner = "client!rg", name = "eb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1380 = Static169.method2903("Lade)3)3)3");

	@OriginalMember(owner = "client!rg", name = "kb", descriptor = "Lclient!ed;")
	private static Class23 aClass23_1383 = Static169.method2903("flash2:");

	@OriginalMember(owner = "client!rg", name = "fb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1381 = aClass23_1383;

	@OriginalMember(owner = "client!rg", name = "gb", descriptor = "I")
	public static int anInt3641 = 0;

	@OriginalMember(owner = "client!rg", name = "hb", descriptor = "I")
	public static int anInt3642 = 0;

	@OriginalMember(owner = "client!rg", name = "jb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1382 = aClass23_1383;

	@OriginalMember(owner = "client!rg", name = "lb", descriptor = "I")
	public static int anInt3643 = 0;

	@OriginalMember(owner = "client!rg", name = "mb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1384 = Static169.method2903(":clan:");

	@OriginalMember(owner = "client!rg", name = "e", descriptor = "(I)V")
	public static void method2507() {
		for (@Pc(12) Class1_Sub1_Sub1_Sub3 local12 = (Class1_Sub1_Sub1_Sub3) Static49.aClass56_5.method1853(); local12 != null; local12 = (Class1_Sub1_Sub1_Sub3) Static49.aClass56_5.method1855()) {
			if (local12.anInt2878 != Static85.anInt2267 || local12.aBoolean140) {
				local12.method3141();
			} else if (Static26.anInt845 >= local12.anInt2875) {
				local12.method1987(Static58.anInt1635);
				if (local12.aBoolean140) {
					local12.method3141();
				} else {
					Static123.aClass80_1.method2705(local12.anInt2878, local12.anInt2870, local12.anInt2874, local12.anInt2871, 60, local12, 0, -1, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!rg", name = "f", descriptor = "(I)V")
	public static void method2508() {
		aClass23_1383 = null;
		aClass23_1382 = null;
		anIntArrayArrayArray4 = null;
		aClass23_1379 = null;
		aShortArrayArray6 = null;
		aClass23_1381 = null;
		aClass23_1384 = null;
		aClass23_1380 = null;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(BIIII)V")
	public static void method2509(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = arg0; local3 <= arg0 + arg1; local3++) {
			for (@Pc(7) int local7 = arg2; local7 <= arg3 + arg2; local7++) {
				if (local7 >= 0 && local7 < 104 && local3 >= 0 && local3 < 104) {
					Static60.aByteArrayArrayArray109[0][local7][local3] = 127;
					if (arg2 == local7 && local7 > 0) {
						Static141.anIntArrayArrayArray3[0][local7][local3] = Static141.anIntArrayArrayArray3[0][local7 - 1][local3];
					}
					if (arg3 + arg2 == local7 && local7 < 103) {
						Static141.anIntArrayArrayArray3[0][local7][local3] = Static141.anIntArrayArrayArray3[0][local7 + 1][local3];
					}
					if (local3 == arg0 && local3 > 0) {
						Static141.anIntArrayArrayArray3[0][local7][local3] = Static141.anIntArrayArrayArray3[0][local7][local3 - 1];
					}
					if (arg1 + arg0 == local3 && local3 < 103) {
						Static141.anIntArrayArrayArray3[0][local7][local3] = Static141.anIntArrayArrayArray3[0][local7][local3 + 1];
					}
				}
			}
		}
	}
}
