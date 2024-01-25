import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static556 {

	@OriginalMember(owner = "client!vp", name = "h", descriptor = "I")
	public static int anInt9659 = 0;

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(III)Lclient!al;")
	public static Class15_Sub1 method7726(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class133 local7 = Static113.aClass133ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass15_Sub1_2;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(ZIZLclient!pd;Lclient!pd;II)I")
	public static int method7728(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class139_Sub1 arg3, @OriginalArg(4) Class139_Sub1 arg4, @OriginalArg(6) int arg5) {
		@Pc(12) int local12 = Static193.method3267(arg5, arg3, arg4, arg2);
		if (local12 != 0) {
			return arg2 ? -local12 : local12;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(34) int local34 = Static193.method3267(arg1, arg3, arg4, arg0);
			return arg0 ? -local34 : local34;
		}
	}
}
