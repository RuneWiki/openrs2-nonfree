import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static272 {

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "I")
	public static int anInt5626 = 0;

	@OriginalMember(owner = "client!lf", name = "d", descriptor = "Lclient!hb;")
	public static final Class117 aClass117_17 = new Class117(9, 7);

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIII)V")
	public static void method4733(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(12) int local12 = arg4; local12 <= arg2; local12++) {
			Static257.method4540(Static68.anIntArrayArray24[local12], arg1, arg3, arg0);
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!rt;Z)Lclient!uh;")
	public static Class3_Sub1 method4735(@OriginalArg(0) Class3_Sub27 arg0) {
		arg0.method7548();
		@Pc(18) int local18 = arg0.method7548();
		@Pc(22) Class3_Sub1 local22 = Static412.method6200(local18);
		local22.anInt9423 = arg0.method7548();
		@Pc(31) int local31 = arg0.method7548();
		for (@Pc(33) int local33 = 0; local33 < local31; local33++) {
			@Pc(39) int local39 = arg0.method7548();
			local22.method7783(local39, arg0);
		}
		local22.method7786();
		return local22;
	}
}
