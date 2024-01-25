import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ab")
public final class Class3_Sub1 extends Class3 {

	@OriginalMember(owner = "client!ab", name = "g", descriptor = "[I")
	private final int[] anIntArray1 = new int[512];

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(I)V")
	public Class3_Sub1(@OriginalArg(0) int arg0) {
		@Pc(13) Random local13 = new Random((long) arg0);
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			this.anIntArray1[local15] = this.anIntArray1[local15 + 256] = local15;
		}
		for (@Pc(35) int local35 = 0; local35 < 256; local35++) {
			@Pc(42) int local42 = local13.nextInt() & 0xFF;
			@Pc(47) int local47 = this.anIntArray1[local42];
			this.anIntArray1[local42] = this.anIntArray1[local42 + 256] = this.anIntArray1[local35];
			this.anIntArray1[local35] = this.anIntArray1[local35 + 256] = local47;
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(F[FBFFFIIIII)V")
	@Override
	public void method36(@OriginalArg(0) float arg0, @OriginalArg(1) float[] arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6) {
		@Pc(13) int local13 = (int) ((float) 128 * arg0 - 1.0F);
		@Pc(17) int local17 = local13 & 0xFF;
		@Pc(25) int local25 = (int) ((float) 128 * arg3 - 1.0F);
		@Pc(29) int local29 = local25 & 0xFF;
		@Pc(37) int local37 = (int) ((float) 16 * arg2 - 1.0F);
		@Pc(41) int local41 = local37 & 0xFF;
		@Pc(46) float local46 = arg2 * (float) arg5;
		@Pc(49) int local49 = (int) local46;
		@Pc(53) int local53 = local49 + 1;
		@Pc(58) float local58 = local46 - (float) local49;
		@Pc(63) float local63 = 1.0F - local58;
		@Pc(67) float local67 = Static215.method2845(local58);
		@Pc(71) int local71 = local53 & local41;
		@Pc(75) int local75 = local49 & local41;
		@Pc(80) int local80 = this.anIntArray1[local75];
		@Pc(85) int local85 = this.anIntArray1[local71];
		for (@Pc(92) int local92 = 0; local92 < 128; local92++) {
			@Pc(99) float local99 = arg3 * (float) local92;
			@Pc(102) int local102 = (int) local99;
			@Pc(106) int local106 = local102 + 1;
			@Pc(112) float local112 = (float) -local102 + local99;
			@Pc(116) float local116 = 1.0F - local112;
			@Pc(120) int local120 = local106 & local29;
			@Pc(124) int local124 = local102 & local29;
			@Pc(128) float local128 = Static215.method2845(local112);
			@Pc(136) int local136 = this.anIntArray1[local124 + local80];
			@Pc(143) int local143 = this.anIntArray1[local80 + local120];
			@Pc(150) int local150 = this.anIntArray1[local85 + local124];
			@Pc(157) int local157 = this.anIntArray1[local85 + local120];
			for (@Pc(159) int local159 = 0; local159 < 128; local159++) {
				@Pc(166) float local166 = arg0 * (float) local159;
				@Pc(169) int local169 = (int) local166;
				@Pc(173) int local173 = local169 + 1;
				@Pc(179) float local179 = (float) -local169 + local166;
				@Pc(183) float local183 = 1.0F - local179;
				@Pc(187) int local187 = local173 & local17;
				@Pc(191) int local191 = local169 & local17;
				@Pc(195) float local195 = Static215.method2845(local179);
				arg1[arg6++] = arg4 * Static265.method3372(Static265.method3372(Static265.method3372(Static67.method1020(local63, local183, local116, this.anIntArray1[local136 + local191] & 0x7), local195, Static67.method1020(local63, local179, local116, this.anIntArray1[local187 + local136] & 0x7)), local128, Static265.method3372(Static67.method1020(local63, local183, local112, this.anIntArray1[local143 + local191] & 0x7), local195, Static67.method1020(local63, local179, local112, this.anIntArray1[local143 + local187] & 0x7))), local67, Static265.method3372(Static265.method3372(Static67.method1020(local58, local183, local116, this.anIntArray1[local150 + local191] & 0x7), local195, Static67.method1020(local58, local179, local116, this.anIntArray1[local187 + local150] & 0x7)), local128, Static265.method3372(Static67.method1020(local58, local183, local112, this.anIntArray1[local191 + local157] & 0x7), local195, Static67.method1020(local58, local179, local112, this.anIntArray1[local187 + local157] & 0x7))));
			}
		}
	}
}
