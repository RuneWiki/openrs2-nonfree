import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "Z")
	public static boolean aBoolean265 = true;

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)V")
	public static void method3130() {
		@Pc(9) int local9 = Static217.anInt3930 * 128 + 64;
		@Pc(15) int local15 = Static235.anInt4192 * 128 + 64;
		@Pc(24) int local24 = Static170.method3006(local9, local15, Static382.anInt6523) - Static169.anInt3235;
		if (Static240.anInt4284 < 100) {
			if (local9 > Static224.anInt4006) {
				Static224.anInt4006 += Static9.anInt252 + Static240.anInt4284 * (local9 - Static224.anInt4006) / 1000;
				if (Static224.anInt4006 > local9) {
					Static224.anInt4006 = local9;
				}
			}
			if (Static224.anInt4006 > local9) {
				Static224.anInt4006 -= Static240.anInt4284 * (Static224.anInt4006 - local9) / 1000 + Static9.anInt252;
				if (local9 > Static224.anInt4006) {
					Static224.anInt4006 = local9;
				}
			}
			if (Static285.anInt4940 < local24) {
				Static285.anInt4940 += Static9.anInt252 + Static240.anInt4284 * (local24 - Static285.anInt4940) / 1000;
				if (local24 < Static285.anInt4940) {
					Static285.anInt4940 = local24;
				}
			}
			if (Static285.anInt4940 > local24) {
				Static285.anInt4940 -= Static9.anInt252 + Static240.anInt4284 * (Static285.anInt4940 - local24) / 1000;
				if (local24 > Static285.anInt4940) {
					Static285.anInt4940 = local24;
				}
			}
			if (local15 > Static51.anInt1057) {
				Static51.anInt1057 += Static9.anInt252 + (local15 - Static51.anInt1057) * Static240.anInt4284 / 1000;
				if (Static51.anInt1057 > local15) {
					Static51.anInt1057 = local15;
				}
			}
			if (local15 < Static51.anInt1057) {
				Static51.anInt1057 -= Static9.anInt252 + (Static51.anInt1057 - local15) * Static240.anInt4284 / 1000;
				if (Static51.anInt1057 < local15) {
					Static51.anInt1057 = local15;
				}
			}
		} else {
			Static224.anInt4006 = Static217.anInt3930 * 128 + 64;
			Static51.anInt1057 = Static235.anInt4192 * 128 + 64;
			Static285.anInt4940 = Static170.method3006(Static224.anInt4006, Static51.anInt1057, Static382.anInt6523) - Static169.anInt3235;
		}
		local9 = Static139.anInt2784 * 128 + 64;
		local15 = Static296.anInt5089 * 128 + 64;
		local24 = Static170.method3006(local9, local15, Static382.anInt6523) - Static177.anInt3412;
		@Pc(227) int local227 = local9 - Static224.anInt4006;
		@Pc(236) int local236 = local24 - Static285.anInt4940;
		@Pc(240) int local240 = local15 - Static51.anInt1057;
		@Pc(251) int local251 = (int) Math.sqrt((double) (local227 * local227 + local240 * local240));
		@Pc(262) int local262 = (int) (Math.atan2((double) local236, (double) local251) * 2607.5945876176133D) & 0x3FFF;
		if (local262 < 1024) {
			local262 = 1024;
		}
		@Pc(280) int local280 = (int) (Math.atan2((double) local227, (double) local240) * -2607.5945876176133D) & 0x3FFF;
		if (local262 > 3072) {
			local262 = 3072;
		}
		if (local262 > Static14.anInt360) {
			Static14.anInt360 += (local262 - Static14.anInt360 >> 3) * Static131.anInt2701 / 1000 + Static111.anInt2355 << 3;
			if (local262 < Static14.anInt360) {
				Static14.anInt360 = local262;
			}
		}
		if (Static14.anInt360 > local262) {
			Static14.anInt360 -= Static111.anInt2355 + (Static14.anInt360 - local262 >> 3) * Static131.anInt2701 / 1000 << 3;
			if (Static14.anInt360 < local262) {
				Static14.anInt360 = local262;
			}
		}
		@Pc(350) int local350 = local280 - Static235.anInt4191;
		if (local350 > 8192) {
			local350 -= 16384;
		}
		if (local350 < -8192) {
			local350 += 16384;
		}
		local350 >>= 0x3;
		if (local350 > 0) {
			Static235.anInt4191 += Static111.anInt2355 + Static131.anInt2701 * local350 / 1000 << 3;
			Static235.anInt4191 &= 0x3FFF;
		}
		if (local350 < 0) {
			Static235.anInt4191 -= Static111.anInt2355 + -local350 * Static131.anInt2701 / 1000 << 3;
			Static235.anInt4191 &= 0x3FFF;
		}
		@Pc(409) int local409 = local280 - Static235.anInt4191;
		if (local409 > 8192) {
			local409 -= 16384;
		}
		if (local409 < -8192) {
			local409 += 16384;
		}
		Static288.anInt5007 = 0;
		if (local409 < 0 && local350 > 0 || local409 > 0 && local350 < 0) {
			Static235.anInt4191 = local280;
		}
	}
}
