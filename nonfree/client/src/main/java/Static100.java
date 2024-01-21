import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!re", name = "g", descriptor = "I")
	public static int anInt2569;

	@OriginalMember(owner = "client!re", name = "k", descriptor = "Lclient!kd;")
	public static Class44_Sub1 aClass44_Sub1_65;

	@OriginalMember(owner = "client!re", name = "m", descriptor = "J")
	public static long aLong80;

	@OriginalMember(owner = "client!re", name = "a", descriptor = "Lclient!oa;")
	private static Class56 aClass56_1412 = Static33.method650("and choose the (Wcreate account(W");

	@OriginalMember(owner = "client!re", name = "c", descriptor = "I")
	public static int anInt2568 = 0;

	@OriginalMember(owner = "client!re", name = "d", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1413 = aClass56_1412;

	@OriginalMember(owner = "client!re", name = "f", descriptor = "Lclient!oa;")
	private static Class56 aClass56_1415 = Static33.method650("Continue");

	@OriginalMember(owner = "client!re", name = "e", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1414 = aClass56_1415;

	@OriginalMember(owner = "client!re", name = "h", descriptor = "I")
	public static int anInt2570 = 0;

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(B)V")
	public static void method1719() {
		aClass56_1413 = null;
		aClass56_1412 = null;
		aClass56_1414 = null;
		aClass56_1415 = null;
		aClass44_Sub1_65 = null;
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(B)V")
	public static void method1720() {
		Static18.method349();
		Static94.aBoolean116 = true;
		Static91.method1630();
		@Pc(38) boolean local38;
		if (Static111.anInt2804 != -1) {
			local38 = Static30.method628(1, 190, Static111.anInt2804, 261);
			if (!local38) {
				Static115.aBoolean157 = true;
			}
		} else if (Static44.anIntArray79[Static27.anInt798] != -1) {
			local38 = Static30.method628(1, 190, Static44.anIntArray79[Static27.anInt798], 261);
			if (!local38) {
				Static115.aBoolean157 = true;
			}
		}
		if (Static122.aBoolean163 && Static42.anInt1117 == 1) {
			if (Static117.anInt2965 == 1) {
				Static36.method682();
			} else {
				Static56.method1062();
			}
		}
		Static5.method43();
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(ZLclient!kd;ILclient!ve;)V")
	public static void method1721(@OriginalArg(1) Class44_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class80 arg2) {
		@Pc(3) Class3_Sub15 local3 = new Class3_Sub15();
		local3.anInt2514 = 1;
		local3.aClass80_4 = arg2;
		local3.aClass44_Sub1_62 = arg0;
		local3.aLong94 = arg1;
		@Pc(28) Class37 local28 = Static45.aClass37_8;
		synchronized (Static45.aClass37_8) {
			Static45.aClass37_8.method985(local3);
		}
		Static104.method1742();
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!ld;I)V")
	public static void method1722(@OriginalArg(0) Applet_Sub1 arg0) {
		if (Static36.anInt1014 != 1) {
			return;
		}
		if (Static127.anInt3209 >= 280 && Static127.anInt3209 <= 294 && Static71.anInt1970 >= 4 && Static71.anInt1970 <= 18) {
			Static114.method1877(0, 0);
			return;
		}
		if (Static127.anInt3209 >= 295 && Static127.anInt3209 <= 360 && Static71.anInt1970 >= 4 && Static71.anInt1970 <= 18) {
			Static114.method1877(1, 0);
			return;
		}
		if (Static127.anInt3209 >= 390 && Static127.anInt3209 <= 404 && Static71.anInt1970 >= 4 && Static71.anInt1970 <= 18) {
			Static114.method1877(0, 1);
			return;
		}
		if (Static127.anInt3209 >= 405 && Static127.anInt3209 <= 470 && Static71.anInt1970 >= 4 && Static71.anInt1970 <= 18) {
			Static114.method1877(1, 1);
			return;
		}
		if (Static127.anInt3209 >= 500 && Static127.anInt3209 <= 514 && Static71.anInt1970 >= 4 && Static71.anInt1970 <= 18) {
			Static114.method1877(0, 2);
			return;
		}
		if (Static127.anInt3209 >= 515 && Static127.anInt3209 <= 580 && Static71.anInt1970 >= 4 && Static71.anInt1970 <= 18) {
			Static114.method1877(1, 2);
			return;
		}
		if (Static127.anInt3209 >= 610 && Static127.anInt3209 <= 624 && Static71.anInt1970 >= 4 && Static71.anInt1970 <= 18) {
			Static114.method1877(0, 3);
			return;
		}
		if (Static127.anInt3209 >= 625 && Static127.anInt3209 <= 690 && Static71.anInt1970 >= 4 && Static71.anInt1970 <= 18) {
			Static114.method1877(1, 3);
			return;
		}
		if (Static127.anInt3209 >= 708 && Static71.anInt1970 >= 4 && Static127.anInt3209 <= 758 && Static71.anInt1970 <= 20) {
			Static29.aBoolean46 = false;
			Static97.aClass3_Sub1_Sub1_Sub2_5.method958(0, 0);
			Static19.aClass3_Sub1_Sub1_Sub2_2.method958(382, 0);
			Static30.aClass3_Sub1_Sub1_Sub4_20.method1504(382 - Static30.aClass3_Sub1_Sub1_Sub4_20.anInt2250 / 2, 18);
			return;
		}
		if (Static21.anInt652 == -1) {
			return;
		}
		@Pc(275) Class75 local275 = Static16.aClass75Array1[Static21.anInt652];
		if (Static3.aBoolean168 == local275.aBoolean161) {
			@Pc(303) byte[] local303 = Static84.method1524(new Class56[] { local275.aClass56_1619, Static43.aClass56_689 }).method1438();
			Static108.aString5 = new String(local303, 0, local303.length);
			Static4.anInt54 = local275.anInt2973;
			Static29.aBoolean46 = false;
			if (Static95.anInt2480 != 0) {
				Static95.anInt2480 = 0;
				Static9.anInt220 = 43594;
				Static86.anInt2357 = 43594;
				Static8.anInt207 = 443;
			}
			Static97.aClass3_Sub1_Sub1_Sub2_5.method958(0, 0);
			Static19.aClass3_Sub1_Sub1_Sub2_2.method958(382, 0);
			Static30.aClass3_Sub1_Sub1_Sub4_20.method1504(382 - Static30.aClass3_Sub1_Sub1_Sub4_20.anInt2250 / 2, 18);
			return;
		}
		@Pc(404) Class56 local404 = Static84.method1524(new Class56[] { Static95.aClass56_1340, local275.aClass56_1619, Static43.aClass56_689, Static122.aClass56_1642, Static12.aClass56_178, Static111.method1851(Static77.aBoolean169 ? 1 : 0), Static57.aClass56_892, Static111.method1851(Static124.anInt3089), Static46.aClass56_1216, Static111.method1851(Static80.anInt2138) });
		try {
			arg0.getAppletContext().showDocument(local404.method1444(), "_self");
			return;
		} catch (@Pc(413) Exception local413) {
			return;
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(BI)Z")
	public static boolean method1723(@OriginalArg(1) int arg0) {
		return (arg0 >> 31 & 0x1) != 0;
	}
}
