import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!er")
public final class Class84_Sub1 extends Class84 {

	@OriginalMember(owner = "client!er", name = "f", descriptor = "[I")
	private final int[] anIntArray172 = new int[512];

	@OriginalMember(owner = "client!er", name = "<init>", descriptor = "(I)V")
	public Class84_Sub1(@OriginalArg(0) int arg0) {
		@Pc(13) Random local13 = new Random((long) arg0);
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			this.anIntArray172[local15] = this.anIntArray172[local15 + 256] = local15;
		}
		for (@Pc(37) int local37 = 0; local37 < 256; local37++) {
			@Pc(44) int local44 = local13.nextInt() & 0xFF;
			@Pc(49) int local49 = this.anIntArray172[local44];
			this.anIntArray172[local44] = this.anIntArray172[local44 + 256] = this.anIntArray172[local37];
			this.anIntArray172[local37] = this.anIntArray172[local37 + 256] = local49;
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IIIIFFIFIF[F)V")
	@Override
	public void method2516(@OriginalArg(0) int arg0, @OriginalArg(4) float arg1, @OriginalArg(5) float arg2, @OriginalArg(7) float arg3, @OriginalArg(8) int arg4, @OriginalArg(9) float arg5, @OriginalArg(10) float[] arg6) {
		@Pc(13) int local13 = (int) (arg5 * (float) 128 - 1.0F);
		@Pc(17) int local17 = local13 & 0xFF;
		@Pc(25) int local25 = (int) ((float) 128 * arg3 - 1.0F);
		@Pc(29) int local29 = local25 & 0xFF;
		@Pc(37) int local37 = (int) (arg2 * (float) 16 - 1.0F);
		@Pc(41) int local41 = local37 & 0xFF;
		@Pc(46) float local46 = arg2 * (float) arg0;
		@Pc(54) int local54 = (int) local46;
		@Pc(58) int local58 = local54 + 1;
		@Pc(64) float local64 = (float) -local54 + local46;
		@Pc(69) float local69 = 1.0F - local64;
		@Pc(73) float local73 = Static417.method5981(local64);
		@Pc(77) int local77 = local58 & local41;
		@Pc(81) int local81 = local54 & local41;
		@Pc(86) int local86 = this.anIntArray172[local81];
		@Pc(91) int local91 = this.anIntArray172[local77];
		for (@Pc(93) int local93 = 0; local93 < 128; local93++) {
			@Pc(100) float local100 = (float) local93 * arg3;
			@Pc(103) int local103 = (int) local100;
			@Pc(107) int local107 = local103 + 1;
			@Pc(112) float local112 = local100 - (float) local103;
			@Pc(116) float local116 = 1.0F - local112;
			@Pc(122) float local122 = Static417.method5981(local112);
			@Pc(126) int local126 = local107 & local29;
			@Pc(130) int local130 = local103 & local29;
			@Pc(137) int local137 = this.anIntArray172[local86 + local130];
			@Pc(144) int local144 = this.anIntArray172[local86 + local126];
			@Pc(152) int local152 = this.anIntArray172[local130 + local91];
			@Pc(159) int local159 = this.anIntArray172[local91 + local126];
			for (@Pc(161) int local161 = 0; local161 < 128; local161++) {
				@Pc(168) float local168 = arg5 * (float) local161;
				@Pc(171) int local171 = (int) local168;
				@Pc(175) int local175 = local171 + 1;
				@Pc(180) float local180 = local168 - (float) local171;
				@Pc(185) float local185 = 1.0F - local180;
				@Pc(189) int local189 = local171 & local17;
				@Pc(193) float local193 = Static417.method5981(local180);
				@Pc(197) int local197 = local175 & local17;
				arg6[arg4++] = arg1 * Static544.method7393(Static544.method7393(Static544.method7393(Static328.method5141(local64, local180, local112, this.anIntArray172[local197 + local159] & 0x7), local193, Static328.method5141(local64, local185, local112, this.anIntArray172[local159 + local189] & 0x7)), local122, Static544.method7393(Static328.method5141(local64, local180, local116, this.anIntArray172[local152 + local197] & 0x7), local193, Static328.method5141(local64, local185, local116, this.anIntArray172[local189 + local152] & 0x7))), local73, Static544.method7393(Static544.method7393(Static328.method5141(local69, local180, local112, this.anIntArray172[local144 + local197] & 0x7), local193, Static328.method5141(local69, local185, local112, this.anIntArray172[local189 + local144] & 0x7)), local122, Static544.method7393(Static328.method5141(local69, local180, local116, this.anIntArray172[local197 + local137] & 0x7), local193, Static328.method5141(local69, local185, local116, this.anIntArray172[local137 + local189] & 0x7))));
			}
		}
	}
}
