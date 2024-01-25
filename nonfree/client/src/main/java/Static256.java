import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static256 {

	@OriginalMember(owner = "client!mv", name = "d", descriptor = "I")
	public static int anInt4943;

	@OriginalMember(owner = "client!mv", name = "e", descriptor = "Lclient!ah;")
	public static Class9 aClass9_5;

	@OriginalMember(owner = "client!mv", name = "g", descriptor = "[[B")
	public static byte[][] aByteArrayArray15;

	@OriginalMember(owner = "client!mv", name = "h", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray25;

	@OriginalMember(owner = "client!mv", name = "b", descriptor = "I")
	public static final int anInt4941 = 1407;

	@OriginalMember(owner = "client!mv", name = "k", descriptor = "I")
	public static int anInt4946 = 0;

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(FIFF)F")
	public static float method4182(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return arg1 + arg0 * (arg2 - arg1);
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(I)V")
	public static void method4185() {
		if (Static178.aClass55_2 != null) {
			Static178.aClass55_2.method5667();
		}
		if (Static1.aClass55_1 != null) {
			Static1.aClass55_1.method5667();
		}
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(III)Z")
	public static boolean method4186(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static433.method1197(arg0, arg1) & Static329.method4879(arg0, arg1);
	}
}
