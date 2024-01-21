import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!ve", name = "gb", descriptor = "[I")
	public static int[] anIntArray486;

	@OriginalMember(owner = "client!ve", name = "Y", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_2526 = Static118.method2249("Please try using a different world)3");

	@OriginalMember(owner = "client!ve", name = "O", descriptor = "Lclient!oc;")
	public static Class65 aClass65_2519 = aClass65_2526;

	@OriginalMember(owner = "client!ve", name = "P", descriptor = "Lclient!oc;")
	public static Class65 aClass65_2520 = aClass65_2526;

	@OriginalMember(owner = "client!ve", name = "db", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_2527 = Static118.method2249("Starting 3d library");

	@OriginalMember(owner = "client!ve", name = "Q", descriptor = "Lclient!oc;")
	public static Class65 aClass65_2521 = aClass65_2527;

	@OriginalMember(owner = "client!ve", name = "R", descriptor = "Lclient!oc;")
	public static Class65 aClass65_2522 = aClass65_2526;

	@OriginalMember(owner = "client!ve", name = "S", descriptor = "Lclient!oc;")
	public static Class65 aClass65_2523 = aClass65_2526;

	@OriginalMember(owner = "client!ve", name = "kb", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_2528 = Static118.method2249("Please wait 1 minute and try again)3");

	@OriginalMember(owner = "client!ve", name = "V", descriptor = "Lclient!oc;")
	public static Class65 aClass65_2524 = aClass65_2528;

	@OriginalMember(owner = "client!ve", name = "W", descriptor = "[I")
	public static final int[] anIntArray484 = new int[128];

	@OriginalMember(owner = "client!ve", name = "X", descriptor = "Lclient!oc;")
	public static Class65 aClass65_2525 = aClass65_2526;

	@OriginalMember(owner = "client!ve", name = "ab", descriptor = "[I")
	public static final int[] anIntArray485 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 67, 68, 69, 70, 71, 72, 75, 79, 80, 81, 82, 87, 88, 89, 90, 77, 96, 98, 99, 100, 101, 102, 250, 251, 109, 110, 111, 112, 117, 252, 167, 126, 127, 128, 129, 130, 131, 132, 135, 139, 140, 141, 142, 147, 148, 149, 150, 137, 156, 158, 159, 160, 161, 162, 253, 254, 170, 171, 172, 173, 178, 255, 179 };

	@OriginalMember(owner = "client!ve", name = "eb", descriptor = "I")
	public static int anInt4242 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!ve", name = "fb", descriptor = "[Lclient!oc;")
	public static final Class65[] aClass65Array61 = new Class65[8];

	@OriginalMember(owner = "client!ve", name = "lb", descriptor = "Lclient!oc;")
	public static Class65 aClass65_2529 = aClass65_2528;

	@OriginalMember(owner = "client!ve", name = "nb", descriptor = "Lclient!oc;")
	public static Class65 aClass65_2530 = aClass65_2526;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!oc;I)V")
	public static void method3198(@OriginalArg(0) Class65 arg0) {
		if (Static26.aClass1_Sub13Array1 == null) {
			return;
		}
		@Pc(15) long local15 = arg0.method2475();
		@Pc(17) int local17 = 0;
		if (local15 == 0L) {
			return;
		}
		while (local17 < Static26.aClass1_Sub13Array1.length && local15 != Static26.aClass1_Sub13Array1[local17].aLong150) {
			local17++;
		}
		if (local17 < Static26.aClass1_Sub13Array1.length && Static26.aClass1_Sub13Array1[local17] != null) {
			Static45.aClass1_Sub14_Sub1_8.method1761(51);
			Static45.aClass1_Sub14_Sub1_8.method1721(Static26.aClass1_Sub13Array1[local17].aLong150);
		}
	}

	@OriginalMember(owner = "client!ve", name = "d", descriptor = "(I)V")
	public static void method3202() {
		if (Static130.aClass97_10 != null || Static195.aClass97_13 != null) {
			return;
		}
		@Pc(19) int local19 = Static96.anInt2403;
		@Pc(28) int local28;
		@Pc(77) int local77;
		if (Static198.aBoolean168) {
			@Pc(30) int local30;
			if (local19 != 1) {
				local28 = Static38.anInt1051;
				local30 = Static53.anInt1441;
				if (Static51.anInt1360 - 10 > local30 || Static51.anInt1360 + Static71.anInt1742 + 10 < local30 || local28 < Static197.anInt4258 - 10 || local28 > Static197.anInt4258 + Static195.anInt4218 + 10) {
					Static198.aBoolean168 = false;
					Static5.method64(Static197.anInt4258, Static195.anInt4218, Static51.anInt1360, Static71.anInt1742);
				}
			}
			if (local19 == 1) {
				local30 = Static51.anInt1360;
				local77 = Static71.anInt1742;
				local28 = Static197.anInt4258;
				@Pc(81) int local81 = Static182.anInt4065;
				@Pc(83) int local83 = Static2.anInt67;
				@Pc(85) int local85 = -1;
				for (@Pc(87) int local87 = 0; local87 < Static101.anInt2533; local87++) {
					@Pc(102) int local102 = local28 + (Static101.anInt2533 - local87 - 1) * 15 + 31;
					if (local83 > local30 && local83 < local30 + local77 && local102 - 13 < local81 && local102 + 3 > local81) {
						local85 = local87;
					}
				}
				if (local85 != -1) {
					Static95.method1807(local85);
				}
				Static198.aBoolean168 = false;
				Static5.method64(Static197.anInt4258, Static195.anInt4218, Static51.anInt1360, Static71.anInt1742);
				return;
			}
			return;
		}
		if (local19 == 1 && Static101.anInt2533 > 0) {
			@Pc(167) short local167 = Static162.aShortArray52[Static101.anInt2533 - 1];
			if (local167 == 40 || local167 == 18 || local167 == 24 || local167 == 7 || local167 == 10 || local167 == 44 || local167 == 57 || local167 == 47 || local167 == 33 || local167 == 22 || local167 == 25 || local167 == 1004) {
				local28 = Static101.anIntArray288[Static101.anInt2533 - 1];
				local77 = Static99.anIntArray280[Static101.anInt2533 - 1];
				@Pc(229) Class97 local229 = Static154.method2691(local77);
				if (Static86.method1466(Static153.method2677(local229)) || Static130.method2479(Static153.method2677(local229))) {
					Static82.aBoolean93 = false;
					Static20.anInt622 = 0;
					if (Static130.aClass97_10 != null) {
						Static25.method448(Static130.aClass97_10);
					}
					Static130.aClass97_10 = Static154.method2691(local77);
					Static60.anInt1551 = local28;
					Static54.anInt3673 = Static182.anInt4065;
					Static8.anInt209 = Static2.anInt67;
					Static25.method448(Static130.aClass97_10);
					return;
				}
			}
		}
		if (local19 == 1 && (Static201.anInt3942 == 1 && Static101.anInt2533 > 2 || Static101.method1913(Static101.anInt2533 - 1))) {
			local19 = 2;
		}
		if (local19 == 1 && Static101.anInt2533 > 0) {
			Static95.method1807(Static101.anInt2533 - 1);
		}
		if (local19 != 2 || Static101.anInt2533 <= 0) {
			return;
		}
		Static171.method2897();
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!sd;Lclient!sd;Z)I")
	public static int method3209(@OriginalArg(0) Class60 arg0, @OriginalArg(1) Class60 arg1) {
		@Pc(5) int local5 = 0;
		if (arg0.method2343(Static104.anInt2563)) {
			local5++;
		}
		if (arg1.method2343(Static74.anInt1828)) {
			local5++;
		}
		if (arg1.method2343(Static100.anInt2517)) {
			local5++;
		}
		if (arg1.method2343(Static90.anInt4440)) {
			local5++;
		}
		if (arg1.method2343(Static3.anInt82)) {
			local5++;
		}
		if (arg1.method2343(Static79.anInt1931)) {
			local5++;
		}
		arg1.method2343(Static67.anInt1715);
		arg1.method2343(Static100.anInt2511);
		arg1.method2343(Static104.anInt2560);
		arg1.method2343(Static120.anInt2982);
		arg1.method2343(Static19.anInt611);
		return local5;
	}
}
