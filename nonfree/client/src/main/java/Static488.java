import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static488 {

	@OriginalMember(owner = "client!re", name = "j", descriptor = "Lclient!lc;")
	public static final Class200 aClass200_123 = new Class200(77, 2);

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(CII)C")
	public static char method7258(@OriginalArg(0) char arg0, @OriginalArg(2) int arg1) {
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

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(III)Z")
	public static boolean method7261(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(I[BLjava/lang/String;I)I")
	public static int method7267(@OriginalArg(1) byte[] arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		@Pc(19) int local19 = arg1.length();
		for (@Pc(21) int local21 = 0; local21 < local19; local21 += 4) {
			@Pc(29) int local29 = Static232.method3888(arg1.charAt(local21));
			@Pc(44) int local44 = local21 + 1 < local19 ? Static232.method3888(arg1.charAt(local21 + 1)) : -1;
			@Pc(59) int local59 = local21 + 2 < local19 ? Static232.method3888(arg1.charAt(local21 + 2)) : -1;
			@Pc(78) int local78 = local21 + 3 >= local19 ? -1 : Static232.method3888(arg1.charAt(local21 + 3));
			arg0[arg2++] = (byte) (local29 << 2 | local44 >>> 4);
			if (local59 == -1) {
				break;
			}
			arg0[arg2++] = (byte) (local59 >>> 2 | (local44 & 0xF) << 4);
			if (local78 == -1) {
				break;
			}
			arg0[arg2++] = (byte) (local78 | (local59 & 0x3) << 6);
		}
		return arg2;
	}
}
