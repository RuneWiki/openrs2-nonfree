import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static219 {

	@OriginalMember(owner = "client!hs", name = "M", descriptor = "Lclient!vm;")
	public static final Class363 aClass363_4 = new Class363();

	@OriginalMember(owner = "client!hs", name = "N", descriptor = "[I")
	public static final int[] anIntArray307 = new int[13];

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "(IIIIIII)I")
	public static int method3392(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg1 & 0x3;
		if ((arg2 & 0x1) == 1) {
			@Pc(10) int local10 = arg0;
			arg0 = arg4;
			arg4 = local10;
		}
		if (local3 == 0) {
			return arg3;
		} else if (local3 == 1) {
			return 1 + 7 - arg0 - arg5;
		} else if (local3 == 2) {
			return 1 + 7 - arg4 - arg3;
		} else {
			return arg5;
		}
	}
}
