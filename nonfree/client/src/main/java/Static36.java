import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!ff", name = "Z", descriptor = "Lclient!g;")
	public static Class26 aClass26_6;

	@OriginalMember(owner = "client!ff", name = "ab", descriptor = "I")
	public static int anInt867;

	@OriginalMember(owner = "client!ff", name = "Y", descriptor = "I")
	public static int anInt866 = 1;

	@OriginalMember(owner = "client!ff", name = "eb", descriptor = "Lclient!u;")
	private static Class74 aClass74_650 = Static72.method1077("Loaded config");

	@OriginalMember(owner = "client!ff", name = "cb", descriptor = "Lclient!u;")
	public static Class74 aClass74_649 = aClass74_650;

	@OriginalMember(owner = "client!ff", name = "vb", descriptor = "Lclient!u;")
	private static Class74 aClass74_656 = Static72.method1077("purple:");

	@OriginalMember(owner = "client!ff", name = "fb", descriptor = "Lclient!u;")
	public static Class74 aClass74_651 = aClass74_656;

	@OriginalMember(owner = "client!ff", name = "gb", descriptor = "I")
	public static int anInt869 = 0;

	@OriginalMember(owner = "client!ff", name = "hb", descriptor = "Lclient!u;")
	public static Class74 aClass74_652 = aClass74_656;

	@OriginalMember(owner = "client!ff", name = "kb", descriptor = "Z")
	public static boolean aBoolean29 = false;

	@OriginalMember(owner = "client!ff", name = "yb", descriptor = "Lclient!u;")
	private static Class74 aClass74_657 = Static72.method1077("We suspect someone knows your password)3");

	@OriginalMember(owner = "client!ff", name = "ob", descriptor = "Lclient!u;")
	public static Class74 aClass74_653 = aClass74_657;

	@OriginalMember(owner = "client!ff", name = "pb", descriptor = "Lclient!u;")
	public static Class74 aClass74_654 = Static72.method1077("Ihr Spielkonto wird bereits benutzt)3");

	@OriginalMember(owner = "client!ff", name = "qb", descriptor = "Lclient!u;")
	public static Class74 aClass74_655 = Static72.method1077("null");

	@OriginalMember(owner = "client!ff", name = "wb", descriptor = "I")
	public static int anInt875 = 0;

	@OriginalMember(owner = "client!ff", name = "Bb", descriptor = "I")
	public static int anInt879 = -1;

	@OriginalMember(owner = "client!ff", name = "Cb", descriptor = "Lclient!u;")
	public static Class74 aClass74_658 = Static72.method1077("@or2@");

	@OriginalMember(owner = "client!ff", name = "Db", descriptor = "Lclient!u;")
	public static Class74 aClass74_659 = Static72.method1077("Gegenstand konnte nicht gefunden werden)1 verk-Urzen Sie den Suchbegriff)3");

	@OriginalMember(owner = "client!ff", name = "Eb", descriptor = "Lclient!u;")
	public static Class74 aClass74_660 = Static72.method1077("ams");

	@OriginalMember(owner = "client!ff", name = "f", descriptor = "(I)V")
	public static void method611() {
		aClass74_657 = null;
		aClass74_649 = null;
		aClass74_659 = null;
		aClass74_651 = null;
		aClass74_652 = null;
		aClass74_650 = null;
		aClass74_660 = null;
		aClass26_6 = null;
		aClass74_654 = null;
		aClass74_656 = null;
		aClass74_655 = null;
		aClass74_653 = null;
		aClass74_658 = null;
	}

	@OriginalMember(owner = "client!ff", name = "g", descriptor = "(I)V")
	public static void method612() {
		if (!Static24.aBoolean23) {
			return;
		}
		Static126.aClass2_Sub2_Sub1_Sub1_50 = null;
		Static24.aClass2_Sub2_Sub1_Sub1_15 = null;
		Static17.anIntArray55 = null;
		Static77.aClass2_Sub2_Sub1_Sub1_33 = null;
		Static109.aClass2_Sub2_Sub1_Sub2_7 = null;
		Static32.anIntArray96 = null;
		Static128.anIntArray416 = null;
		Static66.aClass2_Sub2_Sub1_Sub1Array8 = null;
		Static24.anIntArray68 = null;
		Static62.aClass2_Sub2_Sub1_Sub2_2 = null;
		Static5.anIntArray8 = null;
		Static43.aClass2_Sub2_Sub1_Sub1Array4 = null;
		Static51.anIntArray313 = null;
		Static37.aClass2_Sub2_Sub1_Sub1Array9 = null;
		Static53.aClass2_Sub2_Sub1_Sub1Array7 = null;
		Static2.aClass2_Sub2_Sub1_Sub1Array1 = null;
		Static72.aClass2_Sub2_Sub1_Sub2Array8 = null;
		Static48.anIntArray136 = null;
		Static42.anIntArray113 = null;
		Static97.aClass9_58 = null;
		Static110.aClass2_Sub2_Sub1_Sub1_44 = null;
		Static16.method358();
		Static90.method1335(true);
		Static24.aBoolean23 = false;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(ZI)V")
	public static void method618(@OriginalArg(1) int arg0) {
		if (arg0 == -1 || !Static99.aBooleanArray10[arg0]) {
			return;
		}
		Static92.aClass26_24.method1355(arg0);
		if (Static89.aClass2_Sub2_Sub17ArrayArray1[arg0] == null) {
			return;
		}
		@Pc(26) boolean local26 = true;
		for (@Pc(28) int local28 = 0; local28 < Static89.aClass2_Sub2_Sub17ArrayArray1[arg0].length; local28++) {
			if (Static89.aClass2_Sub2_Sub17ArrayArray1[arg0][local28] != null) {
				if (Static89.aClass2_Sub2_Sub17ArrayArray1[arg0][local28].anInt2777 == 2) {
					local26 = false;
				} else {
					Static89.aClass2_Sub2_Sub17ArrayArray1[arg0][local28] = null;
				}
			}
		}
		if (local26) {
			Static89.aClass2_Sub2_Sub17ArrayArray1[arg0] = null;
		}
		Static99.aBooleanArray10[arg0] = false;
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(II)Lclient!hd;")
	public static Class2_Sub2_Sub8 method619(@OriginalArg(0) int arg0) {
		@Pc(6) Class2_Sub2_Sub8 local6 = (Class2_Sub2_Sub8) Static119.aClass16_84.method490((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(26) byte[] local26 = Static90.aClass26_23.method1358(arg0, 16);
		local6 = new Class2_Sub2_Sub8();
		if (local26 != null) {
			local6.method748(new Class2_Sub10(local26));
		}
		Static119.aClass16_84.method492(local6, (long) arg0);
		return local6;
	}
}
