import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static340 {

	@OriginalMember(owner = "client!w", name = "O", descriptor = "Ljava/lang/String;")
	public static String aString251;

	@OriginalMember(owner = "client!w", name = "k", descriptor = "[I")
	public static final int[] anIntArray554 = new int[8];

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Z)Z")
	public static boolean method5559() {
		return Static170.anInt6279 > 0;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Ljava/lang/String;Lclient!sj;I)Ljava/lang/String;")
	public static String method5560(@OriginalArg(0) String arg0, @OriginalArg(1) Class181 arg1) {
		if (arg0.indexOf("%") == -1) {
			return arg0;
		}
		while (true) {
			@Pc(16) int local16 = arg0.indexOf("%1");
			if (local16 == -1) {
				while (true) {
					local16 = arg0.indexOf("%2");
					if (local16 == -1) {
						while (true) {
							local16 = arg0.indexOf("%3");
							if (local16 == -1) {
								while (true) {
									local16 = arg0.indexOf("%4");
									if (local16 == -1) {
										while (true) {
											local16 = arg0.indexOf("%5");
											if (local16 == -1) {
												while (true) {
													local16 = arg0.indexOf("%dns");
													if (local16 == -1) {
														return arg0;
													}
													@Pc(191) String local191 = "";
													if (Static80.aClass207_6 != null) {
														if (Static80.aClass207_6.anObject7 == null) {
															local191 = Static256.method4295(Static80.aClass207_6.anInt6345);
														} else {
															local191 = (String) Static80.aClass207_6.anObject7;
														}
													}
													arg0 = arg0.substring(0, local16) + local191 + arg0.substring(local16 + 4);
												}
											}
											arg0 = arg0.substring(0, local16) + Static149.method2423(Static113.method5424(4, arg1)) + arg0.substring(local16 + 2);
										}
									}
									arg0 = arg0.substring(0, local16) + Static149.method2423(Static113.method5424(3, arg1)) + arg0.substring(local16 + 2);
								}
							}
							arg0 = arg0.substring(0, local16) + Static149.method2423(Static113.method5424(2, arg1)) + arg0.substring(local16 + 2);
						}
					}
					arg0 = arg0.substring(0, local16) + Static149.method2423(Static113.method5424(1, arg1)) + arg0.substring(local16 + 2);
				}
			}
			arg0 = arg0.substring(0, local16) + Static149.method2423(Static113.method5424(0, arg1)) + arg0.substring(local16 + 2);
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(II)V")
	public static void method5563(@OriginalArg(1) int arg0) {
		Static71.anInt5335 = arg0;
		Static264.aClass198_49.method5236();
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(ILclient!fb;)Ljava/lang/String;")
	public static String method5564(@OriginalArg(1) Class3_Sub4 arg0) {
		return Static250.method4102(arg0);
	}

	@OriginalMember(owner = "client!w", name = "c", descriptor = "(I)V")
	public static void method5565() {
		if (Static212.aClass122_2 == null) {
			return;
		}
		Static35.aClass65_5.method1456();
		Static323.method5290();
		Static80.method1269();
		Static236.method4020();
		Static294.method5391();
		Static171.method2844();
		if (Static55.aClass26_3 != null) {
			Static55.aClass26_3.method625();
		}
		Static292.method4977();
		Static333.method5471();
		Static262.method5726();
		Static233.method4014(false);
		Static83.method1302();
		for (@Pc(41) int local41 = 0; local41 < 2048; local41++) {
			@Pc(47) Class5_Sub4_Sub4_Sub1 local47 = Static254.aClass5_Sub4_Sub4_Sub1Array1[local41];
			if (local47 != null) {
				local47.anInterface5_3 = null;
				for (@Pc(54) int local54 = 0; local54 < local47.aClass124Array3.length; local54++) {
					local47.aClass124Array3[local54] = null;
				}
			}
		}
		for (@Pc(73) int local73 = 0; local73 < Static244.aClass5_Sub4_Sub4_Sub2Array1.length; local73++) {
			@Pc(79) Class5_Sub4_Sub4_Sub2 local79 = Static244.aClass5_Sub4_Sub4_Sub2Array1[local73];
			if (local79 != null) {
				for (@Pc(83) int local83 = 0; local83 < local79.aClass124Array3.length; local83++) {
					local79.aClass124Array3[local83] = null;
				}
			}
		}
		Static212.aClass122_2.method4780();
		Static212.aClass122_2 = null;
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(Z)V")
	public static void method5566() {
		for (@Pc(15) Class3_Sub7_Sub2 local15 = (Class3_Sub7_Sub2) Static254.aClass127_27.method3402(); local15 != null; local15 = (Class3_Sub7_Sub2) Static254.aClass127_27.method3400()) {
			@Pc(20) Class5_Sub4_Sub1 local20 = local15.aClass5_Sub4_Sub1_1;
			if (Static163.anInt3184 != local20.aByte69 || local20.aBoolean133) {
				local15.method5717();
				local20.method2004();
			} else if (local20.anInt2461 <= Static51.anInt1101) {
				local20.method2001(Static347.anInt6759);
				if (local20.aBoolean133) {
					local15.method5717();
				} else {
					Static321.method5272(local20, true);
				}
			}
		}
	}
}
