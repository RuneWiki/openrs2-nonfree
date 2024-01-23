import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!og", name = "L", descriptor = "I")
	public static int anInt3909;

	@OriginalMember(owner = "client!og", name = "Q", descriptor = "Lclient!sf;")
	public static Class159 aClass159_4;

	@OriginalMember(owner = "client!og", name = "eb", descriptor = "[Lclient!ho;")
	public static Class3_Sub4_Sub12[] aClass3_Sub4_Sub12Array6;

	@OriginalMember(owner = "client!og", name = "M", descriptor = "[[S")
	public static short[][] aShortArrayArray7 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!og", name = "g", descriptor = "(I)V")
	public static void method3309() {
		if (Static36.anInt639 != Static99.anInt1826 && Static227.method2502(Static99.anInt1826)) {
			Static36.anInt639 = Static99.anInt1826;
		}
	}

	@OriginalMember(owner = "client!og", name = "h", descriptor = "(I)V")
	public static void method3310() {
		Static190.aClass151Array1 = null;
		Static285.method4732(0, 0, 0, 0, Static66.anInt1232, -1, Static123.anInt2333, Static253.anInt5224);
		if (Static190.aClass151Array1 != null) {
			Static243.method4112(Static168.aClass151_6.anInt4716, Static123.anInt2333, -1412584499, Static109.anInt2943, Static146.anInt5854, 0, 0, Static253.anInt5224, Static190.aClass151Array1);
			Static190.aClass151Array1 = null;
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(BI[Lclient!rg;)V")
	public static void method3313(@OriginalArg(1) int arg0, @OriginalArg(2) Class151[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			@Pc(19) Class151 local19 = arg1[local7];
			if (local19 != null && local19.anInt4727 == arg0 && (!local19.aBoolean328 || !Static42.method629(local19))) {
				if (local19.anInt4721 == 0) {
					if (!local19.aBoolean328 && Static42.method629(local19) && local19 != Static166.aClass151_5) {
						continue;
					}
					method3313(local19.anInt4800, arg1);
					if (local19.aClass151Array2 != null) {
						method3313(local19.anInt4800, local19.aClass151Array2);
					}
					@Pc(77) Class3_Sub3 local77 = (Class3_Sub3) Static205.aClass30_23.method663((long) local19.anInt4800);
					if (local77 != null) {
						Static267.method4421(local77.anInt183);
					}
				}
				if (local19.anInt4721 == 6) {
					@Pc(107) int local107;
					if (local19.anInt4805 != -1 || local19.anInt4718 != -1) {
						@Pc(102) boolean local102 = Static146.method4806(local19);
						if (local102) {
							local107 = local19.anInt4718;
						} else {
							local107 = local19.anInt4805;
						}
						if (local107 != -1) {
							@Pc(121) Class15 local121 = Static253.method4288(local107);
							if (local121 != null) {
								local19.anInt4736 += Static140.anInt2709;
								while (local19.anInt4736 > local121.anIntArray36[local19.anInt4765]) {
									local19.anInt4736 -= local121.anIntArray36[local19.anInt4765];
									local19.anInt4765++;
									if (local121.anIntArray35.length <= local19.anInt4765) {
										local19.anInt4765 -= local121.anInt424;
										if (local19.anInt4765 < 0 || local19.anInt4765 >= local121.anIntArray35.length) {
											local19.anInt4765 = 0;
										}
									}
									local19.anInt4768 = local19.anInt4765 + 1;
									if (local121.anIntArray35.length <= local19.anInt4768) {
										local19.anInt4768 -= local121.anInt424;
										if (local19.anInt4768 < 0 || local19.anInt4768 >= local121.anIntArray35.length) {
											local19.anInt4768 = -1;
										}
									}
									Static134.method3639(local19);
								}
							}
						}
					}
					if (local19.anInt4770 != 0 && !local19.aBoolean328) {
						@Pc(250) int local250 = local19.anInt4770 >> 16;
						@Pc(254) int local254 = local250 * Static140.anInt2709;
						local19.anInt4729 = local19.anInt4729 + local254 & 0x7FF;
						local107 = local19.anInt4770 << 16 >> 16;
						local107 *= Static140.anInt2709;
						local19.anInt4801 = local19.anInt4801 + local107 & 0x7FF;
						Static134.method3639(local19);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method3314(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		Static215.aClass3_Sub26_Sub1_2.method3958(119);
		Static215.aClass3_Sub26_Sub1_2.method3907(Static147.method2494(arg0) + 1);
		Static215.aClass3_Sub26_Sub1_2.method3919(arg1);
		Static215.aClass3_Sub26_Sub1_2.method3914(arg0);
	}
}
