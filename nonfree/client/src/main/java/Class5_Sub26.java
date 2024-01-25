import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lh")
public final class Class5_Sub26 extends Class5 {

	@OriginalMember(owner = "client!lh", name = "l", descriptor = "[I")
	public int[] anIntArray247 = new int[] { -1 };

	@OriginalMember(owner = "client!lh", name = "n", descriptor = "[I")
	public int[] anIntArray249 = new int[1];

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(I[IZZ[I)J")
	private long method3053(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int[] arg3) {
		@Pc(7) long[] local7 = Class5_Sub2.aLongArray38;
		@Pc(9) long local9 = -1L;
		@Pc(25) long local25 = local9 >>> 8 ^ local7[(int) (((long) (arg0 >> 8) ^ local9) & 0xFFL)];
		local9 = local7[(int) (((long) arg0 ^ local25) & 0xFFL)] ^ local25 >>> 8;
		for (@Pc(46) int local46 = 0; local46 < arg1.length; local46++) {
			local9 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) (arg1[local46] >> 24)) & 0xFFL)];
			local9 = local7[(int) ((local9 ^ (long) (arg1[local46] >> 16)) & 0xFFL)] ^ local9 >>> 8;
			local9 = local9 >>> 8 ^ local7[(int) (((long) (arg1[local46] >> 8) ^ local9) & 0xFFL)];
			local9 = local7[(int) (((long) arg1[local46] ^ local9) & 0xFFL)] ^ local9 >>> 8;
		}
		if (arg3 != null) {
			for (@Pc(131) int local131 = 0; local131 < 5; local131++) {
				local9 = local7[(int) (((long) arg3[local131] ^ local9) & 0xFFL)] ^ local9 >>> 8;
			}
		}
		return local9 >>> 8 ^ local7[(int) (((long) (arg2 ? 1 : 0) ^ local9) & 0xFFL)];
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(ZILclient!wq;Lclient!kt;Lclient!za;IIIII)Lclient!e;")
	public Class57 method3055(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class270 arg1, @OriginalArg(3) Class143 arg2, @OriginalArg(4) Class200 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(9) int arg7) {
		@Pc(7) Class57 local7 = null;
		@Pc(9) int local9 = 2048;
		@Pc(11) Class133 local11 = null;
		if (arg6 != -1) {
			local11 = Static27.aClass149_1.method3043(arg6);
		}
		@Pc(23) int[] local23 = this.anIntArray247;
		if (local11 != null && local11.anIntArray216 != null) {
			local23 = new int[local11.anIntArray216.length];
			for (@Pc(35) int local35 = 0; local35 < local11.anIntArray216.length; local35++) {
				@Pc(42) int local42 = local11.anIntArray216[local35];
				if (local42 >= 0 && this.anIntArray247.length > local42) {
					local23[local35] = this.anIntArray247[local42];
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
		@Pc(95) Class5_Sub2_Sub6 local95 = null;
		@Pc(97) Class5_Sub2_Sub6 local97 = null;
		if (arg2 != null) {
			local89 = arg2.anIntArray241[arg7];
			local9 = 2080;
			@Pc(112) int local112 = local89 >>> 16;
			local89 &= 0xFFFF;
			local95 = Static271.aClass219_4.method4756(local112);
			if (local95 != null) {
				local83 = local95.method2002(local89) | false;
				local81 = local95.method2000(local89) | false;
				local87 = local95.method1999(local89) | false;
				local85 = arg2.aBoolean243 | false;
			}
			if ((arg2.aBoolean245 || Static17.aBoolean33) && arg5 != -1 && arg2.anIntArray241.length > arg5) {
				local93 = arg2.anIntArray239[arg7];
				local91 = arg2.anIntArray241[arg5];
				@Pc(176) int local176 = local91 >>> 16;
				local91 &= 0xFFFF;
				if (local176 == local112) {
					local97 = local95;
				} else {
					local97 = Static271.aClass219_4.method4756(local91 >>> 16);
				}
				if (local97 != null) {
					local83 |= local97.method2002(local91);
					local81 |= local97.method2000(local91);
					local87 |= local97.method1999(local91);
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
		@Pc(255) long local255 = this.method3053(arg6, local23, arg0, arg1 == null ? null : arg1.anIntArray510);
		if (Static239.aClass44_62 != null) {
			local7 = (Class57) Static239.aClass44_62.method1028(local255);
		}
		if (local7 == null || arg3.method5860(local7.RA(), local9) != 0) {
			if (local7 != null) {
				local9 = arg3.method5879(local9, local7.RA());
			}
			@Pc(283) int local283 = local9;
			@Pc(285) boolean local285 = false;
			for (@Pc(287) int local287 = 0; local287 < local23.length; local287++) {
				if (local23[local287] != -1 && !Static306.aClass67_3.method1452(local23[local287]).method982(arg0)) {
					local285 = true;
				}
			}
			if (local285) {
				return null;
			}
			@Pc(319) Class74[] local319 = new Class74[local23.length];
			for (@Pc(321) int local321 = 0; local321 < local23.length; local321++) {
				if (local23[local321] != -1) {
					local319[local321] = Static306.aClass67_3.method1452(local23[local321]).method985(arg0);
				}
			}
			@Pc(372) int local372;
			if (local11 != null && local11.anIntArrayArray25 != null) {
				for (@Pc(352) int local352 = 0; local352 < local11.anIntArrayArray25.length; local352++) {
					if (local11.anIntArrayArray25[local352] != null && local319[local352] != null) {
						local372 = local11.anIntArrayArray25[local352][0];
						@Pc(379) int local379 = local11.anIntArrayArray25[local352][1];
						@Pc(386) int local386 = local11.anIntArrayArray25[local352][2];
						@Pc(393) int local393 = local11.anIntArrayArray25[local352][3];
						@Pc(400) int local400 = local11.anIntArrayArray25[local352][4];
						@Pc(407) int local407 = local11.anIntArrayArray25[local352][5];
						if (local393 != 0 || local400 != 0 || local407 != 0) {
							local319[local352].method1581(local393, local400, local407);
						}
						if (local372 != 0 || local379 != 0 || local386 != 0) {
							local319[local352].method1588(local386, local379, local372);
						}
					}
				}
			}
			if (arg1 != null) {
				local283 = local9 | 0x4000;
			}
			@Pc(472) Class74 local472 = new Class74(local319, local319.length);
			local7 = arg3.method5882(local472, local283, Static77.anInt1397, 64, 850);
			if (arg1 != null) {
				for (local372 = 0; local372 < 5; local372++) {
					if (Static227.aShortArrayArray9[local372].length > arg1.anIntArray510[local372]) {
						local7.q(Static262.aShortArray72[local372], Static227.aShortArrayArray9[local372][arg1.anIntArray510[local372]]);
					}
					if (Static391.aShortArrayArray14[local372].length > arg1.anIntArray510[local372]) {
						local7.q(Static89.aShortArray6[local372], Static391.aShortArrayArray14[local372][arg1.anIntArray510[local372]]);
					}
				}
			}
			if (Static239.aClass44_62 != null) {
				local7.D(local9);
				Static239.aClass44_62.method1017(local255, local7);
			}
		}
		if (arg2 == null || local95 == null) {
			return local7;
		} else {
			@Pc(569) Class57 local569 = local7.method6066((byte) 1, local9, true);
			local569.method6059(local97, arg2.aBoolean243, local95, arg4 - 1, local93, local91, local89, 0);
			return local569;
		}
	}
}
