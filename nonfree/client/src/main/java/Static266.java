import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static266 {

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "I")
	public static int anInt5228;

	@OriginalMember(owner = "client!tn", name = "e", descriptor = "I")
	public static int anInt5231;

	@OriginalMember(owner = "client!tn", name = "l", descriptor = "I")
	public static int anInt5236;

	@OriginalMember(owner = "client!tn", name = "f", descriptor = "I")
	public static int anInt5232 = 0;

	@OriginalMember(owner = "client!tn", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString176 = "Please remove ";

	@OriginalMember(owner = "client!tn", name = "m", descriptor = "[[S")
	public static short[][] aShortArrayArray7 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!tn", name = "n", descriptor = "I")
	public static int anInt5237 = 0;

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lclient!cg;III)[Lclient!wb;")
	public static Class4_Sub2_Sub4[] method4195(@OriginalArg(0) Class22 arg0, @OriginalArg(2) int arg1) {
		return Static225.method3549(0, arg0, arg1) ? Static86.method1428() : null;
	}

	@OriginalMember(owner = "client!tn", name = "c", descriptor = "(B)V")
	public static void method4198() {
		if (Static97.aClass97_20 != null || Static186.aClass97_17 != null) {
			return;
		}
		@Pc(15) int local15 = Static79.anInt1662;
		@Pc(25) int local25;
		@Pc(73) int local73;
		if (!Static137.aBoolean176) {
			if (local15 == 1 && Static286.anInt5602 > 0) {
				@Pc(207) short local207 = Static256.aShortArray81[Static286.anInt5602 - 1];
				if (local207 == 44 || local207 == 2 || local207 == 29 || local207 == 10 || local207 == 23 || local207 == 25 || local207 == 59 || local207 == 35 || local207 == 36 || local207 == 7 || local207 == 12 || local207 == 1007) {
					local25 = Static282.anIntArray439[Static286.anInt5602 - 1];
					local73 = Static49.anIntArray117[Static286.anInt5602 - 1];
					@Pc(275) Class97 local275 = Static148.method2340(local73);
					@Pc(278) Class4_Sub22 local278 = Static41.method791(local275);
					if (local278.method2576() || local278.method2572()) {
						Static76.anInt1553 = 0;
						Static157.aBoolean25 = false;
						if (Static97.aClass97_20 != null) {
							Static178.method2927(Static97.aClass97_20);
						}
						Static97.aClass97_20 = Static148.method2340(local73);
						Static194.anInt3905 = Static72.anInt1466;
						Static28.anInt606 = local25;
						Static195.anInt3933 = Static8.anInt159;
						Static178.method2927(Static97.aClass97_20);
						return;
					}
				}
			}
			if (local15 == 1 && (Static115.anInt2331 == 1 && Static286.anInt5602 > 2 || Static169.method2683(Static286.anInt5602 - 1))) {
				local15 = 2;
			}
			if (local15 == 2 && Static286.anInt5602 > 0 || Static144.anInt2849 == 1) {
				Static253.method3904();
			}
			if (local15 == 1 && Static286.anInt5602 > 0 || Static144.anInt2849 == 2) {
				Static265.method4184();
			}
			return;
		}
		@Pc(27) int local27;
		if (local15 != 1) {
			local25 = Static178.anInt3603;
			local27 = Static79.anInt1661;
			if (local27 < Static242.anInt4776 - 10 || local27 > Static242.anInt4776 + Static16.anInt356 + 10 || local25 < Static139.anInt2754 - 10 || Static43.anInt870 + Static139.anInt2754 + 10 < local25) {
				Static137.aBoolean176 = false;
				Static123.method2033(Static43.anInt870, Static139.anInt2754, Static16.anInt356, Static242.anInt4776);
			}
		}
		if (local15 != 1) {
			return;
		}
		local27 = Static242.anInt4776;
		local25 = Static139.anInt2754;
		local73 = Static16.anInt356;
		@Pc(75) int local75 = Static72.anInt1466;
		@Pc(77) int local77 = Static8.anInt159;
		@Pc(79) int local79 = -1;
		for (@Pc(81) int local81 = 0; local81 < Static286.anInt5602; local81++) {
			@Pc(99) int local99;
			if (Static86.aBoolean103) {
				local99 = local25 + (-local81 + (Static286.anInt5602 - 1)) * 15 + 33;
				if (local27 < local75 && local73 + local27 > local75 && local99 - 13 < local77 && local99 + 3 > local77) {
					local79 = local81;
				}
			} else {
				local99 = local25 + (Static286.anInt5602 + -1 - local81) * 15 + 31;
				if (local75 > local27 && local75 < local27 + local73 && local77 > local99 - 13 && local99 + 3 > local77) {
					local79 = local81;
				}
			}
		}
		if (local79 != -1) {
			Static272.method4319(local79);
		}
		Static137.aBoolean176 = false;
		Static123.method2033(Static43.anInt870, Static139.anInt2754, Static16.anInt356, Static242.anInt4776);
	}
}
