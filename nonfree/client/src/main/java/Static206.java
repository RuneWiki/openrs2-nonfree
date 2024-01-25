import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!nj", name = "yd", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray28;

	@OriginalMember(owner = "client!nj", name = "hd", descriptor = "Lclient!jf;")
	public static Class96 aClass96_11 = null;

	@OriginalMember(owner = "client!nj", name = "qd", descriptor = "[I")
	public static final int[] anIntArray293 = new int[3];

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(ILclient!en;I)V")
	public static void method3680(@OriginalArg(0) int arg0, @OriginalArg(1) Class59 arg1) {
		Static17.method5327(arg1);
		@Pc(10) int local10;
		@Pc(13) int local13;
		if (arg0 > 1) {
			for (local10 = 0; local10 < Static266.anInt5101; local10++) {
				for (local13 = 0; local13 < Static339.anInt6352; local13++) {
					if ((Static32.aByteArrayArrayArray4[1][local10][local13] & 0x2) == 2) {
						Static169.method3210(local10, local13);
					}
				}
			}
		}
		for (local10 = 0; local10 < arg0; local10++) {
			for (local13 = 0; local13 <= Static339.anInt6352; local13++) {
				for (@Pc(53) int local53 = 0; local53 <= Static266.anInt5101; local53++) {
					@Pc(66) int local66;
					@Pc(68) int local68;
					@Pc(70) int local70;
					@Pc(115) int local115;
					@Pc(118) int local118;
					@Pc(205) int local205;
					@Pc(213) int local213;
					@Pc(233) int local233;
					@Pc(236) int local236;
					if ((Static296.aByteArrayArrayArray26[local10][local53][local13] & 0x1) != 0) {
						local66 = local13;
						local68 = local13;
						local70 = local10;
						while (local66 > 0 && (Static296.aByteArrayArrayArray26[local10][local53][local66 - 1] & 0x1) != 0) {
							local66--;
						}
						while (Static339.anInt6352 > local68 && (Static296.aByteArrayArrayArray26[local10][local53][local68 + 1] & 0x1) != 0) {
							local68++;
						}
						local115 = local10;
						label164: while (local70 > 0) {
							for (local118 = local66; local118 <= local68; local118++) {
								if ((Static296.aByteArrayArrayArray26[local70 - 1][local53][local118] & 0x1) == 0) {
									break label164;
								}
							}
							local70--;
						}
						label153: while (local115 < 3) {
							for (local118 = local66; local118 <= local68; local118++) {
								if ((Static296.aByteArrayArrayArray26[local115 + 1][local53][local118] & 0x1) == 0) {
									break label153;
								}
							}
							local115++;
						}
						local118 = (local68 + 1 - local66) * (local115 + 1 - local70);
						if (local118 >= 2) {
							local205 = Static200.anIntArrayArrayArray17[local115][local53][local66] - 240;
							local213 = Static200.anIntArrayArrayArray17[local70][local53][local66];
							Static82.method1814(1, local53 * 128, local53 * 128, local66 * 128, local68 * 128 + 128, local205, local213);
							for (local233 = local70; local233 <= local115; local233++) {
								for (local236 = local66; local236 <= local68; local236++) {
									Static296.aByteArrayArrayArray26[local233][local53][local236] &= 0xFFFFFFFE;
								}
							}
						}
					}
					if ((Static296.aByteArrayArrayArray26[local10][local53][local13] & 0x2) != 0) {
						local66 = local53;
						local68 = local53;
						local70 = local10;
						local115 = local10;
						while (local66 > 0 && (Static296.aByteArrayArrayArray26[local10][local66 - 1][local13] & 0x2) != 0) {
							local66--;
						}
						while (local68 < Static266.anInt5101 && (Static296.aByteArrayArrayArray26[local10][local68 + 1][local13] & 0x2) != 0) {
							local68++;
						}
						label218: while (local70 > 0) {
							for (local118 = local66; local118 <= local68; local118++) {
								if ((Static296.aByteArrayArrayArray26[local70 - 1][local118][local13] & 0x2) == 0) {
									break label218;
								}
							}
							local70--;
						}
						label207: while (local115 < 3) {
							for (local118 = local66; local118 <= local68; local118++) {
								if ((Static296.aByteArrayArrayArray26[local115 + 1][local118][local13] & 0x2) == 0) {
									break label207;
								}
							}
							local115++;
						}
						local118 = (local115 + 1 - local70) * (local68 + 1 - local66);
						if (local118 >= 2) {
							local205 = Static200.anIntArrayArrayArray17[local115][local66][local13] - 240;
							local213 = Static200.anIntArrayArrayArray17[local70][local66][local13];
							Static82.method1814(2, local66 * 128, local68 * 128 + 128, local13 * 128, local13 * 128, local205, local213);
							for (local233 = local70; local233 <= local115; local233++) {
								for (local236 = local66; local236 <= local68; local236++) {
									Static296.aByteArrayArrayArray26[local233][local236][local13] &= 0xFFFFFFFD;
								}
							}
						}
					}
					if ((Static296.aByteArrayArrayArray26[local10][local53][local13] & 0x4) != 0) {
						local66 = local53;
						local68 = local53;
						local70 = local13;
						local115 = local13;
						while (local70 > 0 && (Static296.aByteArrayArrayArray26[local10][local53][local70 - 1] & 0x4) != 0) {
							local70--;
						}
						while (Static339.anInt6352 > local115 && (Static296.aByteArrayArrayArray26[local10][local53][local115 + 1] & 0x4) != 0) {
							local115++;
						}
						label271: while (local66 > 0) {
							for (local118 = local70; local118 <= local115; local118++) {
								if ((Static296.aByteArrayArrayArray26[local10][local66 - 1][local118] & 0x4) == 0) {
									break label271;
								}
							}
							local66--;
						}
						label260: while (Static266.anInt5101 > local68) {
							for (local118 = local70; local118 <= local115; local118++) {
								if ((Static296.aByteArrayArrayArray26[local10][local68 + 1][local118] & 0x4) == 0) {
									break label260;
								}
							}
							local68++;
						}
						if ((local68 + 1 - local66) * (-local70 + local115 + 1) >= 4) {
							local118 = Static200.anIntArrayArrayArray17[local10][local66][local70];
							Static82.method1814(4, local66 * 128, local68 * 128 + 128, local70 * 128, local115 * 128 + 128, local118, local118);
							for (@Pc(652) int local652 = local66; local652 <= local68; local652++) {
								for (local205 = local70; local205 <= local115; local205++) {
									Static296.aByteArrayArrayArray26[local10][local652][local205] &= 0xFFFFFFFB;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nj", name = "j", descriptor = "(I)V")
	public static void method3682() {
		Static238.anInt4612 = -1;
		Static115.anInt2459 = 0;
		Static79.anInt1909 = -1;
	}

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "(IB)V")
	public static void method3685(@OriginalArg(0) int arg0) {
		Static289.aClass66_97 = new Class66(arg0);
	}
}
