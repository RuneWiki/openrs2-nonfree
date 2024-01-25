import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static303 {

	@OriginalMember(owner = "client!mn", name = "D", descriptor = "Lclient!mv;")
	public static Class103 aClass103_3;

	@OriginalMember(owner = "client!mn", name = "q", descriptor = "Lclient!sw;")
	public static final Class277 aClass277_43 = new Class277(50);

	@OriginalMember(owner = "client!mn", name = "G", descriptor = "Lclient!ui;")
	public static final Class295 aClass295_33 = new Class295();

	@OriginalMember(owner = "client!mn", name = "J", descriptor = "[I")
	public static final int[] anIntArray457 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "(I)V")
	public static void method5345() {
		for (@Pc(10) Class46_Sub2 local10 = (Class46_Sub2) Static456.aClass184_37.method5139(); local10 != null; local10 = (Class46_Sub2) Static456.aClass184_37.method5139()) {
			Static463.method7056(local10);
		}
		@Pc(35) int local35;
		@Pc(37) int local37;
		if (Static286.aClass1_Sub15_Sub1_1.method6381(Static449.anInt7876)) {
			local35 = 0;
			local37 = 3;
		} else {
			local37 = Static514.anInt9103;
			local35 = Static514.anInt9103;
		}
		Static63.method1582();
		for (@Pc(46) int local46 = local35; local46 <= local37; local46++) {
			Static63.method1570();
			Static63.method1578(local46);
			Static63.method1571(local46);
		}
		Static63.method1587();
		Static63.method1574();
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(BII)Z")
	public static boolean method5348(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method5350(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (!Static278.method4887(arg5)) {
			return;
		}
		if (Static465.aClass91ArrayArray1[arg5] == null) {
			Static63.method1583(Static511.aClass91ArrayArray2[arg5], -1, arg7, arg1, arg6, arg0, arg2, arg8, arg4, arg3);
		} else {
			Static63.method1583(Static465.aClass91ArrayArray1[arg5], -1, arg7, arg1, arg6, arg0, arg2, arg8, arg4, arg3);
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(IZI)Z")
	public static boolean method5351(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x180) != 0;
	}
}
