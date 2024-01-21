import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "q", descriptor = "Lclient!qd;")
	public static Class2_Sub1_Sub4_Sub3 aClass2_Sub1_Sub4_Sub3_1;

	@OriginalMember(owner = "client!a", name = "a", descriptor = "[Lclient!wb;")
	public static Class65[] aClass65Array1 = new Class65[5];

	@OriginalMember(owner = "client!a", name = "o", descriptor = "Lclient!wb;")
	private static Class65 aClass65_6 = Static24.method441("Connection timed out)3");

	@OriginalMember(owner = "client!a", name = "b", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1 = aClass65_6;

	@OriginalMember(owner = "client!a", name = "c", descriptor = "Lclient!wb;")
	public static Class65 aClass65_2 = Static24.method441("headicons_hint");

	@OriginalMember(owner = "client!a", name = "r", descriptor = "Lclient!wb;")
	private static Class65 aClass65_8 = Static24.method441("Connecting to server)3)3)3");

	@OriginalMember(owner = "client!a", name = "e", descriptor = "Lclient!wb;")
	public static Class65 aClass65_3 = aClass65_8;

	@OriginalMember(owner = "client!a", name = "g", descriptor = "Lclient!wb;")
	public static Class65 aClass65_4 = Static24.method441("Spiel)2Fenster geladen)3");

	@OriginalMember(owner = "client!a", name = "h", descriptor = "Z")
	public static boolean aBoolean1 = false;

	@OriginalMember(owner = "client!a", name = "i", descriptor = "I")
	public static int anInt1 = 0;

	@OriginalMember(owner = "client!a", name = "k", descriptor = "Lclient!wb;")
	private static Class65 aClass65_5 = Static24.method441("Add friend");

	@OriginalMember(owner = "client!a", name = "l", descriptor = "I")
	public static int anInt3 = 0;

	@OriginalMember(owner = "client!a", name = "p", descriptor = "Lclient!wb;")
	public static Class65 aClass65_7 = aClass65_5;

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Z)V")
	public static void method2() {
		aClass65_8 = null;
		aClass65_4 = null;
		aClass65_6 = null;
		aClass2_Sub1_Sub4_Sub3_1 = null;
		aClass65_7 = null;
		aClass65_1 = null;
		aClass65_3 = null;
		aClass65_2 = null;
		aClass65_5 = null;
		aClass65Array1 = null;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V")
	public static void method3() {
		@Pc(12) Class26 local12 = Static50.aClass26_1;
		synchronized (Static50.aClass26_1) {
			Static81.anInt2913 = Static110.anInt2938;
			@Pc(24) int local24;
			if (Static20.anInt637 >= 0) {
				while (Static20.anInt637 != Static98.anInt2760) {
					local24 = Static99.anIntArray368[Static98.anInt2760];
					Static98.anInt2760 = Static98.anInt2760 + 1 & 0x7F;
					if (local24 >= 0) {
						Static68.aBooleanArray19[local24] = true;
					} else {
						Static68.aBooleanArray19[~local24] = false;
					}
				}
			} else {
				for (local24 = 0; local24 < 112; local24++) {
					Static68.aBooleanArray19[local24] = false;
				}
				Static20.anInt637 = Static98.anInt2760;
			}
			Static110.anInt2938 = Static87.anInt2521;
		}
	}
}
