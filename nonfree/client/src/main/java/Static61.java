import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!m", name = "m", descriptor = "I")
	public static int anInt1612;

	@OriginalMember(owner = "client!m", name = "n", descriptor = "[Lclient!ab;")
	public static Class2_Sub1_Sub1_Sub1[] aClass2_Sub1_Sub1_Sub1Array29;

	@OriginalMember(owner = "client!m", name = "o", descriptor = "Lclient!ta;")
	public static Class14 aClass14_22;

	@OriginalMember(owner = "client!m", name = "p", descriptor = "[I")
	public static int[] anIntArray198;

	@OriginalMember(owner = "client!m", name = "c", descriptor = "Lclient!kc;")
	private static Class36 aClass36_770 = Static14.method2017("Error connecting to server)3");

	@OriginalMember(owner = "client!m", name = "d", descriptor = "Lclient!kc;")
	public static Class36 aClass36_771 = aClass36_770;

	@OriginalMember(owner = "client!m", name = "h", descriptor = "I")
	public static final int anInt1608 = 0;

	@OriginalMember(owner = "client!m", name = "l", descriptor = "Ljava/lang/Object;")
	public static Object anObject3 = new Object();

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Lclient!ed;ILclient!ed;IB)Lclient!ed;")
	public static Class2_Sub1_Sub6 method1112(@OriginalArg(0) Class2_Sub1_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub1_Sub6 arg2, @OriginalArg(3) int arg3) {
		@Pc(23) Class2_Sub1_Sub6 local23 = Static25.method521(0, arg2.anInt675, arg2.anInt716, Static42.aClass2_Sub1_Sub6ArrayArray1[arg2.anInt680 >> 16], arg2.anInt680, arg2.anInt660, arg1, arg0, arg2.anInt677, 0, arg3);
		if (local23 == null) {
			if (arg2.aClass2_Sub1_Sub6Array1 != null) {
				local23 = Static25.method521(0, arg2.anInt675, arg2.anInt716, arg2.aClass2_Sub1_Sub6Array1, arg2.anInt680, arg2.anInt660, arg1, arg0, arg2.anInt677, 0, arg3);
			}
			return local23;
		} else {
			return local23;
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(B)V")
	public static void method1113() {
		aClass36_770 = null;
		aClass36_771 = null;
		anObject3 = null;
		aClass14_22 = null;
		anIntArray198 = null;
		aClass2_Sub1_Sub1_Sub1Array29 = null;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(ZLclient!c;B)Z")
	public static boolean method1114(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class11 arg1) {
		Static38.anInt969 = 20;
		try {
			Static41.aClass29_1 = (Class29) Class.forName("Class29_Sub1_Sub1").getDeclaredConstructor().newInstance();
			return true;
		} catch (@Pc(18) Throwable local18) {
			@Pc(22) Interface2 local22 = arg1.method241();
			if (local22 != null) {
				Static41.aClass29_1 = new Class29_Sub1_Sub2(arg1, local22);
				return true;
			} else if (arg0) {
				Static41.aClass29_1 = new Class29_Sub2(arg1);
				return true;
			} else {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(B)V")
	public static void method1115() {
		try {
			if (Static48.anInt1267 == 0) {
				if (Static57.aClass51_3 != null) {
					Static57.aClass51_3.method1483();
					Static57.aClass51_3 = null;
				}
				Static96.anInt2557 = 0;
				Static108.aClass34_8 = null;
				Static48.anInt1267 = 1;
				Static69.aBoolean76 = false;
			}
			if (Static48.anInt1267 == 1) {
				if (Static108.aClass34_8 == null) {
					Static108.aClass34_8 = Static67.aClass11_1.method242(Static118.anInt3001);
				}
				if (Static108.aClass34_8.anInt1269 == 2) {
					throw new IOException();
				}
				if (Static108.aClass34_8.anInt1269 == 1) {
					Static57.aClass51_3 = new Class51((Socket) Static108.aClass34_8.anObject2, Static67.aClass11_1);
					Static108.aClass34_8 = null;
					Static48.anInt1267 = 2;
				}
			}
			if (Static48.anInt1267 == 2) {
				@Pc(76) long local76 = Static34.aLong31 = Static15.aClass36_186.method1021();
				Static42.aClass2_Sub12_Sub1_1.anInt1939 = 0;
				Static42.aClass2_Sub12_Sub1_1.method1409(14);
				@Pc(90) int local90 = (int) (local76 >> 16 & 0x1FL);
				Static42.aClass2_Sub12_Sub1_1.method1409(local90);
				Static57.aClass51_3.method1486(2, Static42.aClass2_Sub12_Sub1_1.aByteArray20);
				Static48.anInt1267 = 3;
				Static92.aClass2_Sub12_Sub1_3.anInt1939 = 0;
			}
			@Pc(113) int local113;
			if (Static48.anInt1267 == 3) {
				local113 = Static57.aClass51_3.method1488();
				if (local113 != 0) {
					Static9.method206(local113);
					return;
				}
				Static48.anInt1267 = 4;
				Static92.aClass2_Sub12_Sub1_3.anInt1939 = 0;
			}
			if (Static48.anInt1267 == 4) {
				if (Static92.aClass2_Sub12_Sub1_3.anInt1939 < 8) {
					local113 = Static57.aClass51_3.method1484();
					if (8 - Static92.aClass2_Sub12_Sub1_3.anInt1939 < local113) {
						local113 = 8 - Static92.aClass2_Sub12_Sub1_3.anInt1939;
					}
					if (local113 > 0) {
						Static57.aClass51_3.method1481(Static92.aClass2_Sub12_Sub1_3.anInt1939, local113, Static92.aClass2_Sub12_Sub1_3.aByteArray20);
						Static92.aClass2_Sub12_Sub1_3.anInt1939 += local113;
					}
				}
				if (Static92.aClass2_Sub12_Sub1_3.anInt1939 == 8) {
					Static92.aClass2_Sub12_Sub1_3.anInt1939 = 0;
					Static105.aLong82 = Static92.aClass2_Sub12_Sub1_3.method1389();
					Static48.anInt1267 = 5;
				}
			}
			if (Static48.anInt1267 == 5) {
				Static42.aClass2_Sub12_Sub1_1.anInt1939 = 0;
				@Pc(188) int[] local188 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static105.aLong82 >> 32), (int) Static105.aLong82 };
				Static42.aClass2_Sub12_Sub1_1.method1409(10);
				Static42.aClass2_Sub12_Sub1_1.method1394(local188[0]);
				Static42.aClass2_Sub12_Sub1_1.method1394(local188[1]);
				Static42.aClass2_Sub12_Sub1_1.method1394(local188[2]);
				Static42.aClass2_Sub12_Sub1_1.method1394(local188[3]);
				Static42.aClass2_Sub12_Sub1_1.method1394(Static67.aClass11_1.anInt273);
				Static42.aClass2_Sub12_Sub1_1.method1377(Static15.aClass36_186.method1021());
				Static42.aClass2_Sub12_Sub1_1.method1384(Static15.aClass36_190);
				Static42.aClass2_Sub12_Sub1_1.method1398(Static114.aBigInteger4, Static99.aBigInteger3);
				Static45.aClass2_Sub12_Sub1_2.anInt1939 = 0;
				if (Static23.anInt591 == 40) {
					Static45.aClass2_Sub12_Sub1_2.method1409(18);
				} else {
					Static45.aClass2_Sub12_Sub1_2.method1409(16);
				}
				Static45.aClass2_Sub12_Sub1_2.method1409(Static42.aClass2_Sub12_Sub1_1.anInt1939 + 61);
				Static45.aClass2_Sub12_Sub1_2.method1394(445);
				Static45.aClass2_Sub12_Sub1_2.method1409(Static35.aBoolean51 ? 1 : 0);
				Static45.aClass2_Sub12_Sub1_2.method1394(Static86.aClass3_Sub1_9.anInt1287);
				Static45.aClass2_Sub12_Sub1_2.method1394(Static77.aClass3_Sub1_7.anInt1287);
				Static45.aClass2_Sub12_Sub1_2.method1394(Static97.aClass3_Sub1_10.anInt1287);
				Static45.aClass2_Sub12_Sub1_2.method1394(Static23.aClass3_Sub1_2.anInt1287);
				Static45.aClass2_Sub12_Sub1_2.method1394(Static57.aClass3_Sub1_6.anInt1287);
				Static45.aClass2_Sub12_Sub1_2.method1394(Static110.aClass3_Sub1_13.anInt1287);
				Static45.aClass2_Sub12_Sub1_2.method1394(Static111.aClass3_Sub1_14.anInt1287);
				Static45.aClass2_Sub12_Sub1_2.method1394(Static27.aClass3_Sub1_3.anInt1287);
				Static45.aClass2_Sub12_Sub1_2.method1394(Static29.aClass3_Sub1_4.anInt1287);
				Static45.aClass2_Sub12_Sub1_2.method1394(Static85.aClass3_Sub1_8.anInt1287);
				Static45.aClass2_Sub12_Sub1_2.method1394(Static100.aClass3_Sub1_12.anInt1287);
				Static45.aClass2_Sub12_Sub1_2.method1394(Static100.aClass3_Sub1_11.anInt1287);
				Static45.aClass2_Sub12_Sub1_2.method1394(Static113.aClass3_Sub1_16.anInt1287);
				Static45.aClass2_Sub12_Sub1_2.method1394(Static112.aClass3_Sub1_15.anInt1287);
				Static45.aClass2_Sub12_Sub1_2.method1411(Static42.aClass2_Sub12_Sub1_1.aByteArray20, Static42.aClass2_Sub12_Sub1_1.anInt1939);
				Static57.aClass51_3.method1486(Static45.aClass2_Sub12_Sub1_2.anInt1939, Static45.aClass2_Sub12_Sub1_2.aByteArray20);
				Static42.aClass2_Sub12_Sub1_1.method1424(local188);
				for (@Pc(392) int local392 = 0; local392 < 4; local392++) {
					local188[local392] += 50;
				}
				Static92.aClass2_Sub12_Sub1_3.method1424(local188);
				Static48.anInt1267 = 6;
			}
			if (Static48.anInt1267 == 6 && Static57.aClass51_3.method1484() > 0) {
				local113 = Static57.aClass51_3.method1488();
				if (local113 == 21 && Static23.anInt591 == 20) {
					Static48.anInt1267 = 7;
				} else if (local113 == 2) {
					Static48.anInt1267 = 9;
				} else if (local113 == 15 && Static23.anInt591 == 40) {
					Static83.method1507();
					return;
				} else if (local113 == 23 && Static18.anInt456 < 1) {
					Static48.anInt1267 = 0;
					Static18.anInt456++;
				} else {
					Static9.method206(local113);
					return;
				}
			}
			if (Static48.anInt1267 == 7 && Static57.aClass51_3.method1484() > 0) {
				Static113.anInt2954 = Static57.aClass51_3.method1488() * 60 + 180;
				Static48.anInt1267 = 8;
			}
			if (Static48.anInt1267 == 8) {
				Static96.anInt2557 = 0;
				Static13.method264(Static6.aClass36_87, Static77.aClass36_945, Static49.method949(new Class36[] { Static57.method1055(Static113.anInt2954 / 60), Static88.aClass36_1075 }));
				if (--Static113.anInt2954 <= 0) {
					Static48.anInt1267 = 0;
				}
			} else {
				if (Static48.anInt1267 == 9 && Static57.aClass51_3.method1484() >= 8) {
					Static79.anInt2052 = Static57.aClass51_3.method1488();
					Static17.aBoolean15 = Static57.aClass51_3.method1488() == 1;
					Static18.anInt455 = Static57.aClass51_3.method1488();
					Static18.anInt455 <<= 0x8;
					Static18.anInt455 += Static57.aClass51_3.method1488();
					Static108.anInt2780 = Static57.aClass51_3.method1488();
					Static57.aClass51_3.method1481(0, 1, Static92.aClass2_Sub12_Sub1_3.aByteArray20);
					Static92.aClass2_Sub12_Sub1_3.anInt1939 = 0;
					Static10.anInt253 = Static92.aClass2_Sub12_Sub1_3.method1417();
					Static57.aClass51_3.method1481(0, 2, Static92.aClass2_Sub12_Sub1_3.aByteArray20);
					Static92.aClass2_Sub12_Sub1_3.anInt1939 = 0;
					Static111.anInt2876 = Static92.aClass2_Sub12_Sub1_3.method1366();
					Static48.anInt1267 = 10;
				}
				if (Static48.anInt1267 != 10) {
					Static96.anInt2557++;
					if (Static96.anInt2557 > 2000) {
						if (Static18.anInt456 < 1) {
							if (Static82.anInt2071 == Static118.anInt3001) {
								Static118.anInt3001 = Static25.anInt635;
							} else {
								Static118.anInt3001 = Static82.anInt2071;
							}
							Static18.anInt456++;
							Static48.anInt1267 = 0;
						} else {
							Static9.method206(-3);
						}
					}
				} else if (Static57.aClass51_3.method1484() >= Static111.anInt2876) {
					Static92.aClass2_Sub12_Sub1_3.anInt1939 = 0;
					Static57.aClass51_3.method1481(0, Static111.anInt2876, Static92.aClass2_Sub12_Sub1_3.aByteArray20);
					Static3.method941();
					Static22.anInt578 = -1;
					Static47.method917(false);
					Static10.anInt253 = -1;
				}
			}
		} catch (@Pc(675) IOException local675) {
			if (Static18.anInt456 < 1) {
				Static48.anInt1267 = 0;
				Static18.anInt456++;
				if (Static82.anInt2071 == Static118.anInt3001) {
					Static118.anInt3001 = Static25.anInt635;
				} else {
					Static118.anInt3001 = Static82.anInt2071;
				}
			} else {
				Static9.method206(-2);
			}
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(JZ)V")
	public static void method1116(@OriginalArg(0) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(12) InterruptedException local12) {
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(ZLclient!ac;Lclient!ac;)I")
	public static int method1117(@OriginalArg(1) Class3 arg0, @OriginalArg(2) Class3 arg1) {
		@Pc(5) int local5 = 0;
		if (arg0.method926(Static49.aClass36_654, Static15.aClass36_179)) {
			local5++;
		}
		if (arg1.method926(Static86.aClass36_1033, Static15.aClass36_179)) {
			local5++;
		}
		if (arg1.method926(Static9.aClass36_143, Static15.aClass36_179)) {
			local5++;
		}
		if (arg1.method926(Static91.aClass36_1130, Static15.aClass36_179)) {
			local5++;
		}
		if (arg1.method926(Static68.aClass36_828, Static15.aClass36_179)) {
			local5++;
		}
		return local5;
	}
}
