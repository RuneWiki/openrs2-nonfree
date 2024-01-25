import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static437 {

	@OriginalMember(owner = "client!ow", name = "h", descriptor = "I")
	public static int anInt7720;

	@OriginalMember(owner = "client!ow", name = "m", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!ow", name = "d", descriptor = "Lclient!ke;")
	public static final Class196 aClass196_237 = new Class196(106, -2);

	@OriginalMember(owner = "client!ow", name = "i", descriptor = "[J")
	public static final long[] aLongArray18 = new long[32];

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(I)V")
	public static void method6550() {
		if (Static16.anInt9847 == 5) {
			Static16.anInt9847 = 6;
		}
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(BIII)V")
	public static void method6554(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == 1004) {
			Static497.method7212(Static183.aClass209_4, arg2, arg1);
		} else if (arg0 == 1008) {
			Static497.method7212(Static320.aClass209_13, arg2, arg1);
		} else if (arg0 == 1003) {
			Static497.method7212(Static483.aClass209_12, arg2, arg1);
		} else if (arg0 == 1006) {
			Static497.method7212(Static138.aClass209_2, arg2, arg1);
		} else if (arg0 == 1011) {
			Static497.method7212(Static340.aClass209_7, arg2, arg1);
		}
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(Lclient!cb;BII)Lclient!hm;")
	public static Class156 method6555(@OriginalArg(0) Class50 arg0, @OriginalArg(2) int arg1) {
		@Pc(9) byte[] local9 = arg0.method916(0, arg1);
		return local9 == null ? null : new Class156(local9);
	}
}
