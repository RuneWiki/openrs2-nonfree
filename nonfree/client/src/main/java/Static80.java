import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!md", name = "Ib", descriptor = "[Lclient!ce;")
	public static Class8_Sub1_Sub3_Sub2[] aClass8_Sub1_Sub3_Sub2Array7;

	@OriginalMember(owner = "client!md", name = "fb", descriptor = "Lclient!af;")
	public static Class7 aClass7_13 = new Class7(4096);

	@OriginalMember(owner = "client!md", name = "ib", descriptor = "Lclient!ic;")
	private static Class34 aClass34_863 = Static56.method816("wave2:");

	@OriginalMember(owner = "client!md", name = "nb", descriptor = "Lclient!ic;")
	public static Class34 aClass34_864 = aClass34_863;

	@OriginalMember(owner = "client!md", name = "zb", descriptor = "[Lclient!ic;")
	public static Class34[] aClass34Array15 = new Class34[100];

	@OriginalMember(owner = "client!md", name = "Bb", descriptor = "Lclient!ic;")
	public static Class34 aClass34_865 = Static56.method816("Lade Titelbild )2 ");

	@OriginalMember(owner = "client!md", name = "Db", descriptor = "Lclient!ic;")
	public static Class34 aClass34_866 = aClass34_863;

	@OriginalMember(owner = "client!md", name = "Gb", descriptor = "Lclient!ic;")
	private static Class34 aClass34_867 = Static56.method816("No response from server)3");

	@OriginalMember(owner = "client!md", name = "Hb", descriptor = "Lclient!ic;")
	public static Class34 aClass34_868 = aClass34_867;

	@OriginalMember(owner = "client!md", name = "d", descriptor = "(I)Z")
	public static boolean method1168() {
		@Pc(10) Class23 local10 = Static16.aClass23_1;
		synchronized (Static16.aClass23_1) {
			if (Static112.anInt2504 == Static40.anInt984) {
				return false;
			} else {
				Static21.anInt656 = Static78.anIntArray240[Static40.anInt984];
				Static103.anInt2375 = Static130.anIntArray405[Static40.anInt984];
				Static40.anInt984 = Static40.anInt984 + 1 & 0x7F;
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(B)V")
	public static void method1169() {
		Static68.aClass48_31.method1101();
		Static93.aClass48_42.method1101();
		Static48.aClass48_56.method1101();
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Z)V")
	public static void method1172() {
		if (Static16.aClass23_1 != null) {
			@Pc(11) Class23 local11 = Static16.aClass23_1;
			synchronized (Static16.aClass23_1) {
				Static16.aClass23_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(Z)V")
	public static void method1176() {
		Static14.aClass48_10.method1101();
		Static83.aClass48_35.method1101();
		Static84.aClass48_37.method1101();
	}

	@OriginalMember(owner = "client!md", name = "g", descriptor = "(I)V")
	public static void method1177() {
		aClass34_863 = null;
		aClass34Array15 = null;
		aClass34_865 = null;
		aClass7_13 = null;
		aClass8_Sub1_Sub3_Sub2Array7 = null;
		aClass34_866 = null;
		aClass34_867 = null;
		aClass34_868 = null;
		aClass34_864 = null;
	}
}
