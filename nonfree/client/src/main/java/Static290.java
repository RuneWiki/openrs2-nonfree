import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static290 {

	@OriginalMember(owner = "client!ok", name = "i", descriptor = "Lclient!hi;")
	public static Class100 aClass100_1;

	@OriginalMember(owner = "client!ok", name = "e", descriptor = "I")
	public static final int anInt5241 = 2;

	@OriginalMember(owner = "client!ok", name = "g", descriptor = "Lclient!rn;")
	public static final Class217 aClass217_81 = new Class217(75, 3);

	@OriginalMember(owner = "client!ok", name = "h", descriptor = "[I")
	public static final int[] anIntArray353 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(ILclient!ea;Lclient!mq;IIILclient!f;I)V")
	public static void method4095(@OriginalArg(0) int arg0, @OriginalArg(1) Class58 arg1, @OriginalArg(2) Class156 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class8 arg5, @OriginalArg(7) int arg6) {
		if (arg5 == null) {
			return;
		}
		@Pc(24) int local24;
		if (Static161.anInt3316 == 4) {
			local24 = (int) Static252.aFloat47 & 0x3FFF;
		} else {
			local24 = (int) Static252.aFloat47 + Static20.anInt696 & 0x3FFF;
		}
		@Pc(42) int local42 = Math.max(arg2.anInt4853 / 2, arg2.anInt4823 / 2) + 10;
		@Pc(50) int local50 = arg3 * arg3 + arg6 * arg6;
		if (local42 * local42 < local50) {
			return;
		}
		@Pc(60) int local60 = Class3_Sub2_Sub17.anIntArray289[local24];
		@Pc(64) int local64 = Class3_Sub2_Sub17.anIntArray290[local24];
		if (Static161.anInt3316 != 4) {
			local64 = local64 * 256 / (Static341.anInt5790 + 256);
			local60 = local60 * 256 / (Static341.anInt5790 + 256);
		}
		@Pc(95) int local95 = local64 * arg3 + local60 * arg6 >> 15;
		@Pc(106) int local106 = local64 * arg6 - arg3 * local60 >> 15;
		arg5.method6002(local95 + arg0 + arg2.anInt4853 / 2 - arg5.ja() / 2, arg4 + arg2.anInt4823 / 2 + (-local106 - arg5.JA() / 2), arg1, arg0, arg4);
	}
}
