import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static364 {

	@OriginalMember(owner = "client!rv", name = "o", descriptor = "J")
	public static long aLong187;

	@OriginalMember(owner = "client!rv", name = "p", descriptor = "I")
	public static int anInt6346;

	@OriginalMember(owner = "client!rv", name = "m", descriptor = "Lclient!kj;")
	public static final Class131 aClass131_7 = new Class131("", 11);

	@OriginalMember(owner = "client!rv", name = "s", descriptor = "Lclient!bd;")
	public static final Class21 aClass21_103 = new Class21("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(IIIII[[[BIBILclient!qa;III)V")
	public static void method5206(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[][][] arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class30 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		if (arg6 == 0 || arg2 == 0) {
			return;
		}
		if (arg6 == 9) {
			arg9 = arg9 + 1 & 0x3;
			arg6 = 1;
		}
		if (arg6 == 10) {
			arg6 = 1;
			arg9 = arg9 + 3 & 0x3;
		}
		if (arg6 == 11) {
			arg9 = arg9 + 3 & 0x3;
			arg6 = 8;
		}
		arg8.ua(arg3, arg10, arg0, arg4, arg7, arg1, arg5[arg6 - 1][arg9], arg2, arg11);
	}

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "(B)Z")
	public static boolean method5207() {
		return Static379.aBoolean483;
	}
}
