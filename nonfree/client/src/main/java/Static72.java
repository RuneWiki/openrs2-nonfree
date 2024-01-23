import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!fa", name = "d", descriptor = "I")
	public static int anInt1321;

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "Z")
	public static boolean aBoolean96 = false;

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "I")
	public static int anInt1320 = 0;

	@OriginalMember(owner = "client!fa", name = "h", descriptor = "[Z")
	public static boolean[] aBooleanArray11 = new boolean[100];

	@OriginalMember(owner = "client!fa", name = "j", descriptor = "I")
	public static int anInt1326 = 0;

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V")
	public static void method1078() {
		Static261.method3958(false);
		System.gc();
		Static264.method3976(25);
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(BI)I")
	public static int method1079(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIII)I")
	public static int method1080(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return 1023 - arg0;
		} else if (local3 == 2) {
			return 1023 - arg1;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(I)V")
	public static void method1081() {
		aBooleanArray11 = null;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(B)V")
	public static void method1082() {
		@Pc(7) int local7 = 0;
		@Pc(10) int[] local10 = new int[Static225.anInt4475];
		@Pc(12) int local12;
		for (local12 = 0; local12 < Static225.anInt4475; local12++) {
			@Pc(19) Class163 local19 = Static277.method4117(local12);
			if (local19.anInt4879 >= 0 || local19.anInt4910 >= 0) {
				local10[local7++] = local12;
			}
		}
		Static94.anIntArray208 = new int[local7];
		for (local12 = 0; local12 < local7; local12++) {
			Static94.anIntArray208[local12] = local10[local12];
		}
	}
}
