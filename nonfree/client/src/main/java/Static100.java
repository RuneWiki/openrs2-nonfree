import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!fi", name = "nb", descriptor = "I")
	public static int anInt2240;

	@OriginalMember(owner = "client!fi", name = "s", descriptor = "Lclient!vf;")
	public static Class238 aClass238_7 = new Class238();

	@OriginalMember(owner = "client!fi", name = "Gb", descriptor = "Z")
	public static boolean aBoolean164 = false;

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "(I)V")
	public static void method1768() {
		if (Static9.aBoolean23) {
			return;
		}
		Static221.aBoolean480 = true;
		Static9.aBoolean23 = true;
		if (Static260.aBoolean369) {
			Static323.aFloat71 = (int) Static323.aFloat71 + 47 & 0xFFFFFFF0;
		} else {
			Static106.aFloat8 += (12.0F - Static106.aFloat8) / 2.0F;
		}
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(IIII)I")
	public static int method1780(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg2 & 0x3;
		if (local7 == 0) {
			return arg0;
		} else if (local7 == 1) {
			return 1023 - arg1;
		} else if (local7 == 2) {
			return 1023 - arg0;
		} else {
			return arg1;
		}
	}
}
