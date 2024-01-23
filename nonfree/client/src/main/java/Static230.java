import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static230 {

	@OriginalMember(owner = "client!qm", name = "e", descriptor = "I")
	public static int anInt4401;

	@OriginalMember(owner = "client!qm", name = "h", descriptor = "I")
	public static int anInt4404;

	@OriginalMember(owner = "client!qm", name = "l", descriptor = "[[B")
	public static byte[][] aByteArrayArray36;

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "I")
	public static int anInt4398 = 1;

	@OriginalMember(owner = "client!qm", name = "c", descriptor = "I")
	public static int anInt4399 = 1;

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lclient!wf;IIIIIII)V")
	public static void method3656(@OriginalArg(0) Class189 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(18) int local18 = arg3 * arg3 + arg5 * arg5;
		if (arg1 < local18) {
			return;
		}
		@Pc(37) int local37 = Math.min(arg0.anInt5897 / 2, arg0.anInt5953 / 2);
		if (local18 <= local37 * local37) {
			Static34.method525(arg2, arg0, arg4, arg5, arg3, Static40.aClass4_Sub3_Sub14Array3[arg6]);
			return;
		}
		local37 -= 10;
		@Pc(50) int local50 = Static269.anInt3585 + (int) Static202.aFloat97 & 0x7FF;
		@Pc(54) int local54 = Class111.anIntArray298[local50];
		@Pc(62) int local62 = local54 * 256 / (Static250.anInt4762 + 256);
		@Pc(66) int local66 = Class111.anIntArray299[local50];
		@Pc(74) int local74 = local66 * 256 / (Static250.anInt4762 + 256);
		@Pc(85) int local85 = local62 * arg3 - arg5 * local74 >> 16;
		@Pc(95) int local95 = arg5 * local62 + local74 * arg3 >> 16;
		@Pc(101) double local101 = Math.atan2((double) local95, (double) local85);
		@Pc(108) int local108 = (int) ((double) local37 * Math.sin(local101));
		@Pc(115) int local115 = (int) ((double) local37 * Math.cos(local101));
		if (Static94.aBoolean138) {
			((Class4_Sub3_Sub14_Sub2) Static52.aClass4_Sub3_Sub14Array9[arg6]).method4557((arg2 + arg0.anInt5897 / 2 + local108) * 16, (arg4 + arg0.anInt5953 / 2 - local115) * 16, (int) (local101 * 10430.378D));
		} else {
			((Class4_Sub3_Sub14_Sub1) Static52.aClass4_Sub3_Sub14Array9[arg6]).method2174(arg2 + arg0.anInt5897 / 2 + local108 - 10, -local115 + arg0.anInt5953 / 2 + arg4 + -10, local101);
		}
	}
}
