import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!at", name = "c", descriptor = "Lclient!kea;")
	public static Class161 aClass161_7;

	@OriginalMember(owner = "client!at", name = "b", descriptor = "Lclient!ea;")
	public static final Class67 aClass67_9 = new Class67("Loaded defaults", "Standardeinstellungen geladen", "Paramètres par défaut chargés", "Padrões carregados");

	@OriginalMember(owner = "client!at", name = "d", descriptor = "I")
	public static int anInt703 = 0;

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(I)V")
	public static void method725() {
		Static520.method7395(Static7.aClass3_Sub15_Sub1_1.anInt8365);
		@Pc(17) int local17 = (Static223.anInt4827 >> 3) + (Static311.anInt6050 >> 12);
		@Pc(25) int local25 = (Static150.anInt3027 >> 3) + (Static329.anInt6297 >> 12);
		Static420.anInt7829 = Static111.aClass6_Sub1_Sub2_Sub1_3.aByte100 = 0;
		Static111.aClass6_Sub1_Sub2_Sub1_3.method2044(8, 8);
		Static523.anIntArrayArray87 = new int[18][4];
		Static330.anIntArray546 = new int[18];
		Static328.aByteArrayArray17 = new byte[18][];
		Static343.aByteArrayArray18 = new byte[18][];
		Static75.anIntArray738 = new int[18];
		Static457.aByteArrayArray25 = new byte[18][];
		Static326.aByteArrayArray16 = new byte[18][];
		Static467.anIntArray715 = new int[18];
		Static112.anIntArray658 = new int[18];
		Static521.aByteArrayArray29 = new byte[18][];
		Static165.anIntArray376 = new int[18];
		Static28.anIntArray129 = new int[18];
		@Pc(76) int local76 = 0;
		@Pc(95) int local95;
		for (@Pc(85) int local85 = (local17 - (Static118.anInt2527 >> 4)) / 8; local85 <= (local17 + (Static118.anInt2527 >> 4)) / 8; local85++) {
			for (local95 = (local25 - (Static549.anInt9482 >> 4)) / 8; local95 <= ((Static549.anInt9482 >> 4) + local25) / 8; local95++) {
				@Pc(103) int local103 = (local85 << 8) + local95;
				Static467.anIntArray715[local76] = local103;
				Static112.anIntArray658[local76] = Static307.aClass161_51.method4240("m" + local85 + "_" + local95);
				Static330.anIntArray546[local76] = Static307.aClass161_51.method4240("l" + local85 + "_" + local95);
				Static165.anIntArray376[local76] = Static307.aClass161_51.method4240("n" + local85 + "_" + local95);
				Static28.anIntArray129[local76] = Static307.aClass161_51.method4240("um" + local85 + "_" + local95);
				Static75.anIntArray738[local76] = Static307.aClass161_51.method4240("ul" + local85 + "_" + local95);
				if (Static165.anIntArray376[local76] == -1) {
					Static112.anIntArray658[local76] = -1;
					Static330.anIntArray546[local76] = -1;
					Static28.anIntArray129[local76] = -1;
					Static75.anIntArray738[local76] = -1;
				}
				local76++;
			}
		}
		for (local95 = local76; local95 < Static165.anIntArray376.length; local95++) {
			Static165.anIntArray376[local95] = -1;
			Static112.anIntArray658[local95] = -1;
			Static330.anIntArray546[local95] = -1;
			Static28.anIntArray129[local95] = -1;
			Static75.anIntArray738[local95] = -1;
		}
		@Pc(275) byte local275;
		if (Static512.anInt8932 == 1 || Static512.anInt8932 == 2) {
			local275 = 3;
		} else {
			local275 = 7;
		}
		Static49.method1038(local25, local17, local275, false);
	}
}
