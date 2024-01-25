import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ak")
public final class Class9_Sub1 extends Class9 {

	@OriginalMember(owner = "client!ak", name = "p", descriptor = "[I")
	private final int[] anIntArray17 = new int[512];

	@OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(I)V")
	public Class9_Sub1(@OriginalArg(0) int arg0) {
		@Pc(13) Random local13 = new Random((long) arg0);
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			this.anIntArray17[local15] = this.anIntArray17[local15 + 256] = local15;
		}
		for (@Pc(37) int local37 = 0; local37 < 256; local37++) {
			@Pc(44) int local44 = local13.nextInt() & 0xFF;
			@Pc(49) int local49 = this.anIntArray17[local44];
			this.anIntArray17[local44] = this.anIntArray17[local44 + 256] = this.anIntArray17[local37];
			this.anIntArray17[local37] = this.anIntArray17[local37 + 256] = local49;
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(I[FFIZFIIFFI)V")
	@Override
	public void method155(@OriginalArg(1) float[] arg0, @OriginalArg(2) float arg1, @OriginalArg(5) float arg2, @OriginalArg(6) int arg3, @OriginalArg(8) float arg4, @OriginalArg(9) float arg5, @OriginalArg(10) int arg6) {
		@Pc(13) int local13 = (int) ((float) 128 * arg1 - 1.0F);
		@Pc(17) int local17 = local13 & 0xFF;
		@Pc(25) int local25 = (int) ((float) 128 * arg4 - 1.0F);
		@Pc(29) int local29 = local25 & 0xFF;
		@Pc(37) int local37 = (int) (arg2 * (float) 16 - 1.0F);
		@Pc(41) int local41 = local37 & 0xFF;
		@Pc(46) float local46 = (float) arg6 * arg2;
		@Pc(49) int local49 = (int) local46;
		@Pc(58) int local58 = local49 + 1;
		@Pc(64) float local64 = (float) -local49 + local46;
		@Pc(68) float local68 = 1.0F - local64;
		@Pc(72) float local72 = Static195.method2635(local64);
		@Pc(76) int local76 = local49 & local41;
		@Pc(80) int local80 = local58 & local41;
		@Pc(85) int local85 = this.anIntArray17[local76];
		@Pc(90) int local90 = this.anIntArray17[local80];
		for (@Pc(92) int local92 = 0; local92 < 128; local92++) {
			@Pc(99) float local99 = (float) local92 * arg4;
			@Pc(102) int local102 = (int) local99;
			@Pc(106) int local106 = local102 + 1;
			@Pc(112) float local112 = (float) -local102 + local99;
			@Pc(116) float local116 = 1.0F - local112;
			@Pc(120) int local120 = local106 & local29;
			@Pc(124) int local124 = local102 & local29;
			@Pc(128) float local128 = Static195.method2635(local112);
			@Pc(135) int local135 = this.anIntArray17[local85 + local124];
			@Pc(142) int local142 = this.anIntArray17[local85 + local120];
			@Pc(149) int local149 = this.anIntArray17[local124 + local90];
			@Pc(157) int local157 = this.anIntArray17[local120 + local90];
			for (@Pc(159) int local159 = 0; local159 < 128; local159++) {
				@Pc(166) float local166 = arg1 * (float) local159;
				@Pc(169) int local169 = (int) local166;
				@Pc(173) int local173 = local169 + 1;
				@Pc(179) float local179 = (float) -local169 + local166;
				@Pc(184) float local184 = 1.0F - local179;
				@Pc(188) int local188 = local169 & local17;
				@Pc(192) int local192 = local173 & local17;
				@Pc(196) float local196 = Static195.method2635(local179);
				arg0[arg3++] = arg5 * Static356.method4729(Static356.method4729(Static356.method4729(Static363.method4778(local68, this.anIntArray17[local188 + local135] & 0x7, local184, local116), Static363.method4778(local68, this.anIntArray17[local192 + local135] & 0x7, local179, local116), local196), Static356.method4729(Static363.method4778(local68, this.anIntArray17[local188 + local142] & 0x7, local184, local112), Static363.method4778(local68, this.anIntArray17[local142 + local192] & 0x7, local179, local112), local196), local128), Static356.method4729(Static356.method4729(Static363.method4778(local64, this.anIntArray17[local149 + local188] & 0x7, local184, local116), Static363.method4778(local64, this.anIntArray17[local149 + local192] & 0x7, local179, local116), local196), Static356.method4729(Static363.method4778(local64, this.anIntArray17[local157 + local188] & 0x7, local184, local112), Static363.method4778(local64, this.anIntArray17[local192 + local157] & 0x7, local179, local112), local196), local128), local72);
			}
		}
	}
}
