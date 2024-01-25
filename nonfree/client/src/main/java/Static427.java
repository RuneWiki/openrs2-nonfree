import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static427 {

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "Lclient!da;")
	public static Class44 aClass44_34;

	@OriginalMember(owner = "client!nj", name = "f", descriptor = "[I")
	public static final int[] anIntArray417 = new int[25];

	@OriginalMember(owner = "client!nj", name = "c", descriptor = "(I)V")
	public static void method6535() {
		if (!Static212.aBoolean297) {
			return;
		}
		@Pc(17) Class20 local17 = Static244.method3731(Static397.anInt7112, Static198.anInt3491);
		if (local17 != null && local17.anObjectArray28 != null) {
			@Pc(28) Class3_Sub7 local28 = new Class3_Sub7();
			local28.aClass20_2 = local17;
			local28.anObjectArray1 = local17.anObjectArray28;
			Static185.method2811(local28);
		}
		Static355.anInt6021 = -1;
		Static212.aBoolean297 = false;
		Static575.anInt9446 = -1;
		if (local17 != null) {
			Static391.method5905(local17);
		}
	}
}
