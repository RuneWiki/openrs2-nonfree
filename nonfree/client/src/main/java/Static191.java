import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "[Lclient!ui;")
	public static Class349[] aClass349Array1;

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "Lclient!el;")
	public static final Class109 aClass109_69 = new Class109(131, -1);

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILclient!iu;ZIIZLclient!iu;)I")
	public static int method2760(@OriginalArg(0) int arg0, @OriginalArg(1) Class180_Sub1 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) Class180_Sub1 arg5) {
		@Pc(10) int local10 = Static373.method5467(arg3, arg2, arg5, arg1);
		if (local10 != 0) {
			return arg2 ? -local10 : local10;
		} else if (arg0 == -1) {
			return 0;
		} else {
			@Pc(36) int local36 = Static373.method5467(arg0, arg4, arg5, arg1);
			return arg4 ? -local36 : local36;
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(III)Lclient!pb;")
	public static Class273 method2762(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class174 local7 = Static260.aClass174ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass273_67;
	}
}
