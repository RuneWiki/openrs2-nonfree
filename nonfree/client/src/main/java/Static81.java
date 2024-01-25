import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!cp", name = "E", descriptor = "I")
	public static int anInt1792 = 2;

	@OriginalMember(owner = "client!cp", name = "N", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_40 = new Class44(56, -2);

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method1534(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg7 < 1 || arg1 < 1 || Static26.anInt462 - 2 < arg7 || Static445.anInt6140 - 2 < arg1) {
			return;
		}
		@Pc(21) int local21 = arg0;
		if (arg0 < 3 && Static329.method5158(arg1, arg7)) {
			local21 = arg0 + 1;
		}
		if (Static56.aClass14_Sub22_5.aClass21_Sub13_2.method4396() == 0 && !Static169.method2765(arg7, local21, arg1, Static673.anInt11161)) {
			return;
		}
		if (Static486.aClass58ArrayArrayArray2 == null) {
			return;
		}
		Static143.aClass49_Sub1_1.method7521(Static677.aClass137_47, arg0, arg1, arg4, arg7, Static226.aClass226Array3[arg0]);
		if (arg5 >= 0) {
			@Pc(71) int local71 = Static56.aClass14_Sub22_5.aClass21_Sub27_1.method8612();
			Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub27_1, 1);
			Static143.aClass49_Sub1_1.method7518(arg6, arg3, Static226.aClass226Array3[arg0], arg5, Static677.aClass137_47, arg1, arg0, arg2, local21, arg7);
			Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub27_1, local71);
		}
	}
}
