import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static436 {

	@OriginalMember(owner = "client!w", name = "J", descriptor = "Lclient!sl;")
	public static final Class215 aClass215_95 = new Class215(46, 8);

	@OriginalMember(owner = "client!w", name = "N", descriptor = "Z")
	public static boolean aBoolean666 = false;

	@OriginalMember(owner = "client!w", name = "Q", descriptor = "Lclient!fa;")
	public static final Class68 aClass68_53 = new Class68(64);

	@OriginalMember(owner = "client!w", name = "R", descriptor = "Z")
	public static boolean aBoolean667 = false;

	@OriginalMember(owner = "client!w", name = "S", descriptor = "Z")
	public static boolean aBoolean668 = false;

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(ZLjava/lang/String;Lclient!la;I)V")
	public static void method5519(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class46 arg2) {
		@Pc(21) int local21 = Static34.aClass89_1.method2349(arg1, 250, null);
		@Pc(30) int local30 = Static34.aClass89_1.method2347(null, 250, arg1) * 13;
		Static122.aClass19_16.O(6, 6, local21 + 8, local30 + 4 + 4, -16777216, 0);
		Static122.aClass19_16.method4312(6, 6, local21 + 8, 4 + 4 + local30, -1, 0);
		arg2.method5063(-1, 0, null, 0, null, 10, 10, local30, local21, -1, 1, arg1, null);
		Static302.method4103(6, local30 + 4 + 4, local21 + 4 + 4, 6);
		if (arg0) {
			Static122.aClass19_16.method4247();
		}
	}

	@OriginalMember(owner = "client!w", name = "f", descriptor = "(I)V")
	public static void method5520() {
		Static187.method2932(25);
		Static67.method1277();
		System.gc();
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(CZ)Z")
	public static boolean method5521(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}
}
