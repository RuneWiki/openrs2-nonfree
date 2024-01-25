import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static225 {

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "I")
	public static int anInt4000 = 0;

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIIBILclient!ap;ILclient!ap;)V")
	public static void method3044(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(7) Class6_Sub2_Sub1 arg4, @OriginalArg(8) int arg5, @OriginalArg(9) Class6_Sub2_Sub1 arg6) {
		@Pc(7) int local7 = arg6.method4757();
		if (local7 == -1) {
			return;
		}
		@Pc(26) Class3 local26 = (Class3) Static110.aClass69_27.method1591((long) local7);
		if (local26 == null) {
			@Pc(33) Class205[] local33 = Static464.method4784(Static149.aClass166_105, local7);
			if (local33 == null) {
				return;
			}
			local26 = Static16.aClass30_11.method4656(local33[0]);
			Static110.aClass69_27.method1590((long) local7, local26);
		}
		Static345.method4818(arg0 >> 1, arg4.anInt6061, arg1 >> 1, arg4.method4763() * 64, 0, arg4.anInt6062, arg4.aByte86);
		@Pc(80) int local80 = arg5 + Static370.anIntArray573[0] - 18;
		@Pc(88) int local88 = local80 + arg3 / 4 * 18;
		@Pc(99) int local99 = arg2 + Static370.anIntArray573[1] - 54 - 16;
		@Pc(107) int local107 = local99 + arg3 % 4 * 18;
		local26.method5877(local88, local107);
		if (arg4 == arg6) {
			Static16.aClass30_11.method4702(local88 - 1, -256, 18, 18, local107 - 1);
		}
		@Pc(129) Class41_Sub5 local129 = Static95.method1551();
		local129.anInt5446 = local88;
		local129.aClass6_Sub2_Sub1_1 = arg6;
		local129.anInt5447 = local107 + 16;
		local129.anInt5450 = local88 + 16;
		local129.anInt5451 = local107;
		Static391.aClass27_8.method725(local129);
	}
}
