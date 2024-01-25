import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kw")
public final class Class1_Sub28 extends Class1 {

	@OriginalMember(owner = "client!kw", name = "o", descriptor = "[I")
	public int[] anIntArray291 = new int[] { -1 };

	@OriginalMember(owner = "client!kw", name = "p", descriptor = "[I")
	public int[] anIntArray292 = new int[1];

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "([II[IBZ)J")
	private long method3226(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) boolean arg3) {
		@Pc(7) long[] local7 = Class148.aLongArray5;
		@Pc(9) long local9 = -1L;
		@Pc(25) long local25 = local9 >>> 8 ^ local7[(int) (((long) (arg1 >> 8) ^ local9) & 0xFFL)];
		local9 = local7[(int) ((local25 ^ (long) arg1) & 0xFFL)] ^ local25 >>> 8;
		for (@Pc(47) int local47 = 0; local47 < arg0.length; local47++) {
			local9 = local7[(int) (((long) (arg0[local47] >> 24) ^ local9) & 0xFFL)] ^ local9 >>> 8;
			local9 = local7[(int) ((local9 ^ (long) (arg0[local47] >> 16)) & 0xFFL)] ^ local9 >>> 8;
			local9 = local9 >>> 8 ^ local7[(int) (((long) (arg0[local47] >> 8) ^ local9) & 0xFFL)];
			local9 = local7[(int) (((long) arg0[local47] ^ local9) & 0xFFL)] ^ local9 >>> 8;
		}
		if (arg2 != null) {
			for (@Pc(128) int local128 = 0; local128 < 5; local128++) {
				local9 = local9 >>> 8 ^ local7[(int) (((long) arg2[local128] ^ local9) & 0xFFL)];
			}
		}
		return local9 >>> 8 ^ local7[(int) ((local9 ^ (long) (arg3 ? 1 : 0)) & 0xFFL)];
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(ILclient!jl;IILclient!za;ILclient!eb;IIZ)Lclient!e;")
	public Class8 method3227(@OriginalArg(1) Class131 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class117 arg3, @OriginalArg(6) Class64 arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) boolean arg7) {
		@Pc(7) Class8 local7 = null;
		@Pc(9) int local9 = 2048;
		@Pc(11) Class164 local11 = null;
		if (arg1 != -1) {
			local11 = Static106.aClass199_131.method4206(arg1);
		}
		@Pc(23) int[] local23 = this.anIntArray291;
		if (local11 != null && local11.anIntArray346 != null) {
			local23 = new int[local11.anIntArray346.length];
			for (@Pc(35) int local35 = 0; local35 < local11.anIntArray346.length; local35++) {
				@Pc(42) int local42 = local11.anIntArray346[local35];
				if (local42 >= 0 && local42 < this.anIntArray291.length) {
					local23[local35] = this.anIntArray291[local42];
				} else {
					local23[local35] = -1;
				}
			}
		}
		@Pc(77) boolean local77 = false;
		@Pc(79) boolean local79 = false;
		@Pc(81) boolean local81 = false;
		@Pc(83) boolean local83 = false;
		@Pc(85) int local85 = -1;
		@Pc(87) int local87 = -1;
		@Pc(89) int local89 = 0;
		@Pc(91) Class1_Sub3_Sub14 local91 = null;
		@Pc(93) Class1_Sub3_Sub14 local93 = null;
		if (arg4 != null) {
			local85 = arg4.anIntArray127[arg5];
			local9 = 2080;
			@Pc(108) int local108 = local85 >>> 16;
			local91 = Static402.aClass37_2.method671(local108);
			local85 &= 0xFFFF;
			if (local91 != null) {
				local79 = local91.method3588(local85) | false;
				local77 = local91.method3591(local85) | false;
				local83 = local91.method3589(local85) | false;
				local81 = arg4.aBoolean141 | false;
			}
			if ((arg4.aBoolean142 || Static463.aBoolean651) && arg6 != -1 && arg6 < arg4.anIntArray127.length) {
				local89 = arg4.anIntArray126[arg5];
				local87 = arg4.anIntArray127[arg6];
				@Pc(172) int local172 = local87 >>> 16;
				local87 &= 0xFFFF;
				if (local172 == local108) {
					local93 = local91;
				} else {
					local93 = Static402.aClass37_2.method671(local87 >>> 16);
				}
				if (local93 != null) {
					local79 |= local93.method3588(local87);
					local77 |= local93.method3591(local87);
					local83 |= local93.method3589(local87);
				}
			}
			if (local79) {
				local9 = 2208;
			}
			if (local77) {
				local9 |= 0x100;
			}
			if (local81) {
				local9 |= 0x200;
			}
			if (local83) {
				local9 |= 0x400;
			}
		}
		@Pc(251) long local251 = this.method3226(local23, arg1, arg0 == null ? null : arg0.anIntArray267, arg7);
		if (Static40.aClass77_8 != null) {
			local7 = (Class8) Static40.aClass77_8.method1387(local251);
		}
		if (local7 == null || arg3.method5732(local7.RA(), local9) != 0) {
			if (local7 != null) {
				local9 = arg3.method5696(local9, local7.RA());
			}
			@Pc(277) int local277 = local9;
			@Pc(279) boolean local279 = false;
			for (@Pc(281) int local281 = 0; local281 < local23.length; local281++) {
				if (local23[local281] != -1 && !Static285.aClass226_2.method4788(local23[local281]).method2995(arg7)) {
					local279 = true;
				}
			}
			if (local279) {
				return null;
			}
			@Pc(314) Class147[] local314 = new Class147[local23.length];
			for (@Pc(316) int local316 = 0; local316 < local23.length; local316++) {
				if (local23[local316] != -1) {
					local314[local316] = Static285.aClass226_2.method4788(local23[local316]).method2998(arg7);
				}
			}
			@Pc(371) int local371;
			if (local11 != null && local11.anIntArrayArray41 != null) {
				for (@Pc(351) int local351 = 0; local351 < local11.anIntArrayArray41.length; local351++) {
					if (local11.anIntArrayArray41[local351] != null && local314[local351] != null) {
						local371 = local11.anIntArrayArray41[local351][0];
						@Pc(378) int local378 = local11.anIntArrayArray41[local351][1];
						@Pc(385) int local385 = local11.anIntArrayArray41[local351][2];
						@Pc(392) int local392 = local11.anIntArrayArray41[local351][3];
						@Pc(399) int local399 = local11.anIntArrayArray41[local351][4];
						@Pc(406) int local406 = local11.anIntArrayArray41[local351][5];
						if (local392 != 0 || local399 != 0 || local406 != 0) {
							local314[local351].method3297(local406, local392, local399);
						}
						if (local371 != 0 || local378 != 0 || local385 != 0) {
							local314[local351].method3301(local371, local378, local385);
						}
					}
				}
			}
			@Pc(465) Class147 local465 = new Class147(local314, local314.length);
			if (arg0 != null) {
				local277 = local9 | 0x4000;
			}
			local7 = arg3.method5678(local465, local277, Static172.anInt2847, 64, 850);
			if (arg0 != null) {
				for (local371 = 0; local371 < 5; local371++) {
					if (Static440.aShortArrayArray7[local371].length > arg0.anIntArray267[local371]) {
						local7.q(Static11.aShortArray8[local371], Static440.aShortArrayArray7[local371][arg0.anIntArray267[local371]]);
					}
					if (Static96.aShortArrayArray3[local371].length > arg0.anIntArray267[local371]) {
						local7.q(Static173.aShortArray36[local371], Static96.aShortArrayArray3[local371][arg0.anIntArray267[local371]]);
					}
				}
			}
			if (Static40.aClass77_8 != null) {
				local7.D(local9);
				Static40.aClass77_8.method1396(local7, local251);
			}
		}
		if (arg4 == null || local91 == null) {
			return local7;
		} else {
			@Pc(565) Class8 local565 = local7.method5983((byte) 1, local9, true);
			local565.method5998(local85, local87, local93, 0, arg2 - 1, local89, arg4.aBoolean141, local91);
			return local565;
		}
	}
}
