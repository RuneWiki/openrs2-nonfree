import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static196 {

	@OriginalMember(owner = "client!js", name = "g", descriptor = "Z")
	public static boolean aBoolean280 = false;

	@OriginalMember(owner = "client!js", name = "i", descriptor = "Lclient!tn;")
	public static Class229 aClass229_5 = null;

	@OriginalMember(owner = "client!js", name = "p", descriptor = "Lclient!gf;")
	public static final Class96 aClass96_57 = new Class96("Loaded defaults", "Standardeinstellungen geladen", "Paramètres par défaut chargés", "Padrões carregados");

	@OriginalMember(owner = "client!js", name = "A", descriptor = "J")
	public static long aLong113 = 0L;

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(I)[Lclient!og;")
	public static Class182[] method3037() {
		return new Class182[] { Static414.aClass182_5, Static264.aClass182_2, Static204.aClass182_1 };
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(IIIIIILclient!qa;IIII[[[BZ)V")
	public static void method3039(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class121 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) byte[][][] arg11) {
		if (arg7 == 0 || arg5 == 0) {
			return;
		}
		if (arg7 == 9) {
			arg9 = arg9 + 1 & 0x3;
			arg7 = 1;
		}
		if (arg7 == 10) {
			arg9 = arg9 + 3 & 0x3;
			arg7 = 1;
		}
		if (arg7 == 11) {
			arg9 = arg9 + 3 & 0x3;
			arg7 = 8;
		}
		arg6.aa(arg2, arg0, arg4, arg10, arg1, arg8, arg11[arg7 - 1][arg9], arg5, arg3);
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(IBI)B")
	public static byte method3040(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(II)Z")
	public static boolean method3041(@OriginalArg(1) int arg0) {
		return arg0 == 15 || arg0 == 30 || arg0 == 1002 || arg0 == 46 || arg0 == 47;
	}
}
