import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static481 {

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "J")
	public static long aLong245;

	@OriginalMember(owner = "client!qi", name = "d", descriptor = "J")
	public static long aLong246;

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(BJ)V")
	public static void method7019(@OriginalArg(1) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(19) InterruptedException local19) {
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(III)V")
	public static void method7020(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class351 local7 = Static441.aClass351ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null) {
			Static571.method7962(local7.aClass2_Sub1_Sub3_1);
			if (local7.aClass2_Sub1_Sub3_1 != null) {
				local7.aClass2_Sub1_Sub3_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILclient!nd;IZILclient!nd;Z)I")
	public static int method7021(@OriginalArg(0) int arg0, @OriginalArg(1) Class235_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) Class235_Sub1 arg4, @OriginalArg(6) boolean arg5) {
		@Pc(10) int local10 = Static50.method975(arg2, arg1, arg3, arg4);
		if (local10 != 0) {
			return arg3 ? -local10 : local10;
		} else if (arg0 == -1) {
			return 0;
		} else {
			@Pc(34) int local34 = Static50.method975(arg0, arg1, arg5, arg4);
			return arg5 ? -local34 : local34;
		}
	}
}
