import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static212 {

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "Lclient!uj;")
	public static Class4_Sub3_Sub14 aClass4_Sub3_Sub14_4;

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "Z")
	public static boolean aBoolean293;

	@OriginalMember(owner = "client!pj", name = "c", descriptor = "I")
	public static int anInt4163;

	@OriginalMember(owner = "client!pj", name = "f", descriptor = "I")
	public static int anInt4165;

	@OriginalMember(owner = "client!pj", name = "m", descriptor = "[[B")
	public static byte[][] aByteArrayArray31;

	@OriginalMember(owner = "client!pj", name = "d", descriptor = "[[B")
	public static byte[][] aByteArrayArray30 = new byte[250][];

	@OriginalMember(owner = "client!pj", name = "g", descriptor = "I")
	public static int anInt4166 = 0;

	@OriginalMember(owner = "client!pj", name = "h", descriptor = "Z")
	public static boolean aBoolean294 = false;

	@OriginalMember(owner = "client!pj", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString243 = "";

	@OriginalMember(owner = "client!pj", name = "j", descriptor = "[I")
	public static int[] anIntArray440 = new int[2];

	@OriginalMember(owner = "client!pj", name = "k", descriptor = "[I")
	public static int[] anIntArray441 = new int[128];

	@OriginalMember(owner = "client!pj", name = "l", descriptor = "[C")
	public static char[] aCharArray2 = new char[128];

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(ZIZ)Ljava/lang/String;")
	public static String method3449(@OriginalArg(1) int arg0) {
		return arg0 < 0 ? Integer.toString(arg0) : Static112.method4414(arg0);
	}
}
