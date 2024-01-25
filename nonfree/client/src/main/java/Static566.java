import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static566 {

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "I")
	public static int anInt2120;

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Z)V")
	public static void method1787() {
		Static443.anInt7853 = 0;
		Static121.anInt2899 = 0;
		Static299.anInt5574 = 0;
		Static113.anInt2174 = 0;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method1788(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg5 < 1 || arg2 < 1 || Static3.anInt46 - 2 < arg5 || Static270.anInt5194 - 2 < arg2) {
			return;
		}
		@Pc(33) int local33 = arg1;
		if (arg1 < 3 && Static471.method6782(arg2, arg5)) {
			local33 = arg1 + 1;
		}
		if (Static404.aClass2_Sub13_2.aClass33_Sub26_1.method8294() == 0 && !Static403.method6234(arg5, local33, arg2, Static576.anInt9519)) {
			return;
		}
		if (Static440.aClass217ArrayArrayArray3 == null) {
			return;
		}
		Static580.aClass45_Sub1_2.method8532(arg5, Static19.aClass179Array2[arg1], Static600.aClass87_15, arg2, arg4, arg1);
		if (arg6 < 0) {
			return;
		}
		@Pc(82) int local82 = Static404.aClass2_Sub13_2.aClass33_Sub17_1.method6029();
		Static404.aClass2_Sub13_2.method1383(1, Static404.aClass2_Sub13_2.aClass33_Sub17_1);
		Static580.aClass45_Sub1_2.method8534(Static19.aClass179Array2[arg1], arg1, arg6, arg5, arg3, Static600.aClass87_15, arg2, arg7, local33, arg0);
		Static404.aClass2_Sub13_2.method1383(local82, Static404.aClass2_Sub13_2.aClass33_Sub17_1);
		return;
	}
}
