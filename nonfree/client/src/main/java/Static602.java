import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static602 {

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "I")
	public static int anInt9965;

	@OriginalMember(owner = "client!vd", name = "d", descriptor = "[I")
	public static int[] anIntArray703;

	@OriginalMember(owner = "client!vd", name = "g", descriptor = "D")
	public static double aDouble23;

	@OriginalMember(owner = "client!vd", name = "j", descriptor = "I")
	public static int anInt9969;

	@OriginalMember(owner = "client!vd", name = "f", descriptor = "I")
	public static final int anInt9967 = 4;

	@OriginalMember(owner = "client!vd", name = "h", descriptor = "[F")
	public static final float[] aFloatArray102 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIIILclient!bi;)Lclient!baa;")
	public static Class10_Sub2_Sub1 method8470(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class13_Sub2 arg4) {
		if (arg4.aBoolean93 || Static608.method8539(arg3) && Static608.method8539(arg0)) {
			return new Class10_Sub2_Sub1(arg4, 3553, arg2, arg1, arg3, arg0, true);
		} else if (arg4.aBoolean95) {
			return new Class10_Sub2_Sub1(arg4, 34037, arg2, arg1, arg3, arg0, true);
		} else {
			return new Class10_Sub2_Sub1(arg4, arg2, arg1, arg3, arg0, Static613.method8565(arg3), Static613.method8565(arg0), true);
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IZIII)Lclient!kp;")
	public static Class2_Sub28 method8473(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class2_Sub28 local12 = new Class2_Sub28();
		local12.anInt5454 = arg2;
		local12.anInt5452 = arg3;
		Static22.aClass323_4.method7477(local12, (long) arg0);
		Static138.method2521(arg2);
		@Pc(31) Class303 local31 = Static43.method1101(arg0);
		if (local31 != null) {
			Static514.method7103(local31);
		}
		if (Static381.aClass303_23 != null) {
			Static514.method7103(Static381.aClass303_23);
			Static381.aClass303_23 = null;
		}
		Static449.method6409();
		if (local31 != null) {
			Static103.method1958(local31, !arg1);
		}
		if (!arg1) {
			Static156.method2736(arg2);
		}
		if (!arg1 && Static592.anInt9857 != -1) {
			Static593.method8369(1, Static592.anInt9857);
		}
		return local12;
	}
}
