import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static299 {

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "Lclient!l;")
	public static Class95 aClass95_15;

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "Z")
	public static boolean aBoolean357;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)I")
	public static int method3891(@OriginalArg(1) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		if (local23 < local14) {
			local32 = local23;
		}
		if (local32 > local30) {
			local32 = local30;
		}
		@Pc(46) double local46 = local14;
		if (local23 > local14) {
			local46 = local23;
		}
		if (local30 > local46) {
			local46 = local30;
		}
		@Pc(65) double local65 = 0.0D;
		@Pc(67) double local67 = 0.0D;
		@Pc(73) double local73 = (local46 + local32) / 2.0D;
		if (local46 != local32) {
			if (local73 < 0.5D) {
				local67 = (local46 - local32) / (local32 + local46);
			}
			if (local46 == local14) {
				local65 = (local23 - local30) / (local46 - local32);
			} else if (local23 == local46) {
				local65 = (local30 - local14) / (-local32 + local46) + 2.0D;
			} else if (local46 == local30) {
				local65 = (local14 - local23) / (local46 - local32) + 4.0D;
			}
			if (local73 >= 0.5D) {
				local67 = (local46 - local32) / (2.0D - local32 - local46);
			}
		}
		local65 /= 6.0D;
		@Pc(163) int local163 = (int) (local65 * 256.0D);
		@Pc(168) int local168 = (int) (local67 * 256.0D);
		@Pc(173) int local173 = (int) (local73 * 256.0D);
		if (local168 < 0) {
			local168 = 0;
		} else if (local168 > 255) {
			local168 = 255;
		}
		if (local173 < 0) {
			local173 = 0;
		} else if (local173 > 255) {
			local173 = 255;
		}
		if (local173 > 243) {
			local168 >>= 0x4;
		} else if (local173 > 217) {
			local168 >>= 0x3;
		} else if (local173 > 192) {
			local168 >>= 0x2;
		} else if (local173 > 179) {
			local168 >>= 0x1;
		}
		return (local173 >> 1) + (local168 >> 5 << 7) + ((local163 >> 2 & 0x3F) << 10);
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(II)V")
	public static void method3893(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class75 local7 = Static432.aClass75ArrayArrayArray6[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class75 local28 = Static432.aClass75ArrayArrayArray6[local9][arg0][arg1] = Static432.aClass75ArrayArrayArray6[local9 + 1][arg0][arg1];
			if (local28 != null) {
				local28.aByte30--;
				for (@Pc(40) Class251 local40 = local28.aClass251_2; local40 != null; local40 = local40.aClass251_3) {
					@Pc(44) Class8_Sub3 local44 = local40.aClass8_Sub3_2;
					if (local44.aShort100 == arg0 && local44.aShort99 == arg1) {
						local44.aByte99--;
					}
				}
			}
		}
		if (Static432.aClass75ArrayArrayArray6[0][arg0][arg1] == null) {
			Static432.aClass75ArrayArrayArray6[0][arg0][arg1] = new Class75(0, arg0, arg1);
			Static432.aClass75ArrayArrayArray6[0][arg0][arg1].aByte29 = 1;
		}
		Static432.aClass75ArrayArrayArray6[0][arg0][arg1].aClass75_1 = local7;
		Static432.aClass75ArrayArrayArray6[3][arg0][arg1] = null;
	}
}
