import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "([Ljava/lang/String;I[S)V", line = 8)
	public static void method2536(@OriginalArg(0) String[] arg0, @OriginalArg(2) short[] arg1) {
		Static175.method3469(arg1, 0, arg0.length - 1, arg0);
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(BIC)C", line = 30)
	public static char method2538(@OriginalArg(1) int arg0, @OriginalArg(2) char arg1) {
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

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;", line = 143)
	public static String method2539(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(16) int local16 = 0;
		@Pc(19) int local19 = arg0.length();
		while (local19 > local16 && Static111.method3456(arg0.charAt(local16))) {
			local16++;
		}
		while (local16 < local19 && Static111.method3456(arg0.charAt(local19 - 1))) {
			local19--;
		}
		@Pc(50) int local50 = local19 - local16;
		if (local50 < 1 || local50 > 12) {
			return null;
		}
		@Pc(63) StringBuffer local63 = new StringBuffer(local50);
		for (@Pc(65) int local65 = local16; local65 < local19; local65++) {
			@Pc(71) char local71 = arg0.charAt(local65);
			if (Static150.method2955(local71)) {
				@Pc(79) char local79 = Static317.method5763(local71);
				if (local79 != '\u0000') {
					local63.append(local79);
				}
			}
		}
		if (local63.length() == 0) {
			return null;
		} else {
			return local63.toString();
		}
	}
}
