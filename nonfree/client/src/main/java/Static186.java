import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static186 {

	@OriginalMember(owner = "client!gl", name = "d", descriptor = "Lclient!th;")
	public static Class323 aClass323_1;

	@OriginalMember(owner = "client!gl", name = "g", descriptor = "[Z")
	public static final boolean[] aBooleanArray12 = new boolean[5];

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(III)Lclient!lj;")
	public static Class9_Sub2_Sub2 method3037(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class351 local7 = Static567.aClass351ArrayArrayArray4[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class9_Sub2_Sub2 local14 = local7.aClass9_Sub2_Sub2_1;
			local7.aClass9_Sub2_Sub2_1 = null;
			Static214.method3762(local14);
			return local14;
		}
	}
}
