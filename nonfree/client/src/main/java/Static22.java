import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!ba", name = "i", descriptor = "Lclient!ui;")
	public static Class230 aClass230_59;

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "Lclient!at;")
	public static final Class17 aClass17_35 = new Class17();

	@OriginalMember(owner = "client!ba", name = "e", descriptor = "I")
	public static int anInt3895 = 0;

	@OriginalMember(owner = "client!ba", name = "f", descriptor = "Lclient!sl;")
	public static final Class213 aClass213_14 = new Class213("", 13);

	@OriginalMember(owner = "client!ba", name = "g", descriptor = "Lclient!fa;")
	public static Class77 aClass77_29 = new Class77(8);

	@OriginalMember(owner = "client!ba", name = "h", descriptor = "Lclient!ct;")
	public static final Class48 aClass48_135 = new Class48(75, 4);

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIIIII)Lclient!as;")
	public static Class16 method3209(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(33) long local33 = (long) arg3 * 76724863L ^ (long) arg5 * 475427L ^ (long) arg2 * 97549L ^ (long) arg1 * 67481L ^ (long) arg0 * 986053L ^ (long) arg4 * 32147369L;
		@Pc(39) Class16 local39 = (Class16) Static45.aClass227_5.method4863(local33);
		if (local39 == null) {
			local39 = Static330.aClass164_8.method5325(arg1, arg2, arg5, arg0, arg4, arg3);
			Static45.aClass227_5.method4865(local39, local33);
			return local39;
		} else {
			return local39;
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IZC)C")
	public static char method3210(@OriginalArg(0) int arg0, @OriginalArg(2) char arg1) {
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
}
