import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!ve", name = "e", descriptor = "Lclient!ta;")
	public static Class14 aClass14_39;

	@OriginalMember(owner = "client!ve", name = "j", descriptor = "[I")
	public static int[] anIntArray350;

	@OriginalMember(owner = "client!ve", name = "m", descriptor = "Lclient!je;")
	public static Class3_Sub1 aClass3_Sub1_16;

	@OriginalMember(owner = "client!ve", name = "w", descriptor = "[I")
	public static int[] anIntArray351;

	@OriginalMember(owner = "client!ve", name = "y", descriptor = "I")
	public static int anInt2955;

	@OriginalMember(owner = "client!ve", name = "k", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1443 = Static14.method2017("Benutzen Sie die (WPasswort -=ndern(W Option");

	@OriginalMember(owner = "client!ve", name = "p", descriptor = "Lclient!kc;")
	private static Class36 aClass36_1445 = Static14.method2017("Private chat");

	@OriginalMember(owner = "client!ve", name = "l", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1444 = aClass36_1445;

	@OriginalMember(owner = "client!ve", name = "r", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1446 = Static14.method2017("Keine Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!ve", name = "t", descriptor = "I")
	public static int anInt2952 = 0;

	@OriginalMember(owner = "client!ve", name = "v", descriptor = "Lclient!ja;")
	public static Class31 aClass31_8 = new Class31(512);

	@OriginalMember(owner = "client!ve", name = "x", descriptor = "I")
	public static int anInt2954 = 0;

	@OriginalMember(owner = "client!ve", name = "z", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1447 = Static14.method2017("mapback");

	@OriginalMember(owner = "client!ve", name = "A", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1448 = Static14.method2017("_");

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V")
	public static synchronized void method2038() {
		if (Static104.method1913()) {
			Static112.method2033();
			Static89.aClass3_20 = null;
			Static27.aBoolean37 = false;
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!ac;IIZIIII)V")
	public static synchronized void method2039(@OriginalArg(0) Class3 arg0, @OriginalArg(1) int arg1, @OriginalArg(5) int arg2, @OriginalArg(7) int arg3) {
		if (!Static104.method1913()) {
			return;
		}
		Static51.anInt2601 = -1;
		Static8.anInt214 = arg1;
		Static94.anInt2478 = 10;
		Static65.anInt1674 = arg2;
		Static89.aClass3_20 = arg0;
		Static108.anInt2783 = arg3;
		Static92.anInt2413 = 0;
		Static27.aBoolean37 = true;
		Static10.aBoolean3 = false;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public static void method2040(@OriginalArg(0) Component arg0) {
		arg0.addMouseListener(Static52.aClass32_1);
		arg0.addMouseMotionListener(Static52.aClass32_1);
		arg0.addFocusListener(Static52.aClass32_1);
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)V")
	public static synchronized void method2041() {
		Static51.method1838();
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILclient!kc;Lclient!ac;IBILclient!kc;Z)V")
	public static synchronized void method2042(@OriginalArg(1) Class36 arg0, @OriginalArg(2) Class3 arg1, @OriginalArg(3) int arg2, @OriginalArg(6) Class36 arg3) {
		if (Static104.method1913()) {
			@Pc(17) int local17 = arg1.method932(arg0);
			@Pc(23) int local23 = arg1.method936(local17, arg3);
			method2039(arg1, arg2, local23, local17);
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)V")
	public static void method2043() {
		aClass36_1448 = null;
		aClass36_1445 = null;
		aClass36_1444 = null;
		anIntArray350 = null;
		aClass36_1446 = null;
		anIntArray351 = null;
		aClass14_39 = null;
		aClass36_1447 = null;
		aClass31_8 = null;
		aClass36_1443 = null;
		aClass3_Sub1_16 = null;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IZ)V")
	public static synchronized void method2044() {
		if (Static104.method1913()) {
			Static104.method1915();
			Static27.aBoolean37 = false;
			Static89.aClass3_20 = null;
		}
	}

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "(I)V")
	public static void method2045() {
		@Pc(9) int local9 = Static97.aClass2_Sub1_Sub1_Sub2_4.method458(Static95.aClass36_1210);
		@Pc(19) int local19;
		for (@Pc(11) int local11 = 0; local11 < Static43.anInt1141; local11++) {
			local19 = Static97.aClass2_Sub1_Sub1_Sub2_4.method462(Static90.aClass36Array40[local11]);
			if (local9 < local19) {
				local9 = local19;
			}
		}
		local9 += 8;
		local19 = Static43.anInt1141 * 15 + 21;
		@Pc(72) int local72;
		@Pc(93) int local93;
		if (Static59.anInt1578 > 4 && Static90.anInt2349 > 4 && Static59.anInt1578 < 516 && Static90.anInt2349 < 338) {
			Static94.anInt2475 = local9;
			Static24.anInt620 = 0;
			local72 = Static59.anInt1578 - local9 / 2 - 4;
			Static73.aBoolean82 = true;
			Static95.anInt2518 = Static43.anInt1141 * 15 + 22;
			if (local9 + local72 > 512) {
				local72 = 512 - local9;
			}
			local93 = Static90.anInt2349 - 4;
			if (local72 < 0) {
				local72 = 0;
			}
			Static61.anInt1612 = local72;
			if (local93 + local19 > 334) {
				local93 = 334 - local19;
			}
			if (local93 < 0) {
				local93 = 0;
			}
			Static77.anInt2023 = local93;
		}
		if (Static59.anInt1578 > 553 && Static90.anInt2349 > 205 && Static59.anInt1578 < 743 && Static90.anInt2349 < 466) {
			Static95.anInt2518 = Static43.anInt1141 * 15 + 22;
			Static94.anInt2475 = local9;
			Static24.anInt620 = 1;
			local72 = Static59.anInt1578 - local9 / 2 - 553;
			Static73.aBoolean82 = true;
			if (local72 < 0) {
				local72 = 0;
			} else if (local9 + local72 > 190) {
				local72 = 190 - local9;
			}
			Static61.anInt1612 = local72;
			local93 = Static90.anInt2349 - 205;
			if (local93 < 0) {
				local93 = 0;
			} else if (local93 + local19 > 261) {
				local93 = 261 - local19;
			}
			Static77.anInt2023 = local93;
		}
		if (Static59.anInt1578 <= 17 || Static90.anInt2349 <= 357 || Static59.anInt1578 >= 496 || Static90.anInt2349 >= 453) {
			return;
		}
		Static95.anInt2518 = Static43.anInt1141 * 15 + 22;
		Static73.aBoolean82 = true;
		Static24.anInt620 = 2;
		local93 = Static59.anInt1578 - local9 / 2 - 17;
		Static94.anInt2475 = local9;
		if (local93 < 0) {
			local93 = 0;
		} else if (local93 + local9 > 479) {
			local93 = 479 - local9;
		}
		@Pc(263) int local263 = Static90.anInt2349 - 357;
		Static61.anInt1612 = local93;
		if (local263 < 0) {
			local263 = 0;
		} else if (local19 + local263 > 96) {
			local263 = 96 - local19;
		}
		Static77.anInt2023 = local263;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IILclient!ac;IIZI)V")
	public static synchronized void method2046(@OriginalArg(2) Class3 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		if (!Static104.method1913()) {
			return;
		}
		Static65.anInt1674 = 0;
		Static27.aBoolean37 = true;
		Static94.anInt2478 = -1;
		Static8.anInt214 = arg3;
		Static89.aClass3_20 = arg0;
		Static108.anInt2783 = arg1;
		Static51.anInt2601 = -1;
		Static10.aBoolean3 = false;
		Static92.anInt2413 = arg2;
	}

	@OriginalMember(owner = "client!ve", name = "d", descriptor = "(I)V")
	public static synchronized void method2047() {
		if (!Static104.method1913()) {
			return;
		}
		if (Static27.aBoolean37) {
			@Pc(22) byte[] local22 = Static100.method1855(Static89.aClass3_20, Static92.anInt2413, Static108.anInt2783, Static65.anInt1674);
			if (local22 != null) {
				if (Static94.anInt2478 >= 0) {
					Static108.method1960(local22, Static94.anInt2478, Static8.anInt214, Static10.aBoolean3);
				} else if (Static51.anInt2601 >= 0) {
					Static38.method748(Static10.aBoolean3, local22, Static51.anInt2601, Static8.anInt214);
				} else {
					Static36.method735(Static8.anInt214, Static10.aBoolean3, local22);
				}
				Static89.aClass3_20 = null;
				Static27.aBoolean37 = false;
			}
		}
		Static43.method834();
	}

	@OriginalMember(owner = "client!ve", name = "e", descriptor = "(I)V")
	public static void method2048() {
		Static20.anIntArrayArrayArray3 = new int[4][105][105];
		Static89.aByteArrayArrayArray8 = new byte[4][104][104];
		Static53.anInt1481 = 99;
		Static110.anIntArray342 = new int[104];
		Static80.anIntArray245 = new int[104];
		Static77.anIntArray241 = new int[104];
		Static35.aByteArrayArrayArray5 = new byte[4][105][105];
		Static111.aByteArrayArrayArray9 = new byte[4][104][104];
		Static13.anIntArrayArray7 = new int[105][105];
		Static22.aByteArrayArrayArray4 = new byte[4][104][104];
		Static40.anIntArray256 = new int[104];
		Static10.aByteArrayArrayArray2 = new byte[4][104][104];
		Static61.anIntArray198 = new int[104];
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILclient!wd;BLclient!c;)V")
	public static void method2049(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub12 arg1, @OriginalArg(3) Class11 arg2) {
		@Pc(9) Class2_Sub10 local9 = new Class2_Sub10();
		local9.anInt1710 = arg1.method1399();
		local9.anInt1711 = arg1.method1412();
		local9.anIntArray217 = new int[local9.anInt1710];
		local9.anIntArray219 = new int[local9.anInt1710];
		local9.aByteArrayArrayArray7 = new byte[local9.anInt1710][][];
		local9.anIntArray216 = new int[local9.anInt1710];
		local9.aClass34Array2 = new Class34[local9.anInt1710];
		local9.aClass34Array1 = new Class34[local9.anInt1710];
		for (@Pc(56) int local56 = 0; local56 < local9.anInt1710; local56++) {
			try {
				@Pc(62) int local62 = arg1.method1399();
				@Pc(84) String local84;
				@Pc(95) String local95;
				@Pc(86) int local86;
				if (local62 == 0 || local62 == 1 || local62 == 2) {
					local84 = new String(arg1.method1404().method1033());
					local86 = 0;
					local95 = new String(arg1.method1404().method1033());
					if (local62 == 1) {
						local86 = arg1.method1412();
					}
					local9.anIntArray217[local56] = local62;
					local9.anIntArray219[local56] = local86;
					local9.aClass34Array2[local56] = arg2.method238(local95, Static29.method624(local84));
				} else if (local62 == 3 || local62 == 4) {
					local84 = new String(arg1.method1404().method1033());
					local95 = new String(arg1.method1404().method1033());
					local86 = arg1.method1399();
					@Pc(158) String[] local158 = new String[local86];
					for (@Pc(160) int local160 = 0; local160 < local86; local160++) {
						local158[local160] = new String(arg1.method1404().method1033());
					}
					@Pc(180) byte[][] local180 = new byte[local86][];
					@Pc(191) int local191;
					if (local62 == 3) {
						for (@Pc(185) int local185 = 0; local185 < local86; local185++) {
							local191 = arg1.method1412();
							local180[local185] = new byte[local191];
							arg1.method1414(local180[local185], local191);
						}
					}
					local9.anIntArray217[local56] = local62;
					@Pc(216) Class[] local216 = new Class[local86];
					for (local191 = 0; local191 < local86; local191++) {
						local216[local191] = Static29.method624(local158[local191]);
					}
					local9.aClass34Array1[local56] = arg2.method239(Static29.method624(local84), local216, local95);
					local9.aByteArrayArrayArray7[local56] = local180;
				}
			} catch (@Pc(251) ClassNotFoundException local251) {
				local9.anIntArray216[local56] = -1;
			} catch (@Pc(258) SecurityException local258) {
				local9.anIntArray216[local56] = -2;
			} catch (@Pc(265) NullPointerException local265) {
				local9.anIntArray216[local56] = -3;
			} catch (@Pc(272) Exception local272) {
				local9.anIntArray216[local56] = -4;
			} catch (@Pc(279) Throwable local279) {
				local9.anIntArray216[local56] = -5;
			}
		}
		Static90.aClass8_6.method187(local9);
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Z)V")
	public static void method2050() {
		Static8.aClass22_1.method716();
	}
}
