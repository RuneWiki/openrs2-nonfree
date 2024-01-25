import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static231 {

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(IB)Ljava/lang/String;")
	public static String method3867(@OriginalArg(0) int arg0) {
		@Pc(15) Class5_Sub21 local15 = (Class5_Sub21) Static115.aClass273_5.method6581((long) arg0);
		if (local15 != null) {
			@Pc(22) Class5_Sub34_Sub2 local22 = local15.aClass73_Sub1_1.method5411();
			if (local22 != null) {
				@Pc(29) double local29 = local15.aClass73_Sub1_1.method5417();
				if (local29 >= (double) local22.method5609() && (double) local22.method5612() >= local29) {
					return local22.method5613();
				}
			}
		}
		return null;
	}
}
