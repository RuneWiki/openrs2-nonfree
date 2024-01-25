import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static349 {

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "Lclient!qa;")
	public static Class109 aClass109_2;

	@OriginalMember(owner = "client!rn", name = "g", descriptor = "[I")
	public static int[] anIntArray92;

	@OriginalMember(owner = "client!rn", name = "c", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray14 = new String[100];

	@OriginalMember(owner = "client!rn", name = "f", descriptor = "Lclient!tk;")
	public static final Class225 aClass225_3 = new Class225(2, 4, 4, 0);

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(III)Z")
	public static boolean method1151(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return ((arg0 & 0x2000) != 0 | Static383.method5219(arg0, arg1) | Static381.method4264(arg1, arg0)) & Static226.method3405(arg1, arg0);
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(Lclient!j;III[Z)V")
	public static void method1152(@OriginalArg(0) Class1_Sub2_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static92.aClass136Array1 == Static160.aClass136Array2) {
			return;
		}
		@Pc(9) int local9 = Static328.aClass136Array3[arg1].va(arg2, arg3);
		for (@Pc(11) int local11 = 0; local11 <= arg1; local11++) {
			if (arg4 == null || arg4[local11]) {
				@Pc(22) Class136 local22 = Static328.aClass136Array3[local11];
				if (local22 != null) {
					local22.U(arg0, arg2, local9 - local22.va(arg2, arg3), arg3, 0, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "([[BLclient!mi;I)V")
	public static void method1154(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) Class155_Sub1 arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		for (@Pc(14) int local14 = 0; local14 < arg1.anInt4453; local14++) {
			Static81.method1403();
			for (@Pc(20) int local20 = 0; local20 < Static135.anInt2314 >> 3; local20++) {
				for (@Pc(24) int local24 = 0; local24 < Static352.anInt6022 >> 3; local24++) {
					@Pc(28) boolean local28 = false;
					@Pc(36) int local36 = Static257.anIntArrayArrayArray13[local14][local20][local24];
					if (local36 != -1) {
						@Pc(45) int local45 = local36 >> 24 & 0x3;
						if (!arg1.aBoolean304 || local45 == 0) {
							@Pc(59) int local59 = local36 >> 1 & 0x3;
							@Pc(65) int local65 = local36 >> 14 & 0x3FF;
							@Pc(71) int local71 = local36 >> 3 & 0x7FF;
							@Pc(81) int local81 = (local65 / 8 << 8) + local71 / 8;
							for (@Pc(83) int local83 = 0; local83 < Static157.anIntArray255.length; local83++) {
								if (Static157.anIntArray255[local83] == local81 && arg0[local83] != null) {
									@Pc(105) Class1_Sub1 local105 = new Class1_Sub1(arg0[local83]);
									arg1.method3656(local71, local65, local14, local20 * 8, local105, local59, local45, local24 * 8, Static170.aClass112Array1);
									arg1.method3665(local65, local59, local12[0] == -1 ? local12 : null, Static276.aClass109_10, local24 * 8, local45, local71, local105, local20 * 8, local14);
									local28 = true;
									break;
								}
							}
						}
					}
					if (!local28) {
						arg1.method3651(local20 * 8, 8, local14, 8, local24 * 8);
					}
				}
			}
		}
		if (local12[0] != -1) {
			Static58.aClass154_1 = Static141.aClass168_1.method3938(Static199.aClass134_1, local12[1], local12[2], local12[3], local12[0]);
			Static263.anInt4705 = local12[4];
		}
	}
}
