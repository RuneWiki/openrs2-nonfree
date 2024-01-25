import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static368 {

	@OriginalMember(owner = "client!mi", name = "x", descriptor = "I")
	public static int anInt6436;

	@OriginalMember(owner = "client!mi", name = "y", descriptor = "[Lclient!cp;")
	public static Interface2[] anInterface2Array1;

	@OriginalMember(owner = "client!mi", name = "O", descriptor = "[J")
	public static long[] aLongArray15;

	@OriginalMember(owner = "client!mi", name = "H", descriptor = "Lclient!ofa;")
	public static final Class255 aClass255_16 = new Class255(2);

	@OriginalMember(owner = "client!mi", name = "M", descriptor = "Z")
	public static boolean aBoolean461 = false;

	@OriginalMember(owner = "client!mi", name = "N", descriptor = "[I")
	public static final int[] anIntArray364 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!mi", name = "P", descriptor = "I")
	public static int anInt6448 = 0;

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(II)V")
	public static void method5403(@OriginalArg(1) int arg0) {
		Static158.anInt2662 = -1;
		Static255.anInt4085 = arg0;
		Static195.anInt3145 = -1;
		Static383.method5626();
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(FFIF)F")
	public static float method5406(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		return arg2 + (arg0 - arg2) * arg1;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(ILjava/lang/String;I)I")
	public static int method5407(@OriginalArg(1) String arg0) {
		return Static31.method398(16, arg0);
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(BI)I")
	public static int method5409(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}
}
