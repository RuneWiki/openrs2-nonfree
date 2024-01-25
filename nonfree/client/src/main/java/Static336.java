import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static336 {

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "I")
	public static int anInt5455;

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(II[FIIII)V")
	public static void method4357(@OriginalArg(1) int arg0, @OriginalArg(2) float[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg4 > 0 && !Static147.method2135(arg4)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Static147.method2135(arg2)) {
			@Pc(31) int local31 = Static331.method4086(6408);
			@Pc(33) int local33 = 0;
			@Pc(44) int local44 = arg2 <= arg4 ? arg2 : arg4;
			@Pc(48) int local48 = arg4 >> 1;
			@Pc(60) int local60 = arg2 >> 1;
			@Pc(62) float[] local62 = arg1;
			@Pc(69) float[] local69 = new float[local48 * local60 * local31];
			while (true) {
				OpenGL.glTexImage2Df(3553, local33, 34842, arg4, arg2, 0, 6408, 5126, local62, 0);
				if (local44 <= 1) {
					return;
				}
				@Pc(90) int local90 = arg4 * local31;
				for (@Pc(92) int local92 = 0; local92 < local31; local92++) {
					@Pc(96) int local96 = local92;
					@Pc(98) int local98 = local92;
					@Pc(102) int local102 = local90 + local92;
					for (@Pc(104) int local104 = 0; local104 < local60; local104++) {
						for (@Pc(108) int local108 = 0; local108 < local48; local108++) {
							@Pc(114) float local114 = local62[local98];
							local98 += local31;
							@Pc(124) float local124 = local114 + local62[local98];
							local98 += local31;
							@Pc(134) float local134 = local124 + local62[local102];
							local102 += local31;
							@Pc(144) float local144 = local134 + local62[local102];
							local69[local96] = local144 * 0.25F;
							local102 += local31;
							local96 += local31;
						}
						local98 += local90;
						local102 += local90;
					}
				}
				@Pc(184) float[] local184 = local69;
				local69 = local62;
				arg2 = local60;
				arg4 = local48;
				local62 = local184;
				local33++;
				local60 >>= 0x1;
				local48 >>= 0x1;
				local44 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IBLclient!pq;)V")
	public static void method4358(@OriginalArg(0) int arg0, @OriginalArg(2) Class196 arg1) {
		if (Static240.aBoolean467) {
			arg0 = 0;
			Static240.aBoolean467 = false;
		}
		if (Static424.aClass196_2 != null && Static424.aClass196_2.method4007(arg1)) {
			return;
		}
		Static424.aClass196_2 = arg1;
		Static359.aLong180 = Static446.method5903();
		Static383.anInt6298 = arg0;
		Static447.anInt7361 = arg0;
		if (Static447.anInt7361 == 0) {
			Static51.method806();
			return;
		}
		Static337.aFloat131 = Static217.aFloat90;
		Static444.anInt7359 = Static246.anInt3976;
		Static371.aClass24_4 = Static300.aClass24_2;
		Static23.anInt504 = Static300.anInt4682;
		Static187.aFloat127 = Static397.aFloat151;
		Static208.aFloat85 = Static38.aFloat116;
		Static441.aFloat179 = Static351.aFloat141;
		Static105.aFloat37 = Static229.aFloat93;
		Static195.anInt3247 = Static116.anInt1975;
		Static170.aFloat68 = Static210.aFloat86;
	}
}
