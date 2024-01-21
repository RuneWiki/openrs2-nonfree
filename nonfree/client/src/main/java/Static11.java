import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!ca", name = "C", descriptor = "Lclient!sc;")
	public static Class5_Sub2_Sub6_Sub4 aClass5_Sub2_Sub6_Sub4_9;

	@OriginalMember(owner = "client!ca", name = "G", descriptor = "Lclient!jd;")
	public static Class11 aClass11_18;

	@OriginalMember(owner = "client!ca", name = "s", descriptor = "Lclient!mb;")
	private static Class45 aClass45_173 = Static63.method1251(" has logged out)3");

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "Lclient!mb;")
	public static Class45 aClass45_170 = aClass45_173;

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "[Lclient!mb;")
	public static Class45[] aClass45Array3 = new Class45[5];

	@OriginalMember(owner = "client!ca", name = "f", descriptor = "Lclient!mb;")
	public static Class45 aClass45_171 = Static63.method1251("Gegenstand f-Ur Mitglieder");

	@OriginalMember(owner = "client!ca", name = "i", descriptor = "I")
	public static int anInt365 = 0;

	@OriginalMember(owner = "client!ca", name = "o", descriptor = "Lclient!sa;")
	public static Class67 aClass67_3 = new Class67(64);

	@OriginalMember(owner = "client!ca", name = "r", descriptor = "Lclient!mb;")
	public static Class45 aClass45_172 = Static63.method1251(" ");

	@OriginalMember(owner = "client!ca", name = "u", descriptor = "Lclient!mb;")
	public static Class45 aClass45_174 = Static63.method1251("mapdots");

	@OriginalMember(owner = "client!ca", name = "x", descriptor = "Lclient!mb;")
	public static Class45 aClass45_175 = Static63.method1251("Welt");

	@OriginalMember(owner = "client!ca", name = "F", descriptor = "Lclient!mb;")
	private static Class45 aClass45_176 = Static63.method1251("Try again in 60 secs)3)3)3");

	@OriginalMember(owner = "client!ca", name = "H", descriptor = "I")
	public static int anInt380 = 2;

	@OriginalMember(owner = "client!ca", name = "I", descriptor = "Lclient!mb;")
	public static Class45 aClass45_177 = aClass45_176;

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(II)V")
	public static void method223() {
		Static112.anInt2938 = -1;
		Static68.anInt1958 = 2;
		Static47.aClass29_31 = null;
		Static60.anInt1802 = -1;
		Static34.aBoolean48 = false;
		Static51.anInt1613 = 0;
		Static45.anInt1317 = 1;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IB)V")
	public static void method224(@OriginalArg(0) int arg0) {
		if (!Static36.method768(arg0)) {
			return;
		}
		@Pc(14) Class5_Sub2_Sub8[] local14 = Static19.aClass5_Sub2_Sub8ArrayArray1[arg0];
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(27) Class5_Sub2_Sub8 local27 = local14[local16];
			if (local27 != null) {
				local27.anInt1257 = 0;
				local27.anInt1236 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(B)V")
	public static void method225() {
		Static9.aClass11_17.method2152();
		Static117.aClass5_Sub2_Sub6_Sub4_48.method1874(0, 0);
		Static121.anIntArray353 = Static86.method1661(Static121.anIntArray353);
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(ZZB)I")
	public static int method226() {
		return Static75.anInt2176 + Static84.anInt2339;
	}

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "(B)V")
	public static void method231() {
		aClass11_18 = null;
		aClass45_175 = null;
		aClass67_3 = null;
		aClass45_170 = null;
		aClass45_174 = null;
		aClass45_171 = null;
		aClass45_177 = null;
		aClass45_173 = null;
		aClass45Array3 = null;
		aClass45_172 = null;
		aClass45_176 = null;
		aClass5_Sub2_Sub6_Sub4_9 = null;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lclient!sd;III)Lclient!sc;")
	public static Class5_Sub2_Sub6_Sub4 method232(@OriginalArg(0) Class29 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return Static106.method1918(arg1, arg0, arg2) ? Static54.method1130() : null;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Z)V")
	public static void method236() {
		for (@Pc(11) int local11 = 0; local11 < Static62.anInt1819; local11++) {
			@Pc(17) int local17 = Static70.anIntArray297[local11];
			@Pc(21) Class5_Sub2_Sub4_Sub3_Sub2 local21 = Static54.aClass5_Sub2_Sub4_Sub3_Sub2Array1[local17];
			if (local21 != null) {
				Static61.method1222(local21.aClass5_Sub2_Sub17_1.anInt3057, local21);
			}
		}
	}

	@OriginalMember(owner = "client!ca", name = "d", descriptor = "(B)V")
	public static void method237() {
		Static55.anInt1659 = 0;
		@Pc(12) int local12 = Static78.anInt2210 + (Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anInt2428 >> 7);
		@Pc(19) int local19 = Static6.anInt162 + (Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anInt2417 >> 7);
		if (local12 >= 3053 && local12 <= 3156 && local19 >= 3056 && local19 <= 3136) {
			Static55.anInt1659 = 1;
		}
		if (local12 >= 3072 && local12 <= 3118 && local19 >= 9492 && local19 <= 9535) {
			Static55.anInt1659 = 1;
		}
		if (Static55.anInt1659 == 1 && local12 >= 3139 && local12 <= 3199 && local19 >= 3008 && local19 <= 3062) {
			Static55.anInt1659 = 0;
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIIIIIIIIIZ)Z")
	public static boolean method238(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) boolean arg10) {
		@Pc(4) int local4;
		for (@Pc(1) int local1 = 0; local1 < 104; local1++) {
			for (local4 = 0; local4 < 104; local4++) {
				Static108.anIntArrayArray30[local1][local4] = 0;
				Static36.anIntArrayArray14[local1][local4] = 99999999;
			}
		}
		local4 = arg0;
		Static108.anIntArrayArray30[arg0][arg2] = 99;
		Static36.anIntArrayArray14[arg0][arg2] = 0;
		@Pc(47) byte local47 = 0;
		@Pc(49) int local49 = arg2;
		@Pc(51) int local51 = 0;
		@Pc(53) boolean local53 = false;
		Static102.anIntArray422[0] = arg0;
		@Pc(60) int local60 = local47 + 1;
		Static92.anIntArray478[0] = arg2;
		@Pc(67) int[][] local67 = Static51.aClass37Array1[Static8.anInt262].anIntArrayArray19;
		@Pc(70) int local70 = Static102.anIntArray422.length;
		@Pc(179) int local179;
		while (local51 != local60) {
			local49 = Static92.anIntArray478[local51];
			local4 = Static102.anIntArray422[local51];
			local51 = (local51 + 1) % local70;
			if (local4 == arg5 && arg9 == local49) {
				local53 = true;
				break;
			}
			if (arg8 != 0) {
				if ((arg8 < 5 || arg8 == 10) && Static51.aClass37Array1[Static8.anInt262].method1113(arg5, arg3, local49, arg8 - 1, arg9, local4)) {
					local53 = true;
					break;
				}
				if (arg8 < 10 && Static51.aClass37Array1[Static8.anInt262].method1128(arg3, arg9, local49, local4, arg5, arg8 - 1)) {
					local53 = true;
					break;
				}
			}
			if (arg7 != 0 && arg1 != 0 && Static51.aClass37Array1[Static8.anInt262].method1123(arg5, arg9, arg1, local49, arg7, arg4, local4)) {
				local53 = true;
				break;
			}
			local179 = Static36.anIntArrayArray14[local4][local49] + 1;
			if (local4 > 0 && Static108.anIntArrayArray30[local4 - 1][local49] == 0 && (local67[local4 - 1][local49] & 0x1280108) == 0) {
				Static102.anIntArray422[local60] = local4 - 1;
				Static92.anIntArray478[local60] = local49;
				Static108.anIntArrayArray30[local4 - 1][local49] = 2;
				local60 = (local60 + 1) % local70;
				Static36.anIntArrayArray14[local4 - 1][local49] = local179;
			}
			if (local4 < 103 && Static108.anIntArrayArray30[local4 + 1][local49] == 0 && (local67[local4 + 1][local49] & 0x1280180) == 0) {
				Static102.anIntArray422[local60] = local4 + 1;
				Static92.anIntArray478[local60] = local49;
				local60 = (local60 + 1) % local70;
				Static108.anIntArrayArray30[local4 + 1][local49] = 8;
				Static36.anIntArrayArray14[local4 + 1][local49] = local179;
			}
			if (local49 > 0 && Static108.anIntArrayArray30[local4][local49 - 1] == 0 && (local67[local4][local49 - 1] & 0x1280102) == 0) {
				Static102.anIntArray422[local60] = local4;
				Static92.anIntArray478[local60] = local49 - 1;
				local60 = (local60 + 1) % local70;
				Static108.anIntArrayArray30[local4][local49 - 1] = 1;
				Static36.anIntArrayArray14[local4][local49 - 1] = local179;
			}
			if (local49 < 103 && Static108.anIntArrayArray30[local4][local49 + 1] == 0 && (local67[local4][local49 + 1] & 0x1280120) == 0) {
				Static102.anIntArray422[local60] = local4;
				Static92.anIntArray478[local60] = local49 + 1;
				Static108.anIntArrayArray30[local4][local49 + 1] = 4;
				local60 = (local60 + 1) % local70;
				Static36.anIntArrayArray14[local4][local49 + 1] = local179;
			}
			if (local4 > 0 && local49 > 0 && Static108.anIntArrayArray30[local4 - 1][local49 - 1] == 0 && (local67[local4 - 1][local49 - 1] & 0x128010E) == 0 && (local67[local4 - 1][local49] & 0x1280108) == 0 && (local67[local4][local49 - 1] & 0x1280102) == 0) {
				Static102.anIntArray422[local60] = local4 - 1;
				Static92.anIntArray478[local60] = local49 - 1;
				Static108.anIntArrayArray30[local4 - 1][local49 - 1] = 3;
				Static36.anIntArrayArray14[local4 - 1][local49 - 1] = local179;
				local60 = (local60 + 1) % local70;
			}
			if (local4 < 103 && local49 > 0 && Static108.anIntArrayArray30[local4 + 1][local49 - 1] == 0 && (local67[local4 + 1][local49 - 1] & 0x1280183) == 0 && (local67[local4 + 1][local49] & 0x1280180) == 0 && (local67[local4][local49 - 1] & 0x1280102) == 0) {
				Static102.anIntArray422[local60] = local4 + 1;
				Static92.anIntArray478[local60] = local49 - 1;
				local60 = (local60 + 1) % local70;
				Static108.anIntArrayArray30[local4 + 1][local49 - 1] = 9;
				Static36.anIntArrayArray14[local4 + 1][local49 - 1] = local179;
			}
			if (local4 > 0 && local49 < 103 && Static108.anIntArrayArray30[local4 - 1][local49 + 1] == 0 && (local67[local4 - 1][local49 + 1] & 0x1280138) == 0 && (local67[local4 - 1][local49] & 0x1280108) == 0 && (local67[local4][local49 + 1] & 0x1280120) == 0) {
				Static102.anIntArray422[local60] = local4 - 1;
				Static92.anIntArray478[local60] = local49 + 1;
				Static108.anIntArrayArray30[local4 - 1][local49 + 1] = 6;
				local60 = (local60 + 1) % local70;
				Static36.anIntArrayArray14[local4 - 1][local49 + 1] = local179;
			}
			if (local4 < 103 && local49 < 103 && Static108.anIntArrayArray30[local4 + 1][local49 + 1] == 0 && (local67[local4 + 1][local49 + 1] & 0x12801E0) == 0 && (local67[local4 + 1][local49] & 0x1280180) == 0 && (local67[local4][local49 + 1] & 0x1280120) == 0) {
				Static102.anIntArray422[local60] = local4 + 1;
				Static92.anIntArray478[local60] = local49 + 1;
				Static108.anIntArrayArray30[local4 + 1][local49 + 1] = 12;
				Static36.anIntArrayArray14[local4 + 1][local49 + 1] = local179;
				local60 = (local60 + 1) % local70;
			}
		}
		Static71.anInt2070 = 0;
		@Pc(797) int local797;
		@Pc(804) int local804;
		@Pc(810) int local810;
		if (!local53) {
			if (!arg10) {
				return false;
			}
			local179 = 1000;
			local797 = 100;
			for (local804 = arg5 - 10; local804 <= arg5 + 10; local804++) {
				for (local810 = arg9 - 10; local810 <= arg9 + 10; local810++) {
					if (local804 >= 0 && local810 >= 0 && local804 < 104 && local810 < 104 && Static36.anIntArrayArray14[local804][local810] < 100) {
						@Pc(837) int local837 = 0;
						if (local804 < arg5) {
							local837 = arg5 - local804;
						} else if (arg7 + arg5 - 1 < local804) {
							local837 = local804 + 1 - arg5 - arg7;
						}
						@Pc(872) int local872 = 0;
						if (arg9 > local810) {
							local872 = arg9 - local810;
						} else if (local810 > arg9 + arg1 - 1) {
							local872 = local810 + 1 - arg9 - arg1;
						}
						@Pc(909) int local909 = local872 * local872 + local837 * local837;
						if (local909 < local179 || local179 == local909 && local797 > Static36.anIntArrayArray14[local804][local810]) {
							local4 = local804;
							local49 = local810;
							local179 = local909;
							local797 = Static36.anIntArrayArray14[local804][local810];
						}
					}
				}
			}
			if (local179 == 1000) {
				return false;
			}
			if (arg0 == local4 && local49 == arg2) {
				return false;
			}
			Static71.anInt2070 = 1;
		}
		@Pc(983) byte local983 = 0;
		Static102.anIntArray422[0] = local4;
		local51 = local983 + 1;
		Static92.anIntArray478[0] = local49;
		local179 = local797 = Static108.anIntArrayArray30[local4][local49];
		while (local4 != arg0 || arg2 != local49) {
			if (local797 != local179) {
				local797 = local179;
				Static102.anIntArray422[local51] = local4;
				Static92.anIntArray478[local51++] = local49;
			}
			if ((local179 & 0x2) != 0) {
				local4++;
			} else if ((local179 & 0x8) != 0) {
				local4--;
			}
			if ((local179 & 0x1) != 0) {
				local49++;
			} else if ((local179 & 0x4) != 0) {
				local49--;
			}
			local179 = Static108.anIntArrayArray30[local4][local49];
		}
		if (local51 > 0) {
			local70 = local51;
			if (local51 > 25) {
				local70 = 25;
			}
			local51--;
			local804 = Static92.anIntArray478[local51];
			@Pc(1093) int local1093 = Static102.anIntArray422[local51];
			if (arg6 == 0) {
				Static64.aClass5_Sub9_Sub1_2.method1466(196);
				Static64.aClass5_Sub9_Sub1_2.method1428(local70 + local70 + 3);
			}
			if (arg6 == 1) {
				Static64.aClass5_Sub9_Sub1_2.method1466(234);
				Static64.aClass5_Sub9_Sub1_2.method1428(local70 + local70 + 3 + 14);
			}
			if (arg6 == 2) {
				Static64.aClass5_Sub9_Sub1_2.method1466(96);
				Static64.aClass5_Sub9_Sub1_2.method1428(local70 + local70 + 3);
			}
			Static64.aClass5_Sub9_Sub1_2.method1431(Static7.aBooleanArray1[82] ? 1 : 0);
			Static64.aClass5_Sub9_Sub1_2.method1455(Static6.anInt162 + local804);
			Static64.aClass5_Sub9_Sub1_2.method1430(Static78.anInt2210 + local1093);
			Static1.anInt6 = Static102.anIntArray422[0];
			Static31.anInt924 = Static92.anIntArray478[0];
			for (local810 = 1; local810 < local70; local810++) {
				local51--;
				Static64.aClass5_Sub9_Sub1_2.method1425(Static102.anIntArray422[local51] - local1093);
				Static64.aClass5_Sub9_Sub1_2.method1425(Static92.anIntArray478[local51] - local804);
			}
			return true;
		} else if (arg6 == 1) {
			return false;
		} else {
			return true;
		}
	}
}
