import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static580 {

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(B[B)Z")
	public static boolean method7934(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class5_Sub15 local8 = new Class5_Sub15(arg0);
		@Pc(17) int local17 = local8.method3642();
		if (local17 != 2) {
			return false;
		}
		@Pc(35) boolean local35 = local8.method3642() == 1;
		if (local35) {
			Static426.method6453(local8);
		}
		Static75.method1106(local8);
		return true;
	}
}
