import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static504 {

	@OriginalMember(owner = "client!tf", name = "j", descriptor = "Lclient!iv;")
	public static final Class162 aClass162_27 = new Class162(12, -1);

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "([[IZ)V")
	public static void method7402(@OriginalArg(0) int[][] arg0) {
		Static46.anIntArrayArray4 = arg0;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IZ)Z")
	public static boolean method7403(@OriginalArg(0) int arg0) {
		if (arg0 == 6 || arg0 == 23 || arg0 == 45 || arg0 == 12 || arg0 == 25) {
			return true;
		} else {
			return arg0 == 58 || arg0 == 1009;
		}
	}
}
