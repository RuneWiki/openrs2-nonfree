import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static396 {

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "I")
	public static int anInt7578;

	@OriginalMember(owner = "client!oga", name = "c", descriptor = "[I")
	public static final int[] anIntArray485 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!oga", name = "f", descriptor = "Lclient!qv;")
	public static final Class286 aClass286_5 = new Class286();

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(II)Z")
	public static boolean method6492(@OriginalArg(1) int arg0) {
		if (arg0 == 21 || arg0 == 10 || arg0 == 47 || arg0 == 22 || arg0 == 5) {
			return true;
		} else {
			return arg0 == 49 || arg0 == 1010;
		}
	}
}
