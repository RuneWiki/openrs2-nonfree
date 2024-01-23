import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!mj", name = "Q", descriptor = "Lclient!pa;")
	public static Class86 aClass86_48;

	@OriginalMember(owner = "client!mj", name = "H", descriptor = "Lclient!hc;")
	public static Class47 aClass47_1 = Static3.method49();

	@OriginalMember(owner = "client!mj", name = "P", descriptor = "I")
	public static int anInt2778 = 0;

	@OriginalMember(owner = "client!mj", name = "S", descriptor = "I")
	public static int anInt2780 = 0;

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(II)V")
	public static void method2261() {
		Static35.aClass84_15.method2577(5);
	}

	@OriginalMember(owner = "client!mj", name = "f", descriptor = "(B)V")
	public static void method2262() {
		Static13.anInt249 = 0;
		Static80.anInt1584 = 0;
		Static105.method1612();
		Static146.method2478();
		Static93.method1465();
		Static187.method3089();
		@Pc(37) int local37;
		for (@Pc(31) int local31 = 0; local31 < Static13.anInt249; local31++) {
			local37 = Static101.anIntArray190[local31];
			if (Static232.aClass20_Sub3_Sub1Array1[local37].anInt3018 != Static107.anInt2132) {
				if (Static232.aClass20_Sub3_Sub1Array1[local37].anInt1507 > 0) {
					Static214.method3348(Static232.aClass20_Sub3_Sub1Array1[local37]);
				}
				Static232.aClass20_Sub3_Sub1Array1[local37] = null;
			}
		}
		if (Static97.aClass1_Sub17_Sub1_2.anInt2656 != Static217.anInt4289) {
			throw new RuntimeException("gpp1 pos:" + Static97.aClass1_Sub17_Sub1_2.anInt2656 + " psize:" + Static217.anInt4289);
		}
		for (local37 = 0; local37 < Static13.anInt250; local37++) {
			if (Static232.aClass20_Sub3_Sub1Array1[Static52.anIntArray356[local37]] == null) {
				throw new RuntimeException("gpp2 pos:" + local37 + " size:" + Static13.anInt250);
			}
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIIIBI)I")
	public static int method2263(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg2 & 0x3;
		if ((arg1 & 0x1) == 1) {
			@Pc(14) int local14 = arg0;
			arg0 = arg4;
			arg4 = local14;
		}
		if (local3 == 0) {
			return arg3;
		} else if (local3 == 1) {
			return 1 + 7 - arg0 - arg5;
		} else if (local3 == 2) {
			return 1 + 7 - arg4 - arg3;
		} else {
			return arg5;
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!hh;ILclient!qh;)Lclient!hh;")
	public static Class50 method2265(@OriginalArg(0) Class50 arg0, @OriginalArg(2) Class93 arg1) {
		if (arg0.method1257(Static172.aClass50_1150) == -1) {
			return arg0;
		}
		while (true) {
			@Pc(13) int local13 = arg0.method1257(Static184.aClass50_1239);
			if (local13 == -1) {
				while (true) {
					local13 = arg0.method1257(Static13.aClass50_108);
					if (local13 == -1) {
						while (true) {
							local13 = arg0.method1257(Static177.aClass50_1205);
							if (local13 == -1) {
								while (true) {
									local13 = arg0.method1257(Static206.aClass50_1318);
									if (local13 == -1) {
										while (true) {
											local13 = arg0.method1257(Static95.aClass50_614);
											if (local13 == -1) {
												while (true) {
													local13 = arg0.method1257(Static227.aClass50_1379);
													if (local13 == -1) {
														return arg0;
													}
													@Pc(238) Class50 local238 = Static7.aClass50_69;
													if (Static179.aClass116_7 != null) {
														local238 = Static125.method2000(Static179.aClass116_7.anInt4154);
														try {
															if (Static179.aClass116_7.anObject5 != null) {
																@Pc(254) byte[] local254 = ((String) Static179.aClass116_7.anObject5).getBytes("ISO-8859-1");
																local238 = Static20.method301(local254.length, 0, local254);
															}
														} catch (@Pc(263) UnsupportedEncodingException local263) {
														}
													}
													arg0 = Static17.method257(new Class50[] { arg0.method1216(local13, 0), local238, arg0.method1244(local13 + 4) });
												}
											}
											arg0 = Static17.method257(new Class50[] { arg0.method1216(local13, 0), Static40.method645(Static233.method3519(arg1, 4)), arg0.method1244(local13 + 2) });
										}
									}
									arg0 = Static17.method257(new Class50[] { arg0.method1216(local13, 0), Static40.method645(Static233.method3519(arg1, 3)), arg0.method1244(local13 + 2) });
								}
							}
							arg0 = Static17.method257(new Class50[] { arg0.method1216(local13, 0), Static40.method645(Static233.method3519(arg1, 2)), arg0.method1244(local13 + 2) });
						}
					}
					arg0 = Static17.method257(new Class50[] { arg0.method1216(local13, 0), Static40.method645(Static233.method3519(arg1, 1)), arg0.method1244(local13 + 2) });
				}
			}
			arg0 = Static17.method257(new Class50[] { arg0.method1216(local13, 0), Static40.method645(Static233.method3519(arg1, 0)), arg0.method1244(local13 + 2) });
		}
	}
}
