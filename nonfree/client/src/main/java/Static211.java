import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static211 {

	@OriginalMember(owner = "client!gk", name = "i", descriptor = "Lclient!lba;")
	public static final Class218 aClass218_18 = new Class218(16);

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Z)Lclient!hja;")
	public static Class157 method2956() {
		try {
			return (Class157) Class.forName("rla").getDeclaredConstructor().newInstance();
		} catch (@Pc(16) Throwable local16) {
			return new Class157_Sub1();
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(ILjava/lang/String;)[B")
	public static byte[] method2957(@OriginalArg(1) String arg0) {
		@Pc(6) int local6 = arg0.length();
		if (local6 == 0) {
			return new byte[0];
		}
		@Pc(18) int local18 = local6 + 3 & 0xFFFFFFFC;
		@Pc(32) int local32 = local18 / 4 * 3;
		if (local18 - 2 >= local6 || Static692.method9326(arg0.charAt(local18 - 2)) == -1) {
			local32 -= 2;
		} else if (local18 - 1 >= local6 || Static692.method9326(arg0.charAt(local18 - 1)) == -1) {
			local32--;
		}
		@Pc(82) byte[] local82 = new byte[local32];
		Static404.method5982(local82, arg0, 0);
		return local82;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(CII)C")
	public static char method2958(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
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
