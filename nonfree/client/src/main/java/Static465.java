import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static465 {

	@OriginalMember(owner = "client!rk", name = "s", descriptor = "I")
	public static int anInt7977;

	@OriginalMember(owner = "client!rk", name = "t", descriptor = "[I")
	public static int[] anIntArray526;

	@OriginalMember(owner = "client!rk", name = "c", descriptor = "(I)V")
	public static void method6556() {
		Static344.aClass313_37.method6977();
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(ILclient!iw;IZILclient!iw;Z)I")
	public static int method6557(@OriginalArg(0) int arg0, @OriginalArg(1) Class136_Sub1 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class136_Sub1 arg4, @OriginalArg(6) boolean arg5) {
		@Pc(10) int local10 = Static22.method431(arg3, arg2, arg4, arg1);
		if (local10 != 0) {
			return arg2 ? -local10 : local10;
		} else if (arg0 == -1) {
			return 0;
		} else {
			@Pc(36) int local36 = Static22.method431(arg0, arg5, arg4, arg1);
			return arg5 ? -local36 : local36;
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(BCLjava/lang/String;)I")
	public static int method6558(@OriginalArg(1) char arg0, @OriginalArg(2) String arg1) {
		@Pc(7) int local7 = 0;
		@Pc(10) int local10 = arg1.length();
		for (@Pc(17) int local17 = 0; local17 < local10; local17++) {
			if (arg1.charAt(local17) == arg0) {
				local7++;
			}
		}
		return local7;
	}
}
