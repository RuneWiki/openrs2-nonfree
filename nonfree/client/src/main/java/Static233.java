import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static233 {

	@OriginalMember(owner = "client!le", name = "b", descriptor = "Z")
	public static boolean aBoolean246 = false;

	@OriginalMember(owner = "client!le", name = "c", descriptor = "I")
	public static int anInt3854 = -2;

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V")
	public static void method3037() {
		if (Static199.anInt3319 == -1) {
			return;
		}
		@Pc(12) int local12 = Static290.aClass66_1.method5965();
		@Pc(18) int local18 = Static290.aClass66_1.method5974();
		@Pc(23) Class5_Sub4 local23 = (Class5_Sub4) Static362.aClass177_33.method3618();
		if (local23 != null) {
			local12 = local23.method3837();
			local18 = local23.method3833();
		}
		Static127.method1773(local18, Static178.anInt5792, Static102.anInt1723, Static199.anInt3319, 0, 0, 0, local12, 0);
		if (Static22.aClass76_2 != null) {
			Static267.method3705(local18, local12);
		}
	}
}
