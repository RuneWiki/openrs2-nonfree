import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static606 {

	@OriginalMember(owner = "client!vn", name = "i", descriptor = "Lclient!gca;")
	public static Class118 aClass118_47 = new Class118(8);

	@OriginalMember(owner = "client!vn", name = "l", descriptor = "I")
	public static int anInt9764 = 0;

	@OriginalMember(owner = "client!vn", name = "p", descriptor = "Lclient!qk;")
	public static final Class288 aClass288_337 = new Class288(1, 3);

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIIIIII)I")
	public static int method8164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg4 & 0x1) == 1) {
			@Pc(13) int local13 = arg3;
			arg3 = arg1;
			arg1 = local13;
		}
		@Pc(25) int local25 = arg0 & 0x3;
		if (local25 == 0) {
			return arg2;
		} else if (local25 == 1) {
			return 1 + 7 - arg3 - arg5;
		} else if (local25 == 2) {
			return 7 + 1 - arg2 - arg1;
		} else {
			return arg5;
		}
	}
}
