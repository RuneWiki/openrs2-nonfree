import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static494 {

	@OriginalMember(owner = "client!so", name = "M", descriptor = "F")
	public static float aFloat177;

	@OriginalMember(owner = "client!so", name = "L", descriptor = "Lclient!rl;")
	public static final Class287 aClass287_134 = new Class287(39, 5);

	@OriginalMember(owner = "client!so", name = "T", descriptor = "Lclient!rl;")
	public static final Class287 aClass287_135 = new Class287(19, 6);

	@OriginalMember(owner = "client!so", name = "V", descriptor = "[I")
	public static final int[] anIntArray488 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(IIBII)V")
	public static void method6509(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static491.anInt8433 == 1) {
			Static565.aClass73Array15[Static80.anInt2132 / 100].method7957(Static148.anInt3449 - 8, Static13.anInt121 - 8);
		}
		if (Static491.anInt8433 == 2) {
			Static565.aClass73Array15[Static80.anInt2132 / 100 + 4].method7957(Static148.anInt3449 - 8, Static13.anInt121 - 8);
		}
		Static143.method2746();
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(CZI)C")
	public static char method6511(@OriginalArg(0) char arg0, @OriginalArg(2) int arg1) {
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
}
