import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static509 {

	@OriginalMember(owner = "client!vca", name = "r", descriptor = "Lclient!bv;")
	public static final Class40 aClass40_145 = new Class40("white:", "weiss:", "blanc:", "branco:");

	@OriginalMember(owner = "client!vca", name = "t", descriptor = "[[I")
	public static final int[][] anIntArrayArray73 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(IB)I")
	public static int method6985(@OriginalArg(0) int arg0) {
		if (arg0 < 96) {
			return 0;
		} else if (arg0 < 128) {
			return 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(I)V")
	public static void method6987() {
		if (Static287.aBoolean405) {
			return;
		}
		Static474.aBoolean196 = true;
		if (Static300.aClass5_Sub28_Sub1_1.aBoolean334) {
			Static476.aFloat339 = (int) Static476.aFloat339 + 191 & 0xFFFFFF80;
		} else {
			Static124.aFloat137 += (24.0F - Static124.aFloat137) / 2.0F;
		}
		Static287.aBoolean405 = true;
	}
}
