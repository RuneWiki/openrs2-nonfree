import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "Z")
	public static boolean aBoolean110;

	@OriginalMember(owner = "client!jf", name = "l", descriptor = "Lclient!ed;")
	private static Class23 aClass23_791 = Static169.method2903("Please wait)3)3)3");

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "Lclient!ed;")
	public static Class23 aClass23_787 = aClass23_791;

	@OriginalMember(owner = "client!jf", name = "d", descriptor = "Lclient!ed;")
	public static Class23 aClass23_788 = Static169.method2903("lila:");

	@OriginalMember(owner = "client!jf", name = "m", descriptor = "Lclient!ed;")
	private static Class23 aClass23_792 = Static169.method2903("Password: ");

	@OriginalMember(owner = "client!jf", name = "e", descriptor = "Lclient!ed;")
	public static Class23 aClass23_789 = aClass23_792;

	@OriginalMember(owner = "client!jf", name = "g", descriptor = "I")
	public static int anInt2161 = 0;

	@OriginalMember(owner = "client!jf", name = "h", descriptor = "I")
	public static int anInt2162 = 128;

	@OriginalMember(owner = "client!jf", name = "j", descriptor = "Lclient!ed;")
	private static Class23 aClass23_790 = Static169.method2903("RuneScape has been updated(Q");

	@OriginalMember(owner = "client!jf", name = "n", descriptor = "I")
	public static int anInt2165 = 0;

	@OriginalMember(owner = "client!jf", name = "o", descriptor = "Lclient!ed;")
	public static Class23 aClass23_793 = aClass23_790;

	@OriginalMember(owner = "client!jf", name = "p", descriptor = "Lclient!ed;")
	public static Class23 aClass23_794 = Static169.method2903("logo");

	@OriginalMember(owner = "client!jf", name = "q", descriptor = "Lclient!ed;")
	public static Class23 aClass23_795 = Static169.method2903(" steht bereits auf Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V")
	public static void method1422() {
		for (@Pc(15) int local15 = 0; local15 < Static33.anInt948; local15++) {
			@Pc(21) int local21 = Static68.anIntArray241[local15]--;
			if (Static68.anIntArray241[local15] >= -10) {
				@Pc(92) Class6 local92 = Static44.aClass6Array1[local15];
				if (local92 == null) {
					local92 = Static183.method175(Static161.aClass30_Sub1_16, Static17.anIntArray74[local15], 0);
					if (local92 == null) {
						continue;
					}
					Static68.anIntArray241[local15] += local92.method174();
					Static44.aClass6Array1[local15] = local92;
				}
				if (Static68.anIntArray241[local15] < 0) {
					@Pc(211) int local211;
					if (Static8.anIntArray48[local15] == 0) {
						local211 = Static11.anInt391;
					} else {
						@Pc(138) int local138 = Static8.anIntArray48[local15] >> 16 & 0xFF;
						@Pc(146) int local146 = (Static8.anIntArray48[local15] & 0xFF) * 128;
						@Pc(156) int local156 = local138 * 128 + 64 - Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anInt1838;
						if (local156 < 0) {
							local156 = -local156;
						}
						@Pc(169) int local169 = Static8.anIntArray48[local15] >> 8 & 0xFF;
						@Pc(178) int local178 = local169 * 128 + 64 - Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anInt1825;
						if (local178 < 0) {
							local178 = -local178;
						}
						@Pc(189) int local189 = local178 + local156 - 128;
						if (local146 < local189) {
							Static68.anIntArray241[local15] = -100;
							continue;
						}
						if (local189 < 0) {
							local189 = 0;
						}
						local211 = (local146 - local189) * Static105.anInt2708 / local146;
					}
					if (local211 > 0) {
						@Pc(225) Class1_Sub9_Sub1 local225 = local92.method173().method1016(Static94.aClass9_1);
						@Pc(230) Class1_Sub11_Sub4 local230 = Static189.method2953(local225, local211);
						local230.method2961(Static139.anIntArray473[local15] - 1);
						Static163.aClass1_Sub11_Sub3_2.method2820(local230);
					}
					Static68.anIntArray241[local15] = -100;
				}
			} else {
				Static33.anInt948--;
				for (@Pc(35) int local35 = local15; local35 < Static33.anInt948; local35++) {
					Static17.anIntArray74[local35] = Static17.anIntArray74[local35 + 1];
					Static44.aClass6Array1[local35] = Static44.aClass6Array1[local35 + 1];
					Static139.anIntArray473[local35] = Static139.anIntArray473[local35 + 1];
					Static68.anIntArray241[local35] = Static68.anIntArray241[local35 + 1];
					Static8.anIntArray48[local35] = Static8.anIntArray48[local35 + 1];
				}
				local15--;
			}
		}
		if (Static37.aBoolean48 && !Static67.method1187()) {
			if (Static38.anInt1035 != 0 && Static77.anInt2101 != -1) {
				Static181.method3134(Static77.anInt2101, Static38.anInt1035, Static167.aClass30_Sub1_18, 0);
			}
			Static37.aBoolean48 = false;
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V")
	public static void method1423() {
		if (Static43.aClass44_4 != null) {
			Static43.aClass44_4.method1417();
			Static43.aClass44_4 = null;
		}
		Static104.method1793();
		Static123.aClass80_1.method2707();
		for (@Pc(18) int local18 = 0; local18 < 4; local18++) {
			Static132.aClass69Array3[local18].method2407();
		}
		System.gc();
		Static180.method3098();
		Static77.anInt2101 = -1;
		Static37.aBoolean48 = false;
		Static61.method1109();
		Static32.method567(10);
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(B)V")
	public static void method1424() {
		aClass23_788 = null;
		aClass23_794 = null;
		aClass23_795 = null;
		aClass23_791 = null;
		aClass23_789 = null;
		aClass23_792 = null;
		aClass23_790 = null;
		aClass23_793 = null;
		aClass23_787 = null;
	}
}
