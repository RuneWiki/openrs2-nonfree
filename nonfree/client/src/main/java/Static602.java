import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static602 {

	@OriginalMember(owner = "client!ui", name = "m", descriptor = "I")
	public static int anInt9871;

	@OriginalMember(owner = "client!ui", name = "n", descriptor = "J")
	public static long aLong301;

	@OriginalMember(owner = "client!ui", name = "o", descriptor = "I")
	public static int anInt9872;

	@OriginalMember(owner = "client!ui", name = "r", descriptor = "[Lclient!vfa;")
	public static Class371[] aClass371Array5;

	@OriginalMember(owner = "client!ui", name = "i", descriptor = "Lclient!jo;")
	public static final Class187 aClass187_95 = new Class187(49, 2);

	@OriginalMember(owner = "client!ui", name = "j", descriptor = "Lclient!rh;")
	public static final Class307 aClass307_18 = new Class307(12, 0, 1, 0);

	@OriginalMember(owner = "client!ui", name = "q", descriptor = "B")
	public static byte aByte143 = -6;

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "(I)V")
	public static void method8223() {
		if (!Static19.aBoolean7) {
			Static550.aBoolean649 = true;
			Static644.aFloat196 += (24.0F - Static644.aFloat196) / 2.0F;
			Static19.aBoolean7 = true;
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(CIB)C")
	public static char method8224(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
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
