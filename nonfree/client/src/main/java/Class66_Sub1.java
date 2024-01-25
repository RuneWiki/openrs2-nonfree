import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eo")
public final class Class66_Sub1 extends Class66 {

	@OriginalMember(owner = "client!eo", name = "h", descriptor = "[I")
	private final int[] anIntArray180 = new int[512];

	@OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(I)V")
	public Class66_Sub1(@OriginalArg(0) int arg0) {
		@Pc(13) Random local13 = new Random((long) arg0);
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			this.anIntArray180[local15] = this.anIntArray180[local15 + 256] = local15;
		}
		for (@Pc(35) int local35 = 0; local35 < 256; local35++) {
			@Pc(42) int local42 = local13.nextInt() & 0xFF;
			@Pc(47) int local47 = this.anIntArray180[local42];
			this.anIntArray180[local42] = this.anIntArray180[local42 + 256] = this.anIntArray180[local35];
			this.anIntArray180[local35] = this.anIntArray180[local35 + 256] = local47;
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IFIIIIF[FFIF)V")
	@Override
	public void method1830(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(6) float arg3, @OriginalArg(7) float[] arg4, @OriginalArg(8) float arg5, @OriginalArg(10) float arg6) {
		@Pc(13) int local13 = (int) ((float) 128 * arg6 - 1.0F);
		@Pc(17) int local17 = local13 & 0xFF;
		@Pc(25) int local25 = (int) ((float) 128 * arg3 - 1.0F);
		@Pc(29) int local29 = local25 & 0xFF;
		@Pc(37) int local37 = (int) (arg5 * (float) 16 - 1.0F);
		@Pc(41) int local41 = local37 & 0xFF;
		@Pc(46) float local46 = arg5 * (float) arg2;
		@Pc(49) int local49 = (int) local46;
		@Pc(53) int local53 = local49 + 1;
		@Pc(59) float local59 = (float) -local49 + local46;
		@Pc(63) float local63 = 1.0F - local59;
		@Pc(67) int local67 = local53 & local41;
		@Pc(83) int local83 = local49 & local41;
		@Pc(87) float local87 = Static161.method5248(local59);
		@Pc(92) int local92 = this.anIntArray180[local83];
		@Pc(97) int local97 = this.anIntArray180[local67];
		for (@Pc(99) int local99 = 0; local99 < 128; local99++) {
			@Pc(106) float local106 = arg3 * (float) local99;
			@Pc(109) int local109 = (int) local106;
			@Pc(113) int local113 = local109 + 1;
			@Pc(118) float local118 = local106 - (float) local109;
			@Pc(123) float local123 = 1.0F - local118;
			@Pc(127) int local127 = local113 & local29;
			@Pc(131) float local131 = Static161.method5248(local118);
			@Pc(135) int local135 = local109 & local29;
			@Pc(142) int local142 = this.anIntArray180[local92 + local135];
			@Pc(149) int local149 = this.anIntArray180[local127 + local92];
			@Pc(156) int local156 = this.anIntArray180[local135 + local97];
			@Pc(163) int local163 = this.anIntArray180[local127 + local97];
			for (@Pc(165) int local165 = 0; local165 < 128; local165++) {
				@Pc(172) float local172 = arg6 * (float) local165;
				@Pc(175) int local175 = (int) local172;
				@Pc(179) int local179 = local175 + 1;
				@Pc(184) float local184 = local172 - (float) local175;
				@Pc(188) float local188 = 1.0F - local184;
				@Pc(192) int local192 = local179 & local17;
				@Pc(196) float local196 = Static161.method5248(local184);
				@Pc(200) int local200 = local175 & local17;
				arg4[arg0++] = Static256.method4182(local87, Static256.method4182(local131, Static256.method4182(local196, Static85.method1760(this.anIntArray180[local200 + local142] & 0x7, local63, local188, local123), Static85.method1760(this.anIntArray180[local192 + local142] & 0x7, local63, local184, local123)), Static256.method4182(local196, Static85.method1760(this.anIntArray180[local149 + local200] & 0x7, local63, local188, local118), Static85.method1760(this.anIntArray180[local192 + local149] & 0x7, local63, local184, local118))), Static256.method4182(local131, Static256.method4182(local196, Static85.method1760(this.anIntArray180[local200 + local156] & 0x7, local59, local188, local123), Static85.method1760(this.anIntArray180[local192 + local156] & 0x7, local59, local184, local123)), Static256.method4182(local196, Static85.method1760(this.anIntArray180[local200 + local163] & 0x7, local59, local188, local118), Static85.method1760(this.anIntArray180[local192 + local163] & 0x7, local59, local184, local118)))) * arg1;
			}
		}
	}
}
