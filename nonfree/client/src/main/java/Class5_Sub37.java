import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ol")
public final class Class5_Sub37 extends Class5 {

	@OriginalMember(owner = "client!ol", name = "n", descriptor = "[I")
	public int[] anIntArray553 = new int[1];

	@OriginalMember(owner = "client!ol", name = "l", descriptor = "[I")
	public int[] anIntArray552 = new int[] { -1 };

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIILclient!la;IILclient!uea;Lclient!ha;IZ)Lclient!ka;")
	public Class180 method6256(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class200 arg2, @OriginalArg(4) int arg3, @OriginalArg(6) Class339 arg4, @OriginalArg(7) Class126 arg5, @OriginalArg(8) int arg6, @OriginalArg(9) boolean arg7) {
		@Pc(7) Class180 local7 = null;
		@Pc(9) int local9 = 2048;
		@Pc(11) Class295 local11 = null;
		if (arg3 != -1) {
			local11 = Static608.aClass151_1.method3578(arg3);
		}
		@Pc(23) int[] local23 = this.anIntArray552;
		if (local11 != null && local11.anIntArray640 != null) {
			local23 = new int[local11.anIntArray640.length];
			for (@Pc(35) int local35 = 0; local35 < local11.anIntArray640.length; local35++) {
				@Pc(42) int local42 = local11.anIntArray640[local35];
				if (local42 >= 0 && this.anIntArray552.length > local42) {
					local23[local35] = this.anIntArray552[local42];
				} else {
					local23[local35] = -1;
				}
			}
		}
		@Pc(78) boolean local78 = false;
		@Pc(80) boolean local80 = false;
		@Pc(87) boolean local87 = false;
		@Pc(89) boolean local89 = false;
		@Pc(91) int local91 = -1;
		@Pc(93) int local93 = -1;
		@Pc(95) int local95 = 0;
		@Pc(97) Class5_Sub4_Sub2 local97 = null;
		@Pc(99) Class5_Sub4_Sub2 local99 = null;
		if (arg2 != null) {
			local91 = arg2.anIntArray389[arg0];
			local9 = 2080;
			@Pc(114) int local114 = local91 >>> 16;
			local91 &= 0xFFFF;
			local97 = Static396.aClass359_2.method8413(local114);
			if (local97 != null) {
				local80 = local97.method652(local91) | false;
				local78 = local97.method657(local91) | false;
				local89 = local97.method654(local91) | false;
				local87 = arg2.aBoolean402 | false;
			}
			if ((arg2.aBoolean401 || Static35.aBoolean59) && arg6 != -1 && arg2.anIntArray389.length > arg6) {
				local95 = arg2.anIntArray388[arg0];
				local93 = arg2.anIntArray389[arg6];
				@Pc(183) int local183 = local93 >>> 16;
				local93 &= 0xFFFF;
				if (local114 == local183) {
					local99 = local97;
				} else {
					local99 = Static396.aClass359_2.method8413(local93 >>> 16);
				}
				if (local99 != null) {
					local80 |= local99.method652(local93);
					local78 |= local99.method657(local93);
					local89 |= local99.method654(local93);
				}
			}
			if (local80) {
				local9 = 2208;
			}
			if (local78) {
				local9 |= 0x100;
			}
			if (local87) {
				local9 |= 0x200;
			}
			if (local89) {
				local9 |= 0x400;
			}
		}
		@Pc(262) long local262 = this.method6258(local23, arg3, arg7, arg4 == null ? null : arg4.anIntArray746);
		if (Static1.aClass293_43 != null) {
			local7 = (Class180) Static1.aClass293_43.method6921(local262);
		}
		if (local7 == null || arg5.method6985(local7.ua(), local9) != 0) {
			if (local7 != null) {
				local9 = arg5.method6989(local9, local7.ua());
			}
			@Pc(288) int local288 = local9;
			@Pc(290) boolean local290 = false;
			for (@Pc(292) int local292 = 0; local292 < local23.length; local292++) {
				if (local23[local292] != -1 && !Static479.aClass348_1.method8197(local23[local292]).method7747(arg7)) {
					local290 = true;
				}
			}
			if (local290) {
				return null;
			}
			@Pc(328) Class349[] local328 = new Class349[local23.length];
			for (@Pc(330) int local330 = 0; local330 < local23.length; local330++) {
				if (local23[local330] != -1) {
					local328[local330] = Static479.aClass348_1.method8197(local23[local330]).method7749(arg7);
				}
			}
			@Pc(386) int local386;
			@Pc(393) int local393;
			if (local11 != null && local11.anIntArrayArray48 != null) {
				for (@Pc(366) int local366 = 0; local366 < local11.anIntArrayArray48.length; local366++) {
					if (local11.anIntArrayArray48[local366] != null && local328[local366] != null) {
						local386 = local11.anIntArrayArray48[local366][0];
						local393 = local11.anIntArrayArray48[local366][1];
						@Pc(400) int local400 = local11.anIntArrayArray48[local366][2];
						@Pc(407) int local407 = local11.anIntArrayArray48[local366][3];
						@Pc(414) int local414 = local11.anIntArrayArray48[local366][4];
						@Pc(421) int local421 = local11.anIntArrayArray48[local366][5];
						if (local407 != 0 || local414 != 0 || local421 != 0) {
							local328[local366].method8220(local421, local414, local407);
						}
						if (local386 != 0 || local393 != 0 || local400 != 0) {
							local328[local366].method8211(local386, local393, local400);
						}
					}
				}
			}
			@Pc(471) Class349 local471 = new Class349(local328, local328.length);
			if (arg4 != null) {
				local288 = local9 | 0x4000;
			}
			local7 = arg5.method6982(local471, local288, Static283.anInt4649, 64, 850);
			if (arg4 != null) {
				for (local386 = 0; local386 < 5; local386++) {
					for (local393 = 0; local393 < Static550.aShortArrayArrayArray3.length; local393++) {
						if (Static550.aShortArrayArrayArray3[local393][local386].length > arg4.anIntArray746[local386]) {
							local7.ia(Static347.aShortArrayArray20[local393][local386], Static550.aShortArrayArrayArray3[local393][local386][arg4.anIntArray746[local386]]);
						}
					}
				}
			}
			if (Static1.aClass293_43 != null) {
				local7.s(local9);
				Static1.aClass293_43.method6925(local262, local7);
			}
		}
		if (arg2 == null || local97 == null) {
			return local7;
		} else {
			@Pc(564) Class180 local564 = local7.method7945((byte) 1, local9, true);
			local564.method7930(local97, arg2.aBoolean402, local93, local95, local91, 0, arg1 - 1, local99);
			return local564;
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "([IIIZ[I)J")
	private long method6258(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int[] arg3) {
		@Pc(7) long[] local7 = Class335.aLongArray16;
		@Pc(9) long local9 = -1L;
		@Pc(25) long local25 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) (arg1 >> 8)) & 0xFFL)];
		local9 = local7[(int) (((long) arg1 ^ local25) & 0xFFL)] ^ local25 >>> 8;
		for (@Pc(41) int local41 = 0; local41 < arg0.length; local41++) {
			local9 = local7[(int) ((local9 ^ (long) (arg0[local41] >> 24)) & 0xFFL)] ^ local9 >>> 8;
			local9 = local9 >>> 8 ^ local7[(int) (((long) (arg0[local41] >> 16) ^ local9) & 0xFFL)];
			local9 = local7[(int) (((long) (arg0[local41] >> 8) ^ local9) & 0xFFL)] ^ local9 >>> 8;
			local9 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) arg0[local41]) & 0xFFL)];
		}
		if (arg3 != null) {
			for (@Pc(126) int local126 = 0; local126 < 5; local126++) {
				local9 = local9 >>> 8 ^ local7[(int) (((long) arg3[local126] ^ local9) & 0xFFL)];
			}
		}
		return local9 >>> 8 ^ local7[(int) (((long) (arg2 ? 1 : 0) ^ local9) & 0xFFL)];
	}
}
