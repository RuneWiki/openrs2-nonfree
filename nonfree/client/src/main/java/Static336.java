import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static336 {

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "Lclient!lea;")
	public static Class2_Sub3_Sub1_Sub2_Sub2 aClass2_Sub3_Sub1_Sub2_Sub2_2;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!kha;II)Lclient!ac;")
	public static Class5 method3828(@OriginalArg(0) Class181 arg0, @OriginalArg(1) int arg1) {
		@Pc(10) Class5 local10 = (Class5) Static547.aClass112_49.method3640((long) arg1);
		if (local10 == null) {
			if (Static1.aBoolean870) {
				local10 = Static47.aClass33_3.method6161(Static649.method605(arg0, arg1), true);
			} else {
				local10 = Static366.method1891(arg0.method5049(arg1));
			}
			Static547.aClass112_49.method3636((long) arg1, local10);
		}
		return local10;
	}
}
