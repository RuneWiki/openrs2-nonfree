import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!di")
public final class Class3_Sub17 extends Class3 {

	@OriginalMember(owner = "client!di", name = "k", descriptor = "[I")
	public int[] anIntArray98 = new int[1];

	@OriginalMember(owner = "client!di", name = "n", descriptor = "[I")
	public int[] anIntArray99 = new int[] { -1 };

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(ILclient!vea;IIZIILclient!rj;ILclient!ha;)Lclient!ka;")
	public Class128 method2487(@OriginalArg(0) int arg0, @OriginalArg(1) Class352 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(6) int arg4, @OriginalArg(7) Class290 arg5, @OriginalArg(8) int arg6, @OriginalArg(9) Class33 arg7) {
		@Pc(7) Class128 local7 = null;
		@Pc(9) int local9 = 2048;
		@Pc(11) Class232 local11 = null;
		if (arg0 != -1) {
			local11 = Static367.aClass285_1.method7014(arg0);
		}
		@Pc(22) int[] local22 = this.anIntArray99;
		if (local11 != null && local11.anIntArray416 != null) {
			local22 = new int[local11.anIntArray416.length];
			for (@Pc(34) int local34 = 0; local34 < local11.anIntArray416.length; local34++) {
				@Pc(41) int local41 = local11.anIntArray416[local34];
				if (local41 >= 0 && this.anIntArray99.length > local41) {
					local22[local34] = this.anIntArray99[local41];
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
		@Pc(86) Class3_Sub1_Sub12 local86 = null;
		@Pc(88) Class3_Sub1_Sub12 local88 = null;
		if (arg5 != null) {
			local9 = 2080;
			local80 = arg5.anIntArray550[arg4];
			@Pc(103) int local103 = local80 >>> 16;
			local86 = Static618.aClass222_2.method5861(local103);
			local80 &= 0xFFFF;
			if (local86 != null) {
				local74 = local86.method5015(local80) | false;
				local72 = local86.method5017(local80) | false;
				local78 = local86.method5016(local80) | false;
				local76 = arg5.aBoolean739 | false;
			}
			if ((arg5.aBoolean737 || Static433.aBoolean671) && arg6 != -1 && arg5.anIntArray550.length > arg6) {
				local84 = arg5.anIntArray548[arg4];
				local82 = arg5.anIntArray550[arg6];
				@Pc(171) int local171 = local82 >>> 16;
				local82 &= 0xFFFF;
				if (local171 == local103) {
					local88 = local86;
				} else {
					local88 = Static618.aClass222_2.method5861(local82 >>> 16);
				}
				if (local88 != null) {
					local74 |= local88.method5015(local82);
					local72 |= local88.method5017(local82);
					local78 |= local88.method5016(local82);
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
		@Pc(252) long local252 = this.method2490(arg1 == null ? null : arg1.anIntArray599, arg3, local22, arg0);
		if (Static268.aClass112_33 != null) {
			local7 = (Class128) Static268.aClass112_33.method3640(local252);
		}
		if (local7 == null || arg7.method6220(local7.ua(), local9) != 0) {
			if (local7 != null) {
				local9 = arg7.method6176(local9, local7.ua());
			}
			@Pc(280) int local280 = local9;
			@Pc(282) boolean local282 = false;
			for (@Pc(284) int local284 = 0; local284 < local22.length; local284++) {
				if (local22[local284] != -1 && !Static367.aClass281_1.method6975(local22[local284]).method6068(arg3)) {
					local282 = true;
				}
			}
			if (local282) {
				return null;
			}
			@Pc(321) Class142[] local321 = new Class142[local22.length];
			for (@Pc(323) int local323 = 0; local323 < local22.length; local323++) {
				if (local22[local323] != -1) {
					local321[local323] = Static367.aClass281_1.method6975(local22[local323]).method6078(arg3);
				}
			}
			@Pc(374) int local374;
			@Pc(381) int local381;
			if (local11 != null && local11.anIntArrayArray66 != null) {
				for (@Pc(354) int local354 = 0; local354 < local11.anIntArrayArray66.length; local354++) {
					if (local11.anIntArrayArray66[local354] != null && local321[local354] != null) {
						local374 = local11.anIntArrayArray66[local354][0];
						local381 = local11.anIntArrayArray66[local354][1];
						@Pc(388) int local388 = local11.anIntArrayArray66[local354][2];
						@Pc(395) int local395 = local11.anIntArrayArray66[local354][3];
						@Pc(402) int local402 = local11.anIntArrayArray66[local354][4];
						@Pc(409) int local409 = local11.anIntArrayArray66[local354][5];
						if (local395 != 0 || local402 != 0 || local409 != 0) {
							local321[local354].method4366(local395, local409, local402);
						}
						if (local374 != 0 || local381 != 0 || local388 != 0) {
							local321[local354].method4358(local374, local381, local388);
						}
					}
				}
			}
			if (arg1 != null) {
				local280 = local9 | 0x4000;
			}
			@Pc(468) Class142 local468 = new Class142(local321, local321.length);
			local7 = arg7.method6157(local468, local280, Static461.anInt8384, 64, 850);
			if (arg1 != null) {
				for (local374 = 0; local374 < 5; local374++) {
					for (local381 = 0; local381 < Static221.aShortArrayArrayArray1.length; local381++) {
						if (arg1.anIntArray599[local374] < Static221.aShortArrayArrayArray1[local381][local374].length) {
							local7.ia(Static351.aShortArrayArray14[local381][local374], Static221.aShortArrayArrayArray1[local381][local374][arg1.anIntArray599[local374]]);
						}
					}
				}
			}
			if (Static268.aClass112_33 != null) {
				local7.s(local9);
				Static268.aClass112_33.method3636(local252, local7);
			}
		}
		if (arg5 == null || local86 == null) {
			return local7;
		} else {
			@Pc(555) Class128 local555 = local7.method6279((byte) 1, local9, true);
			local555.method6284(0, local84, local88, arg5.aBoolean739, local80, local82, local86, arg2 - 1);
			return local555;
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "([IZ[III)J")
	private long method2490(@OriginalArg(0) int[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3) {
		@Pc(7) long[] local7 = Class3_Sub1_Sub14_Sub2.aLongArray13;
		@Pc(9) long local9 = -1L;
		@Pc(25) long local25 = local7[(int) (((long) (arg3 >> 8) ^ local9) & 0xFFL)] ^ local9 >>> 8;
		local9 = local25 >>> 8 ^ local7[(int) (((long) arg3 ^ local25) & 0xFFL)];
		for (@Pc(46) int local46 = 0; local46 < arg2.length; local46++) {
			local9 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) (arg2[local46] >> 24)) & 0xFFL)];
			local9 = local7[(int) ((local9 ^ (long) (arg2[local46] >> 16)) & 0xFFL)] ^ local9 >>> 8;
			local9 = local7[(int) ((local9 ^ (long) (arg2[local46] >> 8)) & 0xFFL)] ^ local9 >>> 8;
			local9 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) arg2[local46]) & 0xFFL)];
		}
		if (arg0 != null) {
			for (@Pc(131) int local131 = 0; local131 < 5; local131++) {
				local9 = local7[(int) ((local9 ^ (long) arg0[local131]) & 0xFFL)] ^ local9 >>> 8;
			}
		}
		return local9 >>> 8 ^ local7[(int) ((local9 ^ (long) (arg1 ? 1 : 0)) & 0xFFL)];
	}
}
