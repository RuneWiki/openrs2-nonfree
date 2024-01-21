import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!k", name = "m", descriptor = "Lclient!fd;")
	public static Class24 aClass24_15;

	@OriginalMember(owner = "client!k", name = "s", descriptor = "[I")
	public static int[] anIntArray149;

	@OriginalMember(owner = "client!k", name = "v", descriptor = "[Lclient!qb;")
	public static Class2_Sub1_Sub2_Sub4[] aClass2_Sub1_Sub2_Sub4Array10;

	@OriginalMember(owner = "client!k", name = "D", descriptor = "I")
	public static int anInt1501;

	@OriginalMember(owner = "client!k", name = "G", descriptor = "Lclient!wb;")
	public static Class82 aClass82_4;

	@OriginalMember(owner = "client!k", name = "o", descriptor = "Lclient!je;")
	private static Class40 aClass40_734 = Static69.method1231("Username: ");

	@OriginalMember(owner = "client!k", name = "h", descriptor = "Lclient!je;")
	public static Class40 aClass40_733 = aClass40_734;

	@OriginalMember(owner = "client!k", name = "i", descriptor = "Lclient!ga;")
	public static Class2_Sub9_Sub1 aClass2_Sub9_Sub1_2 = new Class2_Sub9_Sub1(5000);

	@OriginalMember(owner = "client!k", name = "n", descriptor = "I")
	public static int anInt1492 = 0;

	@OriginalMember(owner = "client!k", name = "w", descriptor = "I")
	public static int anInt1498 = 2;

	@OriginalMember(owner = "client!k", name = "y", descriptor = "Lclient!je;")
	private static Class40 aClass40_735 = Static69.method1231("New User");

	@OriginalMember(owner = "client!k", name = "A", descriptor = "Lclient!je;")
	public static Class40 aClass40_736 = aClass40_735;

	@OriginalMember(owner = "client!k", name = "B", descriptor = "Lclient!je;")
	public static Class40 aClass40_737 = Static69.method1231("Suche nach Updates )2 ");

	@OriginalMember(owner = "client!k", name = "C", descriptor = "I")
	public static int anInt1500 = 0;

	@OriginalMember(owner = "client!k", name = "E", descriptor = "Lclient!je;")
	public static Class40 aClass40_738 = Static69.method1231("(U4");

	@OriginalMember(owner = "client!k", name = "d", descriptor = "(II)Lclient!sf;")
	public static Class2_Sub1_Sub13 method1012(@OriginalArg(1) int arg0) {
		@Pc(18) Class2_Sub1_Sub13 local18 = (Class2_Sub1_Sub13) Static32.aClass55_30.method1410((long) arg0);
		if (local18 != null) {
			return local18;
		}
		@Pc(28) byte[] local28 = Static130.aClass24_33.method1931(arg0, 4);
		local18 = new Class2_Sub1_Sub13();
		if (local28 != null) {
			local18.method1855(arg0, new Class2_Sub9(local28));
		}
		local18.method1853();
		Static32.aClass55_30.method1411((long) arg0, local18);
		return local18;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(B)Z")
	public static boolean method1015() {
		return Static77.anInt2023 == 0 ? Static129.aClass2_Sub5_Sub4_2.method1972() : true;
	}

	@OriginalMember(owner = "client!k", name = "b", descriptor = "(Z)Lclient!mb;")
	public static Class50 method1016() {
		try {
			return (Class50) Class.forName("Class50_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(I)V")
	public static void method1017() {
		aClass40_738 = null;
		aClass2_Sub1_Sub2_Sub4Array10 = null;
		aClass40_737 = null;
		aClass24_15 = null;
		anIntArray149 = null;
		aClass2_Sub9_Sub1_2 = null;
		aClass40_736 = null;
		aClass40_735 = null;
		aClass40_733 = null;
		aClass40_734 = null;
		aClass82_4 = null;
	}
}
