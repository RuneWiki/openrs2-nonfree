import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static268 {

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "Lclient!ov;")
	public static Class226 aClass226_7;

	@OriginalMember(owner = "client!lc", name = "e", descriptor = "[[I")
	public static final int[][] anIntArrayArray61 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!lc", name = "f", descriptor = "S")
	public static short aShort87 = 320;

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "I")
	public static int anInt5100 = 0;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)Z")
	public static boolean method4414(@OriginalArg(1) int arg0) {
		return arg0 >= 4 && arg0 <= 8;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZI)Z")
	public static boolean method4415(@OriginalArg(1) int arg0) {
		if (arg0 == 57 || arg0 == 58 || arg0 == 11 || arg0 == 17 || arg0 == 49) {
			return true;
		} else {
			return arg0 == 10 || arg0 == 1004;
		}
	}
}
