import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!hk", name = "K", descriptor = "Lclient!in;")
	public static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_2;

	@OriginalMember(owner = "client!hk", name = "n", descriptor = "[I")
	public static int[] anIntArray180 = new int[64];

	@OriginalMember(owner = "client!hk", name = "q", descriptor = "Z")
	public static boolean aBoolean149 = true;

	@OriginalMember(owner = "client!hk", name = "B", descriptor = "[Z")
	public static boolean[] aBooleanArray19 = new boolean[5];

	@OriginalMember(owner = "client!hk", name = "H", descriptor = "Ljava/lang/String;")
	public static String aString70 = null;

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIII)V")
	public static void method1640(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class1_Sub17 local7 = Static122.aClass1_Sub17ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class102 local13 = local7.aClass102_1;
		if (local13 != null) {
			local13.anInt2945 = local13.anInt2945 * arg3 / 16;
			local13.anInt2951 = local13.anInt2951 * arg3 / 16;
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(ILjava/lang/String;I)I")
	public static int method1642(@OriginalArg(1) String arg0) {
		return Static121.method1952(16, arg0);
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IC)C")
	public static char method1643(@OriginalArg(1) char arg0) {
		if (arg0 == '[' || arg0 == ']' || arg0 == '#') {
			return arg0;
		} else if (arg0 == '-') {
			return '\u0000';
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
		} else if (arg0 == ' ' || arg0 == ' ') {
			return '_';
		} else {
			return Character.toLowerCase(arg0);
		}
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(I)V")
	public static void method1644() {
		if (Static62.method1046() || Static277.anInt5275 == Static295.anInt5586) {
			Static39.method702();
			if (Static295.anInt5586 != Static301.anInt5695) {
				Static296.method4401();
			}
		} else {
			Static295.method4396(Static229.aClass22_Sub3_Sub2_2.anIntArray424[0], false, Static305.anInt5793, false, Static229.aClass22_Sub3_Sub2_2.anIntArray427[0], Static295.anInt5586, Static244.anInt4868);
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIZIIIII)V")
	public static void method1645(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 < 1 || arg2 < 1 || arg0 > 102 || arg2 > 102) {
			return;
		}
		@Pc(40) int local40;
		if (!Static62.method1046() && (Static94.aByteArrayArrayArray9[0][arg0][arg2] & 0x2) == 0) {
			local40 = arg1;
			if ((Static94.aByteArrayArrayArray9[arg1][arg0][arg2] & 0x8) != 0) {
				local40 = 0;
			}
			if (Static277.anInt5275 != local40) {
				return;
			}
		}
		local40 = arg1;
		if (arg1 < 3 && (Static94.aByteArrayArrayArray9[1][arg0][arg2] & 0x2) == 2) {
			local40 = arg1 + 1;
		}
		Static151.method2480(Static56.aClass122Array1[arg1], arg2, arg4, arg1, arg0, local40);
		if (arg6 >= 0) {
			@Pc(91) boolean local91 = Static289.aBoolean394;
			Static289.aBoolean394 = true;
			Static293.method4623(false, arg6, local40, Static56.aClass122Array1[arg1], arg2, false, arg0, arg1, arg5, arg3);
			Static289.aBoolean394 = local91;
		}
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(IIII)I")
	public static int method1648(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (Static208.anIntArrayArrayArray11 == null) {
			return 0;
		}
		@Pc(20) int local20 = arg1 >> 7;
		@Pc(24) int local24 = arg2 >> 7;
		if (local20 < 0 || local24 < 0 || local20 > 103 || local24 > 103) {
			return 0;
		}
		@Pc(47) int local47 = arg0;
		@Pc(51) int local51 = arg1 & 0x7F;
		if (arg0 < 3 && (Static94.aByteArrayArrayArray9[1][local20][local24] & 0x2) == 2) {
			local47 = arg0 + 1;
		}
		@Pc(96) int local96 = local51 * Static208.anIntArrayArrayArray11[local47][local20 + 1][local24] + (128 - local51) * Static208.anIntArrayArrayArray11[local47][local20][local24] >> 7;
		@Pc(127) int local127 = local51 * Static208.anIntArrayArrayArray11[local47][local20 + 1][local24 + 1] + Static208.anIntArrayArrayArray11[local47][local20][local24 + 1] * (128 - local51) >> 7;
		@Pc(131) int local131 = arg2 & 0x7F;
		return local131 * local127 + (128 - local131) * local96 >> 7;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lclient!ph;I)V")
	public static void method1649(@OriginalArg(0) Class138 arg0) {
		Static84.aClass138_25 = arg0;
	}
}
