import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static469 {

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "(IIIIIII)Z")
	public static boolean method7096(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(26) int local26 = arg1 + arg2;
		@Pc(30) int local30 = arg5 + arg4;
		@Pc(34) int local34 = arg0 + arg3;
		if (!Static343.method5000(local30, local30, arg2, local34, arg2, local34, arg3, local26, local30)) {
			return false;
		} else if (Static343.method5000(local30, local30, arg2, local34, local26, arg3, arg3, local26, local30)) {
			if (Static459.anInt8015 <= arg2) {
				if (!Static343.method5000(local30, local30, local26, local34, local26, arg3, local34, local26, arg4)) {
					return false;
				}
				if (!Static343.method5000(arg4, local30, local26, arg3, local26, arg3, local34, local26, arg4)) {
					return false;
				}
			} else if (!Static343.method5000(local30, local30, arg2, local34, arg2, arg3, local34, arg2, arg4)) {
				return false;
			} else if (!Static343.method5000(arg4, local30, arg2, arg3, arg2, arg3, local34, arg2, arg4)) {
				return false;
			}
			if (Static466.anInt8096 > arg3) {
				if (!Static343.method5000(local30, local30, arg2, arg3, arg2, arg3, arg3, local26, arg4)) {
					return false;
				}
				if (!Static343.method5000(arg4, local30, arg2, arg3, local26, arg3, arg3, local26, arg4)) {
					return false;
				}
			} else if (!Static343.method5000(local30, local30, arg2, local34, arg2, local34, local34, local26, arg4)) {
				return false;
			} else if (!Static343.method5000(arg4, local30, arg2, local34, local26, local34, local34, local26, arg4)) {
				return false;
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(FIIIIIIZI)[[I")
	public static int[][] method7107(@OriginalArg(0) float arg0) {
		@Pc(9) int[][] local9 = new int[256][64];
		@Pc(13) Class3_Sub6_Sub7 local13 = new Class3_Sub6_Sub7();
		local13.anInt2854 = 3;
		local13.anInt2856 = (int) ((float) 4096 * arg0);
		local13.aBoolean196 = false;
		local13.anInt2846 = 4;
		local13.anInt2853 = 4;
		local13.method8012();
		Static15.method152(256, 64);
		for (@Pc(41) int local41 = 0; local41 < 256; local41++) {
			local13.method2362(local9[local41], local41);
		}
		return local9;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIIZ)I")
	public static int method7123(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == arg1) {
			return arg2;
		}
		@Pc(12) int local12 = 128 - arg0;
		@Pc(27) int local27 = (arg2 & 0x7F) * local12 + (arg1 & 0x7F) * arg0 >> 7;
		@Pc(56) int local56 = (arg2 & 0x380) * local12 + (arg1 & 0x380) * arg0 >> 7;
		@Pc(70) int local70 = local12 * (arg2 & 0xFC00) + (arg1 & 0xFC00) * arg0 >> 7;
		return local70 & 0xFC00 | local56 & 0x380 | local27 & 0x7F;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(ILclient!r;ILclient!qg;IILclient!da;IBIIIII)Lclient!da;")
	public static Class52 method7148(@OriginalArg(0) int arg0, @OriginalArg(1) Class31 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class270 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class52 arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		if (arg6 == null) {
			return null;
		}
		@Pc(11) int local11 = 2055;
		if (arg3 != null) {
			local11 = arg3.method6008(-1, false, arg9) | 0x807;
			local11 &= 0xFFFFFDFF;
		}
		@Pc(47) long local47 = ((long) arg7 << 48) + ((long) arg0 << 32) + (long) ((arg2 << 24) + (arg11 << 16) + arg4);
		@Pc(49) Class342 local49 = Static589.aClass342_203;
		@Pc(57) Class52 local57;
		synchronized (Static589.aClass342_203) {
			local57 = (Class52) Static589.aClass342_203.method7684(local47);
		}
		if (local57 == null || arg1.method8050(local57.PA(), local11) != 0) {
			if (local57 != null) {
				local11 = arg1.method8039(local11, local57.PA());
			}
			@Pc(94) byte local94;
			if (arg4 == 1) {
				local94 = 9;
			} else if (arg4 == 2) {
				local94 = 12;
			} else if (arg4 == 3) {
				local94 = 15;
			} else if (arg4 == 4) {
				local94 = 18;
			} else {
				local94 = 21;
			}
			@Pc(134) int[] local134 = new int[] { 64, 96, 128 };
			@Pc(152) Class332 local152 = new Class332(local94 * 3 + 1, local94 * 3 * 2 + -local94, 0);
			@Pc(159) int local159 = local152.method7490(0, 0, 0);
			@Pc(163) int[][] local163 = new int[3][local94];
			@Pc(171) int local171;
			@Pc(175) int local175;
			@Pc(177) int local177;
			@Pc(201) int local201;
			for (@Pc(165) int local165 = 0; local165 < 3; local165++) {
				local171 = local134[local165];
				local175 = local134[local165];
				for (local177 = 0; local177 < local94; local177++) {
					@Pc(185) int local185 = (local177 << 14) / local94;
					@Pc(193) int local193 = Class3_Sub28.anIntArray232[local185] * local171 >> 14;
					local201 = local175 * Class3_Sub28.anIntArray231[local185] >> 14;
					local163[local165][local177] = local152.method7490(local193, 0, local201);
				}
			}
			for (local171 = 0; local171 < 3; local171++) {
				local175 = (local171 * 256 + 128) / 3;
				local177 = 256 - local175;
				@Pc(248) byte local248 = (byte) (arg2 * local175 + arg11 * local177 >> 8);
				@Pc(293) short local293 = (short) (((arg0 & 0x380) * local177 + (arg7 & 0x380) * local175 & 0x38000) + (local175 * (arg7 & 0xFC00) + local177 * (arg0 & 0xFC00) & 0xFC0000) + ((arg0 & 0x7F) * local177 + (arg7 & 0x7F) * local175 & 0x7F00) >> 8);
				for (local201 = 0; local201 < local94; local201++) {
					if (local171 == 0) {
						local152.method7495((byte) -1, (short) -1, (byte) 1, local293, local163[0][(local201 + 1) % local94], local159, local248, local163[0][local201]);
					} else {
						local152.method7495((byte) -1, (short) -1, (byte) 1, local293, local163[local171 - 1][(local201 + 1) % local94], local163[local171 - 1][local201], local248, local163[local171][(local201 + 1) % local94]);
						local152.method7495((byte) -1, (short) -1, (byte) 1, local293, local163[local171][(local201 + 1) % local94], local163[local171 - 1][local201], local248, local163[local171][local201]);
					}
				}
			}
			local57 = arg1.method8046(local152, local11, Static501.anInt8648, 64, 768);
			@Pc(416) Class342 local416 = Static589.aClass342_203;
			synchronized (Static589.aClass342_203) {
				Static589.aClass342_203.method7683(local57, local47);
			}
		}
		@Pc(432) int local432 = arg6.KA();
		@Pc(435) int local435 = arg6.l();
		@Pc(438) int local438 = arg6.OA();
		@Pc(441) int local441 = arg6.za();
		@Pc(443) Class3_Sub7_Sub15 local443 = null;
		if (arg3 != null) {
			@Pc(450) int local450 = arg3.anIntArray443[arg9];
			local443 = Static245.aClass155_1.method3818(local450 >> 16);
			arg9 = local450 & 0xFFFF;
		}
		if (local443 == null) {
			local57 = local57.method7618((byte) 3, local11, true);
			local57.R(local435 - local432 >> 1, 128, local441 - local438 >> 1);
			local57.oa(local432 + local435 >> 1, 0, local441 + local438 >> 1);
		} else {
			local57 = local57.method7618((byte) 3, local11, true);
			local57.R(local435 - local432 >> 1, 128, local441 - local438 >> 1);
			local57.oa(local432 + local435 >> 1, 0, local441 + local438 >> 1);
			local57.method7620(arg9, local443);
		}
		if (arg8 != 0) {
			local57.MA(arg8);
		}
		if (arg5 != 0) {
			local57.W(arg5);
		}
		if (arg10 != 0) {
			local57.oa(0, arg10, 0);
		}
		return local57;
	}
}
