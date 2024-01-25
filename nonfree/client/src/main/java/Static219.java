import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static219 {

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "F")
	public static float aFloat84;

	@OriginalMember(owner = "client!hp", name = "c", descriptor = "[[I")
	public static int[][] anIntArrayArray43;

	@OriginalMember(owner = "client!hp", name = "d", descriptor = "I")
	public static int anInt4126;

	@OriginalMember(owner = "client!hp", name = "f", descriptor = "Lclient!et;")
	public static final Class104 aClass104_7 = new Class104(2);

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(I)V")
	public static void method3588() {
		Static387.method5708();
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(ZZ)V")
	public static void method3589(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static592.anInt9857 != -1) {
				Static198.method3399(Static592.anInt9857);
			}
			for (@Pc(13) Class2_Sub28 local13 = (Class2_Sub28) Static22.aClass323_4.method7480(); local13 != null; local13 = (Class2_Sub28) Static22.aClass323_4.method7482()) {
				if (!local13.method8921()) {
					local13 = (Class2_Sub28) Static22.aClass323_4.method7480();
					if (local13 == null) {
						break;
					}
				}
				Static4.method71(false, local13, true);
			}
			Static592.anInt9857 = -1;
			Static22.aClass323_4 = new Class323(8);
			Static339.method5136();
			Static592.anInt9857 = Static220.anInt4141;
			Static403.method6011(false);
			Static569.method7932();
			Static156.method2736(Static592.anInt9857);
		}
		Static272.aString43 = "";
		Static55.aString12 = "";
		Static633.aBoolean744 = false;
		Static315.method4859();
		Static398.anInt6843 = -1;
		Static165.method2815(Static492.anInt7871);
		Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1 = new Class16_Sub1_Sub1_Sub3_Sub2();
		Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.anInt8037 = Static456.anInt7428 * 512 / 2;
		Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.anIntArray595[0] = Static456.anInt7428 / 2;
		Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.anInt8034 = Static5.anInt112 * 512 / 2;
		Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.anIntArray594[0] = Static5.anInt112 / 2;
		Static63.anInt1715 = 0;
		Static576.anInt9403 = 0;
		if (Static407.anInt6909 == 2) {
			Static576.anInt9403 = Static12.anInt193 << 9;
			Static63.anInt1715 = Static195.anInt3891 << 9;
		} else {
			Static303.method4762();
		}
		Static350.method5258();
	}
}
