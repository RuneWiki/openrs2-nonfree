import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tda")
public final class Class1_Sub46 extends Class1 {

	@OriginalMember(owner = "client!tda", name = "k", descriptor = "[I")
	public int[] anIntArray576 = new int[1];

	@OriginalMember(owner = "client!tda", name = "l", descriptor = "[I")
	public int[] anIntArray577 = new int[] { -1 };

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "([IIZB[I)J")
	private long method6998(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int[] arg3) {
		@Pc(12) long[] local12 = Class18.aLongArray2;
		@Pc(14) long local14 = -1L;
		@Pc(30) long local30 = local14 >>> 8 ^ local12[(int) (((long) (arg1 >> 8) ^ local14) & 0xFFL)];
		local14 = local12[(int) (((long) arg1 ^ local30) & 0xFFL)] ^ local30 >>> 8;
		for (@Pc(46) int local46 = 0; local46 < arg3.length; local46++) {
			local14 = local14 >>> 8 ^ local12[(int) ((local14 ^ (long) (arg3[local46] >> 24)) & 0xFFL)];
			local14 = local14 >>> 8 ^ local12[(int) (((long) (arg3[local46] >> 16) ^ local14) & 0xFFL)];
			local14 = local14 >>> 8 ^ local12[(int) (((long) (arg3[local46] >> 8) ^ local14) & 0xFFL)];
			local14 = local12[(int) (((long) arg3[local46] ^ local14) & 0xFFL)] ^ local14 >>> 8;
		}
		if (arg0 != null) {
			for (@Pc(127) int local127 = 0; local127 < 5; local127++) {
				local14 = local14 >>> 8 ^ local12[(int) ((local14 ^ (long) arg0[local127]) & 0xFFL)];
			}
		}
		return local14 >>> 8 ^ local12[(int) (((long) (arg2 ? 1 : 0) ^ local14) & 0xFFL)];
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(Lclient!hca;ILclient!r;IIIIIZLclient!bl;)Lclient!da;")
	public Class61 method7000(@OriginalArg(0) Class131 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class12 arg2, @OriginalArg(3) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) boolean arg6, @OriginalArg(9) Class34 arg7) {
		@Pc(7) Class61 local7 = null;
		@Pc(9) int local9 = 2048;
		@Pc(11) Class138 local11 = null;
		if (arg3 != -1) {
			local11 = Static161.aClass291_1.method6675(arg3);
		}
		@Pc(22) int[] local22 = this.anIntArray577;
		if (local11 != null && local11.anIntArray224 != null) {
			local22 = new int[local11.anIntArray224.length];
			for (@Pc(34) int local34 = 0; local34 < local11.anIntArray224.length; local34++) {
				@Pc(41) int local41 = local11.anIntArray224[local34];
				if (local41 >= 0 && this.anIntArray577.length > local41) {
					local22[local34] = this.anIntArray577[local41];
				} else {
					local22[local34] = -1;
				}
			}
		}
		@Pc(73) boolean local73 = false;
		@Pc(75) boolean local75 = false;
		@Pc(77) boolean local77 = false;
		@Pc(79) boolean local79 = false;
		@Pc(81) int local81 = -1;
		@Pc(83) int local83 = -1;
		@Pc(85) int local85 = 0;
		@Pc(87) Class1_Sub3_Sub13 local87 = null;
		@Pc(89) Class1_Sub3_Sub13 local89 = null;
		if (arg0 != null) {
			local81 = arg0.anIntArray202[arg5];
			local9 = 2080;
			@Pc(104) int local104 = local81 >>> 16;
			local87 = Static594.aClass311_2.method7006(local104);
			local81 &= 0xFFFF;
			if (local87 != null) {
				local75 = local87.method5310(local81) | false;
				local73 = local87.method5313(local81) | false;
				local79 = local87.method5311(local81) | false;
				local77 = arg0.aBoolean307 | false;
			}
			if ((arg0.aBoolean306 || Static153.aBoolean202) && arg1 != -1 && arg0.anIntArray202.length > arg1) {
				local85 = arg0.anIntArray204[arg5];
				local83 = arg0.anIntArray202[arg1];
				@Pc(169) int local169 = local83 >>> 16;
				local83 &= 0xFFFF;
				if (local169 == local104) {
					local89 = local87;
				} else {
					local89 = Static594.aClass311_2.method7006(local83 >>> 16);
				}
				if (local89 != null) {
					local75 |= local89.method5310(local83);
					local73 |= local89.method5313(local83);
					local79 |= local89.method5311(local83);
				}
			}
			if (local75) {
				local9 = 2208;
			}
			if (local73) {
				local9 |= 0x100;
			}
			if (local77) {
				local9 |= 0x200;
			}
			if (local79) {
				local9 |= 0x400;
			}
		}
		@Pc(250) long local250 = this.method6998(arg7 == null ? null : arg7.anIntArray46, arg3, arg6, local22);
		if (Static468.aClass326_46 != null) {
			local7 = (Class61) Static468.aClass326_46.method7238(local250);
		}
		if (local7 == null || arg2.method6467(local7.PA(), local9) != 0) {
			if (local7 != null) {
				local9 = arg2.method6445(local9, local7.PA());
			}
			@Pc(281) int local281 = local9;
			@Pc(283) boolean local283 = false;
			for (@Pc(285) int local285 = 0; local285 < local22.length; local285++) {
				if (local22[local285] != -1 && !Static46.aClass234_1.method5390(local22[local285]).method7120(arg6)) {
					local283 = true;
				}
			}
			if (local283) {
				return null;
			}
			@Pc(321) Class43[] local321 = new Class43[local22.length];
			for (@Pc(323) int local323 = 0; local323 < local22.length; local323++) {
				if (local22[local323] != -1) {
					local321[local323] = Static46.aClass234_1.method5390(local22[local323]).method7116(arg6);
				}
			}
			@Pc(376) int local376;
			@Pc(383) int local383;
			if (local11 != null && local11.anIntArrayArray26 != null) {
				for (@Pc(356) int local356 = 0; local356 < local11.anIntArrayArray26.length; local356++) {
					if (local11.anIntArrayArray26[local356] != null && local321[local356] != null) {
						local376 = local11.anIntArrayArray26[local356][0];
						local383 = local11.anIntArrayArray26[local356][1];
						@Pc(390) int local390 = local11.anIntArrayArray26[local356][2];
						@Pc(397) int local397 = local11.anIntArrayArray26[local356][3];
						@Pc(404) int local404 = local11.anIntArrayArray26[local356][4];
						@Pc(411) int local411 = local11.anIntArrayArray26[local356][5];
						if (local397 != 0 || local404 != 0 || local411 != 0) {
							local321[local356].method1376(local404, local411, local397);
						}
						if (local376 != 0 || local383 != 0 || local390 != 0) {
							local321[local356].method1364(local383, local390, local376);
						}
					}
				}
			}
			@Pc(461) Class43 local461 = new Class43(local321, local321.length);
			if (arg7 != null) {
				local281 = local9 | 0x4000;
			}
			local7 = arg2.method6407(local461, local281, Static537.anInt9039, 64, 850);
			if (arg7 != null) {
				for (local376 = 0; local376 < 5; local376++) {
					for (local383 = 0; local383 < Static235.aShortArrayArrayArray1.length; local383++) {
						if (Static235.aShortArrayArrayArray1[local383][local376].length > arg7.anIntArray46[local376]) {
							local7.d(Static152.aShortArrayArray2[local383][local376], Static235.aShortArrayArrayArray1[local383][local376][arg7.anIntArray46[local376]]);
						}
					}
				}
			}
			if (Static468.aClass326_46 != null) {
				local7.SA(local9);
				Static468.aClass326_46.method7236(local7, local250);
			}
		}
		if (arg0 == null || local87 == null) {
			return local7;
		} else {
			@Pc(550) Class61 local550 = local7.method7591((byte) 1, local9, true);
			local550.method7611(arg0.aBoolean307, arg4 - 1, local81, 0, local89, local87, local83, local85);
			return local550;
		}
	}
}
