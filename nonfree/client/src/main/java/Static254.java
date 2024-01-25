import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static254 {

	@OriginalMember(owner = "client!io", name = "L", descriptor = "Lclient!ie;")
	public static Class158 aClass158_7;

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(IIIIBLclient!mb;ZI[IIIII[II)I")
	public static int method3732(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class226 arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int[] arg12, @OriginalArg(14) int arg13) {
		for (@Pc(7) int local7 = 0; local7 < 128; local7++) {
			for (@Pc(11) int local11 = 0; local11 < 128; local11++) {
				Static533.anIntArrayArray51[local7][local11] = 0;
				Static323.anIntArrayArray37[local7][local11] = 99999999;
			}
		}
		@Pc(51) boolean local51;
		if (arg6 == 1) {
			local51 = Static532.method7625(arg10, arg3, arg1, arg2, arg4, arg8, arg9, arg11, arg13, arg0);
		} else if (arg6 == 2) {
			local51 = Static115.method1957(arg13, arg11, arg10, arg3, arg4, arg1, arg2, arg8, arg0, arg9);
		} else {
			local51 = Static674.method9285(arg0, arg8, arg11, arg6, arg2, arg9, arg1, arg3, arg13, arg4, arg10);
		}
		@Pc(91) int local91 = arg8 - 64;
		@Pc(95) int local95 = arg11 - 64;
		@Pc(104) int local104 = Static437.anInt7796;
		@Pc(106) int local106 = Static71.anInt1587;
		@Pc(114) int local114;
		@Pc(116) int local116;
		@Pc(123) int local123;
		if (!local51) {
			if (!arg5) {
				return -1;
			}
			local114 = Integer.MAX_VALUE;
			local116 = Integer.MAX_VALUE;
			for (local123 = arg3 - 10; local123 <= arg3 + 10; local123++) {
				for (@Pc(129) int local129 = arg13 - 10; local129 <= arg13 + 10; local129++) {
					@Pc(136) int local136 = local123 - local91;
					@Pc(141) int local141 = local129 - local95;
					if (local136 >= 0 && local141 >= 0 && local136 < 128 && local141 < 128 && Static323.anIntArrayArray37[local136][local141] < 100) {
						@Pc(160) int local160 = 0;
						if (local123 < arg3) {
							local160 = arg3 - local123;
						} else if (local123 > arg10 + arg3 - 1) {
							local160 = local123 + 1 - arg3 - arg10;
						}
						@Pc(197) int local197 = 0;
						if (arg13 > local129) {
							local197 = arg13 - local129;
						} else if (arg13 + arg1 - 1 < local129) {
							local197 = local129 + 1 - arg1 - arg13;
						}
						@Pc(233) int local233 = local197 * local197 + local160 * local160;
						if (local114 > local233 || local233 == local114 && Static323.anIntArrayArray37[local136][local141] < local116) {
							local114 = local233;
							local116 = Static323.anIntArrayArray37[local136][local141];
							local104 = local123;
							local106 = local129;
						}
					}
				}
			}
			if (local114 == Integer.MAX_VALUE) {
				return -1;
			}
		}
		if (local104 == arg8 && arg11 == local106) {
			return 0;
		}
		@Pc(294) byte local294 = 0;
		Static669.anIntArray823[0] = local104;
		local114 = local294 + 1;
		Static1.anIntArray748[0] = local106;
		@Pc(315) int local315;
		local116 = local315 = Static533.anIntArrayArray51[local104 - local91][local106 - local95];
		while (local104 != arg8 || arg11 != local106) {
			if (local116 != local315) {
				Static669.anIntArray823[local114] = local104;
				local315 = local116;
				Static1.anIntArray748[local114++] = local106;
			}
			if ((local116 & 0x1) != 0) {
				local106++;
			} else if ((local116 & 0x4) != 0) {
				local106--;
			}
			if ((local116 & 0x2) != 0) {
				local104++;
			} else if ((local116 & 0x8) != 0) {
				local104--;
			}
			local116 = Static533.anIntArrayArray51[local104 - local91][local106 - local95];
		}
		local123 = 0;
		while (local114-- > 0) {
			arg7[local123] = Static669.anIntArray823[local114];
			arg12[local123++] = Static1.anIntArray748[local114];
			if (arg7.length <= local123) {
				break;
			}
		}
		return local123;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(ZLclient!jc;B)V")
	public static void method3733(@OriginalArg(1) Class14_Sub5_Sub2 arg0) {
		Static113.aClass112_2.method5376(arg0);
		Static643.method8976(Static570.aClass386_121, arg0, Static479.aClass386_106, Static391.aClass386_88, Static113.aClass112_2);
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(ZI)Z")
	public static boolean method3738(@OriginalArg(1) int arg0) {
		if (arg0 == 25 || arg0 == 44 || arg0 == 10 || arg0 == 16 || arg0 == 58) {
			return true;
		} else {
			return arg0 == 45 || arg0 == 1009;
		}
	}
}
