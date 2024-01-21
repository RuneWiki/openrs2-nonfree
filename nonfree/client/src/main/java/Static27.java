import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!ci", name = "G", descriptor = "I")
	public static int anInt4466;

	@OriginalMember(owner = "client!ci", name = "H", descriptor = "Lclient!sa;")
	public static Class3_Sub1_Sub4_Sub4 aClass3_Sub1_Sub4_Sub4_41;

	@OriginalMember(owner = "client!ci", name = "J", descriptor = "[I")
	public static int[] anIntArray523;

	@OriginalMember(owner = "client!ci", name = "s", descriptor = "Lclient!af;")
	public static final Class5 aClass5_65 = new Class5(100);

	@OriginalMember(owner = "client!ci", name = "t", descriptor = "I")
	public static int anInt4460 = 0;

	@OriginalMember(owner = "client!ci", name = "x", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1730 = Static120.method1824("nav");

	@OriginalMember(owner = "client!ci", name = "z", descriptor = "[I")
	public static final int[] anIntArray522 = new int[256];

	@OriginalMember(owner = "client!ci", name = "C", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_1732 = Static120.method1824("Please wait)3)3)3");

	@OriginalMember(owner = "client!ci", name = "A", descriptor = "Lclient!rd;")
	public static Class80 aClass80_1731 = aClass80_1732;

	@OriginalMember(owner = "client!ci", name = "B", descriptor = "I")
	public static int anInt4463 = 0;

	@OriginalMember(owner = "client!ci", name = "F", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1733 = Static120.method1824("<)4col>");

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method3146(@OriginalArg(1) Component arg0) {
		@Pc(5) Method local5 = Static117.aMethod2;
		if (local5 != null) {
			try {
				local5.invoke(arg0, Boolean.FALSE);
			} catch (@Pc(19) Throwable local19) {
			}
		}
		arg0.addKeyListener(Static13.aClass37_1);
		arg0.addFocusListener(Static13.aClass37_1);
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIIZIIIIBII)Z")
	public static boolean method3147(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(11) int local11;
		for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
			for (local11 = 0; local11 < 104; local11++) {
				Static81.anIntArrayArray18[local7][local11] = 0;
				Static154.anIntArrayArray36[local7][local11] = 99999999;
			}
		}
		Static81.anIntArrayArray18[arg8][arg2] = 99;
		local11 = arg8;
		@Pc(45) int local45 = arg2;
		Static154.anIntArrayArray36[arg8][arg2] = 0;
		@Pc(58) byte local58 = 0;
		@Pc(60) int local60 = 0;
		Static19.anIntArray66[0] = arg8;
		@Pc(67) int local67 = local58 + 1;
		Static168.anIntArray459[0] = arg2;
		@Pc(71) boolean local71 = false;
		@Pc(74) int local74 = Static19.anIntArray66.length;
		@Pc(79) int[][] local79 = Static32.aClass82Array11[Static153.anInt673].anIntArrayArray38;
		@Pc(190) int local190;
		while (local67 != local60) {
			local11 = Static19.anIntArray66[local60];
			local45 = Static168.anIntArray459[local60];
			local60 = (local60 + 1) % local74;
			if (arg3 == local11 && arg1 == local45) {
				local71 = true;
				break;
			}
			if (arg6 != 0) {
				if ((arg6 < 5 || arg6 == 10) && Static32.aClass82Array11[Static153.anInt673].method2507(arg10, local11, arg3, local45, arg6 - 1, arg1)) {
					local71 = true;
					break;
				}
				if (arg6 < 10 && Static32.aClass82Array11[Static153.anInt673].method2517(arg10, arg3, arg6 - 1, local11, arg1, local45)) {
					local71 = true;
					break;
				}
			}
			if (arg9 != 0 && arg0 != 0 && Static32.aClass82Array11[Static153.anInt673].method2518(arg1, arg3, local11, arg0, arg7, local45, arg9)) {
				local71 = true;
				break;
			}
			local190 = Static154.anIntArrayArray36[local11][local45] + 1;
			if (local11 > 0 && Static81.anIntArrayArray18[local11 - 1][local45] == 0 && (local79[local11 - 1][local45] & 0x12C0108) == 0) {
				Static19.anIntArray66[local67] = local11 - 1;
				Static168.anIntArray459[local67] = local45;
				local67 = (local67 + 1) % local74;
				Static81.anIntArrayArray18[local11 - 1][local45] = 2;
				Static154.anIntArrayArray36[local11 - 1][local45] = local190;
			}
			if (local11 < 103 && Static81.anIntArrayArray18[local11 + 1][local45] == 0 && (local79[local11 + 1][local45] & 0x12C0180) == 0) {
				Static19.anIntArray66[local67] = local11 + 1;
				Static168.anIntArray459[local67] = local45;
				Static81.anIntArrayArray18[local11 + 1][local45] = 8;
				Static154.anIntArrayArray36[local11 + 1][local45] = local190;
				local67 = (local67 + 1) % local74;
			}
			if (local45 > 0 && Static81.anIntArrayArray18[local11][local45 - 1] == 0 && (local79[local11][local45 - 1] & 0x12C0102) == 0) {
				Static19.anIntArray66[local67] = local11;
				Static168.anIntArray459[local67] = local45 - 1;
				Static81.anIntArrayArray18[local11][local45 - 1] = 1;
				Static154.anIntArrayArray36[local11][local45 - 1] = local190;
				local67 = (local67 + 1) % local74;
			}
			if (local45 < 103 && Static81.anIntArrayArray18[local11][local45 + 1] == 0 && (local79[local11][local45 + 1] & 0x12C0120) == 0) {
				Static19.anIntArray66[local67] = local11;
				Static168.anIntArray459[local67] = local45 + 1;
				local67 = (local67 + 1) % local74;
				Static81.anIntArrayArray18[local11][local45 + 1] = 4;
				Static154.anIntArrayArray36[local11][local45 + 1] = local190;
			}
			if (local11 > 0 && local45 > 0 && Static81.anIntArrayArray18[local11 - 1][local45 - 1] == 0 && (local79[local11 - 1][local45 - 1] & 0x12C010E) == 0 && (local79[local11 - 1][local45] & 0x12C0108) == 0 && (local79[local11][local45 - 1] & 0x12C0102) == 0) {
				Static19.anIntArray66[local67] = local11 - 1;
				Static168.anIntArray459[local67] = local45 - 1;
				Static81.anIntArrayArray18[local11 - 1][local45 - 1] = 3;
				local67 = (local67 + 1) % local74;
				Static154.anIntArrayArray36[local11 - 1][local45 - 1] = local190;
			}
			if (local11 < 103 && local45 > 0 && Static81.anIntArrayArray18[local11 + 1][local45 - 1] == 0 && (local79[local11 + 1][local45 - 1] & 0x12C0183) == 0 && (local79[local11 + 1][local45] & 0x12C0180) == 0 && (local79[local11][local45 - 1] & 0x12C0102) == 0) {
				Static19.anIntArray66[local67] = local11 + 1;
				Static168.anIntArray459[local67] = local45 - 1;
				local67 = (local67 + 1) % local74;
				Static81.anIntArrayArray18[local11 + 1][local45 - 1] = 9;
				Static154.anIntArrayArray36[local11 + 1][local45 - 1] = local190;
			}
			if (local11 > 0 && local45 < 103 && Static81.anIntArrayArray18[local11 - 1][local45 + 1] == 0 && (local79[local11 - 1][local45 + 1] & 0x12C0138) == 0 && (local79[local11 - 1][local45] & 0x12C0108) == 0 && (local79[local11][local45 + 1] & 0x12C0120) == 0) {
				Static19.anIntArray66[local67] = local11 - 1;
				Static168.anIntArray459[local67] = local45 + 1;
				Static81.anIntArrayArray18[local11 - 1][local45 + 1] = 6;
				Static154.anIntArrayArray36[local11 - 1][local45 + 1] = local190;
				local67 = (local67 + 1) % local74;
			}
			if (local11 < 103 && local45 < 103 && Static81.anIntArrayArray18[local11 + 1][local45 + 1] == 0 && (local79[local11 + 1][local45 + 1] & 0x12C01E0) == 0 && (local79[local11 + 1][local45] & 0x12C0180) == 0 && (local79[local11][local45 + 1] & 0x12C0120) == 0) {
				Static19.anIntArray66[local67] = local11 + 1;
				Static168.anIntArray459[local67] = local45 + 1;
				Static81.anIntArrayArray18[local11 + 1][local45 + 1] = 12;
				Static154.anIntArrayArray36[local11 + 1][local45 + 1] = local190;
				local67 = (local67 + 1) % local74;
			}
		}
		Static116.anInt4481 = 0;
		@Pc(801) int local801;
		@Pc(806) int local806;
		@Pc(812) int local812;
		if (!local71) {
			if (!arg4) {
				return false;
			}
			local190 = 1000;
			local801 = 100;
			for (local806 = arg3 - 10; local806 <= arg3 + 10; local806++) {
				for (local812 = arg1 - 10; local812 <= arg1 + 10; local812++) {
					if (local806 >= 0 && local812 >= 0 && local806 < 104 && local812 < 104 && Static154.anIntArrayArray36[local806][local812] < 100) {
						@Pc(833) int local833 = 0;
						if (local806 < arg3) {
							local833 = arg3 - local806;
						} else if (local806 > arg3 + arg9 - 1) {
							local833 = local806 + 1 - arg3 - arg9;
						}
						@Pc(861) int local861 = 0;
						if (arg1 > local812) {
							local861 = arg1 - local812;
						} else if (local812 > arg0 + arg1 - 1) {
							local861 = local812 + 1 - arg0 - arg1;
						}
						@Pc(902) int local902 = local861 * local861 + local833 * local833;
						if (local190 > local902 || local190 == local902 && local801 > Static154.anIntArrayArray36[local806][local812]) {
							local11 = local806;
							local801 = Static154.anIntArrayArray36[local806][local812];
							local45 = local812;
							local190 = local902;
						}
					}
				}
			}
			if (local190 == 1000) {
				return false;
			}
			if (arg8 == local11 && local45 == arg2) {
				return false;
			}
			Static116.anInt4481 = 1;
		}
		@Pc(977) byte local977 = 0;
		Static19.anIntArray66[0] = local11;
		local60 = local977 + 1;
		Static168.anIntArray459[0] = local45;
		local190 = local801 = Static81.anIntArrayArray18[local11][local45];
		while (arg8 != local11 || arg2 != local45) {
			if (local801 != local190) {
				Static19.anIntArray66[local60] = local11;
				Static168.anIntArray459[local60++] = local45;
				local801 = local190;
			}
			if ((local190 & 0x1) != 0) {
				local45++;
			} else if ((local190 & 0x4) != 0) {
				local45--;
			}
			if ((local190 & 0x2) != 0) {
				local11++;
			} else if ((local190 & 0x8) != 0) {
				local11--;
			}
			local190 = Static81.anIntArrayArray18[local11][local45];
		}
		if (local60 > 0) {
			local74 = local60;
			if (local60 > 25) {
				local74 = 25;
			}
			local60--;
			local806 = Static168.anIntArray459[local60];
			@Pc(1084) int local1084 = Static19.anIntArray66[local60];
			if (arg5 == 0) {
				Static146.aClass3_Sub17_Sub1_3.method2146(248);
				Static146.aClass3_Sub17_Sub1_3.method2108(local74 + local74 + 3);
			}
			if (arg5 == 1) {
				Static146.aClass3_Sub17_Sub1_3.method2146(165);
				Static146.aClass3_Sub17_Sub1_3.method2108(local74 + local74 + 17);
			}
			if (arg5 == 2) {
				Static146.aClass3_Sub17_Sub1_3.method2146(207);
				Static146.aClass3_Sub17_Sub1_3.method2108(local74 + local74 + 3);
			}
			Static146.aClass3_Sub17_Sub1_3.method2106(Static11.aBooleanArray2[82] ? 1 : 0);
			Static171.anInt3847 = Static168.anIntArray459[0];
			Static49.anInt1087 = Static19.anIntArray66[0];
			for (local812 = 1; local812 < local74; local812++) {
				local60--;
				Static146.aClass3_Sub17_Sub1_3.method2108(Static19.anIntArray66[local60] - local1084);
				Static146.aClass3_Sub17_Sub1_3.method2108(Static168.anIntArray459[local60] - local806);
			}
			Static146.aClass3_Sub17_Sub1_3.method2118(local806 + Static39.anInt875);
			Static146.aClass3_Sub17_Sub1_3.method2118(local1084 + Static97.anInt2062);
			return true;
		} else if (arg5 == 1) {
			return false;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ci", name = "d", descriptor = "(I)V")
	public static void method3149() {
		if (Static117.aString4.toLowerCase().indexOf("microsoft") != -1) {
			Static108.anIntArray386[221] = 43;
			Static108.anIntArray386[223] = 28;
			Static108.anIntArray386[190] = 72;
			Static108.anIntArray386[187] = 27;
			Static108.anIntArray386[192] = 58;
			Static108.anIntArray386[220] = 74;
			Static108.anIntArray386[222] = 59;
			Static108.anIntArray386[186] = 57;
			Static108.anIntArray386[191] = 73;
			Static108.anIntArray386[219] = 42;
			Static108.anIntArray386[189] = 26;
			Static108.anIntArray386[188] = 71;
			return;
		}
		Static108.anIntArray386[46] = 72;
		Static108.anIntArray386[59] = 57;
		Static108.anIntArray386[92] = 74;
		Static108.anIntArray386[91] = 42;
		Static108.anIntArray386[44] = 71;
		Static108.anIntArray386[61] = 27;
		Static108.anIntArray386[93] = 43;
		Static108.anIntArray386[45] = 26;
		Static108.anIntArray386[47] = 73;
		if (Static117.aMethod2 == null) {
			Static108.anIntArray386[192] = 58;
			Static108.anIntArray386[222] = 59;
		} else {
			Static108.anIntArray386[520] = 59;
			Static108.anIntArray386[192] = 28;
			Static108.anIntArray386[222] = 58;
		}
	}

	@OriginalMember(owner = "client!ci", name = "c", descriptor = "(B)V")
	public static void method3151() {
		Static193.anIntArray517 = null;
		Static140.anIntArray389 = null;
		Static172.anIntArray466 = null;
		Static20.aByteArrayArrayArray2 = null;
		Static126.aByteArrayArrayArray5 = null;
		Static72.anIntArrayArrayArray10 = null;
		Static152.anIntArray432 = null;
		Static51.anIntArray158 = null;
		Static41.aByteArrayArrayArray3 = null;
		Static113.aByteArrayArrayArray4 = null;
		Static185.aByteArrayArrayArray7 = null;
	}

	@OriginalMember(owner = "client!ci", name = "d", descriptor = "(B)V")
	public static void method3152() {
		Static173.anInt3889 = 0;
		@Pc(12) int local12 = Static97.anInt2062 + (Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anInt4329 >> 7);
		@Pc(24) int local24 = Static39.anInt875 + (Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anInt4315 >> 7);
		if (local12 >= 3053 && local12 <= 3156 && local24 >= 3056 && local24 <= 3136) {
			Static173.anInt3889 = 1;
		}
		if (local12 >= 3072 && local12 <= 3118 && local24 >= 9492 && local24 <= 9535) {
			Static173.anInt3889 = 1;
		}
		if (Static173.anInt3889 == 1 && local12 >= 3139 && local12 <= 3199 && local24 >= 3008 && local24 <= 3062) {
			Static173.anInt3889 = 0;
		}
	}
}
