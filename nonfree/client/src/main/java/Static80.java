import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!ja", name = "w", descriptor = "[Lclient!rf;")
	public static Class70[] aClass70Array13 = new Class70[200];

	@OriginalMember(owner = "client!ja", name = "y", descriptor = "Lclient!rf;")
	private static Class70 aClass70_812 = Static49.method1293("Unexpected loginserver response)3");

	@OriginalMember(owner = "client!ja", name = "z", descriptor = "[I")
	public static int[] anIntArray240 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

	@OriginalMember(owner = "client!ja", name = "B", descriptor = "Z")
	public static boolean aBoolean93 = false;

	@OriginalMember(owner = "client!ja", name = "C", descriptor = "Lclient!rf;")
	public static Class70 aClass70_813 = aClass70_812;

	@OriginalMember(owner = "client!ja", name = "G", descriptor = "Lclient!rf;")
	private static Class70 aClass70_815 = Static49.method1293("as it was used to break our rules)3");

	@OriginalMember(owner = "client!ja", name = "D", descriptor = "Lclient!rf;")
	public static Class70 aClass70_814 = aClass70_815;

	@OriginalMember(owner = "client!ja", name = "F", descriptor = "[I")
	public static int[] anIntArray241 = new int[500];

	@OriginalMember(owner = "client!ja", name = "I", descriptor = "Lclient!rf;")
	public static Class70 aClass70_816 = Static49.method1293("null");

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(BLclient!h;)V")
	public static void method1819(@OriginalArg(1) Applet_Sub1 arg0) {
		if (Static89.aBoolean102) {
			Static36.method918(arg0);
			return;
		}
		if (Static63.anInt1966 == 1 && Static170.anInt4392 >= 715 && Static15.anInt450 >= 453) {
			Static148.aBoolean145 = !Static148.aBoolean145;
			if (Static148.aBoolean145) {
				Static44.method1102();
			} else {
				Static71.method1641(Static158.aClass70_1395, Static124.aClass76_Sub1_12, Static179.aClass70_1562);
			}
		}
		if (Static15.anInt445 == 5) {
			return;
		}
		Static86.anInt2581++;
		if (Static15.anInt445 != 10) {
			return;
		}
		if (Static19.anInt535 != 2 && Static123.anInt3345 == 0) {
			if (Static63.anInt1966 == 1 && Static170.anInt4392 >= 5 && Static170.anInt4392 <= 105 && Static15.anInt450 >= 463 && Static15.anInt450 <= 498) {
				Static30.method783();
				return;
			}
			if (Static181.aClass5_1 != null) {
				Static30.method783();
			}
		}
		@Pc(124) int local124 = Static63.anInt1966;
		@Pc(126) int local126 = Static15.anInt450;
		@Pc(128) int local128 = Static170.anInt4392;
		if (Static34.anInt1109 == 0) {
			if (local124 == 1 && local128 >= 227 && local128 <= 377 && local126 >= 271 && local126 <= 311) {
				Static34.anInt1109 = 3;
				Static114.anInt3122 = 0;
			}
			@Pc(178) boolean local178 = false;
			if (Static35.anInt2016 != 0) {
				while (Static154.method3106()) {
					if (Static38.anInt1337 == 84) {
						local178 = true;
						break;
					}
				}
			}
			if (local178 || local124 == 1 && local128 >= 387 && local128 <= 537 && local126 >= 271 && local126 <= 311) {
				Static179.aClass70_1567 = Static172.aClass70_1526;
				Static179.aClass70_1566 = Static172.aClass70_1520;
				Static114.anInt3122 = 0;
				Static34.anInt1109 = 2;
				Static179.aClass70_1561 = Static161.aClass70_1437;
			}
		} else if (Static34.anInt1109 == 2) {
			@Pc(285) short local285 = 231;
			@Pc(286) int local286 = local285 + 30;
			if (local124 == 1 && local126 >= 246 && local126 < 261) {
				Static114.anInt3122 = 0;
			}
			local286 += 15;
			if (local124 == 1 && local126 >= 261 && local126 < 276) {
				Static114.anInt3122 = 1;
			}
			local286 += 15;
			if (local124 == 1 && local128 >= 227 && local128 <= 377 && local126 >= 301 && local126 <= 341) {
				Static179.aClass70_1563 = Static179.aClass70_1563.method2911().method2898();
				if (Static179.aClass70_1563.method2896() == 0) {
					Static15.method374(Static10.aClass70_122, Static172.aClass70_1514, Static172.aClass70_1495);
				} else if (Static179.aClass70_1564.method2896() == 0) {
					Static15.method374(Static52.aClass70_542, Static172.aClass70_1500, Static172.aClass70_1493);
				} else {
					Static15.method374(Static178.aClass70_1548, Static172.aClass70_1518, Static172.aClass70_1508);
					Static77.method1751(20);
				}
			} else {
				if (local124 == 1 && local128 >= 387 && local128 <= 537 && local126 >= 301 && local126 <= 341) {
					Static34.anInt1109 = 0;
					Static179.aClass70_1564 = Static179.aClass70_1562;
					Static179.aClass70_1563 = Static179.aClass70_1562;
				}
				while (true) {
					while (Static154.method3106()) {
						@Pc(433) boolean local433 = false;
						for (@Pc(435) int local435 = 0; local435 < Static159.aClass70_1397.method2896(); local435++) {
							if (Static53.anInt1721 == Static159.aClass70_1397.method2899(local435)) {
								local433 = true;
								break;
							}
						}
						if (Static114.anInt3122 == 0) {
							if (Static38.anInt1337 == 85 && Static179.aClass70_1563.method2896() > 0) {
								Static179.aClass70_1563 = Static179.aClass70_1563.method2903(Static179.aClass70_1563.method2896() - 1, 0);
							}
							if (Static38.anInt1337 == 84 || Static38.anInt1337 == 80) {
								Static114.anInt3122 = 1;
							}
							if (local433 && Static179.aClass70_1563.method2896() < 12) {
								Static179.aClass70_1563 = Static179.aClass70_1563.method2914(Static53.anInt1721);
							}
						} else if (Static114.anInt3122 == 1) {
							if (Static38.anInt1337 == 85 && Static179.aClass70_1564.method2896() > 0) {
								Static179.aClass70_1564 = Static179.aClass70_1564.method2903(Static179.aClass70_1564.method2896() - 1, 0);
							}
							if (Static38.anInt1337 == 84 || Static38.anInt1337 == 80) {
								Static114.anInt3122 = 0;
							}
							if (Static35.anInt2016 != 0 && Static38.anInt1337 == 84) {
								Static179.aClass70_1563 = Static179.aClass70_1563.method2911().method2898();
								if (Static179.aClass70_1563.method2896() == 0) {
									Static15.method374(Static10.aClass70_122, Static172.aClass70_1514, Static172.aClass70_1495);
									return;
								}
								if (Static179.aClass70_1564.method2896() == 0) {
									Static15.method374(Static52.aClass70_542, Static172.aClass70_1500, Static172.aClass70_1493);
									return;
								}
								Static15.method374(Static178.aClass70_1548, Static172.aClass70_1518, Static172.aClass70_1508);
								Static77.method1751(20);
								return;
							}
							if (local433 && Static179.aClass70_1564.method2896() < 20) {
								Static179.aClass70_1564 = Static179.aClass70_1564.method2914(Static53.anInt1721);
							}
						}
					}
					return;
				}
			}
		} else if (Static34.anInt1109 == 3 && local124 == 1 && local128 >= 307 && local128 <= 457 && local126 >= 301 && local126 <= 341) {
			Static34.anInt1109 = 0;
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Z)V")
	public static void method1820() {
		anIntArray240 = null;
		aClass70_816 = null;
		aClass70_812 = null;
		aClass70_813 = null;
		aClass70_815 = null;
		aClass70_814 = null;
		aClass70Array13 = null;
		anIntArray241 = null;
	}
}
