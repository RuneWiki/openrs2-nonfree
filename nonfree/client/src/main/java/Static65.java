import java.awt.Component;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "Lclient!lc;")
	public static Class40 aClass40_49;

	@OriginalMember(owner = "client!lb", name = "h", descriptor = "[Lclient!ib;")
	public static Class4_Sub4_Sub3_Sub2[] aClass4_Sub4_Sub3_Sub2Array4;

	@OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
	public static int anInt1731;

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "Lclient!qc;")
	public static Class60 aClass60_606 = Static121.method2047(")4lang)4de");

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "Lclient!qc;")
	public static Class60 aClass60_607 = Static121.method2047("null");

	@OriginalMember(owner = "client!lb", name = "m", descriptor = "Lclient!qc;")
	public static Class60 aClass60_608 = Static121.method2047("Lade Eingabe)2Steuerungsprogramm)3)3)3");

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZLjava/awt/Component;)V")
	public static void method1284(@OriginalArg(1) Component arg0) {
		@Pc(5) Method local5 = Static53.aMethod2;
		if (local5 != null) {
			try {
				local5.invoke(arg0, Boolean.FALSE);
			} catch (@Pc(19) Throwable local19) {
			}
		}
		arg0.addKeyListener(Static102.aClass64_1);
		arg0.addFocusListener(Static102.aClass64_1);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)Lclient!qf;")
	public static Class4_Sub4_Sub3_Sub4 method1285() {
		@Pc(8) Class4_Sub4_Sub3_Sub4 local8 = new Class4_Sub4_Sub3_Sub4(Static113.anIntArray299, Static102.anIntArray279, Static76.anIntArray193, Static56.anIntArray146, Static105.aByteArrayArray8);
		Static131.method2144();
		return local8;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)V")
	public static void method1286() {
		try {
			if (Static22.anInt653 == 0) {
				if (Static7.aClass78_6 != null) {
					Static7.aClass78_6.method2085();
					Static7.aClass78_6 = null;
				}
				Static10.aBoolean8 = false;
				Static63.aClass30_7 = null;
				Static22.anInt653 = 1;
				Static24.anInt686 = 0;
			}
			if (Static22.anInt653 == 1) {
				if (Static63.aClass30_7 == null) {
					Static63.aClass30_7 = Static129.aClass35_3.method987(Static99.aString5, Static76.anInt1900);
				}
				if (Static63.aClass30_7.anInt1209 == 2) {
					throw new IOException();
				}
				if (Static63.aClass30_7.anInt1209 == 1) {
					Static7.aClass78_6 = new Class78((Socket) Static63.aClass30_7.anObject3, Static129.aClass35_3);
					Static63.aClass30_7 = null;
					Static22.anInt653 = 2;
				}
			}
			if (Static22.anInt653 == 2) {
				@Pc(73) long local73 = Static62.aLong61 = Static33.aClass60_361.method1665();
				Static56.aClass4_Sub13_Sub1_1.anInt1643 = 0;
				Static56.aClass4_Sub13_Sub1_1.method1209(14);
				@Pc(87) int local87 = (int) (local73 >> 16 & 0x1FL);
				Static56.aClass4_Sub13_Sub1_1.method1209(local87);
				Static7.aClass78_6.method2081(Static56.aClass4_Sub13_Sub1_1.aByteArray68, 2);
				Static105.aClass4_Sub13_Sub1_3.anInt1643 = 0;
				Static22.anInt653 = 3;
			}
			@Pc(120) int local120;
			if (Static22.anInt653 == 3) {
				if (Static110.aClass39_2 != null) {
					Static110.aClass39_2.method1679();
				}
				if (Static46.aClass39_1 != null) {
					Static46.aClass39_1.method1679();
				}
				local120 = Static7.aClass78_6.method2079();
				if (Static110.aClass39_2 != null) {
					Static110.aClass39_2.method1679();
				}
				if (Static46.aClass39_1 != null) {
					Static46.aClass39_1.method1679();
				}
				if (local120 != 0) {
					Static71.method1381(local120);
					return;
				}
				Static22.anInt653 = 4;
				Static105.aClass4_Sub13_Sub1_3.anInt1643 = 0;
			}
			if (Static22.anInt653 == 4) {
				if (Static105.aClass4_Sub13_Sub1_3.anInt1643 < 8) {
					local120 = Static7.aClass78_6.method2076();
					if (8 - Static105.aClass4_Sub13_Sub1_3.anInt1643 < local120) {
						local120 = 8 - Static105.aClass4_Sub13_Sub1_3.anInt1643;
					}
					if (local120 > 0) {
						Static7.aClass78_6.method2077(local120, Static105.aClass4_Sub13_Sub1_3.anInt1643, Static105.aClass4_Sub13_Sub1_3.aByteArray68);
						Static105.aClass4_Sub13_Sub1_3.anInt1643 += local120;
					}
				}
				if (Static105.aClass4_Sub13_Sub1_3.anInt1643 == 8) {
					Static105.aClass4_Sub13_Sub1_3.anInt1643 = 0;
					Static86.aLong19 = Static105.aClass4_Sub13_Sub1_3.method1250();
					Static22.anInt653 = 5;
				}
			}
			if (Static22.anInt653 == 5) {
				Static56.aClass4_Sub13_Sub1_1.anInt1643 = 0;
				@Pc(215) int[] local215 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static86.aLong19 >> 32), (int) Static86.aLong19 };
				Static56.aClass4_Sub13_Sub1_1.method1209(10);
				Static56.aClass4_Sub13_Sub1_1.method1221(local215[0]);
				Static56.aClass4_Sub13_Sub1_1.method1221(local215[1]);
				Static56.aClass4_Sub13_Sub1_1.method1221(local215[2]);
				Static56.aClass4_Sub13_Sub1_1.method1221(local215[3]);
				Static56.aClass4_Sub13_Sub1_1.method1221(Static129.aClass35_3.anInt1350);
				Static56.aClass4_Sub13_Sub1_1.method1242(Static33.aClass60_361.method1665());
				Static56.aClass4_Sub13_Sub1_1.method1225(Static33.aClass60_371);
				Static56.aClass4_Sub13_Sub1_1.method1231(Static83.aBigInteger2, Static75.aBigInteger1);
				Static102.aClass4_Sub13_Sub1_2.anInt1643 = 0;
				if (Static71.anInt1828 == 40) {
					Static102.aClass4_Sub13_Sub1_2.method1209(18);
				} else {
					Static102.aClass4_Sub13_Sub1_2.method1209(16);
				}
				Static102.aClass4_Sub13_Sub1_2.method1209(Static56.aClass4_Sub13_Sub1_1.anInt1643 + 69);
				Static102.aClass4_Sub13_Sub1_2.method1221(462);
				Static102.aClass4_Sub13_Sub1_2.method1209(Static61.aBoolean57 ? 1 : 0);
				Static102.aClass4_Sub13_Sub1_2.method1221(Static120.aClass40_Sub1_15.anInt1501);
				Static102.aClass4_Sub13_Sub1_2.method1221(Static10.aClass40_Sub1_5.anInt1501);
				Static102.aClass4_Sub13_Sub1_2.method1221(Static63.aClass40_Sub1_10.anInt1501);
				Static102.aClass4_Sub13_Sub1_2.method1221(Static119.aClass40_Sub1_19.anInt1501);
				Static102.aClass4_Sub13_Sub1_2.method1221(Static2.aClass40_Sub1_9.anInt1501);
				Static102.aClass4_Sub13_Sub1_2.method1221(Static119.aClass40_Sub1_20.anInt1501);
				Static102.aClass4_Sub13_Sub1_2.method1221(Static5.aClass40_Sub1_3.anInt1501);
				Static102.aClass4_Sub13_Sub1_2.method1221(Static88.aClass40_Sub1_17.anInt1501);
				Static102.aClass4_Sub13_Sub1_2.method1221(Static1.aClass40_Sub1_1.anInt1501);
				Static102.aClass4_Sub13_Sub1_2.method1221(Static120.aClass40_Sub1_16.anInt1501);
				Static102.aClass4_Sub13_Sub1_2.method1221(Static110.aClass40_Sub1_18.anInt1501);
				Static102.aClass4_Sub13_Sub1_2.method1221(Static23.aClass40_Sub1_7.anInt1501);
				Static102.aClass4_Sub13_Sub1_2.method1221(Static72.aClass40_Sub1_11.anInt1501);
				Static102.aClass4_Sub13_Sub1_2.method1221(Static76.aClass40_Sub1_12.anInt1501);
				Static102.aClass4_Sub13_Sub1_2.method1221(Static39.aClass40_Sub1_8.anInt1501);
				Static102.aClass4_Sub13_Sub1_2.method1221(Static122.aClass40_Sub1_22.anInt1501);
				Static102.aClass4_Sub13_Sub1_2.method1240(Static56.aClass4_Sub13_Sub1_1.aByteArray68, Static56.aClass4_Sub13_Sub1_1.anInt1643);
				Static7.aClass78_6.method2081(Static102.aClass4_Sub13_Sub1_2.aByteArray68, Static102.aClass4_Sub13_Sub1_2.anInt1643);
				Static56.aClass4_Sub13_Sub1_1.method1259(local215);
				for (@Pc(451) int local451 = 0; local451 < 4; local451++) {
					local215[local451] += 50;
				}
				Static105.aClass4_Sub13_Sub1_3.method1259(local215);
				Static22.anInt653 = 6;
			}
			if (Static22.anInt653 == 6 && Static7.aClass78_6.method2076() > 0) {
				local120 = Static7.aClass78_6.method2079();
				if (local120 == 21 && Static71.anInt1828 == 20) {
					Static22.anInt653 = 7;
				} else if (local120 == 2) {
					Static22.anInt653 = 9;
				} else if (local120 == 15 && Static71.anInt1828 == 40) {
					Static34.method630();
					return;
				} else if (local120 == 23 && Static121.anInt2882 < 1) {
					Static121.anInt2882++;
					Static22.anInt653 = 0;
				} else {
					Static71.method1381(local120);
					return;
				}
			}
			if (Static22.anInt653 == 7 && Static7.aClass78_6.method2076() > 0) {
				Static13.anInt432 = (Static7.aClass78_6.method2079() + 3) * 60;
				Static22.anInt653 = 8;
			}
			if (Static22.anInt653 == 8) {
				Static24.anInt686 = 0;
				Static37.method637(Static125.method2072(new Class60[] { Static120.method1450(Static13.anInt432 / 60), Static58.aClass60_545 }), Static31.aClass60_340, Static57.aClass60_182);
				if (--Static13.anInt432 <= 0) {
					Static22.anInt653 = 0;
				}
			} else {
				if (Static22.anInt653 == 9 && Static7.aClass78_6.method2076() >= 8) {
					Static24.anInt688 = Static7.aClass78_6.method2079();
					Static123.aBoolean119 = Static7.aClass78_6.method2079() == 1;
					Static18.anInt467 = Static7.aClass78_6.method2079();
					Static18.anInt467 <<= 0x8;
					Static18.anInt467 += Static7.aClass78_6.method2079();
					Static64.anInt1709 = Static7.aClass78_6.method2079();
					Static7.aClass78_6.method2077(1, 0, Static105.aClass4_Sub13_Sub1_3.aByteArray68);
					Static105.aClass4_Sub13_Sub1_3.anInt1643 = 0;
					Static115.anInt2762 = Static105.aClass4_Sub13_Sub1_3.method1262();
					Static7.aClass78_6.method2077(2, 0, Static105.aClass4_Sub13_Sub1_3.aByteArray68);
					Static105.aClass4_Sub13_Sub1_3.anInt1643 = 0;
					Static78.anInt1911 = Static105.aClass4_Sub13_Sub1_3.method1244();
					Static22.anInt653 = 10;
				}
				if (Static22.anInt653 != 10) {
					Static24.anInt686++;
					if (Static24.anInt686 > 2000) {
						if (Static121.anInt2882 < 1) {
							if (Static122.anInt2915 == Static76.anInt1900) {
								Static76.anInt1900 = Static3.anInt17;
							} else {
								Static76.anInt1900 = Static122.anInt2915;
							}
							Static22.anInt653 = 0;
							Static121.anInt2882++;
						} else {
							Static71.method1381(-3);
						}
					}
				} else if (Static7.aClass78_6.method2076() >= Static78.anInt1911) {
					Static105.aClass4_Sub13_Sub1_3.anInt1643 = 0;
					Static7.aClass78_6.method2077(Static78.anInt1911, 0, Static105.aClass4_Sub13_Sub1_3.aByteArray68);
					Static26.method506();
					Static127.anInt2975 = -1;
					Static104.method1822(false);
					Static115.anInt2762 = -1;
				}
			}
		} catch (@Pc(744) IOException local744) {
			if (Static121.anInt2882 < 1) {
				if (Static76.anInt1900 == Static122.anInt2915) {
					Static76.anInt1900 = Static3.anInt17;
				} else {
					Static76.anInt1900 = Static122.anInt2915;
				}
				Static121.anInt2882++;
				Static22.anInt653 = 0;
			} else {
				Static71.method1381(-2);
			}
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILclient!vd;Z)V")
	public static void method1287(@OriginalArg(1) Class78 arg0, @OriginalArg(2) boolean arg1) {
		if (Static71.aClass78_4 != null) {
			try {
				Static71.aClass78_4.method2085();
			} catch (@Pc(12) Exception local12) {
			}
			Static71.aClass78_4 = null;
		}
		Static71.aClass78_4 = arg0;
		Static78.method1422(arg1);
		Static34.aClass4_Sub13_1.anInt1643 = 0;
		Static27.anInt757 = 0;
		Static27.aClass4_Sub4_Sub15_1 = null;
		Static56.aClass4_Sub13_2 = null;
		while (true) {
			@Pc(33) Class4_Sub4_Sub15 local33 = (Class4_Sub4_Sub15) Static32.aClass66_2.method1838();
			if (local33 == null) {
				while (true) {
					local33 = (Class4_Sub4_Sub15) Static34.aClass66_3.method1838();
					if (local33 == null) {
						if (Static5.aByte1 != 0) {
							try {
								@Pc(90) Class4_Sub13 local90 = new Class4_Sub13(4);
								local90.method1209(4);
								local90.method1209(Static5.aByte1);
								local90.method1252(0);
								Static71.aClass78_4.method2081(local90.aByteArray68, 4);
							} catch (@Pc(111) IOException local111) {
								try {
									Static71.aClass78_4.method2085();
								} catch (@Pc(118) Exception local118) {
								}
								Static11.anInt250++;
								Static71.aClass78_4 = null;
							}
						}
						Static93.anInt2272 = 0;
						Static98.aLong85 = Static16.method286();
						return;
					}
					Static126.aClass13_2.method291(local33);
					Static60.aClass66_8.method1830(local33, local33.aLong100);
					Static86.anInt675--;
					Static111.anInt2682++;
				}
			}
			Static105.aClass66_10.method1830(local33, local33.aLong100);
			Static114.anInt2749--;
			Static83.anInt1975++;
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Z)V")
	public static void method1288() {
		aClass60_606 = null;
		aClass60_608 = null;
		aClass4_Sub4_Sub3_Sub2Array4 = null;
		aClass40_49 = null;
		aClass60_607 = null;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIII)V")
	public static void method1289(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static9.method138();
		Static80.method1712(arg2, arg1, Static89.aClass4_Sub4_Sub3_Sub1_5.anInt635 + arg2, Static89.aClass4_Sub4_Sub3_Sub1_5.anInt633 + arg1);
		if (Static26.anInt725 == 2 || Static26.anInt725 == 5) {
			Static80.method1717(arg2 + 25, arg1 + 5, Static113.anIntArray298, Static94.anIntArray230);
		} else {
			@Pc(43) int local43 = Static52.anInt1339 + Static129.anInt3002 & 0x7FF;
			@Pc(51) int local51 = 464 - Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anInt2601 / 32;
			@Pc(58) int local58 = Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anInt2620 / 32 + 48;
			Static131.aClass4_Sub4_Sub3_Sub2_5.method909(arg2 + 25, arg1 + 5, 146, 151, local58, local51, local43, Static17.anInt453 + 256, Static113.anIntArray298, Static94.anIntArray230);
			@Pc(94) int local94;
			@Pc(108) int local108;
			for (@Pc(78) int local78 = 0; local78 < Static47.anInt1234; local78++) {
				local94 = Static122.anIntArray321[local78] * 4 + 2 - Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anInt2620 / 32;
				local108 = Static2.anIntArray144[local78] * 4 + 2 - Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anInt2601 / 32;
				Static85.method1495(Static89.aClass4_Sub4_Sub3_Sub2Array8[local78], arg2, local108, local94, arg1);
			}
			@Pc(166) int local166;
			@Pc(155) int local155;
			for (local94 = 0; local94 < 104; local94++) {
				for (local108 = 0; local108 < 104; local108++) {
					@Pc(141) Class70 local141 = Static74.aClass70ArrayArrayArray1[Static129.anInt3003][local94][local108];
					if (local141 != null) {
						local155 = local108 * 4 + 2 - Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anInt2601 / 32;
						local166 = local94 * 4 + 2 - Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anInt2620 / 32;
						Static85.method1495(Static77.aClass4_Sub4_Sub3_Sub2Array6[0], arg2, local155, local166, arg1);
					}
				}
			}
			@Pc(243) int local243;
			for (local108 = 0; local108 < Static114.anInt2750; local108++) {
				@Pc(195) Class4_Sub4_Sub1_Sub2_Sub1 local195 = Static120.aClass4_Sub4_Sub1_Sub2_Sub1Array2[Static38.anIntArray72[local108]];
				if (local195 != null && local195.method1877()) {
					@Pc(204) Class4_Sub4_Sub11 local204 = local195.aClass4_Sub4_Sub11_1;
					if (local204 != null && local204.anIntArray201 != null) {
						local204 = local204.method1494();
					}
					if (local204 != null && local204.aBoolean83 && local204.aBoolean82) {
						local155 = local195.anInt2620 / 32 - Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anInt2620 / 32;
						local243 = local195.anInt2601 / 32 - Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anInt2601 / 32;
						Static85.method1495(Static77.aClass4_Sub4_Sub3_Sub2Array6[1], arg2, local243, local155, arg1);
					}
				}
			}
			@Pc(266) Class4_Sub4_Sub1_Sub2_Sub2 local266;
			for (@Pc(258) int local258 = 0; local258 < Static43.anInt1107; local258++) {
				local266 = Static59.aClass4_Sub4_Sub1_Sub2_Sub2Array1[Static94.anIntArray231[local258]];
				if (local266 != null && local266.method1877()) {
					@Pc(274) boolean local274 = false;
					local243 = local266.anInt2601 / 32 - Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anInt2601 / 32;
					local155 = local266.anInt2620 / 32 - Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anInt2620 / 32;
					@Pc(300) long local300 = local266.aClass60_1066.method1665();
					for (@Pc(302) int local302 = 0; local302 < Static46.anInt1193; local302++) {
						if (Static122.aLongArray13[local302] == local300 && Static1.anIntArray1[local302] != 0) {
							local274 = true;
							break;
						}
					}
					@Pc(324) boolean local324 = false;
					if (Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anInt2651 != 0 && local266.anInt2651 != 0 && local266.anInt2651 == Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anInt2651) {
						local324 = true;
					}
					if (local274) {
						Static85.method1495(Static77.aClass4_Sub4_Sub3_Sub2Array6[3], arg2, local243, local155, arg1);
					} else if (local324) {
						Static85.method1495(Static77.aClass4_Sub4_Sub3_Sub2Array6[4], arg2, local243, local155, arg1);
					} else {
						Static85.method1495(Static77.aClass4_Sub4_Sub3_Sub2Array6[2], arg2, local243, local155, arg1);
					}
				}
			}
			if (Static63.anInt1695 != 0 && Static81.anInt1944 % 20 < 10) {
				if (Static63.anInt1695 == 1 && Static81.anInt1953 >= 0 && Static81.anInt1953 < Static120.aClass4_Sub4_Sub1_Sub2_Sub1Array2.length) {
					@Pc(407) Class4_Sub4_Sub1_Sub2_Sub1 local407 = Static120.aClass4_Sub4_Sub1_Sub2_Sub1Array2[Static81.anInt1953];
					if (local407 != null) {
						local155 = local407.anInt2620 / 32 - Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anInt2620 / 32;
						local243 = local407.anInt2601 / 32 - Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anInt2601 / 32;
						Static62.method1266(arg1, local155, local243, arg2, Static30.aClass4_Sub4_Sub3_Sub2Array2[1]);
					}
				}
				if (Static63.anInt1695 == 2) {
					local155 = (Static20.anInt578 - Static99.anInt2424) * 4 + 2 - Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anInt2601 / 32;
					local166 = (Static41.anInt1032 - Static106.anInt2518) * 4 + 2 - Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anInt2620 / 32;
					Static62.method1266(arg1, local166, local155, arg2, Static30.aClass4_Sub4_Sub3_Sub2Array2[1]);
				}
				if (Static63.anInt1695 == 10 && Static126.anInt2949 >= 0 && Static59.aClass4_Sub4_Sub1_Sub2_Sub2Array1.length > Static126.anInt2949) {
					local266 = Static59.aClass4_Sub4_Sub1_Sub2_Sub2Array1[Static126.anInt2949];
					if (local266 != null) {
						local155 = local266.anInt2620 / 32 - Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anInt2620 / 32;
						local243 = local266.anInt2601 / 32 - Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anInt2601 / 32;
						Static62.method1266(arg1, local155, local243, arg2, Static30.aClass4_Sub4_Sub3_Sub2Array2[1]);
					}
				}
			}
			if (Static81.anInt1951 != 0) {
				local166 = Static81.anInt1951 * 4 + 2 - Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anInt2620 / 32;
				local155 = Static123.anInt2922 * 4 + 2 - Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anInt2601 / 32;
				Static85.method1495(Static30.aClass4_Sub4_Sub3_Sub2Array2[0], arg2, local155, local166, arg1);
			}
			Static80.method1705(arg2 + 4 + 93, -4 + 82 + arg1, 3, 3, 16777215);
		}
		if (Static26.anInt725 >= 3) {
			Static80.method1717(arg2, arg1, Static4.anIntArray4, Static43.anIntArray92);
		} else {
			Static116.aClass4_Sub4_Sub3_Sub2_4.method909(arg2, arg1, 33, 33, 25, 25, Static52.anInt1339, 256, Static4.anIntArray4, Static43.anIntArray92);
		}
		if (Static41.aBooleanArray6[arg0]) {
			Static89.aClass4_Sub4_Sub3_Sub1_5.method431(arg2, arg1);
		}
		Static74.aBooleanArray9[arg0] = true;
	}
}
