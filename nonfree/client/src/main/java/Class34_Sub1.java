import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bea")
public final class Class34_Sub1 extends Class34 {

	@OriginalMember(owner = "client!bea", name = "f", descriptor = "[I")
	private final int[] anIntArray28 = new int[512];

	@OriginalMember(owner = "client!bea", name = "<init>", descriptor = "(I)V")
	public Class34_Sub1(@OriginalArg(0) int arg0) {
		@Pc(11) Random local11 = new Random((long) arg0);
		for (@Pc(13) int local13 = 0; local13 < 256; local13++) {
			this.anIntArray28[local13] = this.anIntArray28[local13 + 256] = local13;
		}
		for (@Pc(32) int local32 = 0; local32 < 256; local32++) {
			@Pc(38) int local38 = local11.nextInt() & 0xFF;
			@Pc(43) int local43 = this.anIntArray28[local38];
			this.anIntArray28[local38] = this.anIntArray28[local38 + 256] = this.anIntArray28[local32];
			this.anIntArray28[local32] = this.anIntArray28[local32 + 256] = local43;
		}
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(IFFIIFBI[FIF)V")
	@Override
	public void method573(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(5) float arg2, @OriginalArg(7) int arg3, @OriginalArg(8) float[] arg4, @OriginalArg(9) int arg5, @OriginalArg(10) float arg6) {
		@Pc(13) int local13 = (int) ((float) 128 * arg2 - 1.0F);
		@Pc(17) int local17 = local13 & 0xFF;
		@Pc(25) int local25 = (int) ((float) 128 * arg1 - 1.0F);
		@Pc(29) int local29 = local25 & 0xFF;
		@Pc(37) int local37 = (int) (arg0 * (float) 16 - 1.0F);
		@Pc(41) int local41 = local37 & 0xFF;
		@Pc(46) float local46 = (float) arg3 * arg0;
		@Pc(49) int local49 = (int) local46;
		@Pc(53) int local53 = local49 + 1;
		@Pc(59) float local59 = (float) -local49 + local46;
		@Pc(63) float local63 = 1.0F - local59;
		@Pc(67) int local67 = local49 & local41;
		@Pc(73) float local73 = Static288.method4655(local59);
		@Pc(77) int local77 = local53 & local41;
		@Pc(82) int local82 = this.anIntArray28[local67];
		@Pc(91) int local91 = this.anIntArray28[local77];
		for (@Pc(93) int local93 = 0; local93 < 128; local93++) {
			@Pc(100) float local100 = arg1 * (float) local93;
			@Pc(103) int local103 = (int) local100;
			@Pc(107) int local107 = local103 + 1;
			@Pc(112) float local112 = local100 - (float) local103;
			@Pc(116) float local116 = 1.0F - local112;
			@Pc(120) int local120 = local103 & local29;
			@Pc(124) float local124 = Static288.method4655(local112);
			@Pc(128) int local128 = local107 & local29;
			@Pc(136) int local136 = this.anIntArray28[local120 + local82];
			@Pc(143) int local143 = this.anIntArray28[local82 + local128];
			@Pc(150) int local150 = this.anIntArray28[local91 + local120];
			@Pc(157) int local157 = this.anIntArray28[local91 + local128];
			for (@Pc(159) int local159 = 0; local159 < 128; local159++) {
				@Pc(166) float local166 = (float) local159 * arg2;
				@Pc(169) int local169 = (int) local166;
				@Pc(173) int local173 = local169 + 1;
				@Pc(179) float local179 = (float) -local169 + local166;
				@Pc(184) float local184 = 1.0F - local179;
				@Pc(188) int local188 = local169 & local17;
				@Pc(192) int local192 = local173 & local17;
				@Pc(196) float local196 = Static288.method4655(local179);
				arg4[arg5++] = Static504.method7183(local73, Static504.method7183(local124, Static504.method7183(local196, Static32.method458(local112, local59, this.anIntArray28[local192 + local157] & 0x7, local179), Static32.method458(local112, local59, this.anIntArray28[local188 + local157] & 0x7, local184)), Static504.method7183(local196, Static32.method458(local116, local59, this.anIntArray28[local150 + local192] & 0x7, local179), Static32.method458(local116, local59, this.anIntArray28[local150 + local188] & 0x7, local184))), Static504.method7183(local124, Static504.method7183(local196, Static32.method458(local112, local63, this.anIntArray28[local192 + local143] & 0x7, local179), Static32.method458(local112, local63, this.anIntArray28[local143 + local188] & 0x7, local184)), Static504.method7183(local196, Static32.method458(local116, local63, this.anIntArray28[local136 + local192] & 0x7, local179), Static32.method458(local116, local63, this.anIntArray28[local188 + local136] & 0x7, local184)))) * arg6;
			}
		}
	}
}
