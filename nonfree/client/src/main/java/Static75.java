import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!oe", name = "m", descriptor = "I")
	public static int anInt2248;

	@OriginalMember(owner = "client!oe", name = "f", descriptor = "I")
	public static int anInt2244 = -1;

	@OriginalMember(owner = "client!oe", name = "g", descriptor = "Lclient!fe;")
	public static Class17 aClass17_82 = new Class17(260);

	@OriginalMember(owner = "client!oe", name = "h", descriptor = "I")
	public static volatile int anInt2245 = 0;

	@OriginalMember(owner = "client!oe", name = "j", descriptor = "Lclient!lc;")
	public static Class31 aClass31_781 = Static56.method1206("Examine @lre@");

	@OriginalMember(owner = "client!oe", name = "k", descriptor = "Z")
	public static boolean aBoolean117 = false;

	@OriginalMember(owner = "client!oe", name = "l", descriptor = "I")
	public static int anInt2247 = 0;

	@OriginalMember(owner = "client!oe", name = "n", descriptor = "Lclient!lc;")
	public static Class31 aClass31_782 = Static56.method1206("Please subscribe)1 or use a different world)3");

	@OriginalMember(owner = "client!oe", name = "o", descriptor = "Lclient!lc;")
	public static Class31 aClass31_783 = Static56.method1206(" @gre@");

	@OriginalMember(owner = "client!oe", name = "p", descriptor = "Lclient!lc;")
	public static Class31 aClass31_784 = Static56.method1206("Malformed login packet)3");

	@OriginalMember(owner = "client!oe", name = "q", descriptor = "Lclient!lc;")
	public static Class31 aClass31_785 = Static56.method1206("Create a free account");

	@OriginalMember(owner = "client!oe", name = "r", descriptor = "I")
	public static int anInt2249 = 78;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IB)V")
	public static void method1404(@OriginalArg(0) int arg0) {
		if (arg0 == Static103.anInt2775) {
			return;
		}
		if (Static103.anInt2775 == 0) {
			Static40.method1272();
		}
		if (arg0 == 20 || arg0 == 40) {
			Static15.anInt654 = 0;
			Static92.anInt1562 = 0;
			Static54.anInt1806 = 0;
		}
		if (arg0 != 20 && arg0 != 40 && Static86.aClass35_3 != null) {
			Static86.aClass35_3.method1349();
		}
		if (Static103.anInt2775 == 25 || Static103.anInt2775 == 40) {
			Static63.method1319();
			Static81.method1647();
		}
		if (Static103.anInt2775 == 25) {
			Static92.anInt1558 = 1;
			Static65.anInt2169 = 0;
			Static51.anInt1779 = 0;
			Static95.anInt2563 = 0;
			Static45.anInt1597 = 1;
		}
		if (arg0 == 35) {
			Static57.method1693();
			Static27.method778();
			if (Static11.aClass9_6 == null) {
				Static11.aClass9_6 = Static44.method1061(Static70.method1381(), 503, 765);
			}
		}
		if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
			Static11.aClass9_6 = null;
			Static57.method1693();
			Static105.method1743(Static70.method1381(), Static37.aClass11_Sub1_10, Static11.aClass11_Sub1_1);
		}
		if (arg0 == 25 || arg0 == 30 || arg0 == 40) {
			Static11.aClass9_6 = null;
			Static27.method778();
			Static76.method1416(Static70.method1381(), Static11.aClass11_Sub1_1);
		}
		Static49.aBoolean143 = true;
		Static103.anInt2775 = arg0;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(BI)Lclient!ia;")
	public static Class2_Sub1_Sub6 method1405(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub1_Sub6 local10 = (Class2_Sub1_Sub6) Static57.aClass17_96.method786((long) arg0);
		if (local10 != null) {
			return local10;
		}
		local10 = Static57.method1691(Static58.aClass11_11, arg0, Static89.aClass11_20);
		if (local10 != null) {
			Static57.aClass17_96.method783(local10, (long) arg0);
		}
		return local10;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V")
	public static void method1406() {
		@Pc(15) int local15 = Static3.aClass2_Sub6_Sub1_1.method687(8);
		@Pc(24) int local24;
		if (Static21.anInt1007 > local15) {
			for (local24 = local15; local24 < Static21.anInt1007; local24++) {
				Static77.anIntArray318[Static99.anInt2672++] = Static78.anIntArray322[local24];
			}
		}
		if (local15 > Static21.anInt1007) {
			throw new RuntimeException("gppov1");
		}
		Static21.anInt1007 = 0;
		for (local24 = 0; local24 < local15; local24++) {
			@Pc(66) int local66 = Static78.anIntArray322[local24];
			@Pc(70) Class2_Sub1_Sub4_Sub6_Sub1 local70 = Static102.aClass2_Sub1_Sub4_Sub6_Sub1Array3[local66];
			@Pc(75) int local75 = Static3.aClass2_Sub6_Sub1_1.method687(1);
			if (local75 == 0) {
				Static78.anIntArray322[Static21.anInt1007++] = local66;
				local70.anInt2030 = Static49.anInt2694;
			} else {
				@Pc(95) int local95 = Static3.aClass2_Sub6_Sub1_1.method687(2);
				if (local95 == 0) {
					Static78.anIntArray322[Static21.anInt1007++] = local66;
					local70.anInt2030 = Static49.anInt2694;
					Static91.anIntArray352[Static64.anInt624++] = local66;
				} else {
					@Pc(142) int local142;
					@Pc(152) int local152;
					if (local95 == 1) {
						Static78.anIntArray322[Static21.anInt1007++] = local66;
						local70.anInt2030 = Static49.anInt2694;
						local142 = Static3.aClass2_Sub6_Sub1_1.method687(3);
						local70.method1267(false, local142);
						local152 = Static3.aClass2_Sub6_Sub1_1.method687(1);
						if (local152 == 1) {
							Static91.anIntArray352[Static64.anInt624++] = local66;
						}
					} else if (local95 == 2) {
						Static78.anIntArray322[Static21.anInt1007++] = local66;
						local70.anInt2030 = Static49.anInt2694;
						local142 = Static3.aClass2_Sub6_Sub1_1.method687(3);
						local70.method1267(true, local142);
						local152 = Static3.aClass2_Sub6_Sub1_1.method687(3);
						local70.method1267(true, local152);
						@Pc(208) int local208 = Static3.aClass2_Sub6_Sub1_1.method687(1);
						if (local208 == 1) {
							Static91.anIntArray352[Static64.anInt624++] = local66;
						}
					} else if (local95 == 3) {
						Static77.anIntArray318[Static99.anInt2672++] = local66;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIIIII)I")
	public static int method1407(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = arg4 & 0x3;
		if ((arg3 & 0x1) == 1) {
			@Pc(16) int local16 = arg1;
			arg1 = arg2;
			arg2 = local16;
		}
		if (local7 == 0) {
			return arg5;
		} else if (local7 == 1) {
			return 7 + 1 - arg0 - arg1;
		} else if (local7 == 2) {
			return 1 + 7 - arg2 - arg5;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(I)V")
	public static void method1408() {
		aClass31_782 = null;
		aClass31_783 = null;
		aClass31_785 = null;
		aClass17_82 = null;
		aClass31_781 = null;
		aClass31_784 = null;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)Lclient!td;")
	public static Class2_Sub1_Sub14 method1409(@OriginalArg(1) int arg0) {
		@Pc(15) Class2_Sub1_Sub14 local15 = (Class2_Sub1_Sub14) Static96.aClass17_92.method786((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static4.aClass11_5.method338(13, arg0);
		local15 = new Class2_Sub1_Sub14();
		local15.anInt2577 = arg0;
		if (local25 != null) {
			local15.method1602(new Class2_Sub6(local25));
		}
		Static96.aClass17_92.method783(local15, (long) arg0);
		return local15;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IILclient!k;I)V")
	public static void method1410(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub1_Sub4_Sub6_Sub1 arg2) {
		if ((arg0 & 0x80) != 0) {
			arg2.anInt2019 = Static3.aClass2_Sub6_Sub1_1.method632();
			if (arg2.anInt2019 == 65535) {
				arg2.anInt2019 = -1;
			}
		}
		@Pc(32) int local32;
		if ((arg0 & 0x40) != 0) {
			local32 = Static3.aClass2_Sub6_Sub1_1.method671();
			@Pc(35) byte[] local35 = new byte[local32];
			@Pc(40) Class2_Sub6 local40 = new Class2_Sub6(local35);
			Static3.aClass2_Sub6_Sub1_1.method644(local35, local32);
			Static4.aClass2_Sub6Array1[arg1] = local40;
			arg2.method1106(local40);
		}
		if ((arg0 & 0x10) != 0) {
			arg2.aClass31_708 = Static3.aClass2_Sub6_Sub1_1.method670();
			if (arg2.aClass31_708.method1216(0) == 126) {
				arg2.aClass31_708 = arg2.aClass31_708.method1222(1);
				Static74.method1397(arg2.aClass31_708, 2, arg2.aClass31_612);
			} else if (arg2 == Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1) {
				Static74.method1397(arg2.aClass31_708, 2, arg2.aClass31_612);
			}
			arg2.anInt2012 = 0;
			arg2.anInt2004 = 0;
			arg2.anInt1981 = 150;
		}
		@Pc(129) int local129;
		@Pc(149) int local149;
		if ((arg0 & 0x8) != 0) {
			local32 = Static3.aClass2_Sub6_Sub1_1.method632();
			local129 = Static3.aClass2_Sub6_Sub1_1.method671();
			if (local32 == 65535) {
				local32 = -1;
			}
			if (arg2.anInt2014 == local32 && local32 != -1) {
				local149 = Static54.method1158(local32).anInt2088;
				if (local149 == 1) {
					arg2.anInt1987 = 0;
					arg2.anInt1986 = local129;
					arg2.anInt1977 = 0;
					arg2.anInt1980 = 0;
				}
				if (local149 == 2) {
					arg2.anInt1980 = 0;
				}
			} else if (local32 == -1 || arg2.anInt2014 == -1 || Static54.method1158(local32).anInt2101 >= Static54.method1158(arg2.anInt2014).anInt2101) {
				arg2.anInt1986 = local129;
				arg2.anInt1980 = 0;
				arg2.anInt1996 = arg2.anInt2000;
				arg2.anInt1987 = 0;
				arg2.anInt2014 = local32;
				arg2.anInt1977 = 0;
			}
		}
		if ((arg0 & 0x100) != 0) {
			arg2.anInt1998 = Static3.aClass2_Sub6_Sub1_1.method671();
			arg2.anInt2037 = Static3.aClass2_Sub6_Sub1_1.method628();
			arg2.anInt2031 = Static3.aClass2_Sub6_Sub1_1.method671();
			arg2.anInt1999 = Static3.aClass2_Sub6_Sub1_1.method671();
			arg2.anInt2018 = Static3.aClass2_Sub6_Sub1_1.method632() + Static49.anInt2694;
			arg2.anInt2027 = Static3.aClass2_Sub6_Sub1_1.method667() + Static49.anInt2694;
			arg2.anInt1992 = Static3.aClass2_Sub6_Sub1_1.method628();
			arg2.method1271();
		}
		if ((arg0 & 0x400) != 0) {
			arg2.anInt1995 = Static3.aClass2_Sub6_Sub1_1.method667();
			local32 = Static3.aClass2_Sub6_Sub1_1.method629();
			arg2.anInt2033 = local32 >> 16;
			if (arg2.anInt1995 == 65535) {
				arg2.anInt1995 = -1;
			}
			arg2.anInt1978 = 0;
			arg2.anInt1990 = Static49.anInt2694 + (local32 & 0xFFFF);
			arg2.anInt1983 = 0;
			if (arg2.anInt1990 > Static49.anInt2694) {
				arg2.anInt1983 = -1;
			}
		}
		if ((arg0 & 0x1) != 0) {
			local32 = Static3.aClass2_Sub6_Sub1_1.method632();
			local129 = Static3.aClass2_Sub6_Sub1_1.method671();
			local149 = Static3.aClass2_Sub6_Sub1_1.method671();
			@Pc(340) int local340 = Static3.aClass2_Sub6_Sub1_1.anInt952;
			if (arg2.aClass31_612 != null && arg2.aClass4_3 != null) {
				@Pc(351) long local351 = arg2.aClass31_612.method1201();
				@Pc(353) boolean local353 = false;
				if (local129 <= 1) {
					for (@Pc(358) int local358 = 0; local358 < Static88.anInt2367; local358++) {
						if (local351 == Static16.aLongArray2[local358]) {
							local353 = true;
							break;
						}
					}
				}
				if (!local353 && Static68.anInt2207 == 0) {
					Static72.aClass2_Sub6_3.anInt952 = 0;
					Static3.aClass2_Sub6_Sub1_1.method644(Static72.aClass2_Sub6_3.aByteArray11, local149);
					Static72.aClass2_Sub6_3.anInt952 = 0;
					@Pc(404) Class31 local404 = Static25.method755(Static72.aClass2_Sub6_3).method1221();
					arg2.anInt2004 = local32 >> 8;
					arg2.aClass31_708 = local404;
					arg2.anInt1981 = 150;
					arg2.anInt2012 = local32 & 0xFF;
					if (local129 == 2 || local129 == 3) {
						Static74.method1397(local404, 1, Static37.method974(new Class31[] { Static7.aClass31_102, arg2.aClass31_612 }));
					} else if (local129 == 1) {
						Static74.method1397(local404, 1, Static37.method974(new Class31[] { Static38.aClass31_518, arg2.aClass31_612 }));
					} else {
						Static74.method1397(local404, 2, arg2.aClass31_612);
					}
				}
			}
			Static3.aClass2_Sub6_Sub1_1.anInt952 = local149 + local340;
		}
		if ((arg0 & 0x200) != 0) {
			local32 = Static3.aClass2_Sub6_Sub1_1.method665();
			local129 = Static3.aClass2_Sub6_Sub1_1.method665();
			arg2.method1269(Static49.anInt2694, local129, local32);
			arg2.anInt2021 = Static49.anInt2694 + 300;
			arg2.anInt1993 = Static3.aClass2_Sub6_Sub1_1.method628();
			arg2.anInt2002 = Static3.aClass2_Sub6_Sub1_1.method671();
		}
		if ((arg0 & 0x20) != 0) {
			local32 = Static3.aClass2_Sub6_Sub1_1.method656();
			local129 = Static3.aClass2_Sub6_Sub1_1.method665();
			arg2.method1269(Static49.anInt2694, local129, local32);
			arg2.anInt2021 = Static49.anInt2694 + 300;
			arg2.anInt1993 = Static3.aClass2_Sub6_Sub1_1.method628();
			arg2.anInt2002 = Static3.aClass2_Sub6_Sub1_1.method628();
		}
		if ((arg0 & 0x2) != 0) {
			arg2.anInt2038 = Static3.aClass2_Sub6_Sub1_1.method632();
			arg2.anInt1985 = Static3.aClass2_Sub6_Sub1_1.method667();
		}
	}
}
