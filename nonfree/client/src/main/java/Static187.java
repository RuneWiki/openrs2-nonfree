import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static187 {

	@OriginalMember(owner = "client!mg", name = "L", descriptor = "I")
	public static int anInt4034;

	@OriginalMember(owner = "client!mg", name = "U", descriptor = "Lclient!wo;")
	public static Class216 aClass216_61;

	@OriginalMember(owner = "client!mg", name = "N", descriptor = "I")
	public static int anInt4035 = 1;

	@OriginalMember(owner = "client!mg", name = "V", descriptor = "[I")
	public static final int[] anIntArray369 = new int[5];

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "(II)Ljava/lang/String;")
	public static String method3660(@OriginalArg(0) int arg0) {
		if (arg0 < 100000) {
			return "<col=ffff00>" + arg0 + "</col>";
		} else if (arg0 < 10000000) {
			return "<col=ffffff>" + arg0 / 1000 + Static139.aClass34_137.method1285(Static2.anInt73) + "</col>";
		} else {
			return "<col=00ff80>" + arg0 / 1000000 + Static104.aClass34_76.method1285(Static2.anInt73) + "</col>";
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIII)Z")
	public static boolean method3661(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static23.method662(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << 7;
			@Pc(14) int local14 = arg2 << 7;
			return Static71.method3162(local10 + 1, Static298.aClass53Array3[arg0].method2785(arg1, arg2) + arg3, local14 + 1) && Static71.method3162(local10 + 128 - 1, Static298.aClass53Array3[arg0].method2785(arg1 + 1, arg2) + arg3, local14 + 1) && Static71.method3162(local10 + 128 - 1, Static298.aClass53Array3[arg0].method2785(arg1 + 1, arg2 + 1) + arg3, local14 + 128 - 1) && Static71.method3162(local10 + 1, Static298.aClass53Array3[arg0].method2785(arg1, arg2 + 1) + arg3, local14 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IBI)Z")
	public static boolean method3663(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (Static200.aByteArrayArrayArray8[1][arg0][arg1] & 0x2) != 0;
	}
}
