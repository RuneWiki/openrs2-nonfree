import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!eja", name = "R", descriptor = "I")
	public static int anInt2134;

	@OriginalMember(owner = "client!eja", name = "Z", descriptor = "[I")
	public static final int[] anIntArray136 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!eja", name = "a", descriptor = "(Lclient!qga;IIB)V")
	public static void method2054(@OriginalArg(0) Class299 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == null) {
			return;
		}
		if (arg0.anObjectArray22 != null) {
			@Pc(14) Class14_Sub10 local14 = new Class14_Sub10();
			local14.anObjectArray1 = arg0.anObjectArray22;
			local14.aClass299_2 = arg0;
			Static672.method9304(local14);
		}
		Static546.aBoolean727 = true;
		Static365.anInt6221 = arg1;
		Static217.anInt4240 = arg0.anInt8572;
		Static613.anInt10111 = arg0.anInt8526;
		Static578.anInt9567 = arg0.anInt8621;
		Static655.anInt10731 = arg2;
		Static573.anInt9481 = arg0.anInt8550;
		Static254.anInt4789 = arg0.anInt8590;
		Static538.method7933(arg0);
	}

	@OriginalMember(owner = "client!eja", name = "c", descriptor = "(B)V")
	public static void method2056() {
		Static493.aClass317_55.method7873();
	}
}
