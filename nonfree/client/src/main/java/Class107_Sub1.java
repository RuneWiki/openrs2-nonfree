import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ufa")
public final class Class107_Sub1 extends Class107 {

	@OriginalMember(owner = "client!ufa", name = "g", descriptor = "[I")
	private final int[] anIntArray650 = new int[512];

	@OriginalMember(owner = "client!ufa", name = "<init>", descriptor = "(I)V")
	public Class107_Sub1(@OriginalArg(0) int arg0) {
		@Pc(13) Random local13 = new Random((long) arg0);
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			this.anIntArray650[local15] = this.anIntArray650[local15 + 256] = local15;
		}
		for (@Pc(35) int local35 = 0; local35 < 256; local35++) {
			@Pc(42) int local42 = local13.nextInt() & 0xFF;
			@Pc(47) int local47 = this.anIntArray650[local42];
			this.anIntArray650[local42] = this.anIntArray650[local42 + 256] = this.anIntArray650[local35];
			this.anIntArray650[local35] = this.anIntArray650[local35 + 256] = local47;
		}
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(IZIFIIFF[FIF)V")
	@Override
	public void method7911(@OriginalArg(3) float arg0, @OriginalArg(5) int arg1, @OriginalArg(6) float arg2, @OriginalArg(7) float arg3, @OriginalArg(8) float[] arg4, @OriginalArg(9) int arg5, @OriginalArg(10) float arg6) {
		@Pc(13) int local13 = (int) ((float) 128 * arg3 - 1.0F);
		@Pc(17) int local17 = local13 & 0xFF;
		@Pc(25) int local25 = (int) (arg6 * (float) 128 - 1.0F);
		@Pc(29) int local29 = local25 & 0xFF;
		@Pc(37) int local37 = (int) (arg2 * (float) 16 - 1.0F);
		@Pc(41) int local41 = local37 & 0xFF;
		@Pc(46) float local46 = arg2 * (float) arg5;
		@Pc(49) int local49 = (int) local46;
		@Pc(53) int local53 = local49 + 1;
		@Pc(59) float local59 = (float) -local49 + local46;
		@Pc(64) float local64 = 1.0F - local59;
		@Pc(68) float local68 = Static444.method6103(local59);
		@Pc(72) int local72 = local53 & local41;
		@Pc(80) int local80 = local49 & local41;
		@Pc(85) int local85 = this.anIntArray650[local80];
		@Pc(90) int local90 = this.anIntArray650[local72];
		for (@Pc(92) int local92 = 0; local92 < 128; local92++) {
			@Pc(99) float local99 = arg6 * (float) local92;
			@Pc(102) int local102 = (int) local99;
			@Pc(106) int local106 = local102 + 1;
			@Pc(111) float local111 = local99 - (float) local102;
			@Pc(116) float local116 = 1.0F - local111;
			@Pc(120) int local120 = local106 & local29;
			@Pc(124) float local124 = Static444.method6103(local111);
			@Pc(128) int local128 = local102 & local29;
			@Pc(136) int local136 = this.anIntArray650[local128 + local85];
			@Pc(144) int local144 = this.anIntArray650[local120 + local85];
			@Pc(151) int local151 = this.anIntArray650[local128 + local90];
			@Pc(158) int local158 = this.anIntArray650[local90 + local120];
			for (@Pc(160) int local160 = 0; local160 < 128; local160++) {
				@Pc(167) float local167 = arg3 * (float) local160;
				@Pc(170) int local170 = (int) local167;
				@Pc(174) int local174 = local170 + 1;
				@Pc(180) float local180 = (float) -local170 + local167;
				@Pc(185) float local185 = 1.0F - local180;
				@Pc(189) int local189 = local170 & local17;
				@Pc(193) float local193 = Static444.method6103(local180);
				@Pc(197) int local197 = local174 & local17;
				arg4[arg1++] = Static265.method3796(Static265.method3796(Static265.method3796(Static567.method7509(local64, local116, local185, this.anIntArray650[local189 + local136] & 0x7), local193, Static567.method7509(local64, local116, local180, this.anIntArray650[local136 + local197] & 0x7)), local124, Static265.method3796(Static567.method7509(local64, local111, local185, this.anIntArray650[local189 + local144] & 0x7), local193, Static567.method7509(local64, local111, local180, this.anIntArray650[local197 + local144] & 0x7))), local68, Static265.method3796(Static265.method3796(Static567.method7509(local59, local116, local185, this.anIntArray650[local189 + local151] & 0x7), local193, Static567.method7509(local59, local116, local180, this.anIntArray650[local151 + local197] & 0x7)), local124, Static265.method3796(Static567.method7509(local59, local111, local185, this.anIntArray650[local189 + local158] & 0x7), local193, Static567.method7509(local59, local111, local180, this.anIntArray650[local158 + local197] & 0x7)))) * arg0;
			}
		}
	}
}
