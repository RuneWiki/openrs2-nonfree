import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!gf", name = "f", descriptor = "I")
	public static int anInt1332;

	@OriginalMember(owner = "client!gf", name = "v", descriptor = "I")
	public static int anInt1340;

	@OriginalMember(owner = "client!gf", name = "j", descriptor = "Lclient!ad;")
	public static Class4 aClass4_3 = new Class4(64);

	@OriginalMember(owner = "client!gf", name = "s", descriptor = "Lclient!hh;")
	public static Class50 aClass50_483 = Static186.method3527("::fps ");

	@OriginalMember(owner = "client!gf", name = "w", descriptor = "Lclient!hh;")
	public static Class50 aClass50_484 = Static186.method3527("Fallen lassen");

	@OriginalMember(owner = "client!gf", name = "x", descriptor = "Lclient!hh;")
	public static Class50 aClass50_485 = Static186.method3527("Spieler kann nicht gefunden werden: ");

	@OriginalMember(owner = "client!gf", name = "y", descriptor = "Lclient!hh;")
	public static Class50 aClass50_486 = Static186.method3527("p12_full");

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILclient!pa;)V")
	public static void method1019(@OriginalArg(1) Class86 arg0) {
		if (Static83.aBoolean101) {
			return;
		}
		Static29.method421();
		Static224.aClass1_Sub1_Sub8_2 = Static146.method2474(Static153.anInt3179, arg0);
		Static224.aClass1_Sub1_Sub8_2.method2424(-95, 0);
		Static24.aClass78_1 = Static9.method151(arg0, Static73.anInt3190);
		Static24.aClass78_1.method3017(382 - Static24.aClass78_1.anInt3817 / 2, 18);
		Static83.aBoolean101 = true;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIIBI)V")
	public static void method1020(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == arg4) {
			Static62.method942(arg3, arg4, arg2, arg1);
		} else if (Static131.anInt2713 <= arg2 - arg4 && arg4 + arg2 <= Static135.anInt2790 && arg3 - arg0 >= Static49.anInt1030 && arg3 + arg0 <= Static177.anInt3701) {
			Static61.method920(arg2, arg3, arg4, arg1, arg0);
		} else {
			Static69.method1011(arg2, arg0, arg3, arg4, arg1);
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(III)I")
	public static int method1025(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return arg1;
		} else {
			arg1 = (arg0 & 0x7F) * arg1 >> 7;
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return arg1 + (arg0 & 0xFF80);
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(BLclient!qh;Z)V")
	public static void method1029(@OriginalArg(1) Class93 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(15) int local15 = arg0.anInt3628 == 0 ? arg0.anInt3600 : arg0.anInt3628;
		@Pc(24) int local24 = arg0.anInt3587 == 0 ? arg0.anInt3620 : arg0.anInt3587;
		Static175.method2902(local15, Static54.aClass93ArrayArray1[arg0.anInt3603 >> 16], arg1, arg0.anInt3603, local24);
		if (arg0.aClass93Array1 != null) {
			Static175.method2902(local15, arg0.aClass93Array1, arg1, arg0.anInt3603, local24);
		}
		@Pc(65) Class1_Sub13 local65 = (Class1_Sub13) Static157.aClass90_19.method2819((long) arg0.anInt3603);
		if (local65 != null) {
			Static230.method2572(local65.anInt1588, arg1, local24, local15);
		}
	}
}
