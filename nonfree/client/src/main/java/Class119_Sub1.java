import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!raa")
public final class Class119_Sub1 extends Class119 {

	@OriginalMember(owner = "client!raa", name = "l", descriptor = "[I")
	private final int[] anIntArray466 = new int[512];

	@OriginalMember(owner = "client!raa", name = "<init>", descriptor = "(I)V")
	public Class119_Sub1(@OriginalArg(0) int arg0) {
		@Pc(13) Random local13 = new Random((long) arg0);
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			this.anIntArray466[local15] = this.anIntArray466[local15 + 256] = local15;
		}
		for (@Pc(37) int local37 = 0; local37 < 256; local37++) {
			@Pc(44) int local44 = local13.nextInt() & 0xFF;
			@Pc(49) int local49 = this.anIntArray466[local44];
			this.anIntArray466[local44] = this.anIntArray466[local44 + 256] = this.anIntArray466[local37];
			this.anIntArray466[local37] = this.anIntArray466[local37 + 256] = local49;
		}
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(FI[FFFIIIIIF)V")
	@Override
	public void method6221(@OriginalArg(0) float arg0, @OriginalArg(2) float[] arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(6) int arg4, @OriginalArg(9) int arg5, @OriginalArg(10) float arg6) {
		@Pc(18) int local18 = (int) ((float) 128 * arg2 - 1.0F);
		@Pc(22) int local22 = local18 & 0xFF;
		@Pc(30) int local30 = (int) (arg6 * (float) 128 - 1.0F);
		@Pc(34) int local34 = local30 & 0xFF;
		@Pc(42) int local42 = (int) ((float) 16 * arg3 - 1.0F);
		@Pc(46) int local46 = local42 & 0xFF;
		@Pc(51) float local51 = arg3 * (float) arg4;
		@Pc(54) int local54 = (int) local51;
		@Pc(58) int local58 = local54 + 1;
		@Pc(64) float local64 = (float) -local54 + local51;
		@Pc(68) float local68 = 1.0F - local64;
		@Pc(72) float local72 = Static227.method3385(local64);
		@Pc(76) int local76 = local54 & local46;
		@Pc(80) int local80 = local58 & local46;
		@Pc(85) int local85 = this.anIntArray466[local76];
		@Pc(90) int local90 = this.anIntArray466[local80];
		for (@Pc(92) int local92 = 0; local92 < 128; local92++) {
			@Pc(99) float local99 = (float) local92 * arg6;
			@Pc(102) int local102 = (int) local99;
			@Pc(106) int local106 = local102 + 1;
			@Pc(112) float local112 = (float) -local102 + local99;
			@Pc(117) float local117 = 1.0F - local112;
			@Pc(121) int local121 = local102 & local34;
			@Pc(125) int local125 = local106 & local34;
			@Pc(129) float local129 = Static227.method3385(local112);
			@Pc(136) int local136 = this.anIntArray466[local85 + local121];
			@Pc(143) int local143 = this.anIntArray466[local125 + local85];
			@Pc(150) int local150 = this.anIntArray466[local90 + local121];
			@Pc(157) int local157 = this.anIntArray466[local90 + local125];
			for (@Pc(159) int local159 = 0; local159 < 128; local159++) {
				@Pc(166) float local166 = arg2 * (float) local159;
				@Pc(169) int local169 = (int) local166;
				@Pc(173) int local173 = local169 + 1;
				@Pc(179) float local179 = (float) -local169 + local166;
				@Pc(184) float local184 = 1.0F - local179;
				@Pc(188) float local188 = Static227.method3385(local179);
				@Pc(192) int local192 = local169 & local22;
				@Pc(196) int local196 = local173 & local22;
				arg1[arg5++] = Static2.method69(Static2.method69(Static2.method69(Static430.method6138(local179, this.anIntArray466[local196 + local157] & 0x7, local64, local112), Static430.method6138(local184, this.anIntArray466[local192 + local157] & 0x7, local64, local112), local188), Static2.method69(Static430.method6138(local179, this.anIntArray466[local196 + local150] & 0x7, local64, local117), Static430.method6138(local184, this.anIntArray466[local192 + local150] & 0x7, local64, local117), local188), local129), Static2.method69(Static2.method69(Static430.method6138(local179, this.anIntArray466[local196 + local143] & 0x7, local68, local112), Static430.method6138(local184, this.anIntArray466[local192 + local143] & 0x7, local68, local112), local188), Static2.method69(Static430.method6138(local179, this.anIntArray466[local196 + local136] & 0x7, local68, local117), Static430.method6138(local184, this.anIntArray466[local136 + local192] & 0x7, local68, local117), local188), local129), local72) * arg0;
			}
		}
	}
}
