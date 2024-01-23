import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static285 {

	@OriginalMember(owner = "client!vk", name = "m", descriptor = "Lclient!kb;")
	public static Class83 aClass83_198;

	@OriginalMember(owner = "client!vk", name = "y", descriptor = "Lclient!kb;")
	public static Class83 aClass83_199;

	@OriginalMember(owner = "client!vk", name = "r", descriptor = "Lclient!tl;")
	public static Class155 aClass155_46 = new Class155(4);

	@OriginalMember(owner = "client!vk", name = "t", descriptor = "Ljava/lang/String;")
	public static String aString195 = "flash3:";

	@OriginalMember(owner = "client!vk", name = "v", descriptor = "[S")
	public static short[] aShortArray92 = new short[] { -4160, -4163, -8256, -8259, 22461 };

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "([[I[[B[[F[[B[[F[[FB[[I[[B[[B[[I[[I[[I[[[B[[[II)[Lclient!kd;")
	public static Class1_Sub20[] method4692(@OriginalArg(0) int[][] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) float[][] arg2, @OriginalArg(3) byte[][] arg3, @OriginalArg(4) float[][] arg4, @OriginalArg(5) float[][] arg5, @OriginalArg(7) int[][] arg6, @OriginalArg(8) byte[][] arg7, @OriginalArg(9) byte[][] arg8, @OriginalArg(10) int[][] arg9, @OriginalArg(11) int[][] arg10, @OriginalArg(12) int[][] arg11, @OriginalArg(13) byte[][][] arg12, @OriginalArg(14) int[][][] arg13, @OriginalArg(15) int arg14) {
		@Pc(9) int[][] local9 = new int[105][105];
		@Pc(16) int local16;
		@Pc(21) int local21;
		@Pc(56) byte local56;
		for (@Pc(11) int local11 = 1; local11 <= 103; local11++) {
			for (local16 = 1; local16 <= 103; local16++) {
				local21 = 0;
				if (arg13 != null) {
					@Pc(37) int local37 = arg13[arg14][local11 >> 3][local16 >> 3];
					local21 = local37 >> 1 & 0x3;
				}
				if (local21 == 0) {
					local56 = arg1[local11][local16];
					if (local56 == 0) {
						local56 = arg1[local11 - 1][local16];
					}
					if (local56 == 0) {
						local56 = arg1[local11][local16 - 1];
					}
					if (local56 == 0) {
						local56 = arg1[local11 - 1][local16 - 1];
					}
				} else if (local21 == 1) {
					local56 = arg1[local11][local16 - 1];
					if (local56 == 0) {
						local56 = arg1[local11][local16];
					}
					if (local56 == 0) {
						local56 = arg1[local11 - 1][local16 - 1];
					}
					if (local56 == 0) {
						local56 = arg1[local11 - 1][local16];
					}
				} else if (local21 == 2) {
					local56 = arg1[local11 - 1][local16 - 1];
					if (local56 == 0) {
						local56 = arg1[local11][local16 - 1];
					}
					if (local56 == 0) {
						local56 = arg1[local11 - 1][local16];
					}
					if (local56 == 0) {
						local56 = arg1[local11][local16];
					}
				} else {
					local56 = arg1[local11 - 1][local16];
					if (local56 == 0) {
						local56 = arg1[local11 - 1][local16 - 1];
					}
					if (local56 == 0) {
						local56 = arg1[local11][local16];
					}
					if (local56 == 0) {
						local56 = arg1[local11][local16 - 1];
					}
				}
				if (local56 != 0) {
					@Pc(253) Class136 local253 = Static160.method3004((local56 & 0xFF) - 1);
					local9[local11][local16] = (local253.anInt4939 + 1 << 16) + local253.anInt4940;
				}
			}
		}
		@Pc(278) Class117 local278 = new Class117(128);
		@Pc(329) int local329;
		@Pc(337) int local337;
		@Pc(339) int local339;
		for (local16 = 1; local16 <= 102; local16++) {
			for (local21 = 1; local21 <= 102; local21++) {
				if (arg1[local16][local21] != 0) {
					@Pc(312) int[] local312;
					if (arg3[local16][local21] == 0) {
						local312 = Static58.anIntArrayArray11[0];
					} else {
						local312 = Static165.anIntArrayArray24[arg7[local16][local21]];
						if (local312.length == 0) {
							continue;
						}
					}
					local329 = local9[local16][local21];
					local337 = local9[local16 + 1][local21];
					local339 = 0;
					@Pc(349) int local349 = local9[local16 + 1][local21 + 1];
					if (arg9 != null) {
						local339 = arg9[local16][local21] & 0xFFFFFF;
					}
					@Pc(369) long local369 = (long) local337 << 32 | (long) local339;
					@Pc(377) int local377 = local9[local16][local21 + 1];
					@Pc(385) long local385 = (long) local339 | (long) local329 << 32;
					@Pc(393) long local393 = (long) local339 | (long) local349 << 32;
					@Pc(401) long local401 = (long) local377 << 32 | (long) local339;
					@Pc(406) int local406 = local312.length / 2;
					@Pc(412) Class1_Sub20 local412 = (Class1_Sub20) local278.method3438(local385);
					if (local412 == null) {
						local412 = new Class1_Sub20((local329 >> 16) - 1, (float) (local329 & 0xFFFF), false, arg6 != null, local339);
						local278.method3445(local412, local385);
					}
					local412.anInt3100++;
					local412.anInt3097 += local406;
					if (local385 != local369) {
						local412 = (Class1_Sub20) local278.method3438(local369);
						if (local412 == null) {
							local412 = new Class1_Sub20((local337 >> 16) - 1, (float) (local337 & 0xFFFF), false, arg6 != null, local339);
							local278.method3445(local412, local369);
						}
						local412.anInt3097 += local406;
						local412.anInt3100++;
					}
					if (local385 != local393 && local369 != local393) {
						local412 = (Class1_Sub20) local278.method3438(local393);
						if (local412 == null) {
							local412 = new Class1_Sub20((local349 >> 16) - 1, (float) (local349 & 0xFFFF), false, arg6 != null, local339);
							local278.method3445(local412, local393);
						}
						local412.anInt3097 += local406;
						local412.anInt3100++;
					}
					if (local385 != local401 && local369 != local401 && local393 != local401) {
						local412 = (Class1_Sub20) local278.method3438(local401);
						if (local412 == null) {
							local412 = new Class1_Sub20((local377 >> 16) - 1, (float) (local377 & 0xFFFF), false, arg6 != null, local339);
							local278.method3445(local412, local401);
						}
						local412.anInt3097 += local406;
						local412.anInt3100++;
					}
				}
			}
		}
		@Pc(659) Class1_Sub20 local659;
		for (local659 = (Class1_Sub20) local278.method3441(); local659 != null; local659 = (Class1_Sub20) local278.method3444()) {
			local659.method2361();
		}
		for (local16 = 1; local16 <= 102; local16++) {
			for (local21 = 1; local21 <= 102; local21++) {
				local56 = arg1[local16][local21];
				if (local56 != 0) {
					local329 = 0;
					if ((arg12[arg14][local16][local21] & 0x8) != 0) {
						local339 = 0;
					} else if ((arg12[1][local16][local21] & 0x2) == 2 && arg14 > 0) {
						local339 = arg14 - 1;
					} else {
						local339 = arg14;
					}
					local337 = 128;
					if (arg9 != null) {
						local329 = arg9[local16][local21] & 0xFFFFFF;
						local337 = arg9[local16][local21] >>> 24 << 3;
					}
					@Pc(762) boolean[] local762 = null;
					@Pc(798) int local798;
					@Pc(859) int local859;
					@Pc(775) int[] local775;
					@Pc(959) byte local959;
					@Pc(821) int local821;
					@Pc(897) int local897;
					if (arg3[local16][local21] == 0) {
						local775 = Static58.anIntArrayArray11[0];
						local798 = arg1[local16 - 1][local21 - 1] == local56 ? 1 : -1;
						local821 = arg1[local16 + 1][local21 - 1] == local56 ? 1 : -1;
						if (local56 == arg1[local16][local21 - 1]) {
							local798++;
							local821++;
						} else {
							local821--;
							local798--;
						}
						local859 = arg1[local16 + 1][local21 + 1] == local56 ? 1 : -1;
						if (arg1[local16 + 1][local21] == local56) {
							local821++;
							local859++;
						} else {
							local859--;
							local821--;
						}
						local897 = local56 == arg1[local16 - 1][local21 + 1] ? 1 : -1;
						if (arg1[local16][local21 + 1] == local56) {
							local859++;
							local897++;
						} else {
							local859--;
							local897--;
						}
						if (arg1[local16 - 1][local21] == local56) {
							local897++;
							local798++;
						} else {
							local897--;
							local798--;
						}
						@Pc(936) int local936 = local798 - local859;
						@Pc(941) int local941 = local821 - local897;
						if (local941 < 0) {
							local941 = -local941;
						}
						if (local936 < 0) {
							local936 = -local936;
						}
						local959 = (byte) (local936 >= local941 ? 0 : 1);
						arg8[local16][local21] = local959;
					} else {
						local775 = Static165.anIntArrayArray24[arg7[local16][local21]];
						local959 = arg8[local16][local21];
						local762 = Static2.aBooleanArrayArray6[arg7[local16][local21]];
						if (local775.length == 0) {
							continue;
						}
					}
					local798 = local9[local16][local21];
					local859 = local9[local16 + 1][local21 + 1];
					local821 = local9[local16 + 1][local21];
					local897 = local9[local16][local21 + 1];
					@Pc(1032) long local1032 = (long) local329 | (long) local798 << 32;
					@Pc(1040) long local1040 = (long) local329 | (long) local821 << 32;
					@Pc(1048) long local1048 = (long) local329 | (long) local897 << 32;
					@Pc(1056) long local1056 = (long) local859 << 32 | (long) local329;
					@Pc(1064) int local1064 = arg0[local16 + 1][local21];
					@Pc(1074) int local1074 = arg0[local16 + 1][local21 + 1];
					@Pc(1082) int local1082 = arg0[local16][local21 + 1];
					@Pc(1088) int local1088 = arg0[local16][local21];
					@Pc(1094) int local1094 = arg10[local16][local21];
					@Pc(1102) int local1102 = arg10[local16 + 1][local21];
					@Pc(1110) int local1110 = arg10[local16][local21 + 1];
					@Pc(1120) int local1120 = arg10[local16 + 1][local21 + 1];
					@Pc(1126) int local1126 = (local798 >> 16) - 1;
					@Pc(1132) int local1132 = (local821 >> 16) - 1;
					@Pc(1138) int local1138 = (local859 >> 16) - 1;
					@Pc(1144) int local1144 = (local897 >> 16) - 1;
					@Pc(1150) Class1_Sub20 local1150 = (Class1_Sub20) local278.method3438(local1032);
					Static176.method3219(Static216.method3796(local1126, local1102, local1064), local339, local762, arg5, arg6, local798 <= local859, Static216.method3796(local1126, local1094, local1088), local1150, local897 >= local798, arg4, local16, local775, local821 >= local798, local21, local959, Static216.method3796(local1126, local1110, local1082), Static216.method3796(local1126, local1120, local1074), arg11, local798 <= local798, local337, arg2);
					if (local1032 != local1040) {
						local1150 = (Class1_Sub20) local278.method3438(local1040);
						Static176.method3219(Static216.method3796(local1132, local1102, local1064), local339, local762, arg5, arg6, local821 <= local859, Static216.method3796(local1132, local1094, local1088), local1150, local897 >= local821, arg4, local16, local775, local821 >= local821, local21, local959, Static216.method3796(local1132, local1110, local1082), Static216.method3796(local1132, local1120, local1074), arg11, local821 <= local798, local337, arg2);
					}
					if (local1032 != local1056 && local1056 != local1040) {
						local1150 = (Class1_Sub20) local278.method3438(local1056);
						Static176.method3219(Static216.method3796(local1138, local1102, local1064), local339, local762, arg5, arg6, local859 <= local859, Static216.method3796(local1138, local1094, local1088), local1150, local897 >= local859, arg4, local16, local775, local821 >= local859, local21, local959, Static216.method3796(local1138, local1110, local1082), Static216.method3796(local1138, local1120, local1074), arg11, local859 <= local798, local337, arg2);
					}
					if (local1032 != local1048 && local1048 != local1040 && local1056 != local1048) {
						local1150 = (Class1_Sub20) local278.method3438(local1048);
						Static176.method3219(Static216.method3796(local1144, local1102, local1064), local339, local762, arg5, arg6, local859 >= local897, Static216.method3796(local1144, local1094, local1088), local1150, local897 <= local897, arg4, local16, local775, local821 >= local897, local21, local959, Static216.method3796(local1144, local1110, local1082), Static216.method3796(local1144, local1120, local1074), arg11, local798 >= local897, local337, arg2);
					}
				}
			}
		}
		for (local659 = (Class1_Sub20) local278.method3441(); local659 != null; local659 = (Class1_Sub20) local278.method3444()) {
			if (local659.anInt3096 == 0) {
				local659.method4742();
			} else {
				local659.method2358();
			}
		}
		local16 = local278.method3439();
		@Pc(1512) long[] local1512 = new long[local16];
		@Pc(1515) Class1_Sub20[] local1515 = new Class1_Sub20[local16];
		local278.method3447(local1515);
		for (local339 = 0; local339 < local16; local339++) {
			local1512[local339] = local1515[local339].aLong201;
		}
		Static230.method4023(local1515, local1512);
		return local1515;
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IZIIIII)V")
	public static void method4693(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static243.anInt5324 = arg0;
		Static251.anInt5457 = arg2;
		Static178.anInt4008 = arg3;
		Static20.anInt5569 = arg5;
		Static295.anInt3204 = arg4;
		if (arg1 && Static243.anInt5324 >= 100) {
			Static157.anInt3612 = Static295.anInt3204 * 128 + 64;
			Static229.anInt5072 = Static251.anInt5457 * 128 + 64;
			Static48.anInt1350 = Static220.method3905(Static229.anInt5072, Static157.anInt3612, Static145.anInt3477) - Static20.anInt5569;
		}
		Static280.anInt5999 = 2;
	}

	@OriginalMember(owner = "client!vk", name = "d", descriptor = "(I)I")
	public static int method4695() {
		return Static28.anInt774 == 0 ? 0 : Static207.anInterface1Array1[Static28.anInt774].method3558();
	}
}
