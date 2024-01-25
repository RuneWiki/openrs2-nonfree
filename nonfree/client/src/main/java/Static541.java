import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static541 {

	@OriginalMember(owner = "client!ul", name = "k", descriptor = "Lclient!ek;")
	public static Class97 aClass97_4;

	@OriginalMember(owner = "client!ul", name = "l", descriptor = "I")
	public static int anInt8831;

	@OriginalMember(owner = "client!ul", name = "s", descriptor = "Lclient!sh;")
	public static Class304 aClass304_2;

	@OriginalMember(owner = "client!ul", name = "t", descriptor = "Z")
	public static boolean aBoolean680;

	@OriginalMember(owner = "client!ul", name = "r", descriptor = "I")
	public static int anInt8835 = 0;

	@OriginalMember(owner = "client!ul", name = "v", descriptor = "[I")
	public static final int[] anIntArray640 = new int[32];

	@OriginalMember(owner = "client!ul", name = "A", descriptor = "[I")
	public static final int[] anIntArray641 = new int[5];

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(B[[BLclient!gl;)V")
	public static void method7378(@OriginalArg(1) byte[][] arg0, @OriginalArg(2) Class49_Sub1 arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		for (@Pc(14) int local14 = 0; local14 < arg1.anInt3634; local14++) {
			Static352.method5248();
			for (@Pc(20) int local20 = 0; local20 < Static188.anInt3850 >> 3; local20++) {
				for (@Pc(24) int local24 = 0; local24 < Static49.anInt1174 >> 3; local24++) {
					@Pc(34) int local34 = Static66.anIntArrayArrayArray30[local14][local20][local24];
					if (local34 != -1) {
						@Pc(44) int local44 = local34 >> 24 & 0x3;
						if (!arg1.aBoolean301 || local44 == 0) {
							@Pc(58) int local58 = local34 >> 1 & 0x3;
							@Pc(64) int local64 = local34 >> 14 & 0x3FF;
							@Pc(70) int local70 = local34 >> 3 & 0x7FF;
							@Pc(80) int local80 = (local64 / 8 << 8) + local70 / 8;
							for (@Pc(82) int local82 = 0; local82 < Static234.anIntArray280.length; local82++) {
								if (local80 == Static234.anIntArray280[local82] && arg0[local82] != null) {
									@Pc(104) Class2_Sub15 local104 = new Class2_Sub15(arg0[local82]);
									arg1.method2998(local14, Static495.aClass355Array1, local104, local58, local44, local64, local24 * 8, local20 * 8, local70);
									arg1.method3012(local12[0] == -1 ? local12 : null, Static307.aClass100_6, local70, local58, local20 * 8, local64, local24 * 8, local44, local14, local104);
									break;
								}
							}
						}
					}
				}
			}
		}
		if (local12[0] != -1) {
			Static459.aClass326_1 = Static197.aClass147_1.method3348(Static416.aClass232_1, local12[1], local12[2], local12[3], local12[0]);
			Static153.anInt3072 = local12[4];
		}
	}
}
