import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "Lclient!bj;")
	public static final Class26 aClass26_29 = new Class26(64);

	@OriginalMember(owner = "client!kg", name = "e", descriptor = "Z")
	public static boolean aBoolean199 = false;

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(III)I")
	public static int method2560(@OriginalArg(0) int arg0) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(16) int local16 = (arg0 & 0x7F) * 96 >> 7;
		if (local16 < 2) {
			local16 = 2;
		} else if (local16 > 126) {
			local16 = 126;
		}
		return local16 + (arg0 & 0xFF80);
	}

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "(I)V")
	public static void method2561() {
		Static213.aClass97Array17 = null;
		Static147.aClass97Array11 = null;
		Static145.aClass97Array10 = null;
		Static342.aClass97Array27 = null;
		Static214.aClass97Array18 = null;
		Static80.aClass97Array24 = null;
		Static106.aClass9_2 = null;
		Static272.aClass97Array22 = null;
		Static342.aClass97Array28 = null;
		Static283.aClass9_3 = null;
		Static30.aClass9_1 = null;
		Static269.aClass97_18 = null;
		Static56.aClass97Array2 = null;
		Static169.aClass97Array26 = null;
		Static247.aClass97Array19 = null;
		Static137.aClass97Array9 = null;
		Static186.aClass97Array15 = null;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(II)Lclient!el;")
	public static Class11_Sub4_Sub5 method2562(@OriginalArg(1) int arg0) {
		@Pc(10) Class11_Sub4_Sub5 local10 = (Class11_Sub4_Sub5) Static86.aClass142_7.method3874((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static208.aClass144_108.method3896(arg0, 5);
		local10 = new Class11_Sub4_Sub5();
		if (local20 != null) {
			local10.method1138(new Class11_Sub25(local20));
		}
		Static86.aClass142_7.method3870(local10, (long) arg0);
		return local10;
	}
}
