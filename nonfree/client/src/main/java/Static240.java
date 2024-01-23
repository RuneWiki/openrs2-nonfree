import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static240 {

	@OriginalMember(owner = "client!uj", name = "k", descriptor = "I")
	public static int anInt5164;

	@OriginalMember(owner = "client!uj", name = "q", descriptor = "Lclient!pa;")
	public static Class103 aClass103_7;

	@OriginalMember(owner = "client!uj", name = "x", descriptor = "[[B")
	public static byte[][] aByteArrayArray11;

	@OriginalMember(owner = "client!uj", name = "z", descriptor = "I")
	public static int anInt5171;

	@OriginalMember(owner = "client!uj", name = "i", descriptor = "Lclient!wc;")
	public static Class147 aClass147_1 = new Class147();

	@OriginalMember(owner = "client!uj", name = "s", descriptor = "I")
	public static int anInt5167 = 0;

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(BIC)C")
	public static char method3944(@OriginalArg(1) int arg0, @OriginalArg(2) char arg1) {
		if (arg1 >= 'À' && arg1 <= 'ÿ') {
			if (arg1 >= 'À' && arg1 <= 'Æ') {
				return 'A';
			}
			if (arg1 == 'Ç') {
				return 'C';
			}
			if (arg1 >= 'È' && arg1 <= 'Ë') {
				return 'E';
			}
			if (arg1 >= 'Ì' && arg1 <= 'Ï') {
				return 'I';
			}
			if (arg1 == 'Ñ' && arg0 != 0) {
				return 'N';
			}
			if (arg1 >= 'Ò' && arg1 <= 'Ö') {
				return 'O';
			}
			if (arg1 >= 'Ù' && arg1 <= 'Ü') {
				return 'U';
			}
			if (arg1 == 'Ý') {
				return 'Y';
			}
			if (arg1 == 'ß') {
				return 's';
			}
			if (arg1 >= 'à' && arg1 <= 'æ') {
				return 'a';
			}
			if (arg1 == 'ç') {
				return 'c';
			}
			if (arg1 >= 'è' && arg1 <= 'ë') {
				return 'e';
			}
			if (arg1 >= 'ì' && arg1 <= 'ï') {
				return 'i';
			}
			if (arg1 == 'ñ' && arg0 != 0) {
				return 'n';
			}
			if (arg1 >= 'ò' && arg1 <= 'ö') {
				return 'o';
			}
			if (arg1 >= 'ù' && arg1 <= 'ü') {
				return 'u';
			}
			if (arg1 == 'ý' || arg1 == 'ÿ') {
				return 'y';
			}
		}
		if (arg1 == 'Œ') {
			return 'O';
		} else if (arg1 == 'œ') {
			return 'o';
		} else if (arg1 == 'Ÿ') {
			return 'Y';
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IILclient!hc;)Lclient!q;")
	public static Class1_Sub2_Sub4_Sub1 method3945(@OriginalArg(0) int arg0, @OriginalArg(2) Class51 arg1) {
		return Static181.method3124(arg1, arg0) ? Static36.method451() : null;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3947(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg6 - 334;
		if (local7 < 0) {
			local7 = 0;
		} else if (local7 > 100) {
			local7 = 100;
		}
		@Pc(29) int local29 = Static83.aShort14 + (Static242.aShort28 - Static83.aShort14) * local7 / 100;
		@Pc(35) int local35 = arg4 * local29 >> 8;
		@Pc(42) int local42 = 2048 - arg2 & 0x7FF;
		@Pc(49) int local49 = 2048 - arg5 & 0x7FF;
		@Pc(51) int local51 = 0;
		@Pc(53) int local53 = local35;
		@Pc(55) int local55 = 0;
		@Pc(61) int local61;
		@Pc(72) int local72;
		if (local49 != 0) {
			local61 = Class132.anIntArray440[local49];
			local55 = -local35 * local61 >> 16;
			local72 = Class132.anIntArray439[local49];
			local53 = local72 * local35 >> 16;
		}
		if (local42 != 0) {
			local61 = Class132.anIntArray440[local42];
			local51 = local61 * local53 >> 16;
			local72 = Class132.anIntArray439[local42];
			local53 = local53 * local72 >> 16;
		}
		Static200.anInt4412 = arg5;
		Static127.anInt3198 = arg2;
		Static174.anInt4003 = arg0 - local51;
		Static109.anInt2904 = arg1 - local55;
		Static110.anInt2935 = arg3 - local53;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)V")
	public static void method3948() {
		Static212.aClass79_31.method2489();
	}
}
