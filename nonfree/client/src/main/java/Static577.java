import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static577 {

	@OriginalMember(owner = "client!wca", name = "c", descriptor = "[Lclient!au;")
	public static final Interface2[] anInterface2Array2 = new Interface2[128];

	@OriginalMember(owner = "client!wca", name = "d", descriptor = "I")
	public static int anInt9375 = 0;

	@OriginalMember(owner = "client!wca", name = "b", descriptor = "(B)V")
	public static void method7796() {
		Static427.aClass162_31.method3518();
		Static266.aClass171_3.method3790();
		Static128.aClass171_2.method3790();
	}

	@OriginalMember(owner = "client!wca", name = "d", descriptor = "(B)V")
	public static void method7798() {
		@Pc(5) int local5;
		if (Static538.aClass148Array4 != null) {
			for (local5 = 0; local5 < Static56.anInt1297; local5++) {
				Static538.aClass148Array4[local5] = null;
			}
			Static538.aClass148Array4 = null;
		}
		if (Static374.aClass148Array3 != null) {
			for (local5 = 0; local5 < Static572.anInt9312; local5++) {
				Static374.aClass148Array3[local5] = null;
			}
			Static374.aClass148Array3 = null;
		}
		if (Static322.aClass148Array2 != null) {
			for (local5 = 0; local5 < Static493.anInt8313; local5++) {
				Static322.aClass148Array2[local5] = null;
			}
			Static322.aClass148Array2 = null;
		}
		Static259.aClass148Array1 = null;
		Static266.anIntArray333 = null;
		Static499.anInt8381 = -1;
		Static98.anInt2032 = -1;
		Static119.anIntArrayArrayArray15 = null;
	}
}
