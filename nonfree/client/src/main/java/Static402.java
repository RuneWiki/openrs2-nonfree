import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static402 {

	@OriginalMember(owner = "client!ud", name = "i", descriptor = "I")
	public static int anInt6545;

	@OriginalMember(owner = "client!ud", name = "e", descriptor = "[I")
	public static final int[] anIntArray514 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(BII)I")
	public static int method5297(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return arg1 + (arg0 & 0xFF80);
	}
}
