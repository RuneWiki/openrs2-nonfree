import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "I")
	public static int anInt2314;

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
	public static int anInt2316;

	@OriginalMember(owner = "client!kf", name = "e", descriptor = "Lclient!dp;")
	public static Class51 aClass51_3;

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIILclient!nb;IILclient!gn;ILclient!wm;IZIII)Lclient!gn;", line = 3)
	public static Class31 method2342(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class157 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class31 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Class19 arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		if (arg7 == null) {
			return null;
		}
		@Pc(11) int local11 = 1031;
		if (arg4 != null) {
			local11 = arg4.method3991(arg0, false, -1) | 0x407;
			local11 &= 0xFFFFFDFF;
		}
		@Pc(48) long local48 = ((long) arg10 << 32) + ((long) ((arg1 << 24) + (arg2 << 16) + arg5) + ((long) arg6 << 48));
		@Pc(50) Class98 local50 = Class72.aClass98_10;
		@Pc(58) Class31 local58;
		synchronized (Class72.aClass98_10) {
			local58 = (Class31) Class72.aClass98_10.method2614(local48);
		}
		@Pc(157) int local157;
		@Pc(163) int local163;
		@Pc(169) int local169;
		@Pc(173) int local173;
		if (local58 == null || arg9.method2865(local58.method3828(), local11) != 0) {
			if (local58 != null) {
				local11 = arg9.method2808(local11, local58.method3828());
			}
			@Pc(93) byte local93;
			if (arg5 == 1) {
				local93 = 9;
			} else if (arg5 == 2) {
				local93 = 12;
			} else if (arg5 == 3) {
				local93 = 15;
			} else if (arg5 == 4) {
				local93 = 18;
			} else {
				local93 = 21;
			}
			@Pc(132) int[] local132 = new int[] { 64, 96, 128 };
			@Pc(150) Class185 local150 = new Class185(local93 * 3 + 1, -local93 + local93 * 3 * 2, 0);
			local157 = local150.method4666(0, 0, 0);
			@Pc(161) int[][] local161 = new int[3][local93];
			@Pc(175) int local175;
			@Pc(199) int local199;
			for (local163 = 0; local163 < 3; local163++) {
				local169 = local132[local163];
				local173 = local132[local163];
				for (local175 = 0; local175 < local93; local175++) {
					@Pc(183) int local183 = (local175 << 14) / local93;
					@Pc(191) int local191 = Class19.anIntArray178[local183] * local169 >> 15;
					local199 = local173 * Class19.anIntArray177[local183] >> 15;
					local161[local163][local175] = local150.method4666(0, local191, local199);
				}
			}
			for (local169 = 0; local169 < 3; local169++) {
				local173 = (local169 * 256 + 128) / 3;
				local175 = 256 - local173;
				@Pc(250) byte local250 = (byte) (arg2 * local175 + local173 * arg1 >> 8);
				@Pc(295) short local295 = (short) (((arg10 & 0x380) * local175 + (arg6 & 0x380) * local173 & 0x38000) + ((arg10 & 0xFC00) * local175 + (arg6 & 0xFC00) * local173 & 0xFC0000) + (local175 * (arg10 & 0x7F) + (arg6 & 0x7F) * local173 & 0x7F00) >> 8);
				for (local199 = 0; local199 < local93; local199++) {
					if (local169 == 0) {
						local150.method4660(local295, local157, local250, local161[0][(local199 + 1) % local93], (byte) 1, local161[0][local199], (short) -1, (byte) -1);
					} else {
						local150.method4660(local295, local161[local169 - 1][local199], local250, local161[local169 - 1][(local199 + 1) % local93], (byte) 1, local161[local169][(local199 + 1) % local93], (short) -1, (byte) -1);
						local150.method4660(local295, local161[local169 - 1][local199], local250, local161[local169][(local199 + 1) % local93], (byte) 1, local161[local169][local199], (short) -1, (byte) -1);
					}
				}
			}
			local58 = arg9.method2866(local150, local11, Static186.anInt5744, 64, 768);
			@Pc(411) Class98 local411 = Class72.aClass98_10;
			synchronized (Class72.aClass98_10) {
				Class72.aClass98_10.method2626(local48, local58);
			}
		}
		@Pc(430) int local430 = arg5 * 64 - 1;
		@Pc(433) int local433 = -local430;
		@Pc(436) int local436 = -local430;
		@Pc(438) int local438 = local430;
		local157 = local430;
		if (arg11) {
			if (arg8 > 1024 && arg8 < 7168) {
				local433 -= 128;
			}
			if (arg8 > 5120 && arg8 < 11264) {
				local157 = local430 + 128;
			}
			if (arg8 > 13312 || arg8 < 3072) {
				local436 -= 128;
			}
			if (arg8 > 9216 && arg8 < 15360) {
				local438 = local430 + 128;
			}
		}
		@Pc(477) int local477 = arg7.method3807();
		local163 = arg7.method3823();
		local169 = arg7.method3813();
		if (local436 > local169) {
			local169 = local436;
		}
		if (local477 < local433) {
			local477 = local433;
		}
		if (local163 > local438) {
			local163 = local438;
		}
		local173 = arg7.method3833();
		if (local157 < local173) {
			local173 = local157;
		}
		@Pc(521) Class2_Sub2_Sub13 local521 = null;
		if (arg4 != null) {
			@Pc(528) int local528 = arg4.anIntArray262[arg0];
			local521 = Static37.aClass85_1.method2370(local528 >> 16);
			arg0 = local528 & 0xFFFF;
		}
		if (local521 == null) {
			local58 = local58.method3801((byte) 3, local11, true);
			local58.method3843((local163 - local477) / 2, 128, (local173 - local169) / 2);
			local58.method3814((local477 + local163) / 2, 0, (local173 + local169) / 2);
		} else {
			local58 = local58.method3801((byte) 3, local11, true);
			local58.method3843((local163 - local477) / 2, 128, (local173 - local169) / 2);
			local58.method3814((local477 + local163) / 2, 0, (local173 + local169) / 2);
			local58.method3819(local521, arg0);
		}
		if (arg13 != 0) {
			local58.method3825(arg13);
		}
		if (arg3 != 0) {
			local58.method3816(arg3);
		}
		if (arg12 != 0) {
			local58.method3814(0, arg12, 0);
		}
		return local58;
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(I)V", line = 229)
	public static void method2344() {
		if (Static280.aClass221_2 != null) {
			Static280.aClass221_2.method6327();
		}
		if (Static177.aClass221_1 != null) {
			Static177.aClass221_1.method6327();
		}
		Static80.method1911(Static203.aClass177_Sub1_2.aBoolean352);
		Static280.aClass221_2 = Static355.method6348(0, Static305.aClass152_5, Static21.aCanvas1, 22050);
		Static280.aClass221_2.method6331(Static359.aClass2_Sub12_Sub3_3);
		Static177.aClass221_1 = Static355.method6348(1, Static305.aClass152_5, Static21.aCanvas1, 2048);
		Static177.aClass221_1.method6331(Static211.aClass2_Sub12_Sub2_2);
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(III)Ljava/lang/String;", line = 252)
	public static String method2345(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0 - arg1;
		if (local8 < -9) {
			return "<col=ff0000>";
		} else if (local8 < -6) {
			return "<col=ff3000>";
		} else if (local8 < -3) {
			return "<col=ff7000>";
		} else if (local8 < 0) {
			return "<col=ffb000>";
		} else if (local8 > 9) {
			return "<col=00ff00>";
		} else if (local8 > 6) {
			return "<col=40ff00>";
		} else if (local8 > 3) {
			return "<col=80ff00>";
		} else if (local8 > 0) {
			return "<col=c0ff00>";
		} else {
			return "<col=ffff00>";
		}
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(III)I", line = 300)
	public static int method2346(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Class250.anIntArray495[arg1 & 0x3] : Class146.anIntArray227[arg1 & 0x3];
	}
}
