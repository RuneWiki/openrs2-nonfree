import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static559 {

	@OriginalMember(owner = "client!tv", name = "x", descriptor = "Lclient!mba;")
	public static final Class216 aClass216_67 = new Class216();

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(IIIIIIIII)Z")
	public static boolean method7954(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		if (arg1 < arg3 + arg5 && arg1 + arg6 > arg3) {
			return arg7 < arg0 + arg2 && arg7 + arg4 > arg2;
		} else {
			return false;
		}
	}
}
