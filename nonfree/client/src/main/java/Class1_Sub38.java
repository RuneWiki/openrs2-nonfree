import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ui")
public final class Class1_Sub38 extends Class1 {

	@OriginalMember(owner = "client!ui", name = "t", descriptor = "[I")
	public int[] anIntArray762 = new int[1];

	@OriginalMember(owner = "client!ui", name = "x", descriptor = "[I")
	public int[] anIntArray763 = new int[] { -1 };

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Z[I[IIB)J")
	private long method5324(@OriginalArg(0) boolean arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3) {
		@Pc(7) long[] local7 = Class42.aLongArray5;
		@Pc(14) long local14 = -1L;
		@Pc(30) long local30 = local7[(int) (((long) (arg3 >> 8) ^ local14) & 0xFFL)] ^ local14 >>> 8;
		local14 = local7[(int) ((local30 ^ (long) arg3) & 0xFFL)] ^ local30 >>> 8;
		for (@Pc(46) int local46 = 0; local46 < arg1.length; local46++) {
			local14 = local14 >>> 8 ^ local7[(int) (((long) (arg1[local46] >> 24) ^ local14) & 0xFFL)];
			local14 = local14 >>> 8 ^ local7[(int) (((long) (arg1[local46] >> 16) ^ local14) & 0xFFL)];
			local14 = local7[(int) (((long) (arg1[local46] >> 8) ^ local14) & 0xFFL)] ^ local14 >>> 8;
			local14 = local14 >>> 8 ^ local7[(int) ((local14 ^ (long) arg1[local46]) & 0xFFL)];
		}
		if (arg2 != null) {
			for (@Pc(127) int local127 = 0; local127 < 5; local127++) {
				local14 = local7[(int) (((long) arg2[local127] ^ local14) & 0xFFL)] ^ local14 >>> 8;
			}
		}
		return local14 >>> 8 ^ local7[(int) ((local14 ^ (long) (arg0 ? 1 : 0)) & 0xFFL)];
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IILclient!lo;IIBLclient!aa;IZLclient!cj;)Lclient!hc;")
	public Class78 method5325(@OriginalArg(1) int arg0, @OriginalArg(2) Class121 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) Class2 arg4, @OriginalArg(7) int arg5, @OriginalArg(8) boolean arg6, @OriginalArg(9) Class31 arg7) {
		@Pc(7) Class78 local7 = null;
		@Pc(9) int local9 = 1024;
		@Pc(11) Class45 local11 = null;
		if (arg3 != -1) {
			local11 = Static126.method2408(arg3);
		}
		@Pc(22) int[] local22 = this.anIntArray763;
		if (local11 != null && local11.anIntArray169 != null) {
			local22 = new int[local11.anIntArray169.length];
			for (@Pc(34) int local34 = 0; local34 < local11.anIntArray169.length; local34++) {
				@Pc(41) int local41 = local11.anIntArray169[local34];
				if (local41 >= 0 && local41 < this.anIntArray763.length) {
					local22[local34] = this.anIntArray763[local41];
				} else {
					local22[local34] = -1;
				}
			}
		}
		@Pc(81) boolean local81 = false;
		@Pc(83) boolean local83 = false;
		@Pc(85) boolean local85 = false;
		@Pc(87) int local87 = -1;
		@Pc(89) int local89 = -1;
		@Pc(91) int local91 = 0;
		@Pc(93) Class1_Sub1_Sub3 local93 = null;
		@Pc(95) Class1_Sub1_Sub3 local95 = null;
		if (arg1 != null) {
			local9 = 1056;
			local87 = arg1.anIntArray446[arg5];
			@Pc(110) int local110 = local87 >>> 16;
			local93 = Static210.method3849(local110);
			local87 &= 0xFFFF;
			if (local93 != null) {
				local83 = local93.method818(local87) | false;
				local81 = local93.method824(local87) | false;
				local85 = arg1.aBoolean318 | false;
			}
			if ((arg1.aBoolean321 || Static334.aBoolean559) && arg0 != -1 && arg0 < arg1.anIntArray446.length) {
				local89 = arg1.anIntArray446[arg0];
				local91 = arg1.anIntArray444[arg5];
				@Pc(169) int local169 = local89 >>> 16;
				local89 &= 0xFFFF;
				if (local169 == local110) {
					local95 = local93;
				} else {
					local95 = Static210.method3849(local89 >>> 16);
				}
				if (local95 != null) {
					local83 |= local95.method818(local89);
					local81 |= local95.method824(local89);
				}
			}
			if (local83) {
				local9 = 1184;
			}
			if (local81) {
				local9 |= 0x100;
			}
			if (local85) {
				local9 |= 0x200;
			}
		}
		@Pc(234) long local234 = this.method5324(arg6, local22, arg7 == null ? null : arg7.anIntArray118, arg3);
		if (Static192.aClass140_176 != null) {
			local7 = (Class78) Static192.aClass140_176.method3816(local234);
		}
		if (local7 == null || arg4.method3247(local7.method4398(), local9) != 0) {
			if (local7 != null) {
				local9 = arg4.method3292(local9, local7.method4398());
			}
			@Pc(260) int local260 = local9;
			@Pc(262) boolean local262 = false;
			for (@Pc(264) int local264 = 0; local264 < local22.length; local264++) {
				if (local22[local264] != -1 && !Static241.method4285(local22[local264]).method1738(arg6)) {
					local262 = true;
				}
			}
			if (local262) {
				return null;
			}
			@Pc(301) Class12[] local301 = new Class12[local22.length];
			for (@Pc(303) int local303 = 0; local303 < local22.length; local303++) {
				if (local22[local303] != -1) {
					local301[local303] = Static241.method4285(local22[local303]).method1727(arg6);
				}
			}
			@Pc(354) int local354;
			if (local11 != null && local11.anIntArrayArray9 != null) {
				for (@Pc(334) int local334 = 0; local334 < local11.anIntArrayArray9.length; local334++) {
					if (local11.anIntArrayArray9[local334] != null && local301[local334] != null) {
						local354 = local11.anIntArrayArray9[local334][0];
						@Pc(361) int local361 = local11.anIntArrayArray9[local334][1];
						@Pc(368) int local368 = local11.anIntArrayArray9[local334][2];
						@Pc(375) int local375 = local11.anIntArrayArray9[local334][3];
						@Pc(382) int local382 = local11.anIntArrayArray9[local334][4];
						@Pc(389) int local389 = local11.anIntArrayArray9[local334][5];
						if (local375 != 0 || local382 != 0 || local389 != 0) {
							local301[local334].method379(local389, local382, local375);
						}
						if (local354 != 0 || local361 != 0 || local368 != 0) {
							local301[local334].method371(local361, local354, local368);
						}
					}
				}
			}
			if (arg7 != null) {
				local260 = local9 | 0x2000;
			}
			@Pc(446) Class12 local446 = new Class12(local301, local301.length);
			local7 = arg4.method3251(local446, local260, Static16.anInt320, 64, 850);
			if (arg7 != null) {
				for (local354 = 0; local354 < 5; local354++) {
					if (arg7.anIntArray118[local354] < Static172.aShortArrayArray8[local354].length) {
						local7.method4374(Static204.aShortArray56[local354], Static172.aShortArrayArray8[local354][arg7.anIntArray118[local354]]);
					}
					if (arg7.anIntArray118[local354] < Static86.aShortArrayArray3[local354].length) {
						local7.method4374(Static314.aShortArray95[local354], Static86.aShortArrayArray3[local354][arg7.anIntArray118[local354]]);
					}
				}
			}
			if (Static192.aClass140_176 != null) {
				local7.method4373(local9);
				Static192.aClass140_176.method3817(local234, local7);
			}
		}
		if (arg1 == null || local93 == null) {
			return local7;
		} else {
			@Pc(536) Class78 local536 = local7.method4394((byte) 1, local9, true);
			local536.method4382(local89, local87, local91, arg1.aBoolean318, local93, 0, arg2 - 1, local95);
			return local536;
		}
	}
}
