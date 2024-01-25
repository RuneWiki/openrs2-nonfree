import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jt")
public final class Class3_Sub32 extends Class3 {

	@OriginalMember(owner = "client!jt", name = "j", descriptor = "[I")
	public int[] anIntArray268 = new int[] { -1 };

	@OriginalMember(owner = "client!jt", name = "h", descriptor = "[I")
	public int[] anIntArray267 = new int[1];

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "([IZBI[I)J")
	private long method4512(@OriginalArg(0) int[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		@Pc(12) long[] local12 = Class3_Sub6.aLongArray21;
		@Pc(14) long local14 = -1L;
		@Pc(30) long local30 = local14 >>> 8 ^ local12[(int) (((long) (arg2 >> 8) ^ local14) & 0xFFL)];
		local14 = local12[(int) ((local30 ^ (long) arg2) & 0xFFL)] ^ local30 >>> 8;
		for (@Pc(46) int local46 = 0; local46 < arg3.length; local46++) {
			local14 = local12[(int) ((local14 ^ (long) (arg3[local46] >> 24)) & 0xFFL)] ^ local14 >>> 8;
			local14 = local14 >>> 8 ^ local12[(int) ((local14 ^ (long) (arg3[local46] >> 16)) & 0xFFL)];
			local14 = local12[(int) (((long) (arg3[local46] >> 8) ^ local14) & 0xFFL)] ^ local14 >>> 8;
			local14 = local12[(int) ((local14 ^ (long) arg3[local46]) & 0xFFL)] ^ local14 >>> 8;
		}
		if (arg0 != null) {
			for (@Pc(127) int local127 = 0; local127 < 5; local127++) {
				local14 = local14 >>> 8 ^ local12[(int) ((local14 ^ (long) arg0[local127]) & 0xFFL)];
			}
		}
		return local12[(int) ((local14 ^ (long) (arg1 ? 1 : 0)) & 0xFFL)] ^ local14 >>> 8;
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(IILclient!vo;ILclient!ha;IZIILclient!jr;)Lclient!ka;")
	public Class17 method4517(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class361 arg2, @OriginalArg(4) Class5 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6, @OriginalArg(9) Class178 arg7) {
		@Pc(7) Class17 local7 = null;
		@Pc(9) int local9 = 2048;
		@Pc(11) Class143 local11 = null;
		if (arg4 != -1) {
			local11 = Static78.aClass261_1.method6770(arg4);
		}
		@Pc(23) int[] local23 = this.anIntArray268;
		if (local11 != null && local11.anIntArray215 != null) {
			local23 = new int[local11.anIntArray215.length];
			for (@Pc(35) int local35 = 0; local35 < local11.anIntArray215.length; local35++) {
				@Pc(42) int local42 = local11.anIntArray215[local35];
				if (local42 >= 0 && this.anIntArray268.length > local42) {
					local23[local35] = this.anIntArray268[local42];
				} else {
					local23[local35] = -1;
				}
			}
		}
		@Pc(73) boolean local73 = false;
		@Pc(75) boolean local75 = false;
		@Pc(77) boolean local77 = false;
		@Pc(79) boolean local79 = false;
		@Pc(88) int local88 = -1;
		@Pc(90) int local90 = -1;
		@Pc(92) int local92 = 0;
		@Pc(94) Class3_Sub4_Sub8 local94 = null;
		@Pc(96) Class3_Sub4_Sub8 local96 = null;
		if (arg2 != null) {
			local88 = arg2.anIntArray638[arg6];
			local9 = 2080;
			@Pc(111) int local111 = local88 >>> 16;
			local88 &= 0xFFFF;
			local94 = Static115.aClass227_1.method5974(local111);
			if (local94 != null) {
				local75 = local94.method3037(local88) | false;
				local73 = local94.method3036(local88) | false;
				local79 = local94.method3040(local88) | false;
				local77 = arg2.aBoolean710 | false;
			}
			if ((arg2.aBoolean707 || Static583.aBoolean687) && arg0 != -1 && arg2.anIntArray638.length > arg0) {
				local90 = arg2.anIntArray638[arg0];
				local92 = arg2.anIntArray642[arg6];
				@Pc(176) int local176 = local90 >>> 16;
				local90 &= 0xFFFF;
				if (local176 == local111) {
					local96 = local94;
				} else {
					local96 = Static115.aClass227_1.method5974(local90 >>> 16);
				}
				if (local96 != null) {
					local75 |= local96.method3037(local90);
					local73 |= local96.method3036(local90);
					local79 |= local96.method3040(local90);
				}
			}
			if (local75) {
				local9 = 2208;
			}
			if (local73) {
				local9 |= 0x100;
			}
			if (local77) {
				local9 |= 0x200;
			}
			if (local79) {
				local9 |= 0x400;
			}
		}
		@Pc(257) long local257 = this.method4512(arg7 == null ? null : arg7.anIntArray266, arg5, arg4, local23);
		if (Static69.aClass102_6 != null) {
			local7 = (Class17) Static69.aClass102_6.method2677(local257);
		}
		if (local7 == null || arg3.method7541(local7.ua(), local9) != 0) {
			if (local7 != null) {
				local9 = arg3.method7501(local9, local7.ua());
			}
			@Pc(286) int local286 = local9;
			@Pc(288) boolean local288 = false;
			for (@Pc(290) int local290 = 0; local290 < local23.length; local290++) {
				if (local23[local290] != -1 && !Static320.aClass53_2.method1770(local23[local290]).method1477(arg5)) {
					local288 = true;
				}
			}
			if (local288) {
				return null;
			}
			@Pc(326) Class118[] local326 = new Class118[local23.length];
			for (@Pc(328) int local328 = 0; local328 < local23.length; local328++) {
				if (local23[local328] != -1) {
					local326[local328] = Static320.aClass53_2.method1770(local23[local328]).method1479(arg5);
				}
			}
			@Pc(384) int local384;
			@Pc(391) int local391;
			if (local11 != null && local11.anIntArrayArray32 != null) {
				for (@Pc(364) int local364 = 0; local364 < local11.anIntArrayArray32.length; local364++) {
					if (local11.anIntArrayArray32[local364] != null && local326[local364] != null) {
						local384 = local11.anIntArrayArray32[local364][0];
						local391 = local11.anIntArrayArray32[local364][1];
						@Pc(398) int local398 = local11.anIntArrayArray32[local364][2];
						@Pc(405) int local405 = local11.anIntArrayArray32[local364][3];
						@Pc(412) int local412 = local11.anIntArrayArray32[local364][4];
						@Pc(419) int local419 = local11.anIntArrayArray32[local364][5];
						if (local405 != 0 || local412 != 0 || local419 != 0) {
							local326[local364].method2927(local412, local405, local419);
						}
						if (local384 != 0 || local391 != 0 || local398 != 0) {
							local326[local364].method2937(local384, local391, local398);
						}
					}
				}
			}
			@Pc(470) Class118 local470 = new Class118(local326, local326.length);
			if (arg7 != null) {
				local286 = local9 | 0x4000;
			}
			local7 = arg3.method7490(local470, local286, Static247.anInt4558, 64, 850);
			if (arg7 != null) {
				for (local384 = 0; local384 < 5; local384++) {
					for (local391 = 0; local391 < Static341.aShortArrayArrayArray5.length; local391++) {
						if (Static341.aShortArrayArrayArray5[local391][local384].length > arg7.anIntArray266[local384]) {
							local7.ia(Static494.aShortArrayArray14[local391][local384], Static341.aShortArrayArrayArray5[local391][local384][arg7.anIntArray266[local384]]);
						}
					}
				}
			}
			if (Static69.aClass102_6 != null) {
				local7.s(local9);
				Static69.aClass102_6.method2674(local257, local7);
			}
		}
		if (arg2 == null || local94 == null) {
			return local7;
		} else {
			@Pc(557) Class17 local557 = local7.method5409((byte) 1, local9, true);
			local557.method5421(arg2.aBoolean710, local94, 0, local88, local96, arg1 - 1, local92, local90);
			return local557;
		}
	}
}
