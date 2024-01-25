import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static224 {

	@OriginalMember(owner = "client!li", name = "o", descriptor = "Lclient!l;")
	public static Class95 aClass95_11;

	@OriginalMember(owner = "client!li", name = "q", descriptor = "I")
	public static int anInt3837;

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(CI)C")
	public static char method3028(@OriginalArg(0) char arg0) {
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

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(ZZ)Z")
	public static boolean method3034(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIIII)V")
	public static void method3035(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg4;
		@Pc(13) int local13 = arg1 * arg1;
		@Pc(17) int local17 = arg4 * arg4;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg4 << 1;
		@Pc(39) int local39 = (1 - local29) * local13 + local21;
		@Pc(47) int local47 = local17 - (local29 - 1) * local25;
		@Pc(51) int local51 = local13 << 2;
		@Pc(55) int local55 = local17 << 2;
		@Pc(63) int local63 = local21 * 3;
		@Pc(71) int local71 = local25 * ((arg4 << 1) - 3);
		@Pc(77) int local77 = local55;
		@Pc(83) int local83 = local51 * (arg4 - 1);
		Static249.method6044(Static267.anIntArrayArray50[arg3], arg2, arg0 + arg1, -arg1 + arg0);
		while (local9 > 0) {
			if (local39 < 0) {
				while (local39 < 0) {
					local39 += local63;
					local47 += local77;
					local7++;
					local77 += local55;
					local63 += local55;
				}
			}
			if (local47 < 0) {
				local47 += local77;
				local39 += local63;
				local7++;
				local63 += local55;
				local77 += local55;
			}
			local47 += -local71;
			local39 += -local83;
			local9--;
			local71 -= local51;
			local83 -= local51;
			@Pc(177) int local177 = arg3 - local9;
			@Pc(181) int local181 = arg3 + local9;
			@Pc(185) int local185 = arg0 + local7;
			@Pc(190) int local190 = arg0 - local7;
			Static249.method6044(Static267.anIntArrayArray50[local177], arg2, local185, local190);
			Static249.method6044(Static267.anIntArrayArray50[local181], arg2, local185, local190);
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(ZILjava/lang/String;)V")
	public static void method3037(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1) {
		Static391.aClass211_85.anInt5388 = 1;
		@Pc(11) String local11 = arg1.toLowerCase();
		@Pc(14) short[] local14 = new short[16];
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < Static416.aClass64_2.anInt1669; local18++) {
			@Pc(25) Class80 local25 = Static416.aClass64_2.method1372(local18);
			if ((!arg0 || local25.aBoolean141) && local25.anInt1990 == -1 && local25.anInt1999 == -1 && local25.anInt2002 == 0 && local25.aString10.toLowerCase().indexOf(local11) != -1) {
				if (local16 >= 250) {
					Static193.aShortArray15 = null;
					Static246.anInt4087 = -1;
					return;
				}
				if (local16 >= local14.length) {
					@Pc(79) short[] local79 = new short[local14.length * 2];
					for (@Pc(81) int local81 = 0; local81 < local16; local81++) {
						local79[local81] = local14[local81];
					}
					local14 = local79;
				}
				local14[local16++] = (short) local18;
			}
		}
		Static246.anInt4087 = local16;
		Static193.aShortArray15 = local14;
		Static237.anInt5935 = 0;
		@Pc(119) String[] local119 = new String[Static246.anInt4087];
		for (@Pc(121) int local121 = 0; local121 < Static246.anInt4087; local121++) {
			local119[local121] = Static416.aClass64_2.method1372(local14[local121]).aString10;
		}
		Static274.method3653(Static193.aShortArray15, local119);
		Static391.aClass211_85.method4379();
		Static391.aClass211_85.anInt5388 = 2;
	}

	@OriginalMember(owner = "client!li", name = "b", descriptor = "(II)I")
	public static int method3039(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static169.anIntArrayArray37 == null ? 0 : Static169.anIntArrayArray37[arg0][arg1] & 0xFFFFFF;
	}
}
