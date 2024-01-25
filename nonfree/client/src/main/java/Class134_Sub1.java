import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nf")
public final class Class134_Sub1 extends Class134 {

	@OriginalMember(owner = "client!nf", name = "g", descriptor = "[I")
	private final int[] anIntArray411 = new int[512];

	@OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(I)V")
	public Class134_Sub1(@OriginalArg(0) int arg0) {
		@Pc(13) Random local13 = new Random((long) arg0);
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			this.anIntArray411[local15] = this.anIntArray411[local15 + 256] = local15;
		}
		for (@Pc(35) int local35 = 0; local35 < 256; local35++) {
			@Pc(42) int local42 = local13.nextInt() & 0xFF;
			@Pc(47) int local47 = this.anIntArray411[local42];
			this.anIntArray411[local42] = this.anIntArray411[local42 + 256] = this.anIntArray411[local35];
			this.anIntArray411[local35] = this.anIntArray411[local35 + 256] = local47;
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(FIIFFII[FIFI)V")
	@Override
	public void method5899(@OriginalArg(0) float arg0, @OriginalArg(3) float arg1, @OriginalArg(4) float arg2, @OriginalArg(7) float[] arg3, @OriginalArg(8) int arg4, @OriginalArg(9) float arg5, @OriginalArg(10) int arg6) {
		@Pc(13) int local13 = (int) (arg1 * (float) 128 - 1.0F);
		@Pc(22) int local22 = local13 & 0xFF;
		@Pc(30) int local30 = (int) ((float) 128 * arg5 - 1.0F);
		@Pc(34) int local34 = local30 & 0xFF;
		@Pc(42) int local42 = (int) (arg0 * (float) 16 - 1.0F);
		@Pc(46) int local46 = local42 & 0xFF;
		@Pc(51) float local51 = arg0 * (float) arg4;
		@Pc(54) int local54 = (int) local51;
		@Pc(58) int local58 = local54 + 1;
		@Pc(63) float local63 = local51 - (float) local54;
		@Pc(68) float local68 = 1.0F - local63;
		@Pc(72) int local72 = local58 & local46;
		@Pc(76) int local76 = local54 & local46;
		@Pc(82) float local82 = Static646.method8661(local63);
		@Pc(87) int local87 = this.anIntArray411[local76];
		@Pc(92) int local92 = this.anIntArray411[local72];
		for (@Pc(94) int local94 = 0; local94 < 128; local94++) {
			@Pc(101) float local101 = arg5 * (float) local94;
			@Pc(104) int local104 = (int) local101;
			@Pc(108) int local108 = local104 + 1;
			@Pc(114) float local114 = (float) -local104 + local101;
			@Pc(118) float local118 = 1.0F - local114;
			@Pc(122) int local122 = local104 & local34;
			@Pc(126) float local126 = Static646.method8661(local114);
			@Pc(130) int local130 = local108 & local34;
			@Pc(138) int local138 = this.anIntArray411[local122 + local87];
			@Pc(146) int local146 = this.anIntArray411[local130 + local87];
			@Pc(154) int local154 = this.anIntArray411[local122 + local92];
			@Pc(161) int local161 = this.anIntArray411[local92 + local130];
			for (@Pc(163) int local163 = 0; local163 < 128; local163++) {
				@Pc(170) float local170 = (float) local163 * arg1;
				@Pc(173) int local173 = (int) local170;
				@Pc(177) int local177 = local173 + 1;
				@Pc(183) float local183 = (float) -local173 + local170;
				@Pc(187) float local187 = 1.0F - local183;
				@Pc(191) int local191 = local173 & local22;
				@Pc(195) float local195 = Static646.method8661(local183);
				@Pc(199) int local199 = local177 & local22;
				arg3[arg6++] = Static150.method3288(Static150.method3288(Static150.method3288(Static200.method3943(local63, this.anIntArray411[local199 + local161] & 0x7, local114, local183), local195, Static200.method3943(local63, this.anIntArray411[local161 + local191] & 0x7, local114, local187)), local126, Static150.method3288(Static200.method3943(local63, this.anIntArray411[local199 + local154] & 0x7, local118, local183), local195, Static200.method3943(local63, this.anIntArray411[local154 + local191] & 0x7, local118, local187))), local82, Static150.method3288(Static150.method3288(Static200.method3943(local68, this.anIntArray411[local199 + local146] & 0x7, local114, local183), local195, Static200.method3943(local68, this.anIntArray411[local191 + local146] & 0x7, local114, local187)), local126, Static150.method3288(Static200.method3943(local68, this.anIntArray411[local138 + local199] & 0x7, local118, local183), local195, Static200.method3943(local68, this.anIntArray411[local191 + local138] & 0x7, local118, local187)))) * arg2;
			}
		}
	}
}
