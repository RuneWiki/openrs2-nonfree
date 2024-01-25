import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static261 {

	@OriginalMember(owner = "client!ku", name = "D", descriptor = "I")
	public static int anInt2334;

	@OriginalMember(owner = "client!ku", name = "F", descriptor = "Z")
	public static boolean aBoolean148 = false;

	@OriginalMember(owner = "client!ku", name = "M", descriptor = "I")
	public static int anInt2342 = 0;

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(IIC)C")
	public static char method1957(@OriginalArg(0) int arg0, @OriginalArg(2) char arg1) {
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

	@OriginalMember(owner = "client!ku", name = "d", descriptor = "(I)V")
	public static void method1959() {
		@Pc(10) Class1_Sub13 local10 = (Class1_Sub13) Static22.aClass37_50.method977();
		@Pc(21) boolean local21 = Static86.aClass156_4 != null || Static315.anInt5797 > 0;
		if (local21) {
			Static481.anInt7987 = 1;
		}
		if (Static546.aBoolean183 && Static149.aClass66_1.method1582(81) && Static16.anInt415 > 2) {
			if (local21) {
				Static109.aClass1_Sub24_4 = (Class1_Sub24) Static248.aClass37_30.aClass1_47.aClass1_283.aClass1_283;
			} else {
				Static484.method6632(local10.method5737(), local10.method5742(), (Class1_Sub24) Static248.aClass37_30.aClass1_47.aClass1_283.aClass1_283);
			}
		} else if (local21) {
			Static109.aClass1_Sub24_4 = (Class1_Sub24) Static248.aClass37_30.aClass1_47.aClass1_283;
		} else {
			Static484.method6632(local10.method5737(), local10.method5742(), (Class1_Sub24) Static248.aClass37_30.aClass1_47.aClass1_283);
		}
	}
}
