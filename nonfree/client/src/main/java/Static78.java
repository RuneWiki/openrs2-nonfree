import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!n", name = "c", descriptor = "Lclient!ie;")
	public static Class35 aClass35_21;

	@OriginalMember(owner = "client!n", name = "f", descriptor = "[Lclient!ae;")
	public static Class1_Sub1_Sub2_Sub1[] aClass1_Sub1_Sub2_Sub1Array7;

	@OriginalMember(owner = "client!n", name = "h", descriptor = "I")
	public static int anInt2088;

	@OriginalMember(owner = "client!n", name = "n", descriptor = "[I")
	public static int[] anIntArray244;

	@OriginalMember(owner = "client!n", name = "o", descriptor = "I")
	public static int anInt2092;

	@OriginalMember(owner = "client!n", name = "H", descriptor = "[I")
	public static int[] anIntArray247;

	@OriginalMember(owner = "client!n", name = "O", descriptor = "Lclient!id;")
	private static Class34 aClass34_1037 = Static9.method266("Invalid username or password)3");

	@OriginalMember(owner = "client!n", name = "g", descriptor = "Lclient!id;")
	public static Class34 aClass34_1029 = aClass34_1037;

	@OriginalMember(owner = "client!n", name = "l", descriptor = "Lclient!id;")
	public static Class34 aClass34_1030 = Static9.method266(" zuerst von Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!n", name = "m", descriptor = "Lclient!id;")
	public static Class34 aClass34_1031 = Static9.method266("leuchten1:");

	@OriginalMember(owner = "client!n", name = "s", descriptor = "Lclient!id;")
	public static Class34 aClass34_1032 = Static9.method266("Lade Sprites )2 ");

	@OriginalMember(owner = "client!n", name = "A", descriptor = "[I")
	public static int[] anIntArray245 = new int[500];

	@OriginalMember(owner = "client!n", name = "D", descriptor = "[I")
	public static int[] anIntArray246 = new int[1000];

	@OriginalMember(owner = "client!n", name = "F", descriptor = "Lclient!id;")
	public static Class34 aClass34_1033 = Static9.method266("Benutzen");

	@OriginalMember(owner = "client!n", name = "I", descriptor = "Lclient!id;")
	public static Class34 aClass34_1034 = Static9.method266("und die Schaltfl-=che (WSpielkonto erstellen(W am");

	@OriginalMember(owner = "client!n", name = "J", descriptor = "Lclient!id;")
	public static Class34 aClass34_1035 = Static9.method266("T");

	@OriginalMember(owner = "client!n", name = "M", descriptor = "Lclient!id;")
	public static Class34 aClass34_1036 = Static9.method266("<col=ffffff>");

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Lclient!n;ZZ)V")
	public static void method1363(@OriginalArg(0) Class51 arg0, @OriginalArg(1) boolean arg1) {
		if (Static44.aClass51_2 != null) {
			try {
				Static44.aClass51_2.method1361();
			} catch (@Pc(17) Exception local17) {
			}
			Static44.aClass51_2 = null;
		}
		Static44.aClass51_2 = arg0;
		method1365(arg1);
		Static89.aClass1_Sub19_4 = null;
		Static43.aClass1_Sub19_2.anInt3111 = 0;
		Static23.aClass1_Sub1_Sub9_1 = null;
		Static92.anInt2392 = 0;
		while (true) {
			@Pc(38) Class1_Sub1_Sub9 local38 = (Class1_Sub1_Sub9) Static34.aClass48_4.method1337();
			if (local38 == null) {
				while (true) {
					local38 = (Class1_Sub1_Sub9) Static96.aClass48_12.method1337();
					if (local38 == null) {
						if (Static130.aByte5 != 0) {
							try {
								@Pc(93) Class1_Sub19 local93 = new Class1_Sub19(4);
								local93.method2061(4);
								local93.method2061(Static130.aByte5);
								local93.method2054(0);
								Static44.aClass51_2.method1362(local93.aByteArray42, 4);
							} catch (@Pc(118) IOException local118) {
								try {
									Static44.aClass51_2.method1361();
								} catch (@Pc(123) Exception local123) {
								}
								Static44.aClass51_2 = null;
								Static102.anInt2570++;
							}
						}
						Static15.anInt600 = 0;
						Static127.aLong111 = Static35.method634();
						return;
					}
					Static91.aClass80_1.method1983(local38);
					Static29.aClass48_3.method1336(local38.aLong162, local38);
					Static132.anInt3152++;
					Static109.anInt3092--;
				}
			}
			Static37.aClass48_6.method1336(local38.aLong162, local38);
			Static11.anInt487++;
			Static31.anInt926--;
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V")
	public static void method1364() {
		aClass34_1036 = null;
		aClass34_1030 = null;
		aClass34_1034 = null;
		aClass34_1032 = null;
		aClass1_Sub1_Sub2_Sub1Array7 = null;
		anIntArray245 = null;
		aClass34_1033 = null;
		aClass34_1037 = null;
		aClass34_1035 = null;
		aClass34_1031 = null;
		aClass35_21 = null;
		anIntArray244 = null;
		aClass34_1029 = null;
		anIntArray246 = null;
		anIntArray247 = null;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(ZB)V")
	public static void method1365(@OriginalArg(0) boolean arg0) {
		if (Static44.aClass51_2 == null) {
			return;
		}
		try {
			@Pc(11) Class1_Sub19 local11 = new Class1_Sub19(4);
			local11.method2061(arg0 ? 2 : 3);
			local11.method2082(0);
			Static44.aClass51_2.method1362(local11.aByteArray42, 4);
		} catch (@Pc(37) IOException local37) {
			try {
				Static44.aClass51_2.method1361();
			} catch (@Pc(42) Exception local42) {
			}
			Static102.anInt2570++;
			Static44.aClass51_2 = null;
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(BLclient!fd;)Lclient!fd;")
	public static Class1_Sub9 method1368(@OriginalArg(1) Class1_Sub9 arg0) {
		@Pc(11) int local11 = Static29.method556(Static84.method1448(arg0));
		if (local11 == 0) {
			return null;
		}
		for (@Pc(25) int local25 = 0; local25 < local11; local25++) {
			arg0 = Static113.method1814(arg0.anInt1062);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(ILclient!fd;II)V")
	public static void method1369(@OriginalArg(1) Class1_Sub9 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0.anInt1049 == 1) {
			Static73.method1286(0, 28, Static81.aClass34_1058, 0, arg0.anInt1050, arg0.aClass34_490);
		}
		if (arg0.anInt1049 == 2 && !Static1.aBoolean14) {
			@Pc(35) Class34 local35 = Static19.method394(arg0);
			if (local35 != null) {
				Static73.method1286(0, 46, Static91.method1554(new Class34[] { Static30.aClass34_449, arg0.aClass34_498 }), -1, arg0.anInt1050, local35);
			}
		}
		if (arg0.anInt1049 == 3) {
			Static73.method1286(0, 50, Static81.aClass34_1058, 0, arg0.anInt1050, Static72.aClass34_926);
		}
		if (arg0.anInt1049 == 4) {
			Static73.method1286(0, 17, Static81.aClass34_1058, 0, arg0.anInt1050, arg0.aClass34_490);
		}
		if (arg0.anInt1049 == 5) {
			Static73.method1286(0, 41, Static81.aClass34_1058, 0, arg0.anInt1050, arg0.aClass34_490);
		}
		if (arg0.anInt1049 == 6 && Static105.aClass1_Sub9_13 == null) {
			Static73.method1286(0, 9, Static81.aClass34_1058, -1, arg0.anInt1050, arg0.aClass34_490);
		}
		@Pc(158) int local158;
		@Pc(152) int local152;
		if (arg0.anInt1013 == 2) {
			local152 = 0;
			for (@Pc(154) int local154 = 0; local154 < arg0.anInt1053; local154++) {
				for (local158 = 0; local158 < arg0.anInt1067; local158++) {
					@Pc(167) int local167 = local158 * (arg0.anInt1070 + 32);
					@Pc(174) int local174 = local154 * (arg0.anInt1079 + 32);
					if (local152 < 20) {
						local174 += arg0.anIntArray101[local152];
						local167 += arg0.anIntArray110[local152];
					}
					if (local167 <= arg1 && arg2 >= local174 && arg1 < local167 + 32 && arg2 < local174 + 32) {
						Static132.anInt3159 = local152;
						Static41.aClass1_Sub9_8 = arg0;
						if (arg0.anIntArray108[local152] > 0) {
							@Pc(227) Class1_Sub1_Sub8 local227 = Static74.method1334(arg0.anIntArray108[local152] - 1);
							if (Static130.anInt1509 == 1 && Static76.method1348(Static84.method1448(arg0))) {
								if (arg0.anInt1050 != Static94.anInt2436 || Static22.anInt779 != local152) {
									Static73.method1286(local227.anInt1999, 34, Static91.method1554(new Class34[] { Static74.aClass34_1001, Static123.aClass34_1503, local227.aClass34_1002 }), local152, arg0.anInt1050, Static72.aClass34_922);
								}
							} else if (!Static1.aBoolean14 || !Static76.method1348(Static84.method1448(arg0))) {
								@Pc(290) Class34[] local290 = local227.aClass34Array17;
								if (Static11.aBoolean25) {
									local290 = Static17.method385(local290);
								}
								@Pc(308) int local308;
								@Pc(321) byte local321;
								if (Static76.method1348(Static84.method1448(arg0))) {
									for (local308 = 4; local308 >= 3; local308--) {
										if (local290 != null && local290[local308] != null) {
											if (local308 == 3) {
												local321 = 23;
											} else {
												local321 = 26;
											}
											Static73.method1286(local227.anInt1999, local321, Static91.method1554(new Class34[] { Static112.aClass34_1353, local227.aClass34_1002 }), local152, arg0.anInt1050, local290[local308]);
										} else if (local308 == 4) {
											Static73.method1286(local227.anInt1999, 26, Static91.method1554(new Class34[] { Static112.aClass34_1353, local227.aClass34_1002 }), local152, arg0.anInt1050, Static105.aClass34_1295);
										}
									}
								}
								if (Static91.method1557(Static84.method1448(arg0))) {
									Static73.method1286(local227.anInt1999, 49, Static91.method1554(new Class34[] { Static112.aClass34_1353, local227.aClass34_1002 }), local152, arg0.anInt1050, Static72.aClass34_922);
								}
								if (Static76.method1348(Static84.method1448(arg0)) && local290 != null) {
									for (local308 = 2; local308 >= 0; local308--) {
										if (local290[local308] != null) {
											local321 = 0;
											if (local308 == 0) {
												local321 = 30;
											}
											if (local308 == 1) {
												local321 = 31;
											}
											if (local308 == 2) {
												local321 = 37;
											}
											Static73.method1286(local227.anInt1999, local321, Static91.method1554(new Class34[] { Static112.aClass34_1353, local227.aClass34_1002 }), local152, arg0.anInt1050, local290[local308]);
										}
									}
								}
								local290 = arg0.aClass34Array7;
								if (Static11.aBoolean25) {
									local290 = Static17.method385(local290);
								}
								if (local290 != null) {
									for (local308 = 4; local308 >= 0; local308--) {
										if (local290[local308] != null) {
											local321 = 0;
											if (local308 == 0) {
												local321 = 5;
											}
											if (local308 == 1) {
												local321 = 38;
											}
											if (local308 == 2) {
												local321 = 20;
											}
											if (local308 == 3) {
												local321 = 47;
											}
											if (local308 == 4) {
												local321 = 2;
											}
											Static73.method1286(local227.anInt1999, local321, Static91.method1554(new Class34[] { Static112.aClass34_1353, local227.aClass34_1002 }), local152, arg0.anInt1050, local290[local308]);
										}
									}
								}
								Static73.method1286(local227.anInt1999, 1001, Static91.method1554(new Class34[] { Static112.aClass34_1353, local227.aClass34_1002 }), local152, arg0.anInt1050, Static128.aClass34_1545);
							} else if ((Static5.anInt362 & 0x10) == 16) {
								Static73.method1286(local227.anInt1999, 48, Static91.method1554(new Class34[] { Static51.aClass34_719, Static123.aClass34_1503, local227.aClass34_1002 }), local152, arg0.anInt1050, Static32.aClass34_700);
							}
						}
					}
					local152++;
				}
			}
		}
		if (!arg0.aBoolean57) {
			return;
		}
		if (!Static1.aBoolean14) {
			@Pc(659) Class34 local659;
			for (local152 = 9; local152 >= 5; local152--) {
				local659 = Static35.method631(local152, arg0);
				if (local659 != null) {
					Static73.method1286(local152 + 1, 1004, arg0.aClass34_497, arg0.anInt1020, arg0.anInt1050, local659);
				}
			}
			local659 = Static19.method394(arg0);
			if (local659 != null) {
				Static73.method1286(0, 46, arg0.aClass34_497, arg0.anInt1020, arg0.anInt1050, local659);
			}
			for (local158 = 4; local158 >= 0; local158--) {
				@Pc(714) Class34 local714 = Static35.method631(local158, arg0);
				if (local714 != null) {
					Static73.method1286(local158 + 1, 43, arg0.aClass34_497, arg0.anInt1020, arg0.anInt1050, local714);
				}
			}
			if (Static55.method954(Static84.method1448(arg0))) {
				Static73.method1286(0, 9, Static81.aClass34_1058, arg0.anInt1020, arg0.anInt1050, Static1.aClass34_100);
				return;
			}
			return;
		}
		if (Static43.method741(Static84.method1448(arg0)) && (Static5.anInt362 & 0x20) == 32) {
			Static73.method1286(0, 57, Static91.method1554(new Class34[] { Static51.aClass34_719, Static72.aClass34_929, arg0.aClass34_497 }), arg0.anInt1020, arg0.anInt1050, Static32.aClass34_700);
			return;
		}
	}

	@OriginalMember(owner = "client!n", name = "c", descriptor = "(I)V")
	public static void method1370() {
		Static21.aBoolean39 = false;
		Static68.aBoolean96 = false;
	}
}
