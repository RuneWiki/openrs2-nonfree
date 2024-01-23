import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!e", name = "n", descriptor = "Z")
	public static boolean aBoolean91;

	@OriginalMember(owner = "client!e", name = "p", descriptor = "I")
	public static int anInt1215;

	@OriginalMember(owner = "client!e", name = "b", descriptor = "Z")
	public static boolean aBoolean90 = false;

	@OriginalMember(owner = "client!e", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString60 = "shake:";

	@OriginalMember(owner = "client!e", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString61 = " more options";

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!th;B)V")
	public static void method1046(@OriginalArg(0) Class36_Sub3_Sub2 arg0) {
		@Pc(17) Class2_Sub23 local17 = (Class2_Sub23) Static259.aClass79_21.method2002(Static61.method2447(arg0.aString249));
		if (local17 == null) {
			Static185.method3168(null, arg0.anIntArray465[0], arg0, 0, Static208.anInt4335, null, arg0.anIntArray468[0]);
		} else {
			local17.method3753();
		}
	}
}
