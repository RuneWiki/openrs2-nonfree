import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!bl", name = "S", descriptor = "Lclient!ct;")
	public static Class30 aClass30_5;

	@OriginalMember(owner = "client!bl", name = "T", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray1;

	@OriginalMember(owner = "client!bl", name = "ab", descriptor = "I")
	public static int anInt669;

	@OriginalMember(owner = "client!bl", name = "U", descriptor = "I")
	public static int anInt665 = 13156520;

	@OriginalMember(owner = "client!bl", name = "Y", descriptor = "[I")
	public static final int[] anIntArray47 = new int[200];

	@OriginalMember(owner = "client!bl", name = "d", descriptor = "(II)S")
	public static short method693(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 >> 10 & 0x3F;
		@Pc(15) int local15 = arg0 >> 3 & 0x70;
		@Pc(19) int local19 = arg0 & 0x7F;
		@Pc(38) int local38 = local19 <= 64 ? local15 * local19 >> 7 : local15 * (127 - local19) >> 7;
		@Pc(42) int local42 = local38 + local19;
		@Pc(53) int local53;
		if (local42 == 0) {
			local53 = local38 << 1;
		} else {
			local53 = (local38 << 8) / local42;
		}
		return (short) (local42 | local9 << 10 | local53 >> 4 << 7);
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(III)B")
	public static byte method694(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIIIILclient!fp;BILclient!tp;ZLclient!bi;III)Lclient!bi;")
	public static Class3 method696(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class63 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class199 arg8, @OriginalArg(10) boolean arg9, @OriginalArg(11) Class3 arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		if (arg10 == null) {
			return null;
		}
		@Pc(11) int local11 = 1031;
		if (arg8 != null) {
			local11 = arg8.method5416(false, arg12, -1) | 0x407;
			local11 &= 0xFFFFFDFF;
		}
		@Pc(48) long local48 = (long) ((arg1 << 24) + (arg13 << 16) + arg3) + ((long) arg0 << 32) + ((long) arg11 << 48);
		@Pc(50) Class21 local50 = Static288.aClass21_148;
		@Pc(58) Class3 local58;
		synchronized (Static288.aClass21_148) {
			local58 = (Class3) Static288.aClass21_148.method854(local48);
		}
		@Pc(156) int local156;
		@Pc(162) int local162;
		@Pc(168) int local168;
		@Pc(172) int local172;
		if (local58 == null || arg6.method4574(local58.method1256(), local11) != 0) {
			if (local58 != null) {
				local11 = arg6.method4628(local11, local58.method1256());
			}
			@Pc(93) byte local93;
			if (arg3 == 1) {
				local93 = 9;
			} else if (arg3 == 2) {
				local93 = 12;
			} else if (arg3 == 3) {
				local93 = 15;
			} else if (arg3 == 4) {
				local93 = 18;
			} else {
				local93 = 21;
			}
			@Pc(132) int[] local132 = new int[] { 64, 96, 128 };
			@Pc(149) Class41 local149 = new Class41(local93 * 3 + 1, local93 * 3 * 2 - local93, 0);
			local156 = local149.method1522(0, 0, 0);
			@Pc(160) int[][] local160 = new int[3][local93];
			@Pc(174) int local174;
			@Pc(198) int local198;
			for (local162 = 0; local162 < 3; local162++) {
				local168 = local132[local162];
				local172 = local132[local162];
				for (local174 = 0; local174 < local93; local174++) {
					@Pc(182) int local182 = (local174 << 14) / local93;
					@Pc(190) int local190 = local168 * Class208.anIntArray479[local182] >> 15;
					local198 = local172 * Class208.anIntArray478[local182] >> 15;
					local160[local162][local174] = local149.method1522(local198, local190, 0);
				}
			}
			for (local168 = 0; local168 < 3; local168++) {
				local172 = (local168 * 256 + 128) / 3;
				local174 = 256 - local172;
				@Pc(249) byte local249 = (byte) (arg13 * local174 + local172 * arg1 >> 8);
				@Pc(294) short local294 = (short) (((arg11 & 0x7F) * local172 + (arg0 & 0x7F) * local174 & 0x7F00) + ((arg11 & 0x380) * local172 + local174 * (arg0 & 0x380) & 0x38000) + (local174 * (arg0 & 0xFC00) + local172 * (arg11 & 0xFC00) & 0xFC0000) >> 8);
				for (local198 = 0; local198 < local93; local198++) {
					if (local168 == 0) {
						local149.method1514((byte) -1, local160[0][local198], (short) -1, local160[0][(local198 + 1) % local93], local156, local294, (byte) 1, local249);
					} else {
						local149.method1514((byte) -1, local160[local168][(local198 + 1) % local93], (short) -1, local160[local168 - 1][(local198 + 1) % local93], local160[local168 - 1][local198], local294, (byte) 1, local249);
						local149.method1514((byte) -1, local160[local168][local198], (short) -1, local160[local168][(local198 + 1) % local93], local160[local168 - 1][local198], local294, (byte) 1, local249);
					}
				}
			}
			local58 = arg6.method4652(local149, local11, Static212.anInt4255, 64, 768);
			@Pc(417) Class21 local417 = Static288.aClass21_148;
			synchronized (Static288.aClass21_148) {
				Static288.aClass21_148.method843(local58, local48);
			}
		}
		@Pc(436) int local436 = arg3 * 64 - 1;
		@Pc(439) int local439 = -local436;
		@Pc(442) int local442 = -local436;
		@Pc(444) int local444 = local436;
		local156 = local436;
		if (arg9) {
			if (arg2 > 1024 && arg2 < 7168) {
				local439 -= 128;
			}
			if (arg2 > 9216 && arg2 < 15360) {
				local444 = local436 + 128;
			}
			if (arg2 > 13312 || arg2 < 3072) {
				local442 -= 128;
			}
			if (arg2 > 5120 && arg2 < 11264) {
				local156 = local436 + 128;
			}
		}
		@Pc(488) int local488 = arg10.method1269();
		local162 = arg10.method1248();
		local168 = arg10.method1264();
		local172 = arg10.method1236();
		if (local442 > local168) {
			local168 = local442;
		}
		if (local162 > local444) {
			local162 = local444;
		}
		if (local439 > local488) {
			local488 = local439;
		}
		if (local156 < local172) {
			local172 = local156;
		}
		@Pc(527) Class1_Sub4_Sub20 local527 = null;
		if (arg8 != null) {
			@Pc(534) int local534 = arg8.anIntArray467[arg12];
			local527 = Static156.method2960(local534 >> 16);
			arg12 = local534 & 0xFFFF;
		}
		if (local527 == null) {
			local58 = local58.method1261((byte) 3, local11, true);
			local58.method1252((local162 - local488) / 2, 128, (local172 - local168) / 2);
			local58.method1241((local488 + local162) / 2, 0, (local168 + local172) / 2);
		} else {
			local58 = local58.method1261((byte) 3, local11, true);
			local58.method1252((local162 - local488) / 2, 128, (local172 - local168) / 2);
			local58.method1241((local162 + local488) / 2, 0, (local168 + local172) / 2);
			local58.method1254(arg12, local527);
		}
		if (arg5 != 0) {
			local58.method1239(arg5);
		}
		if (arg4 != 0) {
			local58.method1253(arg4);
		}
		if (arg7 != 0) {
			local58.method1241(0, arg7, 0);
		}
		return local58;
	}
}
