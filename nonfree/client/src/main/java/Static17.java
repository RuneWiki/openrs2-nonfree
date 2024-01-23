import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!bc", name = "W", descriptor = "F")
	public static float aFloat3;

	@OriginalMember(owner = "client!bc", name = "O", descriptor = "Lclient!lc;")
	public static Class79 aClass79_2 = new Class79(100);

	@OriginalMember(owner = "client!bc", name = "P", descriptor = "I")
	public static int anInt619 = 1;

	@OriginalMember(owner = "client!bc", name = "R", descriptor = "I")
	public static int anInt621 = 0;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(I[[I)V")
	public static void method325(@OriginalArg(1) int[][] arg0) {
		Static29.anIntArrayArray10 = arg0;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZI)Lclient!va;")
	public static Class137 method326(@OriginalArg(1) int arg0) {
		@Pc(17) Class137 local17 = (Class137) Static160.aClass79_22.method2483((long) arg0);
		if (local17 != null) {
			return local17;
		}
		@Pc(27) byte[] local27 = Static212.aClass51_68.method1874(1, arg0);
		local17 = new Class137();
		if (local27 != null) {
			local17.method3988(arg0, new Class1_Sub13(local27));
		}
		Static160.aClass79_22.method2486(local17, (long) arg0);
		return local17;
	}

	@OriginalMember(owner = "client!bc", name = "f", descriptor = "(B)V")
	public static void method327() {
		@Pc(5) int local5 = Static34.anInt969 * 128 + 64;
		@Pc(11) int local11 = Static111.anInt2947 * 128 + 64;
		@Pc(20) int local20 = Static200.method3326(Static137.anInt3321, local11, local5) - Static83.anInt2246;
		if (Static57.anInt1588 >= 100) {
			Static110.anInt2935 = Static111.anInt2947 * 128 + 64;
			Static174.anInt4003 = Static34.anInt969 * 128 + 64;
			Static109.anInt2904 = Static200.method3326(Static137.anInt3321, Static110.anInt2935, Static174.anInt4003) - Static83.anInt2246;
		} else {
			if (local5 > Static174.anInt4003) {
				Static174.anInt4003 += (local5 - Static174.anInt4003) * Static57.anInt1588 / 1000 + Static259.anInt5472;
				if (Static174.anInt4003 > local5) {
					Static174.anInt4003 = local5;
				}
			}
			if (Static109.anInt2904 < local20) {
				Static109.anInt2904 += Static259.anInt5472 + (local20 - Static109.anInt2904) * Static57.anInt1588 / 1000;
				if (local20 < Static109.anInt2904) {
					Static109.anInt2904 = local20;
				}
			}
			if (Static109.anInt2904 > local20) {
				Static109.anInt2904 -= (Static109.anInt2904 - local20) * Static57.anInt1588 / 1000 + Static259.anInt5472;
				if (local20 > Static109.anInt2904) {
					Static109.anInt2904 = local20;
				}
			}
			if (local5 < Static174.anInt4003) {
				Static174.anInt4003 -= (Static174.anInt4003 - local5) * Static57.anInt1588 / 1000 + Static259.anInt5472;
				if (local5 > Static174.anInt4003) {
					Static174.anInt4003 = local5;
				}
			}
			if (local11 > Static110.anInt2935) {
				Static110.anInt2935 += Static57.anInt1588 * (local11 - Static110.anInt2935) / 1000 + Static259.anInt5472;
				if (Static110.anInt2935 > local11) {
					Static110.anInt2935 = local11;
				}
			}
			if (Static110.anInt2935 > local11) {
				Static110.anInt2935 -= Static259.anInt5472 + Static57.anInt1588 * (Static110.anInt2935 - local11) / 1000;
				if (Static110.anInt2935 < local11) {
					Static110.anInt2935 = local11;
				}
			}
		}
		local11 = Static232.anInt5102 * 128 + 64;
		local5 = Static261.anInt5482 * 128 + 64;
		local20 = Static200.method3326(Static137.anInt3321, local11, local5) - Static260.anInt2793;
		@Pc(233) int local233 = local5 - Static174.anInt4003;
		@Pc(238) int local238 = local20 - Static109.anInt2904;
		@Pc(243) int local243 = local11 - Static110.anInt2935;
		@Pc(254) int local254 = (int) Math.sqrt((double) (local243 * local243 + local233 * local233));
		@Pc(265) int local265 = (int) (Math.atan2((double) local238, (double) local254) * 325.949D) & 0x7FF;
		if (local265 < 128) {
			local265 = 128;
		}
		@Pc(281) int local281 = (int) (-325.949D * Math.atan2((double) local233, (double) local243)) & 0x7FF;
		@Pc(286) int local286 = local281 - Static127.anInt3198;
		if (local286 > 1024) {
			local286 -= 2048;
		}
		if (local286 < -1024) {
			local286 += 2048;
		}
		if (local265 > 383) {
			local265 = 383;
		}
		if (local286 > 0) {
			Static127.anInt3198 += Static38.anInt1012 * local286 / 1000 + Static10.anInt384;
			Static127.anInt3198 &= 0x7FF;
		}
		if (Static200.anInt4412 < local265) {
			Static200.anInt4412 += (local265 - Static200.anInt4412) * Static38.anInt1012 / 1000 + Static10.anInt384;
			if (Static200.anInt4412 > local265) {
				Static200.anInt4412 = local265;
			}
		}
		if (local286 < 0) {
			Static127.anInt3198 -= Static38.anInt1012 * -local286 / 1000 + Static10.anInt384;
			Static127.anInt3198 &= 0x7FF;
		}
		if (local265 < Static200.anInt4412) {
			Static200.anInt4412 -= Static10.anInt384 + Static38.anInt1012 * (Static200.anInt4412 - local265) / 1000;
			if (local265 > Static200.anInt4412) {
				Static200.anInt4412 = local265;
			}
		}
		@Pc(399) int local399 = local281 - Static127.anInt3198;
		if (local399 > 1024) {
			local399 -= 2048;
		}
		if (local399 < -1024) {
			local399 += 2048;
		}
		if (local399 < 0 && local286 > 0 || local399 > 0 && local286 < 0) {
			Static127.anInt3198 = local281;
		}
	}
}
