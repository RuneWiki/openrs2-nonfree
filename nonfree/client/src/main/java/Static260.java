import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static260 {

	@OriginalMember(owner = "client!or", name = "n", descriptor = "I")
	public static int anInt4514 = -1;

	@OriginalMember(owner = "client!or", name = "x", descriptor = "Z")
	public static boolean aBoolean445 = false;

	@OriginalMember(owner = "client!or", name = "A", descriptor = "J")
	public static long aLong146 = 0L;

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(IBIIIII)I")
	public static int method3997(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(15) int local15 = arg1 & 0x3;
		if ((arg4 & 0x1) == 1) {
			@Pc(26) int local26 = arg5;
			arg5 = arg2;
			arg2 = local26;
		}
		if (local15 == 0) {
			return arg3;
		} else if (local15 == 1) {
			return arg0;
		} else if (local15 == 2) {
			return 7 + 1 - arg3 - arg5;
		} else {
			return 7 + 1 - arg0 - arg2;
		}
	}
}
