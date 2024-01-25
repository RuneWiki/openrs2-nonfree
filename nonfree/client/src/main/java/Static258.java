import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static258 {

	@OriginalMember(owner = "client!ms", name = "d", descriptor = "[I")
	public static int[] anIntArray474;

	@OriginalMember(owner = "client!ms", name = "c", descriptor = "[Z")
	public static final boolean[] aBooleanArray18 = new boolean[200];

	@OriginalMember(owner = "client!ms", name = "h", descriptor = "I")
	public static final int anInt5004 = 1338;

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(III)V")
	public static void method3817(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11;
		if (Static18.anInt439 != arg1) {
			Static198.anIntArray749 = new int[arg1];
			for (local11 = 0; local11 < arg1; local11++) {
				Static198.anIntArray749[local11] = (local11 << 12) / arg1;
			}
			Static18.anInt439 = arg1;
			Static283.anInt5397 = arg1 - 1;
			Static368.anInt6729 = arg1 * 32;
		}
		if (arg0 == Static217.anInt4363) {
			return;
		}
		if (Static18.anInt439 == arg0) {
			Static134.anIntArray308 = Static198.anIntArray749;
		} else {
			Static134.anIntArray308 = new int[arg0];
			for (local11 = 0; local11 < arg0; local11++) {
				Static134.anIntArray308[local11] = (local11 << 12) / arg0;
			}
		}
		Static443.anInt7904 = arg0 - 1;
		Static217.anInt4363 = arg0;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(IB)V")
	public static void method3819(@OriginalArg(0) int arg0) {
		Static441.anInt7760 = arg0;
		Static149.aClass91_45.method1999();
	}
}
