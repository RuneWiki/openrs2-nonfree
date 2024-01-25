import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
	public static int anInt5784;

	@OriginalMember(owner = "client!cd", name = "f", descriptor = "Lclient!tq;")
	public static Class239 aClass239_13 = null;

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "(IIII)I")
	public static int method4880(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return 7 - arg0;
		} else if (local3 == 2) {
			return 7 - arg1;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!lt;Lclient!qq;ILclient!lt;)V")
	public static void method4884(@OriginalArg(0) Class158 arg0, @OriginalArg(1) Class28 arg1, @OriginalArg(3) Class158 arg2) {
		Static358.aClass201_7 = Static150.method2471(arg0, Static77.anInt1540);
		Static120.aClass92_3 = arg1.method3476(Static358.aClass201_7, Static455.method1708(arg2, Static77.anInt1540));
		Static196.aClass201_4 = Static150.method2471(arg0, Static429.anInt7139);
		Static60.aClass92_2 = arg1.method3476(Static196.aClass201_4, Static455.method1708(arg2, Static429.anInt7139));
		Static252.aClass201_5 = Static150.method2471(arg0, Static137.anInt2448);
		Static45.aClass92_1 = arg1.method3476(Static252.aClass201_5, Static455.method1708(arg2, Static137.anInt2448));
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method4906(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = Static198.method3145(arg0.charAt(local12)) + (local10 << 5) - local10;
		}
		return local10;
	}
}
