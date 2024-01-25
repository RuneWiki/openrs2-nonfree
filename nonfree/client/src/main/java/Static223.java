import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static223 {

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "Z")
	public static boolean aBoolean613 = false;

	@OriginalMember(owner = "client!ok", name = "c", descriptor = "I")
	public static int anInt6314 = 0;

	@OriginalMember(owner = "client!ok", name = "e", descriptor = "[Z")
	public static final boolean[] aBooleanArray28 = new boolean[100];

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIC)C")
	public static char method5333(@OriginalArg(1) int arg0, @OriginalArg(2) char arg1) {
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

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(III)Lclient!qo;")
	public static Class17_Sub3 method5335(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class194 local7 = Static77.aClass194ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass17_Sub3_1;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIB)I")
	public static int method5338(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 >= arg0) {
			return arg2 <= arg1 ? arg2 : arg1;
		} else {
			return arg0;
		}
	}
}
