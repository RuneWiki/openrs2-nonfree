import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static389 {

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "F")
	public static float aFloat58;

	@OriginalMember(owner = "client!nga", name = "g", descriptor = "I")
	public static int anInt1887;

	@OriginalMember(owner = "client!nga", name = "c", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_35 = new Class156(67, 8);

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(BIIIIII[[[BILclient!ha;III)V")
	public static void method1740(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[][][] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class100 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		if (arg9 == 0 || arg2 == 0) {
			return;
		}
		if (arg9 == 9) {
			arg5 = arg5 + 1 & 0x3;
			arg9 = 1;
		}
		if (arg9 == 10) {
			arg5 = arg5 + 3 & 0x3;
			arg9 = 1;
		}
		if (arg9 == 11) {
			arg5 = arg5 + 3 & 0x3;
			arg9 = 8;
		}
		arg8.Q(arg3, arg4, arg0, arg1, arg11, arg10, arg6[arg9 - 1][arg5], arg2, arg7);
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(IIB)Z")
	public static boolean method1741(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 >= 0 && arg0 >= 0 && Static172.aByteArrayArrayArray23[1].length > arg1 && Static172.aByteArrayArrayArray23[1][arg1].length > arg0) {
			return (Static172.aByteArrayArrayArray23[1][arg1][arg0] & 0x2) != 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(III)Z")
	public static boolean method1742(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x37) != 0;
	}
}
