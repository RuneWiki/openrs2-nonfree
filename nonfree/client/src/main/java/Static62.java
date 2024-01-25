import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(I[B)Z")
	public static boolean method1767(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class6_Sub8 local8 = new Class6_Sub8(arg0);
		@Pc(12) int local12 = local8.method8246();
		if (local12 != 2) {
			return false;
		}
		@Pc(28) boolean local28 = local8.method8246() == 1;
		if (local28) {
			Static4.method342(local8);
		}
		Static508.method7294(local8);
		return true;
	}
}
