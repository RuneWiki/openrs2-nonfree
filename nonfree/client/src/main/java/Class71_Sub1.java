import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dp")
public final class Class71_Sub1 extends Class71 {

	@OriginalMember(owner = "client!dp", name = "e", descriptor = "[I")
	private final int[] anIntArray118 = new int[512];

	@OriginalMember(owner = "client!dp", name = "<init>", descriptor = "(I)V")
	public Class71_Sub1(@OriginalArg(0) int arg0) {
		@Pc(13) Random local13 = new Random((long) arg0);
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			this.anIntArray118[local15] = this.anIntArray118[local15 + 256] = local15;
		}
		for (@Pc(35) int local35 = 0; local35 < 256; local35++) {
			@Pc(42) int local42 = local13.nextInt() & 0xFF;
			@Pc(47) int local47 = this.anIntArray118[local42];
			this.anIntArray118[local42] = this.anIntArray118[local42 + 256] = this.anIntArray118[local35];
			this.anIntArray118[local35] = this.anIntArray118[local35 + 256] = local47;
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(FI[FIIBFFIIF)V")
	@Override
	public void method1758(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float[] arg2, @OriginalArg(6) float arg3, @OriginalArg(7) float arg4, @OriginalArg(9) int arg5, @OriginalArg(10) float arg6) {
		@Pc(13) int local13 = (int) ((float) 128 * arg0 - 1.0F);
		@Pc(17) int local17 = local13 & 0xFF;
		@Pc(25) int local25 = (int) (arg3 * (float) 128 - 1.0F);
		@Pc(29) int local29 = local25 & 0xFF;
		@Pc(37) int local37 = (int) ((float) 16 * arg4 - 1.0F);
		@Pc(45) int local45 = local37 & 0xFF;
		@Pc(50) float local50 = (float) arg5 * arg4;
		@Pc(53) int local53 = (int) local50;
		@Pc(57) int local57 = local53 + 1;
		@Pc(63) float local63 = (float) -local53 + local50;
		@Pc(68) float local68 = 1.0F - local63;
		@Pc(72) int local72 = local53 & local45;
		@Pc(78) float local78 = Static11.method416(local63);
		@Pc(82) int local82 = local57 & local45;
		@Pc(87) int local87 = this.anIntArray118[local72];
		@Pc(92) int local92 = this.anIntArray118[local82];
		for (@Pc(94) int local94 = 0; local94 < 128; local94++) {
			@Pc(101) float local101 = (float) local94 * arg3;
			@Pc(104) int local104 = (int) local101;
			@Pc(108) int local108 = local104 + 1;
			@Pc(113) float local113 = local101 - (float) local104;
			@Pc(118) float local118 = 1.0F - local113;
			@Pc(122) int local122 = local104 & local29;
			@Pc(128) float local128 = Static11.method416(local113);
			@Pc(132) int local132 = local108 & local29;
			@Pc(139) int local139 = this.anIntArray118[local87 + local122];
			@Pc(146) int local146 = this.anIntArray118[local132 + local87];
			@Pc(153) int local153 = this.anIntArray118[local92 + local122];
			@Pc(160) int local160 = this.anIntArray118[local132 + local92];
			for (@Pc(162) int local162 = 0; local162 < 128; local162++) {
				@Pc(169) float local169 = (float) local162 * arg0;
				@Pc(172) int local172 = (int) local169;
				@Pc(176) int local176 = local172 + 1;
				@Pc(182) float local182 = (float) -local172 + local169;
				@Pc(186) float local186 = 1.0F - local182;
				@Pc(190) int local190 = local176 & local17;
				@Pc(194) int local194 = local172 & local17;
				@Pc(198) float local198 = Static11.method416(local182);
				arg2[arg1++] = arg6 * Static648.method8831(local78, Static648.method8831(local128, Static648.method8831(local198, Static548.method7796(local182, local113, this.anIntArray118[local160 + local190] & 0x7, local63), Static548.method7796(local186, local113, this.anIntArray118[local194 + local160] & 0x7, local63)), Static648.method8831(local198, Static548.method7796(local182, local118, this.anIntArray118[local190 + local153] & 0x7, local63), Static548.method7796(local186, local118, this.anIntArray118[local194 + local153] & 0x7, local63))), Static648.method8831(local128, Static648.method8831(local198, Static548.method7796(local182, local113, this.anIntArray118[local190 + local146] & 0x7, local68), Static548.method7796(local186, local113, this.anIntArray118[local146 + local194] & 0x7, local68)), Static648.method8831(local198, Static548.method7796(local182, local118, this.anIntArray118[local190 + local139] & 0x7, local68), Static548.method7796(local186, local118, this.anIntArray118[local139 + local194] & 0x7, local68))));
			}
		}
	}
}
