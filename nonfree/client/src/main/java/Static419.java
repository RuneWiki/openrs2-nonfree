import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static419 {

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(Lclient!faa;ZII)V")
	public static void method6380(@OriginalArg(0) Class97 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static540.aBoolean580) {
			@Pc(18) Class348 local18 = Static544.anInt7475 == -1 ? null : Static111.aClass259_1.method5915(Static544.anInt7475);
			if (Static74.method1044(arg0).method5836() && (Static243.anInt4471 & 0x20) != 0 && (local18 == null || arg0.method2298(local18.anInt9885, Static544.anInt7475) != local18.anInt9885)) {
				Static133.method2173(Static185.aString34 + " -> " + arg0.aString20, arg0.anInt2675, 5, arg0.anInt2607, arg0.anInt2678, 0L, Static291.anInt5333, true, Static195.aString36, false);
			}
		}
		@Pc(83) String local83;
		for (@Pc(76) int local76 = 9; local76 >= 5; local76--) {
			local83 = Static287.method4365(local76, arg0);
			if (local83 != null) {
				Static133.method2173(arg0.aString20, arg0.anInt2675, 1012, arg0.anInt2607, arg0.anInt2678, (long) (local76 + 1), Static535.method7287(arg0, local76), true, local83, false);
			}
		}
		local83 = Static484.method6806(arg0);
		if (local83 != null) {
			Static133.method2173(arg0.aString20, arg0.anInt2675, 23, arg0.anInt2607, arg0.anInt2678, 0L, arg0.anInt2679, true, local83, false);
		}
		for (@Pc(150) int local150 = 4; local150 >= 0; local150--) {
			@Pc(157) String local157 = Static287.method4365(local150, arg0);
			if (local157 != null) {
				Static133.method2173(arg0.aString20, arg0.anInt2675, 60, arg0.anInt2607, arg0.anInt2678, (long) (local150 + 1), Static535.method7287(arg0, local150), true, local157, false);
			}
		}
		if (!Static74.method1044(arg0).method5831()) {
			return;
		}
		if (arg0.aString19 == null) {
			Static133.method2173("", arg0.anInt2675, 50, arg0.anInt2607, arg0.anInt2678, 0L, -1, true, Static146.aClass103_10.method2355(Static188.anInt28), false);
		} else {
			Static133.method2173("", arg0.anInt2675, 50, arg0.anInt2607, arg0.anInt2678, 0L, -1, true, arg0.aString19, false);
		}
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "([[BBLclient!op;)V")
	public static void method6383(@OriginalArg(0) byte[][] arg0, @OriginalArg(2) Class238_Sub1 arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		for (@Pc(14) int local14 = 0; local14 < arg1.anInt6912; local14++) {
			Static262.method3999();
			for (@Pc(20) int local20 = 0; local20 < Static18.anInt5706 >> 3; local20++) {
				for (@Pc(24) int local24 = 0; local24 < Static80.anInt1367 >> 3; local24++) {
					@Pc(34) int local34 = Static245.anIntArrayArrayArray1[local14][local20][local24];
					if (local34 != -1) {
						@Pc(44) int local44 = local34 >> 24 & 0x3;
						if (!arg1.aBoolean476 || local44 == 0) {
							@Pc(55) int local55 = local34 >> 1 & 0x3;
							@Pc(61) int local61 = local34 >> 14 & 0x3FF;
							@Pc(67) int local67 = local34 >> 3 & 0x7FF;
							@Pc(78) int local78 = (local61 / 8 << 8) + (local67 / 8);
							for (@Pc(80) int local80 = 0; local80 < Static468.anIntArray577.length; local80++) {
								if (Static468.anIntArray577[local80] == local78 && arg0[local80] != null) {
									@Pc(102) Class6_Sub12 local102 = new Class6_Sub12(arg0[local80]);
									arg1.method5537(local24 * 8, local61, local14, Static30.aClass138Array1, local67, local20 * 8, local102, local55, local44);
									arg1.method5553(local14, local20 * 8, local67, Static554.aClass90_12, local102, local61, local44, local24 * 8, local55, local12[0] == -1 ? local12 : null);
									break;
								}
							}
						}
					}
				}
			}
		}
		if (local12[0] != -1) {
			Static145.aClass141_1 = Static57.aClass14_1.method207(local12[3], local12[2], Static376.aClass116_1, local12[1], local12[0]);
			Static122.anInt2116 = local12[4];
		}
	}
}
