import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static300 {

	@OriginalMember(owner = "client!kea", name = "f", descriptor = "[I")
	public static int[] anIntArray289;

	@OriginalMember(owner = "client!kea", name = "c", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_196 = new Class179(117, 7);

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(ZII)Z")
	public static boolean method4281(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 >= 1000 && arg0 < 1000) {
			return true;
		} else if (arg1 >= 1000 || arg0 >= 1000) {
			return arg1 >= 1000 && arg0 >= 1000;
		} else if (Static478.method6997(arg0)) {
			return true;
		} else {
			return !Static478.method6997(arg1);
		}
	}
}
