import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hd")
public final class Class136_Sub1 extends Class136 {

	@OriginalMember(owner = "client!hd", name = "q", descriptor = "[I")
	private final int[] anIntArray193 = new int[512];

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(I)V")
	public Class136_Sub1(@OriginalArg(0) int arg0) {
		@Pc(11) Random local11 = new Random((long) arg0);
		for (@Pc(13) int local13 = 0; local13 < 256; local13++) {
			this.anIntArray193[local13] = this.anIntArray193[local13 + 256] = local13;
		}
		for (@Pc(32) int local32 = 0; local32 < 256; local32++) {
			@Pc(38) int local38 = local11.nextInt() & 0xFF;
			@Pc(43) int local43 = this.anIntArray193[local38];
			this.anIntArray193[local38] = this.anIntArray193[local38 + 256] = this.anIntArray193[local32];
			this.anIntArray193[local32] = this.anIntArray193[local32 + 256] = local43;
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(FFII[FIFIIFI)V")
	@Override
	public void method3515(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(4) float[] arg3, @OriginalArg(6) float arg4, @OriginalArg(8) int arg5, @OriginalArg(9) float arg6) {
		@Pc(13) int local13 = (int) (arg0 * (float) 128 - 1.0F);
		@Pc(17) int local17 = local13 & 0xFF;
		@Pc(25) int local25 = (int) (arg4 * (float) 128 - 1.0F);
		@Pc(29) int local29 = local25 & 0xFF;
		@Pc(37) int local37 = (int) (arg6 * (float) 16 - 1.0F);
		@Pc(41) int local41 = local37 & 0xFF;
		@Pc(46) float local46 = arg6 * (float) arg5;
		@Pc(49) int local49 = (int) local46;
		@Pc(53) int local53 = local49 + 1;
		@Pc(59) float local59 = (float) -local49 + local46;
		@Pc(63) float local63 = 1.0F - local59;
		@Pc(67) float local67 = Static546.method7974(local59);
		@Pc(71) int local71 = local53 & local41;
		@Pc(75) int local75 = local49 & local41;
		@Pc(80) int local80 = this.anIntArray193[local75];
		@Pc(85) int local85 = this.anIntArray193[local71];
		for (@Pc(93) int local93 = 0; local93 < 128; local93++) {
			@Pc(100) float local100 = (float) local93 * arg4;
			@Pc(103) int local103 = (int) local100;
			@Pc(107) int local107 = local103 + 1;
			@Pc(113) float local113 = (float) -local103 + local100;
			@Pc(118) float local118 = 1.0F - local113;
			@Pc(122) int local122 = local103 & local29;
			@Pc(126) int local126 = local107 & local29;
			@Pc(130) float local130 = Static546.method7974(local113);
			@Pc(137) int local137 = this.anIntArray193[local80 + local122];
			@Pc(144) int local144 = this.anIntArray193[local80 + local126];
			@Pc(151) int local151 = this.anIntArray193[local122 + local85];
			@Pc(158) int local158 = this.anIntArray193[local85 + local126];
			for (@Pc(160) int local160 = 0; local160 < 128; local160++) {
				@Pc(167) float local167 = arg0 * (float) local160;
				@Pc(170) int local170 = (int) local167;
				@Pc(174) int local174 = local170 + 1;
				@Pc(179) float local179 = local167 - (float) local170;
				@Pc(184) float local184 = 1.0F - local179;
				@Pc(188) float local188 = Static546.method7974(local179);
				@Pc(192) int local192 = local170 & local17;
				@Pc(196) int local196 = local174 & local17;
				arg3[arg2++] = Static110.method1692(local67, Static110.method1692(local130, Static110.method1692(local188, Static133.method1985(local118, this.anIntArray193[local137 + local192] & 0x7, local63, local184), Static133.method1985(local118, this.anIntArray193[local196 + local137] & 0x7, local63, local179)), Static110.method1692(local188, Static133.method1985(local113, this.anIntArray193[local144 + local192] & 0x7, local63, local184), Static133.method1985(local113, this.anIntArray193[local196 + local144] & 0x7, local63, local179))), Static110.method1692(local130, Static110.method1692(local188, Static133.method1985(local118, this.anIntArray193[local151 + local192] & 0x7, local59, local184), Static133.method1985(local118, this.anIntArray193[local196 + local151] & 0x7, local59, local179)), Static110.method1692(local188, Static133.method1985(local113, this.anIntArray193[local192 + local158] & 0x7, local59, local184), Static133.method1985(local113, this.anIntArray193[local158 + local196] & 0x7, local59, local179)))) * arg1;
			}
		}
	}
}
