import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!gga", name = "G", descriptor = "Lclient!mh;")
	public static final Class225 aClass225_10 = new Class225(8, 1);

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "([BIB)[B")
	public static byte[] method2238(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		@Pc(6) byte[] local6 = new byte[arg1];
		Static598.method4261(arg0, 0, local6, 0, arg1);
		return local6;
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(IIZII)Lclient!nc;")
	public static Class2_Sub33 method2239(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) Class2_Sub33 local7 = new Class2_Sub33();
		local7.anInt5985 = arg2;
		local7.anInt5981 = arg3;
		Static346.aClass90_17.method1684(local7, (long) arg0);
		Static136.method1875(arg3);
		@Pc(28) Class273 local28 = Static594.method7731(arg0);
		if (local28 != null) {
			Static155.method2111(local28);
		}
		if (Static396.aClass273_10 != null) {
			Static155.method2111(Static396.aClass273_10);
			Static396.aClass273_10 = null;
		}
		Static297.method4281();
		if (local28 != null) {
			Static576.method7471(!arg1, local28);
		}
		if (!arg1) {
			Static566.method7401(arg3);
		}
		if (!arg1 && Static122.anInt2094 != -1) {
			Static134.method1813(1, Static122.anInt2094);
		}
		return local7;
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(III)V")
	public static void method2240(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class2_Sub2_Sub18 local8 = Static508.method6607(arg0, 6);
		local8.method6227();
		local8.anInt7701 = arg1;
	}

	@OriginalMember(owner = "client!gga", name = "b", descriptor = "(III)Z")
	public static boolean method2241(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x40000) != 0 | Static220.method2684(arg0, arg1) || Static582.method7550(arg0, arg1);
	}
}
