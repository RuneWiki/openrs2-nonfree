import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!rc", name = "ab", descriptor = "Z")
	public static boolean aBoolean124;

	@OriginalMember(owner = "client!rc", name = "qb", descriptor = "Lclient!kb;")
	public static Class44 aClass44_1;

	@OriginalMember(owner = "client!rc", name = "W", descriptor = "Lclient!ja;")
	private static Class39 aClass39_1322 = Static28.method504("level)2");

	@OriginalMember(owner = "client!rc", name = "bb", descriptor = "I")
	public static int anInt2543 = -1;

	@OriginalMember(owner = "client!rc", name = "kb", descriptor = "Z")
	public static boolean aBoolean125 = false;

	@OriginalMember(owner = "client!rc", name = "lb", descriptor = "Lclient!ja;")
	private static Class39 aClass39_1323 = Static28.method504("Unexpected server response");

	@OriginalMember(owner = "client!rc", name = "mb", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1324 = Static28.method504("Bitte wenden Sie sich an den Kundendienst)3");

	@OriginalMember(owner = "client!rc", name = "nb", descriptor = "[[I")
	public static int[][] anIntArrayArray21 = new int[104][104];

	@OriginalMember(owner = "client!rc", name = "rb", descriptor = "I")
	public static int anInt2552 = 0;

	@OriginalMember(owner = "client!rc", name = "vb", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1325 = aClass39_1323;

	@OriginalMember(owner = "client!rc", name = "wb", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1326 = null;

	@OriginalMember(owner = "client!rc", name = "xb", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1327 = aClass39_1322;

	@OriginalMember(owner = "client!rc", name = "yb", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1328 = Static28.method504("Mem:");

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(III)V")
	public static void method1837(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static114.aClass4_Sub16_Sub1_3.method1499(91);
		Static114.aClass4_Sub16_Sub1_3.method1451(arg0);
		Static114.aClass4_Sub16_Sub1_3.method1488(arg1);
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIZZI)Lclient!ic;")
	public static Class4_Sub2_Sub3_Sub1 method1838(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(22) long local22 = (long) arg4 + ((long) arg0 << 16) + ((long) arg2 << 38) + ((long) arg1 << 40);
		@Pc(34) Class4_Sub2_Sub3_Sub1 local34;
		if (!arg3) {
			local34 = (Class4_Sub2_Sub3_Sub1) Static32.aClass12_22.method235(local22);
			if (local34 != null) {
				return local34;
			}
		}
		@Pc(42) Class4_Sub2_Sub5 local42 = Static119.method2166(arg4);
		if (arg0 > 1 && local42.anIntArray63 != null) {
			@Pc(50) int local50 = -1;
			for (@Pc(52) int local52 = 0; local52 < 10; local52++) {
				if (arg0 >= local42.anIntArray62[local52] && local42.anIntArray62[local52] != 0) {
					local50 = local42.anIntArray63[local52];
				}
			}
			if (local50 != -1) {
				local42 = Static119.method2166(local50);
			}
		}
		@Pc(90) Class4_Sub2_Sub1_Sub6 local90 = local42.method416(1);
		if (local90 == null) {
			return null;
		}
		@Pc(96) Class4_Sub2_Sub3_Sub1 local96 = null;
		if (local42.anInt621 != -1) {
			local96 = method1838(10, 0, 1, true, local42.anInt595);
			if (local96 == null) {
				return null;
			}
		}
		@Pc(115) int[] local115 = Static17.anIntArray247;
		@Pc(117) int local117 = Static17.anInt2257;
		@Pc(119) int local119 = Static17.anInt2260;
		@Pc(122) int[] local122 = new int[4];
		Static17.method1679(local122);
		local34 = new Class4_Sub2_Sub3_Sub1(36, 32);
		Static17.method1675(local34.anIntArray141, 36, 32);
		Static17.method1672();
		Static57.method1043();
		Static57.method1033(16, 16);
		Static57.aBoolean83 = false;
		@Pc(145) int local145 = local42.anInt632;
		if (arg3) {
			local145 = (int) ((double) local145 * 1.5D);
		} else if (arg2 == 2) {
			local145 = (int) ((double) local145 * 1.04D);
		}
		@Pc(173) int local173 = Class4_Sub2_Sub3_Sub2.anIntArray155[local42.anInt610] * local145 >> 16;
		@Pc(182) int local182 = Class4_Sub2_Sub3_Sub2.anIntArray152[local42.anInt610] * local145 >> 16;
		local90.method2150();
		local90.method2145(local42.anInt604, local42.anInt612, local42.anInt610, local42.anInt599, local90.anInt3118 / 2 + local182 + local42.anInt630, local173 + local42.anInt630);
		if (arg2 >= 1) {
			local34.method879(1);
		}
		if (arg2 >= 2) {
			local34.method879(16777215);
		}
		if (arg1 != 0) {
			local34.method880(arg1);
		}
		Static17.method1675(local34.anIntArray141, 36, 32);
		if (local42.anInt621 != -1) {
			local96.method876(0, 0);
		}
		if (!arg3 && (local42.anInt606 == 1 || arg0 != 1) && arg0 != -1) {
			Static10.aClass4_Sub2_Sub3_Sub3_1.method1272(Static85.method1522(arg0), 0, 9, 16776960, 1);
		}
		if (!arg3) {
			Static32.aClass12_22.method234(local34, local22);
		}
		Static17.method1675(local115, local117, local119);
		Static17.method1686(local122);
		Static57.method1043();
		Static57.aBoolean83 = true;
		return local34;
	}

	@OriginalMember(owner = "client!rc", name = "e", descriptor = "(I)V")
	public static void method1840() {
		aClass39_1322 = null;
		aClass39_1325 = null;
		aClass39_1324 = null;
		aClass39_1327 = null;
		anIntArrayArray21 = null;
		aClass39_1328 = null;
		aClass39_1326 = null;
		aClass44_1 = null;
		aClass39_1323 = null;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIZII)V")
	public static void method1842(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static17.method1680(arg0, arg3, arg0 + arg1, arg3 + arg2);
		Static57.method1043();
		Static98.anInt1019++;
		Static45.method765(true);
		Static30.method521(true);
		Static45.method765(false);
		Static30.method521(false);
		Static40.method671();
		Static91.method1630();
		@Pc(43) int local43;
		@Pc(50) int local50;
		if (!Static42.aBoolean48) {
			local43 = Static53.anInt1401;
			local50 = Static54.anInt1446 + Static83.anInt2078 & 0x7FF;
			if (Static68.anInt1707 / 256 > local43) {
				local43 = Static68.anInt1707 / 256;
			}
			if (Static131.aBooleanArray19[4] && local43 < Static40.anIntArray107[4] + 128) {
				local43 = Static40.anIntArray107[4] + 128;
			}
			Static67.method1167(local50, local43, Static21.anInt622, local43 * 3 + 600, Static42.anInt1059, Static94.method1708(Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anInt2643, Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anInt2641, Static131.anInt3202) - 50);
		}
		if (Static42.aBoolean48) {
			local43 = Static88.method1611();
		} else {
			local43 = method1844();
		}
		local50 = Static69.anInt1723;
		@Pc(111) int local111 = Static97.anInt2445;
		@Pc(113) int local113 = Static119.anInt3113;
		@Pc(115) int local115 = Static121.anInt3006;
		@Pc(117) int local117 = Static18.anInt423;
		@Pc(161) int local161;
		for (@Pc(119) int local119 = 0; local119 < 5; local119++) {
			if (Static131.aBooleanArray19[local119]) {
				local161 = (int) ((double) -Static103.anIntArray283[local119] + Math.random() * (double) (Static103.anIntArray283[local119] * 2 + 1) + Math.sin((double) Static127.anIntArray360[local119] * ((double) Static23.anIntArray65[local119] / 100.0D)) * (double) Static40.anIntArray107[local119]);
				if (local119 == 3) {
					Static121.anInt3006 = local161 + Static121.anInt3006 & 0x7FF;
				}
				if (local119 == 1) {
					Static97.anInt2445 += local161;
				}
				if (local119 == 2) {
					Static119.anInt3113 += local161;
				}
				if (local119 == 4) {
					Static18.anInt423 += local161;
					if (Static18.anInt423 < 128) {
						Static18.anInt423 = 128;
					}
					if (Static18.anInt423 > 383) {
						Static18.anInt423 = 383;
					}
				}
				if (local119 == 0) {
					Static69.anInt1723 += local161;
				}
			}
		}
		local161 = Static88.anInt2198;
		@Pc(219) int local219 = Static73.anInt1769;
		if (local161 >= arg0 && arg0 + arg1 > local161 && arg3 <= local219 && local219 < arg3 + arg2) {
			Static124.anInt3087 = Static88.anInt2198 - arg0;
			Static124.anInt3088 = Static73.anInt1769 - arg3;
			Static124.aBoolean153 = true;
			Static124.anInt3089 = 0;
		} else {
			Static124.anInt3089 = 0;
			Static124.aBoolean153 = false;
		}
		Static122.method2094();
		Static17.method1682(arg0, arg3, arg1, arg2, 0);
		Static122.method2094();
		Static101.aClass43_1.method1076(Static69.anInt1723, Static97.anInt2445, Static119.anInt3113, Static18.anInt423, Static121.anInt3006, local43);
		Static122.method2094();
		Static101.aClass43_1.method1089();
		Static18.method298(arg2, arg1, arg3, arg0);
		Static28.method507(arg3, arg0);
		((Class10) Static57.anInterface1_1).method224(Static39.anInt952);
		Static123.method2105(arg1, arg0, arg3, arg2);
		Static18.anInt423 = local117;
		Static97.anInt2445 = local111;
		Static119.anInt3113 = local113;
		Static69.anInt1723 = local50;
		Static121.anInt3006 = local115;
		if (Static25.aBoolean155 && Static63.method1130() == 0) {
			Static25.aBoolean155 = false;
		}
		if (Static25.aBoolean155) {
			Static17.method1682(arg0, arg3, arg1, arg2, 0);
			Static103.method1845(Static40.aClass39_574, false);
		}
		if (!Static25.aBoolean155 && !Static101.aBoolean122 && arg0 <= local161 && arg1 + arg0 > local161 && arg3 <= local219 && local219 < arg3 + arg2) {
			Static115.method2011(local219, arg0, local161, arg3);
		}
	}

	@OriginalMember(owner = "client!rc", name = "e", descriptor = "(B)I")
	private static int method1844() {
		@Pc(7) int local7 = 3;
		if (Static18.anInt423 < 310) {
			@Pc(16) int local16 = Static69.anInt1723 >> 7;
			@Pc(21) int local21 = Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anInt2643 >> 7;
			@Pc(25) int local25 = Static119.anInt3113 >> 7;
			if ((Static131.aByteArrayArrayArray7[Static131.anInt3202][local16][local25] & 0x4) != 0) {
				local7 = Static131.anInt3202;
			}
			@Pc(42) int local42 = Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anInt2641 >> 7;
			@Pc(53) int local53;
			if (local16 < local21) {
				local53 = local21 - local16;
			} else {
				local53 = local16 - local21;
			}
			@Pc(68) int local68;
			if (local42 <= local25) {
				local68 = local25 - local42;
			} else {
				local68 = local42 - local25;
			}
			@Pc(90) int local90;
			@Pc(84) int local84;
			if (local68 < local53) {
				local84 = 32768;
				local90 = local68 * 65536 / local53;
				while (local16 != local21) {
					if (local21 > local16) {
						local16++;
					} else if (local16 > local21) {
						local16--;
					}
					local84 += local90;
					if ((Static131.aByteArrayArrayArray7[Static131.anInt3202][local16][local25] & 0x4) != 0) {
						local7 = Static131.anInt3202;
					}
					if (local84 >= 65536) {
						if (local42 > local25) {
							local25++;
						} else if (local25 > local42) {
							local25--;
						}
						local84 -= 65536;
						if ((Static131.aByteArrayArrayArray7[Static131.anInt3202][local16][local25] & 0x4) != 0) {
							local7 = Static131.anInt3202;
						}
					}
				}
			} else {
				local90 = local53 * 65536 / local68;
				local84 = 32768;
				while (local42 != local25) {
					if (local25 < local42) {
						local25++;
					} else if (local42 < local25) {
						local25--;
					}
					local84 += local90;
					if ((Static131.aByteArrayArrayArray7[Static131.anInt3202][local16][local25] & 0x4) != 0) {
						local7 = Static131.anInt3202;
					}
					if (local84 >= 65536) {
						if (local16 < local21) {
							local16++;
						} else if (local21 < local16) {
							local16--;
						}
						if ((Static131.aByteArrayArrayArray7[Static131.anInt3202][local16][local25] & 0x4) != 0) {
							local7 = Static131.anInt3202;
						}
						local84 -= 65536;
					}
				}
			}
		}
		if ((Static131.aByteArrayArrayArray7[Static131.anInt3202][Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anInt2643 >> 7][Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anInt2641 >> 7] & 0x4) != 0) {
			local7 = Static131.anInt3202;
		}
		return local7;
	}
}
