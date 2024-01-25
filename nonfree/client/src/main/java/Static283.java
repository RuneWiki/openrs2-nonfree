import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static283 {

	@OriginalMember(owner = "client!jj", name = "p", descriptor = "I")
	public static int anInt5293 = -1;

	@OriginalMember(owner = "client!jj", name = "q", descriptor = "I")
	public static int anInt5294 = 0;

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(III)I")
	public static int method4483(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static214.anIntArray270[arg0 & 0x3] : Static195.anIntArray244[arg0 & 0x3];
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIILclient!jo;ZIIIII)Z")
	public static boolean method4484(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class198 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg0;
		@Pc(9) int local9 = arg6;
		@Pc(17) int local17 = arg0 - 64;
		@Pc(22) int local22 = arg6 - 64;
		Static638.anIntArrayArray106[64][64] = 99;
		Static376.anIntArrayArray70[64][64] = 0;
		@Pc(36) byte local36 = 0;
		Static476.anIntArray503[0] = arg0;
		@Pc(42) int local42 = 0;
		@Pc(45) int local45 = local36 + 1;
		Static331.anIntArray638[0] = arg6;
		@Pc(50) int[][] local50 = arg4.anIntArrayArray57;
		while (local42 != local45) {
			local7 = Static476.anIntArray503[local42];
			local9 = Static331.anIntArray638[local42];
			@Pc(77) int local77 = local9 - local22;
			@Pc(83) int local83 = local9 - arg4.anInt5350;
			@Pc(88) int local88 = local7 - local17;
			local42 = local42 + 1 & 0xFFF;
			@Pc(100) int local100 = local7 - arg4.anInt5352;
			if (arg7 == -4) {
				if (local7 == arg9 && arg3 == local9) {
					Static502.anInt8448 = local9;
					Static77.anInt1744 = local7;
					return true;
				}
			} else if (arg7 == -3) {
				if (Static263.method4139(arg8, arg9, arg3, local7, 1, local9, arg5, 1)) {
					Static77.anInt1744 = local7;
					Static502.anInt8448 = local9;
					return true;
				}
			} else if (arg7 == -2) {
				if (arg4.method4543(arg9, local9, 1, local7, arg1, arg5, arg3, 1, arg8)) {
					Static502.anInt8448 = local9;
					Static77.anInt1744 = local7;
					return true;
				}
			} else if (arg7 == -1) {
				if (arg4.method4538(local9, arg8, arg3, arg5, arg1, arg9, 1, local7)) {
					Static502.anInt8448 = local9;
					Static77.anInt1744 = local7;
					return true;
				}
			} else if (arg7 == 0 || arg7 == 1 || arg7 == 2 || arg7 == 3 || arg7 == 9) {
				if (arg4.method4534(arg7, 1, local9, arg3, arg9, arg2, local7)) {
					Static77.anInt1744 = local7;
					Static502.anInt8448 = local9;
					return true;
				}
			} else if (arg4.method4541(local7, arg7, 1, arg9, arg2, local9, arg3)) {
				Static502.anInt8448 = local9;
				Static77.anInt1744 = local7;
				return true;
			}
			@Pc(246) int local246 = Static376.anIntArrayArray70[local88][local77] + 1;
			if (local88 > 0 && Static638.anIntArrayArray106[local88 - 1][local77] == 0 && (local50[local100 - 1][local83] & 0x42240000) == 0) {
				Static476.anIntArray503[local45] = local7 - 1;
				Static331.anIntArray638[local45] = local9;
				local45 = local45 + 1 & 0xFFF;
				Static638.anIntArrayArray106[local88 - 1][local77] = 2;
				Static376.anIntArrayArray70[local88 - 1][local77] = local246;
			}
			if (local88 < 127 && Static638.anIntArrayArray106[local88 + 1][local77] == 0 && (local50[local100 + 1][local83] & 0x60240000) == 0) {
				Static476.anIntArray503[local45] = local7 + 1;
				Static331.anIntArray638[local45] = local9;
				Static638.anIntArrayArray106[local88 + 1][local77] = 8;
				local45 = local45 + 1 & 0xFFF;
				Static376.anIntArrayArray70[local88 + 1][local77] = local246;
			}
			if (local77 > 0 && Static638.anIntArrayArray106[local88][local77 - 1] == 0 && (local50[local100][local83 - 1] & 0x40A40000) == 0) {
				Static476.anIntArray503[local45] = local7;
				Static331.anIntArray638[local45] = local9 - 1;
				local45 = local45 + 1 & 0xFFF;
				Static638.anIntArrayArray106[local88][local77 - 1] = 1;
				Static376.anIntArrayArray70[local88][local77 - 1] = local246;
			}
			if (local77 < 127 && Static638.anIntArrayArray106[local88][local77 + 1] == 0 && (local50[local100][local83 + 1] & 0x48240000) == 0) {
				Static476.anIntArray503[local45] = local7;
				Static331.anIntArray638[local45] = local9 + 1;
				local45 = local45 + 1 & 0xFFF;
				Static638.anIntArrayArray106[local88][local77 + 1] = 4;
				Static376.anIntArrayArray70[local88][local77 + 1] = local246;
			}
			if (local88 > 0 && local77 > 0 && Static638.anIntArrayArray106[local88 - 1][local77 - 1] == 0 && (local50[local100 - 1][local83 - 1] & 0x43A40000) == 0 && (local50[local100 - 1][local83] & 0x42240000) == 0 && (local50[local100][local83 - 1] & 0x40A40000) == 0) {
				Static476.anIntArray503[local45] = local7 - 1;
				Static331.anIntArray638[local45] = local9 - 1;
				Static638.anIntArrayArray106[local88 - 1][local77 - 1] = 3;
				local45 = local45 + 1 & 0xFFF;
				Static376.anIntArrayArray70[local88 - 1][local77 - 1] = local246;
			}
			if (local88 < 127 && local77 > 0 && Static638.anIntArrayArray106[local88 + 1][local77 - 1] == 0 && (local50[local100 + 1][local83 - 1] & 0x60E40000) == 0 && (local50[local100 + 1][local83] & 0x60240000) == 0 && (local50[local100][local83 - 1] & 0x40A40000) == 0) {
				Static476.anIntArray503[local45] = local7 + 1;
				Static331.anIntArray638[local45] = local9 - 1;
				Static638.anIntArrayArray106[local88 + 1][local77 - 1] = 9;
				local45 = local45 + 1 & 0xFFF;
				Static376.anIntArrayArray70[local88 + 1][local77 - 1] = local246;
			}
			if (local88 > 0 && local77 < 127 && Static638.anIntArrayArray106[local88 - 1][local77 + 1] == 0 && (local50[local100 - 1][local83 + 1] & 0x4E240000) == 0 && (local50[local100 - 1][local83] & 0x42240000) == 0 && (local50[local100][local83 + 1] & 0x48240000) == 0) {
				Static476.anIntArray503[local45] = local7 - 1;
				Static331.anIntArray638[local45] = local9 + 1;
				local45 = local45 + 1 & 0xFFF;
				Static638.anIntArrayArray106[local88 - 1][local77 + 1] = 6;
				Static376.anIntArrayArray70[local88 - 1][local77 + 1] = local246;
			}
			if (local88 < 127 && local77 < 127 && Static638.anIntArrayArray106[local88 + 1][local77 + 1] == 0 && (local50[local100 + 1][local83 + 1] & 0x78240000) == 0 && (local50[local100 + 1][local83] & 0x60240000) == 0 && (local50[local100][local83 + 1] & 0x48240000) == 0) {
				Static476.anIntArray503[local45] = local7 + 1;
				Static331.anIntArray638[local45] = local9 + 1;
				Static638.anIntArrayArray106[local88 + 1][local77 + 1] = 12;
				local45 = local45 + 1 & 0xFFF;
				Static376.anIntArrayArray70[local88 + 1][local77 + 1] = local246;
			}
		}
		Static77.anInt1744 = local7;
		Static502.anInt8448 = local9;
		return false;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIIILclient!kh;Lclient!aa;ILclient!ha;)V")
	public static void method4485(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class208 arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class16 arg7) {
		@Pc(14) Class145 local14 = Static661.aClass321_4.method7485(arg3);
		if (local14 == null || !local14.aBoolean286 || !local14.method3156(Static592.aClass47_2)) {
			return;
		}
		@Pc(36) int local36;
		if (local14.anIntArray249 != null) {
			@Pc(34) int[] local34 = new int[local14.anIntArray249.length];
			@Pc(48) int local48;
			@Pc(59) int local59;
			@Pc(63) int local63;
			for (local36 = 0; local36 < local34.length / 2; local36++) {
				if (Static378.anInt6662 == 4) {
					local48 = (int) Static204.aFloat82 & 0x3FFF;
				} else {
					local48 = Static56.anInt1426 + (int) Static204.aFloat82 & 0x3FFF;
				}
				local59 = Class3_Sub7_Sub2.anIntArray171[local48];
				local63 = Class3_Sub7_Sub2.anIntArray170[local48];
				if (Static378.anInt6662 != 4) {
					local63 = local63 * 256 / (Static433.anInt7606 + 256);
					local59 = local59 * 256 / (Static433.anInt7606 + 256);
				}
				local34[local36 * 2] = ((arg0 + local14.anIntArray249[local36 * 2] * 4) * local63 + local59 * (local14.anIntArray249[local36 * 2 + 1] * 4 + arg2) >> 14) + arg4.anInt5639 / 2 + arg1;
				local34[local36 * 2 + 1] = arg4.anInt5630 / 2 + arg6 - (local63 * (arg2 + local14.anIntArray249[local36 * 2 + 1] * 4) - local59 * (local14.anIntArray249[local36 * 2] * 4 + arg0) >> 14);
			}
			Static130.method2261(arg7, local34, local14.anInt3616, arg4.anIntArray363, arg4.anIntArray365);
			if (local14.anInt3621 <= 0) {
				for (local48 = 0; local48 < local34.length / 2 - 1; local48++) {
					arg7.method8128(local34[local48 * 2], local34[local48 * 2 + 1], local34[local48 * 2 + 2], local34[local48 * 2 + 1 + 2], local14.anIntArray250[local14.aByteArray28[local48] & 0xFF], arg5, arg1, arg6);
				}
				arg7.method8128(local34[local34.length - 2], local34[local34.length - 1], local34[0], local34[1], local14.anIntArray250[local14.aByteArray28[local14.aByteArray28.length - 1] & 0xFF], arg5, arg1, arg6);
			} else {
				@Pc(315) int local315;
				@Pc(325) int local325;
				@Pc(334) int local334;
				@Pc(338) int local338;
				for (local48 = 0; local48 < local34.length / 2 - 1; local48++) {
					local59 = local34[local48 * 2];
					local63 = local34[local48 * 2 + 1];
					local315 = local34[(local48 + 1) * 2];
					local325 = local34[local48 * 2 + 1 + 2];
					if (local315 < local59) {
						local334 = local59;
						local59 = local315;
						local338 = local63;
						local63 = local325;
						local315 = local334;
						local325 = local338;
					} else if (local315 == local59 && local63 > local325) {
						local334 = local63;
						local63 = local325;
						local325 = local334;
					}
					arg7.method8169(local59, local63, local315, local325, local14.anIntArray250[local14.aByteArray28[local48] & 0xFF], arg5, arg1, arg6, local14.anInt3621, local14.anInt3631, local14.anInt3604);
				}
				local59 = local34[local34.length - 2];
				local63 = local34[local34.length - 1];
				local315 = local34[0];
				local325 = local34[1];
				if (local59 > local315) {
					local334 = local59;
					local59 = local315;
					local338 = local63;
					local315 = local334;
					local63 = local325;
					local325 = local338;
				} else if (local59 == local315 && local63 > local325) {
					local334 = local63;
					local63 = local325;
					local325 = local334;
				}
				arg7.method8169(local59, local63, local315, local325, local14.anIntArray250[local14.aByteArray28[local14.aByteArray28.length - 1] & 0xFF], arg5, arg1, arg6, local14.anInt3621, local14.anInt3631, local14.anInt3604);
			}
		}
		@Pc(486) Class102 local486 = null;
		if (local14.anInt3606 != -1) {
			local486 = local14.method3160(arg7, false);
			if (local486 != null) {
				Static378.method5558(arg2, arg1, local486, arg5, arg6, arg0, arg4);
			}
		}
		if (local14.aString44 == null) {
			return;
		}
		local36 = 0;
		if (local486 != null) {
			local36 = local486.method6962();
		}
		@Pc(520) Class69 local520 = Static157.aClass69_2;
		@Pc(522) Class202 local522 = Static621.aClass202_13;
		if (local14.anInt3610 == 1) {
			local520 = Static277.aClass69_9;
			local522 = Static117.aClass202_3;
		}
		if (local14.anInt3610 == 2) {
			local520 = Static243.aClass69_5;
			local522 = Static17.aClass202_1;
		}
		Static10.method97(arg4, arg1, local14.aString44, local520, arg5, local36, arg0, local14.anInt3601, local522, arg2, arg6);
		return;
	}

	@OriginalMember(owner = "client!jj", name = "c", descriptor = "(B)V")
	public static void method4486() {
		if (!Static15.aBoolean18) {
			Static112.aFloat74 += (24.0F - Static112.aFloat74) / 2.0F;
			Static15.aBoolean18 = true;
			Static226.aBoolean494 = true;
		}
	}
}
