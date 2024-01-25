import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static238 {

	@OriginalMember(owner = "client!k", name = "o", descriptor = "[[B")
	public static final byte[][] aByteArrayArray17 = new byte[250][];

	@OriginalMember(owner = "client!k", name = "p", descriptor = "[I")
	public static int[] anIntArray611 = new int[2];

	@OriginalMember(owner = "client!k", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString58 = null;

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(BI)I")
	public static int method5129(@OriginalArg(1) int arg0) {
		if (arg0 < 96) {
			return 0;
		} else if (arg0 < 128) {
			return 2;
		} else {
			return 3;
		}
	}
}
