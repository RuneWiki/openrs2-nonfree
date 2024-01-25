import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static331 {

	@OriginalMember(owner = "client!nr", name = "X", descriptor = "[[B")
	public static byte[][] aByteArrayArray21;

	@OriginalMember(owner = "client!nr", name = "L", descriptor = "Lclient!qu;")
	public static final Class243 aClass243_63 = new Class243(66, 2);

	@OriginalMember(owner = "client!nr", name = "W", descriptor = "I")
	public static int anInt6217 = 0;

	@OriginalMember(owner = "client!nr", name = "Y", descriptor = "[[I")
	public static final int[][] anIntArrayArray56 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!nr", name = "Z", descriptor = "Lclient!gu;")
	public static final Class107 aClass107_5 = new Class107();

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(ILclient!wca;)Ljava/lang/String;")
	public static String method5295(@OriginalArg(1) Class310 arg0) {
		if (Static67.method1257(arg0).method6272() == 0) {
			return null;
		} else if (arg0.aString208 == null || arg0.aString208.trim().length() == 0) {
			return Static372.aBoolean522 ? "Hidden-use" : null;
		} else {
			return arg0.aString208;
		}
	}
}
