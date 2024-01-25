import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vl")
public final class Class10_Sub44 extends Class10 {

	@OriginalMember(owner = "client!vl", name = "o", descriptor = "[I")
	public int[] anIntArray703 = new int[1];

	@OriginalMember(owner = "client!vl", name = "q", descriptor = "[I")
	public int[] anIntArray704 = new int[] { -1 };

	static {
		new Class182(null, "der Spieler ist momentan nicht verfügbar.", null, null);
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIBLclient!jv;ZLclient!za;IIILclient!fd;)Lclient!e;")
	public Class63 method5715(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class137 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class50 arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) Class75 arg7) {
		@Pc(7) Class63 local7 = null;
		@Pc(9) int local9 = 2048;
		@Pc(11) Class6 local11 = null;
		if (arg6 != -1) {
			local11 = Static133.aClass223_1.method4952(arg6);
		}
		@Pc(23) int[] local23 = this.anIntArray704;
		if (local11 != null && local11.anIntArray3 != null) {
			local23 = new int[local11.anIntArray3.length];
			for (@Pc(35) int local35 = 0; local35 < local11.anIntArray3.length; local35++) {
				@Pc(42) int local42 = local11.anIntArray3[local35];
				if (local42 >= 0 && local42 < this.anIntArray704.length) {
					local23[local35] = this.anIntArray704[local42];
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
		@Pc(91) Class10_Sub1_Sub4 local91 = null;
		@Pc(93) Class10_Sub1_Sub4 local93 = null;
		if (arg2 != null) {
			local9 = 2080;
			local85 = arg2.anIntArray403[arg0];
			@Pc(108) int local108 = local85 >>> 16;
			local91 = Static281.aClass98_3.method2409(local108);
			local85 &= 0xFFFF;
			if (local91 != null) {
				local79 = local91.method1706(local85) | false;
				local77 = local91.method1711(local85) | false;
				local83 = local91.method1709(local85) | false;
				local81 = arg2.aBoolean273 | false;
			}
			if ((arg2.aBoolean272 || Static102.aBoolean131) && arg1 != -1 && arg1 < arg2.anIntArray403.length) {
				local89 = arg2.anIntArray404[arg0];
				local87 = arg2.anIntArray403[arg1];
				@Pc(177) int local177 = local87 >>> 16;
				local87 &= 0xFFFF;
				if (local108 == local177) {
					local93 = local91;
				} else {
					local93 = Static281.aClass98_3.method2409(local87 >>> 16);
				}
				if (local93 != null) {
					local79 |= local93.method1706(local87);
					local77 |= local93.method1711(local87);
					local83 |= local93.method1709(local87);
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
		@Pc(258) long local258 = this.method5717(local23, arg3, arg7 == null ? null : arg7.anIntArray194, arg6);
		if (Static265.aClass267_47 != null) {
			local7 = (Class63) Static265.aClass267_47.method6014(local258);
		}
		if (local7 == null || arg4.method5856(local7.RA(), local9) != 0) {
			if (local7 != null) {
				local9 = arg4.method5822(local9, local7.RA());
			}
			@Pc(287) int local287 = local9;
			@Pc(289) boolean local289 = false;
			for (@Pc(291) int local291 = 0; local291 < local23.length; local291++) {
				if (local23[local291] != -1 && !Static313.aClass272_2.method6068(local23[local291]).method1527(arg3)) {
					local289 = true;
				}
			}
			if (local289) {
				return null;
			}
			@Pc(327) Class192[] local327 = new Class192[local23.length];
			for (@Pc(329) int local329 = 0; local329 < local23.length; local329++) {
				if (local23[local329] != -1) {
					local327[local329] = Static313.aClass272_2.method6068(local23[local329]).method1544(arg3);
				}
			}
			@Pc(384) int local384;
			if (local11 != null && local11.anIntArrayArray1 != null) {
				for (@Pc(364) int local364 = 0; local364 < local11.anIntArrayArray1.length; local364++) {
					if (local11.anIntArrayArray1[local364] != null && local327[local364] != null) {
						local384 = local11.anIntArrayArray1[local364][0];
						@Pc(391) int local391 = local11.anIntArrayArray1[local364][1];
						@Pc(398) int local398 = local11.anIntArrayArray1[local364][2];
						@Pc(405) int local405 = local11.anIntArrayArray1[local364][3];
						@Pc(412) int local412 = local11.anIntArrayArray1[local364][4];
						@Pc(419) int local419 = local11.anIntArrayArray1[local364][5];
						if (local405 != 0 || local412 != 0 || local419 != 0) {
							local327[local364].method4337(local412, local419, local405);
						}
						if (local384 != 0 || local391 != 0 || local398 != 0) {
							local327[local364].method4344(local398, local391, local384);
						}
					}
				}
			}
			if (arg7 != null) {
				local287 = local9 | 0x4000;
			}
			@Pc(475) Class192 local475 = new Class192(local327, local327.length);
			local7 = arg4.method5864(local475, local287, Static378.anInt6501, 64, 850);
			if (arg7 != null) {
				for (local384 = 0; local384 < 5; local384++) {
					if (Static283.aShortArrayArray5[local384].length > arg7.anIntArray194[local384]) {
						local7.q(Static231.aShortArray59[local384], Static283.aShortArrayArray5[local384][arg7.anIntArray194[local384]]);
					}
					if (arg7.anIntArray194[local384] < Static386.aShortArrayArray8[local384].length) {
						local7.q(Static158.aShortArray48[local384], Static386.aShortArrayArray8[local384][arg7.anIntArray194[local384]]);
					}
				}
			}
			if (Static265.aClass267_47 != null) {
				local7.D(local9);
				Static265.aClass267_47.method6008(local7, local258);
			}
		}
		if (arg2 == null || local91 == null) {
			return local7;
		} else {
			@Pc(567) Class63 local567 = local7.method6093((byte) 1, local9, true);
			local567.method6091(arg2.aBoolean273, 0, local89, arg5 - 1, local91, local87, local93, local85);
			return local567;
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(I[IZ[II)J")
	private long method5717(@OriginalArg(1) int[] arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		@Pc(7) long[] local7 = Class217.aLongArray7;
		@Pc(9) long local9 = -1L;
		@Pc(25) long local25 = local7[(int) (((long) (arg3 >> 8) ^ local9) & 0xFFL)] ^ local9 >>> 8;
		local9 = local25 >>> 8 ^ local7[(int) (((long) arg3 ^ local25) & 0xFFL)];
		for (@Pc(41) int local41 = 0; local41 < arg0.length; local41++) {
			local9 = local9 >>> 8 ^ local7[(int) (((long) (arg0[local41] >> 24) ^ local9) & 0xFFL)];
			local9 = local7[(int) ((local9 ^ (long) (arg0[local41] >> 16)) & 0xFFL)] ^ local9 >>> 8;
			local9 = local7[(int) (((long) (arg0[local41] >> 8) ^ local9) & 0xFFL)] ^ local9 >>> 8;
			local9 = local9 >>> 8 ^ local7[(int) (((long) arg0[local41] ^ local9) & 0xFFL)];
		}
		if (arg2 != null) {
			for (@Pc(132) int local132 = 0; local132 < 5; local132++) {
				local9 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) arg2[local132]) & 0xFFL)];
			}
		}
		return local7[(int) (((long) (arg1 ? 1 : 0) ^ local9) & 0xFFL)] ^ local9 >>> 8;
	}
}
