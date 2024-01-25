import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ue")
public final class Class248_Sub1 extends Class248 {

	@OriginalMember(owner = "client!ue", name = "j", descriptor = "[I")
	private final int[] anIntArray742 = new int[512];

	@OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(I)V")
	public Class248_Sub1(@OriginalArg(0) int arg0) {
		@Pc(13) Random local13 = new Random((long) arg0);
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			this.anIntArray742[local15] = this.anIntArray742[local15 + 256] = local15;
		}
		for (@Pc(35) int local35 = 0; local35 < 256; local35++) {
			@Pc(42) int local42 = local13.nextInt() & 0xFF;
			@Pc(47) int local47 = this.anIntArray742[local42];
			this.anIntArray742[local42] = this.anIntArray742[local42 + 256] = this.anIntArray742[local35];
			this.anIntArray742[local35] = this.anIntArray742[local35 + 256] = local47;
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(FIIZIFFFI[FI)V")
	@Override
	public void method7155(@OriginalArg(0) float arg0, @OriginalArg(5) float arg1, @OriginalArg(6) float arg2, @OriginalArg(7) float arg3, @OriginalArg(8) int arg4, @OriginalArg(9) float[] arg5, @OriginalArg(10) int arg6) {
		@Pc(13) int local13 = (int) (arg1 * (float) 128 - 1.0F);
		@Pc(17) int local17 = local13 & 0xFF;
		@Pc(25) int local25 = (int) ((float) 128 * arg2 - 1.0F);
		@Pc(29) int local29 = local25 & 0xFF;
		@Pc(37) int local37 = (int) ((float) 16 * arg3 - 1.0F);
		@Pc(41) int local41 = local37 & 0xFF;
		@Pc(51) float local51 = arg3 * (float) arg4;
		@Pc(54) int local54 = (int) local51;
		@Pc(58) int local58 = local54 + 1;
		@Pc(64) float local64 = (float) -local54 + local51;
		@Pc(68) float local68 = 1.0F - local64;
		@Pc(72) int local72 = local54 & local41;
		@Pc(76) float local76 = Static329.method5264(local64);
		@Pc(80) int local80 = local58 & local41;
		@Pc(85) int local85 = this.anIntArray742[local72];
		@Pc(90) int local90 = this.anIntArray742[local80];
		for (@Pc(92) int local92 = 0; local92 < 128; local92++) {
			@Pc(99) float local99 = arg2 * (float) local92;
			@Pc(102) int local102 = (int) local99;
			@Pc(106) int local106 = local102 + 1;
			@Pc(112) float local112 = (float) -local102 + local99;
			@Pc(116) float local116 = 1.0F - local112;
			@Pc(120) int local120 = local102 & local29;
			@Pc(124) int local124 = local106 & local29;
			@Pc(128) float local128 = Static329.method5264(local112);
			@Pc(135) int local135 = this.anIntArray742[local85 + local120];
			@Pc(142) int local142 = this.anIntArray742[local124 + local85];
			@Pc(149) int local149 = this.anIntArray742[local120 + local90];
			@Pc(157) int local157 = this.anIntArray742[local124 + local90];
			for (@Pc(159) int local159 = 0; local159 < 128; local159++) {
				@Pc(166) float local166 = (float) local159 * arg1;
				@Pc(169) int local169 = (int) local166;
				@Pc(173) int local173 = local169 + 1;
				@Pc(178) float local178 = local166 - (float) local169;
				@Pc(182) float local182 = 1.0F - local178;
				@Pc(186) float local186 = Static329.method5264(local178);
				@Pc(190) int local190 = local169 & local17;
				@Pc(194) int local194 = local173 & local17;
				arg5[arg6++] = arg0 * Static59.method1192(Static59.method1192(Static59.method1192(Static303.method4995(this.anIntArray742[local157 + local194] & 0x7, local112, local178, local64), local186, Static303.method4995(this.anIntArray742[local190 + local157] & 0x7, local112, local182, local64)), local128, Static59.method1192(Static303.method4995(this.anIntArray742[local194 + local149] & 0x7, local116, local178, local64), local186, Static303.method4995(this.anIntArray742[local190 + local149] & 0x7, local116, local182, local64))), local76, Static59.method1192(Static59.method1192(Static303.method4995(this.anIntArray742[local142 + local194] & 0x7, local112, local178, local68), local186, Static303.method4995(this.anIntArray742[local142 + local190] & 0x7, local112, local182, local68)), local128, Static59.method1192(Static303.method4995(this.anIntArray742[local135 + local194] & 0x7, local116, local178, local68), local186, Static303.method4995(this.anIntArray742[local190 + local135] & 0x7, local116, local182, local68))));
			}
		}
	}
}
