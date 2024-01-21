import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!gj", name = "P", descriptor = "I")
	public static int anInt1413;

	@OriginalMember(owner = "client!gj", name = "O", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_487 = Static161.method2452("white:");

	@OriginalMember(owner = "client!gj", name = "Q", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_488 = aClass20_487;

	@OriginalMember(owner = "client!gj", name = "R", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_489 = Static161.method2452("(Y");

	@OriginalMember(owner = "client!gj", name = "S", descriptor = "I")
	public static int anInt1414 = -1;

	@OriginalMember(owner = "client!gj", name = "T", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_490 = Static161.method2452(" )2> ");

	@OriginalMember(owner = "client!gj", name = "Y", descriptor = "I")
	public static int anInt1418 = 1;

	@OriginalMember(owner = "client!gj", name = "Z", descriptor = "Lclient!qb;")
	public static final Class84 aClass84_11 = new Class84(500);

	@OriginalMember(owner = "client!gj", name = "ab", descriptor = "Lclient!dc;")
	public static Class20 aClass20_491 = aClass20_487;

	@OriginalMember(owner = "client!gj", name = "cb", descriptor = "I")
	public static int anInt1420 = 0;

	@OriginalMember(owner = "client!gj", name = "db", descriptor = "I")
	public static int anInt1421 = -1;

	@OriginalMember(owner = "client!gj", name = "eb", descriptor = "I")
	public static int anInt1422 = 0;

	@OriginalMember(owner = "client!gj", name = "fb", descriptor = "[I")
	public static final int[] anIntArray134 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IILclient!dj;)V")
	public static void method1070(@OriginalArg(0) int arg0, @OriginalArg(2) Class23_Sub1 arg1) {
		if (Static177.aClass5_Sub6_4 == null) {
			Static56.method952(0, true, 255, (byte) 0, null, 255);
			Static105.aClass23_Sub1Array1[arg0] = arg1;
		} else {
			Static177.aClass5_Sub6_4.anInt4050 = arg0 * 8 + 5;
			@Pc(23) int local23 = Static177.aClass5_Sub6_4.method3073();
			@Pc(29) int local29 = Static177.aClass5_Sub6_4.method3073();
			arg1.method760(local29, local23);
		}
	}
}
