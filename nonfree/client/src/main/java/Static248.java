import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static248 {

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "I")
	public static int anInt2147;

	@OriginalMember(owner = "client!rl", name = "m", descriptor = "I")
	public static int anInt2157;

	@OriginalMember(owner = "client!rl", name = "f", descriptor = "I")
	public static int anInt2151 = 0;

	@OriginalMember(owner = "client!rl", name = "i", descriptor = "[I")
	public static int[] anIntArray196 = new int[14];

	@OriginalMember(owner = "client!rl", name = "j", descriptor = "I")
	public static int anInt2154 = 0;

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IZ[JI[I)V")
	public static void method1588(@OriginalArg(0) int arg0, @OriginalArg(2) long[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		if (arg0 >= arg2) {
			return;
		}
		@Pc(11) int local11 = arg0;
		@Pc(17) int local17 = (arg2 + arg0) / 2;
		@Pc(21) long local21 = arg1[local17];
		arg1[local17] = arg1[arg2];
		arg1[arg2] = local21;
		@Pc(35) int local35 = arg3[local17];
		arg3[local17] = arg3[arg2];
		arg3[arg2] = local35;
		for (@Pc(47) int local47 = arg0; local47 < arg2; local47++) {
			if (arg1[local47] < (long) (local47 & 0x1) + local21) {
				@Pc(66) long local66 = arg1[local47];
				arg1[local47] = arg1[local11];
				arg1[local11] = local66;
				@Pc(80) int local80 = arg3[local47];
				arg3[local47] = arg3[local11];
				arg3[local11++] = local80;
			}
		}
		arg1[arg2] = arg1[local11];
		arg1[local11] = local21;
		arg3[arg2] = arg3[local11];
		arg3[local11] = local35;
		method1588(arg0, arg1, local11 - 1, arg3);
		method1588(local11 + 1, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!g;I)V")
	public static void method1591(@OriginalArg(0) Class56 arg0) {
		@Pc(8) Class56 local8 = Static157.method2862(arg0);
		@Pc(17) int local17;
		@Pc(20) int local20;
		if (local8 == null) {
			local20 = Static120.anInt2649;
			local17 = Static60.anInt1510;
		} else {
			local17 = local8.anInt2057;
			local20 = local8.anInt2031;
		}
		Static59.method1140(arg0, local17, local20, false);
		Static150.method2673(arg0, local17, local20);
	}

	@OriginalMember(owner = "client!rl", name = "d", descriptor = "(I)V")
	public static void method1595() {
		@Pc(5) int local5 = Static206.anInt4289 * 128 + 64;
		@Pc(15) int local15 = Static136.anInt3064 * 128 + 64;
		@Pc(23) int local23 = Static234.method3798(local15, local5, Static32.anInt876) - Static282.anInt5573;
		if (Static69.anInt3049 >= 100) {
			Static192.anInt4017 = Static136.anInt3064 * 128 + 64;
			Static80.anInt1911 = Static206.anInt4289 * 128 + 64;
			Static162.anInt3612 = Static234.method3798(Static192.anInt4017, Static80.anInt1911, Static32.anInt876) - Static282.anInt5573;
		} else {
			if (Static162.anInt3612 < local23) {
				Static162.anInt3612 += Static85.anInt1998 + Static69.anInt3049 * (local23 - Static162.anInt3612) / 1000;
				if (Static162.anInt3612 > local23) {
					Static162.anInt3612 = local23;
				}
			}
			if (Static162.anInt3612 > local23) {
				Static162.anInt3612 -= Static85.anInt1998 + Static69.anInt3049 * (Static162.anInt3612 - local23) / 1000;
				if (Static162.anInt3612 < local23) {
					Static162.anInt3612 = local23;
				}
			}
			if (local5 > Static80.anInt1911) {
				Static80.anInt1911 += Static85.anInt1998 + (local5 - Static80.anInt1911) * Static69.anInt3049 / 1000;
				if (Static80.anInt1911 > local5) {
					Static80.anInt1911 = local5;
				}
			}
			if (Static80.anInt1911 > local5) {
				Static80.anInt1911 -= Static85.anInt1998 + Static69.anInt3049 * (Static80.anInt1911 - local5) / 1000;
				if (Static80.anInt1911 < local5) {
					Static80.anInt1911 = local5;
				}
			}
			if (Static192.anInt4017 < local15) {
				Static192.anInt4017 += Static69.anInt3049 * (local15 - Static192.anInt4017) / 1000 + Static85.anInt1998;
				if (Static192.anInt4017 > local15) {
					Static192.anInt4017 = local15;
				}
			}
			if (local15 < Static192.anInt4017) {
				Static192.anInt4017 -= Static85.anInt1998 + Static69.anInt3049 * (Static192.anInt4017 - local15) / 1000;
				if (Static192.anInt4017 < local15) {
					Static192.anInt4017 = local15;
				}
			}
		}
		local5 = Static59.anInt1482 * 128 + 64;
		local15 = Static13.anInt262 * 128 + 64;
		local23 = Static234.method3798(local15, local5, Static32.anInt876) - Static274.anInt5440;
		@Pc(229) int local229 = local23 - Static162.anInt3612;
		@Pc(234) int local234 = local15 - Static192.anInt4017;
		@Pc(247) int local247 = local5 - Static80.anInt1911;
		@Pc(258) int local258 = (int) Math.sqrt((double) (local234 * local234 + local247 * local247));
		@Pc(269) int local269 = (int) (Math.atan2((double) local229, (double) local258) * 325.949D) & 0x7FF;
		@Pc(280) int local280 = (int) (-325.949D * Math.atan2((double) local247, (double) local234)) & 0x7FF;
		@Pc(285) int local285 = local280 - Static151.anInt3328;
		if (local285 > 1024) {
			local285 -= 2048;
		}
		if (local285 < -1024) {
			local285 += 2048;
		}
		if (local285 > 0) {
			Static151.anInt3328 += Static225.anInt5366 + local285 * Static84.anInt1965 / 1000;
			Static151.anInt3328 &= 0x7FF;
		}
		if (local285 < 0) {
			Static151.anInt3328 -= Static225.anInt5366 + -local285 * Static84.anInt1965 / 1000;
			Static151.anInt3328 &= 0x7FF;
		}
		@Pc(337) int local337 = local280 - Static151.anInt3328;
		if (local269 < 128) {
			local269 = 128;
		}
		if (local337 > 1024) {
			local337 -= 2048;
		}
		if (local337 < -1024) {
			local337 += 2048;
		}
		if (local269 > 383) {
			local269 = 383;
		}
		if (local269 > Static295.anInt5738) {
			Static295.anInt5738 += Static84.anInt1965 * (local269 - Static295.anInt5738) / 1000 + Static225.anInt5366;
			if (Static295.anInt5738 > local269) {
				Static295.anInt5738 = local269;
			}
		}
		if (local337 < 0 && local285 > 0 || local337 > 0 && local285 < 0) {
			Static151.anInt3328 = local280;
		}
		if (Static295.anInt5738 > local269) {
			Static295.anInt5738 -= (Static295.anInt5738 - local269) * Static84.anInt1965 / 1000 + Static225.anInt5366;
			if (Static295.anInt5738 < local269) {
				Static295.anInt5738 = local269;
			}
		}
	}
}
