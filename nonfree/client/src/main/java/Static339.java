import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static339 {

	@OriginalMember(owner = "client!lg", name = "x", descriptor = "F")
	public static float aFloat115;

	@OriginalMember(owner = "client!lg", name = "r", descriptor = "Lclient!mga;")
	public static final Class218 aClass218_84 = new Class218(78, -1);

	@OriginalMember(owner = "client!lg", name = "s", descriptor = "[[I")
	public static final int[][] anIntArrayArray34 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(ZB)V")
	public static void method5098() {
		@Pc(14) Class3_Sub34 local14 = Static172.method3123(Static163.aClass375_1, Static464.aClass218_113);
		Static441.method6275(local14);
		for (@Pc(22) Class3_Sub46 local22 = (Class3_Sub46) Static455.aClass83_31.method2375(); local22 != null; local22 = (Class3_Sub46) Static455.aClass83_31.method2370()) {
			if (!local22.method9378()) {
				local22 = (Class3_Sub46) Static455.aClass83_31.method2375();
				if (local22 == null) {
					break;
				}
			}
			if (local22.anInt7850 == 0) {
				Static647.method8986(true, true, local22);
			}
		}
		if (Static95.aClass260_7 != null) {
			Static456.method8151(Static95.aClass260_7);
			Static95.aClass260_7 = null;
		}
	}
}
