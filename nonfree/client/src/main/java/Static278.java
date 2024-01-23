import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static278 {

	@OriginalMember(owner = "client!uk", name = "g", descriptor = "Lclient!cg;")
	public static Class22 aClass22_96;

	@OriginalMember(owner = "client!uk", name = "h", descriptor = "[I")
	public static int[] anIntArray422;

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString179 = "Face here";

	@OriginalMember(owner = "client!uk", name = "c", descriptor = "I")
	public static int anInt5381 = 0;

	@OriginalMember(owner = "client!uk", name = "f", descriptor = "Lclient!tm;")
	public static Class163 aClass163_35 = new Class163(16);

	@OriginalMember(owner = "client!uk", name = "j", descriptor = "[Z")
	public static boolean[] aBooleanArray35 = new boolean[5];

	@OriginalMember(owner = "client!uk", name = "l", descriptor = "I")
	public static int anInt5386 = 0;

	@OriginalMember(owner = "client!uk", name = "m", descriptor = "I")
	public static int anInt5387 = -1;

	@OriginalMember(owner = "client!uk", name = "n", descriptor = "I")
	public static int anInt5388 = 2;

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
	public static void method4263(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		Static259.method4047(arg0, arg2, arg1, -1, 9);
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(II)V")
	public static void method4265(@OriginalArg(1) int arg0) {
		Static292.aFloatArray28[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static292.aFloatArray28[0] = (float) (arg0 >> 16 & 0xFF) / 255.0F;
		Static292.aFloatArray28[1] = (float) (arg0 >> 8 & 0xFF) / 255.0F;
		Static39.method723(3);
		Static39.method723(4);
	}
}
