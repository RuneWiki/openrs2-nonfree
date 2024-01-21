import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "[I")
	public static int[] anIntArray106;

	@OriginalMember(owner = "client!client", name = "zb", descriptor = "Lclient!ua;")
	public static Class62_Sub1 aClass62_Sub1_18;

	@OriginalMember(owner = "client!client", name = "Y", descriptor = "Lclient!kd;")
	private static Class39 aClass39_345 = Static108.method1915("You have only just left another world)3");

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "Z")
	public static boolean aBoolean62 = false;

	@OriginalMember(owner = "client!client", name = "db", descriptor = "Lclient!kd;")
	public static Class39 aClass39_346 = Static108.method1915("W-=hlen Sie eine Option");

	@OriginalMember(owner = "client!client", name = "tb", descriptor = "Lclient!kd;")
	private static Class39 aClass39_351 = Static108.method1915("Connection lost");

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "Lclient!kd;")
	public static Class39 aClass39_347 = aClass39_351;

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "Lclient!kd;")
	private static Class39 aClass39_348 = Static108.method1915("Loaded title screen");

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "Lclient!kd;")
	public static Class39 aClass39_349 = aClass39_348;

	@OriginalMember(owner = "client!client", name = "qb", descriptor = "Lclient!kd;")
	public static Class39 aClass39_350 = aClass39_345;

	@OriginalMember(owner = "client!client", name = "ub", descriptor = "Lclient!kd;")
	public static Class39 aClass39_352 = Static108.method1915("<col=ffffff>");

	@OriginalMember(owner = "client!client", name = "vb", descriptor = "I")
	public static int anInt729 = 0;

	@OriginalMember(owner = "client!client", name = "xb", descriptor = "I")
	public static int anInt731 = 0;

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	public static void method403() {
		if (Static125.aString3.toLowerCase().indexOf("microsoft") != -1) {
			Static4.anIntArray27[192] = 58;
			Static4.anIntArray27[219] = 42;
			Static4.anIntArray27[186] = 57;
			Static4.anIntArray27[220] = 74;
			Static4.anIntArray27[223] = 28;
			Static4.anIntArray27[188] = 71;
			Static4.anIntArray27[190] = 72;
			Static4.anIntArray27[221] = 43;
			Static4.anIntArray27[222] = 59;
			Static4.anIntArray27[187] = 27;
			Static4.anIntArray27[191] = 73;
			Static4.anIntArray27[189] = 26;
			return;
		}
		Static4.anIntArray27[93] = 43;
		Static4.anIntArray27[91] = 42;
		Static4.anIntArray27[47] = 73;
		Static4.anIntArray27[59] = 57;
		Static4.anIntArray27[92] = 74;
		if (Static125.aMethod1 == null) {
			Static4.anIntArray27[192] = 58;
			Static4.anIntArray27[222] = 59;
		} else {
			Static4.anIntArray27[222] = 58;
			Static4.anIntArray27[192] = 28;
			Static4.anIntArray27[520] = 59;
		}
		Static4.anIntArray27[44] = 71;
		Static4.anIntArray27[46] = 72;
		Static4.anIntArray27[61] = 27;
		Static4.anIntArray27[45] = 26;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!mf;I)V")
	public static void method404(@OriginalArg(0) Class1_Sub1_Sub2_Sub1 arg0) {
		if (arg0.anInt2523 == 0) {
			arg0.anInt2533 = 1024;
		}
		if (arg0.anInt2523 == 1) {
			arg0.anInt2533 = 1536;
		}
		@Pc(21) int local21 = arg0.anInt2490 - Static45.anInt1256;
		@Pc(31) int local31 = arg0.anInt2522 * 128 + arg0.anInt2486 * 64;
		@Pc(45) int local45 = arg0.anInt2532 * 128 + arg0.anInt2486 * 64;
		if (arg0.anInt2523 == 2) {
			arg0.anInt2533 = 0;
		}
		arg0.anInt2489 = 0;
		arg0.anInt2508 += (local45 - arg0.anInt2508) / local21;
		if (arg0.anInt2523 == 3) {
			arg0.anInt2533 = 512;
		}
		arg0.anInt2521 += (local31 - arg0.anInt2521) / local21;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBI)I")
	public static int method405(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class1_Sub2 local12 = (Class1_Sub2) Static62.aClass70_11.method1961((long) arg1);
		if (local12 == null) {
			return 0;
		} else if (arg0 >= 0 && arg0 < local12.anIntArray22.length) {
			return local12.anIntArray22[arg0];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	public static void method406() {
		aClass62_Sub1_18 = null;
		aClass39_347 = null;
		aClass39_350 = null;
		aClass39_351 = null;
		aClass39_349 = null;
		aClass39_352 = null;
		aClass39_346 = null;
		aClass39_348 = null;
		aClass39_345 = null;
		anIntArray106 = null;
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	public static void method408() {
		Static103.aClass1_Sub18_Sub1_5.method2203(190);
		if (Static91.anInt2131 != -1) {
			Static49.method857(Static91.anInt2131);
			Static126.aBoolean247 = true;
			Static91.anInt2131 = -1;
			Static35.aBoolean96 = true;
			Static122.anInt2982 = -1;
		}
		if (Static110.anInt2786 != -1) {
			Static49.method857(Static110.anInt2786);
			Static113.aBoolean226 = true;
			Static122.anInt2982 = -1;
			Static110.anInt2786 = -1;
		}
		if (Static72.anInt1798 != -1) {
			Static49.method857(Static72.anInt1798);
			Static72.anInt1798 = -1;
			Static41.method2108(30);
		}
		if (Static16.anInt2474 != -1) {
			Static49.method857(Static16.anInt2474);
			Static16.anInt2474 = -1;
		}
		if (Static48.anInt1318 != -1) {
			Static49.method857(Static48.anInt1318);
			Static122.anInt2982 = -1;
			Static48.anInt1318 = -1;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIBI)V")
	public static void method409(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class1_Sub1_Sub1 local12 = Static32.method393(arg2, arg1);
		if (local12 != null && local12.anObjectArray13 != null) {
			Static52.method962(local12.anObjectArray13, 0, null, 0, local12, 0);
		}
		Static46.aBoolean222 = true;
		Static123.anInt2998 = arg2;
		Static82.anInt1996 = arg0;
		Static76.anInt1918 = arg1;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!ud;ZI)V")
	public static void method411(@OriginalArg(0) Class74 arg0, @OriginalArg(1) boolean arg1) {
		if (Static71.aClass74_3 != null) {
			try {
				Static71.aClass74_3.method2047();
			} catch (@Pc(8) Exception local8) {
			}
			Static71.aClass74_3 = null;
		}
		Static71.aClass74_3 = arg0;
		Static95.method2002(arg1);
		Static89.anInt2105 = 0;
		Static59.aClass1_Sub18_1 = null;
		Static99.aClass1_Sub18_3.anInt3078 = 0;
		Static72.aClass1_Sub1_Sub15_1 = null;
		while (true) {
			@Pc(33) Class1_Sub1_Sub15 local33 = (Class1_Sub1_Sub15) Static35.aClass70_1.method1958();
			if (local33 == null) {
				while (true) {
					local33 = (Class1_Sub1_Sub15) Static66.aClass70_7.method1958();
					if (local33 == null) {
						if (Static118.aByte6 != 0) {
							try {
								@Pc(88) Class1_Sub18 local88 = new Class1_Sub18(4);
								local88.method2168(4);
								local88.method2168(Static118.aByte6);
								local88.method2159(0);
								Static71.aClass74_3.method2055(local88.aByteArray96, 4);
							} catch (@Pc(111) IOException local111) {
								try {
									Static71.aClass74_3.method2047();
								} catch (@Pc(116) Exception local116) {
								}
								Static90.anInt2124++;
								Static71.aClass74_3 = null;
							}
						}
						Static12.anInt503 = 0;
						Static26.aLong19 = Static124.method2079();
						return;
					}
					Static71.aClass42_2.method1197(local33);
					Static98.aClass70_9.method1955(local33, local33.aLong98);
					Static55.anInt1502--;
					Static88.anInt2088++;
				}
			}
			Static70.aClass70_8.method1955(local33, local33.aLong98);
			Static52.anInt1452++;
			Static122.anInt2977--;
		}
	}
}
