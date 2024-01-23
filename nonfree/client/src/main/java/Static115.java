import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "Z")
	public static boolean aBoolean158;

	@OriginalMember(owner = "client!ia", name = "d", descriptor = "[I")
	public static int[] anIntArray191 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

	@OriginalMember(owner = "client!ia", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString133 = "Members object";

	@OriginalMember(owner = "client!ia", name = "i", descriptor = "Lclient!wf;")
	public static Class189 aClass189_5 = null;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Ljava/lang/String;Z)I")
	public static int method1818(@OriginalArg(0) String arg0) {
		for (@Pc(11) int local11 = 0; local11 < Static76.aStringArray41.length; local11++) {
			if (Static76.aStringArray41[local11].equalsIgnoreCase(arg0)) {
				return local11;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Z)V")
	public static void method1819() {
		if (Static134.aClass52_7 != null) {
			Static134.aClass52_7.method1103();
			Static134.aClass52_7 = null;
		}
		Static170.method2710();
		Static281.method4347();
		@Pc(18) int local18;
		for (local18 = 0; local18 < 4; local18++) {
			Static296.aClass30Array1[local18].method579();
		}
		Static27.method384(false);
		System.gc();
		Static56.method971();
		Static254.anInt4845 = -1;
		Static153.aBoolean210 = false;
		Static241.method3770(true);
		Static295.anInt5480 = 0;
		Static177.anInt3360 = 0;
		Static3.anInt5 = 0;
		Static212.aBoolean294 = false;
		Static220.anInt3983 = 0;
		for (local18 = 0; local18 < Static305.aClass95Array1.length; local18++) {
			Static305.aClass95Array1[local18] = null;
		}
		Static236.anInt4452 = 0;
		Static129.anInt2510 = 0;
		for (local18 = 0; local18 < 2048; local18++) {
			Static182.aClass53_Sub1_Sub1Array1[local18] = null;
			Static242.aClass4_Sub10Array1[local18] = null;
		}
		for (local18 = 0; local18 < 32768; local18++) {
			Static110.aClass53_Sub1_Sub2Array1[local18] = null;
		}
		for (local18 = 0; local18 < 4; local18++) {
			for (@Pc(117) int local117 = 0; local117 < 104; local117++) {
				for (@Pc(122) int local122 = 0; local122 < 104; local122++) {
					Static139.aClass114ArrayArrayArray1[local18][local117][local122] = null;
				}
			}
		}
		Static160.method2576();
		Static290.anInt5427 = 0;
		Static51.method778();
		Static39.method605(true);
		try {
			Static319.method1852(Static276.aClass139_4.anApplet1, "loggedout");
		} catch (@Pc(159) Throwable local159) {
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lclient!wf;ILjava/lang/String;)Ljava/lang/String;")
	public static String method1821(@OriginalArg(0) Class189 arg0, @OriginalArg(2) String arg1) {
		if (arg1.indexOf("%") == -1) {
			return arg1;
		}
		while (true) {
			@Pc(21) int local21 = arg1.indexOf("%1");
			if (local21 == -1) {
				while (true) {
					local21 = arg1.indexOf("%2");
					if (local21 == -1) {
						while (true) {
							local21 = arg1.indexOf("%3");
							if (local21 == -1) {
								while (true) {
									local21 = arg1.indexOf("%4");
									if (local21 == -1) {
										while (true) {
											local21 = arg1.indexOf("%5");
											if (local21 == -1) {
												while (true) {
													local21 = arg1.indexOf("%dns");
													if (local21 == -1) {
														return arg1;
													}
													@Pc(200) String local200 = "";
													if (Static6.aClass185_2 != null) {
														if (Static6.aClass185_2.anObject7 == null) {
															local200 = Static200.method3239(Static6.aClass185_2.anInt5622);
														} else {
															local200 = (String) Static6.aClass185_2.anObject7;
														}
													}
													arg1 = arg1.substring(0, local21) + local200 + arg1.substring(local21 + 4);
												}
											}
											arg1 = arg1.substring(0, local21) + Static113.method1808(Static298.method4501(4, arg0)) + arg1.substring(local21 + 2);
										}
									}
									arg1 = arg1.substring(0, local21) + Static113.method1808(Static298.method4501(3, arg0)) + arg1.substring(local21 + 2);
								}
							}
							arg1 = arg1.substring(0, local21) + Static113.method1808(Static298.method4501(2, arg0)) + arg1.substring(local21 + 2);
						}
					}
					arg1 = arg1.substring(0, local21) + Static113.method1808(Static298.method4501(1, arg0)) + arg1.substring(local21 + 2);
				}
			}
			arg1 = arg1.substring(0, local21) + Static113.method1808(Static298.method4501(0, arg0)) + arg1.substring(local21 + 2);
		}
	}
}
