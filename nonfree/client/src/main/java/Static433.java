import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static433 {

	@OriginalMember(owner = "client!ph", name = "S", descriptor = "I")
	public static int anInt7555 = -1;

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lclient!ob;Lclient!ob;Z)V")
	public static void method6593(@OriginalArg(0) Class3_Sub7 arg0, @OriginalArg(1) Class3_Sub7 arg1) {
		if (arg0.aClass3_Sub7_64 != null) {
			arg0.method7907();
		}
		arg0.aClass3_Sub7_64 = arg1.aClass3_Sub7_64;
		arg0.aClass3_Sub7_63 = arg1;
		arg0.aClass3_Sub7_64.aClass3_Sub7_63 = arg0;
		arg0.aClass3_Sub7_63.aClass3_Sub7_64 = arg0;
	}
}
