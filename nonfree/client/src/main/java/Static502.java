import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static502 {

	@OriginalMember(owner = "client!qp", name = "h", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_155 = new Class322(138, 6);

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(IBIIIII)I")
	public static int method7337(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg5 & 0x3;
		if ((arg4 & 0x1) == 1) {
			@Pc(16) int local16 = arg2;
			arg2 = arg3;
			arg3 = local16;
		}
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return 1 + 7 - arg2 - arg0;
		} else if (local3 == 2) {
			return 1 + 7 - arg3 - arg1;
		} else {
			return arg0;
		}
	}
}
