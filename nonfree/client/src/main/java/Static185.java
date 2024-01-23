import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!oe", name = "T", descriptor = "[I")
	public static int[] anIntArray274;

	@OriginalMember(owner = "client!oe", name = "Z", descriptor = "I")
	public static int anInt3689;

	@OriginalMember(owner = "client!oe", name = "I", descriptor = "Lclient!pa;")
	public static Class127 aClass127_1 = new Class127();

	@OriginalMember(owner = "client!oe", name = "L", descriptor = "I")
	public static int anInt3679 = 0;

	@OriginalMember(owner = "client!oe", name = "Y", descriptor = "Ljava/lang/String;")
	public static String aString128 = " from your friend list first.";

	@OriginalMember(owner = "client!oe", name = "ab", descriptor = "I")
	public static int anInt3690 = 0;

	@OriginalMember(owner = "client!oe", name = "bb", descriptor = "I")
	public static int anInt3691 = 0;

	@OriginalMember(owner = "client!oe", name = "f", descriptor = "(I)V")
	public static void method2868() {
		Static243.aClass61_47.method1379();
	}

	@OriginalMember(owner = "client!oe", name = "d", descriptor = "(B)V")
	public static void method2870() {
		Static144.aClass61_22.method1379();
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method2873(@OriginalArg(1) String arg0) {
		if (Static245.aClass130_2 == null || arg0.length() == 0) {
			return -1;
		}
		for (@Pc(18) int local18 = 0; local18 < Static245.aClass130_2.anInt3917; local18++) {
			if (Static256.method3842(Static9.method80(" ", "<br>", Static245.aClass130_2.aStringArray61[local18]), arg0)) {
				return local18;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!pk;I)V")
	public static void method2874(@OriginalArg(0) Class132 arg0) {
		Static94.aClass132_37 = arg0;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!tk;Ljava/lang/String;I)Ljava/lang/String;")
	public static String method2875(@OriginalArg(0) Class159 arg0, @OriginalArg(1) String arg1) {
		if (arg1.indexOf("%") == -1) {
			return arg1;
		}
		while (true) {
			@Pc(19) int local19 = arg1.indexOf("%1");
			if (local19 == -1) {
				while (true) {
					local19 = arg1.indexOf("%2");
					if (local19 == -1) {
						while (true) {
							local19 = arg1.indexOf("%3");
							if (local19 == -1) {
								while (true) {
									local19 = arg1.indexOf("%4");
									if (local19 == -1) {
										while (true) {
											local19 = arg1.indexOf("%5");
											if (local19 == -1) {
												while (true) {
													local19 = arg1.indexOf("%dns");
													if (local19 == -1) {
														return arg1;
													}
													@Pc(198) String local198 = "";
													if (Static107.aClass163_6 != null) {
														if (Static107.aClass163_6.anObject7 == null) {
															local198 = Static194.method3025(Static107.aClass163_6.anInt5260);
														} else {
															local198 = (String) Static107.aClass163_6.anObject7;
														}
													}
													arg1 = arg1.substring(0, local19) + local198 + arg1.substring(local19 + 4);
												}
											}
											arg1 = arg1.substring(0, local19) + Static66.method3399(Static53.method844(arg0, 4)) + arg1.substring(local19 + 2);
										}
									}
									arg1 = arg1.substring(0, local19) + Static66.method3399(Static53.method844(arg0, 3)) + arg1.substring(local19 + 2);
								}
							}
							arg1 = arg1.substring(0, local19) + Static66.method3399(Static53.method844(arg0, 2)) + arg1.substring(local19 + 2);
						}
					}
					arg1 = arg1.substring(0, local19) + Static66.method3399(Static53.method844(arg0, 1)) + arg1.substring(local19 + 2);
				}
			}
			arg1 = arg1.substring(0, local19) + Static66.method3399(Static53.method844(arg0, 0)) + arg1.substring(local19 + 2);
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(CBI)I")
	public static int method2876(@OriginalArg(0) char arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = arg0 << 4;
		if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
			arg0 = Character.toLowerCase(arg0);
			local13 = (arg0 << 4) + 1;
		}
		if (arg0 == 'ñ' && arg1 == 0) {
			local13 = 1762;
		}
		return local13;
	}
}
