import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public final class Class7_Sub27 extends Class7 {

	@OriginalMember(owner = "client!kd", name = "i", descriptor = "[I")
	public int[] anIntArray323 = new int[] { -1 };

	@OriginalMember(owner = "client!kd", name = "j", descriptor = "[I")
	public int[] anIntArray324 = new int[1];

	static {
		new Class55("Player ", "Spieler ", "Joueur ", "Jogador ");
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "([IZ[III)J")
	private long method2963(@OriginalArg(0) int[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3) {
		@Pc(7) long[] local7 = Class22_Sub6.aLongArray6;
		@Pc(9) long local9 = -1L;
		@Pc(25) long local25 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) (arg3 >> 8)) & 0xFFL)];
		local9 = local7[(int) ((local25 ^ (long) arg3) & 0xFFL)] ^ local25 >>> 8;
		for (@Pc(41) int local41 = 0; local41 < arg2.length; local41++) {
			local9 = local7[(int) (((long) (arg2[local41] >> 24) ^ local9) & 0xFFL)] ^ local9 >>> 8;
			local9 = local7[(int) (((long) (arg2[local41] >> 16) ^ local9) & 0xFFL)] ^ local9 >>> 8;
			local9 = local7[(int) ((local9 ^ (long) (arg2[local41] >> 8)) & 0xFFL)] ^ local9 >>> 8;
			local9 = local7[(int) ((local9 ^ (long) arg2[local41]) & 0xFFL)] ^ local9 >>> 8;
		}
		if (arg0 != null) {
			for (@Pc(126) int local126 = 0; local126 < 5; local126++) {
				local9 = local7[(int) ((local9 ^ (long) arg0[local126]) & 0xFFL)] ^ local9 >>> 8;
			}
		}
		return local9 >>> 8 ^ local7[(int) (((long) (arg1 ? 1 : 0) ^ local9) & (long) 255)];
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIZILclient!ya;Lclient!lc;IILclient!fb;)Lclient!t;")
	public Class163 method2972(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class51 arg4, @OriginalArg(6) Class139 arg5, @OriginalArg(7) int arg6, @OriginalArg(9) Class75 arg7) {
		@Pc(7) Class163 local7 = null;
		@Pc(9) int local9 = 2048;
		@Pc(11) Class78 local11 = null;
		if (arg3 != -1) {
			local11 = Static223.aClass154_1.method3341(arg3);
		}
		@Pc(23) int[] local23 = this.anIntArray323;
		if (local11 != null && local11.anIntArray158 != null) {
			local23 = new int[local11.anIntArray158.length];
			for (@Pc(35) int local35 = 0; local35 < local11.anIntArray158.length; local35++) {
				@Pc(42) int local42 = local11.anIntArray158[local35];
				if (local42 >= 0 && this.anIntArray323.length > local42) {
					local23[local35] = this.anIntArray323[local42];
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
		@Pc(88) Class7_Sub4_Sub18 local88 = null;
		@Pc(90) Class7_Sub4_Sub18 local90 = null;
		if (arg5 != null) {
			local82 = arg5.anIntArray344[arg6];
			local9 = 2080;
			@Pc(105) int local105 = local82 >>> 16;
			local88 = Static364.aClass151_2.method3289(local105);
			local82 &= 0xFFFF;
			if (local88 != null) {
				local76 = local88.method5663(local82) | false;
				local74 = local88.method5666(local82) | false;
				local80 = local88.method5665(local82) | false;
				local78 = arg5.aBoolean243 | false;
			}
			if ((arg5.aBoolean245 || Static262.aBoolean495) && arg1 != -1 && arg5.anIntArray344.length > arg1) {
				local84 = arg5.anIntArray344[arg1];
				local86 = arg5.anIntArray345[arg6];
				@Pc(173) int local173 = local84 >>> 16;
				local84 &= 0xFFFF;
				if (local173 == local105) {
					local90 = local88;
				} else {
					local90 = Static364.aClass151_2.method3289(local84 >>> 16);
				}
				if (local90 != null) {
					local76 |= local90.method5663(local84);
					local74 |= local90.method5666(local84);
					local80 |= local90.method5665(local84);
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
		@Pc(254) long local254 = this.method2963(arg7 == null ? null : arg7.anIntArray146, arg2, local23, arg3);
		if (Static273.aClass126_39 != null) {
			local7 = (Class163) Static273.aClass126_39.method2822(local254);
		}
		if (local7 == null || arg4.method5352(local7.P(), local9) != 0) {
			if (local7 != null) {
				local9 = arg4.method5323(local9, local7.P());
			}
			@Pc(283) int local283 = local9;
			@Pc(285) boolean local285 = false;
			for (@Pc(287) int local287 = 0; local287 < local23.length; local287++) {
				if (local23[local287] != -1 && !Static259.aClass206_2.method4320(local23[local287]).method776(arg2)) {
					local285 = true;
				}
			}
			if (local285) {
				return null;
			}
			@Pc(320) Class117[] local320 = new Class117[local23.length];
			for (@Pc(322) int local322 = 0; local322 < local23.length; local322++) {
				if (local23[local322] != -1) {
					local320[local322] = Static259.aClass206_2.method4320(local23[local322]).method773(arg2);
				}
			}
			@Pc(378) int local378;
			if (local11 != null && local11.anIntArrayArray15 != null) {
				for (@Pc(358) int local358 = 0; local358 < local11.anIntArrayArray15.length; local358++) {
					if (local11.anIntArrayArray15[local358] != null && local320[local358] != null) {
						local378 = local11.anIntArrayArray15[local358][0];
						@Pc(385) int local385 = local11.anIntArrayArray15[local358][1];
						@Pc(392) int local392 = local11.anIntArrayArray15[local358][2];
						@Pc(399) int local399 = local11.anIntArrayArray15[local358][3];
						@Pc(406) int local406 = local11.anIntArrayArray15[local358][4];
						@Pc(413) int local413 = local11.anIntArrayArray15[local358][5];
						if (local399 != 0 || local406 != 0 || local413 != 0) {
							local320[local358].method2598(local406, local413, local399);
						}
						if (local378 != 0 || local385 != 0 || local392 != 0) {
							local320[local358].method2594(local385, local392, local378);
						}
					}
				}
			}
			if (arg7 != null) {
				local283 = local9 | 0x4000;
			}
			@Pc(472) Class117 local472 = new Class117(local320, local320.length);
			local7 = arg4.method5346(local472, local283, Static259.anInt4363, 64, 850);
			if (arg7 != null) {
				for (local378 = 0; local378 < 5; local378++) {
					if (arg7.anIntArray146[local378] < Static407.aShortArrayArray7[local378].length) {
						local7.BA(Static45.aShortArray9[local378], Static407.aShortArrayArray7[local378][arg7.anIntArray146[local378]]);
					}
					if (Static291.aShortArrayArray3[local378].length > arg7.anIntArray146[local378]) {
						local7.BA(Static361.aShortArray98[local378], Static291.aShortArrayArray3[local378][arg7.anIntArray146[local378]]);
					}
				}
			}
			if (Static273.aClass126_39 != null) {
				local7.UA(local9);
				Static273.aClass126_39.method2824(local254, local7);
			}
		}
		if (arg5 == null || local88 == null) {
			return local7;
		} else {
			@Pc(569) Class163 local569 = local7.method4654((byte) 1, local9, true);
			local569.method4660(arg5.aBoolean243, local88, 0, local90, arg0 - 1, local82, local84, local86);
			return local569;
		}
	}
}
