import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!ea", name = "p", descriptor = "[Lclient!ho;")
	public static Class3_Sub4_Sub12[] aClass3_Sub4_Sub12Array2;

	@OriginalMember(owner = "client!ea", name = "x", descriptor = "Lclient!wm;")
	public static Class3_Sub4_Sub24 aClass3_Sub4_Sub24_2;

	@OriginalMember(owner = "client!ea", name = "P", descriptor = "Z")
	private static boolean aBoolean65;

	@OriginalMember(owner = "client!ea", name = "Q", descriptor = "Z")
	private static boolean aBoolean66;

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "I")
	public static int anInt723 = 0;

	@OriginalMember(owner = "client!ea", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString27 = "Prepared sound engine";

	@OriginalMember(owner = "client!ea", name = "J", descriptor = "Ljava/lang/String;")
	public static String aString28 = " from your ignore list first.";

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IB)I")
	public static int method593(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZI)Z")
	public static boolean method598(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		@Pc(16) int local16 = Static259.aShortArray87[arg0];
		if (local16 >= 2000) {
			local16 -= 2000;
		}
		return local16 == 1007;
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(B)V")
	public static void method609() {
		@Pc(9) int local9 = Static135.anInt2608 * 128 + 64;
		@Pc(15) int local15 = Static20.anInt370 * 128 + 64;
		@Pc(24) int local24 = Static122.method2036(local9, local15, Static99.anInt1826) - Static210.anInt4127;
		if (Static125.anInt2417 >= 100) {
			Static230.anInt4492 = Static20.anInt370 * 128 + 64;
			Static173.anInt3251 = Static135.anInt2608 * 128 + 64;
			Static224.anInt6075 = Static122.method2036(Static173.anInt3251, Static230.anInt4492, Static99.anInt1826) - Static210.anInt4127;
		} else {
			if (Static224.anInt6075 < local24) {
				Static224.anInt6075 += (local24 - Static224.anInt6075) * Static125.anInt2417 / 1000 + Static179.anInt3343;
				if (Static224.anInt6075 > local24) {
					Static224.anInt6075 = local24;
				}
			}
			if (local15 > Static230.anInt4492) {
				Static230.anInt4492 += (local15 - Static230.anInt4492) * Static125.anInt2417 / 1000 + Static179.anInt3343;
				if (local15 < Static230.anInt4492) {
					Static230.anInt4492 = local15;
				}
			}
			if (local9 > Static173.anInt3251) {
				Static173.anInt3251 += Static179.anInt3343 + (local9 - Static173.anInt3251) * Static125.anInt2417 / 1000;
				if (Static173.anInt3251 > local9) {
					Static173.anInt3251 = local9;
				}
			}
			if (local9 < Static173.anInt3251) {
				Static173.anInt3251 -= Static125.anInt2417 * (Static173.anInt3251 - local9) / 1000 + Static179.anInt3343;
				if (Static173.anInt3251 < local9) {
					Static173.anInt3251 = local9;
				}
			}
			if (local24 < Static224.anInt6075) {
				Static224.anInt6075 -= (Static224.anInt6075 - local24) * Static125.anInt2417 / 1000 + Static179.anInt3343;
				if (local24 > Static224.anInt6075) {
					Static224.anInt6075 = local24;
				}
			}
			if (Static230.anInt4492 > local15) {
				Static230.anInt4492 -= (Static230.anInt4492 - local15) * Static125.anInt2417 / 1000 + Static179.anInt3343;
				if (local15 > Static230.anInt4492) {
					Static230.anInt4492 = local15;
				}
			}
		}
		local15 = Static107.anInt1966 * 128 + 64;
		local9 = Static190.anInt3752 * 128 + 64;
		local24 = Static122.method2036(local9, local15, Static99.anInt1826) - Static305.anInt6003;
		@Pc(235) int local235 = local15 - Static230.anInt4492;
		@Pc(240) int local240 = local9 - Static173.anInt3251;
		@Pc(245) int local245 = local24 - Static224.anInt6075;
		@Pc(256) int local256 = (int) Math.sqrt((double) (local240 * local240 + local235 * local235));
		@Pc(267) int local267 = (int) (Math.atan2((double) local245, (double) local256) * 325.949D) & 0x7FF;
		@Pc(278) int local278 = (int) (Math.atan2((double) local235, (double) local240) * -325.949D) & 0x7FF;
		@Pc(283) int local283 = local278 - Static113.anInt2103;
		if (local283 > 1024) {
			local283 -= 2048;
		}
		if (local267 < 128) {
			local267 = 128;
		}
		if (local267 > 383) {
			local267 = 383;
		}
		if (local283 < -1024) {
			local283 += 2048;
		}
		if (Static79.anInt1912 < local267) {
			Static79.anInt1912 += (local267 - Static79.anInt1912) * Static31.anInt571 / 1000 + Static6.anInt138;
			if (Static79.anInt1912 > local267) {
				Static79.anInt1912 = local267;
			}
		}
		if (Static79.anInt1912 > local267) {
			Static79.anInt1912 -= Static31.anInt571 * (Static79.anInt1912 - local267) / 1000 + Static6.anInt138;
			if (local267 > Static79.anInt1912) {
				Static79.anInt1912 = local267;
			}
		}
		if (local283 > 0) {
			Static113.anInt2103 += Static6.anInt138 + local283 * Static31.anInt571 / 1000;
			Static113.anInt2103 &= 0x7FF;
		}
		if (local283 < 0) {
			Static113.anInt2103 -= Static31.anInt571 * -local283 / 1000 + Static6.anInt138;
			Static113.anInt2103 &= 0x7FF;
		}
		@Pc(408) int local408 = local278 - Static113.anInt2103;
		if (local408 > 1024) {
			local408 -= 2048;
		}
		if (local408 < -1024) {
			local408 += 2048;
		}
		if (local408 < 0 && local283 > 0 || local408 > 0 && local283 < 0) {
			Static113.anInt2103 = local278;
		}
	}
}
