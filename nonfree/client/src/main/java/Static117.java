import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
	public static int anInt2448;

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "Lclient!wa;")
	public static Class23 aClass23_44;

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "Lclient!mf;")
	public static Class69 aClass69_8;

	@OriginalMember(owner = "client!mc", name = "g", descriptor = "Lclient!rb;")
	public static Class87 aClass87_17;

	@OriginalMember(owner = "client!mc", name = "l", descriptor = "[I")
	public static int[] anIntArray274;

	@OriginalMember(owner = "client!mc", name = "n", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_910 = Static161.method2452("Connecting to update server");

	@OriginalMember(owner = "client!mc", name = "e", descriptor = "Lclient!dc;")
	public static Class20 aClass20_906 = aClass20_910;

	@OriginalMember(owner = "client!mc", name = "m", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_909 = Static161.method2452("Loaded wordpack");

	@OriginalMember(owner = "client!mc", name = "f", descriptor = "Lclient!dc;")
	public static Class20 aClass20_907 = aClass20_909;

	@OriginalMember(owner = "client!mc", name = "k", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_908 = Static161.method2452("Bitte benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!mc", name = "o", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_911 = Static161.method2452("Mitglieder)2Welt");

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZIIIII)V")
	public static void method1867(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static158.aClass47Array4[0].method2016(arg1, arg4);
		Static158.aClass47Array4[1].method2016(arg1, arg0 + arg4 - 16);
		@Pc(27) int local27 = arg0 * (arg0 - 32) / arg2;
		if (local27 < 8) {
			local27 = 8;
		}
		@Pc(44) int local44 = arg3 * (arg0 - local27 - 32) / (arg2 - arg0);
		Static42.method824(arg1, arg4 + 16, 16, arg0 - 32, Static16.anInt324);
		Static42.method824(arg1, local44 + arg4 + 16, 16, local27, Static211.anInt4108);
		Static42.method813(arg1, local44 + arg4 + 16, local27, Static137.anInt2873);
		Static42.method813(arg1 + 1, arg4 + (16 - -local44), local27, Static137.anInt2873);
		Static42.method809(arg1, arg4 + local44 + 16, 16, Static137.anInt2873);
		Static42.method809(arg1, local44 + arg4 + 17, 16, Static137.anInt2873);
		Static42.method813(arg1 + 15, local44 + arg4 + 16, local27, Static201.anInt1737);
		Static42.method813(arg1 + 14, arg4 + 17 + local44, local27 - 1, Static201.anInt1737);
		Static42.method809(arg1, local27 + local44 + arg4 + 15, 16, Static201.anInt1737);
		Static42.method809(arg1 + 1, local27 + local44 + 14 + arg4, 15, Static201.anInt1737);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V")
	public static void method1868() {
		@Pc(9) int local9 = Static212.anInt4113 - (int) ((double) Static122.aClass69_11.anInt2541 / Static216.aDouble11);
		@Pc(26) int local26 = Static212.anInt4113 + (int) ((double) Static122.aClass69_11.anInt2541 / Static216.aDouble11);
		@Pc(36) int local36 = Static18.anInt354 - (int) ((double) Static122.aClass69_11.anInt2471 / Static216.aDouble11);
		if (local9 < 0) {
			Static212.anInt4113 = (int) ((double) Static122.aClass69_11.anInt2541 / Static216.aDouble11);
			Static129.anInt2701 = -1;
			Static148.anInt3057 = -1;
		}
		@Pc(58) int local58 = (int) ((double) Static122.aClass69_11.anInt2471 / Static216.aDouble11) + Static18.anInt354;
		if (Static131.anInt2727 < local26) {
			Static212.anInt4113 = Static131.anInt2727 - (int) ((double) Static122.aClass69_11.anInt2541 / Static216.aDouble11);
			Static148.anInt3057 = -1;
			Static129.anInt2701 = -1;
		}
		if (local36 < 0) {
			Static129.anInt2701 = -1;
			Static18.anInt354 = (int) ((double) Static122.aClass69_11.anInt2471 / Static216.aDouble11);
			Static148.anInt3057 = -1;
		}
		if (local58 > Static165.anInt2257) {
			Static148.anInt3057 = -1;
			Static18.anInt354 = Static165.anInt2257 - (int) ((double) Static122.aClass69_11.anInt2471 / Static216.aDouble11);
			Static129.anInt2701 = -1;
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IZLclient!dc;)V")
	public static void method1869(@OriginalArg(0) int arg0, @OriginalArg(2) Class20 arg1) {
		Static43.aClass5_Sub6_Sub1_2.method3087(68);
		Static43.aClass5_Sub6_Sub1_2.method3061(arg0);
		Static43.aClass5_Sub6_Sub1_2.method3055(arg1.method595());
	}
}
