import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static188 {

	@OriginalMember(owner = "client!mo", name = "o", descriptor = "[Lclient!cq;")
	public static Class8[] aClass8Array9;

	@OriginalMember(owner = "client!mo", name = "x", descriptor = "[Lclient!sp;")
	public static Class189[] aClass189Array1;

	@OriginalMember(owner = "client!mo", name = "q", descriptor = "I")
	public static int anInt3930 = -1;

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(ILclient!dc;IIIZILclient!rj;IIIIILclient!ii;I)Lclient!dc;")
	public static Class40 method3337(@OriginalArg(0) int arg0, @OriginalArg(1) Class40 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class177 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) Class105 arg12, @OriginalArg(14) int arg13) {
		if (arg1 == null) {
			return null;
		}
		@Pc(11) int local11 = 1031;
		if (arg6 != null) {
			local11 = arg6.method4742(arg8, -1, false) | 0x407;
			local11 &= 0xFFFFFDFF;
		}
		@Pc(49) long local49 = ((long) arg13 << 48) + ((long) arg3 << 32) + (long) (arg9 - -(arg10 << 16) - -(arg7 << 24));
		@Pc(51) Class37 local51 = Static109.aClass37_38;
		@Pc(59) Class40 local59;
		synchronized (Static109.aClass37_38) {
			local59 = (Class40) Static109.aClass37_38.method915(local49);
		}
		@Pc(154) int local154;
		@Pc(160) int local160;
		@Pc(166) int local166;
		@Pc(170) int local170;
		if (local59 == null || arg12.method4223(local59.method4602(), local11) != 0) {
			if (local59 != null) {
				local11 = arg12.method4214(local11, local59.method4602());
			}
			@Pc(91) byte local91;
			if (arg9 == 1) {
				local91 = 9;
			} else if (arg9 == 2) {
				local91 = 12;
			} else if (arg9 == 3) {
				local91 = 15;
			} else if (arg9 == 4) {
				local91 = 18;
			} else {
				local91 = 21;
			}
			@Pc(129) int[] local129 = new int[] { 64, 96, 128 };
			@Pc(147) Class219 local147 = new Class219(local91 * 3 + 1, -local91 + local91 * 2 * 3, 0);
			local154 = local147.method5848(0, 0, 0);
			@Pc(158) int[][] local158 = new int[3][local91];
			@Pc(172) int local172;
			@Pc(196) int local196;
			for (local160 = 0; local160 < 3; local160++) {
				local166 = local129[local160];
				local170 = local129[local160];
				for (local172 = 0; local172 < local91; local172++) {
					@Pc(180) int local180 = (local172 << 14) / local91;
					@Pc(188) int local188 = Class1_Sub5_Sub15.anIntArray335[local180] * local166 >> 15;
					local196 = Class1_Sub5_Sub15.anIntArray333[local180] * local170 >> 15;
					local158[local160][local172] = local147.method5848(local196, 0, local188);
				}
			}
			for (local166 = 0; local166 < 3; local166++) {
				local170 = (local166 * 256 + 128) / 3;
				local172 = 256 - local170;
				@Pc(247) byte local247 = (byte) (local172 * arg10 + local170 * arg7 >> 8);
				@Pc(292) short local292 = (short) (((arg13 & 0x380) * local170 + local172 * (arg3 & 0x380) & 0x38000) + ((arg13 & 0xFC00) * local170 + local172 * (arg3 & 0xFC00) & 0xFC0000) + ((arg3 & 0x7F) * local172 + local170 * (arg13 & 0x7F) & 0x7F00) >> 8);
				for (local196 = 0; local196 < local91; local196++) {
					if (local166 == 0) {
						local147.method5844(local158[0][local196], (byte) -1, local292, (byte) 1, local158[0][(local196 + 1) % local91], local154, (short) -1, local247);
					} else {
						local147.method5844(local158[local166][(local196 + 1) % local91], (byte) -1, local292, (byte) 1, local158[local166 - 1][(local196 + 1) % local91], local158[local166 - 1][local196], (short) -1, local247);
						local147.method5844(local158[local166][local196], (byte) -1, local292, (byte) 1, local158[local166][(local196 + 1) % local91], local158[local166 - 1][local196], (short) -1, local247);
					}
				}
			}
			local59 = arg12.method4301(local147, local11, Static342.anInt2476, 64, 768);
			@Pc(419) Class37 local419 = Static109.aClass37_38;
			synchronized (Static109.aClass37_38) {
				Static109.aClass37_38.method922(local49, local59);
			}
		}
		@Pc(438) int local438 = arg9 * 64 - 1;
		@Pc(441) int local441 = -local438;
		@Pc(444) int local444 = -local438;
		@Pc(446) int local446 = local438;
		local154 = local438;
		if (arg4) {
			if (arg0 > 13312 || arg0 < 3072) {
				local444 -= 128;
			}
			if (arg0 > 1024 && arg0 < 7168) {
				local441 -= 128;
			}
			if (arg0 > 5120 && arg0 < 11264) {
				local154 = local438 + 128;
			}
			if (arg0 > 9216 && arg0 < 15360) {
				local446 = local438 + 128;
			}
		}
		@Pc(491) int local491 = arg1.method4574();
		local160 = arg1.method4607();
		local166 = arg1.method4577();
		if (local441 > local491) {
			local491 = local441;
		}
		if (local446 < local160) {
			local160 = local446;
		}
		if (local444 > local166) {
			local166 = local444;
		}
		local170 = arg1.method4573();
		if (local154 < local170) {
			local170 = local154;
		}
		@Pc(554) Class1_Sub2_Sub13 local554 = null;
		if (arg6 != null) {
			@Pc(561) int local561 = arg6.anIntArray529[arg8];
			local554 = Static327.method5522(local561 >> 16);
			arg8 = local561 & 0xFFFF;
		}
		if (local554 == null) {
			local59 = local59.method4599((byte) 3, local11, true);
			local59.method4611((local160 - local491) / 2, 128, (local170 - local166) / 2);
			local59.method4612((local491 + local160) / 2, 0, (local166 + local170) / 2);
		} else {
			local59 = local59.method4599((byte) 3, local11, true);
			local59.method4611((local160 - local491) / 2, 128, (local170 - local166) / 2);
			local59.method4612((local491 + local160) / 2, 0, (local170 + local166) / 2);
			local59.method4617(arg8, local554);
		}
		if (arg5 != 0) {
			local59.method4591(arg5);
		}
		if (arg2 != 0) {
			local59.method4583(arg2);
		}
		if (arg11 != 0) {
			local59.method4612(0, arg11, 0);
		}
		return local59;
	}
}
