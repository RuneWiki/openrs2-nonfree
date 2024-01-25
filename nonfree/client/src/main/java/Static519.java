import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static519 {

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "([[[Lclient!vda;B)V")
	public static void method6750(@OriginalArg(0) Class368[][][] arg0) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(13) Class368[][] local13 = arg0[local7];
			for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
				for (@Pc(19) int local19 = 0; local19 < local13[local15].length; local19++) {
					@Pc(27) Class368 local27 = local13[local15][local19];
					if (local27 != null) {
						if (local27.aClass34_Sub1_Sub2_1 instanceof Interface17) {
							((Interface17) local27.aClass34_Sub1_Sub2_1).method6658();
						}
						if (local27.aClass34_Sub1_Sub3_1 instanceof Interface17) {
							((Interface17) local27.aClass34_Sub1_Sub3_1).method6658();
						}
						if (local27.aClass34_Sub1_Sub3_2 instanceof Interface17) {
							((Interface17) local27.aClass34_Sub1_Sub3_2).method6658();
						}
						if (local27.aClass34_Sub1_Sub5_2 instanceof Interface17) {
							((Interface17) local27.aClass34_Sub1_Sub5_2).method6658();
						}
						if (local27.aClass34_Sub1_Sub5_1 instanceof Interface17) {
							((Interface17) local27.aClass34_Sub1_Sub5_1).method6658();
						}
						for (@Pc(77) Class205 local77 = local27.aClass205_4; local77 != null; local77 = local77.aClass205_3) {
							@Pc(82) Class34_Sub1_Sub1 local82 = local77.aClass34_Sub1_Sub1_1;
							if (local82 instanceof Interface17) {
								((Interface17) local82).method6658();
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(BI)V")
	public static void method6752(@OriginalArg(1) int arg0) {
		if (Static531.anIntArray443 == null || Static531.anIntArray443.length < arg0) {
			Static531.anIntArray443 = new int[arg0];
		}
	}
}
