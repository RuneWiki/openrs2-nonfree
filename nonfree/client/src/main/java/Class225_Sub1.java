import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mi")
public final class Class225_Sub1 extends Class225 {

	@OriginalMember(owner = "client!mi", name = "j", descriptor = "[I")
	private final int[] anIntArray336 = new int[512];

	@OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(I)V")
	public Class225_Sub1(@OriginalArg(0) int arg0) {
		@Pc(13) Random local13 = new Random((long) arg0);
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			this.anIntArray336[local15] = this.anIntArray336[local15 + 256] = local15;
		}
		for (@Pc(37) int local37 = 0; local37 < 256; local37++) {
			@Pc(44) int local44 = local13.nextInt() & 0xFF;
			@Pc(49) int local49 = this.anIntArray336[local44];
			this.anIntArray336[local44] = this.anIntArray336[local44 + 256] = this.anIntArray336[local37];
			this.anIntArray336[local37] = this.anIntArray336[local37 + 256] = local49;
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIIIFIIF[FFF)V")
	@Override
	public void method6353(@OriginalArg(2) int arg0, @OriginalArg(4) float arg1, @OriginalArg(5) int arg2, @OriginalArg(7) float arg3, @OriginalArg(8) float[] arg4, @OriginalArg(9) float arg5, @OriginalArg(10) float arg6) {
		@Pc(13) int local13 = (int) ((float) 128 * arg1 - 1.0F);
		@Pc(17) int local17 = local13 & 0xFF;
		@Pc(25) int local25 = (int) (arg6 * (float) 128 - 1.0F);
		@Pc(29) int local29 = local25 & 0xFF;
		@Pc(37) int local37 = (int) (arg5 * (float) 16 - 1.0F);
		@Pc(41) int local41 = local37 & 0xFF;
		@Pc(46) float local46 = (float) arg2 * arg5;
		@Pc(49) int local49 = (int) local46;
		@Pc(53) int local53 = local49 + 1;
		@Pc(62) float local62 = local46 - (float) local49;
		@Pc(67) float local67 = 1.0F - local62;
		@Pc(71) int local71 = local49 & local41;
		@Pc(75) float local75 = Static341.method5716(local62);
		@Pc(79) int local79 = local53 & local41;
		@Pc(84) int local84 = this.anIntArray336[local71];
		@Pc(89) int local89 = this.anIntArray336[local79];
		for (@Pc(91) int local91 = 0; local91 < 128; local91++) {
			@Pc(98) float local98 = arg6 * (float) local91;
			@Pc(101) int local101 = (int) local98;
			@Pc(105) int local105 = local101 + 1;
			@Pc(111) float local111 = (float) -local101 + local98;
			@Pc(116) float local116 = 1.0F - local111;
			@Pc(120) int local120 = local101 & local29;
			@Pc(124) int local124 = local105 & local29;
			@Pc(128) float local128 = Static341.method5716(local111);
			@Pc(135) int local135 = this.anIntArray336[local84 + local120];
			@Pc(142) int local142 = this.anIntArray336[local84 + local124];
			@Pc(149) int local149 = this.anIntArray336[local89 + local120];
			@Pc(156) int local156 = this.anIntArray336[local124 + local89];
			for (@Pc(158) int local158 = 0; local158 < 128; local158++) {
				@Pc(165) float local165 = (float) local158 * arg1;
				@Pc(168) int local168 = (int) local165;
				@Pc(172) int local172 = local168 + 1;
				@Pc(178) float local178 = (float) -local168 + local165;
				@Pc(183) float local183 = 1.0F - local178;
				@Pc(187) int local187 = local168 & local17;
				@Pc(191) int local191 = local172 & local17;
				@Pc(195) float local195 = Static341.method5716(local178);
				arg4[arg0++] = Static129.method2325(Static129.method2325(Static129.method2325(Static112.method1972(local111, local178, this.anIntArray336[local191 + local156] & 0x7, local62), local195, Static112.method1972(local111, local183, this.anIntArray336[local187 + local156] & 0x7, local62)), local128, Static129.method2325(Static112.method1972(local116, local178, this.anIntArray336[local191 + local149] & 0x7, local62), local195, Static112.method1972(local116, local183, this.anIntArray336[local187 + local149] & 0x7, local62))), local75, Static129.method2325(Static129.method2325(Static112.method1972(local111, local178, this.anIntArray336[local191 + local142] & 0x7, local67), local195, Static112.method1972(local111, local183, this.anIntArray336[local142 + local187] & 0x7, local67)), local128, Static129.method2325(Static112.method1972(local116, local178, this.anIntArray336[local135 + local191] & 0x7, local67), local195, Static112.method1972(local116, local183, this.anIntArray336[local135 + local187] & 0x7, local67)))) * arg3;
			}
		}
	}
}
