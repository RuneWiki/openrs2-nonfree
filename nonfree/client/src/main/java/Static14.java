import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!aj", name = "l", descriptor = "I")
	public static int anInt324;

	@OriginalMember(owner = "client!aj", name = "f", descriptor = "I")
	public static int anInt321 = -1;

	@OriginalMember(owner = "client!aj", name = "i", descriptor = "Lclient!et;")
	public static Class91 aClass91_1 = null;

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "(B)Z")
	public static boolean method516() {
		return Static197.anInt4015 > 0;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIIIIII)I")
	public static int method519(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = arg2 & 0x3;
		if ((arg1 & 0x1) == 1) {
			@Pc(14) int local14 = arg4;
			arg4 = arg5;
			arg5 = local14;
		}
		if (local7 == 0) {
			return arg3;
		} else if (local7 == 1) {
			return arg0;
		} else if (local7 == 2) {
			return 8 - arg3 - arg4;
		} else {
			return 7 + 1 - arg0 - arg5;
		}
	}
}
