import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static347 {

	@OriginalMember(owner = "client!mga", name = "b", descriptor = "I")
	public static int anInt5452;

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(Lclient!kp;Z)V")
	public static void method4642(@OriginalArg(0) Class2_Sub2_Sub12 arg0) {
		arg0.method8271();
		@Pc(10) boolean local10 = false;
		for (@Pc(15) Class2_Sub2_Sub12 local15 = (Class2_Sub2_Sub12) Static453.aClass75_10.method1573(); local15 != null; local15 = (Class2_Sub2_Sub12) Static453.aClass75_10.method1568()) {
			if (Static214.method2961(local15.method4159(), arg0.method4159())) {
				local10 = true;
				Static262.method4769(arg0, local15);
				break;
			}
		}
		if (!local10) {
			Static453.aClass75_10.method1572(arg0);
		}
	}
}
