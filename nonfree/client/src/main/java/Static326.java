import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static326 {

	@OriginalMember(owner = "client!mfa", name = "V", descriptor = "I")
	public static int anInt5812 = 0;

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(ICI)C")
	public static char method4914(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1) {
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

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(Lclient!st;Z)V")
	public static void method4924(@OriginalArg(0) Class10_Sub1_Sub2_Sub2 arg0) {
		@Pc(11) Class4_Sub51 local11 = (Class4_Sub51) Static518.aClass183_37.method4289((long) arg0.anInt8531);
		if (local11 == null) {
			return;
		}
		if (local11.aClass4_Sub13_Sub2_3 != null) {
			Static430.aClass4_Sub13_Sub1_1.method2274(local11.aClass4_Sub13_Sub2_3);
			local11.aClass4_Sub13_Sub2_3 = null;
		}
		local11.method8013();
	}
}
