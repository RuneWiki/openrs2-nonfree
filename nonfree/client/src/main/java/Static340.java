import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static340 {

	@OriginalMember(owner = "client!ri", name = "u", descriptor = "I")
	public static int anInt6033;

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method4725(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg7 < 1 || arg1 < 1 || Static126.anInt2569 - 2 < arg7 || Static190.anInt3697 - 2 < arg1) {
			return;
		}
		@Pc(29) int local29 = arg6;
		if (arg6 < 3 && Static317.method4378(arg1, arg7)) {
			local29 = arg6 + 1;
		}
		if (!Static126.aClass67_Sub1_1.method4531(Static286.anInt5207) && !Static123.method5297(local29, Static107.anInt2257, arg7, arg1)) {
			return;
		}
		if (Static40.aClass53ArrayArrayArray2 == null) {
			return;
		}
		Static237.aClass134_Sub1_1.method5157(Static395.aClass268Array1[arg6], Static16.aClass30_11, arg3, arg7, arg6, arg1);
		if (arg4 >= 0) {
			@Pc(72) boolean local72 = Static126.aClass67_Sub1_1.aBoolean389;
			Static126.aClass67_Sub1_1.aBoolean389 = true;
			Static237.aClass134_Sub1_1.method5165(Static16.aClass30_11, arg6, arg7, local29, arg2, arg5, arg1, arg4, Static395.aClass268Array1[arg6], arg0);
			Static126.aClass67_Sub1_1.aBoolean389 = local72;
		}
	}

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "(B)V")
	public static void method4726() {
		Static326.aClass126Array2 = null;
		Static231.method3201(Static87.anInt1948, 0, Static349.anInt6303, 0, -1, Static404.anInt6892, 0, 0);
		if (Static326.aClass126Array2 != null) {
			Static233.method3220(Static87.anInt1948, Static93.anInt2010, 0, -1412584499, 0, Static326.aClass126Array2, Static171.aClass126_6.anInt3440, Static349.anInt6303, Static395.anInt6804);
			Static326.aClass126Array2 = null;
		}
	}
}
