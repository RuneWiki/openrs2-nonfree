import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!hf", name = "e", descriptor = "Lclient!sc;")
	public static Class66 aClass66_736 = Static106.method1849("<)4col>");

	@OriginalMember(owner = "client!hf", name = "g", descriptor = "Lclient!rb;")
	public static Class60 aClass60_46 = new Class60(64);

	@OriginalMember(owner = "client!hf", name = "h", descriptor = "Lclient!sc;")
	public static Class66 aClass66_737 = Static106.method1849("m-Ochte sich mit Ihnen duellieren)3");

	@OriginalMember(owner = "client!hf", name = "i", descriptor = "Lclient!sb;")
	public static Class65 aClass65_18 = new Class65(4096);

	@OriginalMember(owner = "client!hf", name = "j", descriptor = "Lclient!sc;")
	public static Class66 aClass66_738 = Static106.method1849(" (X");

	@OriginalMember(owner = "client!hf", name = "k", descriptor = "[I")
	public static int[] anIntArray207 = new int[2048];

	@OriginalMember(owner = "client!hf", name = "l", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray3 = new int[4][105][105];

	@OriginalMember(owner = "client!hf", name = "m", descriptor = "Lclient!sc;")
	public static Class66 aClass66_739 = Static106.method1849(" zuerst von Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!hf", name = "n", descriptor = "[I")
	public static int[] anIntArray208 = new int[] { 1, 1, 1, 1 };

	@OriginalMember(owner = "client!hf", name = "o", descriptor = "I")
	public static int anInt1408 = 0;

	@OriginalMember(owner = "client!hf", name = "p", descriptor = "Lclient!sc;")
	public static Class66 aClass66_740 = Static106.method1849("Gegenstand f-Ur Mitglieder");

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIB)V")
	public static void method962(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) Class61 local11 = Static101.aClass61ArrayArrayArray1[Static22.anInt635][arg0][arg1];
		if (local11 == null) {
			Static129.aClass9_1.method351(Static22.anInt635, arg0, arg1);
			return;
		}
		@Pc(24) Class1_Sub1_Sub1_Sub1 local24 = (Class1_Sub1_Sub1_Sub1) local11.method1748();
		@Pc(26) int local26 = -99999999;
		@Pc(28) Class1_Sub1_Sub1_Sub1 local28 = null;
		while (local24 != null) {
			@Pc(34) Class1_Sub1_Sub6 local34 = Static20.method496(local24.anInt72);
			@Pc(37) int local37 = local34.anInt1550;
			if (local34.anInt1543 == 1) {
				local37 *= local24.anInt75 + 1;
			}
			if (local37 > local26) {
				local26 = local37;
				local28 = local24;
			}
			local24 = (Class1_Sub1_Sub1_Sub1) local11.method1760();
		}
		if (local28 == null) {
			Static129.aClass9_1.method351(Static22.anInt635, arg0, arg1);
			return;
		}
		@Pc(83) Class1_Sub1_Sub1_Sub1 local83 = null;
		local11.method1755(local28);
		local24 = (Class1_Sub1_Sub1_Sub1) local11.method1748();
		@Pc(100) int local100 = arg0 + (arg1 << 7) + 1610612736;
		@Pc(102) Class1_Sub1_Sub1_Sub1 local102 = null;
		while (local24 != null) {
			if (local28.anInt72 != local24.anInt72) {
				if (local83 == null) {
					local83 = local24;
				}
				if (local24.anInt72 != local83.anInt72 && local102 == null) {
					local102 = local24;
				}
			}
			local24 = (Class1_Sub1_Sub1_Sub1) local11.method1760();
		}
		Static129.aClass9_1.method308(Static22.anInt635, arg0, arg1, Static77.method1476(arg1 * 128 + 64, Static22.anInt635, arg0 * 128 + 64), local28, local100, local83, local102);
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)[Lclient!b;")
	public static Class1_Sub1_Sub2_Sub1[] method963() {
		@Pc(8) Class1_Sub1_Sub2_Sub1[] local8 = new Class1_Sub1_Sub2_Sub1[Static35.anInt869];
		for (@Pc(10) int local10 = 0; local10 < Static35.anInt869; local10++) {
			@Pc(23) Class1_Sub1_Sub2_Sub1 local23 = local8[local10] = new Class1_Sub1_Sub2_Sub1();
			local23.anInt284 = Static98.anInt2486;
			local23.anInt288 = Static48.anInt1502;
			local23.anInt285 = Static99.anIntArray181[local10];
			local23.anInt287 = Static28.anIntArray105[local10];
			local23.anInt283 = Static125.anIntArray493[local10];
			local23.anInt286 = Static14.anIntArray80[local10];
			@Pc(53) byte[] local53 = Static29.aByteArrayArray2[local10];
			@Pc(59) int local59 = local23.anInt286 * local23.anInt283;
			local23.anIntArray44 = new int[local59];
			for (@Pc(65) int local65 = 0; local65 < local59; local65++) {
				local23.anIntArray44[local65] = Static16.anIntArray81[local53[local65] & 0xFF];
			}
		}
		Static22.method509();
		return local8;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(II)V")
	public static void method964(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static50.aBooleanArray9[arg0]) {
			return;
		}
		Static128.aClass5_91.method131(arg0);
		if (Static100.aClass1_Sub10ArrayArray1[arg0] == null) {
			return;
		}
		@Pc(26) boolean local26 = true;
		for (@Pc(28) int local28 = 0; local28 < Static100.aClass1_Sub10ArrayArray1[arg0].length; local28++) {
			if (Static100.aClass1_Sub10ArrayArray1[arg0][local28] != null) {
				if (Static100.aClass1_Sub10ArrayArray1[arg0][local28].anInt1359 == 2) {
					local26 = false;
				} else {
					Static100.aClass1_Sub10ArrayArray1[arg0][local28] = null;
				}
			}
		}
		if (local26) {
			Static100.aClass1_Sub10ArrayArray1[arg0] = null;
		}
		Static50.aBooleanArray9[arg0] = false;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)V")
	public static void method965() {
		anIntArray208 = null;
		aClass66_739 = null;
		anIntArrayArrayArray3 = null;
		aClass66_737 = null;
		aClass66_740 = null;
		aClass60_46 = null;
		aClass66_736 = null;
		aClass66_738 = null;
		anIntArray207 = null;
		aClass65_18 = null;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILclient!sf;)V")
	public static void method966(@OriginalArg(1) Class5 arg0) {
		Static19.aClass5_20 = arg0;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIII)V")
	public static void method967(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static61.anInt1866 = 0;
		@Pc(74) int local74;
		for (@Pc(13) int local13 = -1; local13 < Static33.anInt854 + Static111.anInt2653; local13++) {
			@Pc(21) Class1_Sub1_Sub1_Sub5 local21;
			if (local13 == -1) {
				local21 = Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1;
			} else if (Static111.anInt2653 > local13) {
				local21 = Static85.aClass1_Sub1_Sub1_Sub5_Sub2Array1[Static51.anIntArray239[local13]];
			} else {
				local21 = Static73.aClass1_Sub1_Sub1_Sub5_Sub1Array3[Static54.anIntArray248[local13 - Static111.anInt2653]];
			}
			if (local21 != null && local21.method931()) {
				@Pc(58) Class1_Sub1_Sub5 local58;
				if (local21 instanceof Class1_Sub1_Sub1_Sub5_Sub1) {
					local58 = ((Class1_Sub1_Sub1_Sub5_Sub1) local21).aClass1_Sub1_Sub5_1;
					if (local58.anIntArray222 != null) {
						local58 = local58.method1040();
					}
					if (local58 == null) {
						continue;
					}
				}
				if (local13 >= Static111.anInt2653) {
					local58 = ((Class1_Sub1_Sub1_Sub5_Sub1) local21).aClass1_Sub1_Sub5_1;
					if (local58.anIntArray222 != null) {
						local58 = local58.method1040();
					}
					if (local58.anInt1482 >= 0 && Static92.aClass1_Sub1_Sub2_Sub1Array57.length > local58.anInt1482) {
						Static51.method1093(local21, local21.anInt1245 + 15);
						if (Static13.anInt454 > -1) {
							Static92.aClass1_Sub1_Sub2_Sub1Array57[local58.anInt1482].method250(Static13.anInt454 + arg1 - 12, arg3 + -30 - -Static104.anInt2558);
						}
					}
					if (Static28.anInt734 == 1 && Static134.anInt2955 == Static54.anIntArray248[local13 - Static111.anInt2653] && Static22.anInt636 % 20 < 10) {
						Static51.method1093(local21, local21.anInt1245 + 15);
						if (Static13.anInt454 > -1) {
							Static83.aClass1_Sub1_Sub2_Sub1Array48[0].method250(Static13.anInt454 + arg1 - 12, Static104.anInt2558 + -28 + arg3);
						}
					}
				} else {
					local74 = 30;
					@Pc(77) Class1_Sub1_Sub1_Sub5_Sub2 local77 = (Class1_Sub1_Sub1_Sub5_Sub2) local21;
					if (local77.anInt1299 != -1 || local77.anInt1317 != -1) {
						Static51.method1093(local21, local21.anInt1245 + 15);
						if (Static13.anInt454 > -1) {
							if (local77.anInt1299 != -1) {
								Static45.aClass1_Sub1_Sub2_Sub1Array31[local77.anInt1299].method250(Static13.anInt454 + arg1 - 12, arg3 + Static104.anInt2558 + -30);
								local74 += 25;
							}
							if (local77.anInt1317 != -1) {
								Static92.aClass1_Sub1_Sub2_Sub1Array57[local77.anInt1317].method250(arg1 + Static13.anInt454 - 12, -local74 + arg3 - -Static104.anInt2558);
								local74 += 25;
							}
						}
					}
					if (local13 >= 0 && Static28.anInt734 == 10 && Static51.anIntArray239[local13] == Static77.anInt2146) {
						Static51.method1093(local21, local21.anInt1245 + 15);
						if (Static13.anInt454 > -1) {
							Static83.aClass1_Sub1_Sub2_Sub1Array48[1].method250(Static13.anInt454 + arg1 - 12, Static104.anInt2558 + arg3 + -local74);
						}
					}
				}
				if (local21.aClass66_702 != null && (local13 >= Static111.anInt2653 || Static14.anInt475 == 0 || Static14.anInt475 == 3 || Static14.anInt475 == 1 && Static60.method1299(((Class1_Sub1_Sub1_Sub5_Sub2) local21).aClass66_707))) {
					Static51.method1093(local21, local21.anInt1245);
					if (Static13.anInt454 > -1 && Static61.anInt1866 < Static82.anInt2194) {
						Static82.anIntArray369[Static61.anInt1866] = Static77.aClass1_Sub1_Sub2_Sub2_Sub1_1.method791(local21.aClass66_702) / 2;
						Static82.anIntArray366[Static61.anInt1866] = Static77.aClass1_Sub1_Sub2_Sub2_Sub1_1.anInt968;
						Static82.anIntArray364[Static61.anInt1866] = Static13.anInt454;
						Static82.anIntArray365[Static61.anInt1866] = Static104.anInt2558;
						Static82.anIntArray367[Static61.anInt1866] = local21.anInt1282;
						Static82.anIntArray368[Static61.anInt1866] = local21.anInt1273;
						Static82.anIntArray363[Static61.anInt1866] = local21.anInt1283;
						Static82.aClass66Array15[Static61.anInt1866] = local21.aClass66_702;
						Static61.anInt1866++;
					}
				}
				if (local21.anInt1264 > Static22.anInt636) {
					Static51.method1093(local21, local21.anInt1245 + 15);
					if (Static13.anInt454 > -1) {
						local74 = local21.anInt1242 * 30 / local21.anInt1275;
						if (local74 > 30) {
							local74 = 30;
						}
						Static115.method1670(Static13.anInt454 + arg1 - 15, Static104.anInt2558 + arg3 + -3, local74, 5, 65280);
						Static115.method1670(arg1 + Static13.anInt454 + local74 - 15, arg3 + -3 + Static104.anInt2558, 30 - local74, 5, 16711680);
					}
				}
				for (local74 = 0; local74 < 4; local74++) {
					if (local21.anIntArray188[local74] > Static22.anInt636) {
						Static51.method1093(local21, local21.anInt1245 / 2);
						if (Static13.anInt454 > -1) {
							if (local74 == 1) {
								Static104.anInt2558 -= 20;
							}
							if (local74 == 2) {
								Static13.anInt454 -= 15;
								Static104.anInt2558 -= 10;
							}
							if (local74 == 3) {
								Static13.anInt454 += 15;
								Static104.anInt2558 -= 10;
							}
							Static17.aClass1_Sub1_Sub2_Sub1Array15[local21.anIntArray190[local74]].method250(arg1 + Static13.anInt454 - 12, arg3 + (Static104.anInt2558 - 12));
							Static101.aClass1_Sub1_Sub2_Sub2_Sub1_3.method781(Static88.method1632(local21.anIntArray187[local74]), arg1 + Static13.anInt454 - 1, arg3 - -Static104.anInt2558 + 3, 16777215, 0);
						}
					}
				}
			}
		}
		for (@Pc(528) int local528 = 0; local528 < Static61.anInt1866; local528++) {
			local74 = Static82.anIntArray364[local528];
			@Pc(538) int local538 = Static82.anIntArray369[local528];
			@Pc(542) int local542 = Static82.anIntArray365[local528];
			@Pc(546) int local546 = Static82.anIntArray366[local528];
			@Pc(548) boolean local548 = true;
			while (local548) {
				local548 = false;
				for (@Pc(554) int local554 = 0; local554 < local528; local554++) {
					if (Static82.anIntArray365[local554] - Static82.anIntArray366[local554] < local542 + 2 && Static82.anIntArray365[local554] + 2 > -local546 + local542 && local74 - local538 < Static82.anIntArray369[local554] + Static82.anIntArray364[local554] && Static82.anIntArray364[local554] - Static82.anIntArray369[local554] < local538 + local74 && local542 > Static82.anIntArray365[local554] - Static82.anIntArray366[local554]) {
						local548 = true;
						local542 = Static82.anIntArray365[local554] - Static82.anIntArray366[local554];
					}
				}
			}
			Static13.anInt454 = Static82.anIntArray364[local528];
			Static104.anInt2558 = Static82.anIntArray365[local528] = local542;
			@Pc(654) Class66 local654 = Static82.aClass66Array15[local528];
			if (Static84.anInt2216 == 0) {
				@Pc(675) int local675 = 16776960;
				if (Static82.anIntArray367[local528] < 6) {
					local675 = Static125.anIntArray494[Static82.anIntArray367[local528]];
				}
				if (Static82.anIntArray367[local528] == 6) {
					local675 = Static45.anInt1444 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static82.anIntArray367[local528] == 7) {
					local675 = Static45.anInt1444 % 20 < 10 ? 255 : 65535;
				}
				if (Static82.anIntArray367[local528] == 8) {
					local675 = Static45.anInt1444 % 20 >= 10 ? 8454016 : 45056;
				}
				@Pc(748) int local748;
				if (Static82.anIntArray367[local528] == 9) {
					local748 = 150 - Static82.anIntArray363[local528];
					if (local748 < 50) {
						local675 = local748 * 1280 + 16711680;
					} else if (local748 < 100) {
						local675 = 16776960 - (local748 - 50) * 327680;
					} else if (local748 < 150) {
						local675 = local748 * 5 + 65280 - 500;
					}
				}
				if (Static82.anIntArray367[local528] == 10) {
					local748 = 150 - Static82.anIntArray363[local528];
					if (local748 < 50) {
						local675 = local748 * 5 + 16711680;
					} else if (local748 < 100) {
						local675 = 33095935 - local748 * 327680;
					} else if (local748 < 150) {
						local675 = (local748 - 100) * 327680 + 255 + 500 - local748 * 5;
					}
				}
				if (Static82.anIntArray367[local528] == 11) {
					local748 = 150 - Static82.anIntArray363[local528];
					if (local748 < 50) {
						local675 = 16777215 - local748 * 327685;
					} else if (local748 < 100) {
						local675 = (local748 - 50) * 327685 + 65280;
					} else if (local748 < 150) {
						local675 = 16777215 - (local748 - 100) * 327680;
					}
				}
				if (Static82.anIntArray368[local528] == 0) {
					Static77.aClass1_Sub1_Sub2_Sub2_Sub1_1.method781(local654, arg1 + Static13.anInt454, Static104.anInt2558 + arg3, local675, 0);
				}
				if (Static82.anIntArray368[local528] == 1) {
					Static77.aClass1_Sub1_Sub2_Sub2_Sub1_1.method787(local654, arg1 + Static13.anInt454, Static104.anInt2558 + arg3, local675, Static45.anInt1444);
				}
				if (Static82.anIntArray368[local528] == 2) {
					Static77.aClass1_Sub1_Sub2_Sub2_Sub1_1.method782(local654, arg1 + Static13.anInt454, arg3 - -Static104.anInt2558, local675, Static45.anInt1444);
				}
				if (Static82.anIntArray368[local528] == 3) {
					Static77.aClass1_Sub1_Sub2_Sub2_Sub1_1.method771(local654, Static13.anInt454 + arg1, arg3 + Static104.anInt2558, local675, Static45.anInt1444, 150 - Static82.anIntArray363[local528]);
				}
				if (Static82.anIntArray368[local528] == 4) {
					local748 = (150 - Static82.anIntArray363[local528]) * (Static77.aClass1_Sub1_Sub2_Sub2_Sub1_1.method791(local654) + 100) / 150;
					Static115.method1661(arg1 + Static13.anInt454 - 50, arg3, Static13.anInt454 + arg1 + 50, arg0 + arg3);
					Static77.aClass1_Sub1_Sub2_Sub2_Sub1_1.method790(local654, arg1 + Static13.anInt454 + 50 - local748, arg3 + Static104.anInt2558, local675, 0);
					Static115.method1659(arg1, arg3, arg1 + arg2, arg3 + arg0);
				}
				if (Static82.anIntArray368[local528] == 5) {
					local748 = 150 - Static82.anIntArray363[local528];
					Static115.method1661(arg1, arg3 + Static104.anInt2558 - Static77.aClass1_Sub1_Sub2_Sub2_Sub1_1.anInt968 - 1, arg1 + arg2, arg3 + Static104.anInt2558 + 5);
					@Pc(1081) int local1081 = 0;
					if (local748 < 25) {
						local1081 = local748 - 25;
					} else if (local748 > 125) {
						local1081 = local748 - 125;
					}
					Static77.aClass1_Sub1_Sub2_Sub2_Sub1_1.method781(local654, Static13.anInt454 + arg1, local1081 + arg3 + Static104.anInt2558, local675, 0);
					Static115.method1659(arg1, arg3, arg2 + arg1, arg3 - -arg0);
				}
			} else {
				Static77.aClass1_Sub1_Sub2_Sub2_Sub1_1.method781(local654, Static13.anInt454 + arg1, arg3 - -Static104.anInt2558, 16776960, 0);
			}
		}
	}
}
