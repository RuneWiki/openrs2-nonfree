import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static559 {

	@OriginalMember(owner = "client!tb", name = "hb", descriptor = "Lclient!ne;")
	public static Class247 aClass247_1;

	@OriginalMember(owner = "client!tb", name = "eb", descriptor = "[Z")
	public static final boolean[] aBooleanArray25 = new boolean[100];

	@OriginalMember(owner = "client!tb", name = "ib", descriptor = "I")
	public static int anInt9430 = 0;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!ha;B)V")
	public static void method8097(@OriginalArg(0) Class57 arg0) {
		if (Static221.aClass102_30.method1927() == 0) {
			return;
		}
		@Pc(64) Class5_Sub31 local64;
		if (Static637.aClass5_Sub20_31.aClass24_Sub10_1.method3153() == 0) {
			for (local64 = (Class5_Sub31) Static221.aClass102_30.method1916(); local64 != null; local64 = (Class5_Sub31) Static221.aClass102_30.method1915()) {
				Static201.aClass127_1.method2495(local64.anInt5586, arg0, local64.anInt5589, local64.aBoolean430 ? Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.aClass100_1 : null, arg0, false, Static41.aClass80_2, local64.anInt5590, local64.anInt5587, local64.anInt5588, false);
				local64.method9327(1);
			}
			Static437.method6493();
			return;
		}
		if (Static229.aClass57_7 == null) {
			@Pc(34) Canvas local34 = new Canvas();
			local34.setSize(36, 32);
			Static229.aClass57_7 = Static637.method8915(0, local34, 0, Static509.anInterface1_10, Static226.aClass208_56);
			Static262.aClass80_9 = Static229.aClass57_7.method7708(Static494.method7119(Static179.anInt2990, Static85.aClass208_16), Static684.method3653(Static345.aClass208_78, Static179.anInt2990));
		}
		for (local64 = (Class5_Sub31) Static221.aClass102_30.method1916(); local64 != null; local64 = (Class5_Sub31) Static221.aClass102_30.method1915()) {
			Static201.aClass127_1.method2495(local64.anInt5586, Static229.aClass57_7, local64.anInt5589, local64.aBoolean430 ? Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.aClass100_1 : null, arg0, false, Static262.aClass80_9, local64.anInt5590, local64.anInt5587, local64.anInt5588, false);
			local64.method9327(1);
		}
	}
}
