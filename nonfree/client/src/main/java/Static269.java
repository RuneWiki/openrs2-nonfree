import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static269 {

	@OriginalMember(owner = "client!jn", name = "k", descriptor = "Lclient!wc;")
	public static Class47 aClass47_2;

	@OriginalMember(owner = "client!jn", name = "e", descriptor = "Lclient!nk;")
	public static final Class232 aClass232_1 = new Class232();

	@OriginalMember(owner = "client!jn", name = "l", descriptor = "I")
	public static int anInt5798 = 0;

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method4908(@OriginalArg(1) int arg0) {
		@Pc(10) Class3_Sub24 local10 = (Class3_Sub24) Static493.aClass307_47.method7424((long) arg0);
		if (local10 != null) {
			@Pc(17) Class3_Sub10_Sub1 local17 = local10.aClass187_Sub1_1.method5773();
			if (local17 != null) {
				@Pc(24) double local24 = local10.aClass187_Sub1_1.method5775();
				if (local24 >= (double) local17.method776() && local24 <= (double) local17.method777()) {
					return local17.method774();
				}
			}
		}
		return null;
	}
}
