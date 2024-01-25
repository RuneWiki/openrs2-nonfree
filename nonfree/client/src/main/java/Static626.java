import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static626 {

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(IIIIIII)I")
	public static int method8466(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg1 & 0x3;
		if ((arg3 & 0x1) == 1) {
			@Pc(14) int local14 = arg4;
			arg4 = arg5;
			arg5 = local14;
		}
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return arg2;
		} else if (local3 == 2) {
			return 7 + 1 - arg0 - arg4;
		} else {
			return 1 + 7 - arg5 - arg2;
		}
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(ILclient!ha;)V")
	public static void method8468(@OriginalArg(1) Class87 arg0) {
		for (@Pc(4) Class11_Sub4 local4 = (Class11_Sub4) Static458.aClass143_7.method3536(); local4 != null; local4 = (Class11_Sub4) Static458.aClass143_7.method3528()) {
			if (local4.aBoolean262) {
				local4.method2628(arg0);
			}
		}
	}
}
