import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static453 {

	@OriginalMember(owner = "client!wn", name = "p", descriptor = "Lclient!uq;")
	public static Class251 aClass251_13;

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(I)V")
	public static void method5942() {
		if (Static407.anInt6564 == -1) {
			return;
		}
		@Pc(11) int local11 = Static125.aClass114_1.method2701();
		@Pc(15) int local15 = Static125.aClass114_1.method2698();
		@Pc(20) Class1_Sub7 local20 = (Class1_Sub7) Static447.aClass181_64.method4112();
		if (local20 != null) {
			local11 = local20.method3633();
			local15 = local20.method3632();
		}
		Static43.method807(local15, Static34.anInt715, 0, Static407.anInt6564, 0, local11, Static95.anInt1971, 0, 0);
		if (Static325.aClass251_9 != null) {
			Static210.method3327(local11, local15);
		}
	}
}
