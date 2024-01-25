import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static342 {

	@OriginalMember(owner = "client!mp", name = "g", descriptor = "Lclient!eaa;")
	public static Class2_Sub3_Sub3 aClass2_Sub3_Sub3_9;

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(I)Lclient!ue;")
	public static Class330 method7974() {
		try {
			return (Class330) Class.forName("Class330_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(ZIZIIII)V")
	public static void method7978(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg1 <= arg4) {
			return;
		}
		@Pc(14) int local14 = (arg1 + arg4) / 2;
		@Pc(16) int local16 = arg4;
		@Pc(20) Class136_Sub1 local20 = Static225.aClass136_Sub1Array1[local14];
		Static225.aClass136_Sub1Array1[local14] = Static225.aClass136_Sub1Array1[arg1];
		Static225.aClass136_Sub1Array1[arg1] = local20;
		for (@Pc(32) int local32 = arg4; local32 < arg1; local32++) {
			if (Static465.method6557(arg3, local20, arg0, arg5, Static225.aClass136_Sub1Array1[local32], arg2) <= 0) {
				@Pc(52) Class136_Sub1 local52 = Static225.aClass136_Sub1Array1[local32];
				Static225.aClass136_Sub1Array1[local32] = Static225.aClass136_Sub1Array1[local16];
				Static225.aClass136_Sub1Array1[local16++] = local52;
			}
		}
		Static225.aClass136_Sub1Array1[arg1] = Static225.aClass136_Sub1Array1[local16];
		Static225.aClass136_Sub1Array1[local16] = local20;
		method7978(arg0, local16 - 1, arg2, arg3, arg4, arg5);
		method7978(arg0, arg1, arg2, arg3, local16 + 1, arg5);
	}
}
