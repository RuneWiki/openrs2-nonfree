import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mga")
public final class Class206_Sub1 extends Class206 {

	@OriginalMember(owner = "client!mga", name = "h", descriptor = "[I")
	private final int[] anIntArray407 = new int[512];

	@OriginalMember(owner = "client!mga", name = "<init>", descriptor = "(I)V")
	public Class206_Sub1(@OriginalArg(0) int arg0) {
		@Pc(13) Random local13 = new Random((long) arg0);
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			this.anIntArray407[local15] = this.anIntArray407[local15 + 256] = local15;
		}
		for (@Pc(35) int local35 = 0; local35 < 256; local35++) {
			@Pc(42) int local42 = local13.nextInt() & 0xFF;
			@Pc(47) int local47 = this.anIntArray407[local42];
			this.anIntArray407[local42] = this.anIntArray407[local42 + 256] = this.anIntArray407[local35];
			this.anIntArray407[local35] = this.anIntArray407[local35 + 256] = local47;
		}
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(FIF[FIFIIFII)V")
	@Override
	public void method5572(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float[] arg2, @OriginalArg(5) float arg3, @OriginalArg(7) int arg4, @OriginalArg(8) float arg5, @OriginalArg(10) int arg6) {
		@Pc(13) int local13 = (int) (arg5 * (float) 128 - 1.0F);
		@Pc(17) int local17 = local13 & 0xFF;
		@Pc(25) int local25 = (int) (arg0 * (float) 128 - 1.0F);
		@Pc(29) int local29 = local25 & 0xFF;
		@Pc(53) int local53 = (int) ((float) 16 * arg1 - 1.0F);
		@Pc(57) int local57 = local53 & 0xFF;
		@Pc(62) float local62 = arg1 * (float) arg4;
		@Pc(65) int local65 = (int) local62;
		@Pc(69) int local69 = local65 + 1;
		@Pc(75) float local75 = (float) -local65 + local62;
		@Pc(79) float local79 = 1.0F - local75;
		@Pc(83) int local83 = local69 & local57;
		@Pc(87) int local87 = local65 & local57;
		@Pc(91) float local91 = Static605.method8491(local75);
		@Pc(96) int local96 = this.anIntArray407[local87];
		@Pc(101) int local101 = this.anIntArray407[local83];
		for (@Pc(103) int local103 = 0; local103 < 128; local103++) {
			@Pc(110) float local110 = (float) local103 * arg0;
			@Pc(113) int local113 = (int) local110;
			@Pc(117) int local117 = local113 + 1;
			@Pc(122) float local122 = local110 - (float) local113;
			@Pc(126) float local126 = 1.0F - local122;
			@Pc(130) float local130 = Static605.method8491(local122);
			@Pc(134) int local134 = local117 & local29;
			@Pc(138) int local138 = local113 & local29;
			@Pc(145) int local145 = this.anIntArray407[local138 + local96];
			@Pc(153) int local153 = this.anIntArray407[local134 + local96];
			@Pc(161) int local161 = this.anIntArray407[local138 + local101];
			@Pc(169) int local169 = this.anIntArray407[local134 + local101];
			for (@Pc(171) int local171 = 0; local171 < 128; local171++) {
				@Pc(178) float local178 = arg5 * (float) local171;
				@Pc(181) int local181 = (int) local178;
				@Pc(185) int local185 = local181 + 1;
				@Pc(191) float local191 = (float) -local181 + local178;
				@Pc(196) float local196 = 1.0F - local191;
				@Pc(200) int local200 = local181 & local17;
				@Pc(204) int local204 = local185 & local17;
				@Pc(208) float local208 = Static605.method8491(local191);
				arg2[arg6++] = arg3 * Static476.method8759(Static476.method8759(Static476.method8759(Static528.method7822(local196, local126, this.anIntArray407[local200 + local145] & 0x7, local79), Static528.method7822(local191, local126, this.anIntArray407[local204 + local145] & 0x7, local79), local208), Static476.method8759(Static528.method7822(local196, local122, this.anIntArray407[local153 + local200] & 0x7, local79), Static528.method7822(local191, local122, this.anIntArray407[local204 + local153] & 0x7, local79), local208), local130), Static476.method8759(Static476.method8759(Static528.method7822(local196, local126, this.anIntArray407[local161 + local200] & 0x7, local75), Static528.method7822(local191, local126, this.anIntArray407[local161 + local204] & 0x7, local75), local208), Static476.method8759(Static528.method7822(local196, local122, this.anIntArray407[local169 + local200] & 0x7, local75), Static528.method7822(local191, local122, this.anIntArray407[local169 + local204] & 0x7, local75), local208), local130), local91);
			}
		}
	}
}
