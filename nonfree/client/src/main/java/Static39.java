import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "[Lclient!me;")
	public static Class5_Sub1_Sub11[] aClass5_Sub1_Sub11Array1;

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "I")
	public static int anInt1027;

	@OriginalMember(owner = "client!gd", name = "n", descriptor = "Lclient!vb;")
	public static Class70 aClass70_2;

	@OriginalMember(owner = "client!gd", name = "p", descriptor = "Z")
	public static boolean aBoolean45;

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "Lclient!vc;")
	public static Class71 aClass71_575 = Static38.method736("-5berpr-Ufen Sie Ihr Mitteilungsfach)3");

	@OriginalMember(owner = "client!gd", name = "j", descriptor = "Lclient!vc;")
	private static Class71 aClass71_579 = Static38.method736("Hide");

	@OriginalMember(owner = "client!gd", name = "g", descriptor = "Lclient!vc;")
	public static Class71 aClass71_576 = aClass71_579;

	@OriginalMember(owner = "client!gd", name = "h", descriptor = "Lclient!vc;")
	private static Class71 aClass71_577 = Static38.method736("The server is being updated)3");

	@OriginalMember(owner = "client!gd", name = "i", descriptor = "Lclient!vc;")
	public static Class71 aClass71_578 = aClass71_577;

	@OriginalMember(owner = "client!gd", name = "k", descriptor = "Lclient!vc;")
	private static Class71 aClass71_580 = Static38.method736("Report abuse");

	@OriginalMember(owner = "client!gd", name = "m", descriptor = "I")
	public static int anInt1031 = 0;

	@OriginalMember(owner = "client!gd", name = "o", descriptor = "[I")
	public static int[] anIntArray121 = new int[256];

	@OriginalMember(owner = "client!gd", name = "q", descriptor = "Lclient!vc;")
	public static Class71 aClass71_581 = Static38.method736("Aus");

	@OriginalMember(owner = "client!gd", name = "r", descriptor = "Lclient!vc;")
	public static Class71 aClass71_582 = aClass71_580;

	@OriginalMember(owner = "client!gd", name = "s", descriptor = "I")
	public static int anInt1032 = 0;

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)V")
	public static void method744() {
		aClass71_582 = null;
		aClass71_575 = null;
		aClass70_2 = null;
		aClass71_577 = null;
		aClass5_Sub1_Sub11Array1 = null;
		aClass71_581 = null;
		aClass71_580 = null;
		aClass71_578 = null;
		anIntArray121 = null;
		aClass71_576 = null;
		aClass71_579 = null;
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(B)V")
	public static void method745() {
		if (Static66.aClass40_1 != null) {
			@Pc(15) Class40 local15 = Static66.aClass40_1;
			synchronized (Static66.aClass40_1) {
				Static66.aClass40_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V")
	public static void method746() {
		@Pc(5) Class48 local5 = Static41.aClass48_1;
		synchronized (Static41.aClass48_1) {
			Static111.anInt975 = Static9.anInt291;
			Static107.anInt2563 = Static93.anInt2251;
			Static26.anInt1440 = Static66.anInt1649;
			Static66.anInt1652 = Static17.anInt613;
			Static30.anInt800 = Static66.anInt1653;
			Static32.anInt847 = Static108.anInt2616;
			Static116.aLong109 = Static110.aLong102;
			Static17.anInt613 = 0;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZI)I")
	public static int method747(@OriginalArg(1) int arg0) {
		return arg0 >> 17 & 0x7;
	}
}
