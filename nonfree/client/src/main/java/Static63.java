import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!ge", name = "v", descriptor = "I")
	public static int anInt1688;

	@OriginalMember(owner = "client!ge", name = "G", descriptor = "Lclient!i;")
	private static Class41 aClass41_529 = Static184.method2923("shake:");

	@OriginalMember(owner = "client!ge", name = "u", descriptor = "Lclient!i;")
	public static Class41 aClass41_523 = aClass41_529;

	@OriginalMember(owner = "client!ge", name = "x", descriptor = "Lclient!i;")
	private static Class41 aClass41_524 = Static184.method2923("Loading interfaces )2 ");

	@OriginalMember(owner = "client!ge", name = "A", descriptor = "Lclient!i;")
	private static Class41 aClass41_527 = Static184.method2923("World");

	@OriginalMember(owner = "client!ge", name = "y", descriptor = "Lclient!i;")
	public static Class41 aClass41_525 = aClass41_527;

	@OriginalMember(owner = "client!ge", name = "z", descriptor = "Lclient!i;")
	public static Class41 aClass41_526 = aClass41_529;

	@OriginalMember(owner = "client!ge", name = "C", descriptor = "I")
	public static int anInt1690 = 0;

	@OriginalMember(owner = "client!ge", name = "E", descriptor = "Lclient!i;")
	public static Class41 aClass41_528 = Static184.method2923("Hier wechseln");

	@OriginalMember(owner = "client!ge", name = "I", descriptor = "Lclient!i;")
	public static Class41 aClass41_531 = aClass41_524;

	@OriginalMember(owner = "client!ge", name = "L", descriptor = "Lclient!i;")
	public static Class41 aClass41_533 = Static184.method2923("Mem:");

	@OriginalMember(owner = "client!ge", name = "M", descriptor = "Lclient!i;")
	public static Class41 aClass41_534 = aClass41_527;

	@OriginalMember(owner = "client!ge", name = "O", descriptor = "I")
	public static int anInt1695 = 0;

	@OriginalMember(owner = "client!ge", name = "Q", descriptor = "Lclient!i;")
	public static Class41 aClass41_535 = Static184.method2923("Registrierter Benutzer");

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IB)Lclient!ng;")
	public static Class2_Sub2_Sub15 method1158(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub2_Sub15 local10 = (Class2_Sub2_Sub15) Static187.aClass43_21.method1464((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(29) byte[] local29 = Static209.aClass15_40.method387(Static114.method1946(arg0), Static123.method798(arg0));
		local10 = new Class2_Sub2_Sub15();
		local10.anInt3100 = arg0;
		if (local29 != null) {
			local10.method2146(new Class2_Sub3(local29));
		}
		local10.method2145();
		if (local10.anInt3117 != -1) {
			local10.method2151(method1158(local10.anInt3097), method1158(local10.anInt3117));
		}
		if (local10.anInt3132 != -1) {
			local10.method2152(method1158(local10.anInt3123), method1158(local10.anInt3132));
		}
		if (!Static127.aBoolean163 && local10.aBoolean179) {
			local10.anInt3094 = 0;
			local10.aClass41Array46 = null;
			local10.aBoolean178 = false;
			local10.aClass41_858 = Static158.aClass41_995;
			local10.aClass41Array47 = null;
		}
		Static187.aClass43_21.method1462((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(BI)I")
	public static int method1159(@OriginalArg(1) int arg0) {
		return arg0 & 0x3FF;
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(Z)V")
	public static void method1160() {
		Static94.aClass43_8.method1469();
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILclient!q;)Z")
	public static boolean method1161(@OriginalArg(1) Class80 arg0) {
		if (Static102.aBoolean133) {
			if (Static70.method1287(arg0) != 0) {
				return false;
			}
			if (arg0.anInt3640 == 0) {
				return false;
			}
		}
		return arg0.aBoolean212;
	}
}
