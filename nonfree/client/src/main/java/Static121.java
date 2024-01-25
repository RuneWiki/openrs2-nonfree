import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static121 {

	@OriginalMember(owner = "client!eu", name = "u", descriptor = "F")
	public static float aFloat79;

	@OriginalMember(owner = "client!eu", name = "x", descriptor = "Lclient!oa;")
	public static Class5 aClass5_7;

	@OriginalMember(owner = "client!eu", name = "B", descriptor = "[Z")
	public static final boolean[] aBooleanArray11 = new boolean[8];

	@OriginalMember(owner = "client!eu", name = "F", descriptor = "[I")
	public static final int[] anIntArray260 = new int[14];

	@OriginalMember(owner = "client!eu", name = "b", descriptor = "(III)B")
	public static byte method2212(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!eu", name = "e", descriptor = "(I)V")
	public static void method2214() {
		Static549.aClass125_71.method3521();
	}
}
