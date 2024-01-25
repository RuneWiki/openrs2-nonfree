import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "Lclient!ga;")
	public static final Class124 aClass124_23 = new Class124();

	@OriginalMember(owner = "client!faa", name = "d", descriptor = "Lclient!pg;")
	public static final Class271 aClass271_8 = new Class271();

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(IIIIIII)I")
	public static int method2216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if ((arg2 & 0x1) == 1) {
			@Pc(12) int local12 = arg5;
			arg5 = arg0;
			arg0 = local12;
		}
		@Pc(20) int local20 = arg4 & 0x3;
		if (local20 == 0) {
			return arg3;
		} else if (local20 == 1) {
			return arg1;
		} else if (local20 == 2) {
			return 1 + 7 - arg5 - arg3;
		} else {
			return 7 + 1 - arg1 - arg0;
		}
	}
}
