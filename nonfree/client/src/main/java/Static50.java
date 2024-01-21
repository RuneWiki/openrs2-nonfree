import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!i", name = "c", descriptor = "[I")
	public static int[] anIntArray191;

	@OriginalMember(owner = "client!i", name = "m", descriptor = "Lclient!ff;")
	public static Class26 aClass26_5;

	@OriginalMember(owner = "client!i", name = "y", descriptor = "[[B")
	public static byte[][] aByteArrayArray5;

	@OriginalMember(owner = "client!i", name = "A", descriptor = "[[I")
	public static int[][] anIntArrayArray12;

	@OriginalMember(owner = "client!i", name = "b", descriptor = "Lclient!r;")
	public static Class61 aClass61_391 = Static129.method2060("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

	@OriginalMember(owner = "client!i", name = "d", descriptor = "Lclient!r;")
	public static Class61 aClass61_392 = Static129.method2060("null");

	@OriginalMember(owner = "client!i", name = "f", descriptor = "I")
	public static int anInt1257 = 0;

	@OriginalMember(owner = "client!i", name = "h", descriptor = "[J")
	public static long[] aLongArray2 = new long[32];

	@OriginalMember(owner = "client!i", name = "k", descriptor = "Lclient!r;")
	public static Class61 aClass61_393 = Static129.method2060("m");

	@OriginalMember(owner = "client!i", name = "l", descriptor = "I")
	public static int anInt1261 = 0;

	@OriginalMember(owner = "client!i", name = "n", descriptor = "Lclient!r;")
	public static Class61 aClass61_394 = Static129.method2060("blinken1:");

	@OriginalMember(owner = "client!i", name = "r", descriptor = "Lclient!r;")
	public static Class61 aClass61_395 = Static129.method2060("Unerwartete Antwort vom Anmelde)2Server");

	@OriginalMember(owner = "client!i", name = "x", descriptor = "Lclient!r;")
	public static Class61 aClass61_396 = null;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
	public static void method887() {
		aClass61_393 = null;
		aClass26_5 = null;
		anIntArray191 = null;
		aClass61_396 = null;
		aClass61_395 = null;
		aClass61_391 = null;
		aClass61_394 = null;
		aLongArray2 = null;
		aByteArrayArray5 = null;
		anIntArrayArray12 = null;
		aClass61_392 = null;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(II)V")
	public static void method888(@OriginalArg(0) int arg0) {
		if (Static58.anInt1425 == 0) {
			Static111.aClass5_Sub5_Sub1_2.method249(arg0);
		} else {
			Static62.anInt1526 = arg0;
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(B)V")
	public static void method889() {
		for (@Pc(10) Class5_Sub2_Sub2_Sub5 local10 = (Class5_Sub2_Sub2_Sub5) Static88.aClass58_75.method1669(); local10 != null; local10 = (Class5_Sub2_Sub2_Sub5) Static88.aClass58_75.method1664()) {
			if (Static93.anInt2428 != local10.anInt2056 || local10.aBoolean77) {
				local10.method2189();
			} else if (Static58.anInt1422 >= local10.anInt2046) {
				local10.method1319(Static8.anInt198);
				if (local10.aBoolean77) {
					local10.method2189();
				} else {
					Static61.aClass81_1.method2115(local10.anInt2056, local10.anInt2048, local10.anInt2055, local10.anInt2051, 60, local10, 0, -1, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!pa;Lclient!vf;IZ)V")
	public static void method890(@OriginalArg(0) Class5_Sub14 arg0, @OriginalArg(1) Class80 arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class5_Sub17 local5 = new Class5_Sub17();
		local5.anInt2418 = arg0.method1471();
		local5.anInt2421 = arg0.method1461();
		local5.anIntArray301 = new int[local5.anInt2418];
		local5.anIntArray302 = new int[local5.anInt2418];
		local5.anIntArray303 = new int[local5.anInt2418];
		local5.aClass10Array2 = new Class10[local5.anInt2418];
		local5.aClass10Array1 = new Class10[local5.anInt2418];
		local5.aByteArrayArrayArray6 = new byte[local5.anInt2418][][];
		for (@Pc(56) int local56 = 0; local56 < local5.anInt2418; local56++) {
			try {
				@Pc(62) int local62 = arg0.method1471();
				@Pc(90) String local90;
				@Pc(99) String local99;
				@Pc(103) int local103;
				if (local62 == 0 || local62 == 1 || local62 == 2) {
					local103 = 0;
					local90 = new String(arg0.method1450().method1719());
					local99 = new String(arg0.method1450().method1719());
					if (local62 == 1) {
						local103 = arg0.method1461();
					}
					local5.anIntArray303[local56] = local62;
					local5.anIntArray302[local56] = local103;
					local5.aClass10Array1[local56] = arg1.method2042(Static103.method1753(local90), local99);
				} else if (local62 == 3 || local62 == 4) {
					local90 = new String(arg0.method1450().method1719());
					local99 = new String(arg0.method1450().method1719());
					local103 = arg0.method1471();
					@Pc(106) String[] local106 = new String[local103];
					for (@Pc(108) int local108 = 0; local108 < local103; local108++) {
						local106[local108] = new String(arg0.method1450().method1719());
					}
					@Pc(128) byte[][] local128 = new byte[local103][];
					@Pc(139) int local139;
					if (local62 == 3) {
						for (@Pc(133) int local133 = 0; local133 < local103; local133++) {
							local139 = arg0.method1461();
							local128[local133] = new byte[local139];
							arg0.method1449(local128[local133], local139);
						}
					}
					local5.anIntArray303[local56] = local62;
					@Pc(164) Class[] local164 = new Class[local103];
					for (local139 = 0; local139 < local103; local139++) {
						local164[local139] = Static103.method1753(local106[local139]);
					}
					local5.aClass10Array2[local56] = arg1.method2038(local164, Static103.method1753(local90), local99);
					local5.aByteArrayArrayArray6[local56] = local128;
				}
			} catch (@Pc(249) ClassNotFoundException local249) {
				local5.anIntArray301[local56] = -1;
			} catch (@Pc(256) SecurityException local256) {
				local5.anIntArray301[local56] = -2;
			} catch (@Pc(263) NullPointerException local263) {
				local5.anIntArray301[local56] = -3;
			} catch (@Pc(270) Exception local270) {
				local5.anIntArray301[local56] = -4;
			} catch (@Pc(277) Throwable local277) {
				local5.anIntArray301[local56] = -5;
			}
		}
		Static78.aClass58_40.method1663(local5);
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(I)V")
	public static void method891() {
		try {
			if (Static85.anInt2315 == 0) {
				if (Static108.aClass30_2 != null) {
					Static108.aClass30_2.method779();
					Static108.aClass30_2 = null;
				}
				Static129.anInt3245 = 0;
				Static83.aBoolean78 = false;
				Static119.aClass10_6 = null;
				Static85.anInt2315 = 1;
			}
			if (Static85.anInt2315 == 1) {
				if (Static119.aClass10_6 == null) {
					Static119.aClass10_6 = Static86.aClass80_2.method2039(Static30.aString1, Static79.anInt2009);
				}
				if (Static119.aClass10_6.anInt242 == 2) {
					throw new IOException();
				}
				if (Static119.aClass10_6.anInt242 == 1) {
					Static108.aClass30_2 = new Class30((Socket) Static119.aClass10_6.anObject1, Static86.aClass80_2);
					Static119.aClass10_6 = null;
					Static85.anInt2315 = 2;
				}
			}
			if (Static85.anInt2315 == 2) {
				@Pc(76) long local76 = Static31.aLong37 = Static112.aClass61_881.method1723();
				Static1.aClass5_Sub14_Sub1_1.anInt2199 = 0;
				Static1.aClass5_Sub14_Sub1_1.method1440(14);
				@Pc(92) int local92 = (int) (local76 >> 16 & 0x1FL);
				Static1.aClass5_Sub14_Sub1_1.method1440(local92);
				Static108.aClass30_2.method780(Static1.aClass5_Sub14_Sub1_1.aByteArray33, 2);
				Static85.anInt2315 = 3;
				Static47.aClass5_Sub14_Sub1_2.anInt2199 = 0;
			}
			@Pc(131) int local131;
			if (Static85.anInt2315 == 3) {
				if (Static43.aClass12_3 != null) {
					Static43.aClass12_3.method1511();
				}
				if (Static108.aClass12_2 != null) {
					Static108.aClass12_2.method1511();
				}
				local131 = Static108.aClass30_2.method771();
				if (Static43.aClass12_3 != null) {
					Static43.aClass12_3.method1511();
				}
				if (Static108.aClass12_2 != null) {
					Static108.aClass12_2.method1511();
				}
				if (local131 != 0) {
					Static67.method1126(local131);
					return;
				}
				Static47.aClass5_Sub14_Sub1_2.anInt2199 = 0;
				Static85.anInt2315 = 4;
			}
			if (Static85.anInt2315 == 4) {
				if (Static47.aClass5_Sub14_Sub1_2.anInt2199 < 8) {
					local131 = Static108.aClass30_2.method777();
					if (8 - Static47.aClass5_Sub14_Sub1_2.anInt2199 < local131) {
						local131 = 8 - Static47.aClass5_Sub14_Sub1_2.anInt2199;
					}
					if (local131 > 0) {
						Static108.aClass30_2.method773(Static47.aClass5_Sub14_Sub1_2.aByteArray33, Static47.aClass5_Sub14_Sub1_2.anInt2199, local131);
						Static47.aClass5_Sub14_Sub1_2.anInt2199 += local131;
					}
				}
				if (Static47.aClass5_Sub14_Sub1_2.anInt2199 == 8) {
					Static47.aClass5_Sub14_Sub1_2.anInt2199 = 0;
					Static83.aLong72 = Static47.aClass5_Sub14_Sub1_2.method1432();
					Static85.anInt2315 = 5;
				}
			}
			if (Static85.anInt2315 == 5) {
				@Pc(218) int[] local218 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), 0, (int) Static83.aLong72 };
				Static1.aClass5_Sub14_Sub1_1.anInt2199 = 0;
				local218[2] = (int) (Static83.aLong72 >> 32);
				Static1.aClass5_Sub14_Sub1_1.method1440(10);
				Static1.aClass5_Sub14_Sub1_1.method1451(local218[0]);
				Static1.aClass5_Sub14_Sub1_1.method1451(local218[1]);
				Static1.aClass5_Sub14_Sub1_1.method1451(local218[2]);
				Static1.aClass5_Sub14_Sub1_1.method1451(local218[3]);
				Static1.aClass5_Sub14_Sub1_1.method1464(Static112.aClass61_881.method1723());
				Static1.aClass5_Sub14_Sub1_1.method1483(Static112.aClass61_880);
				Static1.aClass5_Sub14_Sub1_1.method1435(Static114.aBigInteger2, Static106.aBigInteger1);
				Static85.aClass5_Sub14_Sub1_3.anInt2199 = 0;
				if (Static24.anInt723 == 40) {
					Static85.aClass5_Sub14_Sub1_3.method1440(18);
				} else {
					Static85.aClass5_Sub14_Sub1_3.method1440(16);
				}
				Static85.aClass5_Sub14_Sub1_3.method1440(Static1.aClass5_Sub14_Sub1_1.anInt2199 + 93);
				Static85.aClass5_Sub14_Sub1_3.method1451(471);
				Static85.aClass5_Sub14_Sub1_3.method1440(Static61.aBoolean57 ? 1 : 0);
				Static24.method506(Static85.aClass5_Sub14_Sub1_3);
				Static85.aClass5_Sub14_Sub1_3.method1451(Static49.aClass26_Sub1_10.anInt1480);
				Static85.aClass5_Sub14_Sub1_3.method1451(Static63.aClass26_Sub1_13.anInt1480);
				Static85.aClass5_Sub14_Sub1_3.method1451(Static16.aClass26_Sub1_2.anInt1480);
				Static85.aClass5_Sub14_Sub1_3.method1451(Static4.aClass26_Sub1_17.anInt1480);
				Static85.aClass5_Sub14_Sub1_3.method1451(Static82.aClass26_Sub1_15.anInt1480);
				Static85.aClass5_Sub14_Sub1_3.method1451(Static45.aClass26_Sub1_7.anInt1480);
				Static85.aClass5_Sub14_Sub1_3.method1451(Static42.aClass26_Sub1_6.anInt1480);
				Static85.aClass5_Sub14_Sub1_3.method1451(Static134.aClass26_Sub1_20.anInt1480);
				Static85.aClass5_Sub14_Sub1_3.method1451(Static47.aClass26_Sub1_8.anInt1480);
				Static85.aClass5_Sub14_Sub1_3.method1451(Static83.aClass26_Sub1_16.anInt1480);
				Static85.aClass5_Sub14_Sub1_3.method1451(Static49.aClass26_Sub1_9.anInt1480);
				Static85.aClass5_Sub14_Sub1_3.method1451(Static19.aClass26_Sub1_3.anInt1480);
				Static85.aClass5_Sub14_Sub1_3.method1451(Static121.aClass26_Sub1_19.anInt1480);
				Static85.aClass5_Sub14_Sub1_3.method1451(Static134.aClass26_Sub1_21.anInt1480);
				Static85.aClass5_Sub14_Sub1_3.method1451(Static64.aClass26_Sub1_18.anInt1480);
				Static85.aClass5_Sub14_Sub1_3.method1451(Static78.aClass26_Sub1_14.anInt1480);
				Static85.aClass5_Sub14_Sub1_3.method1484(Static1.aClass5_Sub14_Sub1_1.anInt2199, Static1.aClass5_Sub14_Sub1_1.aByteArray33);
				Static108.aClass30_2.method780(Static85.aClass5_Sub14_Sub1_3.aByteArray33, Static85.aClass5_Sub14_Sub1_3.anInt2199);
				Static1.aClass5_Sub14_Sub1_1.method1490(local218);
				for (@Pc(438) int local438 = 0; local438 < 4; local438++) {
					local218[local438] += 50;
				}
				Static47.aClass5_Sub14_Sub1_2.method1490(local218);
				Static85.anInt2315 = 6;
			}
			if (Static85.anInt2315 == 6 && Static108.aClass30_2.method777() > 0) {
				local131 = Static108.aClass30_2.method771();
				if (local131 == 21 && Static24.anInt723 == 20) {
					Static85.anInt2315 = 7;
				} else if (local131 == 2) {
					Static85.anInt2315 = 9;
				} else if (local131 == 15 && Static24.anInt723 == 40) {
					Static83.method1508();
					return;
				} else if (local131 == 23 && Static102.anInt2700 < 1) {
					Static85.anInt2315 = 0;
					Static102.anInt2700++;
				} else {
					Static67.method1126(local131);
					return;
				}
			}
			if (Static85.anInt2315 == 7 && Static108.aClass30_2.method777() > 0) {
				Static78.anInt1983 = Static108.aClass30_2.method771() * 60 + 180;
				Static85.anInt2315 = 8;
			}
			if (Static85.anInt2315 == 8) {
				Static129.anInt3245 = 0;
				Static24.method503(Static123.method1929(new Class61[] { Static39.method730(Static78.anInt1983 / 60), Static68.aClass61_515 }), Static4.aClass61_784, Static78.aClass61_600);
				if (--Static78.anInt1983 <= 0) {
					Static85.anInt2315 = 0;
				}
			} else {
				if (Static85.anInt2315 == 9 && Static108.aClass30_2.method777() >= 8) {
					Static44.anInt1136 = Static108.aClass30_2.method771();
					Static120.aBoolean108 = Static108.aClass30_2.method771() == 1;
					Static85.anInt2316 = Static108.aClass30_2.method771();
					Static85.anInt2316 <<= 0x8;
					Static85.anInt2316 += Static108.aClass30_2.method771();
					Static40.anInt1075 = Static108.aClass30_2.method771();
					Static108.aClass30_2.method773(Static47.aClass5_Sub14_Sub1_2.aByteArray33, 0, 1);
					Static47.aClass5_Sub14_Sub1_2.anInt2199 = 0;
					Static73.anInt1747 = Static47.aClass5_Sub14_Sub1_2.method1491();
					Static108.aClass30_2.method773(Static47.aClass5_Sub14_Sub1_2.aByteArray33, 0, 2);
					Static47.aClass5_Sub14_Sub1_2.anInt2199 = 0;
					Static80.anInt2057 = Static47.aClass5_Sub14_Sub1_2.method1478();
					Static85.anInt2315 = 10;
				}
				if (Static85.anInt2315 != 10) {
					Static129.anInt3245++;
					if (Static129.anInt3245 > 2000) {
						if (Static102.anInt2700 < 1) {
							Static102.anInt2700++;
							if (Static107.anInt2778 == Static79.anInt2009) {
								Static79.anInt2009 = Static127.anInt3202;
							} else {
								Static79.anInt2009 = Static107.anInt2778;
							}
							Static85.anInt2315 = 0;
						} else {
							Static67.method1126(-3);
						}
					}
				} else if (Static108.aClass30_2.method777() >= Static80.anInt2057) {
					Static47.aClass5_Sub14_Sub1_2.anInt2199 = 0;
					Static108.aClass30_2.method773(Static47.aClass5_Sub14_Sub1_2.aByteArray33, 0, Static80.anInt2057);
					Static99.method1676();
					Static107.anInt2777 = -1;
					Static133.method2193(false);
					Static73.anInt1747 = -1;
				}
			}
		} catch (@Pc(724) IOException local724) {
			if (Static102.anInt2700 < 1) {
				Static85.anInt2315 = 0;
				if (Static107.anInt2778 == Static79.anInt2009) {
					Static79.anInt2009 = Static127.anInt3202;
				} else {
					Static79.anInt2009 = Static107.anInt2778;
				}
				Static102.anInt2700++;
			} else {
				Static67.method1126(-2);
			}
		}
	}
}
