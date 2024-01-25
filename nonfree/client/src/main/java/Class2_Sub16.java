import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ha")
public final class Class2_Sub16 extends Class2 {

	@OriginalMember(owner = "client!ha", name = "q", descriptor = "[I")
	public int[] anIntArray272 = new int[1];

	@OriginalMember(owner = "client!ha", name = "r", descriptor = "[I")
	public int[] anIntArray273 = new int[] { -1 };

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IILclient!qg;Lclient!km;ZIILclient!wh;IB)Lclient!ab;")
	public Class3 method2268(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class189 arg2, @OriginalArg(3) Class82 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class247 arg7) {
		@Pc(7) Class3 local7 = null;
		@Pc(9) int local9 = 1024;
		@Pc(11) Class170 local11 = null;
		if (arg6 != -1) {
			local11 = Static225.aClass47_1.method1075(arg6);
		}
		@Pc(22) int[] local22 = this.anIntArray273;
		if (local11 != null && local11.anIntArray564 != null) {
			local22 = new int[local11.anIntArray564.length];
			for (@Pc(34) int local34 = 0; local34 < local11.anIntArray564.length; local34++) {
				@Pc(41) int local41 = local11.anIntArray564[local34];
				if (local41 >= 0 && local41 < this.anIntArray273.length) {
					local22[local34] = this.anIntArray273[local41];
				} else {
					local22[local34] = -1;
				}
			}
		}
		@Pc(72) boolean local72 = false;
		@Pc(74) boolean local74 = false;
		@Pc(76) boolean local76 = false;
		@Pc(78) int local78 = -1;
		@Pc(80) int local80 = -1;
		@Pc(82) int local82 = 0;
		@Pc(89) Class2_Sub1_Sub1 local89 = null;
		@Pc(91) Class2_Sub1_Sub1 local91 = null;
		if (arg2 != null) {
			local9 = 1056;
			local78 = arg2.anIntArray639[arg5];
			@Pc(106) int local106 = local78 >>> 16;
			local78 &= 0xFFFF;
			local89 = Static351.aClass175_3.method4106(local106);
			if (local89 != null) {
				local74 = local89.method34(local78) | false;
				local72 = local89.method31(local78) | false;
				local76 = arg2.aBoolean385 | false;
			}
			if ((arg2.aBoolean384 || Static151.aBoolean203) && arg1 != -1 && arg1 < arg2.anIntArray639.length) {
				local82 = arg2.anIntArray640[arg5];
				local80 = arg2.anIntArray639[arg1];
				@Pc(168) int local168 = local80 >>> 16;
				local80 &= 0xFFFF;
				if (local168 == local106) {
					local91 = local89;
				} else {
					local91 = Static351.aClass175_3.method4106(local80 >>> 16);
				}
				if (local91 != null) {
					local74 |= local91.method34(local80);
					local72 |= local91.method31(local80);
				}
			}
			if (local74) {
				local9 = 1184;
			}
			if (local72) {
				local9 |= 0x100;
			}
			if (local76) {
				local9 |= 0x200;
			}
		}
		@Pc(236) long local236 = this.method2271(arg7 == null ? null : arg7.anIntArray803, local22, arg4, arg6);
		if (Static35.aClass154_2 != null) {
			local7 = (Class3) Static35.aClass154_2.method3751(local236);
		}
		if (local7 == null || arg3.method4499(local7.method3474(), local9) != 0) {
			if (local7 != null) {
				local9 = arg3.method4483(local9, local7.method3474());
			}
			@Pc(265) int local265 = local9;
			@Pc(267) boolean local267 = false;
			for (@Pc(269) int local269 = 0; local269 < local22.length; local269++) {
				if (local22[local269] != -1 && !Static106.aClass250_1.method5735(local22[local269]).method2633(arg4)) {
					local267 = true;
				}
			}
			if (local267) {
				return null;
			}
			@Pc(301) Class91[] local301 = new Class91[local22.length];
			for (@Pc(303) int local303 = 0; local303 < local22.length; local303++) {
				if (local22[local303] != -1) {
					local301[local303] = Static106.aClass250_1.method5735(local22[local303]).method2643(arg4);
				}
			}
			@Pc(359) int local359;
			if (local11 != null && local11.anIntArrayArray36 != null) {
				for (@Pc(339) int local339 = 0; local339 < local11.anIntArrayArray36.length; local339++) {
					if (local11.anIntArrayArray36[local339] != null && local301[local339] != null) {
						local359 = local11.anIntArrayArray36[local339][0];
						@Pc(366) int local366 = local11.anIntArrayArray36[local339][1];
						@Pc(373) int local373 = local11.anIntArrayArray36[local339][2];
						@Pc(380) int local380 = local11.anIntArrayArray36[local339][3];
						@Pc(387) int local387 = local11.anIntArrayArray36[local339][4];
						@Pc(394) int local394 = local11.anIntArrayArray36[local339][5];
						if (local380 != 0 || local387 != 0 || local394 != 0) {
							local301[local339].method2203(local387, local380, local394);
						}
						if (local359 != 0 || local366 != 0 || local373 != 0) {
							local301[local339].method2209(local359, local373, local366);
						}
					}
				}
			}
			@Pc(444) Class91 local444 = new Class91(local301, local301.length);
			if (arg7 != null) {
				local265 = local9 | 0x2000;
			}
			local7 = arg3.method4466(local444, local265, Static191.anInt3366, 64, 850);
			if (arg7 != null) {
				for (local359 = 0; local359 < 5; local359++) {
					if (arg7.anIntArray803[local359] < Static250.aShortArrayArray34[local359].length) {
						local7.method3440(Static4.aShortArray1[local359], Static250.aShortArrayArray34[local359][arg7.anIntArray803[local359]]);
					}
					if (Static40.aShortArrayArray48[local359].length > arg7.anIntArray803[local359]) {
						local7.method3440(Static298.aShortArray94[local359], Static40.aShortArrayArray48[local359][arg7.anIntArray803[local359]]);
					}
				}
			}
			if (Static35.aClass154_2 != null) {
				local7.method3473(local9);
				Static35.aClass154_2.method3745(local236, local7);
			}
		}
		if (arg2 == null || local89 == null) {
			return local7;
		} else {
			@Pc(538) Class3 local538 = local7.method3481((byte) 1, local9, true);
			local538.method3455(local89, local78, local80, arg2.aBoolean385, local82, local91, arg0 - 1, 0);
			return local538;
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "([II[IZI)J")
	private long method2271(@OriginalArg(0) int[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(7) long[] local7 = Class64_Sub1.aLongArray4;
		@Pc(9) long local9 = -1L;
		@Pc(30) long local30 = local7[(int) (((long) (arg3 >> 8) ^ local9) & 0xFFL)] ^ local9 >>> 8;
		local9 = local30 >>> 8 ^ local7[(int) (((long) arg3 ^ local30) & 0xFFL)];
		for (@Pc(46) int local46 = 0; local46 < arg1.length; local46++) {
			local9 = local7[(int) (((long) (arg1[local46] >> 24) ^ local9) & 0xFFL)] ^ local9 >>> 8;
			local9 = local7[(int) (((long) (arg1[local46] >> 16) ^ local9) & 0xFFL)] ^ local9 >>> 8;
			local9 = local7[(int) (((long) (arg1[local46] >> 8) ^ local9) & 0xFFL)] ^ local9 >>> 8;
			local9 = local7[(int) (((long) arg1[local46] ^ local9) & 0xFFL)] ^ local9 >>> 8;
		}
		if (arg0 != null) {
			for (@Pc(127) int local127 = 0; local127 < 5; local127++) {
				local9 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) arg0[local127]) & 0xFFL)];
			}
		}
		return local9 >>> 8 ^ local7[(int) ((local9 ^ (long) (arg2 ? 1 : 0)) & 0xFFL)];
	}
}
