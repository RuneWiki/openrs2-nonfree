import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!eg", name = "q", descriptor = "I")
	public static int anInt1030;

	@OriginalMember(owner = "client!eg", name = "v", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!eg", name = "w", descriptor = "I")
	public static int anInt1034;

	@OriginalMember(owner = "client!eg", name = "x", descriptor = "Z")
	public static boolean aBoolean47;

	@OriginalMember(owner = "client!eg", name = "t", descriptor = "I")
	public static int anInt1032 = 0;

	@OriginalMember(owner = "client!eg", name = "u", descriptor = "I")
	public static int anInt1033 = -1;

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "(I)V")
	public static void method722() {
		for (@Pc(3) int local3 = 0; local3 < Static83.anInt1739; local3++) {
			@Pc(14) int local14 = Static108.anIntArray221[local3]--;
			if (Static108.anIntArray221[local3] >= -10) {
				@Pc(85) Class27 local85 = Static125.aClass27Array1[local3];
				if (local85 == null) {
					local85 = Static219.method712(Static126.aClass71_Sub1_13, Static53.anIntArray85[local3], 0);
					if (local85 == null) {
						continue;
					}
					Static108.anIntArray221[local3] += local85.method714();
					Static125.aClass27Array1[local3] = local85;
				}
				if (Static108.anIntArray221[local3] < 0) {
					@Pc(122) int local122;
					if (Static111.anIntArray225[local3] == 0) {
						local122 = Static181.anInt3784;
					} else {
						@Pc(132) int local132 = (Static111.anIntArray225[local3] & 0xFF) * 128;
						@Pc(140) int local140 = Static111.anIntArray225[local3] >> 16 & 0xFF;
						@Pc(150) int local150 = local140 * 128 + 64 - Static186.aClass7_Sub2_Sub2_1.anInt3046;
						@Pc(158) int local158 = Static111.anIntArray225[local3] >> 8 & 0xFF;
						if (local150 < 0) {
							local150 = -local150;
						}
						@Pc(176) int local176 = local158 * 128 + 64 - Static186.aClass7_Sub2_Sub2_1.anInt3085;
						if (local176 < 0) {
							local176 = -local176;
						}
						@Pc(190) int local190 = local176 + local150 - 128;
						if (local190 > local132) {
							Static108.anIntArray221[local3] = -100;
							continue;
						}
						if (local190 < 0) {
							local190 = 0;
						}
						local122 = (local132 - local190) * Static81.anInt4473 / local132;
					}
					if (local122 > 0) {
						@Pc(219) Class2_Sub20_Sub1 local219 = local85.method713().method2370(Static130.aClass49_1);
						@Pc(224) Class2_Sub2_Sub4 local224 = Static223.method2864(local219, local122);
						local224.method2888(Static56.anIntArray89[local3] - 1);
						Static32.aClass2_Sub2_Sub3_1.method2608(local224);
					}
					Static108.anIntArray221[local3] = -100;
				}
			} else {
				Static83.anInt1739--;
				for (@Pc(28) int local28 = local3; local28 < Static83.anInt1739; local28++) {
					Static53.anIntArray85[local28] = Static53.anIntArray85[local28 + 1];
					Static125.aClass27Array1[local28] = Static125.aClass27Array1[local28 + 1];
					Static56.anIntArray89[local28] = Static56.anIntArray89[local28 + 1];
					Static108.anIntArray221[local28] = Static108.anIntArray221[local28 + 1];
					Static111.anIntArray225[local28] = Static111.anIntArray225[local28 + 1];
				}
				local3--;
			}
		}
		if (Static164.aBoolean148 && !Static49.method747()) {
			if (Static95.anInt2134 != 0 && Static164.anInt3460 != -1) {
				Static78.method1104(Static95.anInt2134, Static63.aClass71_Sub1_5, Static164.anInt3460);
			}
			Static164.aBoolean148 = false;
		} else if (Static95.anInt2134 != 0 && Static164.anInt3460 != -1 && !Static49.method747()) {
			Static58.aClass2_Sub11_Sub1_2.method1595(240);
			Static58.aClass2_Sub11_Sub1_2.method1544(Static164.anInt3460);
			Static164.anInt3460 = -1;
		}
	}
}
