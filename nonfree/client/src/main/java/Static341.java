import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static341 {

	@OriginalMember(owner = "client!wa", name = "M", descriptor = "I")
	public static int anInt6648;

	@OriginalMember(owner = "client!wa", name = "Q", descriptor = "I")
	public static int anInt6652;

	@OriginalMember(owner = "client!wa", name = "J", descriptor = "Z")
	public static boolean aBoolean445 = false;

	@OriginalMember(owner = "client!wa", name = "O", descriptor = "I")
	public static int anInt6650 = 0;

	@OriginalMember(owner = "client!wa", name = "d", descriptor = "(I)I")
	public static int method5588() {
		return 15;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IZLclient!tj;)V")
	public static void method5589(@OriginalArg(0) int arg0, @OriginalArg(2) Class122 arg1) {
		Static34.method638(arg1);
		@Pc(17) int local17;
		@Pc(21) int local21;
		if (arg0 > 1) {
			for (local17 = 0; local17 < Static162.anInt2152; local17++) {
				for (local21 = 0; local21 < Static122.anInt2632; local21++) {
					if ((Static160.aByteArrayArrayArray9[1][local17][local21] & 0x2) == 2) {
						Static354.method5739(local17, local21);
					}
				}
			}
		}
		for (local17 = 0; local17 < arg0; local17++) {
			for (local21 = 0; local21 <= Static122.anInt2632; local21++) {
				for (@Pc(59) int local59 = 0; local59 <= Static162.anInt2152; local59++) {
					@Pc(73) int local73;
					@Pc(75) int local75;
					@Pc(77) int local77;
					@Pc(127) int local127;
					@Pc(131) int local131;
					@Pc(215) int local215;
					@Pc(223) int local223;
					@Pc(243) int local243;
					@Pc(247) int local247;
					if ((Static310.aByteArrayArrayArray14[local17][local59][local21] & 0x1) != 0) {
						local73 = local21;
						local75 = local21;
						local77 = local17;
						while (local73 > 0 && (Static310.aByteArrayArrayArray14[local17][local59][local73 - 1] & 0x1) != 0) {
							local73--;
						}
						while (local75 < Static122.anInt2632 && (Static310.aByteArrayArrayArray14[local17][local59][local75 + 1] & 0x1) != 0) {
							local75++;
						}
						local127 = local17;
						label164: while (local77 > 0) {
							for (local131 = local73; local131 <= local75; local131++) {
								if ((Static310.aByteArrayArrayArray14[local77 - 1][local59][local131] & 0x1) == 0) {
									break label164;
								}
							}
							local77--;
						}
						label153: while (local127 < 3) {
							for (local131 = local73; local131 <= local75; local131++) {
								if ((Static310.aByteArrayArrayArray14[local127 + 1][local59][local131] & 0x1) == 0) {
									break label153;
								}
							}
							local127++;
						}
						local131 = (local127 + 1 - local77) * (local75 + 1 - local73);
						if (local131 >= 2) {
							local215 = Static105.anIntArrayArrayArray2[local127][local59][local73] - 240;
							local223 = Static105.anIntArrayArrayArray2[local77][local59][local73];
							Static230.method5526(1, local59 * 128, local59 * 128, local73 * 128, local75 * 128 + 128, local215, local223);
							for (local243 = local77; local243 <= local127; local243++) {
								for (local247 = local73; local247 <= local75; local247++) {
									Static310.aByteArrayArrayArray14[local243][local59][local247] &= 0xFFFFFFFE;
								}
							}
						}
					}
					if ((Static310.aByteArrayArrayArray14[local17][local59][local21] & 0x2) != 0) {
						local73 = local59;
						local75 = local59;
						local77 = local17;
						local127 = local17;
						while (Static162.anInt2152 > local75 && (Static310.aByteArrayArrayArray14[local17][local75 + 1][local21] & 0x2) != 0) {
							local75++;
						}
						while (local73 > 0 && (Static310.aByteArrayArrayArray14[local17][local73 - 1][local21] & 0x2) != 0) {
							local73--;
						}
						label218: while (local77 > 0) {
							for (local131 = local73; local131 <= local75; local131++) {
								if ((Static310.aByteArrayArrayArray14[local77 - 1][local131][local21] & 0x2) == 0) {
									break label218;
								}
							}
							local77--;
						}
						label207: while (local127 < 3) {
							for (local131 = local73; local131 <= local75; local131++) {
								if ((Static310.aByteArrayArrayArray14[local127 + 1][local131][local21] & 0x2) == 0) {
									break label207;
								}
							}
							local127++;
						}
						local131 = (local75 + 1 - local73) * (local127 - (local77 - 1));
						if (local131 >= 2) {
							local215 = Static105.anIntArrayArrayArray2[local127][local73][local21] - 240;
							local223 = Static105.anIntArrayArrayArray2[local77][local73][local21];
							Static230.method5526(2, local73 * 128, local75 * 128 + 128, local21 * 128, local21 * 128, local215, local223);
							for (local243 = local77; local243 <= local127; local243++) {
								for (local247 = local73; local247 <= local75; local247++) {
									Static310.aByteArrayArrayArray14[local243][local247][local21] &= 0xFFFFFFFD;
								}
							}
						}
					}
					if ((Static310.aByteArrayArrayArray14[local17][local59][local21] & 0x4) != 0) {
						local73 = local59;
						local75 = local59;
						local77 = local21;
						local127 = local21;
						while (local77 > 0 && (Static310.aByteArrayArrayArray14[local17][local59][local77 - 1] & 0x4) != 0) {
							local77--;
						}
						while (local127 < Static122.anInt2632 && (Static310.aByteArrayArrayArray14[local17][local59][local127 + 1] & 0x4) != 0) {
							local127++;
						}
						label271: while (local73 > 0) {
							for (local131 = local77; local131 <= local127; local131++) {
								if ((Static310.aByteArrayArrayArray14[local17][local73 - 1][local131] & 0x4) == 0) {
									break label271;
								}
							}
							local73--;
						}
						label260: while (Static162.anInt2152 > local75) {
							for (local131 = local77; local131 <= local127; local131++) {
								if ((Static310.aByteArrayArrayArray14[local17][local75 + 1][local131] & 0x4) == 0) {
									break label260;
								}
							}
							local75++;
						}
						if ((local127 + 1 - local77) * (local75 - local73 - -1) >= 4) {
							local131 = Static105.anIntArrayArrayArray2[local17][local73][local77];
							Static230.method5526(4, local73 * 128, local75 * 128 + 128, local77 * 128, local127 * 128 + 128, local131, local131);
							for (@Pc(670) int local670 = local73; local670 <= local75; local670++) {
								for (local215 = local77; local215 <= local127; local215++) {
									Static310.aByteArrayArrayArray14[local17][local670][local215] &= 0xFFFFFFFB;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(BI)V")
	public static void method5590(@OriginalArg(1) int arg0) {
		if (!Static260.aBoolean302) {
			arg0 = -1;
		}
		if (Static123.anInt2650 == arg0) {
			return;
		}
		if (arg0 != -1) {
			@Pc(23) Class118 local23 = Static354.method5735(arg0);
			@Pc(27) Class149 local27 = local23.method2869();
			if (local27 == null) {
				arg0 = -1;
			} else {
				Static353.aClass42_5.method969(local27.method3888(), Static295.aCanvas4, new Point(local23.anInt3632, local23.anInt3630), local27.method3883(), local27.method3891());
				Static123.anInt2650 = arg0;
			}
		}
		if (arg0 == -1 && Static123.anInt2650 != -1) {
			Static353.aClass42_5.method969(-1, Static295.aCanvas4, new Point(), -1, null);
			Static123.anInt2650 = -1;
		}
	}

	@OriginalMember(owner = "client!wa", name = "e", descriptor = "(I)V")
	public static void method5591() {
		@Pc(1) Class15 local1 = Static11.aClass15_1;
		synchronized (Static11.aClass15_1) {
			Static303.anInt5602++;
			Static1.anInt12 = Static317.anInt5588;
			Static192.anInt4000 = Static313.anInt6173;
			Static221.anInt4562 = Static8.anInt213;
			Static249.anInt4645 = Static67.anInt1375;
			Static99.anInt2129 = Static140.anInt2850;
			Static170.anInt6277 = Static104.anInt2184;
			Static28.aLong23 = Static123.aLong97;
			Static67.anInt1375 = 0;
		}
	}
}
