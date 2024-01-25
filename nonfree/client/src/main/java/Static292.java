import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static292 {

	@OriginalMember(owner = "client!os", name = "l", descriptor = "F")
	public static float aFloat75;

	@OriginalMember(owner = "client!os", name = "z", descriptor = "Lclient!bl;")
	public static Class27 aClass27_1;

	@OriginalMember(owner = "client!os", name = "q", descriptor = "J")
	public static long aLong147 = -1L;

	@OriginalMember(owner = "client!os", name = "C", descriptor = "Lclient!qp;")
	public static final Class209 aClass209_117 = new Class209("yellow:", "gelb:", "jaune:", "amarelo:");

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(ICB)C")
	public static char method4202(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1) {
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

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(BI)I")
	public static int method4205(@OriginalArg(1) int arg0) {
		return arg0 & 0x3FF;
	}

	@OriginalMember(owner = "client!os", name = "b", descriptor = "(III)Lclient!hg;")
	public static Class106 method4206(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static440.aClass106ArrayArrayArray3[arg0][arg1][arg2] == null) {
			@Pc(28) boolean local28 = Static440.aClass106ArrayArrayArray3[0][arg1][arg2] != null && Static440.aClass106ArrayArrayArray3[0][arg1][arg2].aClass106_1 != null;
			if (local28 && arg0 >= Static254.anInt4782 - 1) {
				return null;
			}
			Static328.method4560(arg0, arg1, arg2);
		}
		return Static440.aClass106ArrayArrayArray3[arg0][arg1][arg2];
	}

	@OriginalMember(owner = "client!os", name = "g", descriptor = "(I)Lclient!rd;")
	public static Class211 method4207() {
		try {
			return (Class211) Class.forName("Class211_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(16) Throwable local16) {
			return null;
		}
	}
}
