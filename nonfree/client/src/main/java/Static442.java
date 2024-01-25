import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static442 {

	@OriginalMember(owner = "client!wf", name = "c", descriptor = "I")
	public static int anInt7352;

	@OriginalMember(owner = "client!wf", name = "f", descriptor = "I")
	public static int anInt7354;

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "I")
	public static int anInt7350 = -1;

	@OriginalMember(owner = "client!wf", name = "d", descriptor = "[J")
	public static final long[] aLongArray10 = new long[32];

	@OriginalMember(owner = "client!wf", name = "o", descriptor = "J")
	public static long aLong220 = 0L;

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IZI)V")
	public static void method5552(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			Static213.aClass128_22 = Static321.method3583(Static226.aCanvas9, arg1, Static190.anInterface8_5, Static41.aClass124_2, Static336.aClass106_Sub1_1.anInt5675 * 2);
		} else {
			if (arg0) {
				Static213.aClass128_22 = Static321.method3583(Static226.aCanvas9, 0, Static190.anInterface8_5, Static41.aClass124_2, 0);
				Static213.aClass128_22.M(0);
				@Pc(23) Class122 local23 = Static41.method653(Static166.aClass113_59, Static132.anInt2275);
				@Pc(32) Class16 local32 = Static213.aClass128_22.method3575(local23, Static458.method1923(Static169.aClass113_55, Static132.anInt2275));
				Static357.method4619(local32, Static81.aClass151_51.method3122(Static188.anInt3028), true);
				Static213.aClass128_22.method3534();
				Static356.method4573();
				Static213.aClass128_22.method3596();
			}
			try {
				Static213.aClass128_22 = Static321.method3583(Static226.aCanvas9, arg1, Static190.anInterface8_5, Static41.aClass124_2, Static336.aClass106_Sub1_1.anInt5675 * 2);
				if (Static213.aClass128_22.method3603()) {
					@Pc(65) Class1_Sub14 local65 = Static213.aClass128_22.method3538();
					Static213.aClass128_22.method3601(local65);
				}
			} catch (@Pc(70) Throwable local70) {
				arg1 = 0;
				Static213.aClass128_22 = Static321.method3583(Static226.aCanvas9, 0, Static190.anInterface8_5, Static41.aClass124_2, 0);
			}
		}
		Static410.anInt6680 = arg1;
		Static350.method4434();
		if (!Static213.aClass128_22.method3573()) {
			Static448.anInt6654 = 1;
		}
		Static213.aClass128_22.method3550(Static448.anInt6654);
		Static213.aClass128_22.method3592(0);
		Static213.aClass128_22.na(8);
		Static217.aClass40_5 = Static213.aClass128_22.method3609();
		Static136.aClass40_2 = Static213.aClass128_22.method3609();
		Static289.method3780();
		Static213.aClass128_22.method3566(!Static336.aClass106_Sub1_1.aBoolean468);
		if (Static213.aClass128_22.method3608()) {
			Static47.method712(Static336.aClass106_Sub1_1.aBoolean459);
		}
		Static188.method2488(Static213.aClass128_22, Static251.anInt4072 >> 3, Static425.anInt6922 >> 3);
		Static421.method5243();
		Static253.aBoolean325 = false;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IJ)V")
	public static void method5555(@OriginalArg(1) long arg0) {
		Static75.aClass1_Sub11_Sub1_1.anInt5766 = 0;
		Static75.aClass1_Sub11_Sub1_1.method4445(Static335.aClass62_7.anInt1569);
		Static75.aClass1_Sub11_Sub1_1.method4446(arg0);
		Static383.anInt6367 = 0;
		Static52.anInt942 = -3;
		Static48.anInt801 = 1;
		Static428.anInt7092 = 0;
	}

	@OriginalMember(owner = "client!wf", name = "e", descriptor = "(I)V")
	public static void method5559() {
		@Pc(12) int local12 = Static31.anInt624;
		@Pc(14) int[] local14 = Static363.anIntArray373;
		for (@Pc(16) int local16 = 0; local16 < local12; local16++) {
			@Pc(24) Class20_Sub3_Sub3_Sub1 local24 = Static73.aClass20_Sub3_Sub3_Sub1Array1[local14[local16]];
			if (local24 != null) {
				Static40.method3800(local24, local24.method4678());
			}
		}
	}
}
