import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static503 {

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "[Lclient!oh;")
	public static Class273[] aClass273Array2;

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "I")
	public static int anInt2766;

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "[Lclient!tl;")
	public static Class4_Sub2[] aClass4_Sub2Array3;

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IZZ)V")
	public static void method2433(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (arg0) {
			Static145.anInt2471--;
			if (Static145.anInt2471 == 0) {
				Static488.anIntArray557 = null;
			}
		}
		if (arg1) {
			Static388.anInt6468--;
			if (Static388.anInt6468 == 0) {
				Static555.anIntArray633 = null;
			}
		}
	}
}
