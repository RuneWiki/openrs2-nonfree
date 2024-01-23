import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static102 {

	@OriginalMember(owner = "client!hb", name = "h", descriptor = "[Lclient!ub;")
	public static Class172[] aClass172Array1;

	@OriginalMember(owner = "client!hb", name = "j", descriptor = "Lclient!fh;")
	public static Class58 aClass58_47;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString120 = "Attack";

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "I")
	public static int anInt2140 = 0;

	@OriginalMember(owner = "client!hb", name = "d", descriptor = "I")
	public static int anInt2142 = 0;

	@OriginalMember(owner = "client!hb", name = "f", descriptor = "[[I")
	public static int[][] anIntArrayArray17 = new int[5][5000];

	@OriginalMember(owner = "client!hb", name = "i", descriptor = "I")
	public static int anInt2145 = 0;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IB)I")
	public static int method1678(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(I[Lclient!ih;)V")
	public static void method1680(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub12[] arg1) {
		Static189.aClass4_Sub12ArrayArray2[arg0] = arg1;
	}
}
