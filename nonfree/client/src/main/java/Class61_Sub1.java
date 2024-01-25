import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qp")
public final class Class61_Sub1 extends Class61 {

	@OriginalMember(owner = "client!qp", name = "j", descriptor = "[I")
	private final int[] anIntArray637 = new int[512];

	@OriginalMember(owner = "client!qp", name = "<init>", descriptor = "(I)V")
	public Class61_Sub1(@OriginalArg(0) int arg0) {
		@Pc(13) Random local13 = new Random((long) arg0);
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			this.anIntArray637[local15] = this.anIntArray637[local15 + 256] = local15;
		}
		for (@Pc(35) int local35 = 0; local35 < 256; local35++) {
			@Pc(42) int local42 = local13.nextInt() & 0xFF;
			@Pc(47) int local47 = this.anIntArray637[local42];
			this.anIntArray637[local42] = this.anIntArray637[local42 + 256] = this.anIntArray637[local35];
			this.anIntArray637[local35] = this.anIntArray637[local35 + 256] = local47;
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "([FIFBIFIIFFI)V")
	@Override
	public void method6910(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(5) float arg3, @OriginalArg(7) int arg4, @OriginalArg(8) float arg5, @OriginalArg(9) float arg6) {
		@Pc(13) int local13 = (int) ((float) 128 * arg3 - 1.0F);
		@Pc(17) int local17 = local13 & 0xFF;
		@Pc(25) int local25 = (int) (arg5 * (float) 128 - 1.0F);
		@Pc(29) int local29 = local25 & 0xFF;
		@Pc(37) int local37 = (int) ((float) 16 * arg6 - 1.0F);
		@Pc(41) int local41 = local37 & 0xFF;
		@Pc(46) float local46 = (float) arg1 * arg6;
		@Pc(49) int local49 = (int) local46;
		@Pc(53) int local53 = local49 + 1;
		@Pc(58) float local58 = local46 - (float) local49;
		@Pc(63) float local63 = 1.0F - local58;
		@Pc(67) float local67 = Static312.method4942(local58);
		@Pc(71) int local71 = local53 & local41;
		@Pc(75) int local75 = local49 & local41;
		@Pc(84) int local84 = this.anIntArray637[local75];
		@Pc(89) int local89 = this.anIntArray637[local71];
		for (@Pc(91) int local91 = 0; local91 < 128; local91++) {
			@Pc(98) float local98 = arg5 * (float) local91;
			@Pc(101) int local101 = (int) local98;
			@Pc(105) int local105 = local101 + 1;
			@Pc(111) float local111 = (float) -local101 + local98;
			@Pc(116) float local116 = 1.0F - local111;
			@Pc(120) int local120 = local101 & local29;
			@Pc(124) int local124 = local105 & local29;
			@Pc(128) float local128 = Static312.method4942(local111);
			@Pc(135) int local135 = this.anIntArray637[local84 + local120];
			@Pc(142) int local142 = this.anIntArray637[local84 + local124];
			@Pc(149) int local149 = this.anIntArray637[local120 + local89];
			@Pc(156) int local156 = this.anIntArray637[local89 + local124];
			for (@Pc(158) int local158 = 0; local158 < 128; local158++) {
				@Pc(165) float local165 = (float) local158 * arg3;
				@Pc(168) int local168 = (int) local165;
				@Pc(172) int local172 = local168 + 1;
				@Pc(177) float local177 = local165 - (float) local168;
				@Pc(182) float local182 = 1.0F - local177;
				@Pc(186) int local186 = local172 & local17;
				@Pc(192) float local192 = Static312.method4942(local177);
				@Pc(196) int local196 = local168 & local17;
				arg0[arg4++] = Static235.method3627(Static235.method3627(Static235.method3627(Static150.method2195(local182, this.anIntArray637[local135 + local196] & 0x7, local116, local63), Static150.method2195(local177, this.anIntArray637[local135 + local186] & 0x7, local116, local63), local192), Static235.method3627(Static150.method2195(local182, this.anIntArray637[local196 + local142] & 0x7, local111, local63), Static150.method2195(local177, this.anIntArray637[local142 + local186] & 0x7, local111, local63), local192), local128), Static235.method3627(Static235.method3627(Static150.method2195(local182, this.anIntArray637[local196 + local149] & 0x7, local116, local58), Static150.method2195(local177, this.anIntArray637[local149 + local186] & 0x7, local116, local58), local192), Static235.method3627(Static150.method2195(local182, this.anIntArray637[local196 + local156] & 0x7, local111, local58), Static150.method2195(local177, this.anIntArray637[local186 + local156] & 0x7, local111, local58), local192), local128), local67) * arg2;
			}
		}
	}
}
