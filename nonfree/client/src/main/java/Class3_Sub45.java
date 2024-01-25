import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sm")
public final class Class3_Sub45 extends Class3 {

	@OriginalMember(owner = "client!sm", name = "k", descriptor = "[I")
	public int[] anIntArray510 = new int[1];

	@OriginalMember(owner = "client!sm", name = "s", descriptor = "[I")
	public int[] anIntArray511 = new int[] { -1 };

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lclient!lb;IIIIZLclient!ea;IILclient!r;)Lclient!da;")
	public Class60 method6643(@OriginalArg(0) Class185 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) Class78 arg5, @OriginalArg(7) int arg6, @OriginalArg(9) Class45 arg7) {
		@Pc(7) Class60 local7 = null;
		@Pc(9) int local9 = 2048;
		@Pc(11) Class365 local11 = null;
		if (arg3 != -1) {
			local11 = Static401.aClass33_1.method659(arg3);
		}
		@Pc(23) int[] local23 = this.anIntArray511;
		if (local11 != null && local11.anIntArray641 != null) {
			local23 = new int[local11.anIntArray641.length];
			for (@Pc(35) int local35 = 0; local35 < local11.anIntArray641.length; local35++) {
				@Pc(42) int local42 = local11.anIntArray641[local35];
				if (local42 >= 0 && this.anIntArray511.length > local42) {
					local23[local35] = this.anIntArray511[local42];
				} else {
					local23[local35] = -1;
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
		@Pc(87) Class3_Sub7_Sub6 local87 = null;
		@Pc(89) Class3_Sub7_Sub6 local89 = null;
		if (arg0 != null) {
			local9 = 2080;
			local81 = arg0.anIntArray280[arg2];
			@Pc(104) int local104 = local81 >>> 16;
			local87 = Static545.aClass240_2.method5679(local104);
			local81 &= 0xFFFF;
			if (local87 != null) {
				local75 = local87.method2517(local81) | false;
				local73 = local87.method2519(local81) | false;
				local79 = local87.method2516(local81) | false;
				local77 = arg0.aBoolean361 | false;
			}
			if ((arg0.aBoolean362 || Static391.aBoolean508) && arg1 != -1 && arg0.anIntArray280.length > arg1) {
				local85 = arg0.anIntArray282[arg2];
				local83 = arg0.anIntArray280[arg1];
				@Pc(173) int local173 = local83 >>> 16;
				local83 &= 0xFFFF;
				if (local104 == local173) {
					local89 = local87;
				} else {
					local89 = Static545.aClass240_2.method5679(local83 >>> 16);
				}
				if (local89 != null) {
					local75 |= local89.method2517(local83);
					local73 |= local89.method2519(local83);
					local79 |= local89.method2516(local83);
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
		@Pc(254) long local254 = this.method6645(local23, arg4, arg3, arg5 == null ? null : arg5.anIntArray97);
		if (Static357.aClass6_44 != null) {
			local7 = (Class60) Static357.aClass6_44.method92(local254);
		}
		if (local7 == null || arg7.method7393(local7.PA(), local9) != 0) {
			if (local7 != null) {
				local9 = arg7.method7392(local9, local7.PA());
			}
			@Pc(285) int local285 = local9;
			@Pc(287) boolean local287 = false;
			for (@Pc(289) int local289 = 0; local289 < local23.length; local289++) {
				if (local23[local289] != -1 && !Static6.aClass92_1.method2673(local23[local289]).method4525(arg4)) {
					local287 = true;
				}
			}
			if (local287) {
				return null;
			}
			@Pc(321) Class84[] local321 = new Class84[local23.length];
			for (@Pc(323) int local323 = 0; local323 < local23.length; local323++) {
				if (local23[local323] != -1) {
					local321[local323] = Static6.aClass92_1.method2673(local23[local323]).method4514(arg4);
				}
			}
			@Pc(374) int local374;
			@Pc(381) int local381;
			if (local11 != null && local11.anIntArrayArray203 != null) {
				for (@Pc(354) int local354 = 0; local354 < local11.anIntArrayArray203.length; local354++) {
					if (local11.anIntArrayArray203[local354] != null && local321[local354] != null) {
						local374 = local11.anIntArrayArray203[local354][0];
						local381 = local11.anIntArrayArray203[local354][1];
						@Pc(388) int local388 = local11.anIntArrayArray203[local354][2];
						@Pc(395) int local395 = local11.anIntArrayArray203[local354][3];
						@Pc(402) int local402 = local11.anIntArrayArray203[local354][4];
						@Pc(409) int local409 = local11.anIntArrayArray203[local354][5];
						if (local395 != 0 || local402 != 0 || local409 != 0) {
							local321[local354].method2434(local409, local395, local402);
						}
						if (local374 != 0 || local381 != 0 || local388 != 0) {
							local321[local354].method2431(local381, local374, local388);
						}
					}
				}
			}
			@Pc(463) Class84 local463 = new Class84(local321, local321.length);
			if (arg5 != null) {
				local285 = local9 | 0x4000;
			}
			local7 = arg7.method7419(local463, local285, Static493.anInt9521, 64, 850);
			if (arg5 != null) {
				for (local374 = 0; local374 < 5; local374++) {
					for (local381 = 0; local381 < Static158.aShortArrayArrayArray1.length; local381++) {
						if (Static158.aShortArrayArrayArray1[local381][local374].length > arg5.anIntArray97[local374]) {
							local7.d(Static59.aShortArrayArray5[local381][local374], Static158.aShortArrayArrayArray1[local381][local374][arg5.anIntArray97[local374]]);
						}
					}
				}
			}
			if (Static357.aClass6_44 != null) {
				local7.SA(local9);
				Static357.aClass6_44.method106(local254, local7);
			}
		}
		if (arg0 == null || local87 == null) {
			return local7;
		} else {
			@Pc(548) Class60 local548 = local7.method7229((byte) 1, local9, true);
			local548.method7226(local81, arg0.aBoolean361, local89, local87, 0, local83, arg6 - 1, local85);
			return local548;
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "([IZII[I)J")
	private long method6645(@OriginalArg(0) int[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		@Pc(7) long[] local7 = Class109.aLongArray6;
		@Pc(9) long local9 = -1L;
		@Pc(25) long local25 = local7[(int) (((long) (arg2 >> 8) ^ local9) & 0xFFL)] ^ local9 >>> 8;
		local9 = local25 >>> 8 ^ local7[(int) (((long) arg2 ^ local25) & 0xFFL)];
		for (@Pc(41) int local41 = 0; local41 < arg0.length; local41++) {
			local9 = local7[(int) (((long) (arg0[local41] >> 24) ^ local9) & 0xFFL)] ^ local9 >>> 8;
			local9 = local7[(int) (((long) (arg0[local41] >> 16) ^ local9) & 0xFFL)] ^ local9 >>> 8;
			local9 = local7[(int) ((local9 ^ (long) (arg0[local41] >> 8)) & 0xFFL)] ^ local9 >>> 8;
			local9 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) arg0[local41]) & 0xFFL)];
		}
		if (arg3 != null) {
			for (@Pc(122) int local122 = 0; local122 < 5; local122++) {
				local9 = local7[(int) (((long) arg3[local122] ^ local9) & 0xFFL)] ^ local9 >>> 8;
			}
		}
		return local7[(int) ((long) 255 & (local9 ^ (long) (arg1 ? 1 : 0)))] ^ local9 >>> 8;
	}
}
