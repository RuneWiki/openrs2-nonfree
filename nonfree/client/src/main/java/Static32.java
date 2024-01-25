import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static32 {

	@OriginalMember(owner = "client!br", name = "t", descriptor = "I")
	public static int anInt2224;

	@OriginalMember(owner = "client!br", name = "s", descriptor = "Lclient!ss;")
	public static Applet_Sub1 anApplet_Sub1_3 = null;

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IIILclient!qo;Lclient!qo;)V")
	public static void method1928(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class17_Sub3 arg3, @OriginalArg(4) Class17_Sub3 arg4) {
		if (Static77.aClass194ArrayArrayArray1[arg0][arg1][arg2] == null) {
			Static269.method4738(arg0, arg1, arg2);
		}
		Static77.aClass194ArrayArrayArray1[arg0][arg1][arg2].aClass17_Sub3_1 = arg3;
		Static77.aClass194ArrayArrayArray1[arg0][arg1][arg2].aClass17_Sub3_2 = arg4;
	}
}
