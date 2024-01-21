import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "j", descriptor = "I")
	public static int anInt4;

	@OriginalMember(owner = "client!a", name = "n", descriptor = "Lclient!tb;")
	public static Class44 aClass44_1;

	@OriginalMember(owner = "client!a", name = "s", descriptor = "Lclient!oa;")
	private static Class56 aClass56_8 = Static33.method650("Loading interfaces )2 ");

	@OriginalMember(owner = "client!a", name = "b", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1 = aClass56_8;

	@OriginalMember(owner = "client!a", name = "c", descriptor = "[I")
	public static int[] anIntArray1 = new int[128];

	@OriginalMember(owner = "client!a", name = "t", descriptor = "Lclient!oa;")
	private static Class56 aClass56_9 = Static33.method650("Loaded gamescreen");

	@OriginalMember(owner = "client!a", name = "d", descriptor = "Lclient!oa;")
	public static Class56 aClass56_2 = aClass56_9;

	@OriginalMember(owner = "client!a", name = "v", descriptor = "Lclient!oa;")
	private static Class56 aClass56_11 = Static33.method650("Starting game engine)3)3)3");

	@OriginalMember(owner = "client!a", name = "e", descriptor = "Lclient!oa;")
	public static Class56 aClass56_3 = aClass56_11;

	@OriginalMember(owner = "client!a", name = "g", descriptor = "Lclient!oa;")
	public static Class56 aClass56_4 = Static33.method650("lila:");

	@OriginalMember(owner = "client!a", name = "p", descriptor = "Lclient!oa;")
	private static Class56 aClass56_7 = Static33.method650("Loading fonts )2 ");

	@OriginalMember(owner = "client!a", name = "h", descriptor = "Lclient!oa;")
	public static Class56 aClass56_5 = aClass56_7;

	@OriginalMember(owner = "client!a", name = "i", descriptor = "I")
	public static int anInt3 = 0;

	@OriginalMember(owner = "client!a", name = "k", descriptor = "Lclient!oa;")
	public static Class56 aClass56_6 = Static33.method650("@lre@");

	@OriginalMember(owner = "client!a", name = "l", descriptor = "I")
	public static int anInt5 = 0;

	@OriginalMember(owner = "client!a", name = "r", descriptor = "I")
	public static int anInt9 = 0;

	@OriginalMember(owner = "client!a", name = "u", descriptor = "Lclient!oa;")
	public static Class56 aClass56_10 = Static33.method650("Wir vermuten)1 dass Ihr Konto gestohlen wurde");

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V")
	public static void method1() {
		Static111.aClass3_Sub2_Sub1_4.method325(202);
		if (Static111.anInt2804 != -1) {
			Static25.method532(Static111.anInt2804);
			Static115.aBoolean157 = true;
			Static124.aBoolean167 = true;
			Static111.anInt2804 = -1;
			Static79.anInt2107 = -1;
		}
		if (Static57.anInt1609 != -1) {
			Static25.method532(Static57.anInt1609);
			Static12.aBoolean17 = true;
			Static57.anInt1609 = -1;
			Static79.anInt2107 = -1;
		}
		if (Static63.anInt1818 != -1) {
			Static25.method532(Static63.anInt1818);
			Static63.anInt1818 = -1;
			Static79.method1393(30);
		}
		if (Static88.anInt2370 != -1) {
			Static25.method532(Static88.anInt2370);
			Static88.anInt2370 = -1;
		}
		if (Static57.anInt1607 != -1) {
			Static25.method532(Static57.anInt1607);
			Static79.anInt2107 = -1;
			Static57.anInt1607 = -1;
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Z)V")
	public static void method2() {
		for (@Pc(10) Class3_Sub1_Sub2_Sub3 local10 = (Class3_Sub1_Sub2_Sub3) Static21.aClass37_4.method989(); local10 != null; local10 = (Class3_Sub1_Sub2_Sub3) Static21.aClass37_4.method990()) {
			if (local10.anInt816 != Static94.anInt2470 || local10.anInt817 < Static98.anInt2566) {
				local10.method2055();
			} else if (local10.anInt803 <= Static98.anInt2566) {
				if (local10.anInt815 > 0) {
					@Pc(38) Class3_Sub1_Sub2_Sub4_Sub2 local38 = Static33.aClass3_Sub1_Sub2_Sub4_Sub2Array1[local10.anInt815 - 1];
					if (local38 != null && local38.anInt3187 >= 0 && local38.anInt3187 < 13312 && local38.anInt3196 >= 0 && local38.anInt3196 < 13312) {
						local10.method556(local38.anInt3187, local38.anInt3196, Static98.anInt2566, Static27.method560(local38.anInt3196, local10.anInt816, local38.anInt3187) - local10.anInt806);
					}
				}
				if (local10.anInt815 < 0) {
					@Pc(89) int local89 = -local10.anInt815 - 1;
					@Pc(100) Class3_Sub1_Sub2_Sub4_Sub1 local100;
					if (local89 == Static7.anInt419) {
						local100 = Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1;
					} else {
						local100 = Static29.aClass3_Sub1_Sub2_Sub4_Sub1Array1[local89];
					}
					if (local100 != null && local100.anInt3187 >= 0 && local100.anInt3187 < 13312 && local100.anInt3196 >= 0 && local100.anInt3196 < 13312) {
						local10.method556(local100.anInt3187, local100.anInt3196, Static98.anInt2566, Static27.method560(local100.anInt3196, local10.anInt816, local100.anInt3187) - local10.anInt806);
					}
				}
				local10.method562(Static44.anInt1163);
				Static116.aClass14_1.method448(Static94.anInt2470, (int) local10.aDouble2, (int) local10.aDouble8, (int) local10.aDouble4, 60, local10, local10.anInt823, -1, false);
			}
		}
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(I)V")
	public static void method3() {
		aClass44_1 = null;
		anIntArray1 = null;
		aClass56_2 = null;
		aClass56_9 = null;
		aClass56_4 = null;
		aClass56_10 = null;
		aClass56_3 = null;
		aClass56_8 = null;
		aClass56_11 = null;
		aClass56_1 = null;
		aClass56_5 = null;
		aClass56_7 = null;
		aClass56_6 = null;
	}
}
