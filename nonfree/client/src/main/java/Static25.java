import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!cd", name = "j", descriptor = "I")
	public static int anInt733;

	@OriginalMember(owner = "client!cd", name = "r", descriptor = "I")
	public static int anInt737;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "Lclient!uc;")
	public static final Class87 aClass87_14 = new Class87(64);

	@OriginalMember(owner = "client!cd", name = "u", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_542 = Static118.method2249("Loaded wordpack");

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "Lclient!oc;")
	public static Class65 aClass65_533 = aClass65_542;

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "J")
	public static long aLong23 = 0L;

	@OriginalMember(owner = "client!cd", name = "i", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_537 = Static118.method2249("K");

	@OriginalMember(owner = "client!cd", name = "f", descriptor = "Lclient!oc;")
	public static Class65 aClass65_534 = aClass65_537;

	@OriginalMember(owner = "client!cd", name = "g", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_535 = Static118.method2249("Checking for updates )2 ");

	@OriginalMember(owner = "client!cd", name = "h", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_536 = Static118.method2249("Anmelde)2Zeitlimit -Uberschritten)3");

	@OriginalMember(owner = "client!cd", name = "l", descriptor = "Lclient!oc;")
	public static Class65 aClass65_538 = aClass65_535;

	@OriginalMember(owner = "client!cd", name = "n", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_539 = Static118.method2249("Error connecting to server)3");

	@OriginalMember(owner = "client!cd", name = "o", descriptor = "[J")
	public static final long[] aLongArray1 = new long[32];

	@OriginalMember(owner = "client!cd", name = "p", descriptor = "Lclient!oc;")
	public static Class65 aClass65_540 = aClass65_539;

	@OriginalMember(owner = "client!cd", name = "s", descriptor = "Lclient!oc;")
	public static Class65 aClass65_541 = aClass65_537;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(ZLclient!wd;)V")
	public static void method448(@OriginalArg(1) Class97 arg0) {
		if (Static20.anInt621 == arg0.anInt4331) {
			Static197.aBooleanArray18[arg0.anInt4378] = true;
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!oc;BLclient!wd;)Lclient!oc;")
	public static Class65 method449(@OriginalArg(0) Class65 arg0, @OriginalArg(2) Class97 arg1) {
		if (arg0.method2484(Static70.aClass65_1067) == -1) {
			return arg0;
		}
		while (true) {
			@Pc(12) int local12 = arg0.method2484(Static20.aClass65_485);
			if (local12 == -1) {
				while (true) {
					local12 = arg0.method2484(Static33.aClass65_638);
					if (local12 == -1) {
						while (true) {
							local12 = arg0.method2484(Static162.aClass65_2177);
							if (local12 == -1) {
								while (true) {
									local12 = arg0.method2484(Static168.aClass65_1730);
									if (local12 == -1) {
										while (true) {
											local12 = arg0.method2484(Static183.aClass65_2320);
											if (local12 == -1) {
												while (true) {
													local12 = arg0.method2484(Static84.aClass65_1229);
													if (local12 == -1) {
														return arg0;
													}
													@Pc(224) Class65 local224 = Static117.aClass65_1665;
													if (Static45.aClass34_4 != null) {
														local224 = Static57.method1048(Static45.aClass34_4.anInt1729);
														try {
															if (Static45.aClass34_4.anObject1 != null) {
																@Pc(240) byte[] local240 = ((String) Static45.aClass34_4.anObject1).getBytes("ISO-8859-1");
																local224 = Static183.method2975(0, local240.length, local240);
															}
														} catch (@Pc(249) UnsupportedEncodingException local249) {
														}
													}
													arg0 = Static109.method2004(new Class65[] { arg0.method2481(local12, 0), local224, arg0.method2483(local12 + 4) });
												}
											}
											arg0 = Static109.method2004(new Class65[] { arg0.method2481(local12, 0), Static154.method2698(Static185.method3076(4, arg1)), arg0.method2483(local12 + 2) });
										}
									}
									arg0 = Static109.method2004(new Class65[] { arg0.method2481(local12, 0), Static154.method2698(Static185.method3076(3, arg1)), arg0.method2483(local12 + 2) });
								}
							}
							arg0 = Static109.method2004(new Class65[] { arg0.method2481(local12, 0), Static154.method2698(Static185.method3076(2, arg1)), arg0.method2483(local12 + 2) });
						}
					}
					arg0 = Static109.method2004(new Class65[] { arg0.method2481(local12, 0), Static154.method2698(Static185.method3076(1, arg1)), arg0.method2483(local12 + 2) });
				}
			}
			arg0 = Static109.method2004(new Class65[] { arg0.method2481(local12, 0), Static154.method2698(Static185.method3076(0, arg1)), arg0.method2483(local12 + 2) });
		}
	}
}
