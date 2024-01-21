import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!lf", name = "F", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!lf", name = "U", descriptor = "[I")
	public static int[] anIntArray233;

	@OriginalMember(owner = "client!lf", name = "B", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_858 = Static151.method2243("document)3cookie=(R");

	@OriginalMember(owner = "client!lf", name = "C", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_859 = Static151.method2243("Lade Schrifts-=tze )2 ");

	@OriginalMember(owner = "client!lf", name = "E", descriptor = "I")
	public static int anInt2471 = 0;

	@OriginalMember(owner = "client!lf", name = "X", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_866 = Static151.method2243("Please use a different world)3");

	@OriginalMember(owner = "client!lf", name = "J", descriptor = "Lclient!mb;")
	public static Class62 aClass62_861 = aClass62_866;

	@OriginalMember(owner = "client!lf", name = "O", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_862 = Static151.method2243("<col=ff3000>");

	@OriginalMember(owner = "client!lf", name = "R", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_864 = Static151.method2243("Sorry invited players only)3");

	@OriginalMember(owner = "client!lf", name = "Q", descriptor = "Lclient!mb;")
	public static Class62 aClass62_863 = aClass62_864;

	@OriginalMember(owner = "client!lf", name = "V", descriptor = "Lclient!mb;")
	public static Class62 aClass62_865 = aClass62_866;

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIILclient!mf;Lclient!mf;IIIIJ)V")
	public static void method1736(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class7 arg4, @OriginalArg(5) Class7 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) long arg10) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class100 local6 = new Class100();
		local6.aLong135 = arg10;
		local6.anInt4036 = arg1 * 128 + 64;
		local6.anInt4038 = arg2 * 128 + 64;
		local6.anInt4034 = arg3;
		local6.aClass7_11 = arg4;
		local6.aClass7_10 = arg5;
		local6.anInt4041 = arg6;
		local6.anInt4033 = arg7;
		local6.anInt4037 = arg8;
		local6.anInt4042 = arg9;
		for (@Pc(46) int local46 = arg0; local46 >= 0; local46--) {
			if (Static92.aClass2_Sub18ArrayArrayArray1[local46][arg1][arg2] == null) {
				Static92.aClass2_Sub18ArrayArrayArray1[local46][arg1][arg2] = new Class2_Sub18(local46, arg1, arg2);
			}
		}
		Static92.aClass2_Sub18ArrayArrayArray1[arg0][arg1][arg2].aClass100_1 = local6;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIB)I")
	public static int method1737(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = 0;
		while (arg1 > 0) {
			arg1--;
			local12 = local12 << 1 | arg0 & 0x1;
			arg0 >>>= 0x1;
		}
		return local12;
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(II)V")
	public static void method1738(@OriginalArg(1) int arg0) {
		if (!Static124.method1934(arg0)) {
			return;
		}
		@Pc(14) Class47[] local14 = Static89.aClass47ArrayArray1[arg0];
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(22) Class47 local22 = local14[local16];
			if (local22 != null) {
				local22.anInt1898 = 0;
				local22.anInt1869 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!ic;IIIIIII)V")
	public static void method1739(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) int local6;
		@Pc(7) int local7 = local6 = (arg6 << 7) - Static189.anInt3928;
		@Pc(14) int local14;
		@Pc(15) int local15 = local14 = (arg7 << 7) - Static172.anInt679;
		@Pc(20) int local20;
		@Pc(21) int local21 = local20 = local7 + 128;
		@Pc(26) int local26;
		@Pc(27) int local27 = local26 = local15 + 128;
		@Pc(37) int local37 = Static72.anIntArrayArrayArray3[arg1][arg6][arg7] - Static52.anInt1112;
		@Pc(49) int local49 = Static72.anIntArrayArrayArray3[arg1][arg6 + 1][arg7] - Static52.anInt1112;
		@Pc(63) int local63 = Static72.anIntArrayArrayArray3[arg1][arg6 + 1][arg7 + 1] - Static52.anInt1112;
		@Pc(75) int local75 = Static72.anIntArrayArrayArray3[arg1][arg6][arg7 + 1] - Static52.anInt1112;
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
		@Pc(275) int local275 = Static45.anInt1015 + (local97 << 9) / local117;
		@Pc(283) int local283 = Static45.anInt1014 + (local119 << 9) / local117;
		@Pc(291) int local291 = Static45.anInt1015 + (local21 << 9) / local165;
		@Pc(299) int local299 = Static45.anInt1014 + (local49 << 9) / local165;
		@Pc(307) int local307 = Static45.anInt1015 + (local193 << 9) / local27;
		@Pc(315) int local315 = Static45.anInt1014 + (local63 << 9) / local27;
		@Pc(323) int local323 = Static45.anInt1015 + (local241 << 9) / local261;
		@Pc(331) int local331 = Static45.anInt1014 + (local85 << 9) / local261;
		Static45.anInt1013 = 0;
		@Pc(471) int local471;
		if ((local307 - local323) * (local299 - local331) - (local315 - local331) * (local291 - local323) > 0) {
			if (Static139.aBoolean128 && Static193.method2761(Static156.anInt3329 + Static45.anInt1015, Static15.anInt358 + Static45.anInt1014, local315, local331, local299, local307, local323, local291)) {
				Static127.anInt2807 = arg6;
				Static5.anInt170 = arg7;
			}
			Static45.aBoolean44 = false;
			if (local307 < 0 || local323 < 0 || local291 < 0 || local307 > Static45.anInt1016 || local323 > Static45.anInt1016 || local291 > Static45.anInt1016) {
				Static45.aBoolean44 = true;
			}
			if (arg0.anInt1738 == -1) {
				if (arg0.anInt1746 != 12345678) {
					Static45.method699(local315, local331, local299, local307, local323, local291, arg0.anInt1746, arg0.anInt1748, arg0.anInt1749);
				}
			} else if (Static164.aBoolean149) {
				local471 = Static45.anInterface3_1.method2298(arg0.anInt1738);
				Static45.method699(local315, local331, local299, local307, local323, local291, Static130.method2001(local471, arg0.anInt1746), Static130.method2001(local471, arg0.anInt1748), Static130.method2001(local471, arg0.anInt1749));
			} else if (arg0.aBoolean82) {
				Static45.method701(local315, local331, local299, local307, local323, local291, arg0.anInt1746, arg0.anInt1748, arg0.anInt1749, local97, local21, local241, local119, local49, local85, local117, local165, local261, arg0.anInt1738);
			} else {
				Static45.method701(local315, local331, local299, local307, local323, local291, arg0.anInt1746, arg0.anInt1748, arg0.anInt1749, local193, local241, local21, local63, local85, local49, local27, local261, local165, arg0.anInt1738);
			}
		}
		if ((local275 - local291) * (local331 - local299) - (local283 - local299) * (local323 - local291) <= 0) {
			return;
		}
		if (Static139.aBoolean128 && Static193.method2761(Static156.anInt3329 + Static45.anInt1015, Static15.anInt358 + Static45.anInt1014, local283, local299, local331, local275, local291, local323)) {
			Static127.anInt2807 = arg6;
			Static5.anInt170 = arg7;
		}
		Static45.aBoolean44 = false;
		if (local275 < 0 || local291 < 0 || local323 < 0 || local275 > Static45.anInt1016 || local291 > Static45.anInt1016 || local323 > Static45.anInt1016) {
			Static45.aBoolean44 = true;
		}
		if (arg0.anInt1738 != -1) {
			if (!Static164.aBoolean149) {
				Static45.method701(local283, local299, local331, local275, local291, local323, arg0.anInt1747, arg0.anInt1749, arg0.anInt1748, local97, local21, local241, local119, local49, local85, local117, local165, local261, arg0.anInt1738);
				return;
			}
			local471 = Static45.anInterface3_1.method2298(arg0.anInt1738);
			Static45.method699(local283, local299, local331, local275, local291, local323, Static130.method2001(local471, arg0.anInt1747), Static130.method2001(local471, arg0.anInt1749), Static130.method2001(local471, arg0.anInt1748));
		} else if (arg0.anInt1747 != 12345678) {
			Static45.method699(local283, local299, local331, local275, local291, local323, arg0.anInt1747, arg0.anInt1749, arg0.anInt1748);
			return;
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!pb;III)Lclient!bf;")
	public static Class2_Sub1_Sub2_Sub1 method1741(@OriginalArg(0) Class71 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return Static157.method2317(arg1, arg0, arg2) ? Static144.method2182() : null;
	}

	@OriginalMember(owner = "client!lf", name = "e", descriptor = "(B)V")
	public static void method1743() {
		Static197.anIntArrayArrayArray10 = null;
		Static46.anIntArrayArrayArray2 = null;
		Static194.aClass47_15 = null;
		Static42.aByteArrayArrayArray18 = null;
		Static64.anInt1343 = 0;
		Static139.aByteArrayArrayArray12 = null;
		Static20.aByteArrayArrayArray3 = null;
		Static191.anIntArray364 = null;
		Static29.aByteArrayArrayArray4 = null;
		Static68.aByteArrayArrayArray10 = null;
		Static178.aByteArrayArrayArray15 = null;
		Static204.aClass13_19.method314();
		Static125.aClass13_8.method314();
		Static67.aClass66_3 = null;
		Static193.aClass66_8 = null;
		Static144.aClass66_7 = null;
		Static27.aClass66_2 = null;
		Static124.aClass66_5 = null;
		Static69.aClass2_Sub1_Sub2_1 = null;
		Static20.aClass66_1 = null;
		Static74.aClass66_4 = null;
		Static138.aClass66_6 = null;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Z)Z")
	public static boolean method1745() {
		try {
			if (Static35.anInt841 == 2) {
				if (Static173.aClass2_Sub16_1 == null) {
					Static173.aClass2_Sub16_1 = Static221.method2010(Static21.aClass71_3, Static49.anInt1075, Static80.anInt1663);
					if (Static173.aClass2_Sub16_1 == null) {
						return false;
					}
				}
				if (Static97.aClass30_1 == null) {
					Static97.aClass30_1 = new Class30(Static80.aClass71_16, Static127.aClass71_25);
				}
				if (Static30.aClass2_Sub2_Sub1_1.method363(Static173.aClass2_Sub16_1, Static97.aClass30_1, Static54.aClass71_11)) {
					Static30.aClass2_Sub2_Sub1_1.method377();
					Static30.aClass2_Sub2_Sub1_1.method358(Static46.anInt1030);
					Static30.aClass2_Sub2_Sub1_1.method367(Static173.aClass2_Sub16_1, Static40.aBoolean40);
					Static97.aClass30_1 = null;
					Static21.aClass71_3 = null;
					Static173.aClass2_Sub16_1 = null;
					Static35.anInt841 = 0;
					return true;
				}
			}
		} catch (@Pc(64) Exception local64) {
			local64.printStackTrace();
			Static30.aClass2_Sub2_Sub1_1.method387();
			Static97.aClass30_1 = null;
			Static173.aClass2_Sub16_1 = null;
			Static35.anInt841 = 0;
			Static21.aClass71_3 = null;
		}
		return false;
	}
}
