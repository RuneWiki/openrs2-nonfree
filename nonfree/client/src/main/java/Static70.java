import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!co", name = "e", descriptor = "Lclient!dt;")
	public static Class61 aClass61_1;

	@OriginalMember(owner = "client!co", name = "f", descriptor = "Lclient!p;")
	public static Class219 aClass219_1;

	@OriginalMember(owner = "client!co", name = "d", descriptor = "Lclient!qu;")
	public static final Class243 aClass243_16 = new Class243(34, 3);

	@OriginalMember(owner = "client!co", name = "g", descriptor = "Lclient!no;")
	public static final Class2_Sub29_Sub2 aClass2_Sub29_Sub2_1 = new Class2_Sub29_Sub2(5000);

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IIIIILclient!qa;Lclient!r;IILclient!aba;IIIII)Lclient!r;")
	public static Class63 method1446(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class39 arg5, @OriginalArg(6) Class63 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Class4 arg9, @OriginalArg(10) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		if (arg6 == null) {
			return null;
		}
		@Pc(11) int local11 = 2055;
		if (arg9 != null) {
			local11 = arg9.method275(false, arg7, -1) | 0x807;
			local11 &= 0xFFFFFDFF;
		}
		@Pc(48) long local48 = ((long) arg12 << 48) + ((long) arg4 << 32) + (long) (arg10 + (arg8 << 16) - -(arg2 << 24));
		@Pc(50) Class231 local50 = Static291.aClass231_45;
		@Pc(58) Class63 local58;
		synchronized (Static291.aClass231_45) {
			local58 = (Class63) Static291.aClass231_45.method6228(local48);
		}
		@Pc(154) int local154;
		@Pc(160) int local160;
		@Pc(166) int local166;
		@Pc(170) int local170;
		if (local58 == null || arg5.method6070(local58.ba(), local11) != 0) {
			if (local58 != null) {
				local11 = arg5.method6028(local11, local58.ba());
			}
			@Pc(88) byte local88;
			if (arg10 == 1) {
				local88 = 9;
			} else if (arg10 == 2) {
				local88 = 12;
			} else if (arg10 == 3) {
				local88 = 15;
			} else if (arg10 == 4) {
				local88 = 18;
			} else {
				local88 = 21;
			}
			@Pc(130) int[] local130 = new int[] { 64, 96, 128 };
			@Pc(147) Class29 local147 = new Class29(local88 * 3 + 1, local88 * 6 - local88, 0);
			local154 = local147.method869(0, 0, 0);
			@Pc(158) int[][] local158 = new int[3][local88];
			@Pc(172) int local172;
			@Pc(196) int local196;
			for (local160 = 0; local160 < 3; local160++) {
				local166 = local130[local160];
				local170 = local130[local160];
				for (local172 = 0; local172 < local88; local172++) {
					@Pc(180) int local180 = (local172 << 14) / local88;
					@Pc(188) int local188 = Class125.anIntArray381[local180] * local166 >> 15;
					local196 = local170 * Class125.anIntArray382[local180] >> 15;
					local158[local160][local172] = local147.method869(0, local196, local188);
				}
			}
			for (local166 = 0; local166 < 3; local166++) {
				local170 = (local166 * 256 + 128) / 3;
				local172 = 256 - local170;
				@Pc(243) byte local243 = (byte) (local172 * arg8 + arg2 * local170 >> 8);
				@Pc(288) short local288 = (short) ((local172 * (arg4 & 0xFC00) + local170 * (arg12 & 0xFC00) & 0xFC0000) + ((arg12 & 0x380) * local170 + (arg4 & 0x380) * local172 & 0x38000) + ((arg12 & 0x7F) * local170 + (arg4 & 0x7F) * local172 & 0x7F00) >> 8);
				for (local196 = 0; local196 < local88; local196++) {
					if (local166 == 0) {
						local147.method862(local158[0][(local196 + 1) % local88], (byte) 1, local243, local288, (short) -1, (byte) -1, local158[0][local196], local154);
					} else {
						local147.method862(local158[local166 - 1][(local196 + 1) % local88], (byte) 1, local243, local288, (short) -1, (byte) -1, local158[local166][(local196 + 1) % local88], local158[local166 - 1][local196]);
						local147.method862(local158[local166][(local196 + 1) % local88], (byte) 1, local243, local288, (short) -1, (byte) -1, local158[local166][local196], local158[local166 - 1][local196]);
					}
				}
			}
			local58 = arg5.method6011(local147, local11, Static268.anInt4930, 64, 768);
			@Pc(411) Class231 local411 = Static291.aClass231_45;
			synchronized (Static291.aClass231_45) {
				Static291.aClass231_45.method6232(local58, local48);
			}
		}
		@Pc(430) int local430 = (arg10 << 6) - 1;
		@Pc(433) int local433 = -local430;
		@Pc(436) int local436 = -local430;
		@Pc(438) int local438 = local430;
		local154 = local430;
		if (arg13 != 0) {
			if ((arg13 & 0x8) != 0) {
				local433 -= 128;
			}
			if ((arg13 & 0x1) != 0) {
				local154 = local430 + 128;
			}
			if ((arg13 & 0x2) != 0) {
				local436 -= 128;
			}
			if ((arg13 & 0x4) != 0) {
				local438 = local430 + 128;
			}
		}
		@Pc(474) int local474 = arg6.wa();
		local160 = arg6.va();
		local166 = arg6.Q();
		if (local438 < local160) {
			local160 = local438;
		}
		if (local433 > local474) {
			local474 = local433;
		}
		local170 = arg6.U();
		if (local436 > local166) {
			local166 = local436;
		}
		if (local170 > local154) {
			local170 = local154;
		}
		@Pc(521) Class2_Sub13_Sub18 local521 = null;
		if (arg9 != null) {
			@Pc(528) int local528 = arg9.anIntArray11[arg7];
			local521 = Static396.aClass157_2.method3747(local528 >> 16);
			arg7 = local528 & 0xFFFF;
		}
		if (local521 == null) {
			local58 = local58.method7706((byte) 3, local11, true);
			local58.V(local160 - local474 >> 1, 128, local170 - local166 >> 1);
			local58.ca(local160 + local474 >> 1, 0, local170 + local166 >> 1);
		} else {
			local58 = local58.method7706((byte) 3, local11, true);
			local58.V(local160 - local474 >> 1, 128, local170 - local166 >> 1);
			local58.ca(local160 + local474 >> 1, 0, local166 + local170 >> 1);
			local58.method7701(local521, arg7);
		}
		if (arg0 != 0) {
			local58.D(arg0);
		}
		if (arg11 != 0) {
			local58.b(arg11);
		}
		if (arg1 != 0) {
			local58.ca(0, arg1, 0);
		}
		return local58;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(BII)Z")
	public static boolean method1448(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}
}
