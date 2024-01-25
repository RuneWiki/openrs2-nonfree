import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!eca", name = "b", descriptor = "[Lclient!vs;")
	public static Class379[] aClass379Array1;

	@OriginalMember(owner = "client!eca", name = "e", descriptor = "Lclient!ae;")
	public static Class8 aClass8_35;

	@OriginalMember(owner = "client!eca", name = "g", descriptor = "[[I")
	public static int[][] anIntArrayArray11;

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "Lclient!af;")
	public static final Class10 aClass10_7 = new Class10(5);

	@OriginalMember(owner = "client!eca", name = "i", descriptor = "Z")
	public static boolean aBoolean131 = false;

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "([[BLclient!tf;B)V")
	public static void method1889(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) Class310_Sub1 arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(20) int local20;
		@Pc(24) int local24;
		@Pc(34) int local34;
		@Pc(44) int local44;
		for (@Pc(14) int local14 = 0; local14 < arg1.anInt9399; local14++) {
			Static35.method857();
			for (local20 = 0; local20 < Static491.anInt9856 >> 3; local20++) {
				for (local24 = 0; local24 < Static393.anInt6574 >> 3; local24++) {
					local34 = Static149.anIntArrayArrayArray14[local14][local20][local24];
					if (local34 != -1) {
						local44 = local34 >> 24 & 0x3;
						if (!arg1.aBoolean682 || local44 == 0) {
							@Pc(58) int local58 = local34 >> 1 & 0x3;
							@Pc(64) int local64 = local34 >> 14 & 0x3FF;
							@Pc(70) int local70 = local34 >> 3 & 0x7FF;
							@Pc(80) int local80 = local70 / 8 + (local64 / 8 << 8);
							for (@Pc(82) int local82 = 0; local82 < Static300.anIntArray289.length; local82++) {
								if (Static300.anIntArray289[local82] == local80 && arg0[local82] != null) {
									@Pc(104) Class6_Sub23 local104 = new Class6_Sub23(arg0[local82]);
									arg1.method7915(local20 * 8, local44, local14, local70, Static83.aClass324Array1, local24 * 8, local58, local64, local104);
									arg1.method7926(Static546.aClass132_13, local104, local20 * 8, local70, local12[0] == -1 ? local12 : null, local44, local64, local24 * 8, local14, local58);
									break;
								}
							}
						}
					}
				}
			}
		}
		for (local20 = 0; local20 < arg1.anInt9399; local20++) {
			Static35.method857();
			for (local24 = 0; local24 < Static491.anInt9856 >> 3; local24++) {
				for (local34 = 0; local34 < Static393.anInt6574 >> 3; local34++) {
					local44 = Static149.anIntArrayArrayArray14[local20][local24][local34];
					if (local44 == -1) {
						arg1.method7918(local24 * 8, 8, local34 * 8, 8, local20);
					}
				}
			}
		}
		if (local12[0] != -1) {
			Static312.aClass93_2 = Static399.aClass194_1.method4409(local12[0], local12[3], local12[2], local12[1], Static186.aClass147_1);
			Static428.anInt7354 = local12[4];
		}
	}
}
