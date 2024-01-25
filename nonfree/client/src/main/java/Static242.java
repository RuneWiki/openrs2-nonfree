import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static242 {

	@OriginalMember(owner = "client!in", name = "i", descriptor = "Lclient!ega;")
	public static Class79 aClass79_12;

	@OriginalMember(owner = "client!in", name = "o", descriptor = "I")
	public static int anInt4833;

	@OriginalMember(owner = "client!in", name = "p", descriptor = "Lclient!og;")
	public static Class238 aClass238_7;

	@OriginalMember(owner = "client!in", name = "n", descriptor = "[I")
	public static final int[] anIntArray277 = new int[25];

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(Lclient!vs;[Lclient!raa;)V")
	public static void method4189(@OriginalArg(0) Class20_Sub2 arg0, @OriginalArg(1) Class6_Sub1[] arg1) {
		@Pc(6) int local6;
		if (Static92.aBoolean125) {
			local6 = arg0.method9008(arg1);
			Static565.aClass100_15.method8828(local6, arg1);
		}
		if (Static510.aClass199Array3 == Static195.aClass199Array1) {
			@Pc(28) int local28;
			if (arg0 instanceof Class20_Sub2_Sub2) {
				local6 = ((Class20_Sub2_Sub2) arg0).aShort124;
				local28 = ((Class20_Sub2_Sub2) arg0).aShort123;
			} else {
				local6 = arg0.anInt10725 >> Static643.anInt10682;
				local28 = arg0.anInt10729 >> Static643.anInt10682;
			}
			Static565.aClass100_15.EA(Static228.aClass199Array2[0].method8531(arg0.anInt10729, arg0.anInt10725), Static62.method1114(local6, local28), Static645.method8994(local6, local28), Static42.method804(local6, local28));
		}
		@Pc(64) Class20_Sub3 local64 = arg0.method9020(Static565.aClass100_15);
		if (local64 == null) {
			return;
		}
		if (arg0.aBoolean727) {
			@Pc(72) Class20_Sub4[] local72 = local64.aClass20_Sub4Array1;
			for (@Pc(74) int local74 = 0; local74 < local72.length; local74++) {
				@Pc(79) Class20_Sub4 local79 = local72[local74];
				if (local79.aBoolean175) {
					Static347.method5621(local79.anInt2371 + local79.anInt2367, local79.anInt2370 + local79.anInt2367, local79.anInt2368 - local79.anInt2367, local79.anInt2369 - local79.anInt2367);
				}
			}
		}
		if (local64.aBoolean82) {
			local64.aClass20_Sub2_7 = arg0;
			if (Static101.aBoolean145) {
				@Pc(119) Class65 local119 = Static94.aClass65_1;
				synchronized (Static94.aClass65_1) {
					Static94.aClass65_1.method1715(local64);
					return;
				}
			}
			Static94.aClass65_1.method1715(local64);
			return;
		}
		Static53.method902(local64);
	}
}
