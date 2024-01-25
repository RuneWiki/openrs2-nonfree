import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!li", name = "i", descriptor = "[I")
	public static int[] anIntArray264;

	@OriginalMember(owner = "client!li", name = "j", descriptor = "Lclient!ra;")
	public static Class170 aClass170_64;

	@OriginalMember(owner = "client!li", name = "b", descriptor = "Lclient!nn;")
	public static final Class139 aClass139_1 = Static37.method871();

	@OriginalMember(owner = "client!li", name = "e", descriptor = "Lclient!bn;")
	public static final Class24 aClass24_2 = new Class24();

	@OriginalMember(owner = "client!li", name = "f", descriptor = "I")
	public static int anInt3555 = 0;

	@OriginalMember(owner = "client!li", name = "g", descriptor = "I")
	public static int anInt3556 = 0;

	@OriginalMember(owner = "client!li", name = "h", descriptor = "I")
	public static int anInt3557 = 0;

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(I)Z")
	public static boolean method3300() {
		@Pc(12) Class5_Sub4 local12 = (Class5_Sub4) Static60.aClass211_4.aClass5_235.aClass5_248;
		if (local12 == null || local12 == Static60.aClass211_4.aClass5_235) {
			return false;
		} else {
			if (local12.anInt785 >= 2000) {
				local12.anInt785 -= 2000;
			}
			return local12.anInt785 == 1004;
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Z)V")
	public static void method3302() {
		@Pc(9) int local9 = Static54.anInt1333 * 128 + 64;
		@Pc(15) int local15 = Class25_Sub1_Sub4.lb * 128 + 64;
		@Pc(23) int local23 = Static66.method1393(local15, Static156.anInt3123, local9) - Static6.anInt193;
		if (Static32.anInt861 >= 100) {
			Static347.anInt6472 = Static54.anInt1333 * 128 + 64;
			Static347.anInt6471 = Class25_Sub1_Sub4.lb * 128 + 64;
			Static339.anInt6354 = Static66.method1393(Static347.anInt6471, Static156.anInt3123, Static347.anInt6472) - Static6.anInt193;
		} else {
			if (local9 > Static347.anInt6472) {
				Static347.anInt6472 += Static339.anInt6358 + Static32.anInt861 * (local9 - Static347.anInt6472) / 1000;
				if (Static347.anInt6472 > local9) {
					Static347.anInt6472 = local9;
				}
			}
			if (local23 > Static339.anInt6354) {
				Static339.anInt6354 += Static32.anInt861 * (local23 - Static339.anInt6354) / 1000 + Static339.anInt6358;
				if (Static339.anInt6354 > local23) {
					Static339.anInt6354 = local23;
				}
			}
			if (Static347.anInt6472 > local9) {
				Static347.anInt6472 -= Static339.anInt6358 + (Static347.anInt6472 - local9) * Static32.anInt861 / 1000;
				if (local9 > Static347.anInt6472) {
					Static347.anInt6472 = local9;
				}
			}
			if (Static339.anInt6354 > local23) {
				Static339.anInt6354 -= (Static339.anInt6354 - local23) * Static32.anInt861 / 1000 + Static339.anInt6358;
				if (local23 > Static339.anInt6354) {
					Static339.anInt6354 = local23;
				}
			}
			if (local15 > Static347.anInt6471) {
				Static347.anInt6471 += (local15 - Static347.anInt6471) * Static32.anInt861 / 1000 + Static339.anInt6358;
				if (Static347.anInt6471 > local15) {
					Static347.anInt6471 = local15;
				}
			}
			if (local15 < Static347.anInt6471) {
				Static347.anInt6471 -= (Static347.anInt6471 - local15) * Static32.anInt861 / 1000 + Static339.anInt6358;
				if (Static347.anInt6471 < local15) {
					Static347.anInt6471 = local15;
				}
			}
		}
		local15 = Static256.anInt4992 * 128 + 64;
		local9 = Static99.anInt2187 * 128 + 64;
		local23 = Static66.method1393(local15, Static156.anInt3123, local9) - Static267.anInt5127;
		@Pc(223) int local223 = local9 - Static347.anInt6472;
		@Pc(227) int local227 = local23 - Static339.anInt6354;
		@Pc(232) int local232 = local15 - Static347.anInt6471;
		@Pc(244) int local244 = (int) Math.sqrt((double) (local223 * local223 + local232 * local232));
		@Pc(255) int local255 = (int) (Math.atan2((double) local227, (double) local244) * 2607.5945876176133D) & 0x3FFF;
		if (local255 < 1024) {
			local255 = 1024;
		}
		@Pc(271) int local271 = (int) (Math.atan2((double) local223, (double) local232) * -2607.5945876176133D) & 0x3FFF;
		if (local255 > 3072) {
			local255 = 3072;
		}
		if (Static311.anInt6461 < local255) {
			Static311.anInt6461 += Static328.anInt6217 + Static341.anInt6374 * (local255 - Static311.anInt6461 >> 3) / 1000 << 3;
			if (local255 < Static311.anInt6461) {
				Static311.anInt6461 = local255;
			}
		}
		if (local255 < Static311.anInt6461) {
			Static311.anInt6461 -= (Static311.anInt6461 - local255 >> 3) * Static341.anInt6374 / 1000 + Static328.anInt6217 << 3;
			if (local255 > Static311.anInt6461) {
				Static311.anInt6461 = local255;
			}
		}
		@Pc(347) int local347 = local271 - Static199.anInt3858;
		if (local347 > 8192) {
			local347 -= 16384;
		}
		if (local347 < -8192) {
			local347 += 16384;
		}
		local347 >>= 0x3;
		if (local347 > 0) {
			Static199.anInt3858 += Static328.anInt6217 + local347 * Static341.anInt6374 / 1000 << 3;
			Static199.anInt3858 &= 0x3FFF;
		}
		if (local347 < 0) {
			Static199.anInt3858 -= Static328.anInt6217 + Static341.anInt6374 * -local347 / 1000 << 3;
			Static199.anInt3858 &= 0x3FFF;
		}
		@Pc(409) int local409 = local271 - Static199.anInt3858;
		if (local409 > 8192) {
			local409 -= 16384;
		}
		if (local409 < -8192) {
			local409 += 16384;
		}
		if (local409 < 0 && local347 > 0 || local409 > 0 && local347 < 0) {
			Static199.anInt3858 = local271;
		}
	}

	@OriginalMember(owner = "client!li", name = "c", descriptor = "(I)V")
	public static void method3303() {
		@Pc(5) Class66 local5 = Static75.aClass66_29;
		synchronized (Static75.aClass66_29) {
			Static75.aClass66_29.method1933();
		}
		local5 = Static35.aClass66_8;
		synchronized (Static35.aClass66_8) {
			Static35.aClass66_8.method1933();
		}
	}
}
