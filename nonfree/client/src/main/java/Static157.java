import nativeadvert.browsercontrol;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!oh", name = "C", descriptor = "I")
	public static int anInt3441 = 0;

	@OriginalMember(owner = "client!oh", name = "D", descriptor = "I")
	public static int anInt3442 = 0;

	@OriginalMember(owner = "client!oh", name = "E", descriptor = "Lclient!vb;")
	public static Class120 aClass120_18 = new Class120();

	@OriginalMember(owner = "client!oh", name = "K", descriptor = "Z")
	public static boolean aBoolean305 = false;

	@OriginalMember(owner = "client!oh", name = "N", descriptor = "I")
	public static int anInt3449 = 255;

	@OriginalMember(owner = "client!oh", name = "S", descriptor = "Lclient!sc;")
	private static Class107 aClass107_910 = Static231.method3737("purple:");

	@OriginalMember(owner = "client!oh", name = "P", descriptor = "Lclient!sc;")
	public static Class107 aClass107_909 = aClass107_910;

	@OriginalMember(owner = "client!oh", name = "Q", descriptor = "I")
	public static int anInt3451 = 0;

	@OriginalMember(owner = "client!oh", name = "R", descriptor = "S")
	public static short aShort27 = 205;

	@OriginalMember(owner = "client!oh", name = "T", descriptor = "Lclient!sc;")
	public static Class107 aClass107_911 = Static231.method3737("::qa_op_test");

	@OriginalMember(owner = "client!oh", name = "U", descriptor = "[I")
	public static int[] anIntArray301 = new int[32];

	@OriginalMember(owner = "client!oh", name = "V", descriptor = "[I")
	public static int[] anIntArray302 = new int[4096];

	@OriginalMember(owner = "client!oh", name = "W", descriptor = "Lclient!sc;")
	public static Class107 aClass107_912 = Static231.method3737("<col=ffffff>");

	@OriginalMember(owner = "client!oh", name = "X", descriptor = "[I")
	public static int[] anIntArray303 = new int[50];

	@OriginalMember(owner = "client!oh", name = "Y", descriptor = "Lclient!sc;")
	public static Class107 aClass107_913 = aClass107_910;

	@OriginalMember(owner = "client!oh", name = "c", descriptor = "(I)V")
	public static void method2536() {
		if (browsercontrol.method2357()) {
			browsercontrol.method2359();
		}
		Static60.method1161(Static203.aCanvas3);
		Static97.method1639(Static203.aCanvas3);
		if (Static98.aClass67_1 != null) {
			Static98.aClass67_1.method1970(Static203.aCanvas3);
		}
		Static113.method1961();
		Static108.method1889(Static203.aCanvas3);
		Static160.method2581(Static203.aCanvas3);
		if (Static98.aClass67_1 != null) {
			Static98.aClass67_1.method1969(Static203.aCanvas3);
		}
		Static130.method2171();
		Static105.aLong92 = 0L;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lclient!dg;IZ)V")
	public static void method2537(@OriginalArg(0) Class28_Sub1 arg0, @OriginalArg(1) int arg1) {
		if (Static90.aClass1_Sub26_2 == null) {
			Static160.method2584(true, 255, 0, 255, null, (byte) 0);
			Static214.aClass28_Sub1Array1[arg1] = arg0;
		} else {
			Static90.aClass1_Sub26_2.anInt4021 = arg1 * 8 + 5;
			@Pc(16) int local16 = Static90.aClass1_Sub26_2.method2958();
			@Pc(20) int local20 = Static90.aClass1_Sub26_2.method2958();
			arg0.method850(local16, local20);
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZIBIII)Lclient!tg;")
	public static Class1_Sub2_Sub2 method2538(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(30) int local30 = (arg3 << 19) + (arg1 << 17) + arg4 + (arg0 ? 65536 : 0);
		@Pc(42) long local42 = (long) local30 * 3849834839L + (long) arg2 * 3147483667L;
		@Pc(50) Class1_Sub2_Sub2 local50 = (Class1_Sub2_Sub2) Static58.aClass61_20.method1693(local42);
		if (local50 != null) {
			return local50;
		}
		Static74.aBoolean153 = false;
		local50 = Static43.method860(arg1, arg2, arg4, arg0, false, arg3);
		if (local50 != null && !Static74.aBoolean153) {
			Static58.aClass61_20.method1694(local42, local50);
		}
		return local50;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IB)I")
	public static int method2540(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!oh", name = "c", descriptor = "(B)V")
	public static void method2541() {
		Static21.method396();
		System.gc();
		Static52.method1046(25);
	}
}
