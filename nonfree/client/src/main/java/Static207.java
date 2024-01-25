import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static207 {

	@OriginalMember(owner = "client!ib", name = "g", descriptor = "I")
	public static int anInt3873;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "[F")
	public static final float[] aFloatArray25 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!ib", name = "d", descriptor = "[I")
	public static int[] anIntArray189 = new int[2];

	@OriginalMember(owner = "client!ib", name = "f", descriptor = "Lclient!aba;")
	public static final Class4_Sub2 aClass4_Sub2_1 = new Class4_Sub2(0, -1);

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIII)V")
	public static void method3458(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1002) {
			Static388.method6111(Static123.aClass147_4, arg1, arg0);
		} else if (arg2 == 1008) {
			Static388.method6111(Static211.aClass147_8, arg1, arg0);
		} else if (arg2 == 1012) {
			Static388.method6111(Static56.aClass147_2, arg1, arg0);
		} else if (arg2 == 1010) {
			Static388.method6111(Static364.aClass147_9, arg1, arg0);
		} else if (arg2 == 1004) {
			Static388.method6111(Static185.aClass147_5, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)J")
	public static long method3459() {
		return Static589.aClass151_1.method6451();
	}
}
