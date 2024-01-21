import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!na", name = "g", descriptor = "I")
	public static int anInt1999;

	@OriginalMember(owner = "client!na", name = "l", descriptor = "Lclient!ea;")
	public static Class20 aClass20_36;

	@OriginalMember(owner = "client!na", name = "n", descriptor = "Lclient!bf;")
	public static Class10 aClass10_1;

	@OriginalMember(owner = "client!na", name = "e", descriptor = "[[I")
	public static int[][] anIntArrayArray18 = new int[5][5000];

	@OriginalMember(owner = "client!na", name = "x", descriptor = "Lclient!ec;")
	private static Class22 aClass22_557 = Static60.method1113("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ");

	@OriginalMember(owner = "client!na", name = "i", descriptor = "Lclient!ec;")
	public static Class22 aClass22_550 = aClass22_557;

	@OriginalMember(owner = "client!na", name = "k", descriptor = "Lclient!ec;")
	private static Class22 aClass22_551 = Static60.method1113("Players");

	@OriginalMember(owner = "client!na", name = "m", descriptor = "Lclient!ec;")
	public static Class22 aClass22_552 = Static60.method1113(" )2> <col=00ffff>");

	@OriginalMember(owner = "client!na", name = "o", descriptor = "Lclient!ec;")
	public static Class22 aClass22_553 = Static60.method1113(" loggt sich aus)3");

	@OriginalMember(owner = "client!na", name = "p", descriptor = "Lclient!ec;")
	public static Class22 aClass22_554 = Static60.method1113("Null");

	@OriginalMember(owner = "client!na", name = "r", descriptor = "Lclient!ec;")
	public static Class22 aClass22_555 = aClass22_551;

	@OriginalMember(owner = "client!na", name = "s", descriptor = "Lclient!ec;")
	public static Class22 aClass22_556 = Static60.method1113(" zuerst von Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!na", name = "t", descriptor = "[I")
	public static int[] anIntArray199 = new int[200];

	@OriginalMember(owner = "client!na", name = "A", descriptor = "Lclient!ec;")
	public static Class22 aClass22_558 = Static60.method1113("null");

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V")
	public static void method1265() {
		System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german], [game0/game1]");
		System.exit(1);
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(I)V")
	public static void method1266() {
		aClass22_556 = null;
		aClass22_551 = null;
		aClass22_550 = null;
		aClass22_557 = null;
		aClass20_36 = null;
		aClass22_558 = null;
		aClass22_555 = null;
		anIntArray199 = null;
		anIntArrayArray18 = null;
		aClass10_1 = null;
		aClass22_553 = null;
		aClass22_552 = null;
		aClass22_554 = null;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IJ)V")
	public static void method1267(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static2.anInt9 >= 100 && Static133.anInt3136 != 1 || Static2.anInt9 >= 200) {
			Static65.method1153(Static51.aClass22_357, 0, Static64.aClass22_485);
			return;
		}
		@Pc(33) Class22 local33 = Static8.method1575(arg0).method473();
		for (@Pc(35) int local35 = 0; local35 < Static2.anInt9; local35++) {
			if (Static29.aLongArray1[local35] == arg0) {
				Static65.method1153(Static44.method856(new Class22[] { local33, Static111.aClass22_839 }), 0, Static64.aClass22_485);
				return;
			}
		}
		for (@Pc(74) int local74 = 0; local74 < Static88.anInt2348; local74++) {
			if (Static85.aLongArray5[local74] == arg0) {
				Static65.method1153(Static44.method856(new Class22[] { Static5.aClass22_43, local33, Static129.aClass22_947 }), 0, Static64.aClass22_485);
				return;
			}
		}
		if (local33.method481(Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.aClass22_444)) {
			Static65.method1153(Static5.aClass22_42, 0, Static64.aClass22_485);
			return;
		}
		Static12.aClass22Array1[Static2.anInt9] = local33;
		Static29.aLongArray1[Static2.anInt9] = arg0;
		anIntArray199[Static2.anInt9] = 0;
		Static5.anIntArray6[Static2.anInt9] = 0;
		Static2.anInt14 = Static96.anInt2513;
		Static2.anInt9++;
		Static38.aClass4_Sub11_Sub1_1.method752(28);
		Static38.aClass4_Sub11_Sub1_1.method728(arg0);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!qd;IB)V")
	public static void method1268(@OriginalArg(0) Class4_Sub1_Sub3_Sub2 arg0, @OriginalArg(1) int arg1) {
		Static114.method1818(arg0.anInt2462, arg0.anInt2500, arg1);
	}

	@OriginalMember(owner = "client!na", name = "c", descriptor = "(I)V")
	public static void method1269() {
		for (@Pc(6) Class4_Sub5 local6 = (Class4_Sub5) Static39.aClass82_4.method2025(); local6 != null; local6 = (Class4_Sub5) Static39.aClass82_4.method2023()) {
			if (local6.anInt537 > 0) {
				local6.anInt537--;
			}
			if (local6.anInt537 != 0) {
				if (local6.anInt538 > 0) {
					local6.anInt538--;
				}
				if (local6.anInt538 == 0 && local6.anInt531 >= 1 && local6.anInt542 >= 1 && local6.anInt531 <= 102 && local6.anInt542 <= 102 && (local6.anInt540 < 0 || Static29.method494(local6.anInt540, local6.anInt530))) {
					Static18.method355(local6.anInt530, local6.anInt526, local6.anInt531, local6.anInt540, local6.anInt539, local6.anInt529, local6.anInt542);
					local6.anInt538 = -1;
					if (local6.anInt532 == local6.anInt540 && local6.anInt532 == -1) {
						local6.method1999();
					} else if (local6.anInt532 == local6.anInt540 && local6.anInt536 == local6.anInt539 && local6.anInt530 == local6.anInt534) {
						local6.method1999();
					}
				}
			} else if (local6.anInt532 < 0 || Static29.method494(local6.anInt532, local6.anInt534)) {
				Static18.method355(local6.anInt534, local6.anInt526, local6.anInt531, local6.anInt532, local6.anInt536, local6.anInt529, local6.anInt542);
				local6.method1999();
			}
		}
	}

	@OriginalMember(owner = "client!na", name = "d", descriptor = "(I)V")
	public static void method1270() {
		Static110.method1772(Static133.aClass4_Sub7_16);
		Static8.anInt2380++;
		if (Static93.aBoolean224 && Static23.aBoolean57) {
			@Pc(26) int local26 = Static72.anInt1914;
			@Pc(28) int local28 = Static117.anInt2876;
			local26 -= Static39.anInt973;
			if (local26 < Static92.anInt2522) {
				local26 = Static92.anInt2522;
			}
			@Pc(44) int local44 = Static133.aClass4_Sub7_16.anInt746;
			local28 -= Static73.anInt1952;
			if (Static92.anInt2522 + Static97.aClass4_Sub7_13.anInt773 < Static133.aClass4_Sub7_16.anInt773 + local26) {
				local26 = Static97.aClass4_Sub7_13.anInt773 + Static92.anInt2522 - Static133.aClass4_Sub7_16.anInt773;
			}
			@Pc(71) int local71 = local26 - Static105.anInt2642;
			if (Static115.anInt2835 > local28) {
				local28 = Static115.anInt2835;
			}
			@Pc(87) int local87 = Static97.aClass4_Sub7_13.anInt791 + local26 - Static92.anInt2522;
			if (Static97.aClass4_Sub7_13.anInt753 + Static115.anInt2835 < Static133.aClass4_Sub7_16.anInt753 + local28) {
				local28 = Static97.aClass4_Sub7_13.anInt753 + Static115.anInt2835 - Static133.aClass4_Sub7_16.anInt753;
			}
			@Pc(114) int local114 = local28 - Static52.anInt1488;
			if (Static8.anInt2380 > Static133.aClass4_Sub7_16.anInt739 && (local44 < local71 || -local44 > local71 || local44 < local114 || -local44 > local114)) {
				Static64.aBoolean163 = true;
			}
			@Pc(153) int local153 = Static97.aClass4_Sub7_13.anInt806 + local28 - Static115.anInt2835;
			@Pc(162) Class4_Sub3 local162;
			if (Static133.aClass4_Sub7_16.anObjectArray23 != null && Static64.aBoolean163) {
				local162 = new Class4_Sub3();
				local162.anInt207 = local87;
				local162.anObjectArray1 = Static133.aClass4_Sub7_16.anObjectArray23;
				local162.aClass4_Sub7_3 = Static133.aClass4_Sub7_16;
				local162.anInt211 = local153;
				Static133.method2036(local162);
			}
			if (Static72.anInt1920 == 0) {
				if (Static64.aBoolean163) {
					if (Static133.aClass4_Sub7_16.anObjectArray27 != null) {
						local162 = new Class4_Sub3();
						local162.anInt207 = local87;
						local162.anInt211 = local153;
						local162.aClass4_Sub7_3 = Static133.aClass4_Sub7_16;
						local162.aClass4_Sub7_2 = Static103.aClass4_Sub7_14;
						local162.anObjectArray1 = Static133.aClass4_Sub7_16.anObjectArray27;
						Static133.method2036(local162);
					}
					if (Static103.aClass4_Sub7_14 != null && Static13.method225(Static133.aClass4_Sub7_16) != null) {
						Static38.aClass4_Sub11_Sub1_1.method752(178);
						Static38.aClass4_Sub11_Sub1_1.method740(Static103.aClass4_Sub7_14.anInt738);
						Static38.aClass4_Sub11_Sub1_1.method735(Static103.aClass4_Sub7_14.anInt784);
						Static38.aClass4_Sub11_Sub1_1.method713(Static133.aClass4_Sub7_16.anInt738);
						Static38.aClass4_Sub11_Sub1_1.method733(Static133.aClass4_Sub7_16.anInt784);
					}
				} else if ((Static104.anInt2626 == 1 || Static28.method446(Static99.anInt2589 - 1)) && Static99.anInt2589 > 2) {
					Static113.method1803();
				} else if (Static99.anInt2589 > 0) {
					Static12.method172(Static99.anInt2589 - 1);
				}
				Static133.aClass4_Sub7_16 = null;
			}
		} else if (Static8.anInt2380 > 1) {
			Static133.aClass4_Sub7_16 = null;
		}
	}

	@OriginalMember(owner = "client!na", name = "e", descriptor = "(I)V")
	public static void method1271() {
		if (Static120.aClass6_4 != null) {
			Static120.aClass6_4.method136();
			Static120.aClass6_4 = null;
		}
		Static84.method1494();
		Static134.aClass77_1.method1943();
		for (@Pc(24) int local24 = 0; local24 < 4; local24++) {
			Static87.aClass60Array1[local24].method1658();
		}
		System.gc();
		Static129.method1980();
		Static93.aBoolean223 = false;
		Static10.anInt209 = -1;
		Static29.method492();
		Static46.method888(10);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(II)Lclient!u;")
	public static Class4_Sub1_Sub15 method1272(@OriginalArg(0) int arg0) {
		@Pc(12) Class4_Sub1_Sub15 local12 = (Class4_Sub1_Sub15) Static18.aClass33_9.method998((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(27) byte[] local27 = Static107.aClass20_51.method597(5, arg0);
		local12 = new Class4_Sub1_Sub15();
		if (local27 != null) {
			local12.method1839(new Class4_Sub11(local27));
		}
		Static18.aClass33_9.method997((long) arg0, local12);
		return local12;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!ec;B)V")
	public static void method1273(@OriginalArg(0) Class22 arg0) {
		if (Static92.aClass4_Sub8Array1 == null) {
			return;
		}
		@Pc(10) int local10 = 0;
		@Pc(14) long local14 = arg0.method468();
		if (local14 == 0L) {
			return;
		}
		while (local10 < Static92.aClass4_Sub8Array1.length && Static92.aClass4_Sub8Array1[local10].aLong99 != local14) {
			local10++;
		}
		if (Static92.aClass4_Sub8Array1.length > local10 && Static92.aClass4_Sub8Array1[local10] != null) {
			Static38.aClass4_Sub11_Sub1_1.method752(194);
			Static38.aClass4_Sub11_Sub1_1.method728(Static92.aClass4_Sub8Array1[local10].aLong99);
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(B)V")
	public static void method1274() {
		Static50.anInt1405 = 0;
		Static84.anInt2252 = 0;
		Static131.method2011();
		Static8.method1570();
		Static7.method129();
		Static37.method584();
		@Pc(25) int local25;
		for (@Pc(19) int local19 = 0; local19 < Static84.anInt2252; local19++) {
			local25 = Static23.anIntArray60[local19];
			if (Static44.aClass4_Sub1_Sub3_Sub2_Sub1Array1[local25].anInt2475 != Static117.anInt2877) {
				Static44.aClass4_Sub1_Sub3_Sub2_Sub1Array1[local25] = null;
			}
		}
		if (Static96.anInt2463 != Static133.aClass4_Sub11_Sub1_3.anInt1099) {
			throw new RuntimeException("gpp1 pos:" + Static133.aClass4_Sub11_Sub1_3.anInt1099 + " psize:" + Static96.anInt2463);
		}
		for (local25 = 0; local25 < Static51.anInt1461; local25++) {
			if (Static44.aClass4_Sub1_Sub3_Sub2_Sub1Array1[Static115.anIntArray310[local25]] == null) {
				throw new RuntimeException("gpp2 pos:" + local25 + " size:" + Static51.anInt1461);
			}
		}
	}
}
