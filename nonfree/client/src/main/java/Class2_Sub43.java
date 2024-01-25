import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uca")
public final class Class2_Sub43 extends Class2 {

	@OriginalMember(owner = "client!uca", name = "o", descriptor = "[I")
	public int[] anIntArray671 = new int[] { -1 };

	@OriginalMember(owner = "client!uca", name = "q", descriptor = "[I")
	public int[] anIntArray672 = new int[1];

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(IILclient!ha;Lclient!qe;ZZIIILclient!mk;)Lclient!ka;")
	public Class193 method7942(@OriginalArg(1) int arg0, @OriginalArg(2) Class13 arg1, @OriginalArg(3) Class284 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) Class228 arg7) {
		@Pc(7) Class193 local7 = null;
		@Pc(9) int local9 = 2048;
		@Pc(11) Class291 local11 = null;
		if (arg6 != -1) {
			local11 = Static6.aClass146_1.method3512(arg6);
		}
		@Pc(23) int[] local23 = this.anIntArray671;
		if (local11 != null && local11.anIntArray548 != null) {
			local23 = new int[local11.anIntArray548.length];
			for (@Pc(35) int local35 = 0; local35 < local11.anIntArray548.length; local35++) {
				@Pc(42) int local42 = local11.anIntArray548[local35];
				if (local42 >= 0 && this.anIntArray671.length > local42) {
					local23[local35] = this.anIntArray671[local42];
				} else {
					local23[local35] = -1;
				}
			}
		}
		@Pc(81) boolean local81 = false;
		@Pc(83) boolean local83 = false;
		@Pc(85) boolean local85 = false;
		@Pc(87) boolean local87 = false;
		@Pc(89) int local89 = -1;
		@Pc(91) int local91 = -1;
		@Pc(93) int local93 = 0;
		@Pc(95) Class2_Sub7_Sub6 local95 = null;
		@Pc(97) Class2_Sub7_Sub6 local97 = null;
		if (arg7 != null) {
			local89 = arg7.anIntArray403[arg4];
			local9 = 2080;
			@Pc(112) int local112 = local89 >>> 16;
			local89 &= 0xFFFF;
			local95 = Static479.aClass308_2.method7074(local112);
			if (local95 != null) {
				local83 = local95.method3717(local89) | false;
				local81 = local95.method3713(local89) | false;
				local87 = local95.method3712(local89) | false;
				local85 = arg7.aBoolean453 | false;
			}
			if ((arg7.aBoolean451 || Static462.aBoolean531) && arg0 != -1 && arg0 < arg7.anIntArray403.length) {
				local91 = arg7.anIntArray403[arg0];
				local93 = arg7.anIntArray404[arg4];
				@Pc(177) int local177 = local91 >>> 16;
				local91 &= 0xFFFF;
				if (local112 == local177) {
					local97 = local95;
				} else {
					local97 = Static479.aClass308_2.method7074(local91 >>> 16);
				}
				if (local97 != null) {
					local83 |= local97.method3717(local91);
					local81 |= local97.method3713(local91);
					local87 |= local97.method3712(local91);
				}
			}
			if (local83) {
				local9 = 2208;
			}
			if (local81) {
				local9 |= 0x100;
			}
			if (local85) {
				local9 |= 0x200;
			}
			if (local87) {
				local9 |= 0x400;
			}
		}
		@Pc(254) long local254 = this.method7946(arg2 == null ? null : arg2.anIntArray514, arg6, arg3, local23);
		if (Static571.aClass69_61 != null) {
			local7 = (Class193) Static571.aClass69_61.method1919(local254);
		}
		if (local7 == null || arg1.method8163(local7.ua(), local9) != 0) {
			if (local7 != null) {
				local9 = arg1.method8122(local9, local7.ua());
			}
			@Pc(280) int local280 = local9;
			@Pc(282) boolean local282 = false;
			for (@Pc(284) int local284 = 0; local284 < local23.length; local284++) {
				if (local23[local284] != -1 && !Static470.aClass250_1.method5960(local23[local284]).method7511(arg3)) {
					local282 = true;
				}
			}
			if (local282) {
				return null;
			}
			@Pc(317) Class212[] local317 = new Class212[local23.length];
			for (@Pc(319) int local319 = 0; local319 < local23.length; local319++) {
				if (local23[local319] != -1) {
					local317[local319] = Static470.aClass250_1.method5960(local23[local319]).method7501(arg3);
				}
			}
			@Pc(371) int local371;
			@Pc(378) int local378;
			if (local11 != null && local11.anIntArrayArray93 != null) {
				for (@Pc(351) int local351 = 0; local351 < local11.anIntArrayArray93.length; local351++) {
					if (local11.anIntArrayArray93[local351] != null && local317[local351] != null) {
						local371 = local11.anIntArrayArray93[local351][0];
						local378 = local11.anIntArrayArray93[local351][1];
						@Pc(385) int local385 = local11.anIntArrayArray93[local351][2];
						@Pc(392) int local392 = local11.anIntArrayArray93[local351][3];
						@Pc(399) int local399 = local11.anIntArrayArray93[local351][4];
						@Pc(406) int local406 = local11.anIntArrayArray93[local351][5];
						if (local392 != 0 || local399 != 0 || local406 != 0) {
							local317[local351].method4916(local399, local406, local392);
						}
						if (local371 != 0 || local378 != 0 || local385 != 0) {
							local317[local351].method4917(local385, local378, local371);
						}
					}
				}
			}
			if (arg2 != null) {
				local280 = local9 | 0x4000;
			}
			@Pc(465) Class212 local465 = new Class212(local317, local317.length);
			local7 = arg1.method8161(local465, local280, Static569.anInt9335, 64, 850);
			if (arg2 != null) {
				for (local371 = 0; local371 < 5; local371++) {
					for (local378 = 0; local378 < Static260.aShortArrayArrayArray1.length; local378++) {
						if (Static260.aShortArrayArrayArray1[local378][local371].length > arg2.anIntArray514[local371]) {
							local7.ia(Static97.aShortArrayArray2[local378][local371], Static260.aShortArrayArrayArray1[local378][local371][arg2.anIntArray514[local371]]);
						}
					}
				}
			}
			if (Static571.aClass69_61 != null) {
				local7.s(local9);
				Static571.aClass69_61.method1917(local254, local7);
			}
		}
		if (arg7 == null || local95 == null) {
			return local7;
		} else {
			@Pc(548) Class193 local548 = local7.method6609((byte) 1, local9, true);
			local548.method6614(arg7.aBoolean453, local97, 0, local89, local95, local91, local93, arg5 - 1);
			return local548;
		}
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "([IIZI[I)J")
	private long method7946(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int[] arg3) {
		@Pc(12) long[] local12 = Class16_Sub6_Sub1.aLongArray17;
		@Pc(14) long local14 = -1L;
		@Pc(30) long local30 = local14 >>> 8 ^ local12[(int) (((long) (arg1 >> 8) ^ local14) & 0xFFL)];
		local14 = local30 >>> 8 ^ local12[(int) ((local30 ^ (long) arg1) & 0xFFL)];
		for (@Pc(46) int local46 = 0; local46 < arg3.length; local46++) {
			local14 = local14 >>> 8 ^ local12[(int) ((local14 ^ (long) (arg3[local46] >> 24)) & 0xFFL)];
			local14 = local12[(int) (((long) (arg3[local46] >> 16) ^ local14) & 0xFFL)] ^ local14 >>> 8;
			local14 = local14 >>> 8 ^ local12[(int) (((long) (arg3[local46] >> 8) ^ local14) & 0xFFL)];
			local14 = local12[(int) ((local14 ^ (long) arg3[local46]) & 0xFFL)] ^ local14 >>> 8;
		}
		if (arg0 != null) {
			for (@Pc(127) int local127 = 0; local127 < 5; local127++) {
				local14 = local12[(int) ((local14 ^ (long) arg0[local127]) & 0xFFL)] ^ local14 >>> 8;
			}
		}
		return local14 >>> 8 ^ local12[(int) ((local14 ^ (long) (arg2 ? 1 : 0)) & 0xFFL)];
	}
}
