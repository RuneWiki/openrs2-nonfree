import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!fe", name = "p", descriptor = "I")
	public static int anInt2968;

	@OriginalMember(owner = "client!fe", name = "g", descriptor = "Lclient!lc;")
	public static final Class200 aClass200_29 = new Class200(47, 2);

	@OriginalMember(owner = "client!fe", name = "r", descriptor = "Lclient!lc;")
	public static final Class200 aClass200_30 = new Class200(96, -2);

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(ILclient!qk;)V")
	public static void method2733(@OriginalArg(1) Class279 arg0) {
		@Pc(7) Class279 local7 = Static329.method5388(arg0);
		@Pc(15) int local15;
		@Pc(17) int local17;
		if (local7 == null) {
			local15 = Static109.anInt2357;
			local17 = Static330.anInt6165;
		} else {
			local17 = local7.anInt8141;
			local15 = local7.anInt8153;
		}
		Static452.method2910(arg0, local15, local17, false);
		Static180.method3117(arg0, local17, local15);
	}
}
