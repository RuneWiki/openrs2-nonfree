import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static108 {

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(IZIIIIIII)Z")
	public static boolean method1627(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg0 < arg4 + arg3 && arg0 + arg1 > arg4) {
			return arg5 + arg7 > arg2 && arg5 < arg2 + arg6;
		} else {
			return false;
		}
	}
}
