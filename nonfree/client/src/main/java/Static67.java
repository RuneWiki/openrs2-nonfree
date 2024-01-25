import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static67 {

	@OriginalMember(owner = "client!cr", name = "C", descriptor = "Lclient!n;")
	public static Interface13 anInterface13_6;

	@OriginalMember(owner = "client!cr", name = "S", descriptor = "I")
	public static int anInt1738;

	@OriginalMember(owner = "client!cr", name = "T", descriptor = "I")
	public static int anInt1739;

	@OriginalMember(owner = "client!cr", name = "D", descriptor = "Lclient!vj;")
	public static final Class305 aClass305_70 = new Class305(58, 0);

	@OriginalMember(owner = "client!cr", name = "I", descriptor = "I")
	public static int anInt1732 = -1;

	@OriginalMember(owner = "client!cr", name = "K", descriptor = "I")
	public static int anInt1733 = -2;

	@OriginalMember(owner = "client!cr", name = "N", descriptor = "[I")
	public static final int[] anIntArray116 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

	@OriginalMember(owner = "client!cr", name = "Q", descriptor = "Lclient!rg;")
	public static final Class252 aClass252_33 = new Class252(69, -1);

	@OriginalMember(owner = "client!cr", name = "R", descriptor = "Lclient!rg;")
	public static final Class252 aClass252_34 = new Class252(17, 0);

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(CBI)C")
	public static char method1680(@OriginalArg(0) char arg0, @OriginalArg(2) int arg1) {
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
}
