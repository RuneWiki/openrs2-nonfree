import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!al")
public final class Class10_Sub1 extends Class10 {

	@OriginalMember(owner = "client!al", name = "h", descriptor = "[I")
	private final int[] anIntArray33 = new int[512];

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "(I)V")
	public Class10_Sub1(@OriginalArg(0) int arg0) {
		@Pc(11) Random local11 = new Random((long) arg0);
		for (@Pc(13) int local13 = 0; local13 < 256; local13++) {
			this.anIntArray33[local13] = this.anIntArray33[local13 + 256] = local13;
		}
		for (@Pc(34) int local34 = 0; local34 < 256; local34++) {
			@Pc(40) int local40 = local11.nextInt() & 0xFF;
			@Pc(45) int local45 = this.anIntArray33[local40];
			this.anIntArray33[local40] = this.anIntArray33[local40 + 256] = this.anIntArray33[local34];
			this.anIntArray33[local34] = this.anIntArray33[local34 + 256] = local45;
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(FIFIF[FIIFII)V")
	@Override
	public void method407(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float[] arg4, @OriginalArg(8) float arg5, @OriginalArg(9) int arg6) {
		@Pc(13) int local13 = (int) (arg0 * (float) 128 - 1.0F);
		@Pc(17) int local17 = local13 & 0xFF;
		@Pc(25) int local25 = (int) ((float) 128 * arg2 - 1.0F);
		@Pc(29) int local29 = local25 & 0xFF;
		@Pc(37) int local37 = (int) (arg5 * (float) 16 - 1.0F);
		@Pc(41) int local41 = local37 & 0xFF;
		@Pc(46) float local46 = (float) arg1 * arg5;
		@Pc(49) int local49 = (int) local46;
		@Pc(53) int local53 = local49 + 1;
		@Pc(59) float local59 = (float) -local49 + local46;
		@Pc(64) float local64 = 1.0F - local59;
		@Pc(68) float local68 = Static180.method3066(local59);
		@Pc(72) int local72 = local49 & local41;
		@Pc(76) int local76 = local53 & local41;
		@Pc(85) int local85 = this.anIntArray33[local72];
		@Pc(90) int local90 = this.anIntArray33[local76];
		for (@Pc(92) int local92 = 0; local92 < 128; local92++) {
			@Pc(99) float local99 = arg2 * (float) local92;
			@Pc(102) int local102 = (int) local99;
			@Pc(106) int local106 = local102 + 1;
			@Pc(112) float local112 = (float) -local102 + local99;
			@Pc(117) float local117 = 1.0F - local112;
			@Pc(121) int local121 = local102 & local29;
			@Pc(125) int local125 = local106 & local29;
			@Pc(129) float local129 = Static180.method3066(local112);
			@Pc(136) int local136 = this.anIntArray33[local85 + local121];
			@Pc(144) int local144 = this.anIntArray33[local125 + local85];
			@Pc(151) int local151 = this.anIntArray33[local121 + local90];
			@Pc(158) int local158 = this.anIntArray33[local90 + local125];
			for (@Pc(160) int local160 = 0; local160 < 128; local160++) {
				@Pc(167) float local167 = (float) local160 * arg0;
				@Pc(170) int local170 = (int) local167;
				@Pc(174) int local174 = local170 + 1;
				@Pc(180) float local180 = (float) -local170 + local167;
				@Pc(185) float local185 = 1.0F - local180;
				@Pc(189) int local189 = local170 & local17;
				@Pc(193) int local193 = local174 & local17;
				@Pc(197) float local197 = Static180.method3066(local180);
				arg4[arg6++] = arg3 * Static208.method3390(Static208.method3390(Static208.method3390(Static233.method3660(this.anIntArray33[local189 + local136] & 0x7, local64, local117, local185), Static233.method3660(this.anIntArray33[local193 + local136] & 0x7, local64, local117, local180), local197), Static208.method3390(Static233.method3660(this.anIntArray33[local189 + local144] & 0x7, local64, local112, local185), Static233.method3660(this.anIntArray33[local144 + local193] & 0x7, local64, local112, local180), local197), local129), Static208.method3390(Static208.method3390(Static233.method3660(this.anIntArray33[local189 + local151] & 0x7, local59, local117, local185), Static233.method3660(this.anIntArray33[local193 + local151] & 0x7, local59, local117, local180), local197), Static208.method3390(Static233.method3660(this.anIntArray33[local189 + local158] & 0x7, local59, local112, local185), Static233.method3660(this.anIntArray33[local158 + local193] & 0x7, local59, local112, local180), local197), local129), local68);
			}
		}
	}
}
