import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static2 {

	@OriginalMember(owner = "client!aaa", name = "d", descriptor = "[I")
	public static int[] anIntArray1;

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "[I")
	public static int[] anIntArray2;

	@OriginalMember(owner = "client!aaa", name = "b", descriptor = "[[I")
	public static final int[][] anIntArrayArray1 = new int[128][128];

	@OriginalMember(owner = "client!aaa", name = "c", descriptor = "I")
	public static int anInt3 = 0;

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(II)I")
	public static int method19(@OriginalArg(1) int arg0) {
		if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
			return 6407;
		} else if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836) {
			return 6408;
		} else if (arg0 == 6406 || arg0 == 34844) {
			return 6406;
		} else if (arg0 == 6409 || arg0 == 34846) {
			return 6409;
		} else if (arg0 == 6410 || arg0 == 34847) {
			return 6410;
		} else if (arg0 == 6402) {
			return 6402;
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
