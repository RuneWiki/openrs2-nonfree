import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static25 {

	@OriginalMember(owner = "client!at", name = "b", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_10 = new Class44(89, -2);

	@OriginalMember(owner = "client!at", name = "f", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_11 = new Class44(48, 5);

	@OriginalMember(owner = "client!at", name = "i", descriptor = "[I")
	public static final int[] anIntArray28 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(II)I")
	public static int method477(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(BI)Z")
	public static boolean method478(@OriginalArg(1) int arg0) {
		return arg0 == 7 || arg0 == 8 || arg0 == 9;
	}
}
