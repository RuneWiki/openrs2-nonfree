import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static545 {

	@OriginalMember(owner = "client!sg", name = "h", descriptor = "Lclient!mc;")
	public static Class225 aClass225_3;

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "Lclient!sg;")
	public static final Class329 aClass329_1 = new Class329();

	@OriginalMember(owner = "client!sg", name = "e", descriptor = "Lclient!sg;")
	public static final Class329 aClass329_2 = new Class329();

	@OriginalMember(owner = "client!sg", name = "f", descriptor = "Lclient!sg;")
	public static final Class329 aClass329_3 = new Class329();

	@OriginalMember(owner = "client!sg", name = "g", descriptor = "Lclient!sg;")
	public static final Class329 aClass329_4 = new Class329();

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lclient!r;III[Z)V")
	public static void method7262(@OriginalArg(0) Class4_Sub5_Sub9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static140.aClass42Array4 == Static146.aClass42Array3) {
			return;
		}
		@Pc(10) int local10 = Static655.aClass42Array5[arg1].method7453(arg2, arg3);
		for (@Pc(12) int local12 = 0; local12 <= arg1; local12++) {
			if (arg4 == null || arg4[local12]) {
				@Pc(23) Class42 local23 = Static655.aClass42Array5[local12];
				if (local23 != null) {
					local23.wa(arg0, arg2, local10 - local23.method7453(arg2, arg3), arg3, 0, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V")
	public static void method7263() {
		Static44.aClass352_3.method7659();
		Static499.aClass352_55.method7659();
		Class3_Sub1_Sub2_Sub4.lb.method7659();
		Static356.aClass352_46.method7659();
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILclient!es;)Lclient!lca;")
	public static Class71_Sub3 method7265(@OriginalArg(1) Class4_Sub11 arg0) {
		return new Class71_Sub3(arg0.method8834(), arg0.method8834(), arg0.method8834(), arg0.method8834(), arg0.method8827(), arg0.method8827(), arg0.method8865());
	}
}
