import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!eca", name = "f", descriptor = "Lclient!sb;")
	public static final Class303 aClass303_32 = new Class303(49, 2);

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(ZLclient!wn;)V")
	public static void method1961(@OriginalArg(1) Class41_Sub2_Sub1_Sub4_Sub2 arg0) {
		@Pc(17) Class3_Sub18 local17 = (Class3_Sub18) Static173.aClass354_14.method7689((long) arg0.anInt9472);
		if (local17 == null) {
			Static145.method2803(null, null, 0, arg0.anIntArray629[0], arg0.aByte117, arg0, arg0.anIntArray628[0]);
		} else {
			local17.method3023();
		}
	}
}
