import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!kh", name = "tb", descriptor = "Lclient!sh;")
	public static final Class3_Sub23 aClass3_Sub23_1 = new Class3_Sub23(0, 0);

	@OriginalMember(owner = "client!kh", name = "Cb", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_1096 = Static193.method3027("Please contact customer support)3");

	@OriginalMember(owner = "client!kh", name = "zb", descriptor = "Lclient!oc;")
	public static Class70 aClass70_1095 = aClass70_1096;

	@OriginalMember(owner = "client!kh", name = "Db", descriptor = "Lclient!oc;")
	public static Class70 aClass70_1097 = null;

	@OriginalMember(owner = "client!kh", name = "Hb", descriptor = "[I")
	public static final int[] anIntArray134 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIII)V")
	public static void method1584(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static108.anInt2201 == 1) {
			Static40.aClass3_Sub3_Sub2_Sub1Array4[Static191.anInt3883 / 100].method185(Static27.anInt572 - 8, Static31.anInt714 - 8);
		}
		if (Static108.anInt2201 == 2) {
			Static40.aClass3_Sub3_Sub2_Sub1Array4[Static191.anInt3883 / 100 + 4].method185(Static27.anInt572 - 8, Static31.anInt714 + -8);
		}
		Static212.method3339();
		if (!Static165.aBoolean151) {
			return;
		}
		@Pc(49) int local49 = arg0 + 512 - 5;
		@Pc(53) int local53 = arg2 + 20;
		Static83.aClass3_Sub3_Sub2_Sub4_Sub1_4.method3113(Static207.method3296(new Class70[] { Static93.aClass70_963, Static107.method2404(Static28.anInt581) }), local49, local53, 16776960, -1);
		@Pc(74) int local74 = local53 + 15;
		@Pc(76) Runtime local76 = Runtime.getRuntime();
		@Pc(85) int local85 = (int) ((local76.totalMemory() - local76.freeMemory()) / 1024L);
		@Pc(87) int local87 = 16776960;
		if (local85 > 32768 && Static50.aBoolean66) {
			local87 = 16711680;
		}
		if (local85 > 65536 && !Static50.aBoolean66) {
			local87 = 16711680;
		}
		Static83.aClass3_Sub3_Sub2_Sub4_Sub1_4.method3113(Static207.method3296(new Class70[] { Static36.aClass70_393, Static107.method2404(local85), Static50.aClass70_499 }), local49, local74, local87, -1);
		local53 = local74 + 15;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(BLclient!ig;)V")
	public static void method1585(@OriginalArg(1) Applet_Sub1 arg0) {
		if (Static15.anInt343 != 1) {
			return;
		}
		if (Static124.anInt3874 >= 280 && Static124.anInt3874 <= 294 && Static96.anInt2006 >= 4 && Static96.anInt2006 <= 18) {
			Static196.method3062(0, 0);
			return;
		}
		if (Static124.anInt3874 >= 295 && Static124.anInt3874 <= 360 && Static96.anInt2006 >= 4 && Static96.anInt2006 <= 18) {
			Static196.method3062(0, 1);
			return;
		}
		if (Static124.anInt3874 >= 390 && Static124.anInt3874 <= 404 && Static96.anInt2006 >= 4 && Static96.anInt2006 <= 18) {
			Static196.method3062(1, 0);
			return;
		}
		if (Static124.anInt3874 >= 405 && Static124.anInt3874 <= 470 && Static96.anInt2006 >= 4 && Static96.anInt2006 <= 18) {
			Static196.method3062(1, 1);
			return;
		}
		if (Static124.anInt3874 >= 500 && Static124.anInt3874 <= 514 && Static96.anInt2006 >= 4 && Static96.anInt2006 <= 18) {
			Static196.method3062(2, 0);
			return;
		}
		if (Static124.anInt3874 >= 515 && Static124.anInt3874 <= 580 && Static96.anInt2006 >= 4 && Static96.anInt2006 <= 18) {
			Static196.method3062(2, 1);
			return;
		}
		if (Static124.anInt3874 >= 610 && Static124.anInt3874 <= 624 && Static96.anInt2006 >= 4 && Static96.anInt2006 <= 18) {
			Static196.method3062(3, 0);
			return;
		}
		if (Static124.anInt3874 >= 625 && Static124.anInt3874 <= 690 && Static96.anInt2006 >= 4 && Static96.anInt2006 <= 18) {
			Static196.method3062(3, 1);
			return;
		}
		if (Static124.anInt3874 >= 700 && Static96.anInt2006 >= 4 && Static124.anInt3874 <= 758 && Static96.anInt2006 <= 20) {
			Static149.aBoolean142 = false;
			Static186.method2943();
			return;
		}
		if (Static81.anInt1616 == -1) {
			return;
		}
		@Pc(250) Class71 local250 = Static197.aClass71Array1[Static81.anInt1616];
		if (Static4.aBoolean5 == local250.aBoolean139) {
			@Pc(278) byte[] local278 = Static207.method3296(new Class70[] { local250.aClass70_1357, Static161.aClass70_1587 }).method2022();
			Static180.aString6 = new String(local278, 0, local278.length);
			Static143.anInt2933 = local250.anInt2947;
			Static149.aBoolean142 = false;
			if (Static8.anInt189 != 0) {
				Static122.anInt2463 = 443;
				Static8.anInt189 = 0;
				Static18.anInt369 = 43594;
				Static127.anInt2499 = 43594;
			}
			Static186.method2943();
			return;
		}
		@Pc(369) Class70 local369 = Static207.method3296(new Class70[] { Static123.aClass70_1183, local250.aClass70_1357, Static21.aClass70_201, Static107.method2404(Static203.anInt4141), Static7.aClass70_89, Static107.method2404(Static50.aBoolean66 ? 1 : 0), Static59.aClass70_1102, Static107.method2404(Static17.anInt361), Static91.aClass70_922, Static107.method2404(Static172.anInt3461) });
		try {
			arg0.getAppletContext().showDocument(local369.method2049(), "_self");
		} catch (@Pc(378) Exception local378) {
		}
	}

	@OriginalMember(owner = "client!kh", name = "e", descriptor = "(I)V")
	public static void method1586() {
		while (true) {
			if (Static48.aClass3_Sub4_Sub1_43.method1303(Static192.anInt3908) >= 11) {
				@Pc(14) int local14 = Static48.aClass3_Sub4_Sub1_43.method1299(11);
				if (local14 != 2047) {
					@Pc(21) boolean local21 = false;
					if (Static146.aClass26_Sub2_Sub1Array1[local14] == null) {
						Static146.aClass26_Sub2_Sub1Array1[local14] = new Class26_Sub2_Sub1();
						if (Static134.aClass3_Sub4Array1[local14] != null) {
							Static146.aClass26_Sub2_Sub1Array1[local14].method1356(Static134.aClass3_Sub4Array1[local14]);
						}
						local21 = true;
					}
					Static76.anIntArray81[Static80.anInt1607++] = local14;
					@Pc(57) Class26_Sub2_Sub1 local57 = Static146.aClass26_Sub2_Sub1Array1[local14];
					local57.anInt2645 = Static184.anInt3760;
					@Pc(65) int local65 = Static48.aClass3_Sub4_Sub1_43.method1299(5);
					if (local65 > 15) {
						local65 -= 32;
					}
					@Pc(76) int local76 = Static48.aClass3_Sub4_Sub1_43.method1299(5);
					@Pc(83) int local83 = Static155.anIntArray232[Static48.aClass3_Sub4_Sub1_43.method1299(3)];
					if (local76 > 15) {
						local76 -= 32;
					}
					if (local21) {
						local57.anInt2644 = local57.anInt2605 = local83;
					}
					@Pc(102) int local102 = Static48.aClass3_Sub4_Sub1_43.method1299(1);
					@Pc(107) int local107 = Static48.aClass3_Sub4_Sub1_43.method1299(1);
					if (local107 == 1) {
						Static108.anIntArray130[Static134.anInt2682++] = local14;
					}
					local57.method1858(local65 + Static144.aClass26_Sub2_Sub1_1.anIntArray185[0], local102 == 1, Static144.aClass26_Sub2_Sub1_1.anIntArray182[0] + local76);
					continue;
				}
			}
			Static48.aClass3_Sub4_Sub1_43.method1305();
			return;
		}
	}

	@OriginalMember(owner = "client!kh", name = "g", descriptor = "(I)V")
	public static void method1588() {
		Static134.anInt2682 = 0;
		Static54.anInt1164 = 0;
		Static67.method2289();
		Static208.method1855();
		Static174.method2694();
		@Pc(28) int local28;
		for (@Pc(22) int local22 = 0; local22 < Static54.anInt1164; local22++) {
			local28 = Static160.anIntArray244[local22];
			if (Static8.aClass26_Sub2_Sub2Array1[local28].anInt2645 != Static184.anInt3760) {
				Static8.aClass26_Sub2_Sub2Array1[local28].aClass3_Sub3_Sub24_1 = null;
				Static8.aClass26_Sub2_Sub2Array1[local28] = null;
			}
		}
		if (Static48.aClass3_Sub4_Sub1_43.anInt1758 != Static192.anInt3908) {
			throw new RuntimeException("gnp1 pos:" + Static48.aClass3_Sub4_Sub1_43.anInt1758 + " psize:" + Static192.anInt3908);
		}
		for (local28 = 0; local28 < Static201.anInt4110; local28++) {
			if (Static8.aClass26_Sub2_Sub2Array1[Static80.anIntArray85[local28]] == null) {
				throw new RuntimeException("gnp2 pos:" + local28 + " size:" + Static201.anInt4110);
			}
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lclient!e;Z)V")
	public static void method1591(@OriginalArg(0) Class25 arg0) {
		Static22.aClass25_1 = arg0;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lclient!ke;Lclient!ke;ZLclient!ke;)V")
	public static void method1592(@OriginalArg(0) Class52 arg0, @OriginalArg(1) Class52 arg1, @OriginalArg(3) Class52 arg2) {
		Static181.aClass52_36 = arg0;
		Static18.aClass52_6 = arg2;
		Static142.aClass52_32 = arg1;
	}
}
