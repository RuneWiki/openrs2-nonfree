import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static199 {

	@OriginalMember(owner = "client!ve", name = "F", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!ve", name = "U", descriptor = "[Lclient!vc;")
	public static Class98[] aClass98Array2;

	@OriginalMember(owner = "client!ve", name = "j", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_860 = Static81.method1507(" <col=ffff00>");

	@OriginalMember(owner = "client!ve", name = "t", descriptor = "I")
	public static int anInt2884 = 0;

	@OriginalMember(owner = "client!ve", name = "W", descriptor = "J")
	public static long aLong92 = 0L;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IB)Lclient!dj;")
	public static Class24 method2198(@OriginalArg(0) int arg0) {
		@Pc(17) Class24 local17 = Static175.method3020(arg0);
		for (@Pc(23) int local23 = local17.method781() - 3; local23 > 0; local23 -= 3) {
			local17 = Static63.method1281(new Class24[] { local17.method759(local23, 0), Static180.aClass24_1163, local17.method773(local23) });
		}
		if (local17.method781() > 9) {
			return Static63.method1281(new Class24[] { Static91.aClass24_627, local17.method759(local17.method781() - 8, 0), Static101.aClass24_676, Static131.aClass24_883, local17, Static145.aClass24_960 });
		} else if (local17.method781() > 6) {
			return Static63.method1281(new Class24[] { Static120.aClass24_786, local17.method759(local17.method781() - 4, 0), Static74.aClass24_544, Static131.aClass24_883, local17, Static145.aClass24_960 });
		} else {
			return Static63.method1281(new Class24[] { aClass24_860, local17, Static40.aClass24_250 });
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILclient!vc;)V")
	public static void method2199(@OriginalArg(1) Class98 arg0) {
		if (Static142.anInt3161 == arg0.anInt4414) {
			Static62.aBooleanArray7[arg0.anInt4416] = true;
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIIIIB)V")
	public static void method2224(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (Static63.anInt1608 <= arg4 && Static63.anInt1595 >= arg0 && Static13.anInt308 <= arg5 && Static52.anInt1338 >= arg3) {
			if (arg1 == 1) {
				Static149.method2567(arg4, arg2, arg5, arg3, arg0);
			} else {
				Static179.method3054(arg2, arg3, arg1, arg4, arg0, arg5);
			}
		} else if (arg1 == 1) {
			Static192.method3306(arg0, arg5, arg2, arg3, arg4);
		} else {
			Static129.method2156(arg5, arg3, arg4, arg1, arg2, arg0);
		}
	}
}
