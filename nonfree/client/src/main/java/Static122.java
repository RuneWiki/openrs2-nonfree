import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!c", name = "a", descriptor = "([B[IIIIIIILclient!c;)I")
	public static int method284(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class5_Sub2_Sub1 arg7) {
		arg2 >>= 0x8;
		@Pc(7) int local7 = arg6 >> 8;
		@Pc(11) int local11 = arg4 << 8;
		@Pc(20) int local20;
		if ((local20 = arg3 + arg2 + 1 - local7) > arg5) {
			local20 = arg5;
		}
		local20 -= 3;
		@Pc(28) int local28;
		while (arg3 < local20) {
			local28 = arg3++;
			@Pc(31) int local31 = arg1[local28];
			@Pc(34) int local34 = arg2 - 1;
			arg1[local28] = local31 + arg0[arg2] * local11;
			@Pc(41) int local41 = arg3++;
			@Pc(44) int local44 = arg1[local41];
			@Pc(47) int local47 = local34 - 1;
			arg1[local41] = local44 + arg0[local34] * local11;
			@Pc(54) int local54 = arg3++;
			@Pc(57) int local57 = arg1[local54];
			@Pc(60) int local60 = local47 - 1;
			arg1[local54] = local57 + arg0[local47] * local11;
			@Pc(67) int local67 = arg3++;
			@Pc(70) int local70 = arg1[local67];
			arg2 = local60 - 1;
			arg1[local67] = local70 + arg0[local60] * local11;
		}
		local20 += 3;
		while (arg3 < local20) {
			local28 = arg3++;
			arg1[local28] += arg0[arg2--] * local11;
		}
		arg7.anInt379 = arg2 << 8;
		return arg3;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "([B[IIIIIIIIILclient!c;)I")
	public static int method285(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class5_Sub2_Sub1 arg9) {
		arg2 >>= 0x8;
		@Pc(7) int local7 = arg8 >> 8;
		arg4 <<= 0x8;
		@Pc(15) int local15 = arg6 << 8;
		@Pc(24) int local24;
		if ((local24 = arg3 + arg2 + 1 - local7) > arg7) {
			local24 = arg7;
		}
		local24 -= 3;
		@Pc(32) int local32;
		while (arg3 < local24) {
			local32 = arg3++;
			@Pc(35) int local35 = arg1[local32];
			@Pc(38) int local38 = arg2 - 1;
			arg1[local32] = local35 + (arg0[arg2] * arg4 >> arg5);
			@Pc(49) int local49 = arg4 + local15;
			@Pc(51) int local51 = arg3++;
			@Pc(54) int local54 = arg1[local51];
			@Pc(57) int local57 = local38 - 1;
			arg1[local51] = local54 + (arg0[local38] * local49 >> arg5);
			@Pc(68) int local68 = local49 + local15;
			@Pc(70) int local70 = arg3++;
			@Pc(73) int local73 = arg1[local70];
			@Pc(76) int local76 = local57 - 1;
			arg1[local70] = local73 + (arg0[local57] * local68 >> arg5);
			@Pc(87) int local87 = local68 + local15;
			@Pc(89) int local89 = arg3++;
			@Pc(92) int local92 = arg1[local89];
			arg2 = local76 - 1;
			arg1[local89] = local92 + (arg0[local76] * local87 >> arg5);
			arg4 = local87 + local15;
		}
		local24 += 3;
		while (arg3 < local24) {
			local32 = arg3++;
			arg1[local32] += arg0[arg2--] * arg4 >> arg5;
			arg4 += local15;
		}
		arg9.anInt380 = arg4 >> 8;
		arg9.anInt379 = arg2 << 8;
		return arg3;
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "([B[IIIIIIIIILclient!c;)I")
	public static int method286(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class5_Sub2_Sub1 arg9) {
		arg2 >>= 0x8;
		@Pc(7) int local7 = arg8 >> 8;
		arg4 <<= 0x8;
		@Pc(15) int local15 = arg6 << 8;
		@Pc(22) int local22;
		if ((local22 = arg3 + local7 - arg2) > arg7) {
			local22 = arg7;
		}
		local22 -= 3;
		@Pc(30) int local30;
		while (arg3 < local22) {
			local30 = arg3++;
			@Pc(33) int local33 = arg1[local30];
			@Pc(36) int local36 = arg2 + 1;
			arg1[local30] = local33 + (arg0[arg2] * arg4 >> arg5);
			@Pc(47) int local47 = arg4 + local15;
			@Pc(49) int local49 = arg3++;
			@Pc(52) int local52 = arg1[local49];
			@Pc(55) int local55 = local36 + 1;
			arg1[local49] = local52 + (arg0[local36] * local47 >> arg5);
			@Pc(66) int local66 = local47 + local15;
			@Pc(68) int local68 = arg3++;
			@Pc(71) int local71 = arg1[local68];
			@Pc(74) int local74 = local55 + 1;
			arg1[local68] = local71 + (arg0[local55] * local66 >> arg5);
			@Pc(85) int local85 = local66 + local15;
			@Pc(87) int local87 = arg3++;
			@Pc(90) int local90 = arg1[local87];
			arg2 = local74 + 1;
			arg1[local87] = local90 + (arg0[local74] * local85 >> arg5);
			arg4 = local85 + local15;
		}
		local22 += 3;
		while (arg3 < local22) {
			local30 = arg3++;
			arg1[local30] += arg0[arg2++] * arg4 >> arg5;
			arg4 += local15;
		}
		arg9.anInt380 = arg4 >> 8;
		arg9.anInt379 = arg2 << 8;
		return arg3;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(II[B[IIIIIIIIILclient!c;II)I")
	public static int method288(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(10) int arg7, @OriginalArg(11) int arg8, @OriginalArg(12) Class5_Sub2_Sub1 arg9, @OriginalArg(13) int arg10, @OriginalArg(14) int arg11) {
		@Pc(14) int local14;
		if (arg10 == 0 || (local14 = arg3 + (arg8 + arg10 - arg2 - 257) / arg10) > arg7) {
			local14 = arg7;
		}
		@Pc(27) byte local27;
		@Pc(29) int local29;
		while (arg3 < local14) {
			@Pc(23) int local23 = arg2 >> 8;
			local27 = arg0[local23];
			local29 = arg3++;
			arg1[local29] += ((local27 << 8) + (arg0[local23 + 1] - local27) * (arg2 & 0xFF)) * arg4 >> arg5;
			arg4 += arg6;
			arg2 += arg10;
		}
		if (arg10 == 0 || (local14 = arg3 + (arg8 + arg10 - arg2 - 1) / arg10) > arg7) {
			local14 = arg7;
		}
		while (arg3 < local14) {
			local27 = arg0[arg2 >> 8];
			local29 = arg3++;
			arg1[local29] += ((local27 << 8) + (arg11 - local27) * (arg2 & 0xFF)) * arg4 >> arg5;
			arg4 += arg6;
			arg2 += arg10;
		}
		arg9.anInt380 = arg4;
		arg9.anInt379 = arg2;
		return arg3;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!w;II)Lclient!c;")
	public static Class5_Sub2_Sub1 method290(@OriginalArg(0) Class5_Sub15_Sub1 arg0, @OriginalArg(2) int arg1) {
		return arg0.aByteArray29 == null || arg0.aByteArray29.length == 0 ? null : new Class5_Sub2_Sub1(arg0, (int) ((long) arg0.anInt2841 * 256L * (long) 100 / (long) (Static72.anInt1825 * 100)), arg1);
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(II[B[IIIIIIIIILclient!c;II)I")
	public static int method291(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(10) int arg7, @OriginalArg(11) int arg8, @OriginalArg(12) Class5_Sub2_Sub1 arg9, @OriginalArg(13) int arg10, @OriginalArg(14) int arg11) {
		@Pc(14) int local14;
		if (arg10 == 0 || (local14 = arg3 + (arg8 + arg10 + 256 - arg2) / arg10) > arg7) {
			local14 = arg7;
		}
		@Pc(31) int local31;
		while (arg3 < local14) {
			@Pc(23) int local23 = arg2 >> 8;
			@Pc(29) byte local29 = arg0[local23 - 1];
			local31 = arg3++;
			arg1[local31] += ((local29 << 8) + (arg0[local23] - local29) * (arg2 & 0xFF)) * arg4 >> arg5;
			arg4 += arg6;
			arg2 += arg10;
		}
		if (arg10 == 0 || (local14 = arg3 + (arg8 + arg10 - arg2) / arg10) > arg7) {
			local14 = arg7;
		}
		while (arg3 < local14) {
			local31 = arg3++;
			arg1[local31] += ((arg11 << 8) + (arg0[arg2 >> 8] - arg11) * (arg2 & 0xFF)) * arg4 >> arg5;
			arg4 += arg6;
			arg2 += arg10;
		}
		arg9.anInt380 = arg4;
		arg9.anInt379 = arg2;
		return arg3;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(I[B[IIIIIIIILclient!c;)I")
	public static int method292(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) Class5_Sub2_Sub1 arg8) {
		arg2 >>= 0x8;
		@Pc(7) int local7 = arg7 >> 8;
		@Pc(11) int local11 = arg4 << 8;
		@Pc(15) int local15 = arg5 << 8;
		@Pc(22) int local22;
		if ((local22 = arg3 + local7 - arg2) > arg6) {
			local22 = arg6;
		}
		arg3 <<= 0x1;
		local22 <<= 0x1;
		local22 -= 6;
		@Pc(41) byte local41;
		@Pc(44) int local44;
		while (arg3 < local22) {
			@Pc(39) int local39 = arg2 + 1;
			local41 = arg0[arg2];
			local44 = arg3 + 1;
			arg1[arg3] += local41 * local11;
			@Pc(54) int local54 = local44 + 1;
			arg1[local44] += local41 * local15;
			@Pc(64) int local64 = local39 + 1;
			@Pc(66) byte local66 = arg0[local39];
			@Pc(69) int local69 = local54 + 1;
			arg1[local54] += local66 * local11;
			@Pc(79) int local79 = local69 + 1;
			arg1[local69] += local66 * local15;
			@Pc(89) int local89 = local64 + 1;
			@Pc(91) byte local91 = arg0[local64];
			@Pc(94) int local94 = local79 + 1;
			arg1[local79] += local91 * local11;
			@Pc(104) int local104 = local94 + 1;
			arg1[local94] += local91 * local15;
			arg2 = local89 + 1;
			@Pc(116) byte local116 = arg0[local89];
			@Pc(119) int local119 = local104 + 1;
			arg1[local104] += local116 * local11;
			arg3 = local119 + 1;
			arg1[local119] += local116 * local15;
		}
		local22 += 6;
		while (arg3 < local22) {
			local41 = arg0[arg2++];
			local44 = arg3 + 1;
			arg1[arg3] += local41 * local11;
			arg3 = local44 + 1;
			arg1[local44] += local41 * local15;
		}
		arg8.anInt379 = arg2 << 8;
		return arg3 >> 1;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(I[B[IIIIIIIIIIILclient!c;)I")
	public static int method293(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(11) int arg9, @OriginalArg(12) int arg10, @OriginalArg(13) Class5_Sub2_Sub1 arg11) {
		arg2 >>= 0x8;
		@Pc(7) int local7 = arg10 >> 8;
		arg4 <<= 0x8;
		arg5 <<= 0x8;
		@Pc(19) int local19 = arg7 << 8;
		@Pc(23) int local23 = arg8 << 8;
		@Pc(30) int local30;
		if ((local30 = arg3 + local7 - arg2) > arg9) {
			local30 = arg9;
		}
		arg3 <<= 0x1;
		local30 <<= 0x1;
		local30 -= 6;
		@Pc(49) byte local49;
		@Pc(52) int local52;
		while (arg3 < local30) {
			@Pc(47) int local47 = arg2 + 1;
			local49 = arg0[arg2];
			local52 = arg3 + 1;
			arg1[arg3] += local49 * arg4 >> arg6;
			@Pc(65) int local65 = arg4 + local19;
			@Pc(68) int local68 = local52 + 1;
			arg1[local52] += local49 * arg5 >> arg6;
			@Pc(81) int local81 = arg5 + local23;
			@Pc(84) int local84 = local47 + 1;
			@Pc(86) byte local86 = arg0[local47];
			@Pc(89) int local89 = local68 + 1;
			arg1[local68] += local86 * local65 >> arg6;
			@Pc(102) int local102 = local65 + local19;
			@Pc(105) int local105 = local89 + 1;
			arg1[local89] += local86 * local81 >> arg6;
			@Pc(118) int local118 = local81 + local23;
			@Pc(121) int local121 = local84 + 1;
			@Pc(123) byte local123 = arg0[local84];
			@Pc(126) int local126 = local105 + 1;
			arg1[local105] += local123 * local102 >> arg6;
			@Pc(139) int local139 = local102 + local19;
			@Pc(142) int local142 = local126 + 1;
			arg1[local126] += local123 * local118 >> arg6;
			@Pc(155) int local155 = local118 + local23;
			arg2 = local121 + 1;
			@Pc(160) byte local160 = arg0[local121];
			@Pc(163) int local163 = local142 + 1;
			arg1[local142] += local160 * local139 >> arg6;
			arg4 = local139 + local19;
			arg3 = local163 + 1;
			arg1[local163] += local160 * local155 >> arg6;
			arg5 = local155 + local23;
		}
		local30 += 6;
		while (arg3 < local30) {
			local49 = arg0[arg2++];
			local52 = arg3 + 1;
			arg1[arg3] += local49 * arg4 >> arg6;
			arg4 += local19;
			arg3 = local52 + 1;
			arg1[local52] += local49 * arg5 >> arg6;
			arg5 += local23;
		}
		arg11.anInt380 = arg4 >> 8;
		arg11.anInt384 = arg5 >> 8;
		arg11.anInt379 = arg2 << 8;
		return arg3 >> 1;
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(I[B[IIIIIIIIIIILclient!c;)I")
	public static int method295(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(11) int arg9, @OriginalArg(12) int arg10, @OriginalArg(13) Class5_Sub2_Sub1 arg11) {
		arg2 >>= 0x8;
		@Pc(7) int local7 = arg10 >> 8;
		arg4 <<= 0x8;
		arg5 <<= 0x8;
		@Pc(19) int local19 = arg7 << 8;
		@Pc(23) int local23 = arg8 << 8;
		@Pc(32) int local32;
		if ((local32 = arg3 + arg2 + 1 - local7) > arg9) {
			local32 = arg9;
		}
		arg3 <<= 0x1;
		local32 <<= 0x1;
		local32 -= 6;
		@Pc(51) byte local51;
		@Pc(54) int local54;
		while (arg3 < local32) {
			@Pc(49) int local49 = arg2 - 1;
			local51 = arg0[arg2];
			local54 = arg3 + 1;
			arg1[arg3] += local51 * arg4 >> arg6;
			@Pc(67) int local67 = arg4 + local19;
			@Pc(70) int local70 = local54 + 1;
			arg1[local54] += local51 * arg5 >> arg6;
			@Pc(83) int local83 = arg5 + local23;
			@Pc(86) int local86 = local49 - 1;
			@Pc(88) byte local88 = arg0[local49];
			@Pc(91) int local91 = local70 + 1;
			arg1[local70] += local88 * local67 >> arg6;
			@Pc(104) int local104 = local67 + local19;
			@Pc(107) int local107 = local91 + 1;
			arg1[local91] += local88 * local83 >> arg6;
			@Pc(120) int local120 = local83 + local23;
			@Pc(123) int local123 = local86 - 1;
			@Pc(125) byte local125 = arg0[local86];
			@Pc(128) int local128 = local107 + 1;
			arg1[local107] += local125 * local104 >> arg6;
			@Pc(141) int local141 = local104 + local19;
			@Pc(144) int local144 = local128 + 1;
			arg1[local128] += local125 * local120 >> arg6;
			@Pc(157) int local157 = local120 + local23;
			arg2 = local123 - 1;
			@Pc(162) byte local162 = arg0[local123];
			@Pc(165) int local165 = local144 + 1;
			arg1[local144] += local162 * local141 >> arg6;
			arg4 = local141 + local19;
			arg3 = local165 + 1;
			arg1[local165] += local162 * local157 >> arg6;
			arg5 = local157 + local23;
		}
		local32 += 6;
		while (arg3 < local32) {
			local51 = arg0[arg2--];
			local54 = arg3 + 1;
			arg1[arg3] += local51 * arg4 >> arg6;
			arg4 += local19;
			arg3 = local54 + 1;
			arg1[local54] += local51 * arg5 >> arg6;
			arg5 += local23;
		}
		arg11.anInt380 = arg4 >> 8;
		arg11.anInt384 = arg5 >> 8;
		arg11.anInt379 = arg2 << 8;
		return arg3 >> 1;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(II[B[IIIIIIIIIIILclient!c;II)I")
	public static int method296(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8, @OriginalArg(12) int arg9, @OriginalArg(13) int arg10, @OriginalArg(14) Class5_Sub2_Sub1 arg11, @OriginalArg(15) int arg12, @OriginalArg(16) int arg13) {
		@Pc(14) int local14;
		if (arg12 == 0 || (local14 = arg3 + (arg10 + arg12 - arg2 - 257) / arg12) > arg9) {
			local14 = arg9;
		}
		arg3 <<= 0x1;
		local14 <<= 0x1;
		@Pc(35) byte local35;
		@Pc(53) int local53;
		@Pc(54) int local54;
		@Pc(51) int local51;
		while (arg3 < local14) {
			@Pc(31) int local31 = arg2 >> 8;
			local35 = arg0[local31];
			local51 = (local35 << 8) + (arg0[local31 + 1] - local35) * (arg2 & 0xFF);
			local53 = arg3;
			local54 = arg3 + 1;
			arg1[local53] += local51 * arg4 >> arg6;
			arg4 += arg7;
			@Pc(69) int local69 = local54;
			arg3 = local54 + 1;
			arg1[local69] += local51 * arg5 >> arg6;
			arg5 += arg8;
			arg2 += arg12;
		}
		if (arg12 == 0 || (local14 = (arg3 >> 1) + (arg10 + arg12 - arg2 - 1) / arg12) > arg9) {
			local14 = arg9;
		}
		local14 <<= 0x1;
		while (arg3 < local14) {
			local35 = arg0[arg2 >> 8];
			local51 = (local35 << 8) + (arg13 - local35) * (arg2 & 0xFF);
			local53 = arg3;
			local54 = arg3 + 1;
			arg1[local53] += local51 * arg4 >> arg6;
			arg4 += arg7;
			local53 = local54;
			arg3 = local54 + 1;
			arg1[local53] += local51 * arg5 >> arg6;
			arg5 += arg8;
			arg2 += arg12;
		}
		arg11.anInt380 = arg4;
		arg11.anInt384 = arg5;
		arg11.anInt379 = arg2;
		return arg3 >> 1;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(II[B[IIIIIIIILclient!c;II)I")
	public static int method297(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(9) int arg6, @OriginalArg(10) int arg7, @OriginalArg(11) Class5_Sub2_Sub1 arg8, @OriginalArg(12) int arg9, @OriginalArg(13) int arg10) {
		@Pc(14) int local14;
		if (arg9 == 0 || (local14 = arg3 + (arg7 + arg9 - arg2 - 257) / arg9) > arg6) {
			local14 = arg6;
		}
		arg3 <<= 0x1;
		local14 <<= 0x1;
		@Pc(35) byte local35;
		@Pc(54) int local54;
		@Pc(51) int local51;
		@Pc(53) int local53;
		while (arg3 < local14) {
			@Pc(31) int local31 = arg2 >> 8;
			local35 = arg0[local31];
			local51 = (local35 << 8) + (arg0[local31 + 1] - local35) * (arg2 & 0xFF);
			local53 = arg3;
			local54 = arg3 + 1;
			arg1[local53] += local51 * arg4;
			@Pc(63) int local63 = local54;
			arg3 = local54 + 1;
			arg1[local63] += local51 * arg5;
			arg2 += arg9;
		}
		if (arg9 == 0 || (local14 = (arg3 >> 1) + (arg7 + arg9 - arg2 - 1) / arg9) > arg6) {
			local14 = arg6;
		}
		local14 <<= 0x1;
		while (arg3 < local14) {
			local35 = arg0[arg2 >> 8];
			local51 = (local35 << 8) + (arg10 - local35) * (arg2 & 0xFF);
			local53 = arg3;
			local54 = arg3 + 1;
			arg1[local53] += local51 * arg4;
			local53 = local54;
			arg3 = local54 + 1;
			arg1[local53] += local51 * arg5;
			arg2 += arg9;
		}
		arg8.anInt379 = arg2;
		return arg3 >> 1;
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(II[B[IIIIIIIILclient!c;II)I")
	public static int method298(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(9) int arg6, @OriginalArg(10) int arg7, @OriginalArg(11) Class5_Sub2_Sub1 arg8, @OriginalArg(12) int arg9, @OriginalArg(13) int arg10) {
		@Pc(14) int local14;
		if (arg9 == 0 || (local14 = arg3 + (arg7 + arg9 + 256 - arg2) / arg9) > arg6) {
			local14 = arg6;
		}
		arg3 <<= 0x1;
		local14 <<= 0x1;
		@Pc(54) int local54;
		@Pc(51) int local51;
		@Pc(53) int local53;
		while (arg3 < local14) {
			@Pc(31) int local31 = arg2 >> 8;
			@Pc(37) byte local37 = arg0[local31 - 1];
			local51 = (local37 << 8) + (arg0[local31] - local37) * (arg2 & 0xFF);
			local53 = arg3;
			local54 = arg3 + 1;
			arg1[local53] += local51 * arg4;
			@Pc(63) int local63 = local54;
			arg3 = local54 + 1;
			arg1[local63] += local51 * arg5;
			arg2 += arg9;
		}
		if (arg9 == 0 || (local14 = (arg3 >> 1) + (arg7 + arg9 - arg2) / arg9) > arg6) {
			local14 = arg6;
		}
		local14 <<= 0x1;
		while (arg3 < local14) {
			local51 = (arg10 << 8) + (arg0[arg2 >> 8] - arg10) * (arg2 & 0xFF);
			local53 = arg3;
			local54 = arg3 + 1;
			arg1[local53] += local51 * arg4;
			local53 = local54;
			arg3 = local54 + 1;
			arg1[local53] += local51 * arg5;
			arg2 += arg9;
		}
		arg8.anInt379 = arg2;
		return arg3 >> 1;
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(II[B[IIIIIIIIIIILclient!c;II)I")
	public static int method299(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8, @OriginalArg(12) int arg9, @OriginalArg(13) int arg10, @OriginalArg(14) Class5_Sub2_Sub1 arg11, @OriginalArg(15) int arg12, @OriginalArg(16) int arg13) {
		@Pc(14) int local14;
		if (arg12 == 0 || (local14 = arg3 + (arg10 + arg12 + 256 - arg2) / arg12) > arg9) {
			local14 = arg9;
		}
		arg3 <<= 0x1;
		local14 <<= 0x1;
		@Pc(53) int local53;
		@Pc(54) int local54;
		@Pc(51) int local51;
		while (arg3 < local14) {
			@Pc(31) int local31 = arg2 >> 8;
			@Pc(37) byte local37 = arg0[local31 - 1];
			local51 = (local37 << 8) + (arg0[local31] - local37) * (arg2 & 0xFF);
			local53 = arg3;
			local54 = arg3 + 1;
			arg1[local53] += local51 * arg4 >> arg6;
			arg4 += arg7;
			@Pc(69) int local69 = local54;
			arg3 = local54 + 1;
			arg1[local69] += local51 * arg5 >> arg6;
			arg5 += arg8;
			arg2 += arg12;
		}
		if (arg12 == 0 || (local14 = (arg3 >> 1) + (arg10 + arg12 - arg2) / arg12) > arg9) {
			local14 = arg9;
		}
		local14 <<= 0x1;
		while (arg3 < local14) {
			local51 = (arg13 << 8) + (arg0[arg2 >> 8] - arg13) * (arg2 & 0xFF);
			local53 = arg3;
			local54 = arg3 + 1;
			arg1[local53] += local51 * arg4 >> arg6;
			arg4 += arg7;
			local53 = local54;
			arg3 = local54 + 1;
			arg1[local53] += local51 * arg5 >> arg6;
			arg5 += arg8;
			arg2 += arg12;
		}
		arg11.anInt380 = arg4;
		arg11.anInt384 = arg5;
		arg11.anInt379 = arg2;
		return arg3 >> 1;
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(I[B[IIIIIIIILclient!c;)I")
	public static int method301(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) Class5_Sub2_Sub1 arg8) {
		arg2 >>= 0x8;
		@Pc(7) int local7 = arg7 >> 8;
		@Pc(11) int local11 = arg4 << 8;
		@Pc(15) int local15 = arg5 << 8;
		@Pc(24) int local24;
		if ((local24 = arg3 + arg2 + 1 - local7) > arg6) {
			local24 = arg6;
		}
		arg3 <<= 0x1;
		local24 <<= 0x1;
		local24 -= 6;
		@Pc(43) byte local43;
		@Pc(46) int local46;
		while (arg3 < local24) {
			@Pc(41) int local41 = arg2 - 1;
			local43 = arg0[arg2];
			local46 = arg3 + 1;
			arg1[arg3] += local43 * local11;
			@Pc(56) int local56 = local46 + 1;
			arg1[local46] += local43 * local15;
			@Pc(66) int local66 = local41 - 1;
			@Pc(68) byte local68 = arg0[local41];
			@Pc(71) int local71 = local56 + 1;
			arg1[local56] += local68 * local11;
			@Pc(81) int local81 = local71 + 1;
			arg1[local71] += local68 * local15;
			@Pc(91) int local91 = local66 - 1;
			@Pc(93) byte local93 = arg0[local66];
			@Pc(96) int local96 = local81 + 1;
			arg1[local81] += local93 * local11;
			@Pc(106) int local106 = local96 + 1;
			arg1[local96] += local93 * local15;
			arg2 = local91 - 1;
			@Pc(118) byte local118 = arg0[local91];
			@Pc(121) int local121 = local106 + 1;
			arg1[local106] += local118 * local11;
			arg3 = local121 + 1;
			arg1[local121] += local118 * local15;
		}
		local24 += 6;
		while (arg3 < local24) {
			local43 = arg0[arg2--];
			local46 = arg3 + 1;
			arg1[arg3] += local43 * local11;
			arg3 = local46 + 1;
			arg1[local46] += local43 * local15;
		}
		arg8.anInt379 = arg2 << 8;
		return arg3 >> 1;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(II[B[IIIIIIILclient!c;II)I")
	public static int method302(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6, @OriginalArg(10) Class5_Sub2_Sub1 arg7, @OriginalArg(11) int arg8, @OriginalArg(12) int arg9) {
		@Pc(14) int local14;
		if (arg8 == 0 || (local14 = arg3 + (arg6 + arg8 + 256 - arg2) / arg8) > arg5) {
			local14 = arg5;
		}
		@Pc(31) int local31;
		while (arg3 < local14) {
			@Pc(23) int local23 = arg2 >> 8;
			@Pc(29) byte local29 = arg0[local23 - 1];
			local31 = arg3++;
			arg1[local31] += ((local29 << 8) + (arg0[local23] - local29) * (arg2 & 0xFF)) * arg4;
			arg2 += arg8;
		}
		if (arg8 == 0 || (local14 = arg3 + (arg6 + arg8 - arg2) / arg8) > arg5) {
			local14 = arg5;
		}
		while (arg3 < local14) {
			local31 = arg3++;
			arg1[local31] += ((arg9 << 8) + (arg0[arg2 >> 8] - arg9) * (arg2 & 0xFF)) * arg4;
			arg2 += arg8;
		}
		arg7.anInt379 = arg2;
		return arg3;
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(II[B[IIIIIIILclient!c;II)I")
	public static int method303(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6, @OriginalArg(10) Class5_Sub2_Sub1 arg7, @OriginalArg(11) int arg8, @OriginalArg(12) int arg9) {
		@Pc(14) int local14;
		if (arg8 == 0 || (local14 = arg3 + (arg6 + arg8 - arg2 - 257) / arg8) > arg5) {
			local14 = arg5;
		}
		@Pc(27) byte local27;
		@Pc(29) int local29;
		while (arg3 < local14) {
			@Pc(23) int local23 = arg2 >> 8;
			local27 = arg0[local23];
			local29 = arg3++;
			arg1[local29] += ((local27 << 8) + (arg0[local23 + 1] - local27) * (arg2 & 0xFF)) * arg4;
			arg2 += arg8;
		}
		if (arg8 == 0 || (local14 = arg3 + (arg6 + arg8 - arg2 - 1) / arg8) > arg5) {
			local14 = arg5;
		}
		while (arg3 < local14) {
			local27 = arg0[arg2 >> 8];
			local29 = arg3++;
			arg1[local29] += ((local27 << 8) + (arg9 - local27) * (arg2 & 0xFF)) * arg4;
			arg2 += arg8;
		}
		arg7.anInt379 = arg2;
		return arg3;
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "([B[IIIIIIILclient!c;)I")
	public static int method305(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class5_Sub2_Sub1 arg7) {
		arg2 >>= 0x8;
		@Pc(7) int local7 = arg6 >> 8;
		@Pc(11) int local11 = arg4 << 8;
		@Pc(18) int local18;
		if ((local18 = arg3 + local7 - arg2) > arg5) {
			local18 = arg5;
		}
		local18 -= 3;
		@Pc(26) int local26;
		while (arg3 < local18) {
			local26 = arg3++;
			@Pc(29) int local29 = arg1[local26];
			@Pc(32) int local32 = arg2 + 1;
			arg1[local26] = local29 + arg0[arg2] * local11;
			@Pc(39) int local39 = arg3++;
			@Pc(42) int local42 = arg1[local39];
			@Pc(45) int local45 = local32 + 1;
			arg1[local39] = local42 + arg0[local32] * local11;
			@Pc(52) int local52 = arg3++;
			@Pc(55) int local55 = arg1[local52];
			@Pc(58) int local58 = local45 + 1;
			arg1[local52] = local55 + arg0[local45] * local11;
			@Pc(65) int local65 = arg3++;
			@Pc(68) int local68 = arg1[local65];
			arg2 = local58 + 1;
			arg1[local65] = local68 + arg0[local58] * local11;
		}
		local18 += 3;
		while (arg3 < local18) {
			local26 = arg3++;
			arg1[local26] += arg0[arg2++] * local11;
		}
		arg7.anInt379 = arg2 << 8;
		return arg3;
	}
}
