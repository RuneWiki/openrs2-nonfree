import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static453 {

	@OriginalMember(owner = "client!pg", name = "d", descriptor = "Lclient!da;")
	public static Class70 aClass70_9;

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "[Lclient!hk;")
	public static Class155[] aClass155Array19;

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "[I")
	public static final int[] anIntArray437 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(ZI)I")
	public static int method6398(@OriginalArg(1) int arg0) {
		if (arg0 == 6406) {
			return 1;
		} else if (arg0 == 6409) {
			return 1;
		} else if (arg0 == 32841) {
			return 1;
		} else if (arg0 == 6410) {
			return 2;
		} else if (arg0 == 6407) {
			return 3;
		} else if (arg0 == 6408) {
			return 4;
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
