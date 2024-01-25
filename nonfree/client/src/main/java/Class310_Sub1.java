import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tt")
public final class Class310_Sub1 extends Class310 {

	@OriginalMember(owner = "client!tt", name = "e", descriptor = "[I")
	private final int[] anIntArray642 = new int[512];

	@OriginalMember(owner = "client!tt", name = "<init>", descriptor = "(I)V")
	public Class310_Sub1(@OriginalArg(0) int arg0) {
		@Pc(13) Random local13 = new Random((long) arg0);
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			this.anIntArray642[local15] = this.anIntArray642[local15 + 256] = local15;
		}
		for (@Pc(37) int local37 = 0; local37 < 256; local37++) {
			@Pc(44) int local44 = local13.nextInt() & 0xFF;
			@Pc(49) int local49 = this.anIntArray642[local44];
			this.anIntArray642[local44] = this.anIntArray642[local44 + 256] = this.anIntArray642[local37];
			this.anIntArray642[local37] = this.anIntArray642[local37 + 256] = local49;
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(IFI[FIFIFIIF)V")
	@Override
	public void method6881(@OriginalArg(1) float arg0, @OriginalArg(3) float[] arg1, @OriginalArg(5) float arg2, @OriginalArg(6) int arg3, @OriginalArg(7) float arg4, @OriginalArg(8) int arg5, @OriginalArg(10) float arg6) {
		@Pc(13) int local13 = (int) ((float) 128 * arg4 - 1.0F);
		@Pc(17) int local17 = local13 & 0xFF;
		@Pc(25) int local25 = (int) ((float) 128 * arg0 - 1.0F);
		@Pc(29) int local29 = local25 & 0xFF;
		@Pc(37) int local37 = (int) (arg6 * (float) 16 - 1.0F);
		@Pc(41) int local41 = local37 & 0xFF;
		@Pc(46) float local46 = (float) arg5 * arg6;
		@Pc(54) int local54 = (int) local46;
		@Pc(58) int local58 = local54 + 1;
		@Pc(63) float local63 = local46 - (float) local54;
		@Pc(68) float local68 = 1.0F - local63;
		@Pc(72) int local72 = local58 & local41;
		@Pc(76) float local76 = Static254.method3588(local63);
		@Pc(80) int local80 = local54 & local41;
		@Pc(85) int local85 = this.anIntArray642[local80];
		@Pc(90) int local90 = this.anIntArray642[local72];
		for (@Pc(92) int local92 = 0; local92 < 128; local92++) {
			@Pc(99) float local99 = arg0 * (float) local92;
			@Pc(102) int local102 = (int) local99;
			@Pc(106) int local106 = local102 + 1;
			@Pc(112) float local112 = (float) -local102 + local99;
			@Pc(116) float local116 = 1.0F - local112;
			@Pc(120) float local120 = Static254.method3588(local112);
			@Pc(124) int local124 = local102 & local29;
			@Pc(128) int local128 = local106 & local29;
			@Pc(136) int local136 = this.anIntArray642[local124 + local85];
			@Pc(143) int local143 = this.anIntArray642[local85 + local128];
			@Pc(150) int local150 = this.anIntArray642[local90 + local124];
			@Pc(157) int local157 = this.anIntArray642[local90 + local128];
			for (@Pc(159) int local159 = 0; local159 < 128; local159++) {
				@Pc(166) float local166 = (float) local159 * arg4;
				@Pc(169) int local169 = (int) local166;
				@Pc(173) int local173 = local169 + 1;
				@Pc(179) float local179 = (float) -local169 + local166;
				@Pc(183) float local183 = 1.0F - local179;
				@Pc(187) float local187 = Static254.method3588(local179);
				@Pc(191) int local191 = local169 & local17;
				@Pc(195) int local195 = local173 & local17;
				arg1[arg3++] = arg2 * Static532.method7405(Static532.method7405(Static532.method7405(Static577.method5080(this.anIntArray642[local157 + local195] & 0x7, local112, local63, local179), local187, Static577.method5080(this.anIntArray642[local157 + local191] & 0x7, local112, local63, local183)), local120, Static532.method7405(Static577.method5080(this.anIntArray642[local195 + local150] & 0x7, local116, local63, local179), local187, Static577.method5080(this.anIntArray642[local150 + local191] & 0x7, local116, local63, local183))), local76, Static532.method7405(Static532.method7405(Static577.method5080(this.anIntArray642[local195 + local143] & 0x7, local112, local68, local179), local187, Static577.method5080(this.anIntArray642[local191 + local143] & 0x7, local112, local68, local183)), local120, Static532.method7405(Static577.method5080(this.anIntArray642[local195 + local136] & 0x7, local116, local68, local179), local187, Static577.method5080(this.anIntArray642[local191 + local136] & 0x7, local116, local68, local183))));
			}
		}
	}
}
