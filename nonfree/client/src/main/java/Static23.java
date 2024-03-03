import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!bh", name = "m", descriptor = "Lclient!rc;")
	public static Class42 aClass42_2;

	@OriginalMember(owner = "client!bh", name = "o", descriptor = "I")
	public static int anInt638;

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(ILclient!nk;)V", line = 18)
	public static void method852(@OriginalArg(1) Class161 arg0) {
		if (arg0.anInt4265 == 5 && arg0.anInt4293 != -1) {
			Static43.method1424(Static177.aClass19_8, arg0);
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IBI)Lclient!dg;", line = 31)
	public static Class46 method853(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class46 local12 = new Class46();
		local12.anInt1482 = -1;
		local12.anInt1485 = arg0 + 1 + 5;
		local12.anInt1470 = arg1 + 5 + 1;
		local12.anInt1466 = -1;
		local12.anIntArrayArray14 = new int[local12.anInt1470][local12.anInt1485];
		local12.method1628();
		return local12;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIIIIIII)Z", line = 96)
	public static boolean method856(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg3 < arg4 + arg6 && arg7 + arg3 > arg4) {
			return arg0 + arg2 > arg1 && arg2 < arg1 + arg5;
		} else {
			return false;
		}
	}
}
