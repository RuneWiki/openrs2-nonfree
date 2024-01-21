import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!n", name = "G", descriptor = "Z")
	public static boolean aBoolean100;

	@OriginalMember(owner = "client!n", name = "x", descriptor = "Lclient!ja;")
	public static Class39 aClass39_988 = Static28.method504(" <col=ffff00>");

	@OriginalMember(owner = "client!n", name = "y", descriptor = "Lclient!ja;")
	public static Class39 aClass39_989 = Static28.method504("oder ung-Ultiges Passwort)3");

	@OriginalMember(owner = "client!n", name = "C", descriptor = "Lclient!ja;")
	private static Class39 aClass39_991 = Static28.method504("Your account has been disabled)3");

	@OriginalMember(owner = "client!n", name = "A", descriptor = "Lclient!ja;")
	public static Class39 aClass39_990 = aClass39_991;

	@OriginalMember(owner = "client!n", name = "B", descriptor = "I")
	public static int anInt1849 = 0;

	@OriginalMember(owner = "client!n", name = "H", descriptor = "Lclient!ja;")
	public static Class39 aClass39_992 = Static28.method504("::rect_debug");

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(BLclient!ae;)V")
	public static void method1292(@OriginalArg(1) Class4_Sub2_Sub1_Sub1 arg0) {
		arg0.anInt2691 = arg0.anInt2679;
		if (arg0.anInt2660 == 0) {
			arg0.anInt2648 = 0;
			return;
		}
		if (arg0.anInt2678 != -1 && arg0.anInt2659 == 0) {
			@Pc(32) Class4_Sub2_Sub2 local32 = Static116.method2017(arg0.anInt2678);
			if (arg0.anInt2685 > 0 && local32.anInt318 == 0) {
				arg0.anInt2648++;
				return;
			}
			if (arg0.anInt2685 <= 0 && local32.anInt317 == 0) {
				arg0.anInt2648++;
				return;
			}
		}
		@Pc(79) int local79 = arg0.anInt2653 * 64 + arg0.anIntArray300[arg0.anInt2660 - 1] * 128;
		@Pc(82) int local82 = arg0.anInt2641;
		@Pc(85) int local85 = arg0.anInt2643;
		@Pc(101) int local101 = arg0.anIntArray296[arg0.anInt2660 - 1] * 128 + arg0.anInt2653 * 64;
		if (local79 - local85 > 256 || local79 - local85 < -256 || local101 - local82 > 256 || local101 - local82 < -256) {
			arg0.anInt2641 = local101;
			arg0.anInt2643 = local79;
			return;
		}
		if (local85 < local79) {
			if (local101 > local82) {
				arg0.anInt2644 = 1280;
			} else if (local82 <= local101) {
				arg0.anInt2644 = 1536;
			} else {
				arg0.anInt2644 = 1792;
			}
		} else if (local85 <= local79) {
			if (local101 > local82) {
				arg0.anInt2644 = 1024;
			} else if (local82 > local101) {
				arg0.anInt2644 = 0;
			}
		} else if (local101 > local82) {
			arg0.anInt2644 = 768;
		} else if (local82 <= local101) {
			arg0.anInt2644 = 512;
		} else {
			arg0.anInt2644 = 256;
		}
		@Pc(219) int local219 = arg0.anInt2644 - arg0.anInt2670 & 0x7FF;
		if (local219 > 1024) {
			local219 -= 2048;
		}
		@Pc(228) int local228 = arg0.anInt2669;
		@Pc(230) boolean local230 = true;
		if (local219 >= -256 && local219 <= 256) {
			local228 = arg0.anInt2690;
		} else if (local219 >= 256 && local219 < 768) {
			local228 = arg0.anInt2665;
		} else if (local219 >= -768 && local219 <= -256) {
			local228 = arg0.anInt2655;
		}
		if (local228 == -1) {
			local228 = arg0.anInt2690;
		}
		@Pc(278) int local278 = 4;
		arg0.anInt2691 = local228;
		if (arg0 instanceof Class4_Sub2_Sub1_Sub1_Sub2) {
			local230 = ((Class4_Sub2_Sub1_Sub1_Sub2) arg0).aClass4_Sub2_Sub16_1.aBoolean144;
		}
		if (local230) {
			if (arg0.anInt2644 != arg0.anInt2670 && arg0.anInt2674 == -1 && arg0.anInt2658 != 0) {
				local278 = 2;
			}
			if (arg0.anInt2660 > 2) {
				local278 = 6;
			}
			if (arg0.anInt2660 > 3) {
				local278 = 8;
			}
			if (arg0.anInt2648 > 0 && arg0.anInt2660 > 1) {
				local278 = 8;
				arg0.anInt2648--;
			}
		} else {
			if (arg0.anInt2660 > 1) {
				local278 = 6;
			}
			if (arg0.anInt2660 > 2) {
				local278 = 8;
			}
			if (arg0.anInt2648 > 0 && arg0.anInt2660 > 1) {
				arg0.anInt2648--;
				local278 = 8;
			}
		}
		if (arg0.aBooleanArray15[arg0.anInt2660 - 1]) {
			local278 <<= 0x1;
		}
		if (local101 > local82) {
			arg0.anInt2641 += local278;
			if (local101 < arg0.anInt2641) {
				arg0.anInt2641 = local101;
			}
		} else if (local82 > local101) {
			arg0.anInt2641 -= local278;
			if (arg0.anInt2641 < local101) {
				arg0.anInt2641 = local101;
			}
		}
		if (local79 > local85) {
			arg0.anInt2643 += local278;
			if (local79 < arg0.anInt2643) {
				arg0.anInt2643 = local79;
			}
		} else if (local79 < local85) {
			arg0.anInt2643 -= local278;
			if (local79 > arg0.anInt2643) {
				arg0.anInt2643 = local79;
			}
		}
		if (local278 >= 8 && arg0.anInt2691 == arg0.anInt2690 && arg0.anInt2642 != -1) {
			arg0.anInt2691 = arg0.anInt2642;
		}
		if (local79 != arg0.anInt2643 || arg0.anInt2641 != local101) {
			return;
		}
		arg0.anInt2660--;
		if (arg0.anInt2685 > 0) {
			arg0.anInt2685--;
			return;
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(III)V")
	public static void method1293(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) Class61 local11 = Static26.aClass61ArrayArrayArray1[Static131.anInt3202][arg0][arg1];
		if (local11 == null) {
			Static101.aClass43_1.method1079(Static131.anInt3202, arg0, arg1);
			return;
		}
		@Pc(24) Class4_Sub2_Sub1_Sub7 local24 = (Class4_Sub2_Sub1_Sub7) local11.method1628();
		@Pc(26) int local26 = -99999999;
		@Pc(33) Class4_Sub2_Sub1_Sub7 local33 = null;
		while (local24 != null) {
			@Pc(39) Class4_Sub2_Sub5 local39 = Static119.method2166(local24.anInt3125);
			@Pc(42) int local42 = local39.anInt631;
			if (local39.anInt606 == 1) {
				local42 *= local24.anInt3128 + 1;
			}
			if (local26 < local42) {
				local26 = local42;
				local33 = local24;
			}
			local24 = (Class4_Sub2_Sub1_Sub7) local11.method1629();
		}
		if (local33 == null) {
			Static101.aClass43_1.method1079(Static131.anInt3202, arg0, arg1);
			return;
		}
		local11.method1632(local33);
		@Pc(81) Class4_Sub2_Sub1_Sub7 local81 = null;
		@Pc(83) Class4_Sub2_Sub1_Sub7 local83 = null;
		@Pc(92) int local92 = arg0 + (arg1 << 7) + 1610612736;
		for (local24 = (Class4_Sub2_Sub1_Sub7) local11.method1628(); local24 != null; local24 = (Class4_Sub2_Sub1_Sub7) local11.method1629()) {
			if (local33.anInt3125 != local24.anInt3125) {
				if (local81 == null) {
					local81 = local24;
				}
				if (local24.anInt3125 != local81.anInt3125 && local83 == null) {
					local83 = local24;
				}
			}
		}
		Static101.aClass43_1.method1112(Static131.anInt3202, arg0, arg1, Static94.method1708(arg0 * 128 + 64, arg1 * 128 - -64, Static131.anInt3202), local33, local92, local81, local83);
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;Z)V")
	public static void method1294(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg0 != null) {
				local7 = Static21.method407(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg1;
			}
			System.out.println("Error: " + local7);
			local7 = local7.replace(':', '.');
			local7 = local7.replace('@', '_');
			local7 = local7.replace('&', '_');
			local7 = local7.replace('#', '_');
			if (Static59.aClass29_28.anApplet1 != null) {
				@Pc(101) Class16 local101 = Static59.aClass29_28.method603(new URL(Static59.aClass29_28.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static98.anInt1021 + "&u=" + Static120.aLong143 + "&v1=" + Static37.aString2 + "&v2=" + Static37.aString4 + "&e=" + local7));
				while (local101.anInt441 == 0) {
					Static125.method2177(1L);
				}
				if (local101.anInt441 == 1) {
					@Pc(123) DataInputStream local123 = (DataInputStream) local101.anObject2;
					local123.read();
					local123.close();
				}
			}
		} catch (@Pc(130) Exception local130) {
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(ZLclient!de;)V")
	public static void method1295(@OriginalArg(1) Applet_Sub1 arg0) {
		if (Static62.anInt1637 != 1) {
			return;
		}
		if (Static27.anInt741 >= 280 && Static27.anInt741 <= 294 && Static1.anInt9 >= 4 && Static1.anInt9 <= 18) {
			Static20.method389(0, 0);
			return;
		}
		if (Static27.anInt741 >= 295 && Static27.anInt741 <= 360 && Static1.anInt9 >= 4 && Static1.anInt9 <= 18) {
			Static20.method389(1, 0);
			return;
		}
		if (Static27.anInt741 >= 390 && Static27.anInt741 <= 404 && Static1.anInt9 >= 4 && Static1.anInt9 <= 18) {
			Static20.method389(0, 1);
			return;
		}
		if (Static27.anInt741 >= 405 && Static27.anInt741 <= 470 && Static1.anInt9 >= 4 && Static1.anInt9 <= 18) {
			Static20.method389(1, 1);
			return;
		}
		if (Static27.anInt741 >= 500 && Static27.anInt741 <= 514 && Static1.anInt9 >= 4 && Static1.anInt9 <= 18) {
			Static20.method389(0, 2);
			return;
		}
		if (Static27.anInt741 >= 515 && Static27.anInt741 <= 580 && Static1.anInt9 >= 4 && Static1.anInt9 <= 18) {
			Static20.method389(1, 2);
			return;
		}
		if (Static27.anInt741 >= 610 && Static27.anInt741 <= 624 && Static1.anInt9 >= 4 && Static1.anInt9 <= 18) {
			Static20.method389(0, 3);
			return;
		}
		if (Static27.anInt741 >= 625 && Static27.anInt741 <= 690 && Static1.anInt9 >= 4 && Static1.anInt9 <= 18) {
			Static20.method389(1, 3);
			return;
		}
		if (Static27.anInt741 >= 708 && Static1.anInt9 >= 4 && Static27.anInt741 <= 758 && Static1.anInt9 <= 20) {
			Static46.aBoolean54 = false;
			Static93.aClass4_Sub2_Sub3_Sub1_9.method870(0, 0);
			Static51.aClass4_Sub2_Sub3_Sub1_5.method870(382, 0);
			Static105.aClass4_Sub2_Sub3_Sub4_5.method1688(382 - Static105.aClass4_Sub2_Sub3_Sub4_5.anInt2267 / 2, 18);
			return;
		}
		if (Static49.anInt1278 == -1) {
			return;
		}
		@Pc(278) Class76 local278 = Static106.aClass76Array1[Static49.anInt1278];
		if (local278.aBoolean145 == Static99.aBoolean121) {
			@Pc(302) byte[] local302 = Static62.method1123(new Class39[] { local278.aClass39_1544, Static82.aClass39_1043 }).method965();
			Static35.aString1 = new String(local302, 0, local302.length);
			Static49.anInt1283 = local278.anInt2951;
			Static46.aBoolean54 = false;
			if (Static1.anInt2 != 0) {
				Static123.anInt3044 = 43594;
				Static103.anInt2560 = 43594;
				Static127.anInt3134 = 443;
				Static1.anInt2 = 0;
			}
			Static93.aClass4_Sub2_Sub3_Sub1_9.method870(0, 0);
			Static51.aClass4_Sub2_Sub3_Sub1_5.method870(382, 0);
			Static105.aClass4_Sub2_Sub3_Sub4_5.method1688(382 - Static105.aClass4_Sub2_Sub3_Sub4_5.anInt2267 / 2, 18);
			return;
		}
		@Pc(407) Class39 local407 = Static62.method1123(new Class39[] { Static128.aClass39_1766, local278.aClass39_1544, Static82.aClass39_1043, Static72.aClass39_426, Static72.aClass39_421, Static29.method510(Static123.aBoolean150 ? 1 : 0), Static115.aClass39_1512, Static29.method510(Static105.anInt2043), Static97.aClass39_1276, Static29.method510(Static62.anInt1638) });
		try {
			arg0.getAppletContext().showDocument(local407.method947(), "_self");
			return;
		} catch (@Pc(416) Exception local416) {
			return;
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Lclient!pd;Lclient!ja;Lclient!ja;I)Lclient!q;")
	public static Class4_Sub2_Sub3_Sub4 method1296(@OriginalArg(0) Class20 arg0, @OriginalArg(1) Class39 arg1, @OriginalArg(2) Class39 arg2) {
		@Pc(8) int local8 = arg0.method484(arg2);
		@Pc(14) int local14 = arg0.method475(arg1, local8);
		return Static74.method1216(local14, local8, arg0);
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Z)V")
	public static void method1297() {
		aClass39_991 = null;
		aClass39_992 = null;
		aClass39_988 = null;
		aClass39_990 = null;
		aClass39_989 = null;
	}
}
