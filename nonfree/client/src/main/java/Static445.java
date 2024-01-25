import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static445 {

	@OriginalMember(owner = "client!sm", name = "e", descriptor = "I")
	public static int anInt7648;

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "[F")
	public static final float[] aFloatArray57 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(B)V")
	public static void method6365() {
		Static384.aClass313_46.method7400();
		Static416.aClass313_51.method7400();
		Static425.aClass313_54.method7400();
		Static431.aClass313_56.method7400();
		Static71.aClass313_7.method7400();
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(ILclient!lg;)I")
	public static int method6366(@OriginalArg(1) Class181 arg0) {
		if (arg0 == Static162.aClass181_2) {
			return 5890;
		} else if (Static30.aClass181_1 == arg0) {
			return 34167;
		} else if (Static295.aClass181_3 == arg0) {
			return 34168;
		} else if (Static312.aClass181_4 == arg0) {
			return 34166;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "(B)V")
	public static void method6367() {
		Static104.aClass313_9.method7398();
	}
}
