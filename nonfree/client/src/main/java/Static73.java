import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!ci", name = "k", descriptor = "I")
	public static int anInt9420;

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IILclient!ha;III)V")
	public static void method8010(@OriginalArg(0) int arg0, @OriginalArg(2) Class13 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		arg1.KA(arg2, arg4, arg2 + arg3, arg4 + arg0);
		arg1.method8164(-16777216, arg0, arg2, arg3, arg4);
		if (Static60.anInt1449 < 100) {
			return;
		}
		@Pc(39) float local39 = (float) Static371.anInt9382 / (float) Static371.anInt9390;
		@Pc(41) int local41 = arg3;
		@Pc(43) int local43 = arg0;
		if (local39 < 1.0F) {
			local43 = (int) (local39 * (float) arg3);
		} else {
			local41 = (int) ((float) arg0 / local39);
		}
		@Pc(70) int local70 = arg4 + (arg0 - local43) / 2;
		@Pc(78) int local78 = arg2 + (arg3 - local41) / 2;
		if (Static432.aClass31_24 == null || arg3 != Static432.aClass31_24.method8801() || arg0 != Static432.aClass31_24.method8789()) {
			Static371.method7977(Static371.anInt9384, Static371.anInt9385 + Static371.anInt9382, Static371.anInt9390 + Static371.anInt9384, Static371.anInt9385, local78, local70, local41 + local78, local70 - -local43);
			Static371.method7972(arg1);
			Static432.aClass31_24 = arg1.method8153(local78, local70, local41, local43, false);
		}
		Static432.aClass31_24.method8793(local78, local70);
		@Pc(130) int local130 = Static388.anInt6681 * local41 / Static371.anInt9390;
		@Pc(136) int local136 = local43 * Static318.anInt5613 / Static371.anInt9382;
		@Pc(145) int local145 = local78 + Static92.anInt2246 * local41 / Static371.anInt9390;
		@Pc(159) int local159 = local43 + local70 - local136 - Static646.anInt10428 * local43 / Static371.anInt9382;
		@Pc(161) int local161 = -1996554240;
		if (Static112.aClass17_3 == Static51.aClass17_2) {
			local161 = -1996488705;
		}
		arg1.aa(local145, local159, local130, local136, local161, 1);
		arg1.method8104(local145, local159, local130, local136, local161, 0);
		if (Static648.anInt10477 <= 0) {
			return;
		}
		@Pc(194) int local194;
		if (Static14.anInt274 <= 50) {
			local194 = Static14.anInt274 * 5;
		} else {
			local194 = 500 - Static14.anInt274 * 5;
		}
		for (@Pc(207) Class2_Sub13 local207 = (Class2_Sub13) Static371.aClass114_54.method2772(); local207 != null; local207 = (Class2_Sub13) Static371.aClass114_54.method2762()) {
			@Pc(215) Class353 local215 = Static371.aClass336_4.method7855(local207.anInt2179);
			if (Static500.method6946(local215)) {
				@Pc(235) int local235;
				@Pc(247) int local247;
				if (Static286.anInt5207 == local207.anInt2179) {
					local235 = local78 + local41 * local207.anInt2183 / Static371.anInt9390;
					local247 = local70 + (Static371.anInt9382 - local207.anInt2178) * local43 / Static371.anInt9382;
					arg1.method8164(local194 << 24 | 0xFFFF00, 4, local235 - 2, 4, local247 - 2);
				} else if (Static50.anInt1296 != -1 && local215.anInt9797 == Static50.anInt1296) {
					local235 = local41 * local207.anInt2183 / Static371.anInt9390 + local78;
					local247 = local70 + local43 * (Static371.anInt9382 - local207.anInt2178) / Static371.anInt9382;
					arg1.method8164(local194 << 24 | 0xFFFF00, 4, local235 - 2, 4, local247 - 2);
				}
			}
		}
	}
}
