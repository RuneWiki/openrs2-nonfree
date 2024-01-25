import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static203 {

	@OriginalMember(owner = "client!mp", name = "q", descriptor = "[Lclient!wn;")
	public static Class95[] aClass95Array12;

	@OriginalMember(owner = "client!mp", name = "u", descriptor = "[I")
	public static int[] anIntArray488;

	@OriginalMember(owner = "client!mp", name = "s", descriptor = "I")
	public static int anInt5015 = 0;

	@OriginalMember(owner = "client!mp", name = "t", descriptor = "I")
	public static int anInt5016 = 0;

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(BII)Z")
	public static boolean method4477(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (Static255.aByteArrayArrayArray13[1][arg0][arg1] & 0x2) != 0;
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(I[Lclient!bm;Lclient!ea;BLclient!dn;Z)V")
	public static void method4479(@OriginalArg(0) int arg0, @OriginalArg(1) Class24[] arg1, @OriginalArg(2) Class55 arg2, @OriginalArg(4) Class51 arg3, @OriginalArg(5) boolean arg4) {
		@Pc(13) int local13;
		@Pc(17) int local17;
		@Pc(31) int local31;
		if (!arg4) {
			for (@Pc(9) int local9 = 0; local9 < 4; local9++) {
				for (local13 = 0; local13 < Static22.anInt481; local13++) {
					for (local17 = 0; local17 < Static269.anInt5281; local17++) {
						if ((Static255.aByteArrayArrayArray13[local9][local13][local17] & 0x1) != 0) {
							local31 = local9;
							if ((Static255.aByteArrayArrayArray13[1][local13][local17] & 0x2) != 0) {
								local31 = local9 - 1;
							}
							if (local31 >= 0) {
								arg1[local31].method485(local17, local13);
							}
						}
					}
				}
			}
		}
		@Pc(70) int[][] local70 = new int[Static22.anInt481][Static269.anInt5281];
		for (local13 = 0; local13 < arg0; local13++) {
			for (local17 = 0; local17 < Static269.anInt5281; local17++) {
				Static307.anIntArray587[local17] = 0;
				Static183.anIntArray364[local17] = 0;
				Static162.anIntArray333[local17] = 0;
				Static255.anIntArray491[local17] = 0;
				Static213.anIntArray394[local17] = 0;
			}
			for (local31 = -5; local31 < Static22.anInt481; local31++) {
				@Pc(118) int local118;
				@Pc(131) int local131;
				@Pc(200) int local200;
				for (@Pc(112) int local112 = 0; local112 < Static269.anInt5281; local112++) {
					local118 = local31 + 5;
					@Pc(178) int local178;
					if (local118 < Static22.anInt481) {
						local131 = Static207.aByteArrayArrayArray11[local13][local118][local112] & 0xFF;
						if (local131 > 0) {
							@Pc(142) Class11 local142 = Static209.method3853(local131 - 1);
							Static307.anIntArray587[local112] += local142.anInt312;
							Static183.anIntArray364[local112] += local142.anInt316;
							Static162.anIntArray333[local112] += local142.anInt307;
							Static255.anIntArray491[local112] += local142.anInt310;
							local178 = Static213.anIntArray394[local112]++;
						}
					}
					local131 = local31 - 5;
					if (local131 >= 0) {
						local200 = Static207.aByteArrayArrayArray11[local13][local131][local112] & 0xFF;
						if (local200 > 0) {
							@Pc(211) Class11 local211 = Static209.method3853(local200 - 1);
							Static307.anIntArray587[local112] -= local211.anInt312;
							Static183.anIntArray364[local112] -= local211.anInt316;
							Static162.anIntArray333[local112] -= local211.anInt307;
							Static255.anIntArray491[local112] -= local211.anInt310;
							local178 = Static213.anIntArray394[local112]--;
						}
					}
				}
				if (local31 >= 0) {
					local118 = 0;
					local131 = 0;
					local200 = 0;
					@Pc(268) int local268 = 0;
					@Pc(270) int local270 = 0;
					for (@Pc(272) int local272 = -5; local272 < Static269.anInt5281; local272++) {
						@Pc(278) int local278 = local272 + 5;
						if (local278 < Static269.anInt5281) {
							local268 += Static255.anIntArray491[local278];
							local270 += Static213.anIntArray394[local278];
							local131 += Static183.anIntArray364[local278];
							local118 += Static307.anIntArray587[local278];
							local200 += Static162.anIntArray333[local278];
						}
						@Pc(319) int local319 = local272 - 5;
						if (local319 >= 0) {
							local131 -= Static183.anIntArray364[local319];
							local268 -= Static255.anIntArray491[local319];
							local200 -= Static162.anIntArray333[local319];
							local118 -= Static307.anIntArray587[local319];
							local270 -= Static213.anIntArray394[local319];
						}
						if (local272 >= 0 && local268 > 0 && local270 > 0) {
							local70[local31][local272] = Static135.method694(local200 / local270, local118 * 256 / local268, local131 / local270);
						}
					}
				}
			}
			Static64.method1604(arg4, Static8.aClass51Array1[local13], local13, Static207.aByteArrayArrayArray11[local13], arg2, Static162.aByteArrayArrayArray7[local13], Static193.aByteArrayArrayArray10[local13], arg3, Static269.anInt5281, local70, Static19.aByteArrayArrayArray4[local13], Static22.anInt481);
			Static207.aByteArrayArrayArray11[local13] = null;
			Static162.aByteArrayArrayArray7[local13] = null;
			Static193.aByteArrayArrayArray10[local13] = null;
			Static19.aByteArrayArrayArray4[local13] = null;
		}
		if (!arg4) {
			if (Static280.aBoolean452) {
				Static315.method5536();
			}
			if (Static95.anInt1828 != 0) {
				Static238.method4222();
			}
		}
		for (local17 = 0; local17 < arg0; local17++) {
			Static8.aClass51Array1[local17].method1860();
		}
	}
}
