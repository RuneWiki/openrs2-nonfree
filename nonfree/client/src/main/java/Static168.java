import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!kh", name = "q", descriptor = "I")
	public static int anInt3820;

	@OriginalMember(owner = "client!kh", name = "n", descriptor = "I")
	public static int anInt3817 = 0;

	@OriginalMember(owner = "client!kh", name = "r", descriptor = "I")
	public static int anInt3821 = 2;

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lclient!mr;B)V")
	public static void method3342(@OriginalArg(0) Class1_Sub2_Sub3 arg0) {
		if (arg0 instanceof Class1_Sub2_Sub3_Sub2) {
			@Pc(11) Class1_Sub2_Sub3_Sub2 local11 = (Class1_Sub2_Sub3_Sub2) arg0;
			if (local11.aClass139_1 != null) {
				Static226.method4194(local11.aByte77 != Static177.aClass1_Sub2_Sub3_Sub1_1.aByte77, local11);
			}
		} else if (arg0 instanceof Class1_Sub2_Sub3_Sub1) {
			@Pc(33) Class1_Sub2_Sub3_Sub1 local33 = (Class1_Sub2_Sub3_Sub1) arg0;
			Static80.method1629(Static177.aClass1_Sub2_Sub3_Sub1_1.aByte77 != local33.aByte77, local33);
		}
	}
}
