import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static566 {

	@OriginalMember(owner = "client!tba", name = "L", descriptor = "[Lclient!nga;")
	public static Class249[] aClass249Array1;

	@OriginalMember(owner = "client!tba", name = "vb", descriptor = "Lclient!pv;")
	public static Class4_Sub41 aClass4_Sub41_1;

	@OriginalMember(owner = "client!tba", name = "Lb", descriptor = "I")
	public static int anInt8739;

	@OriginalMember(owner = "client!tba", name = "n", descriptor = "[I")
	public static final int[] anIntArray618 = new int[3];

	@OriginalMember(owner = "client!tba", name = "E", descriptor = "F")
	public static float aFloat202 = 0.0F;

	@OriginalMember(owner = "client!tba", name = "Wb", descriptor = "[F")
	public static final float[] aFloatArray63 = new float[4];

	@OriginalMember(owner = "client!tba", name = "b", descriptor = "(II)Z")
	public static boolean method7494(@OriginalArg(1) int arg0) {
		if (arg0 == 20 || arg0 == 11 || arg0 == 15 || arg0 == 16 || arg0 == 22) {
			return true;
		} else {
			return arg0 == 30 || arg0 == 1012;
		}
	}

	@OriginalMember(owner = "client!tba", name = "b", descriptor = "(B)Lclient!cf;")
	public static Class22_Sub1 method7508() {
		Static93.anInt1937 = 0;
		return Static100.method2024();
	}
}
