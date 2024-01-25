import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!gs", name = "d", descriptor = "I")
	public static int anInt7585 = 0;

	@OriginalMember(owner = "client!gs", name = "f", descriptor = "[Lclient!at;")
	public static final Class7_Sub2_Sub3_Sub1[] aClass7_Sub2_Sub3_Sub1Array11 = new Class7_Sub2_Sub3_Sub1[32768];

	@OriginalMember(owner = "client!gs", name = "b", descriptor = "(I)V")
	public static void method5913() {
		Static124.aClass226_15.method4822();
		Static26.aClass106_1.method2689();
		Static24.aClass69_1.method1704();
		Static435.aClass30_4.method766();
		Static364.aClass96_2.method2196();
		Static314.aClass12_2.method337();
		Static301.aClass170_3.method3931();
		Static96.aClass41_2.method1136();
		Static99.aClass36_1.method859();
		Static20.aClass168_1.method3908();
		Static432.aClass73_1.method1822();
		Static168.aClass171_3.method3944();
		Static326.aClass164_3.method3866();
		Static318.aClass26_5.method690();
		Static65.aClass253_1.method5381();
		Static212.aClass184_1.method4144();
		Static353.aClass212_1.method4534();
		Static36.aClass242_1.method5197();
		Static239.aClass263_2.method5817();
		Static106.aClass124_1.method3119();
		Static206.method3197();
		Static28.method611();
		Static409.method5282();
		Static355.method4736();
		Static266.aClass126_30.method3140(5);
		Static38.aClass126_4.method3140(5);
		Static381.aClass126_64.method3140(5);
		Static241.aClass126_28.method3140(5);
		Static285.aClass126_41.method3140(5);
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;")
	public static String[] method5915(@OriginalArg(1) String[] arg0) {
		@Pc(6) String[] local6 = new String[5];
		for (@Pc(8) int local8 = 0; local8 < 5; local8++) {
			local6[local8] = local8 + ": ";
			if (arg0 != null && arg0[local8] != null) {
				local6[local8] = local6[local8] + arg0[local8];
			}
		}
		return local6;
	}
}
