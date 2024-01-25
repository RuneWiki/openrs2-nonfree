import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!afa")
public final class Class11_Sub1 extends Class11 {

	@OriginalMember(owner = "client!afa", name = "h", descriptor = "[I")
	private final int[] anIntArray12 = new int[512];

	@OriginalMember(owner = "client!afa", name = "<init>", descriptor = "(I)V")
	public Class11_Sub1(@OriginalArg(0) int arg0) {
		@Pc(13) Random local13 = new Random((long) arg0);
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			this.anIntArray12[local15] = this.anIntArray12[local15 + 256] = local15;
		}
		for (@Pc(37) int local37 = 0; local37 < 256; local37++) {
			@Pc(46) int local46 = local13.nextInt() & 0xFF;
			@Pc(51) int local51 = this.anIntArray12[local46];
			this.anIntArray12[local46] = this.anIntArray12[local46 + 256] = this.anIntArray12[local37];
			this.anIntArray12[local37] = this.anIntArray12[local37 + 256] = local51;
		}
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "([FIIFIIFFFII)V")
	@Override
	public void method168(@OriginalArg(0) float[] arg0, @OriginalArg(3) float arg1, @OriginalArg(5) int arg2, @OriginalArg(6) float arg3, @OriginalArg(7) float arg4, @OriginalArg(8) float arg5, @OriginalArg(10) int arg6) {
		@Pc(13) int local13 = (int) ((float) 128 * arg5 - 1.0F);
		@Pc(17) int local17 = local13 & 0xFF;
		@Pc(25) int local25 = (int) ((float) 128 * arg1 - 1.0F);
		@Pc(29) int local29 = local25 & 0xFF;
		@Pc(37) int local37 = (int) ((float) 16 * arg4 - 1.0F);
		@Pc(41) int local41 = local37 & 0xFF;
		@Pc(46) float local46 = arg4 * (float) arg2;
		@Pc(49) int local49 = (int) local46;
		@Pc(53) int local53 = local49 + 1;
		@Pc(63) float local63 = local46 - (float) local49;
		@Pc(68) float local68 = 1.0F - local63;
		@Pc(72) float local72 = Static262.method4527(local63);
		@Pc(76) int local76 = local53 & local41;
		@Pc(80) int local80 = local49 & local41;
		@Pc(85) int local85 = this.anIntArray12[local80];
		@Pc(90) int local90 = this.anIntArray12[local76];
		for (@Pc(92) int local92 = 0; local92 < 128; local92++) {
			@Pc(99) float local99 = (float) local92 * arg1;
			@Pc(102) int local102 = (int) local99;
			@Pc(106) int local106 = local102 + 1;
			@Pc(112) float local112 = (float) -local102 + local99;
			@Pc(117) float local117 = 1.0F - local112;
			@Pc(121) int local121 = local102 & local29;
			@Pc(125) int local125 = local106 & local29;
			@Pc(129) float local129 = Static262.method4527(local112);
			@Pc(137) int local137 = this.anIntArray12[local121 + local85];
			@Pc(145) int local145 = this.anIntArray12[local125 + local85];
			@Pc(152) int local152 = this.anIntArray12[local90 + local121];
			@Pc(159) int local159 = this.anIntArray12[local90 + local125];
			for (@Pc(161) int local161 = 0; local161 < 128; local161++) {
				@Pc(168) float local168 = (float) local161 * arg5;
				@Pc(171) int local171 = (int) local168;
				@Pc(175) int local175 = local171 + 1;
				@Pc(181) float local181 = (float) -local171 + local168;
				@Pc(185) float local185 = 1.0F - local181;
				@Pc(189) int local189 = local171 & local17;
				@Pc(193) float local193 = Static262.method4527(local181);
				@Pc(197) int local197 = local175 & local17;
				arg0[arg6++] = arg3 * Static201.method3744(Static201.method3744(Static201.method3744(Static516.method7465(local112, local63, this.anIntArray12[local197 + local159] & 0x7, local181), local193, Static516.method7465(local112, local63, this.anIntArray12[local189 + local159] & 0x7, local185)), local129, Static201.method3744(Static516.method7465(local117, local63, this.anIntArray12[local152 + local197] & 0x7, local181), local193, Static516.method7465(local117, local63, this.anIntArray12[local189 + local152] & 0x7, local185))), local72, Static201.method3744(Static201.method3744(Static516.method7465(local112, local68, this.anIntArray12[local197 + local145] & 0x7, local181), local193, Static516.method7465(local112, local68, this.anIntArray12[local189 + local145] & 0x7, local185)), local129, Static201.method3744(Static516.method7465(local117, local68, this.anIntArray12[local197 + local137] & 0x7, local181), local193, Static516.method7465(local117, local68, this.anIntArray12[local189 + local137] & 0x7, local185))));
			}
		}
	}
}
