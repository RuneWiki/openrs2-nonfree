import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static356 {

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(BI)Lclient!jk;")
	public static Class182 method5394(@OriginalArg(1) int arg0) {
		@Pc(10) Class182 local10 = (Class182) Static399.aClass264_47.method6367((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static660.aClass386_139.method9196(arg0, 0);
		local10 = new Class182();
		if (local20 != null) {
			local10.method4059(new Class14_Sub29(local20), arg0);
		}
		Static399.aClass264_47.method6364((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IC)Z")
	public static boolean method5395(@OriginalArg(1) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}
}
