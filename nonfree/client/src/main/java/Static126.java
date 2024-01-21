import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!pb", name = "o", descriptor = "I")
	public static int anInt2769;

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
	public static int anInt2762 = 0;

	@OriginalMember(owner = "client!pb", name = "e", descriptor = "Lclient!tg;")
	public static Class81 aClass81_997 = Static120.method2057("");

	@OriginalMember(owner = "client!pb", name = "h", descriptor = "I")
	public static int anInt2764 = 0;

	@OriginalMember(owner = "client!pb", name = "i", descriptor = "[J")
	public static long[] aLongArray7 = new long[100];

	@OriginalMember(owner = "client!pb", name = "p", descriptor = "Lclient!tg;")
	public static Class81 aClass81_998 = Static120.method2057("Einloggen");

	@OriginalMember(owner = "client!pb", name = "q", descriptor = "I")
	public static int anInt2770 = 1;

	@OriginalMember(owner = "client!pb", name = "r", descriptor = "Lclient!tg;")
	public static Class81 aClass81_999 = Static120.method2057("Konfig geladen)3");

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V")
	public static void method2163() {
		aClass81_998 = null;
		aClass81_999 = null;
		aCRC32_2 = null;
		aLongArray7 = null;
		aClass81_997 = null;
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(I)V")
	public static void method2165() {
		@Pc(9) int local9 = Static85.anInt416 * 128 + 64;
		@Pc(15) int local15 = Static103.anInt2265 * 128 + 64;
		@Pc(24) int local24 = Static102.method1694(local9, Static44.anInt1086, local15) - Static70.anInt1715;
		if (Static69.anInt1702 < local15) {
			Static69.anInt1702 += Static183.anInt4107 * (local15 - Static69.anInt1702) / 1000 + Static41.anInt1063;
			if (local15 < Static69.anInt1702) {
				Static69.anInt1702 = local15;
			}
		}
		if (local24 > anInt2769) {
			anInt2769 += Static183.anInt4107 * (local24 - anInt2769) / 1000 + Static41.anInt1063;
			if (anInt2769 > local24) {
				anInt2769 = local24;
			}
		}
		if (anInt2769 > local24) {
			anInt2769 -= Static41.anInt1063 + (anInt2769 - local24) * Static183.anInt4107 / 1000;
			if (anInt2769 < local24) {
				anInt2769 = local24;
			}
		}
		if (local9 > Static53.anInt1289) {
			Static53.anInt1289 += Static41.anInt1063 + Static183.anInt4107 * (local9 - Static53.anInt1289) / 1000;
			if (Static53.anInt1289 > local9) {
				Static53.anInt1289 = local9;
			}
		}
		if (local9 < Static53.anInt1289) {
			Static53.anInt1289 -= (Static53.anInt1289 - local9) * Static183.anInt4107 / 1000 + Static41.anInt1063;
			if (local9 > Static53.anInt1289) {
				Static53.anInt1289 = local9;
			}
		}
		local9 = Static23.anInt588 * 128 + 64;
		if (local15 < Static69.anInt1702) {
			Static69.anInt1702 -= Static41.anInt1063 + (Static69.anInt1702 - local15) * Static183.anInt4107 / 1000;
			if (local15 > Static69.anInt1702) {
				Static69.anInt1702 = local15;
			}
		}
		local15 = Static59.anInt1396 * 128 + 64;
		local24 = Static102.method1694(local9, Static44.anInt1086, local15) - Static122.anInt2744;
		@Pc(207) int local207 = local24 - anInt2769;
		@Pc(212) int local212 = local15 - Static69.anInt1702;
		@Pc(216) int local216 = local9 - Static53.anInt1289;
		@Pc(227) int local227 = (int) Math.sqrt((double) (local216 * local216 + local212 * local212));
		@Pc(238) int local238 = (int) (Math.atan2((double) local207, (double) local227) * 325.949D) & 0x7FF;
		@Pc(249) int local249 = (int) (Math.atan2((double) local216, (double) local212) * -325.949D) & 0x7FF;
		if (local238 < 128) {
			local238 = 128;
		}
		@Pc(260) int local260 = local249 - Static31.anInt838;
		if (local238 > 383) {
			local238 = 383;
		}
		if (local238 > Static106.anInt2331) {
			Static106.anInt2331 += Static72.anInt1735 + (local238 - Static106.anInt2331) * Static109.anInt2437 / 1000;
			if (local238 < Static106.anInt2331) {
				Static106.anInt2331 = local238;
			}
		}
		if (local238 < Static106.anInt2331) {
			Static106.anInt2331 -= (Static106.anInt2331 - local238) * Static109.anInt2437 / 1000 + Static72.anInt1735;
			if (local238 > Static106.anInt2331) {
				Static106.anInt2331 = local238;
			}
		}
		if (local260 > 1024) {
			local260 -= 2048;
		}
		if (local260 < -1024) {
			local260 += 2048;
		}
		if (local260 > 0) {
			Static31.anInt838 += Static72.anInt1735 + Static109.anInt2437 * local260 / 1000;
			Static31.anInt838 &= 0x7FF;
		}
		if (local260 < 0) {
			Static31.anInt838 -= -local260 * Static109.anInt2437 / 1000 + Static72.anInt1735;
			Static31.anInt838 &= 0x7FF;
		}
		@Pc(357) int local357 = local249 - Static31.anInt838;
		if (local357 > 1024) {
			local357 -= 2048;
		}
		if (local357 < -1024) {
			local357 += 2048;
		}
		if (local357 < 0 && local260 > 0 || local357 > 0 && local260 < 0) {
			Static31.anInt838 = local249;
		}
	}
}
