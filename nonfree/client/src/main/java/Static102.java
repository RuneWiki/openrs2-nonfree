import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!rc", name = "i", descriptor = "Lclient!re;")
	public static Class9 aClass9_51;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "[I")
	public static int[] anIntArray323 = new int[25];

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "Lclient!u;")
	public static Class74 aClass74_1463 = Static72.method1077("Fps:");

	@OriginalMember(owner = "client!rc", name = "g", descriptor = "I")
	public static final int anInt2284 = 3353893;

	@OriginalMember(owner = "client!rc", name = "j", descriptor = "Lclient!u;")
	public static Class74 aClass74_1464 = Static72.method1077("sich mit einer anderen Welt zu verbinden)3");

	@OriginalMember(owner = "client!rc", name = "n", descriptor = "I")
	public static int anInt2289 = 2;

	@OriginalMember(owner = "client!rc", name = "r", descriptor = "I")
	public static final int anInt2293 = 20;

	@OriginalMember(owner = "client!rc", name = "t", descriptor = "Lclient!u;")
	private static Class74 aClass74_1466 = Static72.method1077(" has logged in)3");

	@OriginalMember(owner = "client!rc", name = "s", descriptor = "Lclient!u;")
	public static Class74 aClass74_1465 = aClass74_1466;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ZLclient!ve;Lclient!u;)Lclient!u;")
	public static Class74 method1568(@OriginalArg(1) Class2_Sub2_Sub17 arg0, @OriginalArg(2) Class74 arg1) {
		if (arg1.method1722(Static34.aClass74_621) == -1) {
			return arg1;
		}
		while (true) {
			@Pc(21) int local21 = arg1.method1722(Static7.aClass74_1658);
			if (local21 == -1) {
				while (true) {
					local21 = arg1.method1722(Static43.aClass74_707);
					if (local21 == -1) {
						while (true) {
							local21 = arg1.method1722(Static19.aClass74_450);
							if (local21 == -1) {
								while (true) {
									local21 = arg1.method1722(Static55.aClass74_433);
									if (local21 == -1) {
										while (true) {
											local21 = arg1.method1722(Static68.aClass74_1048);
											if (local21 == -1) {
												while (true) {
													local21 = arg1.method1722(Static117.aClass74_1585);
													if (local21 == -1) {
														return arg1;
													}
													@Pc(235) Class74 local235 = Static97.aClass74_1736;
													if (Static18.aClass37_1 != null) {
														local235 = Static69.method1052(Static18.aClass37_1.anInt1339);
														try {
															if (Static18.aClass37_1.anObject3 != null) {
																@Pc(251) byte[] local251 = ((String) Static18.aClass37_1.anObject3).getBytes("ISO-8859-1");
																local235 = Static82.method1266(local251, local251.length, 0);
															}
														} catch (@Pc(260) UnsupportedEncodingException local260) {
														}
													}
													arg1 = Static91.method1340(new Class74[] { arg1.method1706(0, local21), local235, arg1.method1697(local21 + 4) });
												}
											}
											arg1 = Static91.method1340(new Class74[] { arg1.method1706(0, local21), Static101.method1550(Static121.method1793(arg0, 4)), arg1.method1697(local21 + 2) });
										}
									}
									arg1 = Static91.method1340(new Class74[] { arg1.method1706(0, local21), Static101.method1550(Static121.method1793(arg0, 3)), arg1.method1697(local21 + 2) });
								}
							}
							arg1 = Static91.method1340(new Class74[] { arg1.method1706(0, local21), Static101.method1550(Static121.method1793(arg0, 2)), arg1.method1697(local21 + 2) });
						}
					}
					arg1 = Static91.method1340(new Class74[] { arg1.method1706(0, local21), Static101.method1550(Static121.method1793(arg0, 1)), arg1.method1697(local21 + 2) });
				}
			}
			arg1 = Static91.method1340(new Class74[] { arg1.method1706(0, local21), Static101.method1550(Static121.method1793(arg0, 0)), arg1.method1697(local21 + 2) });
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IB)V")
	public static void method1569(@OriginalArg(0) int arg0) {
		@Pc(15) Class2_Sub12 local15 = (Class2_Sub12) Static87.aClass58_36.method1307((long) arg0);
		if (local15 != null) {
			local15.method1930();
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V")
	public static void method1570() {
		aClass9_51 = null;
		anIntArray323 = null;
		aClass74_1463 = null;
		aClass74_1466 = null;
		aClass74_1464 = null;
		aClass74_1465 = null;
	}
}
