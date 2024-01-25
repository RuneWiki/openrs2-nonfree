import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static273 {

	@OriginalMember(owner = "client!ns", name = "f", descriptor = "Lclient!tk;")
	public static Class243 aClass243_1;

	@OriginalMember(owner = "client!ns", name = "h", descriptor = "Lclient!qt;")
	public static final Class212 aClass212_69 = new Class212(59, 11);

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(IB)Lclient!qe;")
	public static Class203 method4373(@OriginalArg(0) int arg0) {
		@Pc(18) Class203 local18 = (Class203) Static9.aClass83_3.method2338((long) arg0);
		if (local18 != null) {
			return local18;
		}
		@Pc(28) byte[] local28 = Static49.aClass38_11.method1039(arg0, 0);
		local18 = new Class203();
		if (local28 != null) {
			local18.method4868(arg0, new Class4_Sub20(local28));
		}
		Static9.aClass83_3.method2337(local18, (long) arg0);
		return local18;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(ILclient!tf;)V")
	public static void method4374(@OriginalArg(1) Class240 arg0) {
		if (arg0.anInt6840 == Static52.anInt1250) {
			Static353.aBooleanArray124[arg0.anInt6843] = true;
		}
	}
}
