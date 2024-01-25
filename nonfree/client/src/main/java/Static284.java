import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static284 {

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "F")
	public static float aFloat105;

	@OriginalMember(owner = "client!jo", name = "d", descriptor = "Lclient!aj;")
	public static Class15 aClass15_77;

	@OriginalMember(owner = "client!jo", name = "f", descriptor = "Z")
	public static boolean aBoolean361 = false;

	@OriginalMember(owner = "client!jo", name = "h", descriptor = "[I")
	public static final int[] anIntArray441 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(II)Z")
	public static boolean method4528(@OriginalArg(0) int arg0) {
		return arg0 == 4 || arg0 == 8 || arg0 == 11;
	}
}
