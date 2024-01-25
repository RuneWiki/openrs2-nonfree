import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static674 {

	@OriginalMember(owner = "client!wq", name = "d", descriptor = "I")
	public static int anInt9799;

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "[I")
	public static final int[] anIntArray652 = new int[2];

	@OriginalMember(owner = "client!wq", name = "b", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray62 = new String[5];

	@OriginalMember(owner = "client!wq", name = "e", descriptor = "[I")
	public static final int[] anIntArray653 = new int[14];

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(Lclient!sha;I)Ljava/lang/String;")
	public static String method8277(@OriginalArg(0) Class321 arg0) {
		if (Static83.method1453(arg0).method5790() == 0) {
			return null;
		} else if (arg0.aString122 == null || arg0.aString122.trim().length() == 0) {
			return Static383.aBoolean423 ? "Hidden-use" : null;
		} else {
			return arg0.aString122;
		}
	}
}
