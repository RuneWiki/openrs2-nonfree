import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static174 {

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "I")
	public static int anInt3450;

	@OriginalMember(owner = "client!nh", name = "e", descriptor = "[Lclient!vd;")
	public static Class170[] aClass170Array1;

	@OriginalMember(owner = "client!nh", name = "d", descriptor = "I")
	public static int anInt3451 = 0;

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Z)V")
	public static void method2689(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static178.aClass8_Sub27ArrayArrayArray1 = Static228.aClass8_Sub27ArrayArrayArray3;
			Static195.anIntArrayArrayArray7 = Static222.anIntArrayArrayArray10;
			Static106.aClass8_Sub29ArrayArray4 = Static37.aClass8_Sub29ArrayArray5;
		} else {
			Static178.aClass8_Sub27ArrayArrayArray1 = Static188.aClass8_Sub27ArrayArrayArray2;
			Static195.anIntArrayArrayArray7 = Static87.anIntArrayArrayArray5;
			Static106.aClass8_Sub29ArrayArray4 = Static69.aClass8_Sub29ArrayArray3;
		}
		Static54.anInt1199 = Static178.aClass8_Sub27ArrayArrayArray1.length;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(ICI)C")
	public static char method2691(@OriginalArg(1) char arg0, @OriginalArg(2) int arg1) {
		if (arg0 >= 'À' && arg0 <= 'ÿ') {
			if (arg0 >= 'À' && arg0 <= 'Æ') {
				return 'A';
			}
			if (arg0 == 'Ç') {
				return 'C';
			}
			if (arg0 >= 'È' && arg0 <= 'Ë') {
				return 'E';
			}
			if (arg0 >= 'Ì' && arg0 <= 'Ï') {
				return 'I';
			}
			if (arg0 == 'Ñ' && arg1 != 0) {
				return 'N';
			}
			if (arg0 >= 'Ò' && arg0 <= 'Ö') {
				return 'O';
			}
			if (arg0 >= 'Ù' && arg0 <= 'Ü') {
				return 'U';
			}
			if (arg0 == 'Ý') {
				return 'Y';
			}
			if (arg0 == 'ß') {
				return 's';
			}
			if (arg0 >= 'à' && arg0 <= 'æ') {
				return 'a';
			}
			if (arg0 == 'ç') {
				return 'c';
			}
			if (arg0 >= 'è' && arg0 <= 'ë') {
				return 'e';
			}
			if (arg0 >= 'ì' && arg0 <= 'ï') {
				return 'i';
			}
			if (arg0 == 'ñ' && arg1 != 0) {
				return 'n';
			}
			if (arg0 >= 'ò' && arg0 <= 'ö') {
				return 'o';
			}
			if (arg0 >= 'ù' && arg0 <= 'ü') {
				return 'u';
			}
			if (arg0 == 'ý' || arg0 == 'ÿ') {
				return 'y';
			}
		}
		if (arg0 == 'Œ') {
			return 'O';
		} else if (arg0 == 'œ') {
			return 'o';
		} else if (arg0 == 'Ÿ') {
			return 'Y';
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2692(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (arg5 < 1 || arg4 < 1 || arg5 > 102 || arg4 > 102) {
			return;
		}
		@Pc(38) int local38;
		if (!Static158.method2553() && (Static170.aByteArrayArrayArray9[0][arg5][arg4] & 0x2) == 0) {
			local38 = arg0;
			if ((Static170.aByteArrayArrayArray9[arg0][arg5][arg4] & 0x8) != 0) {
				local38 = 0;
			}
			if (Static253.anInt4999 != local38) {
				return;
			}
		}
		local38 = arg0;
		if (arg0 < 3 && (Static170.aByteArrayArrayArray9[1][arg5][arg4] & 0x2) == 2) {
			local38 = arg0 + 1;
		}
		Static69.method1135(Static159.aClass112Array1[arg0], arg3, arg0, local38, arg5, arg4);
		if (arg2 >= 0) {
			@Pc(97) boolean local97 = Static113.aBoolean182;
			Static113.aBoolean182 = true;
			Static127.method2066(arg2, arg1, local38, false, arg0, Static159.aClass112Array1[arg0], false, arg6, arg5, arg4);
			Static113.aBoolean182 = local97;
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method2693(@OriginalArg(1) String arg0) {
		@Pc(3) int local3 = Static34.method532(arg0);
		if (local3 != -1) {
			@Pc(40) int[] local40 = Static267.aClass8_Sub1_Sub2_2.method423(Static245.aClass130_2.anIntArray297[local3] >> 28 & 0x3, Static245.aClass130_2.anIntArray297[local3] & 0x3FFF, Static245.aClass130_2.anIntArray297[local3] >> 14 & 0x3FFF);
			Static28.method469(local40[2], local40[1]);
		}
	}
}
