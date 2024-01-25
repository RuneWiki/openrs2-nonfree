import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static425 {

	@OriginalMember(owner = "client!oaa", name = "c", descriptor = "Z")
	public static boolean aBoolean508;

	// $FF: synthetic field
	@OriginalMember(owner = "client!oaa", name = "b", descriptor = "Ljava/lang/Class;")
	private static Class aClass40;

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public static boolean method6393(@OriginalArg(0) String arg0) {
		return Static93.method1577(arg0, aClass40 == null ? (aClass40 = Class261.a("rn")) : aClass40);
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IIIIIB)V")
	public static void method6394(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(10) int local10 = arg3 - arg0;
		@Pc(15) int local15 = arg2 - arg4;
		if (local15 == 0) {
			if (local10 != 0) {
				Static332.method5146(arg1, arg3, arg0, arg4);
			}
		} else if (local10 == 0) {
			Static507.method7599(arg0, arg2, arg4, arg1);
		} else {
			if (local15 < 0) {
				local15 = -local15;
			}
			if (local10 < 0) {
				local10 = -local10;
			}
			@Pc(68) boolean local68 = local15 < local10;
			@Pc(72) int local72;
			@Pc(74) int local74;
			if (local68) {
				local72 = arg4;
				local74 = arg2;
				arg4 = arg0;
				arg0 = local72;
				arg2 = arg3;
				arg3 = local74;
			}
			if (arg2 < arg4) {
				local72 = arg4;
				local74 = arg0;
				arg4 = arg2;
				arg2 = local72;
				arg0 = arg3;
				arg3 = local74;
			}
			local72 = arg0;
			local74 = arg2 - arg4;
			@Pc(108) int local108 = arg3 - arg0;
			@Pc(113) int local113 = -(local74 >> 1);
			if (local108 < 0) {
				local108 = -local108;
			}
			@Pc(131) int local131 = arg3 > arg0 ? 1 : -1;
			@Pc(135) int local135;
			if (local68) {
				for (local135 = arg4; local135 <= arg2; local135++) {
					local113 += local108;
					Static144.anIntArrayArray30[local135][local72] = arg1;
					if (local113 > 0) {
						local113 -= local74;
						local72 += local131;
					}
				}
			} else {
				for (local135 = arg4; local135 <= arg2; local135++) {
					local113 += local108;
					Static144.anIntArrayArray30[local72][local135] = arg1;
					if (local113 > 0) {
						local113 -= local74;
						local72 += local131;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Lclient!qd;I)V")
	public static void method6395(@OriginalArg(0) Class296 arg0) {
		Static234.aClass296_1 = arg0;
	}
}
