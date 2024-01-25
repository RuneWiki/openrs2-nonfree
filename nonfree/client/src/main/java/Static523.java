import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static523 {

	@OriginalMember(owner = "client!sl", name = "E", descriptor = "I")
	public static int anInt8742;

	@OriginalMember(owner = "client!sl", name = "K", descriptor = "I")
	public static int anInt8746 = -1;

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIIB)V")
	public static void method7317(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(12) int local12 = Static404.aClass2_Sub13_2.aClass33_Sub1_2.method810() * arg1 >> 8;
		if (local12 == 0 || arg0 == -1) {
			return;
		}
		if (!Static243.aBoolean394 && Static125.anInt2929 != -1 && Static500.method7112() && !Static395.method2905()) {
			Static322.aClass2_Sub2_Sub1_3 = Static642.method8580();
			@Pc(43) Class2_Sub2_Sub1 local43 = Static149.method7701(Static322.aClass2_Sub2_Sub1_3);
			Static487.method6991(local43);
		}
		Static556.method7705(arg0, Static226.aClass97_60, local12);
		Static548.method7647(-1, 255);
		Static243.aBoolean394 = true;
	}
}
