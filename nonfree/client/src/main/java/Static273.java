import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static273 {

	@OriginalMember(owner = "client!nk", name = "n", descriptor = "F")
	public static float aFloat75;

	@OriginalMember(owner = "client!nk", name = "s", descriptor = "I")
	public static int anInt4773;

	@OriginalMember(owner = "client!nk", name = "o", descriptor = "Lclient!s;")
	public static final Class217 aClass217_107 = new Class217(75, 5);

	@OriginalMember(owner = "client!nk", name = "r", descriptor = "I")
	public static int anInt4772 = 0;

	@OriginalMember(owner = "client!nk", name = "u", descriptor = "I")
	public static int anInt4775 = 0;

	@OriginalMember(owner = "client!nk", name = "v", descriptor = "Lclient!lf;")
	public static final Class153 aClass153_4 = new Class153(0);

	@OriginalMember(owner = "client!nk", name = "w", descriptor = "J")
	public static long aLong157 = 0L;

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIILclient!sd;IIIIIIB)Z")
	public static boolean method3838(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class220 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(7) int local7 = arg7;
		@Pc(9) int local9 = arg4;
		@Pc(18) int local18 = arg7 - 64;
		Static315.anIntArrayArray49[64][64] = 99;
		@Pc(29) int local29 = arg4 - 64;
		Static282.anIntArrayArray45[64][64] = 0;
		@Pc(37) byte local37 = 0;
		@Pc(39) int local39 = 0;
		Static422.anIntArray685[0] = arg7;
		@Pc(62) int local62 = local37 + 1;
		Static392.anIntArray649[0] = arg4;
		@Pc(67) int[][] local67 = arg3.anIntArrayArray56;
		while (local62 != local39) {
			local9 = Static392.anIntArray649[local39];
			local7 = Static422.anIntArray685[local39];
			@Pc(82) int local82 = local9 - local29;
			@Pc(88) int local88 = local7 - arg3.anInt6196;
			local39 = local39 + 1 & 0xFFF;
			@Pc(100) int local100 = local9 - arg3.anInt6189;
			@Pc(105) int local105 = local7 - local18;
			if (arg1 == -4) {
				if (local7 == arg8 && arg2 == local9) {
					Static136.anInt2794 = local9;
					Static243.anInt4413 = local7;
					return true;
				}
			} else if (arg1 == -3) {
				if (Static43.method655(arg8, arg6, local9, local7, 1, 1, arg9, arg2)) {
					Static243.anInt4413 = local7;
					Static136.anInt2794 = local9;
					return true;
				}
			} else if (arg1 == -2) {
				if (arg3.method4885(arg8, 1, arg2, arg5, arg6, arg9, local9, local7, 1)) {
					Static243.anInt4413 = local7;
					Static136.anInt2794 = local9;
					return true;
				}
			} else if (arg1 == -1) {
				if (arg3.method4889(arg5, local7, arg6, local9, 1, arg9, arg2, arg8)) {
					Static136.anInt2794 = local9;
					Static243.anInt4413 = local7;
					return true;
				}
			} else if (arg1 == 0 || arg1 == 1 || arg1 == 2 || arg1 == 3 || arg1 == 9) {
				if (arg3.method4881(arg2, local9, arg1, arg0, arg8, local7, 1)) {
					Static243.anInt4413 = local7;
					Static136.anInt2794 = local9;
					return true;
				}
			} else if (arg3.method4874(1, local9, arg1, arg2, arg8, local7, arg0)) {
				Static136.anInt2794 = local9;
				Static243.anInt4413 = local7;
				return true;
			}
			@Pc(247) int local247 = Static282.anIntArrayArray45[local105][local82] + 1;
			if (local105 > 0 && Static315.anIntArrayArray49[local105 - 1][local82] == 0 && (local67[local88 - 1][local100] & 0x42240000) == 0) {
				Static422.anIntArray685[local62] = local7 - 1;
				Static392.anIntArray649[local62] = local9;
				local62 = local62 + 1 & 0xFFF;
				Static315.anIntArrayArray49[local105 - 1][local82] = 2;
				Static282.anIntArrayArray45[local105 - 1][local82] = local247;
			}
			if (local105 < 127 && Static315.anIntArrayArray49[local105 + 1][local82] == 0 && (local67[local88 + 1][local100] & 0x60240000) == 0) {
				Static422.anIntArray685[local62] = local7 + 1;
				Static392.anIntArray649[local62] = local9;
				local62 = local62 + 1 & 0xFFF;
				Static315.anIntArrayArray49[local105 + 1][local82] = 8;
				Static282.anIntArrayArray45[local105 + 1][local82] = local247;
			}
			if (local82 > 0 && Static315.anIntArrayArray49[local105][local82 - 1] == 0 && (local67[local88][local100 - 1] & 0x40A40000) == 0) {
				Static422.anIntArray685[local62] = local7;
				Static392.anIntArray649[local62] = local9 - 1;
				Static315.anIntArrayArray49[local105][local82 - 1] = 1;
				local62 = local62 + 1 & 0xFFF;
				Static282.anIntArrayArray45[local105][local82 - 1] = local247;
			}
			if (local82 < 127 && Static315.anIntArrayArray49[local105][local82 + 1] == 0 && (local67[local88][local100 + 1] & 0x48240000) == 0) {
				Static422.anIntArray685[local62] = local7;
				Static392.anIntArray649[local62] = local9 + 1;
				local62 = local62 + 1 & 0xFFF;
				Static315.anIntArrayArray49[local105][local82 + 1] = 4;
				Static282.anIntArrayArray45[local105][local82 + 1] = local247;
			}
			if (local105 > 0 && local82 > 0 && Static315.anIntArrayArray49[local105 - 1][local82 - 1] == 0 && (local67[local88 - 1][local100 - 1] & 0x43A40000) == 0 && (local67[local88 - 1][local100] & 0x42240000) == 0 && (local67[local88][local100 - 1] & 0x40A40000) == 0) {
				Static422.anIntArray685[local62] = local7 - 1;
				Static392.anIntArray649[local62] = local9 - 1;
				Static315.anIntArrayArray49[local105 - 1][local82 - 1] = 3;
				local62 = local62 + 1 & 0xFFF;
				Static282.anIntArrayArray45[local105 - 1][local82 - 1] = local247;
			}
			if (local105 < 127 && local82 > 0 && Static315.anIntArrayArray49[local105 + 1][local82 - 1] == 0 && (local67[local88 + 1][local100 - 1] & 0x60E40000) == 0 && (local67[local88 + 1][local100] & 0x60240000) == 0 && (local67[local88][local100 - 1] & 0x40A40000) == 0) {
				Static422.anIntArray685[local62] = local7 + 1;
				Static392.anIntArray649[local62] = local9 - 1;
				local62 = local62 + 1 & 0xFFF;
				Static315.anIntArrayArray49[local105 + 1][local82 - 1] = 9;
				Static282.anIntArrayArray45[local105 + 1][local82 - 1] = local247;
			}
			if (local105 > 0 && local82 < 127 && Static315.anIntArrayArray49[local105 - 1][local82 + 1] == 0 && (local67[local88 - 1][local100 + 1] & 0x4E240000) == 0 && (local67[local88 - 1][local100] & 0x42240000) == 0 && (local67[local88][local100 + 1] & 0x48240000) == 0) {
				Static422.anIntArray685[local62] = local7 - 1;
				Static392.anIntArray649[local62] = local9 + 1;
				local62 = local62 + 1 & 0xFFF;
				Static315.anIntArrayArray49[local105 - 1][local82 + 1] = 6;
				Static282.anIntArrayArray45[local105 - 1][local82 + 1] = local247;
			}
			if (local105 < 127 && local82 < 127 && Static315.anIntArrayArray49[local105 + 1][local82 + 1] == 0 && (local67[local88 + 1][local100 + 1] & 0x78240000) == 0 && (local67[local88 + 1][local100] & 0x60240000) == 0 && (local67[local88][local100 + 1] & 0x48240000) == 0) {
				Static422.anIntArray685[local62] = local7 + 1;
				Static392.anIntArray649[local62] = local9 + 1;
				Static315.anIntArrayArray49[local105 + 1][local82 + 1] = 12;
				local62 = local62 + 1 & 0xFFF;
				Static282.anIntArrayArray45[local105 + 1][local82 + 1] = local247;
			}
		}
		Static243.anInt4413 = local7;
		Static136.anInt2794 = local9;
		return false;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIIII[B)Z")
	public static boolean method3839(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) byte[] arg4) {
		@Pc(9) int local9 = arg3 % 8;
		@Pc(19) int local19;
		if (local9 == 0) {
			local19 = 0;
		} else {
			local19 = 8 - local9;
		}
		@Pc(32) int local32 = -((arg0 + 7) / 8);
		@Pc(41) int local41 = -((arg3 + 8 - 1) / 8);
		for (@Pc(48) int local48 = local32; local48 < 0; local48++) {
			for (@Pc(52) int local52 = local41; local52 < 0; local52++) {
				if (arg4[arg2] == 0) {
					return true;
				}
				arg2 += 8;
			}
			arg2 -= local19;
			if (arg4[arg2 - 1] == 0) {
				return true;
			}
			arg2 += arg1;
		}
		return false;
	}

	@OriginalMember(owner = "client!nk", name = "c", descriptor = "(I)V")
	public static void method3840() {
		if (Static261.anIntArray461 != null) {
			return;
		}
		Static261.anIntArray461 = new int[65536];
		@Pc(23) double local23 = Math.random() * 0.03D + 0.7D - 0.015D;
		@Pc(25) int local25 = 0;
		for (@Pc(27) int local27 = 0; local27 < 512; local27++) {
			@Pc(40) float local40 = ((float) (local27 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(49) float local49 = (float) (local27 & 0x7) / 8.0F + 0.0625F;
			for (@Pc(51) int local51 = 0; local51 < 128; local51++) {
				@Pc(58) float local58 = (float) local51 / 128.0F;
				@Pc(60) float local60 = 0.0F;
				@Pc(62) float local62 = 0.0F;
				@Pc(64) float local64 = 0.0F;
				@Pc(68) float local68 = local40 / 60.0F;
				@Pc(71) int local71 = (int) local68;
				@Pc(75) int local75 = local71 % 6;
				@Pc(80) float local80 = local68 - (float) local71;
				@Pc(87) float local87 = local58 * (1.0F - local49);
				@Pc(96) float local96 = (1.0F - local80 * local49) * local58;
				@Pc(108) float local108 = (1.0F - (1.0F - local80) * local49) * local58;
				if (local75 == 0) {
					local62 = local108;
					local60 = local58;
					local64 = local87;
				} else if (local75 == 1) {
					local62 = local58;
					local60 = local96;
					local64 = local87;
				} else if (local75 == 2) {
					local62 = local58;
					local60 = local87;
					local64 = local108;
				} else if (local75 == 3) {
					local64 = local58;
					local62 = local96;
					local60 = local87;
				} else if (local75 == 4) {
					local60 = local108;
					local62 = local87;
					local64 = local58;
				} else if (local75 == 5) {
					local64 = local96;
					local60 = local58;
					local62 = local87;
				}
				local60 = (float) Math.pow((double) local60, local23);
				local62 = (float) Math.pow((double) local62, local23);
				local64 = (float) Math.pow((double) local64, local23);
				@Pc(199) int local199 = (int) (local60 * 256.0F);
				@Pc(204) int local204 = (int) (local62 * 256.0F);
				@Pc(209) int local209 = (int) (local64 * 256.0F);
				@Pc(221) int local221 = local209 + (local204 << 8) + (local199 << 16) - 16777216;
				Static261.anIntArray461[local25++] = local221;
			}
		}
	}

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "(Z)V")
	public static void method3841() {
		Static270.anInt4754 = 0;
		for (@Pc(14) int local14 = 0; local14 < 2048; local14++) {
			Static134.aClass10_Sub8Array1[local14] = null;
			Static393.aByteArray87[local14] = 1;
			Static458.aClass32Array1[local14] = null;
		}
	}
}
