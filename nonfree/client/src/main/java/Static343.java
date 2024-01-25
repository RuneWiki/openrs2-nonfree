import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static343 {

	@OriginalMember(owner = "client!tl", name = "w", descriptor = "I")
	public static int anInt5657;

	@OriginalMember(owner = "client!tl", name = "c", descriptor = "Lclient!sh;")
	public static final Class211 aClass211_150 = new Class211(4, 0);

	@OriginalMember(owner = "client!tl", name = "r", descriptor = "[I")
	public static final int[] anIntArray680 = new int[13];

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(ILclient!ns;Lclient!tq;IBIIIZILclient!pp;IIII)Lclient!ns;")
	public static Class22 method4861(@OriginalArg(0) int arg0, @OriginalArg(1) Class22 arg1, @OriginalArg(2) Class164 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class185 arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		if (arg1 == null) {
			return null;
		}
		@Pc(11) int local11 = 1031;
		if (arg9 != null) {
			local11 = arg9.method4231(arg6, -1, false) | 0x407;
			local11 &= 0xFFFFFDFF;
		}
		@Pc(48) long local48 = ((long) arg4 << 48) + ((long) arg11 << 32) + (long) (arg12 + (arg5 << 16) - -(arg13 << 24));
		@Pc(50) Class227 local50 = Static329.aClass227_30;
		@Pc(58) Class22 local58;
		synchronized (Static329.aClass227_30) {
			local58 = (Class22) Static329.aClass227_30.method4863(local48);
		}
		@Pc(156) int local156;
		@Pc(162) int local162;
		@Pc(172) int local172;
		@Pc(174) int local174;
		if (local58 == null || arg2.method5396(local58.method1563(), local11) != 0) {
			if (local58 != null) {
				local11 = arg2.method5391(local11, local58.method1563());
			}
			@Pc(103) byte local103;
			if (arg12 == 1) {
				local103 = 9;
			} else if (arg12 == 2) {
				local103 = 12;
			} else if (arg12 == 3) {
				local103 = 15;
			} else if (arg12 == 4) {
				local103 = 18;
			} else {
				local103 = 21;
			}
			@Pc(132) int[] local132 = new int[] { 64, 96, 128 };
			@Pc(149) Class238 local149 = new Class238(local103 * 3 + 1, local103 * 6 - local103, 0);
			local156 = local149.method5223(0, 0, 0);
			@Pc(160) int[][] local160 = new int[3][local103];
			@Pc(168) int local168;
			@Pc(198) int local198;
			for (local162 = 0; local162 < 3; local162++) {
				local168 = local132[local162];
				local172 = local132[local162];
				for (local174 = 0; local174 < local103; local174++) {
					@Pc(182) int local182 = (local174 << 14) / local103;
					@Pc(190) int local190 = local168 * Class13.anIntArray20[local182] >> 15;
					local198 = Class13.anIntArray21[local182] * local172 >> 15;
					local160[local162][local174] = local149.method5223(0, local198, local190);
				}
			}
			for (local168 = 0; local168 < 3; local168++) {
				local172 = (local168 * 256 + 128) / 3;
				local174 = 256 - local172;
				@Pc(253) byte local253 = (byte) (arg5 * local174 + local172 * arg13 >> 8);
				@Pc(298) short local298 = (short) ((local172 * (arg4 & 0x7F) + (arg11 & 0x7F) * local174 & 0x7F00) + (local172 * (arg4 & 0x380) + (arg11 & 0x380) * local174 & 0x38000) + (local172 * (arg4 & 0xFC00) + local174 * (arg11 & 0xFC00) & 0xFC0000) >> 8);
				for (local198 = 0; local198 < local103; local198++) {
					if (local168 == 0) {
						local149.method5214((byte) -1, (short) -1, (byte) 1, local160[0][local198], local298, local253, local156, local160[0][(local198 + 1) % local103]);
					} else {
						local149.method5214((byte) -1, (short) -1, (byte) 1, local160[local168][(local198 + 1) % local103], local298, local253, local160[local168 - 1][local198], local160[local168 - 1][(local198 + 1) % local103]);
						local149.method5214((byte) -1, (short) -1, (byte) 1, local160[local168][local198], local298, local253, local160[local168 - 1][local198], local160[local168][(local198 + 1) % local103]);
					}
				}
			}
			local58 = arg2.method5368(local149, local11, Static384.anInt6255, 64, 768);
			@Pc(417) Class227 local417 = Static329.aClass227_30;
			synchronized (Static329.aClass227_30) {
				Static329.aClass227_30.method4865(local58, local48);
			}
		}
		@Pc(436) int local436 = arg12 * 64 - 1;
		@Pc(439) int local439 = -local436;
		@Pc(442) int local442 = -local436;
		@Pc(444) int local444 = local436;
		local156 = local436;
		if (arg7) {
			if (arg0 > 5120 && arg0 < 11264) {
				local156 = local436 + 128;
			}
			if (arg0 > 9216 && arg0 < 15360) {
				local444 = local436 + 128;
			}
			if (arg0 > 1024 && arg0 < 7168) {
				local439 -= 128;
			}
			if (arg0 > 13312 || arg0 < 3072) {
				local442 -= 128;
			}
		}
		@Pc(487) int local487 = arg1.method1574();
		local162 = arg1.method1586();
		local172 = arg1.method1592();
		if (local172 < local442) {
			local172 = local442;
		}
		if (local487 < local439) {
			local487 = local439;
		}
		local174 = arg1.method1578();
		if (local162 > local444) {
			local162 = local444;
		}
		if (local156 < local174) {
			local174 = local156;
		}
		@Pc(542) Class1_Sub6_Sub15 local542 = null;
		if (arg9 != null) {
			@Pc(549) int local549 = arg9.anIntArray579[arg6];
			local542 = Static25.aClass67_1.method1221(local549 >> 16);
			arg6 = local549 & 0xFFFF;
		}
		if (local542 == null) {
			local58 = local58.method1598((byte) 3, local11, true);
			local58.method1607((local162 - local487) / 2, 128, (local174 - local172) / 2);
			local58.method1568((local162 + local487) / 2, 0, (local174 + local172) / 2);
		} else {
			local58 = local58.method1598((byte) 3, local11, true);
			local58.method1607((local162 - local487) / 2, 128, (local174 - local172) / 2);
			local58.method1568((local487 + local162) / 2, 0, (local174 + local172) / 2);
			local58.method1585(arg6, local542);
		}
		if (arg3 != 0) {
			local58.method1582(arg3);
		}
		if (arg10 != 0) {
			local58.method1580(arg10);
		}
		if (arg8 != 0) {
			local58.method1568(0, arg8, 0);
		}
		return local58;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIII)V")
	public static void method4870(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class132 local7 = Static25.aClass132ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class25_Sub3 local13 = local7.aClass25_Sub3_2;
		@Pc(16) Class25_Sub3 local16 = local7.aClass25_Sub3_1;
		if (local13 != null) {
			local13.anInt5249 = local13.anInt5249 * arg3 / 16;
			local13.anInt5255 = local13.anInt5255 * arg3 / 16;
		}
		if (local16 != null) {
			local16.anInt5249 = local16.anInt5249 * arg3 / 16;
			local16.anInt5255 = local16.anInt5255 * arg3 / 16;
		}
	}
}
