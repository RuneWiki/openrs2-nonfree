import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static259 {

	@OriginalMember(owner = "client!ms", name = "ic", descriptor = "Lclient!c;")
	public static Class34 aClass34_6;

	@OriginalMember(owner = "client!ms", name = "jc", descriptor = "Lclient!mg;")
	public static Class10_Sub28 aClass10_Sub28_4;

	@OriginalMember(owner = "client!ms", name = "Rb", descriptor = "Lclient!je;")
	public static final Class127 aClass127_16 = new Class127(7, 0, 1, 1);

	@OriginalMember(owner = "client!ms", name = "kc", descriptor = "I")
	public static int anInt6287 = -1;

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(II)V")
	public static void method4909(@OriginalArg(0) int arg0) {
		Static370.anInt6392 = -1;
		if (arg0 == 37) {
			Static143.aFloat49 = 3.0F;
		} else if (arg0 == 50) {
			Static143.aFloat49 = 4.0F;
		} else if (arg0 == 75) {
			Static143.aFloat49 = 6.0F;
		} else if (arg0 == 100) {
			Static143.aFloat49 = 8.0F;
		} else if (arg0 == 200) {
			Static143.aFloat49 = 16.0F;
		}
		Static370.anInt6392 = -1;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "([Ljava/lang/String;I[S)V")
	public static void method4921(@OriginalArg(0) String[] arg0, @OriginalArg(2) short[] arg1) {
		Static69.method1355(arg0, arg0.length - 1, 0, arg1);
	}
}
