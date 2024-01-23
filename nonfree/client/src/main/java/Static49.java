import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "I")
	public static int anInt1133 = 1;

	@OriginalMember(owner = "client!dk", name = "d", descriptor = "S")
	public static short aShort11 = 256;

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)V")
	public static void method984() {
		Static4.method119(0, 0);
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIIIIII)I")
	public static int method985(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = arg5 & 0x3;
		if ((arg2 & 0x1) == 1) {
			@Pc(16) int local16 = arg1;
			arg1 = arg0;
			arg0 = local16;
		}
		if (local7 == 0) {
			return arg3;
		} else if (local7 == 1) {
			return arg4;
		} else if (local7 == 2) {
			return 7 + 1 - arg3 - arg1;
		} else {
			return 1 + 7 - arg0 - arg4;
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(Z)V")
	public static void method986() {
		Static261.aClass46_35.method1077();
	}

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "(I)I")
	public static int method987() {
		return 6;
	}
}
