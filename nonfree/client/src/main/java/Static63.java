import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!ch", name = "c", descriptor = "Lclient!fa;")
	public static Class94 aClass94_2;

	@OriginalMember(owner = "client!ch", name = "j", descriptor = "[I")
	public static final int[] anIntArray158 = new int[13];

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIBI)V")
	public static void method1192(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		@Pc(11) int local11 = arg1 << 3;
		@Pc(15) int local15 = arg0 << 3;
		Static535.aFloat364 = local15;
		Static476.aFloat339 = local11;
		if (Static166.anInt3343 == 2) {
			Static530.anInt8939 = 0;
			Static180.anInt3500 = local15;
			Static141.anInt2910 = local11;
		}
		Static128.method2403();
		Static474.aBoolean196 = true;
	}
}
