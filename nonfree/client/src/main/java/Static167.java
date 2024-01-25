import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!fb", name = "l", descriptor = "Lclient!wg;")
	public static Class400 aClass400_1;

	@OriginalMember(owner = "client!fb", name = "m", descriptor = "[Lclient!s;")
	public static Class313[] aClass313Array1;

	@OriginalMember(owner = "client!fb", name = "x", descriptor = "[Lclient!vj;")
	public static final Class3_Sub16[] aClass3_Sub16Array3 = new Class3_Sub16[8];

	@OriginalMember(owner = "client!fb", name = "p", descriptor = "[I")
	public static int[] anIntArray153 = new int[2];

	@OriginalMember(owner = "client!fb", name = "n", descriptor = "[F")
	public static final float[] aFloatArray31 = new float[2];

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IBII)V")
	public static void method2671(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class3_Sub4_Sub2 local9 = Static502.method7211(9, (long) arg1);
		local9.method630();
		local9.anInt803 = arg2;
		local9.anInt805 = arg0;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)I")
	public static int method2673(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
