import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!rf", name = "bb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_987 = Static8.method128("Nehmen");

	@OriginalMember(owner = "client!rf", name = "cb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_988 = Static8.method128("Bitte laden Sie die Seite neu)3");

	@OriginalMember(owner = "client!rf", name = "db", descriptor = "I")
	public static int anInt3912 = 0;

	@OriginalMember(owner = "client!rf", name = "gb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_989 = Static8.method128("bevor Sie den Vorgang wiederholen)3");

	@OriginalMember(owner = "client!rf", name = "c", descriptor = "(Z)V")
	public static void method2682() {
		aClass18_987 = null;
		aClass18_988 = null;
		aClass18_989 = null;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(BLclient!ef;Lclient!ea;)Lclient!ea;")
	public static Class18 method2683(@OriginalArg(1) Class20 arg0, @OriginalArg(2) Class18 arg1) {
		if (arg1.method731(Static11.aClass18_122) == -1) {
			return arg1;
		}
		while (true) {
			@Pc(13) int local13 = arg1.method731(Static161.aClass18_1134);
			if (local13 == -1) {
				while (true) {
					local13 = arg1.method731(Static60.aClass18_456);
					if (local13 == -1) {
						while (true) {
							local13 = arg1.method731(Static164.aClass18_1163);
							if (local13 == -1) {
								while (true) {
									local13 = arg1.method731(Static66.aClass18_482);
									if (local13 == -1) {
										while (true) {
											local13 = arg1.method731(Static91.aClass18_686);
											if (local13 == -1) {
												while (true) {
													local13 = arg1.method731(Static108.aClass18_810);
													if (local13 == -1) {
														return arg1;
													}
													@Pc(227) Class18 local227 = Static62.aClass18_472;
													if (Static163.aClass26_8 != null) {
														local227 = Static82.method1800(Static163.aClass26_8.anInt1787);
														try {
															if (Static163.aClass26_8.anObject2 != null) {
																@Pc(243) byte[] local243 = ((String) Static163.aClass26_8.anObject2).getBytes("ISO-8859-1");
																local227 = Static65.method1297(local243.length, local243, 0);
															}
														} catch (@Pc(252) UnsupportedEncodingException local252) {
														}
													}
													arg1 = Static144.method2735(new Class18[] { arg1.method744(0, local13), local227, arg1.method733(local13 + 4) });
												}
											}
											arg1 = Static144.method2735(new Class18[] { arg1.method744(0, local13), Static101.method2131(Static87.method1881(4, arg0)), arg1.method733(local13 + 2) });
										}
									}
									arg1 = Static144.method2735(new Class18[] { arg1.method744(0, local13), Static101.method2131(Static87.method1881(3, arg0)), arg1.method733(local13 + 2) });
								}
							}
							arg1 = Static144.method2735(new Class18[] { arg1.method744(0, local13), Static101.method2131(Static87.method1881(2, arg0)), arg1.method733(local13 + 2) });
						}
					}
					arg1 = Static144.method2735(new Class18[] { arg1.method744(0, local13), Static101.method2131(Static87.method1881(1, arg0)), arg1.method733(local13 + 2) });
				}
			}
			arg1 = Static144.method2735(new Class18[] { arg1.method744(0, local13), Static101.method2131(Static87.method1881(0, arg0)), arg1.method733(local13 + 2) });
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(ILclient!ef;)Lclient!ef;")
	public static Class20 method2684(@OriginalArg(1) Class20 arg0) {
		@Pc(7) Class20 local7 = Static94.method2061(arg0);
		if (local7 == null) {
			local7 = arg0.aClass20_3;
		}
		return local7;
	}
}
