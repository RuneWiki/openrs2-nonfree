import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!bv", name = "w", descriptor = "[Lclient!it;")
	public static final Class147[] aClass147Array1 = new Class147[100];

	@OriginalMember(owner = "client!bv", name = "b", descriptor = "(I)V")
	public static void method1671() {
		@Pc(9) int local9 = Static617.anInt10422 * 512 + 256;
		@Pc(15) int local15 = Static340.anInt6769 * 512 + 256;
		@Pc(23) int local23 = Static150.method2982(Static86.anInt10575, local15, local9) - Static535.anInt9280;
		if (Static465.anInt8298 >= 100) {
			Static259.anInt6990 = Static340.anInt6769 * 512 + 256;
			Static184.anInt4048 = Static617.anInt10422 * 512 + 256;
			Static149.anInt3489 = Static150.method2982(Static86.anInt10575, Static259.anInt6990, Static184.anInt4048) - Static535.anInt9280;
		} else {
			if (Static184.anInt4048 < local9) {
				Static184.anInt4048 += Static150.anInt3514 + (local9 - Static184.anInt4048) * Static465.anInt8298 / 1000;
				if (Static184.anInt4048 > local9) {
					Static184.anInt4048 = local9;
				}
			}
			if (local9 < Static184.anInt4048) {
				Static184.anInt4048 -= Static150.anInt3514 + (Static184.anInt4048 - local9) * Static465.anInt8298 / 1000;
				if (Static184.anInt4048 < local9) {
					Static184.anInt4048 = local9;
				}
			}
			if (Static149.anInt3489 < local23) {
				Static149.anInt3489 += (local23 - Static149.anInt3489) * Static465.anInt8298 / 1000 + Static150.anInt3514;
				if (Static149.anInt3489 > local23) {
					Static149.anInt3489 = local23;
				}
			}
			if (local15 > Static259.anInt6990) {
				Static259.anInt6990 += Static465.anInt8298 * (local15 - Static259.anInt6990) / 1000 + Static150.anInt3514;
				if (Static259.anInt6990 > local15) {
					Static259.anInt6990 = local15;
				}
			}
			if (Static149.anInt3489 > local23) {
				Static149.anInt3489 -= Static150.anInt3514 + (Static149.anInt3489 - local23) * Static465.anInt8298 / 1000;
				if (local23 > Static149.anInt3489) {
					Static149.anInt3489 = local23;
				}
			}
			if (local15 < Static259.anInt6990) {
				Static259.anInt6990 -= Static150.anInt3514 + Static465.anInt8298 * (Static259.anInt6990 - local15) / 1000;
				if (local15 > Static259.anInt6990) {
					Static259.anInt6990 = local15;
				}
			}
		}
		local15 = Static187.anInt4085 * 512 + 256;
		local9 = Static18.anInt621 * 512 + 256;
		local23 = Static150.method2982(Static86.anInt10575, local15, local9) - Static526.anInt9182;
		@Pc(226) int local226 = local9 - Static184.anInt4048;
		@Pc(231) int local231 = local23 - Static149.anInt3489;
		@Pc(236) int local236 = local15 - Static259.anInt6990;
		@Pc(248) int local248 = (int) Math.sqrt((double) (local226 * local226 + local236 * local236));
		@Pc(259) int local259 = (int) (Math.atan2((double) local231, (double) local248) * 2607.5945876176133D) & 0x3FFF;
		@Pc(270) int local270 = (int) (-2607.5945876176133D * Math.atan2((double) local226, (double) local236)) & 0x3FFF;
		if (local259 < 1024) {
			local259 = 1024;
		}
		if (local259 > 3072) {
			local259 = 3072;
		}
		if (Static404.anInt4286 < local259) {
			Static404.anInt4286 += (local259 - Static404.anInt4286 >> 3) * Static38.anInt1413 / 1000 + Static458.anInt8218 << 3;
			if (Static404.anInt4286 > local259) {
				Static404.anInt4286 = local259;
			}
		}
		if (local259 < Static404.anInt4286) {
			Static404.anInt4286 -= Static458.anInt8218 + Static38.anInt1413 * (Static404.anInt4286 - local259 >> 3) / 1000 << 3;
			if (local259 > Static404.anInt4286) {
				Static404.anInt4286 = local259;
			}
		}
		@Pc(340) int local340 = local270 - Static349.anInt6848;
		if (local340 > 8192) {
			local340 -= 16384;
		}
		if (local340 < -8192) {
			local340 += 16384;
		}
		local340 >>= 0x3;
		if (local340 > 0) {
			Static349.anInt6848 += Static38.anInt1413 * local340 / 1000 + Static458.anInt8218 << 3;
			Static349.anInt6848 &= 0x3FFF;
		}
		if (local340 < 0) {
			Static349.anInt6848 -= Static38.anInt1413 * -local340 / 1000 + Static458.anInt8218 << 3;
			Static349.anInt6848 &= 0x3FFF;
		}
		@Pc(401) int local401 = local270 - Static349.anInt6848;
		if (local401 > 8192) {
			local401 -= 16384;
		}
		if (local401 < -8192) {
			local401 += 16384;
		}
		Static535.anInt9282 = 0;
		if (local401 < 0 && local340 > 0 || local401 > 0 && local340 < 0) {
			Static349.anInt6848 = local270;
		}
	}
}
