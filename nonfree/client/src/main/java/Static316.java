import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static316 {

	@OriginalMember(owner = "client!wn", name = "y", descriptor = "I")
	public static int anInt5946;

	@OriginalMember(owner = "client!wn", name = "o", descriptor = "[I")
	public static int[] anIntArray537 = new int[] { 0, 2, 2, 2, 1, 1, 2, 2, 1, 3, 1, 1 };

	@OriginalMember(owner = "client!wn", name = "t", descriptor = "I")
	public static int anInt5941 = 0;

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "([[B[[B[[I[[[II[[II[[F[[[B[[B[[F[[B[[I[[I[[F[[I)[Lclient!nk;")
	public static Class1_Sub20[] method4670(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(7) float[][] arg6, @OriginalArg(8) byte[][][] arg7, @OriginalArg(9) byte[][] arg8, @OriginalArg(10) float[][] arg9, @OriginalArg(11) byte[][] arg10, @OriginalArg(12) int[][] arg11, @OriginalArg(13) int[][] arg12, @OriginalArg(14) float[][] arg13, @OriginalArg(15) int[][] arg14) {
		@Pc(5) int[][] local5 = new int[105][105];
		@Pc(12) int local12;
		@Pc(19) int local19;
		@Pc(53) byte local53;
		for (@Pc(7) int local7 = 1; local7 <= 103; local7++) {
			for (local12 = 1; local12 <= 103; local12++) {
				local19 = 0;
				if (arg3 != null) {
					@Pc(34) int local34 = arg3[arg4][local7 >> 3][local12 >> 3];
					local19 = local34 >> 1 & 0x3;
				}
				if (local19 == 0) {
					local53 = arg10[local7][local12];
					if (local53 == 0) {
						local53 = arg10[local7 - 1][local12];
					}
					if (local53 == 0) {
						local53 = arg10[local7][local12 - 1];
					}
					if (local53 == 0) {
						local53 = arg10[local7 - 1][local12 - 1];
					}
				} else if (local19 == 1) {
					local53 = arg10[local7][local12 - 1];
					if (local53 == 0) {
						local53 = arg10[local7][local12];
					}
					if (local53 == 0) {
						local53 = arg10[local7 - 1][local12 - 1];
					}
					if (local53 == 0) {
						local53 = arg10[local7 - 1][local12];
					}
				} else if (local19 == 2) {
					local53 = arg10[local7 - 1][local12 - 1];
					if (local53 == 0) {
						local53 = arg10[local7][local12 - 1];
					}
					if (local53 == 0) {
						local53 = arg10[local7 - 1][local12];
					}
					if (local53 == 0) {
						local53 = arg10[local7][local12];
					}
				} else {
					local53 = arg10[local7 - 1][local12];
					if (local53 == 0) {
						local53 = arg10[local7 - 1][local12 - 1];
					}
					if (local53 == 0) {
						local53 = arg10[local7][local12];
					}
					if (local53 == 0) {
						local53 = arg10[local7][local12 - 1];
					}
				}
				if (local53 != 0) {
					@Pc(259) Class54 local259 = Static300.method4497((local53 & 0xFF) - 1);
					local5[local7][local12] = local259.anInt1433 + (local259.anInt1443 + 1 << 16);
				}
			}
		}
		@Pc(293) Class156 local293 = new Class156(128);
		@Pc(347) int local347;
		@Pc(355) int local355;
		@Pc(375) int local375;
		for (local12 = 1; local12 <= 102; local12++) {
			for (local19 = 1; local19 <= 102; local19++) {
				if (arg10[local12][local19] != 0) {
					@Pc(325) int[] local325;
					if (arg1[local12][local19] == 0) {
						local325 = Static114.anIntArrayArray14[0];
					} else {
						local325 = Static239.anIntArrayArray36[arg8[local12][local19]];
						if (local325.length == 0) {
							continue;
						}
					}
					local347 = local5[local12][local19];
					local355 = local5[local12 + 1][local19];
					@Pc(365) int local365 = local5[local12 + 1][local19 + 1];
					@Pc(373) int local373 = local5[local12][local19 + 1];
					local375 = 0;
					if (arg14 != null) {
						local375 = arg14[local12][local19] & 0xFFFFFF;
					}
					@Pc(394) long local394 = (long) local375 | (long) local347 << 32;
					@Pc(402) long local402 = (long) local365 << 32 | (long) local375;
					@Pc(410) long local410 = (long) local375 | (long) local355 << 32;
					@Pc(418) long local418 = (long) local373 << 32 | (long) local375;
					@Pc(423) int local423 = local325.length / 2;
					@Pc(429) Class1_Sub20 local429 = (Class1_Sub20) local293.method3821(local394);
					if (local429 == null) {
						local429 = new Class1_Sub20((local347 >> 16) - 1, (float) (local347 & 0xFFFF), false, arg2 != null, local375);
						local293.method3816(local394, local429);
					}
					local429.anInt3737++;
					local429.anInt3742 += local423;
					if (local410 != local394) {
						local429 = (Class1_Sub20) local293.method3821(local410);
						if (local429 == null) {
							local429 = new Class1_Sub20((local355 >> 16) - 1, (float) (local355 & 0xFFFF), false, arg2 != null, local375);
							local293.method3816(local410, local429);
						}
						local429.anInt3737++;
						local429.anInt3742 += local423;
					}
					if (local402 != local394 && local402 != local410) {
						local429 = (Class1_Sub20) local293.method3821(local402);
						if (local429 == null) {
							local429 = new Class1_Sub20((local365 >> 16) - 1, (float) (local365 & 0xFFFF), false, arg2 != null, local375);
							local293.method3816(local402, local429);
						}
						local429.anInt3742 += local423;
						local429.anInt3737++;
					}
					if (local418 != local394 && local410 != local418 && local418 != local402) {
						local429 = (Class1_Sub20) local293.method3821(local418);
						if (local429 == null) {
							local429 = new Class1_Sub20((local373 >> 16) - 1, (float) (local373 & 0xFFFF), false, arg2 != null, local375);
							local293.method3816(local418, local429);
						}
						local429.anInt3737++;
						local429.anInt3742 += local423;
					}
				}
			}
		}
		@Pc(668) Class1_Sub20 local668;
		for (local668 = (Class1_Sub20) local293.method3822(); local668 != null; local668 = (Class1_Sub20) local293.method3820()) {
			local668.method3050();
		}
		for (local12 = 1; local12 <= 102; local12++) {
			for (local19 = 1; local19 <= 102; local19++) {
				local53 = arg10[local12][local19];
				if (local53 != 0) {
					if ((arg7[arg4][local12][local19] & 0x8) != 0) {
						local375 = 0;
					} else if ((arg7[1][local12][local19] & 0x2) == 2 && arg4 > 0) {
						local375 = arg4 - 1;
					} else {
						local375 = arg4;
					}
					local347 = 0;
					local355 = 128;
					if (arg14 != null) {
						local355 = arg14[local12][local19] >>> 24 << 3;
						local347 = arg14[local12][local19] & 0xFFFFFF;
					}
					@Pc(773) boolean[] local773 = null;
					@Pc(835) int local835;
					@Pc(873) int local873;
					@Pc(801) int[] local801;
					@Pc(785) byte local785;
					@Pc(854) int local854;
					@Pc(915) int local915;
					if (arg1[local12][local19] == 0) {
						local801 = Static114.anIntArrayArray14[0];
						local835 = arg10[local12 - 1][local19 - 1] == local53 ? 1 : -1;
						local854 = local53 == arg10[local12 + 1][local19 - 1] ? 1 : -1;
						local873 = arg10[local12 + 1][local19 + 1] == local53 ? 1 : -1;
						if (arg10[local12][local19 - 1] == local53) {
							local854++;
							local835++;
						} else {
							local854--;
							local835--;
						}
						local915 = arg10[local12 - 1][local19 + 1] == local53 ? 1 : -1;
						if (local53 == arg10[local12 + 1][local19]) {
							local873++;
							local854++;
						} else {
							local873--;
							local854--;
						}
						if (local53 == arg10[local12][local19 + 1]) {
							local915++;
							local873++;
						} else {
							local915--;
							local873--;
						}
						if (arg10[local12 - 1][local19] == local53) {
							local835++;
							local915++;
						} else {
							local835--;
							local915--;
						}
						@Pc(965) int local965 = local835 - local873;
						@Pc(969) int local969 = local854 - local915;
						if (local969 < 0) {
							local969 = -local969;
						}
						if (local965 < 0) {
							local965 = -local965;
						}
						local785 = (byte) (local969 <= local965 ? 0 : 1);
						arg0[local12][local19] = local785;
					} else {
						local785 = arg0[local12][local19];
						local773 = Static224.aBooleanArrayArray4[arg8[local12][local19]];
						local801 = Static239.anIntArrayArray36[arg8[local12][local19]];
						if (local801.length == 0) {
							continue;
						}
					}
					local835 = local5[local12][local19];
					local854 = local5[local12 + 1][local19];
					local873 = local5[local12 + 1][local19 + 1];
					@Pc(1036) long local1036 = (long) local347 | (long) local835 << 32;
					@Pc(1044) long local1044 = (long) local854 << 32 | (long) local347;
					@Pc(1052) long local1052 = (long) local347 | (long) local873 << 32;
					local915 = local5[local12][local19 + 1];
					@Pc(1068) long local1068 = (long) local347 | (long) local915 << 32;
					@Pc(1076) int local1076 = arg12[local12 + 1][local19];
					@Pc(1082) int local1082 = arg12[local12][local19];
					@Pc(1092) int local1092 = arg12[local12 + 1][local19 + 1];
					@Pc(1100) int local1100 = arg12[local12][local19 + 1];
					@Pc(1106) int local1106 = arg11[local12][local19];
					@Pc(1114) int local1114 = arg11[local12][local19 + 1];
					@Pc(1122) int local1122 = arg11[local12 + 1][local19];
					@Pc(1132) int local1132 = arg11[local12 + 1][local19 + 1];
					@Pc(1138) int local1138 = (local835 >> 16) - 1;
					@Pc(1144) int local1144 = (local854 >> 16) - 1;
					@Pc(1150) int local1150 = (local873 >> 16) - 1;
					@Pc(1156) Class1_Sub20 local1156 = (Class1_Sub20) local293.method3821(local1036);
					Static249.method3834(local375, arg5, local854 >= local835, Static90.method3656(local1100, local1114, local1138), Static90.method3656(local1082, local1106, local1138), local12, arg9, Static90.method3656(local1076, local1122, local1138), local785, local19, arg13, local835 <= local873, arg6, arg2, local801, local1156, Static90.method3656(local1092, local1132, local1138), local773, local915 >= local835, local355, local835 >= local835);
					if (local1044 != local1036) {
						local1156 = (Class1_Sub20) local293.method3821(local1044);
						Static249.method3834(local375, arg5, local854 <= local854, Static90.method3656(local1100, local1114, local1144), Static90.method3656(local1082, local1106, local1144), local12, arg9, Static90.method3656(local1076, local1122, local1144), local785, local19, arg13, local873 >= local854, arg6, arg2, local801, local1156, Static90.method3656(local1092, local1132, local1144), local773, local854 <= local915, local355, local854 <= local835);
					}
					@Pc(1307) int local1307 = (local915 >> 16) - 1;
					if (local1036 != local1052 && local1052 != local1044) {
						local1156 = (Class1_Sub20) local293.method3821(local1052);
						Static249.method3834(local375, arg5, local854 >= local873, Static90.method3656(local1100, local1114, local1150), Static90.method3656(local1082, local1106, local1150), local12, arg9, Static90.method3656(local1076, local1122, local1150), local785, local19, arg13, local873 <= local873, arg6, arg2, local801, local1156, Static90.method3656(local1092, local1132, local1150), local773, local873 <= local915, local355, local873 <= local835);
					}
					if (local1068 != local1036 && local1068 != local1044 && local1052 != local1068) {
						local1156 = (Class1_Sub20) local293.method3821(local1068);
						Static249.method3834(local375, arg5, local915 <= local854, Static90.method3656(local1100, local1114, local1307), Static90.method3656(local1082, local1106, local1307), local12, arg9, Static90.method3656(local1076, local1122, local1307), local785, local19, arg13, local873 >= local915, arg6, arg2, local801, local1156, Static90.method3656(local1092, local1132, local1307), local773, local915 <= local915, local355, local915 <= local835);
					}
				}
			}
		}
		for (local668 = (Class1_Sub20) local293.method3822(); local668 != null; local668 = (Class1_Sub20) local293.method3820()) {
			if (local668.anInt3739 == 0) {
				local668.method4616();
			} else {
				local668.method3047();
			}
		}
		local12 = local293.method3825();
		@Pc(1522) long[] local1522 = new long[local12];
		@Pc(1525) Class1_Sub20[] local1525 = new Class1_Sub20[local12];
		local293.method3819(local1525);
		for (local375 = 0; local375 < local12; local375++) {
			local1522[local375] = local1525[local375].aLong223;
		}
		Static201.method3239(local1525, local1522);
		return local1525;
	}
}
