import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!h", name = "b", descriptor = "[I")
	public static int[] anIntArray108;

	@OriginalMember(owner = "client!h", name = "i", descriptor = "[Lclient!kc;")
	public static Class2_Sub13[] aClass2_Sub13Array1;

	@OriginalMember(owner = "client!h", name = "a", descriptor = "Lclient!je;")
	public static Class40 aClass40_561 = Static69.method1231("Weiter");

	@OriginalMember(owner = "client!h", name = "d", descriptor = "Lclient!je;")
	public static Class40 aClass40_562 = Static69.method1231("Zu viele Anmelde)2Versuche von Ihrer Adresse");

	@OriginalMember(owner = "client!h", name = "e", descriptor = "I")
	public static final int anInt1081 = 5063219;

	@OriginalMember(owner = "client!h", name = "h", descriptor = "[I")
	public static int[] anIntArray109 = new int[25];

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIILclient!ee;Lclient!hb;II)V")
	public static void method721(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class20 arg6, @OriginalArg(7) Class30 arg7, @OriginalArg(9) int arg8) {
		@Pc(9) Class2_Sub1_Sub4 local9 = Static107.method1839(arg2);
		@Pc(20) int local20;
		@Pc(23) int local23;
		if (arg3 == 1 || arg3 == 3) {
			local20 = local9.anInt1066;
			local23 = local9.anInt1036;
		} else {
			local20 = local9.anInt1036;
			local23 = local9.anInt1066;
		}
		@Pc(53) int local53;
		@Pc(47) int local47;
		if (arg8 + local20 <= 104) {
			local47 = arg8 + (local20 + 1 >> 1);
			local53 = arg8 + (local20 >> 1);
		} else {
			local47 = arg8 + 1;
			local53 = arg8;
		}
		@Pc(83) int local83;
		@Pc(77) int local77;
		if (arg0 + local23 <= 104) {
			local77 = arg0 + (local23 + 1 >> 1);
			local83 = (local23 >> 1) + arg0;
		} else {
			local77 = arg0 + 1;
			local83 = arg0;
		}
		@Pc(95) int[][] local95 = Static118.anIntArrayArrayArray6[arg4];
		@Pc(122) int local122 = local95[local47][local77] + local95[local47][local83] + local95[local53][local83] + local95[local53][local77] >> 2;
		@Pc(134) int local134 = (arg0 << 7) + arg8 + (arg2 << 14) + 1073741824;
		@Pc(142) int local142 = (local23 << 6) + (arg0 << 7);
		@Pc(148) int local148 = (arg3 << 6) + arg1;
		@Pc(157) int local157 = (arg8 << 7) + (local20 << 6);
		if (local9.anInt1067 == 0) {
			local134 += Integer.MIN_VALUE;
		}
		if (local9.anInt1042 == 1) {
			local148 += 256;
		}
		@Pc(197) Class2_Sub1_Sub1 local197;
		if (arg1 == 22) {
			if (local9.anInt1052 == -1 && local9.anIntArray103 == null) {
				local197 = local9.method702(local122, local142, local157, 22, local95, arg3);
			} else {
				local197 = new Class2_Sub1_Sub1_Sub1(arg2, 22, arg3, arg4, arg8, arg0, local9.anInt1052, true, null);
			}
			arg7.method757(arg5, arg8, arg0, local122, local197, local134, local148);
			if (local9.anInt1048 == 1) {
				arg6.method441(arg0, arg8);
			}
		} else if (arg1 == 10 || arg1 == 11) {
			if (local9.anInt1052 == -1 && local9.anIntArray103 == null) {
				local197 = local9.method702(local122, local142, local157, 10, local95, arg3);
			} else {
				local197 = new Class2_Sub1_Sub1_Sub1(arg2, 10, arg3, arg4, arg8, arg0, local9.anInt1052, true, null);
			}
			if (local197 != null) {
				arg7.method749(arg5, arg8, arg0, local122, local20, local23, local197, arg1 == 11 ? 256 : 0, local134, local148);
			}
			if (local9.anInt1048 != 0) {
				arg6.method435(local23, arg8, local9.aBoolean73, local20, arg0);
			}
		} else if (arg1 >= 12) {
			if (local9.anInt1052 == -1 && local9.anIntArray103 == null) {
				local197 = local9.method702(local122, local142, local157, arg1, local95, arg3);
			} else {
				local197 = new Class2_Sub1_Sub1_Sub1(arg2, arg1, arg3, arg4, arg8, arg0, local9.anInt1052, true, null);
			}
			arg7.method749(arg5, arg8, arg0, local122, 1, 1, local197, 0, local134, local148);
			if (local9.anInt1048 != 0) {
				arg6.method435(local23, arg8, local9.aBoolean73, local20, arg0);
			}
		} else if (arg1 == 0) {
			if (local9.anInt1052 == -1 && local9.anIntArray103 == null) {
				local197 = local9.method702(local122, local142, local157, 0, local95, arg3);
			} else {
				local197 = new Class2_Sub1_Sub1_Sub1(arg2, 0, arg3, arg4, arg8, arg0, local9.anInt1052, true, null);
			}
			arg7.method738(arg5, arg8, arg0, local122, local197, null, Static101.anIntArray282[arg3], 0, local134, local148);
			if (local9.anInt1048 != 0) {
				arg6.method447(arg0, arg3, local9.aBoolean73, arg8, arg1);
			}
		} else if (arg1 == 1) {
			if (local9.anInt1052 == -1 && local9.anIntArray103 == null) {
				local197 = local9.method702(local122, local142, local157, 1, local95, arg3);
			} else {
				local197 = new Class2_Sub1_Sub1_Sub1(arg2, 1, arg3, arg4, arg8, arg0, local9.anInt1052, true, null);
			}
			arg7.method738(arg5, arg8, arg0, local122, local197, null, Static120.anIntArray329[arg3], 0, local134, local148);
			if (local9.anInt1048 != 0) {
				arg6.method447(arg0, arg3, local9.aBoolean73, arg8, arg1);
			}
		} else {
			@Pc(568) Class2_Sub1_Sub1 local568;
			@Pc(530) int local530;
			if (arg1 == 2) {
				local530 = arg3 + 1 & 0x3;
				@Pc(554) Class2_Sub1_Sub1 local554;
				if (local9.anInt1052 == -1 && local9.anIntArray103 == null) {
					local554 = local9.method702(local122, local142, local157, 2, local95, arg3 + 4);
					local568 = local9.method702(local122, local142, local157, 2, local95, local530);
				} else {
					local554 = new Class2_Sub1_Sub1_Sub1(arg2, 2, arg3 + 4, arg4, arg8, arg0, local9.anInt1052, true, null);
					local568 = new Class2_Sub1_Sub1_Sub1(arg2, 2, local530, arg4, arg8, arg0, local9.anInt1052, true, null);
				}
				arg7.method738(arg5, arg8, arg0, local122, local554, local568, Static101.anIntArray282[arg3], Static101.anIntArray282[local530], local134, local148);
				if (local9.anInt1048 != 0) {
					arg6.method447(arg0, arg3, local9.aBoolean73, arg8, arg1);
				}
			} else if (arg1 == 3) {
				if (local9.anInt1052 == -1 && local9.anIntArray103 == null) {
					local197 = local9.method702(local122, local142, local157, 3, local95, arg3);
				} else {
					local197 = new Class2_Sub1_Sub1_Sub1(arg2, 3, arg3, arg4, arg8, arg0, local9.anInt1052, true, null);
				}
				arg7.method738(arg5, arg8, arg0, local122, local197, null, Static120.anIntArray329[arg3], 0, local134, local148);
				if (local9.anInt1048 != 0) {
					arg6.method447(arg0, arg3, local9.aBoolean73, arg8, arg1);
				}
			} else if (arg1 == 9) {
				if (local9.anInt1052 == -1 && local9.anIntArray103 == null) {
					local197 = local9.method702(local122, local142, local157, arg1, local95, arg3);
				} else {
					local197 = new Class2_Sub1_Sub1_Sub1(arg2, arg1, arg3, arg4, arg8, arg0, local9.anInt1052, true, null);
				}
				arg7.method749(arg5, arg8, arg0, local122, 1, 1, local197, 0, local134, local148);
				if (local9.anInt1048 != 0) {
					arg6.method435(local23, arg8, local9.aBoolean73, local20, arg0);
				}
			} else if (arg1 == 4) {
				if (local9.anInt1052 == -1 && local9.anIntArray103 == null) {
					local197 = local9.method702(local122, local142, local157, 4, local95, arg3);
				} else {
					local197 = new Class2_Sub1_Sub1_Sub1(arg2, 4, arg3, arg4, arg8, arg0, local9.anInt1052, true, null);
				}
				arg7.method746(arg5, arg8, arg0, local122, local197, null, Static101.anIntArray282[arg3], 0, 0, 0, local134, local148);
			} else {
				@Pc(820) int local820;
				if (arg1 == 5) {
					local530 = 16;
					local820 = arg7.method755(arg5, arg8, arg0);
					if (local820 != 0) {
						local530 = Static107.method1839(local820 >> 14 & 0x7FFF).anInt1054;
					}
					if (local9.anInt1052 == -1 && local9.anIntArray103 == null) {
						local568 = local9.method702(local122, local142, local157, 4, local95, arg3);
					} else {
						local568 = new Class2_Sub1_Sub1_Sub1(arg2, 4, arg3, arg4, arg8, arg0, local9.anInt1052, true, null);
					}
					arg7.method746(arg5, arg8, arg0, local122, local568, null, Static101.anIntArray282[arg3], 0, Static103.anIntArray283[arg3] * local530, local530 * Static54.anIntArray143[arg3], local134, local148);
				} else if (arg1 == 6) {
					local820 = arg7.method755(arg5, arg8, arg0);
					local530 = 8;
					if (local820 != 0) {
						local530 = Static107.method1839(local820 >> 14 & 0x7FFF).anInt1054 / 2;
					}
					if (local9.anInt1052 == -1 && local9.anIntArray103 == null) {
						local568 = local9.method702(local122, local142, local157, 4, local95, arg3 + 4);
					} else {
						local568 = new Class2_Sub1_Sub1_Sub1(arg2, 4, arg3 + 4, arg4, arg8, arg0, local9.anInt1052, true, null);
					}
					arg7.method746(arg5, arg8, arg0, local122, local568, null, 256, arg3, local530 * Static69.anIntArray204[arg3], Static59.anIntArray152[arg3] * local530, local134, local148);
				} else if (arg1 == 7) {
					local820 = arg3 + 2 & 0x3;
					if (local9.anInt1052 == -1 && local9.anIntArray103 == null) {
						local197 = local9.method702(local122, local142, local157, 4, local95, local820 + 4);
					} else {
						local197 = new Class2_Sub1_Sub1_Sub1(arg2, 4, local820 + 4, arg4, arg8, arg0, local9.anInt1052, true, null);
					}
					arg7.method746(arg5, arg8, arg0, local122, local197, null, 256, local820, 0, 0, local134, local148);
				} else if (arg1 == 8) {
					local530 = 8;
					local820 = arg7.method755(arg5, arg8, arg0);
					if (local820 != 0) {
						local530 = Static107.method1839(local820 >> 14 & 0x7FFF).anInt1054 / 2;
					}
					@Pc(1072) int local1072 = arg3 + 2 & 0x3;
					@Pc(1112) Class2_Sub1_Sub1 local1112;
					if (local9.anInt1052 == -1 && local9.anIntArray103 == null) {
						local568 = local9.method702(local122, local142, local157, 4, local95, arg3 + 4);
						local1112 = local9.method702(local122, local142, local157, 4, local95, local1072 + 4);
					} else {
						local568 = new Class2_Sub1_Sub1_Sub1(arg2, 4, arg3 + 4, arg4, arg8, arg0, local9.anInt1052, true, null);
						local1112 = new Class2_Sub1_Sub1_Sub1(arg2, 4, local1072 + 4, arg4, arg8, arg0, local9.anInt1052, true, null);
					}
					arg7.method746(arg5, arg8, arg0, local122, local568, local1112, 256, arg3, local530 * Static69.anIntArray204[arg3], Static59.anIntArray152[arg3] * local530, local134, local148);
				}
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "([Lclient!je;I)Lclient!je;")
	public static Class40 method722(@OriginalArg(0) Class40[] arg0) {
		if (arg0.length < 2) {
			throw new IllegalArgumentException();
		}
		return Static86.method2166(arg0, arg0.length, 0);
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!fd;Lclient!fd;Ljava/awt/Component;I)V")
	public static void method723(@OriginalArg(0) Class24 arg0, @OriginalArg(1) Class24 arg1, @OriginalArg(2) Component arg2) {
		if (Static108.aBoolean211) {
			return;
		}
		Static6.method1701();
		@Pc(15) byte[] local15 = arg1.method1933(Static87.aClass40_667, Static55.aClass40_727);
		Static95.aClass2_Sub1_Sub2_Sub4_4 = new Class2_Sub1_Sub2_Sub4(local15, arg2);
		Static93.aClass2_Sub1_Sub2_Sub4_3 = Static95.aClass2_Sub1_Sub2_Sub4_4.method1720();
		Static73.aClass2_Sub1_Sub2_Sub1_12 = Static47.method863(Static87.aClass40_667, Static15.aClass40_225, arg0);
		Static84.aClass2_Sub1_Sub2_Sub1_13 = Static47.method863(Static87.aClass40_667, Static123.aClass40_1553, arg0);
		Static86.aClass2_Sub1_Sub2_Sub1_14 = Static47.method863(Static87.aClass40_667, Static122.aClass40_1542, arg0);
		Static69.aClass2_Sub1_Sub2_Sub1Array53 = Static46.method828(Static87.aClass40_667, arg0, Static119.aClass40_1497);
		Static84.aClass2_Sub1_Sub2_Sub1Array73 = Static46.method828(Static87.aClass40_667, arg0, Static81.aClass40_1058);
		Static21.anIntArray74 = new int[256];
		for (@Pc(59) int local59 = 0; local59 < 64; local59++) {
			Static21.anIntArray74[local59] = local59 * 262144;
		}
		for (@Pc(75) int local75 = 0; local75 < 64; local75++) {
			Static21.anIntArray74[local75 + 64] = local75 * 1024 + 16711680;
		}
		for (@Pc(95) int local95 = 0; local95 < 64; local95++) {
			Static21.anIntArray74[local95 + 128] = local95 * 4 + 16776960;
		}
		for (@Pc(113) int local113 = 0; local113 < 64; local113++) {
			Static21.anIntArray74[local113 + 192] = 16777215;
		}
		Static81.anIntArray225 = new int[256];
		for (@Pc(132) int local132 = 0; local132 < 64; local132++) {
			Static81.anIntArray225[local132] = local132 * 1024;
		}
		for (@Pc(146) int local146 = 0; local146 < 64; local146++) {
			Static81.anIntArray225[local146 + 64] = local146 * 4 + 65280;
		}
		for (@Pc(165) int local165 = 0; local165 < 64; local165++) {
			Static81.anIntArray225[local165 + 128] = local165 * 262144 + 65535;
		}
		for (@Pc(184) int local184 = 0; local184 < 64; local184++) {
			Static81.anIntArray225[local184 + 192] = 16777215;
		}
		Static69.anIntArray206 = new int[256];
		for (@Pc(203) int local203 = 0; local203 < 64; local203++) {
			Static69.anIntArray206[local203] = local203 * 4;
		}
		for (@Pc(217) int local217 = 0; local217 < 64; local217++) {
			Static69.anIntArray206[local217 + 64] = local217 * 262144 + 255;
		}
		for (@Pc(235) int local235 = 0; local235 < 64; local235++) {
			Static69.anIntArray206[local235 + 128] = local235 * 1024 + 16711935;
		}
		for (@Pc(255) int local255 = 0; local255 < 64; local255++) {
			Static69.anIntArray206[local255 + 192] = 16777215;
		}
		Static14.anIntArray51 = new int[32768];
		Static30.anIntArray86 = new int[256];
		Static115.anIntArray302 = new int[32768];
		Static70.method1219(null);
		Static118.anInt2778 = 0;
		Static87.aClass40_661 = Static87.aClass40_667;
		Static60.aBoolean124 = false;
		Static97.anIntArray267 = new int[32768];
		Static125.anIntArray343 = new int[32768];
		Static87.aClass40_664 = Static87.aClass40_667;
		if (Static81.anInt2089 == 0) {
			Static111.aBoolean214 = true;
		} else {
			Static111.aBoolean214 = false;
		}
		if (Static111.aBoolean214) {
			Static24.method2212();
		} else {
			Static110.method1173(Static61.aClass24_Sub1_8, Static87.aClass40_667, Static21.aClass40_361);
		}
		Static111.method1867(false);
		Static108.aBoolean211 = true;
		Static95.aClass2_Sub1_Sub2_Sub4_4.method1712(0, 0);
		Static93.aClass2_Sub1_Sub2_Sub4_3.method1712(382, 0);
		Static73.aClass2_Sub1_Sub2_Sub1_12.method1084(382 - Static73.aClass2_Sub1_Sub2_Sub1_12.anInt1632 / 2, 18);
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IZ)Lclient!nc;")
	public static Class2_Sub1_Sub7 method724(@OriginalArg(0) int arg0) {
		@Pc(15) Class2_Sub1_Sub7 local15 = (Class2_Sub1_Sub7) Static11.aClass55_12.method1410((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static65.aClass24_19.method1931(arg0, 12);
		local15 = new Class2_Sub1_Sub7();
		if (local25 != null) {
			local15.method1266(new Class2_Sub9(local25));
		}
		local15.method1268();
		Static11.aClass55_12.method1411((long) arg0, local15);
		return local15;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(ILclient!fd;)V")
	public static void method725(@OriginalArg(1) Class24 arg0) {
		Static130.aClass24_33 = arg0;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(B)V")
	public static void method726() {
		aClass40_561 = null;
		aClass40_562 = null;
		aClass2_Sub13Array1 = null;
		anIntArray109 = null;
		anIntArray108 = null;
	}
}
