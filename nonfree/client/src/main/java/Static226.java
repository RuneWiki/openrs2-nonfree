import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static226 {

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "I")
	public static int anInt4474;

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "Z")
	public static boolean aBoolean281 = false;

	@OriginalMember(owner = "client!lc", name = "k", descriptor = "Lclient!vv;")
	public static final Class263 aClass263_98 = new Class263(46, 0);

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Z)V")
	public static void method3458() {
		@Pc(9) int local9 = Static342.anInt6261 * 128 + 64;
		@Pc(15) int local15 = Static272.anInt5269 * 128 + 64;
		@Pc(23) int local23 = Static227.method3475(local9, local15, Static426.anInt1486) - Static259.anInt5010;
		if (Static83.anInt2025 < 100) {
			if (Static378.anInt6885 < local9) {
				Static378.anInt6885 += (local9 - Static378.anInt6885) * Static83.anInt2025 / 1000 + Static181.anInt3929;
				if (local9 < Static378.anInt6885) {
					Static378.anInt6885 = local9;
				}
			}
			if (Static378.anInt6885 > local9) {
				Static378.anInt6885 -= Static181.anInt3929 + Static83.anInt2025 * (Static378.anInt6885 - local9) / 1000;
				if (Static378.anInt6885 < local9) {
					Static378.anInt6885 = local9;
				}
			}
			if (local23 > Static107.anInt2426) {
				Static107.anInt2426 += (local23 - Static107.anInt2426) * Static83.anInt2025 / 1000 + Static181.anInt3929;
				if (Static107.anInt2426 > local23) {
					Static107.anInt2426 = local23;
				}
			}
			if (Static107.anInt2426 > local23) {
				Static107.anInt2426 -= Static83.anInt2025 * (Static107.anInt2426 - local23) / 1000 + Static181.anInt3929;
				if (Static107.anInt2426 < local23) {
					Static107.anInt2426 = local23;
				}
			}
			if (Static78.anInt1973 < local15) {
				Static78.anInt1973 += (local15 - Static78.anInt1973) * Static83.anInt2025 / 1000 + Static181.anInt3929;
				if (Static78.anInt1973 > local15) {
					Static78.anInt1973 = local15;
				}
			}
			if (Static78.anInt1973 > local15) {
				Static78.anInt1973 -= Static83.anInt2025 * (Static78.anInt1973 - local15) / 1000 + Static181.anInt3929;
				if (local15 > Static78.anInt1973) {
					Static78.anInt1973 = local15;
				}
			}
		} else {
			Static378.anInt6885 = Static342.anInt6261 * 128 + 64;
			Static78.anInt1973 = Static272.anInt5269 * 128 + 64;
			Static107.anInt2426 = Static227.method3475(Static378.anInt6885, Static78.anInt1973, Static426.anInt1486) - Static259.anInt5010;
		}
		local9 = Static325.anInt6023 * 128 + 64;
		local15 = Static41.anInt1051 * 128 + 64;
		local23 = Static227.method3475(local9, local15, Static426.anInt1486) - Static195.anInt4072;
		@Pc(230) int local230 = local9 - Static378.anInt6885;
		@Pc(235) int local235 = local23 - Static107.anInt2426;
		@Pc(240) int local240 = local15 - Static78.anInt1973;
		@Pc(251) int local251 = (int) Math.sqrt((double) (local240 * local240 + local230 * local230));
		@Pc(262) int local262 = (int) (Math.atan2((double) local235, (double) local251) * 2607.5945876176133D) & 0x3FFF;
		if (local262 < 1024) {
			local262 = 1024;
		}
		@Pc(282) int local282 = (int) (-2607.5945876176133D * Math.atan2((double) local230, (double) local240)) & 0x3FFF;
		if (local262 > 3072) {
			local262 = 3072;
		}
		if (local262 > Static217.anInt4351) {
			Static217.anInt4351 += Static64.anInt1733 * (local262 - Static217.anInt4351 >> 3) / 1000 + Static363.anInt6666 << 3;
			if (local262 < Static217.anInt4351) {
				Static217.anInt4351 = local262;
			}
		}
		if (local262 < Static217.anInt4351) {
			Static217.anInt4351 -= Static363.anInt6666 + Static64.anInt1733 * (Static217.anInt4351 - local262 >> 3) / 1000 << 3;
			if (local262 > Static217.anInt4351) {
				Static217.anInt4351 = local262;
			}
		}
		@Pc(351) int local351 = local282 - Static147.anInt3170;
		if (local351 > 8192) {
			local351 -= 16384;
		}
		if (local351 < -8192) {
			local351 += 16384;
		}
		local351 >>= 0x3;
		if (local351 > 0) {
			Static147.anInt3170 += local351 * Static64.anInt1733 / 1000 + Static363.anInt6666 << 3;
			Static147.anInt3170 &= 0x3FFF;
		}
		if (local351 < 0) {
			Static147.anInt3170 -= -local351 * Static64.anInt1733 / 1000 + Static363.anInt6666 << 3;
			Static147.anInt3170 &= 0x3FFF;
		}
		@Pc(407) int local407 = local282 - Static147.anInt3170;
		if (local407 > 8192) {
			local407 -= 16384;
		}
		if (local407 < -8192) {
			local407 += 16384;
		}
		if (local407 < 0 && local351 > 0 || local407 > 0 && local351 < 0) {
			Static147.anInt3170 = local282;
		}
		Static403.anInt7268 = 0;
	}

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "(I)V")
	public static void method3464() {
		@Pc(5) int local5 = 0;
		if (Static12.aClass34_Sub1_1.method5466(Static262.anInt2805)) {
			local5 = 55;
		}
		if (!Static12.aClass34_Sub1_1.aBoolean458) {
			local5 |= 0x40;
		}
		Static269.method4003(local5);
		Static455.aClass161_4.method3626(local5);
		Static43.aClass57_1.method1413(local5);
		Static300.aClass44_2.method1010(local5);
		Static145.aClass63_1.method1525(local5);
		Static258.method3819(local5);
		Static448.method6099(local5);
		Static45.method859(local5);
		Static45.method855(local5);
		Static69.method1330();
	}
}
