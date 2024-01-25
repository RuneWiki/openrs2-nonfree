import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!fq", name = "m", descriptor = "[Lclient!ufa;")
	public static Class4[] aClass4Array18;

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "Z")
	public static boolean aBoolean782 = false;

	@OriginalMember(owner = "client!fq", name = "k", descriptor = "[[I")
	public static final int[][] anIntArrayArray61 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(I[[BLclient!ms;)V")
	public static void method8083(@OriginalArg(1) byte[][] arg0, @OriginalArg(2) Class210_Sub1 arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(25) int local25;
		@Pc(29) int local29;
		@Pc(39) int local39;
		@Pc(48) int local48;
		for (@Pc(14) int local14 = 0; local14 < arg1.anInt6938; local14++) {
			Static245.method4396();
			for (local25 = 0; local25 < Static306.anInt6176 >> 3; local25++) {
				for (local29 = 0; local29 < Static108.anInt2930 >> 3; local29++) {
					local39 = Static316.anIntArrayArrayArray2[local14][local25][local29];
					if (local39 != -1) {
						local48 = local39 >> 24 & 0x3;
						if (!arg1.aBoolean553 || local48 == 0) {
							@Pc(62) int local62 = local39 >> 1 & 0x3;
							@Pc(68) int local68 = local39 >> 14 & 0x3FF;
							@Pc(74) int local74 = local39 >> 3 & 0x7FF;
							@Pc(84) int local84 = (local68 / 8 << 8) + local74 / 8;
							for (@Pc(86) int local86 = 0; local86 < Static228.anIntArray215.length; local86++) {
								if (Static228.anIntArray215[local86] == local84 && arg0[local86] != null) {
									@Pc(104) Class6_Sub8 local104 = new Class6_Sub8(arg0[local86]);
									arg1.method5799(local74, local29 * 8, local104, local62, local48, local25 * 8, local68, Static313.aClass258Array1, local14);
									arg1.method5810(local68, local74, local12[0] == -1 ? local12 : null, local25 * 8, local29 * 8, local104, Static467.aClass5_13, local62, local48, local14);
									break;
								}
							}
						}
					}
				}
			}
		}
		for (local25 = 0; local25 < arg1.anInt6938; local25++) {
			Static245.method4396();
			for (local29 = 0; local29 < Static306.anInt6176 >> 3; local29++) {
				for (local39 = 0; local39 < Static108.anInt2930 >> 3; local39++) {
					local48 = Static316.anIntArrayArrayArray2[local25][local29][local39];
					if (local48 == -1) {
						arg1.method5791(8, local25, local29 * 8, 8, local39 * 8);
					}
				}
			}
		}
		if (local12[0] != -1) {
			Static406.aClass350_1 = Static82.aClass74_1.method2529(local12[0], local12[2], local12[1], Static181.aClass132_1, local12[3]);
			Static475.anInt8407 = local12[4];
		}
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(III)Z")
	public static boolean method8084(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0;
	}
}
