import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static507 {

	@OriginalMember(owner = "client!tl", name = "M", descriptor = "I")
	public static int anInt8800;

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(BLclient!ls;)V")
	public static void method7107(@OriginalArg(1) Class11_Sub1_Sub1_Sub3 arg0) {
		if (arg0 instanceof Class11_Sub1_Sub1_Sub3_Sub2) {
			@Pc(24) Class11_Sub1_Sub1_Sub3_Sub2 local24 = (Class11_Sub1_Sub1_Sub3_Sub2) arg0;
			if (local24.aClass354_1 != null) {
				Static228.method3397(Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.aByte113 != local24.aByte113, local24);
			}
		} else if (arg0 instanceof Class11_Sub1_Sub1_Sub3_Sub1) {
			@Pc(8) Class11_Sub1_Sub1_Sub3_Sub1 local8 = (Class11_Sub1_Sub1_Sub3_Sub1) arg0;
			Static154.method2539(local8, Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.aByte113 != local8.aByte113);
		}
	}
}
