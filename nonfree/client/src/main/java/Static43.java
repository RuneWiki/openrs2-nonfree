import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static43 {

	@OriginalMember(owner = "client!bv", name = "h", descriptor = "Lclient!ph;")
	public static Class187 aClass187_11;

	@OriginalMember(owner = "client!bv", name = "d", descriptor = "Lclient!bj;")
	public static final Class27 aClass27_19 = new Class27(27, 4);

	@OriginalMember(owner = "client!bv", name = "f", descriptor = "I")
	public static int anInt727 = 0;

	@OriginalMember(owner = "client!bv", name = "i", descriptor = "[I")
	public static final int[] anIntArray66 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(IIIIIIIII)Z")
	public static boolean method655(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg6 + arg0 > arg3 && arg5 + arg3 > arg0) {
			return arg1 + arg7 > arg2 && arg4 + arg2 > arg7;
		} else {
			return false;
		}
	}
}
