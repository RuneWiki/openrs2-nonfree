import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!of")
public final class Class2_Sub36 extends Class2 {

	@OriginalMember(owner = "client!of", name = "o", descriptor = "[I")
	public int[] anIntArray396 = new int[1];

	@OriginalMember(owner = "client!of", name = "n", descriptor = "[I")
	public int[] anIntArray395 = new int[] { -1 };

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(I[II[IZ)J")
	private long method3762(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) boolean arg3) {
		@Pc(7) long[] local7 = Class109_Sub1.aLongArray10;
		@Pc(9) long local9 = -1L;
		@Pc(25) long local25 = local9 >>> 8 ^ local7[(int) (((long) (arg1 >> 8) ^ local9) & 0xFFL)];
		local9 = local7[(int) (((long) arg1 ^ local25) & 0xFFL)] ^ local25 >>> 8;
		for (@Pc(46) int local46 = 0; local46 < arg2.length; local46++) {
			local9 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) (arg2[local46] >> 24)) & 0xFFL)];
			local9 = local7[(int) (((long) (arg2[local46] >> 16) ^ local9) & 0xFFL)] ^ local9 >>> 8;
			local9 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) (arg2[local46] >> 8)) & 0xFFL)];
			local9 = local7[(int) ((local9 ^ (long) arg2[local46]) & 0xFFL)] ^ local9 >>> 8;
		}
		if (arg0 != null) {
			for (@Pc(127) int local127 = 0; local127 < 5; local127++) {
				local9 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) arg0[local127]) & 0xFFL)];
			}
		}
		return local7[(int) ((local9 ^ (long) (arg3 ? 1 : 0)) & 0xFFL)] ^ local9 >>> 8;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Lclient!jp;Lclient!ur;IIILclient!za;ZBII)Lclient!e;")
	public Class59 method3769(@OriginalArg(0) Class128 arg0, @OriginalArg(1) Class249 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class163 arg4, @OriginalArg(6) boolean arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7) {
		@Pc(7) Class59 local7 = null;
		@Pc(9) int local9 = 2048;
		@Pc(11) Class173 local11 = null;
		if (arg7 != -1) {
			local11 = Static56.aClass150_1.method3066(arg7);
		}
		@Pc(23) int[] local23 = this.anIntArray395;
		if (local11 != null && local11.anIntArray379 != null) {
			local23 = new int[local11.anIntArray379.length];
			for (@Pc(35) int local35 = 0; local35 < local11.anIntArray379.length; local35++) {
				@Pc(42) int local42 = local11.anIntArray379[local35];
				if (local42 >= 0 && this.anIntArray395.length > local42) {
					local23[local35] = this.anIntArray395[local42];
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
		@Pc(92) int local92 = -1;
		@Pc(94) int local94 = 0;
		@Pc(96) Class2_Sub5_Sub18 local96 = null;
		@Pc(98) Class2_Sub5_Sub18 local98 = null;
		if (arg0 != null) {
			local85 = arg0.anIntArray278[arg2];
			local9 = 2080;
			@Pc(113) int local113 = local85 >>> 16;
			local85 &= 0xFFFF;
			local96 = Static334.aClass62_2.method1414(local113);
			if (local96 != null) {
				local79 = local96.method5629(local85) | false;
				local77 = local96.method5626(local85) | false;
				local83 = local96.method5630(local85) | false;
				local81 = arg0.aBoolean200 | false;
			}
			if ((arg0.aBoolean201 || Static390.aBoolean492) && arg6 != -1 && arg0.anIntArray278.length > arg6) {
				local94 = arg0.anIntArray276[arg2];
				local92 = arg0.anIntArray278[arg6];
				@Pc(181) int local181 = local92 >>> 16;
				local92 &= 0xFFFF;
				if (local113 == local181) {
					local98 = local96;
				} else {
					local98 = Static334.aClass62_2.method1414(local92 >>> 16);
				}
				if (local98 != null) {
					local79 |= local98.method5629(local92);
					local77 |= local98.method5626(local92);
					local83 |= local98.method5630(local92);
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
		@Pc(262) long local262 = this.method3762(arg1 == null ? null : arg1.anIntArray566, arg7, local23, arg5);
		if (Static92.aClass132_12 != null) {
			local7 = (Class59) Static92.aClass132_12.method2701(local262);
		}
		if (local7 == null || arg4.method5502(local7.RA(), local9) != 0) {
			if (local7 != null) {
				local9 = arg4.method5514(local9, local7.RA());
			}
			@Pc(288) int local288 = local9;
			@Pc(290) boolean local290 = false;
			for (@Pc(292) int local292 = 0; local292 < local23.length; local292++) {
				if (local23[local292] != -1 && !Static384.aClass164_2.method3458(local23[local292]).method4484(arg5)) {
					local290 = true;
				}
			}
			if (local290) {
				return null;
			}
			@Pc(328) Class205[] local328 = new Class205[local23.length];
			for (@Pc(330) int local330 = 0; local330 < local23.length; local330++) {
				if (local23[local330] != -1) {
					local328[local330] = Static384.aClass164_2.method3458(local23[local330]).method4472(arg5);
				}
			}
			@Pc(385) int local385;
			if (local11 != null && local11.anIntArrayArray32 != null) {
				for (@Pc(365) int local365 = 0; local365 < local11.anIntArrayArray32.length; local365++) {
					if (local11.anIntArrayArray32[local365] != null && local328[local365] != null) {
						local385 = local11.anIntArrayArray32[local365][0];
						@Pc(392) int local392 = local11.anIntArrayArray32[local365][1];
						@Pc(399) int local399 = local11.anIntArrayArray32[local365][2];
						@Pc(406) int local406 = local11.anIntArrayArray32[local365][3];
						@Pc(413) int local413 = local11.anIntArrayArray32[local365][4];
						@Pc(420) int local420 = local11.anIntArrayArray32[local365][5];
						if (local406 != 0 || local413 != 0 || local420 != 0) {
							local328[local365].method4452(local406, local420, local413);
						}
						if (local385 != 0 || local392 != 0 || local399 != 0) {
							local328[local365].method4445(local385, local399, local392);
						}
					}
				}
			}
			if (arg1 != null) {
				local288 = local9 | 0x4000;
			}
			@Pc(489) Class205 local489 = new Class205(local328, local328.length);
			local7 = arg4.method5530(local489, local288, Static133.anInt2394, 64, 850);
			if (arg1 != null) {
				for (local385 = 0; local385 < 5; local385++) {
					if (Static287.aShortArrayArray6[local385].length > arg1.anIntArray566[local385]) {
						local7.q(Static306.aShortArray54[local385], Static287.aShortArrayArray6[local385][arg1.anIntArray566[local385]]);
					}
					if (arg1.anIntArray566[local385] < Static104.aShortArrayArray1[local385].length) {
						local7.q(Static171.aShortArray24[local385], Static104.aShortArrayArray1[local385][arg1.anIntArray566[local385]]);
					}
				}
			}
			if (Static92.aClass132_12 != null) {
				local7.D(local9);
				Static92.aClass132_12.method2711(local7, local262);
			}
		}
		if (arg0 == null || local96 == null) {
			return local7;
		} else {
			@Pc(579) Class59 local579 = local7.method5737((byte) 1, local9, true);
			local579.method5750(local98, arg3 - 1, local92, 0, local96, local94, local85, arg0.aBoolean200);
			return local579;
		}
	}
}
