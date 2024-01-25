import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static143 {

	@OriginalMember(owner = "client!eh", name = "tb", descriptor = "I")
	public static int anInt2679;

	@OriginalMember(owner = "client!eh", name = "r", descriptor = "F")
	public static float aFloat55;

	@OriginalMember(owner = "client!eh", name = "kb", descriptor = "Lclient!ct;")
	public static final Class58 aClass58_1 = new Class58();

	@OriginalMember(owner = "client!eh", name = "wb", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_43 = new Class186(25, 6);

	@OriginalMember(owner = "client!eh", name = "rb", descriptor = "I")
	public static int anInt2734 = -1;

	@OriginalMember(owner = "client!eh", name = "j", descriptor = "[I")
	public static final int[] anIntArray131 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "(III)Z")
	public static boolean method2370(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static480.method7028(arg1, arg0) & Static163.method2626(arg0, arg1);
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)I")
	public static int method2382() {
		return Static293.anInt5243 == 1 ? Static575.anInt9444 : 0;
	}
}
