import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!o", name = "mb", descriptor = "Lclient!ia;")
	public static Class5_Sub1_Sub10_Sub1 aClass5_Sub1_Sub10_Sub1_16;

	@OriginalMember(owner = "client!o", name = "rb", descriptor = "Lclient!nb;")
	public static Class24 aClass24_15;

	@OriginalMember(owner = "client!o", name = "fb", descriptor = "I")
	public static int anInt1914 = 0;

	@OriginalMember(owner = "client!o", name = "gb", descriptor = "Lclient!vc;")
	public static Class71 aClass71_932 = Static38.method736("Lade Benutzeroberfl-=che )2 ");

	@OriginalMember(owner = "client!o", name = "hb", descriptor = "Lclient!vc;")
	public static Class71 aClass71_933 = Static38.method736("headicons_hint");

	@OriginalMember(owner = "client!o", name = "jb", descriptor = "Lclient!vc;")
	private static Class71 aClass71_934 = Static38.method736("flash2:");

	@OriginalMember(owner = "client!o", name = "kb", descriptor = "[I")
	public static int[] anIntArray236 = new int[2000];

	@OriginalMember(owner = "client!o", name = "lb", descriptor = "Lclient!vc;")
	public static Class71 aClass71_935 = aClass71_934;

	@OriginalMember(owner = "client!o", name = "nb", descriptor = "Lclient!vc;")
	public static Class71 aClass71_936 = Static38.method736("sind fehlgeschlagen)3 Bitte warten Sie 5 Minuten)1");

	@OriginalMember(owner = "client!o", name = "ob", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray6 = new int[4][13][13];

	@OriginalMember(owner = "client!o", name = "pb", descriptor = "Lclient!vc;")
	private static Class71 aClass71_937 = Static38.method736("World");

	@OriginalMember(owner = "client!o", name = "qb", descriptor = "Lclient!vc;")
	public static Class71 aClass71_938 = Static38.method736(":");

	@OriginalMember(owner = "client!o", name = "tb", descriptor = "I")
	public static int anInt1917 = 0;

	@OriginalMember(owner = "client!o", name = "ub", descriptor = "Lclient!vc;")
	public static Class71 aClass71_939 = Static38.method736("Regelversto-8 melden");

	@OriginalMember(owner = "client!o", name = "wb", descriptor = "Lclient!vc;")
	public static Class71 aClass71_940 = aClass71_937;

	@OriginalMember(owner = "client!o", name = "yb", descriptor = "Lclient!vc;")
	public static Class71 aClass71_941 = Static38.method736("(WSpielkonto wiederherstellen(W Option auf der Hauptseite)3");

	@OriginalMember(owner = "client!o", name = "zb", descriptor = "I")
	public static int anInt1920 = 99;

	@OriginalMember(owner = "client!o", name = "c", descriptor = "(Z)V")
	public static void method1267() {
		aClass71_938 = null;
		aClass71_936 = null;
		aClass71_940 = null;
		aClass71_937 = null;
		aClass71_935 = null;
		aClass71_939 = null;
		aClass71_932 = null;
		anIntArrayArrayArray6 = null;
		aClass5_Sub1_Sub10_Sub1_16 = null;
		aClass24_15 = null;
		aClass71_941 = null;
		aClass71_934 = null;
		aClass71_933 = null;
		anIntArray236 = null;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(BJ)V")
	public static void method1268(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static33.anInt935 >= 100) {
			Static92.method1500(0, Static87.aClass71_1032, Static38.aClass71_568);
			return;
		}
		@Pc(27) Class71 local27 = Static88.method1396(arg0).method1803();
		for (@Pc(29) int local29 = 0; local29 < Static33.anInt935; local29++) {
			if (Static78.aLongArray4[local29] == arg0) {
				Static92.method1500(0, Static74.method677(new Class71[] { local27, Static65.aClass71_811 }), Static38.aClass71_568);
				return;
			}
		}
		for (@Pc(76) int local76 = 0; local76 < Static68.anInt1685; local76++) {
			if (Static57.aLongArray6[local76] == arg0) {
				Static92.method1500(0, Static74.method677(new Class71[] { Static65.aClass71_806, local27, Static46.aClass71_628 }), Static38.aClass71_568);
				return;
			}
		}
		if (!local27.method1813(Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.aClass71_1236)) {
			Static78.aLongArray4[Static33.anInt935++] = arg0;
			Static28.aBoolean33 = true;
			Static61.aClass5_Sub11_Sub1_8.method1553(12);
			Static61.aClass5_Sub11_Sub1_8.method1548(arg0);
		}
	}
}
