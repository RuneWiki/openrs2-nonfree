import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(Lclient!qo;IIILclient!qo;IIIII)V")
	public static void method3097(@OriginalArg(0) Class60_Sub1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class60_Sub1_Sub1_Sub3 arg3, @OriginalArg(5) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		@Pc(9) int local9 = arg3.method4430();
		if (local9 == -1) {
			return;
		}
		@Pc(23) Class49 local23 = (Class49) Static488.aClass359_54.method8517((long) local9);
		if (local23 == null) {
			@Pc(30) Class64[] local30 = Static691.method1239(Static583.aClass223_113, local9);
			if (local30 == null) {
				return;
			}
			local23 = Static202.aClass75_5.method6714(local30[0], true);
			Static488.aClass359_54.method8515((long) local9, local23);
		}
		Static155.method3086(arg0.aByte135, arg4 >> 1, arg0.anInt9048, 0, arg0.anInt9057, arg0.method4424((byte) -28) * 256, arg6 >> 1);
		@Pc(79) int local79 = Static609.anIntArray627[0] + arg2 - 18;
		@Pc(87) int local87 = local79 + arg1 / 4 * 18;
		@Pc(97) int local97 = Static609.anIntArray627[1] + arg5 - 16 - 54;
		@Pc(105) int local105 = local97 + arg1 % 4 * 18;
		local23.method8997(local87, local105);
		if (arg3 == arg0) {
			Static202.aClass75_5.method6718(18, local105 - 1, -256, 18, local87 - 1);
		}
		Static494.method3707(local105 - 1, local87 + -1, local105 + 18, local87 - -18);
		@Pc(143) Class60_Sub6 local143 = Static70.method929();
		local143.anInt5749 = local105;
		local143.anInt5746 = local87;
		local143.anInt5748 = local87 + 16;
		local143.aClass60_Sub1_Sub1_Sub3_1 = arg3;
		local143.anInt5747 = local105 + 16;
		Static219.aClass385_2.method8779(local143);
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(ILclient!jc;I)V")
	public static void method3098(@OriginalArg(1) Class6_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (Static370.aClass130_4 == null) {
			return;
		}
		try {
			Static370.aClass130_4.method3465(0L);
			Static370.aClass130_4.method3456(arg0.aByteArray20, arg1, 24);
		} catch (@Pc(23) Exception local23) {
		}
	}
}
