import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!oc", name = "o", descriptor = "Lclient!wd;")
	public static Class97 aClass97_10;

	@OriginalMember(owner = "client!oc", name = "h", descriptor = "I")
	public static int anInt3193 = 0;

	@OriginalMember(owner = "client!oc", name = "K", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1805 = Static118.method2249(" )2>");

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILclient!wd;B)Lclient!oc;")
	public static Class65 method2451(@OriginalArg(0) int arg0, @OriginalArg(1) Class97 arg1) {
		if (!Static101.method1915(Static153.method2677(arg1), arg0) && arg1.anObjectArray22 == null) {
			return null;
		} else if (arg1.aClass65Array66 == null || arg1.aClass65Array66.length <= arg0 || arg1.aClass65Array66[arg0] == null || arg1.aClass65Array66[arg0].method2466().method2482() == 0) {
			return Static8.aBoolean9 ? Static109.method2004(new Class65[] { Static101.aClass65_1501, Static118.method2250(arg0) }) : null;
		} else {
			return arg1.aClass65Array66[arg0];
		}
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(B)V")
	public static void method2457() {
		Static52.aClass87_27.method3061();
		Static134.aClass67_7.method2568();
		Static189.aClass67_9.method2568();
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(IB)Z")
	public static boolean method2479(@OriginalArg(0) int arg0) {
		return (arg0 >> 29 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(III)Lclient!gh;")
	public static Class33 method2492(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub7 local7 = Static83.aClass1_Sub7ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass33_1 == null ? null : local7.aClass33_1;
	}
}
