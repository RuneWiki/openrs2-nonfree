import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dca")
public final class Class6_Sub13 extends Class6 {

	@OriginalMember(owner = "client!dca", name = "o", descriptor = "[I")
	public int[] anIntArray172 = new int[1];

	@OriginalMember(owner = "client!dca", name = "k", descriptor = "[I")
	public int[] anIntArray171 = new int[] { -1 };

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(ILclient!oa;IIZLclient!ph;IILclient!fq;I)Lclient!ba;")
	public Class22 method1294(@OriginalArg(0) int arg0, @OriginalArg(1) Class121 arg1, @OriginalArg(4) boolean arg2, @OriginalArg(5) Class246 arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) Class108 arg6, @OriginalArg(9) int arg7) {
		@Pc(7) Class22 local7 = null;
		@Pc(9) int local9 = 2048;
		@Pc(11) Class120 local11 = null;
		if (arg7 != -1) {
			local11 = Static492.aClass189_1.method4109(arg7);
		}
		@Pc(24) int[] local24 = this.anIntArray171;
		if (local11 != null && local11.anIntArray330 != null) {
			local24 = new int[local11.anIntArray330.length];
			for (@Pc(36) int local36 = 0; local36 < local11.anIntArray330.length; local36++) {
				@Pc(43) int local43 = local11.anIntArray330[local36];
				if (local43 >= 0 && this.anIntArray171.length > local43) {
					local24[local36] = this.anIntArray171[local43];
				} else {
					local24[local36] = -1;
				}
			}
		}
		@Pc(78) boolean local78 = false;
		@Pc(80) boolean local80 = false;
		@Pc(82) boolean local82 = false;
		@Pc(89) boolean local89 = false;
		@Pc(91) int local91 = -1;
		@Pc(93) int local93 = -1;
		@Pc(95) int local95 = 0;
		@Pc(97) Class6_Sub1_Sub7 local97 = null;
		@Pc(99) Class6_Sub1_Sub7 local99 = null;
		if (arg6 != null) {
			local91 = arg6.anIntArray312[arg0];
			local9 = 2080;
			@Pc(114) int local114 = local91 >>> 16;
			local91 &= 0xFFFF;
			local97 = Static31.aClass345_1.method7796(local114);
			if (local97 != null) {
				local80 = local97.method2235(local91) | false;
				local78 = local97.method2234(local91) | false;
				local89 = local97.method2239(local91) | false;
				local82 = arg6.aBoolean178 | false;
			}
			if ((arg6.aBoolean177 || Static318.aBoolean368) && arg5 != -1 && arg6.anIntArray312.length > arg5) {
				local95 = arg6.anIntArray313[arg0];
				local93 = arg6.anIntArray312[arg5];
				@Pc(182) int local182 = local93 >>> 16;
				local93 &= 0xFFFF;
				if (local182 == local114) {
					local99 = local97;
				} else {
					local99 = Static31.aClass345_1.method7796(local93 >>> 16);
				}
				if (local99 != null) {
					local80 |= local99.method2235(local93);
					local78 |= local99.method2234(local93);
					local89 |= local99.method2239(local93);
				}
			}
			if (local80) {
				local9 = 2208;
			}
			if (local78) {
				local9 |= 0x100;
			}
			if (local82) {
				local9 |= 0x200;
			}
			if (local89) {
				local9 |= 0x400;
			}
		}
		@Pc(263) long local263 = this.method1298(arg3 == null ? null : arg3.anIntArray563, local24, arg7, arg2);
		if (Static542.aClass332_198 != null) {
			local7 = (Class22) Static542.aClass332_198.method7502(local263);
		}
		if (local7 == null || arg1.method7150(local7.h(), local9) != 0) {
			if (local7 != null) {
				local9 = arg1.method7099(local9, local7.h());
			}
			@Pc(291) int local291 = local9;
			@Pc(293) boolean local293 = false;
			for (@Pc(295) int local295 = 0; local295 < local24.length; local295++) {
				if (local24[local295] != -1 && !Static295.aClass256_2.method5924(local24[local295]).method2204(arg2)) {
					local293 = true;
				}
			}
			if (local293) {
				return null;
			}
			@Pc(334) Class274[] local334 = new Class274[local24.length];
			for (@Pc(336) int local336 = 0; local336 < local24.length; local336++) {
				if (local24[local336] != -1) {
					local334[local336] = Static295.aClass256_2.method5924(local24[local336]).method2195(arg2);
				}
			}
			@Pc(388) int local388;
			if (local11 != null && local11.anIntArrayArray38 != null) {
				for (@Pc(368) int local368 = 0; local368 < local11.anIntArrayArray38.length; local368++) {
					if (local11.anIntArrayArray38[local368] != null && local334[local368] != null) {
						local388 = local11.anIntArrayArray38[local368][0];
						@Pc(395) int local395 = local11.anIntArrayArray38[local368][1];
						@Pc(402) int local402 = local11.anIntArrayArray38[local368][2];
						@Pc(409) int local409 = local11.anIntArrayArray38[local368][3];
						@Pc(416) int local416 = local11.anIntArrayArray38[local368][4];
						@Pc(423) int local423 = local11.anIntArrayArray38[local368][5];
						if (local409 != 0 || local416 != 0 || local423 != 0) {
							local334[local368].method6327(local423, local416, local409);
						}
						if (local388 != 0 || local395 != 0 || local402 != 0) {
							local334[local368].method6329(local395, local388, local402);
						}
					}
				}
			}
			@Pc(476) Class274 local476 = new Class274(local334, local334.length);
			if (arg3 != null) {
				local291 = local9 | 0x4000;
			}
			local7 = arg1.method7088(local476, local291, Static400.anInt8133, 64, 850);
			if (arg3 != null) {
				for (local388 = 0; local388 < 5; local388++) {
					if (Static33.aShortArrayArray2[local388].length > arg3.anIntArray563[local388]) {
						local7.UA(Static62.aShortArray14[local388], Static33.aShortArrayArray2[local388][arg3.anIntArray563[local388]]);
					}
					if (arg3.anIntArray563[local388] < Static192.aShortArrayArray6[local388].length) {
						local7.UA(Static188.aShortArray61[local388], Static192.aShortArrayArray6[local388][arg3.anIntArray563[local388]]);
					}
				}
			}
			if (Static542.aClass332_198 != null) {
				local7.ia(local9);
				Static542.aClass332_198.method7498(local263, local7);
			}
		}
		if (arg6 == null || local97 == null) {
			return local7;
		} else {
			@Pc(570) Class22 local570 = local7.method4699((byte) 1, local9, true);
			local570.method4700(0, local93, local95, arg4 - 1, local97, local99, arg6.aBoolean178, local91);
			return local570;
		}
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "([I[IIZI)J")
	private long method1298(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) long[] local7 = Class319.aLongArray15;
		@Pc(9) long local9 = -1L;
		@Pc(25) long local25 = local7[(int) (((long) (arg2 >> 8) ^ local9) & 0xFFL)] ^ local9 >>> 8;
		local9 = local7[(int) (((long) arg2 ^ local25) & 0xFFL)] ^ local25 >>> 8;
		for (@Pc(47) int local47 = 0; local47 < arg1.length; local47++) {
			local9 = local9 >>> 8 ^ local7[(int) (((long) (arg1[local47] >> 24) ^ local9) & 0xFFL)];
			local9 = local7[(int) ((local9 ^ (long) (arg1[local47] >> 16)) & 0xFFL)] ^ local9 >>> 8;
			local9 = local9 >>> 8 ^ local7[(int) (((long) (arg1[local47] >> 8) ^ local9) & 0xFFL)];
			local9 = local9 >>> 8 ^ local7[(int) (((long) arg1[local47] ^ local9) & 0xFFL)];
		}
		if (arg0 != null) {
			for (@Pc(132) int local132 = 0; local132 < 5; local132++) {
				local9 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) arg0[local132]) & 0xFFL)];
			}
		}
		return local9 >>> 8 ^ local7[(int) (((long) (arg3 ? 1 : 0) ^ local9) & 0xFFL)];
	}
}
