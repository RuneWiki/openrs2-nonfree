import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!ha", name = "k", descriptor = "Lclient!pb;")
	public static Class71 aClass71_14;

	@OriginalMember(owner = "client!ha", name = "A", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_500 = Static151.method2243("Benutzername: ");

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_501 = Static151.method2243("Sun");

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_502 = Static151.method2243("Fri");

	@OriginalMember(owner = "client!ha", name = "g", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_503 = Static151.method2243("Mon");

	@OriginalMember(owner = "client!ha", name = "h", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_504 = Static151.method2243("Benutzen");

	@OriginalMember(owner = "client!ha", name = "i", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_505 = Static151.method2243("Tue");

	@OriginalMember(owner = "client!ha", name = "q", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_506 = Static151.method2243("Wed");

	@OriginalMember(owner = "client!ha", name = "t", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_508 = Static151.method2243("Thu");

	@OriginalMember(owner = "client!ha", name = "s", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_507 = Static151.method2243("Sat");

	@OriginalMember(owner = "client!ha", name = "j", descriptor = "[Lclient!mb;")
	public static final Class62[] aClass62Array40 = new Class62[] { aClass62_501, aClass62_503, aClass62_505, aClass62_506, aClass62_508, aClass62_502, aClass62_507 };

	@OriginalMember(owner = "client!ha", name = "v", descriptor = "Lclient!kd;")
	public static final Class2_Sub11 aClass2_Sub11_1 = new Class2_Sub11(new byte[5000]);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIZI)V")
	public static void method995(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		Static212.method3095(arg1, arg0, arg1 + arg3, arg2 + arg0);
		Static45.method700();
		Static212.method3103(arg1, arg0, arg3, arg2, 0);
		if (Static64.anInt1343 < 100) {
			return;
		}
		if (Static69.aClass2_Sub1_Sub2_1 == null) {
			@Pc(40) Class2_Sub1_Sub2_Sub1 local40 = new Class2_Sub1_Sub2_Sub1(arg3, arg2);
			Static212.method3111(local40.anIntArray32, arg3, arg2);
			Static162.method2385(0, 0, 0, Static173.anInt3686, 0, arg2, Static104.anInt2340, arg3);
			Static69.aClass2_Sub1_Sub2_1 = local40;
			Static127.aClass46_1.method2377();
		}
		Static69.aClass2_Sub1_Sub2_1.method271(arg1, arg0);
		@Pc(72) int local72 = Static216.anInt4526 * arg3 / Static173.anInt3686 + arg1;
		@Pc(80) int local80 = arg0 + arg2 * Static48.anInt1043 / Static104.anInt2340;
		@Pc(86) int local86 = Static123.anInt4489 * arg3 / Static173.anInt3686;
		@Pc(92) int local92 = arg2 * Static3.anInt138 / Static104.anInt2340;
		Static212.method3109(local72, local80, local86, local92, 16711680, 128);
		Static212.method3106(local72, local80, local86, local92, 16711680);
		if (Static167.anInt3570 <= 0 || Static167.anInt3570 % 10 >= 5) {
			return;
		}
		for (@Pc(117) Class2_Sub14 local117 = (Class2_Sub14) Static204.aClass13_19.method303(); local117 != null; local117 = (Class2_Sub14) Static204.aClass13_19.method309()) {
			if (local117.anInt2731 == Static148.anInt3160) {
				@Pc(132) int local132 = arg2 * local117.anInt2727 / Static104.anInt2340 + arg0;
				@Pc(141) int local141 = arg1 + local117.anInt2733 * arg3 / Static173.anInt3686;
				Static212.method3103(local141 - 2, local132 + -2, 4, 4, 16776960);
			}
		}
	}
}
