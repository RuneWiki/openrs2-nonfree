import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "[S")
	public static short[] aShortArray40;

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIIIII)I")
	public static int method1659(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg3 & 0x3;
		if ((arg0 & 0x1) == 1) {
			@Pc(10) int local10 = arg5;
			arg5 = arg4;
			arg4 = local10;
		}
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return 7 + 1 - arg1 - arg5;
		} else if (local3 == 2) {
			return 1 + 7 - arg4 - arg2;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(DI)V")
	public static void method1660(@OriginalArg(0) double arg0) {
		if (Static70.aDouble1 == arg0) {
			return;
		}
		for (@Pc(7) int local7 = 0; local7 < 256; local7++) {
			@Pc(19) int local19 = (int) (Math.pow((double) local7 / 255.0D, arg0) * 255.0D);
			Static285.anIntArray557[local7] = local19 <= 255 ? local19 : 255;
		}
		Static70.aDouble1 = arg0;
	}
}
