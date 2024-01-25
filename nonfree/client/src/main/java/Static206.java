import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static206 {

	@OriginalMember(owner = "client!hd", name = "K", descriptor = "Z")
	public static boolean aBoolean211;

	@OriginalMember(owner = "client!hd", name = "d", descriptor = "Lclient!ul;")
	public static final Class357 aClass357_12 = new Class357("", 10);

	@OriginalMember(owner = "client!hd", name = "g", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_136 = new Class179(83, -1);

	@OriginalMember(owner = "client!hd", name = "o", descriptor = "[I")
	public static final int[] anIntArray201 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!hd", name = "H", descriptor = "I")
	public static int anInt3564 = -1;

	@OriginalMember(owner = "client!hd", name = "N", descriptor = "I")
	public static int anInt3566 = 0;

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIBII)V")
	public static void method3064(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 < arg0) {
			Static270.method3998(arg3, arg2, arg0, Static173.anIntArrayArray15[arg1]);
		} else {
			Static270.method3998(arg3, arg0, arg2, Static173.anIntArrayArray15[arg1]);
		}
	}
}
