import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "[I")
	public static int[] anIntArray65;

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
	public static int anInt593;

	@OriginalMember(owner = "client!client", name = "T", descriptor = "Lclient!ic;")
	public static Class34 aClass34_286 = Static56.method816("m-Ochte mit Ihnen handeln)3");

	@OriginalMember(owner = "client!client", name = "V", descriptor = "Lclient!ic;")
	public static Class34 aClass34_287 = Static56.method816("und Ihr Passwort ein)3");

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "Lclient!ic;")
	public static Class34 aClass34_288 = Static56.method816("bevor Sie den Vorgang wiederholen)3");

	@OriginalMember(owner = "client!client", name = "db", descriptor = "Lclient!ic;")
	public static Class34 aClass34_289 = Static56.method816("Lade Texturen )2 ");

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "Lclient!ic;")
	public static Class34 aClass34_290 = Static56.method816("Geben Sie Ihren Benutzernamen");

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "Lclient!ic;")
	public static Class34 aClass34_291 = Static56.method816("blinken3:");

	@OriginalMember(owner = "client!client", name = "qb", descriptor = "Lclient!ic;")
	private static Class34 aClass34_293 = Static56.method816("Loaded textures");

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "Lclient!ic;")
	public static Class34 aClass34_292 = aClass34_293;

	@OriginalMember(owner = "client!client", name = "rb", descriptor = "Lclient!ic;")
	private static Class34 aClass34_294 = Static56.method816("Examine");

	@OriginalMember(owner = "client!client", name = "sb", descriptor = "Lclient!ic;")
	public static Class34 aClass34_295 = aClass34_294;

	@OriginalMember(owner = "client!client", name = "xb", descriptor = "I")
	public static int anInt600 = 0;

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
	public static void method354() {
		System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german], [game0/game1]");
		System.exit(1);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!wf;B)Lclient!wf;")
	public static Class8_Sub24 method355(@OriginalArg(0) Class8_Sub24 arg0) {
		@Pc(7) Class8_Sub24 local7 = Static44.method674(arg0);
		if (local7 == null) {
			local7 = arg0.aClass8_Sub24_16;
		}
		return local7;
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)Lclient!ve;")
	public static Class3 method357() {
		try {
			return (Class3) Class.forName("Class3_Sub2").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return new Class3_Sub1();
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	public static void method359() {
		if (Static108.aBoolean98 && Static88.anInt2344 != Static42.anInt1024) {
			Static61.method937(Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anIntArray260[0], Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anIntArray262[0], Static132.anInt2834, Static42.anInt1024, Static95.anInt2249);
		} else if (Static42.anInt1024 != Static86.anInt2179) {
			Static86.anInt2179 = Static42.anInt1024;
			Static123.method1942(Static42.anInt1024);
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	public static void method360() {
		aClass34_294 = null;
		aClass34_286 = null;
		aClass34_295 = null;
		aClass34_293 = null;
		aClass34_291 = null;
		aClass34_288 = null;
		aClass34_290 = null;
		aClass34_292 = null;
		anIntArray65 = null;
		aClass34_287 = null;
		aClass34_289 = null;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!dd;Lclient!dd;Z)Lclient!ub;")
	public static Class8_Sub1_Sub3_Sub4_Sub1 method362(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class14 arg2, @OriginalArg(3) Class14 arg3) {
		return Static134.method2026(arg0, arg1, arg3) ? Static1.method2(arg2.method1156(arg0, arg1)) : null;
	}
}
