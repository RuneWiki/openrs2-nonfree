import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static223 {

	@OriginalMember(owner = "client!ii", name = "qb", descriptor = "[Lclient!f;")
	public static Class46[] aClass46Array8;

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIII)Z")
	public static boolean method3867(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) boolean local5 = true;
		@Pc(11) Interface22 local11 = (Interface22) Static247.method4031(arg2, arg1, arg0);
		if (local11 != null) {
			local5 = Static87.method1966(local11) & true;
		}
		local11 = (Interface22) Static417.method5998(arg2, arg1, arg0, qu.class);
		if (local11 != null) {
			local5 &= Static87.method1966(local11);
		}
		local11 = (Interface22) Static168.method7472(arg2, arg1, arg0);
		if (local11 != null) {
			local5 &= Static87.method1966(local11);
		}
		return local5;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Z[BI)Ljava/lang/Object;")
	public static Object method3868(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static102.aBoolean85) {
			try {
				@Pc(23) Class184 local23 = (Class184) Class.forName("Class184_Sub1").getDeclaredConstructor().newInstance();
				local23.method6458(arg0);
				return local23;
			} catch (@Pc(30) Throwable local30) {
				Static102.aBoolean85 = true;
			}
		}
		return arg0;
	}
}
