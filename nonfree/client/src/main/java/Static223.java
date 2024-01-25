import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static223 {

	@OriginalMember(owner = "client!jg", name = "j", descriptor = "F")
	public static float aFloat154;

	@OriginalMember(owner = "client!jg", name = "k", descriptor = "I")
	public static int anInt4823;

	@OriginalMember(owner = "client!jg", name = "p", descriptor = "Lclient!xa;")
	public static Class119 aClass119_17;

	@OriginalMember(owner = "client!jg", name = "r", descriptor = "I")
	public static int anInt4827;

	@OriginalMember(owner = "client!jg", name = "f", descriptor = "Lclient!hb;")
	public static final Class117 aClass117_14 = new Class117(10, 6);

	@OriginalMember(owner = "client!jg", name = "o", descriptor = "I")
	public static int anInt4826 = 0;

	@OriginalMember(owner = "client!jg", name = "t", descriptor = "I")
	public static int anInt4829 = 0;

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIIIIII)I")
	public static int method4044(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = arg0 & 0x3;
		if ((arg4 & 0x1) == 1) {
			@Pc(14) int local14 = arg5;
			arg5 = arg1;
			arg1 = local14;
		}
		if (local7 == 0) {
			return arg2;
		} else if (local7 == 1) {
			return 1 + 7 - arg5 - arg3;
		} else if (local7 == 2) {
			return 1 + 7 - arg1 - arg2;
		} else {
			return arg3;
		}
	}
}
