import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static116 {

	@OriginalMember(owner = "client!dv", name = "g", descriptor = "Lclient!cj;")
	public static final Class57 aClass57_4 = new Class57(64);

	@OriginalMember(owner = "client!dv", name = "k", descriptor = "[F")
	public static final float[] aFloatArray18 = new float[4];

	@OriginalMember(owner = "client!dv", name = "p", descriptor = "Z")
	public static boolean aBoolean191 = false;

	@OriginalMember(owner = "client!dv", name = "V", descriptor = "Z")
	public static boolean aBoolean192 = false;

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "([I[JI)V")
	public static void method1962(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1) {
		Static56.method1192(arg0, 0, arg1.length - 1, arg1);
	}
}
