import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static174 {

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "Lclient!r;")
	public static Class12 aClass12_9;

	@OriginalMember(owner = "client!gp", name = "c", descriptor = "I")
	public static int anInt3159 = 0;

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(ICI)C")
	public static char method2668(@OriginalArg(1) char arg0, @OriginalArg(2) int arg1) {
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

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(IIIIIIB)V")
	public static void method2670(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class221[] local3 = Static276.aClass221Array1;
		for (@Pc(5) int local5 = 0; local5 < local3.length; local5++) {
			@Pc(13) Class221 local13 = local3[local5];
			if (local13 != null && local13.anInt6039 == 2) {
				Static559.method7537(local13.anInt6037, arg0 >> 1, local13.anInt6048 * 2, arg3 >> 1, local13.anInt6035, local13.anInt6042);
				if (Static480.anIntArray537[0] > -1 && Static81.anInt1910 % 20 < 10) {
					Static30.aClass10Array1[local13.anInt6041].method7679(Static480.anIntArray537[0] + arg2 - 12, Static480.anIntArray537[1] + -28 + arg1);
				}
			}
		}
	}
}
