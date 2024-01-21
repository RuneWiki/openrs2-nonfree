import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!kd", name = "ub", descriptor = "I")
	public static int anInt1553;

	@OriginalMember(owner = "client!kd", name = "yb", descriptor = "Lclient!pa;")
	public static Class51 aClass51_34;

	@OriginalMember(owner = "client!kd", name = "Cb", descriptor = "Lclient!pa;")
	public static Class51 aClass51_35;

	@OriginalMember(owner = "client!kd", name = "Qb", descriptor = "Lclient!uc;")
	public static Class2_Sub1_Sub4_Sub3 aClass2_Sub1_Sub4_Sub3_10;

	@OriginalMember(owner = "client!kd", name = "Ub", descriptor = "I")
	public static int anInt1567;

	@OriginalMember(owner = "client!kd", name = "qb", descriptor = "I")
	public static int anInt1551 = 0;

	@OriginalMember(owner = "client!kd", name = "rb", descriptor = "I")
	public static int anInt1552 = 0;

	@OriginalMember(owner = "client!kd", name = "sb", descriptor = "Lclient!ke;")
	public static Class39 aClass39_690 = Static2.method66("Texturen geladen)3");

	@OriginalMember(owner = "client!kd", name = "Kb", descriptor = "Lclient!ke;")
	private static Class39 aClass39_694 = Static2.method66("To create a new account you need to");

	@OriginalMember(owner = "client!kd", name = "tb", descriptor = "Lclient!ke;")
	public static Class39 aClass39_691 = aClass39_694;

	@OriginalMember(owner = "client!kd", name = "Bb", descriptor = "Lclient!ke;")
	public static Class39 aClass39_692 = Static2.method66("Ein kostenloses Spielkonto erstellen)3");

	@OriginalMember(owner = "client!kd", name = "Db", descriptor = "I")
	public static int anInt1558 = 0;

	@OriginalMember(owner = "client!kd", name = "Eb", descriptor = "Lclient!qd;")
	public static Class54 aClass54_14 = new Class54(64);

	@OriginalMember(owner = "client!kd", name = "Ib", descriptor = "Lclient!ke;")
	public static Class39 aClass39_693 = Static2.method66("Abbrechen");

	@OriginalMember(owner = "client!kd", name = "Jb", descriptor = "I")
	public static volatile int anInt1561 = 0;

	@OriginalMember(owner = "client!kd", name = "Nb", descriptor = "Z")
	public static boolean aBoolean84 = false;

	@OriginalMember(owner = "client!kd", name = "Ob", descriptor = "Lclient!ke;")
	public static Class39 aClass39_695 = Static2.method66("Unerwartete Antwort vom Anmelde)2Server");

	@OriginalMember(owner = "client!kd", name = "Pb", descriptor = "[I")
	public static int[] anIntArray213 = new int[1000];

	@OriginalMember(owner = "client!kd", name = "Vb", descriptor = "[[[Lclient!ie;")
	public static Class34[][][] aClass34ArrayArrayArray1 = new Class34[4][104][104];

	@OriginalMember(owner = "client!kd", name = "Wb", descriptor = "Lclient!ke;")
	public static Class39 aClass39_696 = Static2.method66("redstone3");

	@OriginalMember(owner = "client!kd", name = "Xb", descriptor = "I")
	public static final int anInt1568 = 50;

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Z)V")
	public static void method1083() {
		aClass39_691 = null;
		aClass39_693 = null;
		aClass39_690 = null;
		aClass39_692 = null;
		aClass2_Sub1_Sub4_Sub3_10 = null;
		aClass51_35 = null;
		aClass51_34 = null;
		aClass39_696 = null;
		aClass39_695 = null;
		aClass34ArrayArrayArray1 = null;
		aClass39_694 = null;
		anIntArray213 = null;
		aClass54_14 = null;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(BIII)I")
	public static int method1085(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg1 / arg2;
		@Pc(13) int local13 = arg1 & arg2 - 1;
		@Pc(17) int local17 = arg0 / arg2;
		@Pc(23) int local23 = arg0 & arg2 - 1;
		@Pc(28) int local28 = Static56.method1114(local3, local17);
		@Pc(35) int local35 = Static56.method1114(local3 + 1, local17);
		@Pc(42) int local42 = Static56.method1114(local3, local17 + 1);
		@Pc(56) int local56 = Static56.method1114(local3 + 1, local17 - -1);
		@Pc(63) int local63 = Static79.method1971(arg2, local13, local28, local35);
		@Pc(70) int local70 = Static79.method1971(arg2, local13, local42, local56);
		return Static79.method1971(arg2, local23, local63, local70);
	}

	@OriginalMember(owner = "client!kd", name = "i", descriptor = "(I)V")
	public static void method1086() {
		Static77.aBoolean99 = true;
		Static71.method1463();
		@Pc(24) boolean local24;
		if (Static57.anInt1650 != -1) {
			local24 = Static6.method2060(190, 0, 0, Static57.anInt1650, -1, 0, 1, 261);
			if (!local24) {
				Static97.aBoolean120 = true;
			}
		} else if (Static25.anIntArray81[Static77.anInt2108] != -1) {
			local24 = Static6.method2060(190, 0, 0, Static25.anIntArray81[Static77.anInt2108], -1, 0, 1, 261);
			if (!local24) {
				Static97.aBoolean120 = true;
			}
		}
		if (Static22.aBoolean36 && Static7.anInt162 == 1) {
			if (Static46.anInt1246 == 1) {
				Static49.method947();
			} else {
				Static23.method444();
			}
		}
		Static77.method1516();
	}
}
