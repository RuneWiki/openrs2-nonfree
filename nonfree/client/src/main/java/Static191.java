import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!lq", name = "g", descriptor = "I")
	public static int anInt4208 = -1;

	@OriginalMember(owner = "client!lq", name = "l", descriptor = "Lclient!nn;")
	public static final Class140 aClass140_96 = new Class140("Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.", "Veuillez patienter - tentative de rétablissement.", "Tentando reestabelecer conexão. Aguarde.");

	@OriginalMember(owner = "client!lq", name = "m", descriptor = "I")
	public static int anInt4211 = 0;

	@OriginalMember(owner = "client!lq", name = "n", descriptor = "I")
	public static int anInt4212 = -1;

	@OriginalMember(owner = "client!lq", name = "o", descriptor = "I")
	public static int anInt4213 = 0;

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(ILclient!ek;IIIIIZIII)Z")
	public static boolean method3579(@OriginalArg(0) int arg0, @OriginalArg(1) Class61 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg5;
		@Pc(9) int local9 = arg4;
		@Pc(18) int local18 = arg5 - 64;
		Static182.anIntArrayArray26[64][64] = 99;
		@Pc(29) int local29 = arg4 - 64;
		Static233.anIntArrayArray47[64][64] = 0;
		@Pc(37) byte local37 = 0;
		@Pc(39) int local39 = 0;
		Static309.anIntArray471[0] = arg5;
		@Pc(46) int local46 = local37 + 1;
		Static270.anIntArray432[0] = arg4;
		@Pc(51) int[][] local51 = arg1.anIntArrayArray19;
		while (local46 != local39) {
			local7 = Static309.anIntArray471[local39];
			local9 = Static270.anIntArray432[local39];
			local39 = local39 + 1 & 0xFFF;
			@Pc(71) int local71 = local7 - local18;
			@Pc(76) int local76 = local9 - local29;
			@Pc(82) int local82 = local7 - arg1.anInt1457;
			@Pc(88) int local88 = local9 - arg1.anInt1460;
			if (arg6 == -4) {
				if (local7 == arg0 && local9 == arg2) {
					Static49.anInt821 = local7;
					Static152.anInt3473 = local9;
					return true;
				}
			} else if (arg6 == -3) {
				if (Static286.method4839(arg3, local9, 2, arg2, 2, local7, arg0, arg8)) {
					Static152.anInt3473 = local9;
					Static49.anInt821 = local7;
					return true;
				}
			} else if (arg6 == -2) {
				if (arg1.method1605(arg3, arg8, 2, 2, arg9, local9, local7, arg0, arg2)) {
					Static49.anInt821 = local7;
					Static152.anInt3473 = local9;
					return true;
				}
			} else if (arg6 == -1) {
				if (arg1.method1600(arg0, local9, arg3, local7, arg9, 2, arg2, arg8)) {
					Static152.anInt3473 = local9;
					Static49.anInt821 = local7;
					return true;
				}
			} else if (arg6 == 0 || arg6 == 1 || arg6 == 2 || arg6 == 3 || arg6 == 9) {
				if (arg1.method1608(arg7, arg0, arg6, 2, local9, local7, arg2)) {
					Static49.anInt821 = local7;
					Static152.anInt3473 = local9;
					return true;
				}
			} else if (arg1.method1613(arg2, arg6, arg7, arg0, 2, local7, local9)) {
				Static152.anInt3473 = local9;
				Static49.anInt821 = local7;
				return true;
			}
			@Pc(245) int local245 = Static233.anIntArrayArray47[local71][local76] + 1;
			if (local71 > 0 && Static182.anIntArrayArray26[local71 - 1][local76] == 0 && (local51[local82 - 1][local88] & 0x43A40000) == 0 && (local51[local82 - 1][local88 + 1] & 0x4E240000) == 0) {
				Static309.anIntArray471[local46] = local7 - 1;
				Static270.anIntArray432[local46] = local9;
				local46 = local46 + 1 & 0xFFF;
				Static182.anIntArrayArray26[local71 - 1][local76] = 2;
				Static233.anIntArrayArray47[local71 - 1][local76] = local245;
			}
			if (local71 < 126 && Static182.anIntArrayArray26[local71 + 1][local76] == 0 && (local51[local82 + 2][local88] & 0x60E40000) == 0 && (local51[local82 + 2][local88 + 1] & 0x78240000) == 0) {
				Static309.anIntArray471[local46] = local7 + 1;
				Static270.anIntArray432[local46] = local9;
				local46 = local46 + 1 & 0xFFF;
				Static182.anIntArrayArray26[local71 + 1][local76] = 8;
				Static233.anIntArrayArray47[local71 + 1][local76] = local245;
			}
			if (local76 > 0 && Static182.anIntArrayArray26[local71][local76 - 1] == 0 && (local51[local82][local88 - 1] & 0x43A40000) == 0 && (local51[local82 + 1][local88 - 1] & 0x60E40000) == 0) {
				Static309.anIntArray471[local46] = local7;
				Static270.anIntArray432[local46] = local9 - 1;
				Static182.anIntArrayArray26[local71][local76 - 1] = 1;
				local46 = local46 + 1 & 0xFFF;
				Static233.anIntArrayArray47[local71][local76 - 1] = local245;
			}
			if (local76 < 126 && Static182.anIntArrayArray26[local71][local76 + 1] == 0 && (local51[local82][local88 + 2] & 0x4E240000) == 0 && (local51[local82 + 1][local88 + 2] & 0x78240000) == 0) {
				Static309.anIntArray471[local46] = local7;
				Static270.anIntArray432[local46] = local9 + 1;
				local46 = local46 + 1 & 0xFFF;
				Static182.anIntArrayArray26[local71][local76 + 1] = 4;
				Static233.anIntArrayArray47[local71][local76 + 1] = local245;
			}
			if (local71 > 0 && local76 > 0 && Static182.anIntArrayArray26[local71 - 1][local76 - 1] == 0 && (local51[local82 - 1][local88] & 0x4FA40000) == 0 && (local51[local82 - 1][local88 - 1] & 0x43A40000) == 0 && (local51[local82][local88 - 1] & 0x63E40000) == 0) {
				Static309.anIntArray471[local46] = local7 - 1;
				Static270.anIntArray432[local46] = local9 - 1;
				local46 = local46 + 1 & 0xFFF;
				Static182.anIntArrayArray26[local71 - 1][local76 - 1] = 3;
				Static233.anIntArrayArray47[local71 - 1][local76 - 1] = local245;
			}
			if (local71 < 126 && local76 > 0 && Static182.anIntArrayArray26[local71 + 1][local76 - 1] == 0 && (local51[local82 + 1][local88 - 1] & 0x63E40000) == 0 && (local51[local82 + 2][local88 - 1] & 0x60E40000) == 0 && (local51[local82 + 2][local88] & 0x78E40000) == 0) {
				Static309.anIntArray471[local46] = local7 + 1;
				Static270.anIntArray432[local46] = local9 - 1;
				Static182.anIntArrayArray26[local71 + 1][local76 - 1] = 9;
				local46 = local46 + 1 & 0xFFF;
				Static233.anIntArrayArray47[local71 + 1][local76 - 1] = local245;
			}
			if (local71 > 0 && local76 < 126 && Static182.anIntArrayArray26[local71 - 1][local76 + 1] == 0 && (local51[local82 - 1][local88 + 1] & 0x4FA40000) == 0 && (local51[local82 - 1][local88 + 2] & 0x4E240000) == 0 && (local51[local82][local88 + 2] & 0x7E240000) == 0) {
				Static309.anIntArray471[local46] = local7 - 1;
				Static270.anIntArray432[local46] = local9 + 1;
				Static182.anIntArrayArray26[local71 - 1][local76 + 1] = 6;
				local46 = local46 + 1 & 0xFFF;
				Static233.anIntArrayArray47[local71 - 1][local76 + 1] = local245;
			}
			if (local71 < 126 && local76 < 126 && Static182.anIntArrayArray26[local71 + 1][local76 + 1] == 0 && (local51[local82 + 1][local88 + 2] & 0x7E240000) == 0 && (local51[local82 + 2][local88 + 2] & 0x78240000) == 0 && (local51[local82 + 2][local88 + 1] & 0x78E40000) == 0) {
				Static309.anIntArray471[local46] = local7 + 1;
				Static270.anIntArray432[local46] = local9 + 1;
				Static182.anIntArrayArray26[local71 + 1][local76 + 1] = 12;
				local46 = local46 + 1 & 0xFFF;
				Static233.anIntArrayArray47[local71 + 1][local76 + 1] = local245;
			}
		}
		Static152.anInt3473 = local9;
		Static49.anInt821 = local7;
		return false;
	}

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "(B)V")
	public static void method3581() {
		@Pc(7) Class209 local7 = null;
		try {
			@Pc(11) Class26 local11 = Static62.aClass179_2.method4890();
			while (local11.anInt484 == 0) {
				Static248.method4401(1L);
			}
			if (local11.anInt484 == 1) {
				local7 = (Class209) local11.anObject1;
				@Pc(47) Class2_Sub12 local47 = new Class2_Sub12(Static249.anInt5210 * 6 + 3);
				local47.method3147(1);
				local47.method3158(Static249.anInt5210);
				for (@Pc(57) int local57 = 0; local57 < Static20.anIntArray40.length; local57++) {
					if (Static18.aBooleanArray4[local57]) {
						local47.method3158(local57);
						local47.method3162(Static20.anIntArray40[local57]);
					}
				}
				local7.method5625(local47.anInt3606, local47.aByteArray30, 0);
			}
		} catch (@Pc(94) Exception local94) {
		}
		try {
			if (local7 != null) {
				local7.method5628();
			}
		} catch (@Pc(101) Exception local101) {
		}
		Static271.aLong174 = Static22.method285();
		Static6.aBoolean9 = false;
	}
}
