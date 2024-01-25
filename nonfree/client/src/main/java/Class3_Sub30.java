import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mk")
public final class Class3_Sub30 extends Class3 {

	@OriginalMember(owner = "client!mk", name = "p", descriptor = "[I")
	public int[] anIntArray360 = new int[] { -1 };

	@OriginalMember(owner = "client!mk", name = "t", descriptor = "[I")
	public int[] anIntArray362 = new int[1];

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(ZIILclient!ai;IILclient!qa;Lclient!hi;II)Lclient!c;")
	public Class31 method3810(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class8 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class75 arg5, @OriginalArg(7) Class96 arg6, @OriginalArg(9) int arg7) {
		@Pc(7) Class31 local7 = null;
		@Pc(9) int local9 = 2048;
		@Pc(11) Class137 local11 = null;
		if (arg7 != -1) {
			local11 = Static427.aClass237_1.method5479(arg7);
		}
		@Pc(22) int[] local22 = this.anIntArray360;
		if (local11 != null && local11.anIntArray316 != null) {
			local22 = new int[local11.anIntArray316.length];
			for (@Pc(34) int local34 = 0; local34 < local11.anIntArray316.length; local34++) {
				@Pc(41) int local41 = local11.anIntArray316[local34];
				if (local41 >= 0 && this.anIntArray360.length > local41) {
					local22[local34] = this.anIntArray360[local41];
				} else {
					local22[local34] = -1;
				}
			}
		}
		@Pc(77) boolean local77 = false;
		@Pc(85) boolean local85 = false;
		@Pc(87) boolean local87 = false;
		@Pc(89) boolean local89 = false;
		@Pc(91) int local91 = -1;
		@Pc(93) int local93 = -1;
		@Pc(95) int local95 = 0;
		@Pc(97) Class3_Sub3_Sub13 local97 = null;
		@Pc(99) Class3_Sub3_Sub13 local99 = null;
		if (arg6 != null) {
			local9 = 2080;
			local91 = arg6.anIntArray253[arg4];
			@Pc(114) int local114 = local91 >>> 16;
			local97 = Static196.aClass30_2.method934(local114);
			local91 &= 0xFFFF;
			if (local97 != null) {
				local85 = local97.method3084(local91) | false;
				local77 = local97.method3081(local91) | false;
				local89 = local97.method3082(local91) | false;
				local87 = arg6.aBoolean255 | false;
			}
			if ((arg6.aBoolean258 || Static426.aBoolean504) && arg2 != -1 && arg6.anIntArray253.length > arg2) {
				local95 = arg6.anIntArray254[arg4];
				local93 = arg6.anIntArray253[arg2];
				@Pc(183) int local183 = local93 >>> 16;
				local93 &= 0xFFFF;
				if (local183 == local114) {
					local99 = local97;
				} else {
					local99 = Static196.aClass30_2.method934(local93 >>> 16);
				}
				if (local99 != null) {
					local85 |= local99.method3084(local93);
					local77 |= local99.method3081(local93);
					local89 |= local99.method3082(local93);
				}
			}
			if (local85) {
				local9 = 2208;
			}
			if (local77) {
				local9 |= 0x100;
			}
			if (local87) {
				local9 |= 0x200;
			}
			if (local89) {
				local9 |= 0x400;
			}
		}
		@Pc(264) long local264 = this.method3813(local22, arg0, arg7, arg3 == null ? null : arg3.anIntArray26);
		if (Static58.aClass5_9 != null) {
			local7 = (Class31) Static58.aClass5_9.method104(local264);
		}
		if (local7 == null || arg5.method2610(local7.n(), local9) != 0) {
			if (local7 != null) {
				local9 = arg5.method2614(local9, local7.n());
			}
			@Pc(293) int local293 = local9;
			@Pc(295) boolean local295 = false;
			for (@Pc(297) int local297 = 0; local297 < local22.length; local297++) {
				if (local22[local297] != -1 && !Static89.aClass157_1.method3832(local22[local297]).method4664(arg0)) {
					local295 = true;
				}
			}
			if (local295) {
				return null;
			}
			@Pc(335) Class242[] local335 = new Class242[local22.length];
			for (@Pc(337) int local337 = 0; local337 < local22.length; local337++) {
				if (local22[local337] != -1) {
					local335[local337] = Static89.aClass157_1.method3832(local22[local337]).method4672(arg0);
				}
			}
			@Pc(396) int local396;
			if (local11 != null && local11.anIntArrayArray34 != null) {
				for (@Pc(376) int local376 = 0; local376 < local11.anIntArrayArray34.length; local376++) {
					if (local11.anIntArrayArray34[local376] != null && local335[local376] != null) {
						local396 = local11.anIntArrayArray34[local376][0];
						@Pc(403) int local403 = local11.anIntArrayArray34[local376][1];
						@Pc(410) int local410 = local11.anIntArrayArray34[local376][2];
						@Pc(417) int local417 = local11.anIntArrayArray34[local376][3];
						@Pc(424) int local424 = local11.anIntArrayArray34[local376][4];
						@Pc(431) int local431 = local11.anIntArrayArray34[local376][5];
						if (local417 != 0 || local424 != 0 || local431 != 0) {
							local335[local376].method5551(local417, local424, local431);
						}
						if (local396 != 0 || local403 != 0 || local410 != 0) {
							local335[local376].method5554(local403, local396, local410);
						}
					}
				}
			}
			@Pc(482) Class242 local482 = new Class242(local335, local335.length);
			if (arg3 != null) {
				local293 = local9 | 0x4000;
			}
			local7 = arg5.method2616(local482, local293, Static101.anInt2262, 64, 850);
			if (arg3 != null) {
				for (local396 = 0; local396 < 5; local396++) {
					if (arg3.anIntArray26[local396] < Static427.aShortArrayArray7[local396].length) {
						local7.N(Static97.aShortArray38[local396], Static427.aShortArrayArray7[local396][arg3.anIntArray26[local396]]);
					}
					if (arg3.anIntArray26[local396] < Static409.aShortArrayArray6[local396].length) {
						local7.N(Static33.aShortArray3[local396], Static409.aShortArrayArray6[local396][arg3.anIntArray26[local396]]);
					}
				}
			}
			if (Static58.aClass5_9 != null) {
				local7.u(local9);
				Static58.aClass5_9.method114(local264, local7);
			}
		}
		if (arg6 == null || local97 == null) {
			return local7;
		} else {
			@Pc(576) Class31 local576 = local7.method5710((byte) 1, local9, true);
			local576.method5717(local91, local97, local95, arg1 - 1, 0, local93, local99, arg6.aBoolean255);
			return local576;
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "([IZII[I)J")
	private long method3813(@OriginalArg(0) int[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[] arg3) {
		@Pc(23) long[] local23 = Class64_Sub1.aLongArray1;
		@Pc(25) long local25 = -1L;
		@Pc(41) long local41 = local25 >>> 8 ^ local23[(int) (((long) (arg2 >> 8) ^ local25) & 0xFFL)];
		local25 = local23[(int) ((local41 ^ (long) arg2) & 0xFFL)] ^ local41 >>> 8;
		for (@Pc(57) int local57 = 0; local57 < arg0.length; local57++) {
			local25 = local25 >>> 8 ^ local23[(int) ((local25 ^ (long) (arg0[local57] >> 24)) & 0xFFL)];
			local25 = local25 >>> 8 ^ local23[(int) ((local25 ^ (long) (arg0[local57] >> 16)) & 0xFFL)];
			local25 = local23[(int) (((long) (arg0[local57] >> 8) ^ local25) & 0xFFL)] ^ local25 >>> 8;
			local25 = local23[(int) (((long) arg0[local57] ^ local25) & 0xFFL)] ^ local25 >>> 8;
		}
		if (arg3 != null) {
			for (@Pc(142) int local142 = 0; local142 < 5; local142++) {
				local25 = local25 >>> 8 ^ local23[(int) ((local25 ^ (long) arg3[local142]) & 0xFFL)];
			}
		}
		return local23[(int) (((long) (arg1 ? 1 : 0) ^ local25) & 0xFFL)] ^ local25 >>> 8;
	}
}
