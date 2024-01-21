import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!kf", name = "H", descriptor = "Lclient!cc;")
	public static Class6 aClass6_1;

	@OriginalMember(owner = "client!kf", name = "K", descriptor = "I")
	public static int anInt1479;

	@OriginalMember(owner = "client!kf", name = "t", descriptor = "[Lclient!re;")
	public static Class56_Sub1[] aClass56_Sub1Array1 = new Class56_Sub1[256];

	@OriginalMember(owner = "client!kf", name = "v", descriptor = "I")
	public static int anInt1470 = 0;

	@OriginalMember(owner = "client!kf", name = "x", descriptor = "I")
	public static int anInt1471 = 0;

	@OriginalMember(owner = "client!kf", name = "z", descriptor = "Lclient!pe;")
	public static Class65 aClass65_644 = Static119.method1462(": ");

	@OriginalMember(owner = "client!kf", name = "F", descriptor = "Z")
	public static boolean aBoolean52 = false;

	@OriginalMember(owner = "client!kf", name = "I", descriptor = "Lclient!pe;")
	public static Class65 aClass65_645 = Static119.method1462("Okay");

	@OriginalMember(owner = "client!kf", name = "O", descriptor = "Lclient!pe;")
	private static Class65 aClass65_647 = Static119.method1462("New User");

	@OriginalMember(owner = "client!kf", name = "M", descriptor = "Lclient!pe;")
	public static Class65 aClass65_646 = aClass65_647;

	@OriginalMember(owner = "client!kf", name = "R", descriptor = "I")
	public static int anInt1484 = 2;

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(B)V")
	public static void method1094() {
		for (@Pc(18) Class2_Sub18 local18 = (Class2_Sub18) Static23.aClass13_12.method270(); local18 != null; local18 = (Class2_Sub18) Static23.aClass13_12.method273()) {
			if (local18.anInt2487 > 0) {
				local18.anInt2487--;
			}
			if (local18.anInt2487 != 0) {
				if (local18.anInt2495 > 0) {
					local18.anInt2495--;
				}
				if (local18.anInt2495 == 0 && local18.anInt2499 >= 1 && local18.anInt2501 >= 1 && local18.anInt2499 <= 102 && local18.anInt2501 <= 102 && (local18.anInt2500 < 0 || Static54.method957(local18.anInt2488, local18.anInt2500))) {
					Static33.method627(local18.anInt2501, local18.anInt2498, local18.anInt2499, local18.anInt2500, local18.anInt2496, local18.anInt2488, local18.anInt2503);
					local18.anInt2495 = -1;
					if (local18.anInt2500 == local18.anInt2494 && local18.anInt2494 == -1) {
						local18.method2053();
					} else if (local18.anInt2500 == local18.anInt2494 && local18.anInt2498 == local18.anInt2493 && local18.anInt2488 == local18.anInt2497) {
						local18.method2053();
					}
				}
			} else if (local18.anInt2494 < 0 || Static54.method957(local18.anInt2497, local18.anInt2494)) {
				Static33.method627(local18.anInt2501, local18.anInt2493, local18.anInt2499, local18.anInt2494, local18.anInt2496, local18.anInt2497, local18.anInt2503);
				local18.method2053();
			}
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
	public static void method1095() {
		aClass65_647 = null;
		aClass56_Sub1Array1 = null;
		aClass65_646 = null;
		aClass65_644 = null;
		aClass6_1 = null;
		aClass65_645 = null;
	}

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "(B)V")
	public static void method1096() {
		@Pc(5) int local5 = Static94.anInt2138 * 128 + 64;
		@Pc(15) int local15 = Static30.anInt748 * 128 + 64;
		@Pc(23) int local23 = Static106.method1718(local15, local5, anInt1479) - Static3.anInt106;
		if (local5 > Static69.anInt1610) {
			Static69.anInt1610 += (local5 - Static69.anInt1610) * Static68.anInt2860 / 1000 + Static1.anInt10;
			if (local5 < Static69.anInt1610) {
				Static69.anInt1610 = local5;
			}
		}
		if (local15 > Static130.anInt2838) {
			Static130.anInt2838 += Static1.anInt10 + (local15 - Static130.anInt2838) * Static68.anInt2860 / 1000;
			if (local15 < Static130.anInt2838) {
				Static130.anInt2838 = local15;
			}
		}
		if (Static130.anInt2838 > local15) {
			Static130.anInt2838 -= Static68.anInt2860 * (Static130.anInt2838 - local15) / 1000 + Static1.anInt10;
			if (local15 > Static130.anInt2838) {
				Static130.anInt2838 = local15;
			}
		}
		if (Static84.anInt1818 < local23) {
			Static84.anInt1818 += Static1.anInt10 + (local23 - Static84.anInt1818) * Static68.anInt2860 / 1000;
			if (local23 < Static84.anInt1818) {
				Static84.anInt1818 = local23;
			}
		}
		local15 = Static94.anInt2121 * 128 + 64;
		if (local5 < Static69.anInt1610) {
			Static69.anInt1610 -= Static1.anInt10 + (Static69.anInt1610 - local5) * Static68.anInt2860 / 1000;
			if (local5 > Static69.anInt1610) {
				Static69.anInt1610 = local5;
			}
		}
		local5 = Static42.anInt1051 * 128 + 64;
		if (local23 < Static84.anInt1818) {
			Static84.anInt1818 -= (Static84.anInt1818 - local23) * Static68.anInt2860 / 1000 + Static1.anInt10;
			if (local23 > Static84.anInt1818) {
				Static84.anInt1818 = local23;
			}
		}
		local23 = Static106.method1718(local15, local5, anInt1479) - Static78.anInt1728;
		@Pc(193) int local193 = local5 - Static69.anInt1610;
		@Pc(206) int local206 = local23 - Static84.anInt1818;
		@Pc(210) int local210 = local15 - Static130.anInt2838;
		@Pc(221) int local221 = (int) Math.sqrt((double) (local210 * local210 + local193 * local193));
		@Pc(232) int local232 = (int) (Math.atan2((double) local206, (double) local221) * 325.949D) & 0x7FF;
		@Pc(243) int local243 = (int) (Math.atan2((double) local193, (double) local210) * -325.949D) & 0x7FF;
		@Pc(247) int local247 = local243 - Static45.anInt1096;
		if (local247 > 1024) {
			local247 -= 2048;
		}
		if (local247 < -1024) {
			local247 += 2048;
		}
		if (local232 < 128) {
			local232 = 128;
		}
		if (local232 > 383) {
			local232 = 383;
		}
		if (local232 > Static97.anInt2216) {
			Static97.anInt2216 += Static42.anInt1049 + (local232 - Static97.anInt2216) * Static2.anInt90 / 1000;
			if (Static97.anInt2216 > local232) {
				Static97.anInt2216 = local232;
			}
		}
		if (local247 > 0) {
			Static45.anInt1096 += Static42.anInt1049 + local247 * Static2.anInt90 / 1000;
			Static45.anInt1096 &= 0x7FF;
		}
		if (local247 < 0) {
			Static45.anInt1096 -= Static42.anInt1049 + Static2.anInt90 * -local247 / 1000;
			Static45.anInt1096 &= 0x7FF;
		}
		if (Static97.anInt2216 > local232) {
			Static97.anInt2216 -= Static2.anInt90 * (Static97.anInt2216 - local232) / 1000 + Static42.anInt1049;
			if (Static97.anInt2216 < local232) {
				Static97.anInt2216 = local232;
			}
		}
		@Pc(357) int local357 = local243 - Static45.anInt1096;
		if (local357 > 1024) {
			local357 -= 2048;
		}
		if (local357 < -1024) {
			local357 += 2048;
		}
		if (local357 < 0 && local247 > 0 || local357 > 0 && local247 < 0) {
			Static45.anInt1096 = local243;
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILclient!pe;)V")
	public static void method1097(@OriginalArg(1) Class65 arg0) {
		if (Static73.aClass2_Sub16Array1 == null) {
			return;
		}
		@Pc(10) int local10;
		for (local10 = 0; Static73.aClass2_Sub16Array1.length > local10 && !arg0.method1488(Static73.aClass2_Sub16Array1[local10].aClass65_1018); local10++) {
		}
		if (local10 < Static73.aClass2_Sub16Array1.length && Static73.aClass2_Sub16Array1[local10] != null) {
			Static49.aClass2_Sub4_Sub1_1.method962(107);
			Static49.aClass2_Sub4_Sub1_1.method948(Static73.aClass2_Sub16Array1[local10].aLong100);
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILclient!pe;ILclient!pe;)V")
	public static void method1098(@OriginalArg(0) int arg0, @OriginalArg(1) Class65 arg1, @OriginalArg(3) Class65 arg2) {
		Static82.method1936(arg0, null, arg2, arg1);
	}
}
