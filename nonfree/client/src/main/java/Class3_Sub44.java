import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qi")
public final class Class3_Sub44 extends Class3 {

	@OriginalMember(owner = "client!qi", name = "s", descriptor = "[I")
	public int[] anIntArray446 = new int[] { -1 };

	@OriginalMember(owner = "client!qi", name = "w", descriptor = "[I")
	public int[] anIntArray447 = new int[1];

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "([IIBZ[I)J")
	private long method6084(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int[] arg3) {
		@Pc(12) long[] local12 = Class3_Sub6_Sub8.aLongArray2;
		@Pc(14) long local14 = -1L;
		@Pc(30) long local30 = local14 >>> 8 ^ local12[(int) ((local14 ^ (long) (arg1 >> 8)) & 0xFFL)];
		local14 = local30 >>> 8 ^ local12[(int) ((local30 ^ (long) arg1) & 0xFFL)];
		for (@Pc(46) int local46 = 0; local46 < arg3.length; local46++) {
			local14 = local12[(int) (((long) (arg3[local46] >> 24) ^ local14) & 0xFFL)] ^ local14 >>> 8;
			local14 = local14 >>> 8 ^ local12[(int) (((long) (arg3[local46] >> 16) ^ local14) & 0xFFL)];
			local14 = local14 >>> 8 ^ local12[(int) ((local14 ^ (long) (arg3[local46] >> 8)) & 0xFFL)];
			local14 = local14 >>> 8 ^ local12[(int) (((long) arg3[local46] ^ local14) & 0xFFL)];
		}
		if (arg0 != null) {
			for (@Pc(131) int local131 = 0; local131 < 5; local131++) {
				local14 = local12[(int) ((local14 ^ (long) arg0[local131]) & 0xFFL)] ^ local14 >>> 8;
			}
		}
		return local14 >>> 8 ^ local12[(int) ((local14 ^ (long) (arg2 ? 1 : 0)) & 0xFFL)];
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IZILclient!hq;IIILclient!qg;Lclient!r;I)Lclient!da;")
	public Class52 method6086(@OriginalArg(1) boolean arg0, @OriginalArg(3) Class131 arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) Class270 arg5, @OriginalArg(8) Class31 arg6, @OriginalArg(9) int arg7) {
		@Pc(7) Class52 local7 = null;
		@Pc(9) int local9 = 2048;
		@Pc(11) Class122 local11 = null;
		if (arg2 != -1) {
			local11 = Static98.aClass313_1.method6864(arg2);
		}
		@Pc(23) int[] local23 = this.anIntArray446;
		if (local11 != null && local11.anIntArray184 != null) {
			local23 = new int[local11.anIntArray184.length];
			for (@Pc(35) int local35 = 0; local35 < local11.anIntArray184.length; local35++) {
				@Pc(42) int local42 = local11.anIntArray184[local35];
				if (local42 >= 0 && this.anIntArray446.length > local42) {
					local23[local35] = this.anIntArray446[local42];
				} else {
					local23[local35] = -1;
				}
			}
		}
		@Pc(77) boolean local77 = false;
		@Pc(79) boolean local79 = false;
		@Pc(86) boolean local86 = false;
		@Pc(88) boolean local88 = false;
		@Pc(90) int local90 = -1;
		@Pc(92) int local92 = -1;
		@Pc(94) int local94 = 0;
		@Pc(96) Class3_Sub7_Sub15 local96 = null;
		@Pc(98) Class3_Sub7_Sub15 local98 = null;
		if (arg5 != null) {
			local90 = arg5.anIntArray443[arg3];
			local9 = 2080;
			@Pc(113) int local113 = local90 >>> 16;
			local90 &= 0xFFFF;
			local96 = Static245.aClass155_1.method3818(local113);
			if (local96 != null) {
				local79 = local96.method5745(local90) | false;
				local77 = local96.method5743(local90) | false;
				local88 = local96.method5741(local90) | false;
				local86 = arg5.aBoolean533 | false;
			}
			if ((arg5.aBoolean534 || Static323.aBoolean412) && arg4 != -1 && arg5.anIntArray443.length > arg4) {
				local92 = arg5.anIntArray443[arg4];
				local94 = arg5.anIntArray445[arg3];
				@Pc(178) int local178 = local92 >>> 16;
				local92 &= 0xFFFF;
				if (local113 == local178) {
					local98 = local96;
				} else {
					local98 = Static245.aClass155_1.method3818(local92 >>> 16);
				}
				if (local98 != null) {
					local79 |= local98.method5745(local92);
					local77 |= local98.method5743(local92);
					local88 |= local98.method5741(local92);
				}
			}
			if (local79) {
				local9 = 2208;
			}
			if (local77) {
				local9 |= 0x100;
			}
			if (local86) {
				local9 |= 0x200;
			}
			if (local88) {
				local9 |= 0x400;
			}
		}
		@Pc(259) long local259 = this.method6084(arg1 == null ? null : arg1.anIntArray196, arg2, arg0, local23);
		if (Static148.aClass342_58 != null) {
			local7 = (Class52) Static148.aClass342_58.method7684(local259);
		}
		if (local7 == null || arg6.method8050(local7.PA(), local9) != 0) {
			if (local7 != null) {
				local9 = arg6.method8039(local9, local7.PA());
			}
			@Pc(288) int local288 = local9;
			@Pc(290) boolean local290 = false;
			for (@Pc(292) int local292 = 0; local292 < local23.length; local292++) {
				if (local23[local292] != -1 && !Static272.aClass121_2.method3327(local23[local292]).method3542(arg0)) {
					local290 = true;
				}
			}
			if (local290) {
				return null;
			}
			@Pc(324) Class332[] local324 = new Class332[local23.length];
			for (@Pc(326) int local326 = 0; local326 < local23.length; local326++) {
				if (local23[local326] != -1) {
					local324[local326] = Static272.aClass121_2.method3327(local23[local326]).method3541(arg0);
				}
			}
			@Pc(381) int local381;
			@Pc(388) int local388;
			if (local11 != null && local11.anIntArrayArray35 != null) {
				for (@Pc(361) int local361 = 0; local361 < local11.anIntArrayArray35.length; local361++) {
					if (local11.anIntArrayArray35[local361] != null && local324[local361] != null) {
						local381 = local11.anIntArrayArray35[local361][0];
						local388 = local11.anIntArrayArray35[local361][1];
						@Pc(395) int local395 = local11.anIntArrayArray35[local361][2];
						@Pc(402) int local402 = local11.anIntArrayArray35[local361][3];
						@Pc(409) int local409 = local11.anIntArrayArray35[local361][4];
						@Pc(416) int local416 = local11.anIntArrayArray35[local361][5];
						if (local402 != 0 || local409 != 0 || local416 != 0) {
							local324[local361].method7504(local409, local416, local402);
						}
						if (local381 != 0 || local388 != 0 || local395 != 0) {
							local324[local361].method7493(local388, local381, local395);
						}
					}
				}
			}
			if (arg1 != null) {
				local288 = local9 | 0x4000;
			}
			@Pc(470) Class332 local470 = new Class332(local324, local324.length);
			local7 = arg6.method8046(local470, local288, Static426.anInt7532, 64, 850);
			if (arg1 != null) {
				for (local381 = 0; local381 < 5; local381++) {
					for (local388 = 0; local388 < Static276.aShortArrayArrayArray1.length; local388++) {
						if (arg1.anIntArray196[local381] < Static276.aShortArrayArrayArray1[local388][local381].length) {
							local7.d(Static589.aShortArrayArray13[local388][local381], Static276.aShortArrayArrayArray1[local388][local381][arg1.anIntArray196[local381]]);
						}
					}
				}
			}
			if (Static148.aClass342_58 != null) {
				local7.SA(local9);
				Static148.aClass342_58.method7683(local7, local259);
			}
		}
		if (arg5 == null || local96 == null) {
			return local7;
		} else {
			@Pc(549) Class52 local549 = local7.method7618((byte) 1, local9, true);
			local549.method7630(arg5.aBoolean533, local92, local98, local94, local90, arg7 - 1, 0, local96);
			return local549;
		}
	}
}
