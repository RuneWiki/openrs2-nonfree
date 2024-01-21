import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!mf", name = "j", descriptor = "I")
	public static int anInt1969;

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "Lclient!ec;")
	private static Class22 aClass22_545 = Static60.method1113("K");

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "Lclient!ec;")
	public static Class22 aClass22_544 = aClass22_545;

	@OriginalMember(owner = "client!mf", name = "d", descriptor = "Lclient!ec;")
	public static Class22 aClass22_546 = aClass22_545;

	@OriginalMember(owner = "client!mf", name = "f", descriptor = "Lclient!ec;")
	public static Class22 aClass22_547 = Static60.method1113("Begeben Sie sich in ein freies Gebiet)1 um");

	@OriginalMember(owner = "client!mf", name = "g", descriptor = "I")
	public static int anInt1966 = -1;

	@OriginalMember(owner = "client!mf", name = "k", descriptor = "Lclient!ec;")
	public static Class22 aClass22_548 = Static60.method1113("Sichtbare Karte vorbereitet)3");

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)V")
	public static void method1209() {
		aClass22_544 = null;
		aClass22_547 = null;
		aClass22_548 = null;
		aClass22_545 = null;
		aClass22_546 = null;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!f;Lclient!ec;Z)Lclient!ec;")
	public static Class22 method1210(@OriginalArg(0) Class4_Sub7 arg0, @OriginalArg(1) Class22 arg1) {
		if (arg1.method476(Static106.aClass22_788) == -1) {
			return arg1;
		}
		while (true) {
			@Pc(17) int local17 = arg1.method476(Static48.aClass22_324);
			if (local17 == -1) {
				while (true) {
					local17 = arg1.method476(Static33.aClass22_227);
					if (local17 == -1) {
						while (true) {
							local17 = arg1.method476(Static58.aClass22_447);
							if (local17 == -1) {
								while (true) {
									local17 = arg1.method476(Static33.aClass22_231);
									if (local17 == -1) {
										while (true) {
											local17 = arg1.method476(Static113.aClass22_872);
											if (local17 == -1) {
												while (true) {
													local17 = arg1.method476(Static93.aClass22_731);
													if (local17 == -1) {
														return arg1;
													}
													@Pc(240) Class22 local240 = Static64.aClass22_485;
													if (Static76.aClass12_8 != null) {
														local240 = Static24.method395(Static76.aClass12_8.anInt372);
														try {
															if (Static76.aClass12_8.anObject1 != null) {
																@Pc(256) byte[] local256 = ((String) Static76.aClass12_8.anObject1).getBytes("ISO-8859-1");
																local240 = Static22.method1817(local256, 0, local256.length);
															}
														} catch (@Pc(265) UnsupportedEncodingException local265) {
														}
													}
													arg1 = Static44.method856(new Class22[] { arg1.method450(0, local17), local240, arg1.method477(local17 + 4) });
												}
											}
											arg1 = Static44.method856(new Class22[] { arg1.method450(0, local17), Static45.method883(Static132.method2032(arg0, 4)), arg1.method477(local17 + 2) });
										}
									}
									arg1 = Static44.method856(new Class22[] { arg1.method450(0, local17), Static45.method883(Static132.method2032(arg0, 3)), arg1.method477(local17 + 2) });
								}
							}
							arg1 = Static44.method856(new Class22[] { arg1.method450(0, local17), Static45.method883(Static132.method2032(arg0, 2)), arg1.method477(local17 + 2) });
						}
					}
					arg1 = Static44.method856(new Class22[] { arg1.method450(0, local17), Static45.method883(Static132.method2032(arg0, 1)), arg1.method477(local17 + 2) });
				}
			}
			arg1 = Static44.method856(new Class22[] { arg1.method450(0, local17), Static45.method883(Static132.method2032(arg0, 0)), arg1.method477(local17 + 2) });
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!ea;I)V")
	public static void method1211(@OriginalArg(0) Class20 arg0) {
		Static4.aClass20_4 = arg0;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILclient!qd;)V")
	public static void method1212(@OriginalArg(1) Class4_Sub1_Sub3_Sub2 arg0) {
		arg0.anInt2458 = 0;
		if (arg0.anInt2504 == 0) {
			arg0.anInt2496 = 1024;
		}
		if (arg0.anInt2504 == 1) {
			arg0.anInt2496 = 1536;
		}
		if (arg0.anInt2504 == 2) {
			arg0.anInt2496 = 0;
		}
		if (arg0.anInt2504 == 3) {
			arg0.anInt2496 = 512;
		}
		@Pc(39) int local39 = arg0.anInt2488 - Static117.anInt2877;
		@Pc(49) int local49 = arg0.anInt2472 * 128 + arg0.anInt2473 * 64;
		@Pc(59) int local59 = arg0.anInt2479 * 128 + arg0.anInt2473 * 64;
		arg0.anInt2462 += (local59 - arg0.anInt2462) / local39;
		arg0.anInt2500 += (local49 - arg0.anInt2500) / local39;
	}
}
