import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!vc", name = "fb", descriptor = "Lclient!ud;")
	public static Class62_Sub1 aClass62_Sub1_98;

	@OriginalMember(owner = "client!vc", name = "S", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_1443 = Static177.method3050("Prepared sound engine");

	@OriginalMember(owner = "client!vc", name = "T", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_1444 = Static177.method3050("Loaded sprites");

	@OriginalMember(owner = "client!vc", name = "W", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1445 = Static177.method3050("zur-Uck auf die RuneScape)2Webseite gehen");

	@OriginalMember(owner = "client!vc", name = "Y", descriptor = "I")
	public static int anInt3960 = 0;

	@OriginalMember(owner = "client!vc", name = "ab", descriptor = "[Z")
	public static final boolean[] aBooleanArray19 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

	@OriginalMember(owner = "client!vc", name = "bb", descriptor = "Lclient!jd;")
	public static Class46 aClass46_1446 = aClass46_1444;

	@OriginalMember(owner = "client!vc", name = "eb", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1447 = Static177.method3050("M");

	@OriginalMember(owner = "client!vc", name = "gb", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_1448 = Static177.method3050("Existing User");

	@OriginalMember(owner = "client!vc", name = "jb", descriptor = "Lclient!jd;")
	public static Class46 aClass46_1449 = aClass46_1443;

	@OriginalMember(owner = "client!vc", name = "lb", descriptor = "[I")
	public static int[] anIntArray426 = new int[] { 0, 1, 2, 3 };

	@OriginalMember(owner = "client!vc", name = "ob", descriptor = "Lclient!jd;")
	public static Class46 aClass46_1450 = aClass46_1448;

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIII)I")
	public static int method3044(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 > 243) {
			arg0 >>= 0x4;
		} else if (arg2 > 217) {
			arg0 >>= 0x3;
		} else if (arg2 > 192) {
			arg0 >>= 0x2;
		} else if (arg2 > 179) {
			arg0 >>= 0x1;
		}
		return (arg2 >> 1) + ((arg1 >> 2 << 10) + (arg0 >> 5 << 7));
	}

	@OriginalMember(owner = "client!vc", name = "h", descriptor = "(B)V")
	public static void method3045() {
		Static77.aClass66_29.method2218();
	}

	@OriginalMember(owner = "client!vc", name = "g", descriptor = "(I)V")
	public static void method3046() {
		Static162.aClass4_Sub11_Sub1_3.method1287();
		@Pc(13) int local13 = Static162.aClass4_Sub11_Sub1_3.method1288(1);
		if (local13 == 0) {
			return;
		}
		@Pc(21) int local21 = Static162.aClass4_Sub11_Sub1_3.method1288(2);
		if (local21 == 0) {
			Static121.anIntArray276[Static182.anInt4082++] = 2047;
			return;
		}
		@Pc(45) int local45;
		@Pc(55) int local55;
		if (local21 == 1) {
			local45 = Static162.aClass4_Sub11_Sub1_3.method1288(3);
			Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.method2119(local45, false);
			local55 = Static162.aClass4_Sub11_Sub1_3.method1288(1);
			if (local55 == 1) {
				Static121.anIntArray276[Static182.anInt4082++] = 2047;
			}
			return;
		}
		@Pc(97) int local97;
		if (local21 == 2) {
			local45 = Static162.aClass4_Sub11_Sub1_3.method1288(3);
			Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.method2119(local45, true);
			local55 = Static162.aClass4_Sub11_Sub1_3.method1288(3);
			Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.method2119(local55, true);
			local97 = Static162.aClass4_Sub11_Sub1_3.method1288(1);
			if (local97 == 1) {
				Static121.anIntArray276[Static182.anInt4082++] = 2047;
			}
		} else if (local21 == 3) {
			local45 = Static162.aClass4_Sub11_Sub1_3.method1288(1);
			if (local45 == 1) {
				Static121.anIntArray276[Static182.anInt4082++] = 2047;
			}
			local55 = Static162.aClass4_Sub11_Sub1_3.method1288(7);
			local97 = Static162.aClass4_Sub11_Sub1_3.method1288(7);
			@Pc(147) int local147 = Static162.aClass4_Sub11_Sub1_3.method1288(1);
			Static73.anInt1873 = Static162.aClass4_Sub11_Sub1_3.method1288(2);
			Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.method2116(local97, local147 == 1, local55);
		}
	}

	@OriginalMember(owner = "client!vc", name = "h", descriptor = "(I)V")
	public static void method3047() {
		@Pc(9) int local9 = Static143.anInt3336 * 128 + 64;
		@Pc(15) int local15 = Static111.anInt2723 * 128 + 64;
		@Pc(23) int local23 = Static106.method1998(local9, Static73.anInt1873, local15) - Static84.anInt4123;
		if (Static119.anInt2886 < local9) {
			Static119.anInt2886 += Static109.anInt2689 * (local9 - Static119.anInt2886) / 1000 + Static143.anInt3334;
			if (Static119.anInt2886 > local9) {
				Static119.anInt2886 = local9;
			}
		}
		if (Static135.anInt3214 < local15) {
			Static135.anInt3214 += Static143.anInt3334 + Static109.anInt2689 * (local15 - Static135.anInt3214) / 1000;
			if (local15 < Static135.anInt3214) {
				Static135.anInt3214 = local15;
			}
		}
		if (Static119.anInt2886 > local9) {
			Static119.anInt2886 -= Static143.anInt3334 + Static109.anInt2689 * (Static119.anInt2886 - local9) / 1000;
			if (Static119.anInt2886 < local9) {
				Static119.anInt2886 = local9;
			}
		}
		if (Static135.anInt3214 > local15) {
			Static135.anInt3214 -= Static143.anInt3334 + (Static135.anInt3214 - local15) * Static109.anInt2689 / 1000;
			if (local15 > Static135.anInt3214) {
				Static135.anInt3214 = local15;
			}
		}
		local9 = Static175.anInt3921 * 128 + 64;
		if (Static111.anInt2724 < local23) {
			Static111.anInt2724 += Static143.anInt3334 + (local23 - Static111.anInt2724) * Static109.anInt2689 / 1000;
			if (local23 < Static111.anInt2724) {
				Static111.anInt2724 = local23;
			}
		}
		if (Static111.anInt2724 > local23) {
			Static111.anInt2724 -= Static143.anInt3334 + (Static111.anInt2724 - local23) * Static109.anInt2689 / 1000;
			if (Static111.anInt2724 < local23) {
				Static111.anInt2724 = local23;
			}
		}
		local15 = Static100.anInt2534 * 128 + 64;
		local23 = Static106.method1998(local9, Static73.anInt1873, local15) - Static125.anInt2989;
		@Pc(203) int local203 = local9 - Static119.anInt2886;
		@Pc(207) int local207 = local23 - Static111.anInt2724;
		@Pc(212) int local212 = local15 - Static135.anInt3214;
		@Pc(223) int local223 = (int) Math.sqrt((double) (local212 * local212 + local203 * local203));
		@Pc(234) int local234 = (int) (Math.atan2((double) local207, (double) local223) * 325.949D) & 0x7FF;
		if (local234 < 128) {
			local234 = 128;
		}
		@Pc(252) int local252 = (int) (Math.atan2((double) local203, (double) local212) * -325.949D) & 0x7FF;
		@Pc(257) int local257 = local252 - Static4.anInt2849;
		if (local257 > 1024) {
			local257 -= 2048;
		}
		if (local257 < -1024) {
			local257 += 2048;
		}
		if (local234 > 383) {
			local234 = 383;
		}
		if (local234 > Static15.anInt456) {
			Static15.anInt456 += Static167.anInt3702 * (local234 - Static15.anInt456) / 1000 + Static143.anInt3328;
			if (Static15.anInt456 > local234) {
				Static15.anInt456 = local234;
			}
		}
		if (local257 > 0) {
			Static4.anInt2849 += Static167.anInt3702 * local257 / 1000 + Static143.anInt3328;
			Static4.anInt2849 &= 0x7FF;
		}
		if (local257 < 0) {
			Static4.anInt2849 -= Static167.anInt3702 * -local257 / 1000 + Static143.anInt3328;
			Static4.anInt2849 &= 0x7FF;
		}
		@Pc(334) int local334 = local252 - Static4.anInt2849;
		if (local334 > 1024) {
			local334 -= 2048;
		}
		if (local234 < Static15.anInt456) {
			Static15.anInt456 -= (Static15.anInt456 - local234) * Static167.anInt3702 / 1000 + Static143.anInt3328;
			if (local234 > Static15.anInt456) {
				Static15.anInt456 = local234;
			}
		}
		if (local334 < -1024) {
			local334 += 2048;
		}
		if (local334 < 0 && local257 > 0 || local334 > 0 && local257 < 0) {
			Static4.anInt2849 = local252;
		}
	}
}
