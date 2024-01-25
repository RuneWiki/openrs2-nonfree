import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static628 {

	@OriginalMember(owner = "client!vea", name = "c", descriptor = "Lclient!el;")
	public static final Class109 aClass109_214 = new Class109(71, -1);

	@OriginalMember(owner = "client!vea", name = "e", descriptor = "Z")
	public static final boolean aBoolean762 = false;

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(IB)V")
	public static void method8778(@OriginalArg(0) int arg0) {
		Static652.anInt10539 = -1;
		Static448.anInt7716 = arg0;
		Static652.anInt10539 = -1;
		Static122.method1709();
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(Lclient!df;ZZ)V")
	public static void method8779(@OriginalArg(0) Class8_Sub1 arg0, @OriginalArg(2) boolean arg1) {
		arg0.aBoolean769 = arg1;
		if (Static218.aBoolean283) {
			Static333.aClass95Array1[Static333.aClass95Array1.length - 1].method1678(arg0);
		} else {
			Static525.method8041(arg0, Static253.aClass5_Sub43Array2);
		}
	}
}
