import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!og", name = "a", descriptor = "I")
	public static int anInt3384 = 0;

	@OriginalMember(owner = "client!og", name = "j", descriptor = "Lclient!rf;")
	private static Class70 aClass70_1148 = Static49.method1293("Try again in 60 secs)3)3)3");

	@OriginalMember(owner = "client!og", name = "c", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1144 = aClass70_1148;

	@OriginalMember(owner = "client!og", name = "d", descriptor = "Lclient!rf;")
	private static Class70 aClass70_1145 = Static49.method1293("Loaded update list");

	@OriginalMember(owner = "client!og", name = "e", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1146 = aClass70_1145;

	@OriginalMember(owner = "client!og", name = "i", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1147 = Static49.method1293(" )2> <col=ffff00>");

	@OriginalMember(owner = "client!og", name = "k", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1149 = Static49.method1293("Ihr Spielkonto wurde deaktiviert)3");

	@OriginalMember(owner = "client!og", name = "p", descriptor = "[I")
	public static int[] anIntArray327 = new int[128];

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(ILclient!fa;I)Lclient!rf;")
	public static Class70 method2533(@OriginalArg(1) Class1_Sub9 arg0) {
		try {
			@Pc(12) Class70 local12 = new Class70();
			local12.anInt3915 = arg0.method1244();
			if (local12.anInt3915 > 32767) {
				local12.anInt3915 = 32767;
			}
			local12.aByteArray46 = new byte[local12.anInt3915];
			arg0.anInt1592 += Static114.aClass71_1.method3045(arg0.aByteArray25, 0, arg0.anInt1592, local12.aByteArray46, local12.anInt3915);
			return local12;
		} catch (@Pc(53) Exception local53) {
			return Static93.aClass70_891;
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Z)V")
	public static void method2534() {
		if (Static147.anIntArray366 != null && Static185.anIntArray441 != null) {
			return;
		}
		Static185.anIntArray441 = new int[256];
		Static147.anIntArray366 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < 256; local13++) {
			@Pc(22) double local22 = (double) local13 / 255.0D * 6.283185307179586D;
			Static147.anIntArray366[local13] = (int) (Math.sin(local22) * 4096.0D);
			Static185.anIntArray441[local13] = (int) (Math.cos(local22) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(I)V")
	public static void method2535() {
		Static92.aClass25_15.method1300();
		Static174.aClass25_28.method1300();
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(Z)V")
	public static void method2536() {
		aClass70_1145 = null;
		aClass70_1149 = null;
		aClass70_1144 = null;
		aClass70_1147 = null;
		aClass70_1148 = null;
		anIntArray327 = null;
		aClass70_1146 = null;
	}
}
