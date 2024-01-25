import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static545 {

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "Lclient!hj;")
	public static final Class134 aClass134_7 = new Class134();

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIIZIII)I")
	public static int method8160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg2 & 0x3;
		if ((arg5 & 0x1) == 1) {
			@Pc(21) int local21 = arg4;
			arg4 = arg3;
			arg3 = local21;
		}
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return arg0;
		} else if (local3 == 2) {
			return 7 + 1 - arg1 - arg4;
		} else {
			return 1 + 7 - arg3 - arg0;
		}
	}
}
