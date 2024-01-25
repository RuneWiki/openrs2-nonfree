import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static245 {

	@OriginalMember(owner = "client!mi", name = "d", descriptor = "I")
	public static int anInt4499;

	@OriginalMember(owner = "client!mi", name = "c", descriptor = "I")
	public static int anInt4498 = -60;

	@OriginalMember(owner = "client!mi", name = "f", descriptor = "I")
	public static int anInt4501 = 0;

	@OriginalMember(owner = "client!mi", name = "l", descriptor = "F")
	public static float aFloat66 = 0.0F;

	@OriginalMember(owner = "client!mi", name = "r", descriptor = "Ljava/lang/Boolean;")
	public static Boolean aBoolean306 = Boolean.FALSE;

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(ZB)V")
	public static void method3716(@OriginalArg(0) boolean arg0) {
		for (@Pc(10) Class1_Sub35 local10 = (Class1_Sub35) Static298.aClass181_57.method4112(); local10 != null; local10 = (Class1_Sub35) Static298.aClass181_57.method4104()) {
			if (local10.aClass1_Sub19_Sub1_3 != null) {
				Static59.aClass1_Sub19_Sub2_1.method2185(local10.aClass1_Sub19_Sub1_3);
				local10.aClass1_Sub19_Sub1_3 = null;
			}
			if (local10.aClass1_Sub19_Sub1_4 != null) {
				Static59.aClass1_Sub19_Sub2_1.method2185(local10.aClass1_Sub19_Sub1_4);
				local10.aClass1_Sub19_Sub1_4 = null;
			}
			local10.method6020();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(54) Class1_Sub35 local54 = (Class1_Sub35) Static77.aClass181_15.method4112(); local54 != null; local54 = (Class1_Sub35) Static77.aClass181_15.method4104()) {
			if (local54.aClass1_Sub19_Sub1_3 != null) {
				Static59.aClass1_Sub19_Sub2_1.method2185(local54.aClass1_Sub19_Sub1_3);
				local54.aClass1_Sub19_Sub1_3 = null;
			}
			local54.method6020();
		}
		for (@Pc(80) Class1_Sub35 local80 = (Class1_Sub35) Static348.aClass96_36.method2342(); local80 != null; local80 = (Class1_Sub35) Static348.aClass96_36.method2339()) {
			if (local80.aClass1_Sub19_Sub1_3 != null) {
				Static59.aClass1_Sub19_Sub2_1.method2185(local80.aClass1_Sub19_Sub1_3);
				local80.aClass1_Sub19_Sub1_3 = null;
			}
			local80.method6020();
		}
	}
}
