import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "I")
	public static int anInt2257;

	@OriginalMember(owner = "client!hd", name = "n", descriptor = "Lclient!hd;")
	public static Class15 aClass15_3;

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "I")
	public static int anInt2256 = 0;

	@OriginalMember(owner = "client!hd", name = "m", descriptor = "Lclient!mb;")
	private static Class45 aClass45_962 = Static63.method1251("Moderator option: Mute player for 48 hours: <OFF>");

	@OriginalMember(owner = "client!hd", name = "o", descriptor = "Z")
	public static boolean aBoolean104 = false;

	@OriginalMember(owner = "client!hd", name = "w", descriptor = "I")
	public static int anInt2274 = 0;

	@OriginalMember(owner = "client!hd", name = "A", descriptor = "I")
	public static int anInt2277 = 0;

	@OriginalMember(owner = "client!hd", name = "G", descriptor = "Lclient!mb;")
	public static Class45 aClass45_963 = aClass45_962;

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)V")
	public static void method1522() {
		aClass45_963 = null;
		aClass45_962 = null;
		aClass15_3 = null;
	}

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "(I)V")
	public static void method1525() {
		try {
			if (Static75.anInt2182 == 0) {
				if (Static104.aClass7_3 != null) {
					Static104.aClass7_3.method73();
					Static104.aClass7_3 = null;
				}
				Static75.anInt2182 = 1;
				Static47.aBoolean72 = false;
				Static19.anInt630 = 0;
				Static106.aClass46_4 = null;
			}
			if (Static75.anInt2182 == 1) {
				if (Static106.aClass46_4 == null) {
					Static106.aClass46_4 = Static96.aClass77_3.method2168(Static30.anInt491);
				}
				if (Static106.aClass46_4.anInt1964 == 2) {
					throw new IOException();
				}
				if (Static106.aClass46_4.anInt1964 == 1) {
					Static104.aClass7_3 = new Class7((Socket) Static106.aClass46_4.anObject4, Static96.aClass77_3);
					Static75.anInt2182 = 2;
					Static106.aClass46_4 = null;
				}
			}
			if (Static75.anInt2182 == 2) {
				@Pc(69) long local69 = Static112.aLong137 = Static40.aClass45_518.method1299();
				Static64.aClass5_Sub9_Sub1_2.anInt2140 = 0;
				@Pc(79) int local79 = (int) (local69 >> 16 & 0x1FL);
				Static64.aClass5_Sub9_Sub1_2.method1428(14);
				Static64.aClass5_Sub9_Sub1_2.method1428(local79);
				Static104.aClass7_3.method80(2, Static64.aClass5_Sub9_Sub1_2.aByteArray28);
				Static70.aClass5_Sub9_Sub1_3.anInt2140 = 0;
				Static75.anInt2182 = 3;
			}
			@Pc(114) int local114;
			if (Static75.anInt2182 == 3) {
				aClass15_3.method1527();
				Static122.aClass15_4.method1527();
				local114 = Static104.aClass7_3.method74();
				aClass15_3.method1527();
				Static122.aClass15_4.method1527();
				if (local114 != 0) {
					Static62.method1227(local114);
					return;
				}
				Static70.aClass5_Sub9_Sub1_3.anInt2140 = 0;
				Static75.anInt2182 = 4;
			}
			if (Static75.anInt2182 == 4) {
				if (Static70.aClass5_Sub9_Sub1_3.anInt2140 < 8) {
					local114 = Static104.aClass7_3.method72();
					if (local114 > 8 - Static70.aClass5_Sub9_Sub1_3.anInt2140) {
						local114 = 8 - Static70.aClass5_Sub9_Sub1_3.anInt2140;
					}
					if (local114 > 0) {
						Static104.aClass7_3.method75(Static70.aClass5_Sub9_Sub1_3.anInt2140, local114, Static70.aClass5_Sub9_Sub1_3.aByteArray28);
						Static70.aClass5_Sub9_Sub1_3.anInt2140 += local114;
					}
				}
				if (Static70.aClass5_Sub9_Sub1_3.anInt2140 == 8) {
					Static70.aClass5_Sub9_Sub1_3.anInt2140 = 0;
					Static77.aLong98 = Static70.aClass5_Sub9_Sub1_3.method1436();
					Static75.anInt2182 = 5;
				}
			}
			if (Static75.anInt2182 == 5) {
				Static64.aClass5_Sub9_Sub1_2.anInt2140 = 0;
				@Pc(204) int[] local204 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static77.aLong98 >> 32), (int) Static77.aLong98 };
				Static64.aClass5_Sub9_Sub1_2.method1428(10);
				Static64.aClass5_Sub9_Sub1_2.method1413(local204[0]);
				Static64.aClass5_Sub9_Sub1_2.method1413(local204[1]);
				Static64.aClass5_Sub9_Sub1_2.method1413(local204[2]);
				Static64.aClass5_Sub9_Sub1_2.method1413(local204[3]);
				Static64.aClass5_Sub9_Sub1_2.method1413(Static96.aClass77_3.anInt3157);
				Static64.aClass5_Sub9_Sub1_2.method1454(Static40.aClass45_518.method1299());
				Static64.aClass5_Sub9_Sub1_2.method1402(Static40.aClass45_525);
				Static64.aClass5_Sub9_Sub1_2.method1414(Static111.aBigInteger2, Static91.aBigInteger1);
				Static6.aClass5_Sub9_Sub1_1.anInt2140 = 0;
				if (Static121.anInt2385 == 40) {
					Static6.aClass5_Sub9_Sub1_1.method1428(18);
				} else {
					Static6.aClass5_Sub9_Sub1_1.method1428(16);
				}
				Static6.aClass5_Sub9_Sub1_1.method1428(Static64.aClass5_Sub9_Sub1_2.anInt2140 + 69);
				Static6.aClass5_Sub9_Sub1_1.method1413(451);
				Static6.aClass5_Sub9_Sub1_1.method1428(Static103.aBoolean122 ? 1 : 0);
				Static6.aClass5_Sub9_Sub1_1.method1413(Static63.aClass29_Sub1_27.anInt1042);
				Static6.aClass5_Sub9_Sub1_1.method1413(Static105.aClass29_Sub1_45.anInt1042);
				Static6.aClass5_Sub9_Sub1_1.method1413(Static62.aClass29_Sub1_25.anInt1042);
				Static6.aClass5_Sub9_Sub1_1.method1413(Static48.aClass29_Sub1_22.anInt1042);
				Static6.aClass5_Sub9_Sub1_1.method1413(Static100.aClass29_Sub1_43.anInt1042);
				Static6.aClass5_Sub9_Sub1_1.method1413(Static46.aClass29_Sub1_17.anInt1042);
				Static6.aClass5_Sub9_Sub1_1.method1413(Static21.aClass29_Sub1_11.anInt1042);
				Static6.aClass5_Sub9_Sub1_1.method1413(Static1.aClass29_Sub1_1.anInt1042);
				Static6.aClass5_Sub9_Sub1_1.method1413(Static112.aClass29_Sub1_48.anInt1042);
				Static6.aClass5_Sub9_Sub1_1.method1413(Static6.aClass29_Sub1_4.anInt1042);
				Static6.aClass5_Sub9_Sub1_1.method1413(Static36.aClass29_Sub1_15.anInt1042);
				Static6.aClass5_Sub9_Sub1_1.method1413(Static77.aClass29_Sub1_33.anInt1042);
				Static6.aClass5_Sub9_Sub1_1.method1413(Static71.aClass29_Sub1_32.anInt1042);
				Static6.aClass5_Sub9_Sub1_1.method1413(Static92.aClass29_Sub1_50.anInt1042);
				Static6.aClass5_Sub9_Sub1_1.method1413(Static121.aClass29_Sub1_38.anInt1042);
				Static6.aClass5_Sub9_Sub1_1.method1413(Static66.aClass29_Sub1_29.anInt1042);
				Static6.aClass5_Sub9_Sub1_1.method1416(Static64.aClass5_Sub9_Sub1_2.anInt2140, Static64.aClass5_Sub9_Sub1_2.aByteArray28);
				Static104.aClass7_3.method80(Static6.aClass5_Sub9_Sub1_1.anInt2140, Static6.aClass5_Sub9_Sub1_1.aByteArray28);
				Static64.aClass5_Sub9_Sub1_2.method1460(local204);
				for (@Pc(425) int local425 = 0; local425 < 4; local425++) {
					local204[local425] += 50;
				}
				Static70.aClass5_Sub9_Sub1_3.method1460(local204);
				Static75.anInt2182 = 6;
			}
			if (Static75.anInt2182 == 6 && Static104.aClass7_3.method72() > 0) {
				local114 = Static104.aClass7_3.method74();
				if (local114 == 21 && Static121.anInt2385 == 20) {
					Static75.anInt2182 = 7;
				} else if (local114 == 2) {
					Static75.anInt2182 = 9;
				} else if (local114 == 15 && Static121.anInt2385 == 40) {
					Static59.method1209();
					return;
				} else if (local114 == 23 && Static12.anInt3113 < 1) {
					Static12.anInt3113++;
					Static75.anInt2182 = 0;
				} else {
					Static62.method1227(local114);
					return;
				}
			}
			if (Static75.anInt2182 == 7 && Static104.aClass7_3.method72() > 0) {
				Static30.anInt468 = Static104.aClass7_3.method74() * 60 + 180;
				Static75.anInt2182 = 8;
			}
			if (Static75.anInt2182 == 8) {
				Static19.anInt630 = 0;
				Static4.method71(Static99.aClass45_1142, Static39.method1443(new Class45[] { Static76.method1476(Static30.anInt468 / 60), Static103.aClass45_1190 }), Static105.aClass45_1202);
				if (--Static30.anInt468 <= 0) {
					Static75.anInt2182 = 0;
				}
			} else {
				if (Static75.anInt2182 == 9 && Static104.aClass7_3.method72() >= 8) {
					Static84.anInt2332 = Static104.aClass7_3.method74();
					Static14.aBoolean14 = Static104.aClass7_3.method74() == 1;
					Static73.anInt2175 = Static104.aClass7_3.method74();
					Static73.anInt2175 <<= 0x8;
					Static73.anInt2175 += Static104.aClass7_3.method74();
					Static74.anInt2510 = Static104.aClass7_3.method74();
					Static104.aClass7_3.method75(0, 1, Static70.aClass5_Sub9_Sub1_3.aByteArray28);
					Static70.aClass5_Sub9_Sub1_3.anInt2140 = 0;
					Static85.anInt2444 = Static70.aClass5_Sub9_Sub1_3.method1458();
					Static104.aClass7_3.method75(0, 2, Static70.aClass5_Sub9_Sub1_3.aByteArray28);
					Static70.aClass5_Sub9_Sub1_3.anInt2140 = 0;
					Static69.anInt1989 = Static70.aClass5_Sub9_Sub1_3.method1418();
					Static75.anInt2182 = 10;
				}
				if (Static75.anInt2182 != 10) {
					Static19.anInt630++;
					if (Static19.anInt630 > 2000) {
						if (Static12.anInt3113 < 1) {
							if (Static30.anInt491 == Static36.anInt1055) {
								Static30.anInt491 = Static16.anInt497;
							} else {
								Static30.anInt491 = Static36.anInt1055;
							}
							Static75.anInt2182 = 0;
							Static12.anInt3113++;
						} else {
							Static62.method1227(-3);
						}
					}
				} else if (Static104.aClass7_3.method72() >= Static69.anInt1989) {
					Static70.aClass5_Sub9_Sub1_3.anInt2140 = 0;
					Static104.aClass7_3.method75(0, Static69.anInt1989, Static70.aClass5_Sub9_Sub1_3.aByteArray28);
					Static62.method1233();
					anInt2257 = -1;
					Static97.method1805(false);
					Static85.anInt2444 = -1;
				}
			}
		} catch (@Pc(716) IOException local716) {
			if (Static12.anInt3113 < 1) {
				Static75.anInt2182 = 0;
				if (Static36.anInt1055 == Static30.anInt491) {
					Static30.anInt491 = Static16.anInt497;
				} else {
					Static30.anInt491 = Static36.anInt1055;
				}
				Static12.anInt3113++;
			} else {
				Static62.method1227(-2);
			}
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!v;Lclient!sd;Lclient!sd;ILclient!sd;)Z")
	public static boolean method1528(@OriginalArg(0) Class5_Sub7_Sub4 arg0, @OriginalArg(1) Class29 arg1, @OriginalArg(2) Class29 arg2, @OriginalArg(4) Class29 arg3) {
		Static76.aClass29_50 = arg1;
		Static19.aClass29_12 = arg3;
		Static54.aClass5_Sub7_Sub4_3 = arg0;
		Static120.aClass29_83 = arg2;
		return true;
	}

	@OriginalMember(owner = "client!hd", name = "e", descriptor = "(I)V")
	public static void method1529() {
		if (Static123.aString2.toLowerCase().indexOf("microsoft") != -1) {
			Static104.anIntArray423[222] = 59;
			Static104.anIntArray423[192] = 58;
			Static104.anIntArray423[189] = 26;
			Static104.anIntArray423[220] = 74;
			Static104.anIntArray423[223] = 28;
			Static104.anIntArray423[187] = 27;
			Static104.anIntArray423[191] = 73;
			Static104.anIntArray423[219] = 42;
			Static104.anIntArray423[221] = 43;
			Static104.anIntArray423[190] = 72;
			Static104.anIntArray423[186] = 57;
			Static104.anIntArray423[188] = 71;
			return;
		}
		Static104.anIntArray423[93] = 43;
		Static104.anIntArray423[45] = 26;
		Static104.anIntArray423[47] = 73;
		Static104.anIntArray423[44] = 71;
		Static104.anIntArray423[46] = 72;
		if (Static123.aMethod2 == null) {
			Static104.anIntArray423[222] = 59;
			Static104.anIntArray423[192] = 58;
		} else {
			Static104.anIntArray423[222] = 58;
			Static104.anIntArray423[192] = 28;
			Static104.anIntArray423[520] = 59;
		}
		Static104.anIntArray423[59] = 57;
		Static104.anIntArray423[92] = 74;
		Static104.anIntArray423[91] = 42;
		Static104.anIntArray423[61] = 27;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIII)I")
	public static int method1534(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) int local13 = 256 - arg0;
		return ((arg1 & 0xFF00FF) * local13 + arg0 * (arg2 & 0xFF00FF) & 0xFF00FF00) + ((arg2 & 0xFF00) * arg0 + (arg1 & 0xFF00) * local13 & 0xFF0000) >> 8;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(BI)Lclient!bc;")
	public static Class5_Sub2_Sub2 method1539(@OriginalArg(1) int arg0) {
		@Pc(15) Class5_Sub2_Sub2 local15 = (Class5_Sub2_Sub2) Static31.aClass67_9.method1823((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static34.aClass29_25.method733(arg0, 4);
		local15 = new Class5_Sub2_Sub2();
		if (local25 != null) {
			local15.method142(arg0, new Class5_Sub9(local25));
		}
		local15.method139();
		Static31.aClass67_9.method1818(local15, (long) arg0);
		return local15;
	}
}
