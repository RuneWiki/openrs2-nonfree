import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static29 {

	@OriginalMember(owner = "client!be", name = "f", descriptor = "Lclient!um;")
	public static Class243 aClass243_24;

	@OriginalMember(owner = "client!be", name = "e", descriptor = "I")
	public static int anInt561 = 0;

	@OriginalMember(owner = "client!be", name = "h", descriptor = "[F")
	public static final float[] aFloatArray1 = new float[4];

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(I[Ljava/lang/Object;[I)V")
	public static void method460(@OriginalArg(1) Object[] arg0, @OriginalArg(2) int[] arg1) {
		Static133.method1867(arg1, arg0, arg1.length - 1, 0);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IB)V")
	public static void method462(@OriginalArg(0) int arg0) {
		if (Static223.anInt3720 == 0) {
			Static210.aClass5_Sub22_Sub1_1.method2762(arg0);
		} else {
			Static178.anInt5791 = arg0;
		}
	}
}
