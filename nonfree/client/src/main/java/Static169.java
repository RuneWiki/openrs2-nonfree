import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static169 {

	@OriginalMember(owner = "client!g", name = "b", descriptor = "I")
	public static int anInt731;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(II)Lclient!qb;")
	public static Class273 method797(@OriginalArg(0) int arg0) {
		@Pc(12) Class273 local12 = (Class273) Static189.aClass169_72.method5002((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(22) byte[] local22 = Static26.aClass157_19.method4564(0, arg0);
		local12 = new Class273();
		if (local22 != null) {
			local12.method7029(new Class2_Sub11(local22));
		}
		local12.method7030();
		Static189.aClass169_72.method5001(local12, (long) arg0);
		return local12;
	}
}
