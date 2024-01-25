import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vq")
public final class Class4_Sub1 extends Class4 {

	@OriginalMember(owner = "client!vq", name = "f", descriptor = "[I")
	private final int[] anIntArray674 = new int[512];

	@OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(I)V")
	public Class4_Sub1(@OriginalArg(0) int arg0) {
		@Pc(13) Random local13 = new Random((long) arg0);
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			this.anIntArray674[local15] = this.anIntArray674[local15 + 256] = local15;
		}
		for (@Pc(35) int local35 = 0; local35 < 256; local35++) {
			@Pc(42) int local42 = local13.nextInt() & 0xFF;
			@Pc(47) int local47 = this.anIntArray674[local42];
			this.anIntArray674[local42] = this.anIntArray674[local42 + 256] = this.anIntArray674[local35];
			this.anIntArray674[local35] = this.anIntArray674[local35 + 256] = local47;
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(FIIIF[FIIFIF)V")
	@Override
	public void method7706(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(4) float arg2, @OriginalArg(5) float[] arg3, @OriginalArg(6) int arg4, @OriginalArg(8) float arg5, @OriginalArg(10) float arg6) {
		@Pc(13) int local13 = (int) (arg2 * (float) 128 - 1.0F);
		@Pc(17) int local17 = local13 & 0xFF;
		@Pc(25) int local25 = (int) (arg0 * (float) 128 - 1.0F);
		@Pc(29) int local29 = local25 & 0xFF;
		@Pc(37) int local37 = (int) (arg5 * (float) 16 - 1.0F);
		@Pc(41) int local41 = local37 & 0xFF;
		@Pc(46) float local46 = arg5 * (float) arg1;
		@Pc(49) int local49 = (int) local46;
		@Pc(57) int local57 = local49 + 1;
		@Pc(63) float local63 = (float) -local49 + local46;
		@Pc(67) float local67 = 1.0F - local63;
		@Pc(71) float local71 = Static165.method2884(local63);
		@Pc(75) int local75 = local49 & local41;
		@Pc(79) int local79 = local57 & local41;
		@Pc(84) int local84 = this.anIntArray674[local75];
		@Pc(89) int local89 = this.anIntArray674[local79];
		for (@Pc(91) int local91 = 0; local91 < 128; local91++) {
			@Pc(98) float local98 = arg0 * (float) local91;
			@Pc(101) int local101 = (int) local98;
			@Pc(105) int local105 = local101 + 1;
			@Pc(110) float local110 = local98 - (float) local101;
			@Pc(115) float local115 = 1.0F - local110;
			@Pc(119) int local119 = local101 & local29;
			@Pc(123) int local123 = local105 & local29;
			@Pc(127) float local127 = Static165.method2884(local110);
			@Pc(134) int local134 = this.anIntArray674[local119 + local84];
			@Pc(142) int local142 = this.anIntArray674[local123 + local84];
			@Pc(149) int local149 = this.anIntArray674[local89 + local119];
			@Pc(157) int local157 = this.anIntArray674[local123 + local89];
			for (@Pc(159) int local159 = 0; local159 < 128; local159++) {
				@Pc(166) float local166 = (float) local159 * arg2;
				@Pc(169) int local169 = (int) local166;
				@Pc(173) int local173 = local169 + 1;
				@Pc(178) float local178 = local166 - (float) local169;
				@Pc(182) float local182 = 1.0F - local178;
				@Pc(186) int local186 = local169 & local17;
				@Pc(190) float local190 = Static165.method2884(local178);
				@Pc(194) int local194 = local173 & local17;
				arg3[arg4++] = arg6 * Static132.method6009(local71, Static132.method6009(local127, Static132.method6009(local190, Static205.method3318(local115, this.anIntArray674[local186 + local134] & 0x7, local67, local182), Static205.method3318(local115, this.anIntArray674[local134 + local194] & 0x7, local67, local178)), Static132.method6009(local190, Static205.method3318(local110, this.anIntArray674[local142 + local186] & 0x7, local67, local182), Static205.method3318(local110, this.anIntArray674[local194 + local142] & 0x7, local67, local178))), Static132.method6009(local127, Static132.method6009(local190, Static205.method3318(local115, this.anIntArray674[local186 + local149] & 0x7, local63, local182), Static205.method3318(local115, this.anIntArray674[local149 + local194] & 0x7, local63, local178)), Static132.method6009(local190, Static205.method3318(local110, this.anIntArray674[local157 + local186] & 0x7, local63, local182), Static205.method3318(local110, this.anIntArray674[local194 + local157] & 0x7, local63, local178))));
			}
		}
	}
}
