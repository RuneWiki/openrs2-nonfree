import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static357 {

	@OriginalMember(owner = "client!mt", name = "f", descriptor = "I")
	public static int anInt7109 = -1;

	@OriginalMember(owner = "client!mt", name = "h", descriptor = "Lclient!mu;")
	public static final Class215 aClass215_144 = new Class215(8, -2);

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(IIIIIIB)I")
	public static int method6060(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = arg5 & 0x3;
		if ((arg2 & 0x1) == 1) {
			@Pc(16) int local16 = arg3;
			arg3 = arg1;
			arg1 = local16;
		}
		if (local3 == 0) {
			return arg4;
		} else if (local3 == 1) {
			return 7 + 1 - arg0 - arg3;
		} else if (local3 == 2) {
			return 7 + 1 - arg4 - arg1;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(Lclient!at;I)V")
	public static void method6063(@OriginalArg(0) Class24 arg0) {
		@Pc(15) Class24 local15 = Static524.method8704(arg0);
		@Pc(23) int local23;
		@Pc(20) int local20;
		if (local15 == null) {
			local20 = Static423.anInt7984;
			local23 = Static81.anInt2497;
		} else {
			local20 = local15.anInt488;
			local23 = local15.anInt441;
		}
		Static164.method3542(local23, arg0, false, local20);
		Static49.method1753(local23, local20, arg0);
	}
}
