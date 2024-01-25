import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ng")
public final class Class2_Sub42 extends Class2 {

	@OriginalMember(owner = "client!ng", name = "q", descriptor = "[I")
	public int[] anIntArray350 = new int[] { -1 };

	@OriginalMember(owner = "client!ng", name = "s", descriptor = "[I")
	public int[] anIntArray351 = new int[1];

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(I[IZI[I)J")
	private long method6582(@OriginalArg(1) int[] arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		@Pc(7) long[] local7 = Class2_Sub1_Sub16.aLongArray16;
		@Pc(9) long local9 = -1L;
		@Pc(25) long local25 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) (arg2 >> 8)) & 0xFFL)];
		local9 = local7[(int) (((long) arg2 ^ local25) & 0xFFL)] ^ local25 >>> 8;
		for (@Pc(41) int local41 = 0; local41 < arg0.length; local41++) {
			local9 = local7[(int) ((local9 ^ (long) (arg0[local41] >> 24)) & 0xFFL)] ^ local9 >>> 8;
			local9 = local9 >>> 8 ^ local7[(int) (((long) (arg0[local41] >> 16) ^ local9) & 0xFFL)];
			local9 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) (arg0[local41] >> 8)) & 0xFFL)];
			local9 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) arg0[local41]) & 0xFFL)];
		}
		if (arg3 != null) {
			for (@Pc(122) int local122 = 0; local122 < 5; local122++) {
				local9 = local7[(int) ((local9 ^ (long) arg3[local122]) & 0xFFL)] ^ local9 >>> 8;
			}
		}
		return local9 >>> 8 ^ local7[(int) ((local9 ^ (long) (arg1 ? 1 : 0)) & 0xFFL)];
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIZLclient!ha;ILclient!ae;IIILclient!je;)Lclient!ka;")
	public Class14 method6585(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class101 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class9 arg4, @OriginalArg(6) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) Class178 arg7) {
		@Pc(7) Class14 local7 = null;
		@Pc(9) int local9 = 2048;
		@Pc(11) Class248 local11 = null;
		if (arg0 != -1) {
			local11 = Static665.aClass267_2.method7159(arg0);
		}
		@Pc(24) int[] local24 = this.anIntArray350;
		if (local11 != null && local11.anIntArray360 != null) {
			local24 = new int[local11.anIntArray360.length];
			for (@Pc(36) int local36 = 0; local36 < local11.anIntArray360.length; local36++) {
				@Pc(43) int local43 = local11.anIntArray360[local36];
				if (local43 >= 0 && local43 < this.anIntArray350.length) {
					local24[local36] = this.anIntArray350[local43];
				} else {
					local24[local36] = -1;
				}
			}
		}
		@Pc(75) boolean local75 = false;
		@Pc(77) boolean local77 = false;
		@Pc(79) boolean local79 = false;
		@Pc(81) boolean local81 = false;
		@Pc(83) int local83 = -1;
		@Pc(85) int local85 = -1;
		@Pc(87) int local87 = 0;
		@Pc(89) Class2_Sub1_Sub18 local89 = null;
		@Pc(91) Class2_Sub1_Sub18 local91 = null;
		if (arg7 != null) {
			local83 = arg7.anIntArray259[arg3];
			local9 = 2080;
			@Pc(106) int local106 = local83 >>> 16;
			local83 &= 0xFFFF;
			local89 = Static354.aClass40_2.method1120(local106);
			if (local89 != null) {
				local77 = local89.method8433(local83) | false;
				local75 = local89.method8434(local83) | false;
				local81 = local89.method8432(local83) | false;
				local79 = arg7.aBoolean385 | false;
			}
			if ((arg7.aBoolean386 || Static135.aBoolean192) && arg6 != -1 && arg7.anIntArray259.length > arg6) {
				local85 = arg7.anIntArray259[arg6];
				local87 = arg7.anIntArray257[arg3];
				@Pc(176) int local176 = local85 >>> 16;
				local85 &= 0xFFFF;
				if (local106 == local176) {
					local91 = local89;
				} else {
					local91 = Static354.aClass40_2.method1120(local85 >>> 16);
				}
				if (local91 != null) {
					local77 |= local91.method8433(local85);
					local75 |= local91.method8434(local85);
					local81 |= local91.method8432(local85);
				}
			}
			if (local77) {
				local9 = 2208;
			}
			if (local75) {
				local9 |= 0x100;
			}
			if (local79) {
				local9 |= 0x200;
			}
			if (local81) {
				local9 |= 0x400;
			}
		}
		@Pc(259) long local259 = this.method6582(local24, arg1, arg0, arg4 == null ? null : arg4.anIntArray2);
		if (Static61.aClass22_6 != null) {
			local7 = (Class14) Static61.aClass22_6.method462(local259);
		}
		if (local7 == null || arg2.method8083(local7.ua(), local9) != 0) {
			if (local7 != null) {
				local9 = arg2.method8095(local9, local7.ua());
			}
			@Pc(285) int local285 = local9;
			@Pc(287) boolean local287 = false;
			for (@Pc(289) int local289 = 0; local289 < local24.length; local289++) {
				if (local24[local289] != -1 && !Static372.aClass343_1.method8549(local24[local289]).method8826((Class80) null, arg1)) {
					local287 = true;
				}
			}
			if (local287) {
				return null;
			}
			@Pc(323) Class159[] local323 = new Class159[local24.length];
			for (@Pc(325) int local325 = 0; local325 < local24.length; local325++) {
				if (local24[local325] != -1) {
					local323[local325] = Static372.aClass343_1.method8549(local24[local325]).method8834(arg1, (Class80) null);
				}
			}
			@Pc(377) int local377;
			@Pc(384) int local384;
			if (local11 != null && local11.anIntArrayArray35 != null) {
				for (@Pc(357) int local357 = 0; local357 < local11.anIntArrayArray35.length; local357++) {
					if (local11.anIntArrayArray35[local357] != null && local323[local357] != null) {
						local377 = local11.anIntArrayArray35[local357][0];
						local384 = local11.anIntArrayArray35[local357][1];
						@Pc(391) int local391 = local11.anIntArrayArray35[local357][2];
						@Pc(398) int local398 = local11.anIntArrayArray35[local357][3];
						@Pc(405) int local405 = local11.anIntArrayArray35[local357][4];
						@Pc(412) int local412 = local11.anIntArrayArray35[local357][5];
						if (local398 != 0 || local405 != 0 || local412 != 0) {
							local323[local357].method4366(local405, local412, local398);
						}
						if (local377 != 0 || local384 != 0 || local391 != 0) {
							local323[local357].method4357(local384, local377, local391);
						}
					}
				}
			}
			if (arg4 != null) {
				local285 = local9 | 0x4000;
			}
			@Pc(471) Class159 local471 = new Class159(local323, local323.length);
			local7 = arg2.method8064(local471, local285, Static181.anInt3818, 64, 850);
			if (arg4 != null) {
				for (local377 = 0; local377 < 5; local377++) {
					for (local384 = 0; local384 < Static109.aShortArrayArrayArray1.length; local384++) {
						if (Static109.aShortArrayArrayArray1[local384][local377].length > arg4.anIntArray2[local377]) {
							local7.ia(Static565.aShortArrayArray19[local384][local377], Static109.aShortArrayArrayArray1[local384][local377][arg4.anIntArray2[local377]]);
						}
					}
				}
			}
			if (Static61.aClass22_6 != null) {
				local7.s(local9);
				Static61.aClass22_6.method470(local259, local7);
			}
		}
		if (arg7 == null || local89 == null) {
			return local7;
		} else {
			@Pc(556) Class14 local556 = local7.method8622((byte) 1, local9, true);
			local556.method8627(local89, arg5 - 1, arg7.aBoolean385, local83, 0, local91, local85, local87);
			return local556;
		}
	}
}
