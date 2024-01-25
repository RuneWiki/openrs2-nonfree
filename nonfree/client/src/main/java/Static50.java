import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "I")
	public static int anInt1296 = -1;

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(IIIIIII)V")
	public static void method1210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg3 != 8 && arg3 != 16) {
			@Pc(158) Class84 local158 = Static348.aClass84ArrayArrayArray5[arg2][arg5][arg0];
			if (local158 == null) {
				local158 = new Class84(arg2);
			}
			if (arg3 == 1) {
				local158.aShort43 = (short) arg1;
				local158.aShort45 = (short) arg4;
			} else if (arg3 == 2) {
				local158.aShort46 = (short) arg4;
				local158.aShort44 = (short) arg1;
			}
			if (Static525.aBoolean613) {
				Static229.method3716();
			}
			return;
		}
		@Pc(18) int local18;
		@Pc(22) int local22;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(40) int local40;
		@Pc(50) int local50;
		if (arg3 != 8) {
			local18 = Static519.anInt8387 + (arg5 << Static326.anInt5713);
			local22 = local18 - Static519.anInt8387;
			local26 = arg0 << Static326.anInt5713;
			local30 = Static519.anInt8387 + local26;
			local40 = Static124.aClass91Array1[arg2].method7447(arg0, arg5 + 1);
			local50 = Static124.aClass91Array1[arg2].method7447(arg0 + 1, arg5);
			Static526.aClass62Array3[Static397.anInt6835++] = new Class62(arg3, arg2, local18, local22, local22, local18, local40, local50, local50 - arg4, local40 + -arg4, local26, local30, local30, local26);
			return;
		}
		local18 = arg5 << Static326.anInt5713;
		local22 = local18 + Static519.anInt8387;
		local26 = arg0 << Static326.anInt5713;
		local30 = local26 + Static519.anInt8387;
		local40 = Static124.aClass91Array1[arg2].method7447(arg0, arg5);
		local50 = Static124.aClass91Array1[arg2].method7447(arg0 + 1, arg5 + 1);
		Static526.aClass62Array3[Static397.anInt6835++] = new Class62(arg3, arg2, local18, local22, local22, local18, local40, local50, local50 - arg4, local40 - arg4, local26, local30, local30, local26);
	}
}
