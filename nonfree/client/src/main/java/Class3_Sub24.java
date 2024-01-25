import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!g")
public final class Class3_Sub24 extends Class3 {

	@OriginalMember(owner = "client!g", name = "o", descriptor = "[I")
	public int[] anIntArray306 = new int[1];

	@OriginalMember(owner = "client!g", name = "r", descriptor = "[I")
	public int[] anIntArray307 = new int[] { -1 };

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IIZIILclient!vq;ZLclient!bca;Lclient!ha;I)Lclient!ka;")
	public Class95 method3232(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) Class372 arg3, @OriginalArg(6) boolean arg4, @OriginalArg(7) Class30 arg5, @OriginalArg(8) Class13 arg6, @OriginalArg(9) int arg7) {
		@Pc(7) Class95 local7 = null;
		@Pc(9) int local9 = 2048;
		@Pc(11) Class359 local11 = null;
		if (arg1 != -1) {
			local11 = Static282.aClass52_1.method1313(arg1);
		}
		@Pc(23) int[] local23 = this.anIntArray307;
		if (local11 != null && local11.anIntArray865 != null) {
			local23 = new int[local11.anIntArray865.length];
			for (@Pc(35) int local35 = 0; local35 < local11.anIntArray865.length; local35++) {
				@Pc(42) int local42 = local11.anIntArray865[local35];
				if (local42 >= 0 && this.anIntArray307.length > local42) {
					local23[local35] = this.anIntArray307[local42];
				} else {
					local23[local35] = -1;
				}
			}
		}
		@Pc(77) boolean local77 = false;
		@Pc(79) boolean local79 = false;
		@Pc(81) boolean local81 = false;
		@Pc(83) boolean local83 = false;
		@Pc(85) int local85 = -1;
		@Pc(87) int local87 = -1;
		@Pc(89) int local89 = 0;
		@Pc(91) Class3_Sub11_Sub1 local91 = null;
		@Pc(93) Class3_Sub11_Sub1 local93 = null;
		if (arg3 != null) {
			local85 = arg3.anIntArray901[arg7];
			local9 = 2080;
			@Pc(108) int local108 = local85 >>> 16;
			local91 = Static243.aClass343_3.method8352(local108);
			local85 &= 0xFFFF;
			if (local91 != null) {
				local79 = local91.method1177(local85) | false;
				local77 = local91.method1178(local85) | false;
				local83 = local91.method1176(local85) | false;
				local81 = arg3.aBoolean775 | false;
			}
			if ((arg3.aBoolean774 || Static100.aBoolean144) && arg2 != -1 && arg2 < arg3.anIntArray901.length) {
				local87 = arg3.anIntArray901[arg2];
				local89 = arg3.anIntArray900[arg7];
				@Pc(177) int local177 = local87 >>> 16;
				local87 &= 0xFFFF;
				if (local108 == local177) {
					local93 = local91;
				} else {
					local93 = Static243.aClass343_3.method8352(local87 >>> 16);
				}
				if (local93 != null) {
					local79 |= local93.method1177(local87);
					local77 |= local93.method1178(local87);
					local83 |= local93.method1176(local87);
				}
			}
			if (local79) {
				local9 = 2208;
			}
			if (local77) {
				local9 |= 0x100;
			}
			if (local81) {
				local9 |= 0x200;
			}
			if (local83) {
				local9 |= 0x400;
			}
		}
		@Pc(258) long local258 = this.method3233(arg5 == null ? null : arg5.anIntArray69, arg4, arg1, local23);
		if (Static208.aClass165_26 != null) {
			local7 = (Class95) Static208.aClass165_26.method4389(local258);
		}
		if (local7 == null || arg6.method8495(local7.ua(), local9) != 0) {
			if (local7 != null) {
				local9 = arg6.method8478(local9, local7.ua());
			}
			@Pc(287) int local287 = local9;
			@Pc(289) boolean local289 = false;
			for (@Pc(291) int local291 = 0; local291 < local23.length; local291++) {
				if (local23[local291] != -1 && !Static170.aClass370_1.method8900(local23[local291]).method9006(arg4, (Class7) null)) {
					local289 = true;
				}
			}
			if (local289) {
				return null;
			}
			@Pc(325) Class117[] local325 = new Class117[local23.length];
			for (@Pc(327) int local327 = 0; local327 < local23.length; local327++) {
				if (local23[local327] != -1) {
					local325[local327] = Static170.aClass370_1.method8900(local23[local327]).method8992((Class7) null, arg4);
				}
			}
			@Pc(384) int local384;
			@Pc(391) int local391;
			if (local11 != null && local11.anIntArrayArray62 != null) {
				for (@Pc(364) int local364 = 0; local364 < local11.anIntArrayArray62.length; local364++) {
					if (local11.anIntArrayArray62[local364] != null && local325[local364] != null) {
						local384 = local11.anIntArrayArray62[local364][0];
						local391 = local11.anIntArrayArray62[local364][1];
						@Pc(398) int local398 = local11.anIntArrayArray62[local364][2];
						@Pc(405) int local405 = local11.anIntArrayArray62[local364][3];
						@Pc(412) int local412 = local11.anIntArrayArray62[local364][4];
						@Pc(419) int local419 = local11.anIntArrayArray62[local364][5];
						if (local405 != 0 || local412 != 0 || local419 != 0) {
							local325[local364].method3483(local412, local405, local419);
						}
						if (local384 != 0 || local391 != 0 || local398 != 0) {
							local325[local364].method3497(local398, local384, local391);
						}
					}
				}
			}
			@Pc(469) Class117 local469 = new Class117(local325, local325.length);
			if (arg5 != null) {
				local287 = local9 | 0x4000;
			}
			local7 = arg6.method8489(local469, local287, Static604.anInt9723, 64, 850);
			if (arg5 != null) {
				for (local384 = 0; local384 < 5; local384++) {
					for (local391 = 0; local391 < Static58.aShortArrayArrayArray1.length; local391++) {
						if (arg5.anIntArray69[local384] < Static58.aShortArrayArrayArray1[local391][local384].length) {
							local7.ia(Static64.aShortArrayArray2[local391][local384], Static58.aShortArrayArrayArray1[local391][local384][arg5.anIntArray69[local384]]);
						}
					}
				}
			}
			if (Static208.aClass165_26 != null) {
				local7.s(local9);
				Static208.aClass165_26.method4392(local7, local258);
			}
		}
		if (arg3 == null || local91 == null) {
			return local7;
		} else {
			@Pc(558) Class95 local558 = local7.method5664((byte) 1, local9, true);
			local558.method5670(0, local85, arg0 - 1, arg3.aBoolean775, local91, local87, local89, local93);
			return local558;
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "([IZII[I)J")
	private long method3233(@OriginalArg(0) int[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		@Pc(7) long[] local7 = Class2.aLongArray28;
		@Pc(14) long local14 = -1L;
		@Pc(30) long local30 = local14 >>> 8 ^ local7[(int) ((local14 ^ (long) (arg2 >> 8)) & 0xFFL)];
		local14 = local7[(int) ((local30 ^ (long) arg2) & 0xFFL)] ^ local30 >>> 8;
		for (@Pc(46) int local46 = 0; local46 < arg3.length; local46++) {
			local14 = local14 >>> 8 ^ local7[(int) (((long) (arg3[local46] >> 24) ^ local14) & 0xFFL)];
			local14 = local14 >>> 8 ^ local7[(int) ((local14 ^ (long) (arg3[local46] >> 16)) & 0xFFL)];
			local14 = local7[(int) ((local14 ^ (long) (arg3[local46] >> 8)) & 0xFFL)] ^ local14 >>> 8;
			local14 = local14 >>> 8 ^ local7[(int) ((local14 ^ (long) arg3[local46]) & 0xFFL)];
		}
		if (arg0 != null) {
			for (@Pc(127) int local127 = 0; local127 < 5; local127++) {
				local14 = local14 >>> 8 ^ local7[(int) (((long) arg0[local127] ^ local14) & 0xFFL)];
			}
		}
		return local7[(int) (((long) (arg1 ? 1 : 0) ^ local14) & 0xFFL)] ^ local14 >>> 8;
	}
}
