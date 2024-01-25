import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!aq", name = "w", descriptor = "I")
	public static int anInt381 = 0;

	@OriginalMember(owner = "client!aq", name = "y", descriptor = "I")
	public static int anInt383 = 0;

	@OriginalMember(owner = "client!aq", name = "b", descriptor = "(I)V")
	public static void method626() {
		Static312.method5482();
		for (@Pc(14) int local14 = 0; local14 < 4; local14++) {
			Static169.aClass151Array1[local14].method4101();
		}
		Static10.method373();
		Static224.method3940();
		System.gc();
	}

	@OriginalMember(owner = "client!aq", name = "c", descriptor = "(I)J")
	public static long method627() {
		return Static355.aClass66_1.method5844();
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(JBLclient!ae;)V")
	public static void method628(@OriginalArg(0) long arg0, @OriginalArg(2) Class4 arg1) {
		Static157.anInt3178 = Static136.anInt2825;
		Static182.anInt3604 = 0;
		Static136.anInt2825 = 0;
		@Pc(16) long local16 = Static51.method1197();
		for (@Pc(26) Class55_Sub7 local26 = (Class55_Sub7) Static28.aClass67_3.method2098(); local26 != null; local26 = (Class55_Sub7) Static28.aClass67_3.method2104()) {
			if (local26.method4031(arg1, arg0)) {
				Static182.anInt3604++;
			}
		}
		if (Static143.aBoolean257 && arg0 % 100L == 0L) {
			System.out.println("Particle system count: " + Static28.aClass67_3.method2099() + ", running: " + Static182.anInt3604 + ". Particles: " + Static136.anInt2825 + ". Time taken: " + (Static51.method1197() - local16) + "ms");
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(II)V")
	public static void method630(@OriginalArg(0) int arg0) {
		if (!Static265.method5886(arg0)) {
			return;
		}
		@Pc(18) Class146[] local18 = Static265.aClass146ArrayArray41[arg0];
		for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
			@Pc(26) Class146 local26 = local18[local20];
			if (local26 != null) {
				local26.anInt4433 = 0;
				local26.anInt4441 = 0;
				local26.anInt4427 = 1;
			}
		}
	}
}
