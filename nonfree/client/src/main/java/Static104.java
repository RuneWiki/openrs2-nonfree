import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!kj", name = "c", descriptor = "I")
	public static int anInt2178;

	@OriginalMember(owner = "client!kj", name = "h", descriptor = "I")
	public static int anInt2182;

	@OriginalMember(owner = "client!kj", name = "k", descriptor = "Lclient!ji;")
	public static Class5_Sub2_Sub10 aClass5_Sub2_Sub10_4;

	@OriginalMember(owner = "client!kj", name = "m", descriptor = "[[B")
	public static byte[][] aByteArrayArray7;

	@OriginalMember(owner = "client!kj", name = "q", descriptor = "Lclient!wa;")
	public static Class23 aClass23_41;

	@OriginalMember(owner = "client!kj", name = "s", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_811 = Static161.method2452("Loaded update list");

	@OriginalMember(owner = "client!kj", name = "f", descriptor = "Lclient!dc;")
	public static Class20 aClass20_810 = aClass20_811;

	@OriginalMember(owner = "client!kj", name = "j", descriptor = "Z")
	public static boolean aBoolean95 = false;

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(ILclient!dc;)V")
	public static void method1712(@OriginalArg(1) Class20 arg0) {
		if (Static80.anInt1803 >= 2) {
			@Pc(15) int local15;
			@Pc(35) int local35;
			if (arg0.method551(Static169.aClass20_1249)) {
				for (local15 = 0; local15 < 10; local15++) {
					System.gc();
				}
				@Pc(26) Runtime local26 = Runtime.getRuntime();
				local35 = (int) ((local26.totalMemory() - local26.freeMemory()) / 1024L);
				Static189.method2824(0, Static70.method1166(new Class20[] { Static71.aClass20_522, Static132.method2805(local35), Static106.aClass20_817 }), null);
			}
			if (arg0.method551(Static29.aClass20_222)) {
				Static88.method1473();
			}
			if (arg0.method551(Static80.aClass20_664)) {
				Static159.aBoolean141 = true;
			}
			if (arg0.method551(Static53.aClass20_374)) {
				Static159.aBoolean141 = false;
			}
			arg0.method551(Static137.aClass20_1084);
			arg0.method551(Static58.aClass20_453);
			if (arg0.method551(Static116.aClass20_904)) {
				for (local15 = 0; local15 < 4; local15++) {
					for (@Pc(99) int local99 = 1; local99 < 103; local99++) {
						for (local35 = 1; local35 < 103; local35++) {
							Static9.aClass76Array1[local15].anIntArrayArray30[local99][local35] = 0;
						}
					}
				}
			}
			if (arg0.method587(Static55.aClass20_397) && Static44.anInt1016 != 0) {
				Static54.method942(arg0.method549(6).method553());
			}
			if (arg0.method551(Static138.aClass20_1454) && Static44.anInt1016 == 2) {
				throw new RuntimeException();
			}
			if (arg0.method587(Static113.aClass20_876)) {
				Static108.anInt2202 = arg0.method549(12).method580().method553();
				Static189.method2824(0, Static70.method1166(new Class20[] { Static129.aClass20_985, Static132.method2805(Static108.anInt2202) }), null);
			}
			if (arg0.method551(Static93.aClass20_1197)) {
				Static148.aBoolean130 = true;
			}
		}
		Static43.aClass5_Sub6_Sub1_2.method3087(46);
		Static43.aClass5_Sub6_Sub1_2.method3061(arg0.method582() - 1);
		Static43.aClass5_Sub6_Sub1_2.method3047(arg0.method549(2));
	}
}
