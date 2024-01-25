import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static310 {

	@OriginalMember(owner = "client!le", name = "m", descriptor = "Lclient!taa;")
	public static final Class314 aClass314_2 = new Class314(0);

	@OriginalMember(owner = "client!le", name = "w", descriptor = "[I")
	public static final int[] anIntArray357 = new int[14];

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(ILclient!vd;ZIIII)V")
	public static void method5221(@OriginalArg(0) int arg0, @OriginalArg(1) Class353 arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		if (arg0 <= 0) {
			Static61.method1084(arg2, arg1, arg3);
			return;
		}
		Static142.anInt2680 = arg2;
		Static95.aBoolean128 = false;
		Static602.anInt10026 = 1;
		Static592.anInt9875 = arg3;
		Static498.aClass6_Sub3_Sub4_3 = null;
		Static182.anInt3750 = 0;
		Static479.aClass353_88 = arg1;
		Static112.anInt2206 = Static224.aClass6_Sub3_Sub4_1.method4736() / arg0;
		if (Static112.anInt2206 < 1) {
			Static112.anInt2206 = 1;
		}
	}
}
