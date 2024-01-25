import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static392 {

	@OriginalMember(owner = "client!tq", name = "L", descriptor = "I")
	public static int anInt6418;

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(ZLjava/lang/String;)V")
	public static void method5198(@OriginalArg(1) String arg0) {
		Static290.method3782("", arg0, 0, "", 0);
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIIIIII)I")
	public static int method5200(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = arg5 & 0x3;
		if ((arg0 & 0x1) == 1) {
			@Pc(14) int local14 = arg3;
			arg3 = arg2;
			arg2 = local14;
		}
		if (local3 == 0) {
			return arg4;
		} else if (local3 == 1) {
			return 7 + 1 - arg1 - arg3;
		} else if (local3 == 2) {
			return 1 + 7 - arg2 - arg4;
		} else {
			return arg1;
		}
	}
}
