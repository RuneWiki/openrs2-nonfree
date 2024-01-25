import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static417 {

	@OriginalMember(owner = "client!mo", name = "C", descriptor = "I")
	public static int anInt8530;

	@OriginalMember(owner = "client!mo", name = "t", descriptor = "Lclient!as;")
	public static Class24 aClass24_2 = new Class24();

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method7297(@OriginalArg(0) String arg0) {
		if (arg0.equals("")) {
			return;
		}
		@Pc(16) Class292 local16 = Static631.method8307();
		@Pc(22) Class3_Sub29 local22 = Static507.method6901(Static610.aClass144_72, local16.aClass88_2);
		local22.aClass3_Sub2_Sub1_1.method2065(Static63.method1479(arg0));
		local22.aClass3_Sub2_Sub1_1.method2073(arg0);
		local16.method6855(local22);
	}
}
