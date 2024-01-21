import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!vc", name = "e", descriptor = "I")
	public static int anInt3157;

	@OriginalMember(owner = "client!vc", name = "f", descriptor = "[I")
	public static int[] anIntArray358;

	@OriginalMember(owner = "client!vc", name = "k", descriptor = "[Lclient!l;")
	public static Class6_Sub3_Sub3_Sub2[] aClass6_Sub3_Sub3_Sub2Array12;

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "Lclient!rd;")
	private static Class63 aClass63_1726 = Static80.method1463("wishes to duel with you)3");

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1727 = Static80.method1463("Chat panel redrawn");

	@OriginalMember(owner = "client!vc", name = "n", descriptor = "Lclient!rd;")
	private static Class63 aClass63_1731 = Static80.method1463("Enter name:");

	@OriginalMember(owner = "client!vc", name = "h", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1728 = aClass63_1731;

	@OriginalMember(owner = "client!vc", name = "i", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1729 = Static80.method1463("Bitte wenden Sie sich an den Kundendienst)3");

	@OriginalMember(owner = "client!vc", name = "j", descriptor = "Z")
	public static volatile boolean aBoolean169 = true;

	@OriginalMember(owner = "client!vc", name = "l", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1730 = Static80.method1463("cross");

	@OriginalMember(owner = "client!vc", name = "m", descriptor = "I")
	public static int anInt3159 = 0;

	@OriginalMember(owner = "client!vc", name = "o", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1732 = aClass63_1726;

	@OriginalMember(owner = "client!vc", name = "p", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1733 = Static80.method1463("Abbrechen");

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(BLclient!dc;)V")
	public static void method2108(@OriginalArg(1) Class6_Sub3_Sub1_Sub2 arg0) {
		arg0.aBoolean119 = false;
		@Pc(24) Class6_Sub3_Sub7 local24;
		if (arg0.anInt2308 != -1) {
			local24 = Static30.method721(arg0.anInt2308);
			if (local24 == null || local24.anIntArray152 == null) {
				arg0.anInt2308 = -1;
			} else {
				arg0.anInt2318++;
				if (local24.anIntArray152.length > arg0.anInt2298 && arg0.anInt2318 > local24.anIntArray149[arg0.anInt2298]) {
					arg0.anInt2318 = 1;
					arg0.anInt2298++;
					Static56.method1126(arg0.anInt2298, arg0.anInt2319, local24, arg0.anInt2347);
				}
				if (local24.anIntArray152.length <= arg0.anInt2298) {
					arg0.anInt2298 = 0;
					arg0.anInt2318 = 0;
					Static56.method1126(arg0.anInt2298, arg0.anInt2319, local24, arg0.anInt2347);
				}
			}
		}
		if (arg0.anInt2334 != -1 && arg0.anInt2341 <= Static73.anInt2064) {
			if (arg0.anInt2342 < 0) {
				arg0.anInt2342 = 0;
			}
			@Pc(122) int local122 = Static55.method1124(arg0.anInt2334).anInt2099;
			if (local122 == -1) {
				arg0.anInt2334 = -1;
			} else {
				@Pc(135) Class6_Sub3_Sub7 local135 = Static30.method721(local122);
				if (local135 == null || local135.anIntArray152 == null) {
					arg0.anInt2334 = -1;
				} else {
					arg0.anInt2333++;
					if (arg0.anInt2342 < local135.anIntArray152.length && local135.anIntArray149[arg0.anInt2342] < arg0.anInt2333) {
						arg0.anInt2333 = 1;
						arg0.anInt2342++;
						Static56.method1126(arg0.anInt2342, arg0.anInt2319, local135, arg0.anInt2347);
					}
					if (arg0.anInt2342 >= local135.anIntArray152.length && (arg0.anInt2342 < 0 || local135.anIntArray152.length <= arg0.anInt2342)) {
						arg0.anInt2334 = -1;
					}
				}
			}
		}
		if (arg0.anInt2307 != -1 && arg0.anInt2314 <= 1) {
			local24 = Static30.method721(arg0.anInt2307);
			if (local24.anInt1325 == 1 && arg0.anInt2299 > 0 && Static73.anInt2064 >= arg0.anInt2331 && Static73.anInt2064 > arg0.anInt2332) {
				arg0.anInt2314 = 1;
				return;
			}
		}
		if (arg0.anInt2307 != -1 && arg0.anInt2314 == 0) {
			local24 = Static30.method721(arg0.anInt2307);
			if (local24 == null || local24.anIntArray152 == null) {
				arg0.anInt2307 = -1;
			} else {
				arg0.anInt2292++;
				if (local24.anIntArray152.length > arg0.anInt2329 && arg0.anInt2292 > local24.anIntArray149[arg0.anInt2329]) {
					arg0.anInt2329++;
					arg0.anInt2292 = 1;
					Static56.method1126(arg0.anInt2329, arg0.anInt2319, local24, arg0.anInt2347);
				}
				if (arg0.anInt2329 >= local24.anIntArray152.length) {
					arg0.anInt2325++;
					arg0.anInt2329 -= local24.anInt1310;
					if (local24.anInt1317 <= arg0.anInt2325) {
						arg0.anInt2307 = -1;
					} else if (arg0.anInt2329 >= 0 && arg0.anInt2329 < local24.anIntArray152.length) {
						Static56.method1126(arg0.anInt2329, arg0.anInt2319, local24, arg0.anInt2347);
					} else {
						arg0.anInt2307 = -1;
					}
				}
				arg0.aBoolean119 = local24.aBoolean62;
			}
		}
		if (arg0.anInt2314 > 0) {
			arg0.anInt2314--;
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)V")
	public static void method2109() {
		aClass63_1730 = null;
		aClass6_Sub3_Sub3_Sub2Array12 = null;
		aClass63_1731 = null;
		aClass63_1733 = null;
		aClass63_1728 = null;
		aClass63_1727 = null;
		aClass63_1729 = null;
		anIntArray358 = null;
		aClass63_1732 = null;
		aClass63_1726 = null;
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(B)V")
	public static void method2110() {
		for (@Pc(18) Class6_Sub3_Sub1_Sub6 local18 = (Class6_Sub3_Sub1_Sub6) Static20.aClass1_1.method3(); local18 != null; local18 = (Class6_Sub3_Sub1_Sub6) Static20.aClass1_1.method14()) {
			if (Static101.anInt2810 != local18.anInt2536 || local18.aBoolean129) {
				local18.method2123();
			} else if (local18.anInt2531 <= Static73.anInt2064) {
				local18.method1654(Static68.anInt1973);
				if (local18.aBoolean129) {
					local18.method2123();
				} else {
					Static76.aClass19_1.method657(local18.anInt2536, local18.anInt2537, local18.anInt2535, local18.anInt2533, 60, local18, 0, -1, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(III)V")
	public static void method2111(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < 100; local5++) {
			if (Static106.aClass63Array20[local5] != null) {
				@Pc(20) int local20 = Static100.anIntArray296[local5];
				@Pc(29) int local29 = Static111.anInt3048 + 74 - local3 * 14;
				if (local29 < -20) {
					break;
				}
				if (local20 == 0) {
					local3++;
				}
				@Pc(44) Class63 local44 = Static39.aClass63Array9[local5];
				if (local44 != null && local44.method1803(Static54.aClass63_861)) {
					local44 = local44.method1806(5);
				}
				if (local44 != null && local44.method1803(Static35.aClass63_627)) {
					local44 = local44.method1806(5);
				}
				if ((local20 == 1 || local20 == 2) && (local20 == 1 || Static15.anInt494 == 0 || Static15.anInt494 == 1 && Static52.method1073(local44))) {
					if (local29 - 14 < arg1 && local29 >= arg1 && !local44.method1819(Static120.aClass6_Sub3_Sub1_Sub2_Sub2_1.aClass63_1237)) {
						if (Static22.anInt687 >= 1) {
							Static19.method501(0, Static15.method374(new Class63[] { Static102.aClass63_1535, local44 }), 0, 0, 39, Static41.aClass63_702);
						}
						Static19.method501(0, Static15.method374(new Class63[] { Static102.aClass63_1535, local44 }), 0, 0, 19, Static76.aClass63_1119);
						Static19.method501(0, Static15.method374(new Class63[] { Static102.aClass63_1535, local44 }), 0, 0, 32, Static18.aClass63_388);
					}
					local3++;
				}
				if ((local20 == 3 || local20 == 7) && Static79.anInt2162 == 0 && (local20 == 7 || Static38.anInt1233 == 0 || Static38.anInt1233 == 1 && Static52.method1073(local44))) {
					if (local29 - 14 < arg1 && arg1 <= local29) {
						if (Static22.anInt687 >= 1) {
							Static19.method501(0, Static15.method374(new Class63[] { Static102.aClass63_1535, local44 }), 0, 0, 39, Static41.aClass63_702);
						}
						Static19.method501(0, Static15.method374(new Class63[] { Static102.aClass63_1535, local44 }), 0, 0, 19, Static76.aClass63_1119);
						Static19.method501(0, Static15.method374(new Class63[] { Static102.aClass63_1535, local44 }), 0, 0, 32, Static18.aClass63_388);
					}
					local3++;
				}
				if (local20 == 4 && (Static68.anInt1974 == 0 || Static68.anInt1974 == 1 && Static52.method1073(local44))) {
					if (arg1 > local29 - 14 && local29 >= arg1) {
						Static19.method501(0, Static15.method374(new Class63[] { Static102.aClass63_1535, local44 }), 0, 0, 2, Static106.aClass63_1597);
					}
					local3++;
				}
				if ((local20 == 5 || local20 == 6) && Static79.anInt2162 == 0 && Static38.anInt1233 < 2) {
					local3++;
				}
				if (local20 == 8 && (Static68.anInt1974 == 0 || Static68.anInt1974 == 1 && Static52.method1073(local44))) {
					local3++;
					if (local29 - 14 < arg1 && local29 >= arg1) {
						Static19.method501(0, Static15.method374(new Class63[] { Static102.aClass63_1535, local44 }), 0, 0, 30, Static30.aClass63_543);
					}
				}
			}
		}
	}
}
