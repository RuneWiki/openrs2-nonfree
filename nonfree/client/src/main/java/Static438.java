import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static438 {

	@OriginalMember(owner = "client!vv", name = "m", descriptor = "Ljava/lang/Object;")
	public static Object anObject11;

	@OriginalMember(owner = "client!vv", name = "n", descriptor = "I")
	public static int anInt7313;

	@OriginalMember(owner = "client!vv", name = "j", descriptor = "Lclient!dp;")
	public static final Class55 aClass55_143 = new Class55("shake:", "schütteln:", "tremblement:", "tremor:");

	@OriginalMember(owner = "client!vv", name = "b", descriptor = "(III)V")
	public static void method5618(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class7_Sub4_Sub14 local16 = Static54.method750(arg1, 16);
		local16.method4716();
		local16.anInt5868 = arg0;
	}
}
