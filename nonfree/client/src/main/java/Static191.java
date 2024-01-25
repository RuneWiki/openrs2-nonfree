import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!md", name = "b", descriptor = "I")
	public static int anInt3980;

	@OriginalMember(owner = "client!md", name = "d", descriptor = "Lclient!vn;")
	public static Class209 aClass209_6;

	@OriginalMember(owner = "client!md", name = "r", descriptor = "I")
	public static int anInt3991 = -1;

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IZLclient!md;IIIILclient!qb;ILclient!tj;IIIII)Lclient!qb;")
	public static Class124 method3418(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class131 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class124 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Class122 arg9, @OriginalArg(10) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		if (arg7 == null) {
			return null;
		}
		@Pc(11) int local11 = 1031;
		if (arg2 != null) {
			local11 = arg2.method3416(false, arg5, -1) | 0x407;
			local11 &= 0xFFFFFDFF;
		}
		@Pc(53) long local53 = ((long) arg3 << 48) + (long) ((arg4 << 16) + arg6 + (arg10 << 24)) + ((long) arg0 << 32);
		@Pc(55) Class198 local55 = Static218.aClass198_41;
		@Pc(63) Class124 local63;
		synchronized (Static218.aClass198_41) {
			local63 = (Class124) Static218.aClass198_41.method5242(local53);
		}
		@Pc(162) int local162;
		@Pc(168) int local168;
		@Pc(174) int local174;
		@Pc(178) int local178;
		if (local63 == null || arg9.method4766(local63.method4108(), local11) != 0) {
			if (local63 != null) {
				local11 = arg9.method4799(local11, local63.method4108());
			}
			@Pc(98) byte local98;
			if (arg6 == 1) {
				local98 = 9;
			} else if (arg6 == 2) {
				local98 = 12;
			} else if (arg6 == 3) {
				local98 = 15;
			} else if (arg6 == 4) {
				local98 = 18;
			} else {
				local98 = 21;
			}
			@Pc(137) int[] local137 = new int[] { 64, 96, 128 };
			@Pc(155) Class40 local155 = new Class40(local98 * 3 + 1, local98 * 2 * 3 - local98, 0);
			local162 = local155.method908(0, 0, 0);
			@Pc(166) int[][] local166 = new int[3][local98];
			@Pc(180) int local180;
			@Pc(204) int local204;
			for (local168 = 0; local168 < 3; local168++) {
				local174 = local137[local168];
				local178 = local137[local168];
				for (local180 = 0; local180 < local98; local180++) {
					@Pc(188) int local188 = (local180 << 14) / local98;
					@Pc(196) int local196 = local174 * Class19.anIntArray20[local188] >> 15;
					local204 = local178 * Class19.anIntArray21[local188] >> 15;
					local166[local168][local180] = local155.method908(0, local204, local196);
				}
			}
			for (local174 = 0; local174 < 3; local174++) {
				local178 = (local174 * 256 + 128) / 3;
				local180 = 256 - local178;
				@Pc(255) byte local255 = (byte) (local178 * arg10 + arg4 * local180 >> 8);
				@Pc(300) short local300 = (short) ((local178 * (arg3 & 0x7F) + local180 * (arg0 & 0x7F) & 0x7F00) + (local180 * (arg0 & 0xFC00) + (arg3 & 0xFC00) * local178 & 0xFC0000) + ((arg3 & 0x380) * local178 + local180 * (arg0 & 0x380) & 0x38000) >> 8);
				for (local204 = 0; local204 < local98; local204++) {
					if (local174 == 0) {
						local155.method922(local162, local300, local166[0][local204], local166[0][(local204 + 1) % local98], (short) -1, (byte) -1, (byte) 1, local255);
					} else {
						local155.method922(local166[local174 - 1][local204], local300, local166[local174][(local204 + 1) % local98], local166[local174 - 1][(local204 + 1) % local98], (short) -1, (byte) -1, (byte) 1, local255);
						local155.method922(local166[local174 - 1][local204], local300, local166[local174][local204], local166[local174][(local204 + 1) % local98], (short) -1, (byte) -1, (byte) 1, local255);
					}
				}
			}
			local63 = arg9.method4794(local155, local11, Static283.anInt4490, 64, 768);
			@Pc(416) Class198 local416 = Static218.aClass198_41;
			synchronized (Static218.aClass198_41) {
				Static218.aClass198_41.method5231(local53, local63);
			}
		}
		@Pc(435) int local435 = arg6 * 64 - 1;
		@Pc(438) int local438 = -local435;
		@Pc(441) int local441 = -local435;
		@Pc(443) int local443 = local435;
		local162 = local435;
		if (arg1) {
			if (arg13 > 5120 && arg13 < 11264) {
				local162 = local435 + 128;
			}
			if (arg13 > 1024 && arg13 < 7168) {
				local438 -= 128;
			}
			if (arg13 > 13312 || arg13 < 3072) {
				local441 -= 128;
			}
			if (arg13 > 9216 && arg13 < 15360) {
				local443 = local435 + 128;
			}
		}
		@Pc(484) int local484 = arg7.method4087();
		local168 = arg7.method4093();
		local174 = arg7.method4119();
		if (local438 > local484) {
			local484 = local438;
		}
		if (local174 < local441) {
			local174 = local441;
		}
		local178 = arg7.method4103();
		if (local168 > local443) {
			local168 = local443;
		}
		if (local162 < local178) {
			local178 = local162;
		}
		@Pc(519) Class3_Sub7_Sub21 local519 = null;
		if (arg2 != null) {
			@Pc(526) int local526 = arg2.anIntArray335[arg5];
			local519 = Static1.method1(local526 >> 16);
			arg5 = local526 & 0xFFFF;
		}
		if (local519 == null) {
			local63 = local63.method4094((byte) 3, local11, true);
			local63.method4076((local168 - local484) / 2, 128, (local178 - local174) / 2);
			local63.method4077((local168 + local484) / 2, 0, (local174 + local178) / 2);
		} else {
			local63 = local63.method4094((byte) 3, local11, true);
			local63.method4076((local168 - local484) / 2, 128, (local178 - local174) / 2);
			local63.method4077((local168 + local484) / 2, 0, (local174 + local178) / 2);
			local63.method4113(arg5, local519);
		}
		if (arg11 != 0) {
			local63.method4105(arg11);
		}
		if (arg8 != 0) {
			local63.method4111(arg8);
		}
		if (arg12 != 0) {
			local63.method4077(0, arg12, 0);
		}
		return local63;
	}
}
