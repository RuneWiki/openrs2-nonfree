import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static429 {

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(II)Z")
	public static boolean method6585(@OriginalArg(1) int arg0) {
		return arg0 == 7 || arg0 == 9;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIII)I")
	public static int method6586(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 <= arg0) {
			return arg0 > arg1 ? arg1 : arg0;
		} else {
			return arg2;
		}
	}
}
