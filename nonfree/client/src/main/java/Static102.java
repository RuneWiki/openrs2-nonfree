import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static102 {

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "[S")
	public static short[] aShortArray16;

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "F")
	public static float aFloat11 = 0.0F;

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "[I")
	public static int[] anIntArray207 = new int[200];

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "I")
	public static int anInt2404 = 0;

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(ZZ)V")
	public static void method1747(@OriginalArg(1) boolean arg0) {
		if (arg0 != Static273.aBoolean361) {
			Static273.aBoolean361 = arg0;
			Static103.method1790();
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
	public static void method1748() {
		Static80.aClass157_14.method4033();
	}
}
