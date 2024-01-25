import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static139 {

	@OriginalMember(owner = "client!go", name = "ld", descriptor = "I")
	public static int anInt2674;

	@OriginalMember(owner = "client!go", name = "Mc", descriptor = "I")
	public static int anInt2664 = 0;

	@OriginalMember(owner = "client!go", name = "Oc", descriptor = "Lclient!uv;")
	public static final Class253 aClass253_51 = new Class253(36, -2);

	@OriginalMember(owner = "client!go", name = "Yc", descriptor = "[[B")
	public static final byte[][] aByteArrayArray7 = new byte[1000][];

	@OriginalMember(owner = "client!go", name = "gd", descriptor = "I")
	public static int anInt2671 = -1;

	@OriginalMember(owner = "client!go", name = "nd", descriptor = "Lclient!uv;")
	public static final Class253 aClass253_52 = new Class253(107, 8);

	@OriginalMember(owner = "client!go", name = "qd", descriptor = "[F")
	public static final float[] aFloatArray6 = new float[4];

	@OriginalMember(owner = "client!go", name = "rd", descriptor = "Ljava/lang/String;")
	public static String aString32 = null;

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(II)I")
	public static int method2153(@OriginalArg(1) int arg0) {
		return arg0 == 16711935 ? -1 : Static283.method3743(arg0);
	}

	@OriginalMember(owner = "client!go", name = "b", descriptor = "(II)Z")
	public static boolean method2166(@OriginalArg(0) int arg0) {
		if (arg0 == 10 || arg0 == 60 || arg0 == 23 || arg0 == 47 || arg0 == 1012) {
			return true;
		} else {
			return arg0 == 46 || arg0 == 1011;
		}
	}
}
