import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method2352(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg4 < 1 || arg6 < 1 || Static237.anInt4563 - 2 < arg4 || Static373.anInt6694 - 2 < arg6) {
			return;
		}
		@Pc(34) int local34 = arg0;
		if (arg0 < 3 && Static4.method186(arg6, arg4)) {
			local34 = arg0 + 1;
		}
		if (!Static286.aClass1_Sub15_Sub1_1.method6381(Static449.anInt7876) && !Static29.method801(arg4, local34, Static514.anInt9103, arg6)) {
			return;
		}
		if (Static263.aClass64ArrayArrayArray3 == null) {
			return;
		}
		Static107.aClass102_Sub1_1.method7851(arg4, arg0, arg1, Static455.aClass4_11, Static362.aClass243Array5[arg0], arg6);
		if (arg5 < 0) {
			return;
		}
		@Pc(82) boolean local82 = Static286.aClass1_Sub15_Sub1_1.aBoolean531;
		Static286.aClass1_Sub15_Sub1_1.aBoolean531 = true;
		Static107.aClass102_Sub1_1.method7852(local34, arg7, arg0, arg4, arg6, Static362.aClass243Array5[arg0], arg5, Static455.aClass4_11, arg3, arg2);
		Static286.aClass1_Sub15_Sub1_1.aBoolean531 = local82;
		return;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lclient!bg;I)I")
	public static int method2353(@OriginalArg(0) Class27 arg0) {
		if (Static360.aClass27_5 == arg0) {
			return 5890;
		} else if (Static503.aClass27_3 == arg0) {
			return 34167;
		} else if (arg0 == Static226.aClass27_1) {
			return 34168;
		} else if (Static319.aClass27_4 == arg0) {
			return 34166;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
