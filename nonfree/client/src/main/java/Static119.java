import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static119 {

	@OriginalMember(owner = "client!dv", name = "b", descriptor = "I")
	public static int anInt1918;

	@OriginalMember(owner = "client!dv", name = "p", descriptor = "F")
	public static float aFloat13;

	@OriginalMember(owner = "client!dv", name = "k", descriptor = "Lclient!rl;")
	public static final Class317 aClass317_13 = new Class317(128, 4);

	@OriginalMember(owner = "client!dv", name = "i", descriptor = "[I")
	public static final int[] anIntArray109 = new int[2];

	@OriginalMember(owner = "client!dv", name = "u", descriptor = "[F")
	public static final float[] aFloatArray7 = new float[4];

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/String;I)V")
	public static void method1854(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		if (arg1.length() > 320 || !Static351.method9355()) {
			return;
		}
		Static122.method1938();
		Static426.anInt7228 = arg2;
		Static314.aString72 = arg1;
		Static187.aString36 = arg0;
		Static160.method2323(6);
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(III)Z")
	public static boolean method1855(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static385.method5887(arg0, arg1) || Static133.method2018(0x80 ^ 0xFFFFFF50, arg0, arg1);
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(IIIII)V")
	public static void method1858(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		Static135.anInt2134 = arg2;
		Static525.anInt9013 = arg1;
		Static530.anInt9102 = arg0;
		Static271.anInt5025 = arg3;
	}
}
