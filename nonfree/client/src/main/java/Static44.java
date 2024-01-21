import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!ge", name = "k", descriptor = "Lclient!rf;")
	public static Class68 aClass68_1;

	@OriginalMember(owner = "client!ge", name = "l", descriptor = "[I")
	public static int[] anIntArray187;

	@OriginalMember(owner = "client!ge", name = "o", descriptor = "[I")
	public static int[] anIntArray188;

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "I")
	public static int anInt1080 = 2;

	@OriginalMember(owner = "client!ge", name = "e", descriptor = "I")
	public static int anInt1082 = 0;

	@OriginalMember(owner = "client!ge", name = "g", descriptor = "Lclient!af;")
	public static Class5 aClass5_555 = Static45.method1937("rot:");

	@OriginalMember(owner = "client!ge", name = "j", descriptor = "Lclient!ua;")
	public static Class1_Sub20_Sub1 aClass1_Sub20_Sub1_1 = new Class1_Sub20_Sub1(5000);

	@OriginalMember(owner = "client!ge", name = "m", descriptor = "Lclient!af;")
	private static Class5 aClass5_556 = Static45.method1937("Service unavailable)3");

	@OriginalMember(owner = "client!ge", name = "n", descriptor = "I")
	public static int anInt1086 = 0;

	@OriginalMember(owner = "client!ge", name = "p", descriptor = "Lclient!af;")
	public static Class5 aClass5_557 = aClass5_556;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!af;Lclient!af;Lclient!af;I)V")
	public static void method797(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(2) Class5 arg2) {
		Static93.aClass5_1116 = arg1;
		Static93.aClass5_1110 = arg0;
		Static93.aClass5_1118 = arg2;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)Z")
	public static boolean method798(@OriginalArg(0) int arg0) {
		return (arg0 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!d;I)V")
	public static void method799(@OriginalArg(0) Applet_Sub1 arg0) {
		if (Static84.aBoolean75) {
			Static73.method1255(arg0);
			return;
		}
		if (Static12.anInt3243 == 1 && Static9.anInt280 >= 715 && Static97.anInt2390 >= 453) {
			Static97.aBoolean96 = !Static97.aBoolean96;
			if (Static97.aBoolean96) {
				Static120.method1342();
			} else {
				Static117.method2222(Static98.aClass41_Sub1_16, Static24.aClass5_352, Static93.aClass5_1117);
			}
		}
		if (Static95.anInt2352 == 5) {
			return;
		}
		Static127.anInt3252++;
		if (Static95.anInt2352 != 10) {
			return;
		}
		if (Static108.anInt2670 != 2 && Static131.anInt3269 == 0) {
			if (Static12.anInt3243 == 1 && Static9.anInt280 >= 5 && Static9.anInt280 <= 105 && Static97.anInt2390 >= 463 && Static97.anInt2390 <= 498) {
				Static83.method1474();
				return;
			}
			if (Static43.aClass45_1 != null) {
				Static83.method1474();
			}
		}
		@Pc(114) int local114 = Static12.anInt3243;
		@Pc(116) int local116 = Static9.anInt280;
		@Pc(118) int local118 = Static97.anInt2390;
		if (Static78.anInt1875 == 0) {
			if (local114 == 1 && local116 >= 227 && local116 <= 377 && local118 >= 271 && local118 <= 311) {
				Static78.anInt1875 = 3;
				Static36.anInt959 = 0;
			}
			if (local114 == 1 && local116 >= 387 && local116 <= 537 && local118 >= 271 && local118 <= 311) {
				Static36.anInt959 = 0;
				Static78.anInt1875 = 2;
				Static93.aClass5_1110 = Static43.aClass5_531;
				Static93.aClass5_1116 = Static60.aClass5_760;
				Static93.aClass5_1118 = Static43.aClass5_545;
				return;
			}
		} else if (Static78.anInt1875 == 2) {
			@Pc(258) short local258 = 231;
			@Pc(259) int local259 = local258 + 30;
			if (local114 == 1 && local118 >= 246 && local118 < 261) {
				Static36.anInt959 = 0;
			}
			local259 += 15;
			if (local114 == 1 && local118 >= 261 && local118 < 276) {
				Static36.anInt959 = 1;
			}
			local259 += 15;
			if (local114 == 1 && local116 >= 227 && local116 <= 377 && local118 >= 301 && local118 <= 341) {
				Static93.aClass5_1114 = Static93.aClass5_1114.method186().method219();
				if (Static93.aClass5_1114.method215() == 0) {
					method797(Static43.aClass5_525, Static93.aClass5_1104, Static43.aClass5_532);
					return;
				}
				if (Static93.aClass5_1120.method215() == 0) {
					method797(Static43.aClass5_517, Static128.aClass5_1464, Static43.aClass5_522);
					return;
				}
				method797(Static43.aClass5_524, Static104.aClass5_1215, Static43.aClass5_520);
				Static97.method1636(20);
				return;
			}
			if (local114 == 1 && local116 >= 387 && local116 <= 537 && local118 >= 301 && local118 <= 341) {
				Static93.aClass5_1114 = Static93.aClass5_1117;
				Static93.aClass5_1120 = Static93.aClass5_1117;
				Static78.anInt1875 = 0;
			}
			while (true) {
				@Pc(410) boolean local410;
				label203: do {
					while (Static101.method1734()) {
						local410 = false;
						for (@Pc(412) int local412 = 0; local412 < Static75.aClass5_869.method215(); local412++) {
							if (Static1.anInt46 == Static75.aClass5_869.method202(local412)) {
								local410 = true;
								break;
							}
						}
						if (Static36.anInt959 != 0) {
							continue label203;
						}
						if (Static25.anInt776 == 85 && Static93.aClass5_1114.method215() > 0) {
							Static93.aClass5_1114 = Static93.aClass5_1114.method200(0, Static93.aClass5_1114.method215() - 1);
						}
						if (Static25.anInt776 == 84 || Static25.anInt776 == 80) {
							Static36.anInt959 = 1;
						}
						if (local410 && Static93.aClass5_1114.method215() < 12) {
							Static93.aClass5_1114 = Static93.aClass5_1114.method212(Static1.anInt46);
						}
					}
					return;
				} while (Static36.anInt959 != 1);
				if (Static25.anInt776 == 85 && Static93.aClass5_1120.method215() > 0) {
					Static93.aClass5_1120 = Static93.aClass5_1120.method200(0, Static93.aClass5_1120.method215() - 1);
				}
				if (Static25.anInt776 == 84 || Static25.anInt776 == 80) {
					Static36.anInt959 = 0;
				}
				if (Static22.anInt728 == 2 && Static25.anInt776 == 84) {
					Static93.aClass5_1114 = Static93.aClass5_1114.method186().method219();
					if (Static93.aClass5_1114.method215() == 0) {
						method797(Static43.aClass5_525, Static93.aClass5_1104, Static43.aClass5_532);
						return;
					}
					if (Static93.aClass5_1120.method215() == 0) {
						method797(Static43.aClass5_517, Static128.aClass5_1464, Static43.aClass5_522);
						return;
					}
					method797(Static43.aClass5_524, Static104.aClass5_1215, Static43.aClass5_520);
					Static97.method1636(20);
					return;
				}
				if (local410 && Static93.aClass5_1120.method215() < 20) {
					Static93.aClass5_1120 = Static93.aClass5_1120.method212(Static1.anInt46);
				}
			}
		} else if (Static78.anInt1875 == 3 && local114 == 1 && local116 >= 307 && local116 <= 457 && local118 >= 301 && local118 <= 341) {
			Static78.anInt1875 = 0;
			return;
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V")
	public static void method800() {
		aClass5_557 = null;
		anIntArray188 = null;
		anIntArray187 = null;
		aClass68_1 = null;
		aClass1_Sub20_Sub1_1 = null;
		aClass5_555 = null;
		aClass5_556 = null;
	}
}
