import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static200 {

	@OriginalMember(owner = "client!oi", name = "h", descriptor = "F")
	public static float aFloat96;

	@OriginalMember(owner = "client!oi", name = "i", descriptor = "[[I")
	public static int[][] anIntArrayArray35;

	@OriginalMember(owner = "client!oi", name = "c", descriptor = "Lclient!gh;")
	public static Class67 aClass67_1 = Static273.method1541();

	@OriginalMember(owner = "client!oi", name = "g", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray24 = new String[5];

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lclient!fh;BII)[Lclient!uj;")
	public static Class4_Sub3_Sub14[] method3238(@OriginalArg(0) Class58 arg0, @OriginalArg(3) int arg1) {
		return Static12.method197(arg0, arg1, 0) ? Static138.method2065() : null;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(BI)Ljava/lang/String;")
	public static String method3239(@OriginalArg(1) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lclient!fh;I)V")
	public static void method3241(@OriginalArg(0) Class58 arg0) {
		Static126.aClass58_55 = arg0;
		Static76.anInt5720 = Static126.aClass58_55.method1371(4);
	}
}
