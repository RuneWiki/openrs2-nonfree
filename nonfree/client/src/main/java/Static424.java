import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static424 {

	@OriginalMember(owner = "client!qga", name = "h", descriptor = "I")
	public static int anInt7397;

	@OriginalMember(owner = "client!qga", name = "j", descriptor = "I")
	public static int anInt7399;

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(ILclient!qf;)V")
	public static void method6101(@OriginalArg(1) Class6_Sub21_Sub2 arg0) {
		arg0.method6033(Static552.aClass251_125.method5779());
		arg0.method6033(Static328.aClass251_81.method5779());
		arg0.method6033(Static579.aClass251_129.method5779());
		arg0.method6033(Static284.aClass251_68.method5779());
		arg0.method6033(Static58.aClass251_18.method5779());
		arg0.method6033(Static70.aClass251_58.method5779());
		arg0.method6033(Static370.aClass251_89.method5779());
		arg0.method6033(Static145.aClass251_40.method5779());
		arg0.method6033(Static398.aClass251_94.method5779());
		arg0.method6033(Static99.aClass251_25.method5779());
		arg0.method6033(Static466.aClass251_111.method5779());
		arg0.method6033(Static540.aClass251_59.method5779());
		arg0.method6033(Static466.aClass251_110.method5779());
		arg0.method6033(Static264.aClass251_66.method5779());
		arg0.method6033(Static423.aClass251_97.method5779());
		arg0.method6033(Static13.aClass251_101.method5779());
		arg0.method6033(Static341.aClass251_84.method5779());
		arg0.method6033(Static438.aClass251_99.method5779());
		arg0.method6033(Static48.aClass251_14.method5779());
		arg0.method6033(Static114.aClass251_27.method5779());
		arg0.method6033(Static447.aClass251_104.method5779());
		arg0.method6033(Static459.aClass251_108.method5779());
		arg0.method6033(Static156.aClass251_48.method5779());
		arg0.method6033(Static4.aClass251_4.method5779());
		arg0.method6033(Static313.aClass251_75.method5779());
		arg0.method6033(Static533.aClass251_123.method5779());
		arg0.method6033(Static455.aClass251_106.method5779());
		arg0.method6033(Static476.aClass251_113.method5779());
		arg0.method6033(Static89.aClass251_23.method5779());
		arg0.method6033(Static132.aClass251_33.method5779());
		arg0.method6033(Static368.aClass251_88.method5779());
		arg0.method6033(Static13.aClass251_100.method5779());
		arg0.method6033(Static333.method5197());
		arg0.method6033(Static147.method7402());
	}

	@OriginalMember(owner = "client!qga", name = "b", descriptor = "(I)V")
	public static void method6103() {
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < Static473.anInt8075; local14++) {
			for (@Pc(18) int local18 = 0; local18 < Static165.anInt6749; local18++) {
				if (Static70.method3540(Static270.aClass276ArrayArrayArray2, true, local12, local14, local18)) {
					local12++;
				}
				if (local12 >= 512) {
					return;
				}
			}
		}
	}
}
