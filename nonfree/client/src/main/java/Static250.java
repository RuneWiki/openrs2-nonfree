import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static250 {

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IB)Lclient!ih;")
	public static Class148 method4484(@OriginalArg(0) int arg0) {
		@Pc(12) Class148 local12 = (Class148) Static520.aClass166_50.method4805((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(22) byte[] local22 = Static77.aClass353_14.method8404(0, arg0);
		local12 = new Class148();
		if (local22 != null) {
			local12.method4075(new Class6_Sub40(local22), arg0);
		}
		Static520.aClass166_50.method4803(local12, (long) arg0);
		return local12;
	}
}
