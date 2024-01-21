import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ad", name = "ab", descriptor = "I")
	public static int anInt150;

	@OriginalMember(owner = "client!ad", name = "R", descriptor = "[J")
	public static long[] aLongArray1 = new long[100];

	@OriginalMember(owner = "client!ad", name = "cb", descriptor = "Lclient!dd;")
	private static Class13 aClass13_51 = Static161.method2971("Sun");

	@OriginalMember(owner = "client!ad", name = "V", descriptor = "Lclient!dd;")
	private static Class13 aClass13_48 = Static161.method2971("Mon");

	@OriginalMember(owner = "client!ad", name = "fb", descriptor = "Lclient!dd;")
	private static Class13 aClass13_54 = Static161.method2971("Tue");

	@OriginalMember(owner = "client!ad", name = "hb", descriptor = "Lclient!dd;")
	private static Class13 aClass13_55 = Static161.method2971("Wed");

	@OriginalMember(owner = "client!ad", name = "db", descriptor = "Lclient!dd;")
	private static Class13 aClass13_52 = Static161.method2971("Thu");

	@OriginalMember(owner = "client!ad", name = "eb", descriptor = "Lclient!dd;")
	private static Class13 aClass13_53 = Static161.method2971("Fri");

	@OriginalMember(owner = "client!ad", name = "X", descriptor = "Lclient!dd;")
	private static Class13 aClass13_50 = Static161.method2971("Sat");

	@OriginalMember(owner = "client!ad", name = "S", descriptor = "[Lclient!dd;")
	public static Class13[] aClass13Array1 = new Class13[] { aClass13_51, aClass13_48, aClass13_54, aClass13_55, aClass13_52, aClass13_53, aClass13_50 };

	@OriginalMember(owner = "client!ad", name = "T", descriptor = "I")
	public static int anInt147 = 0;

	@OriginalMember(owner = "client!ad", name = "U", descriptor = "Lclient!dd;")
	private static Class13 aClass13_47 = Static161.method2971("Members object");

	@OriginalMember(owner = "client!ad", name = "W", descriptor = "Lclient!dd;")
	public static Class13 aClass13_49 = aClass13_47;

	@OriginalMember(owner = "client!ad", name = "e", descriptor = "(B)V")
	public static void method102() {
		@Pc(9) int local9 = Static148.anInt3600 * 128 + 64;
		@Pc(15) int local15 = Static39.anInt1240 * 128 + 64;
		@Pc(23) int local23 = Static66.method1449(Static156.anInt3696, local9, local15) - Static115.anInt3075;
		if (local15 > Static22.anInt2236) {
			Static22.anInt2236 += Static90.anInt2621 * (local15 - Static22.anInt2236) / 1000 + Static98.anInt3738;
			if (local15 < Static22.anInt2236) {
				Static22.anInt2236 = local15;
			}
		}
		if (local23 > Static45.anInt1493) {
			Static45.anInt1493 += Static90.anInt2621 * (local23 - Static45.anInt1493) / 1000 + Static98.anInt3738;
			if (local23 < Static45.anInt1493) {
				Static45.anInt1493 = local23;
			}
		}
		if (Static7.anInt3157 < local9) {
			Static7.anInt3157 += Static98.anInt3738 + Static90.anInt2621 * (local9 - Static7.anInt3157) / 1000;
			if (local9 < Static7.anInt3157) {
				Static7.anInt3157 = local9;
			}
		}
		if (Static22.anInt2236 > local15) {
			Static22.anInt2236 -= Static98.anInt3738 + Static90.anInt2621 * (Static22.anInt2236 - local15) / 1000;
			if (local15 > Static22.anInt2236) {
				Static22.anInt2236 = local15;
			}
		}
		if (Static7.anInt3157 > local9) {
			Static7.anInt3157 -= Static98.anInt3738 + Static90.anInt2621 * (Static7.anInt3157 - local9) / 1000;
			if (local9 > Static7.anInt3157) {
				Static7.anInt3157 = local9;
			}
		}
		if (Static45.anInt1493 > local23) {
			Static45.anInt1493 -= Static98.anInt3738 + (Static45.anInt1493 - local23) * Static90.anInt2621 / 1000;
			if (local23 > Static45.anInt1493) {
				Static45.anInt1493 = local23;
			}
		}
		local15 = Static89.anInt2505 * 128 + 64;
		local9 = Static154.anInt3652 * 128 + 64;
		local23 = Static66.method1449(Static156.anInt3696, local9, local15) - Static163.anInt3847;
		@Pc(211) int local211 = local9 - Static7.anInt3157;
		@Pc(216) int local216 = local15 - Static22.anInt2236;
		@Pc(221) int local221 = local23 - Static45.anInt1493;
		@Pc(233) int local233 = (int) Math.sqrt((double) (local216 * local216 + local211 * local211));
		@Pc(244) int local244 = (int) (Math.atan2((double) local221, (double) local233) * 325.949D) & 0x7FF;
		@Pc(255) int local255 = (int) (-325.949D * Math.atan2((double) local216, (double) local211)) & 0x7FF;
		if (local244 < 128) {
			local244 = 128;
		}
		if (local244 > 383) {
			local244 = 383;
		}
		if (local244 > Static104.anInt2874) {
			Static104.anInt2874 += (local244 - Static104.anInt2874) * Static18.anInt740 / 1000 + Static84.anInt2396;
			if (Static104.anInt2874 > local244) {
				Static104.anInt2874 = local244;
			}
		}
		if (Static104.anInt2874 > local244) {
			Static104.anInt2874 -= Static84.anInt2396 + (Static104.anInt2874 - local244) * Static18.anInt740 / 1000;
			if (local244 > Static104.anInt2874) {
				Static104.anInt2874 = local244;
			}
		}
		@Pc(325) int local325 = local255 - Static49.anInt1557;
		if (local325 > 1024) {
			local325 -= 2048;
		}
		if (local325 < -1024) {
			local325 += 2048;
		}
		if (local325 > 0) {
			Static49.anInt1557 += Static84.anInt2396 + local325 * Static18.anInt740 / 1000;
			Static49.anInt1557 &= 0x7FF;
		}
		if (local325 < 0) {
			Static49.anInt1557 -= Static84.anInt2396 + Static18.anInt740 * -local325 / 1000;
			Static49.anInt1557 &= 0x7FF;
		}
		@Pc(381) int local381 = local255 - Static49.anInt1557;
		if (local381 > 1024) {
			local381 -= 2048;
		}
		if (local381 < -1024) {
			local381 += 2048;
		}
		if (local381 < 0 && local325 > 0 || local381 > 0 && local325 < 0) {
			Static49.anInt1557 = local255;
		}
	}

	@OriginalMember(owner = "client!ad", name = "e", descriptor = "(I)V")
	public static void method103() {
		aClass13_47 = null;
		aClass13_55 = null;
		aClass13_53 = null;
		aClass13Array1 = null;
		aClass13_52 = null;
		aClass13_48 = null;
		aClass13_49 = null;
		aClass13_50 = null;
		aLongArray1 = null;
		aClass13_54 = null;
		aClass13_51 = null;
	}
}
