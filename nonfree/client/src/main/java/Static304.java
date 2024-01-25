import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static304 {

	@OriginalMember(owner = "client!ln", name = "g", descriptor = "Z")
	public static final boolean aBoolean414 = false;

	@OriginalMember(owner = "client!ln", name = "k", descriptor = "I")
	public static int anInt5528 = 0;

	@OriginalMember(owner = "client!ln", name = "l", descriptor = "[Lclient!tea;")
	public static final Interface21[] anInterface21Array2 = new Interface21[128];

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(II)Z")
	public static boolean method4711(@OriginalArg(1) int arg0) {
		return arg0 == 10 || arg0 == 11 || arg0 == 12;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIBIZ)V")
	public static void method4713(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		if (!arg3 && arg1 == Static246.anInt8758 && arg2 == Static360.anInt6293 && (Static240.anInt4595 == Static296.anInt5478 || Static479.aClass1_Sub7_Sub1_1.method2625(Static375.anInt6609))) {
			return;
		}
		Static360.anInt6293 = arg2;
		Static296.anInt5478 = Static240.anInt4595;
		Static246.anInt8758 = arg1;
		if (Static479.aClass1_Sub7_Sub1_1.method2625(Static375.anInt6609)) {
			Static296.anInt5478 = 0;
		}
		Static243.method3970(arg0);
		Static471.method6665(Static510.aClass13_14, Static136.aClass12_8, true, Static103.aClass77_14.method1864(Static562.anInt9127), Static21.aClass35_1);
		@Pc(54) int local54 = Static376.anInt6631;
		Static376.anInt6631 = (Static246.anInt8758 - (Static500.anInt6888 >> 4)) * 8;
		@Pc(71) int local71 = Static24.anInt674;
		Static24.anInt674 = (Static360.anInt6293 - (Static573.anInt9325 >> 4)) * 8;
		Static306.aClass1_Sub3_Sub17_3 = Static313.method3494(Static246.anInt8758 * 8, Static360.anInt6293 * 8);
		Static53.aClass236_1 = null;
		@Pc(95) int local95 = Static376.anInt6631 - local54;
		@Pc(100) int local100 = Static24.anInt674 - local71;
		@Pc(107) int local107;
		@Pc(120) int local120;
		@Pc(232) int local232;
		@Pc(182) int local182;
		if (arg0 == 11) {
			for (local107 = 0; local107 < Static491.anInt1754; local107++) {
				@Pc(113) Class1_Sub39 local113 = Static471.aClass1_Sub39Array1[local107];
				if (local113 != null) {
					@Pc(118) Class20_Sub2_Sub4_Sub1_Sub2 local118 = local113.aClass20_Sub2_Sub4_Sub1_Sub2_2;
					for (local120 = 0; local120 < 10; local120++) {
						local118.anIntArray437[local120] -= local95;
						local118.anIntArray436[local120] -= local100;
					}
					local118.anInt8796 -= local95 * 512;
					local118.anInt8795 -= local100 * 512;
				}
			}
		} else {
			Static480.anInt8097 = 0;
			@Pc(170) boolean local170 = false;
			@Pc(176) int local176 = (Static500.anInt6888 - 1) * 512;
			local182 = (Static573.anInt9325 - 1) * 512;
			for (local120 = 0; local120 < Static491.anInt1754; local120++) {
				@Pc(190) Class1_Sub39 local190 = Static471.aClass1_Sub39Array1[local120];
				if (local190 != null) {
					@Pc(195) Class20_Sub2_Sub4_Sub1_Sub2 local195 = local190.aClass20_Sub2_Sub4_Sub1_Sub2_2;
					local195.anInt8796 -= local95 * 512;
					local195.anInt8795 -= local100 * 512;
					if (local195.anInt8796 >= 0 && local195.anInt8796 <= local176 && local195.anInt8795 >= 0 && local195.anInt8795 <= local182) {
						@Pc(230) boolean local230 = true;
						for (local232 = 0; local232 < 10; local232++) {
							local195.anIntArray437[local232] -= local95;
							local195.anIntArray436[local232] -= local100;
							if (local195.anIntArray437[local232] < 0 || Static500.anInt6888 <= local195.anIntArray437[local232] || local195.anIntArray436[local232] < 0 || Static573.anInt9325 <= local195.anIntArray436[local232]) {
								local230 = false;
							}
						}
						if (local230) {
							Static542.anIntArray599[Static480.anInt8097++] = local195.anInt6407;
						} else {
							local195.method5359(null);
							local190.method7878();
							local170 = true;
						}
					} else {
						local195.method5359(null);
						local170 = true;
						local190.method7878();
					}
				}
			}
			if (local170) {
				Static491.anInt1754 = Static131.aClass356_32.method7799();
				Static131.aClass356_32.method7791(Static471.aClass1_Sub39Array1);
			}
		}
		for (local107 = 0; local107 < 2048; local107++) {
			@Pc(349) Class20_Sub2_Sub4_Sub1_Sub1 local349 = Static230.aClass20_Sub2_Sub4_Sub1_Sub1Array6[local107];
			if (local349 != null) {
				for (local182 = 0; local182 < 10; local182++) {
					local349.anIntArray437[local182] -= local95;
					local349.anIntArray436[local182] -= local100;
				}
				local349.anInt8795 -= local100 * 512;
				local349.anInt8796 -= local95 * 512;
			}
		}
		@Pc(399) Class221[] local399 = Static276.aClass221Array1;
		for (local182 = 0; local182 < local399.length; local182++) {
			@Pc(407) Class221 local407 = local399[local182];
			if (local407 != null) {
				local407.anInt6042 -= local100 * 512;
				local407.anInt6035 -= local95 * 512;
			}
		}
		for (@Pc(439) Class1_Sub10 local439 = (Class1_Sub10) Static16.aClass361_15.method7854(); local439 != null; local439 = (Class1_Sub10) Static16.aClass361_15.method7853()) {
			local439.anInt2090 -= local95;
			local439.anInt2089 -= local100;
			if (Static102.anInt2115 != 4 && (local439.anInt2090 < 0 || local439.anInt2089 < 0 || Static500.anInt6888 <= local439.anInt2090 || Static573.anInt9325 <= local439.anInt2089)) {
				local439.method7878();
			}
		}
		if (Static102.anInt2115 != 4) {
			for (@Pc(498) Class1_Sub37 local498 = (Class1_Sub37) Static186.aClass356_13.method7792(); local498 != null; local498 = (Class1_Sub37) Static186.aClass356_13.method7795()) {
				@Pc(506) int local506 = (int) (local498.aLong425 & 0x3FFFL);
				@Pc(511) int local511 = local506 - Static376.anInt6631;
				local232 = (int) (local498.aLong425 >> 14 & 0x3FFFL);
				@Pc(524) int local524 = local232 - Static24.anInt674;
				if (local511 < 0 || local524 < 0 || local511 >= Static500.anInt6888 || local524 >= Static573.anInt9325) {
					local498.method7878();
				}
			}
		}
		if (Static90.anInt1998 != 0) {
			Static90.anInt1998 -= local95;
			Static328.anInt5893 -= local100;
		}
		Static511.method7027();
		if (arg0 != 11) {
			Static69.anInt1590 -= local95;
			Static216.anInt4203 -= local100 * 512;
			Static267.anInt5015 -= local100;
			Static333.anInt5940 -= local95 * 512;
			Static274.anInt5078 -= local95;
			Static316.anInt5683 -= local100;
			if (Math.abs(local95) > Static500.anInt6888 || Math.abs(local100) > Static573.anInt9325) {
				Static224.method3681();
			}
		} else if (Static585.anInt9461 == 4) {
			Static536.anInt8844 -= local100 * 512;
			Static260.anInt4768 -= local100 * 512;
			Static116.anInt2337 -= local95 * 512;
			Static82.anInt9165 -= local95 * 512;
		} else {
			Static282.anInt5182 = -1;
			Static394.anInt6810 = -1;
			Static585.anInt9461 = 1;
		}
		Static183.method3224();
		Static233.method3823();
		Static140.aClass361_34.method7860();
		Static518.aClass361_93.method7860();
		Static456.aClass349_13.method7661();
		Static396.method5611();
	}
}
