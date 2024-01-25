import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static235 {

	@OriginalMember(owner = "client!lm", name = "A", descriptor = "Lclient!o;")
	public static Class137 aClass137_13;

	@OriginalMember(owner = "client!lm", name = "N", descriptor = "I")
	public static int anInt4661;

	@OriginalMember(owner = "client!lm", name = "w", descriptor = "I")
	public static int anInt4651 = -1;

	@OriginalMember(owner = "client!lm", name = "x", descriptor = "I")
	public static final int anInt4652 = 328;

	@OriginalMember(owner = "client!lm", name = "H", descriptor = "[I")
	public static final int[] anIntArray438 = new int[] { 2047, 16383, 65535 };

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lclient!ui;I)Z")
	public static boolean method3587(@OriginalArg(0) Class248 arg0) {
		return arg0 == Static374.aClass248_6 || arg0 == Static63.aClass248_2 || Static436.aClass248_9 == arg0 || arg0 == Static437.aClass248_10;
	}
}
