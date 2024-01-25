import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static465 {

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "Z")
	public static boolean aBoolean543 = false;

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(Lclient!sl;III)Lclient!od;")
	public static Class1_Sub1_Sub16 method6810(@OriginalArg(0) Class266 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg0.anInt7492 | arg2 << 8;
		@Pc(24) Class1_Sub1_Sub16 local24 = (Class1_Sub1_Sub16) Static196.aClass290_2.method7078((long) local15 << 16);
		if (local24 != null) {
			return local24;
		}
		@Pc(36) byte[] local36 = Static214.aClass160_48.method4216(Static214.aClass160_48.method4203(local15));
		if (local36 == null) {
			local15 = arg1 + 65536 << 8 | arg0.anInt7492;
			local24 = (Class1_Sub1_Sub16) Static196.aClass290_2.method7078((long) local15 << 16);
			if (local24 != null) {
				return local24;
			}
			local36 = Static214.aClass160_48.method4216(Static214.aClass160_48.method4203(local15));
			if (local36 == null) {
				local15 = arg0.anInt7492 | 0xFFFF00;
				local24 = (Class1_Sub1_Sub16) Static196.aClass290_2.method7078((long) local15 << 16);
				if (local24 != null) {
					return local24;
				}
				local36 = Static214.aClass160_48.method4216(Static214.aClass160_48.method4203(local15));
				if (local36 == null) {
					return null;
				} else if (local36.length <= 1) {
					return null;
				} else {
					local24 = Static7.method229(local36);
					local24.aClass266_7 = arg0;
					Static196.aClass290_2.method7077((long) local15 << 16, local24);
					return local24;
				}
			} else if (local36.length <= 1) {
				return null;
			} else {
				local24 = Static7.method229(local36);
				local24.aClass266_7 = arg0;
				Static196.aClass290_2.method7077((long) local15 << 16, local24);
				return local24;
			}
		} else if (local36.length <= 1) {
			return null;
		} else {
			local24 = Static7.method229(local36);
			local24.aClass266_7 = arg0;
			Static196.aClass290_2.method7077((long) local15 << 16, local24);
			return local24;
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(CIB)C")
	public static char method6811(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
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
