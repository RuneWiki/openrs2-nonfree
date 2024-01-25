import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lk")
public final class Class4_Sub30 extends Class4 {

	@OriginalMember(owner = "client!lk", name = "q", descriptor = "[I")
	public int[] anIntArray328 = new int[1];

	@OriginalMember(owner = "client!lk", name = "v", descriptor = "[I")
	public int[] anIntArray329 = new int[] { -1 };

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(BIZ[I[I)J")
	private long method4759(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		@Pc(7) long[] local7 = Class194.aLongArray7;
		@Pc(9) long local9 = -1L;
		@Pc(33) long local33 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) (arg0 >> 8)) & 0xFFL)];
		local9 = local7[(int) (((long) arg0 ^ local33) & 0xFFL)] ^ local33 >>> 8;
		for (@Pc(49) int local49 = 0; local49 < arg2.length; local49++) {
			local9 = local7[(int) ((local9 ^ (long) (arg2[local49] >> 24)) & 0xFFL)] ^ local9 >>> 8;
			local9 = local7[(int) (((long) (arg2[local49] >> 16) ^ local9) & 0xFFL)] ^ local9 >>> 8;
			local9 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) (arg2[local49] >> 8)) & 0xFFL)];
			local9 = local9 >>> 8 ^ local7[(int) (((long) arg2[local49] ^ local9) & 0xFFL)];
		}
		if (arg3 != null) {
			for (@Pc(134) int local134 = 0; local134 < 5; local134++) {
				local9 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) arg3[local134]) & 0xFFL)];
			}
		}
		return local9 >>> 8 ^ local7[(int) (((long) (arg1 ? 1 : 0) ^ local9) & 0xFFL)];
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lclient!lw;Lclient!fo;Lclient!r;ZBIIIII)Lclient!da;")
	public Class65 method4760(@OriginalArg(0) Class206 arg0, @OriginalArg(1) Class111 arg1, @OriginalArg(2) Class7 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(7) Class65 local7 = null;
		@Pc(9) int local9 = 2048;
		@Pc(11) Class252 local11 = null;
		if (arg6 != -1) {
			local11 = Static203.aClass230_1.method5247(arg6);
		}
		@Pc(22) int[] local22 = this.anIntArray329;
		if (local11 != null && local11.anIntArray408 != null) {
			local22 = new int[local11.anIntArray408.length];
			for (@Pc(34) int local34 = 0; local34 < local11.anIntArray408.length; local34++) {
				@Pc(41) int local41 = local11.anIntArray408[local34];
				if (local41 >= 0 && this.anIntArray329.length > local41) {
					local22[local34] = this.anIntArray329[local41];
				} else {
					local22[local34] = -1;
				}
			}
		}
		@Pc(72) boolean local72 = false;
		@Pc(74) boolean local74 = false;
		@Pc(76) boolean local76 = false;
		@Pc(78) boolean local78 = false;
		@Pc(80) int local80 = -1;
		@Pc(82) int local82 = -1;
		@Pc(84) int local84 = 0;
		@Pc(86) Class4_Sub6_Sub8 local86 = null;
		@Pc(88) Class4_Sub6_Sub8 local88 = null;
		if (arg1 != null) {
			local9 = 2080;
			local80 = arg1.anIntArray153[arg4];
			@Pc(103) int local103 = local80 >>> 16;
			local80 &= 0xFFFF;
			local86 = Static17.aClass254_1.method5940(local103);
			if (local86 != null) {
				local74 = local86.method3080(local80) | false;
				local72 = local86.method3076(local80) | false;
				local78 = local86.method3077(local80) | false;
				local76 = arg1.aBoolean234 | false;
			}
			if ((arg1.aBoolean232 || Static165.aBoolean248) && arg7 != -1 && arg7 < arg1.anIntArray153.length) {
				local84 = arg1.anIntArray150[arg4];
				local82 = arg1.anIntArray153[arg7];
				@Pc(172) int local172 = local82 >>> 16;
				local82 &= 0xFFFF;
				if (local172 == local103) {
					local88 = local86;
				} else {
					local88 = Static17.aClass254_1.method5940(local82 >>> 16);
				}
				if (local88 != null) {
					local74 |= local88.method3080(local82);
					local72 |= local88.method3076(local82);
					local78 |= local88.method3077(local82);
				}
			}
			if (local74) {
				local9 = 2208;
			}
			if (local72) {
				local9 |= 0x100;
			}
			if (local76) {
				local9 |= 0x200;
			}
			if (local78) {
				local9 |= 0x400;
			}
		}
		@Pc(256) long local256 = this.method4759(arg6, arg3, local22, arg0 == null ? null : arg0.anIntArray343);
		if (Static219.aClass167_17 != null) {
			local7 = (Class65) Static219.aClass167_17.method3966(local256);
		}
		if (local7 == null || arg2.method7793(local7.PA(), local9) != 0) {
			if (local7 != null) {
				local9 = arg2.method7778(local9, local7.PA());
			}
			@Pc(285) int local285 = local9;
			@Pc(287) boolean local287 = false;
			for (@Pc(289) int local289 = 0; local289 < local22.length; local289++) {
				if (local22[local289] != -1 && !Static338.aClass29_1.method977(local22[local289]).method5324(arg3)) {
					local287 = true;
				}
			}
			if (local287) {
				return null;
			}
			@Pc(321) Class59[] local321 = new Class59[local22.length];
			for (@Pc(323) int local323 = 0; local323 < local22.length; local323++) {
				if (local22[local323] != -1) {
					local321[local323] = Static338.aClass29_1.method977(local22[local323]).method5334(arg3);
				}
			}
			@Pc(379) int local379;
			@Pc(386) int local386;
			if (local11 != null && local11.anIntArrayArray38 != null) {
				for (@Pc(359) int local359 = 0; local359 < local11.anIntArrayArray38.length; local359++) {
					if (local11.anIntArrayArray38[local359] != null && local321[local359] != null) {
						local379 = local11.anIntArrayArray38[local359][0];
						local386 = local11.anIntArrayArray38[local359][1];
						@Pc(393) int local393 = local11.anIntArrayArray38[local359][2];
						@Pc(400) int local400 = local11.anIntArrayArray38[local359][3];
						@Pc(407) int local407 = local11.anIntArrayArray38[local359][4];
						@Pc(414) int local414 = local11.anIntArrayArray38[local359][5];
						if (local400 != 0 || local407 != 0 || local414 != 0) {
							local321[local359].method1590(local414, local400, local407);
						}
						if (local379 != 0 || local386 != 0 || local393 != 0) {
							local321[local359].method1585(local386, local393, local379);
						}
					}
				}
			}
			@Pc(466) Class59 local466 = new Class59(local321, local321.length);
			if (arg0 != null) {
				local285 = local9 | 0x4000;
			}
			local7 = arg2.method7828(local466, local285, Static340.anInt6538, 64, 850);
			if (arg0 != null) {
				for (local379 = 0; local379 < 5; local379++) {
					for (local386 = 0; local386 < Static360.aShortArrayArrayArray3.length; local386++) {
						if (arg0.anIntArray343[local379] < Static360.aShortArrayArrayArray3[local386][local379].length) {
							local7.d(Static217.aShortArrayArray17[local386][local379], Static360.aShortArrayArrayArray3[local386][local379][arg0.anIntArray343[local379]]);
						}
					}
				}
			}
			if (Static219.aClass167_17 != null) {
				local7.SA(local9);
				Static219.aClass167_17.method3974(local256, local7);
			}
		}
		if (arg1 == null || local86 == null) {
			return local7;
		} else {
			@Pc(557) Class65 local557 = local7.method7682((byte) 1, local9, true);
			local557.method7689(0, arg1.aBoolean234, local84, local88, local82, arg5 - 1, local80, local86);
			return local557;
		}
	}
}
