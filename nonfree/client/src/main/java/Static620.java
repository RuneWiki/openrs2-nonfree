import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static620 {

	@OriginalMember(owner = "client!uv", name = "x", descriptor = "I")
	public static int anInt9925 = 0;

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(I)V")
	public static void method8733() {
		Static74.aClass260Array1 = null;
		if (Static82.aBoolean134 && Static673.method9353() != 1) {
			Static43.method1108(0, Static406.anInt6454 == 3 || Static406.anInt6454 == 7, 0, Static309.method4729(), Static299.method4618());
		}
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		if (Static82.aBoolean134) {
			local32 = Static31.method748();
			local34 = Static147.method2738();
		}
		Static153.method2800(local34 + Static222.anInt4196, local32, local32 + Static312.anInt5191, -1, Static110.anInt2265, local32, local34, local34);
		if (Static74.aClass260Array1 != null) {
			Static193.method3545(local34 + Static222.anInt4196, true, local34, local32, Static312.anInt5191 + local32, -1412584499, Static75.anInt1402, Static330.anInt5485, Static416.aClass260_13.anInt7001, Static74.aClass260Array1);
			Static74.aClass260Array1 = null;
		}
	}
}
