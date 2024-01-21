import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!m", name = "p", descriptor = "Lclient!pa;")
	public static Class51 aClass51_36;

	@OriginalMember(owner = "client!m", name = "j", descriptor = "Lclient!ke;")
	public static Class39 aClass39_702 = Static2.method66("Bitte warten Sie)3)3)3");

	@OriginalMember(owner = "client!m", name = "m", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_7 = new CRC32();

	@OriginalMember(owner = "client!m", name = "r", descriptor = "Lclient!ke;")
	private static Class39 aClass39_704 = Static2.method66("glow3:");

	@OriginalMember(owner = "client!m", name = "o", descriptor = "Lclient!ke;")
	public static Class39 aClass39_703 = aClass39_704;

	@OriginalMember(owner = "client!m", name = "q", descriptor = "[I")
	public static int[] anIntArray214 = new int[1000];

	@OriginalMember(owner = "client!m", name = "s", descriptor = "Lclient!ke;")
	public static Class39 aClass39_705 = Static2.method66("Chat panel redrawn");

	@OriginalMember(owner = "client!m", name = "t", descriptor = "[I")
	public static int[] anIntArray215 = new int[500];

	@OriginalMember(owner = "client!m", name = "u", descriptor = "I")
	public static int anInt1625 = 0;

	@OriginalMember(owner = "client!m", name = "v", descriptor = "I")
	public static int anInt1626 = 0;

	@OriginalMember(owner = "client!m", name = "w", descriptor = "Z")
	public static boolean aBoolean87 = false;

	@OriginalMember(owner = "client!m", name = "y", descriptor = "Lclient!ke;")
	private static Class39 aClass39_707 = Static2.method66("Enter name:");

	@OriginalMember(owner = "client!m", name = "x", descriptor = "Lclient!ke;")
	public static Class39 aClass39_706 = aClass39_707;

	@OriginalMember(owner = "client!m", name = "A", descriptor = "[Z")
	public static boolean[] aBooleanArray10 = new boolean[112];

	@OriginalMember(owner = "client!m", name = "B", descriptor = "Lclient!ke;")
	public static Class39 aClass39_708 = Static2.method66("Titelbild geladen)3");

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(B)V")
	public static void method1125() {
		for (@Pc(11) Class2_Sub10 local11 = (Class2_Sub10) Static12.aClass34_9.method872(); local11 != null; local11 = (Class2_Sub10) Static12.aClass34_9.method879()) {
			if (local11.aClass2_Sub4_Sub1_2 != null) {
				Static10.aClass2_Sub4_Sub2_1.method1662(local11.aClass2_Sub4_Sub1_2);
				local11.aClass2_Sub4_Sub1_2 = null;
			}
			if (local11.aClass2_Sub4_Sub1_1 != null) {
				Static10.aClass2_Sub4_Sub2_1.method1662(local11.aClass2_Sub4_Sub1_1);
				local11.aClass2_Sub4_Sub1_1 = null;
			}
		}
		Static12.aClass34_9.method871();
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V")
	public static void method1126() {
		aClass39_706 = null;
		aClass39_707 = null;
		aClass39_704 = null;
		anIntArray214 = null;
		aClass39_708 = null;
		aClass39_702 = null;
		aClass39_705 = null;
		aClass51_36 = null;
		anIntArray215 = null;
		aBooleanArray10 = null;
		aClass39_703 = null;
		aCRC32_7 = null;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(BI)V")
	public static void method1127(@OriginalArg(1) int arg0) {
		if (arg0 == Static18.anInt554) {
			return;
		}
		if (Static18.anInt554 == 0) {
			Static66.method1373();
		}
		if (arg0 == 20 || arg0 == 40) {
			Static108.anInt2946 = 0;
			Static86.anInt2305 = 0;
			Static87.anInt2327 = 0;
		}
		if (arg0 != 20 && arg0 != 40 && Static25.aClass10_2 != null) {
			Static25.aClass10_2.method251();
		}
		if (Static18.anInt554 == 25 || Static18.anInt554 == 40) {
			Static38.method814();
			Static91.method2012();
		}
		if (Static18.anInt554 == 25) {
			Static92.anInt2400 = 1;
			Static9.anInt187 = 0;
			Static20.anInt577 = 0;
			Static20.anInt586 = 1;
			Static22.anInt591 = 0;
		}
		if (arg0 == 35) {
			Static101.method1959();
			Static22.method434();
			if (Static17.aClass51_11 == null) {
				Static17.aClass51_11 = Static72.method1484(765, 503, Static7.aCanvas1);
			}
		}
		if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
			Static17.aClass51_11 = null;
			Static101.method1959();
			Static21.method1869(Static21.aClass36_Sub1_21, Static7.aCanvas1, Static86.aClass36_Sub1_18);
		}
		if (arg0 == 25 || arg0 == 30 || arg0 == 40) {
			Static17.aClass51_11 = null;
			Static22.method434();
			Static67.method1411(Static7.aCanvas1, Static21.aClass36_Sub1_21);
		}
		Static5.aBoolean2 = true;
		Static18.anInt554 = arg0;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "([II)V")
	public static synchronized void method1128(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(2) int local2 = arg1 - 7;
		while (local1 < local2) {
			arg0[local1++] = 0;
			arg0[local1++] = 0;
			arg0[local1++] = 0;
			arg0[local1++] = 0;
			arg0[local1++] = 0;
			arg0[local1++] = 0;
			arg0[local1++] = 0;
			arg0[local1++] = 0;
		}
		local2 += 7;
		while (local1 < local2) {
			arg0[local1++] = 0;
		}
		if (Static96.aClass2_Sub4_1 != null) {
			Static96.aClass2_Sub4_1.method1656(arg0, 0, local2);
		}
		Static22.method441(local2);
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(B)V")
	public static void method1129() {
		while (Static99.method1905()) {
			if (Static78.anInt2159 != -1 && Static46.anInt1247 == Static78.anInt2159) {
				if (Static107.anInt2655 == 85 && Static86.aClass39_1050.method1088() > 0) {
					Static86.aClass39_1050 = Static86.aClass39_1050.method1115(0, Static86.aClass39_1050.method1088() - 1);
				}
				if ((Static67.method1410(Static57.anInt1639) || Static57.anInt1639 == 32) && Static86.aClass39_1050.method1088() < 12) {
					Static86.aClass39_1050 = Static86.aClass39_1050.method1095(Static57.anInt1639);
				}
			} else {
				@Pc(78) int local78;
				if (Static7.aBoolean5) {
					if (Static107.anInt2655 == 85 && Static86.aClass39_1056.method1088() > 0) {
						Static86.aClass39_1056 = Static86.aClass39_1056.method1115(0, Static86.aClass39_1056.method1088() - 1);
						Static31.aBoolean91 = true;
					}
					if (Static90.method1702(Static57.anInt1639) && Static86.aClass39_1056.method1088() < 80) {
						Static86.aClass39_1056 = Static86.aClass39_1056.method1095(Static57.anInt1639);
						Static31.aBoolean91 = true;
					}
					if (Static107.anInt2655 == 84) {
						Static7.aBoolean5 = false;
						Static31.aBoolean91 = true;
						@Pc(806) long local806;
						if (Static50.anInt1402 == 1) {
							local806 = Static86.aClass39_1056.method1090();
							Static72.method1485(local806);
						}
						if (Static50.anInt1402 == 2 && Static72.anInt2061 > 0) {
							local806 = Static86.aClass39_1056.method1090();
							Static69.method1438(local806);
						}
						if (Static50.anInt1402 == 3 && Static86.aClass39_1056.method1088() > 0) {
							Static50.aClass2_Sub5_Sub1_2.method1302(100);
							Static50.aClass2_Sub5_Sub1_2.method1252(0);
							local78 = Static50.aClass2_Sub5_Sub1_2.anInt1772;
							Static50.aClass2_Sub5_Sub1_2.method1270(Static100.aLong78);
							Static89.method1670(Static86.aClass39_1056, Static50.aClass2_Sub5_Sub1_2);
							Static50.aClass2_Sub5_Sub1_2.method1266(Static50.aClass2_Sub5_Sub1_2.anInt1772 - local78);
							if (Static96.anInt2634 == 2) {
								Static96.anInt2634 = 1;
								Static53.aBoolean80 = true;
								Static50.aClass2_Sub5_Sub1_2.method1302(164);
								Static50.aClass2_Sub5_Sub1_2.method1252(Static6.anInt2870);
								Static50.aClass2_Sub5_Sub1_2.method1252(Static96.anInt2634);
								Static50.aClass2_Sub5_Sub1_2.method1252(Static78.anInt2150);
							}
						}
						if (Static50.anInt1402 == 4 && Static41.anInt1196 < 100) {
							local806 = Static86.aClass39_1056.method1090();
							method1135(local806);
						}
						if (Static50.anInt1402 == 5 && Static41.anInt1196 > 0) {
							local806 = Static86.aClass39_1056.method1090();
							Static63.method1335(local806);
						}
					}
				} else if (Static97.anInt2646 == 1) {
					if (Static107.anInt2655 == 85 && Static86.aClass39_1049.method1088() > 0) {
						Static86.aClass39_1049 = Static86.aClass39_1049.method1115(0, Static86.aClass39_1049.method1088() - 1);
						Static31.aBoolean91 = true;
					}
					if (Static81.method1567(Static57.anInt1639) && Static86.aClass39_1049.method1088() < 10) {
						Static86.aClass39_1049 = Static86.aClass39_1049.method1095(Static57.anInt1639);
						Static31.aBoolean91 = true;
					}
					if (Static107.anInt2655 == 84) {
						if (Static86.aClass39_1049.method1088() > 0) {
							local78 = 0;
							if (Static86.aClass39_1049.method1109()) {
								local78 = Static86.aClass39_1049.method1111();
							}
							Static50.aClass2_Sub5_Sub1_2.method1302(157);
							Static50.aClass2_Sub5_Sub1_2.method1298(local78);
						}
						Static97.anInt2646 = 0;
						Static31.aBoolean91 = true;
					}
				} else if (Static97.anInt2646 == 2) {
					if (Static107.anInt2655 == 85 && Static86.aClass39_1049.method1088() > 0) {
						Static86.aClass39_1049 = Static86.aClass39_1049.method1115(0, Static86.aClass39_1049.method1088() - 1);
						Static31.aBoolean91 = true;
					}
					if ((Static67.method1410(Static57.anInt1639) || Static57.anInt1639 == 32) && Static86.aClass39_1049.method1088() < 12) {
						Static86.aClass39_1049 = Static86.aClass39_1049.method1095(Static57.anInt1639);
						Static31.aBoolean91 = true;
					}
					if (Static107.anInt2655 == 84) {
						if (Static86.aClass39_1049.method1088() > 0) {
							Static50.aClass2_Sub5_Sub1_2.method1302(66);
							Static50.aClass2_Sub5_Sub1_2.method1270(Static86.aClass39_1049.method1090());
						}
						Static31.aBoolean91 = true;
						Static97.anInt2646 = 0;
					}
				} else if (Static97.anInt2646 == 3) {
					if (Static107.anInt2655 == 85 && Static86.aClass39_1049.method1088() > 0) {
						Static86.aClass39_1049 = Static86.aClass39_1049.method1115(0, Static86.aClass39_1049.method1088() - 1);
						Static31.aBoolean91 = true;
					}
					if (Static90.method1702(Static57.anInt1639) && Static86.aClass39_1049.method1088() < 40) {
						Static86.aClass39_1049 = Static86.aClass39_1049.method1095(Static57.anInt1639);
						Static31.aBoolean91 = true;
					}
				} else if (Static99.anInt2696 == -1 && Static7.anInt161 == -1) {
					if (Static107.anInt2655 == 85 && Static86.aClass39_1053.method1088() > 0) {
						Static86.aClass39_1053 = Static86.aClass39_1053.method1115(0, Static86.aClass39_1053.method1088() - 1);
						Static31.aBoolean91 = true;
					}
					if (Static90.method1702(Static57.anInt1639) && Static86.aClass39_1053.method1088() < 80) {
						Static86.aClass39_1053 = Static86.aClass39_1053.method1095(Static57.anInt1639);
						Static31.aBoolean91 = true;
					}
					if (Static107.anInt2655 == 84 && Static86.aClass39_1053.method1088() > 0) {
						if (Static77.anInt2111 == 2) {
							if (Static86.aClass39_1053.method1124(Static108.aClass39_1315)) {
								Static102.method1975();
							}
							if (Static86.aClass39_1053.method1124(Static102.aClass39_1265)) {
								Static10.aBoolean10 = true;
							}
							if (Static86.aClass39_1053.method1124(Static12.aClass39_166)) {
								Static10.aBoolean10 = false;
							}
							if (Static86.aClass39_1053.method1124(Static41.aClass39_520)) {
								for (local78 = 0; local78 < 4; local78++) {
									for (@Pc(204) int local204 = 1; local204 < 103; local204++) {
										for (@Pc(208) int local208 = 1; local208 < 103; local208++) {
											Static5.aClass47Array1[local78].anIntArrayArray20[local204][local208] = 0;
										}
									}
								}
							}
							if (Static86.aClass39_1053.method1124(Static67.aClass39_865) && Static38.anInt1159 == 2) {
								throw new RuntimeException();
							}
							if (Static86.aClass39_1053.method1124(Static6.aClass39_1307)) {
								Static6.aBoolean134 = true;
							}
						}
						if (Static86.aClass39_1053.method1093(Static71.aClass39_902)) {
							Static50.aClass2_Sub5_Sub1_2.method1302(207);
							Static50.aClass2_Sub5_Sub1_2.method1252(Static86.aClass39_1053.method1088() - 1);
							Static50.aClass2_Sub5_Sub1_2.method1297(Static86.aClass39_1053.method1099(2));
						} else {
							@Pc(292) Class39 local292 = Static86.aClass39_1053.method1107();
							@Pc(294) byte local294 = 0;
							if (local292.method1093(Static56.aClass39_697)) {
								local294 = 0;
								Static86.aClass39_1053 = Static86.aClass39_1053.method1099(Static56.aClass39_697.method1088());
							} else if (local292.method1093(Static93.aClass39_1118)) {
								Static86.aClass39_1053 = Static86.aClass39_1053.method1099(Static93.aClass39_1118.method1088());
								local294 = 1;
							} else if (local292.method1093(Static28.aClass39_379)) {
								local294 = 2;
								Static86.aClass39_1053 = Static86.aClass39_1053.method1099(Static28.aClass39_379.method1088());
							} else if (local292.method1093(Static78.aClass39_968)) {
								Static86.aClass39_1053 = Static86.aClass39_1053.method1099(Static78.aClass39_968.method1088());
								local294 = 3;
							} else if (local292.method1093(Static63.aClass39_811)) {
								local294 = 4;
								Static86.aClass39_1053 = Static86.aClass39_1053.method1099(Static63.aClass39_811.method1088());
							} else if (local292.method1093(Static26.aClass39_371)) {
								Static86.aClass39_1053 = Static86.aClass39_1053.method1099(Static26.aClass39_371.method1088());
								local294 = 5;
							} else if (local292.method1093(Static107.aClass39_1202)) {
								Static86.aClass39_1053 = Static86.aClass39_1053.method1099(Static107.aClass39_1202.method1088());
								local294 = 6;
							} else if (local292.method1093(Static84.aClass39_1301)) {
								local294 = 7;
								Static86.aClass39_1053 = Static86.aClass39_1053.method1099(Static84.aClass39_1301.method1088());
							} else if (local292.method1093(Static47.aClass39_596)) {
								local294 = 8;
								Static86.aClass39_1053 = Static86.aClass39_1053.method1099(Static47.aClass39_596.method1088());
							} else if (local292.method1093(Static37.aClass39_479)) {
								Static86.aClass39_1053 = Static86.aClass39_1053.method1099(Static37.aClass39_479.method1088());
								local294 = 9;
							} else if (local292.method1093(Static73.aClass39_921)) {
								Static86.aClass39_1053 = Static86.aClass39_1053.method1099(Static73.aClass39_921.method1088());
								local294 = 10;
							} else if (local292.method1093(aClass39_703)) {
								local294 = 11;
								Static86.aClass39_1053 = Static86.aClass39_1053.method1099(aClass39_703.method1088());
							}
							local292 = Static86.aClass39_1053.method1107();
							@Pc(490) byte local490 = 0;
							if (local292.method1093(Static27.aClass39_376)) {
								Static86.aClass39_1053 = Static86.aClass39_1053.method1099(Static27.aClass39_376.method1088());
								local490 = 1;
							} else if (local292.method1093(Static56.aClass39_701)) {
								Static86.aClass39_1053 = Static86.aClass39_1053.method1099(Static56.aClass39_701.method1088());
								local490 = 2;
							} else if (local292.method1093(Static47.aClass39_599)) {
								Static86.aClass39_1053 = Static86.aClass39_1053.method1099(Static47.aClass39_599.method1088());
								local490 = 3;
							} else if (local292.method1093(Static58.aClass39_716)) {
								Static86.aClass39_1053 = Static86.aClass39_1053.method1099(Static58.aClass39_716.method1088());
								local490 = 4;
							} else if (local292.method1093(Static62.aClass39_792)) {
								Static86.aClass39_1053 = Static86.aClass39_1053.method1099(Static62.aClass39_792.method1088());
								local490 = 5;
							}
							Static50.aClass2_Sub5_Sub1_2.method1302(211);
							Static50.aClass2_Sub5_Sub1_2.method1252(0);
							@Pc(579) int local579 = Static50.aClass2_Sub5_Sub1_2.anInt1772;
							Static50.aClass2_Sub5_Sub1_2.method1252(local294);
							Static50.aClass2_Sub5_Sub1_2.method1252(local490);
							Static89.method1670(Static86.aClass39_1053, Static50.aClass2_Sub5_Sub1_2);
							Static50.aClass2_Sub5_Sub1_2.method1266(Static50.aClass2_Sub5_Sub1_2.anInt1772 - local579);
							if (Static6.anInt2870 == 2) {
								Static6.anInt2870 = 3;
								Static53.aBoolean80 = true;
								Static50.aClass2_Sub5_Sub1_2.method1302(164);
								Static50.aClass2_Sub5_Sub1_2.method1252(Static6.anInt2870);
								Static50.aClass2_Sub5_Sub1_2.method1252(Static96.anInt2634);
								Static50.aClass2_Sub5_Sub1_2.method1252(Static78.anInt2150);
							}
						}
						Static86.aClass39_1053 = Static86.aClass39_1048;
						Static31.aBoolean91 = true;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(II)V")
	public static synchronized void method1130() {
		if (Static96.aClass2_Sub4_1 != null) {
			Static96.aClass2_Sub4_1.method1655(256);
		}
		Static22.method441(256);
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(II)Lclient!t;")
	public static Class2_Sub1_Sub15 method1131(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub1_Sub15 local10 = (Class2_Sub1_Sub15) Static61.aClass54_18.method1634((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(28) byte[] local28 = Static54.aClass36_36.method1761(1, arg0);
		local10 = new Class2_Sub1_Sub15();
		if (local28 != null) {
			local10.method1751(arg0, new Class2_Sub5(local28));
		}
		local10.method1753();
		Static61.aClass54_18.method1637((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(ZLclient!ub;)V")
	public static synchronized void method1132(@OriginalArg(1) Class2_Sub4 arg0) {
		Static96.aClass2_Sub4_1 = arg0;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IBII)I")
	public static int method1134(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(4) int local4 = 256 - arg0;
		return (arg0 * (arg1 & 0xFF00FF) + local4 * (arg2 & 0xFF00FF) & 0xFF00FF00) + ((arg1 & 0xFF00) * arg0 + (arg2 & 0xFF00) * local4 & 0xFF0000) >> 8;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(BJ)V")
	public static void method1135(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static41.anInt1196 >= 100) {
			Static87.method1642(Static38.aClass39_498, 0, Static86.aClass39_1048);
			return;
		}
		@Pc(27) Class39 local27 = Static24.method488(arg0).method1120();
		for (@Pc(29) int local29 = 0; local29 < Static41.anInt1196; local29++) {
			if (arg0 == Static30.aLongArray3[local29]) {
				Static87.method1642(Static20.method431(new Class39[] { local27, Static99.aClass39_1231 }), 0, Static86.aClass39_1048);
				return;
			}
		}
		for (@Pc(64) int local64 = 0; local64 < Static72.anInt2061; local64++) {
			if (arg0 == Static1.aLongArray1[local64]) {
				Static87.method1642(Static20.method431(new Class39[] { Static1.aClass39_2, local27, Static37.aClass39_470 }), 0, Static86.aClass39_1048);
				return;
			}
		}
		if (!local27.method1124(Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.aClass39_1182)) {
			Static30.aLongArray3[Static41.anInt1196++] = arg0;
			Static97.aBoolean120 = true;
			Static50.aClass2_Sub5_Sub1_2.method1302(29);
			Static50.aClass2_Sub5_Sub1_2.method1270(arg0);
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Z)V")
	public static void method1137() {
		if (Static101.anInt2753 < 2 && Static16.anInt461 == 0 && Static87.anInt2324 == 0) {
			return;
		}
		@Pc(41) Class39 local41;
		if (Static16.anInt461 == 1 && Static101.anInt2753 < 2) {
			local41 = Static20.method431(new Class39[] { Static76.aClass39_936, Static107.aClass39_1194, Static87.aClass39_1062, Static6.aClass39_1303 });
		} else if (Static87.anInt2324 == 1 && Static101.anInt2753 < 2) {
			local41 = Static20.method431(new Class39[] { Static23.aClass39_304, Static107.aClass39_1194, Static41.aClass39_516, Static6.aClass39_1303 });
		} else {
			local41 = Static26.aClass39Array7[Static101.anInt2753 - 1];
		}
		if (Static101.anInt2753 > 2) {
			local41 = Static20.method431(new Class39[] { local41, Static22.aClass39_292, Static31.method1267(Static101.anInt2753 - 2), Static2.aClass39_39 });
		}
		Static25.aClass2_Sub1_Sub4_Sub1_1.method239(local41, 4, 16777215, Static64.anInt1889 / 1000);
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(III)I")
	public static int method1138(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == -1) {
			return 12345678;
		}
		arg1 = (arg0 & 0x7F) * arg1 / 128;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}
}
