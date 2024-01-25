import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!am", name = "a", descriptor = "Z")
	public static boolean aBoolean28 = false;

	@OriginalMember(owner = "client!am", name = "b", descriptor = "I")
	public static int anInt266 = 0;

	@OriginalMember(owner = "client!am", name = "e", descriptor = "Lclient!aw;")
	public static final Class17 aClass17_1 = new Class17(128);

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(BI)Z")
	public static boolean method204(@OriginalArg(1) int arg0) {
		return arg0 == 2 || arg0 == 3;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(BLclient!jk;)V")
	public static void method205(@OriginalArg(1) Class124 arg0) {
		@Pc(7) Class124 local7 = Static365.method4856(arg0);
		@Pc(20) int local20;
		@Pc(17) int local17;
		if (local7 == null) {
			local20 = Static69.anInt1304;
			local17 = Static338.anInt5777;
		} else {
			local17 = local7.anInt3356;
			local20 = local7.anInt3376;
		}
		Static3.method4551(false, arg0, local17, local20);
		Static365.method4858(arg0, local20, local17);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(II)Lclient!ka;")
	public static Class129 method207(@OriginalArg(1) int arg0) {
		@Pc(13) Class129[] local13 = Static356.method4809();
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			@Pc(21) Class129 local21 = local13[local15];
			if (arg0 == local21.anInt3566) {
				return local21;
			}
		}
		return null;
	}
}
