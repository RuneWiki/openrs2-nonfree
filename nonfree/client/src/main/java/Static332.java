import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static332 {

	@OriginalMember(owner = "client!ve", name = "n", descriptor = "Lclient!k;")
	public static Class114 aClass114_8;

	@OriginalMember(owner = "client!ve", name = "p", descriptor = "Z")
	public static boolean aBoolean414 = false;

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)V")
	public static void method5450() {
		@Pc(9) int local9 = Static25.anInt6259 * 128 + 64;
		@Pc(15) int local15 = Static145.anInt2656 * 128 + 64;
		@Pc(24) int local24 = Static168.method2721(local9, Static322.anInt6250, local15) - Static33.anInt592;
		if (Static252.anInt5973 < 100) {
			if (local9 > Static190.anInt3870) {
				Static190.anInt3870 += Static344.anInt6592 + Static252.anInt5973 * (local9 - Static190.anInt3870) / 1000;
				if (local9 < Static190.anInt3870) {
					Static190.anInt3870 = local9;
				}
			}
			if (local24 > Static86.anInt1541) {
				Static86.anInt1541 += Static344.anInt6592 + (local24 - Static86.anInt1541) * Static252.anInt5973 / 1000;
				if (Static86.anInt1541 > local24) {
					Static86.anInt1541 = local24;
				}
			}
			if (Static190.anInt3870 > local9) {
				Static190.anInt3870 -= Static344.anInt6592 + (Static190.anInt3870 - local9) * Static252.anInt5973 / 1000;
				if (Static190.anInt3870 < local9) {
					Static190.anInt3870 = local9;
				}
			}
			if (local15 > Static316.anInt6169) {
				Static316.anInt6169 += Static344.anInt6592 + (local15 - Static316.anInt6169) * Static252.anInt5973 / 1000;
				if (Static316.anInt6169 > local15) {
					Static316.anInt6169 = local15;
				}
			}
			if (Static86.anInt1541 > local24) {
				Static86.anInt1541 -= (Static86.anInt1541 - local24) * Static252.anInt5973 / 1000 + Static344.anInt6592;
				if (Static86.anInt1541 < local24) {
					Static86.anInt1541 = local24;
				}
			}
			if (Static316.anInt6169 > local15) {
				Static316.anInt6169 -= Static344.anInt6592 + (Static316.anInt6169 - local15) * Static252.anInt5973 / 1000;
				if (Static316.anInt6169 < local15) {
					Static316.anInt6169 = local15;
				}
			}
		} else {
			Static190.anInt3870 = Static25.anInt6259 * 128 + 64;
			Static316.anInt6169 = Static145.anInt2656 * 128 + 64;
			Static86.anInt1541 = Static168.method2721(Static190.anInt3870, Static322.anInt6250, Static316.anInt6169) - Static33.anInt592;
		}
		local9 = Static175.anInt3452 * 128 + 64;
		local15 = Static264.anInt5402 * 128 + 64;
		local24 = Static168.method2721(local9, Static322.anInt6250, local15) - Static82.anInt1500;
		@Pc(229) int local229 = local9 - Static190.anInt3870;
		@Pc(234) int local234 = local24 - Static86.anInt1541;
		@Pc(238) int local238 = local15 - Static316.anInt6169;
		@Pc(255) int local255 = (int) Math.sqrt((double) (local229 * local229 + local238 * local238));
		@Pc(266) int local266 = (int) (Math.atan2((double) local234, (double) local255) * 2607.5945876176133D) & 0x3FFF;
		@Pc(277) int local277 = (int) (Math.atan2((double) local229, (double) local238) * -2607.5945876176133D) & 0x3FFF;
		if (local266 < 1024) {
			local266 = 1024;
		}
		if (local266 > 3072) {
			local266 = 3072;
		}
		if (Static184.anInt3721 < local266) {
			Static184.anInt3721 += Static319.anInt6196 * (local266 - Static184.anInt3721 >> 3) / 1000 + Static24.anInt455 << 3;
			if (Static184.anInt3721 > local266) {
				Static184.anInt3721 = local266;
			}
		}
		if (Static184.anInt3721 > local266) {
			Static184.anInt3721 -= Static24.anInt455 + (Static184.anInt3721 - local266 >> 3) * Static319.anInt6196 / 1000 << 3;
			if (local266 > Static184.anInt3721) {
				Static184.anInt3721 = local266;
			}
		}
		@Pc(353) int local353 = local277 - Static308.anInt6050;
		if (local353 > 8192) {
			local353 -= 16384;
		}
		if (local353 < -8192) {
			local353 += 16384;
		}
		local353 >>= 0x3;
		if (local353 > 0) {
			Static308.anInt6050 += Static24.anInt455 + Static319.anInt6196 * local353 / 1000 << 3;
			Static308.anInt6050 &= 0x3FFF;
		}
		if (local353 < 0) {
			Static308.anInt6050 -= Static24.anInt455 + -local353 * Static319.anInt6196 / 1000 << 3;
			Static308.anInt6050 &= 0x3FFF;
		}
		@Pc(419) int local419 = local277 - Static308.anInt6050;
		if (local419 > 8192) {
			local419 -= 16384;
		}
		if (local419 < -8192) {
			local419 += 16384;
		}
		Static157.anInt3004 = 0;
		if (local419 < 0 && local353 > 0 || local419 > 0 && local353 < 0) {
			Static308.anInt6050 = local277;
		}
	}
}
