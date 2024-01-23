import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!fb", name = "v", descriptor = "I")
	public static int anInt1837;

	@OriginalMember(owner = "client!fb", name = "x", descriptor = "B")
	public static byte aByte5;

	@OriginalMember(owner = "client!fb", name = "z", descriptor = "I")
	public static int anInt1840;

	@OriginalMember(owner = "client!fb", name = "q", descriptor = "[I")
	public static int[] anIntArray139 = new int[4];

	@OriginalMember(owner = "client!fb", name = "t", descriptor = "I")
	public static int anInt1836 = 0;

	@OriginalMember(owner = "client!fb", name = "u", descriptor = "Z")
	public static boolean aBoolean102 = false;

	@OriginalMember(owner = "client!fb", name = "w", descriptor = "I")
	public static int anInt1838 = 0;

	@OriginalMember(owner = "client!fb", name = "A", descriptor = "[I")
	public static int[] anIntArray140 = new int[100];

	@OriginalMember(owner = "client!fb", name = "B", descriptor = "S")
	public static short aShort11 = 1;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lclient!se;III)V")
	public static void method1297(@OriginalArg(0) Class122 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0.anInt4694 == 1) {
			Static199.method3319(-1, 0L, 0, arg0.aString330, "", (short) 16, arg0.anInt4686);
		}
		if (arg0.anInt4694 == 2 && !Static88.aBoolean138) {
			@Pc(38) String local38 = Static19.method365(arg0);
			if (local38 != null) {
				Static199.method3319(-1, 0L, -1, local38, "<col=00ff00>" + arg0.aString332, (short) 50, arg0.anInt4686);
			}
		}
		if (arg0.anInt4694 == 3) {
			Static199.method3319(-1, 0L, 0, Static65.aString107, "", (short) 7, arg0.anInt4686);
		}
		if (arg0.anInt4694 == 4) {
			Static199.method3319(-1, 0L, 0, arg0.aString330, "", (short) 38, arg0.anInt4686);
		}
		if (arg0.anInt4694 == 5) {
			Static199.method3319(-1, 0L, 0, arg0.aString330, "", (short) 33, arg0.anInt4686);
		}
		if (arg0.anInt4694 == 6 && Static58.aClass122_6 == null) {
			Static199.method3319(-1, 0L, -1, arg0.aString330, "", (short) 26, arg0.anInt4686);
		}
		@Pc(154) int local154;
		@Pc(148) int local148;
		if (arg0.anInt4656 == 2) {
			local148 = 0;
			for (@Pc(150) int local150 = 0; local150 < arg0.anInt4683; local150++) {
				for (local154 = 0; local154 < arg0.anInt4650; local154++) {
					@Pc(163) int local163 = local150 * (arg0.anInt4722 + 32);
					@Pc(170) int local170 = local154 * (arg0.anInt4732 + 32);
					if (local148 < 20) {
						local170 += arg0.anIntArray377[local148];
						local163 += arg0.anIntArray361[local148];
					}
					if (arg2 >= local170 && arg1 >= local163 && local170 + 32 > arg2 && local163 + 32 > arg1) {
						Static251.anInt5353 = local148;
						Static194.aClass122_14 = arg0;
						if (arg0.anIntArray362[local148] > 0) {
							@Pc(226) Class1_Sub27 local226 = Static39.method702(arg0);
							@Pc(235) Class89 local235 = Static93.method2006(arg0.anIntArray362[local148] - 1);
							if (Static183.anInt5174 == 1 && local226.method3656()) {
								if (Static77.anInt2096 != arg0.anInt4686 || Static98.anInt2704 != local148) {
									Static199.method3319(-1, (long) local235.anInt3642, local148, Static197.aString146, Static199.aString296 + " -> <col=ff9040>" + local235.aString235, (short) 44, arg0.anInt4686);
								}
							} else if (Static88.aBoolean138 && local226.method3656()) {
								@Pc(528) Class1_Sub2_Sub10 local528 = Static215.anInt4738 == -1 ? null : Static16.method3757(Static215.anInt4738);
								if ((Static8.anInt152 & 0x10) != 0 && (local528 == null || local235.method2736(Static215.anInt4738, local528.anInt3511) != local528.anInt3511)) {
									Static199.method3319(Static167.anInt3914, (long) local235.anInt3642, local148, Static106.aString183, Static120.aString194 + " -> <col=ff9040>" + local235.aString235, (short) 23, arg0.anInt4686);
								}
							} else {
								@Pc(255) String[] local255 = local235.aStringArray30;
								if (Static75.aBoolean125) {
									local255 = Static251.method4073(local255);
								}
								@Pc(269) int local269;
								@Pc(284) byte local284;
								if (local226.method3656()) {
									for (local269 = 4; local269 >= 3; local269--) {
										if (local255 != null && local255[local269] != null) {
											if (local269 == 3) {
												local284 = 35;
											} else {
												local284 = 41;
											}
											Static199.method3319(-1, (long) local235.anInt3642, local148, local255[local269], "<col=ff9040>" + local235.aString235, local284, arg0.anInt4686);
										}
									}
								}
								if (local226.method3652()) {
									Static199.method3319(Static255.anInt5424, (long) local235.anInt3642, local148, Static197.aString146, "<col=ff9040>" + local235.aString235, (short) 58, arg0.anInt4686);
								}
								if (local226.method3656() && local255 != null) {
									for (local269 = 2; local269 >= 0; local269--) {
										if (local255[local269] != null) {
											local284 = 0;
											if (local269 == 0) {
												local284 = 47;
											}
											if (local269 == 1) {
												local284 = 25;
											}
											if (local269 == 2) {
												local284 = 17;
											}
											Static199.method3319(-1, (long) local235.anInt3642, local148, local255[local269], "<col=ff9040>" + local235.aString235, local284, arg0.anInt4686);
										}
									}
								}
								local255 = arg0.aStringArray35;
								if (Static75.aBoolean125) {
									local255 = Static251.method4073(local255);
								}
								if (local255 != null) {
									for (local269 = 4; local269 >= 0; local269--) {
										if (local255[local269] != null) {
											local284 = 0;
											if (local269 == 0) {
												local284 = 36;
											}
											if (local269 == 1) {
												local284 = 1;
											}
											if (local269 == 2) {
												local284 = 3;
											}
											if (local269 == 3) {
												local284 = 46;
											}
											if (local269 == 4) {
												local284 = 31;
											}
											Static199.method3319(-1, (long) local235.anInt3642, local148, local255[local269], "<col=ff9040>" + local235.aString235, local284, arg0.anInt4686);
										}
									}
								}
								Static199.method3319(Static202.anInt4460, (long) local235.anInt3642, local148, Static208.aString319, "<col=ff9040>" + local235.aString235, (short) 1003, arg0.anInt4686);
							}
						}
					}
					local148++;
				}
			}
		}
		if (!arg0.aBoolean228) {
			return;
		}
		if (!Static88.aBoolean138) {
			@Pc(652) String local652;
			for (local148 = 9; local148 >= 5; local148--) {
				local652 = Static121.method2373(local148, arg0);
				if (local652 != null) {
					Static199.method3319(Static56.method1074(arg0, local148), (long) (local148 + 1), arg0.anInt4662, local652, arg0.aString331, (short) 1006, arg0.anInt4686);
				}
			}
			local652 = Static19.method365(arg0);
			if (local652 != null) {
				Static199.method3319(-1, 0L, arg0.anInt4662, local652, arg0.aString331, (short) 50, arg0.anInt4686);
			}
			for (local154 = 4; local154 >= 0; local154--) {
				@Pc(713) String local713 = Static121.method2373(local154, arg0);
				if (local713 != null) {
					Static199.method3319(Static56.method1074(arg0, local154), (long) (local154 + 1), arg0.anInt4662, local713, arg0.aString331, (short) 40, arg0.anInt4686);
				}
			}
			if (Static39.method702(arg0).method3650()) {
				if (arg0.aString335 == null) {
					Static199.method3319(-1, 0L, arg0.anInt4662, Static129.aString209, "", (short) 26, arg0.anInt4686);
				} else {
					Static199.method3319(-1, 0L, arg0.anInt4662, arg0.aString335, "", (short) 26, arg0.anInt4686);
				}
			}
		} else if (Static39.method702(arg0).method3660() && (Static8.anInt152 & 0x20) != 0) {
			Static199.method3319(Static167.anInt3914, 0L, arg0.anInt4662, Static106.aString183, Static120.aString194 + " -> " + arg0.aString331, (short) 22, arg0.anInt4686);
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(BI)Z")
	public static boolean method1298(@OriginalArg(1) int arg0) {
		@Pc(7) Class115_Sub1 local7 = Static87.method1847(arg0);
		if (local7 == null) {
			return false;
		} else if (Static40.anInt1103 == 1 || Static40.anInt1103 == 2 || Static25.anInt848 == 2) {
			Static136.anInt3373 = local7.anInt4598;
			Static70.aString115 = local7.aString323;
			if (Static25.anInt848 != 0) {
				Static8.anInt151 = Static136.anInt3373 + 40000;
				Static45.anInt1360 = Static8.anInt151;
				Static79.anInt2161 = Static136.anInt3373 + 50000;
			}
			return true;
		} else {
			@Pc(45) String local45 = "";
			@Pc(47) String local47 = "";
			if (Static25.anInt848 != 0) {
				local45 = ":" + (local7.anInt4598 + 7000);
			}
			if (Static135.aString214 != null) {
				local47 = "/p=" + Static135.aString214;
			}
			@Pc(123) String local123 = "http://" + local7.aString323 + local45 + "/l=" + Static135.anInt3311 + "/a=" + Static145.anInt3517 + local47 + "/j" + (Static250.aBoolean272 ? "1" : "0") + ",o" + (Static28.aBoolean47 ? "1" : "0") + ",a2,m" + (Static121.aBoolean169 ? "1" : "0");
			try {
				Static35.aClient1.getAppletContext().showDocument(new URL(local123), "_self");
				return true;
			} catch (@Pc(133) Exception local133) {
				return false;
			}
		}
	}
}
