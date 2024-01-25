import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static289 {

	@OriginalMember(owner = "client!se", name = "d", descriptor = "Z")
	public static boolean aBoolean368 = false;

	@OriginalMember(owner = "client!se", name = "e", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray67 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!se", name = "k", descriptor = "I")
	public static int anInt5590 = 0;

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(ILclient!e;I)V")
	public static void method4962(@OriginalArg(0) int arg0, @OriginalArg(1) Class46 arg1) {
		Static78.method1947(arg1);
		@Pc(12) int local12;
		@Pc(16) int local16;
		if (arg0 > 1) {
			for (local12 = 0; local12 < Static195.anInt3965; local12++) {
				for (local16 = 0; local16 < Static298.anInt5716; local16++) {
					if ((Static108.aByteArrayArrayArray5[1][local12][local16] & 0x2) == 2) {
						Static318.method5479(local12, local16);
					}
				}
			}
		}
		for (local12 = 0; local12 < arg0; local12++) {
			for (local16 = 0; local16 <= Static298.anInt5716; local16++) {
				for (@Pc(58) int local58 = 0; local58 <= Static195.anInt3965; local58++) {
					@Pc(75) int local75;
					@Pc(77) int local77;
					@Pc(79) int local79;
					@Pc(81) int local81;
					@Pc(126) int local126;
					@Pc(212) int local212;
					@Pc(220) int local220;
					@Pc(240) int local240;
					@Pc(244) int local244;
					if ((Static294.aByteArrayArrayArray12[local12][local58][local16] & 0x1) != 0) {
						local75 = local16;
						local77 = local16;
						local79 = local12;
						local81 = local12;
						while (Static298.anInt5716 > local77 && (Static294.aByteArrayArrayArray12[local12][local58][local77 + 1] & 0x1) != 0) {
							local77++;
						}
						while (local75 > 0 && (Static294.aByteArrayArrayArray12[local12][local58][local75 - 1] & 0x1) != 0) {
							local75--;
						}
						label164: while (local79 > 0) {
							for (local126 = local75; local126 <= local77; local126++) {
								if ((Static294.aByteArrayArrayArray12[local79 - 1][local58][local126] & 0x1) == 0) {
									break label164;
								}
							}
							local79--;
						}
						label153: while (local81 < 3) {
							for (local126 = local75; local126 <= local77; local126++) {
								if ((Static294.aByteArrayArrayArray12[local81 + 1][local58][local126] & 0x1) == 0) {
									break label153;
								}
							}
							local81++;
						}
						local126 = (local77 + 1 - local75) * ((local81 - local79) + 1);
						if (local126 >= 2) {
							local212 = Static1.anIntArrayArrayArray12[local81][local58][local75] - 240;
							local220 = Static1.anIntArrayArrayArray12[local79][local58][local75];
							Static313.method5401(1, local58 * 128, local58 * 128, local75 * 128, local77 * 128 + 128, local212, local220);
							for (local240 = local79; local240 <= local81; local240++) {
								for (local244 = local75; local244 <= local77; local244++) {
									Static294.aByteArrayArrayArray12[local240][local58][local244] &= 0xFFFFFFFE;
								}
							}
						}
					}
					if ((Static294.aByteArrayArrayArray12[local12][local58][local16] & 0x2) != 0) {
						local75 = local58;
						local77 = local58;
						local79 = local12;
						local81 = local12;
						while (local75 > 0 && (Static294.aByteArrayArrayArray12[local12][local75 - 1][local16] & 0x2) != 0) {
							local75--;
						}
						while (Static195.anInt3965 > local77 && (Static294.aByteArrayArrayArray12[local12][local77 + 1][local16] & 0x2) != 0) {
							local77++;
						}
						label217: while (local79 > 0) {
							for (local126 = local75; local126 <= local77; local126++) {
								if ((Static294.aByteArrayArrayArray12[local79 - 1][local126][local16] & 0x2) == 0) {
									break label217;
								}
							}
							local79--;
						}
						label206: while (local81 < 3) {
							for (local126 = local75; local126 <= local77; local126++) {
								if ((Static294.aByteArrayArrayArray12[local81 + 1][local126][local16] & 0x2) == 0) {
									break label206;
								}
							}
							local81++;
						}
						local126 = (local81 + 1 - local79) * (local77 + (1 - local75));
						if (local126 >= 2) {
							local212 = Static1.anIntArrayArrayArray12[local81][local75][local16] - 240;
							local220 = Static1.anIntArrayArrayArray12[local79][local75][local16];
							Static313.method5401(2, local75 * 128, local77 * 128 + 128, local16 * 128, local16 * 128, local212, local220);
							for (local240 = local79; local240 <= local81; local240++) {
								for (local244 = local75; local244 <= local77; local244++) {
									Static294.aByteArrayArrayArray12[local240][local244][local16] &= 0xFFFFFFFD;
								}
							}
						}
					}
					if ((Static294.aByteArrayArrayArray12[local12][local58][local16] & 0x4) != 0) {
						local75 = local58;
						local77 = local58;
						for (local79 = local16; local79 > 0 && (Static294.aByteArrayArrayArray12[local12][local58][local79 - 1] & 0x4) != 0; local79--) {
						}
						for (local81 = local16; Static298.anInt5716 > local81 && (Static294.aByteArrayArrayArray12[local12][local58][local81 + 1] & 0x4) != 0; local81++) {
						}
						label270: while (local75 > 0) {
							for (local126 = local79; local126 <= local81; local126++) {
								if ((Static294.aByteArrayArrayArray12[local12][local75 - 1][local126] & 0x4) == 0) {
									break label270;
								}
							}
							local75--;
						}
						label259: while (Static195.anInt3965 > local77) {
							for (local126 = local79; local126 <= local81; local126++) {
								if ((Static294.aByteArrayArrayArray12[local12][local77 + 1][local126] & 0x4) == 0) {
									break label259;
								}
							}
							local77++;
						}
						if ((local77 + 1 - local75) * (local81 - local79 + 1) >= 4) {
							local126 = Static1.anIntArrayArrayArray12[local12][local75][local79];
							Static313.method5401(4, local75 * 128, local77 * 128 + 128, local79 * 128, local81 * 128 + 128, local126, local126);
							for (@Pc(662) int local662 = local75; local662 <= local77; local662++) {
								for (local212 = local79; local212 <= local81; local212++) {
									Static294.aByteArrayArrayArray12[local12][local662][local212] &= 0xFFFFFFFB;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!kk;IIIII)V")
	public static void method4965(@OriginalArg(0) Class117 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt5367 = 0;
		for (@Pc(4) int local4 = 0; local4 < 4; local4++) {
			if (arg0.aClass14_Sub13_Sub1Array3[local4] != null) {
				arg0.anInt5367++;
			}
		}
		label51: for (@Pc(22) int local22 = 0; local22 < arg0.anInt5367; local22++) {
			@Pc(31) int local31 = Static118.anIntArrayArrayArray3[arg1][arg2][arg3];
			@Pc(40) Class14_Sub13_Sub1 local40;
			while (local31 != 0) {
				local40 = Static127.aClass14_Sub13_Sub1Array1[(local31 & 0xFF) - 1];
				local31 >>>= 0x8;
				if (local40 == arg0.aClass14_Sub13_Sub1Array3[local22]) {
					continue label51;
				}
			}
			local31 = Static118.anIntArrayArrayArray3[arg1][arg4][arg5];
			while (local31 != 0) {
				local40 = Static127.aClass14_Sub13_Sub1Array1[(local31 & 0xFF) - 1];
				local31 >>>= 0x8;
				if (local40 == arg0.aClass14_Sub13_Sub1Array3[local22]) {
					continue label51;
				}
			}
			for (@Pc(85) int local85 = local22; local85 < arg0.anInt5367 - 1; local85++) {
				arg0.aClass14_Sub13_Sub1Array3[local85] = arg0.aClass14_Sub13_Sub1Array3[local85 + 1];
			}
			arg0.anInt5367--;
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIIII)V")
	public static void method4969(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg4;
		@Pc(13) int local13 = arg3 * arg3;
		@Pc(17) int local17 = arg4 * arg4;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg4 << 1;
		@Pc(38) int local38 = local13 * (1 - local29) + local21;
		@Pc(47) int local47 = local17 - (local29 - 1) * local25;
		@Pc(51) int local51 = local13 << 2;
		@Pc(55) int local55 = local17 << 2;
		@Pc(63) int local63 = local21 * 3;
		@Pc(71) int local71 = local25 * ((arg4 << 1) - 3);
		@Pc(77) int local77 = local55;
		Static27.method690(arg1 + arg3, Static104.anIntArrayArray31[arg2], arg0, arg1 - arg3);
		@Pc(96) int local96 = local51 * (arg4 - 1);
		while (local9 > 0) {
			if (local38 < 0) {
				while (local38 < 0) {
					local38 += local63;
					local47 += local77;
					local7++;
					local63 += local55;
					local77 += local55;
				}
			}
			if (local47 < 0) {
				local38 += local63;
				local47 += local77;
				local7++;
				local77 += local55;
				local63 += local55;
			}
			local38 += -local96;
			local47 += -local71;
			local9--;
			local96 -= local51;
			local71 -= local51;
			@Pc(169) int local169 = arg2 - local9;
			@Pc(173) int local173 = local9 + arg2;
			@Pc(177) int local177 = local7 + arg1;
			@Pc(181) int local181 = arg1 - local7;
			Static27.method690(local177, Static104.anIntArrayArray31[local169], arg0, local181);
			Static27.method690(local177, Static104.anIntArrayArray31[local173], arg0, local181);
		}
	}
}
