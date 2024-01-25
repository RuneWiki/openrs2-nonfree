import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!ch", name = "p", descriptor = "Lclient!gga;")
	public static Class124 aClass124_19;

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(II)I")
	public static int method1363(@OriginalArg(1) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		if (local14 > local23) {
			local32 = local23;
		}
		if (local30 < local32) {
			local32 = local30;
		}
		@Pc(51) double local51 = local14;
		if (local14 < local23) {
			local51 = local23;
		}
		if (local51 < local30) {
			local51 = local30;
		}
		@Pc(65) double local65 = 0.0D;
		@Pc(67) double local67 = 0.0D;
		@Pc(73) double local73 = (local32 + local51) / 2.0D;
		if (local51 != local32) {
			if (local73 < 0.5D) {
				local67 = (local51 - local32) / (local32 + local51);
			}
			if (local73 >= 0.5D) {
				local67 = (local51 - local32) / (2.0D - local51 - local32);
			}
			if (local14 == local51) {
				local65 = (local23 - local30) / (local51 - local32);
			} else if (local51 == local23) {
				local65 = (local30 - local14) / (local51 - local32) + 2.0D;
			} else if (local51 == local30) {
				local65 = (local14 - local23) / (-local32 + local51) + 4.0D;
			}
		}
		local65 /= 6.0D;
		@Pc(159) int local159 = (int) (local65 * 256.0D);
		@Pc(164) int local164 = (int) (local67 * 256.0D);
		@Pc(169) int local169 = (int) (local73 * 256.0D);
		if (local164 < 0) {
			local164 = 0;
		} else if (local164 > 255) {
			local164 = 255;
		}
		if (local169 < 0) {
			local169 = 0;
		} else if (local169 > 255) {
			local169 = 255;
		}
		if (local169 > 243) {
			local164 >>= 0x4;
		} else if (local169 > 217) {
			local164 >>= 0x3;
		} else if (local169 > 192) {
			local164 >>= 0x2;
		} else if (local169 > 179) {
			local164 >>= 0x1;
		}
		return (local164 >> 5 << 7) + ((local159 >> 2 & 0x3F) << 10) + (local169 >> 1);
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZILclient!uf;I)V")
	public static void method1365(@OriginalArg(1) int arg0, @OriginalArg(2) Class357 arg1, @OriginalArg(3) int arg2) {
		Static497.aClass357_126 = arg1;
		Static309.anInt5583 = arg2;
		Static294.anInt5370 = arg0;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIBIIIZI)Z")
	public static boolean method1368(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) int arg7) {
		@Pc(8) int local8 = Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.anIntArray189[0];
		@Pc(13) int local13 = Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.anIntArray188[0];
		if (local8 < 0 || Static222.anInt4533 <= local8 || local13 < 0 || Static668.anInt11370 <= local13) {
			return false;
		} else if (arg3 >= 0 && Static222.anInt4533 > arg3 && arg7 >= 0 && Static668.anInt11370 > arg7) {
			@Pc(71) int local71 = Static93.method9375(Static216.anIntArray200, arg7, arg3, arg1, arg5, Static269.anIntArray334, arg6, arg2, arg4, local13, local8, Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.method3690(), Static196.aClass200Array1[Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.aByte142], arg0);
			if (local71 < 1) {
				return false;
			}
			Static587.anInt10248 = Static269.anIntArray334[local71 - 1];
			Static472.anInt8440 = Static216.anIntArray200[local71 - 1];
			Static191.aBoolean318 = false;
			Static277.method9739();
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lclient!gga;I)V")
	public static void method1370(@OriginalArg(0) Class124 arg0) {
		Static120.aClass124_33 = arg0;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(III)Z")
	public static boolean method1371(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x180) != 0;
	}
}
