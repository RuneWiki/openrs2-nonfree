import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static44 {

	@OriginalMember(owner = "client!cb", name = "n", descriptor = "Lclient!mi;")
	public static Class155_Sub1 aClass155_Sub1_1;

	@OriginalMember(owner = "client!cb", name = "B", descriptor = "F")
	public static float aFloat23;

	@OriginalMember(owner = "client!cb", name = "D", descriptor = "Lclient!uf;")
	public static final Class237 aClass237_12 = new Class237(51, 8);

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIIBIII)Z")
	public static boolean method729(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg5 + arg3 > arg0 && arg1 + arg0 > arg5) {
			return arg4 < arg6 + arg2 && arg4 + arg7 > arg2;
		} else {
			return false;
		}
	}
}
