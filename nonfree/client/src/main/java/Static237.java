import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static237 {

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
	public static int anInt4547;

	@OriginalMember(owner = "client!mc", name = "k", descriptor = "I")
	public static int anInt4550;

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "I")
	public static int anInt4548 = 0;

	@OriginalMember(owner = "client!mc", name = "h", descriptor = "Lclient!nj;")
	public static final Class171 aClass171_39 = new Class171(8);

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)V")
	public static void method3667() {
		if (!Static385.aBoolean441) {
			return;
		}
		@Pc(15) Class68 local15 = Static259.method3899(Static154.anInt3161, Static142.anInt3047);
		if (local15 != null && local15.anObjectArray14 != null) {
			@Pc(24) Class2_Sub30 local24 = new Class2_Sub30();
			local24.aClass68_12 = local15;
			local24.anObjectArray35 = local15.anObjectArray14;
			Static168.method2731(local24);
		}
		Static385.aBoolean441 = false;
		Static54.anInt1162 = -1;
		Static423.anInt7418 = -1;
		if (local15 != null) {
			Static78.method1460(local15);
		}
	}
}
