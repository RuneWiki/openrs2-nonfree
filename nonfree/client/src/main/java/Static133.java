import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!we", name = "S", descriptor = "[I")
	public static int[] anIntArray377;

	@OriginalMember(owner = "client!we", name = "ab", descriptor = "Lclient!ua;")
	public static Class24_Sub1 aClass24_Sub1_22;

	@OriginalMember(owner = "client!we", name = "bb", descriptor = "I")
	public static int anInt3069 = 2;

	@OriginalMember(owner = "client!we", name = "hb", descriptor = "Lclient!je;")
	private static Class40 aClass40_1648 = Static69.method1231("Hidden");

	@OriginalMember(owner = "client!we", name = "db", descriptor = "Lclient!je;")
	public static Class40 aClass40_1647 = aClass40_1648;

	@OriginalMember(owner = "client!we", name = "fb", descriptor = "B")
	public static byte aByte8 = 0;

	@OriginalMember(owner = "client!we", name = "gb", descriptor = "I")
	public static int anInt3072 = 0;

	@OriginalMember(owner = "client!we", name = "nb", descriptor = "Lclient!je;")
	private static Class40 aClass40_1650 = Static69.method1231("Error connecting to server)3");

	@OriginalMember(owner = "client!we", name = "jb", descriptor = "Lclient!je;")
	public static Class40 aClass40_1649 = aClass40_1650;

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IILclient!je;Lclient!je;ZLclient!fd;)V")
	public static void method2216(@OriginalArg(2) Class40 arg0, @OriginalArg(3) Class40 arg1, @OriginalArg(5) Class24 arg2) {
		@Pc(16) int local16 = arg2.method1915(arg0);
		@Pc(22) int local22 = arg2.method1918(arg1, local16);
		Static52.method940(local16, local22, arg2, 255);
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIIII)V")
	public static void method2219(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static134.anInt1646 == arg2 && arg3 == Static134.anInt1648 && (arg1 == Static1.anInt8 || !Static34.aBoolean60)) {
			return;
		}
		Static134.anInt1646 = arg2;
		Static1.anInt8 = arg1;
		if (!Static34.aBoolean60) {
			Static1.anInt8 = 0;
		}
		Static134.anInt1648 = arg3;
		Static21.method402(25);
		Static5.method130(true, Static32.aClass40_456);
		@Pc(49) int local49 = Static107.anInt2546;
		Static107.anInt2546 = (arg2 - 6) * 8;
		@Pc(60) int local60 = Static107.anInt2546 - local49;
		@Pc(64) int local64 = Static29.anInt720;
		Static29.anInt720 = (arg3 - 6) * 8;
		@Pc(75) int local75 = Static29.anInt720 - local64;
		for (@Pc(79) int local79 = 0; local79 < 32768; local79++) {
			@Pc(85) Class2_Sub1_Sub1_Sub3_Sub1 local85 = Static127.aClass2_Sub1_Sub1_Sub3_Sub1Array1[local79];
			if (local85 != null) {
				for (@Pc(89) int local89 = 0; local89 < 10; local89++) {
					local85.anIntArray177[local89] -= local60;
					local85.anIntArray180[local89] -= local75;
				}
				local85.anInt1792 -= local75 * 128;
				local85.anInt1788 -= local60 * 128;
			}
		}
		for (@Pc(135) int local135 = 0; local135 < 2048; local135++) {
			@Pc(141) Class2_Sub1_Sub1_Sub3_Sub2 local141 = Static69.aClass2_Sub1_Sub1_Sub3_Sub2Array2[local135];
			if (local141 != null) {
				for (@Pc(145) int local145 = 0; local145 < 10; local145++) {
					local141.anIntArray177[local145] -= local60;
					local141.anIntArray180[local145] -= local75;
				}
				local141.anInt1788 -= local60 * 128;
				local141.anInt1792 -= local75 * 128;
			}
		}
		Static105.anInt2531 = arg1;
		Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.method1176(false, arg4, arg0);
		@Pc(197) byte local197 = 0;
		@Pc(199) byte local199 = 0;
		@Pc(201) byte local201 = 104;
		@Pc(203) byte local203 = 1;
		if (local60 < 0) {
			local197 = 103;
			local203 = -1;
			local201 = -1;
		}
		@Pc(213) byte local213 = 1;
		@Pc(215) byte local215 = 104;
		if (local75 < 0) {
			local215 = -1;
			local199 = 103;
			local213 = -1;
		}
		for (@Pc(225) int local225 = local197; local225 != local201; local225 += local203) {
			for (@Pc(229) int local229 = local199; local229 != local215; local229 += local213) {
				@Pc(235) int local235 = local60 + local225;
				@Pc(239) int local239 = local229 + local75;
				for (@Pc(241) int local241 = 0; local241 < 4; local241++) {
					if (local235 >= 0 && local239 >= 0 && local235 < 104 && local239 < 104) {
						Static81.aClass3ArrayArrayArray1[local241][local225][local229] = Static81.aClass3ArrayArrayArray1[local241][local235][local239];
					} else {
						Static81.aClass3ArrayArrayArray1[local241][local225][local229] = null;
					}
				}
			}
		}
		for (@Pc(314) Class2_Sub22 local314 = (Class2_Sub22) Static19.aClass3_4.method82(); local314 != null; local314 = (Class2_Sub22) Static19.aClass3_4.method74()) {
			local314.anInt2653 -= local75;
			local314.anInt2642 -= local60;
			if (local314.anInt2642 < 0 || local314.anInt2653 < 0 || local314.anInt2642 >= 104 || local314.anInt2653 >= 104) {
				local314.method2209();
			}
		}
		Static20.aBoolean47 = false;
		Static70.anInt1888 = 0;
		if (Static66.anInt1743 != 0) {
			Static58.anInt1517 -= local75;
			Static66.anInt1743 -= local60;
		}
		Static46.anInt1215 = -1;
		Static79.aClass3_12.method81();
		Static120.aClass3_16.method81();
	}

	@OriginalMember(owner = "client!we", name = "e", descriptor = "(B)V")
	public static void method2220() {
		aClass24_Sub1_22 = null;
		aClass40_1649 = null;
		aClass40_1650 = null;
		aClass40_1647 = null;
		aClass40_1648 = null;
		anIntArray377 = null;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIB)V")
	public static void method2221(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7;
		for (@Pc(3) int local3 = 0; local3 < 8; local3++) {
			for (local7 = 0; local7 < 8; local7++) {
				Static118.anIntArrayArrayArray6[arg0][local3 + arg1][arg2 + local7] = 0;
			}
		}
		if (arg1 > 0) {
			for (local7 = 1; local7 < 8; local7++) {
				Static118.anIntArrayArrayArray6[arg0][arg1][arg2 + local7] = Static118.anIntArrayArrayArray6[arg0][arg1 - 1][local7 + arg2];
			}
		}
		if (arg2 > 0) {
			for (local7 = 1; local7 < 8; local7++) {
				Static118.anIntArrayArrayArray6[arg0][arg1 + local7][arg2] = Static118.anIntArrayArrayArray6[arg0][local7 + arg1][arg2 - 1];
			}
		}
		if (arg1 > 0 && Static118.anIntArrayArrayArray6[arg0][arg1 - 1][arg2] != 0) {
			Static118.anIntArrayArrayArray6[arg0][arg1][arg2] = Static118.anIntArrayArrayArray6[arg0][arg1 - 1][arg2];
		} else if (arg2 > 0 && Static118.anIntArrayArrayArray6[arg0][arg1][arg2 - 1] != 0) {
			Static118.anIntArrayArrayArray6[arg0][arg1][arg2] = Static118.anIntArrayArrayArray6[arg0][arg1][arg2 - 1];
		} else if (arg1 > 0 && arg2 > 0 && Static118.anIntArrayArrayArray6[arg0][arg1 - 1][arg2 - 1] != 0) {
			Static118.anIntArrayArrayArray6[arg0][arg1][arg2] = Static118.anIntArrayArrayArray6[arg0][arg1 - 1][arg2 - 1];
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ZLclient!fd;Lclient!je;Lclient!je;)Lclient!qb;")
	public static Class2_Sub1_Sub2_Sub4 method2223(@OriginalArg(1) Class24 arg0, @OriginalArg(2) Class40 arg1, @OriginalArg(3) Class40 arg2) {
		@Pc(9) int local9 = arg0.method1915(arg1);
		@Pc(15) int local15 = arg0.method1918(arg2, local9);
		return Static114.method1891(local15, arg0, local9);
	}

	@OriginalMember(owner = "client!we", name = "f", descriptor = "(I)V")
	public static void method2224() {
		for (@Pc(18) Class2_Sub22 local18 = (Class2_Sub22) Static19.aClass3_4.method82(); local18 != null; local18 = (Class2_Sub22) Static19.aClass3_4.method74()) {
			if (local18.anInt2652 == -1) {
				local18.anInt2639 = 0;
				Static69.method1236(local18);
			} else {
				local18.method2209();
			}
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IIII)V")
	public static void method2225(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static55.method990();
		Static6.method1685(arg1, arg2, arg1 + Static38.aClass2_Sub1_Sub2_Sub1_7.anInt1632, arg2 + Static38.aClass2_Sub1_Sub2_Sub1_7.anInt1631);
		if (Static27.anInt680 == 2 || Static27.anInt680 == 5) {
			Static6.method1696(arg1 + 25, arg2 - -5, Static67.anIntArray181, Static56.anIntArray148);
		} else {
			@Pc(41) int local41 = Static19.anInt616 + Static39.anInt1035 & 0x7FF;
			@Pc(48) int local48 = Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anInt1788 / 32 + 48;
			@Pc(55) int local55 = 464 - Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anInt1792 / 32;
			Static50.aClass2_Sub1_Sub2_Sub4_2.method1703(arg1 + 25, arg2 + 5, 146, 151, local48, local55, local41, Static94.anInt2403 + 256, Static67.anIntArray181, Static56.anIntArray148);
			@Pc(90) int local90;
			@Pc(104) int local104;
			for (@Pc(75) int local75 = 0; local75 < Static28.anInt685; local75++) {
				local90 = Static30.anIntArray85[local75] * 4 + 2 - Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anInt1788 / 32;
				local104 = Static77.anIntArray216[local75] * 4 + 2 - Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anInt1792 / 32;
				Static121.method2036(local90, arg2, local104, Static47.aClass2_Sub1_Sub2_Sub4Array7[local75], arg1);
			}
			@Pc(153) int local153;
			@Pc(165) int local165;
			for (local90 = 0; local90 < 104; local90++) {
				for (local104 = 0; local104 < 104; local104++) {
					@Pc(139) Class3 local139 = Static81.aClass3ArrayArrayArray1[Static105.anInt2531][local90][local104];
					if (local139 != null) {
						local153 = local90 * 4 + 2 - Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anInt1788 / 32;
						local165 = local104 * 4 + 2 - Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anInt1792 / 32;
						Static121.method2036(local153, arg2, local165, Static57.aClass2_Sub1_Sub2_Sub4Array10[0], arg1);
					}
				}
			}
			@Pc(243) int local243;
			for (local104 = 0; local104 < Static102.anInt2484; local104++) {
				@Pc(194) Class2_Sub1_Sub1_Sub3_Sub1 local194 = Static127.aClass2_Sub1_Sub1_Sub3_Sub1Array1[Static37.anIntArray97[local104]];
				if (local194 != null && local194.method1174()) {
					@Pc(203) Class2_Sub1_Sub11 local203 = local194.aClass2_Sub1_Sub11_1;
					if (local203 != null && local203.anIntArray255 != null) {
						local203 = local203.method1665();
					}
					if (local203 != null && local203.aBoolean188 && local203.aBoolean185) {
						local165 = local194.anInt1788 / 32 - Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anInt1788 / 32;
						local243 = local194.anInt1792 / 32 - Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anInt1792 / 32;
						Static121.method2036(local165, arg2, local243, Static57.aClass2_Sub1_Sub2_Sub4Array10[1], arg1);
					}
				}
			}
			@Pc(270) Class2_Sub1_Sub1_Sub3_Sub2 local270;
			for (@Pc(262) int local262 = 0; local262 < Static130.anInt3007; local262++) {
				local270 = Static69.aClass2_Sub1_Sub1_Sub3_Sub2Array2[Static126.anIntArray347[local262]];
				if (local270 != null && local270.method1174()) {
					@Pc(278) boolean local278 = false;
					local165 = local270.anInt1788 / 32 - Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anInt1788 / 32;
					local243 = local270.anInt1792 / 32 - Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anInt1792 / 32;
					@Pc(305) long local305 = local270.aClass40_892.method981();
					for (@Pc(307) int local307 = 0; local307 < Static114.anInt2621; local307++) {
						if (local305 == Static88.aLongArray7[local307] && Static39.anIntArray104[local307] != 0) {
							local278 = true;
							break;
						}
					}
					@Pc(329) boolean local329 = false;
					if (Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anInt1831 != 0 && local270.anInt1831 != 0 && Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anInt1831 == local270.anInt1831) {
						local329 = true;
					}
					if (local278) {
						Static121.method2036(local165, arg2, local243, Static57.aClass2_Sub1_Sub2_Sub4Array10[3], arg1);
					} else if (local329) {
						Static121.method2036(local165, arg2, local243, Static57.aClass2_Sub1_Sub2_Sub4Array10[4], arg1);
					} else {
						Static121.method2036(local165, arg2, local243, Static57.aClass2_Sub1_Sub2_Sub4Array10[2], arg1);
					}
				}
			}
			if (Static30.anInt730 != 0 && Static28.anInt704 % 20 < 10) {
				if (Static30.anInt730 == 1 && Static39.anInt1058 >= 0 && Static127.aClass2_Sub1_Sub1_Sub3_Sub1Array1.length > Static39.anInt1058) {
					@Pc(426) Class2_Sub1_Sub1_Sub3_Sub1 local426 = Static127.aClass2_Sub1_Sub1_Sub3_Sub1Array1[Static39.anInt1058];
					if (local426 != null) {
						local243 = local426.anInt1792 / 32 - Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anInt1792 / 32;
						local165 = local426.anInt1788 / 32 - Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anInt1788 / 32;
						Static46.method825(local243, local165, arg2, Static13.aClass2_Sub1_Sub2_Sub4Array2[1], arg1);
					}
				}
				if (Static30.anInt730 == 2) {
					local165 = (Static62.anInt1685 - Static29.anInt720) * 4 + 2 - Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anInt1792 / 32;
					local153 = (Static63.anInt398 - Static107.anInt2546) * 4 + 2 - Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anInt1788 / 32;
					Static46.method825(local165, local153, arg2, Static13.aClass2_Sub1_Sub2_Sub4Array2[1], arg1);
				}
				if (Static30.anInt730 == 10 && Static84.anInt2219 >= 0 && Static84.anInt2219 < Static69.aClass2_Sub1_Sub1_Sub3_Sub2Array2.length) {
					local270 = Static69.aClass2_Sub1_Sub1_Sub3_Sub2Array2[Static84.anInt2219];
					if (local270 != null) {
						local165 = local270.anInt1788 / 32 - Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anInt1788 / 32;
						local243 = local270.anInt1792 / 32 - Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anInt1792 / 32;
						Static46.method825(local243, local165, arg2, Static13.aClass2_Sub1_Sub2_Sub4Array2[1], arg1);
					}
				}
			}
			if (Static66.anInt1743 != 0) {
				local165 = Static58.anInt1517 * 4 + 2 - Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anInt1792 / 32;
				local153 = Static66.anInt1743 * 4 + 2 - Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anInt1788 / 32;
				Static121.method2036(local153, arg2, local165, Static13.aClass2_Sub1_Sub2_Sub4Array2[0], arg1);
			}
			Static6.method1695(arg1 + 93 + 4, arg2 + 78, 3, 3, 16777215);
		}
		if (Static27.anInt680 >= 3) {
			Static6.method1696(arg1, arg2, Static121.anIntArray332, Static134.anIntArray166);
		} else {
			Static23.aClass2_Sub1_Sub2_Sub4_1.method1703(arg1, arg2, 33, 33, 25, 25, Static39.anInt1035, 256, Static121.anIntArray332, Static134.anIntArray166);
		}
		if (Static50.aBooleanArray12[arg0]) {
			Static38.aClass2_Sub1_Sub2_Sub1_7.method1084(arg1, arg2);
		}
		Static84.aBooleanArray21[arg0] = true;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ILclient!na;)Lclient!je;")
	public static Class40 method2226(@OriginalArg(1) Class2_Sub9 arg0) {
		return Static45.method814(arg0);
	}
}
