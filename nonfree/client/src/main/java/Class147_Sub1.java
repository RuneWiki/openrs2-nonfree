import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qw")
public final class Class147_Sub1 extends Class147 {

	@OriginalMember(owner = "client!qw", name = "e", descriptor = "[I")
	private final int[] anIntArray697 = new int[512];

	@OriginalMember(owner = "client!qw", name = "<init>", descriptor = "(I)V")
	public Class147_Sub1(@OriginalArg(0) int arg0) {
		@Pc(13) Random local13 = new Random((long) arg0);
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			this.anIntArray697[local15] = this.anIntArray697[local15 + 256] = local15;
		}
		for (@Pc(35) int local35 = 0; local35 < 256; local35++) {
			@Pc(42) int local42 = local13.nextInt() & 0xFF;
			@Pc(47) int local47 = this.anIntArray697[local42];
			this.anIntArray697[local42] = this.anIntArray697[local42 + 256] = this.anIntArray697[local35];
			this.anIntArray697[local35] = this.anIntArray697[local35 + 256] = local47;
		}
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(FIF[FIIFIZFI)V")
	@Override
	public void method6062(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float[] arg2, @OriginalArg(5) int arg3, @OriginalArg(6) float arg4, @OriginalArg(9) float arg5, @OriginalArg(10) int arg6) {
		@Pc(13) int local13 = (int) (arg5 * (float) 128 - 1.0F);
		@Pc(17) int local17 = local13 & 0xFF;
		@Pc(29) int local29 = (int) ((float) 128 * arg0 - 1.0F);
		@Pc(33) int local33 = local29 & 0xFF;
		@Pc(41) int local41 = (int) ((float) 16 * arg1 - 1.0F);
		@Pc(45) int local45 = local41 & 0xFF;
		@Pc(50) float local50 = (float) arg3 * arg1;
		@Pc(53) int local53 = (int) local50;
		@Pc(57) int local57 = local53 + 1;
		@Pc(62) float local62 = local50 - (float) local53;
		@Pc(67) float local67 = 1.0F - local62;
		@Pc(75) float local75 = Static512.method7099(local62);
		@Pc(79) int local79 = local53 & local45;
		@Pc(83) int local83 = local57 & local45;
		@Pc(88) int local88 = this.anIntArray697[local79];
		@Pc(93) int local93 = this.anIntArray697[local83];
		for (@Pc(95) int local95 = 0; local95 < 128; local95++) {
			@Pc(102) float local102 = (float) local95 * arg0;
			@Pc(105) int local105 = (int) local102;
			@Pc(109) int local109 = local105 + 1;
			@Pc(114) float local114 = local102 - (float) local105;
			@Pc(118) float local118 = 1.0F - local114;
			@Pc(122) float local122 = Static512.method7099(local114);
			@Pc(126) int local126 = local109 & local33;
			@Pc(130) int local130 = local105 & local33;
			@Pc(137) int local137 = this.anIntArray697[local88 + local130];
			@Pc(144) int local144 = this.anIntArray697[local88 + local126];
			@Pc(151) int local151 = this.anIntArray697[local93 + local130];
			@Pc(159) int local159 = this.anIntArray697[local126 + local93];
			for (@Pc(161) int local161 = 0; local161 < 128; local161++) {
				@Pc(168) float local168 = (float) local161 * arg5;
				@Pc(171) int local171 = (int) local168;
				@Pc(175) int local175 = local171 + 1;
				@Pc(181) float local181 = (float) -local171 + local168;
				@Pc(185) float local185 = 1.0F - local181;
				@Pc(189) int local189 = local171 & local17;
				@Pc(193) int local193 = local175 & local17;
				@Pc(197) float local197 = Static512.method7099(local181);
				arg2[arg6++] = arg4 * Static255.method4306(local75, Static255.method4306(local122, Static255.method4306(local197, Static202.method3486(local118, local67, this.anIntArray697[local189 + local137] & 0x7, local185), Static202.method3486(local118, local67, this.anIntArray697[local137 + local193] & 0x7, local181)), Static255.method4306(local197, Static202.method3486(local114, local67, this.anIntArray697[local189 + local144] & 0x7, local185), Static202.method3486(local114, local67, this.anIntArray697[local144 + local193] & 0x7, local181))), Static255.method4306(local122, Static255.method4306(local197, Static202.method3486(local118, local62, this.anIntArray697[local151 + local189] & 0x7, local185), Static202.method3486(local118, local62, this.anIntArray697[local151 + local193] & 0x7, local181)), Static255.method4306(local197, Static202.method3486(local114, local62, this.anIntArray697[local189 + local159] & 0x7, local185), Static202.method3486(local114, local62, this.anIntArray697[local193 + local159] & 0x7, local181))));
			}
		}
	}
}
