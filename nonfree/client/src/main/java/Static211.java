import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static211 {

	@OriginalMember(owner = "client!ica", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString44 = null;

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(II)Z")
	public static boolean method3720(@OriginalArg(1) int arg0) {
		if (arg0 == 16 || arg0 == 51 || arg0 == 44 || arg0 == 23 || arg0 == 4) {
			return true;
		} else {
			return arg0 == 21 || arg0 == 1002;
		}
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(BI)Z")
	public static boolean method3722(@OriginalArg(1) int arg0) {
		return arg0 == 3 || arg0 == 4 || arg0 == 5 || arg0 == 6;
	}
}
