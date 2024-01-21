import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!hh", name = "e", descriptor = "I")
	public static int anInt3590;

	@OriginalMember(owner = "client!hh", name = "g", descriptor = "[I")
	public static final int[] anIntArray309 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!hh", name = "l", descriptor = "I")
	public static volatile int anInt3596 = -1;

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)Z")
	public static boolean method2464() {
		@Pc(5) Class37 local5 = Static51.aClass37_1;
		synchronized (Static51.aClass37_1) {
			if (Static132.anInt2866 == Static64.anInt1346) {
				return false;
			} else {
				Static172.anInt678 = Static88.anIntArray173[Static64.anInt1346];
				Static185.anInt3853 = Static65.anIntArray108[Static64.anInt1346];
				Static64.anInt1346 = Static64.anInt1346 + 1 & 0x7F;
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lclient!af;B)V")
	public static void method2466(@OriginalArg(0) Class2_Sub2 arg0) {
		if (arg0.aClass2_Sub20_5 != null) {
			arg0.aClass2_Sub20_5.anInt3408 = 0;
		}
		arg0.aBoolean181 = false;
		for (@Pc(23) Class2_Sub2 local23 = arg0.method2848(); local23 != null; local23 = arg0.method2847()) {
			method2466(local23);
		}
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)V")
	public static void method2467() {
		@Pc(5) int local5 = Static200.anInt4171 * 128 + 64;
		@Pc(11) int local11 = Static147.anInt3144 * 128 + 64;
		@Pc(24) int local24 = Static175.method2548(local5, Static126.anInt2806, local11) - Static95.anInt2135;
		if (local11 > Static42.anInt4286) {
			Static42.anInt4286 += Static9.anInt235 * (local11 - Static42.anInt4286) / 1000 + Static99.anInt2295;
			if (Static42.anInt4286 > local11) {
				Static42.anInt4286 = local11;
			}
		}
		if (local24 > Static127.anInt2813) {
			Static127.anInt2813 += Static99.anInt2295 + Static9.anInt235 * (local24 - Static127.anInt2813) / 1000;
			if (Static127.anInt2813 > local24) {
				Static127.anInt2813 = local24;
			}
		}
		if (local24 < Static127.anInt2813) {
			Static127.anInt2813 -= Static9.anInt235 * (Static127.anInt2813 - local24) / 1000 + Static99.anInt2295;
			if (Static127.anInt2813 < local24) {
				Static127.anInt2813 = local24;
			}
		}
		if (local5 > Static29.anInt721) {
			Static29.anInt721 += (local5 - Static29.anInt721) * Static9.anInt235 / 1000 + Static99.anInt2295;
			if (Static29.anInt721 > local5) {
				Static29.anInt721 = local5;
			}
		}
		if (Static29.anInt721 > local5) {
			Static29.anInt721 -= Static9.anInt235 * (Static29.anInt721 - local5) / 1000 + Static99.anInt2295;
			if (local5 > Static29.anInt721) {
				Static29.anInt721 = local5;
			}
		}
		if (local11 < Static42.anInt4286) {
			Static42.anInt4286 -= (Static42.anInt4286 - local11) * Static9.anInt235 / 1000 + Static99.anInt2295;
			if (local11 > Static42.anInt4286) {
				Static42.anInt4286 = local11;
			}
		}
		local11 = Static23.anInt547 * 128 + 64;
		local5 = Static111.anInt2421 * 128 + 64;
		local24 = Static175.method2548(local5, Static126.anInt2806, local11) - Static71.anInt1471;
		@Pc(206) int local206 = local11 - Static42.anInt4286;
		@Pc(211) int local211 = local24 - Static127.anInt2813;
		@Pc(216) int local216 = local5 - Static29.anInt721;
		@Pc(227) int local227 = (int) Math.sqrt((double) (local206 * local206 + local216 * local216));
		@Pc(238) int local238 = (int) (Math.atan2((double) local211, (double) local227) * 325.949D) & 0x7FF;
		@Pc(249) int local249 = (int) (-325.949D * Math.atan2((double) local206, (double) local216)) & 0x7FF;
		if (local238 < 128) {
			local238 = 128;
		}
		@Pc(259) int local259 = local249 - Static207.anInt4292;
		if (local238 > 383) {
			local238 = 383;
		}
		if (local259 > 1024) {
			local259 -= 2048;
		}
		if (local259 < -1024) {
			local259 += 2048;
		}
		if (local259 > 0) {
			Static207.anInt4292 += local259 * Static169.anInt3580 / 1000 + Static173.anInt3684;
			Static207.anInt4292 &= 0x7FF;
		}
		if (Static58.anInt1153 < local238) {
			Static58.anInt1153 += Static169.anInt3580 * (local238 - Static58.anInt1153) / 1000 + Static173.anInt3684;
			if (local238 < Static58.anInt1153) {
				Static58.anInt1153 = local238;
			}
		}
		if (local259 < 0) {
			Static207.anInt4292 -= -local259 * Static169.anInt3580 / 1000 + Static173.anInt3684;
			Static207.anInt4292 &= 0x7FF;
		}
		if (local238 < Static58.anInt1153) {
			Static58.anInt1153 -= Static173.anInt3684 + (Static58.anInt1153 - local238) * Static169.anInt3580 / 1000;
			if (local238 > Static58.anInt1153) {
				Static58.anInt1153 = local238;
			}
		}
		@Pc(356) int local356 = local249 - Static207.anInt4292;
		if (local356 > 1024) {
			local356 -= 2048;
		}
		if (local356 < -1024) {
			local356 += 2048;
		}
		if (local356 < 0 && local259 > 0 || local356 > 0 && local259 < 0) {
			Static207.anInt4292 = local249;
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IBI)I")
	public static int method2469(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) long local14 = (long) (arg1 + (arg0 << 16));
		return Static33.aClass2_Sub1_Sub21_1 != null && local14 == Static33.aClass2_Sub1_Sub21_1.aLong148 ? Static203.aClass2_Sub11_5.anInt2235 * 99 / (Static203.aClass2_Sub11_5.aByteArray26.length - Static33.aClass2_Sub1_Sub21_1.aByte9) + 1 : 0;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lclient!mb;I)V")
	public static void method2471(@OriginalArg(0) Class62 arg0) {
		if (Static154.anInt3306 >= 2) {
			@Pc(15) int local15;
			@Pc(34) int local34;
			if (arg0.method1858(Static65.aClass62_456)) {
				for (local15 = 0; local15 < 10; local15++) {
					System.gc();
				}
				@Pc(24) Runtime local24 = Runtime.getRuntime();
				local34 = (int) ((local24.totalMemory() - local24.freeMemory()) / 1024L);
				Static154.method2292(Static169.method2460(new Class62[] { Static126.aClass62_986, Static119.method1865(local34), Static50.aClass62_348 }), 0, null);
			}
			if (arg0.method1858(Static2.aClass62_30)) {
				Static156.method2312();
			}
			if (arg0.method1858(Static66.aClass62_470)) {
				Static137.aBoolean126 = true;
			}
			if (arg0.method1858(Static115.aClass62_880)) {
				Static137.aBoolean126 = false;
			}
			arg0.method1858(Static85.aClass62_592);
			arg0.method1858(Static84.aClass62_1328);
			if (arg0.method1858(Static20.aClass62_145)) {
				for (local15 = 0; local15 < 4; local15++) {
					for (@Pc(102) int local102 = 1; local102 < 103; local102++) {
						for (local34 = 1; local34 < 103; local34++) {
							Static164.aClass95Array1[local15].anIntArrayArray35[local102][local34] = 0;
						}
					}
				}
			}
			if (arg0.method1880(Static42.aClass62_1485) && Static187.anInt3891 != 0) {
				Static202.method2940(arg0.method1849(6).method1853());
			}
			if (arg0.method1858(Static142.aClass62_1056) && Static187.anInt3891 == 2) {
				throw new RuntimeException();
			}
			if (arg0.method1880(Static204.aClass62_1464)) {
				Static182.anInt3831 = arg0.method1849(12).method1846().method1853();
				Static154.method2292(Static169.method2460(new Class62[] { Static159.aClass62_1207, Static119.method1865(Static182.anInt3831) }), 0, null);
			}
			if (arg0.method1858(Static2.aClass62_32)) {
				Static172.aBoolean27 = true;
			}
		}
		Static58.aClass2_Sub11_Sub1_2.method1595(21);
		Static58.aClass2_Sub11_Sub1_2.method1565(arg0.method1878() - 1);
		Static58.aClass2_Sub11_Sub1_2.method1540(arg0.method1849(2));
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(III)J")
	public static long method2472(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub18 local7 = Static92.aClass2_Sub18ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass85_1 == null ? 0L : local7.aClass85_1.aLong114;
	}
}
