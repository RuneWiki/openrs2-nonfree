import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static199 {

	@OriginalMember(owner = "client!oh", name = "n", descriptor = "Lclient!kk;")
	public static Class108 aClass108_6;

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(II)V")
	public static void method3232() {
		Static250.aClass26_50.method517(5);
	}

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "(II)I")
	public static int method3233(@OriginalArg(1) int arg0) {
		if (arg0 > 0) {
			return 1;
		} else if (arg0 < 0) {
			return -1;
		} else {
			return 0;
		}
	}
}
