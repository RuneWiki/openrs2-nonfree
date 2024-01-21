import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!oa", name = "qb", descriptor = "I")
	public static int anInt2825;

	@OriginalMember(owner = "client!oa", name = "sb", descriptor = "[I")
	public static int[] anIntArray263;

	@OriginalMember(owner = "client!oa", name = "yb", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!oa", name = "gb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1650 = Static107.method1838("Bitte versuchen Sie es erneut)3");

	@OriginalMember(owner = "client!oa", name = "mb", descriptor = "Z")
	public static volatile boolean aBoolean128 = true;

	@OriginalMember(owner = "client!oa", name = "nb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1651 = Static107.method1838("cross");

	@OriginalMember(owner = "client!oa", name = "ob", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1652 = Static107.method1838("W-=hlen Sie eine Option");

	@OriginalMember(owner = "client!oa", name = "rb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1653 = Static107.method1838("Weiter");

	@OriginalMember(owner = "client!oa", name = "vb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1654 = Static107.method1838("Bitte versuchen Sie)1");

	@OriginalMember(owner = "client!oa", name = "wb", descriptor = "Lclient!gg;")
	private static Class28 aClass28_1655 = Static107.method1838("Your profile will be transferred in:");

	@OriginalMember(owner = "client!oa", name = "zb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1656 = aClass28_1655;

	@OriginalMember(owner = "client!oa", name = "Ab", descriptor = "I")
	public static int anInt2829 = 0;

	@OriginalMember(owner = "client!oa", name = "Bb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1657 = Static107.method1838("(Z");

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!qh;IIIIIII)V")
	public static void method1945(@OriginalArg(0) Class69 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) int local6;
		@Pc(7) int local7 = local6 = (arg6 << 7) - Static125.anInt2954;
		@Pc(14) int local14;
		@Pc(15) int local15 = local14 = (arg7 << 7) - Static14.anInt612;
		@Pc(20) int local20;
		@Pc(21) int local21 = local20 = local7 + 128;
		@Pc(26) int local26;
		@Pc(27) int local27 = local26 = local15 + 128;
		@Pc(37) int local37 = Static90.anIntArrayArrayArray7[arg1][arg6][arg7] - Static95.anInt2362;
		@Pc(49) int local49 = Static90.anIntArrayArrayArray7[arg1][arg6 + 1][arg7] - Static95.anInt2362;
		@Pc(63) int local63 = Static90.anIntArrayArrayArray7[arg1][arg6 + 1][arg7 + 1] - Static95.anInt2362;
		@Pc(75) int local75 = Static90.anIntArrayArrayArray7[arg1][arg6][arg7 + 1] - Static95.anInt2362;
		@Pc(85) int local85 = local15 * arg4 + local7 * arg5 >> 16;
		@Pc(95) int local95 = local15 * arg5 - local7 * arg4 >> 16;
		@Pc(97) int local97 = local85;
		@Pc(107) int local107 = local37 * arg3 - local95 * arg2 >> 16;
		@Pc(117) int local117 = local37 * arg2 + local95 * arg3 >> 16;
		@Pc(119) int local119 = local107;
		if (local117 < 50) {
			return;
		}
		local85 = local14 * arg4 + local21 * arg5 >> 16;
		@Pc(143) int local143 = local14 * arg5 - local21 * arg4 >> 16;
		local21 = local85;
		local85 = local49 * arg3 - local143 * arg2 >> 16;
		@Pc(165) int local165 = local49 * arg2 + local143 * arg3 >> 16;
		local49 = local85;
		if (local165 < 50) {
			return;
		}
		local85 = local27 * arg4 + local20 * arg5 >> 16;
		local27 = local27 * arg5 - local20 * arg4 >> 16;
		@Pc(193) int local193 = local85;
		local85 = local63 * arg3 - local27 * arg2 >> 16;
		local27 = local63 * arg2 + local27 * arg3 >> 16;
		local63 = local85;
		if (local27 < 50) {
			return;
		}
		local85 = local26 * arg4 + local6 * arg5 >> 16;
		@Pc(239) int local239 = local26 * arg5 - local6 * arg4 >> 16;
		@Pc(241) int local241 = local85;
		local85 = local75 * arg3 - local239 * arg2 >> 16;
		@Pc(261) int local261 = local75 * arg2 + local239 * arg3 >> 16;
		if (local261 < 50) {
			return;
		}
		@Pc(275) int local275 = Static25.anInt795 + (local97 << 9) / local117;
		@Pc(283) int local283 = Static25.anInt799 + (local119 << 9) / local117;
		@Pc(291) int local291 = Static25.anInt795 + (local21 << 9) / local165;
		@Pc(299) int local299 = Static25.anInt799 + (local49 << 9) / local165;
		@Pc(307) int local307 = Static25.anInt795 + (local193 << 9) / local27;
		@Pc(315) int local315 = Static25.anInt799 + (local63 << 9) / local27;
		@Pc(323) int local323 = Static25.anInt795 + (local241 << 9) / local261;
		@Pc(331) int local331 = Static25.anInt799 + (local85 << 9) / local261;
		Static25.anInt792 = 0;
		@Pc(467) int local467;
		if ((local307 - local323) * (local299 - local331) - (local315 - local331) * (local291 - local323) > 0) {
			if (Static126.aBoolean134 && Static162.method2496(Static163.anInt3610, Static31.anInt4010, local315, local331, local299, local307, local323, local291)) {
				Static177.anInt3920 = arg6;
				Static18.anInt3710 = arg7;
			}
			Static25.aBoolean26 = false;
			if (local307 < 0 || local323 < 0 || local291 < 0 || local307 > Static25.anInt800 || local323 > Static25.anInt800 || local291 > Static25.anInt800) {
				Static25.aBoolean26 = true;
			}
			if (arg0.anInt3119 == -1) {
				if (arg0.anInt3118 != 12345678) {
					Static25.method546(local315, local331, local299, local307, local323, local291, arg0.anInt3118, arg0.anInt3127, arg0.anInt3124);
				}
			} else if (Static18.aBoolean161) {
				local467 = Static25.anInterface2_1.method2659(arg0.anInt3119);
				Static25.method546(local315, local331, local299, local307, local323, local291, Static138.method2169(local467, arg0.anInt3118), Static138.method2169(local467, arg0.anInt3127), Static138.method2169(local467, arg0.anInt3124));
			} else if (arg0.aBoolean140) {
				Static25.method550(local315, local331, local299, local307, local323, local291, arg0.anInt3118, arg0.anInt3127, arg0.anInt3124, local97, local21, local241, local119, local49, local85, local117, local165, local261, arg0.anInt3119);
			} else {
				Static25.method550(local315, local331, local299, local307, local323, local291, arg0.anInt3118, arg0.anInt3127, arg0.anInt3124, local193, local241, local21, local63, local85, local49, local27, local261, local165, arg0.anInt3119);
			}
		}
		if ((local275 - local291) * (local331 - local299) - (local283 - local299) * (local323 - local291) <= 0) {
			return;
		}
		if (Static126.aBoolean134 && Static162.method2496(Static163.anInt3610, Static31.anInt4010, local283, local299, local331, local275, local291, local323)) {
			Static177.anInt3920 = arg6;
			Static18.anInt3710 = arg7;
		}
		Static25.aBoolean26 = false;
		if (local275 < 0 || local291 < 0 || local323 < 0 || local275 > Static25.anInt800 || local291 > Static25.anInt800 || local323 > Static25.anInt800) {
			Static25.aBoolean26 = true;
		}
		if (arg0.anInt3119 != -1) {
			if (!Static18.aBoolean161) {
				Static25.method550(local283, local299, local331, local275, local291, local323, arg0.anInt3123, arg0.anInt3124, arg0.anInt3127, local97, local21, local241, local119, local49, local85, local117, local165, local261, arg0.anInt3119);
				return;
			}
			local467 = Static25.anInterface2_1.method2659(arg0.anInt3119);
			Static25.method546(local283, local299, local331, local275, local291, local323, Static138.method2169(local467, arg0.anInt3123), Static138.method2169(local467, arg0.anInt3124), Static138.method2169(local467, arg0.anInt3127));
		} else if (arg0.anInt3123 != 12345678) {
			Static25.method546(local283, local299, local331, local275, local291, local323, arg0.anInt3123, arg0.anInt3124, arg0.anInt3127);
			return;
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(BLclient!jc;Lclient!jc;)V")
	public static void method1946(@OriginalArg(1) Class40 arg0, @OriginalArg(2) Class40 arg1) {
		Static52.aClass40_15 = arg1;
		Static95.aClass40_28 = arg0;
		Static57.anInt1501 = Static52.aClass40_15.method1785(3);
	}

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "(Z)V")
	public static void method1947() {
		aClass28_1656 = null;
		aByteArrayArrayArray7 = null;
		aClass28_1657 = null;
		aClass28_1653 = null;
		aClass28_1654 = null;
		anIntArray263 = null;
		aClass28_1650 = null;
		aClass28_1651 = null;
		aClass28_1655 = null;
		aClass28_1652 = null;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IZ)V")
	public static void method1948(@OriginalArg(0) int arg0) {
		if (arg0 == -1 && !Static148.aBoolean151) {
			Static50.method936();
		} else if (arg0 != -1 && (arg0 != Static6.anInt373 || !Static76.method1380()) && Static84.anInt2125 != 0 && !Static148.aBoolean151) {
			Static96.method1719(arg0, 0, Static84.anInt2125, Static10.aClass40_Sub1_18);
		}
		Static6.anInt373 = arg0;
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(BI)Z")
	public static boolean method1949(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		@Pc(11) int local11 = Static176.aShortArray41[arg0];
		if (local11 >= 2000) {
			local11 -= 2000;
		}
		return local11 == 1003;
	}
}
