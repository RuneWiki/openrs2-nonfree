import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!tb", name = "l", descriptor = "Lclient!dd;")
	public static Class16 aClass16_28;

	@OriginalMember(owner = "client!tb", name = "p", descriptor = "I")
	public static int anInt4190;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "Lclient!ea;")
	private static Class18 aClass18_1071 = Static8.method128("Loading fonts )2 ");

	@OriginalMember(owner = "client!tb", name = "g", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1072 = Static8.method128(")4l");

	@OriginalMember(owner = "client!tb", name = "h", descriptor = "Lclient!ea;")
	private static Class18 aClass18_1073 = Static8.method128("flash3:");

	@OriginalMember(owner = "client!tb", name = "i", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1074 = aClass18_1073;

	@OriginalMember(owner = "client!tb", name = "k", descriptor = "I")
	public static int anInt4188 = 0;

	@OriginalMember(owner = "client!tb", name = "n", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1075 = aClass18_1071;

	@OriginalMember(owner = "client!tb", name = "o", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1076 = aClass18_1073;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Z)V")
	public static void method2855() {
		aClass18_1071 = null;
		aClass18_1075 = null;
		aClass18_1072 = null;
		aClass16_28 = null;
		aClass18_1074 = null;
		aClass18_1073 = null;
		aClass18_1076 = null;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V")
	public static void method2857() {
		@Pc(9) int local9 = Static46.anInt4756 * 128 + 64;
		@Pc(15) int local15 = Static92.anInt2792 * 128 + 64;
		@Pc(23) int local23 = Static34.method728(Static9.anInt295, local15, local9) - Static76.anInt2360;
		if (Static45.anInt1552 < local9) {
			Static45.anInt1552 += (local9 - Static45.anInt1552) * Static155.anInt4269 / 1000 + Static43.anInt1452;
			if (local9 < Static45.anInt1552) {
				Static45.anInt1552 = local9;
			}
		}
		if (local23 > Static178.anInt4735) {
			Static178.anInt4735 += (local23 - Static178.anInt4735) * Static155.anInt4269 / 1000 + Static43.anInt1452;
			if (local23 < Static178.anInt4735) {
				Static178.anInt4735 = local23;
			}
		}
		if (local15 > Static38.anInt1189) {
			Static38.anInt1189 += (local15 - Static38.anInt1189) * Static155.anInt4269 / 1000 + Static43.anInt1452;
			if (local15 < Static38.anInt1189) {
				Static38.anInt1189 = local15;
			}
		}
		if (Static38.anInt1189 > local15) {
			Static38.anInt1189 -= Static155.anInt4269 * (Static38.anInt1189 - local15) / 1000 + Static43.anInt1452;
			if (local15 > Static38.anInt1189) {
				Static38.anInt1189 = local15;
			}
		}
		if (Static45.anInt1552 > local9) {
			Static45.anInt1552 -= Static43.anInt1452 + Static155.anInt4269 * (Static45.anInt1552 - local9) / 1000;
			if (Static45.anInt1552 < local9) {
				Static45.anInt1552 = local9;
			}
		}
		local15 = Static81.anInt2487 * 128 + 64;
		if (Static178.anInt4735 > local23) {
			Static178.anInt4735 -= Static43.anInt1452 + (Static178.anInt4735 - local23) * Static155.anInt4269 / 1000;
			if (local23 > Static178.anInt4735) {
				Static178.anInt4735 = local23;
			}
		}
		local9 = Static76.anInt2352 * 128 + 64;
		local23 = Static34.method728(Static9.anInt295, local15, local9) - Static121.anInt3419;
		@Pc(198) int local198 = local9 - Static45.anInt1552;
		@Pc(202) int local202 = local15 - Static38.anInt1189;
		@Pc(207) int local207 = local23 - Static178.anInt4735;
		@Pc(218) int local218 = (int) Math.sqrt((double) (local198 * local198 + local202 * local202));
		@Pc(229) int local229 = (int) (Math.atan2((double) local207, (double) local218) * 325.949D) & 0x7FF;
		@Pc(240) int local240 = (int) (-325.949D * Math.atan2((double) local198, (double) local202)) & 0x7FF;
		@Pc(245) int local245 = local240 - Static106.anInt3132;
		if (local229 < 128) {
			local229 = 128;
		}
		if (local229 > 383) {
			local229 = 383;
		}
		if (Static125.anInt3614 < local229) {
			Static125.anInt3614 += Static16.anInt441 * (local229 - Static125.anInt3614) / 1000 + Static28.anInt3201;
			if (Static125.anInt3614 > local229) {
				Static125.anInt3614 = local229;
			}
		}
		if (local245 > 1024) {
			local245 -= 2048;
		}
		if (local245 < -1024) {
			local245 += 2048;
		}
		if (Static125.anInt3614 > local229) {
			Static125.anInt3614 -= Static28.anInt3201 + (Static125.anInt3614 - local229) * Static16.anInt441 / 1000;
			if (Static125.anInt3614 < local229) {
				Static125.anInt3614 = local229;
			}
		}
		if (local245 > 0) {
			Static106.anInt3132 += Static28.anInt3201 + local245 * Static16.anInt441 / 1000;
			Static106.anInt3132 &= 0x7FF;
		}
		if (local245 < 0) {
			Static106.anInt3132 -= -local245 * Static16.anInt441 / 1000 + Static28.anInt3201;
			Static106.anInt3132 &= 0x7FF;
		}
		@Pc(357) int local357 = local240 - Static106.anInt3132;
		if (local357 > 1024) {
			local357 -= 2048;
		}
		if (local357 < -1024) {
			local357 += 2048;
		}
		if (local357 < 0 && local245 > 0 || local357 > 0 && local245 < 0) {
			Static106.anInt3132 = local240;
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!ef;I)V")
	public static void method2858(@OriginalArg(0) Class20 arg0) {
		if (arg0.anInt1206 == Static25.anInt870) {
			Static88.aBooleanArray8[arg0.anInt1266] = true;
		}
	}
}
