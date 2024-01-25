import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static262 {

	@OriginalMember(owner = "client!kca", name = "A", descriptor = "F")
	public static float aFloat116;

	@OriginalMember(owner = "client!kca", name = "d", descriptor = "(I)V")
	public static void method3784(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			if (Static503.anInt8607 == 2) {
				Static218.aClass144Array1[0].method3253(Static465.aClass160Array1[0]);
				Static218.aClass144Array1[1].method3253(Static465.aClass160Array1[1]);
			} else if (Static503.anInt8607 == 3) {
				Static218.aClass144Array1[0].method3253(Static465.aClass160Array1[0]);
				Static218.aClass144Array1[1].method3253(Static465.aClass160Array1[1]);
				Static218.aClass144Array1[2].method3253(Static465.aClass160Array1[2]);
			} else {
				Static218.aClass144Array1[0].method3253(Static465.aClass160Array1[0]);
				Static218.aClass144Array1[1].method3253(Static465.aClass160Array1[1]);
				Static218.aClass144Array1[2].method3253(Static465.aClass160Array1[2]);
				Static218.aClass144Array1[3].method3253(Static465.aClass160Array1[3]);
			}
		} else if (arg0 == 1) {
			if (Static503.anInt8607 == 2) {
				Static218.aClass144Array1[0].method3253(Static465.aClass160Array1[2]);
			} else if (Static503.anInt8607 == 3) {
				Static218.aClass144Array1[0].method3253(Static465.aClass160Array1[3]);
				Static218.aClass144Array1[1].method3253(Static465.aClass160Array1[4]);
			} else {
				Static218.aClass144Array1[0].method3253(Static465.aClass160Array1[4]);
				Static218.aClass144Array1[1].method3253(Static465.aClass160Array1[5]);
				Static218.aClass144Array1[2].method3253(Static465.aClass160Array1[6]);
			}
		} else if (arg0 == 2) {
			if (Static503.anInt8607 == 2) {
				Static218.aClass144Array1[0].method3253(Static465.aClass160Array1[3]);
				return;
			}
			if (Static503.anInt8607 == 3) {
				Static218.aClass144Array1[0].method3253(Static465.aClass160Array1[5]);
				return;
			}
			Static218.aClass144Array1[0].method3253(Static465.aClass160Array1[7]);
		}
	}
}
