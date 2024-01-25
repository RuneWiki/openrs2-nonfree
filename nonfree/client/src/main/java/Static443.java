import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static443 {

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "Lclient!jk;")
	public static Class128 aClass128_9;

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "[I")
	public static final int[] anIntArray509 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!wk", name = "d", descriptor = "I")
	public static int anInt7737 = -1;

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(JI)V")
	public static void method5991(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static364.method5066(arg0 - 1L);
			Static364.method5066(1L);
		} else {
			Static364.method5066(arg0);
		}
	}
}
