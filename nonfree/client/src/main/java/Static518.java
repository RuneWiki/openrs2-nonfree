import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static518 {

	@OriginalMember(owner = "client!sm", name = "H", descriptor = "[I")
	public static int[] anIntArray491;

	@OriginalMember(owner = "client!sm", name = "Q", descriptor = "I")
	public static int anInt8914;

	@OriginalMember(owner = "client!sm", name = "I", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray70 = new String[100];

	@OriginalMember(owner = "client!sm", name = "d", descriptor = "(II)I")
	public static int method7681(@OriginalArg(1) int arg0) {
		if (arg0 < 96) {
			return 0;
		} else if (arg0 < 128) {
			return 2;
		} else {
			return 3;
		}
	}
}
