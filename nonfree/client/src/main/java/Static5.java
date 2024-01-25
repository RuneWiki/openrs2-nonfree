import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!af", name = "c", descriptor = "Lclient!eh;")
	public static final Class67 aClass67_5 = new Class67(39, -1);

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(I)V")
	public static void method50() {
		if (Static118.anInt1785 == -1) {
			return;
		}
		@Pc(12) int local12 = Static181.aClass224_1.method5613();
		@Pc(23) int local23 = Static181.aClass224_1.method5615();
		@Pc(28) Class1_Sub22 local28 = (Class1_Sub22) Static378.aClass14_45.method203();
		if (local28 != null) {
			local12 = local28.method4162();
			local23 = local28.method4161();
		}
		Static401.method5189(local12, Static40.anInt597, Static192.anInt3532, 0, local23, 0, 0, 0, Static118.anInt1785);
		if (Static399.aClass107_14 != null) {
			Static363.method4760(local23, local12);
		}
	}
}
