import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public final class Class12_Sub23 extends Class12 {

	@OriginalMember(owner = "client!ib", name = "n", descriptor = "[I")
	public int[] anIntArray334 = new int[1];

	@OriginalMember(owner = "client!ib", name = "m", descriptor = "[I")
	public int[] anIntArray333 = new int[] { -1 };

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIZBILclient!qa;ILclient!dba;ILclient!co;)Lclient!r;")
	public Class26 method3787(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class42 arg4, @OriginalArg(7) Class64 arg5, @OriginalArg(8) int arg6, @OriginalArg(9) Class58 arg7) {
		@Pc(7) Class26 local7 = null;
		@Pc(9) int local9 = 2048;
		@Pc(11) Class166 local11 = null;
		if (arg1 != -1) {
			local11 = Static218.aClass160_1.method4121(arg1);
		}
		@Pc(22) int[] local22 = this.anIntArray333;
		if (local11 != null && local11.anIntArray352 != null) {
			local22 = new int[local11.anIntArray352.length];
			for (@Pc(34) int local34 = 0; local34 < local11.anIntArray352.length; local34++) {
				@Pc(41) int local41 = local11.anIntArray352[local34];
				if (local41 >= 0 && this.anIntArray333.length > local41) {
					local22[local34] = this.anIntArray333[local41];
				} else {
					local22[local34] = -1;
				}
			}
		}
		@Pc(80) boolean local80 = false;
		@Pc(82) boolean local82 = false;
		@Pc(84) boolean local84 = false;
		@Pc(86) boolean local86 = false;
		@Pc(88) int local88 = -1;
		@Pc(90) int local90 = -1;
		@Pc(92) int local92 = 0;
		@Pc(99) Class12_Sub4_Sub13 local99 = null;
		@Pc(101) Class12_Sub4_Sub13 local101 = null;
		if (arg5 != null) {
			local9 = 2080;
			local88 = arg5.anIntArray185[arg6];
			@Pc(116) int local116 = local88 >>> 16;
			local88 &= 0xFFFF;
			local99 = Static47.aClass41_1.method910(local116);
			if (local99 != null) {
				local82 = local99.method5401(local88) | false;
				local80 = local99.method5402(local88) | false;
				local86 = local99.method5403(local88) | false;
				local84 = arg5.aBoolean138 | false;
			}
			if ((arg5.aBoolean139 || Static358.aBoolean490) && arg0 != -1 && arg5.anIntArray185.length > arg0) {
				local92 = arg5.anIntArray184[arg6];
				local90 = arg5.anIntArray185[arg0];
				@Pc(181) int local181 = local90 >>> 16;
				local90 &= 0xFFFF;
				if (local181 == local116) {
					local101 = local99;
				} else {
					local101 = Static47.aClass41_1.method910(local90 >>> 16);
				}
				if (local101 != null) {
					local82 |= local101.method5401(local90);
					local80 |= local101.method5402(local90);
					local86 |= local101.method5403(local90);
				}
			}
			if (local82) {
				local9 = 2208;
			}
			if (local80) {
				local9 |= 0x100;
			}
			if (local84) {
				local9 |= 0x200;
			}
			if (local86) {
				local9 |= 0x400;
			}
		}
		@Pc(258) long local258 = this.method3789(arg2, arg1, arg7 == null ? null : arg7.anIntArray178, local22);
		if (Static389.aClass125_52 != null) {
			local7 = (Class26) Static389.aClass125_52.method3446(local258);
		}
		if (local7 == null || arg4.method5857(local7.ba(), local9) != 0) {
			if (local7 != null) {
				local9 = arg4.method5820(local9, local7.ba());
			}
			@Pc(287) int local287 = local9;
			@Pc(289) boolean local289 = false;
			for (@Pc(291) int local291 = 0; local291 < local22.length; local291++) {
				if (local22[local291] != -1 && !Static150.aClass254_2.method6340(local22[local291]).method1562(arg2)) {
					local289 = true;
				}
			}
			if (local289) {
				return null;
			}
			@Pc(324) Class192[] local324 = new Class192[local22.length];
			for (@Pc(326) int local326 = 0; local326 < local22.length; local326++) {
				if (local22[local326] != -1) {
					local324[local326] = Static150.aClass254_2.method6340(local22[local326]).method1565(arg2);
				}
			}
			@Pc(382) int local382;
			if (local11 != null && local11.anIntArrayArray48 != null) {
				for (@Pc(362) int local362 = 0; local362 < local11.anIntArrayArray48.length; local362++) {
					if (local11.anIntArrayArray48[local362] != null && local324[local362] != null) {
						local382 = local11.anIntArrayArray48[local362][0];
						@Pc(389) int local389 = local11.anIntArrayArray48[local362][1];
						@Pc(396) int local396 = local11.anIntArrayArray48[local362][2];
						@Pc(403) int local403 = local11.anIntArrayArray48[local362][3];
						@Pc(410) int local410 = local11.anIntArrayArray48[local362][4];
						@Pc(417) int local417 = local11.anIntArrayArray48[local362][5];
						if (local403 != 0 || local410 != 0 || local417 != 0) {
							local324[local362].method4665(local417, local410, local403);
						}
						if (local382 != 0 || local389 != 0 || local396 != 0) {
							local324[local362].method4662(local396, local389, local382);
						}
					}
				}
			}
			@Pc(473) Class192 local473 = new Class192(local324, local324.length);
			if (arg7 != null) {
				local287 = local9 | 0x4000;
			}
			local7 = arg4.method5812(local473, local287, Static460.anInt7980, 64, 850);
			if (arg7 != null) {
				for (local382 = 0; local382 < 5; local382++) {
					if (arg7.anIntArray178[local382] < Static468.aShortArrayArray10[local382].length) {
						local7.pa(Static516.aShortArray136[local382], Static468.aShortArrayArray10[local382][arg7.anIntArray178[local382]]);
					}
					if (arg7.anIntArray178[local382] < Static350.aShortArrayArray5[local382].length) {
						local7.pa(Static437.aShortArray106[local382], Static350.aShortArrayArray5[local382][arg7.anIntArray178[local382]]);
					}
				}
			}
			if (Static389.aClass125_52 != null) {
				local7.m(local9);
				Static389.aClass125_52.method3437(local7, local258);
			}
		}
		if (arg5 == null || local99 == null) {
			return local7;
		} else {
			@Pc(567) Class26 local567 = local7.method7992((byte) 1, local9, true);
			local567.method8001(0, local101, arg5.aBoolean138, local99, local88, local92, local90, arg3 - 1);
			return local567;
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZI[II[I)J")
	private long method3789(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int[] arg3) {
		@Pc(7) long[] local7 = Class57.aLongArray22;
		@Pc(9) long local9 = -1L;
		@Pc(25) long local25 = local7[(int) ((local9 ^ (long) (arg1 >> 8)) & 0xFFL)] ^ local9 >>> 8;
		local9 = local7[(int) (((long) arg1 ^ local25) & 0xFFL)] ^ local25 >>> 8;
		for (@Pc(46) int local46 = 0; local46 < arg3.length; local46++) {
			local9 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) (arg3[local46] >> 24)) & 0xFFL)];
			local9 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) (arg3[local46] >> 16)) & 0xFFL)];
			local9 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) (arg3[local46] >> 8)) & 0xFFL)];
			local9 = local7[(int) ((local9 ^ (long) arg3[local46]) & 0xFFL)] ^ local9 >>> 8;
		}
		if (arg2 != null) {
			for (@Pc(127) int local127 = 0; local127 < 5; local127++) {
				local9 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) arg2[local127]) & 0xFFL)];
			}
		}
		return local7[(int) ((local9 ^ (long) (arg0 ? 1 : 0)) & 0xFFL)] ^ local9 >>> 8;
	}
}
