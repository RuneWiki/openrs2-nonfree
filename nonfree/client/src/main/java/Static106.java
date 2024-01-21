import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!sa", name = "g", descriptor = "I")
	public static int anInt2518;

	@OriginalMember(owner = "client!sa", name = "m", descriptor = "Lclient!lc;")
	public static Class40 aClass40_77;

	@OriginalMember(owner = "client!sa", name = "f", descriptor = "Lclient!qc;")
	private static Class60 aClass60_1017 = Static121.method2047("Press (Wchange your password(W on front page)3");

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "Lclient!qc;")
	public static Class60 aClass60_1014 = aClass60_1017;

	@OriginalMember(owner = "client!sa", name = "l", descriptor = "Lclient!qc;")
	private static Class60 aClass60_1019 = Static121.method2047("red:");

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "Lclient!qc;")
	public static Class60 aClass60_1015 = aClass60_1019;

	@OriginalMember(owner = "client!sa", name = "e", descriptor = "Lclient!qc;")
	public static Class60 aClass60_1016 = aClass60_1019;

	@OriginalMember(owner = "client!sa", name = "n", descriptor = "Lclient!qc;")
	private static Class60 aClass60_1020 = Static121.method2047("Connecting to update server");

	@OriginalMember(owner = "client!sa", name = "i", descriptor = "Lclient!qc;")
	public static Class60 aClass60_1018 = aClass60_1020;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)V")
	public static void method1826() {
		aClass40_77 = null;
		aClass60_1016 = null;
		aClass60_1018 = null;
		aClass60_1017 = null;
		aClass60_1020 = null;
		aClass60_1015 = null;
		aClass60_1019 = null;
		aClass60_1014 = null;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(ZLclient!q;Lclient!qc;)Lclient!qc;")
	public static Class60 method1827(@OriginalArg(1) Class4_Sub17 arg0, @OriginalArg(2) Class60 arg1) {
		if (arg1.method1649(Static56.aClass60_541) == -1) {
			return arg1;
		}
		while (true) {
			@Pc(21) int local21 = arg1.method1649(Static90.aClass60_869);
			if (local21 == -1) {
				while (true) {
					local21 = arg1.method1649(Static107.aClass60_1026);
					if (local21 == -1) {
						while (true) {
							local21 = arg1.method1649(Static119.aClass60_1143);
							if (local21 == -1) {
								while (true) {
									local21 = arg1.method1649(Static33.aClass60_366);
									if (local21 == -1) {
										while (true) {
											local21 = arg1.method1649(Static105.aClass60_1009);
											if (local21 == -1) {
												while (true) {
													local21 = arg1.method1649(Static108.aClass60_1031);
													if (local21 == -1) {
														return arg1;
													}
													@Pc(233) Class60 local233 = Static22.aClass60_241;
													if (Static52.aClass30_3 != null) {
														local233 = Static117.method1961(Static52.aClass30_3.anInt1208);
														try {
															if (Static52.aClass30_3.anObject3 != null) {
																@Pc(249) byte[] local249 = ((String) Static52.aClass30_3.anObject3).getBytes("ISO-8859-1");
																local233 = Static117.method1958(0, local249, local249.length);
															}
														} catch (@Pc(258) UnsupportedEncodingException local258) {
														}
													}
													arg1 = Static125.method2072(new Class60[] { arg1.method1657(local21, 0), local233, arg1.method1662(local21 + 4) });
												}
											}
											arg1 = Static125.method2072(new Class60[] { arg1.method1657(local21, 0), Static71.method1378(Static41.method699(arg0, 4)), arg1.method1662(local21 + 2) });
										}
									}
									arg1 = Static125.method2072(new Class60[] { arg1.method1657(local21, 0), Static71.method1378(Static41.method699(arg0, 3)), arg1.method1662(local21 + 2) });
								}
							}
							arg1 = Static125.method2072(new Class60[] { arg1.method1657(local21, 0), Static71.method1378(Static41.method699(arg0, 2)), arg1.method1662(local21 + 2) });
						}
					}
					arg1 = Static125.method2072(new Class60[] { arg1.method1657(local21, 0), Static71.method1378(Static41.method699(arg0, 1)), arg1.method1662(local21 + 2) });
				}
			}
			arg1 = Static125.method2072(new Class60[] { arg1.method1657(local21, 0), Static71.method1378(Static41.method699(arg0, 0)), arg1.method1662(local21 + 2) });
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(ZILclient!lc;)Lclient!da;")
	public static Class4_Sub4_Sub3_Sub1 method1828(@OriginalArg(1) int arg0, @OriginalArg(2) Class40 arg1) {
		return Static45.method810(arg0, arg1) ? Static55.method1027() : null;
	}
}
