import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!st")
public final class Class4_Sub38 extends Class4 {

	@OriginalMember(owner = "client!st", name = "t", descriptor = "[I")
	public int[] anIntArray541 = new int[1];

	@OriginalMember(owner = "client!st", name = "p", descriptor = "[I")
	public int[] anIntArray540 = new int[] { -1 };

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(IIZILclient!kg;IIBLclient!qa;Lclient!gv;)Lclient!ka;")
	public Class57 method5415(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class130 arg4, @OriginalArg(6) int arg5, @OriginalArg(8) Class30 arg6, @OriginalArg(9) Class90 arg7) {
		@Pc(7) Class57 local7 = null;
		@Pc(9) int local9 = 2048;
		@Pc(11) Class231 local11 = null;
		if (arg0 != -1) {
			local11 = Static123.aClass223_1.method5135(arg0);
		}
		@Pc(22) int[] local22 = this.anIntArray540;
		if (local11 != null && local11.anIntArray515 != null) {
			local22 = new int[local11.anIntArray515.length];
			for (@Pc(34) int local34 = 0; local34 < local11.anIntArray515.length; local34++) {
				@Pc(41) int local41 = local11.anIntArray515[local34];
				if (local41 >= 0 && this.anIntArray540.length > local41) {
					local22[local34] = this.anIntArray540[local41];
				} else {
					local22[local34] = -1;
				}
			}
		}
		@Pc(76) boolean local76 = false;
		@Pc(78) boolean local78 = false;
		@Pc(80) boolean local80 = false;
		@Pc(82) boolean local82 = false;
		@Pc(84) int local84 = -1;
		@Pc(86) int local86 = -1;
		@Pc(88) int local88 = 0;
		@Pc(90) Class4_Sub1_Sub17 local90 = null;
		@Pc(92) Class4_Sub1_Sub17 local92 = null;
		if (arg4 != null) {
			local84 = arg4.anIntArray306[arg5];
			local9 = 2080;
			@Pc(107) int local107 = local84 >>> 16;
			local90 = Static143.aClass85_1.method2403(local107);
			local84 &= 0xFFFF;
			if (local90 != null) {
				local78 = local90.method5227(local84) | false;
				local76 = local90.method5223(local84) | false;
				local82 = local90.method5221(local84) | false;
				local80 = arg4.aBoolean246 | false;
			}
			if ((arg4.aBoolean247 || Static198.aBoolean245) && arg3 != -1 && arg4.anIntArray306.length > arg3) {
				local86 = arg4.anIntArray306[arg3];
				local88 = arg4.anIntArray308[arg5];
				@Pc(172) int local172 = local86 >>> 16;
				local86 &= 0xFFFF;
				if (local172 == local107) {
					local92 = local90;
				} else {
					local92 = Static143.aClass85_1.method2403(local86 >>> 16);
				}
				if (local92 != null) {
					local78 |= local92.method5227(local86);
					local76 |= local92.method5223(local86);
					local82 |= local92.method5221(local86);
				}
			}
			if (local78) {
				local9 = 2208;
			}
			if (local76) {
				local9 |= 0x100;
			}
			if (local80) {
				local9 |= 0x200;
			}
			if (local82) {
				local9 |= 0x400;
			}
		}
		@Pc(249) long local249 = this.method5416(arg2, local22, arg0, arg7 == null ? null : arg7.anIntArray242);
		if (Static298.aClass83_39 != null) {
			local7 = (Class57) Static298.aClass83_39.method2338(local249);
		}
		if (local7 == null || arg6.method2065(local7.ma(), local9) != 0) {
			if (local7 != null) {
				local9 = arg6.method2102(local9, local7.ma());
			}
			@Pc(283) int local283 = local9;
			@Pc(285) boolean local285 = false;
			for (@Pc(287) int local287 = 0; local287 < local22.length; local287++) {
				if (local22[local287] != -1 && !Static139.aClass193_1.method4650(local22[local287]).method6265(arg2)) {
					local285 = true;
				}
			}
			if (local285) {
				return null;
			}
			@Pc(320) Class37[] local320 = new Class37[local22.length];
			for (@Pc(322) int local322 = 0; local322 < local22.length; local322++) {
				if (local22[local322] != -1) {
					local320[local322] = Static139.aClass193_1.method4650(local22[local322]).method6268(arg2);
				}
			}
			@Pc(373) int local373;
			if (local11 != null && local11.anIntArrayArray45 != null) {
				for (@Pc(353) int local353 = 0; local353 < local11.anIntArrayArray45.length; local353++) {
					if (local11.anIntArrayArray45[local353] != null && local320[local353] != null) {
						local373 = local11.anIntArrayArray45[local353][0];
						@Pc(380) int local380 = local11.anIntArrayArray45[local353][1];
						@Pc(387) int local387 = local11.anIntArrayArray45[local353][2];
						@Pc(394) int local394 = local11.anIntArrayArray45[local353][3];
						@Pc(401) int local401 = local11.anIntArrayArray45[local353][4];
						@Pc(408) int local408 = local11.anIntArrayArray45[local353][5];
						if (local394 != 0 || local401 != 0 || local408 != 0) {
							local320[local353].method1002(local408, local394, local401);
						}
						if (local373 != 0 || local380 != 0 || local387 != 0) {
							local320[local353].method1008(local380, local387, local373);
						}
					}
				}
			}
			@Pc(455) Class37 local455 = new Class37(local320, local320.length);
			if (arg7 != null) {
				local283 = local9 | 0x4000;
			}
			local7 = arg6.method2036(local455, local283, Static456.anInt7802, 64, 850);
			if (arg7 != null) {
				for (local373 = 0; local373 < 5; local373++) {
					if (arg7.anIntArray242[local373] < Static220.aShortArrayArray5[local373].length) {
						local7.i(Static117.aShortArray77[local373], Static220.aShortArrayArray5[local373][arg7.anIntArray242[local373]]);
					}
					if (arg7.anIntArray242[local373] < Static160.aShortArrayArray3[local373].length) {
						local7.i(Static411.aShortArray101[local373], Static160.aShortArrayArray3[local373][arg7.anIntArray242[local373]]);
					}
				}
			}
			if (Static298.aClass83_39 != null) {
				local7.B(local9);
				Static298.aClass83_39.method2337(local7, local249);
			}
		}
		if (arg4 == null || local90 == null) {
			return local7;
		} else {
			@Pc(545) Class57 local545 = local7.method6075((byte) 1, local9, true);
			local545.method6077(local86, 0, local88, arg1 - 1, local90, arg4.aBoolean246, local92, local84);
			return local545;
		}
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(BZ[II[I)J")
	private long method5416(@OriginalArg(1) boolean arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		@Pc(7) long[] local7 = Class150.aLongArray5;
		@Pc(9) long local9 = -1L;
		@Pc(25) long local25 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) (arg2 >> 8)) & 0xFFL)];
		local9 = local7[(int) (((long) arg2 ^ local25) & 0xFFL)] ^ local25 >>> 8;
		for (@Pc(41) int local41 = 0; local41 < arg1.length; local41++) {
			local9 = local9 >>> 8 ^ local7[(int) (((long) (arg1[local41] >> 24) ^ local9) & 0xFFL)];
			local9 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) (arg1[local41] >> 16)) & 0xFFL)];
			local9 = local9 >>> 8 ^ local7[(int) (((long) (arg1[local41] >> 8) ^ local9) & 0xFFL)];
			local9 = local7[(int) ((local9 ^ (long) arg1[local41]) & 0xFFL)] ^ local9 >>> 8;
		}
		if (arg3 != null) {
			for (@Pc(137) int local137 = 0; local137 < 5; local137++) {
				local9 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) arg3[local137]) & 0xFFL)];
			}
		}
		return local7[(int) (((long) (arg0 ? 1 : 0) ^ local9) & 0xFFL)] ^ local9 >>> 8;
	}
}
