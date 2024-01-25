import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static236 {

	@OriginalMember(owner = "client!mb", name = "l", descriptor = "Lclient!ga;")
	public static Interface4 anInterface4_4;

	@OriginalMember(owner = "client!mb", name = "h", descriptor = "Lclient!nj;")
	public static final Class171 aClass171_38 = new Class171(8);

	@OriginalMember(owner = "client!mb", name = "s", descriptor = "[I")
	public static int[] anIntArray382 = new int[2];

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IB)Z")
	public static boolean method3659(@OriginalArg(0) int arg0) {
		return arg0 >= 4 && arg0 <= 8;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILclient!vf;ILclient!t;ILclient!ya;IIZIIIIII)Lclient!t;")
	public static Class91 method3661(@OriginalArg(0) int arg0, @OriginalArg(1) Class250 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class91 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class49 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		if (arg3 == null) {
			return null;
		}
		@Pc(16) int local16 = 2055;
		if (arg1 != null) {
			local16 = arg1.method5547(false, -1, arg4) | 0x807;
			local16 &= 0xFFFFFDFF;
		}
		@Pc(53) long local53 = ((long) arg6 << 48) + ((long) arg0 << 32) + (long) ((arg7 << 24) + (arg12 - -(arg2 << 16)));
		@Pc(55) Class171 local55 = Static387.aClass171_52;
		@Pc(63) Class91 local63;
		synchronized (Static387.aClass171_52) {
			local63 = (Class91) Static387.aClass171_52.method3941(local53);
		}
		@Pc(160) int local160;
		@Pc(166) int local166;
		@Pc(172) int local172;
		@Pc(176) int local176;
		if (local63 == null || arg5.method4429(local63.P(), local16) != 0) {
			if (local63 != null) {
				local16 = arg5.method4451(local16, local63.P());
			}
			@Pc(95) byte local95;
			if (arg12 == 1) {
				local95 = 9;
			} else if (arg12 == 2) {
				local95 = 12;
			} else if (arg12 == 3) {
				local95 = 15;
			} else if (arg12 == 4) {
				local95 = 18;
			} else {
				local95 = 21;
			}
			@Pc(134) int[] local134 = new int[] { 64, 96, 128 };
			@Pc(153) Class146 local153 = new Class146(local95 * 3 + 1, -local95 + local95 * 2 * 3, 0);
			local160 = local153.method3320(0, 0, 0);
			@Pc(164) int[][] local164 = new int[3][local95];
			@Pc(178) int local178;
			@Pc(202) int local202;
			for (local166 = 0; local166 < 3; local166++) {
				local172 = local134[local166];
				local176 = local134[local166];
				for (local178 = 0; local178 < local95; local178++) {
					@Pc(186) int local186 = (local178 << 14) / local95;
					@Pc(194) int local194 = local172 * Class162.anIntArray388[local186] >> 15;
					local202 = Class162.anIntArray387[local186] * local176 >> 15;
					local164[local166][local178] = local153.method3320(local194, local202, 0);
				}
			}
			for (local172 = 0; local172 < 3; local172++) {
				local176 = (local172 * 256 + 128) / 3;
				local178 = 256 - local176;
				@Pc(253) byte local253 = (byte) (local178 * arg2 + local176 * arg7 >> 8);
				@Pc(298) short local298 = (short) (((arg6 & 0x7F) * local176 + (arg0 & 0x7F) * local178 & 0x7F00) + ((arg6 & 0xFC00) * local176 + local178 * (arg0 & 0xFC00) & 0xFC0000) + ((arg0 & 0x380) * local178 + local176 * (arg6 & 0x380) & 0x38000) >> 8);
				for (local202 = 0; local202 < local95; local202++) {
					if (local172 == 0) {
						local153.method3319(local164[0][local202], local298, local253, local164[0][(local202 + 1) % local95], (short) -1, (byte) 1, local160, (byte) -1);
					} else {
						local153.method3319(local164[local172][(local202 + 1) % local95], local298, local253, local164[local172 - 1][(local202 + 1) % local95], (short) -1, (byte) 1, local164[local172 - 1][local202], (byte) -1);
						local153.method3319(local164[local172][local202], local298, local253, local164[local172][(local202 + 1) % local95], (short) -1, (byte) 1, local164[local172 - 1][local202], (byte) -1);
					}
				}
			}
			local63 = arg5.method4414(local153, local16, Static41.anInt763, 64, 768);
			@Pc(421) Class171 local421 = Static387.aClass171_52;
			synchronized (Static387.aClass171_52) {
				Static387.aClass171_52.method3940(local53, local63);
			}
		}
		@Pc(440) int local440 = (arg12 << 6) - 1;
		@Pc(443) int local443 = -local440;
		@Pc(446) int local446 = -local440;
		@Pc(448) int local448 = local440;
		local160 = local440;
		if (arg8) {
			if (arg11 > 1024 && arg11 < 7168) {
				local443 -= 128;
			}
			if (arg11 > 9216 && arg11 < 15360) {
				local448 = local440 + 128;
			}
			if (arg11 > 5120 && arg11 < 11264) {
				local160 = local440 + 128;
			}
			if (arg11 > 13312 || arg11 < 3072) {
				local446 -= 128;
			}
		}
		@Pc(493) int local493 = arg3.HA();
		local166 = arg3.NA();
		local172 = arg3.PA();
		if (local166 > local448) {
			local166 = local448;
		}
		local176 = arg3.m();
		if (local446 > local172) {
			local172 = local446;
		}
		if (local493 < local443) {
			local493 = local443;
		}
		if (local160 < local176) {
			local176 = local160;
		}
		@Pc(536) Class2_Sub5_Sub3 local536 = null;
		if (arg1 != null) {
			@Pc(543) int local543 = arg1.anIntArray592[arg4];
			local536 = Static338.aClass12_2.method257(local543 >> 16);
			arg4 = local543 & 0xFFFF;
		}
		if (local536 == null) {
			local63 = local63.method3285((byte) 3, local16, true);
			local63.H(local166 - local493 >> 1, 128, local176 - local172 >> 1);
			local63.JA(local493 + local166 >> 1, 0, local172 + local176 >> 1);
		} else {
			local63 = local63.method3285((byte) 3, local16, true);
			local63.H(local166 - local493 >> 1, 128, local176 - local172 >> 1);
			local63.JA(local493 + local166 >> 1, 0, local176 + local172 >> 1);
			local63.method3279(arg4, local536);
		}
		if (arg10 != 0) {
			local63.Z(arg10);
		}
		if (arg9 != 0) {
			local63.R(arg9);
		}
		if (arg13 != 0) {
			local63.JA(0, arg13, 0);
		}
		return local63;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(III)I")
	public static int method3662(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(41) int local41 = Static182.method2927(4, arg1 + 91923, arg0 - -45365) + (Static182.method2927(2, arg1 + 37821, arg0 + 10294) - 128 >> 1) + (Static182.method2927(1, arg1, arg0) - 128 >> 2) - 128;
		local41 = (int) ((double) local41 * 0.3D) + 35;
		if (local41 < 10) {
			local41 = 10;
		} else if (local41 > 60) {
			local41 = 60;
		}
		return local41;
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)V")
	public static void method3663() {
		Static84.aClass2_Sub22_2 = new Class2_Sub22(Static76.aClass209_41.method4562(Static388.anInt6533), "", Static54.anInt1162, 1002, -1, (long) 0, 0, 0, true, false);
	}
}
