import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!m", name = "a", descriptor = "([B[IIIIIIILclient!m;)I")
	public static int method1026(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class2_Sub10_Sub1 arg7) {
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
		arg7.anInt1538 = arg2 << 8;
		return arg3;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "([B[IIIIIIIIILclient!m;)I")
	public static int method1028(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class2_Sub10_Sub1 arg9) {
		arg2 >>= 0x8;
		@Pc(7) int local7 = arg8 >> 8;
		arg4 <<= 0x8;
		@Pc(20) int local20;
		if ((local20 = arg3 + arg2 + 1 - local7) > arg7) {
			local20 = arg7;
		}
		local20 -= 3;
		@Pc(28) int local28;
		while (arg3 < local20) {
			local28 = arg3++;
			@Pc(31) int local31 = arg1[local28];
			@Pc(34) int local34 = arg2 - 1;
			arg1[local28] = local31 + (arg0[arg2] * arg4 >> arg5);
			@Pc(45) int local45 = arg4 + arg6;
			@Pc(47) int local47 = arg3++;
			@Pc(50) int local50 = arg1[local47];
			@Pc(53) int local53 = local34 - 1;
			arg1[local47] = local50 + (arg0[local34] * local45 >> arg5);
			@Pc(64) int local64 = local45 + arg6;
			@Pc(66) int local66 = arg3++;
			@Pc(69) int local69 = arg1[local66];
			@Pc(72) int local72 = local53 - 1;
			arg1[local66] = local69 + (arg0[local53] * local64 >> arg5);
			@Pc(83) int local83 = local64 + arg6;
			@Pc(85) int local85 = arg3++;
			@Pc(88) int local88 = arg1[local85];
			arg2 = local72 - 1;
			arg1[local85] = local88 + (arg0[local72] * local83 >> arg5);
			arg4 = local83 + arg6;
		}
		local20 += 3;
		while (arg3 < local20) {
			local28 = arg3++;
			arg1[local28] += arg0[arg2--] * arg4 >> arg5;
			arg4 += arg6;
		}
		arg9.anInt1544 = arg4 >> 8;
		arg9.anInt1538 = arg2 << 8;
		return arg3;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(II[B[IIIIIIILclient!m;II)I")
	public static int method1030(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6, @OriginalArg(10) Class2_Sub10_Sub1 arg7, @OriginalArg(11) int arg8, @OriginalArg(12) int arg9) {
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
		arg7.anInt1538 = arg2;
		return arg3;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Lclient!ed;II)Lclient!m;")
	public static Class2_Sub10_Sub1 method1032(@OriginalArg(0) Class2_Sub4_Sub1 arg0, @OriginalArg(2) int arg1) {
		return arg0.aByteArray8 == null || arg0.aByteArray8.length == 0 ? null : new Class2_Sub10_Sub1(arg0, (int) ((long) arg0.anInt611 * 256L * (long) 100 / (long) (Static12.anInt291 * 100)), arg1);
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "([B[IIIIIIIIILclient!m;)I")
	public static int method1033(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class2_Sub10_Sub1 arg9) {
		arg2 >>= 0x8;
		@Pc(7) int local7 = arg8 >> 8;
		arg4 <<= 0x8;
		@Pc(18) int local18;
		if ((local18 = arg3 + local7 - arg2) > arg7) {
			local18 = arg7;
		}
		local18 -= 3;
		@Pc(26) int local26;
		while (arg3 < local18) {
			local26 = arg3++;
			@Pc(29) int local29 = arg1[local26];
			@Pc(32) int local32 = arg2 + 1;
			arg1[local26] = local29 + (arg0[arg2] * arg4 >> arg5);
			@Pc(43) int local43 = arg4 + arg6;
			@Pc(45) int local45 = arg3++;
			@Pc(48) int local48 = arg1[local45];
			@Pc(51) int local51 = local32 + 1;
			arg1[local45] = local48 + (arg0[local32] * local43 >> arg5);
			@Pc(62) int local62 = local43 + arg6;
			@Pc(64) int local64 = arg3++;
			@Pc(67) int local67 = arg1[local64];
			@Pc(70) int local70 = local51 + 1;
			arg1[local64] = local67 + (arg0[local51] * local62 >> arg5);
			@Pc(81) int local81 = local62 + arg6;
			@Pc(83) int local83 = arg3++;
			@Pc(86) int local86 = arg1[local83];
			arg2 = local70 + 1;
			arg1[local83] = local86 + (arg0[local70] * local81 >> arg5);
			arg4 = local81 + arg6;
		}
		local18 += 3;
		while (arg3 < local18) {
			local26 = arg3++;
			arg1[local26] += arg0[arg2++] * arg4 >> arg5;
			arg4 += arg6;
		}
		arg9.anInt1544 = arg4 >> 8;
		arg9.anInt1538 = arg2 << 8;
		return arg3;
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(II[B[IIIIIIILclient!m;II)I")
	public static int method1034(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6, @OriginalArg(10) Class2_Sub10_Sub1 arg7, @OriginalArg(11) int arg8, @OriginalArg(12) int arg9) {
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
		arg7.anInt1538 = arg2;
		return arg3;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(II[B[IIIIIIIIILclient!m;II)I")
	public static int method1035(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(10) int arg7, @OriginalArg(11) int arg8, @OriginalArg(12) Class2_Sub10_Sub1 arg9, @OriginalArg(13) int arg10, @OriginalArg(14) int arg11) {
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
		arg9.anInt1544 = arg4;
		arg9.anInt1538 = arg2;
		return arg3;
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "([B[IIIIIIILclient!m;)I")
	public static int method1036(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class2_Sub10_Sub1 arg7) {
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
		arg7.anInt1538 = arg2 << 8;
		return arg3;
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(II[B[IIIIIIIIILclient!m;II)I")
	public static int method1037(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(10) int arg7, @OriginalArg(11) int arg8, @OriginalArg(12) Class2_Sub10_Sub1 arg9, @OriginalArg(13) int arg10, @OriginalArg(14) int arg11) {
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
		arg9.anInt1544 = arg4;
		arg9.anInt1538 = arg2;
		return arg3;
	}
}
