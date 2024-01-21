import java.awt.Component;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!i", name = "yb", descriptor = "[I")
	public static int[] anIntArray176;

	@OriginalMember(owner = "client!i", name = "Ib", descriptor = "I")
	public static int anInt1349;

	@OriginalMember(owner = "client!i", name = "Rb", descriptor = "I")
	public static int anInt1353;

	@OriginalMember(owner = "client!i", name = "sb", descriptor = "Lclient!ge;")
	public static Class21 aClass21_14 = new Class21(64);

	@OriginalMember(owner = "client!i", name = "Db", descriptor = "Lclient!wb;")
	public static Class65 aClass65_595 = Static24.method441("logo");

	@OriginalMember(owner = "client!i", name = "Fb", descriptor = "Lclient!wb;")
	private static Class65 aClass65_596 = Static24.method441("Members object");

	@OriginalMember(owner = "client!i", name = "Jb", descriptor = "Lclient!wb;")
	public static Class65 aClass65_597 = Static24.method441("@lre@");

	@OriginalMember(owner = "client!i", name = "Kb", descriptor = "I")
	public static int anInt1350 = 0;

	@OriginalMember(owner = "client!i", name = "Lb", descriptor = "Lclient!wb;")
	public static Class65 aClass65_598 = aClass65_596;

	@OriginalMember(owner = "client!i", name = "Ob", descriptor = "Lclient!wb;")
	private static Class65 aClass65_600 = Static24.method441("Password: ");

	@OriginalMember(owner = "client!i", name = "Mb", descriptor = "Lclient!wb;")
	public static Class65 aClass65_599 = aClass65_600;

	@OriginalMember(owner = "client!i", name = "f", descriptor = "(I)V")
	public static void method806() {
		Static20.aClass15_14.method1098();
		Static46.aClass2_Sub1_Sub4_Sub3_11.method1479(0, 0);
		Static27.anIntArray108 = Static10.method243(Static27.anIntArray108);
	}

	@OriginalMember(owner = "client!i", name = "g", descriptor = "(I)V")
	public static void method807() {
		anIntArray176 = null;
		aClass65_599 = null;
		aClass65_598 = null;
		aClass65_595 = null;
		aClass65_596 = null;
		aClass65_597 = null;
		aClass21_14 = null;
		aClass65_600 = null;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(ILclient!sb;Ljava/awt/Component;)Lclient!ta;")
	public static Class2_Sub10_Sub2 method808(@OriginalArg(1) Class53 arg0, @OriginalArg(2) Component arg1) {
		Static7.method152(arg0, arg1);
		@Pc(7) Class2_Sub10_Sub2 local7 = new Class2_Sub10_Sub2();
		Static95.method1173(local7);
		return local7;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(ILclient!je;III)V")
	public static void method809(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub1_Sub1_Sub2_Sub2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1 == arg1 || Static24.anInt719 >= 400) {
			return;
		}
		@Pc(49) Class65 local49;
		if (arg1.anInt1573 == 0) {
			local49 = Static13.method282(new Class65[] { arg1.aClass65_726, Static20.method405(Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anInt1583, arg1.anInt1583), Static101.aClass65_1253, Static78.aClass65_264, Static93.method1617(arg1.anInt1583), Static52.aClass65_720 });
		} else {
			local49 = Static13.method282(new Class65[] { arg1.aClass65_726, Static101.aClass65_1253, Static95.aClass65_906, Static93.method1617(arg1.anInt1573), Static52.aClass65_720 });
		}
		@Pc(99) int local99;
		if (Static80.anInt2291 == 1) {
			Static47.method820(arg3, arg0, Static22.aClass65_311, Static13.method282(new Class65[] { Static99.aClass65_1144, Static27.aClass65_373, local49 }), 15, arg2);
		} else if (Static37.anInt1224 != 1) {
			for (local99 = 4; local99 >= 0; local99--) {
				if (Static1.aClass65Array1[local99] != null) {
					@Pc(111) short local111 = 0;
					if (Static1.aClass65Array1[local99].method1788(Static96.aClass65_1200)) {
						if (arg1.anInt1583 > Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anInt1583) {
							local111 = 2000;
						}
						if (Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anInt1593 != 0 && arg1.anInt1593 != 0) {
							if (Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anInt1593 == arg1.anInt1593) {
								local111 = 2000;
							} else {
								local111 = 0;
							}
						}
					} else if (Static21.aBooleanArray22[local99]) {
						local111 = 2000;
					}
					@Pc(163) int local163 = 0;
					if (local99 == 0) {
						local163 = local111 + 30;
					}
					if (local99 == 1) {
						local163 = local111 + 45;
					}
					if (local99 == 2) {
						local163 = local111 + 12;
					}
					if (local99 == 3) {
						local163 = local111 + 6;
					}
					if (local99 == 4) {
						local163 = local111 + 26;
					}
					Static47.method820(arg3, arg0, Static1.aClass65Array1[local99], Static13.method282(new Class65[] { Static68.aClass65_948, local49 }), local163, arg2);
				}
			}
		} else if ((Static39.anInt1259 & 0x8) == 8) {
			Static47.method820(arg3, arg0, Static80.aClass65_1042, Static13.method282(new Class65[] { Static29.aClass65_387, Static27.aClass65_373, local49 }), 55, arg2);
		}
		for (local99 = 0; local99 < Static24.anInt719; local99++) {
			if (Static3.anIntArray20[local99] == 28) {
				Static89.aClass65Array12[local99] = Static13.method282(new Class65[] { Static22.aClass65_308, Static36.aClass65_517, Static68.aClass65_948, local49 });
				return;
			}
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(ILjava/awt/Component;Lclient!k;)V")
	public static void method810(@OriginalArg(1) Component arg0, @OriginalArg(2) Class33 arg1) {
		if (Static4.aBoolean15) {
			return;
		}
		Static46.aClass2_Sub1_Sub4_Sub3_11 = Static23.method421(Static30.aClass65_453, Static56.aClass65_768, arg1);
		Static46.aClass2_Sub1_Sub4_Sub3_12 = Static23.method421(Static30.aClass65_453, Static46.aClass65_610, arg1);
		Static65.aClass2_Sub1_Sub4_Sub3_16 = Static23.method421(Static30.aClass65_453, Static82.aClass65_1061, arg1);
		Static90.aClass2_Sub1_Sub4_Sub3_13 = Static23.method421(Static30.aClass65_453, Static35.aClass65_511, arg1);
		Static24.aClass2_Sub1_Sub4_Sub3_9 = Static23.method421(Static30.aClass65_453, Static84.aClass65_1087, arg1);
		Static93.aClass2_Sub1_Sub4_Sub3_19 = Static23.method421(Static30.aClass65_453, Static71.aClass65_1001, arg1);
		Static89.aClass15_60 = Static18.method1551(96, arg0, 479);
		Static46.aClass2_Sub1_Sub4_Sub3_12.method1479(0, 0);
		Static67.aClass15_46 = Static18.method1551(156, arg0, 172);
		Static43.method1808();
		Static65.aClass2_Sub1_Sub4_Sub3_16.method1479(0, 0);
		Static20.aClass15_14 = Static18.method1551(261, arg0, 190);
		Static46.aClass2_Sub1_Sub4_Sub3_11.method1479(0, 0);
		Static7.aClass15_9 = Static18.method1551(334, arg0, 512);
		Static43.method1808();
		Static29.aClass15_22 = Static18.method1551(50, arg0, 496);
		Static54.aClass15_39 = Static18.method1551(37, arg0, 269);
		Static81.aClass15_71 = Static18.method1551(45, arg0, 249);
		@Pc(106) Class2_Sub1_Sub4_Sub2 local106 = Static37.method750(arg1, Static30.aClass65_453, Static79.aClass65_1037);
		Static50.aClass15_36 = Static18.method1551(local106.anInt759, arg0, local106.anInt764);
		local106.method488(0, 0);
		@Pc(124) Class2_Sub1_Sub4_Sub2 local124 = Static37.method750(arg1, Static30.aClass65_453, Static34.aClass65_483);
		Static69.aClass15_49 = Static18.method1551(local124.anInt759, arg0, local124.anInt764);
		local124.method488(0, 0);
		@Pc(142) Class2_Sub1_Sub4_Sub2 local142 = Static37.method750(arg1, Static30.aClass65_453, Static60.aClass65_831);
		Static82.aClass15_55 = Static18.method1551(local142.anInt759, arg0, local142.anInt764);
		local142.method488(0, 0);
		@Pc(160) Class2_Sub1_Sub4_Sub2 local160 = Static37.method750(arg1, Static30.aClass65_453, Static81.aClass65_1349);
		Static6.aClass15_7 = Static18.method1551(local160.anInt759, arg0, local160.anInt764);
		local160.method488(0, 0);
		@Pc(178) Class2_Sub1_Sub4_Sub2 local178 = Static37.method750(arg1, Static30.aClass65_453, Static32.aClass65_459);
		Static29.aClass15_21 = Static18.method1551(local178.anInt759, arg0, local178.anInt764);
		local178.method488(0, 0);
		@Pc(196) Class2_Sub1_Sub4_Sub2 local196 = Static37.method750(arg1, Static30.aClass65_453, Static85.aClass65_1108);
		Static52.aClass15_38 = Static18.method1551(local196.anInt759, arg0, local196.anInt764);
		local196.method488(0, 0);
		@Pc(214) Class2_Sub1_Sub4_Sub2 local214 = Static37.method750(arg1, Static30.aClass65_453, Static25.aClass65_352);
		Static93.aClass15_65 = Static18.method1551(local214.anInt759, arg0, local214.anInt764);
		local214.method488(0, 0);
		@Pc(232) Class2_Sub1_Sub4_Sub2 local232 = Static37.method750(arg1, Static30.aClass65_453, Static59.aClass65_824);
		Static65.aClass15_44 = Static18.method1551(local232.anInt759, arg0, local232.anInt764);
		local232.method488(0, 0);
		@Pc(250) Class2_Sub1_Sub4_Sub2 local250 = Static37.method750(arg1, Static30.aClass65_453, Static47.aClass65_613);
		Static15.aClass15_13 = Static18.method1551(local250.anInt759, arg0, local250.anInt764);
		local250.method488(0, 0);
		Static82.aClass2_Sub1_Sub4_Sub3_17 = Static23.method421(Static30.aClass65_453, Static20.aClass65_296, arg1);
		Static16.aClass2_Sub1_Sub4_Sub3_5 = Static23.method421(Static30.aClass65_453, Static33.aClass65_1053, arg1);
		Static100.aClass2_Sub1_Sub4_Sub3_20 = Static23.method421(Static30.aClass65_453, Static51.aClass65_687, arg1);
		Static110.aClass2_Sub1_Sub4_Sub3_23 = Static82.aClass2_Sub1_Sub4_Sub3_17.method1484();
		Static110.aClass2_Sub1_Sub4_Sub3_23.method1481();
		Static19.aClass2_Sub1_Sub4_Sub3_15 = Static16.aClass2_Sub1_Sub4_Sub3_5.method1484();
		Static19.aClass2_Sub1_Sub4_Sub3_15.method1481();
		Static101.aClass2_Sub1_Sub4_Sub3_21 = Static82.aClass2_Sub1_Sub4_Sub3_17.method1484();
		Static101.aClass2_Sub1_Sub4_Sub3_21.method1480();
		Static83.aClass2_Sub1_Sub4_Sub3_18 = Static16.aClass2_Sub1_Sub4_Sub3_5.method1484();
		Static83.aClass2_Sub1_Sub4_Sub3_18.method1480();
		Static78.aClass2_Sub1_Sub4_Sub3_7 = Static100.aClass2_Sub1_Sub4_Sub3_20.method1484();
		Static78.aClass2_Sub1_Sub4_Sub3_7.method1480();
		Static107.aClass2_Sub1_Sub4_Sub3_22 = Static82.aClass2_Sub1_Sub4_Sub3_17.method1484();
		Static107.aClass2_Sub1_Sub4_Sub3_22.method1481();
		Static107.aClass2_Sub1_Sub4_Sub3_22.method1480();
		Static2.aClass2_Sub1_Sub4_Sub3_2 = Static16.aClass2_Sub1_Sub4_Sub3_5.method1484();
		Static2.aClass2_Sub1_Sub4_Sub3_2.method1481();
		Static2.aClass2_Sub1_Sub4_Sub3_2.method1480();
		Static38.aClass2_Sub1_Sub4_Sub3Array4 = Static90.method837(Static47.aClass65_616, Static30.aClass65_453, arg1);
		Static32.anIntArray148 = new int[151];
		Static53.anIntArray262 = new int[33];
		anIntArray176 = new int[151];
		Static96.anIntArray397 = new int[33];
		@Pc(348) int local348;
		@Pc(350) int local350;
		@Pc(352) int local352;
		for (@Pc(344) int local344 = 0; local344 < 33; local344++) {
			local348 = 999;
			local350 = 0;
			for (local352 = 0; local352 < 34; local352++) {
				if (Static65.aClass2_Sub1_Sub4_Sub3_16.aByteArray62[local352 + Static65.aClass2_Sub1_Sub4_Sub3_16.anInt2448 * local344] == 0) {
					if (local348 == 999) {
						local348 = local352;
					}
				} else if (local348 != 999) {
					local350 = local352;
					break;
				}
			}
			Static96.anIntArray397[local344] = local348;
			Static53.anIntArray262[local344] = local350 - local348;
		}
		for (local348 = 5; local348 < 156; local348++) {
			local352 = 0;
			local350 = 999;
			for (@Pc(415) int local415 = 25; local415 < 172; local415++) {
				if (Static65.aClass2_Sub1_Sub4_Sub3_16.aByteArray62[Static65.aClass2_Sub1_Sub4_Sub3_16.anInt2448 * local348 + local415] == 0 && (local415 > 34 || local348 > 34)) {
					if (local350 == 999) {
						local350 = local415;
					}
				} else if (local350 != 999) {
					local352 = local415;
					break;
				}
			}
			Static32.anIntArray148[local348 - 5] = local350 - 25;
			anIntArray176[local348 - 5] = local352 - local350;
		}
		Static4.aBoolean15 = true;
	}

	@OriginalMember(owner = "client!i", name = "h", descriptor = "(I)V")
	public static void method811() {
		try {
			if (Static24.anInt720 == 0) {
				if (Static41.aClass13_3 != null) {
					Static41.aClass13_3.method316();
					Static41.aClass13_3 = null;
				}
				Static24.anInt720 = 1;
				Static18.aClass20_11 = null;
				Static13.aBoolean33 = false;
				Static5.anInt242 = 0;
			}
			if (Static24.anInt720 == 1) {
				if (Static18.aClass20_11 == null) {
					Static18.aClass20_11 = Static97.aClass53_3.method1625(Static45.anInt1368);
				}
				if (Static18.aClass20_11.anInt1156 == 2) {
					throw new IOException();
				}
				if (Static18.aClass20_11.anInt1156 == 1) {
					Static41.aClass13_3 = new Class13((Socket) Static18.aClass20_11.anObject4, Static97.aClass53_3);
					Static24.anInt720 = 2;
					Static18.aClass20_11 = null;
				}
			}
			if (Static24.anInt720 == 2) {
				@Pc(71) long local71 = Static6.aLong16 = Static105.aClass65_1293.method1790();
				Static12.aClass2_Sub8_Sub1_8.anInt2342 = 0;
				Static12.aClass2_Sub8_Sub1_8.method1375(14);
				@Pc(85) int local85 = (int) (local71 >> 16 & 0x1FL);
				Static12.aClass2_Sub8_Sub1_8.method1375(local85);
				Static41.aClass13_3.method313(2, Static12.aClass2_Sub8_Sub1_8.aByteArray59);
				Static59.aClass2_Sub8_Sub1_19.anInt2342 = 0;
				Static24.anInt720 = 3;
			}
			@Pc(108) int local108;
			if (Static24.anInt720 == 3) {
				local108 = Static41.aClass13_3.method321();
				if (local108 != 0) {
					Static36.method748(local108);
					return;
				}
				Static59.aClass2_Sub8_Sub1_19.anInt2342 = 0;
				Static24.anInt720 = 4;
			}
			if (Static24.anInt720 == 4) {
				if (Static59.aClass2_Sub8_Sub1_19.anInt2342 < 8) {
					local108 = Static41.aClass13_3.method323();
					if (local108 > 8 - Static59.aClass2_Sub8_Sub1_19.anInt2342) {
						local108 = 8 - Static59.aClass2_Sub8_Sub1_19.anInt2342;
					}
					if (local108 > 0) {
						Static41.aClass13_3.method317(local108, Static59.aClass2_Sub8_Sub1_19.anInt2342, Static59.aClass2_Sub8_Sub1_19.aByteArray59);
						Static59.aClass2_Sub8_Sub1_19.anInt2342 += local108;
					}
				}
				if (Static59.aClass2_Sub8_Sub1_19.anInt2342 == 8) {
					Static59.aClass2_Sub8_Sub1_19.anInt2342 = 0;
					Static77.aLong66 = Static59.aClass2_Sub8_Sub1_19.method1405();
					Static24.anInt720 = 5;
				}
			}
			if (Static24.anInt720 == 5) {
				@Pc(188) int[] local188 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static77.aLong66 >> 32), (int) Static77.aLong66 };
				Static12.aClass2_Sub8_Sub1_8.anInt2342 = 0;
				Static12.aClass2_Sub8_Sub1_8.method1375(10);
				Static12.aClass2_Sub8_Sub1_8.method1370(local188[0]);
				Static12.aClass2_Sub8_Sub1_8.method1370(local188[1]);
				Static12.aClass2_Sub8_Sub1_8.method1370(local188[2]);
				Static12.aClass2_Sub8_Sub1_8.method1370(local188[3]);
				Static12.aClass2_Sub8_Sub1_8.method1370(Static97.aClass53_3.anInt2654);
				Static12.aClass2_Sub8_Sub1_8.method1389(Static105.aClass65_1293.method1790());
				Static12.aClass2_Sub8_Sub1_8.method1417(Static105.aClass65_1286);
				Static12.aClass2_Sub8_Sub1_8.method1402(Static55.aBigInteger28, Static81.aBigInteger47);
				Static26.aClass2_Sub8_Sub1_31.anInt2342 = 0;
				if (Static35.anInt1181 == 40) {
					Static26.aClass2_Sub8_Sub1_31.method1375(18);
				} else {
					Static26.aClass2_Sub8_Sub1_31.method1375(16);
				}
				Static26.aClass2_Sub8_Sub1_31.method1375(Static12.aClass2_Sub8_Sub1_8.anInt2342 + 53);
				Static26.aClass2_Sub8_Sub1_31.method1370(427);
				Static26.aClass2_Sub8_Sub1_31.method1375(Static4.aBoolean16 ? 1 : 0);
				Static26.aClass2_Sub8_Sub1_31.method1370(Static104.aClass33_Sub1_48.anInt1930);
				Static26.aClass2_Sub8_Sub1_31.method1370(Static69.aClass33_Sub1_35.anInt1930);
				Static26.aClass2_Sub8_Sub1_31.method1370(Static18.aClass33_Sub1_43.anInt1930);
				Static26.aClass2_Sub8_Sub1_31.method1370(Static23.aClass33_Sub1_12.anInt1930);
				Static26.aClass2_Sub8_Sub1_31.method1370(Static25.aClass33_Sub1_13.anInt1930);
				Static26.aClass2_Sub8_Sub1_31.method1370(Static56.aClass33_Sub1_24.anInt1930);
				Static26.aClass2_Sub8_Sub1_31.method1370(Static26.aClass33_Sub1_50.anInt1930);
				Static26.aClass2_Sub8_Sub1_31.method1370(Static67.aClass33_Sub1_33.anInt1930);
				Static26.aClass2_Sub8_Sub1_31.method1370(Static28.aClass33_Sub1_15.anInt1930);
				Static26.aClass2_Sub8_Sub1_31.method1370(Static108.aClass33_Sub1_49.anInt1930);
				Static26.aClass2_Sub8_Sub1_31.method1370(Static19.aClass33_Sub1_31.anInt1930);
				Static26.aClass2_Sub8_Sub1_31.method1370(Static99.aClass33_Sub1_44.anInt1930);
				Static26.aClass2_Sub8_Sub1_31.method1415(Static12.aClass2_Sub8_Sub1_8.anInt2342, Static12.aClass2_Sub8_Sub1_8.aByteArray59);
				Static41.aClass13_3.method313(Static26.aClass2_Sub8_Sub1_31.anInt2342, Static26.aClass2_Sub8_Sub1_31.aByteArray59);
				Static12.aClass2_Sub8_Sub1_8.method1420(local188);
				for (@Pc(392) int local392 = 0; local392 < 4; local392++) {
					local188[local392] += 50;
				}
				Static59.aClass2_Sub8_Sub1_19.method1420(local188);
				Static24.anInt720 = 6;
			}
			if (Static24.anInt720 == 6 && Static41.aClass13_3.method323() > 0) {
				local108 = Static41.aClass13_3.method321();
				if (local108 == 21 && Static35.anInt1181 == 20) {
					Static24.anInt720 = 7;
				} else if (local108 == 2) {
					Static24.anInt720 = 9;
				} else if (local108 == 15 && Static35.anInt1181 == 40) {
					Static61.method1085();
					return;
				} else if (local108 == 23 && Static80.anInt2283 < 1) {
					Static24.anInt720 = 0;
					Static80.anInt2283++;
				} else {
					Static36.method748(local108);
					return;
				}
			}
			if (Static24.anInt720 == 7 && Static41.aClass13_3.method323() > 0) {
				Static96.anInt2689 = (Static41.aClass13_3.method321() + 3) * 60;
				Static24.anInt720 = 8;
			}
			if (Static24.anInt720 == 8) {
				Static5.anInt242 = 0;
				Static27.method499(Static2.aClass65_65, Static37.aClass65_519, Static13.method282(new Class65[] { Static93.method1617(Static96.anInt2689 / 60), Static32.aClass65_458 }));
				if (--Static96.anInt2689 <= 0) {
					Static24.anInt720 = 0;
				}
			} else {
				if (Static24.anInt720 == 9 && Static41.aClass13_3.method323() >= 8) {
					Static20.anInt629 = Static41.aClass13_3.method321();
					Static29.aBoolean56 = Static41.aClass13_3.method321() == 1;
					Static47.anInt1379 = Static41.aClass13_3.method321();
					Static47.anInt1379 <<= 0x8;
					Static47.anInt1379 += Static41.aClass13_3.method321();
					Static23.anInt670 = Static41.aClass13_3.method321();
					Static41.aClass13_3.method317(1, 0, Static59.aClass2_Sub8_Sub1_19.aByteArray59);
					Static59.aClass2_Sub8_Sub1_19.anInt2342 = 0;
					Static8.anInt307 = Static59.aClass2_Sub8_Sub1_19.method1429();
					Static41.aClass13_3.method317(2, 0, Static59.aClass2_Sub8_Sub1_19.aByteArray59);
					Static59.aClass2_Sub8_Sub1_19.anInt2342 = 0;
					Static57.anInt1718 = Static59.aClass2_Sub8_Sub1_19.method1396();
					Static24.anInt720 = 10;
				}
				if (Static24.anInt720 != 10) {
					Static5.anInt242++;
					if (Static5.anInt242 > 2000) {
						if (Static80.anInt2283 < 1) {
							Static24.anInt720 = 0;
							Static80.anInt2283++;
							if (Static56.anInt1695 == Static45.anInt1368) {
								Static45.anInt1368 = Static18.anInt2529;
							} else {
								Static45.anInt1368 = Static56.anInt1695;
							}
						} else {
							Static36.method748(-3);
						}
					}
				} else if (Static41.aClass13_3.method323() >= Static57.anInt1718) {
					Static59.aClass2_Sub8_Sub1_19.anInt2342 = 0;
					Static41.aClass13_3.method317(Static57.anInt1718, 0, Static59.aClass2_Sub8_Sub1_19.aByteArray59);
					Static84.method1448();
					Static84.anInt2408 = -1;
					Static56.method993(false);
					Static8.anInt307 = -1;
				}
			}
		} catch (@Pc(681) IOException local681) {
			if (Static80.anInt2283 < 1) {
				if (Static45.anInt1368 == Static56.anInt1695) {
					Static45.anInt1368 = Static18.anInt2529;
				} else {
					Static45.anInt1368 = Static56.anInt1695;
				}
				Static80.anInt2283++;
				Static24.anInt720 = 0;
			} else {
				Static36.method748(-2);
			}
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(ILclient!mc;Lclient!b;B)V")
	public static void method812(@OriginalArg(0) int arg0, @OriginalArg(1) Class33_Sub1 arg1, @OriginalArg(2) Class5 arg2) {
		@Pc(3) byte[] local3 = null;
		@Pc(5) Class52 local5 = Static62.aClass52_8;
		synchronized (Static62.aClass52_8) {
			for (@Pc(12) Class2_Sub9 local12 = (Class2_Sub9) Static62.aClass52_8.method1587(); local12 != null; local12 = (Class2_Sub9) Static62.aClass52_8.method1588()) {
				if (local12.aLong82 == (long) arg0 && local12.aClass5_1 == arg2 && local12.anInt1142 == 0) {
					local3 = local12.aByteArray36;
					break;
				}
			}
		}
		if (local3 == null) {
			@Pc(72) byte[] local72 = arg2.method130(arg0);
			arg1.method1155(true, local72, arg0, arg2);
		} else {
			arg1.method1155(true, local3, arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(II)Lclient!cb;")
	public static Class2_Sub1_Sub5 method813(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub1_Sub5 local10 = (Class2_Sub1_Sub5) Static104.aClass21_36.method744((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(27) byte[] local27 = Static105.aClass33_43.method1150(arg0, 4);
		local10 = new Class2_Sub1_Sub5();
		if (local27 != null) {
			local10.method281(new Class2_Sub8(local27), arg0);
		}
		local10.method286();
		Static104.aClass21_36.method745((long) arg0, local10);
		return local10;
	}
}
