import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!km")
public final class Class182_Sub1 extends Class182 {

	@OriginalMember(owner = "client!km", name = "h", descriptor = "[I")
	private final int[] anIntArray268 = new int[512];

	@OriginalMember(owner = "client!km", name = "<init>", descriptor = "(I)V")
	public Class182_Sub1(@OriginalArg(0) int arg0) {
		@Pc(13) Random local13 = new Random((long) arg0);
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			this.anIntArray268[local15] = this.anIntArray268[local15 + 256] = local15;
		}
		for (@Pc(37) int local37 = 0; local37 < 256; local37++) {
			@Pc(44) int local44 = local13.nextInt() & 0xFF;
			@Pc(49) int local49 = this.anIntArray268[local44];
			this.anIntArray268[local44] = this.anIntArray268[local44 + 256] = this.anIntArray268[local37];
			this.anIntArray268[local37] = this.anIntArray268[local37 + 256] = local49;
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(IIFIIF[FIFFI)V")
	@Override
	public void method4207(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1, @OriginalArg(5) float arg2, @OriginalArg(6) float[] arg3, @OriginalArg(8) float arg4, @OriginalArg(9) float arg5, @OriginalArg(10) int arg6) {
		@Pc(13) int local13 = (int) ((float) 128 * arg1 - 1.0F);
		@Pc(17) int local17 = local13 & 0xFF;
		@Pc(25) int local25 = (int) ((float) 128 * arg2 - 1.0F);
		@Pc(29) int local29 = local25 & 0xFF;
		@Pc(37) int local37 = (int) (arg4 * (float) 16 - 1.0F);
		@Pc(41) int local41 = local37 & 0xFF;
		@Pc(46) float local46 = arg4 * (float) arg6;
		@Pc(49) int local49 = (int) local46;
		@Pc(53) int local53 = local49 + 1;
		@Pc(59) float local59 = (float) -local49 + local46;
		@Pc(68) float local68 = 1.0F - local59;
		@Pc(72) int local72 = local49 & local41;
		@Pc(76) float local76 = Static392.method5756(local59);
		@Pc(80) int local80 = local53 & local41;
		@Pc(85) int local85 = this.anIntArray268[local72];
		@Pc(90) int local90 = this.anIntArray268[local80];
		for (@Pc(92) int local92 = 0; local92 < 128; local92++) {
			@Pc(99) float local99 = arg2 * (float) local92;
			@Pc(102) int local102 = (int) local99;
			@Pc(106) int local106 = local102 + 1;
			@Pc(112) float local112 = (float) -local102 + local99;
			@Pc(116) float local116 = 1.0F - local112;
			@Pc(120) float local120 = Static392.method5756(local112);
			@Pc(124) int local124 = local102 & local29;
			@Pc(128) int local128 = local106 & local29;
			@Pc(135) int local135 = this.anIntArray268[local85 + local124];
			@Pc(143) int local143 = this.anIntArray268[local128 + local85];
			@Pc(150) int local150 = this.anIntArray268[local90 + local124];
			@Pc(158) int local158 = this.anIntArray268[local128 + local90];
			for (@Pc(160) int local160 = 0; local160 < 128; local160++) {
				@Pc(167) float local167 = arg1 * (float) local160;
				@Pc(170) int local170 = (int) local167;
				@Pc(174) int local174 = local170 + 1;
				@Pc(179) float local179 = local167 - (float) local170;
				@Pc(184) float local184 = 1.0F - local179;
				@Pc(188) float local188 = Static392.method5756(local179);
				@Pc(192) int local192 = local174 & local17;
				@Pc(196) int local196 = local170 & local17;
				arg3[arg0++] = Static14.method208(local76, Static14.method208(local120, Static14.method208(local188, Static158.method2937(local112, this.anIntArray268[local158 + local192] & 0x7, local59, local179), Static158.method2937(local112, this.anIntArray268[local158 + local196] & 0x7, local59, local184)), Static14.method208(local188, Static158.method2937(local116, this.anIntArray268[local150 + local192] & 0x7, local59, local179), Static158.method2937(local116, this.anIntArray268[local196 + local150] & 0x7, local59, local184))), Static14.method208(local120, Static14.method208(local188, Static158.method2937(local112, this.anIntArray268[local192 + local143] & 0x7, local68, local179), Static158.method2937(local112, this.anIntArray268[local143 + local196] & 0x7, local68, local184)), Static14.method208(local188, Static158.method2937(local116, this.anIntArray268[local192 + local135] & 0x7, local68, local179), Static158.method2937(local116, this.anIntArray268[local196 + local135] & 0x7, local68, local184)))) * arg5;
			}
		}
	}
}
