import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(Lclient!mr;I)V", line = 31)
	public static void method1583(@OriginalArg(0) Class11_Sub5_Sub2 arg0) {
		if (arg0 instanceof Class11_Sub5_Sub2_Sub2) {
			@Pc(5) Class11_Sub5_Sub2_Sub2 local5 = (Class11_Sub5_Sub2_Sub2) arg0;
			if (local5.aClass71_1 != null) {
				Static224.method4192(local5, local5.aByte78 != Static17.aClass11_Sub5_Sub2_Sub1_3.aByte78);
			}
		} else if (arg0 instanceof Class11_Sub5_Sub2_Sub1) {
			@Pc(27) Class11_Sub5_Sub2_Sub1 local27 = (Class11_Sub5_Sub2_Sub1) arg0;
			Static172.method3398(Static17.aClass11_Sub5_Sub2_Sub1_3.aByte78 != local27.aByte78, local27);
		}
	}
}
