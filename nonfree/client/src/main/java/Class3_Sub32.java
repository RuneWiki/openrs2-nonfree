import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ls")
public final class Class3_Sub32 extends Class3 {

	@OriginalMember(owner = "client!ls", name = "k", descriptor = "[I")
	public int[] anIntArray274 = new int[] { -1 };

	@OriginalMember(owner = "client!ls", name = "o", descriptor = "[I")
	public int[] anIntArray275 = new int[1];

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(IZLclient!qi;ILclient!qa;IIIILclient!vr;)Lclient!ka;")
	public Class108 method3507(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class198 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class167 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) Class261 arg7) {
		@Pc(7) Class108 local7 = null;
		@Pc(9) int local9 = 2048;
		@Pc(11) Class142 local11 = null;
		if (arg6 != -1) {
			local11 = Static212.aClass238_1.method5438(arg6);
		}
		@Pc(23) int[] local23 = this.anIntArray274;
		if (local11 != null && local11.anIntArray276 != null) {
			local23 = new int[local11.anIntArray276.length];
			for (@Pc(35) int local35 = 0; local35 < local11.anIntArray276.length; local35++) {
				@Pc(42) int local42 = local11.anIntArray276[local35];
				if (local42 >= 0 && local42 < this.anIntArray274.length) {
					local23[local35] = this.anIntArray274[local42];
				} else {
					local23[local35] = -1;
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
		@Pc(95) Class3_Sub3_Sub17 local95 = null;
		@Pc(97) Class3_Sub3_Sub17 local97 = null;
		if (arg7 != null) {
			local9 = 2080;
			local89 = arg7.anIntArray494[arg5];
			@Pc(112) int local112 = local89 >>> 16;
			local95 = Static444.aClass59_3.method1548(local112);
			local89 &= 0xFFFF;
			if (local95 != null) {
				local83 = local95.method6063(local89) | false;
				local81 = local95.method6069(local89) | false;
				local87 = local95.method6066(local89) | false;
				local85 = arg7.aBoolean501 | false;
			}
			if ((arg7.aBoolean502 || Static454.aBoolean509) && arg2 != -1 && arg2 < arg7.anIntArray494.length) {
				local93 = arg7.anIntArray493[arg5];
				local91 = arg7.anIntArray494[arg2];
				@Pc(180) int local180 = local91 >>> 16;
				local91 &= 0xFFFF;
				if (local112 == local180) {
					local97 = local95;
				} else {
					local97 = Static444.aClass59_3.method1548(local91 >>> 16);
				}
				if (local97 != null) {
					local83 |= local97.method6063(local91);
					local81 |= local97.method6069(local91);
					local87 |= local97.method6066(local91);
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
		@Pc(263) long local263 = this.method3508(local23, arg6, arg0, arg1 == null ? null : arg1.anIntArray349);
		if (Static106.aClass268_45 != null) {
			local7 = (Class108) Static106.aClass268_45.method6166(local263);
		}
		if (local7 == null || arg3.method6006(local7.ma(), local9) != 0) {
			if (local7 != null) {
				local9 = arg3.method5967(local9, local7.ma());
			}
			@Pc(289) int local289 = local9;
			@Pc(291) boolean local291 = false;
			for (@Pc(293) int local293 = 0; local293 < local23.length; local293++) {
				if (local23[local293] != -1 && !Static158.aClass272_1.method6283(local23[local293]).method4974(arg0)) {
					local291 = true;
				}
			}
			if (local291) {
				return null;
			}
			@Pc(325) Class160[] local325 = new Class160[local23.length];
			for (@Pc(327) int local327 = 0; local327 < local23.length; local327++) {
				if (local23[local327] != -1) {
					local325[local327] = Static158.aClass272_1.method6283(local23[local327]).method4985(arg0);
				}
			}
			@Pc(378) int local378;
			if (local11 != null && local11.anIntArrayArray33 != null) {
				for (@Pc(358) int local358 = 0; local358 < local11.anIntArrayArray33.length; local358++) {
					if (local11.anIntArrayArray33[local358] != null && local325[local358] != null) {
						local378 = local11.anIntArrayArray33[local358][0];
						@Pc(385) int local385 = local11.anIntArrayArray33[local358][1];
						@Pc(392) int local392 = local11.anIntArrayArray33[local358][2];
						@Pc(399) int local399 = local11.anIntArrayArray33[local358][3];
						@Pc(406) int local406 = local11.anIntArrayArray33[local358][4];
						@Pc(413) int local413 = local11.anIntArrayArray33[local358][5];
						if (local399 != 0 || local406 != 0 || local413 != 0) {
							local325[local358].method3783(local413, local399, local406);
						}
						if (local378 != 0 || local385 != 0 || local392 != 0) {
							local325[local358].method3776(local385, local392, local378);
						}
					}
				}
			}
			@Pc(463) Class160 local463 = new Class160(local325, local325.length);
			if (arg1 != null) {
				local289 = local9 | 0x4000;
			}
			local7 = arg3.method5984(local463, local289, Static36.anInt626, 64, 850);
			if (arg1 != null) {
				for (local378 = 0; local378 < 5; local378++) {
					if (Static417.aShortArrayArray9[local378].length > arg1.anIntArray349[local378]) {
						local7.i(Static243.aShortArray113[local378], Static417.aShortArrayArray9[local378][arg1.anIntArray349[local378]]);
					}
					if (arg1.anIntArray349[local378] < Static212.aShortArrayArray3[local378].length) {
						local7.i(Static424.aShortArray114[local378], Static212.aShortArrayArray3[local378][arg1.anIntArray349[local378]]);
					}
				}
			}
			if (Static106.aClass268_45 != null) {
				local7.B(local9);
				Static106.aClass268_45.method6164(local7, local263);
			}
		}
		if (arg7 == null || local95 == null) {
			return local7;
		} else {
			@Pc(561) Class108 local561 = local7.method4930((byte) 1, local9, true);
			local561.method4943(arg7.aBoolean501, local97, local91, local95, local93, local89, arg4 - 1, 0);
			return local561;
		}
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "([IBIZ[I)J")
	private long method3508(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int[] arg3) {
		@Pc(7) long[] local7 = Class165.aLongArray8;
		@Pc(9) long local9 = -1L;
		@Pc(25) long local25 = local7[(int) (((long) (arg1 >> 8) ^ local9) & 0xFFL)] ^ local9 >>> 8;
		local9 = local7[(int) ((local25 ^ (long) arg1) & 0xFFL)] ^ local25 >>> 8;
		for (@Pc(57) int local57 = 0; local57 < arg0.length; local57++) {
			local9 = local9 >>> 8 ^ local7[(int) (((long) (arg0[local57] >> 24) ^ local9) & 0xFFL)];
			local9 = local7[(int) (((long) (arg0[local57] >> 16) ^ local9) & 0xFFL)] ^ local9 >>> 8;
			local9 = local7[(int) (((long) (arg0[local57] >> 8) ^ local9) & 0xFFL)] ^ local9 >>> 8;
			local9 = local7[(int) (((long) arg0[local57] ^ local9) & 0xFFL)] ^ local9 >>> 8;
		}
		if (arg3 != null) {
			for (@Pc(142) int local142 = 0; local142 < 5; local142++) {
				local9 = local7[(int) (((long) arg3[local142] ^ local9) & 0xFFL)] ^ local9 >>> 8;
			}
		}
		return local9 >>> 8 ^ local7[(int) (((long) (arg2 ? 1 : 0) ^ local9) & 0xFFL)];
	}
}
