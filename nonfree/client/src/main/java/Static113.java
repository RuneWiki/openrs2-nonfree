import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!wc", name = "q", descriptor = "[I")
	public static int[] anIntArray410;

	@OriginalMember(owner = "client!wc", name = "s", descriptor = "Lclient!rb;")
	public static Class55 aClass55_41;

	@OriginalMember(owner = "client!wc", name = "t", descriptor = "Lclient!hd;")
	public static Class1_Sub1_Sub6_Sub1 aClass1_Sub1_Sub6_Sub1_6;

	@OriginalMember(owner = "client!wc", name = "f", descriptor = "Lclient!jd;")
	public static Class29 aClass29_1 = new Class29();

	@OriginalMember(owner = "client!wc", name = "m", descriptor = "[I")
	public static int[] anIntArray409 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

	@OriginalMember(owner = "client!wc", name = "r", descriptor = "Lclient!gd;")
	private static Class23 aClass23_1725 = Static15.method178("No response from server)3");

	@OriginalMember(owner = "client!wc", name = "o", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1724 = aClass23_1725;

	@OriginalMember(owner = "client!wc", name = "p", descriptor = "Lclient!ba;")
	public static Class5 aClass5_64 = new Class5(30);

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)V")
	public static void method1919(@OriginalArg(0) int arg0) {
		Static95.anInt2498 = arg0;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Z)V")
	public static void method1920() {
		aClass29_1 = null;
		anIntArray409 = null;
		aClass23_1725 = null;
		aClass23_1724 = null;
		anIntArray410 = null;
		aClass55_41 = null;
		aClass5_64 = null;
		aClass1_Sub1_Sub6_Sub1_6 = null;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)Z")
	public static boolean method1921() {
		return Static97.aClass11_1 != null;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIII)Z")
	public static boolean method1922(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) int local11 = arg2 >> 14 & 0x7FFF;
		@Pc(18) int local18 = Static19.aClass65_1.method1730(Static79.anInt2137, arg0, arg1, arg2);
		if (local18 == -1) {
			return false;
		}
		@Pc(28) int local28 = local18 & 0x1F;
		@Pc(34) int local34 = local18 >> 6 & 0x3;
		if (local28 == 10 || local28 == 11 || local28 == 22) {
			@Pc(53) Class1_Sub1_Sub4 local53 = Static97.method1645(local11);
			@Pc(63) int local63;
			@Pc(66) int local66;
			if (local34 == 0 || local34 == 2) {
				local63 = local53.anInt299;
				local66 = local53.anInt305;
			} else {
				local63 = local53.anInt305;
				local66 = local53.anInt299;
			}
			@Pc(77) int local77 = local53.anInt325;
			if (local34 != 0) {
				local77 = (local77 >> 4 - local34) + (local77 << local34 & 0xF);
			}
			Static107.method1822(0, Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray264[0], arg0, arg1, Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray266[0], true, local66, 0, local63, 2, local77);
		} else {
			Static107.method1822(local28 + 1, Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray264[0], arg0, arg1, Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray266[0], true, 0, local34, 0, 2, 0);
		}
		Static76.anInt2078 = 0;
		Static26.anInt797 = Static111.anInt2890;
		Static29.anInt881 = Static74.anInt1803;
		Static80.anInt2260 = 2;
		return true;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(BLclient!rb;)V")
	public static void method1923(@OriginalArg(1) Class55 arg0) {
		Static26.aClass55_13 = arg0;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)V")
	public static void method1924() {
		@Pc(17) int local17 = Static107.anInt2743 * 128 + 64;
		@Pc(23) int local23 = Static17.anInt427 * 128 + 64;
		@Pc(32) int local32 = Static48.method987(local23, local17, Static79.anInt2137) - Static13.anInt237;
		if (Static21.anInt702 < local23) {
			Static21.anInt702 += (local23 - Static21.anInt702) * Static104.anInt2690 / 1000 + Static27.anInt858;
			if (Static21.anInt702 > local23) {
				Static21.anInt702 = local23;
			}
		}
		if (Static21.anInt702 > local23) {
			Static21.anInt702 -= (Static21.anInt702 - local23) * Static104.anInt2690 / 1000 + Static27.anInt858;
			if (Static21.anInt702 < local23) {
				Static21.anInt702 = local23;
			}
		}
		local23 = Static35.anInt1111 * 128 + 64;
		if (Static96.anInt1793 < local32) {
			Static96.anInt1793 += Static27.anInt858 + (local32 - Static96.anInt1793) * Static104.anInt2690 / 1000;
			if (local32 < Static96.anInt1793) {
				Static96.anInt1793 = local32;
			}
		}
		if (Static54.anInt1684 < local17) {
			Static54.anInt1684 += Static27.anInt858 + Static104.anInt2690 * (local17 - Static54.anInt1684) / 1000;
			if (local17 < Static54.anInt1684) {
				Static54.anInt1684 = local17;
			}
		}
		if (Static96.anInt1793 > local32) {
			Static96.anInt1793 -= (Static96.anInt1793 - local32) * Static104.anInt2690 / 1000 + Static27.anInt858;
			if (Static96.anInt1793 < local32) {
				Static96.anInt1793 = local32;
			}
		}
		if (Static54.anInt1684 > local17) {
			Static54.anInt1684 -= Static104.anInt2690 * (Static54.anInt1684 - local17) / 1000 + Static27.anInt858;
			if (Static54.anInt1684 < local17) {
				Static54.anInt1684 = local17;
			}
		}
		local17 = Static92.anInt2919 * 128 + 64;
		local32 = Static48.method987(local23, local17, Static79.anInt2137) - Static45.anInt1523;
		@Pc(202) int local202 = local23 - Static21.anInt702;
		@Pc(207) int local207 = local32 - Static96.anInt1793;
		@Pc(212) int local212 = local17 - Static54.anInt1684;
		@Pc(223) int local223 = (int) Math.sqrt((double) (local202 * local202 + local212 * local212));
		@Pc(234) int local234 = (int) (Math.atan2((double) local207, (double) local223) * 325.949D) & 0x7FF;
		if (local234 < 128) {
			local234 = 128;
		}
		if (local234 > 383) {
			local234 = 383;
		}
		@Pc(255) int local255 = (int) (Math.atan2((double) local212, (double) local202) * -325.949D) & 0x7FF;
		if (local234 > Static44.anInt1488) {
			Static44.anInt1488 += (local234 - Static44.anInt1488) * Static16.anInt332 / 1000 + Static74.anInt1805;
			if (local234 < Static44.anInt1488) {
				Static44.anInt1488 = local234;
			}
		}
		if (Static44.anInt1488 > local234) {
			Static44.anInt1488 -= (Static44.anInt1488 - local234) * Static16.anInt332 / 1000 + Static74.anInt1805;
			if (local234 > Static44.anInt1488) {
				Static44.anInt1488 = local234;
			}
		}
		@Pc(309) int local309 = local255 - Static107.anInt2775;
		if (local309 > 1024) {
			local309 -= 2048;
		}
		if (local309 < -1024) {
			local309 += 2048;
		}
		if (local309 > 0) {
			Static107.anInt2775 += Static16.anInt332 * local309 / 1000 + Static74.anInt1805;
			Static107.anInt2775 &= 0x7FF;
		}
		if (local309 < 0) {
			Static107.anInt2775 -= -local309 * Static16.anInt332 / 1000 + Static74.anInt1805;
			Static107.anInt2775 &= 0x7FF;
		}
		@Pc(362) int local362 = local255 - Static107.anInt2775;
		if (local362 > 1024) {
			local362 -= 2048;
		}
		if (local362 < -1024) {
			local362 += 2048;
		}
		if (local362 < 0 && local309 > 0 || local362 > 0 && local309 < 0) {
			Static107.anInt2775 = local255;
		}
	}
}
