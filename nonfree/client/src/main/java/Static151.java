import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!t", name = "r", descriptor = "I")
	public static int anInt3416 = 0;

	@OriginalMember(owner = "client!t", name = "v", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1191 = Static65.method1172("Fehler bei der Verbindung zum Server)3");

	@OriginalMember(owner = "client!t", name = "H", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1192 = Static65.method1172("scape main");

	@OriginalMember(owner = "client!t", name = "b", descriptor = "(I)V")
	public static void method2488() {
		@Pc(1) Object local1 = Static29.anObject3;
		synchronized (Static29.anObject3) {
			if (Static147.anInt3355 != 0) {
				Static147.anInt3355 = 1;
				try {
					Static29.anObject3.wait();
				} catch (@Pc(12) InterruptedException local12) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!t", name = "d", descriptor = "(I)V")
	public static void method2490() {
		aClass46_1192 = null;
		aClass46_1191 = null;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIIIIBI)V")
	public static void method2491(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (Static57.method1063(arg5)) {
			Static1.method9(arg4, -1, arg0, arg6, Static26.aClass33ArrayArray1[arg5], arg3, arg2, arg1);
		}
	}

	@OriginalMember(owner = "client!t", name = "b", descriptor = "(B)V")
	public static void method2492() {
		Static95.aClass57_18.method1715();
		Static70.aClass57_16.method1715();
		Static153.aClass57_25.method1715();
	}
}
