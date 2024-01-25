import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static450 {

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "([[[Lclient!gn;I)V")
	public static void method7029(@OriginalArg(0) Class125[][][] arg0) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(12) Class125[][] local12 = arg0[local7];
			for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
				for (@Pc(17) int local17 = 0; local17 < local12[local14].length; local17++) {
					@Pc(24) Class125 local24 = local12[local14][local17];
					if (local24 != null) {
						if (local24.aClass2_Sub1_1 instanceof Interface22) {
							((Interface22) local24.aClass2_Sub1_1).method8395();
						}
						if (local24.aClass2_Sub3_2 instanceof Interface22) {
							((Interface22) local24.aClass2_Sub3_2).method8395();
						}
						if (local24.aClass2_Sub3_1 instanceof Interface22) {
							((Interface22) local24.aClass2_Sub3_1).method8395();
						}
						if (local24.aClass2_Sub4_1 instanceof Interface22) {
							((Interface22) local24.aClass2_Sub4_1).method8395();
						}
						if (local24.aClass2_Sub4_2 instanceof Interface22) {
							((Interface22) local24.aClass2_Sub4_2).method8395();
						}
						for (@Pc(74) Class302 local74 = local24.aClass302_1; local74 != null; local74 = local74.aClass302_2) {
							@Pc(78) Class2_Sub2 local78 = local74.aClass2_Sub2_1;
							if (local78 instanceof Interface22) {
								((Interface22) local78).method8395();
							}
						}
					}
				}
			}
		}
	}
}
