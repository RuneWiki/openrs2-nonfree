import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "Lclient!dr;")
	public static final Class73 aClass73_60 = new Class73(31, 6);

	@OriginalMember(owner = "client!fj", name = "c", descriptor = "Z")
	public static boolean aBoolean227 = false;

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(CB)Z")
	public static boolean method2741(@OriginalArg(0) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIIII)V")
	public static void method2742(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) float local9 = (float) Static217.anInt3839 / (float) Static217.anInt3833;
		@Pc(11) int local11 = arg1;
		@Pc(22) int local22 = arg2;
		if (local9 < 1.0F) {
			local22 = (int) (local9 * (float) arg1);
		} else {
			local11 = (int) ((float) arg2 / local9);
		}
		@Pc(49) int local49 = arg0 - (arg1 - local11) / 2;
		@Pc(58) int local58 = arg3 - (arg2 - local22) / 2;
		Static538.anInt8915 = Static217.anInt3839 - Static217.anInt3839 * local58 / local22;
		Static562.anInt9257 = -1;
		Static39.anInt4953 = local49 * Static217.anInt3833 / local11;
		Static29.anInt856 = -1;
		Static125.method7473();
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIC)C")
	public static char method2743(@OriginalArg(1) int arg0, @OriginalArg(2) char arg1) {
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
