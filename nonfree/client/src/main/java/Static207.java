import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static207 {

	@OriginalMember(owner = "client!nh", name = "F", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray10;

	@OriginalMember(owner = "client!nh", name = "G", descriptor = "F")
	public static float aFloat82;

	@OriginalMember(owner = "client!nh", name = "I", descriptor = "Lclient!qj;")
	public static Class165 aClass165_63;

	@OriginalMember(owner = "client!nh", name = "D", descriptor = "Lclient!ng;")
	public static final Class140 aClass140_104 = new Class140(64);

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(ZIIII)I")
	public static int method3717(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(20) int local20 = 65536 - Class1_Sub1_Sub16.anIntArray586[arg3 * 8192 / arg1] >> 1;
		return (arg2 * local20 >> 16) + ((65536 - local20) * arg0 >> 16);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(BIIIIII)V")
	public static void method3719(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static106.anInt2157 <= arg1 - arg2 && arg1 + arg2 <= Static251.anInt6512 && Static49.anInt1124 <= arg5 - arg2 && arg5 + arg2 <= Static291.anInt5657) {
			Static78.method1542(arg3, arg4, arg0, arg5, arg1, arg2);
		} else {
			Static133.method2522(arg5, arg2, arg3, arg0, arg4, arg1);
		}
	}
}
