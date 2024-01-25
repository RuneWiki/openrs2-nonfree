import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!it", name = "j", descriptor = "I")
	public static int anInt3254;

	@OriginalMember(owner = "client!it", name = "d", descriptor = "Lclient!uv;")
	public static final Class253 aClass253_70 = new Class253(74, 28);

	@OriginalMember(owner = "client!it", name = "i", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray27 = new String[100];

	@OriginalMember(owner = "client!it", name = "k", descriptor = "I")
	public static int anInt3255 = 0;

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(ZIC)C")
	public static char method2633(@OriginalArg(1) int arg0, @OriginalArg(2) char arg1) {
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

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(IIII)I")
	public static int method2634(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((Static347.aByteArrayArrayArray16[arg2][arg0][arg1] & 0x8) == 0) {
			return arg2 <= 0 || (Static347.aByteArrayArrayArray16[1][arg0][arg1] & 0x2) == 0 ? arg2 : arg2 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(ILjava/lang/String;IZIILjava/lang/String;IJZI)V")
	public static void method2635(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5, @OriginalArg(7) int arg6, @OriginalArg(8) long arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) int arg9) {
		if (!Static331.aBoolean372 && Static102.anInt2085 < 500) {
			@Pc(20) int local20 = arg2 == -1 ? Static194.anInt3446 : arg2;
			@Pc(34) Class7_Sub39 local34 = new Class7_Sub39(arg1, arg5, local20, arg9, arg4, arg7, arg0, arg6, arg8, arg3);
			Static237.aClass85_26.method2011(local34);
			Static102.anInt2085++;
		}
	}
}
