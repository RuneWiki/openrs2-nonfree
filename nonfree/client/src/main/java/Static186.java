import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static186 {

	@OriginalMember(owner = "client!wd", name = "P", descriptor = "Lclient!dd;")
	private static Class13 aClass13_1428 = Static161.method2971("Please wait )2 attempting to reestablish)3");

	@OriginalMember(owner = "client!wd", name = "U", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1429 = aClass13_1428;

	@OriginalMember(owner = "client!wd", name = "bb", descriptor = "Lclient!dd;")
	private static Class13 aClass13_1433 = Static161.method2971("Click to switch");

	@OriginalMember(owner = "client!wd", name = "X", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1430 = aClass13_1433;

	@OriginalMember(owner = "client!wd", name = "Z", descriptor = "Lclient!dd;")
	private static Class13 aClass13_1431 = Static161.method2971("Drop");

	@OriginalMember(owner = "client!wd", name = "ab", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1432 = aClass13_1431;

	@OriginalMember(owner = "client!wd", name = "db", descriptor = "I")
	public static int anInt4112 = 1;

	@OriginalMember(owner = "client!wd", name = "e", descriptor = "(I)V")
	public static void method3017() {
		aClass13_1428 = null;
		aClass13_1432 = null;
		aClass13_1430 = null;
		aClass13_1433 = null;
		aClass13_1431 = null;
		aClass13_1429 = null;
	}

	@OriginalMember(owner = "client!wd", name = "f", descriptor = "(I)V")
	public static void method3018() {
		for (@Pc(7) int local7 = -1; local7 < Static65.anInt1929; local7++) {
			@Pc(16) int local16;
			if (local7 == -1) {
				local16 = 2047;
			} else {
				local16 = Static30.anIntArray116[local7];
			}
			@Pc(24) Class1_Sub2_Sub2_Sub2_Sub2 local24 = Static45.aClass1_Sub2_Sub2_Sub2_Sub2Array1[local16];
			if (local24 != null) {
				Static179.method2965(1, local24);
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIII)V")
	public static void method3019(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < Static125.anInt3241; local3++) {
			if (Static181.anIntArray448[local3] + Static132.anIntArray330[local3] > arg2 && arg1 + arg2 > Static181.anIntArray448[local3] && arg3 < Static123.anIntArray308[local3] + Static26.anIntArray111[local3] && Static123.anIntArray308[local3] < arg3 + arg0) {
				Static140.aBooleanArray45[local3] = true;
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IZ)V")
	public static void method3020(@OriginalArg(1) boolean arg0) {
		if (Static49.anInt1616 == Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anInt2596 >> 7 && Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anInt2606 >> 7 == Static70.anInt2008) {
			Static49.anInt1616 = 0;
		}
		@Pc(30) int local30 = Static65.anInt1929;
		if (arg0) {
			local30 = 1;
		}
		for (@Pc(36) int local36 = 0; local36 < local30; local36++) {
			@Pc(53) Class1_Sub2_Sub2_Sub2_Sub2 local53;
			@Pc(47) long local47;
			if (arg0) {
				local47 = 8791798054912L;
				local53 = Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1;
			} else {
				local47 = (long) Static30.anIntArray116[local36] << 32;
				local53 = Static45.aClass1_Sub2_Sub2_Sub2_Sub2Array1[Static30.anIntArray116[local36]];
			}
			if (local53 != null && local53.method1882()) {
				@Pc(70) int local70 = local53.anInt2596 >> 7;
				local53.aBoolean194 = false;
				if ((Static30.aBoolean72 && Static65.anInt1929 > 50 || Static65.anInt1929 > 200) && !arg0 && local53.anInt2584 == local53.anInt2593) {
					local53.aBoolean194 = true;
				}
				@Pc(96) int local96 = local53.anInt2606 >> 7;
				if (local70 >= 0 && local70 < 104 && local96 >= 0 && local96 < 104) {
					if (local53.aClass1_Sub2_Sub2_Sub5_1 == null || local53.anInt2608 > Static78.anInt2168 || local53.anInt2625 <= Static78.anInt2168) {
						if ((local53.anInt2596 & 0x7F) == 64 && (local53.anInt2606 & 0x7F) == 64) {
							if (Static83.anIntArrayArray19[local70][local96] == Static35.anInt1195) {
								continue;
							}
							Static83.anIntArrayArray19[local70][local96] = Static35.anInt1195;
						}
						local53.anInt2564 = Static66.method1449(Static156.anInt3696, local53.anInt2606, local53.anInt2596);
						Static42.method1117(Static156.anInt3696, local53.anInt2596, local53.anInt2606, local53.anInt2564, 60, local53, local53.anInt2560, local47, local53.aBoolean191);
					} else {
						local53.aBoolean194 = false;
						local53.anInt2564 = Static66.method1449(Static156.anInt3696, local53.anInt2606, local53.anInt2596);
						Static175.method2932(Static156.anInt3696, local53.anInt2596, local53.anInt2606, local53.anInt2564, local53, local53.anInt2560, local47, local53.anInt2611, local53.anInt2633, local53.anInt2622, local53.anInt2634);
					}
				}
			}
		}
	}
}
