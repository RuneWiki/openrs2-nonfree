import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!ve", name = "Z", descriptor = "Lclient!sc;")
	public static Class5_Sub2_Sub6_Sub4 aClass5_Sub2_Sub6_Sub4_48;

	@OriginalMember(owner = "client!ve", name = "hb", descriptor = "Lclient!sc;")
	public static Class5_Sub2_Sub6_Sub4 aClass5_Sub2_Sub6_Sub4_49;

	@OriginalMember(owner = "client!ve", name = "lb", descriptor = "[Lclient!r;")
	public static Class5_Sub2_Sub6_Sub3[] aClass5_Sub2_Sub6_Sub3Array10;

	@OriginalMember(owner = "client!ve", name = "Y", descriptor = "Lclient!mb;")
	private static Class45 aClass45_1341 = Static63.method1251("Loading sprites )2 ");

	@OriginalMember(owner = "client!ve", name = "V", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1340 = aClass45_1341;

	@OriginalMember(owner = "client!ve", name = "eb", descriptor = "I")
	public static int anInt3061 = 0;

	@OriginalMember(owner = "client!ve", name = "jb", descriptor = "I")
	public static int anInt3065 = -1;

	@OriginalMember(owner = "client!ve", name = "sb", descriptor = "[I")
	public static int[] anIntArray481 = new int[1000];

	@OriginalMember(owner = "client!ve", name = "ub", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1343 = Static63.method1251("Spieler)3 Bitte w-=hlen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!ve", name = "xb", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1344 = Static63.method1251("Sie haben gerade eine andere Welt verlassen)3");

	@OriginalMember(owner = "client!ve", name = "Ub", descriptor = "Lclient!mb;")
	private static Class45 aClass45_1347 = Static63.method1251("Use");

	@OriginalMember(owner = "client!ve", name = "zb", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1345 = aClass45_1347;

	@OriginalMember(owner = "client!ve", name = "Cb", descriptor = "Z")
	public static boolean aBoolean135 = false;

	@OriginalMember(owner = "client!ve", name = "Hb", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1346 = Static63.method1251("Gegenstand konnte nicht gefunden werden)1 verk-Urzen Sie den Suchbegriff)3");

	@OriginalMember(owner = "client!ve", name = "Rb", descriptor = "[I")
	public static int[] anIntArray483 = new int[2000];

	@OriginalMember(owner = "client!ve", name = "d", descriptor = "(B)V")
	public static void method2117() {
		aClass5_Sub2_Sub6_Sub4_48 = null;
		aClass45_1340 = null;
		aClass45_1341 = null;
		anIntArray483 = null;
		aClass5_Sub2_Sub6_Sub4_49 = null;
		anIntArray481 = null;
		aClass45_1346 = null;
		aClass5_Sub2_Sub6_Sub3Array10 = null;
		aClass45_1347 = null;
		aClass45_1345 = null;
		aClass45_1343 = null;
		aClass45_1344 = null;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!mb;Lclient!sd;ILclient!mb;)Lclient!r;")
	public static Class5_Sub2_Sub6_Sub3 method2123(@OriginalArg(0) Class45 arg0, @OriginalArg(1) Class29 arg1, @OriginalArg(3) Class45 arg2) {
		@Pc(13) int local13 = arg1.method746(arg2);
		@Pc(19) int local19 = arg1.method753(arg0, local13);
		return Static21.method438(local13, arg1, local19);
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!ja;")
	public static RuntimeException_Sub1 method2124(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(8) RuntimeException_Sub1 local8;
		if (arg0 instanceof RuntimeException_Sub1) {
			local8 = (RuntimeException_Sub1) arg0;
			local8.aString1 = local8.aString1 + ' ' + arg1;
		} else {
			local8 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local8;
	}

	@OriginalMember(owner = "client!ve", name = "h", descriptor = "(I)Z")
	public static boolean method2126() {
		@Pc(5) Class52 local5 = Static89.aClass52_1;
		synchronized (Static89.aClass52_1) {
			if (Static53.anInt2374 == Static111.anInt2907) {
				return false;
			} else {
				Static47.anInt1349 = Static52.anIntArray489[Static53.anInt2374];
				Static25.anInt792 = Static5.anIntArray15[Static53.anInt2374];
				Static53.anInt2374 = Static53.anInt2374 + 1 & 0x7F;
				return true;
			}
		}
	}
}
