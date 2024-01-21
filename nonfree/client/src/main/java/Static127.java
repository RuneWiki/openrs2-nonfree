import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!mc", name = "g", descriptor = "I")
	public static int anInt2499;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
	public static int anInt2495 = 0;

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1191 = Static193.method3027("Benutzername: ");

	@OriginalMember(owner = "client!mc", name = "j", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_1193 = Static193.method3027(" from your ignore list first)3");

	@OriginalMember(owner = "client!mc", name = "e", descriptor = "Lclient!oc;")
	public static Class70 aClass70_1192 = aClass70_1193;

	@OriginalMember(owner = "client!mc", name = "i", descriptor = "I")
	public static int anInt2501 = 0;

	@OriginalMember(owner = "client!mc", name = "k", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1194 = Static193.method3027("<col=ff7000>");

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)V")
	public static void method1770() {
		try {
			if (Static14.anInt325 == 0) {
				if (Static148.aClass33_2 != null) {
					Static148.aClass33_2.method925();
					Static148.aClass33_2 = null;
				}
				Static184.aClass29_8 = null;
				Static14.anInt325 = 1;
				Static9.aBoolean14 = false;
				Static192.anInt3914 = 0;
			}
			if (Static14.anInt325 == 1) {
				if (Static184.aClass29_8 == null) {
					Static184.aClass29_8 = Static47.aClass47_1.method1368(Static18.anInt369, Static180.aString6);
				}
				if (Static184.aClass29_8.anInt973 == 2) {
					throw new IOException();
				}
				if (Static184.aClass29_8.anInt973 == 1) {
					Static148.aClass33_2 = new Class33((Socket) Static184.aClass29_8.anObject2, Static47.aClass47_1);
					Static14.anInt325 = 2;
					Static184.aClass29_8 = null;
				}
			}
			if (Static14.anInt325 == 2) {
				@Pc(77) long local77 = Static74.aLong44 = Static198.aClass70_1992.method2018();
				Static93.aClass3_Sub4_Sub1_18.anInt1758 = 0;
				@Pc(87) int local87 = (int) (local77 >> 16 & 0x1FL);
				Static93.aClass3_Sub4_Sub1_18.method1239(14);
				Static93.aClass3_Sub4_Sub1_18.method1239(local87);
				Static148.aClass33_2.method924(2, Static93.aClass3_Sub4_Sub1_18.aByteArray12);
				Static48.aClass3_Sub4_Sub1_43.anInt1758 = 0;
				Static14.anInt325 = 3;
			}
			@Pc(126) int local126;
			if (Static14.anInt325 == 3) {
				if (Static18.aClass56_1 != null) {
					Static18.aClass56_1.method2451();
				}
				if (Static29.aClass56_2 != null) {
					Static29.aClass56_2.method2451();
				}
				local126 = Static148.aClass33_2.method920();
				if (Static18.aClass56_1 != null) {
					Static18.aClass56_1.method2451();
				}
				if (Static29.aClass56_2 != null) {
					Static29.aClass56_2.method2451();
				}
				if (local126 != 0) {
					Static15.method293(local126);
					return;
				}
				Static14.anInt325 = 4;
				Static48.aClass3_Sub4_Sub1_43.anInt1758 = 0;
			}
			if (Static14.anInt325 == 4) {
				if (Static48.aClass3_Sub4_Sub1_43.anInt1758 < 8) {
					local126 = Static148.aClass33_2.method922();
					if (8 - Static48.aClass3_Sub4_Sub1_43.anInt1758 < local126) {
						local126 = 8 - Static48.aClass3_Sub4_Sub1_43.anInt1758;
					}
					if (local126 > 0) {
						Static148.aClass33_2.method917(Static48.aClass3_Sub4_Sub1_43.aByteArray12, local126, Static48.aClass3_Sub4_Sub1_43.anInt1758);
						Static48.aClass3_Sub4_Sub1_43.anInt1758 += local126;
					}
				}
				if (Static48.aClass3_Sub4_Sub1_43.anInt1758 == 8) {
					Static48.aClass3_Sub4_Sub1_43.anInt1758 = 0;
					Static131.aLong77 = Static48.aClass3_Sub4_Sub1_43.method1272();
					Static14.anInt325 = 5;
				}
			}
			if (Static14.anInt325 == 5) {
				Static93.aClass3_Sub4_Sub1_18.anInt1758 = 0;
				@Pc(221) int[] local221 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static131.aLong77 >> 32), (int) Static131.aLong77 };
				Static93.aClass3_Sub4_Sub1_18.method1239(10);
				Static93.aClass3_Sub4_Sub1_18.method1285(local221[0]);
				Static93.aClass3_Sub4_Sub1_18.method1285(local221[1]);
				Static93.aClass3_Sub4_Sub1_18.method1285(local221[2]);
				Static93.aClass3_Sub4_Sub1_18.method1285(local221[3]);
				Static93.aClass3_Sub4_Sub1_18.method1250(Static198.aClass70_1992.method2018());
				Static93.aClass3_Sub4_Sub1_18.method1274(Static198.aClass70_1993);
				Static93.aClass3_Sub4_Sub1_18.method1255(Static70.aBigInteger1, Static126.aBigInteger2);
				Static155.aClass3_Sub4_Sub1_31.anInt1758 = 0;
				if (Static15.anInt351 == 40) {
					Static155.aClass3_Sub4_Sub1_31.method1239(18);
				} else {
					Static155.aClass3_Sub4_Sub1_31.method1239(16);
				}
				Static155.aClass3_Sub4_Sub1_31.method1239(Static93.aClass3_Sub4_Sub1_18.anInt1758 + Static82.method1178(Static40.aClass70_424) + 129);
				Static155.aClass3_Sub4_Sub1_31.method1285(495);
				Static155.aClass3_Sub4_Sub1_31.method1239(Static50.aBoolean66 ? 1 : 0);
				Static115.method1663(Static155.aClass3_Sub4_Sub1_31);
				Static155.aClass3_Sub4_Sub1_31.method1274(Static40.aClass70_424);
				Static155.aClass3_Sub4_Sub1_31.method1285(Static151.anInt3105);
				Static155.aClass3_Sub4_Sub1_31.method1285(Static156.aClass52_Sub1_21.anInt2223);
				Static155.aClass3_Sub4_Sub1_31.method1285(Static169.aClass52_Sub1_22.anInt2223);
				Static155.aClass3_Sub4_Sub1_31.method1285(Static112.aClass52_Sub1_17.anInt2223);
				Static155.aClass3_Sub4_Sub1_31.method1285(Static19.aClass52_Sub1_3.anInt2223);
				Static155.aClass3_Sub4_Sub1_31.method1285(Static199.aClass52_Sub1_26.anInt2223);
				Static155.aClass3_Sub4_Sub1_31.method1285(Static92.aClass52_Sub1_14.anInt2223);
				Static155.aClass3_Sub4_Sub1_31.method1285(Static10.aClass52_Sub1_2.anInt2223);
				Static155.aClass3_Sub4_Sub1_31.method1285(Static78.aClass52_Sub1_12.anInt2223);
				Static155.aClass3_Sub4_Sub1_31.method1285(Static138.aClass52_Sub1_20.anInt2223);
				Static155.aClass3_Sub4_Sub1_31.method1285(Static61.aClass52_Sub1_9.anInt2223);
				Static155.aClass3_Sub4_Sub1_31.method1285(Static118.aClass52_Sub1_19.anInt2223);
				Static155.aClass3_Sub4_Sub1_31.method1285(Static40.aClass52_Sub1_7.anInt2223);
				Static155.aClass3_Sub4_Sub1_31.method1285(Static113.aClass52_Sub1_18.anInt2223);
				Static155.aClass3_Sub4_Sub1_31.method1285(Static28.aClass52_Sub1_5.anInt2223);
				Static155.aClass3_Sub4_Sub1_31.method1285(Static90.aClass52_Sub1_13.anInt2223);
				Static155.aClass3_Sub4_Sub1_31.method1285(Static78.aClass52_Sub1_11.anInt2223);
				Static155.aClass3_Sub4_Sub1_31.method1285(Static184.aClass52_Sub1_23.anInt2223);
				Static155.aClass3_Sub4_Sub1_31.method1285(Static196.aClass52_Sub1_24.anInt2223);
				Static155.aClass3_Sub4_Sub1_31.method1285(Static199.aClass52_Sub1_25.anInt2223);
				Static155.aClass3_Sub4_Sub1_31.method1285(Static58.aClass52_Sub1_8.anInt2223);
				Static155.aClass3_Sub4_Sub1_31.method1285(Static103.aClass52_Sub1_15.anInt2223);
				Static155.aClass3_Sub4_Sub1_31.method1285(Static26.aClass52_Sub1_4.anInt2223);
				Static155.aClass3_Sub4_Sub1_31.method1285(Static30.aClass52_Sub1_6.anInt2223);
				Static155.aClass3_Sub4_Sub1_31.method1285(Static72.aClass52_Sub1_10.anInt2223);
				Static155.aClass3_Sub4_Sub1_31.method1277(Static93.aClass3_Sub4_Sub1_18.aByteArray12, Static93.aClass3_Sub4_Sub1_18.anInt1758);
				Static148.aClass33_2.method924(Static155.aClass3_Sub4_Sub1_31.anInt1758, Static155.aClass3_Sub4_Sub1_31.aByteArray12);
				Static93.aClass3_Sub4_Sub1_18.method1297(local221);
				for (@Pc(484) int local484 = 0; local484 < 4; local484++) {
					local221[local484] += 50;
				}
				Static48.aClass3_Sub4_Sub1_43.method1297(local221);
				Static14.anInt325 = 6;
			}
			if (Static14.anInt325 == 6 && Static148.aClass33_2.method922() > 0) {
				local126 = Static148.aClass33_2.method920();
				if (local126 == 21 && Static15.anInt351 == 20) {
					Static14.anInt325 = 7;
				} else if (local126 == 2) {
					Static14.anInt325 = 9;
				} else if (local126 == 15 && Static15.anInt351 == 40) {
					Static142.method2040();
					return;
				} else if (local126 == 23 && Static49.anInt997 < 1) {
					Static14.anInt325 = 0;
					Static49.anInt997++;
				} else {
					Static15.method293(local126);
					return;
				}
			}
			if (Static14.anInt325 == 7 && Static148.aClass33_2.method922() > 0) {
				Static191.anInt3890 = Static148.aClass33_2.method920() * 60 + 180;
				Static14.anInt325 = 8;
			}
			if (Static14.anInt325 == 8) {
				Static192.anInt3914 = 0;
				Static152.method2243(Static207.method3296(new Class70[] { Static107.method2404(Static191.anInt3890 / 60), Static211.aClass70_2099 }), Static163.aClass70_1593, Static188.aClass70_1851);
				if (--Static191.anInt3890 <= 0) {
					Static14.anInt325 = 0;
				}
			} else {
				if (Static14.anInt325 == 9 && Static148.aClass33_2.method922() >= 9) {
					Static89.anInt652 = Static148.aClass33_2.method920();
					Static28.anInt580 = Static148.aClass33_2.method920();
					Static97.aBoolean105 = Static148.aClass33_2.method920() == 1;
					Static64.anInt1360 = Static148.aClass33_2.method920();
					Static64.anInt1360 <<= 0x8;
					Static64.anInt1360 += Static148.aClass33_2.method920();
					Static55.anInt1173 = Static148.aClass33_2.method920();
					Static148.aClass33_2.method917(Static48.aClass3_Sub4_Sub1_43.aByteArray12, 1, 0);
					Static48.aClass3_Sub4_Sub1_43.anInt1758 = 0;
					Static155.anInt3189 = Static48.aClass3_Sub4_Sub1_43.method1306();
					Static148.aClass33_2.method917(Static48.aClass3_Sub4_Sub1_43.aByteArray12, 2, 0);
					Static48.aClass3_Sub4_Sub1_43.anInt1758 = 0;
					Static192.anInt3908 = Static48.aClass3_Sub4_Sub1_43.method1270();
					Static14.anInt325 = 10;
				}
				if (Static14.anInt325 != 10) {
					Static192.anInt3914++;
					if (Static192.anInt3914 > 2000) {
						if (Static49.anInt997 < 1) {
							Static14.anInt325 = 0;
							if (Static18.anInt369 == anInt2499) {
								Static18.anInt369 = Static122.anInt2463;
							} else {
								Static18.anInt369 = anInt2499;
							}
							Static49.anInt997++;
						} else {
							Static15.method293(-3);
						}
					}
				} else if (Static148.aClass33_2.method922() >= Static192.anInt3908) {
					Static48.aClass3_Sub4_Sub1_43.anInt1758 = 0;
					Static148.aClass33_2.method917(Static48.aClass3_Sub4_Sub1_43.aByteArray12, Static192.anInt3908, 0);
					Static167.method2489();
					Static191.anInt3881 = -1;
					Static146.method2130(false);
					Static155.anInt3189 = -1;
				}
			}
		} catch (@Pc(763) IOException local763) {
			if (Static49.anInt997 < 1) {
				Static14.anInt325 = 0;
				Static49.anInt997++;
				if (Static18.anInt369 == anInt2499) {
					Static18.anInt369 = Static122.anInt2463;
				} else {
					Static18.anInt369 = anInt2499;
				}
			} else {
				Static15.method293(-2);
			}
		}
	}

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "(I)V")
	public static void method1771() {
		@Pc(3) int local3 = Static36.anInt796;
		@Pc(5) int local5 = Static36.anInt795;
		@Pc(7) int local7 = Static199.anInt4049;
		@Pc(13) int local13 = Static85.anInt1693;
		Static104.method3079(local7, local3, local5, local13, 6116423);
		Static104.method3079(local7 + 1, local3 - -1, local5 - 2, 16, 0);
		Static104.method3097(local7 + 1, local3 + 18, local5 - 2, local13 + -19, 0);
		Static153.aClass3_Sub3_Sub2_Sub4_Sub1_6.method3126(Static14.aClass70_142, local7 + 3, local3 + 14, 6116423, -1);
		@Pc(65) int local65 = Static167.anInt3403;
		@Pc(67) int local67 = Static8.anInt187;
		for (@Pc(69) int local69 = 0; local69 < Static35.anInt770; local69++) {
			@Pc(84) int local84 = local3 + (Static35.anInt770 + -1 - local69) * 15 + 31;
			@Pc(86) int local86 = 16777215;
			if (local67 > local7 && local5 + local7 > local67 && local84 - 13 < local65 && local84 + 3 > local65) {
				local86 = 16776960;
			}
			Static153.aClass3_Sub3_Sub2_Sub4_Sub1_6.method3126(Static44.method723(local69), local7 + 3, local84, local86, 0);
		}
		Static150.method2199(Static36.anInt795, Static36.anInt796, Static199.anInt4049, Static85.anInt1693);
	}
}
