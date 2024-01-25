import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!dq", name = "V", descriptor = "I")
	public static int anInt1830;

	@OriginalMember(owner = "client!dq", name = "nb", descriptor = "Lclient!pj;")
	public static Class248 aClass248_16;

	@OriginalMember(owner = "client!dq", name = "mb", descriptor = "Lclient!uc;")
	public static final Class316 aClass316_21 = new Class316(12, 7);

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(BCI)C")
	public static char method1665(@OriginalArg(1) char arg0, @OriginalArg(2) int arg1) {
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

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(Ljava/lang/String;Lclient!jr;I)I")
	public static int method1668(@OriginalArg(0) String arg0, @OriginalArg(1) Class6_Sub12 arg1) {
		@Pc(6) int local6 = arg1.anInt7556;
		@Pc(10) byte[] local10 = Static225.method3532(arg0);
		arg1.method6028(local10.length);
		arg1.anInt7556 += Static204.aClass301_1.method6854(0, local10, local10.length, arg1.anInt7556, arg1.aByteArray97);
		return arg1.anInt7556 - local6;
	}
}
