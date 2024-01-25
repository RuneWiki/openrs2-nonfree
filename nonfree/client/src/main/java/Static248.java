import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static248 {

	@OriginalMember(owner = "client!ml", name = "D", descriptor = "Lclient!ap;")
	public static final Class15 aClass15_79 = new Class15("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

	@OriginalMember(owner = "client!ml", name = "L", descriptor = "I")
	public static int anInt4505 = 0;

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIBIIIIII)Z")
	public static boolean method3584(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg5 + arg7 > arg2 && arg6 + arg2 > arg7) {
			return arg4 + arg3 > arg1 && arg1 + arg0 > arg4;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "([IB[J)V")
	public static void method3585(@OriginalArg(0) int[] arg0, @OriginalArg(2) long[] arg1) {
		Static254.method3351(arg0, arg1, arg1.length - 1, 0);
	}

	@OriginalMember(owner = "client!ml", name = "d", descriptor = "(B)V")
	public static void method3590() {
		Static143.aClass67_14.method1431();
		Static333.aClass67_29.method1431();
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IZ)Z")
	public static boolean method3592(@OriginalArg(0) int arg0) {
		return arg0 >= 12 && arg0 <= 17;
	}
}
