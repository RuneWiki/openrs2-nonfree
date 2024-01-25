import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static498 {

	@OriginalMember(owner = "client!rr", name = "d", descriptor = "Lclient!eq;")
	public static Class97 aClass97_125;

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "Lclient!qe;")
	public static final Class274 aClass274_139 = new Class274(44, 2);

	@OriginalMember(owner = "client!rr", name = "e", descriptor = "Lclient!qe;")
	public static final Class274 aClass274_140 = new Class274(119, 6);

	@OriginalMember(owner = "client!rr", name = "f", descriptor = "[I")
	public static int[] anIntArray582 = new int[2];

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(B)V")
	public static void method7093() {
		if (Static387.anInt6978 == -1) {
			return;
		}
		@Pc(12) int local12 = Static6.aClass40_1.method4504();
		@Pc(16) int local16 = Static6.aClass40_1.method4499();
		@Pc(21) Class2_Sub32 local21 = (Class2_Sub32) Static72.aClass238_9.method5833();
		if (local21 != null) {
			local12 = local21.method8558();
			local16 = local21.method8563();
		}
		@Pc(33) int local33 = 0;
		@Pc(39) int local39 = 0;
		if (Static558.aBoolean680) {
			local33 = Static257.method4233();
			local39 = Static290.method4545();
		}
		Static609.method8335(local12, local39, local12 + local33, Static585.anInt9606 + local39, local39, local33, Static387.anInt6978, local16, local33, local39 + local16, Static571.anInt9399 + local33);
		if (Static71.aClass78_1 != null) {
			Static541.method7593(local33 + local12, local39 + local16);
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(I)V")
	public static void method7094() {
		Static643.method8596();
		Static642.aBoolean757 = false;
		Static122.method2496(Static133.anInt3038, Static254.anInt5025, Static256.anInt5056, Static378.anInt6772);
	}
}
