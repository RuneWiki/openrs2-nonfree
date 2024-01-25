import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!us")
public final class Class166_Sub1 extends Class166 {

	@OriginalMember(owner = "client!us", name = "f", descriptor = "[I")
	private final int[] anIntArray469 = new int[512];

	@OriginalMember(owner = "client!us", name = "<init>", descriptor = "(I)V")
	public Class166_Sub1(@OriginalArg(0) int arg0) {
		@Pc(13) Random local13 = new Random((long) arg0);
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			this.anIntArray469[local15] = this.anIntArray469[local15 + 256] = local15;
		}
		for (@Pc(37) int local37 = 0; local37 < 256; local37++) {
			@Pc(44) int local44 = local13.nextInt() & 0xFF;
			@Pc(49) int local49 = this.anIntArray469[local44];
			this.anIntArray469[local44] = this.anIntArray469[local44 + 256] = this.anIntArray469[local37];
			this.anIntArray469[local37] = this.anIntArray469[local37 + 256] = local49;
		}
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IIIBFIF[FFIF)V")
	@Override
	public void method5568(@OriginalArg(2) int arg0, @OriginalArg(4) float arg1, @OriginalArg(6) float arg2, @OriginalArg(7) float[] arg3, @OriginalArg(8) float arg4, @OriginalArg(9) int arg5, @OriginalArg(10) float arg6) {
		@Pc(13) int local13 = (int) (arg6 * (float) 128 - 1.0F);
		@Pc(17) int local17 = local13 & 0xFF;
		@Pc(25) int local25 = (int) ((float) 128 * arg4 - 1.0F);
		@Pc(29) int local29 = local25 & 0xFF;
		@Pc(37) int local37 = (int) (arg1 * (float) 16 - 1.0F);
		@Pc(41) int local41 = local37 & 0xFF;
		@Pc(46) float local46 = arg1 * (float) arg5;
		@Pc(49) int local49 = (int) local46;
		@Pc(53) int local53 = local49 + 1;
		@Pc(59) float local59 = (float) -local49 + local46;
		@Pc(64) float local64 = 1.0F - local59;
		@Pc(68) int local68 = local49 & local41;
		@Pc(78) float local78 = Static40.method580(local59);
		@Pc(82) int local82 = local53 & local41;
		@Pc(87) int local87 = this.anIntArray469[local68];
		@Pc(92) int local92 = this.anIntArray469[local82];
		for (@Pc(94) int local94 = 0; local94 < 128; local94++) {
			@Pc(101) float local101 = (float) local94 * arg4;
			@Pc(104) int local104 = (int) local101;
			@Pc(108) int local108 = local104 + 1;
			@Pc(113) float local113 = local101 - (float) local104;
			@Pc(118) float local118 = 1.0F - local113;
			@Pc(122) int local122 = local108 & local29;
			@Pc(126) int local126 = local104 & local29;
			@Pc(130) float local130 = Static40.method580(local113);
			@Pc(137) int local137 = this.anIntArray469[local126 + local87];
			@Pc(144) int local144 = this.anIntArray469[local122 + local87];
			@Pc(152) int local152 = this.anIntArray469[local126 + local92];
			@Pc(159) int local159 = this.anIntArray469[local122 + local92];
			for (@Pc(161) int local161 = 0; local161 < 128; local161++) {
				@Pc(168) float local168 = arg6 * (float) local161;
				@Pc(171) int local171 = (int) local168;
				@Pc(175) int local175 = local171 + 1;
				@Pc(180) float local180 = local168 - (float) local171;
				@Pc(184) float local184 = 1.0F - local180;
				@Pc(188) float local188 = Static40.method580(local180);
				@Pc(192) int local192 = local171 & local17;
				@Pc(196) int local196 = local175 & local17;
				arg3[arg0++] = Static49.method822(local78, Static49.method822(local130, Static49.method822(local188, Static24.method345(local113, local180, local59, this.anIntArray469[local196 + local159] & 0x7), Static24.method345(local113, local184, local59, this.anIntArray469[local159 + local192] & 0x7)), Static49.method822(local188, Static24.method345(local118, local180, local59, this.anIntArray469[local196 + local152] & 0x7), Static24.method345(local118, local184, local59, this.anIntArray469[local152 + local192] & 0x7))), Static49.method822(local130, Static49.method822(local188, Static24.method345(local113, local180, local64, this.anIntArray469[local196 + local144] & 0x7), Static24.method345(local113, local184, local64, this.anIntArray469[local192 + local144] & 0x7)), Static49.method822(local188, Static24.method345(local118, local180, local64, this.anIntArray469[local196 + local137] & 0x7), Static24.method345(local118, local184, local64, this.anIntArray469[local137 + local192] & 0x7)))) * arg2;
			}
		}
	}
}
