import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!k", name = "gd", descriptor = "I")
	public static int anInt1730;

	@OriginalMember(owner = "client!k", name = "rd", descriptor = "Lclient!cb;")
	public static Class2_Sub1_Sub3_Sub1 aClass2_Sub1_Sub3_Sub1_9;

	@OriginalMember(owner = "client!k", name = "td", descriptor = "Lclient!cb;")
	public static Class2_Sub1_Sub3_Sub1 aClass2_Sub1_Sub3_Sub1_10;

	@OriginalMember(owner = "client!k", name = "Jc", descriptor = "Lclient!lc;")
	public static Class31 aClass31_611 = Static56.method1206("backleft2");

	@OriginalMember(owner = "client!k", name = "Pc", descriptor = "Lclient!bb;")
	public static Class2_Sub1_Sub2 aClass2_Sub1_Sub2_1 = new Class2_Sub1_Sub2();

	@OriginalMember(owner = "client!k", name = "cd", descriptor = "Z")
	public static boolean aBoolean89 = false;

	@OriginalMember(owner = "client!k", name = "md", descriptor = "Lclient!lc;")
	public static Class31 aClass31_613 = Static56.method1206("May");

	@OriginalMember(owner = "client!k", name = "nd", descriptor = "Lclient!lc;")
	public static Class31 aClass31_614 = Static56.method1206("@yel@ days of*6nmember credit remaining)3");

	@OriginalMember(owner = "client!k", name = "od", descriptor = "Lclient!lc;")
	public static Class31 aClass31_615 = Static56.method1206("Moderator option: Mute player for 48 hours: <OFF>");

	@OriginalMember(owner = "client!k", name = "pd", descriptor = "Lclient!lc;")
	public static Class31 aClass31_616 = Static56.method1206("Examine @cya@");

	@OriginalMember(owner = "client!k", name = "qd", descriptor = "I")
	public static int anInt1736 = -1;

	@OriginalMember(owner = "client!k", name = "sd", descriptor = "Lclient!lc;")
	public static Class31 aClass31_617 = Static56.method1206("RuneScape is loading )2 please wait)3)3)3");

	@OriginalMember(owner = "client!k", name = "ud", descriptor = "I")
	public static int anInt1737 = 0;

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(ILclient!pd;IIIIII)V")
	public static void method1105(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub6 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(23) int local23;
		if (arg3 < 0 || arg3 >= 104 || arg6 < 0 || arg6 >= 104) {
			while (true) {
				local23 = arg1.method665();
				if (local23 == 0) {
					break;
				}
				if (local23 == 1) {
					arg1.method665();
					break;
				}
				if (local23 <= 49) {
					arg1.method665();
				}
			}
			return;
		}
		Static34.aByteArrayArrayArray17[arg5][arg3][arg6] = 0;
		while (true) {
			local23 = arg1.method665();
			if (local23 == 0) {
				if (arg5 == 0) {
					Static16.anIntArrayArrayArray1[0][arg3][arg6] = -Static42.method1058(arg6 + arg2 + 556238, 932731 - -arg3 - -arg0) * 8;
				} else {
					Static16.anIntArrayArrayArray1[arg5][arg3][arg6] = Static16.anIntArrayArrayArray1[arg5 - 1][arg3][arg6] - 240;
				}
				break;
			}
			if (local23 == 1) {
				@Pc(81) int local81 = arg1.method665();
				if (local81 == 1) {
					local81 = 0;
				}
				if (arg5 == 0) {
					Static16.anIntArrayArrayArray1[0][arg3][arg6] = -local81 * 8;
				} else {
					Static16.anIntArrayArrayArray1[arg5][arg3][arg6] = Static16.anIntArrayArrayArray1[arg5 - 1][arg3][arg6] - local81 * 8;
				}
				break;
			}
			if (local23 <= 49) {
				Static21.aByteArrayArrayArray12[arg5][arg3][arg6] = arg1.method673();
				Static63.aByteArrayArrayArray28[arg5][arg3][arg6] = (byte) ((local23 - 2) / 4);
				Static95.aByteArrayArrayArray34[arg5][arg3][arg6] = (byte) (arg4 + local23 - 2 & 0x3);
			} else if (local23 <= 81) {
				Static34.aByteArrayArrayArray17[arg5][arg3][arg6] = (byte) (local23 - 49);
			} else {
				Static49.aByteArrayArrayArray37[arg5][arg3][arg6] = (byte) (local23 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!k", name = "i", descriptor = "(I)V")
	public static void method1107() {
		aClass2_Sub1_Sub3_Sub1_9 = null;
		aClass31_616 = null;
		aClass31_614 = null;
		aClass31_617 = null;
		aClass2_Sub1_Sub3_Sub1_10 = null;
		aClass31_611 = null;
		aClass2_Sub1_Sub2_1 = null;
		aClass31_613 = null;
		aClass31_615 = null;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Lclient!bb;ILclient!lc;)Lclient!lc;")
	public static Class31 method1108(@OriginalArg(0) Class2_Sub1_Sub2 arg0, @OriginalArg(2) Class31 arg1) {
		if (arg1.method1209(Static102.aClass31_216) == -1) {
			return arg1;
		}
		while (true) {
			@Pc(29) int local29 = arg1.method1209(Static63.aClass31_743);
			if (local29 == -1) {
				while (true) {
					local29 = arg1.method1209(Static62.aClass31_742);
					if (local29 == -1) {
						while (true) {
							local29 = arg1.method1209(Static18.aClass31_268);
							if (local29 == -1) {
								while (true) {
									local29 = arg1.method1209(Static105.aClass31_953);
									if (local29 == -1) {
										while (true) {
											local29 = arg1.method1209(Static45.aClass31_583);
											if (local29 == -1) {
												return arg1;
											}
											arg1 = Static37.method974(new Class31[] { arg1.method1213(local29, 0), Static10.method230(Static16.method515(4, arg0)), arg1.method1222(local29 + 2) });
										}
									}
									arg1 = Static37.method974(new Class31[] { arg1.method1213(local29, 0), Static10.method230(Static16.method515(3, arg0)), arg1.method1222(local29 + 2) });
								}
							}
							arg1 = Static37.method974(new Class31[] { arg1.method1213(local29, 0), Static10.method230(Static16.method515(2, arg0)), arg1.method1222(local29 + 2) });
						}
					}
					arg1 = Static37.method974(new Class31[] { arg1.method1213(local29, 0), Static10.method230(Static16.method515(1, arg0)), arg1.method1222(local29 + 2) });
				}
			}
			arg1 = Static37.method974(new Class31[] { arg1.method1213(local29, 0), Static10.method230(Static16.method515(0, arg0)), arg1.method1222(local29 + 2) });
		}
	}

	@OriginalMember(owner = "client!k", name = "j", descriptor = "(I)V")
	public static void method1109() {
		Static28.aClass36_3 = new Class36();
	}
}
