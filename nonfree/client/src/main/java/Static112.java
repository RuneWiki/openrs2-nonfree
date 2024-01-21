import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!ua", name = "e", descriptor = "Lclient!b;")
	public static Class6 aClass6_4;

	@OriginalMember(owner = "client!ua", name = "r", descriptor = "I")
	public static int anInt2923;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1101 = Static2.method59("Ung-Ultige Verbindung mit einem Anmelde)2Server)3");

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1102 = Static2.method59("Wen m-Ochten Sie hinzuf-Ugen?");

	@OriginalMember(owner = "client!ua", name = "l", descriptor = "Lclient!wd;")
	private static Class80 aClass80_1104 = Static2.method59("Report abuse");

	@OriginalMember(owner = "client!ua", name = "j", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1103 = aClass80_1104;

	@OriginalMember(owner = "client!ua", name = "k", descriptor = "I")
	public static int anInt2919 = 0;

	@OriginalMember(owner = "client!ua", name = "m", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1105 = Static2.method59("");

	@OriginalMember(owner = "client!ua", name = "o", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1106 = Static2.method59("headicons_pk");

	@OriginalMember(owner = "client!ua", name = "s", descriptor = "I")
	public static int anInt2924 = 0;

	@OriginalMember(owner = "client!ua", name = "v", descriptor = "Z")
	public static boolean aBoolean216 = false;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V")
	public static void method1847() {
		aClass80_1104 = null;
		aClass80_1101 = null;
		aClass80_1103 = null;
		aClass80_1102 = null;
		aClass6_4 = null;
		aClass80_1106 = null;
		aClass80_1105 = null;
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(I)V")
	public static void method1848() {
		@Pc(7) int local7 = Static51.anInt1545;
		@Pc(9) int local9 = Static107.anInt2869;
		@Pc(11) int local11 = Static11.anInt305;
		@Pc(13) int local13 = Static82.anInt3081;
		Static99.method1894(local9, local7, local11, local13, 6116423);
		Static99.method1894(local9 + 1, local7 + 1, local11 - 2, 16, 0);
		Static99.method1888(local9 + 1, local7 + 18, local11 - 2, local13 + -19, 0);
		Static111.aClass2_Sub1_Sub9_Sub4_34.method1925(Static120.aClass80_1170, local9 + 3, local7 + 14, 6116423);
		@Pc(59) int local59 = Static95.anInt2430;
		@Pc(61) int local61 = Static93.anInt2398;
		if (Static11.anInt315 == 0) {
			local61 -= 4;
			local59 -= 4;
		}
		if (Static11.anInt315 == 1) {
			local59 -= 205;
			local61 -= 553;
		}
		if (Static11.anInt315 == 2) {
			local61 -= 17;
			local59 -= 357;
		}
		for (@Pc(89) int local89 = 0; local89 < Static103.anInt2679; local89++) {
			@Pc(93) int local93 = 16777215;
			@Pc(106) int local106 = (Static103.anInt2679 - local89 - 1) * 15 + local7 + 31;
			if (local61 > local9 && local61 < local9 + local11 && local106 - 13 < local59 && local106 + 3 > local59) {
				local93 = 16776960;
			}
			Static111.aClass2_Sub1_Sub9_Sub4_34.method1919(Static2.aClass80Array1[local89], local9 + 3, local106, local93, true);
		}
	}

	@OriginalMember(owner = "client!ua", name = "d", descriptor = "(I)V")
	public static void method1852() {
		Static14.aClass28_1.method717();
		for (@Pc(15) int local15 = 0; local15 < 32; local15++) {
			Static87.aLongArray8[local15] = 0L;
		}
		for (@Pc(29) int local29 = 0; local29 < 32; local29++) {
			Static45.aLongArray6[local29] = 0L;
		}
		Static89.anInt2171 = 0;
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(B)V")
	public static void method1853() {
		try {
			if (Static103.aClass15_1 == null) {
				Static103.aClass15_1 = new Class15(Static9.aClass74_1, Static93.method1444(new Class80[] { Static70.aClass80_724, Static40.aClass80_452, Static18.aClass80_254 }).method1998());
			} else {
				@Pc(15) byte[] local15 = Static103.aClass15_1.method562();
				if (local15 != null) {
					@Pc(22) Class2_Sub17 local22 = new Class2_Sub17(local15);
					Static2.anInt107 = local22.method1783();
					Static106.aClass51Array1 = new Class51[Static2.anInt107];
					for (@Pc(31) int local31 = 0; local31 < Static2.anInt107; local31++) {
						@Pc(41) Class51 local41 = Static106.aClass51Array1[local31] = new Class51();
						@Pc(45) int local45 = local22.method1783();
						local41.anInt1965 = local45 & 0x7FFF;
						local41.aBoolean140 = (local45 & 0x8000) != 0;
						local41.aClass80_754 = local22.method1797();
						local41.anInt1967 = local22.method1784();
						local41.anInt1970 = local31;
						local41.anInt1966 = Static90.method1348(local41.aClass80_754);
					}
					Static10.method177(0, Static106.aClass51Array1, Static123.anIntArray406, Static106.aClass51Array1.length - 1, Static80.anIntArray272);
					Static103.aClass15_1 = null;
					Static82.aBoolean237 = true;
					return;
				}
			}
		} catch (@Pc(126) Exception local126) {
			Static103.aClass15_1 = null;
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIB)I")
	public static int method1854(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg0 >>> 31;
		return (local7 + arg0) / arg1 - local7;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIILclient!va;I[Lclient!va;IIIIII)Lclient!va;")
	public static Class2_Sub1_Sub17 method1855(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub1_Sub17 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class2_Sub1_Sub17[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (arg10 < arg8 || arg6 > arg1 || arg10 >= arg9 || arg1 >= arg5) {
			return null;
		}
		for (@Pc(25) int local25 = 0; local25 < arg4.length; local25++) {
			@Pc(31) Class2_Sub1_Sub17 local31 = arg4[local25];
			if (local31 != null && arg7 == local31.anInt3008 && !Static68.method1116(local31) && local31 != arg2) {
				@Pc(56) int local56 = local31.anInt3012 + arg8 - arg0;
				@Pc(63) int local63 = local31.anInt3037 + arg6 - arg3;
				if (local31.anInt3038 == 0) {
					@Pc(92) Class2_Sub1_Sub17 local92 = method1855(local31.anInt3055, arg1, arg2, local31.anInt3015, arg4, local63 + local31.anInt3024, local63, local31.anInt3022, local56, local31.anInt3020 + local56, arg10);
					if (local92 != null) {
						return local92;
					}
					if (local31.aClass2_Sub1_Sub17Array2 != null) {
						local92 = method1855(local31.anInt3055, arg1, arg2, local31.anInt3015, local31.aClass2_Sub1_Sub17Array2, local31.anInt3024 + local63, local63, local31.anInt3022, local56, local56 + local31.anInt3020, arg10);
						if (local92 != null) {
							return local92;
						}
					}
				}
				if (Static8.method134(Static102.method1660(local31)) && local56 <= arg10 && arg1 >= local63 && local56 + local31.anInt3020 > arg10 && arg1 < local31.anInt3024 + local63) {
					return local31;
				}
			}
		}
		return null;
	}
}
