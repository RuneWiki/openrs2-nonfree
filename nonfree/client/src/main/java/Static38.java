import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!ff", name = "t", descriptor = "[I")
	public static int[] anIntArray73;

	@OriginalMember(owner = "client!ff", name = "y", descriptor = "Lclient!ba;")
	public static Class8 aClass8_1;

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "[I")
	public static int[] anIntArray72 = new int[32768];

	@OriginalMember(owner = "client!ff", name = "e", descriptor = "Lclient!qc;")
	private static Class60 aClass60_399 = Static121.method2047("To create a new account you need to");

	@OriginalMember(owner = "client!ff", name = "f", descriptor = "Z")
	public static boolean aBoolean28 = false;

	@OriginalMember(owner = "client!ff", name = "s", descriptor = "Lclient!qc;")
	private static Class60 aClass60_402 = Static121.method2047(" is already on your friend list");

	@OriginalMember(owner = "client!ff", name = "h", descriptor = "Lclient!qc;")
	public static Class60 aClass60_400 = aClass60_402;

	@OriginalMember(owner = "client!ff", name = "k", descriptor = "Lclient!qc;")
	public static Class60 aClass60_401 = aClass60_399;

	@OriginalMember(owner = "client!ff", name = "B", descriptor = "Lclient!qc;")
	public static Class60 aClass60_403 = Static121.method2047("(U0a )2 non)2existant gosub script)2num: ");

	@OriginalMember(owner = "client!ff", name = "G", descriptor = "Lclient!qc;")
	public static Class60 aClass60_404 = Static121.method2047("Titelbild geladen)3");

	@OriginalMember(owner = "client!ff", name = "I", descriptor = "I")
	public static int anInt965 = 0;

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(BLclient!jb;Ljava/lang/Object;)V")
	public static void method644(@OriginalArg(1) Class35 arg0, @OriginalArg(2) Object arg1) {
		if (arg0.anEventQueue1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 50 && arg0.anEventQueue1.peekEvent() != null; local11++) {
			Static13.method278(1L);
		}
		if (arg1 != null) {
			arg0.anEventQueue1.postEvent(new ActionEvent(arg1, 1001, "dummy"));
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(ZLclient!lc;Lclient!lc;ZI)Lclient!mb;")
	public static Class4_Sub4_Sub10 method645(@OriginalArg(1) Class40 arg0, @OriginalArg(2) Class40 arg1, @OriginalArg(4) int arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(12) int[] local12 = arg0.method1099(arg2);
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(24) byte[] local24 = arg0.method1111(arg2, local12[local14]);
			if (local24 == null) {
				local7 = false;
			} else {
				@Pc(44) int local44 = (local24[0] & 0xFF) << 8 | local24[1] & 0xFF;
				@Pc(60) byte[] local60 = arg1.method1111(local44, 0);
				if (local60 == null) {
					local7 = false;
				}
			}
		}
		if (!local7) {
			return null;
		}
		try {
			return new Class4_Sub4_Sub10(arg0, arg1, arg2, false);
		} catch (@Pc(82) Exception local82) {
			return null;
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)V")
	public static void method646() {
		aClass60_400 = null;
		anIntArray73 = null;
		aClass60_401 = null;
		anIntArray72 = null;
		aClass60_399 = null;
		aClass60_404 = null;
		aClass8_1 = null;
		aClass60_402 = null;
		aClass60_403 = null;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(II)V")
	public static void method647(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return;
		}
		@Pc(13) int local13 = Static36.anIntArray71[arg0];
		@Pc(17) int local17 = Static20.anIntArray32[arg0];
		if (local13 >= 2000) {
			local13 -= 2000;
		}
		@Pc(25) int local25 = Static47.anIntArray116[arg0];
		@Pc(29) int local29 = Static76.anIntArray194[arg0];
		if (local13 == 9) {
			Static56.aClass4_Sub13_Sub1_1.method1265(21);
			Static56.aClass4_Sub13_Sub1_1.method1207(Static52.anInt1348);
			Static56.aClass4_Sub13_Sub1_1.method1221(Static89.anInt2076);
			Static56.aClass4_Sub13_Sub1_1.method1207(local25);
			Static56.aClass4_Sub13_Sub1_1.method1218(local17);
		}
		@Pc(85) boolean local85;
		if (local13 == 21) {
			local85 = Static99.method1760(2, Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anIntArray288[0], 0, 0, Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anIntArray286[0], 0, local17, 0, 0, local25, false);
			if (!local85) {
				Static99.method1760(2, Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anIntArray288[0], 0, 0, Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anIntArray286[0], 1, local17, 1, 0, local25, false);
			}
			Static120.anInt1936 = Static128.anInt2648;
			Static35.anInt914 = 0;
			Static94.anInt2308 = Static22.anInt652;
			Static14.anInt3005 = 2;
			Static56.aClass4_Sub13_Sub1_1.method1265(173);
			Static56.aClass4_Sub13_Sub1_1.method1252(Static99.anInt2424 + local17);
			Static56.aClass4_Sub13_Sub1_1.method1208(local25 + Static106.anInt2518);
			Static56.aClass4_Sub13_Sub1_1.method1220(local29);
		}
		if (local13 == 36) {
			local85 = Static99.method1760(2, Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anIntArray288[0], 0, 0, Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anIntArray286[0], 0, local17, 0, 0, local25, false);
			if (!local85) {
				Static99.method1760(2, Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anIntArray288[0], 0, 0, Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anIntArray286[0], 1, local17, 1, 0, local25, false);
			}
			Static14.anInt3005 = 2;
			Static120.anInt1936 = Static128.anInt2648;
			Static35.anInt914 = 0;
			Static94.anInt2308 = Static22.anInt652;
			Static56.aClass4_Sub13_Sub1_1.method1265(196);
			Static56.aClass4_Sub13_Sub1_1.method1220(local29);
			Static56.aClass4_Sub13_Sub1_1.method1208(Static52.anInt1348);
			Static56.aClass4_Sub13_Sub1_1.method1221(Static89.anInt2076);
			Static56.aClass4_Sub13_Sub1_1.method1252(local17 + Static99.anInt2424);
			Static56.aClass4_Sub13_Sub1_1.method1208(local25 + Static106.anInt2518);
		}
		@Pc(231) Class4_Sub4_Sub1_Sub2_Sub2 local231;
		if (local13 == 13) {
			local231 = Static59.aClass4_Sub4_Sub1_Sub2_Sub2Array1[local29];
			if (local231 != null) {
				Static99.method1760(2, Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anIntArray288[0], 0, 0, Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anIntArray286[0], 1, local231.anIntArray288[0], 1, 0, local231.anIntArray286[0], false);
				Static35.anInt914 = 0;
				Static120.anInt1936 = Static128.anInt2648;
				Static94.anInt2308 = Static22.anInt652;
				Static14.anInt3005 = 2;
				Static56.aClass4_Sub13_Sub1_1.method1265(35);
				Static56.aClass4_Sub13_Sub1_1.method1252(local29);
			}
		}
		@Pc(296) Class4_Sub4_Sub1_Sub2_Sub1 local296;
		if (local13 == 1004) {
			Static94.anInt2308 = Static22.anInt652;
			Static35.anInt914 = 0;
			Static120.anInt1936 = Static128.anInt2648;
			Static14.anInt3005 = 2;
			local296 = Static120.aClass4_Sub4_Sub1_Sub2_Sub1Array2[local29];
			if (local296 != null) {
				@Pc(301) Class4_Sub4_Sub11 local301 = local296.aClass4_Sub4_Sub11_1;
				if (local301.anIntArray201 != null) {
					local301 = local301.method1494();
				}
				if (local301 != null) {
					Static56.aClass4_Sub13_Sub1_1.method1265(88);
					Static56.aClass4_Sub13_Sub1_1.method1207(local301.anInt2001);
				}
			}
		}
		if (local13 == 6) {
			local85 = Static99.method1760(2, Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anIntArray288[0], 0, 0, Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anIntArray286[0], 0, local17, 0, 0, local25, false);
			if (!local85) {
				Static99.method1760(2, Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anIntArray288[0], 0, 0, Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anIntArray286[0], 1, local17, 1, 0, local25, false);
			}
			Static94.anInt2308 = Static22.anInt652;
			Static14.anInt3005 = 2;
			Static120.anInt1936 = Static128.anInt2648;
			Static35.anInt914 = 0;
			Static56.aClass4_Sub13_Sub1_1.method1265(133);
			Static56.aClass4_Sub13_Sub1_1.method1208(local25 + Static106.anInt2518);
			Static56.aClass4_Sub13_Sub1_1.method1220(local29);
			Static56.aClass4_Sub13_Sub1_1.method1207(Static99.anInt2424 + local17);
		}
		if (local13 == 14 || local13 == 1002) {
			Static16.method285(local17, Static9.aClass60Array2[arg0], local25, local29);
		}
		if (local13 == 12) {
			Static56.aClass4_Sub13_Sub1_1.method1265(215);
			Static56.aClass4_Sub13_Sub1_1.method1220(local29);
			Static56.aClass4_Sub13_Sub1_1.method1208(local25);
			Static56.aClass4_Sub13_Sub1_1.method1218(local17);
			Static89.anInt2075 = 0;
			Static32.aClass4_Sub17_4 = Static16.method283(local17);
			Static90.anInt2139 = local25;
		}
		if (local13 == 41 && Static101.method1806(local17, local25, local29)) {
			Static56.aClass4_Sub13_Sub1_1.method1265(101);
			Static56.aClass4_Sub13_Sub1_1.method1207(Static52.anInt1348);
			Static56.aClass4_Sub13_Sub1_1.method1256(Static89.anInt2076);
			Static56.aClass4_Sub13_Sub1_1.method1220(local29 >> 14 & 0x7FFF);
			Static56.aClass4_Sub13_Sub1_1.method1207(Static106.anInt2518 + local25);
			Static56.aClass4_Sub13_Sub1_1.method1208(local17 + Static99.anInt2424);
		}
		if (local13 == 10 && Static11.aClass4_Sub17_1 == null) {
			Static27.method521(local17, local25);
			Static11.aClass4_Sub17_1 = Static23.method459(local17, local25);
			Static130.method2133(Static11.aClass4_Sub17_1);
		}
		if (local13 == 1006) {
			Static101.method1806(local17, local25, local29);
			Static56.aClass4_Sub13_Sub1_1.method1265(32);
			Static56.aClass4_Sub13_Sub1_1.method1207(local17 + Static99.anInt2424);
			Static56.aClass4_Sub13_Sub1_1.method1208(local29 >> 14 & 0x7FFF);
			Static56.aClass4_Sub13_Sub1_1.method1208(local25 + Static106.anInt2518);
		}
		@Pc(566) Class4_Sub17 local566;
		if (local13 == 44) {
			Static26.method511();
			local566 = Static16.method283(local17);
			Static87.anInt2046 = local17;
			Static26.anInt724 = 1;
			Static117.anInt2792 = local25;
			Static126.anInt2948 = local29;
			Static130.method2133(local566);
			Static90.aClass60_874 = Static125.method2072(new Class60[] { Static125.aClass60_1173, Static24.method475(local29).aClass60_870, Static117.aClass60_1117 });
			if (Static90.aClass60_874 == null) {
				Static90.aClass60_874 = Static47.aClass60_484;
			}
			return;
		}
		if (local13 == 11) {
			local296 = Static120.aClass4_Sub4_Sub1_Sub2_Sub1Array2[local29];
			if (local296 != null) {
				Static99.method1760(2, Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anIntArray288[0], 0, 0, Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anIntArray286[0], 1, local296.anIntArray288[0], 1, 0, local296.anIntArray286[0], false);
				Static35.anInt914 = 0;
				Static14.anInt3005 = 2;
				Static120.anInt1936 = Static128.anInt2648;
				Static94.anInt2308 = Static22.anInt652;
				Static56.aClass4_Sub13_Sub1_1.method1265(181);
				Static56.aClass4_Sub13_Sub1_1.method1220(local29);
			}
		}
		if (local13 == 31) {
			local231 = Static59.aClass4_Sub4_Sub1_Sub2_Sub2Array1[local29];
			if (local231 != null) {
				Static99.method1760(2, Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anIntArray288[0], 0, 0, Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anIntArray286[0], 1, local231.anIntArray288[0], 1, 0, local231.anIntArray286[0], false);
				Static35.anInt914 = 0;
				Static14.anInt3005 = 2;
				Static94.anInt2308 = Static22.anInt652;
				Static120.anInt1936 = Static128.anInt2648;
				Static56.aClass4_Sub13_Sub1_1.method1265(60);
				Static56.aClass4_Sub13_Sub1_1.method1220(local29);
			}
		}
		if (local13 == 22) {
			Static56.aClass4_Sub13_Sub1_1.method1265(29);
			Static56.aClass4_Sub13_Sub1_1.method1252(local25);
			Static56.aClass4_Sub13_Sub1_1.method1218(Static89.anInt2076);
			Static56.aClass4_Sub13_Sub1_1.method1208(local29);
			Static56.aClass4_Sub13_Sub1_1.method1218(local17);
			Static56.aClass4_Sub13_Sub1_1.method1252(Static52.anInt1348);
			Static89.anInt2075 = 0;
			Static32.aClass4_Sub17_4 = Static16.method283(local17);
			Static90.anInt2139 = local25;
		}
		if (local13 == 42) {
			Static56.aClass4_Sub13_Sub1_1.method1265(217);
			Static56.aClass4_Sub13_Sub1_1.method1256(local17);
			Static56.aClass4_Sub13_Sub1_1.method1252(local25);
			Static56.aClass4_Sub13_Sub1_1.method1208(local29);
			Static89.anInt2075 = 0;
			Static32.aClass4_Sub17_4 = Static16.method283(local17);
			Static90.anInt2139 = local25;
		}
		if (local13 == 35) {
			local296 = Static120.aClass4_Sub4_Sub1_Sub2_Sub1Array2[local29];
			if (local296 != null) {
				Static99.method1760(2, Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anIntArray288[0], 0, 0, Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anIntArray286[0], 1, local296.anIntArray288[0], 1, 0, local296.anIntArray286[0], false);
				Static14.anInt3005 = 2;
				Static35.anInt914 = 0;
				Static94.anInt2308 = Static22.anInt652;
				Static120.anInt1936 = Static128.anInt2648;
				Static56.aClass4_Sub13_Sub1_1.method1265(155);
				Static56.aClass4_Sub13_Sub1_1.method1220(local29);
			}
		}
		if (local13 == 43) {
			Static61.method1125();
		}
		if (local13 == 18) {
			local231 = Static59.aClass4_Sub4_Sub1_Sub2_Sub2Array1[local29];
			if (local231 != null) {
				Static99.method1760(2, Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anIntArray288[0], 0, 0, Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anIntArray286[0], 1, local231.anIntArray288[0], 1, 0, local231.anIntArray286[0], false);
				Static35.anInt914 = 0;
				Static120.anInt1936 = Static128.anInt2648;
				Static14.anInt3005 = 2;
				Static94.anInt2308 = Static22.anInt652;
				Static56.aClass4_Sub13_Sub1_1.method1265(97);
				Static56.aClass4_Sub13_Sub1_1.method1252(local29);
			}
		}
		if (local13 == 40) {
			Static56.aClass4_Sub13_Sub1_1.method1265(167);
			Static56.aClass4_Sub13_Sub1_1.method1219(local17);
			Static56.aClass4_Sub13_Sub1_1.method1207(local29);
			Static56.aClass4_Sub13_Sub1_1.method1252(local25);
			Static89.anInt2075 = 0;
			Static32.aClass4_Sub17_4 = Static16.method283(local17);
			Static90.anInt2139 = local25;
		}
		if (local13 == 37) {
			local296 = Static120.aClass4_Sub4_Sub1_Sub2_Sub1Array2[local29];
			if (local296 != null) {
				Static99.method1760(2, Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anIntArray288[0], 0, 0, Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anIntArray286[0], 1, local296.anIntArray288[0], 1, 0, local296.anIntArray286[0], false);
				Static14.anInt3005 = 2;
				Static94.anInt2308 = Static22.anInt652;
				Static35.anInt914 = 0;
				Static120.anInt1936 = Static128.anInt2648;
				Static56.aClass4_Sub13_Sub1_1.method1265(170);
				Static56.aClass4_Sub13_Sub1_1.method1207(local29);
			}
		}
		if (local13 == 4) {
			Static7.aClass28_3.method776(Static129.anInt3003, local25, local17);
		}
		@Pc(1032) int local1032;
		if (local13 == 2) {
			Static56.aClass4_Sub13_Sub1_1.method1265(80);
			Static56.aClass4_Sub13_Sub1_1.method1221(local17);
			local566 = Static16.method283(local17);
			if (local566.anIntArrayArray20 != null && local566.anIntArrayArray20[0][0] == 5) {
				local1032 = local566.anIntArrayArray20[0][1];
				if (Static62.anIntArray168[local1032] != local566.anIntArray222[0]) {
					Static62.anIntArray168[local1032] = local566.anIntArray222[0];
					Static108.method1851(local1032);
				}
			}
		}
		if (local13 == 24) {
			local231 = Static59.aClass4_Sub4_Sub1_Sub2_Sub2Array1[local29];
			if (local231 != null) {
				Static99.method1760(2, Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anIntArray288[0], 0, 0, Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anIntArray286[0], 1, local231.anIntArray288[0], 1, 0, local231.anIntArray286[0], false);
				Static14.anInt3005 = 2;
				Static120.anInt1936 = Static128.anInt2648;
				Static35.anInt914 = 0;
				Static94.anInt2308 = Static22.anInt652;
				Static56.aClass4_Sub13_Sub1_1.method1265(166);
				Static56.aClass4_Sub13_Sub1_1.method1252(local29);
				Static56.aClass4_Sub13_Sub1_1.method1208(Static117.anInt2792);
				Static56.aClass4_Sub13_Sub1_1.method1219(Static87.anInt2046);
				Static56.aClass4_Sub13_Sub1_1.method1207(Static126.anInt2948);
			}
		}
		if (local13 == 8) {
			local85 = Static99.method1760(2, Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anIntArray288[0], 0, 0, Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anIntArray286[0], 0, local17, 0, 0, local25, false);
			if (!local85) {
				Static99.method1760(2, Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anIntArray288[0], 0, 0, Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anIntArray286[0], 1, local17, 1, 0, local25, false);
			}
			Static14.anInt3005 = 2;
			Static35.anInt914 = 0;
			Static120.anInt1936 = Static128.anInt2648;
			Static94.anInt2308 = Static22.anInt652;
			Static56.aClass4_Sub13_Sub1_1.method1265(169);
			Static56.aClass4_Sub13_Sub1_1.method1252(local25 + Static106.anInt2518);
			Static56.aClass4_Sub13_Sub1_1.method1220(local29);
			Static56.aClass4_Sub13_Sub1_1.method1220(local17 + Static99.anInt2424);
		}
		if (local13 == 47) {
			local231 = Static59.aClass4_Sub4_Sub1_Sub2_Sub2Array1[local29];
			if (local231 != null) {
				Static99.method1760(2, Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anIntArray288[0], 0, 0, Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anIntArray286[0], 1, local231.anIntArray288[0], 1, 0, local231.anIntArray286[0], false);
				Static120.anInt1936 = Static128.anInt2648;
				Static14.anInt3005 = 2;
				Static35.anInt914 = 0;
				Static94.anInt2308 = Static22.anInt652;
				Static56.aClass4_Sub13_Sub1_1.method1265(139);
				Static56.aClass4_Sub13_Sub1_1.method1219(Static89.anInt2076);
				Static56.aClass4_Sub13_Sub1_1.method1207(Static52.anInt1348);
				Static56.aClass4_Sub13_Sub1_1.method1207(local29);
			}
		}
		if (local13 == 20) {
			Static56.aClass4_Sub13_Sub1_1.method1265(220);
			Static56.aClass4_Sub13_Sub1_1.method1218(local17);
			Static56.aClass4_Sub13_Sub1_1.method1220(local29);
			Static56.aClass4_Sub13_Sub1_1.method1207(local25);
			Static89.anInt2075 = 0;
			Static32.aClass4_Sub17_4 = Static16.method283(local17);
			Static90.anInt2139 = local25;
		}
		if (local13 == 1007) {
			local566 = Static16.method283(local17);
			if (local566 == null || local566.anIntArray225[local25] < 100000) {
				Static56.aClass4_Sub13_Sub1_1.method1265(176);
				Static56.aClass4_Sub13_Sub1_1.method1208(local29);
			} else {
				Static73.method1386(Static125.method2072(new Class60[] { Static120.method1450(local566.anIntArray225[local25]), Static125.aClass60_1176, Static24.method475(local29).aClass60_870 }), 0, Static22.aClass60_241);
			}
			Static89.anInt2075 = 0;
			Static32.aClass4_Sub17_4 = Static16.method283(local17);
			Static90.anInt2139 = local25;
		}
		if (local13 == 58) {
			Static101.method1806(local17, local25, local29);
			Static56.aClass4_Sub13_Sub1_1.method1265(51);
			Static56.aClass4_Sub13_Sub1_1.method1208(local29 >> 14 & 0x7FFF);
			Static56.aClass4_Sub13_Sub1_1.method1252(local17 + Static99.anInt2424);
			Static56.aClass4_Sub13_Sub1_1.method1252(local25 + Static106.anInt2518);
		}
		if (local13 == 19) {
			local85 = Static99.method1760(2, Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anIntArray288[0], 0, 0, Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anIntArray286[0], 0, local17, 0, 0, local25, false);
			if (!local85) {
				Static99.method1760(2, Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anIntArray288[0], 0, 0, Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anIntArray286[0], 1, local17, 1, 0, local25, false);
			}
			Static35.anInt914 = 0;
			Static14.anInt3005 = 2;
			Static120.anInt1936 = Static128.anInt2648;
			Static94.anInt2308 = Static22.anInt652;
			Static56.aClass4_Sub13_Sub1_1.method1265(242);
			Static56.aClass4_Sub13_Sub1_1.method1207(Static106.anInt2518 + local25);
			Static56.aClass4_Sub13_Sub1_1.method1207(Static99.anInt2424 + local17);
			Static56.aClass4_Sub13_Sub1_1.method1220(local29);
		}
		if (local13 == 28) {
			local231 = Static59.aClass4_Sub4_Sub1_Sub2_Sub2Array1[local29];
			if (local231 != null) {
				Static99.method1760(2, Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anIntArray288[0], 0, 0, Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anIntArray286[0], 1, local231.anIntArray288[0], 1, 0, local231.anIntArray286[0], false);
				Static94.anInt2308 = Static22.anInt652;
				Static35.anInt914 = 0;
				Static14.anInt3005 = 2;
				Static120.anInt1936 = Static128.anInt2648;
				Static56.aClass4_Sub13_Sub1_1.method1265(188);
				Static56.aClass4_Sub13_Sub1_1.method1220(local29);
			}
		}
		if (local13 == 38) {
			local296 = Static120.aClass4_Sub4_Sub1_Sub2_Sub1Array2[local29];
			if (local296 != null) {
				Static99.method1760(2, Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anIntArray288[0], 0, 0, Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anIntArray286[0], 1, local296.anIntArray288[0], 1, 0, local296.anIntArray286[0], false);
				Static120.anInt1936 = Static128.anInt2648;
				Static94.anInt2308 = Static22.anInt652;
				Static14.anInt3005 = 2;
				Static35.anInt914 = 0;
				Static56.aClass4_Sub13_Sub1_1.method1265(109);
				Static56.aClass4_Sub13_Sub1_1.method1252(local29);
				Static56.aClass4_Sub13_Sub1_1.method1219(Static89.anInt2076);
				Static56.aClass4_Sub13_Sub1_1.method1252(Static52.anInt1348);
			}
		}
		if (local13 == 15) {
			local231 = Static59.aClass4_Sub4_Sub1_Sub2_Sub2Array1[local29];
			if (local231 != null) {
				Static99.method1760(2, Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anIntArray288[0], 0, 0, Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anIntArray286[0], 1, local231.anIntArray288[0], 1, 0, local231.anIntArray286[0], false);
				Static94.anInt2308 = Static22.anInt652;
				Static14.anInt3005 = 2;
				Static35.anInt914 = 0;
				Static120.anInt1936 = Static128.anInt2648;
				Static56.aClass4_Sub13_Sub1_1.method1265(81);
				Static56.aClass4_Sub13_Sub1_1.method1207(local29);
			}
		}
		if (local13 == 7) {
			local85 = Static99.method1760(2, Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anIntArray288[0], 0, 0, Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anIntArray286[0], 0, local17, 0, 0, local25, false);
			if (!local85) {
				Static99.method1760(2, Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anIntArray288[0], 0, 0, Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anIntArray286[0], 1, local17, 1, 0, local25, false);
			}
			Static35.anInt914 = 0;
			Static120.anInt1936 = Static128.anInt2648;
			Static94.anInt2308 = Static22.anInt652;
			Static14.anInt3005 = 2;
			Static56.aClass4_Sub13_Sub1_1.method1265(38);
			Static56.aClass4_Sub13_Sub1_1.method1252(local29);
			Static56.aClass4_Sub13_Sub1_1.method1252(local17 + Static99.anInt2424);
			Static56.aClass4_Sub13_Sub1_1.method1252(Static106.anInt2518 + local25);
		}
		if (local13 == 1) {
			Static101.method1806(local17, local25, local29);
			Static56.aClass4_Sub13_Sub1_1.method1265(192);
			Static56.aClass4_Sub13_Sub1_1.method1207(local29 >> 14 & 0x7FFF);
			Static56.aClass4_Sub13_Sub1_1.method1252(local25 + Static106.anInt2518);
			Static56.aClass4_Sub13_Sub1_1.method1220(local17 + Static99.anInt2424);
		}
		if (local13 == 3) {
			Static56.aClass4_Sub13_Sub1_1.method1265(44);
			Static56.aClass4_Sub13_Sub1_1.method1218(local17);
			Static56.aClass4_Sub13_Sub1_1.method1220(local29);
			Static56.aClass4_Sub13_Sub1_1.method1207(local25);
			Static89.anInt2075 = 0;
			Static32.aClass4_Sub17_4 = Static16.method283(local17);
			Static90.anInt2139 = local25;
		}
		if (local13 == 1005) {
			Static94.anInt2308 = Static22.anInt652;
			Static14.anInt3005 = 2;
			Static120.anInt1936 = Static128.anInt2648;
			Static35.anInt914 = 0;
			Static56.aClass4_Sub13_Sub1_1.method1265(176);
			Static56.aClass4_Sub13_Sub1_1.method1208(local29);
		}
		if (local13 == 16) {
			Static56.aClass4_Sub13_Sub1_1.method1265(207);
			Static56.aClass4_Sub13_Sub1_1.method1220(local25);
			Static56.aClass4_Sub13_Sub1_1.method1252(local29);
			Static56.aClass4_Sub13_Sub1_1.method1256(local17);
			Static89.anInt2075 = 0;
			Static32.aClass4_Sub17_4 = Static16.method283(local17);
			Static90.anInt2139 = local25;
		}
		if (local13 == 25) {
			@Pc(1875) boolean local1875 = true;
			local566 = Static16.method283(local17);
			if (local566.anInt2227 > 0) {
				local1875 = Static29.method581(local566);
			}
			if (local1875) {
				Static56.aClass4_Sub13_Sub1_1.method1265(80);
				Static56.aClass4_Sub13_Sub1_1.method1221(local17);
			}
		}
		if (local13 == 57) {
			local85 = Static99.method1760(2, Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anIntArray288[0], 0, 0, Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anIntArray286[0], 0, local17, 0, 0, local25, false);
			if (!local85) {
				Static99.method1760(2, Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anIntArray288[0], 0, 0, Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anIntArray286[0], 1, local17, 1, 0, local25, false);
			}
			Static94.anInt2308 = Static22.anInt652;
			Static120.anInt1936 = Static128.anInt2648;
			Static14.anInt3005 = 2;
			Static35.anInt914 = 0;
			Static56.aClass4_Sub13_Sub1_1.method1265(209);
			Static56.aClass4_Sub13_Sub1_1.method1208(Static126.anInt2948);
			Static56.aClass4_Sub13_Sub1_1.method1252(local29);
			Static56.aClass4_Sub13_Sub1_1.method1256(Static87.anInt2046);
			Static56.aClass4_Sub13_Sub1_1.method1252(local25 + Static106.anInt2518);
			Static56.aClass4_Sub13_Sub1_1.method1208(local17 + Static99.anInt2424);
			Static56.aClass4_Sub13_Sub1_1.method1220(Static117.anInt2792);
		}
		if (local13 == 48) {
			Static56.aClass4_Sub13_Sub1_1.method1265(231);
			Static56.aClass4_Sub13_Sub1_1.method1256(local17);
			Static56.aClass4_Sub13_Sub1_1.method1220(local29);
			Static56.aClass4_Sub13_Sub1_1.method1207(local25);
			Static89.anInt2075 = 0;
			Static32.aClass4_Sub17_4 = Static16.method283(local17);
			Static90.anInt2139 = local25;
		}
		if (local13 == 46) {
			Static101.method1806(local17, local25, local29);
			Static56.aClass4_Sub13_Sub1_1.method1265(135);
			Static56.aClass4_Sub13_Sub1_1.method1207(local25 + Static106.anInt2518);
			Static56.aClass4_Sub13_Sub1_1.method1207(local29 >> 14 & 0x7FFF);
			Static56.aClass4_Sub13_Sub1_1.method1208(local17 + Static99.anInt2424);
		}
		if (local13 == 39) {
			Static56.aClass4_Sub13_Sub1_1.method1265(23);
			Static56.aClass4_Sub13_Sub1_1.method1220(local29);
			Static56.aClass4_Sub13_Sub1_1.method1208(local25);
			Static56.aClass4_Sub13_Sub1_1.method1221(local17);
			Static89.anInt2075 = 0;
			Static32.aClass4_Sub17_4 = Static16.method283(local17);
			Static90.anInt2139 = local25;
		}
		if (local13 == 1001) {
			Static94.anInt2308 = Static22.anInt652;
			Static120.anInt1936 = Static128.anInt2648;
			Static14.anInt3005 = 2;
			Static35.anInt914 = 0;
			Static56.aClass4_Sub13_Sub1_1.method1265(226);
			Static56.aClass4_Sub13_Sub1_1.method1252(local29 >> 14 & 0x7FFF);
		}
		if (local13 == 49) {
			local296 = Static120.aClass4_Sub4_Sub1_Sub2_Sub1Array2[local29];
			if (local296 != null) {
				Static99.method1760(2, Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anIntArray288[0], 0, 0, Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anIntArray286[0], 1, local296.anIntArray288[0], 1, 0, local296.anIntArray286[0], false);
				Static35.anInt914 = 0;
				Static94.anInt2308 = Static22.anInt652;
				Static120.anInt1936 = Static128.anInt2648;
				Static14.anInt3005 = 2;
				Static56.aClass4_Sub13_Sub1_1.method1265(106);
				Static56.aClass4_Sub13_Sub1_1.method1220(local29);
			}
		}
		if (local13 == 23) {
			Static101.method1806(local17, local25, local29);
			Static56.aClass4_Sub13_Sub1_1.method1265(42);
			Static56.aClass4_Sub13_Sub1_1.method1252(local17 + Static99.anInt2424);
			Static56.aClass4_Sub13_Sub1_1.method1220(local29 >> 14 & 0x7FFF);
			Static56.aClass4_Sub13_Sub1_1.method1220(local25 + Static106.anInt2518);
		}
		if (local13 == 33 && Static101.method1806(local17, local25, local29)) {
			Static56.aClass4_Sub13_Sub1_1.method1265(211);
			Static56.aClass4_Sub13_Sub1_1.method1252(local29 >> 14 & 0x7FFF);
			Static56.aClass4_Sub13_Sub1_1.method1252(Static117.anInt2792);
			Static56.aClass4_Sub13_Sub1_1.method1208(Static99.anInt2424 + local17);
			Static56.aClass4_Sub13_Sub1_1.method1252(local25 + Static106.anInt2518);
			Static56.aClass4_Sub13_Sub1_1.method1221(Static87.anInt2046);
			Static56.aClass4_Sub13_Sub1_1.method1220(Static126.anInt2948);
		}
		if (local13 == 17) {
			local296 = Static120.aClass4_Sub4_Sub1_Sub2_Sub1Array2[local29];
			if (local296 != null) {
				Static99.method1760(2, Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anIntArray288[0], 0, 0, Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anIntArray286[0], 1, local296.anIntArray288[0], 1, 0, local296.anIntArray286[0], false);
				Static14.anInt3005 = 2;
				Static120.anInt1936 = Static128.anInt2648;
				Static35.anInt914 = 0;
				Static94.anInt2308 = Static22.anInt652;
				Static56.aClass4_Sub13_Sub1_1.method1265(197);
				Static56.aClass4_Sub13_Sub1_1.method1207(Static126.anInt2948);
				Static56.aClass4_Sub13_Sub1_1.method1207(local29);
				Static56.aClass4_Sub13_Sub1_1.method1218(Static87.anInt2046);
				Static56.aClass4_Sub13_Sub1_1.method1252(Static117.anInt2792);
			}
		}
		if (local13 == 30) {
			Static56.aClass4_Sub13_Sub1_1.method1265(114);
			Static56.aClass4_Sub13_Sub1_1.method1220(local25);
			Static56.aClass4_Sub13_Sub1_1.method1219(local17);
			Static56.aClass4_Sub13_Sub1_1.method1252(local29);
			Static89.anInt2075 = 0;
			Static32.aClass4_Sub17_4 = Static16.method283(local17);
			Static90.anInt2139 = local25;
		}
		if (local13 == 29) {
			local296 = Static120.aClass4_Sub4_Sub1_Sub2_Sub1Array2[local29];
			if (local296 != null) {
				Static99.method1760(2, Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anIntArray288[0], 0, 0, Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anIntArray286[0], 1, local296.anIntArray288[0], 1, 0, local296.anIntArray286[0], false);
				Static120.anInt1936 = Static128.anInt2648;
				Static14.anInt3005 = 2;
				Static94.anInt2308 = Static22.anInt652;
				Static35.anInt914 = 0;
				Static56.aClass4_Sub13_Sub1_1.method1265(41);
				Static56.aClass4_Sub13_Sub1_1.method1207(local29);
			}
		}
		if (local13 == 5) {
			Static56.aClass4_Sub13_Sub1_1.method1265(80);
			Static56.aClass4_Sub13_Sub1_1.method1221(local17);
			local566 = Static16.method283(local17);
			if (local566.anIntArrayArray20 != null && local566.anIntArrayArray20[0][0] == 5) {
				local1032 = local566.anIntArrayArray20[0][1];
				Static62.anIntArray168[local1032] = 1 - Static62.anIntArray168[local1032];
				Static108.method1851(local1032);
			}
		}
		if (local13 == 34) {
			Static56.aClass4_Sub13_Sub1_1.method1265(164);
			Static56.aClass4_Sub13_Sub1_1.method1256(Static87.anInt2046);
			Static56.aClass4_Sub13_Sub1_1.method1220(Static117.anInt2792);
			Static56.aClass4_Sub13_Sub1_1.method1218(local17);
			Static56.aClass4_Sub13_Sub1_1.method1208(local29);
			Static56.aClass4_Sub13_Sub1_1.method1252(Static126.anInt2948);
			Static56.aClass4_Sub13_Sub1_1.method1220(local25);
			Static89.anInt2075 = 0;
			Static32.aClass4_Sub17_4 = Static16.method283(local17);
			Static90.anInt2139 = local25;
		}
		if (local13 == 45) {
			Static56.aClass4_Sub13_Sub1_1.method1265(105);
			Static56.aClass4_Sub13_Sub1_1.method1207(local25);
			Static56.aClass4_Sub13_Sub1_1.method1220(local29);
			Static56.aClass4_Sub13_Sub1_1.method1221(local17);
			Static89.anInt2075 = 0;
			Static32.aClass4_Sub17_4 = Static16.method283(local17);
			Static90.anInt2139 = local25;
		}
		if (local13 != 32) {
			if (Static26.anInt724 != 0) {
				Static26.anInt724 = 0;
				Static130.method2133(Static16.method283(Static87.anInt2046));
			}
			if (Static71.aBoolean70) {
				Static26.method511();
			}
			return;
		}
		local566 = Static23.method459(local17, local25);
		if (local566 == null) {
			return;
		}
		Static26.method511();
		Static76.method1415(Static30.method589(Static73.method1384(local566)), local25, local17);
		Static26.anInt724 = 0;
		Static92.aClass60_891 = Static108.method1848(local566);
		if (Static92.aClass60_891 == null) {
			Static92.aClass60_891 = Static6.aClass60_34;
		}
		if (local566.aBoolean103) {
			Static94.aClass60_916 = Static125.method2072(new Class60[] { local566.aClass60_892, Static117.aClass60_1117 });
			return;
		}
		Static94.aClass60_916 = Static125.method2072(new Class60[] { Static88.aClass60_849, local566.aClass60_893, Static117.aClass60_1117 });
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(ILclient!sd;III)V")
	public static void method648(@OriginalArg(1) Class4_Sub4_Sub1_Sub2_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 == Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1 || Static25.anInt693 >= 400) {
			return;
		}
		@Pc(56) Class60 local56;
		if (arg0.anInt2650 == 0) {
			local56 = Static125.method2072(new Class60[] { arg0.aClass60_1066, Static9.method137(arg0.anInt2658, Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anInt2658), Static81.aClass60_793, Static29.aClass60_328, Static120.method1450(arg0.anInt2658), Static60.aClass60_939 });
		} else {
			local56 = Static125.method2072(new Class60[] { arg0.aClass60_1066, Static81.aClass60_793, Static86.aClass60_273, Static120.method1450(arg0.anInt2650), Static60.aClass60_939 });
		}
		@Pc(128) int local128;
		if (Static26.anInt724 == 1) {
			Static41.method698(arg3, arg2, Static125.method2072(new Class60[] { Static90.aClass60_874, Static47.aClass60_485, local56 }), 24, arg1, Static34.aClass60_372);
		} else if (!Static71.aBoolean70) {
			for (local128 = 4; local128 >= 0; local128--) {
				if (Static10.aClass60Array3[local128] != null) {
					@Pc(140) short local140 = 0;
					if (Static10.aClass60Array3[local128].method1661(Static115.aClass60_1109)) {
						if (Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anInt2658 < arg0.anInt2658) {
							local140 = 2000;
						}
						if (Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anInt2651 != 0 && arg0.anInt2651 != 0) {
							if (arg0.anInt2651 == Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anInt2651) {
								local140 = 2000;
							} else {
								local140 = 0;
							}
						}
					} else if (Static93.aBooleanArray11[local128]) {
						local140 = 2000;
					}
					@Pc(189) int local189 = 0;
					if (local128 == 0) {
						local189 = local140 + 28;
					}
					if (local128 == 1) {
						local189 = local140 + 13;
					}
					if (local128 == 2) {
						local189 = local140 + 18;
					}
					if (local128 == 3) {
						local189 = local140 + 31;
					}
					if (local128 == 4) {
						local189 = local140 + 15;
					}
					Static41.method698(arg3, arg2, Static125.method2072(new Class60[] { Static117.aClass60_1117, local56 }), local189, arg1, Static10.aClass60Array3[local128]);
				}
			}
		} else if ((Static85.anInt2034 & 0x8) == 8) {
			Static41.method698(arg3, arg2, Static125.method2072(new Class60[] { Static94.aClass60_916, Static47.aClass60_485, local56 }), 47, arg1, Static92.aClass60_891);
		}
		for (local128 = 0; local128 < Static25.anInt693; local128++) {
			if (Static36.anIntArray71[local128] == 4) {
				Static9.aClass60Array2[local128] = Static125.method2072(new Class60[] { Static117.aClass60_1117, local56 });
				return;
			}
		}
	}
}
