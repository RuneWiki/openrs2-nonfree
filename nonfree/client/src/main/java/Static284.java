import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static284 {

	@OriginalMember(owner = "client!jha", name = "l", descriptor = "Lclient!si;")
	public static final Class335 aClass335_14 = new Class335(4);

	@OriginalMember(owner = "client!jha", name = "a", descriptor = "(B)[Lclient!hk;")
	public static Class146[] method4756() {
		return new Class146[] { Static374.aClass146_7, Static63.aClass146_2, Static191.aClass146_4, Static637.aClass146_14, Static509.aClass146_12, Static77.aClass146_3, Static8.aClass146_1, Static485.aClass146_11, Static558.aClass146_13, Static469.aClass146_10, Static207.aClass146_6, Static206.aClass146_5, Static407.aClass146_8, Static468.aClass146_9 };
	}

	@OriginalMember(owner = "client!jha", name = "b", descriptor = "(B)Z")
	public static boolean method4758() {
		return Static579.anInt10049 >= 1;
	}

	@OriginalMember(owner = "client!jha", name = "a", descriptor = "(IIBIIIIIILclient!kn;I)Z")
	public static boolean method4759(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class200 arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg3;
		@Pc(14) int local14 = arg6;
		@Pc(23) int local23 = arg3 - 64;
		@Pc(28) int local28 = arg6 - 64;
		Static296.anIntArrayArray19[64][64] = 99;
		Static96.anIntArrayArray16[64][64] = 0;
		@Pc(42) byte local42 = 0;
		@Pc(44) int local44 = 0;
		Static456.anIntArray409[0] = arg3;
		@Pc(51) int local51 = local42 + 1;
		Static312.anIntArray288[0] = arg6;
		@Pc(56) int[][] local56 = arg8.anIntArrayArray23;
		while (local44 != local51) {
			local7 = Static456.anIntArray409[local44];
			local14 = Static312.anIntArray288[local44];
			@Pc(70) int local70 = local14 - local28;
			@Pc(75) int local75 = local7 - local23;
			local44 = local44 + 1 & 0xFFF;
			@Pc(87) int local87 = local7 - arg8.anInt5838;
			@Pc(93) int local93 = local14 - arg8.anInt5851;
			if (arg2 == -4) {
				if (local7 == arg7 && local14 == arg5) {
					Static503.anInt8360 = local7;
					Static539.anInt9400 = local14;
					return true;
				}
			} else if (arg2 == -3) {
				if (Static476.method7598(arg7, arg5, local14, arg4, arg9, 2, local7, 2)) {
					Static539.anInt9400 = local14;
					Static503.anInt8360 = local7;
					return true;
				}
			} else if (arg2 == -2) {
				if (arg8.method5284(2, 2, local14, local7, arg9, arg4, arg5, arg0, arg7)) {
					Static539.anInt9400 = local14;
					Static503.anInt8360 = local7;
					return true;
				}
			} else if (arg2 == -1) {
				if (arg8.method5296(2, local7, arg4, arg9, arg5, arg0, arg7, local14)) {
					Static503.anInt8360 = local7;
					Static539.anInt9400 = local14;
					return true;
				}
			} else if (arg2 == 0 || arg2 == 1 || arg2 == 2 || arg2 == 3 || arg2 == 9) {
				if (arg8.method5300(2, arg2, arg5, arg1, arg7, local7, local14)) {
					Static539.anInt9400 = local14;
					Static503.anInt8360 = local7;
					return true;
				}
			} else if (arg8.method5283(local14, arg2, arg1, 2, arg7, arg5, local7)) {
				Static503.anInt8360 = local7;
				Static539.anInt9400 = local14;
				return true;
			}
			@Pc(237) int local237 = Static96.anIntArrayArray16[local75][local70] + 1;
			if (local75 > 0 && Static296.anIntArrayArray19[local75 - 1][local70] == 0 && (local56[local87 - 1][local93] & 0x43A40000) == 0 && (local56[local87 - 1][local93 + 1] & 0x4E240000) == 0) {
				Static456.anIntArray409[local51] = local7 - 1;
				Static312.anIntArray288[local51] = local14;
				Static296.anIntArrayArray19[local75 - 1][local70] = 2;
				local51 = local51 + 1 & 0xFFF;
				Static96.anIntArrayArray16[local75 - 1][local70] = local237;
			}
			if (local75 < 126 && Static296.anIntArrayArray19[local75 + 1][local70] == 0 && (local56[local87 + 2][local93] & 0x60E40000) == 0 && (local56[local87 + 2][local93 + 1] & 0x78240000) == 0) {
				Static456.anIntArray409[local51] = local7 + 1;
				Static312.anIntArray288[local51] = local14;
				Static296.anIntArrayArray19[local75 + 1][local70] = 8;
				local51 = local51 + 1 & 0xFFF;
				Static96.anIntArrayArray16[local75 + 1][local70] = local237;
			}
			if (local70 > 0 && Static296.anIntArrayArray19[local75][local70 - 1] == 0 && (local56[local87][local93 - 1] & 0x43A40000) == 0 && (local56[local87 + 1][local93 - 1] & 0x60E40000) == 0) {
				Static456.anIntArray409[local51] = local7;
				Static312.anIntArray288[local51] = local14 - 1;
				Static296.anIntArrayArray19[local75][local70 - 1] = 1;
				local51 = local51 + 1 & 0xFFF;
				Static96.anIntArrayArray16[local75][local70 - 1] = local237;
			}
			if (local70 < 126 && Static296.anIntArrayArray19[local75][local70 + 1] == 0 && (local56[local87][local93 + 2] & 0x4E240000) == 0 && (local56[local87 + 1][local93 + 2] & 0x78240000) == 0) {
				Static456.anIntArray409[local51] = local7;
				Static312.anIntArray288[local51] = local14 + 1;
				Static296.anIntArrayArray19[local75][local70 + 1] = 4;
				local51 = local51 + 1 & 0xFFF;
				Static96.anIntArrayArray16[local75][local70 + 1] = local237;
			}
			if (local75 > 0 && local70 > 0 && Static296.anIntArrayArray19[local75 - 1][local70 - 1] == 0 && (local56[local87 - 1][local93] & 0x4FA40000) == 0 && (local56[local87 - 1][local93 - 1] & 0x43A40000) == 0 && (local56[local87][local93 - 1] & 0x63E40000) == 0) {
				Static456.anIntArray409[local51] = local7 - 1;
				Static312.anIntArray288[local51] = local14 - 1;
				local51 = local51 + 1 & 0xFFF;
				Static296.anIntArrayArray19[local75 - 1][local70 - 1] = 3;
				Static96.anIntArrayArray16[local75 - 1][local70 - 1] = local237;
			}
			if (local75 < 126 && local70 > 0 && Static296.anIntArrayArray19[local75 + 1][local70 - 1] == 0 && (local56[local87 + 1][local93 - 1] & 0x63E40000) == 0 && (local56[local87 + 2][local93 - 1] & 0x60E40000) == 0 && (local56[local87 + 2][local93] & 0x78E40000) == 0) {
				Static456.anIntArray409[local51] = local7 + 1;
				Static312.anIntArray288[local51] = local14 - 1;
				Static296.anIntArrayArray19[local75 + 1][local70 - 1] = 9;
				local51 = local51 + 1 & 0xFFF;
				Static96.anIntArrayArray16[local75 + 1][local70 - 1] = local237;
			}
			if (local75 > 0 && local70 < 126 && Static296.anIntArrayArray19[local75 - 1][local70 + 1] == 0 && (local56[local87 - 1][local93 + 1] & 0x4FA40000) == 0 && (local56[local87 - 1][local93 + 2] & 0x4E240000) == 0 && (local56[local87][local93 + 2] & 0x7E240000) == 0) {
				Static456.anIntArray409[local51] = local7 - 1;
				Static312.anIntArray288[local51] = local14 + 1;
				Static296.anIntArrayArray19[local75 - 1][local70 + 1] = 6;
				local51 = local51 + 1 & 0xFFF;
				Static96.anIntArrayArray16[local75 - 1][local70 + 1] = local237;
			}
			if (local75 < 126 && local70 < 126 && Static296.anIntArrayArray19[local75 + 1][local70 + 1] == 0 && (local56[local87 + 1][local93 + 2] & 0x7E240000) == 0 && (local56[local87 + 2][local93 + 2] & 0x78240000) == 0 && (local56[local87 + 2][local93 + 1] & 0x78E40000) == 0) {
				Static456.anIntArray409[local51] = local7 + 1;
				Static312.anIntArray288[local51] = local14 + 1;
				local51 = local51 + 1 & 0xFFF;
				Static296.anIntArrayArray19[local75 + 1][local70 + 1] = 12;
				Static96.anIntArrayArray16[local75 + 1][local70 + 1] = local237;
			}
		}
		Static503.anInt8360 = local7;
		Static539.anInt9400 = local14;
		return false;
	}

	@OriginalMember(owner = "client!jha", name = "a", descriptor = "(Z)V")
	public static void method4761() {
		Static248.method4408(11);
		Static131.method2328();
		System.gc();
	}

	@OriginalMember(owner = "client!jha", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method4763(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(25) String local25 = Static426.method9517(arg0);
		if (local25 == null) {
			return;
		}
		for (@Pc(30) int local30 = 0; local30 < Static340.anInt6395; local30++) {
			@Pc(36) String local36 = Static438.aStringArray47[local30];
			if (local36.startsWith("*")) {
				local36 = local36.substring(1);
			}
			local36 = Static426.method9517(local36);
			if (local36 != null && local36.equals(local25)) {
				Static340.anInt6395--;
				for (@Pc(60) int local60 = local30; local60 < Static340.anInt6395; local60++) {
					Static438.aStringArray47[local60] = Static438.aStringArray47[local60 + 1];
					Static520.aStringArray59[local60] = Static520.aStringArray59[local60 + 1];
					Static568.anIntArray497[local60] = Static568.anIntArray497[local60 + 1];
					Static24.aStringArray2[local60] = Static24.aStringArray2[local60 + 1];
					Static345.anIntArray316[local60] = Static345.anIntArray316[local60 + 1];
					Static290.aBooleanArray46[local60] = Static290.aBooleanArray46[local60 + 1];
				}
				Static194.anInt4135 = Static397.anInt11030;
				@Pc(129) Class2_Sub52 local129 = Static311.method5098(Static532.aClass341_89, Static125.aClass179_1);
				local129.aClass2_Sub8_Sub2_2.method5170(Static297.method4908(arg0));
				local129.aClass2_Sub8_Sub2_2.method5212(arg0);
				Static38.method791(local129);
				return;
			}
		}
	}
}
