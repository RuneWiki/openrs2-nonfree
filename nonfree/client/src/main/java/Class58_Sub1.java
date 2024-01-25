import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cm")
public final class Class58_Sub1 extends Class58 {

	@OriginalMember(owner = "client!cm", name = "j", descriptor = "[I")
	private final int[] anIntArray89 = new int[512];

	@OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(I)V")
	public Class58_Sub1(@OriginalArg(0) int arg0) {
		@Pc(13) Random local13 = new Random((long) arg0);
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			this.anIntArray89[local15] = this.anIntArray89[local15 + 256] = local15;
		}
		for (@Pc(35) int local35 = 0; local35 < 256; local35++) {
			@Pc(42) int local42 = local13.nextInt() & 0xFF;
			@Pc(47) int local47 = this.anIntArray89[local42];
			this.anIntArray89[local42] = this.anIntArray89[local42 + 256] = this.anIntArray89[local35];
			this.anIntArray89[local35] = this.anIntArray89[local35 + 256] = local47;
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(IFFIIFI[FFII)V")
	@Override
	public void method1943(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(5) float arg3, @OriginalArg(6) int arg4, @OriginalArg(7) float[] arg5, @OriginalArg(8) float arg6) {
		@Pc(13) int local13 = (int) (arg3 * (float) 128 - 1.0F);
		@Pc(17) int local17 = local13 & 0xFF;
		@Pc(25) int local25 = (int) (arg6 * (float) 128 - 1.0F);
		@Pc(29) int local29 = local25 & 0xFF;
		@Pc(37) int local37 = (int) ((float) 16 * arg0 - 1.0F);
		@Pc(41) int local41 = local37 & 0xFF;
		@Pc(46) float local46 = arg0 * (float) arg2;
		@Pc(49) int local49 = (int) local46;
		@Pc(53) int local53 = local49 + 1;
		@Pc(58) float local58 = local46 - (float) local49;
		@Pc(62) float local62 = 1.0F - local58;
		@Pc(66) float local66 = Static252.method4538(local58);
		@Pc(70) int local70 = local53 & local41;
		@Pc(74) int local74 = local49 & local41;
		@Pc(79) int local79 = this.anIntArray89[local74];
		@Pc(84) int local84 = this.anIntArray89[local70];
		for (@Pc(93) int local93 = 0; local93 < 128; local93++) {
			@Pc(100) float local100 = arg6 * (float) local93;
			@Pc(103) int local103 = (int) local100;
			@Pc(107) int local107 = local103 + 1;
			@Pc(112) float local112 = local100 - (float) local103;
			@Pc(116) float local116 = 1.0F - local112;
			@Pc(120) int local120 = local103 & local29;
			@Pc(124) int local124 = local107 & local29;
			@Pc(128) float local128 = Static252.method4538(local112);
			@Pc(135) int local135 = this.anIntArray89[local120 + local79];
			@Pc(142) int local142 = this.anIntArray89[local79 + local124];
			@Pc(149) int local149 = this.anIntArray89[local84 + local120];
			@Pc(157) int local157 = this.anIntArray89[local124 + local84];
			for (@Pc(159) int local159 = 0; local159 < 128; local159++) {
				@Pc(166) float local166 = (float) local159 * arg3;
				@Pc(169) int local169 = (int) local166;
				@Pc(173) int local173 = local169 + 1;
				@Pc(179) float local179 = (float) -local169 + local166;
				@Pc(183) float local183 = 1.0F - local179;
				@Pc(187) float local187 = Static252.method4538(local179);
				@Pc(191) int local191 = local169 & local17;
				@Pc(195) int local195 = local173 & local17;
				arg5[arg4++] = Static101.method2305(Static101.method2305(Static101.method2305(Static377.method5850(local112, this.anIntArray89[local195 + local157] & 0x7, local179, local58), local187, Static377.method5850(local112, this.anIntArray89[local191 + local157] & 0x7, local183, local58)), local128, Static101.method2305(Static377.method5850(local116, this.anIntArray89[local149 + local195] & 0x7, local179, local58), local187, Static377.method5850(local116, this.anIntArray89[local149 + local191] & 0x7, local183, local58))), local66, Static101.method2305(Static101.method2305(Static377.method5850(local112, this.anIntArray89[local142 + local195] & 0x7, local179, local62), local187, Static377.method5850(local112, this.anIntArray89[local191 + local142] & 0x7, local183, local62)), local128, Static101.method2305(Static377.method5850(local116, this.anIntArray89[local135 + local195] & 0x7, local179, local62), local187, Static377.method5850(local116, this.anIntArray89[local191 + local135] & 0x7, local183, local62)))) * arg1;
			}
		}
	}
}
