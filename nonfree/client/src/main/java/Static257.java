import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static257 {

	@OriginalMember(owner = "client!ij", name = "w", descriptor = "Lclient!tka;")
	public static final Class344 aClass344_2 = new Class344();

	@OriginalMember(owner = "client!ij", name = "B", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_80 = new Class322(88, -2);

	@OriginalMember(owner = "client!ij", name = "z", descriptor = "[I")
	public static final int[] anIntArray268 = new int[32];

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "([BI)Z")
	public static boolean method4501(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class6_Sub15 local8 = new Class6_Sub15(arg0);
		@Pc(12) int local12 = local8.method3030();
		if (local12 != 2) {
			return false;
		}
		@Pc(38) boolean local38 = local8.method3030() == 1;
		if (local38) {
			Static613.method8457(local8);
		}
		Static256.method4482(local8);
		return true;
	}
}
