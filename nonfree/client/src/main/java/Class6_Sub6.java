import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bg")
public final class Class6_Sub6 extends Class6 {

	@OriginalMember(owner = "client!bg", name = "m", descriptor = "[I")
	public int[] anIntArray55 = new int[] { -1 };

	@OriginalMember(owner = "client!bg", name = "k", descriptor = "[I")
	public int[] anIntArray54 = new int[1];

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(BLclient!pfa;ILclient!gf;ZIIILclient!ha;I)Lclient!ka;")
	public Class184 method905(@OriginalArg(1) Class271 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class119 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class132 arg7) {
		@Pc(7) Class184 local7 = null;
		@Pc(9) int local9 = 2048;
		@Pc(11) Class389 local11 = null;
		if (arg4 != -1) {
			local11 = Static12.aClass368_1.method8689(arg4);
		}
		@Pc(22) int[] local22 = this.anIntArray55;
		if (local11 != null && local11.anIntArray714 != null) {
			local22 = new int[local11.anIntArray714.length];
			for (@Pc(34) int local34 = 0; local34 < local11.anIntArray714.length; local34++) {
				@Pc(41) int local41 = local11.anIntArray714[local34];
				if (local41 >= 0 && local41 < this.anIntArray55.length) {
					local22[local34] = this.anIntArray55[local41];
				} else {
					local22[local34] = -1;
				}
			}
		}
		@Pc(76) boolean local76 = false;
		@Pc(78) boolean local78 = false;
		@Pc(80) boolean local80 = false;
		@Pc(87) boolean local87 = false;
		@Pc(89) int local89 = -1;
		@Pc(91) int local91 = -1;
		@Pc(93) int local93 = 0;
		@Pc(95) Class6_Sub4_Sub4 local95 = null;
		@Pc(97) Class6_Sub4_Sub4 local97 = null;
		if (arg2 != null) {
			local9 = 2080;
			local89 = arg2.anIntArray167[arg1];
			@Pc(112) int local112 = local89 >>> 16;
			local89 &= 0xFFFF;
			local95 = Static334.aClass268_2.method6468(local112);
			if (local95 != null) {
				local78 = local95.method2427(local89) | false;
				local76 = local95.method2430(local89) | false;
				local87 = local95.method2428(local89) | false;
				local80 = arg2.aBoolean189 | false;
			}
			if ((arg2.aBoolean187 || Static386.aBoolean433) && arg5 != -1 && arg5 < arg2.anIntArray167.length) {
				local93 = arg2.anIntArray168[arg1];
				local91 = arg2.anIntArray167[arg5];
				@Pc(179) int local179 = local91 >>> 16;
				local91 &= 0xFFFF;
				if (local112 == local179) {
					local97 = local95;
				} else {
					local97 = Static334.aClass268_2.method6468(local91 >>> 16);
				}
				if (local97 != null) {
					local78 |= local97.method2427(local91);
					local76 |= local97.method2430(local91);
					local87 |= local97.method2428(local91);
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
			if (local87) {
				local9 |= 0x400;
			}
		}
		@Pc(260) long local260 = this.method906(arg4, arg0 == null ? null : arg0.anIntArray501, local22, arg3);
		if (Static35.aClass10_1 != null) {
			local7 = (Class184) Static35.aClass10_1.method373(local260);
		}
		if (local7 == null || arg7.method7509(local7.ua(), local9) != 0) {
			if (local7 != null) {
				local9 = arg7.method7448(local9, local7.ua());
			}
			@Pc(286) int local286 = local9;
			@Pc(288) boolean local288 = false;
			for (@Pc(290) int local290 = 0; local290 < local22.length; local290++) {
				if (local22[local290] != -1 && !Static340.aClass121_1.method2647(local22[local290]).method5142((Class317) null, arg3)) {
					local288 = true;
				}
			}
			if (local288) {
				return null;
			}
			@Pc(328) Class22[] local328 = new Class22[local22.length];
			for (@Pc(330) int local330 = 0; local330 < local22.length; local330++) {
				if (local22[local330] != -1) {
					local328[local330] = Static340.aClass121_1.method2647(local22[local330]).method5140((Class317) null, arg3);
				}
			}
			@Pc(386) int local386;
			@Pc(393) int local393;
			if (local11 != null && local11.anIntArrayArray60 != null) {
				for (@Pc(366) int local366 = 0; local366 < local11.anIntArrayArray60.length; local366++) {
					if (local11.anIntArrayArray60[local366] != null && local328[local366] != null) {
						local386 = local11.anIntArrayArray60[local366][0];
						local393 = local11.anIntArrayArray60[local366][1];
						@Pc(400) int local400 = local11.anIntArrayArray60[local366][2];
						@Pc(407) int local407 = local11.anIntArrayArray60[local366][3];
						@Pc(414) int local414 = local11.anIntArrayArray60[local366][4];
						@Pc(421) int local421 = local11.anIntArrayArray60[local366][5];
						if (local407 != 0 || local414 != 0 || local421 != 0) {
							local328[local366].method533(local421, local407, local414);
						}
						if (local386 != 0 || local393 != 0 || local400 != 0) {
							local328[local366].method539(local400, local393, local386);
						}
					}
				}
			}
			@Pc(471) Class22 local471 = new Class22(local328, local328.length);
			if (arg0 != null) {
				local286 = local9 | 0x4000;
			}
			local7 = arg7.method7475(local471, local286, Static504.anInt8475, 64, 850);
			if (arg0 != null) {
				for (local386 = 0; local386 < 5; local386++) {
					for (local393 = 0; local393 < Static3.aShortArrayArrayArray2.length; local393++) {
						if (Static3.aShortArrayArrayArray2[local393][local386].length > arg0.anIntArray501[local386]) {
							local7.ia(Static598.aShortArrayArray18[local393][local386], Static3.aShortArrayArrayArray2[local393][local386][arg0.anIntArray501[local386]]);
						}
					}
				}
			}
			if (Static35.aClass10_1 != null) {
				local7.s(local9);
				Static35.aClass10_1.method366(local7, local260);
			}
		}
		if (arg2 == null || local95 == null) {
			return local7;
		} else {
			@Pc(560) Class184 local560 = local7.method8660((byte) 1, local9, true);
			local560.method8641(0, local89, local93, local91, local95, arg6 - 1, local97, arg2.aBoolean189);
			return local560;
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(II[I[IZ)J")
	private long method906(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) boolean arg3) {
		@Pc(7) long[] local7 = Class29_Sub8.aLongArray5;
		@Pc(9) long local9 = -1L;
		@Pc(26) long local26 = local9 >>> 8 ^ local7[(int) ((long) 255 & ((long) (arg0 >> 8) ^ local9))];
		local9 = local26 >>> 8 ^ local7[(int) ((local26 ^ (long) arg0) & 0xFFL)];
		for (@Pc(42) int local42 = 0; local42 < arg2.length; local42++) {
			local9 = local9 >>> 8 ^ local7[(int) (((long) (arg2[local42] >> 24) ^ local9) & 0xFFL)];
			local9 = local9 >>> 8 ^ local7[(int) (((long) (arg2[local42] >> 16) ^ local9) & 0xFFL)];
			local9 = local7[(int) ((local9 ^ (long) (arg2[local42] >> 8)) & 0xFFL)] ^ local9 >>> 8;
			local9 = local7[(int) (((long) arg2[local42] ^ local9) & 0xFFL)] ^ local9 >>> 8;
		}
		if (arg1 != null) {
			for (@Pc(127) int local127 = 0; local127 < 5; local127++) {
				local9 = local7[(int) (((long) arg1[local127] ^ local9) & 0xFFL)] ^ local9 >>> 8;
			}
		}
		return local7[(int) ((local9 ^ (long) (arg3 ? 1 : 0)) & 0xFFL)] ^ local9 >>> 8;
	}
}
