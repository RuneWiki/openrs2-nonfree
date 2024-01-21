import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!je", name = "wb", descriptor = "Lclient!tc;")
	public static Class10_Sub10 aClass10_Sub10_3;

	@OriginalMember(owner = "client!je", name = "Sb", descriptor = "Lclient!m;")
	public static Class10_Sub1_Sub1_Sub2 aClass10_Sub1_Sub1_Sub2_14;

	@OriginalMember(owner = "client!je", name = "yb", descriptor = "J")
	public static long aLong39 = 0L;

	@OriginalMember(owner = "client!je", name = "Lb", descriptor = "Lclient!va;")
	public static Class61 aClass61_568 = null;

	@OriginalMember(owner = "client!je", name = "Nb", descriptor = "Z")
	public static boolean aBoolean64 = true;

	@OriginalMember(owner = "client!je", name = "Ub", descriptor = "Lclient!va;")
	private static Class61 aClass61_571 = Static88.method1421("Unable to find ");

	@OriginalMember(owner = "client!je", name = "Ob", descriptor = "Lclient!va;")
	public static Class61 aClass61_569 = aClass61_571;

	@OriginalMember(owner = "client!je", name = "Pb", descriptor = "Lclient!va;")
	public static Class61 aClass61_570 = Static88.method1421("chatback");

	@OriginalMember(owner = "client!je", name = "Qb", descriptor = "[[I")
	public static int[][] anIntArrayArray10 = new int[104][104];

	@OriginalMember(owner = "client!je", name = "Rb", descriptor = "Z")
	public static boolean aBoolean65 = false;

	@OriginalMember(owner = "client!je", name = "Tb", descriptor = "I")
	public static int anInt1391 = 0;

	@OriginalMember(owner = "client!je", name = "Vb", descriptor = "Lclient!va;")
	public static Class61 aClass61_572 = Static88.method1421(":  ");

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IZ)Lclient!q;")
	public static Class10_Sub1_Sub13 method766(@OriginalArg(0) int arg0) {
		@Pc(10) Class10_Sub1_Sub13 local10 = (Class10_Sub1_Sub13) Static107.aClass29_66.method644((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(27) byte[] local27 = Static30.aClass11_25.method203(1, arg0);
		local10 = new Class10_Sub1_Sub13();
		if (local27 != null) {
			local10.method1232(new Class10_Sub10(local27), arg0);
		}
		local10.method1242();
		Static107.aClass29_66.method649(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(I)V")
	public static void method768() {
		aClass10_Sub1_Sub1_Sub2_14 = null;
		aClass61_570 = null;
		aClass10_Sub10_3 = null;
		aClass61_568 = null;
		Class10_Sub1_Sub10.anIntArray147 = null;
		aClass61_569 = null;
		aClass61_571 = null;
		aClass61_572 = null;
		anIntArrayArray10 = null;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ZLclient!s;I)Z")
	public static boolean method769(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class55 arg1) {
		Static80.anInt2152 = 20;
		try {
			Static5.aClass13_1 = (Class13) Class.forName("Class13_Sub1_Sub1").getDeclaredConstructor().newInstance();
			return true;
		} catch (@Pc(13) Throwable local13) {
			@Pc(17) Interface4 local17 = arg1.method1396();
			if (local17 != null) {
				Static5.aClass13_1 = new Class13_Sub1_Sub2(arg1, local17);
				return true;
			} else if (arg0) {
				Static5.aClass13_1 = new Class13_Sub2(arg1);
				return true;
			} else {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!je", name = "c", descriptor = "(I)V")
	public static void method771() {
		Static71.method1016();
		if (Static9.anInt303 == 1) {
			Static35.aClass10_Sub1_Sub1_Sub1Array5[Static33.anInt987 / 100].method142(Static55.anInt1487 - 8 - 4, Static80.anInt2157 + -8 + -4);
		}
		if (Static9.anInt303 == 2) {
			Static35.aClass10_Sub1_Sub1_Sub1Array5[Static33.anInt987 / 100 + 4].method142(Static55.anInt1487 - 8 - 4, Static80.anInt2157 + -8 - 4);
		}
		if (Static75.anInt2018 != -1) {
			Static105.method1650(Static75.anInt2018);
			Static38.method636(0, 512, -1, 4, 0, Static75.anInt2018, 334, 0);
		}
		if (Static23.anInt752 != -1) {
			Static105.method1650(Static23.anInt752);
			Static38.method636(0, 512, -1, 0, 0, Static23.anInt752, 334, 0);
		}
		Static38.method638();
		if (!Static82.aBoolean97) {
			Static22.method472();
			Static34.method599();
		} else if (Static10.anInt311 == 0) {
			Static82.method1284();
		}
		if (Static80.anInt2163 == 1) {
			Static70.aClass10_Sub1_Sub1_Sub1_58.method142(472, 296);
		}
		@Pc(157) int local157;
		if (Static69.aBoolean87) {
			@Pc(115) byte local115 = 20;
			@Pc(119) int local119 = 16776960;
			if (Static51.anInt1423 < 30 && Static31.aBoolean43) {
				local119 = 16711680;
			}
			if (Static51.anInt1423 < 20 && !Static31.aBoolean43) {
				local119 = 16711680;
			}
			Static99.aClass10_Sub1_Sub1_Sub4_4.method1551(Static93.method1156(new Class61[] { Static57.aClass61_627, Static29.method529(Static51.anInt1423) }), 20, local119);
			@Pc(156) Runtime local156 = Runtime.getRuntime();
			local157 = local115 + 15;
			@Pc(166) int local166 = (int) ((local156.totalMemory() - local156.freeMemory()) / 1024L);
			local119 = 16776960;
			if (local166 > 32768 && Static31.aBoolean43) {
				local119 = 16711680;
			}
			if (local166 > 65536 && !Static31.aBoolean43) {
				local119 = 16711680;
			}
			Static99.aClass10_Sub1_Sub1_Sub4_4.method1551(Static93.method1156(new Class61[] { Static107.aClass61_970, Static29.method529(local166), Static81.aClass61_879 }), 35, local119);
			local157 += 15;
			if (Static7.aBoolean3) {
				Static99.aClass10_Sub1_Sub1_Sub4_4.method1551(Static40.aClass61_453, 50, 16711680);
				local157 += 15;
				Static7.aBoolean3 = false;
			}
			if (Static25.aBoolean36) {
				Static99.aClass10_Sub1_Sub1_Sub4_4.method1551(Static18.aClass61_205, local157, 16711680);
				Static25.aBoolean36 = false;
				local157 += 15;
			}
			if (Static7.aBoolean2) {
				Static99.aClass10_Sub1_Sub1_Sub4_4.method1551(Static94.aClass61_958, local157, 16711680);
				Static7.aBoolean2 = false;
				local157 += 15;
			}
		}
		if (Static19.anInt628 == 0) {
			return;
		}
		@Pc(245) int local245 = Static19.anInt628 / 50;
		local157 = local245 / 60;
		@Pc(253) int local253 = local245 % 60;
		if (local253 < 10) {
			Static99.aClass10_Sub1_Sub1_Sub4_4.method1548(Static93.method1156(new Class61[] { Static80.aClass61_862, Static29.method529(local157), Static82.aClass61_881, Static29.method529(local253) }), 4, 329, 16776960);
		} else {
			Static99.aClass10_Sub1_Sub1_Sub4_4.method1548(Static93.method1156(new Class61[] { Static80.aClass61_862, Static29.method529(local157), Static26.aClass61_698, Static29.method529(local253) }), 4, 329, 16776960);
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(BI)Lclient!va;")
	public static Class61 method774(@OriginalArg(1) int arg0) {
		return arg0 < 999999999 ? Static29.method529(arg0) : Static22.aClass61_286;
	}
}
