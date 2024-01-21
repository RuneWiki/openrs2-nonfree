import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!id", name = "S", descriptor = "Lclient!je;")
	private static Class40 aClass40_656 = Static69.method1231("Loaded update list");

	@OriginalMember(owner = "client!id", name = "B", descriptor = "Lclient!je;")
	public static Class40 aClass40_650 = aClass40_656;

	@OriginalMember(owner = "client!id", name = "L", descriptor = "Lclient!je;")
	private static Class40 aClass40_655 = Static69.method1231("shake:");

	@OriginalMember(owner = "client!id", name = "D", descriptor = "Lclient!je;")
	public static Class40 aClass40_651 = aClass40_655;

	@OriginalMember(owner = "client!id", name = "F", descriptor = "Lclient!je;")
	public static Class40 aClass40_652 = Static69.method1231("::gc");

	@OriginalMember(owner = "client!id", name = "H", descriptor = "I")
	public static int anInt1311 = 0;

	@OriginalMember(owner = "client!id", name = "I", descriptor = "Lclient!je;")
	public static Class40 aClass40_653 = aClass40_655;

	@OriginalMember(owner = "client!id", name = "K", descriptor = "Lclient!je;")
	public static Class40 aClass40_654 = Static69.method1231("<col=ffb000>");

	@OriginalMember(owner = "client!id", name = "O", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1 = new Class10();

	@OriginalMember(owner = "client!id", name = "Q", descriptor = "I")
	public static int anInt1315 = 0;

	@OriginalMember(owner = "client!id", name = "V", descriptor = "Lclient!ac;")
	public static Class3 aClass3_6 = new Class3();

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IB)I")
	public static int method881(@OriginalArg(0) int arg0) {
		@Pc(12) Class2_Sub1_Sub5 local12 = Static64.method1142(arg0);
		@Pc(15) int local15 = local12.anInt1397;
		@Pc(18) int local18 = local12.anInt1399;
		@Pc(21) int local21 = local12.anInt1393;
		@Pc(28) int local28 = Class1.anIntArray1[local21 - local18];
		return local28 & Static35.anIntArray96[local15] >> local18;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(ILclient!kc;II)V")
	public static void method882(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub13 arg1, @OriginalArg(3) int arg2) {
		if (arg1.anInt1563 == 1) {
			Static46.method830(arg1.anInt1560, 0, Static43.aClass40_568, 0, 46, arg1.aClass40_767);
		}
		if (arg1.anInt1563 == 2 && !Static31.aBoolean53) {
			@Pc(37) Class40 local37 = Static28.method440(arg1);
			if (local37 != null) {
				Static46.method830(arg1.anInt1560, -1, Static40.method722(new Class40[] { Static84.aClass40_1163, arg1.aClass40_775 }), 0, 36, local37);
			}
		}
		if (arg1.anInt1563 == 3) {
			Static46.method830(arg1.anInt1560, 0, Static43.aClass40_568, 0, 13, Static12.aClass40_1635);
		}
		if (arg1.anInt1563 == 4) {
			Static46.method830(arg1.anInt1560, 0, Static43.aClass40_568, 0, 38, arg1.aClass40_767);
		}
		if (arg1.anInt1563 == 5) {
			Static46.method830(arg1.anInt1560, 0, Static43.aClass40_568, 0, 5, arg1.aClass40_767);
		}
		if (arg1.anInt1563 == 6 && Static56.aClass2_Sub13_7 == null) {
			Static46.method830(arg1.anInt1560, -1, Static43.aClass40_568, 0, 11, arg1.aClass40_767);
		}
		@Pc(155) int local155;
		@Pc(161) int local161;
		if (arg1.anInt1583 == 2) {
			local155 = 0;
			for (@Pc(157) int local157 = 0; local157 < arg1.anInt1568; local157++) {
				for (local161 = 0; local161 < arg1.anInt1599; local161++) {
					@Pc(170) int local170 = local157 * (arg1.anInt1602 + 32);
					@Pc(177) int local177 = local161 * (arg1.anInt1547 + 32);
					if (local155 < 20) {
						local177 += arg1.anIntArray153[local155];
						local170 += arg1.anIntArray159[local155];
					}
					if (arg2 >= local177 && arg0 >= local170 && arg2 < local177 + 32 && local170 + 32 > arg0) {
						Static101.aClass2_Sub13_13 = arg1;
						Static101.anInt2475 = local155;
						if (arg1.anIntArray161[local155] > 0) {
							@Pc(240) Class2_Sub1_Sub10 local240 = Static102.method1800(arg1.anIntArray161[local155] - 1);
							if (Static111.anInt2597 == 1 && Static63.method283(Static116.method1945(arg1))) {
								if (Static73.anInt1924 != arg1.anInt1560 || Static112.anInt2612 != local155) {
									Static46.method830(arg1.anInt1560, local155, Static40.method722(new Class40[] { Static2.aClass40_72, Static83.aClass40_1109, local240.aClass40_1161 }), local240.anInt2230, 16, Static70.aClass40_936);
								}
							} else if (!Static31.aBoolean53 || !Static63.method283(Static116.method1945(arg1))) {
								@Pc(342) Class40[] local342 = local240.aClass40Array14;
								if (Static12.aBoolean249) {
									local342 = Static16.method300(local342);
								}
								@Pc(356) int local356;
								@Pc(371) byte local371;
								if (Static63.method283(Static116.method1945(arg1))) {
									for (local356 = 4; local356 >= 3; local356--) {
										if (local342 != null && local342[local356] != null) {
											if (local356 == 3) {
												local371 = 41;
											} else {
												local371 = 18;
											}
											Static46.method830(arg1.anInt1560, local155, Static40.method722(new Class40[] { Static112.aClass40_1411, local240.aClass40_1161 }), local240.anInt2230, local371, local342[local356]);
										} else if (local356 == 4) {
											Static46.method830(arg1.anInt1560, local155, Static40.method722(new Class40[] { Static112.aClass40_1411, local240.aClass40_1161 }), local240.anInt2230, 18, Static80.aClass40_1055);
										}
									}
								}
								if (Static58.method1031(Static116.method1945(arg1))) {
									Static46.method830(arg1.anInt1560, local155, Static40.method722(new Class40[] { Static112.aClass40_1411, local240.aClass40_1161 }), local240.anInt2230, 37, Static70.aClass40_936);
								}
								if (Static63.method283(Static116.method1945(arg1)) && local342 != null) {
									for (local356 = 2; local356 >= 0; local356--) {
										if (local342[local356] != null) {
											local371 = 0;
											if (local356 == 0) {
												local371 = 28;
											}
											if (local356 == 1) {
												local371 = 14;
											}
											if (local356 == 2) {
												local371 = 34;
											}
											Static46.method830(arg1.anInt1560, local155, Static40.method722(new Class40[] { Static112.aClass40_1411, local240.aClass40_1161 }), local240.anInt2230, local371, local342[local356]);
										}
									}
								}
								local342 = arg1.aClass40Array7;
								if (Static12.aBoolean249) {
									local342 = Static16.method300(local342);
								}
								if (local342 != null) {
									for (local356 = 4; local356 >= 0; local356--) {
										if (local342[local356] != null) {
											local371 = 0;
											if (local356 == 0) {
												local371 = 32;
											}
											if (local356 == 1) {
												local371 = 6;
											}
											if (local356 == 2) {
												local371 = 9;
											}
											if (local356 == 3) {
												local371 = 51;
											}
											if (local356 == 4) {
												local371 = 21;
											}
											Static46.method830(arg1.anInt1560, local155, Static40.method722(new Class40[] { Static112.aClass40_1411, local240.aClass40_1161 }), local240.anInt2230, local371, local342[local356]);
										}
									}
								}
								Static46.method830(arg1.anInt1560, local155, Static40.method722(new Class40[] { Static112.aClass40_1411, local240.aClass40_1161 }), local240.anInt2230, 1003, Static111.aClass40_1406);
							} else if ((Static95.anInt2422 & 0x10) == 16) {
								Static46.method830(arg1.anInt1560, local155, Static40.method722(new Class40[] { Static118.aClass40_1491, Static83.aClass40_1109, local240.aClass40_1161 }), local240.anInt2230, 33, Static34.aClass40_471);
							}
						}
					}
					local155++;
				}
			}
		}
		if (!arg1.aBoolean112) {
			return;
		}
		if (Static31.aBoolean53) {
			if (Static11.method207(Static116.method1945(arg1)) && (Static95.anInt2422 & 0x20) == 32) {
				Static46.method830(arg1.anInt1560, arg1.anInt1578, Static40.method722(new Class40[] { Static118.aClass40_1491, Static116.aClass40_1455, arg1.aClass40_777 }), 0, 43, Static34.aClass40_471);
				return;
			}
			return;
		}
		@Pc(717) Class40 local717;
		for (local155 = 9; local155 >= 5; local155--) {
			local717 = Static121.method2037(arg1, local155);
			if (local717 != null) {
				Static46.method830(arg1.anInt1560, arg1.anInt1578, arg1.aClass40_777, local155 + 1, 1004, local717);
			}
		}
		local717 = Static28.method440(arg1);
		if (local717 != null) {
			Static46.method830(arg1.anInt1560, arg1.anInt1578, arg1.aClass40_777, 0, 36, local717);
		}
		for (local161 = 4; local161 >= 0; local161--) {
			@Pc(770) Class40 local770 = Static121.method2037(arg1, local161);
			if (local770 != null) {
				Static46.method830(arg1.anInt1560, arg1.anInt1578, arg1.aClass40_777, local161 + 1, 10, local770);
			}
		}
		if (Static120.method2024(Static116.method1945(arg1))) {
			Static46.method830(arg1.anInt1560, arg1.anInt1578, Static43.aClass40_568, 0, 11, Static39.aClass40_549);
			return;
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(ILclient!kc;)Z")
	public static boolean method883(@OriginalArg(1) Class2_Sub13 arg0) {
		if (Static65.aBoolean130) {
			if (Static116.method1945(arg0) != 0) {
				return false;
			}
			if (arg0.anInt1583 == 0) {
				return false;
			}
		}
		return arg0.aBoolean118;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Ljava/lang/Object;ILclient!q;)V")
	public static void method884(@OriginalArg(0) Object arg0, @OriginalArg(2) Class59 arg1) {
		if (arg1.anEventQueue1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 50 && arg1.anEventQueue1.peekEvent() != null; local11++) {
			Static85.method1582(1L);
		}
		if (arg0 != null) {
			arg1.anEventQueue1.postEvent(new ActionEvent(arg0, 1001, "dummy"));
		}
	}

	@OriginalMember(owner = "client!id", name = "c", descriptor = "(I)V")
	public static void method885() {
		aClass3_6 = null;
		aClass40_653 = null;
		aClass40_650 = null;
		aClass40_655 = null;
		aClass40_652 = null;
		aClass40_654 = null;
		aClass10_1 = null;
		aClass40_656 = null;
		aClass40_651 = null;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(II)Lclient!je;")
	public static Class40 method886(@OriginalArg(0) int arg0) {
		return Static30.method464(arg0, false);
	}

	@OriginalMember(owner = "client!id", name = "d", descriptor = "(I)V")
	public static void method887() {
		if (Static10.anInt2975 > 0) {
			Static102.method1801();
		} else {
			Static21.method402(40);
			Static129.aClass57_4 = Static85.aClass57_2;
			Static85.aClass57_2 = null;
		}
	}
}
