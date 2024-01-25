import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!hg", name = "m", descriptor = "[B")
	public static final byte[] aByteArray43 = new byte[2048];

	@OriginalMember(owner = "client!hg", name = "p", descriptor = "I")
	public static int anInt3899 = 0;

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Z)V")
	public static void method3242() {
		@Pc(9) int local9 = Static400.anInt6972 * 512 + 256;
		@Pc(15) int local15 = Static529.anInt9415 * 512 + 256;
		@Pc(23) int local23 = Static524.method7217(local9, Static566.anInt9278, local15) - Static471.anInt8055;
		if (Static570.anInt6328 >= 100) {
			Static7.anInt337 = Static529.anInt9415 * 512 + 256;
			Static90.anInt1932 = Static400.anInt6972 * 512 + 256;
			Static548.anInt8906 = Static524.method7217(Static90.anInt1932, Static566.anInt9278, Static7.anInt337) - Static471.anInt8055;
		} else {
			if (local9 > Static90.anInt1932) {
				Static90.anInt1932 += Static326.anInt6029 + (local9 - Static90.anInt1932) * Static570.anInt6328 / 1000;
				if (Static90.anInt1932 > local9) {
					Static90.anInt1932 = local9;
				}
			}
			if (Static548.anInt8906 < local23) {
				Static548.anInt8906 += Static326.anInt6029 + Static570.anInt6328 * (local23 - Static548.anInt8906) / 1000;
				if (local23 < Static548.anInt8906) {
					Static548.anInt8906 = local23;
				}
			}
			if (Static90.anInt1932 > local9) {
				Static90.anInt1932 -= Static326.anInt6029 + Static570.anInt6328 * (Static90.anInt1932 - local9) / 1000;
				if (local9 > Static90.anInt1932) {
					Static90.anInt1932 = local9;
				}
			}
			if (Static548.anInt8906 > local23) {
				Static548.anInt8906 -= Static326.anInt6029 + (Static548.anInt8906 - local23) * Static570.anInt6328 / 1000;
				if (Static548.anInt8906 < local23) {
					Static548.anInt8906 = local23;
				}
			}
			if (Static7.anInt337 < local15) {
				Static7.anInt337 += Static326.anInt6029 + (local15 - Static7.anInt337) * Static570.anInt6328 / 1000;
				if (local15 < Static7.anInt337) {
					Static7.anInt337 = local15;
				}
			}
			if (Static7.anInt337 > local15) {
				Static7.anInt337 -= (Static7.anInt337 - local15) * Static570.anInt6328 / 1000 + Static326.anInt6029;
				if (local15 > Static7.anInt337) {
					Static7.anInt337 = local15;
				}
			}
		}
		local15 = Static330.anInt6084 * 512 + 256;
		local9 = Static285.anInt6373 * 512 + 256;
		local23 = Static524.method7217(local9, Static566.anInt9278, local15) - Static412.anInt568;
		@Pc(230) int local230 = local9 - Static90.anInt1932;
		@Pc(235) int local235 = local23 - Static548.anInt8906;
		@Pc(240) int local240 = local15 - Static7.anInt337;
		@Pc(251) int local251 = (int) Math.sqrt((double) (local240 * local240 + local230 * local230));
		@Pc(262) int local262 = (int) (Math.atan2((double) local235, (double) local251) * 2607.5945876176133D) & 0x3FFF;
		@Pc(273) int local273 = (int) (Math.atan2((double) local230, (double) local240) * -2607.5945876176133D) & 0x3FFF;
		if (local262 < 1024) {
			local262 = 1024;
		}
		if (local262 > 3072) {
			local262 = 3072;
		}
		if (Static323.anInt6015 < local262) {
			Static323.anInt6015 += Static204.anInt3987 + (local262 - Static323.anInt6015 >> 3) * Static309.anInt5528 / 1000 << 3;
			if (local262 < Static323.anInt6015) {
				Static323.anInt6015 = local262;
			}
		}
		if (local262 < Static323.anInt6015) {
			Static323.anInt6015 -= (Static323.anInt6015 - local262 >> 3) * Static309.anInt5528 / 1000 + Static204.anInt3987 << 3;
			if (Static323.anInt6015 < local262) {
				Static323.anInt6015 = local262;
			}
		}
		@Pc(349) int local349 = local273 - Static177.anInt3712;
		if (local349 > 8192) {
			local349 -= 16384;
		}
		if (local349 < -8192) {
			local349 += 16384;
		}
		local349 >>= 0x3;
		if (local349 > 0) {
			Static177.anInt3712 += local349 * Static309.anInt5528 / 1000 + Static204.anInt3987 << 3;
			Static177.anInt3712 &= 0x3FFF;
		}
		if (local349 < 0) {
			Static177.anInt3712 -= Static204.anInt3987 + Static309.anInt5528 * -local349 / 1000 << 3;
			Static177.anInt3712 &= 0x3FFF;
		}
		@Pc(406) int local406 = local273 - Static177.anInt3712;
		if (local406 > 8192) {
			local406 -= 16384;
		}
		if (local406 < -8192) {
			local406 += 16384;
		}
		Static443.anInt7768 = 0;
		if (local406 < 0 && local349 > 0 || local406 > 0 && local349 < 0) {
			Static177.anInt3712 = local273;
		}
	}
}
