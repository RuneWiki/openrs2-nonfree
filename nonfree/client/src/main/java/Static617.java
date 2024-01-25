import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static617 {

	@OriginalMember(owner = "client!uu", name = "c", descriptor = "Lclient!ha;")
	public static Class57 aClass57_14;

	@OriginalMember(owner = "client!uu", name = "g", descriptor = "I")
	public static int anInt10169;

	@OriginalMember(owner = "client!uu", name = "e", descriptor = "[I")
	public static int[] anIntArray562;

	@OriginalMember(owner = "client!uu", name = "b", descriptor = "Lclient!up;")
	public static final Class357 aClass357_7 = new Class357();

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(ZI)Z")
	public static boolean method8747(@OriginalArg(1) int arg0) {
		return arg0 == 1 || arg0 == 3 || arg0 == 5;
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(ILclient!ib;)Lclient!bc;")
	public static Class31 method8748(@OriginalArg(1) Class5_Sub23 arg0) {
		@Pc(10) Class219 local10 = Static67.method1093()[arg0.method8529()];
		@Pc(17) Class368 local17 = Static290.method4382()[arg0.method8529()];
		@Pc(21) int local21 = arg0.method8516();
		@Pc(33) int local33 = arg0.method8516();
		@Pc(37) int local37 = arg0.method8519();
		@Pc(41) int local41 = arg0.method8519();
		@Pc(45) int local45 = arg0.method8516();
		@Pc(49) int local49 = arg0.method8527();
		@Pc(53) int local53 = arg0.method8527();
		return new Class31(local10, local17, local21, local33, local37, local41, local45, local49, local53);
	}
}
