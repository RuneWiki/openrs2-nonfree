import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!of", name = "a", descriptor = "I")
	public static int anInt2810;

	@OriginalMember(owner = "client!of", name = "c", descriptor = "Lclient!te;")
	public static Class2_Sub3_Sub2_Sub4_Sub1 aClass2_Sub3_Sub2_Sub4_Sub1_6;

	@OriginalMember(owner = "client!of", name = "f", descriptor = "I")
	public static int anInt2812;

	@OriginalMember(owner = "client!of", name = "h", descriptor = "Lclient!bf;")
	public static Class2_Sub3_Sub2_Sub1 aClass2_Sub3_Sub2_Sub1_4;

	@OriginalMember(owner = "client!of", name = "l", descriptor = "[I")
	public static int[] anIntArray243;

	@OriginalMember(owner = "client!of", name = "d", descriptor = "Lclient!ai;")
	public static Class6 aClass6_813 = Static38.method685(" loggt sich ein)3");

	@OriginalMember(owner = "client!of", name = "e", descriptor = "Lclient!ai;")
	public static Class6 aClass6_814 = Static38.method685("Lade Sprites )2 ");

	@OriginalMember(owner = "client!of", name = "i", descriptor = "[S")
	public static short[] aShortArray25 = new short[] { 960, 957, -21568, -21571, 22464 };

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V")
	public static void method1887() {
		anIntArray243 = null;
		aClass2_Sub3_Sub2_Sub1_4 = null;
		aClass2_Sub3_Sub2_Sub4_Sub1_6 = null;
		aClass6_814 = null;
		aShortArray25 = null;
		aClass6_813 = null;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(B)V")
	public static void method1888() {
		Static64.aClass2_Sub13_Sub1_1.method1454();
		@Pc(15) int local15 = Static64.aClass2_Sub13_Sub1_1.method1458(1);
		if (local15 == 0) {
			return;
		}
		@Pc(23) int local23 = Static64.aClass2_Sub13_Sub1_1.method1458(2);
		if (local23 == 0) {
			Static144.anIntArray300[Static28.anInt732++] = 2047;
			return;
		}
		@Pc(47) int local47;
		@Pc(57) int local57;
		if (local23 == 1) {
			local47 = Static64.aClass2_Sub13_Sub1_1.method1458(3);
			Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.method1798(local47, false);
			local57 = Static64.aClass2_Sub13_Sub1_1.method1458(1);
			if (local57 == 1) {
				Static144.anIntArray300[Static28.anInt732++] = 2047;
			}
			return;
		}
		@Pc(101) int local101;
		if (local23 == 2) {
			local47 = Static64.aClass2_Sub13_Sub1_1.method1458(3);
			Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.method1798(local47, true);
			local57 = Static64.aClass2_Sub13_Sub1_1.method1458(3);
			Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.method1798(local57, true);
			local101 = Static64.aClass2_Sub13_Sub1_1.method1458(1);
			if (local101 == 1) {
				Static144.anIntArray300[Static28.anInt732++] = 2047;
			}
		} else if (local23 == 3) {
			local47 = Static64.aClass2_Sub13_Sub1_1.method1458(7);
			Static36.anInt1020 = Static64.aClass2_Sub13_Sub1_1.method1458(2);
			local57 = Static64.aClass2_Sub13_Sub1_1.method1458(7);
			local101 = Static64.aClass2_Sub13_Sub1_1.method1458(1);
			@Pc(143) int local143 = Static64.aClass2_Sub13_Sub1_1.method1458(1);
			if (local143 == 1) {
				Static144.anIntArray300[Static28.anInt732++] = 2047;
			}
			Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.method1803(local57, local101 == 1, local47);
		}
	}
}
