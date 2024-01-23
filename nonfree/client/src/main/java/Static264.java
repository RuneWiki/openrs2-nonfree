import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static264 {

	@OriginalMember(owner = "client!wj", name = "e", descriptor = "Lclient!hc;")
	public static Class51 aClass51_88;

	@OriginalMember(owner = "client!wj", name = "k", descriptor = "I")
	public static int anInt5542;

	@OriginalMember(owner = "client!wj", name = "d", descriptor = "Lclient!lc;")
	public static Class79 aClass79_39 = new Class79(64);

	@OriginalMember(owner = "client!wj", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString391 = "Loading fonts - ";

	@OriginalMember(owner = "client!wj", name = "j", descriptor = "I")
	public static int anInt5541 = -1;

	@OriginalMember(owner = "client!wj", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString392 = "scroll:";

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)V")
	public static void method4209() {
		if (Static81.anInt2186 == 0) {
			return;
		}
		try {
			if (++Static92.anInt2554 > 1500) {
				if (Static34.aClass109_2 != null) {
					Static34.aClass109_2.method3141();
					Static34.aClass109_2 = null;
				}
				if (Static83.anInt2241 >= 1) {
					Static81.anInt2186 = 0;
					Static169.anInt3963 = -5;
					return;
				}
				Static83.anInt2241++;
				if (Static191.anInt4270 == Static11.anInt494) {
					Static191.anInt4270 = Static115.anInt3010;
				} else {
					Static191.anInt4270 = Static11.anInt494;
				}
				Static92.anInt2554 = 0;
				Static81.anInt2186 = 1;
			}
			if (Static81.anInt2186 == 1) {
				Static152.aClass145_6 = Static38.aClass28_1.method718(Static191.anInt4270, Static183.aString371);
				Static81.anInt2186 = 2;
			}
			@Pc(125) int local125;
			if (Static81.anInt2186 == 2) {
				if (Static152.aClass145_6.anInt5354 == 2) {
					throw new IOException();
				}
				if (Static152.aClass145_6.anInt5354 != 1) {
					return;
				}
				Static34.aClass109_2 = new Class109((Socket) Static152.aClass145_6.anObject7, Static38.aClass28_1);
				Static152.aClass145_6 = null;
				Static34.aClass109_2.method3150(Static171.aClass1_Sub13_Sub1_3.aByteArray29, Static171.aClass1_Sub13_Sub1_3.anInt2395);
				if (Static90.aClass55_1 != null) {
					Static90.aClass55_1.method3217();
				}
				if (Static239.aClass55_2 != null) {
					Static239.aClass55_2.method3217();
				}
				local125 = Static34.aClass109_2.method3142();
				if (Static90.aClass55_1 != null) {
					Static90.aClass55_1.method3217();
				}
				if (Static239.aClass55_2 != null) {
					Static239.aClass55_2.method3217();
				}
				if (local125 != 101) {
					Static81.anInt2186 = 0;
					Static169.anInt3963 = local125;
					Static34.aClass109_2.method3141();
					Static34.aClass109_2 = null;
					return;
				}
				Static81.anInt2186 = 3;
			}
			if (Static81.anInt2186 == 3 && Static34.aClass109_2.method3143() >= 2) {
				local125 = Static34.aClass109_2.method3142() << 8 | Static34.aClass109_2.method3142();
				Static66.method1298(local125);
				if (Static136.anInt3373 == -1) {
					Static81.anInt2186 = 0;
					Static169.anInt3963 = 6;
					Static34.aClass109_2.method3141();
					Static34.aClass109_2 = null;
				} else {
					Static81.anInt2186 = 0;
					Static34.aClass109_2.method3141();
					Static34.aClass109_2 = null;
					Static131.method691();
				}
			}
		} catch (@Pc(210) IOException local210) {
			if (Static34.aClass109_2 != null) {
				Static34.aClass109_2.method3141();
				Static34.aClass109_2 = null;
			}
			if (Static83.anInt2241 >= 1) {
				Static169.anInt3963 = -4;
				Static81.anInt2186 = 0;
			} else {
				Static92.anInt2554 = 0;
				Static83.anInt2241++;
				Static81.anInt2186 = 1;
				if (Static11.anInt494 == Static191.anInt4270) {
					Static191.anInt4270 = Static115.anInt3010;
				} else {
					Static191.anInt4270 = Static11.anInt494;
				}
			}
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(III)V")
	public static void method4210(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) Class1_Sub2_Sub18 local4 = Static13.method232(arg0, 1);
		local4.method3810();
		local4.anInt5009 = arg1;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(II)I")
	public static int method4211(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x7F;
	}

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "(II)I")
	public static int method4212(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!wj", name = "c", descriptor = "(II)Lclient!pj;")
	public static Class107 method4214(@OriginalArg(1) int arg0) {
		@Pc(10) Class107 local10 = (Class107) Static57.aClass79_6.method2483((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static255.aClass51_82.method1874(29, arg0);
		local10 = new Class107();
		if (local20 != null) {
			local10.method3137(arg0, new Class1_Sub13(local20));
		}
		Static57.aClass79_6.method2486(local10, (long) arg0);
		return local10;
	}
}
