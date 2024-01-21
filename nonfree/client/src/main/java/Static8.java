import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ba", name = "P", descriptor = "Lclient!ce;")
	public static Class11_Sub1 aClass11_Sub1_2;

	@OriginalMember(owner = "client!ba", name = "bb", descriptor = "Lclient!ce;")
	public static Class11_Sub1 aClass11_Sub1_3;

	@OriginalMember(owner = "client!ba", name = "kb", descriptor = "[[B")
	public static byte[][] aByteArrayArray1;

	@OriginalMember(owner = "client!ba", name = "tb", descriptor = "Lclient!hb;")
	public static Class2_Sub1_Sub9_Sub1 aClass2_Sub1_Sub9_Sub1_1;

	@OriginalMember(owner = "client!ba", name = "R", descriptor = "Lclient!wd;")
	public static Class80 aClass80_108 = Static2.method59("leuchten3:");

	@OriginalMember(owner = "client!ba", name = "T", descriptor = "[I")
	public static int[] anIntArray19 = new int[500];

	@OriginalMember(owner = "client!ba", name = "sb", descriptor = "Lclient!wd;")
	private static Class80 aClass80_114 = Static2.method59("Use");

	@OriginalMember(owner = "client!ba", name = "cb", descriptor = "Lclient!wd;")
	public static Class80 aClass80_109 = aClass80_114;

	@OriginalMember(owner = "client!ba", name = "lb", descriptor = "Lclient!wd;")
	private static Class80 aClass80_111 = Static2.method59("Please check your message)2centre for details)3");

	@OriginalMember(owner = "client!ba", name = "gb", descriptor = "Lclient!wd;")
	public static Class80 aClass80_110 = aClass80_111;

	@OriginalMember(owner = "client!ba", name = "jb", descriptor = "[I")
	public static int[] anIntArray20 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

	@OriginalMember(owner = "client!ba", name = "mb", descriptor = "Lclient!wd;")
	private static Class80 aClass80_112 = Static2.method59("Bad session id)3");

	@OriginalMember(owner = "client!ba", name = "nb", descriptor = "Z")
	public static boolean aBoolean21 = true;

	@OriginalMember(owner = "client!ba", name = "ob", descriptor = "Z")
	public static boolean aBoolean22 = false;

	@OriginalMember(owner = "client!ba", name = "qb", descriptor = "Lclient!wd;")
	public static Class80 aClass80_113 = aClass80_112;

	@OriginalMember(owner = "client!ba", name = "rb", descriptor = "I")
	public static int anInt233 = 0;

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(II)Lclient!bb;")
	public static Class2_Sub1_Sub3 method132(@OriginalArg(0) int arg0) {
		@Pc(16) Class2_Sub1_Sub3 local16 = (Class2_Sub1_Sub3) Static81.aClass32_39.method887((long) arg0);
		if (local16 != null) {
			return local16;
		}
		@Pc(26) byte[] local26 = Static63.aClass11_29.method383(arg0, 14);
		local16 = new Class2_Sub1_Sub3();
		if (local26 != null) {
			local16.method153(new Class2_Sub17(local26));
		}
		Static81.aClass32_39.method880(local16, (long) arg0);
		return local16;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIII)I")
	public static int method133(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(24) int local24 = 65536 - Class2_Sub1_Sub9_Sub2.anIntArray198[arg0 * 1024 / arg2] >> 1;
		return (arg3 * local24 >> 16) + ((65536 - local24) * arg1 >> 16);
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(II)Z")
	public static boolean method134(@OriginalArg(0) int arg0) {
		return (arg0 >> 20 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "(II)V")
	public static void method136(@OriginalArg(1) int arg0) {
		if (arg0 == -1 || !Static25.aBooleanArray10[arg0]) {
			return;
		}
		Static43.aClass11_23.method389(arg0);
		if (Static51.aClass2_Sub1_Sub17ArrayArray1[arg0] == null) {
			return;
		}
		@Pc(34) boolean local34 = true;
		for (@Pc(36) int local36 = 0; local36 < Static51.aClass2_Sub1_Sub17ArrayArray1[arg0].length; local36++) {
			if (Static51.aClass2_Sub1_Sub17ArrayArray1[arg0][local36] != null) {
				if (Static51.aClass2_Sub1_Sub17ArrayArray1[arg0][local36].anInt3038 == 2) {
					local34 = false;
				} else {
					Static51.aClass2_Sub1_Sub17ArrayArray1[arg0][local36] = null;
				}
			}
		}
		if (local34) {
			Static51.aClass2_Sub1_Sub17ArrayArray1[arg0] = null;
		}
		Static25.aBooleanArray10[arg0] = false;
	}

	@OriginalMember(owner = "client!ba", name = "f", descriptor = "(B)V")
	public static void method137() {
		aByteArrayArray1 = null;
		aClass80_113 = null;
		aClass80_108 = null;
		anIntArray19 = null;
		anIntArray20 = null;
		aClass80_109 = null;
		aClass80_111 = null;
		aClass11_Sub1_2 = null;
		aClass80_112 = null;
		aClass11_Sub1_3 = null;
		aClass80_110 = null;
		aClass2_Sub1_Sub9_Sub1_1 = null;
		aClass80_114 = null;
	}
}
