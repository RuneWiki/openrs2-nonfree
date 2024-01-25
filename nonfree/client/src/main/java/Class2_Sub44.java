import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vo")
public final class Class2_Sub44 extends Class2 {

	@OriginalMember(owner = "client!vo", name = "o", descriptor = "[I")
	public int[] anIntArray498 = new int[1];

	@OriginalMember(owner = "client!vo", name = "r", descriptor = "[I")
	public int[] anIntArray499 = new int[] { -1 };

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(ZII[I[I)J")
	private long method5785(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		@Pc(12) long[] local12 = Class2_Sub2_Sub12_Sub2.aLongArray6;
		@Pc(14) long local14 = -1L;
		@Pc(30) long local30 = local14 >>> 8 ^ local12[(int) ((local14 ^ (long) (arg1 >> 8)) & 0xFFL)];
		local14 = local30 >>> 8 ^ local12[(int) (((long) arg1 ^ local30) & 0xFFL)];
		for (@Pc(46) int local46 = 0; local46 < arg3.length; local46++) {
			local14 = local14 >>> 8 ^ local12[(int) ((local14 ^ (long) (arg3[local46] >> 24)) & 0xFFL)];
			local14 = local12[(int) ((local14 ^ (long) (arg3[local46] >> 16)) & 0xFFL)] ^ local14 >>> 8;
			local14 = local14 >>> 8 ^ local12[(int) ((local14 ^ (long) (arg3[local46] >> 8)) & 0xFFL)];
			local14 = local12[(int) ((local14 ^ (long) arg3[local46]) & 0xFFL)] ^ local14 >>> 8;
		}
		if (arg2 != null) {
			for (@Pc(127) int local127 = 0; local127 < 5; local127++) {
				local14 = local12[(int) ((local14 ^ (long) arg2[local127]) & 0xFFL)] ^ local14 >>> 8;
			}
		}
		return local14 >>> 8 ^ local12[(int) (((long) (arg0 ? 1 : 0) ^ local14) & 0xFFL)];
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(IZIIILclient!ag;ILclient!dc;ILclient!qa;)Lclient!c;")
	public Class32 method5786(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) Class7 arg3, @OriginalArg(6) int arg4, @OriginalArg(7) Class46 arg5, @OriginalArg(8) int arg6, @OriginalArg(9) Class26 arg7) {
		@Pc(7) Class32 local7 = null;
		@Pc(9) int local9 = 2048;
		@Pc(11) Class12 local11 = null;
		if (arg2 != -1) {
			local11 = Static4.aClass136_1.method3178(arg2);
		}
		@Pc(22) int[] local22 = this.anIntArray499;
		if (local11 != null && local11.anIntArray17 != null) {
			local22 = new int[local11.anIntArray17.length];
			for (@Pc(34) int local34 = 0; local34 < local11.anIntArray17.length; local34++) {
				@Pc(41) int local41 = local11.anIntArray17[local34];
				if (local41 >= 0 && this.anIntArray499.length > local41) {
					local22[local34] = this.anIntArray499[local41];
				} else {
					local22[local34] = -1;
				}
			}
		}
		@Pc(73) boolean local73 = false;
		@Pc(83) boolean local83 = false;
		@Pc(85) boolean local85 = false;
		@Pc(87) boolean local87 = false;
		@Pc(89) int local89 = -1;
		@Pc(91) int local91 = -1;
		@Pc(93) int local93 = 0;
		@Pc(95) Class2_Sub2_Sub7 local95 = null;
		@Pc(97) Class2_Sub2_Sub7 local97 = null;
		if (arg5 != null) {
			local89 = arg5.anIntArray90[arg4];
			local9 = 2080;
			@Pc(112) int local112 = local89 >>> 16;
			local95 = Static9.aClass194_1.method4376(local112);
			local89 &= 0xFFFF;
			if (local95 != null) {
				local83 = local95.method1407(local89) | false;
				local73 = local95.method1411(local89) | false;
				local87 = local95.method1409(local89) | false;
				local85 = arg5.aBoolean150 | false;
			}
			if ((arg5.aBoolean152 || Static431.aBoolean640) && arg1 != -1 && arg5.anIntArray90.length > arg1) {
				local91 = arg5.anIntArray90[arg1];
				local93 = arg5.anIntArray89[arg4];
				@Pc(180) int local180 = local91 >>> 16;
				local91 &= 0xFFFF;
				if (local112 == local180) {
					local97 = local95;
				} else {
					local97 = Static9.aClass194_1.method4376(local91 >>> 16);
				}
				if (local97 != null) {
					local83 |= local97.method1407(local91);
					local73 |= local97.method1411(local91);
					local87 |= local97.method1409(local91);
				}
			}
			if (local83) {
				local9 = 2208;
			}
			if (local73) {
				local9 |= 0x100;
			}
			if (local85) {
				local9 |= 0x200;
			}
			if (local87) {
				local9 |= 0x400;
			}
		}
		@Pc(257) long local257 = this.method5785(arg0, arg2, arg3 == null ? null : arg3.anIntArray10, local22);
		if (Static402.aClass129_67 != null) {
			local7 = (Class32) Static402.aClass129_67.method3023(local257);
		}
		if (local7 == null || arg7.method2259(local7.n(), local9) != 0) {
			if (local7 != null) {
				local9 = arg7.method2285(local9, local7.n());
			}
			@Pc(286) int local286 = local9;
			@Pc(288) boolean local288 = false;
			for (@Pc(290) int local290 = 0; local290 < local22.length; local290++) {
				if (local22[local290] != -1 && !Static350.aClass149_2.method3483(local22[local290]).method734(arg0)) {
					local288 = true;
				}
			}
			if (local288) {
				return null;
			}
			@Pc(323) Class266[] local323 = new Class266[local22.length];
			for (@Pc(325) int local325 = 0; local325 < local22.length; local325++) {
				if (local22[local325] != -1) {
					local323[local325] = Static350.aClass149_2.method3483(local22[local325]).method747(arg0);
				}
			}
			@Pc(380) int local380;
			if (local11 != null && local11.anIntArrayArray2 != null) {
				for (@Pc(360) int local360 = 0; local360 < local11.anIntArrayArray2.length; local360++) {
					if (local11.anIntArrayArray2[local360] != null && local323[local360] != null) {
						local380 = local11.anIntArrayArray2[local360][0];
						@Pc(387) int local387 = local11.anIntArrayArray2[local360][1];
						@Pc(394) int local394 = local11.anIntArrayArray2[local360][2];
						@Pc(401) int local401 = local11.anIntArrayArray2[local360][3];
						@Pc(408) int local408 = local11.anIntArrayArray2[local360][4];
						@Pc(415) int local415 = local11.anIntArrayArray2[local360][5];
						if (local401 != 0 || local408 != 0 || local415 != 0) {
							local323[local360].method6060(local408, local401, local415);
						}
						if (local380 != 0 || local387 != 0 || local394 != 0) {
							local323[local360].method6063(local394, local380, local387);
						}
					}
				}
			}
			if (arg3 != null) {
				local286 = local9 | 0x4000;
			}
			@Pc(478) Class266 local478 = new Class266(local323, local323.length);
			local7 = arg7.method2227(local478, local286, Static17.anInt401, 64, 850);
			if (arg3 != null) {
				for (local380 = 0; local380 < 5; local380++) {
					if (Static174.aShortArrayArray3[local380].length > arg3.anIntArray10[local380]) {
						local7.N(Static119.aShortArray27[local380], Static174.aShortArrayArray3[local380][arg3.anIntArray10[local380]]);
					}
					if (arg3.anIntArray10[local380] < Static339.aShortArrayArray5[local380].length) {
						local7.N(Static32.aShortArray4[local380], Static339.aShortArrayArray5[local380][arg3.anIntArray10[local380]]);
					}
				}
			}
			if (Static402.aClass129_67 != null) {
				local7.u(local9);
				Static402.aClass129_67.method3029(local7, local257);
			}
		}
		if (arg5 == null || local95 == null) {
			return local7;
		} else {
			@Pc(562) Class32 local562 = local7.method5678((byte) 1, local9, true);
			local562.method5668(0, arg5.aBoolean150, local95, local89, local97, local91, local93, arg6 - 1);
			return local562;
		}
	}
}
