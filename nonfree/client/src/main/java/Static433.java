import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static433 {

	@OriginalMember(owner = "client!rq", name = "B", descriptor = "Lclient!fea;")
	public static final Class99 aClass99_65 = new Class99();

	@OriginalMember(owner = "client!rq", name = "K", descriptor = "Z")
	public static boolean aBoolean542 = false;

	@OriginalMember(owner = "client!rq", name = "N", descriptor = "I")
	public static int anInt7630 = 0;

	@OriginalMember(owner = "client!rq", name = "R", descriptor = "I")
	public static int anInt7633 = 0;

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(BI)I")
	public static int method6183(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!rq", name = "b", descriptor = "(BI)I")
	public static int method6184(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(IZC)C")
	public static char method6185(@OriginalArg(0) int arg0, @OriginalArg(2) char arg1) {
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
}
