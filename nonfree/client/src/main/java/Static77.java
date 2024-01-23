import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!ff", name = "U", descriptor = "I")
	public static int anInt1593;

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!lg;Ljava/lang/String;B)Ljava/lang/String;")
	public static String method1317(@OriginalArg(0) Class97 arg0, @OriginalArg(1) String arg1) {
		if (arg1.indexOf("%") == -1) {
			return arg1;
		}
		while (true) {
			@Pc(22) int local22 = arg1.indexOf("%1");
			if (local22 == -1) {
				while (true) {
					local22 = arg1.indexOf("%2");
					if (local22 == -1) {
						while (true) {
							local22 = arg1.indexOf("%3");
							if (local22 == -1) {
								while (true) {
									local22 = arg1.indexOf("%4");
									if (local22 == -1) {
										while (true) {
											local22 = arg1.indexOf("%5");
											if (local22 == -1) {
												while (true) {
													local22 = arg1.indexOf("%dns");
													if (local22 == -1) {
														return arg1;
													}
													@Pc(198) String local198 = "";
													if (Static207.aClass119_4 != null) {
														if (Static207.aClass119_4.anObject4 == null) {
															local198 = Static173.method2818(Static207.aClass119_4.anInt3696);
														} else {
															local198 = (String) Static207.aClass119_4.anObject4;
														}
													}
													arg1 = arg1.substring(0, local22) + local198 + arg1.substring(local22 + 4);
												}
											}
											arg1 = arg1.substring(0, local22) + Static233.method3636(Static207.method1818(arg0, 4)) + arg1.substring(local22 + 2);
										}
									}
									arg1 = arg1.substring(0, local22) + Static233.method3636(Static207.method1818(arg0, 3)) + arg1.substring(local22 + 2);
								}
							}
							arg1 = arg1.substring(0, local22) + Static233.method3636(Static207.method1818(arg0, 2)) + arg1.substring(local22 + 2);
						}
					}
					arg1 = arg1.substring(0, local22) + Static233.method3636(Static207.method1818(arg0, 1)) + arg1.substring(local22 + 2);
				}
			}
			arg1 = arg1.substring(0, local22) + Static233.method3636(Static207.method1818(arg0, 0)) + arg1.substring(local22 + 2);
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(JZ)V")
	public static void method1319(@OriginalArg(0) long arg0) {
		if (Static99.anInt1946 == 1 || Static99.anInt1946 == 5) {
			Static50.method985(arg0);
		} else if (Static99.anInt1946 == 2) {
			Static97.method3591();
		} else {
			Static282.method4404();
		}
		if (!Static137.aBoolean176) {
			Static102.anIntArray167[0] = Static60.anInt1341;
			Static286.anInt5602 = 1;
			Static256.aShortArray81[0] = 1004;
			if (Static144.anInt2849 != 0) {
				Static167.anInt3358 = Static49.anInt1112;
				Static73.anInt1479 = Static7.anInt136;
			} else if (Static79.anInt1662 == 0) {
				Static73.anInt1479 = Static178.anInt3603;
				Static167.anInt3358 = Static79.anInt1661;
			} else {
				Static167.anInt3358 = Static72.anInt1466;
				Static73.anInt1479 = Static8.anInt159;
			}
			Static52.aStringArray6[0] = Static29.aString25;
			Static156.aStringArray21[0] = "";
		}
		Static117.method1986((long) Static50.anInt1118);
		if (Static56.anInt1264 != -1) {
			Static214.method4432(Static56.anInt1264);
		}
		@Pc(82) int local82;
		for (local82 = 0; local82 < Static65.anInt5697; local82++) {
			if (Static48.aBooleanArray14[local82]) {
				Static22.aBooleanArray8[local82] = true;
			}
			Static7.aBooleanArray1[local82] = Static48.aBooleanArray14[local82];
			Static48.aBooleanArray14[local82] = false;
		}
		Static171.anInt3430 = -1;
		Static80.anInt1674 = Static50.anInt1118;
		if (Static251.aBoolean330) {
			Static125.aBoolean161 = true;
		}
		Static279.aClass97_21 = null;
		Static52.aClass97_8 = null;
		Static278.anInt5387 = -1;
		if (Static56.anInt1264 != -1) {
			Static65.anInt5697 = 0;
			Static10.method202();
		}
		if (Static251.aBoolean330) {
			Static87.method1462();
		} else {
			Static258.method4012();
		}
		Static120.method2490();
		if (Static137.aBoolean176) {
			if (Static86.aBoolean103) {
				Static178.method2923();
			} else {
				Static148.method2342();
			}
		} else if (Static279.aClass97_21 != null) {
			Static138.method2218(Static279.aClass97_21, Static42.anInt863, Static4.anInt70);
		} else if (Static171.anInt3430 != -1) {
			Static138.method2218(null, Static278.anInt5387, Static171.anInt3430);
		}
		local82 = Static137.aBoolean176 ? -1 : Static4.method62();
		if (local82 == -1) {
			local82 = Static198.anInt4005;
		}
		Static305.method4687(local82);
		if (Static46.anInt1042 == 1) {
			Static46.anInt1042 = 2;
		}
		if (Static48.anInt1076 == 1) {
			Static48.anInt1076 = 2;
		}
		if (Static20.anInt2891 == 3) {
			for (@Pc(209) int local209 = 0; local209 < Static65.anInt5697; local209++) {
				if (Static7.aBooleanArray1[local209]) {
					if (Static251.aBoolean330) {
						Static87.method1456(Static226.anIntArray370[local209], Static242.anIntArray380[local209], Static184.anIntArray305[local209], Static184.anIntArray304[local209], 16711935, 128);
					} else {
						Static258.method4026(Static226.anIntArray370[local209], Static242.anIntArray380[local209], Static184.anIntArray305[local209], Static184.anIntArray304[local209], 16711935, 128);
					}
				} else if (Static22.aBooleanArray8[local209]) {
					if (Static251.aBoolean330) {
						Static87.method1456(Static226.anIntArray370[local209], Static242.anIntArray380[local209], Static184.anIntArray305[local209], Static184.anIntArray304[local209], 16711680, 128);
					} else {
						Static258.method4026(Static226.anIntArray370[local209], Static242.anIntArray380[local209], Static184.anIntArray305[local209], Static184.anIntArray304[local209], 16711680, 128);
					}
				}
			}
		}
		Static118.method1995(Static222.anInt4467, Static72.aClass13_Sub5_Sub1_1.anInt5294, Static309.anInt1336, Static72.aClass13_Sub5_Sub1_1.anInt5334);
		Static309.anInt1336 = 0;
	}

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "(III)Lclient!lg;")
	public static Class97 method1320(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class97 local8 = Static148.method2340(arg0);
		if (arg1 == -1) {
			return local8;
		} else if (local8 == null || local8.aClass97Array1 == null || arg1 >= local8.aClass97Array1.length) {
			return null;
		} else {
			return local8.aClass97Array1[arg1];
		}
	}
}
