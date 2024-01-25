import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static704 {

	@OriginalMember(owner = "client!wea", name = "l", descriptor = "Lclient!av;")
	public static Class20 aClass20_19 = null;

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(IBI)V")
	public static void method9195(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class3_Sub4_Sub2 local16 = Static502.method7211(5, (long) arg0);
		local16.method630();
		local16.anInt803 = arg1;
	}
}
