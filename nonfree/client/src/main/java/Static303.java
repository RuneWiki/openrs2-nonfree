import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static303 {

	@OriginalMember(owner = "client!kba", name = "o", descriptor = "Lclient!mda;")
	public static Class224 aClass224_1;

	@OriginalMember(owner = "client!kba", name = "e", descriptor = "J")
	public static long aLong146 = 0L;

	@OriginalMember(owner = "client!kba", name = "k", descriptor = "[I")
	public static final int[] anIntArray324 = new int[8];

	@OriginalMember(owner = "client!kba", name = "l", descriptor = "Lclient!uaa;")
	public static Class345 aClass345_8 = null;

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(IIIIII[[[BIILclient!ha;III)V")
	public static void method4806(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[][][] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class65 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		if (arg7 == 0 || arg4 == 0) {
			return;
		}
		if (arg7 == 9) {
			arg7 = 1;
			arg2 = arg2 + 1 & 0x3;
		}
		if (arg7 == 10) {
			arg2 = arg2 + 3 & 0x3;
			arg7 = 1;
		}
		if (arg7 == 11) {
			arg7 = 8;
			arg2 = arg2 + 3 & 0x3;
		}
		arg8.Q(arg6, arg1, arg10, arg0, arg11, arg3, arg5[arg7 - 1][arg2], arg4, arg9);
	}
}
