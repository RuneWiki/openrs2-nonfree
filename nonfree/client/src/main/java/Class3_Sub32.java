import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nm")
public final class Class3_Sub32 extends Class3 {

	@OriginalMember(owner = "client!nm", name = "r", descriptor = "[I")
	public int[] anIntArray339 = new int[] { -1 };

	@OriginalMember(owner = "client!nm", name = "u", descriptor = "[I")
	public int[] anIntArray340 = new int[1];

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIZILclient!qo;Lclient!kf;ILclient!qa;II)Lclient!c;")
	public Class9 method3881(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class206 arg3, @OriginalArg(5) Class128 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class172 arg6, @OriginalArg(8) int arg7) {
		@Pc(7) Class9 local7 = null;
		@Pc(9) int local9 = 2048;
		@Pc(11) Class1 local11 = null;
		if (arg7 != -1) {
			local11 = Static432.aClass73_1.method1823(arg7);
		}
		@Pc(22) int[] local22 = this.anIntArray339;
		if (local11 != null && local11.anIntArray2 != null) {
			local22 = new int[local11.anIntArray2.length];
			for (@Pc(34) int local34 = 0; local34 < local11.anIntArray2.length; local34++) {
				@Pc(41) int local41 = local11.anIntArray2[local34];
				if (local41 >= 0 && local41 < this.anIntArray339.length) {
					local22[local34] = this.anIntArray339[local41];
				} else {
					local22[local34] = -1;
				}
			}
		}
		@Pc(80) boolean local80 = false;
		@Pc(90) boolean local90 = false;
		@Pc(92) boolean local92 = false;
		@Pc(94) boolean local94 = false;
		@Pc(96) int local96 = -1;
		@Pc(98) int local98 = -1;
		@Pc(100) int local100 = 0;
		@Pc(102) Class3_Sub4_Sub16 local102 = null;
		@Pc(104) Class3_Sub4_Sub16 local104 = null;
		if (arg4 != null) {
			local9 = 2080;
			local96 = arg4.anIntArray252[arg2];
			@Pc(119) int local119 = local96 >>> 16;
			local96 &= 0xFFFF;
			local102 = Static301.aClass170_3.method3928(local119);
			if (local102 != null) {
				local90 = local102.method5870(local96) | false;
				local80 = local102.method5872(local96) | false;
				local94 = local102.method5868(local96) | false;
				local92 = arg4.aBoolean343 | false;
			}
			if ((arg4.aBoolean342 || Static262.aBoolean439) && arg0 != -1 && arg0 < arg4.anIntArray252.length) {
				local98 = arg4.anIntArray252[arg0];
				local100 = arg4.anIntArray254[arg2];
				@Pc(187) int local187 = local98 >>> 16;
				local98 &= 0xFFFF;
				if (local119 == local187) {
					local104 = local102;
				} else {
					local104 = Static301.aClass170_3.method3928(local98 >>> 16);
				}
				if (local104 != null) {
					local90 |= local104.method5870(local98);
					local80 |= local104.method5872(local98);
					local94 |= local104.method5868(local98);
				}
			}
			if (local90) {
				local9 = 2208;
			}
			if (local80) {
				local9 |= 0x100;
			}
			if (local92) {
				local9 |= 0x200;
			}
			if (local94) {
				local9 |= 0x400;
			}
		}
		@Pc(268) long local268 = this.method3883(local22, arg1, arg3 == null ? null : arg3.anIntArray378, arg7);
		if (Static257.aClass126_29 != null) {
			local7 = (Class9) Static257.aClass126_29.method3141(local268);
		}
		if (local7 == null || arg6.method5501(local7.n(), local9) != 0) {
			if (local7 != null) {
				local9 = arg6.method5492(local9, local7.n());
			}
			@Pc(294) int local294 = local9;
			@Pc(296) boolean local296 = false;
			for (@Pc(298) int local298 = 0; local298 < local22.length; local298++) {
				if (local22[local298] != -1 && !Static314.aClass12_2.method327(local22[local298]).method1943(arg1)) {
					local296 = true;
				}
			}
			if (local296) {
				return null;
			}
			@Pc(334) Class161[] local334 = new Class161[local22.length];
			for (@Pc(336) int local336 = 0; local336 < local22.length; local336++) {
				if (local22[local336] != -1) {
					local334[local336] = Static314.aClass12_2.method327(local22[local336]).method1936(arg1);
				}
			}
			@Pc(387) int local387;
			if (local11 != null && local11.anIntArrayArray1 != null) {
				for (@Pc(367) int local367 = 0; local367 < local11.anIntArrayArray1.length; local367++) {
					if (local11.anIntArrayArray1[local367] != null && local334[local367] != null) {
						local387 = local11.anIntArrayArray1[local367][0];
						@Pc(394) int local394 = local11.anIntArrayArray1[local367][1];
						@Pc(401) int local401 = local11.anIntArrayArray1[local367][2];
						@Pc(408) int local408 = local11.anIntArrayArray1[local367][3];
						@Pc(415) int local415 = local11.anIntArrayArray1[local367][4];
						@Pc(422) int local422 = local11.anIntArrayArray1[local367][5];
						if (local408 != 0 || local415 != 0 || local422 != 0) {
							local334[local367].method3820(local408, local415, local422);
						}
						if (local387 != 0 || local394 != 0 || local401 != 0) {
							local334[local367].method3829(local387, local401, local394);
						}
					}
				}
			}
			if (arg3 != null) {
				local294 = local9 | 0x4000;
			}
			@Pc(478) Class161 local478 = new Class161(local334, local334.length);
			local7 = arg6.method5537(local478, local294, Static55.anInt1481, 64, 850);
			if (arg3 != null) {
				for (local387 = 0; local387 < 5; local387++) {
					if (Static109.aShortArrayArray1[local387].length > arg3.anIntArray378[local387]) {
						local7.N(Static293.aShortArray92[local387], Static109.aShortArrayArray1[local387][arg3.anIntArray378[local387]]);
					}
					if (Static251.aShortArrayArray3[local387].length > arg3.anIntArray378[local387]) {
						local7.N(Static331.aShortArray158[local387], Static251.aShortArrayArray3[local387][arg3.anIntArray378[local387]]);
					}
				}
			}
			if (Static257.aClass126_29 != null) {
				local7.u(local9);
				Static257.aClass126_29.method3132(local268, local7);
			}
		}
		if (arg4 == null || local102 == null) {
			return local7;
		} else {
			@Pc(566) Class9 local566 = local7.method5699((byte) 1, local9, true);
			local566.method5691(local102, arg4.aBoolean343, local104, local100, local96, arg5 - 1, 0, local98);
			return local566;
		}
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "([IZI[II)J")
	private long method3883(@OriginalArg(0) int[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		@Pc(7) long[] local7 = Class104.aLongArray4;
		@Pc(9) long local9 = -1L;
		@Pc(25) long local25 = local7[(int) ((local9 ^ (long) (arg3 >> 8)) & 0xFFL)] ^ local9 >>> 8;
		local9 = local25 >>> 8 ^ local7[(int) ((local25 ^ (long) arg3) & 0xFFL)];
		for (@Pc(41) int local41 = 0; local41 < arg0.length; local41++) {
			local9 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) (arg0[local41] >> 24)) & 0xFFL)];
			local9 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) (arg0[local41] >> 16)) & 0xFFL)];
			local9 = local7[(int) ((local9 ^ (long) (arg0[local41] >> 8)) & 0xFFL)] ^ local9 >>> 8;
			local9 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) arg0[local41]) & 0xFFL)];
		}
		if (arg2 != null) {
			for (@Pc(122) int local122 = 0; local122 < 5; local122++) {
				local9 = local7[(int) ((local9 ^ (long) arg2[local122]) & 0xFFL)] ^ local9 >>> 8;
			}
		}
		return local7[(int) ((local9 ^ (long) (arg1 ? 1 : 0)) & 0xFFL)] ^ local9 >>> 8;
	}
}
