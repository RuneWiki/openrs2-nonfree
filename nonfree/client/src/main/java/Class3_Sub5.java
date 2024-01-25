import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ar")
public final class Class3_Sub5 extends Class3 {

	@OriginalMember(owner = "client!ar", name = "r", descriptor = "[I")
	public int[] anIntArray120 = new int[] { -1 };

	@OriginalMember(owner = "client!ar", name = "n", descriptor = "[I")
	public int[] anIntArray117 = new int[1];

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(Lclient!vv;Lclient!hi;IILclient!oa;BIIIZ)Lclient!ba;")
	public Class2 method698(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class122 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class5 arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) boolean arg7) {
		@Pc(7) Class2 local7 = null;
		@Pc(9) int local9 = 2048;
		@Pc(11) Class73 local11 = null;
		if (arg3 != -1) {
			local11 = Static546.aClass132_1.method3756(arg3);
		}
		@Pc(25) int[] local25 = this.anIntArray120;
		if (local11 != null && local11.anIntArray249 != null) {
			local25 = new int[local11.anIntArray249.length];
			for (@Pc(37) int local37 = 0; local37 < local11.anIntArray249.length; local37++) {
				@Pc(44) int local44 = local11.anIntArray249[local37];
				if (local44 >= 0 && this.anIntArray120.length > local44) {
					local25[local37] = this.anIntArray120[local44];
				} else {
					local25[local37] = -1;
				}
			}
		}
		@Pc(76) boolean local76 = false;
		@Pc(78) boolean local78 = false;
		@Pc(80) boolean local80 = false;
		@Pc(82) boolean local82 = false;
		@Pc(84) int local84 = -1;
		@Pc(91) int local91 = -1;
		@Pc(93) int local93 = 0;
		@Pc(95) Class3_Sub10_Sub6 local95 = null;
		@Pc(97) Class3_Sub10_Sub6 local97 = null;
		if (arg1 != null) {
			local9 = 2080;
			local84 = arg1.anIntArray396[arg2];
			@Pc(112) int local112 = local84 >>> 16;
			local84 &= 0xFFFF;
			local95 = Static46.aClass247_1.method6032(local112);
			if (local95 != null) {
				local78 = local95.method2659(local84) | false;
				local76 = local95.method2658(local84) | false;
				local82 = local95.method2660(local84) | false;
				local80 = arg1.aBoolean299 | false;
			}
			if ((arg1.aBoolean296 || Static497.aBoolean651) && arg5 != -1 && arg1.anIntArray396.length > arg5) {
				local93 = arg1.anIntArray394[arg2];
				local91 = arg1.anIntArray396[arg5];
				@Pc(181) int local181 = local91 >>> 16;
				local91 &= 0xFFFF;
				if (local112 == local181) {
					local97 = local95;
				} else {
					local97 = Static46.aClass247_1.method6032(local91 >>> 16);
				}
				if (local97 != null) {
					local78 |= local97.method2659(local91);
					local76 |= local97.method2658(local91);
					local82 |= local97.method2660(local91);
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
			if (local82) {
				local9 |= 0x400;
			}
		}
		@Pc(260) long local260 = this.method699(arg0 == null ? null : arg0.anIntArray766, local25, arg3, arg7);
		if (Static376.aClass125_63 != null) {
			local7 = (Class2) Static376.aClass125_63.method3512(local260);
		}
		if (local7 == null || arg4.method7435(local7.h(), local9) != 0) {
			if (local7 != null) {
				local9 = arg4.method7418(local9, local7.h());
			}
			@Pc(286) int local286 = local9;
			@Pc(288) boolean local288 = false;
			for (@Pc(290) int local290 = 0; local290 < local25.length; local290++) {
				if (local25[local290] != -1 && !Static99.aClass96_7.method2508(local25[local290]).method812(arg7)) {
					local288 = true;
				}
			}
			if (local288) {
				return null;
			}
			@Pc(327) Class222[] local327 = new Class222[local25.length];
			for (@Pc(329) int local329 = 0; local329 < local25.length; local329++) {
				if (local25[local329] != -1) {
					local327[local329] = Static99.aClass96_7.method2508(local25[local329]).method831(arg7);
				}
			}
			@Pc(381) int local381;
			if (local11 != null && local11.anIntArrayArray29 != null) {
				for (@Pc(361) int local361 = 0; local361 < local11.anIntArrayArray29.length; local361++) {
					if (local11.anIntArrayArray29[local361] != null && local327[local361] != null) {
						local381 = local11.anIntArrayArray29[local361][0];
						@Pc(388) int local388 = local11.anIntArrayArray29[local361][1];
						@Pc(395) int local395 = local11.anIntArrayArray29[local361][2];
						@Pc(402) int local402 = local11.anIntArrayArray29[local361][3];
						@Pc(409) int local409 = local11.anIntArrayArray29[local361][4];
						@Pc(416) int local416 = local11.anIntArrayArray29[local361][5];
						if (local402 != 0 || local409 != 0 || local416 != 0) {
							local327[local361].method5600(local416, local402, local409);
						}
						if (local381 != 0 || local388 != 0 || local395 != 0) {
							local327[local361].method5604(local381, local395, local388);
						}
					}
				}
			}
			if (arg0 != null) {
				local286 = local9 | 0x4000;
			}
			@Pc(466) Class222 local466 = new Class222(local327, local327.length);
			local7 = arg4.method7443(local466, local286, Static509.anInt8870, 64, 850);
			if (arg0 != null) {
				for (local381 = 0; local381 < 5; local381++) {
					if (arg0.anIntArray766[local381] < Static522.aShortArrayArray10[local381].length) {
						local7.UA(Static73.aShortArray199[local381], Static522.aShortArrayArray10[local381][arg0.anIntArray766[local381]]);
					}
					if (Static518.aShortArrayArray2[local381].length > arg0.anIntArray766[local381]) {
						local7.UA(Static96.aShortArray49[local381], Static518.aShortArrayArray2[local381][arg0.anIntArray766[local381]]);
					}
				}
			}
			if (Static376.aClass125_63 != null) {
				local7.ia(local9);
				Static376.aClass125_63.method3519(local260, local7);
			}
		}
		if (arg1 == null || local95 == null) {
			return local7;
		} else {
			@Pc(556) Class2 local556 = local7.method5775((byte) 1, local9, true);
			local556.method5769(local84, arg1.aBoolean299, 0, local95, arg6 - 1, local91, local93, local97);
			return local556;
		}
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "([II[IIZ)J")
	private long method699(@OriginalArg(0) int[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(7) long[] local7 = Class6_Sub1.aLongArray28;
		@Pc(9) long local9 = -1L;
		@Pc(25) long local25 = local7[(int) ((local9 ^ (long) (arg2 >> 8)) & 0xFFL)] ^ local9 >>> 8;
		local9 = local7[(int) (((long) arg2 ^ local25) & 0xFFL)] ^ local25 >>> 8;
		for (@Pc(41) int local41 = 0; local41 < arg1.length; local41++) {
			local9 = local7[(int) ((local9 ^ (long) (arg1[local41] >> 24)) & 0xFFL)] ^ local9 >>> 8;
			local9 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) (arg1[local41] >> 16)) & 0xFFL)];
			local9 = local9 >>> 8 ^ local7[(int) (((long) (arg1[local41] >> 8) ^ local9) & 0xFFL)];
			local9 = local7[(int) (((long) arg1[local41] ^ local9) & 0xFFL)] ^ local9 >>> 8;
		}
		if (arg0 != null) {
			for (@Pc(142) int local142 = 0; local142 < 5; local142++) {
				local9 = local7[(int) (((long) arg0[local142] ^ local9) & 0xFFL)] ^ local9 >>> 8;
			}
		}
		return local9 >>> 8 ^ local7[(int) (((long) (arg3 ? 1 : 0) ^ local9) & 0xFFL)];
	}
}
