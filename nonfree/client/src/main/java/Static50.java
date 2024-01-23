import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!di", name = "a", descriptor = "I")
	public static int anInt534 = 0;

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(Lclient!lc;ZLclient!lc;)V")
	public static void method442(@OriginalArg(0) Class98 arg0, @OriginalArg(2) Class98 arg1) {
		@Pc(6) int local6 = (int) (Math.random() * 21.0D) - 10;
		@Pc(13) int local13 = (int) (Math.random() * 21.0D) - 10;
		Static63.aClass98_35 = arg1;
		Static22.aClass98_10 = arg0;
		@Pc(28) int local28 = (int) (Math.random() * 21.0D) - 10;
		@Pc(39) int local39 = (int) (Math.random() * 41.0D) - 20;
		Static63.aClass98_35.method2394(34);
		Static22.anInt425 = local13 + local39;
		Static170.anInt3384 = local28 + local39;
		Static151.anInt3051 = local39 + local6;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(BC)C")
	public static char method443(@OriginalArg(1) char arg0) {
		return arg0 == 'µ' || arg0 == 'ƒ' ? arg0 : Character.toTitleCase(arg0);
	}
}
