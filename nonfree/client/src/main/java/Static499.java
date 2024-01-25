import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static499 {

	@OriginalMember(owner = "client!ru", name = "b", descriptor = "Lclient!in;")
	public static Class157 aClass157_245;

	@OriginalMember(owner = "client!ru", name = "c", descriptor = "I")
	public static int anInt9242;

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(B)V")
	public static void method7732() {
		if (Static475.anInt10143 == -1) {
			return;
		}
		@Pc(12) int local12 = Static628.aClass9_1.method803();
		@Pc(16) int local16 = Static628.aClass9_1.method800();
		@Pc(21) Class2_Sub9 local21 = (Class2_Sub9) Static253.aClass341_64.method8524();
		if (local21 != null) {
			local12 = local21.method7079();
			local16 = local21.method7082();
		}
		@Pc(33) int local33 = 0;
		@Pc(40) int local40 = 0;
		if (Static487.aBoolean676) {
			local33 = Static465.method7210();
			local40 = Static207.method4090();
		}
		Static449.method7069(Static475.anInt10143, local33, local33, Static81.anInt2497 + local33, local16, local12, local12 + local33, Static423.anInt7984 + local40, local40, local40 + local16, local40);
		if (Static50.aClass24_5 != null) {
			Static516.method7854(local40 + local16, local33 + local12);
		}
	}
}
