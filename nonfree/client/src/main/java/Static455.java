import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static455 {

	@OriginalMember(owner = "client!wk", name = "sd", descriptor = "Lclient!j;")
	public static Class114 aClass114_3;

	@OriginalMember(owner = "client!wk", name = "vd", descriptor = "I")
	public static int anInt7684;

	@OriginalMember(owner = "client!wk", name = "ed", descriptor = "I")
	public static int anInt7670 = -1;

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(ZII)V")
	public static void method6216(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class3_Sub32 local12 = Static457.method6232(arg0, arg1);
		if (local12 != null) {
			local12.method6288();
		}
	}
}
