import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static233 {

	@OriginalMember(owner = "client!rl", name = "Q", descriptor = "Lclient!ak;")
	public static Class7 aClass7_191;

	@OriginalMember(owner = "client!rl", name = "O", descriptor = "I")
	public static int anInt4880 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!rl", name = "V", descriptor = "Ljava/lang/String;")
	public static String aString158 = "Starting 3d Library";

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(II)V")
	public static void method3723(@OriginalArg(1) int arg0) {
		Static274.anInt5464 = -1;
		Static269.anInt5391 = -1;
		Static36.anInt4790 = arg0;
		Static125.method1921();
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!tf;Lclient!tf;B)V")
	public static void method3724(@OriginalArg(0) Class1 arg0, @OriginalArg(1) Class1 arg1) {
		if (arg1.aClass1_231 != null) {
			arg1.method4534();
		}
		arg1.aClass1_230 = arg0;
		arg1.aClass1_231 = arg0.aClass1_231;
		arg1.aClass1_231.aClass1_230 = arg1;
		arg1.aClass1_230.aClass1_231 = arg1;
	}

	@OriginalMember(owner = "client!rl", name = "d", descriptor = "(I)I")
	public static int method3728() {
		return 2;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IBZ)Ljava/lang/String;")
	public static String method3729(@OriginalArg(0) int arg0) {
		return arg0 < 0 ? Integer.toString(arg0) : Static124.method1918(arg0);
	}
}
