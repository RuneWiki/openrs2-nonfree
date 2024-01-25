import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static183 {

	@OriginalMember(owner = "client!gt", name = "r", descriptor = "[I")
	public static final int[] anIntArray304 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!gt", name = "b", descriptor = "(II)I")
	public static int method3078(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(IJ)V")
	public static void method3079(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static389.method5678(arg0 - 1L);
			Static389.method5678(1L);
		} else {
			Static389.method5678(arg0);
		}
	}
}
