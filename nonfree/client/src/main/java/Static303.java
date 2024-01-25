import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static303 {

	@OriginalMember(owner = "client!kba", name = "h", descriptor = "[Lclient!fia;")
	public static Class45[] aClass45Array28;

	@OriginalMember(owner = "client!kba", name = "f", descriptor = "F")
	public static float aFloat142;

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(Z)V")
	public static void method6870(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static63.aClass89ArrayArrayArray1 = Static389.aClass89ArrayArrayArray2;
			Static258.aClass159Array1 = Static346.aClass159Array2;
		} else {
			Static63.aClass89ArrayArrayArray1 = Static501.aClass89ArrayArrayArray3;
			Static258.aClass159Array1 = Static445.aClass159Array3;
		}
		Static59.anInt987 = Static63.aClass89ArrayArrayArray1.length;
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(IIIIIIIII)Z")
	public static boolean method6871(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg7 < arg4 + arg0 && arg7 + arg1 > arg0) {
			return arg2 + arg3 > arg6 && arg2 < arg5 + arg6;
		} else {
			return false;
		}
	}
}
