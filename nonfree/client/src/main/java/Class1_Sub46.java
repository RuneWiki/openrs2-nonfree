import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wu")
public final class Class1_Sub46 extends Class1 {

	@OriginalMember(owner = "client!wu", name = "p", descriptor = "[I")
	public int[] anIntArray750 = new int[] { -1 };

	@OriginalMember(owner = "client!wu", name = "r", descriptor = "[I")
	public int[] anIntArray751 = new int[1];

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lclient!za;IILclient!sq;IIILclient!qp;IZ)Lclient!e;")
	public Class17 method6184(@OriginalArg(0) Class106 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class235 arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) Class210 arg5, @OriginalArg(8) int arg6, @OriginalArg(9) boolean arg7) {
		@Pc(7) Class17 local7 = null;
		@Pc(9) int local9 = 2048;
		@Pc(11) Class212 local11 = null;
		if (arg4 != -1) {
			local11 = Static241.aClass258_1.method5771(arg4);
		}
		@Pc(23) int[] local23 = this.anIntArray750;
		if (local11 != null && local11.anIntArray586 != null) {
			local23 = new int[local11.anIntArray586.length];
			for (@Pc(35) int local35 = 0; local35 < local11.anIntArray586.length; local35++) {
				@Pc(42) int local42 = local11.anIntArray586[local35];
				if (local42 >= 0 && this.anIntArray750.length > local42) {
					local23[local35] = this.anIntArray750[local42];
				} else {
					local23[local35] = -1;
				}
			}
		}
		@Pc(73) boolean local73 = false;
		@Pc(75) boolean local75 = false;
		@Pc(77) boolean local77 = false;
		@Pc(79) boolean local79 = false;
		@Pc(81) int local81 = -1;
		@Pc(83) int local83 = -1;
		@Pc(85) int local85 = 0;
		@Pc(87) Class1_Sub1_Sub8 local87 = null;
		@Pc(89) Class1_Sub1_Sub8 local89 = null;
		if (arg2 != null) {
			local81 = arg2.anIntArray633[arg1];
			local9 = 2080;
			@Pc(104) int local104 = local81 >>> 16;
			local81 &= 0xFFFF;
			local87 = Static107.aClass239_1.method5423(local104);
			if (local87 != null) {
				local75 = local87.method1440(local81) | false;
				local73 = local87.method1446(local81) | false;
				local79 = local87.method1448(local81) | false;
				local77 = arg2.aBoolean432 | false;
			}
			if ((arg2.aBoolean431 || Static261.aBoolean314) && arg6 != -1 && arg6 < arg2.anIntArray633.length) {
				local83 = arg2.anIntArray633[arg6];
				local85 = arg2.anIntArray632[arg1];
				@Pc(170) int local170 = local83 >>> 16;
				local83 &= 0xFFFF;
				if (local170 == local104) {
					local89 = local87;
				} else {
					local89 = Static107.aClass239_1.method5423(local83 >>> 16);
				}
				if (local89 != null) {
					local75 |= local89.method1440(local83);
					local73 |= local89.method1446(local83);
					local79 |= local89.method1448(local83);
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
		@Pc(247) long local247 = this.method6186(arg4, local23, arg7, arg5 == null ? null : arg5.anIntArray579);
		if (Static11.aClass91_4 != null) {
			local7 = (Class17) Static11.aClass91_4.method1988(local247);
		}
		if (local7 == null || arg0.method5913(local7.RA(), local9) != 0) {
			if (local7 != null) {
				local9 = arg0.method5954(local9, local7.RA());
			}
			@Pc(281) int local281 = local9;
			@Pc(283) boolean local283 = false;
			for (@Pc(285) int local285 = 0; local285 < local23.length; local285++) {
				if (local23[local285] != -1 && !Static43.aClass57_1.method1414(local23[local285]).method3730(arg7)) {
					local283 = true;
				}
			}
			if (local283) {
				return null;
			}
			@Pc(324) Class147[] local324 = new Class147[local23.length];
			for (@Pc(326) int local326 = 0; local326 < local23.length; local326++) {
				if (local23[local326] != -1) {
					local324[local326] = Static43.aClass57_1.method1414(local23[local326]).method3731(arg7);
				}
			}
			@Pc(384) int local384;
			if (local11 != null && local11.anIntArrayArray49 != null) {
				for (@Pc(364) int local364 = 0; local364 < local11.anIntArrayArray49.length; local364++) {
					if (local11.anIntArrayArray49[local364] != null && local324[local364] != null) {
						local384 = local11.anIntArrayArray49[local364][0];
						@Pc(391) int local391 = local11.anIntArrayArray49[local364][1];
						@Pc(398) int local398 = local11.anIntArrayArray49[local364][2];
						@Pc(405) int local405 = local11.anIntArrayArray49[local364][3];
						@Pc(412) int local412 = local11.anIntArrayArray49[local364][4];
						@Pc(419) int local419 = local11.anIntArrayArray49[local364][5];
						if (local405 != 0 || local412 != 0 || local419 != 0) {
							local324[local364].method3377(local412, local405, local419);
						}
						if (local384 != 0 || local391 != 0 || local398 != 0) {
							local324[local364].method3368(local398, local384, local391);
						}
					}
				}
			}
			@Pc(469) Class147 local469 = new Class147(local324, local324.length);
			if (arg5 != null) {
				local281 = local9 | 0x4000;
			}
			local7 = arg0.method5922(local469, local281, Static125.anInt2777, 64, 850);
			if (arg5 != null) {
				for (local384 = 0; local384 < 5; local384++) {
					if (Static182.aShortArrayArray2[local384].length > arg5.anIntArray579[local384]) {
						local7.q(Static365.aShortArray126[local384], Static182.aShortArrayArray2[local384][arg5.anIntArray579[local384]]);
					}
					if (arg5.anIntArray579[local384] < Static431.aShortArrayArray8[local384].length) {
						local7.q(Static344.aShortArray114[local384], Static431.aShortArrayArray8[local384][arg5.anIntArray579[local384]]);
					}
				}
			}
			if (Static11.aClass91_4 != null) {
				local7.D(local9);
				Static11.aClass91_4.method1990(local7, local247);
			}
		}
		if (arg2 == null || local87 == null) {
			return local7;
		} else {
			@Pc(559) Class17 local559 = local7.method6202((byte) 1, local9, true);
			local559.method6194(local87, local85, local81, local83, arg2.aBoolean432, local89, 0, arg3 - 1);
			return local559;
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(I[IZZ[I)J")
	private long method6186(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int[] arg3) {
		@Pc(7) long[] local7 = Class163.aLongArray6;
		@Pc(9) long local9 = -1L;
		@Pc(25) long local25 = local7[(int) (((long) (arg0 >> 8) ^ local9) & 0xFFL)] ^ local9 >>> 8;
		local9 = local25 >>> 8 ^ local7[(int) ((local25 ^ (long) arg0) & 0xFFL)];
		for (@Pc(46) int local46 = 0; local46 < arg1.length; local46++) {
			local9 = local7[(int) ((local9 ^ (long) (arg1[local46] >> 24)) & 0xFFL)] ^ local9 >>> 8;
			local9 = local7[(int) ((local9 ^ (long) (arg1[local46] >> 16)) & 0xFFL)] ^ local9 >>> 8;
			local9 = local9 >>> 8 ^ local7[(int) (((long) (arg1[local46] >> 8) ^ local9) & 0xFFL)];
			local9 = local7[(int) (((long) arg1[local46] ^ local9) & 0xFFL)] ^ local9 >>> 8;
		}
		if (arg3 != null) {
			for (@Pc(127) int local127 = 0; local127 < 5; local127++) {
				local9 = local9 >>> 8 ^ local7[(int) (((long) arg3[local127] ^ local9) & 0xFFL)];
			}
		}
		return local9 >>> 8 ^ local7[(int) ((local9 ^ (long) (arg2 ? 1 : 0)) & 0xFFL)];
	}
}
