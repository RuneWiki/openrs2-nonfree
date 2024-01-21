import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!wa", name = "Nb", descriptor = "J")
	public static long aLong155;

	@OriginalMember(owner = "client!wa", name = "Cb", descriptor = "Ljava/lang/Object;")
	public static Object anObject4 = new Object();

	@OriginalMember(owner = "client!wa", name = "Hb", descriptor = "[[S")
	public static short[][] aShortArrayArray6 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!wa", name = "Jb", descriptor = "I")
	public static int anInt3980 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!wa", name = "Lb", descriptor = "[I")
	public static int[] anIntArray366 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(ILclient!bg;II)Z")
	public static boolean method2970(@OriginalArg(1) Class11 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) byte[] local14 = arg0.method2049(arg1, arg2);
		if (local14 == null) {
			return false;
		} else {
			Static5.method96(local14);
			return true;
		}
	}

	@OriginalMember(owner = "client!wa", name = "r", descriptor = "(I)V")
	public static void method2973() {
		anObject4 = null;
		aShortArrayArray6 = null;
		anIntArray366 = null;
	}
}
