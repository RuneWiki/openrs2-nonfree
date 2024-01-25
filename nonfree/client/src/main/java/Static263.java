import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static263 {

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "[Lclient!u;")
	public static Class13_Sub3_Sub1_Sub1[] aClass13_Sub3_Sub1_Sub1Array1;

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILclient!ea;IBILclient!eo;ILclient!f;)V")
	public static void method3974(@OriginalArg(0) int arg0, @OriginalArg(1) Class32 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class68 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class22 arg6) {
		if (arg6 == null) {
			return;
		}
		@Pc(14) int local14;
		if (Static107.anInt2382 == 4) {
			local14 = (int) Static235.aFloat60 & 0x3FFF;
		} else {
			local14 = (int) Static235.aFloat60 + Static397.anInt6876 & 0x3FFF;
		}
		@Pc(35) int local35 = Math.max(arg4.anInt2178 / 2, arg4.lb / 2) + 10;
		@Pc(43) int local43 = arg2 * arg2 + arg3 * arg3;
		if (local35 * local35 < local43) {
			return;
		}
		@Pc(61) int local61 = Applet_Sub1.anIntArray85[local14];
		@Pc(65) int local65 = Applet_Sub1.anIntArray87[local14];
		if (Static107.anInt2382 != 4) {
			local65 = local65 * 256 / (Static317.anInt5759 + 256);
			local61 = local61 * 256 / (Static317.anInt5759 + 256);
		}
		@Pc(95) int local95 = local61 * arg2 + arg3 * local65 >> 15;
		@Pc(106) int local106 = local65 * arg2 - local61 * arg3 >> 15;
		arg6.method6070(local95 + arg0 + arg4.anInt2178 / 2 - arg6.ja() / 2, arg5 + arg4.lb / 2 + -local106 + -(arg6.JA() / 2), arg1, arg0, arg5);
	}
}
