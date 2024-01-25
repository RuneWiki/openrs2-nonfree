import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wda")
public final class Class3_Sub52 extends Class3 {

	@OriginalMember(owner = "client!wda", name = "n", descriptor = "[I")
	public int[] anIntArray654 = new int[1];

	@OriginalMember(owner = "client!wda", name = "k", descriptor = "[I")
	public int[] anIntArray653 = new int[] { -1 };

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(IIILclient!pia;ZILclient!ha;Lclient!wh;ZI)Lclient!ka;")
	public Class75 method8478(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class267 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class82 arg5, @OriginalArg(7) Class375 arg6, @OriginalArg(9) int arg7) {
		@Pc(7) Class75 local7 = null;
		@Pc(9) int local9 = 2048;
		@Pc(11) Class176 local11 = null;
		if (arg0 != -1) {
			local11 = Static61.aClass119_1.method2845(arg0);
		}
		@Pc(23) int[] local23 = this.anIntArray653;
		if (local11 != null && local11.anIntArray285 != null) {
			local23 = new int[local11.anIntArray285.length];
			for (@Pc(35) int local35 = 0; local35 < local11.anIntArray285.length; local35++) {
				@Pc(42) int local42 = local11.anIntArray285[local35];
				if (local42 >= 0 && local42 < this.anIntArray653.length) {
					local23[local35] = this.anIntArray653[local42];
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
		@Pc(88) Class3_Sub7_Sub18 local88 = null;
		@Pc(90) Class3_Sub7_Sub18 local90 = null;
		if (arg2 != null) {
			local9 = 2080;
			local82 = arg2.anIntArray458[arg4];
			@Pc(105) int local105 = local82 >>> 16;
			local82 &= 0xFFFF;
			local88 = Static474.aClass264_2.method6569(local105);
			if (local88 != null) {
				local76 = local88.method7270(local82) | false;
				local74 = local88.method7266(local82) | false;
				local80 = local88.method7267(local82) | false;
				local78 = arg2.aBoolean545 | false;
			}
			if ((arg2.aBoolean543 || Static607.aBoolean749) && arg1 != -1 && arg2.anIntArray458.length > arg1) {
				local84 = arg2.anIntArray458[arg1];
				local86 = arg2.anIntArray456[arg4];
				@Pc(169) int local169 = local84 >>> 16;
				local84 &= 0xFFFF;
				if (local105 == local169) {
					local90 = local88;
				} else {
					local90 = Static474.aClass264_2.method6569(local84 >>> 16);
				}
				if (local90 != null) {
					local76 |= local90.method7270(local84);
					local74 |= local90.method7266(local84);
					local80 |= local90.method7267(local84);
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
		@Pc(246) long local246 = this.method8482(arg3, arg0, arg6 == null ? null : arg6.anIntArray657, local23);
		if (Static503.aClass136_57 != null) {
			local7 = (Class75) Static503.aClass136_57.method3134(local246);
		}
		if (local7 == null || arg5.method6105(local7.ua(), local9) != 0) {
			if (local7 != null) {
				local9 = arg5.method6169(local9, local7.ua());
			}
			@Pc(275) int local275 = local9;
			@Pc(277) boolean local277 = false;
			for (@Pc(279) int local279 = 0; local279 < local23.length; local279++) {
				if (local23[local279] != -1 && !Static298.aClass132_1.method3062(local23[local279]).method6452(arg3)) {
					local277 = true;
				}
			}
			if (local277) {
				return null;
			}
			@Pc(315) Class359[] local315 = new Class359[local23.length];
			for (@Pc(317) int local317 = 0; local317 < local23.length; local317++) {
				if (local23[local317] != -1) {
					local315[local317] = Static298.aClass132_1.method3062(local23[local317]).method6454(arg3);
				}
			}
			@Pc(369) int local369;
			@Pc(376) int local376;
			if (local11 != null && local11.anIntArrayArray22 != null) {
				for (@Pc(349) int local349 = 0; local349 < local11.anIntArrayArray22.length; local349++) {
					if (local11.anIntArrayArray22[local349] != null && local315[local349] != null) {
						local369 = local11.anIntArrayArray22[local349][0];
						local376 = local11.anIntArrayArray22[local349][1];
						@Pc(383) int local383 = local11.anIntArrayArray22[local349][2];
						@Pc(390) int local390 = local11.anIntArrayArray22[local349][3];
						@Pc(397) int local397 = local11.anIntArrayArray22[local349][4];
						@Pc(404) int local404 = local11.anIntArrayArray22[local349][5];
						if (local390 != 0 || local397 != 0 || local404 != 0) {
							local315[local349].method8360(local404, local390, local397);
						}
						if (local369 != 0 || local376 != 0 || local383 != 0) {
							local315[local349].method8356(local376, local369, local383);
						}
					}
				}
			}
			if (arg6 != null) {
				local275 = local9 | 0x4000;
			}
			@Pc(464) Class359 local464 = new Class359(local315, local315.length);
			local7 = arg5.method6176(local464, local275, Static491.anInt8354, 64, 850);
			if (arg6 != null) {
				for (local369 = 0; local369 < 5; local369++) {
					for (local376 = 0; local376 < Static461.aShortArrayArrayArray4.length; local376++) {
						if (Static461.aShortArrayArrayArray4[local376][local369].length > arg6.anIntArray657[local369]) {
							local7.ia(Static603.aShortArrayArray19[local376][local369], Static461.aShortArrayArrayArray4[local376][local369][arg6.anIntArray657[local369]]);
						}
					}
				}
			}
			if (Static503.aClass136_57 != null) {
				local7.s(local9);
				Static503.aClass136_57.method3135(local7, local246);
			}
		}
		if (arg2 == null || local88 == null) {
			return local7;
		} else {
			@Pc(543) Class75 local543 = local7.method6805((byte) 1, local9, true);
			local543.method6786(local88, 0, local90, local82, local86, arg2.aBoolean545, local84, arg7 - 1);
			return local543;
		}
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(ZBI[I[I)J")
	private long method8482(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		@Pc(7) long[] local7 = Class60.aLongArray16;
		@Pc(9) long local9 = -1L;
		@Pc(25) long local25 = local7[(int) (((long) (arg1 >> 8) ^ local9) & 0xFFL)] ^ local9 >>> 8;
		local9 = local25 >>> 8 ^ local7[(int) ((local25 ^ (long) arg1) & 0xFFL)];
		for (@Pc(41) int local41 = 0; local41 < arg3.length; local41++) {
			local9 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) (arg3[local41] >> 24)) & 0xFFL)];
			local9 = local7[(int) ((local9 ^ (long) (arg3[local41] >> 16)) & 0xFFL)] ^ local9 >>> 8;
			local9 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) (arg3[local41] >> 8)) & 0xFFL)];
			local9 = local7[(int) ((local9 ^ (long) arg3[local41]) & 0xFFL)] ^ local9 >>> 8;
		}
		if (arg2 != null) {
			for (@Pc(132) int local132 = 0; local132 < 5; local132++) {
				local9 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) arg2[local132]) & 0xFFL)];
			}
		}
		return local7[(int) (((long) (arg0 ? 1 : 0) ^ local9) & 0xFFL)] ^ local9 >>> 8;
	}
}
