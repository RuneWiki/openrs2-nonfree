import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "Lclient!lc;")
	public static Class56 aClass56_1;

	@OriginalMember(owner = "client!bj", name = "c", descriptor = "Lclient!ke;")
	public static Class52 aClass52_6;

	@OriginalMember(owner = "client!bj", name = "d", descriptor = "I")
	public static int anInt369;

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "Lclient!ri;")
	public static final Class85 aClass85_1 = new Class85(64);

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lclient!wf;)V")
	public static void method311(@OriginalArg(0) Class99 arg0) {
		for (@Pc(2) int local2 = arg0.anInt4226; local2 <= arg0.anInt4224; local2++) {
			for (@Pc(6) int local6 = arg0.anInt4239; local6 <= arg0.anInt4230; local6++) {
				@Pc(16) Class3_Sub6 local16 = Static118.aClass3_Sub6ArrayArrayArray1[arg0.anInt4225][local2][local6];
				if (local16 != null) {
					@Pc(35) int local35;
					for (@Pc(20) int local20 = 0; local20 < local16.anInt827; local20++) {
						if (local16.aClass99Array1[local20] == arg0) {
							local16.anInt827--;
							for (local35 = local20; local35 < local16.anInt827; local35++) {
								local16.aClass99Array1[local35] = local16.aClass99Array1[local35 + 1];
								local16.anIntArray40[local35] = local16.anIntArray40[local35 + 1];
							}
							local16.aClass99Array1[local16.anInt827] = null;
							break;
						}
					}
					local16.anInt829 = 0;
					for (local35 = 0; local35 < local16.anInt827; local35++) {
						local16.anInt829 |= local16.anIntArray40[local35];
					}
				}
			}
		}
	}
}
