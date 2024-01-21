import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!sa", name = "q", descriptor = "Lclient!pb;")
	public static Class14 aClass14_1;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "Lclient!je;")
	public static Class40 aClass40_1336 = Static69.method1231("::errortest");

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "I")
	public static int anInt2504 = 0;

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "I")
	public static int anInt2505 = -1;

	@OriginalMember(owner = "client!sa", name = "e", descriptor = "[I")
	public static int[] anIntArray283 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!sa", name = "f", descriptor = "Lclient!je;")
	private static Class40 aClass40_1337 = Static69.method1231(" has logged out)3");

	@OriginalMember(owner = "client!sa", name = "i", descriptor = "[I")
	public static int[] anIntArray284 = new int[500];

	@OriginalMember(owner = "client!sa", name = "k", descriptor = "Lclient!je;")
	public static Class40 aClass40_1338 = aClass40_1337;

	@OriginalMember(owner = "client!sa", name = "l", descriptor = "Lclient!lc;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!sa", name = "m", descriptor = "Lclient!je;")
	public static Class40 aClass40_1339 = Static69.method1231("<col=ffff00>*V");

	@OriginalMember(owner = "client!sa", name = "o", descriptor = "I")
	public static int anInt2510 = 0;

	@OriginalMember(owner = "client!sa", name = "p", descriptor = "I")
	public static int anInt2511 = 0;

	@OriginalMember(owner = "client!sa", name = "r", descriptor = "Lclient!je;")
	public static Class40 aClass40_1340 = Static69.method1231("<)4col>");

	@OriginalMember(owner = "client!sa", name = "s", descriptor = "Lclient!je;")
	public static Class40 aClass40_1341 = Static69.method1231("<br>");

	@OriginalMember(owner = "client!sa", name = "t", descriptor = "I")
	public static int anInt2512 = 1;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V")
	public static void method1816() {
		aClass40_1338 = null;
		aClass40_1337 = null;
		aClass40_1341 = null;
		aClass40_1339 = null;
		aClass40_1336 = null;
		anIntArray284 = null;
		anIntArray283 = null;
		aClass14_1 = null;
		aClass40_1340 = null;
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(I)V")
	public static void method1817() {
		if (Static49.aClass10_1 != null) {
			@Pc(11) Class10 local11 = Static49.aClass10_1;
			synchronized (Static49.aClass10_1) {
				Static49.aClass10_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(I[B)[B")
	public static byte[] method1818(@OriginalArg(1) byte[] arg0) {
		@Pc(16) Class2_Sub9 local16 = new Class2_Sub9(arg0);
		@Pc(20) int local20 = local16.method640();
		@Pc(24) int local24 = local16.method622();
		if (local24 < 0 || Static94.anInt2401 != 0 && Static94.anInt2401 < local24) {
			throw new RuntimeException();
		} else if (local20 == 0) {
			@Pc(95) byte[] local95 = new byte[local24];
			local16.method643(local95, local24);
			return local95;
		} else {
			@Pc(50) int local50 = local16.method622();
			if (local50 < 0 || Static94.anInt2401 != 0 && local50 > Static94.anInt2401) {
				throw new RuntimeException();
			}
			@Pc(71) byte[] local71 = new byte[local50];
			if (local20 == 1) {
				Static89.method1604(local71, local50, arg0, local24);
			} else {
				Static84.aClass49_1.method1146(local71, local16);
			}
			return local71;
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(III)I")
	public static int method1819(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 >>> 31;
		return (arg0 + local10) / arg1 - local10;
	}
}
