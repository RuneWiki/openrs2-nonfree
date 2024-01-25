import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fn")
public final class Class4_Sub18 extends Class4 {

	@OriginalMember(owner = "client!fn", name = "l", descriptor = "[I")
	public int[] anIntArray143 = new int[1];

	@OriginalMember(owner = "client!fn", name = "n", descriptor = "[I")
	public int[] anIntArray144 = new int[] { -1 };

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Z[I[IIZ)J")
	private long method2746(@OriginalArg(0) boolean arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3) {
		@Pc(12) long[] local12 = Class157.aLongArray9;
		@Pc(14) long local14 = -1L;
		@Pc(30) long local30 = local14 >>> 8 ^ local12[(int) (((long) (arg3 >> 8) ^ local14) & 0xFFL)];
		local14 = local12[(int) ((local30 ^ (long) arg3) & 0xFFL)] ^ local30 >>> 8;
		for (@Pc(46) int local46 = 0; local46 < arg2.length; local46++) {
			local14 = local14 >>> 8 ^ local12[(int) ((local14 ^ (long) (arg2[local46] >> 24)) & 0xFFL)];
			local14 = local14 >>> 8 ^ local12[(int) (((long) (arg2[local46] >> 16) ^ local14) & 0xFFL)];
			local14 = local14 >>> 8 ^ local12[(int) (((long) (arg2[local46] >> 8) ^ local14) & 0xFFL)];
			local14 = local14 >>> 8 ^ local12[(int) (((long) arg2[local46] ^ local14) & 0xFFL)];
		}
		if (arg1 != null) {
			for (@Pc(131) int local131 = 0; local131 < 5; local131++) {
				local14 = local12[(int) (((long) arg1[local131] ^ local14) & 0xFFL)] ^ local14 >>> 8;
			}
		}
		return local14 >>> 8 ^ local12[(int) (((long) (arg0 ? 1 : 0) ^ local14) & 0xFFL)];
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIZILclient!jaa;Lclient!r;IILclient!wt;I)Lclient!da;")
	public Class57 method2748(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class166 arg4, @OriginalArg(5) Class44 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class365 arg7) {
		@Pc(7) Class57 local7 = null;
		@Pc(9) int local9 = 2048;
		@Pc(11) Class316 local11 = null;
		if (arg1 != -1) {
			local11 = Static462.aClass178_1.method4035(arg1);
		}
		@Pc(23) int[] local23 = this.anIntArray144;
		if (local11 != null && local11.anIntArray494 != null) {
			local23 = new int[local11.anIntArray494.length];
			for (@Pc(35) int local35 = 0; local35 < local11.anIntArray494.length; local35++) {
				@Pc(42) int local42 = local11.anIntArray494[local35];
				if (local42 >= 0 && this.anIntArray144.length > local42) {
					local23[local35] = this.anIntArray144[local42];
				} else {
					local23[local35] = -1;
				}
			}
		}
		@Pc(70) boolean local70 = false;
		@Pc(72) boolean local72 = false;
		@Pc(79) boolean local79 = false;
		@Pc(81) boolean local81 = false;
		@Pc(83) int local83 = -1;
		@Pc(85) int local85 = -1;
		@Pc(87) int local87 = 0;
		@Pc(89) Class4_Sub5_Sub2 local89 = null;
		@Pc(91) Class4_Sub5_Sub2 local91 = null;
		if (arg7 != null) {
			local9 = 2080;
			local83 = arg7.anIntArray551[arg3];
			@Pc(106) int local106 = local83 >>> 16;
			local89 = Static61.aClass48_1.method1013(local106);
			local83 &= 0xFFFF;
			if (local89 != null) {
				local72 = local89.method446(local83) | false;
				local70 = local89.method445(local83) | false;
				local81 = local89.method442(local83) | false;
				local79 = arg7.aBoolean723 | false;
			}
			if ((arg7.aBoolean721 || Static115.aBoolean196) && arg6 != -1 && arg6 < arg7.anIntArray551.length) {
				local85 = arg7.anIntArray551[arg6];
				local87 = arg7.anIntArray552[arg3];
				@Pc(175) int local175 = local85 >>> 16;
				local85 &= 0xFFFF;
				if (local175 == local106) {
					local91 = local89;
				} else {
					local91 = Static61.aClass48_1.method1013(local85 >>> 16);
				}
				if (local91 != null) {
					local72 |= local91.method446(local85);
					local70 |= local91.method445(local85);
					local81 |= local91.method442(local85);
				}
			}
			if (local72) {
				local9 = 2208;
			}
			if (local70) {
				local9 |= 0x100;
			}
			if (local79) {
				local9 |= 0x200;
			}
			if (local81) {
				local9 |= 0x400;
			}
		}
		@Pc(256) long local256 = this.method2746(arg2, arg4 == null ? null : arg4.anIntArray206, local23, arg1);
		if (Static577.aClass223_67 != null) {
			local7 = (Class57) Static577.aClass223_67.method5388(local256);
		}
		if (local7 == null || arg5.method5010(local7.PA(), local9) != 0) {
			if (local7 != null) {
				local9 = arg5.method5023(local9, local7.PA());
			}
			@Pc(285) int local285 = local9;
			@Pc(287) boolean local287 = false;
			for (@Pc(289) int local289 = 0; local289 < local23.length; local289++) {
				if (local23[local289] != -1 && !Static521.aClass273_2.method6712(local23[local289]).method5885(arg2)) {
					local287 = true;
				}
			}
			if (local287) {
				return null;
			}
			@Pc(326) Class191[] local326 = new Class191[local23.length];
			for (@Pc(328) int local328 = 0; local328 < local23.length; local328++) {
				if (local23[local328] != -1) {
					local326[local328] = Static521.aClass273_2.method6712(local23[local328]).method5902(arg2);
				}
			}
			@Pc(383) int local383;
			@Pc(390) int local390;
			if (local11 != null && local11.anIntArrayArray56 != null) {
				for (@Pc(363) int local363 = 0; local363 < local11.anIntArrayArray56.length; local363++) {
					if (local11.anIntArrayArray56[local363] != null && local326[local363] != null) {
						local383 = local11.anIntArrayArray56[local363][0];
						local390 = local11.anIntArrayArray56[local363][1];
						@Pc(397) int local397 = local11.anIntArrayArray56[local363][2];
						@Pc(404) int local404 = local11.anIntArrayArray56[local363][3];
						@Pc(411) int local411 = local11.anIntArrayArray56[local363][4];
						@Pc(418) int local418 = local11.anIntArrayArray56[local363][5];
						if (local404 != 0 || local411 != 0 || local418 != 0) {
							local326[local363].method4762(local404, local418, local411);
						}
						if (local383 != 0 || local390 != 0 || local397 != 0) {
							local326[local363].method4766(local397, local383, local390);
						}
					}
				}
			}
			if (arg4 != null) {
				local285 = local9 | 0x4000;
			}
			@Pc(478) Class191 local478 = new Class191(local326, local326.length);
			local7 = arg5.method5016(local478, local285, Static423.anInt7945, 64, 850);
			if (arg4 != null) {
				for (local383 = 0; local383 < 5; local383++) {
					for (local390 = 0; local390 < Static174.aShortArrayArrayArray1.length; local390++) {
						if (Static174.aShortArrayArrayArray1[local390][local383].length > arg4.anIntArray206[local383]) {
							local7.d(Static445.aShortArrayArray8[local390][local383], Static174.aShortArrayArrayArray1[local390][local383][arg4.anIntArray206[local383]]);
						}
					}
				}
			}
			if (Static577.aClass223_67 != null) {
				local7.SA(local9);
				Static577.aClass223_67.method5394(local7, local256);
			}
		}
		if (arg7 == null || local89 == null) {
			return local7;
		} else {
			@Pc(559) Class57 local559 = local7.method7912((byte) 1, local9, true);
			local559.method7925(arg7.aBoolean723, local85, 0, local83, local89, local87, arg0 - 1, local91);
			return local559;
		}
	}
}
