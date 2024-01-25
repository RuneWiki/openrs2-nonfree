import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static469 {

	@OriginalMember(owner = "client!qba", name = "c", descriptor = "Lclient!qk;")
	public static final Class289 aClass289_117 = new Class289(75, 6);

	@OriginalMember(owner = "client!qba", name = "i", descriptor = "I")
	public static int anInt8087 = 0;

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(III)I")
	public static int method6918(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(46) int local46 = Static254.method3659(arg1 - 1, arg0 - 1) + Static254.method3659(arg1 + 1, arg0 + -1) + Static254.method3659(arg1 + -1, arg0 + 1) + Static254.method3659(arg1 + 1, arg0 + 1);
		@Pc(77) int local77 = Static254.method3659(arg1 - 1, arg0) + Static254.method3659(arg1 + 1, arg0) + Static254.method3659(arg1, arg0 + -1) + Static254.method3659(arg1, arg0 - -1);
		@Pc(82) int local82 = Static254.method3659(arg1, arg0);
		return local82 / 4 + local46 / 16 + local77 / 8;
	}
}
