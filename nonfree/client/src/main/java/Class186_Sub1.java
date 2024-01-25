import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jha")
public final class Class186_Sub1 extends Class186 {

	@OriginalMember(owner = "client!jha", name = "i", descriptor = "[I")
	private final int[] anIntArray270 = new int[512];

	@OriginalMember(owner = "client!jha", name = "<init>", descriptor = "(I)V")
	public Class186_Sub1(@OriginalArg(0) int arg0) {
		@Pc(13) Random local13 = new Random((long) arg0);
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			this.anIntArray270[local15] = this.anIntArray270[local15 + 256] = local15;
		}
		for (@Pc(37) int local37 = 0; local37 < 256; local37++) {
			@Pc(46) int local46 = local13.nextInt() & 0xFF;
			@Pc(51) int local51 = this.anIntArray270[local46];
			this.anIntArray270[local46] = this.anIntArray270[local46 + 256] = this.anIntArray270[local37];
			this.anIntArray270[local37] = this.anIntArray270[local37 + 256] = local51;
		}
	}

	@OriginalMember(owner = "client!jha", name = "a", descriptor = "(FFIIIIIFI[FF)V")
	@Override
	public void method4095(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3, @OriginalArg(7) float arg4, @OriginalArg(9) float[] arg5, @OriginalArg(10) float arg6) {
		@Pc(13) int local13 = (int) (arg6 * (float) 128 - 1.0F);
		@Pc(17) int local17 = local13 & 0xFF;
		@Pc(25) int local25 = (int) (arg4 * (float) 128 - 1.0F);
		@Pc(29) int local29 = local25 & 0xFF;
		@Pc(37) int local37 = (int) (arg0 * (float) 16 - 1.0F);
		@Pc(41) int local41 = local37 & 0xFF;
		@Pc(46) float local46 = arg0 * (float) arg2;
		@Pc(49) int local49 = (int) local46;
		@Pc(53) int local53 = local49 + 1;
		@Pc(58) float local58 = local46 - (float) local49;
		@Pc(63) float local63 = 1.0F - local58;
		@Pc(67) int local67 = local49 & local41;
		@Pc(71) int local71 = local53 & local41;
		@Pc(75) float local75 = Static444.method6613(local58);
		@Pc(80) int local80 = this.anIntArray270[local67];
		@Pc(85) int local85 = this.anIntArray270[local71];
		for (@Pc(87) int local87 = 0; local87 < 128; local87++) {
			@Pc(94) float local94 = arg4 * (float) local87;
			@Pc(97) int local97 = (int) local94;
			@Pc(101) int local101 = local97 + 1;
			@Pc(107) float local107 = (float) -local97 + local94;
			@Pc(112) float local112 = 1.0F - local107;
			@Pc(116) float local116 = Static444.method6613(local107);
			@Pc(120) int local120 = local101 & local29;
			@Pc(124) int local124 = local97 & local29;
			@Pc(131) int local131 = this.anIntArray270[local124 + local80];
			@Pc(138) int local138 = this.anIntArray270[local120 + local80];
			@Pc(145) int local145 = this.anIntArray270[local85 + local124];
			@Pc(153) int local153 = this.anIntArray270[local120 + local85];
			for (@Pc(155) int local155 = 0; local155 < 128; local155++) {
				@Pc(162) float local162 = arg6 * (float) local155;
				@Pc(165) int local165 = (int) local162;
				@Pc(169) int local169 = local165 + 1;
				@Pc(174) float local174 = local162 - (float) local165;
				@Pc(179) float local179 = 1.0F - local174;
				@Pc(183) int local183 = local165 & local17;
				@Pc(187) float local187 = Static444.method6613(local174);
				@Pc(191) int local191 = local169 & local17;
				arg5[arg3++] = Static44.method712(local75, Static44.method712(local116, Static44.method712(local187, Static619.method3021(local107, this.anIntArray270[local153 + local191] & 0x7, local174, local58), Static619.method3021(local107, this.anIntArray270[local153 + local183] & 0x7, local179, local58)), Static44.method712(local187, Static619.method3021(local112, this.anIntArray270[local145 + local191] & 0x7, local174, local58), Static619.method3021(local112, this.anIntArray270[local145 + local183] & 0x7, local179, local58))), Static44.method712(local116, Static44.method712(local187, Static619.method3021(local107, this.anIntArray270[local138 + local191] & 0x7, local174, local63), Static619.method3021(local107, this.anIntArray270[local138 + local183] & 0x7, local179, local63)), Static44.method712(local187, Static619.method3021(local112, this.anIntArray270[local191 + local131] & 0x7, local174, local63), Static619.method3021(local112, this.anIntArray270[local183 + local131] & 0x7, local179, local63)))) * arg1;
			}
		}
	}
}
