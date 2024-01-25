import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eca")
public final class Class8_Sub18 extends Class8 {

	@OriginalMember(owner = "client!eca", name = "l", descriptor = "[I")
	public int[] anIntArray153 = new int[] { -1 };

	@OriginalMember(owner = "client!eca", name = "o", descriptor = "[I")
	public int[] anIntArray154 = new int[1];

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(Z[II[II)J")
	private long method2607(@OriginalArg(0) boolean arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(13) long[] local13 = Class21_Sub3.aLongArray10;
		@Pc(15) long local15 = -1L;
		@Pc(31) long local31 = local15 >>> 8 ^ local13[(int) (((long) (arg2 >> 8) ^ local15) & 0xFFL)];
		local15 = local31 >>> 8 ^ local13[(int) ((local31 ^ (long) arg2) & 0xFFL)];
		for (@Pc(47) int local47 = 0; local47 < arg1.length; local47++) {
			local15 = local13[(int) (((long) (arg1[local47] >> 24) ^ local15) & 0xFFL)] ^ local15 >>> 8;
			local15 = local15 >>> 8 ^ local13[(int) ((local15 ^ (long) (arg1[local47] >> 16)) & 0xFFL)];
			local15 = local15 >>> 8 ^ local13[(int) (((long) (arg1[local47] >> 8) ^ local15) & 0xFFL)];
			local15 = local15 >>> 8 ^ local13[(int) ((local15 ^ (long) arg1[local47]) & 0xFFL)];
		}
		if (arg3 != null) {
			for (@Pc(132) int local132 = 0; local132 < 5; local132++) {
				local15 = local13[(int) ((local15 ^ (long) arg3[local132]) & 0xFFL)] ^ local15 >>> 8;
			}
		}
		return local15 >>> 8 ^ local13[(int) (((long) (arg0 ? 1 : 0) ^ local15) & 0xFFL)];
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(BLclient!uba;ILclient!fba;IIZILclient!ha;I)Lclient!ka;")
	public Class83 method2608(@OriginalArg(1) Class337 arg0, @OriginalArg(3) Class97 arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) boolean arg4, @OriginalArg(7) int arg5, @OriginalArg(8) Class16 arg6, @OriginalArg(9) int arg7) {
		@Pc(7) Class83 local7 = null;
		@Pc(9) int local9 = 2048;
		@Pc(11) Class102 local11 = null;
		if (arg3 != -1) {
			local11 = Static472.aClass202_4.method5415(arg3);
		}
		@Pc(31) int[] local31 = this.anIntArray153;
		if (local11 != null && local11.anIntArray194 != null) {
			local31 = new int[local11.anIntArray194.length];
			for (@Pc(43) int local43 = 0; local43 < local11.anIntArray194.length; local43++) {
				@Pc(50) int local50 = local11.anIntArray194[local43];
				if (local50 >= 0 && local50 < this.anIntArray153.length) {
					local31[local43] = this.anIntArray153[local50];
				} else {
					local31[local43] = -1;
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
		@Pc(95) Class8_Sub5_Sub21 local95 = null;
		@Pc(97) Class8_Sub5_Sub21 local97 = null;
		if (arg1 != null) {
			local9 = 2080;
			local89 = arg1.anIntArray182[arg2];
			@Pc(112) int local112 = local89 >>> 16;
			local95 = Static28.aClass220_1.method5668(local112);
			local89 &= 0xFFFF;
			if (local95 != null) {
				local83 = local95.method8390(local89) | false;
				local81 = local95.method8388(local89) | false;
				local87 = local95.method8385(local89) | false;
				local85 = arg1.aBoolean264 | false;
			}
			if ((arg1.aBoolean263 || Static460.aBoolean600) && arg7 != -1 && arg7 < arg1.anIntArray182.length) {
				local91 = arg1.anIntArray182[arg7];
				local93 = arg1.anIntArray180[arg2];
				@Pc(176) int local176 = local91 >>> 16;
				local91 &= 0xFFFF;
				if (local176 == local112) {
					local97 = local95;
				} else {
					local97 = Static28.aClass220_1.method5668(local91 >>> 16);
				}
				if (local97 != null) {
					local83 |= local97.method8390(local91);
					local81 |= local97.method8388(local91);
					local87 |= local97.method8385(local91);
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
		@Pc(257) long local257 = this.method2607(arg4, local31, arg3, arg0 == null ? null : arg0.anIntArray538);
		if (Static60.aClass236_11 != null) {
			local7 = (Class83) Static60.aClass236_11.method6242(local257);
		}
		if (local7 == null || arg6.method6121(local7.ua(), local9) != 0) {
			if (local7 != null) {
				local9 = arg6.method6109(local9, local7.ua());
			}
			@Pc(286) int local286 = local9;
			@Pc(288) boolean local288 = false;
			for (@Pc(290) int local290 = 0; local290 < local31.length; local290++) {
				if (local31[local290] != -1 && !Static497.aClass258_21.method6652(local31[local290]).method7045(arg4)) {
					local288 = true;
				}
			}
			if (local288) {
				return null;
			}
			@Pc(323) Class344[] local323 = new Class344[local31.length];
			for (@Pc(325) int local325 = 0; local325 < local31.length; local325++) {
				if (local31[local325] != -1) {
					local323[local325] = Static497.aClass258_21.method6652(local31[local325]).method7055(arg4);
				}
			}
			@Pc(380) int local380;
			@Pc(387) int local387;
			if (local11 != null && local11.anIntArrayArray16 != null) {
				for (@Pc(360) int local360 = 0; local360 < local11.anIntArrayArray16.length; local360++) {
					if (local11.anIntArrayArray16[local360] != null && local323[local360] != null) {
						local380 = local11.anIntArrayArray16[local360][0];
						local387 = local11.anIntArrayArray16[local360][1];
						@Pc(394) int local394 = local11.anIntArrayArray16[local360][2];
						@Pc(401) int local401 = local11.anIntArrayArray16[local360][3];
						@Pc(408) int local408 = local11.anIntArrayArray16[local360][4];
						@Pc(415) int local415 = local11.anIntArrayArray16[local360][5];
						if (local401 != 0 || local408 != 0 || local415 != 0) {
							local323[local360].method8061(local408, local401, local415);
						}
						if (local380 != 0 || local387 != 0 || local394 != 0) {
							local323[local360].method8055(local380, local394, local387);
						}
					}
				}
			}
			if (arg0 != null) {
				local286 = local9 | 0x4000;
			}
			@Pc(465) Class344 local465 = new Class344(local323, local323.length);
			local7 = arg6.method6094(local465, local286, Static600.anInt10225, 64, 850);
			if (arg0 != null) {
				for (local380 = 0; local380 < 5; local380++) {
					for (local387 = 0; local387 < Static450.aShortArrayArrayArray2.length; local387++) {
						if (Static450.aShortArrayArrayArray2[local387][local380].length > arg0.anIntArray538[local380]) {
							local7.ia(Static174.aShortArrayArray6[local387][local380], Static450.aShortArrayArrayArray2[local387][local380][arg0.anIntArray538[local380]]);
						}
					}
				}
			}
			if (Static60.aClass236_11 != null) {
				local7.s(local9);
				Static60.aClass236_11.method6241(local257, local7);
			}
		}
		if (arg1 == null || local95 == null) {
			return local7;
		} else {
			@Pc(552) Class83 local552 = local7.method7993((byte) 1, local9, true);
			local552.method7998(arg1.aBoolean264, local91, local89, local97, local93, local95, arg5 - 1, 0);
			return local552;
		}
	}
}
