import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
	public static int anInt2025;

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "[I")
	public static int[] anIntArray273;

	@OriginalMember(owner = "client!ne", name = "k", descriptor = "Lclient!ud;")
	public static Class73 aClass73_1;

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "[I")
	public static int[] anIntArray272 = new int[] { 1, 1, 1, 1 };

	@OriginalMember(owner = "client!ne", name = "e", descriptor = "Lclient!wd;")
	public static Class80 aClass80_797 = Static2.method59("W-=hlen Sie eine Option");

	@OriginalMember(owner = "client!ne", name = "f", descriptor = "Lclient!wd;")
	private static Class80 aClass80_798 = Static2.method59("Accept challenge");

	@OriginalMember(owner = "client!ne", name = "j", descriptor = "Lclient!wd;")
	public static Class80 aClass80_799 = aClass80_798;

	@OriginalMember(owner = "client!ne", name = "l", descriptor = "I")
	public static int anInt2030 = 0;

	@OriginalMember(owner = "client!ne", name = "m", descriptor = "I")
	public static volatile int anInt2031 = 0;

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)V")
	public static void method1237() {
		if (Static79.anInt2013 == 104) {
			@Pc(19) int local19;
			if (Static60.anInt1770 == -1) {
				local19 = Static115.anInt2942;
			} else {
				local19 = Static60.anInt1770;
			}
			if (Static60.anInt1770 != Static115.anInt2942) {
				local19--;
				if (local19 < 0) {
					local19 = 19;
				}
				if (Static10.aClass80Array2[local19] != null) {
					Static40.aClass80_457 = Static10.aClass80Array2[local19];
					Static37.aBoolean77 = true;
					Static60.anInt1770 = local19;
				}
			}
		}
		if (Static79.anInt2013 != 105 || Static60.anInt1770 == -1) {
			return;
		}
		Static60.anInt1770++;
		if (Static60.anInt1770 >= 20) {
			Static60.anInt1770 = 0;
		}
		if (Static60.anInt1770 == Static115.anInt2942) {
			Static37.aBoolean77 = true;
			Static40.aClass80_457 = Static40.aClass80_446;
			Static60.anInt1770 = -1;
			return;
		}
		if (Static10.aClass80Array2[Static60.anInt1770] != null) {
			Static40.aClass80_457 = Static10.aClass80Array2[Static60.anInt1770];
			Static37.aBoolean77 = true;
			return;
		}
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(B)V")
	public static void method1238() {
		@Pc(10) Object local10 = Static49.anObject1;
		synchronized (Static49.anObject1) {
			if (Static89.anInt2163 != 0) {
				Static89.anInt2163 = 1;
				try {
					Static49.anObject1.wait();
				} catch (@Pc(23) InterruptedException local23) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)V")
	public static void method1239() {
		aClass80_798 = null;
		anIntArray273 = null;
		aClass80_799 = null;
		aClass73_1 = null;
		aClass80_797 = null;
		anIntArray272 = null;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!va;Lclient!wd;B)Lclient!wd;")
	public static Class80 method1240(@OriginalArg(0) Class2_Sub1_Sub17 arg0, @OriginalArg(1) Class80 arg1) {
		if (arg1.method2025(Static89.aClass80_856) == -1) {
			return arg1;
		}
		while (true) {
			@Pc(13) int local13 = arg1.method2025(Static74.aClass80_750);
			if (local13 == -1) {
				while (true) {
					local13 = arg1.method2025(Static51.aClass80_554);
					if (local13 == -1) {
						while (true) {
							local13 = arg1.method2025(Static35.aClass80_396);
							if (local13 == -1) {
								while (true) {
									local13 = arg1.method2025(Static71.aClass80_734);
									if (local13 == -1) {
										while (true) {
											local13 = arg1.method2025(Static78.aClass80_774);
											if (local13 == -1) {
												while (true) {
													local13 = arg1.method2025(Static83.aClass80_807);
													if (local13 == -1) {
														return arg1;
													}
													@Pc(236) Class80 local236 = Static40.aClass80_446;
													if (Static21.aClass56_2 != null) {
														local236 = Static105.method1439(Static21.aClass56_2.anInt2057);
														try {
															if (Static21.aClass56_2.anObject2 != null) {
																@Pc(252) byte[] local252 = ((String) Static21.aClass56_2.anObject2).getBytes("ISO-8859-1");
																local236 = Static35.method628(local252, 0, local252.length);
															}
														} catch (@Pc(261) UnsupportedEncodingException local261) {
														}
													}
													arg1 = Static93.method1444(new Class80[] { arg1.method2027(0, local13), local236, arg1.method2021(local13 + 4) });
												}
											}
											arg1 = Static93.method1444(new Class80[] { arg1.method2027(0, local13), Static87.method1406(Static37.method651(arg0, 4)), arg1.method2021(local13 + 2) });
										}
									}
									arg1 = Static93.method1444(new Class80[] { arg1.method2027(0, local13), Static87.method1406(Static37.method651(arg0, 3)), arg1.method2021(local13 + 2) });
								}
							}
							arg1 = Static93.method1444(new Class80[] { arg1.method2027(0, local13), Static87.method1406(Static37.method651(arg0, 2)), arg1.method2021(local13 + 2) });
						}
					}
					arg1 = Static93.method1444(new Class80[] { arg1.method2027(0, local13), Static87.method1406(Static37.method651(arg0, 1)), arg1.method2021(local13 + 2) });
				}
			}
			arg1 = Static93.method1444(new Class80[] { arg1.method2027(0, local13), Static87.method1406(Static37.method651(arg0, 0)), arg1.method2021(local13 + 2) });
		}
	}
}
