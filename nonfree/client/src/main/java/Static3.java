import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ac", name = "q", descriptor = "[I")
	public static int[] anIntArray5;

	@OriginalMember(owner = "client!ac", name = "r", descriptor = "I")
	public static int anInt114;

	@OriginalMember(owner = "client!ac", name = "u", descriptor = "[I")
	public static int[] anIntArray6;

	@OriginalMember(owner = "client!ac", name = "n", descriptor = "Lclient!ob;")
	public static Class55 aClass55_7 = new Class55(64);

	@OriginalMember(owner = "client!ac", name = "o", descriptor = "[Lclient!na;")
	public static Class2_Sub9[] aClass2_Sub9Array1 = new Class2_Sub9[2048];

	@OriginalMember(owner = "client!ac", name = "p", descriptor = "Lclient!je;")
	public static Class40 aClass40_74 = Static69.method1231("<col=ff7000>");

	@OriginalMember(owner = "client!ac", name = "D", descriptor = "Lclient!je;")
	private static Class40 aClass40_82 = Static69.method1231("Loaded config");

	@OriginalMember(owner = "client!ac", name = "s", descriptor = "Lclient!je;")
	public static Class40 aClass40_75 = aClass40_82;

	@OriginalMember(owner = "client!ac", name = "t", descriptor = "Lclient!je;")
	public static Class40 aClass40_76 = Static69.method1231("<img=0>");

	@OriginalMember(owner = "client!ac", name = "E", descriptor = "Lclient!je;")
	private static Class40 aClass40_83 = Static69.method1231("You need a members account to login to this world)3");

	@OriginalMember(owner = "client!ac", name = "v", descriptor = "Lclient!je;")
	public static Class40 aClass40_77 = aClass40_83;

	@OriginalMember(owner = "client!ac", name = "x", descriptor = "Lclient!je;")
	private static Class40 aClass40_79 = Static69.method1231("No response from server)3");

	@OriginalMember(owner = "client!ac", name = "w", descriptor = "Lclient!je;")
	public static Class40 aClass40_78 = aClass40_79;

	@OriginalMember(owner = "client!ac", name = "y", descriptor = "Lclient!je;")
	public static Class40 aClass40_80 = Static69.method1231("::rect_debug");

	@OriginalMember(owner = "client!ac", name = "z", descriptor = "I")
	public static int anInt115 = 0;

	@OriginalMember(owner = "client!ac", name = "B", descriptor = "[I")
	public static int[] anIntArray7 = new int[200];

	@OriginalMember(owner = "client!ac", name = "C", descriptor = "Lclient!je;")
	public static Class40 aClass40_81 = Static69.method1231("Sprites geladen)3");

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)V")
	public static void method76() {
		aClass40_78 = null;
		anIntArray6 = null;
		anIntArray5 = null;
		aClass55_7 = null;
		aClass40_77 = null;
		anIntArray7 = null;
		aClass40_74 = null;
		aClass40_79 = null;
		aClass40_83 = null;
		aClass2_Sub9Array1 = null;
		aClass40_80 = null;
		aClass40_81 = null;
		aClass40_75 = null;
		aClass40_76 = null;
		aClass40_82 = null;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIB)Z")
	public static boolean method83(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 11) {
			arg1 = 10;
		}
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		@Pc(31) Class2_Sub1_Sub4 local31 = Static107.method1839(arg0);
		return local31.method701(arg1);
	}
}
