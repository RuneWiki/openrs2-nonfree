import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static265 {

	@OriginalMember(owner = "client!td", name = "a", descriptor = "I")
	public static int anInt5306;

	@OriginalMember(owner = "client!td", name = "b", descriptor = "I")
	public static int anInt5307;

	@OriginalMember(owner = "client!td", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString379 = "flash2:";

	@OriginalMember(owner = "client!td", name = "i", descriptor = "I")
	public static int anInt5313 = 0;

	@OriginalMember(owner = "client!td", name = "n", descriptor = "J")
	public static long aLong203 = 0L;

	@OriginalMember(owner = "client!td", name = "p", descriptor = "I")
	public static int anInt5316 = 0;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ILclient!qm;)Ljava/lang/String;")
	public static String method4016(@OriginalArg(1) Class1_Sub14 arg0) {
		return Static137.method1696(arg0);
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(CII)C")
	public static char method4018(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(II)V")
	public static void method4019(@OriginalArg(0) int arg0) {
		@Pc(16) Class1_Sub3_Sub22 local16 = Static271.method4108(10, arg0);
		local16.method4464();
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IB)I")
	public static int method4020(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}
}
