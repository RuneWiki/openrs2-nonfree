import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!fa", name = "fb", descriptor = "Lclient!jd;")
	public static Class2_Sub1_Sub2_Sub4 aClass2_Sub1_Sub2_Sub4_2;

	@OriginalMember(owner = "client!fa", name = "kb", descriptor = "[I")
	public static int[] anIntArray115;

	@OriginalMember(owner = "client!fa", name = "rb", descriptor = "Lclient!a;")
	private static Class1 aClass1_1060 = Static94.method1596("Please try using a different world)3");

	@OriginalMember(owner = "client!fa", name = "eb", descriptor = "Lclient!a;")
	public static Class1 aClass1_1052 = aClass1_1060;

	@OriginalMember(owner = "client!fa", name = "gb", descriptor = "Lclient!a;")
	public static Class1 aClass1_1053 = Static94.method1596("Schrifts-=tze geladen)3");

	@OriginalMember(owner = "client!fa", name = "ib", descriptor = "Lclient!a;")
	public static Class1 aClass1_1054 = Static94.method1596("Verbindung mit Freunde)2Server)3)3)3");

	@OriginalMember(owner = "client!fa", name = "jb", descriptor = "Lclient!a;")
	public static Class1 aClass1_1055 = aClass1_1060;

	@OriginalMember(owner = "client!fa", name = "lb", descriptor = "I")
	public static int anInt1052 = 0;

	@OriginalMember(owner = "client!fa", name = "mb", descriptor = "Lclient!a;")
	public static Class1 aClass1_1056 = aClass1_1060;

	@OriginalMember(owner = "client!fa", name = "nb", descriptor = "Lclient!a;")
	public static Class1 aClass1_1057 = Static94.method1596("m-Ochte sich mit Ihnen duellieren)3");

	@OriginalMember(owner = "client!fa", name = "pb", descriptor = "Lclient!a;")
	public static Class1 aClass1_1058 = aClass1_1060;

	@OriginalMember(owner = "client!fa", name = "qb", descriptor = "Lclient!a;")
	public static Class1 aClass1_1059 = aClass1_1060;

	@OriginalMember(owner = "client!fa", name = "tb", descriptor = "Lclient!a;")
	public static Class1 aClass1_1061 = aClass1_1060;

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(BLclient!qd;Lclient!a;)Lclient!a;")
	public static Class1 method736(@OriginalArg(1) Class2_Sub1_Sub14 arg0, @OriginalArg(2) Class1 arg1) {
		if (arg1.method11(Static73.aClass1_2050) == -1) {
			return arg1;
		}
		while (true) {
			@Pc(23) int local23 = arg1.method11(Static66.aClass1_2456);
			if (local23 == -1) {
				while (true) {
					local23 = arg1.method11(Static76.aClass1_2144);
					if (local23 == -1) {
						while (true) {
							local23 = arg1.method11(Static112.aClass1_2907);
							if (local23 == -1) {
								while (true) {
									local23 = arg1.method11(Static90.aClass1_2446);
									if (local23 == -1) {
										while (true) {
											local23 = arg1.method11(Static39.aClass1_2856);
											if (local23 == -1) {
												while (true) {
													local23 = arg1.method11(Static44.aClass1_1485);
													if (local23 == -1) {
														return arg1;
													}
													@Pc(242) Class1 local242 = Static111.aClass1_2898;
													if (Static21.aClass18_3 != null) {
														local242 = Static101.method1716(Static21.aClass18_3.anInt1026);
														try {
															if (Static21.aClass18_3.anObject3 != null) {
																@Pc(258) byte[] local258 = ((String) Static21.aClass18_3.anObject3).getBytes("ISO-8859-1");
																local242 = Static32.method845(local258, 0, local258.length);
															}
														} catch (@Pc(267) UnsupportedEncodingException local267) {
														}
													}
													arg1 = Static97.method1655(new Class1[] { arg1.method19(0, local23), local242, arg1.method1(local23 + 4) });
												}
											}
											arg1 = Static97.method1655(new Class1[] { arg1.method19(0, local23), Static100.method1678(Static111.method1806(4, arg0)), arg1.method1(local23 + 2) });
										}
									}
									arg1 = Static97.method1655(new Class1[] { arg1.method19(0, local23), Static100.method1678(Static111.method1806(3, arg0)), arg1.method1(local23 + 2) });
								}
							}
							arg1 = Static97.method1655(new Class1[] { arg1.method19(0, local23), Static100.method1678(Static111.method1806(2, arg0)), arg1.method1(local23 + 2) });
						}
					}
					arg1 = Static97.method1655(new Class1[] { arg1.method19(0, local23), Static100.method1678(Static111.method1806(1, arg0)), arg1.method1(local23 + 2) });
				}
			}
			arg1 = Static97.method1655(new Class1[] { arg1.method19(0, local23), Static100.method1678(Static111.method1806(0, arg0)), arg1.method1(local23 + 2) });
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IILclient!jd;B)V")
	public static void method737(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub1_Sub2_Sub4 arg2) {
		if (arg2 == null) {
			return;
		}
		@Pc(12) int local12 = Static72.anInt1975 + Static94.anInt2376 & 0x7FF;
		@Pc(20) int local20 = arg0 * arg0 + arg1 * arg1;
		if (local20 > 6400) {
			return;
		}
		@Pc(28) int local28 = Static75.anIntArray254[local12];
		@Pc(36) int local36 = local28 * 256 / (Static85.anInt2254 + 256);
		@Pc(40) int local40 = Static75.anIntArray256[local12];
		@Pc(48) int local48 = local40 * 256 / (Static85.anInt2254 + 256);
		@Pc(58) int local58 = local48 * arg1 + arg0 * local36 >> 16;
		@Pc(69) int local69 = local48 * arg0 - arg1 * local36 >> 16;
		if (local20 > 2500) {
			arg2.method1144(Static62.aClass2_Sub1_Sub2_Sub2_17, local58 + 98 - arg2.anInt1673 / 2, -(arg2.anInt1671 / 2) + -local69 + 79);
		} else {
			arg2.method1140(local58 + 4 + 94 - arg2.anInt1673 / 2, -local69 + -4 + 83 + -(arg2.anInt1671 / 2));
		}
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(I)V")
	public static void method738() {
		aClass1_1052 = null;
		aClass1_1060 = null;
		aClass1_1056 = null;
		aClass1_1055 = null;
		aClass1_1053 = null;
		aClass1_1057 = null;
		aClass1_1061 = null;
		aClass1_1058 = null;
		anIntArray115 = null;
		aClass1_1059 = null;
		aClass1_1054 = null;
		aClass2_Sub1_Sub2_Sub4_2 = null;
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(IB)Lclient!ia;")
	public static Class2_Sub1_Sub10 method739(@OriginalArg(0) int arg0) {
		@Pc(6) Class2_Sub1_Sub10 local6 = (Class2_Sub1_Sub10) Static94.aClass11_24.method431((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(20) byte[] local20 = Static20.aClass8_8.method1684(arg0, 6);
		local6 = new Class2_Sub1_Sub10();
		local6.anInt1502 = arg0;
		if (local20 != null) {
			local6.method1010(new Class2_Sub3(local20));
		}
		local6.method1012();
		if (local6.aBoolean76) {
			local6.aBoolean75 = false;
			local6.aBoolean79 = false;
		}
		Static94.aClass11_24.method430((long) arg0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(III)Lclient!a;")
	public static Class1 method740(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = arg0 - arg1;
		if (local13 < -9) {
			return Static46.aClass1_1506;
		} else if (local13 < -6) {
			return Static56.aClass1_1837;
		} else if (local13 < -3) {
			return Static113.aClass1_2351;
		} else if (local13 < 0) {
			return Static13.aClass1_599;
		} else if (local13 > 9) {
			return Static84.aClass1_2356;
		} else if (local13 > 6) {
			return Static32.aClass1_1212;
		} else if (local13 > 3) {
			return Static69.aClass1_2916;
		} else if (local13 > 0) {
			return Static65.aClass1_1975;
		} else {
			return Static89.aClass1_2440;
		}
	}

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "(I)V")
	public static void method741() {
		if (Static37.anInt1346 < 2 && Static12.anInt2645 == 0 && Static17.anInt783 == 0) {
			return;
		}
		@Pc(48) Class1 local48;
		if (Static12.anInt2645 == 1 && Static37.anInt1346 < 2) {
			local48 = Static97.method1655(new Class1[] { Static17.aClass1_675, Static77.aClass1_2166, Static109.aClass1_2872, Static66.aClass1_2457 });
		} else if (Static17.anInt783 == 1 && Static37.anInt1346 < 2) {
			local48 = Static97.method1655(new Class1[] { Static52.aClass1_1774, Static77.aClass1_2166, Static46.aClass1_1507, Static66.aClass1_2457 });
		} else {
			local48 = Static84.aClass1Array20[Static37.anInt1346 - 1];
		}
		if (Static37.anInt1346 > 2) {
			local48 = Static97.method1655(new Class1[] { local48, Static88.aClass1_2429, Static43.method994(Static37.anInt1346 - 2), Static68.aClass1_1981 });
		}
		Static97.aClass2_Sub1_Sub2_Sub1_3.method369(local48, 4, 16777215, Static69.anInt2806 / 1000);
	}
}
