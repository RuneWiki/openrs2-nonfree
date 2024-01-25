import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static323 {

	@OriginalMember(owner = "client!qf", name = "q", descriptor = "Lclient!ya;")
	public static Class135 aClass135_12;

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!ba;III[Z)V")
	public static void method4972(@OriginalArg(0) Class4_Sub2_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static278.aClass41Array3 == Static169.aClass41Array1) {
			return;
		}
		@Pc(9) int local9 = Static228.aClass41Array2[arg1].a(arg2, arg3);
		for (@Pc(11) int local11 = 0; local11 <= arg1; local11++) {
			if (arg4 == null || arg4[local11]) {
				@Pc(22) Class41 local22 = Static228.aClass41Array2[local11];
				if (local22 != null) {
					local22.p(arg0, arg2, local9 - local22.a(arg2, arg3), arg3, 0, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(ZLclient!ga;Lclient!qn;)V")
	public static void method4975(@OriginalArg(1) Interface5 arg0, @OriginalArg(2) Class211 arg1) {
		Static60.anInterface5_1 = arg0;
		Static210.aClass211_57 = arg1;
	}
}
