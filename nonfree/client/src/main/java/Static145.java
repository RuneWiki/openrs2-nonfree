import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!gv", name = "b", descriptor = "Lclient!qu;")
	public static final Class208 aClass208_33 = new Class208(11, 6);

	@OriginalMember(owner = "client!gv", name = "c", descriptor = "Lclient!qu;")
	public static final Class208 aClass208_34 = new Class208(46, 7);

	@OriginalMember(owner = "client!gv", name = "d", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray31 = new String[100];

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(Lclient!jq;B)Z")
	public static boolean method2219(@OriginalArg(0) Interface6 arg0) {
		@Pc(10) Class192 local10 = Static249.aClass39_2.method748(arg0.method5718());
		if (local10.anInt5434 == -1) {
			return true;
		} else {
			@Pc(23) Class112 local23 = Static386.aClass230_7.method5250(local10.anInt5434);
			return local23.anInt2811 == -1 ? true : local23.method2319();
		}
	}
}
