import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!mc", name = "bb", descriptor = "[I")
	public static int[] anIntArray266;

	@OriginalMember(owner = "client!mc", name = "N", descriptor = "I")
	public static int anInt3465 = 0;

	@OriginalMember(owner = "client!mc", name = "O", descriptor = "I")
	public static int anInt3466 = 0;

	@OriginalMember(owner = "client!mc", name = "R", descriptor = "I")
	public static int anInt3469 = 0;

	@OriginalMember(owner = "client!mc", name = "S", descriptor = "Ljava/lang/String;")
	public static String aString224 = "Loading interfaces - ";

	@OriginalMember(owner = "client!mc", name = "U", descriptor = "I")
	public static int anInt3471 = 0;

	@OriginalMember(owner = "client!mc", name = "Z", descriptor = "I")
	public static int anInt3473 = 0;

	@OriginalMember(owner = "client!mc", name = "fb", descriptor = "I")
	public static int anInt3477 = -1;

	@OriginalMember(owner = "client!mc", name = "hb", descriptor = "[S")
	public static short[] aShortArray48 = new short[] { -4160, -4163, -8256, -8259, 22461 };

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(IB)Z")
	public static boolean method2604(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		@Pc(27) int local27 = Static57.aShortArray26[arg0];
		if (local27 >= 2000) {
			local27 -= 2000;
		}
		return local27 == 1006;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIILclient!sa;IJIIII)Z")
	public static boolean method2608(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class9 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) long arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		return arg4 == null ? true : Static242.method3984(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
	}
}
