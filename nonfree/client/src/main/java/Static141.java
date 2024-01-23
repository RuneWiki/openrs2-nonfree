import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "I")
	public static int anInt3048;

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "[Lclient!lc;")
	public static Class41[] aClass41Array7;

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "Lclient!fa;")
	public static Class38 aClass38_8;

	@OriginalMember(owner = "client!oa", name = "h", descriptor = "I")
	public static int anInt3050;

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "I")
	public static int anInt3047 = 0;

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "[Lclient!qa;")
	public static Class91[] aClass91Array2 = new Class91[50];

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1065 = Static64.method1101("Okay");

	@OriginalMember(owner = "client!oa", name = "i", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1066 = Static64.method1101("null");

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)V")
	public static void method2423() {
		while (true) {
			if (Static225.aClass1_Sub16_Sub1_4.method3825(Static142.anInt3128) >= 27) {
				@Pc(12) int local12 = Static225.aClass1_Sub16_Sub1_4.method3824(15);
				if (local12 != 32767) {
					@Pc(17) boolean local17 = false;
					if (Static168.aClass5_Sub1_Sub2Array1[local12] == null) {
						local17 = true;
						Static168.aClass5_Sub1_Sub2Array1[local12] = new Class5_Sub1_Sub2();
					}
					@Pc(33) Class5_Sub1_Sub2 local33 = Static168.aClass5_Sub1_Sub2Array1[local12];
					Static202.anIntArray326[Static58.anInt1372++] = local12;
					local33.anInt3627 = Static109.anInt2430;
					@Pc(49) int local49 = Static225.aClass1_Sub16_Sub1_4.method3824(1);
					if (local49 == 1) {
						Static145.anIntArray216[Static226.anInt4738++] = local12;
					}
					local33.aClass27_1 = Static168.method2871(Static225.aClass1_Sub16_Sub1_4.method3824(14));
					@Pc(77) int local77 = Static205.anIntArray328[Static225.aClass1_Sub16_Sub1_4.method3824(3)];
					if (local17) {
						local33.anInt3581 = local33.anInt3575 = local77;
					}
					@Pc(90) int local90 = Static225.aClass1_Sub16_Sub1_4.method3824(1);
					@Pc(95) int local95 = Static225.aClass1_Sub16_Sub1_4.method3824(5);
					@Pc(100) int local100 = Static225.aClass1_Sub16_Sub1_4.method3824(5);
					local33.anInt3584 = local33.aClass27_1.anInt822;
					local33.anInt3618 = local33.aClass27_1.anInt796;
					local33.anInt3625 = local33.aClass27_1.anInt801;
					if (local95 > 15) {
						local95 -= 32;
					}
					local33.anInt3629 = local33.aClass27_1.anInt821;
					local33.anInt3580 = local33.aClass27_1.anInt819;
					if (local100 > 15) {
						local100 -= 32;
					}
					local33.anInt3600 = local33.aClass27_1.anInt815;
					local33.anInt3604 = local33.aClass27_1.anInt811;
					local33.anInt3623 = local33.aClass27_1.anInt807;
					local33.anInt3601 = local33.aClass27_1.anInt827;
					if (local33.anInt3601 == 0) {
						local33.anInt3575 = 0;
					}
					local33.method2797(Static73.aClass5_Sub1_Sub1_1.anIntArray233[0] + local100, local90 == 1, Static73.aClass5_Sub1_Sub1_1.anIntArray238[0] + local95);
					if (local33.aClass27_1.method603()) {
						Static187.method3123(local33, local33.anIntArray238[0], null, Static197.anInt2422, null, 0, local33.anIntArray233[0]);
					}
					continue;
				}
			}
			Static225.aClass1_Sub16_Sub1_4.method3826();
			return;
		}
	}
}
