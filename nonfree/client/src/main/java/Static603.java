import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static603 {

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "Lclient!gj;")
	public static Class143 aClass143_132;

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(BII)V")
	public static void method8017(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static545.anInt8892 == 1) {
			Static182.method2995(Static32.aClass3_Sub6_Sub16_1, arg1, arg0);
		} else if (Static545.anInt8892 == 2) {
			if (Static649.aBoolean735) {
				Static5.method55(Static359.method5380() + arg1, arg0 + Static265.method7952());
			} else {
				Static5.method55(arg1, arg0);
			}
		}
		Static32.aClass3_Sub6_Sub16_1 = null;
		Static545.anInt8892 = 0;
	}
}
