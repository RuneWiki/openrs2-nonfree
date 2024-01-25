import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wi")
public final class Class1_Sub43 extends Class1 {

	@OriginalMember(owner = "client!wi", name = "n", descriptor = "[I")
	public int[] anIntArray506 = new int[1];

	@OriginalMember(owner = "client!wi", name = "r", descriptor = "[I")
	public int[] anIntArray507 = new int[] { -1 };

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "([II[IZI)J")
	private long method5852(@OriginalArg(0) int[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(7) long[] local7 = Class109.aLongArray6;
		@Pc(9) long local9 = -1L;
		@Pc(25) long local25 = local7[(int) ((local9 ^ (long) (arg3 >> 8)) & 0xFFL)] ^ local9 >>> 8;
		local9 = local25 >>> 8 ^ local7[(int) (((long) arg3 ^ local25) & 0xFFL)];
		for (@Pc(41) int local41 = 0; local41 < arg0.length; local41++) {
			local9 = local7[(int) ((local9 ^ (long) (arg0[local41] >> 24)) & 0xFFL)] ^ local9 >>> 8;
			local9 = local7[(int) (((long) (arg0[local41] >> 16) ^ local9) & 0xFFL)] ^ local9 >>> 8;
			local9 = local7[(int) ((local9 ^ (long) (arg0[local41] >> 8)) & 0xFFL)] ^ local9 >>> 8;
			local9 = local7[(int) ((local9 ^ (long) arg0[local41]) & 0xFFL)] ^ local9 >>> 8;
		}
		if (arg1 != null) {
			for (@Pc(122) int local122 = 0; local122 < 5; local122++) {
				local9 = local7[(int) ((local9 ^ (long) arg1[local122]) & 0xFFL)] ^ local9 >>> 8;
			}
		}
		return local9 >>> 8 ^ local7[(int) ((local9 ^ (long) (arg2 ? 1 : 0)) & 0xFFL)];
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lclient!oj;IIILclient!za;ILclient!oe;IIZ)Lclient!e;")
	public Class57 method5853(@OriginalArg(0) Class177 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class34 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class173 arg6, @OriginalArg(9) boolean arg7) {
		@Pc(7) Class57 local7 = null;
		@Pc(9) int local9 = 2048;
		@Pc(11) Class236 local11 = null;
		if (arg1 != -1) {
			local11 = Static291.aClass21_1.method396(arg1);
		}
		@Pc(23) int[] local23 = this.anIntArray507;
		if (local11 != null && local11.anIntArray433 != null) {
			local23 = new int[local11.anIntArray433.length];
			for (@Pc(35) int local35 = 0; local35 < local11.anIntArray433.length; local35++) {
				@Pc(42) int local42 = local11.anIntArray433[local35];
				if (local42 >= 0 && local42 < this.anIntArray507.length) {
					local23[local35] = this.anIntArray507[local42];
				} else {
					local23[local35] = -1;
				}
			}
		}
		@Pc(74) boolean local74 = false;
		@Pc(76) boolean local76 = false;
		@Pc(78) boolean local78 = false;
		@Pc(80) boolean local80 = false;
		@Pc(82) int local82 = -1;
		@Pc(84) int local84 = -1;
		@Pc(86) int local86 = 0;
		@Pc(88) Class1_Sub5_Sub2 local88 = null;
		@Pc(90) Class1_Sub5_Sub2 local90 = null;
		if (arg0 != null) {
			local82 = arg0.anIntArray326[arg2];
			local9 = 2080;
			@Pc(105) int local105 = local82 >>> 16;
			local88 = Static174.aClass254_1.method5672(local105);
			local82 &= 0xFFFF;
			if (local88 != null) {
				local76 = local88.method634(local82) | false;
				local74 = local88.method630(local82) | false;
				local80 = local88.method629(local82) | false;
				local78 = arg0.aBoolean576 | false;
			}
			if ((arg0.aBoolean573 || Static389.aBoolean713) && arg3 != -1 && arg0.anIntArray326.length > arg3) {
				local84 = arg0.anIntArray326[arg3];
				local86 = arg0.anIntArray327[arg2];
				@Pc(170) int local170 = local84 >>> 16;
				local84 &= 0xFFFF;
				if (local105 == local170) {
					local90 = local88;
				} else {
					local90 = Static174.aClass254_1.method5672(local84 >>> 16);
				}
				if (local90 != null) {
					local76 |= local90.method634(local84);
					local74 |= local90.method630(local84);
					local80 |= local90.method629(local84);
				}
			}
			if (local76) {
				local9 = 2208;
			}
			if (local74) {
				local9 |= 0x100;
			}
			if (local78) {
				local9 |= 0x200;
			}
			if (local80) {
				local9 |= 0x400;
			}
		}
		@Pc(255) long local255 = this.method5852(local23, arg6 == null ? null : arg6.anIntArray319, arg7, arg1);
		if (Static284.aClass102_36 != null) {
			local7 = (Class57) Static284.aClass102_36.method2258(local255);
		}
		if (local7 == null || arg4.method5783(local7.RA(), local9) != 0) {
			if (local7 != null) {
				local9 = arg4.method5787(local9, local7.RA());
			}
			@Pc(286) int local286 = local9;
			@Pc(288) boolean local288 = false;
			for (@Pc(290) int local290 = 0; local290 < local23.length; local290++) {
				if (local23[local290] != -1 && !Static342.aClass155_2.method3548(local23[local290]).method3693(arg7)) {
					local288 = true;
				}
			}
			if (local288) {
				return null;
			}
			@Pc(322) Class193[] local322 = new Class193[local23.length];
			for (@Pc(324) int local324 = 0; local324 < local23.length; local324++) {
				if (local23[local324] != -1) {
					local322[local324] = Static342.aClass155_2.method3548(local23[local324]).method3711(arg7);
				}
			}
			@Pc(382) int local382;
			if (local11 != null && local11.anIntArrayArray60 != null) {
				for (@Pc(362) int local362 = 0; local362 < local11.anIntArrayArray60.length; local362++) {
					if (local11.anIntArrayArray60[local362] != null && local322[local362] != null) {
						local382 = local11.anIntArrayArray60[local362][0];
						@Pc(389) int local389 = local11.anIntArrayArray60[local362][1];
						@Pc(396) int local396 = local11.anIntArrayArray60[local362][2];
						@Pc(403) int local403 = local11.anIntArrayArray60[local362][3];
						@Pc(410) int local410 = local11.anIntArrayArray60[local362][4];
						@Pc(417) int local417 = local11.anIntArrayArray60[local362][5];
						if (local403 != 0 || local410 != 0 || local417 != 0) {
							local322[local362].method4253(local403, local410, local417);
						}
						if (local382 != 0 || local389 != 0 || local396 != 0) {
							local322[local362].method4262(local382, local396, local389);
						}
					}
				}
			}
			@Pc(464) Class193 local464 = new Class193(local322, local322.length);
			if (arg6 != null) {
				local286 = local9 | 0x4000;
			}
			local7 = arg4.method5792(local464, local286, Static67.anInt1245, 64, 850);
			if (arg6 != null) {
				for (local382 = 0; local382 < 5; local382++) {
					if (Static452.aShortArrayArray13[local382].length > arg6.anIntArray319[local382]) {
						local7.q(Static220.aShortArray62[local382], Static452.aShortArrayArray13[local382][arg6.anIntArray319[local382]]);
					}
					if (Static28.aShortArrayArray1[local382].length > arg6.anIntArray319[local382]) {
						local7.q(Static166.aShortArray47[local382], Static28.aShortArrayArray1[local382][arg6.anIntArray319[local382]]);
					}
				}
			}
			if (Static284.aClass102_36 != null) {
				local7.D(local9);
				Static284.aClass102_36.method2272(local255, local7);
			}
		}
		if (arg0 == null || local88 == null) {
			return local7;
		} else {
			@Pc(558) Class57 local558 = local7.method5966((byte) 1, local9, true);
			local558.method5962(local88, 0, local86, arg5 - 1, local84, local82, arg0.aBoolean576, local90);
			return local558;
		}
	}
}
