import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!i", name = "L", descriptor = "I")
	public static int anInt1993;

	@OriginalMember(owner = "client!i", name = "Q", descriptor = "Lclient!pf;")
	public static Class2_Sub2_Sub16_Sub1 aClass2_Sub2_Sub16_Sub1_2;

	@OriginalMember(owner = "client!i", name = "X", descriptor = "[Lclient!ge;")
	public static Class2_Sub10[] aClass2_Sub10Array1;

	@OriginalMember(owner = "client!i", name = "c", descriptor = "[S")
	public static short[] aShortArray58 = new short[] { -10304, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!i", name = "D", descriptor = "Lclient!i;")
	private static Class41 aClass41_595 = Static184.method2923("This world is full)3");

	@OriginalMember(owner = "client!i", name = "J", descriptor = "I")
	public static int anInt1991 = 0;

	@OriginalMember(owner = "client!i", name = "M", descriptor = "Lclient!i;")
	public static Class41 aClass41_596 = Static184.method2923("<col=ffffff>");

	@OriginalMember(owner = "client!i", name = "N", descriptor = "I")
	public static int anInt1994 = 0;

	@OriginalMember(owner = "client!i", name = "U", descriptor = "I")
	public static int anInt1998 = 2;

	@OriginalMember(owner = "client!i", name = "fb", descriptor = "Lclient!i;")
	public static Class41 aClass41_597 = aClass41_595;

	@OriginalMember(owner = "client!i", name = "h", descriptor = "(I)V")
	public static void method1422() {
		while (true) {
			if (Static204.aClass2_Sub3_Sub1_3.method222(Static202.anInt1733) >= 27) {
				@Pc(21) int local21 = Static204.aClass2_Sub3_Sub1_3.method219(15);
				if (local21 != 32767) {
					@Pc(28) boolean local28 = false;
					if (Static199.aClass12_Sub3_Sub2Array1[local21] == null) {
						local28 = true;
						Static199.aClass12_Sub3_Sub2Array1[local21] = new Class12_Sub3_Sub2();
					}
					@Pc(44) Class12_Sub3_Sub2 local44 = Static199.aClass12_Sub3_Sub2Array1[local21];
					Static23.anIntArray47[Static50.anInt2134++] = local21;
					local44.anInt3912 = Static103.anInt2511;
					@Pc(62) int local62 = Static204.aClass2_Sub3_Sub1_3.method219(1);
					@Pc(67) int local67 = Static204.aClass2_Sub3_Sub1_3.method219(5);
					@Pc(72) int local72 = Static204.aClass2_Sub3_Sub1_3.method219(1);
					if (local72 == 1) {
						Static124.anIntArray313[Static170.anInt3986++] = local21;
					}
					@Pc(90) int local90 = Static5.anIntArray12[Static204.aClass2_Sub3_Sub1_3.method219(3)];
					if (local28) {
						local44.anInt3947 = local44.anInt3916 = local90;
					}
					local44.aClass2_Sub2_Sub12_1 = Static132.method2097(Static204.aClass2_Sub3_Sub1_3.method219(14));
					@Pc(113) int local113 = Static204.aClass2_Sub3_Sub1_3.method219(5);
					if (local113 > 15) {
						local113 -= 32;
					}
					local44.anInt3932 = local44.aClass2_Sub2_Sub12_1.anInt2676;
					if (local67 > 15) {
						local67 -= 32;
					}
					local44.anInt3915 = local44.aClass2_Sub2_Sub12_1.anInt2677;
					local44.anInt3934 = local44.aClass2_Sub2_Sub12_1.anInt2661;
					local44.anInt3950 = local44.aClass2_Sub2_Sub12_1.anInt2669;
					local44.anInt3921 = local44.aClass2_Sub2_Sub12_1.anInt2655;
					local44.anInt3931 = local44.aClass2_Sub2_Sub12_1.anInt2670;
					if (local44.anInt3931 == 0) {
						local44.anInt3916 = 0;
					}
					local44.anInt3951 = local44.aClass2_Sub2_Sub12_1.anInt2672;
					local44.anInt3922 = local44.aClass2_Sub2_Sub12_1.anInt2659;
					local44.anInt3956 = local44.aClass2_Sub2_Sub12_1.anInt2681;
					local44.method2722(local62 == 1, Static213.aClass12_Sub3_Sub1_1.anIntArray412[0] + local67, Static213.aClass12_Sub3_Sub1_1.anIntArray414[0] - -local113);
					continue;
				}
			}
			Static204.aClass2_Sub3_Sub1_3.method226();
			return;
		}
	}
}
