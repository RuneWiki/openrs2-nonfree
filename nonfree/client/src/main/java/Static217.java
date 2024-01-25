import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static217 {

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "I")
	public static int anInt4323;

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "[I")
	public static final int[] anIntArray307 = new int[] { 104, 120, 136, 168 };

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "Lclient!ce;")
	public static Class5_Sub6 aClass5_Sub6_1 = null;

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "Ljava/lang/String;")
	public static final String aString251 = "yellow:";

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method3824(@OriginalArg(0) String arg0) {
		Static170.method3228(0, "", 0, arg0, "");
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)I")
	public static int method3826(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}
}
