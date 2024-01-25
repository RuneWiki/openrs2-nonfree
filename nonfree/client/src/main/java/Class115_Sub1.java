import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wk")
public final class Class115_Sub1 extends Class115 {

	@OriginalMember(owner = "client!wk", name = "i", descriptor = "[I")
	private final int[] anIntArray688 = new int[512];

	@OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(I)V")
	public Class115_Sub1(@OriginalArg(0) int arg0) {
		@Pc(13) Random local13 = new Random((long) arg0);
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			this.anIntArray688[local15] = this.anIntArray688[local15 + 256] = local15;
		}
		for (@Pc(35) int local35 = 0; local35 < 256; local35++) {
			@Pc(42) int local42 = local13.nextInt() & 0xFF;
			@Pc(47) int local47 = this.anIntArray688[local42];
			this.anIntArray688[local42] = this.anIntArray688[local42 + 256] = this.anIntArray688[local35];
			this.anIntArray688[local35] = this.anIntArray688[local35 + 256] = local47;
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(BFFFIIFII[FI)V")
	@Override
	public void method8452(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(6) float arg3, @OriginalArg(8) int arg4, @OriginalArg(9) float[] arg5, @OriginalArg(10) int arg6) {
		@Pc(13) int local13 = (int) ((float) 128 * arg1 - 1.0F);
		@Pc(17) int local17 = local13 & 0xFF;
		@Pc(25) int local25 = (int) ((float) 128 * arg2 - 1.0F);
		@Pc(29) int local29 = local25 & 0xFF;
		@Pc(37) int local37 = (int) ((float) 16 * arg3 - 1.0F);
		@Pc(41) int local41 = local37 & 0xFF;
		@Pc(46) float local46 = arg3 * (float) arg6;
		@Pc(49) int local49 = (int) local46;
		@Pc(53) int local53 = local49 + 1;
		@Pc(59) float local59 = (float) -local49 + local46;
		@Pc(64) float local64 = 1.0F - local59;
		@Pc(68) int local68 = local53 & local41;
		@Pc(72) int local72 = local49 & local41;
		@Pc(82) float local82 = Static117.method1729(local59);
		@Pc(87) int local87 = this.anIntArray688[local72];
		@Pc(92) int local92 = this.anIntArray688[local68];
		for (@Pc(94) int local94 = 0; local94 < 128; local94++) {
			@Pc(101) float local101 = arg2 * (float) local94;
			@Pc(104) int local104 = (int) local101;
			@Pc(108) int local108 = local104 + 1;
			@Pc(113) float local113 = local101 - (float) local104;
			@Pc(118) float local118 = 1.0F - local113;
			@Pc(122) int local122 = local108 & local29;
			@Pc(126) float local126 = Static117.method1729(local113);
			@Pc(130) int local130 = local104 & local29;
			@Pc(137) int local137 = this.anIntArray688[local130 + local87];
			@Pc(144) int local144 = this.anIntArray688[local122 + local87];
			@Pc(152) int local152 = this.anIntArray688[local130 + local92];
			@Pc(159) int local159 = this.anIntArray688[local92 + local122];
			for (@Pc(161) int local161 = 0; local161 < 128; local161++) {
				@Pc(168) float local168 = arg1 * (float) local161;
				@Pc(171) int local171 = (int) local168;
				@Pc(175) int local175 = local171 + 1;
				@Pc(181) float local181 = (float) -local171 + local168;
				@Pc(185) float local185 = 1.0F - local181;
				@Pc(189) int local189 = local171 & local17;
				@Pc(193) int local193 = local175 & local17;
				@Pc(197) float local197 = Static117.method1729(local181);
				arg5[arg4++] = Static567.method7771(local82, Static567.method7771(local126, Static567.method7771(local197, Static481.method6495(this.anIntArray688[local137 + local189] & 0x7, local118, local64, local185), Static481.method6495(this.anIntArray688[local193 + local137] & 0x7, local118, local64, local181)), Static567.method7771(local197, Static481.method6495(this.anIntArray688[local144 + local189] & 0x7, local113, local64, local185), Static481.method6495(this.anIntArray688[local193 + local144] & 0x7, local113, local64, local181))), Static567.method7771(local126, Static567.method7771(local197, Static481.method6495(this.anIntArray688[local189 + local152] & 0x7, local118, local59, local185), Static481.method6495(this.anIntArray688[local193 + local152] & 0x7, local118, local59, local181)), Static567.method7771(local197, Static481.method6495(this.anIntArray688[local189 + local159] & 0x7, local113, local59, local185), Static481.method6495(this.anIntArray688[local193 + local159] & 0x7, local113, local59, local181)))) * arg0;
			}
		}
	}
}
