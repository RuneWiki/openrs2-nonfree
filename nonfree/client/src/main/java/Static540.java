import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static540 {

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(IIII[BII)Z")
	public static boolean method8288(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) byte[] arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		@Pc(9) int local9 = arg0 % 8;
		@Pc(24) int local24;
		if (local9 == 0) {
			local24 = 0;
		} else {
			local24 = 8 - local9;
		}
		@Pc(37) int local37 = -((arg4 + 7) / 8);
		@Pc(46) int local46 = -((arg0 + 8 - 1) / 8);
		for (@Pc(48) int local48 = local37; local48 < 0; local48++) {
			for (@Pc(52) int local52 = local46; local52 < 0; local52++) {
				if (arg2[arg1] == 0) {
					return true;
				}
				arg1 += 8;
			}
			arg1 -= local24;
			if (arg2[arg1 - 1] == 0) {
				return true;
			}
			arg1 += arg3;
		}
		return false;
	}

	@OriginalMember(owner = "client!sea", name = "b", descriptor = "(I)V")
	public static void method8292() {
		Static111.aClass357ArrayArray1 = new Class357[Static78.aClass124_20.method3633()][];
		Static604.aClass357ArrayArray2 = new Class357[Static78.aClass124_20.method3633()][];
		Static505.aBooleanArray62 = new boolean[Static78.aClass124_20.method3633()];
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(B[[BLclient!qv;)V")
	public static void method8299(@OriginalArg(1) byte[][] arg0, @OriginalArg(2) Class29_Sub1 arg1) {
		@Pc(16) int[] local16 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(38) int local38;
		@Pc(47) int local47;
		for (@Pc(18) int local18 = 0; local18 < arg1.anInt8876; local18++) {
			Static25.method456();
			for (local24 = 0; local24 < Static222.anInt4533 >> 3; local24++) {
				for (local28 = 0; local28 < Static668.anInt11370 >> 3; local28++) {
					local38 = Static232.anIntArrayArrayArray21[local18][local24][local28];
					if (local38 != -1) {
						local47 = local38 >> 24 & 0x3;
						if (!arg1.aBoolean642 || local47 == 0) {
							@Pc(61) int local61 = local38 >> 1 & 0x3;
							@Pc(67) int local67 = local38 >> 14 & 0x3FF;
							@Pc(73) int local73 = local38 >> 3 & 0x7FF;
							@Pc(83) int local83 = local73 / 8 + (local67 / 8 << 8);
							for (@Pc(85) int local85 = 0; local85 < Static437.anIntArray399.length; local85++) {
								if (local83 == Static437.anIntArray399[local85] && arg0[local85] != null) {
									@Pc(103) Class2_Sub8 local103 = new Class2_Sub8(arg0[local85]);
									arg1.method7853(local18, local28 * 8, local103, local67, local73, local24 * 8, Static196.aClass200Array1, local61, local47);
									arg1.method7865(local47, local18, local28 * 8, local61, local24 * 8, local103, Static607.aClass101_15, local73, local67, local16[0] == -1 ? local16 : null);
									break;
								}
							}
						}
					}
				}
			}
		}
		for (local24 = 0; local24 < arg1.anInt8876; local24++) {
			Static25.method456();
			for (local28 = 0; local28 < Static222.anInt4533 >> 3; local28++) {
				for (local38 = 0; local38 < Static668.anInt11370 >> 3; local38++) {
					local47 = Static232.anIntArrayArrayArray21[local24][local28][local38];
					if (local47 == -1) {
						arg1.method7847(8, local38 * 8, local24, 8, local28 * 8);
					}
				}
			}
		}
		if (local16[0] != -1) {
			Static32.aClass251_1 = Static462.aClass299_1.method7742(local16[0], local16[3], local16[1], Static6.aClass176_1, local16[2]);
			Static279.anInt5178 = local16[4];
		}
	}
}
