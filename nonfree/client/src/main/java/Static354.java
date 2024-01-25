import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static354 {

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method5314(@OriginalArg(0) String arg0) {
		return Static437.method6295(fha.class, arg0);
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(Ljava/lang/String;I)J")
	public static long method5315(@OriginalArg(0) String arg0) {
		@Pc(6) long local6 = (long) 0;
		@Pc(9) int local9 = arg0.length();
		for (@Pc(11) int local11 = 0; local11 < local9; local11++) {
			local6 *= 37L;
			@Pc(20) char local20 = arg0.charAt(local11);
			if (local20 >= 'A' && local20 <= 'Z') {
				local6 += (long) (local20 + 1 - 65);
			} else if (local20 >= 'a' && local20 <= 'z') {
				local6 += (long) (local20 + 1 - 97);
			} else if (local20 >= '0' && local20 <= '9') {
				local6 += (long) (local20 + 27 - 48);
			}
			if (local6 >= 177917621779460413L) {
				break;
			}
		}
		while (local6 % 37L == 0L && local6 != 0L) {
			local6 /= 37L;
		}
		return local6;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(CI)C")
	public static char method5316(@OriginalArg(0) char arg0) {
		if (arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-') {
			return '_';
		} else if (arg0 == '[' || arg0 == ']' || arg0 == '#') {
			return arg0;
		} else if (arg0 == 'à' || arg0 == 'á' || arg0 == 'â' || arg0 == 'ä' || arg0 == 'ã' || arg0 == 'À' || arg0 == 'Á' || arg0 == 'Â' || arg0 == 'Ä' || arg0 == 'Ã') {
			return 'a';
		} else if (arg0 == 'è' || arg0 == 'é' || arg0 == 'ê' || arg0 == 'ë' || arg0 == 'È' || arg0 == 'É' || arg0 == 'Ê' || arg0 == 'Ë') {
			return 'e';
		} else if (arg0 == 'í' || arg0 == 'î' || arg0 == 'ï' || arg0 == 'Í' || arg0 == 'Î' || arg0 == 'Ï') {
			return 'i';
		} else if (arg0 == 'ò' || arg0 == 'ó' || arg0 == 'ô' || arg0 == 'ö' || arg0 == 'õ' || arg0 == 'Ò' || arg0 == 'Ó' || arg0 == 'Ô' || arg0 == 'Ö' || arg0 == 'Õ') {
			return 'o';
		} else if (arg0 == 'ù' || arg0 == 'ú' || arg0 == 'û' || arg0 == 'ü' || arg0 == 'Ù' || arg0 == 'Ú' || arg0 == 'Û' || arg0 == 'Ü') {
			return 'u';
		} else if (arg0 == 'ç' || arg0 == 'Ç') {
			return 'c';
		} else if (arg0 == 'ÿ' || arg0 == 'Ÿ') {
			return 'y';
		} else if (arg0 == 'ñ' || arg0 == 'Ñ') {
			return 'n';
		} else if (arg0 == 'ß') {
			return 'b';
		} else {
			return Character.toLowerCase(arg0);
		}
	}
}
