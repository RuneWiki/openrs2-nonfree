import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!ma", name = "g", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray9;

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "Lclient!sc;")
	public static Class107 aClass107_748 = Static231.method3737("rot:");

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "Z")
	public static volatile boolean aBoolean235 = true;

	@OriginalMember(owner = "client!ma", name = "d", descriptor = "[[S")
	public static short[][] aShortArrayArray5 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!ma", name = "k", descriptor = "Lclient!sc;")
	public static Class107 aClass107_749 = Static231.method3737("blinken3:");

	@OriginalMember(owner = "client!ma", name = "m", descriptor = "[I")
	public static int[] anIntArray248 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IZ)I")
	public static int method2153(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = arg0 >> 6 & 0x3;
		@Pc(13) int local13 = arg0 & 0x3F;
		if (local13 == 18) {
			if (local5 == 0) {
				return 1;
			}
			if (local5 == 1) {
				return 2;
			}
			if (local5 == 2) {
				return 4;
			}
			if (local5 == 3) {
				return 8;
			}
		} else if (local13 == 19 || local13 == 21) {
			if (local5 == 0) {
				return 16;
			}
			if (local5 == 1) {
				return 32;
			}
			if (local5 == 2) {
				return 64;
			}
			if (local5 == 3) {
				return 128;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)V")
	public static void method2155() {
		Static201.method3227();
		for (@Pc(8) int local8 = 0; local8 < 4; local8++) {
			Static107.aClass60Array1[local8].method1686();
		}
		System.gc();
	}
}
