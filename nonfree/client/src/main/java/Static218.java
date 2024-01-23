import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static218 {

	@OriginalMember(owner = "client!qk", name = "j", descriptor = "Lclient!ak;")
	public static Class7 aClass7_56;

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "[I")
	public static int[] anIntArray142 = new int[14];

	@OriginalMember(owner = "client!qk", name = "f", descriptor = "I")
	public static int anInt1198 = 0;

	@OriginalMember(owner = "client!qk", name = "l", descriptor = "[J")
	public static long[] aLongArray3 = new long[32];

	@OriginalMember(owner = "client!qk", name = "n", descriptor = "[J")
	public static long[] aLongArray4 = new long[100];

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)V")
	public static void method964() {
		@Pc(9) int local9 = Static298.anInt5904 * 128 + 64;
		@Pc(15) int local15 = Static192.anInt5400 * 128 + 64;
		@Pc(24) int local24 = Static124.method1919(Static159.anInt2978, local9, local15) - Static158.anInt2962;
		if (Static72.anInt1430 >= 100) {
			Static68.anInt4743 = Static192.anInt5400 * 128 + 64;
			Static182.anInt3398 = Static298.anInt5904 * 128 + 64;
			Static185.anInt3457 = Static124.method1919(Static159.anInt2978, Static182.anInt3398, Static68.anInt4743) - Static158.anInt2962;
		} else {
			if (local24 > Static185.anInt3457) {
				Static185.anInt3457 += (local24 - Static185.anInt3457) * Static72.anInt1430 / 1000 + Static54.anInt1154;
				if (Static185.anInt3457 > local24) {
					Static185.anInt3457 = local24;
				}
			}
			if (Static182.anInt3398 < local9) {
				Static182.anInt3398 += Static54.anInt1154 + Static72.anInt1430 * (local9 - Static182.anInt3398) / 1000;
				if (local9 < Static182.anInt3398) {
					Static182.anInt3398 = local9;
				}
			}
			if (local9 < Static182.anInt3398) {
				Static182.anInt3398 -= Static72.anInt1430 * (Static182.anInt3398 - local9) / 1000 + Static54.anInt1154;
				if (local9 > Static182.anInt3398) {
					Static182.anInt3398 = local9;
				}
			}
			if (local24 < Static185.anInt3457) {
				Static185.anInt3457 -= Static72.anInt1430 * (Static185.anInt3457 - local24) / 1000 + Static54.anInt1154;
				if (local24 > Static185.anInt3457) {
					Static185.anInt3457 = local24;
				}
			}
			if (local15 > Static68.anInt4743) {
				Static68.anInt4743 += Static54.anInt1154 + (local15 - Static68.anInt4743) * Static72.anInt1430 / 1000;
				if (local15 < Static68.anInt4743) {
					Static68.anInt4743 = local15;
				}
			}
			if (local15 < Static68.anInt4743) {
				Static68.anInt4743 -= Static72.anInt1430 * (Static68.anInt4743 - local15) / 1000 + Static54.anInt1154;
				if (local15 > Static68.anInt4743) {
					Static68.anInt4743 = local15;
				}
			}
		}
		local15 = Static53.anInt1117 * 128 + 64;
		local9 = Static253.anInt5155 * 128 + 64;
		local24 = Static124.method1919(Static159.anInt2978, local9, local15) - Static93.anInt1772;
		@Pc(233) int local233 = local24 - Static185.anInt3457;
		@Pc(238) int local238 = local15 - Static68.anInt4743;
		@Pc(243) int local243 = local9 - Static182.anInt3398;
		@Pc(255) int local255 = (int) Math.sqrt((double) (local243 * local243 + local238 * local238));
		@Pc(266) int local266 = (int) (Math.atan2((double) local233, (double) local255) * 325.949D) & 0x7FF;
		if (local266 < 128) {
			local266 = 128;
		}
		if (local266 > 383) {
			local266 = 383;
		}
		@Pc(293) int local293 = (int) (Math.atan2((double) local243, (double) local238) * -325.949D) & 0x7FF;
		if (Static77.anInt1548 < local266) {
			Static77.anInt1548 += (local266 - Static77.anInt1548) * Static174.anInt3201 / 1000 + Static156.anInt1710;
			if (local266 < Static77.anInt1548) {
				Static77.anInt1548 = local266;
			}
		}
		@Pc(324) int local324 = local293 - Static56.anInt1177;
		if (Static77.anInt1548 > local266) {
			Static77.anInt1548 -= Static156.anInt1710 + (Static77.anInt1548 - local266) * Static174.anInt3201 / 1000;
			if (local266 > Static77.anInt1548) {
				Static77.anInt1548 = local266;
			}
		}
		if (local324 > 1024) {
			local324 -= 2048;
		}
		if (local324 < -1024) {
			local324 += 2048;
		}
		if (local324 > 0) {
			Static56.anInt1177 += Static156.anInt1710 + Static174.anInt3201 * local324 / 1000;
			Static56.anInt1177 &= 0x7FF;
		}
		if (local324 < 0) {
			Static56.anInt1177 -= -local324 * Static174.anInt3201 / 1000 + Static156.anInt1710;
			Static56.anInt1177 &= 0x7FF;
		}
		@Pc(401) int local401 = local293 - Static56.anInt1177;
		if (local401 > 1024) {
			local401 -= 2048;
		}
		if (local401 < -1024) {
			local401 += 2048;
		}
		if (local401 < 0 && local324 > 0 || local401 > 0 && local324 < 0) {
			Static56.anInt1177 = local293;
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(Z)V")
	public static void method965() {
		if (Static282.aBoolean447) {
			return;
		}
		if (Static290.aBoolean436) {
			Static177.aFloat97 = (int) Static177.aFloat97 + 191 & 0xFFFFFF80;
		} else {
			Static149.aFloat80 += (24.0F - Static149.aFloat80) / 2.0F;
		}
		Static45.aBoolean87 = true;
		Static282.aBoolean447 = true;
	}
}
