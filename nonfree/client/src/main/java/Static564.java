import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static564 {

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "Lclient!mga;")
	public static final Class218 aClass218_131 = new Class218(48, 2);

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "[I")
	public static final int[] anIntArray783 = new int[5];

	@OriginalMember(owner = "client!tb", name = "d", descriptor = "[F")
	public static final float[] aFloatArray76 = new float[16];

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIIIIIZ)V")
	public static void method7999(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static24.aClass3_Sub22_4.aClass6_Sub28_1.method8690() != 0 && arg1 != 0 && Static199.anInt3915 < 50 && arg3 != -1) {
			Static240.aClass182Array1[Static199.anInt3915++] = new Class182((byte) 2, arg3, arg1, arg2, arg0, arg4, arg5, (Class28_Sub1) null);
		}
	}
}
