import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static511 {

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "I")
	public static int anInt8881;

	@OriginalMember(owner = "client!vj", name = "l", descriptor = "[I")
	public static int[] anIntArray679;

	@OriginalMember(owner = "client!vj", name = "m", descriptor = "I")
	public static int anInt8888;

	@OriginalMember(owner = "client!vj", name = "j", descriptor = "Lclient!qu;")
	public static final Class243 aClass243_90 = new Class243(64, -1);

	@OriginalMember(owner = "client!vj", name = "k", descriptor = "Lclient!qp;")
	public static final Class239 aClass239_181 = new Class239(73, -1);

	@OriginalMember(owner = "client!vj", name = "n", descriptor = "I")
	public static int anInt8889 = 104;

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Z[[[Lclient!sk;)V")
	public static void method7466(@OriginalArg(1) Class262[][][] arg0) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			@Pc(9) Class262[][] local9 = arg0[local3];
			for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
				for (@Pc(15) int local15 = 0; local15 < local9[local11].length; local15++) {
					@Pc(23) Class262 local23 = local9[local11][local15];
					if (local23 != null) {
						if (local23.aClass1_Sub4_1 instanceof Interface6) {
							((Interface6) local23.aClass1_Sub4_1).method7683();
						}
						if (local23.aClass1_Sub3_2 instanceof Interface6) {
							((Interface6) local23.aClass1_Sub3_2).method7683();
						}
						if (local23.aClass1_Sub3_3 instanceof Interface6) {
							((Interface6) local23.aClass1_Sub3_3).method7683();
						}
						if (local23.aClass1_Sub2_3 instanceof Interface6) {
							((Interface6) local23.aClass1_Sub2_3).method7683();
						}
						if (local23.aClass1_Sub2_2 instanceof Interface6) {
							((Interface6) local23.aClass1_Sub2_2).method7683();
						}
						for (@Pc(73) Class187 local73 = local23.aClass187_3; local73 != null; local73 = local73.aClass187_1) {
							@Pc(78) Class1_Sub1 local78 = local73.aClass1_Sub1_1;
							if (local78 instanceof Interface6) {
								((Interface6) local78).method7683();
							}
						}
					}
				}
			}
		}
	}
}
