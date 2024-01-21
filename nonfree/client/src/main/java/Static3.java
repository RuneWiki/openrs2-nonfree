import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ac", name = "i", descriptor = "Lclient!df;")
	public static Class16 aClass16_5;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "I")
	public static int anInt124 = 0;

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "[I")
	public static int[] anIntArray23 = new int[25];

	@OriginalMember(owner = "client!ac", name = "e", descriptor = "I")
	public static int anInt127 = 0;

	@OriginalMember(owner = "client!ac", name = "f", descriptor = "Z")
	public static boolean aBoolean3 = false;

	@OriginalMember(owner = "client!ac", name = "k", descriptor = "Lclient!qf;")
	private static Class60 aClass60_69 = Static59.method1195("Could not complete login)3");

	@OriginalMember(owner = "client!ac", name = "g", descriptor = "Lclient!qf;")
	public static Class60 aClass60_68 = aClass60_69;

	@OriginalMember(owner = "client!ac", name = "j", descriptor = "Z")
	public static boolean aBoolean4 = false;

	@OriginalMember(owner = "client!ac", name = "l", descriptor = "Lclient!qf;")
	public static Class60 aClass60_70 = Static59.method1195("und haben es deaktiviert)3 Klicken Sie auf der");

	@OriginalMember(owner = "client!ac", name = "m", descriptor = "Lclient!qf;")
	public static Class60 aClass60_71 = Static59.method1195(" ");

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V")
	public static void method75() {
		aClass60_68 = null;
		aClass60_70 = null;
		aClass16_5 = null;
		anIntArray23 = null;
		aClass60_71 = null;
		aClass60_69 = null;
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)V")
	public static void method76() {
		if (Static111.anInt3098 == 2) {
			Static71.method1017(Static4.anInt130 + (Static109.anInt3095 - Static112.anInt3118 << 7), Static6.anInt194 * 2, (Static120.anInt3296 - Static13.anInt410 << 7) + Static14.anInt434);
			if (Static65.anInt2053 > -1 && Static34.anInt1183 % 20 < 10) {
				Static98.aClass3_Sub1_Sub2_Sub3Array6[0].method1439(Static65.anInt2053 - 12, Static30.anInt1041 + -28);
			}
		}
	}

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "(I)V")
	public static void method77() {
		for (@Pc(10) Class3_Sub1_Sub1_Sub6 local10 = (Class3_Sub1_Sub1_Sub6) Static112.aClass5_21.method92(); local10 != null; local10 = (Class3_Sub1_Sub1_Sub6) Static112.aClass5_21.method90()) {
			if (Static119.anInt3243 != local10.anInt2346 || local10.anInt2340 < Static34.anInt1183) {
				local10.method2264();
			} else if (local10.anInt2342 <= Static34.anInt1183) {
				if (local10.anInt2355 > 0) {
					@Pc(46) Class3_Sub1_Sub1_Sub3_Sub2 local46 = Static59.aClass3_Sub1_Sub1_Sub3_Sub2Array1[local10.anInt2355 - 1];
					if (local46 != null && local46.anInt1524 >= 0 && local46.anInt1524 < 13312 && local46.anInt1494 >= 0 && local46.anInt1494 < 13312) {
						local10.method1523(Static66.method1353(local46.anInt1524, local10.anInt2346, local46.anInt1494) - local10.anInt2360, local46.anInt1494, Static34.anInt1183, local46.anInt1524);
					}
				}
				if (local10.anInt2355 < 0) {
					@Pc(92) int local92 = -local10.anInt2355 - 1;
					@Pc(103) Class3_Sub1_Sub1_Sub3_Sub1 local103;
					if (Static34.anInt1184 == local92) {
						local103 = Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1;
					} else {
						local103 = Static127.aClass3_Sub1_Sub1_Sub3_Sub1Array3[local92];
					}
					if (local103 != null && local103.anInt1524 >= 0 && local103.anInt1524 < 13312 && local103.anInt1494 >= 0 && local103.anInt1494 < 13312) {
						local10.method1523(Static66.method1353(local103.anInt1524, local10.anInt2346, local103.anInt1494) - local10.anInt2360, local103.anInt1494, Static34.anInt1183, local103.anInt1524);
					}
				}
				local10.method1526(Static69.anInt2153);
				Static13.aClass58_1.method1767(Static119.anInt3243, (int) local10.aDouble3, (int) local10.aDouble5, (int) local10.aDouble4, 60, local10, local10.anInt2341, -1, false);
			}
		}
	}
}
