import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
	public static int anInt3643 = 0;

	@OriginalMember(owner = "client!tc", name = "g", descriptor = "Lclient!ai;")
	private static Class6 aClass6_1066 = Static38.method685("Welcome to RuneScape");

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1063 = aClass6_1066;

	@OriginalMember(owner = "client!tc", name = "d", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1064 = Static38.method685("Spiel)2Engine wird gestartet)3)3)3");

	@OriginalMember(owner = "client!tc", name = "e", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1065 = Static38.method685(")4lang)4de");

	@OriginalMember(owner = "client!tc", name = "f", descriptor = "[I")
	public static int[] anIntArray359 = new int[128];

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V")
	public static void method2413() {
		if (Static132.anInt3074 > 0) {
			Static158.method2417();
		} else {
			Static98.method1607(40);
			Static65.aClass43_2 = Static166.aClass43_3;
			Static166.aClass43_3 = null;
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Z)V")
	public static void method2414() {
		@Pc(9) int local9 = Static10.anInt236 * 128 + 64;
		@Pc(15) int local15 = Static177.anInt4136 * 128 + 64;
		@Pc(23) int local23 = Static131.method2041(local15, local9, Static36.anInt1020) - Static134.anInt3126;
		if (Static28.anInt722 < local9) {
			Static28.anInt722 += Static6.anInt1427 + Static180.anInt4191 * (local9 - Static28.anInt722) / 1000;
			if (Static28.anInt722 > local9) {
				Static28.anInt722 = local9;
			}
		}
		if (Static12.anInt313 < local23) {
			Static12.anInt313 += Static6.anInt1427 + Static180.anInt4191 * (local23 - Static12.anInt313) / 1000;
			if (Static12.anInt313 > local23) {
				Static12.anInt313 = local23;
			}
		}
		if (Static28.anInt722 > local9) {
			Static28.anInt722 -= Static6.anInt1427 + (Static28.anInt722 - local9) * Static180.anInt4191 / 1000;
			if (Static28.anInt722 < local9) {
				Static28.anInt722 = local9;
			}
		}
		if (Static106.anInt4184 < local15) {
			Static106.anInt4184 += Static180.anInt4191 * (local15 - Static106.anInt4184) / 1000 + Static6.anInt1427;
			if (local15 < Static106.anInt4184) {
				Static106.anInt4184 = local15;
			}
		}
		if (local15 < Static106.anInt4184) {
			Static106.anInt4184 -= (Static106.anInt4184 - local15) * Static180.anInt4191 / 1000 + Static6.anInt1427;
			if (local15 > Static106.anInt4184) {
				Static106.anInt4184 = local15;
			}
		}
		if (local23 < Static12.anInt313) {
			Static12.anInt313 -= Static6.anInt1427 + Static180.anInt4191 * (Static12.anInt313 - local23) / 1000;
			if (local23 > Static12.anInt313) {
				Static12.anInt313 = local23;
			}
		}
		local15 = Static2.anInt61 * 128 + 64;
		local9 = Static180.anInt4195 * 128 + 64;
		local23 = Static131.method2041(local15, local9, Static36.anInt1020) - Static165.anInt3872;
		@Pc(213) int local213 = local23 - Static12.anInt313;
		@Pc(218) int local218 = local9 - Static28.anInt722;
		@Pc(223) int local223 = local15 - Static106.anInt4184;
		@Pc(235) int local235 = (int) Math.sqrt((double) (local223 * local223 + local218 * local218));
		@Pc(246) int local246 = (int) (Math.atan2((double) local213, (double) local235) * 325.949D) & 0x7FF;
		if (local246 < 128) {
			local246 = 128;
		}
		@Pc(264) int local264 = (int) (Math.atan2((double) local223, (double) local218) * -325.949D) & 0x7FF;
		@Pc(268) int local268 = local264 - Static182.anInt4201;
		if (local246 > 383) {
			local246 = 383;
		}
		if (local268 > 1024) {
			local268 -= 2048;
		}
		if (local268 < -1024) {
			local268 += 2048;
		}
		if (local246 > Static107.anInt2560) {
			Static107.anInt2560 += Static11.anInt279 * (local246 - Static107.anInt2560) / 1000 + Static89.anInt2266;
			if (Static107.anInt2560 > local246) {
				Static107.anInt2560 = local246;
			}
		}
		if (Static107.anInt2560 > local246) {
			Static107.anInt2560 -= Static11.anInt279 * (Static107.anInt2560 - local246) / 1000 + Static89.anInt2266;
			if (Static107.anInt2560 < local246) {
				Static107.anInt2560 = local246;
			}
		}
		if (local268 > 0) {
			Static182.anInt4201 += Static11.anInt279 * local268 / 1000 + Static89.anInt2266;
			Static182.anInt4201 &= 0x7FF;
		}
		if (local268 < 0) {
			Static182.anInt4201 -= Static89.anInt2266 + -local268 * Static11.anInt279 / 1000;
			Static182.anInt4201 &= 0x7FF;
		}
		@Pc(379) int local379 = local264 - Static182.anInt4201;
		if (local379 > 1024) {
			local379 -= 2048;
		}
		if (local379 < -1024) {
			local379 += 2048;
		}
		if (local379 < 0 && local268 > 0 || local379 > 0 && local268 < 0) {
			Static182.anInt4201 = local264;
		}
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(Z)V")
	public static void method2415() {
		aClass6_1066 = null;
		aClass6_1063 = null;
		aClass6_1064 = null;
		aClass6_1065 = null;
		anIntArray359 = null;
	}
}
