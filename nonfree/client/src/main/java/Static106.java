import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!eda", name = "J", descriptor = "Lclient!jn;")
	public static Class162 aClass162_1 = new Class162(8);

	@OriginalMember(owner = "client!eda", name = "P", descriptor = "I")
	public static int anInt2001 = -1;

	@OriginalMember(owner = "client!eda", name = "R", descriptor = "[I")
	public static final int[] anIntArray271 = new int[13];

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(IZIBZII)V")
	public static void method1730(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg5 >= arg0) {
			return;
		}
		@Pc(18) int local18 = (arg0 + arg5) / 2;
		@Pc(20) int local20 = arg5;
		@Pc(24) Class8_Sub1 local24 = Static376.aClass8_Sub1Array2[local18];
		Static376.aClass8_Sub1Array2[local18] = Static376.aClass8_Sub1Array2[arg0];
		Static376.aClass8_Sub1Array2[arg0] = local24;
		for (@Pc(36) int local36 = arg5; local36 < arg0; local36++) {
			if (Static92.method5969(arg1, arg2, Static376.aClass8_Sub1Array2[local36], local24, arg4, arg3) <= 0) {
				@Pc(56) Class8_Sub1 local56 = Static376.aClass8_Sub1Array2[local36];
				Static376.aClass8_Sub1Array2[local36] = Static376.aClass8_Sub1Array2[local20];
				Static376.aClass8_Sub1Array2[local20++] = local56;
			}
		}
		Static376.aClass8_Sub1Array2[arg0] = Static376.aClass8_Sub1Array2[local20];
		Static376.aClass8_Sub1Array2[local20] = local24;
		method1730(local20 - 1, arg1, arg2, arg3, arg4, arg5);
		method1730(arg0, arg1, arg2, arg3, arg4, local20 + 1);
	}

	@OriginalMember(owner = "client!eda", name = "b", descriptor = "(B)Lclient!df;")
	public static Class64 method1733() {
		return Static324.method4993();
	}
}
