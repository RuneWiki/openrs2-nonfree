import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static207 {

	@OriginalMember(owner = "client!wf", name = "R", descriptor = "I")
	public static int anInt4425;

	@OriginalMember(owner = "client!wf", name = "r", descriptor = "I")
	public static int anInt4404 = 0;

	@OriginalMember(owner = "client!wf", name = "F", descriptor = "I")
	public static int anInt4415 = 1;

	@OriginalMember(owner = "client!wf", name = "I", descriptor = "I")
	public static int anInt4418 = -1;

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(BI)Lclient!db;")
	public static Class1_Sub2_Sub7 method3284(@OriginalArg(1) int arg0) {
		@Pc(11) Class1_Sub2_Sub7 local11 = (Class1_Sub2_Sub7) Static49.aClass87_23.method3062((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(25) byte[] local25 = Static19.aClass60_3.method2340(arg0, 16);
		local11 = new Class1_Sub2_Sub7();
		if (local25 != null) {
			local11.method640(new Class1_Sub14(local25));
		}
		Static49.aClass87_23.method3068(local11, (long) arg0);
		return local11;
	}
}
