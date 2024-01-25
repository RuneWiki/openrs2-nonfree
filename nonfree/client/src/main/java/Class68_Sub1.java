import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pv")
public final class Class68_Sub1 extends Class68 {

	@OriginalMember(owner = "client!pv", name = "k", descriptor = "[I")
	private final int[] anIntArray413 = new int[512];

	@OriginalMember(owner = "client!pv", name = "<init>", descriptor = "(I)V")
	public Class68_Sub1(@OriginalArg(0) int arg0) {
		@Pc(13) Random local13 = new Random((long) arg0);
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			this.anIntArray413[local15] = this.anIntArray413[local15 + 256] = local15;
		}
		for (@Pc(35) int local35 = 0; local35 < 256; local35++) {
			@Pc(42) int local42 = local13.nextInt() & 0xFF;
			@Pc(47) int local47 = this.anIntArray413[local42];
			this.anIntArray413[local42] = this.anIntArray413[local42 + 256] = this.anIntArray413[local35];
			this.anIntArray413[local35] = this.anIntArray413[local35 + 256] = local47;
		}
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(I[FFIIIIFFIF)V")
	@Override
	public void method4376(@OriginalArg(1) float[] arg0, @OriginalArg(2) float arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) float arg4, @OriginalArg(8) float arg5, @OriginalArg(10) float arg6) {
		@Pc(19) int local19 = (int) ((float) 128 * arg6 - 1.0F);
		@Pc(23) int local23 = local19 & 0xFF;
		@Pc(31) int local31 = (int) (arg4 * (float) 128 - 1.0F);
		@Pc(35) int local35 = local31 & 0xFF;
		@Pc(43) int local43 = (int) (arg5 * (float) 16 - 1.0F);
		@Pc(47) int local47 = local43 & 0xFF;
		@Pc(52) float local52 = arg5 * (float) arg3;
		@Pc(55) int local55 = (int) local52;
		@Pc(59) int local59 = local55 + 1;
		@Pc(64) float local64 = local52 - (float) local55;
		@Pc(68) float local68 = 1.0F - local64;
		@Pc(72) float local72 = Static379.method5351(local64);
		@Pc(76) int local76 = local59 & local47;
		@Pc(80) int local80 = local55 & local47;
		@Pc(85) int local85 = this.anIntArray413[local80];
		@Pc(90) int local90 = this.anIntArray413[local76];
		for (@Pc(92) int local92 = 0; local92 < 128; local92++) {
			@Pc(99) float local99 = arg4 * (float) local92;
			@Pc(102) int local102 = (int) local99;
			@Pc(106) int local106 = local102 + 1;
			@Pc(111) float local111 = local99 - (float) local102;
			@Pc(115) float local115 = 1.0F - local111;
			@Pc(119) float local119 = Static379.method5351(local111);
			@Pc(123) int local123 = local106 & local35;
			@Pc(127) int local127 = local102 & local35;
			@Pc(134) int local134 = this.anIntArray413[local85 + local127];
			@Pc(142) int local142 = this.anIntArray413[local123 + local85];
			@Pc(149) int local149 = this.anIntArray413[local90 + local127];
			@Pc(156) int local156 = this.anIntArray413[local90 + local123];
			for (@Pc(158) int local158 = 0; local158 < 128; local158++) {
				@Pc(165) float local165 = arg6 * (float) local158;
				@Pc(168) int local168 = (int) local165;
				@Pc(172) int local172 = local168 + 1;
				@Pc(177) float local177 = local165 - (float) local168;
				@Pc(182) float local182 = 1.0F - local177;
				@Pc(186) int local186 = local172 & local23;
				@Pc(190) int local190 = local168 & local23;
				@Pc(194) float local194 = Static379.method5351(local177);
				arg0[arg2++] = Static5.method5253(local72, Static5.method5253(local119, Static5.method5253(local194, Static306.method4218(this.anIntArray413[local134 + local190] & 0x7, local115, local68, local182), Static306.method4218(this.anIntArray413[local186 + local134] & 0x7, local115, local68, local177)), Static5.method5253(local194, Static306.method4218(this.anIntArray413[local142 + local190] & 0x7, local111, local68, local182), Static306.method4218(this.anIntArray413[local186 + local142] & 0x7, local111, local68, local177))), Static5.method5253(local119, Static5.method5253(local194, Static306.method4218(this.anIntArray413[local149 + local190] & 0x7, local115, local64, local182), Static306.method4218(this.anIntArray413[local149 + local186] & 0x7, local115, local64, local177)), Static5.method5253(local194, Static306.method4218(this.anIntArray413[local190 + local156] & 0x7, local111, local64, local182), Static306.method4218(this.anIntArray413[local156 + local186] & 0x7, local111, local64, local177)))) * arg1;
			}
		}
	}
}
