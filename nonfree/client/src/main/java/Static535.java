import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static535 {

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "F")
	public static float aFloat190;

	@OriginalMember(owner = "client!sc", name = "k", descriptor = "Lclient!gj;")
	public static Class143 aClass143_121;

	@OriginalMember(owner = "client!sc", name = "m", descriptor = "Lclient!ha;")
	public static Class16 aClass16_10;

	@OriginalMember(owner = "client!sc", name = "j", descriptor = "[I")
	public static final int[] anIntArray562 = new int[2];

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILclient!afa;)I")
	public static int method7438(@OriginalArg(1) Class11 arg0) {
		if (arg0 == Static19.aClass11_1) {
			return 7681;
		} else if (arg0 == Static458.aClass11_4) {
			return 8448;
		} else if (arg0 == Static49.aClass11_2) {
			return 34165;
		} else if (arg0 == Static333.aClass11_3) {
			return 260;
		} else if (arg0 == Static539.aClass11_5) {
			return 34023;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
