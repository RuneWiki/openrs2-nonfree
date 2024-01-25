import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static241 {

	@OriginalMember(owner = "client!ii", name = "p", descriptor = "Lclient!ea;")
	public static final Class73 aClass73_82 = new Class73(98, -2);

	@OriginalMember(owner = "client!ii", name = "u", descriptor = "Lclient!qc;")
	public static final Class272 aClass272_3 = new Class272();

	@OriginalMember(owner = "client!ii", name = "v", descriptor = "Lclient!fc;")
	public static final Class94 aClass94_21 = new Class94(4);

	@OriginalMember(owner = "client!ii", name = "w", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray14 = new String[100];

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(B)V")
	public static void method4385() {
		if (Static347.anInt6836 == 5) {
			Static347.anInt6836 = 6;
		}
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(I)V")
	public static void method4386() {
		Static437.aClass380_33.method8751();
		Static623.aClass380_49.method8751();
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(B[[[Lclient!lha;)V")
	public static void method4387(@OriginalArg(1) Class186[][][] arg0) {
		for (@Pc(12) int local12 = 0; local12 < arg0.length; local12++) {
			@Pc(18) Class186[][] local18 = arg0[local12];
			for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
				for (@Pc(24) int local24 = 0; local24 < local18[local20].length; local24++) {
					@Pc(32) Class186 local32 = local18[local20][local24];
					if (local32 != null) {
						if (local32.aClass9_Sub4_Sub3_1 instanceof Interface22) {
							((Interface22) local32.aClass9_Sub4_Sub3_1).method8433();
						}
						if (local32.aClass9_Sub4_Sub1_2 instanceof Interface22) {
							((Interface22) local32.aClass9_Sub4_Sub1_2).method8433();
						}
						if (local32.aClass9_Sub4_Sub1_1 instanceof Interface22) {
							((Interface22) local32.aClass9_Sub4_Sub1_1).method8433();
						}
						if (local32.aClass9_Sub4_Sub5_1 instanceof Interface22) {
							((Interface22) local32.aClass9_Sub4_Sub5_1).method8433();
						}
						if (local32.aClass9_Sub4_Sub5_2 instanceof Interface22) {
							((Interface22) local32.aClass9_Sub4_Sub5_2).method8433();
						}
						for (@Pc(82) Class168 local82 = local32.aClass168_3; local82 != null; local82 = local82.aClass168_2) {
							@Pc(87) Class9_Sub4_Sub2 local87 = local82.aClass9_Sub4_Sub2_1;
							if (local87 instanceof Interface22) {
								((Interface22) local87).method8433();
							}
						}
					}
				}
			}
		}
	}
}
