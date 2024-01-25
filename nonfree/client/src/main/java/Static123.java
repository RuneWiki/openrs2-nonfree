import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!eaa", name = "c", descriptor = "Z")
	public static boolean aBoolean167 = false;

	@OriginalMember(owner = "client!eaa", name = "e", descriptor = "Lclient!vba;")
	public static final Class366 aClass366_2 = new Class366();

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(BLclient!ofa;)V")
	public static void method1841(@OriginalArg(1) Class265 arg0) {
		if (arg0.anInt6967 == 5 && arg0.anInt7005 != -1) {
			Static206.method3084(arg0, Static119.aClass95_4);
		}
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(Lclient!r;III[Z)V")
	public static void method1842(@OriginalArg(0) Class3_Sub5_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static582.aClass35Array3 == Static368.aClass35Array1) {
			return;
		}
		@Pc(10) int local10 = Static556.aClass35Array2[arg1].method7452(arg2, arg3);
		for (@Pc(12) int local12 = 0; local12 <= arg1; local12++) {
			if (arg4 == null || arg4[local12]) {
				@Pc(23) Class35 local23 = Static556.aClass35Array2[local12];
				if (local23 != null) {
					local23.wa(arg0, arg2, local10 - local23.method7452(arg2, arg3), arg3, 0, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(B)V")
	public static void method1844() {
		Static375.aClass295_50.method6474();
	}
}
