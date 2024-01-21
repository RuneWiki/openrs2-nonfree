import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!v", name = "v", descriptor = "I")
	public static int anInt2658;

	@OriginalMember(owner = "client!v", name = "E", descriptor = "I")
	public static int anInt2667;

	@OriginalMember(owner = "client!v", name = "J", descriptor = "Lclient!he;")
	public static Class11 aClass11_64;

	@OriginalMember(owner = "client!v", name = "w", descriptor = "I")
	public static int anInt2659 = 2;

	@OriginalMember(owner = "client!v", name = "A", descriptor = "I")
	public static int anInt2663 = 0;

	@OriginalMember(owner = "client!v", name = "I", descriptor = "Lclient!va;")
	private static Class61 aClass61_1078 = Static88.method1421(" is already on your ignore list");

	@OriginalMember(owner = "client!v", name = "G", descriptor = "Lclient!va;")
	public static Class61 aClass61_1077 = aClass61_1078;

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(I)V")
	public static void method1656() {
		Static88.method1417();
		@Pc(18) int local18;
		@Pc(20) int local20;
		if (Static1.anInt2 == 2) {
			@Pc(12) int[] local12 = Static45.anIntArray323;
			@Pc(15) byte[] local15 = Static102.aClass10_Sub1_Sub1_Sub2_25.aByteArray5;
			local18 = local15.length;
			for (local20 = 0; local20 < local18; local20++) {
				if (local15[local20] == 0) {
					local12[local20] = 0;
				}
			}
			Static53.aClass10_Sub1_Sub1_Sub1_34.method153(0, 0, 33, 33, 25, 25, Static79.anInt2144, 256, Static67.anIntArray194, Static16.anIntArray59);
			Static66.method955();
			return;
		}
		@Pc(55) int local55 = Static57.anInt1509 + Static79.anInt2144 & 0x7FF;
		@Pc(62) int local62 = Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anInt1654 / 32 + 48;
		local18 = 464 - Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anInt1649 / 32;
		Static53.aClass10_Sub1_Sub1_Sub1_33.method153(25, 5, 146, 151, local62, local18, local55, Static25.anInt776 + 256, Static36.anIntArray116, Static80.anIntArray241);
		Static53.aClass10_Sub1_Sub1_Sub1_34.method153(0, 0, 33, 33, 25, 25, Static79.anInt2144, 256, Static67.anIntArray194, Static16.anIntArray59);
		for (local20 = 0; local20 < Static4.anInt27; local20++) {
			local18 = Static30.anIntArray101[local20] * 4 + 2 - Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anInt1649 / 32;
			local62 = Static34.anIntArray115[local20] * 4 + 2 - Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anInt1654 / 32;
			Static40.method650(local62, Static54.aClass10_Sub1_Sub1_Sub1Array7[local20], local18);
		}
		@Pc(145) int local145;
		for (@Pc(141) int local141 = 0; local141 < 104; local141++) {
			for (local145 = 0; local145 < 104; local145++) {
				@Pc(155) Class9 local155 = Static11.aClass9ArrayArrayArray1[Static101.anInt2582][local141][local145];
				if (local155 != null) {
					local18 = local145 * 4 + 2 - Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anInt1649 / 32;
					local62 = local141 * 4 + 2 - Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anInt1654 / 32;
					Static40.method650(local62, Static16.aClass10_Sub1_Sub1_Sub1Array3[0], local18);
				}
			}
		}
		for (local145 = 0; local145 < Static34.anInt1005; local145++) {
			@Pc(209) Class10_Sub1_Sub5_Sub2_Sub1 local209 = Static6.aClass10_Sub1_Sub5_Sub2_Sub1Array1[Static1.anIntArray3[local145]];
			if (local209 != null && local209.method927()) {
				@Pc(218) Class10_Sub1_Sub3 local218 = local209.aClass10_Sub1_Sub3_1;
				if (local218.anIntArray48 != null) {
					local218 = local218.method278();
				}
				if (local218 != null && local218.aBoolean16 && local218.aBoolean14) {
					local62 = local209.anInt1654 / 32 - Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anInt1654 / 32;
					local18 = local209.anInt1649 / 32 - Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anInt1649 / 32;
					Static40.method650(local62, Static16.aClass10_Sub1_Sub1_Sub1Array3[1], local18);
				}
			}
		}
		@Pc(278) Class10_Sub1_Sub5_Sub2_Sub2 local278;
		for (@Pc(270) int local270 = 0; local270 < Static10.anInt305; local270++) {
			local278 = Static105.aClass10_Sub1_Sub5_Sub2_Sub2Array1[Static58.anIntArray170[local270]];
			if (local278 != null && local278.method927()) {
				local62 = local278.anInt1654 / 32 - Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anInt1654 / 32;
				local18 = local278.anInt1649 / 32 - Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anInt1649 / 32;
				@Pc(310) boolean local310 = false;
				@Pc(317) long local317 = local278.aClass61_699.method1586();
				for (@Pc(319) int local319 = 0; local319 < Static6.anInt70; local319++) {
					if (local317 == Static76.aLongArray6[local319] && Static33.anIntArray112[local319] != 0) {
						local310 = true;
						break;
					}
				}
				@Pc(345) boolean local345 = false;
				if (Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anInt1707 != 0 && local278.anInt1707 != 0 && Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anInt1707 == local278.anInt1707) {
					local345 = true;
				}
				if (local310) {
					Static40.method650(local62, Static16.aClass10_Sub1_Sub1_Sub1Array3[3], local18);
				} else if (local345) {
					Static40.method650(local62, Static16.aClass10_Sub1_Sub1_Sub1Array3[4], local18);
				} else {
					Static40.method650(local62, Static16.aClass10_Sub1_Sub1_Sub1Array3[2], local18);
				}
			}
		}
		if (Static78.anInt2122 != 0 && Static95.anInt2442 % 20 < 10) {
			if (Static78.anInt2122 == 1 && Static88.anInt2318 >= 0 && Static6.aClass10_Sub1_Sub5_Sub2_Sub1Array1.length > Static88.anInt2318) {
				@Pc(427) Class10_Sub1_Sub5_Sub2_Sub1 local427 = Static6.aClass10_Sub1_Sub5_Sub2_Sub1Array1[Static88.anInt2318];
				if (local427 != null) {
					local62 = local427.anInt1654 / 32 - Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anInt1654 / 32;
					local18 = local427.anInt1649 / 32 - Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anInt1649 / 32;
					Static89.method1426(local62, Static50.aClass10_Sub1_Sub1_Sub1Array6[1], local18);
				}
			}
			if (Static78.anInt2122 == 2) {
				local18 = (-Static7.anInt80 + Static30.anInt922) * 4 + 2 - Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anInt1649 / 32;
				local62 = (Static93.anInt2002 - Static107.anInt2431) * 4 + 2 - Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anInt1654 / 32;
				Static89.method1426(local62, Static50.aClass10_Sub1_Sub1_Sub1Array6[1], local18);
			}
			if (Static78.anInt2122 == 10 && Static49.anInt1391 >= 0 && Static105.aClass10_Sub1_Sub5_Sub2_Sub2Array1.length > Static49.anInt1391) {
				local278 = Static105.aClass10_Sub1_Sub5_Sub2_Sub2Array1[Static49.anInt1391];
				if (local278 != null) {
					local18 = local278.anInt1649 / 32 - Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anInt1649 / 32;
					local62 = local278.anInt1654 / 32 - Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anInt1654 / 32;
					Static89.method1426(local62, Static50.aClass10_Sub1_Sub1_Sub1Array6[1], local18);
				}
			}
		}
		if (Static35.anInt1020 != 0) {
			local18 = Static50.anInt1406 * 4 + 2 - Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anInt1649 / 32;
			local62 = Static35.anInt1020 * 4 + 2 - Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anInt1654 / 32;
			Static40.method650(local62, Static50.aClass10_Sub1_Sub1_Sub1Array6[0], local18);
		}
		Static45.method1531(97, 78, 3, 3, 16777215);
		Static66.method955();
	}

	@OriginalMember(owner = "client!v", name = "c", descriptor = "(B)V")
	public static void method1657() {
		aClass11_64 = null;
		aClass61_1077 = null;
		aClass61_1078 = null;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IIII)I")
	public static int method1658(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg2 / arg1;
		@Pc(11) int local11 = arg0 / arg1;
		@Pc(17) int local17 = arg1 - 1 & arg0;
		@Pc(23) int local23 = arg2 & arg1 - 1;
		@Pc(28) int local28 = Static25.method489(local11, local7);
		@Pc(40) int local40 = Static25.method489(local11 + 1, local7);
		@Pc(47) int local47 = Static25.method489(local11, local7 + 1);
		@Pc(56) int local56 = Static25.method489(local11 + 1, local7 - -1);
		@Pc(65) int local65 = Static57.method830(arg1, local28, local17, local40);
		@Pc(74) int local74 = Static57.method830(arg1, local47, local17, local56);
		return Static57.method830(arg1, local65, local23, local74);
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IILclient!be;Lclient!le;)V")
	public static void method1659(@OriginalArg(0) int arg0, @OriginalArg(2) Class11_Sub1 arg1, @OriginalArg(3) Class38 arg2) {
		@Pc(7) byte[] local7 = null;
		@Pc(9) Class9 local9 = Static12.aClass9_2;
		synchronized (Static12.aClass9_2) {
			for (@Pc(24) Class10_Sub11 local24 = (Class10_Sub11) Static12.aClass9_2.method72(); local24 != null; local24 = (Class10_Sub11) Static12.aClass9_2.method81()) {
				if ((long) arg0 == local24.aLong81 && arg2 == local24.aClass38_3 && local24.anInt2223 == 0) {
					local7 = local24.aByteArray12;
					break;
				}
			}
		}
		if (local7 == null) {
			@Pc(71) byte[] local71 = arg2.method844(arg0);
			arg1.method233(local71, true, arg0, arg2);
		} else {
			arg1.method233(local7, true, arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!v", name = "d", descriptor = "(B)V")
	public static void method1660() {
		Static50.aFont1 = null;
		Static95.aFontMetrics1 = null;
		Static96.anImage4 = null;
	}
}
