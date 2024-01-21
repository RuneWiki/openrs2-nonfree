import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!na", name = "R", descriptor = "[I")
	public static int[] anIntArray242;

	@OriginalMember(owner = "client!na", name = "U", descriptor = "Lclient!uc;")
	public static Class2_Sub1_Sub4_Sub3 aClass2_Sub1_Sub4_Sub3_13;

	@OriginalMember(owner = "client!na", name = "X", descriptor = "Lclient!uc;")
	public static Class2_Sub1_Sub4_Sub3 aClass2_Sub1_Sub4_Sub3_14;

	@OriginalMember(owner = "client!na", name = "wb", descriptor = "[I")
	public static int[] anIntArray244;

	@OriginalMember(owner = "client!na", name = "ab", descriptor = "Lclient!ke;")
	private static Class39 aClass39_867 = Static2.method66("System update in: ");

	@OriginalMember(owner = "client!na", name = "Q", descriptor = "Lclient!ke;")
	public static Class39 aClass39_864 = aClass39_867;

	@OriginalMember(owner = "client!na", name = "W", descriptor = "[[I")
	public static int[][] anIntArrayArray19 = new int[104][104];

	@OriginalMember(owner = "client!na", name = "Y", descriptor = "Lclient!ke;")
	public static Class39 aClass39_865 = Static2.method66("::errortest");

	@OriginalMember(owner = "client!na", name = "Z", descriptor = "Lclient!ke;")
	public static Class39 aClass39_866 = Static2.method66("(U2");

	@OriginalMember(owner = "client!na", name = "bb", descriptor = "I")
	public static int anInt1957 = 0;

	@OriginalMember(owner = "client!na", name = "db", descriptor = "Lclient!ke;")
	private static Class39 aClass39_868 = Static2.method66("Too many connections from your address)3");

	@OriginalMember(owner = "client!na", name = "fb", descriptor = "Lclient!ke;")
	public static Class39 aClass39_869 = Static2.method66("redstone1");

	@OriginalMember(owner = "client!na", name = "jb", descriptor = "Z")
	public static boolean aBoolean95 = false;

	@OriginalMember(owner = "client!na", name = "lb", descriptor = "[Lclient!ke;")
	public static Class39[] aClass39Array12 = new Class39[100];

	@OriginalMember(owner = "client!na", name = "ob", descriptor = "Lclient!ke;")
	public static Class39 aClass39_870 = Static2.method66("backleft1");

	@OriginalMember(owner = "client!na", name = "pb", descriptor = "Z")
	public static boolean aBoolean96 = false;

	@OriginalMember(owner = "client!na", name = "qb", descriptor = "Lclient!ke;")
	public static Class39 aClass39_871 = aClass39_868;

	@OriginalMember(owner = "client!na", name = "tb", descriptor = "Lclient!ke;")
	public static Class39 aClass39_872 = Static2.method66("(U1");

	@OriginalMember(owner = "client!na", name = "ub", descriptor = "[I")
	public static int[] anIntArray243 = new int[128];

	@OriginalMember(owner = "client!na", name = "e", descriptor = "(I)V")
	public static void method1402() {
		aClass39_868 = null;
		aClass39_864 = null;
		aClass39_870 = null;
		aClass39_865 = null;
		anIntArray244 = null;
		aClass39_867 = null;
		aClass39Array12 = null;
		aClass39_869 = null;
		aClass39_871 = null;
		anIntArray242 = null;
		aClass2_Sub1_Sub4_Sub3_13 = null;
		anIntArrayArray19 = null;
		aClass39_866 = null;
		aClass2_Sub1_Sub4_Sub3_14 = null;
		anIntArray243 = null;
		aClass39_872 = null;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIZI)V")
	public static void method1403(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (!Static35.aBoolean136) {
			arg4 = 0;
		}
		if (arg2 == Static2.anInt66 && Static71.anInt2025 == arg1 && arg4 == Static28.anInt815) {
			return;
		}
		Static2.anInt66 = arg2;
		Static71.anInt2025 = arg1;
		Static28.anInt815 = arg4;
		Static60.method1127(25);
		Static16.method378(null, Static109.aClass39_1339, false);
		@Pc(41) int local41 = Static75.anInt454;
		Static75.anInt454 = (arg1 - 6) * 8;
		@Pc(52) int local52 = Static75.anInt454 - local41;
		@Pc(56) int local56 = Static19.anInt575;
		Static19.anInt575 = (arg2 - 6) * 8;
		@Pc(67) int local67 = Static19.anInt575 - local56;
		for (@Pc(71) int local71 = 0; local71 < 16384; local71++) {
			@Pc(76) Class2_Sub1_Sub2_Sub3_Sub2 local76 = Static27.aClass2_Sub1_Sub2_Sub3_Sub2Array1[local71];
			if (local76 != null) {
				for (@Pc(80) int local80 = 0; local80 < 10; local80++) {
					local76.anIntArray368[local80] -= local67;
					local76.anIntArray367[local80] -= local52;
				}
				local76.anInt2899 -= local52 * 128;
				local76.anInt2896 -= local67 * 128;
			}
		}
		for (@Pc(125) int local125 = 0; local125 < 2048; local125++) {
			@Pc(130) Class2_Sub1_Sub2_Sub3_Sub1 local130 = Static45.aClass2_Sub1_Sub2_Sub3_Sub1Array1[local125];
			if (local130 != null) {
				for (@Pc(134) int local134 = 0; local134 < 10; local134++) {
					local130.anIntArray368[local134] -= local67;
					local130.anIntArray367[local134] -= local52;
				}
				local130.anInt2896 -= local67 * 128;
				local130.anInt2899 -= local52 * 128;
			}
		}
		Static18.anInt560 = arg4;
		Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.method2066(false, arg0, arg3);
		@Pc(187) byte local187 = 0;
		@Pc(189) byte local189 = 104;
		@Pc(191) byte local191 = 1;
		if (local67 < 0) {
			local191 = -1;
			local189 = -1;
			local187 = 103;
		}
		@Pc(201) byte local201 = 104;
		@Pc(203) byte local203 = 0;
		@Pc(205) byte local205 = 1;
		if (local52 < 0) {
			local203 = 103;
			local205 = -1;
			local201 = -1;
		}
		for (@Pc(215) int local215 = local187; local215 != local189; local215 += local191) {
			for (@Pc(218) int local218 = local203; local218 != local201; local218 += local205) {
				@Pc(223) int local223 = local215 + local67;
				@Pc(228) int local228 = local218 + local52;
				for (@Pc(230) int local230 = 0; local230 < 4; local230++) {
					if (local223 >= 0 && local228 >= 0 && local223 < 104 && local228 < 104) {
						Static55.aClass34ArrayArrayArray1[local230][local215][local218] = Static55.aClass34ArrayArrayArray1[local230][local223][local228];
					} else {
						Static55.aClass34ArrayArrayArray1[local230][local215][local218] = null;
					}
				}
			}
		}
		for (@Pc(295) Class2_Sub3 local295 = (Class2_Sub3) Static89.aClass34_44.method872(); local295 != null; local295 = (Class2_Sub3) Static89.aClass34_44.method879()) {
			local295.anInt497 -= local52;
			local295.anInt500 -= local67;
			if (local295.anInt500 < 0 || local295.anInt497 < 0 || local295.anInt500 >= 104 || local295.anInt497 >= 104) {
				local295.method2045();
			}
		}
		if (Static12.anInt325 != 0) {
			Static55.anInt1552 -= local52;
			Static12.anInt325 -= local67;
		}
		Static87.aBoolean103 = false;
		Static1.anInt1 = 0;
		Static29.anInt838 = -1;
		Static90.aClass34_46.method871();
		Static15.aClass34_55.method871();
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(BLclient!ke;Lclient!ke;Lclient!ke;)V")
	public static void method1404(@OriginalArg(1) Class39 arg0, @OriginalArg(2) Class39 arg1, @OriginalArg(3) Class39 arg2) {
		Static22.aClass39_288 = arg1;
		Static22.aClass39_296 = arg0;
		Static22.aClass39_291 = arg2;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!jd;Lclient!ke;Lclient!ke;I)Lclient!uc;")
	public static Class2_Sub1_Sub4_Sub3 method1407(@OriginalArg(0) Class36 arg0, @OriginalArg(1) Class39 arg1, @OriginalArg(2) Class39 arg2) {
		@Pc(12) int local12 = arg0.method1774(arg1);
		@Pc(22) int local22 = arg0.method1754(arg2, local12);
		return Static66.method1375(local12, local22, arg0);
	}

	@OriginalMember(owner = "client!na", name = "f", descriptor = "(I)V")
	public static void method1408() {
		Static51.aClass2_Sub5_Sub1_4.method1299();
		@Pc(13) int local13 = Static51.aClass2_Sub5_Sub1_4.method1309(8);
		if (Static95.anInt2510 > local13) {
			for (@Pc(18) int local18 = local13; local18 < Static95.anInt2510; local18++) {
				Static60.anIntArray214[Static92.anInt2397++] = Static50.anIntArray193[local18];
			}
		}
		if (Static95.anInt2510 < local13) {
			throw new RuntimeException("gnpov1");
		}
		Static95.anInt2510 = 0;
		for (@Pc(54) int local54 = 0; local54 < local13; local54++) {
			@Pc(60) int local60 = Static50.anIntArray193[local54];
			@Pc(64) Class2_Sub1_Sub2_Sub3_Sub2 local64 = Static27.aClass2_Sub1_Sub2_Sub3_Sub2Array1[local60];
			@Pc(69) int local69 = Static51.aClass2_Sub5_Sub1_4.method1309(1);
			if (local69 == 0) {
				Static50.anIntArray193[Static95.anInt2510++] = local60;
				local64.anInt2931 = Static64.anInt1889;
			} else {
				@Pc(89) int local89 = Static51.aClass2_Sub5_Sub1_4.method1309(2);
				if (local89 == 0) {
					Static50.anIntArray193[Static95.anInt2510++] = local60;
					local64.anInt2931 = Static64.anInt1889;
					Static39.anIntArray167[Static60.anInt1626++] = local60;
				} else {
					@Pc(136) int local136;
					@Pc(146) int local146;
					if (local89 == 1) {
						Static50.anIntArray193[Static95.anInt2510++] = local60;
						local64.anInt2931 = Static64.anInt1889;
						local136 = Static51.aClass2_Sub5_Sub1_4.method1309(3);
						local64.method2070(local136, false);
						local146 = Static51.aClass2_Sub5_Sub1_4.method1309(1);
						if (local146 == 1) {
							Static39.anIntArray167[Static60.anInt1626++] = local60;
						}
					} else if (local89 == 2) {
						Static50.anIntArray193[Static95.anInt2510++] = local60;
						local64.anInt2931 = Static64.anInt1889;
						local136 = Static51.aClass2_Sub5_Sub1_4.method1309(3);
						local64.method2070(local136, true);
						local146 = Static51.aClass2_Sub5_Sub1_4.method1309(3);
						local64.method2070(local146, true);
						@Pc(200) int local200 = Static51.aClass2_Sub5_Sub1_4.method1309(1);
						if (local200 == 1) {
							Static39.anIntArray167[Static60.anInt1626++] = local60;
						}
					} else if (local89 == 3) {
						Static60.anIntArray214[Static92.anInt2397++] = local60;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(II)V")
	public static void method1409(@OriginalArg(0) int arg0) {
		Static93.anInt2434 = arg0;
	}

	@OriginalMember(owner = "client!na", name = "c", descriptor = "(II)Z")
	public static boolean method1410(@OriginalArg(1) int arg0) {
		if (arg0 >= 97 && arg0 <= 122) {
			return true;
		} else if (arg0 >= 65 && arg0 <= 90) {
			return true;
		} else {
			return arg0 >= 48 && arg0 <= 57;
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Ljava/awt/Component;BLclient!jd;)V")
	public static void method1411(@OriginalArg(0) Component arg0, @OriginalArg(2) Class36 arg1) {
		if (Static77.aBoolean100) {
			return;
		}
		Static26.aClass2_Sub1_Sub4_Sub3_5 = method1407(arg1, Static42.aClass39_537, Static9.aClass39_84);
		Static55.aClass2_Sub1_Sub4_Sub3_10 = method1407(arg1, Static29.aClass39_384, Static9.aClass39_84);
		Static4.aClass2_Sub1_Sub4_Sub3_1 = method1407(arg1, Static101.aClass39_1253, Static9.aClass39_84);
		Static51.aClass2_Sub1_Sub4_Sub3_18 = method1407(arg1, Static88.aClass39_481, Static9.aClass39_84);
		Static56.aClass2_Sub1_Sub4_Sub3_11 = method1407(arg1, Static22.aClass39_297, Static9.aClass39_84);
		aClass2_Sub1_Sub4_Sub3_14 = method1407(arg1, Static86.aClass39_1057, Static9.aClass39_84);
		Static55.aClass51_34 = Static72.method1484(479, 96, arg0);
		Static55.aClass2_Sub1_Sub4_Sub3_10.method1946(0, 0);
		Static60.aClass51_36 = Static72.method1484(172, 156, arg0);
		Static91.method2012();
		Static4.aClass2_Sub1_Sub4_Sub3_1.method1946(0, 0);
		Static94.aClass51_51 = Static72.method1484(190, 261, arg0);
		Static26.aClass2_Sub1_Sub4_Sub3_5.method1946(0, 0);
		Static51.aClass51_50 = Static72.method1484(512, 334, arg0);
		Static91.method2012();
		Static81.aClass51_45 = Static72.method1484(496, 50, arg0);
		Static29.aClass51_16 = Static72.method1484(269, 37, arg0);
		Static75.aClass51_10 = Static72.method1484(249, 45, arg0);
		@Pc(109) Class2_Sub1_Sub4_Sub2 local109 = Static20.method430(aClass39_870, Static9.aClass39_84, arg1);
		Static95.aClass51_52 = Static72.method1484(local109.anInt1497, local109.anInt1498, arg0);
		local109.method1044(0, 0);
		@Pc(127) Class2_Sub1_Sub4_Sub2 local127 = Static20.method430(Static41.aClass39_519, Static9.aClass39_84, arg1);
		Static105.aClass51_59 = Static72.method1484(local127.anInt1497, local127.anInt1498, arg0);
		local127.method1044(0, 0);
		@Pc(145) Class2_Sub1_Sub4_Sub2 local145 = Static20.method430(Static16.aClass39_246, Static9.aClass39_84, arg1);
		Static53.aClass51_31 = Static72.method1484(local145.anInt1497, local145.anInt1498, arg0);
		local145.method1044(0, 0);
		@Pc(163) Class2_Sub1_Sub4_Sub2 local163 = Static20.method430(Static100.aClass39_1244, Static9.aClass39_84, arg1);
		Static9.aClass51_5 = Static72.method1484(local163.anInt1497, local163.anInt1498, arg0);
		local163.method1044(0, 0);
		@Pc(181) Class2_Sub1_Sub4_Sub2 local181 = Static20.method430(Static84.aClass39_1298, Static9.aClass39_84, arg1);
		Static76.aClass51_43 = Static72.method1484(local181.anInt1497, local181.anInt1498, arg0);
		local181.method1044(0, 0);
		@Pc(199) Class2_Sub1_Sub4_Sub2 local199 = Static20.method430(Static19.aClass39_283, Static9.aClass39_84, arg1);
		Static45.aClass51_26 = Static72.method1484(local199.anInt1497, local199.anInt1498, arg0);
		local199.method1044(0, 0);
		@Pc(217) Class2_Sub1_Sub4_Sub2 local217 = Static20.method430(Static82.aClass39_1001, Static9.aClass39_84, arg1);
		Static30.aClass51_17 = Static72.method1484(local217.anInt1497, local217.anInt1498, arg0);
		local217.method1044(0, 0);
		@Pc(235) Class2_Sub1_Sub4_Sub2 local235 = Static20.method430(Static93.aClass39_1124, Static9.aClass39_84, arg1);
		Static4.aClass51_3 = Static72.method1484(local235.anInt1497, local235.anInt1498, arg0);
		local235.method1044(0, 0);
		@Pc(253) Class2_Sub1_Sub4_Sub2 local253 = Static20.method430(Static2.aClass39_35, Static9.aClass39_84, arg1);
		Static55.aClass51_35 = Static72.method1484(local253.anInt1497, local253.anInt1498, arg0);
		local253.method1044(0, 0);
		Static17.aClass2_Sub1_Sub4_Sub3_3 = method1407(arg1, aClass39_869, Static9.aClass39_84);
		Static72.aClass2_Sub1_Sub4_Sub3_15 = method1407(arg1, Static39.aClass39_505, Static9.aClass39_84);
		aClass2_Sub1_Sub4_Sub3_13 = method1407(arg1, Static55.aClass39_696, Static9.aClass39_84);
		Static96.aClass2_Sub1_Sub4_Sub3_20 = Static17.aClass2_Sub1_Sub4_Sub3_3.method1943();
		Static96.aClass2_Sub1_Sub4_Sub3_20.method1942();
		Static73.aClass2_Sub1_Sub4_Sub3_16 = Static72.aClass2_Sub1_Sub4_Sub3_15.method1943();
		Static73.aClass2_Sub1_Sub4_Sub3_16.method1942();
		Static94.aClass2_Sub1_Sub4_Sub3_19 = Static17.aClass2_Sub1_Sub4_Sub3_3.method1943();
		Static94.aClass2_Sub1_Sub4_Sub3_19.method1944();
		Static81.aClass2_Sub1_Sub4_Sub3_17 = Static72.aClass2_Sub1_Sub4_Sub3_15.method1943();
		Static81.aClass2_Sub1_Sub4_Sub3_17.method1944();
		Static45.aClass2_Sub1_Sub4_Sub3_8 = aClass2_Sub1_Sub4_Sub3_13.method1943();
		Static45.aClass2_Sub1_Sub4_Sub3_8.method1944();
		Static31.aClass2_Sub1_Sub4_Sub3_12 = Static17.aClass2_Sub1_Sub4_Sub3_3.method1943();
		Static31.aClass2_Sub1_Sub4_Sub3_12.method1942();
		Static31.aClass2_Sub1_Sub4_Sub3_12.method1944();
		Static23.aClass2_Sub1_Sub4_Sub3_4 = Static72.aClass2_Sub1_Sub4_Sub3_15.method1943();
		Static23.aClass2_Sub1_Sub4_Sub3_4.method1942();
		Static23.aClass2_Sub1_Sub4_Sub3_4.method1944();
		Static95.aClass2_Sub1_Sub4_Sub3Array5 = Static22.method436(Static89.aClass39_1071, Static9.aClass39_84, arg1);
		Static18.anIntArray59 = new int[33];
		Static28.anIntArray88 = new int[33];
		Static71.anIntArray255 = new int[151];
		Static109.anIntArray371 = new int[151];
		@Pc(347) int local347;
		@Pc(345) int local345;
		@Pc(349) int local349;
		for (@Pc(342) int local342 = 0; local342 < 33; local342++) {
			local345 = 0;
			local347 = 999;
			for (local349 = 0; local349 < 34; local349++) {
				if (Static4.aClass2_Sub1_Sub4_Sub3_1.aByteArray24[local349 + local342 * Static4.aClass2_Sub1_Sub4_Sub3_1.anInt2733] == 0) {
					if (local347 == 999) {
						local347 = local349;
					}
				} else if (local347 != 999) {
					local345 = local349;
					break;
				}
			}
			Static28.anIntArray88[local342] = local347;
			Static18.anIntArray59[local342] = local345 - local347;
		}
		for (local347 = 5; local347 < 156; local347++) {
			local349 = 0;
			local345 = 999;
			for (@Pc(405) int local405 = 25; local405 < 172; local405++) {
				if (Static4.aClass2_Sub1_Sub4_Sub3_1.aByteArray24[Static4.aClass2_Sub1_Sub4_Sub3_1.anInt2733 * local347 + local405] == 0 && (local405 > 34 || local347 > 34)) {
					if (local345 == 999) {
						local345 = local405;
					}
				} else if (local345 != 999) {
					local349 = local405;
					break;
				}
			}
			Static109.anIntArray371[local347 - 5] = local345 - 25;
			Static71.anIntArray255[local347 - 5] = local349 - local345;
		}
		Static77.aBoolean100 = true;
	}
}
