import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static625 {

	@OriginalMember(owner = "client!wda", name = "c", descriptor = "I")
	public static int anInt10331;

	@OriginalMember(owner = "client!wda", name = "g", descriptor = "I")
	public static int anInt10332;

	@OriginalMember(owner = "client!wda", name = "e", descriptor = "Lclient!dt;")
	public static final Class70 aClass70_3 = new Class70(false);

	@OriginalMember(owner = "client!wda", name = "b", descriptor = "Lclient!dt;")
	public static Class70 aClass70_2 = aClass70_3;

	@OriginalMember(owner = "client!wda", name = "d", descriptor = "[F")
	public static final float[] aFloatArray77 = new float[4];

	@OriginalMember(owner = "client!wda", name = "f", descriptor = "Lclient!us;")
	public static final Class344 aClass344_124 = new Class344(71, -1);

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(IIILclient!gaa;IBLclient!aa;Lclient!ac;)V")
	public static void method8489(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class108 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) Class5 arg6) {
		if (arg6 == null) {
			return;
		}
		@Pc(23) int local23;
		if (Static516.anInt9019 == 4) {
			local23 = (int) Static502.aFloat230 & 0x3FFF;
		} else {
			local23 = Static30.anInt575 + (int) Static502.aFloat230 & 0x3FFF;
		}
		@Pc(42) int local42 = Math.max(arg3.anInt4067 / 2, arg3.anInt4037 / 2) + 10;
		@Pc(50) int local50 = arg4 * arg4 + arg1 * arg1;
		if (local50 > local42 * local42) {
			return;
		}
		@Pc(60) int local60 = Class3_Sub1_Sub2.anIntArray84[local23];
		@Pc(64) int local64 = Class3_Sub1_Sub2.anIntArray85[local23];
		if (Static516.anInt9019 != 4) {
			local64 = local64 * 256 / (Static127.anInt3186 + 256);
			local60 = local60 * 256 / (Static127.anInt3186 + 256);
		}
		@Pc(95) int local95 = local64 * arg1 + arg4 * local60 >> 14;
		@Pc(106) int local106 = local64 * arg4 - local60 * arg1 >> 14;
		arg6.method7583(arg3.anInt4067 / 2 + arg0 + local95 - arg6.method7589() / 2, -local106 + arg2 - (-(arg3.anInt4037 / 2) - -(arg6.method7585() / 2)), arg5, arg0, arg2);
	}
}
