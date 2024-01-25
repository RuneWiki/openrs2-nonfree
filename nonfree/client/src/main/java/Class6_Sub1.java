import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fd")
public final class Class6_Sub1 extends Class6 {

	@OriginalMember(owner = "client!fd", name = "o", descriptor = "[I")
	private final int[] anIntArray95 = new int[512];

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(I)V")
	public Class6_Sub1(@OriginalArg(0) int arg0) {
		@Pc(13) Random local13 = new Random((long) arg0);
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			this.anIntArray95[local15] = this.anIntArray95[local15 + 256] = local15;
		}
		for (@Pc(37) int local37 = 0; local37 < 256; local37++) {
			@Pc(44) int local44 = local13.nextInt() & 0xFF;
			@Pc(49) int local49 = this.anIntArray95[local44];
			this.anIntArray95[local44] = this.anIntArray95[local44 + 256] = this.anIntArray95[local37];
			this.anIntArray95[local37] = this.anIntArray95[local37 + 256] = local49;
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(FIFIF[FIIFII)V")
	@Override
	public void method1787(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(4) float arg2, @OriginalArg(5) float[] arg3, @OriginalArg(8) float arg4, @OriginalArg(9) int arg5, @OriginalArg(10) int arg6) {
		@Pc(13) int local13 = (int) (arg1 * (float) 128 - 1.0F);
		@Pc(17) int local17 = local13 & 0xFF;
		@Pc(25) int local25 = (int) (arg0 * (float) 128 - 1.0F);
		@Pc(29) int local29 = local25 & 0xFF;
		@Pc(37) int local37 = (int) ((float) 16 * arg4 - 1.0F);
		@Pc(41) int local41 = local37 & 0xFF;
		@Pc(50) float local50 = (float) arg5 * arg4;
		@Pc(53) int local53 = (int) local50;
		@Pc(57) int local57 = local53 + 1;
		@Pc(63) float local63 = (float) -local53 + local50;
		@Pc(67) float local67 = 1.0F - local63;
		@Pc(71) int local71 = local53 & local41;
		@Pc(75) int local75 = local57 & local41;
		@Pc(79) float local79 = Static459.method4914(local63);
		@Pc(84) int local84 = this.anIntArray95[local71];
		@Pc(89) int local89 = this.anIntArray95[local75];
		for (@Pc(91) int local91 = 0; local91 < 128; local91++) {
			@Pc(98) float local98 = arg0 * (float) local91;
			@Pc(101) int local101 = (int) local98;
			@Pc(105) int local105 = local101 + 1;
			@Pc(111) float local111 = (float) -local101 + local98;
			@Pc(115) float local115 = 1.0F - local111;
			@Pc(119) int local119 = local105 & local29;
			@Pc(123) float local123 = Static459.method4914(local111);
			@Pc(127) int local127 = local101 & local29;
			@Pc(134) int local134 = this.anIntArray95[local84 + local127];
			@Pc(142) int local142 = this.anIntArray95[local119 + local84];
			@Pc(149) int local149 = this.anIntArray95[local89 + local127];
			@Pc(157) int local157 = this.anIntArray95[local119 + local89];
			for (@Pc(159) int local159 = 0; local159 < 128; local159++) {
				@Pc(166) float local166 = arg1 * (float) local159;
				@Pc(169) int local169 = (int) local166;
				@Pc(173) int local173 = local169 + 1;
				@Pc(179) float local179 = (float) -local169 + local166;
				@Pc(184) float local184 = 1.0F - local179;
				@Pc(188) float local188 = Static459.method4914(local179);
				@Pc(192) int local192 = local173 & local17;
				@Pc(196) int local196 = local169 & local17;
				arg3[arg6++] = Static326.method4518(Static326.method4518(Static326.method4518(Static457.method6230(local63, local111, local179, this.anIntArray95[local157 + local192] & 0x7), local188, Static457.method6230(local63, local111, local184, this.anIntArray95[local196 + local157] & 0x7)), local123, Static326.method4518(Static457.method6230(local63, local115, local179, this.anIntArray95[local149 + local192] & 0x7), local188, Static457.method6230(local63, local115, local184, this.anIntArray95[local196 + local149] & 0x7))), local79, Static326.method4518(Static326.method4518(Static457.method6230(local67, local111, local179, this.anIntArray95[local192 + local142] & 0x7), local188, Static457.method6230(local67, local111, local184, this.anIntArray95[local196 + local142] & 0x7)), local123, Static326.method4518(Static457.method6230(local67, local115, local179, this.anIntArray95[local192 + local134] & 0x7), local188, Static457.method6230(local67, local115, local184, this.anIntArray95[local134 + local196] & 0x7)))) * arg2;
			}
		}
	}
}
