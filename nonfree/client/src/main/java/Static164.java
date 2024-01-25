import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!it", name = "c", descriptor = "[I")
	public static int[] anIntArray351;

	@OriginalMember(owner = "client!it", name = "f", descriptor = "I")
	public static int anInt2967;

	@OriginalMember(owner = "client!it", name = "b", descriptor = "Lclient!ct;")
	public static final Class48 aClass48_100 = new Class48(39, 7);

	@OriginalMember(owner = "client!it", name = "e", descriptor = "I")
	public static int anInt2966 = 0;

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(I)V")
	public static void method2421() {
		@Pc(9) int local9 = Static17.anInt306 * 128 + 64;
		@Pc(15) int local15 = Static360.anInt3947 * 128 + 64;
		@Pc(25) int local25 = Static236.method3260(Static122.anInt2188, local15, local9) - Static354.anInt5768;
		if (Static334.anInt5572 >= 100) {
			Static256.anInt4409 = Static17.anInt306 * 128 + 64;
			Static133.anInt2471 = Static360.anInt3947 * 128 + 64;
			Static337.anInt5598 = Static236.method3260(Static122.anInt2188, Static133.anInt2471, Static256.anInt4409) - Static354.anInt5768;
		} else {
			if (local9 > Static256.anInt4409) {
				Static256.anInt4409 += (local9 - Static256.anInt4409) * Static334.anInt5572 / 1000 + Static122.anInt2187;
				if (Static256.anInt4409 > local9) {
					Static256.anInt4409 = local9;
				}
			}
			if (Static256.anInt4409 > local9) {
				Static256.anInt4409 -= Static122.anInt2187 + (Static256.anInt4409 - local9) * Static334.anInt5572 / 1000;
				if (local9 > Static256.anInt4409) {
					Static256.anInt4409 = local9;
				}
			}
			if (local25 > Static337.anInt5598) {
				Static337.anInt5598 += (local25 - Static337.anInt5598) * Static334.anInt5572 / 1000 + Static122.anInt2187;
				if (Static337.anInt5598 > local25) {
					Static337.anInt5598 = local25;
				}
			}
			if (Static133.anInt2471 < local15) {
				Static133.anInt2471 += Static122.anInt2187 + Static334.anInt5572 * (local15 - Static133.anInt2471) / 1000;
				if (local15 < Static133.anInt2471) {
					Static133.anInt2471 = local15;
				}
			}
			if (Static337.anInt5598 > local25) {
				Static337.anInt5598 -= (Static337.anInt5598 - local25) * Static334.anInt5572 / 1000 + Static122.anInt2187;
				if (Static337.anInt5598 < local25) {
					Static337.anInt5598 = local25;
				}
			}
			if (local15 < Static133.anInt2471) {
				Static133.anInt2471 -= (Static133.anInt2471 - local15) * Static334.anInt5572 / 1000 + Static122.anInt2187;
				if (local15 > Static133.anInt2471) {
					Static133.anInt2471 = local15;
				}
			}
		}
		local15 = Static226.anInt3832 * 128 + 64;
		local9 = Static391.anInt6384 * 128 + 64;
		local25 = Static236.method3260(Static122.anInt2188, local15, local9) - Static18.anInt3503;
		@Pc(217) int local217 = local9 - Static256.anInt4409;
		@Pc(222) int local222 = local25 - Static337.anInt5598;
		@Pc(227) int local227 = local15 - Static133.anInt2471;
		@Pc(238) int local238 = (int) Math.sqrt((double) (local227 * local227 + local217 * local217));
		@Pc(249) int local249 = (int) (Math.atan2((double) local222, (double) local238) * 2607.5945876176133D) & 0x3FFF;
		if (local249 < 1024) {
			local249 = 1024;
		}
		@Pc(265) int local265 = (int) (-2607.5945876176133D * Math.atan2((double) local217, (double) local227)) & 0x3FFF;
		if (local249 > 3072) {
			local249 = 3072;
		}
		if (Static311.anInt5293 < local249) {
			Static311.anInt5293 += (local249 - Static311.anInt5293 >> 3) * Static354.anInt5770 / 1000 + Static205.anInt3601 << 3;
			if (local249 < Static311.anInt5293) {
				Static311.anInt5293 = local249;
			}
		}
		if (local249 < Static311.anInt5293) {
			Static311.anInt5293 -= Static205.anInt3601 + Static354.anInt5770 * (Static311.anInt5293 - local249 >> 3) / 1000 << 3;
			if (local249 > Static311.anInt5293) {
				Static311.anInt5293 = local249;
			}
		}
		@Pc(333) int local333 = local265 - Static155.anInt2834;
		if (local333 > 8192) {
			local333 -= 16384;
		}
		if (local333 < -8192) {
			local333 += 16384;
		}
		local333 >>= 0x3;
		if (local333 > 0) {
			Static155.anInt2834 += Static354.anInt5770 * local333 / 1000 + Static205.anInt3601 << 3;
			Static155.anInt2834 &= 0x3FFF;
		}
		if (local333 < 0) {
			Static155.anInt2834 -= Static354.anInt5770 * -local333 / 1000 + Static205.anInt3601 << 3;
			Static155.anInt2834 &= 0x3FFF;
		}
		@Pc(395) int local395 = local265 - Static155.anInt2834;
		if (local395 > 8192) {
			local395 -= 16384;
		}
		if (local395 < -8192) {
			local395 += 16384;
		}
		if (local395 < 0 && local333 > 0 || local395 > 0 && local333 < 0) {
			Static155.anInt2834 = local265;
		}
		Static11.anInt3597 = 0;
	}
}
