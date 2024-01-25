import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ae", name = "j", descriptor = "Lclient!kda;")
	public static Class173 aClass173_3;

	@OriginalMember(owner = "client!ae", name = "k", descriptor = "Lclient!oh;")
	public static Class237 aClass237_3;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "Lclient!pia;")
	public static final Class257 aClass257_4 = new Class257(78, 0);

	@OriginalMember(owner = "client!ae", name = "i", descriptor = "Lclient!jl;")
	public static final Class159 aClass159_1 = new Class159(128);

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)Z")
	public static boolean method90() {
		@Pc(12) boolean local12 = true;
		if (Static169.aClass111_1 == null) {
			if (Static630.aClass237_149.method6296(Static391.anInt7561)) {
				Static169.aClass111_1 = Static647.method3299(Static630.aClass237_149, Static391.anInt7561);
			} else {
				local12 = false;
			}
		}
		if (Static614.aClass111_3 == null) {
			if (Static630.aClass237_149.method6296(Static518.anInt9046)) {
				Static614.aClass111_3 = Static647.method3299(Static630.aClass237_149, Static518.anInt9046);
			} else {
				local12 = false;
			}
		}
		if (Static365.aClass111_4 == null) {
			if (Static630.aClass237_149.method6296(Static307.anInt6236)) {
				Static365.aClass111_4 = Static647.method3299(Static630.aClass237_149, Static307.anInt6236);
			} else {
				local12 = false;
			}
		}
		if (Static70.aClass345_6 == null) {
			if (Static264.aClass237_69.method6296(Static637.anInt10651)) {
				Static70.aClass345_6 = Static549.method7716(Static264.aClass237_69, Static637.anInt10651);
			} else {
				local12 = false;
			}
		}
		if (Static249.aClass111Array1 == null) {
			if (Static630.aClass237_149.method6296(Static637.anInt10651)) {
				Static249.aClass111Array1 = Static647.method3298(Static630.aClass237_149, Static637.anInt10651);
			} else {
				local12 = false;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(B)V")
	public static void method91() {
		if (!Static147.aBoolean270) {
			return;
		}
		@Pc(11) Class331 local11 = Static201.method3722(Static401.anInt7697, Static391.anInt7576);
		if (local11 != null && local11.anObjectArray31 != null) {
			@Pc(20) Class8_Sub40 local20 = new Class8_Sub40();
			local20.anObjectArray2 = local11.anObjectArray31;
			local20.aClass331_14 = local11;
			Static273.method4698(local20);
		}
		Static341.anInt6662 = -1;
		Static147.aBoolean270 = false;
		Static230.anInt5229 = -1;
		if (local11 != null) {
			Static86.method2113(local11);
		}
	}
}
