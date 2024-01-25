import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static2 {

	@OriginalMember(owner = "client!ac", name = "M", descriptor = "I")
	public static int anInt130;

	@OriginalMember(owner = "client!ac", name = "J", descriptor = "[I")
	public static final int[] anIntArray1 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(BII)Z")
	public static boolean method178(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IBIIIIIII)Z")
	public static boolean method179(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg3 < arg4 + arg5 && arg5 < arg1 + arg3) {
			return arg6 + arg7 > arg0 && arg7 < arg2 + arg0;
		} else {
			return false;
		}
	}
}
