import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(II[B[IIIIIIILclient!de;II)I")
	public static int method336(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6, @OriginalArg(10) Class3_Sub3_Sub1 arg7, @OriginalArg(11) int arg8, @OriginalArg(12) int arg9) {
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
		arg7.anInt543 = arg2;
		return arg3;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "([B[IIIIIIIIILclient!de;)I")
	public static int method338(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class3_Sub3_Sub1 arg9) {
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
		arg9.anInt541 = arg4 >> 8;
		arg9.anInt543 = arg2 << 8;
		return arg3;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(II[B[IIIIIIIIILclient!de;II)I")
	public static int method339(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(10) int arg7, @OriginalArg(11) int arg8, @OriginalArg(12) Class3_Sub3_Sub1 arg9, @OriginalArg(13) int arg10, @OriginalArg(14) int arg11) {
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
		arg9.anInt541 = arg4;
		arg9.anInt543 = arg2;
		return arg3;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "([B[IIIIIIILclient!de;)I")
	public static int method340(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class3_Sub3_Sub1 arg7) {
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
		arg7.anInt543 = arg2 << 8;
		return arg3;
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(II[B[IIIIIIIIILclient!de;II)I")
	public static int method341(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(10) int arg7, @OriginalArg(11) int arg8, @OriginalArg(12) Class3_Sub3_Sub1 arg9, @OriginalArg(13) int arg10, @OriginalArg(14) int arg11) {
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
		arg9.anInt541 = arg4;
		arg9.anInt543 = arg2;
		return arg3;
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "([B[IIIIIIILclient!de;)I")
	public static int method342(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class3_Sub3_Sub1 arg7) {
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
		arg7.anInt543 = arg2 << 8;
		return arg3;
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(II[B[IIIIIIILclient!de;II)I")
	public static int method344(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6, @OriginalArg(10) Class3_Sub3_Sub1 arg7, @OriginalArg(11) int arg8, @OriginalArg(12) int arg9) {
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
		arg7.anInt543 = arg2;
		return arg3;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!ta;II)Lclient!de;")
	public static Class3_Sub3_Sub1 method345(@OriginalArg(0) Class3_Sub9_Sub1 arg0, @OriginalArg(2) int arg1) {
		return arg0.aByteArray21 == null || arg0.aByteArray21.length == 0 ? null : new Class3_Sub3_Sub1(arg0, (int) ((long) arg0.anInt2418 * 256L * (long) 100 / (long) (Static89.anInt2053 * 100)), arg1);
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "([B[IIIIIIIIILclient!de;)I")
	public static int method346(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class3_Sub3_Sub1 arg9) {
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
		arg9.anInt541 = arg4 >> 8;
		arg9.anInt543 = arg2 << 8;
		return arg3;
	}
}
