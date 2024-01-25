import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static541 {

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "F")
	public static float aFloat197;

	@OriginalMember(owner = "client!wp", name = "b", descriptor = "Lclient!oa;")
	public static Class223 aClass223_1;

	@OriginalMember(owner = "client!wp", name = "d", descriptor = "Z")
	public static boolean aBoolean683 = false;

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(IZIZIIB)V")
	public static void method7948(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 >= arg5) {
			return;
		}
		@Pc(22) int local22 = (arg0 + arg5) / 2;
		@Pc(24) int local24 = arg0;
		@Pc(28) Class23_Sub1 local28 = Static197.aClass23_Sub1Array1[local22];
		Static197.aClass23_Sub1Array1[local22] = Static197.aClass23_Sub1Array1[arg5];
		Static197.aClass23_Sub1Array1[arg5] = local28;
		for (@Pc(40) int local40 = arg0; local40 < arg5; local40++) {
			if (Static249.method4292(arg2, arg4, arg1, local28, Static197.aClass23_Sub1Array1[local40], arg3) <= 0) {
				@Pc(60) Class23_Sub1 local60 = Static197.aClass23_Sub1Array1[local40];
				Static197.aClass23_Sub1Array1[local40] = Static197.aClass23_Sub1Array1[local24];
				Static197.aClass23_Sub1Array1[local24++] = local60;
			}
		}
		Static197.aClass23_Sub1Array1[arg5] = Static197.aClass23_Sub1Array1[local24];
		Static197.aClass23_Sub1Array1[local24] = local28;
		method7948(arg0, arg1, arg2, arg3, arg4, local24 - 1);
		method7948(local24 + 1, arg1, arg2, arg3, arg4, arg5);
	}
}
