import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!es")
public final class Class6_Sub16 extends Class6 {

	@OriginalMember(owner = "client!es", name = "o", descriptor = "[I")
	public int[] anIntArray171 = new int[] { -1 };

	@OriginalMember(owner = "client!es", name = "t", descriptor = "[I")
	public int[] anIntArray173 = new int[1];

	@OriginalMember(owner = "client!es", name = "a", descriptor = "([I[IZII)J")
	private long method2250(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		@Pc(7) long[] local7 = Class337.aLongArray15;
		@Pc(9) long local9 = -1L;
		@Pc(25) long local25 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) (arg3 >> 8)) & 0xFFL)];
		local9 = local25 >>> 8 ^ local7[(int) (((long) arg3 ^ local25) & 0xFFL)];
		for (@Pc(46) int local46 = 0; local46 < arg0.length; local46++) {
			local9 = local7[(int) (((long) (arg0[local46] >> 24) ^ local9) & 0xFFL)] ^ local9 >>> 8;
			local9 = local7[(int) ((local9 ^ (long) (arg0[local46] >> 16)) & 0xFFL)] ^ local9 >>> 8;
			local9 = local7[(int) ((local9 ^ (long) (arg0[local46] >> 8)) & 0xFFL)] ^ local9 >>> 8;
			local9 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) arg0[local46]) & 0xFFL)];
		}
		if (arg1 != null) {
			for (@Pc(127) int local127 = 0; local127 < 5; local127++) {
				local9 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) arg1[local127]) & 0xFFL)];
			}
		}
		return local7[(int) ((local9 ^ (long) (arg2 ? 1 : 0)) & 0xFFL)] ^ local9 >>> 8;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(Lclient!ah;Lclient!ha;ILclient!ao;IIIIZI)Lclient!ka;")
	public Class24 method2252(@OriginalArg(0) Class12 arg0, @OriginalArg(1) Class100 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class21 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(8) boolean arg6, @OriginalArg(9) int arg7) {
		@Pc(7) Class24 local7 = null;
		@Pc(9) int local9 = 2048;
		@Pc(11) Class201 local11 = null;
		if (arg7 != -1) {
			local11 = Static511.aClass34_1.method803(arg7);
		}
		@Pc(23) int[] local23 = this.anIntArray171;
		if (local11 != null && local11.anIntArray377 != null) {
			local23 = new int[local11.anIntArray377.length];
			for (@Pc(35) int local35 = 0; local35 < local11.anIntArray377.length; local35++) {
				@Pc(42) int local42 = local11.anIntArray377[local35];
				if (local42 >= 0 && local42 < this.anIntArray171.length) {
					local23[local35] = this.anIntArray171[local42];
				} else {
					local23[local35] = -1;
				}
			}
		}
		@Pc(78) boolean local78 = false;
		@Pc(80) boolean local80 = false;
		@Pc(90) boolean local90 = false;
		@Pc(92) boolean local92 = false;
		@Pc(94) int local94 = -1;
		@Pc(96) int local96 = -1;
		@Pc(98) int local98 = 0;
		@Pc(100) Class6_Sub2_Sub1 local100 = null;
		@Pc(102) Class6_Sub2_Sub1 local102 = null;
		if (arg3 != null) {
			local9 = 2080;
			local94 = arg3.anIntArray15[arg5];
			@Pc(117) int local117 = local94 >>> 16;
			local100 = Static294.aClass373_2.method8741(local117);
			local94 &= 0xFFFF;
			if (local100 != null) {
				local80 = local100.method192(local94) | false;
				local78 = local100.method190(local94) | false;
				local92 = local100.method191(local94) | false;
				local90 = arg3.aBoolean12 | false;
			}
			if ((arg3.aBoolean13 || Static43.aBoolean46) && arg4 != -1 && arg3.anIntArray15.length > arg4) {
				local96 = arg3.anIntArray15[arg4];
				local98 = arg3.anIntArray17[arg5];
				@Pc(185) int local185 = local96 >>> 16;
				local96 &= 0xFFFF;
				if (local117 == local185) {
					local102 = local100;
				} else {
					local102 = Static294.aClass373_2.method8741(local96 >>> 16);
				}
				if (local102 != null) {
					local80 |= local102.method192(local96);
					local78 |= local102.method190(local96);
					local92 |= local102.method191(local96);
				}
			}
			if (local80) {
				local9 = 2208;
			}
			if (local78) {
				local9 |= 0x100;
			}
			if (local90) {
				local9 |= 0x200;
			}
			if (local92) {
				local9 |= 0x400;
			}
		}
		@Pc(262) long local262 = this.method2250(local23, arg0 == null ? null : arg0.anIntArray7, arg6, arg7);
		if (Static385.aClass166_36 != null) {
			local7 = (Class24) Static385.aClass166_36.method4805(local262);
		}
		if (local7 == null || arg1.method8821(local7.ua(), local9) != 0) {
			if (local7 != null) {
				local9 = arg1.method8820(local9, local7.ua());
			}
			@Pc(288) int local288 = local9;
			@Pc(290) boolean local290 = false;
			for (@Pc(292) int local292 = 0; local292 < local23.length; local292++) {
				if (local23[local292] != -1 && !Static266.aClass138_1.method3730(local23[local292]).method8237(arg6)) {
					local290 = true;
				}
			}
			if (local290) {
				return null;
			}
			@Pc(328) Class64[] local328 = new Class64[local23.length];
			for (@Pc(330) int local330 = 0; local330 < local23.length; local330++) {
				if (local23[local330] != -1) {
					local328[local330] = Static266.aClass138_1.method3730(local23[local330]).method8250(arg6);
				}
			}
			@Pc(385) int local385;
			@Pc(392) int local392;
			if (local11 != null && local11.anIntArrayArray25 != null) {
				for (@Pc(365) int local365 = 0; local365 < local11.anIntArrayArray25.length; local365++) {
					if (local11.anIntArrayArray25[local365] != null && local328[local365] != null) {
						local385 = local11.anIntArrayArray25[local365][0];
						local392 = local11.anIntArrayArray25[local365][1];
						@Pc(399) int local399 = local11.anIntArrayArray25[local365][2];
						@Pc(406) int local406 = local11.anIntArrayArray25[local365][3];
						@Pc(413) int local413 = local11.anIntArrayArray25[local365][4];
						@Pc(420) int local420 = local11.anIntArrayArray25[local365][5];
						if (local406 != 0 || local413 != 0 || local420 != 0) {
							local328[local365].method1657(local420, local406, local413);
						}
						if (local385 != 0 || local392 != 0 || local399 != 0) {
							local328[local365].method1650(local392, local385, local399);
						}
					}
				}
			}
			if (arg0 != null) {
				local288 = local9 | 0x4000;
			}
			@Pc(483) Class64 local483 = new Class64(local328, local328.length);
			local7 = arg1.method8770(local483, local288, Static286.anInt5670, 64, 850);
			if (arg0 != null) {
				for (local385 = 0; local385 < 5; local385++) {
					for (local392 = 0; local392 < Static47.aShortArrayArrayArray1.length; local392++) {
						if (Static47.aShortArrayArrayArray1[local392][local385].length > arg0.anIntArray7[local385]) {
							local7.ia(Static472.aShortArrayArray18[local392][local385], Static47.aShortArrayArrayArray1[local392][local385][arg0.anIntArray7[local385]]);
						}
					}
				}
			}
			if (Static385.aClass166_36 != null) {
				local7.s(local9);
				Static385.aClass166_36.method4803(local7, local262);
			}
		}
		if (arg3 == null || local100 == null) {
			return local7;
		} else {
			@Pc(566) Class24 local566 = local7.method6850((byte) 1, local9, true);
			local566.method6857(local96, local102, local94, local98, local100, arg3.aBoolean12, arg2 - 1, 0);
			return local566;
		}
	}
}
