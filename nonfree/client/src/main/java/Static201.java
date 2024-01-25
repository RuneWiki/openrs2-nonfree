import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static201 {

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(III)Lclient!tr;")
	public static Class6_Sub5 method3751(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class290 local7 = Static279.aClass290ArrayArrayArray7[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class6_Sub5 local14 = local7.aClass6_Sub5_1;
			local7.aClass6_Sub5_1 = null;
			return local14;
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IZIIIZI)V")
	public static void method3753(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		if (arg2 <= arg5) {
			return;
		}
		@Pc(22) int local22 = (arg5 + arg2) / 2;
		@Pc(24) int local24 = arg5;
		@Pc(28) Class68_Sub1 local28 = Static527.aClass68_Sub1Array2[local22];
		Static527.aClass68_Sub1Array2[local22] = Static527.aClass68_Sub1Array2[arg2];
		Static527.aClass68_Sub1Array2[arg2] = local28;
		for (@Pc(40) int local40 = arg5; local40 < arg2; local40++) {
			if (Static46.method1002(local28, arg4, arg0, Static527.aClass68_Sub1Array2[local40], arg3, arg1) <= 0) {
				@Pc(57) Class68_Sub1 local57 = Static527.aClass68_Sub1Array2[local40];
				Static527.aClass68_Sub1Array2[local40] = Static527.aClass68_Sub1Array2[local24];
				Static527.aClass68_Sub1Array2[local24++] = local57;
			}
		}
		Static527.aClass68_Sub1Array2[arg2] = Static527.aClass68_Sub1Array2[local24];
		Static527.aClass68_Sub1Array2[local24] = local28;
		method3753(arg0, arg1, local24 - 1, arg3, arg4, arg5);
		method3753(arg0, arg1, arg2, arg3, arg4, local24 + 1);
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)V")
	public static void method3755() {
		Static317.aClass267_28.method6648();
		Static510.aClass279_10.method6905();
		Static250.aClass279_8.method6905();
	}
}
