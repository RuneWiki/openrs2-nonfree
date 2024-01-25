import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static262 {

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "I")
	public static int anInt4691;

	@OriginalMember(owner = "client!nb", name = "t", descriptor = "I")
	public static int anInt4708 = 0;

	@OriginalMember(owner = "client!nb", name = "ub", descriptor = "F")
	public static float aFloat62 = 1024.0F;

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IZII[II[IIIIIIILclient!as;I)I")
	public static int method3695(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) Class14 arg12, @OriginalArg(14) int arg13) {
		for (@Pc(3) int local3 = 0; local3 < 128; local3++) {
			for (@Pc(7) int local7 = 0; local7 < 128; local7++) {
				Static77.anIntArrayArray22[local3][local7] = 0;
				Static88.anIntArrayArray24[local3][local7] = 99999999;
			}
		}
		@Pc(54) boolean local54;
		if (arg10 == 1) {
			local54 = Static230.method3288(arg8, arg11, arg7, arg12, arg9, arg2, arg3, arg5, arg13, arg0);
		} else if (arg10 == 2) {
			local54 = Static263.method3722(arg9, arg11, arg8, arg3, arg5, arg2, arg13, arg7, arg12, arg0);
		} else {
			local54 = Static179.method2600(arg13, arg5, arg10, arg9, arg0, arg11, arg12, arg7, arg8, arg2, arg3);
		}
		@Pc(92) int local92 = arg2 - 64;
		@Pc(96) int local96 = arg7 - 64;
		@Pc(98) int local98 = Static121.anInt2244;
		@Pc(100) int local100 = Static59.anInt1169;
		@Pc(106) int local106;
		@Pc(108) int local108;
		@Pc(115) int local115;
		if (!local54) {
			if (!arg1) {
				return -1;
			}
			local106 = Integer.MAX_VALUE;
			local108 = Integer.MAX_VALUE;
			for (local115 = arg5 - 10; local115 <= arg5 + 10; local115++) {
				for (@Pc(121) int local121 = arg0 - 10; local121 <= arg0 + 10; local121++) {
					@Pc(128) int local128 = local115 - local92;
					@Pc(133) int local133 = local121 - local96;
					if (local128 >= 0 && local133 >= 0 && local128 < 128 && local133 < 128 && Static88.anIntArrayArray24[local128][local133] < 100) {
						@Pc(157) int local157 = 0;
						if (local115 < arg5) {
							local157 = arg5 - local115;
						} else if (arg13 + arg5 - 1 < local115) {
							local157 = local115 + 1 - arg5 - arg13;
						}
						@Pc(189) int local189 = 0;
						if (arg0 > local121) {
							local189 = arg0 - local121;
						} else if (local121 > arg0 + arg8 - 1) {
							local189 = local121 + 1 - arg0 - arg8;
						}
						@Pc(232) int local232 = local157 * local157 + local189 * local189;
						if (local232 < local106 || local106 == local232 && Static88.anIntArrayArray24[local128][local133] < local108) {
							local98 = local115;
							local106 = local232;
							local100 = local121;
							local108 = Static88.anIntArrayArray24[local128][local133];
						}
					}
				}
			}
			if (local106 == Integer.MAX_VALUE) {
				return -1;
			}
		}
		if (local98 == arg2 && arg7 == local100) {
			return 0;
		}
		@Pc(303) byte local303 = 0;
		Static2.anIntArray2[0] = local98;
		local106 = local303 + 1;
		Static149.anIntArray175[0] = local100;
		@Pc(324) int local324;
		local108 = local324 = Static77.anIntArrayArray22[local98 - local92][local100 - local96];
		while (local98 != arg2 || local100 != arg7) {
			if (local108 != local324) {
				local324 = local108;
				Static2.anIntArray2[local106] = local98;
				Static149.anIntArray175[local106++] = local100;
			}
			if ((local108 & 0x1) != 0) {
				local100++;
			} else if ((local108 & 0x4) != 0) {
				local100--;
			}
			if ((local108 & 0x2) != 0) {
				local98++;
			} else if ((local108 & 0x8) != 0) {
				local98--;
			}
			local108 = Static77.anIntArrayArray22[local98 - local92][local100 - local96];
		}
		local115 = 0;
		while (local106-- > 0) {
			arg4[local115] = Static2.anIntArray2[local106];
			arg6[local115++] = Static149.anIntArray175[local106];
			if (arg4.length <= local115) {
				break;
			}
		}
		return local115;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Z)V")
	public static void method3699() {
		@Pc(9) int[] local9 = new int[Static342.aClass155_2.anInt4483];
		@Pc(11) int local11 = 0;
		for (@Pc(17) int local17 = 0; local17 < Static342.aClass155_2.anInt4483; local17++) {
			@Pc(24) Class162 local24 = Static342.aClass155_2.method3548(local17);
			if (local24.anInt4737 >= 0 || local24.anInt4732 >= 0) {
				local9[local11++] = local17;
			}
		}
		Static286.anIntArray324 = new int[local11];
		for (@Pc(49) int local49 = 0; local49 < local11; local49++) {
			Static286.anIntArray324[local49] = local9[local49];
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V")
	public static void method3700() {
		if (Static408.anInt6718 == 0) {
			return;
		}
		try {
			if (++Static437.anInt7330 > 2000) {
				if (Static395.aClass131_3 != null) {
					Static395.aClass131_3.method2933();
					Static395.aClass131_3 = null;
				}
				if (Static324.anInt5564 >= 1) {
					Static411.anInt6757 = -5;
					Static408.anInt6718 = 0;
					return;
				}
				Static95.aClass156_2.aBoolean517 = !Static95.aClass156_2.aBoolean517;
				Static408.anInt6718 = 1;
				Static437.anInt7330 = 0;
				Static324.anInt5564++;
			}
			if (Static408.anInt6718 == 1) {
				Static379.aClass232_7 = Static183.aClass83_2.method1856(Static95.aClass156_2.method3552(), Static95.aClass156_2.aString53);
				Static408.anInt6718 = 2;
			}
			@Pc(113) int local113;
			if (Static408.anInt6718 == 2) {
				if (Static379.aClass232_7.anInt6402 == 2) {
					throw new IOException();
				}
				if (Static379.aClass232_7.anInt6402 != 1) {
					return;
				}
				Static395.aClass131_3 = new Class131((Socket) Static379.aClass232_7.anObject8, Static183.aClass83_2);
				Static379.aClass232_7 = null;
				Static395.aClass131_3.method2928(Static18.aClass1_Sub28_Sub1_1.aByteArray86, Static18.aClass1_Sub28_Sub1_1.anInt6812);
				Static226.method3261();
				local113 = Static395.aClass131_3.method2934();
				Static226.method3261();
				if (local113 != 21) {
					Static408.anInt6718 = 0;
					Static411.anInt6757 = local113;
					Static395.aClass131_3.method2933();
					Static395.aClass131_3 = null;
					return;
				}
				Static408.anInt6718 = 3;
			}
			if (Static408.anInt6718 == 3) {
				if (Static395.aClass131_3.method2932() < 1) {
					return;
				}
				Static99.aStringArray11 = new String[Static395.aClass131_3.method2934()];
				Static408.anInt6718 = 4;
			}
			if (Static408.anInt6718 == 4 && Static395.aClass131_3.method2932() >= Static99.aStringArray11.length * 8) {
				Static336.aClass1_Sub28_Sub1_2.anInt6812 = 0;
				Static395.aClass131_3.method2929(0, Static99.aStringArray11.length * 8, Static336.aClass1_Sub28_Sub1_2.aByteArray86);
				for (local113 = 0; local113 < Static99.aStringArray11.length; local113++) {
					Static99.aStringArray11[local113] = Static444.method5831(Static336.aClass1_Sub28_Sub1_2.method5340());
				}
				Static408.anInt6718 = 0;
				Static411.anInt6757 = 21;
				Static395.aClass131_3.method2933();
				Static395.aClass131_3 = null;
			}
		} catch (@Pc(220) IOException local220) {
			if (Static395.aClass131_3 != null) {
				Static395.aClass131_3.method2933();
				Static395.aClass131_3 = null;
			}
			if (Static324.anInt5564 >= 1) {
				Static408.anInt6718 = 0;
				Static411.anInt6757 = -4;
			} else {
				Static408.anInt6718 = 1;
				Static437.anInt7330 = 0;
				Static95.aClass156_2.aBoolean517 = !Static95.aClass156_2.aBoolean517;
				Static324.anInt5564++;
			}
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(III)V")
	public static void method3704(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static183.aClass48_3 == Static82.aClass48_7) {
			if (!Static360.method4834(false, -2, 1, arg0, 0, 1, 0, arg1)) {
				Static360.method4834(false, -3, 1, arg0, 0, 1, 0, arg1);
			}
		} else if (!Static360.method4834(false, -3, 1, arg0, 0, 1, 0, arg1)) {
			Static360.method4834(false, -2, 1, arg0, 0, 1, 0, arg1);
		}
	}
}
