import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static310 {

	@OriginalMember(owner = "client!lf", name = "e", descriptor = "Lclient!tm;")
	public static Class337 aClass337_94;

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "Lclient!vj;")
	public static final Class365 aClass365_11 = new Class365(4, 1);

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "I")
	public static int anInt5363 = -1;

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(B)V")
	public static void method4804() {
		Static575.method8331();
		Static428.aBoolean526 = false;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "([[[Lclient!lo;I)V")
	public static void method4805(@OriginalArg(0) Class217[][][] arg0) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(13) Class217[][] local13 = arg0[local7];
			for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
				for (@Pc(19) int local19 = 0; local19 < local13[local15].length; local19++) {
					@Pc(27) Class217 local27 = local13[local15][local19];
					if (local27 != null) {
						if (local27.aClass4_Sub2_Sub2_1 instanceof Interface22) {
							((Interface22) local27.aClass4_Sub2_Sub2_1).method8492();
						}
						if (local27.aClass4_Sub2_Sub3_1 instanceof Interface22) {
							((Interface22) local27.aClass4_Sub2_Sub3_1).method8492();
						}
						if (local27.aClass4_Sub2_Sub3_2 instanceof Interface22) {
							((Interface22) local27.aClass4_Sub2_Sub3_2).method8492();
						}
						if (local27.aClass4_Sub2_Sub4_1 instanceof Interface22) {
							((Interface22) local27.aClass4_Sub2_Sub4_1).method8492();
						}
						if (local27.aClass4_Sub2_Sub4_2 instanceof Interface22) {
							((Interface22) local27.aClass4_Sub2_Sub4_2).method8492();
						}
						for (@Pc(77) Class290 local77 = local27.aClass290_2; local77 != null; local77 = local77.aClass290_3) {
							@Pc(82) Class4_Sub2_Sub1 local82 = local77.aClass4_Sub2_Sub1_1;
							if (local82 instanceof Interface22) {
								((Interface22) local82).method8492();
							}
						}
					}
				}
			}
		}
	}
}
