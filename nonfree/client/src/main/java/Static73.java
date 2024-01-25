import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!ej", name = "t", descriptor = "[I")
	public static int[] anIntArray94;

	@OriginalMember(owner = "client!ej", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString105 = "cyan:";

	@OriginalMember(owner = "client!ej", name = "u", descriptor = "Z")
	public static boolean aBoolean122 = false;

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIBLclient!bb;IZILclient!en;IIIIILclient!mj;)Lclient!mj;")
	public static Class101 method1594(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class17 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class59 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) Class101 arg13) {
		if (arg13 == null) {
			return null;
		}
		@Pc(11) int local11 = 1031;
		if (arg3 != null) {
			local11 = arg3.method522(arg11, -1, false) | 0x407;
			local11 &= 0xFFFFFDFF;
		}
		@Pc(48) long local48 = (long) ((arg10 << 24) + arg2 + (arg4 << 16)) + ((long) arg6 << 32) + ((long) arg9 << 48);
		@Pc(50) Class66 local50 = Static48.aClass66_15;
		@Pc(63) Class101 local63;
		synchronized (Static48.aClass66_15) {
			local63 = (Class101) Static48.aClass66_15.method1939(local48);
		}
		@Pc(158) int local158;
		@Pc(164) int local164;
		@Pc(170) int local170;
		@Pc(174) int local174;
		if (local63 == null || arg7.method4792(local63.method5171(), local11) != 0) {
			if (local63 != null) {
				local11 = arg7.method4843(local11, local63.method5171());
			}
			@Pc(95) byte local95;
			if (arg2 == 1) {
				local95 = 9;
			} else if (arg2 == 2) {
				local95 = 12;
			} else if (arg2 == 3) {
				local95 = 15;
			} else if (arg2 == 4) {
				local95 = 18;
			} else {
				local95 = 21;
			}
			@Pc(132) int[] local132 = new int[] { 64, 96, 128 };
			@Pc(151) Class150 local151 = new Class150(local95 * 3 + 1, -local95 + local95 * 3 * 2, 0);
			local158 = local151.method3983(0, 0, 0);
			@Pc(162) int[][] local162 = new int[3][local95];
			@Pc(176) int local176;
			@Pc(200) int local200;
			for (local164 = 0; local164 < 3; local164++) {
				local170 = local132[local164];
				local174 = local132[local164];
				for (local176 = 0; local176 < local95; local176++) {
					@Pc(184) int local184 = (local176 << 14) / local95;
					@Pc(192) int local192 = local170 * Class5_Sub9_Sub12.anIntArray169[local184] >> 15;
					local200 = Class5_Sub9_Sub12.anIntArray170[local184] * local174 >> 15;
					local162[local164][local176] = local151.method3983(0, local200, local192);
				}
			}
			for (local170 = 0; local170 < 3; local170++) {
				local174 = (local170 * 256 + 128) / 3;
				local176 = 256 - local174;
				@Pc(251) byte local251 = (byte) (local176 * arg4 + local174 * arg10 >> 8);
				@Pc(296) short local296 = (short) (((arg6 & 0x380) * local176 + (arg9 & 0x380) * local174 & 0x38000) + ((arg9 & 0xFC00) * local174 + (arg6 & 0xFC00) * local176 & 0xFC0000) + ((arg6 & 0x7F) * local176 + (arg9 & 0x7F) * local174 & 0x7F00) >> 8);
				for (local200 = 0; local200 < local95; local200++) {
					if (local170 == 0) {
						local151.method3977(local251, local162[0][local200], local296, local158, (byte) -1, (short) -1, (byte) 1, local162[0][(local200 + 1) % local95]);
					} else {
						local151.method3977(local251, local162[local170][(local200 + 1) % local95], local296, local162[local170 - 1][local200], (byte) -1, (short) -1, (byte) 1, local162[local170 - 1][(local200 + 1) % local95]);
						local151.method3977(local251, local162[local170][local200], local296, local162[local170 - 1][local200], (byte) -1, (short) -1, (byte) 1, local162[local170][(local200 + 1) % local95]);
					}
				}
			}
			local63 = arg7.method4804(local151, local11, Static179.anInt3583, 64, 768);
			@Pc(416) Class66 local416 = Static48.aClass66_15;
			synchronized (Static48.aClass66_15) {
				Static48.aClass66_15.method1936(local48, local63);
			}
		}
		@Pc(435) int local435 = arg2 * 64 - 1;
		@Pc(438) int local438 = -local435;
		@Pc(441) int local441 = -local435;
		@Pc(443) int local443 = local435;
		local158 = local435;
		if (arg5) {
			if (arg1 > 5120 && arg1 < 11264) {
				local158 = local435 + 128;
			}
			if (arg1 > 13312 || arg1 < 3072) {
				local441 -= 128;
			}
			if (arg1 > 9216 && arg1 < 15360) {
				local443 = local435 + 128;
			}
			if (arg1 > 1024 && arg1 < 7168) {
				local438 -= 128;
			}
		}
		@Pc(490) int local490 = arg13.method5165();
		local164 = arg13.method5152();
		local170 = arg13.method5162();
		if (local443 < local164) {
			local164 = local443;
		}
		if (local438 > local490) {
			local490 = local438;
		}
		local174 = arg13.method5148();
		if (local441 > local170) {
			local170 = local441;
		}
		if (local158 < local174) {
			local174 = local158;
		}
		@Pc(533) Class5_Sub9_Sub11 local533 = null;
		if (arg3 != null) {
			@Pc(540) int local540 = arg3.anIntArray24[arg11];
			local533 = Static12.method396(local540 >> 16);
			arg11 = local540 & 0xFFFF;
		}
		if (local533 == null) {
			local63 = local63.method5184((byte) 3, local11, true);
			local63.method5158((local164 - local490) / 2, 128, (local174 - local170) / 2);
			local63.method5194((local164 + local490) / 2, 0, (local174 + local170) / 2);
		} else {
			local63 = local63.method5184((byte) 3, local11, true);
			local63.method5158((local164 - local490) / 2, 128, (local174 - local170) / 2);
			local63.method5194((local490 + local164) / 2, 0, (local170 + local174) / 2);
			local63.method5179(local533, arg11);
		}
		if (arg8 != 0) {
			local63.method5144(arg8);
		}
		if (arg0 != 0) {
			local63.method5186(arg0);
		}
		if (arg12 != 0) {
			local63.method5194(0, arg12, 0);
		}
		return local63;
	}
}
