import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static217 {

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method3436(@OriginalArg(0) String arg0) {
		if (Static508.aClass183Array1 == null) {
			return;
		}
		@Pc(14) Class389 local14 = Static120.method1769(false);
		@Pc(20) Class5_Sub41 local20 = Static647.method8905(Static1.aClass381_210, local14.aClass393_2);
		local20.aClass5_Sub36_Sub2_1.method7324(Static271.method4453(arg0));
		local20.aClass5_Sub36_Sub2_1.method7327(arg0);
		local14.method9079(local20);
	}
}
