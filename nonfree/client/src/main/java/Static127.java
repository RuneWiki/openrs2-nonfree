import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(ZB)I")
	public static int method2488(@OriginalArg(0) boolean arg0) {
		@Pc(13) int local13 = Static290.anInt10204;
		if (local13 == 0) {
			return arg0 ? 0 : Static211.anInt4193;
		} else if (local13 == 1) {
			return Static211.anInt4193;
		} else if (local13 == 2) {
			return 0;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2489(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg6 == arg4) {
			Static644.method8662(arg4, arg0, arg3, arg5, arg2, arg1);
		} else if (Static398.anInt6878 <= arg1 - arg4 && Static8.anInt136 >= arg1 + arg4 && Static605.anInt9561 <= arg0 - arg6 && arg6 + arg0 <= Static223.anInt4380) {
			Static609.method8395(arg0, arg3, arg2, arg4, arg1, arg6, 2038540545, arg5);
		} else {
			Static177.method3375(arg0, arg4, arg2, arg6, arg1, arg5, arg3);
		}
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(ILjava/lang/String;ZLjava/lang/String;I)V")
	public static void method2490(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3) {
		@Pc(6) Class6_Sub13 local6 = Static29.method339();
		local6.aClass6_Sub15_Sub1_1.method3016(Static650.aClass162_6.anInt4493);
		local6.aClass6_Sub15_Sub1_1.method3040(0);
		@Pc(21) int local21 = local6.aClass6_Sub15_Sub1_1.anInt3174;
		local6.aClass6_Sub15_Sub1_1.method3040(658);
		@Pc(30) int[] local30 = Static202.method3745(local6);
		@Pc(34) int local34 = local6.aClass6_Sub15_Sub1_1.anInt3174;
		local6.aClass6_Sub15_Sub1_1.method2991(arg0);
		local6.aClass6_Sub15_Sub1_1.method3040(Static99.anInt1987);
		local6.aClass6_Sub15_Sub1_1.method2991(arg2);
		local6.aClass6_Sub15_Sub1_1.method2985(Static48.aLong225);
		local6.aClass6_Sub15_Sub1_1.method3016(Static601.anInt9518);
		local6.aClass6_Sub15_Sub1_1.method3016(Static129.aClass121_1.anInt3555);
		Static11.method170(local6.aClass6_Sub15_Sub1_1);
		@Pc(73) String local73 = Static192.aString43;
		local6.aClass6_Sub15_Sub1_1.method3016(local73 == null ? 0 : 1);
		if (local73 != null) {
			local6.aClass6_Sub15_Sub1_1.method2991(local73);
		}
		local6.aClass6_Sub15_Sub1_1.method3016(arg3);
		local6.aClass6_Sub15_Sub1_1.method3016(arg1 ? 1 : 0);
		local6.aClass6_Sub15_Sub1_1.anInt3174 += 7;
		local6.aClass6_Sub15_Sub1_1.method3002(local34, local30, local6.aClass6_Sub15_Sub1_1.anInt3174);
		local6.aClass6_Sub15_Sub1_1.method2993(local6.aClass6_Sub15_Sub1_1.anInt3174 - local21);
		Static525.aClass260_3.method6404(local6);
		Static557.anInt9014 = 1;
		Static607.anInt9572 = -3;
		Static588.anInt9365 = 0;
		Static434.anInt7427 = 0;
		if (arg3 < 13) {
			Static444.aBoolean582 = true;
			Static366.method5548();
		}
	}
}
