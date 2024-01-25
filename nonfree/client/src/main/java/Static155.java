import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!jm", name = "c", descriptor = "Z")
	public static boolean aBoolean244 = true;

	@OriginalMember(owner = "client!jm", name = "f", descriptor = "I")
	public static int anInt3276 = 0;

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(CB)C")
	public static char method2998(@OriginalArg(0) char arg0) {
		if (arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-') {
			return '_';
		} else if (arg0 == '[' || arg0 == ']' || arg0 == '#') {
			return arg0;
		} else if (arg0 == 'à' || arg0 == 'á' || arg0 == 'â' || arg0 == 'ä' || arg0 == 'ã' || arg0 == 'À' || arg0 == 'Á' || arg0 == 'Â' || arg0 == 'Ä' || arg0 == 'Ã') {
			return 'a';
		} else if (arg0 == 'è' || arg0 == 'é' || arg0 == 'ê' || arg0 == 'ë' || arg0 == 'È' || arg0 == 'É' || arg0 == 'Ê' || arg0 == 'Ë') {
			return 'e';
		} else if (arg0 == 'í' || arg0 == 'î' || arg0 == 'ï' || arg0 == 'Í' || arg0 == 'Î' || arg0 == 'Ï') {
			return 'i';
		} else if (arg0 == 'ò' || arg0 == 'ó' || arg0 == 'ô' || arg0 == 'ö' || arg0 == 'õ' || arg0 == 'Ò' || arg0 == 'Ó' || arg0 == 'Ô' || arg0 == 'Ö' || arg0 == 'Õ') {
			return 'o';
		} else if (arg0 == 'ù' || arg0 == 'ú' || arg0 == 'û' || arg0 == 'ü' || arg0 == 'Ù' || arg0 == 'Ú' || arg0 == 'Û' || arg0 == 'Ü') {
			return 'u';
		} else if (arg0 == 'ç' || arg0 == 'Ç') {
			return 'c';
		} else if (arg0 == 'ÿ' || arg0 == 'Ÿ') {
			return 'y';
		} else if (arg0 == 'ñ' || arg0 == 'Ñ') {
			return 'n';
		} else if (arg0 == 'ß') {
			return 'b';
		} else {
			return Character.toLowerCase(arg0);
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(II[IIBIILclient!oa;ZIII[III)I")
	public static int method2999(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class149 arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int[] arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		for (@Pc(5) int local5 = 0; local5 < 128; local5++) {
			for (@Pc(8) int local8 = 0; local8 < 128; local8++) {
				Static218.anIntArrayArray34[local5][local8] = 0;
				Static342.anIntArrayArray56[local5][local8] = 99999999;
			}
		}
		@Pc(54) boolean local54;
		if (arg9 == 1) {
			local54 = Static85.method1794(arg3, arg4, arg0, arg8, arg13, arg10, arg5, arg1, arg6, arg12);
		} else if (arg9 == 2) {
			local54 = Static243.method4199(arg8, arg4, arg0, arg12, arg6, arg3, arg5, arg13, arg10, arg1);
		} else {
			local54 = Static247.method4267(arg10, arg6, arg3, arg4, arg13, arg5, arg0, arg8, arg9, arg1, arg12);
		}
		@Pc(87) int local87 = arg1 - 64;
		@Pc(91) int local91 = arg10 - 64;
		@Pc(98) int local98 = Static138.anInt3014;
		@Pc(100) int local100 = Static76.anInt1897;
		@Pc(106) int local106;
		@Pc(108) int local108;
		@Pc(115) int local115;
		if (!local54) {
			if (!arg7) {
				return -1;
			}
			local106 = Integer.MAX_VALUE;
			local108 = Integer.MAX_VALUE;
			for (local115 = arg13 - 10; local115 <= arg13 + 10; local115++) {
				for (@Pc(121) int local121 = arg5 - 10; local121 <= arg5 + 10; local121++) {
					@Pc(127) int local127 = local115 - local87;
					@Pc(132) int local132 = local121 - local91;
					if (local127 >= 0 && local132 >= 0 && local127 < 128 && local132 < 128 && Static342.anIntArrayArray56[local127][local132] < 100) {
						@Pc(155) int local155 = 0;
						if (arg13 > local115) {
							local155 = arg13 - local115;
						} else if (arg13 + arg12 - 1 < local115) {
							local155 = local115 + 1 - arg12 - arg13;
						}
						@Pc(187) int local187 = 0;
						if (arg5 > local121) {
							local187 = arg5 - local121;
						} else if (arg5 + arg8 - 1 < local121) {
							local187 = local121 + 1 - arg5 - arg8;
						}
						@Pc(225) int local225 = local155 * local155 + local187 * local187;
						if (local106 > local225 || local106 == local225 && local108 > Static342.anIntArrayArray56[local127][local132]) {
							local108 = Static342.anIntArrayArray56[local127][local132];
							local98 = local115;
							local100 = local121;
							local106 = local225;
						}
					}
				}
			}
			if (~local106 == Integer.MIN_VALUE) {
				return -1;
			}
		}
		if (local98 == arg1 && local100 == arg10) {
			return 0;
		}
		@Pc(301) byte local301 = 0;
		Static197.anIntArray538[0] = local98;
		local106 = local301 + 1;
		Static354.anIntArray851[0] = local100;
		@Pc(322) int local322;
		local108 = local322 = Static218.anIntArrayArray34[local98 - local87][local100 - local91];
		while (local98 != arg1 || arg10 != local100) {
			if (local108 != local322) {
				Static197.anIntArray538[local106] = local98;
				local322 = local108;
				Static354.anIntArray851[local106++] = local100;
			}
			if ((local108 & 0x1) != 0) {
				local100++;
			} else if ((local108 & 0x4) != 0) {
				local100--;
			}
			if ((local108 & 0x2) != 0) {
				local98++;
			} else if ((local108 & 0x8) != 0) {
				local98--;
			}
			local108 = Static218.anIntArrayArray34[local98 - local87][local100 - local91];
		}
		local115 = 0;
		while (local106-- > 0) {
			arg11[local115] = Static197.anIntArray538[local106];
			arg2[local115++] = Static354.anIntArray851[local106];
			if (local115 >= arg11.length) {
				break;
			}
		}
		return local115;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lclient!ap;I)Lclient!ip;")
	public static Class106 method3000(@OriginalArg(0) Class7_Sub3 arg0) {
		@Pc(14) Class106 local14 = new Class106();
		local14.anInt3026 = arg0.method2764();
		local14.aClass7_Sub1_Sub1_1 = Static259.method4353(local14.anInt3026);
		return local14;
	}
}
