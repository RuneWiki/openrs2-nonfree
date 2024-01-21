import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "I")
	public static int anInt227;

	@OriginalMember(owner = "client!ag", name = "f", descriptor = "I")
	public static int anInt230;

	@OriginalMember(owner = "client!ag", name = "j", descriptor = "Lclient!qd;")
	public static Class43_Sub1 aClass43_Sub1_1;

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "Lclient!sg;")
	private static Class77 aClass77_127 = Static146.method2172("Please reload this page)3");

	@OriginalMember(owner = "client!ag", name = "d", descriptor = "I")
	public static int anInt229 = 0;

	@OriginalMember(owner = "client!ag", name = "e", descriptor = "Z")
	public static boolean aBoolean10 = false;

	@OriginalMember(owner = "client!ag", name = "p", descriptor = "Lclient!sg;")
	private static Class77 aClass77_131 = Static146.method2172("Please subscribe)1 or use a different world)3");

	@OriginalMember(owner = "client!ag", name = "g", descriptor = "Lclient!sg;")
	public static Class77 aClass77_128 = aClass77_131;

	@OriginalMember(owner = "client!ag", name = "h", descriptor = "Lclient!sg;")
	public static Class77 aClass77_129 = Static146.method2172("Spiel)2Engine wird gestartet)3)3)3");

	@OriginalMember(owner = "client!ag", name = "k", descriptor = "I")
	public static int anInt232 = 0;

	@OriginalMember(owner = "client!ag", name = "m", descriptor = "Lclient!sg;")
	public static Class77 aClass77_130 = Static146.method2172("<img=1>");

	@OriginalMember(owner = "client!ag", name = "n", descriptor = "Z")
	public static boolean aBoolean11 = false;

	@OriginalMember(owner = "client!ag", name = "r", descriptor = "Lclient!sg;")
	public static Class77 aClass77_132 = aClass77_127;

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V")
	public static void method126() {
		for (@Pc(8) Class2_Sub2_Sub1_Sub1 local8 = (Class2_Sub2_Sub1_Sub1) Static144.aClass10_93.method444(); local8 != null; local8 = (Class2_Sub2_Sub1_Sub1) Static144.aClass10_93.method451()) {
			if (local8.anInt217 != Static54.anInt1472 || Static143.anInt3513 > local8.anInt206) {
				local8.method3004();
			} else if (local8.anInt221 <= Static143.anInt3513) {
				if (local8.anInt207 > 0) {
					@Pc(39) Class2_Sub2_Sub1_Sub6_Sub2 local39 = Static48.aClass2_Sub2_Sub1_Sub6_Sub2Array1[local8.anInt207 - 1];
					if (local39 != null && local39.anInt4400 >= 0 && local39.anInt4400 < 13312 && local39.anInt4385 >= 0 && local39.anInt4385 < 13312) {
						local8.method124(local39.anInt4400, local39.anInt4385, Static161.method2725(local39.anInt4400, local8.anInt217, local39.anInt4385) - local8.anInt219, Static143.anInt3513);
					}
				}
				if (local8.anInt207 < 0) {
					@Pc(88) int local88 = -local8.anInt207 - 1;
					@Pc(97) Class2_Sub2_Sub1_Sub6_Sub1 local97;
					if (local88 == Static181.anInt4599) {
						local97 = Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11;
					} else {
						local97 = Static58.aClass2_Sub2_Sub1_Sub6_Sub1Array1[local88];
					}
					if (local97 != null && local97.anInt4400 >= 0 && local97.anInt4400 < 13312 && local97.anInt4385 >= 0 && local97.anInt4385 < 13312) {
						local8.method124(local97.anInt4400, local97.anInt4385, Static161.method2725(local97.anInt4400, local8.anInt217, local97.anInt4385) - local8.anInt219, Static143.anInt3513);
					}
				}
				local8.method122(Static131.anInt4359);
				Static172.aClass60_1.method2091(Static54.anInt1472, (int) local8.aDouble6, (int) local8.aDouble3, (int) local8.aDouble1, 60, local8, local8.anInt208, -1, false);
			}
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(B)V")
	public static void method128() {
		aClass77_127 = null;
		aClass77_132 = null;
		aClass43_Sub1_1 = null;
		aClass77_128 = null;
		aClass77_130 = null;
		aClass77_131 = null;
		aClass77_129 = null;
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(I)V")
	public static void method129() {
		@Pc(1) Object local1 = Static50.anObject1;
		synchronized (Static50.anObject1) {
			if (Static178.anInt4522 == 0) {
				Static144.aClass50_4.method1748(new Class39(), 5);
			}
			Static178.anInt4522 = 600;
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Z)V")
	public static void method130() {
		if (Static125.aClass9_1 != null) {
			@Pc(3) Class9 local3 = Static125.aClass9_1;
			synchronized (Static125.aClass9_1) {
				Static125.aClass9_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!ke;III)[Lclient!bg;")
	public static Class2_Sub2_Sub3_Sub2[] method131(@OriginalArg(0) Class43 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return Static152.method2595(arg1, arg2, arg0) ? Static45.method829() : null;
	}
}
