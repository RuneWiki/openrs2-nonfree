import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static400 {

	@OriginalMember(owner = "client!of", name = "c", descriptor = "Lclient!jda;")
	public static Class165 aClass165_1;

	@OriginalMember(owner = "client!of", name = "f", descriptor = "D")
	public static double aDouble21;

	@OriginalMember(owner = "client!of", name = "l", descriptor = "Lclient!wu;")
	public static Class384 aClass384_100;

	@OriginalMember(owner = "client!of", name = "e", descriptor = "I")
	public static int anInt6935 = 0;

	@OriginalMember(owner = "client!of", name = "i", descriptor = "[I")
	public static final int[] anIntArray549 = new int[3];

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IBI)I")
	public static int method6180(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		arg0 = (arg1 & 0x7F) * arg0 >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0 + (arg1 & 0xFF80);
	}
}
