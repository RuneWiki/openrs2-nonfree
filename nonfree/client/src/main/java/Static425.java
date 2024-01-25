import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static425 {

	@OriginalMember(owner = "client!of", name = "u", descriptor = "[Lclient!nfa;")
	public static Class15_Sub3[] aClass15_Sub3Array3;

	@OriginalMember(owner = "client!of", name = "M", descriptor = "I")
	public static int anInt7809;

	@OriginalMember(owner = "client!of", name = "R", descriptor = "J")
	public static long aLong215;

	@OriginalMember(owner = "client!of", name = "fb", descriptor = "Z")
	public static boolean aBoolean580 = false;

	@OriginalMember(owner = "client!of", name = "vb", descriptor = "Z")
	public static boolean aBoolean581 = false;

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IIIB)Lclient!fm;")
	public static Class15_Sub3_Sub3_Sub1 method7007(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(11) Class291 local11 = Static193.aClass291ArrayArrayArray2[arg0][arg1][arg2];
		if (local11 == null) {
			return null;
		}
		@Pc(17) Class15_Sub3_Sub3_Sub1 local17 = null;
		@Pc(19) int local19 = -1;
		for (@Pc(22) Class27 local22 = local11.aClass27_3; local22 != null; local22 = local22.aClass27_1) {
			@Pc(30) Class15_Sub3_Sub3 local30 = local22.aClass15_Sub3_Sub3_1;
			if (local30 instanceof Class15_Sub3_Sub3_Sub1) {
				@Pc(36) Class15_Sub3_Sub3_Sub1 local36 = (Class15_Sub3_Sub3_Sub1) local30;
				@Pc(44) int local44 = local36.method3690() * 256 - 4;
				@Pc(52) int local52 = local36.anInt11022 - local44 >> 9;
				@Pc(59) int local59 = local36.anInt11024 - local44 >> 9;
				@Pc(66) int local66 = local44 + local36.anInt11022 >> 9;
				@Pc(73) int local73 = local36.anInt11024 + local44 >> 9;
				if (arg1 >= local52 && arg2 >= local59 && local66 >= arg1 && arg2 <= local73) {
					@Pc(106) int local106 = (local66 + 1 - arg1) * (-arg2 + 1 + local73);
					if (local19 < local106) {
						local17 = local36;
						local19 = local106;
					}
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(BI)Lclient!rc;")
	public static Class309 method7008(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 < 100 ? Static470.aClass309Array3[arg0] : null;
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(ZB)V")
	public static void method7012(@OriginalArg(0) boolean arg0) {
		if (Static395.aClass207_2 != null) {
			Static395.aClass207_2.method5436();
			Static395.aClass207_2 = null;
		}
		Static316.anInt5770 = 0;
		Static58.method1113();
		Static34.method585();
		for (@Pc(19) int local19 = 0; local19 < 4; local19++) {
			Static196.aClass200Array1[local19].method5299();
		}
		Static428.method7019(false);
		System.gc();
		Static150.method2591();
		Static239.aBoolean367 = false;
		Static143.anInt2682 = -1;
		Static451.method7283();
		Static13.method7477(true);
		Static587.anInt10249 = 0;
		Static490.anInt8763 = 0;
		Static194.anInt4134 = 0;
		Static389.anInt7373 = 0;
		Static151.anInt2798 = 0;
		Static640.anInt11085 = 0;
		for (@Pc(62) int local62 = 0; local62 < Static382.aClass326Array3.length; local62++) {
			Static382.aClass326Array3[local62] = null;
		}
		Static304.method8966();
		for (@Pc(77) int local77 = 0; local77 < 2048; local77++) {
			Static28.aClass15_Sub3_Sub3_Sub1_Sub1Array1[local77] = null;
		}
		Static532.anInt9330 = 0;
		Static630.aClass335_29.method8353();
		Static487.anInt8726 = 0;
		Static18.aClass335_2.method8353();
		Static230.method4175();
		Static432.anInt7901 = 0;
		Static113.aClass282_1.method7366();
		Static131.method2328();
		Static342.method5734();
		Static366.aClass2_Sub30_1 = null;
		Static242.aClass219_1 = null;
		Static354.aClass2_Sub22_1 = null;
		Static396.aClass2_Sub30_2 = null;
		Static21.aLong13 = 0L;
		Static513.aClass219_2 = null;
		if (arg0) {
			Static248.method4408(12);
			return;
		}
		Static248.method4408(3);
		try {
			Static675.method1325(Static637.anApplet2, "loggedout");
		} catch (@Pc(144) Throwable local144) {
		}
	}
}
