import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static201 {

	@OriginalMember(owner = "client!js", name = "H", descriptor = "Lclient!gb;")
	public static Class88 aClass88_5;

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(Lclient!jk;I)Lclient!jk;")
	public static Class124 method2866(@OriginalArg(0) Class124 arg0) {
		@Pc(13) Class124 local13 = Static55.method977(arg0);
		if (local13 == null) {
			local13 = arg0.aClass124_3;
		}
		return local13;
	}

	@OriginalMember(owner = "client!js", name = "g", descriptor = "(I)V")
	public static void method2867() {
		if (Static50.aBoolean95) {
			return;
		}
		Static135.method2073(Static7.aClass169ArrayArrayArray1);
		if (Static145.aClass169ArrayArrayArray4 != null) {
			Static135.method2073(Static145.aClass169ArrayArrayArray4);
		}
		Static50.aBoolean95 = true;
	}
}
