import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!ee", name = "x", descriptor = "I")
	public static int anInt1731;

	@OriginalMember(owner = "client!ee", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString126 = "Loading defaults - ";

	@OriginalMember(owner = "client!ee", name = "v", descriptor = "Z")
	public static boolean aBoolean128 = true;

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IILclient!bi;)I")
	public static int method1374(@OriginalArg(0) int arg0, @OriginalArg(2) Class26 arg1) {
		if (!Static45.method1034(arg1).method3755(arg0) && arg1.anObjectArray20 == null) {
			return -1;
		} else if (arg1.anIntArray73 == null || arg1.anIntArray73.length <= arg0) {
			return -1;
		} else {
			return arg1.anIntArray73[arg0];
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!rk;I)V")
	public static void method1375(@OriginalArg(0) Class180 arg0) {
		Static152.aClass180_40 = arg0;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(BLclient!bi;Z)V")
	public static void method1378(@OriginalArg(1) Class26 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(12) int local12 = arg0.anInt506 == 0 ? arg0.anInt523 : arg0.anInt506;
		@Pc(21) int local21 = arg0.anInt548 == 0 ? arg0.anInt515 : arg0.anInt548;
		Static237.method4093(local12, local21, arg0.anInt492, Static298.aClass26ArrayArray1[arg0.anInt492 >> 16], arg1);
		if (arg0.aClass26Array1 != null) {
			Static237.method4093(local12, local21, arg0.anInt492, arg0.aClass26Array1, arg1);
		}
		@Pc(61) Class7_Sub17 local61 = (Class7_Sub17) Static247.aClass10_40.method163((long) arg0.anInt492);
		if (local61 != null) {
			Static85.method1787(arg1, local12, local61.anInt3252, local21);
		}
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(Z)V")
	public static void method1380() {
		Static82.method1759(25);
		Static280.method4175();
		System.gc();
	}
}
