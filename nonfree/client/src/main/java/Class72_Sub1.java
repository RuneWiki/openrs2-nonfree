import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!er")
public final class Class72_Sub1 extends Class72 {

	@OriginalMember(owner = "client!er", name = "h", descriptor = "[I")
	private final int[] anIntArray133 = new int[512];

	@OriginalMember(owner = "client!er", name = "<init>", descriptor = "(I)V")
	public Class72_Sub1(@OriginalArg(0) int arg0) {
		@Pc(13) Random local13 = new Random((long) arg0);
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			this.anIntArray133[local15] = this.anIntArray133[local15 + 256] = local15;
		}
		for (@Pc(37) int local37 = 0; local37 < 256; local37++) {
			@Pc(44) int local44 = local13.nextInt() & 0xFF;
			@Pc(49) int local49 = this.anIntArray133[local44];
			this.anIntArray133[local44] = this.anIntArray133[local44 + 256] = this.anIntArray133[local37];
			this.anIntArray133[local37] = this.anIntArray133[local37 + 256] = local49;
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(FB[FIFFIIFII)V")
	@Override
	public void method1718(@OriginalArg(0) float arg0, @OriginalArg(2) float[] arg1, @OriginalArg(4) float arg2, @OriginalArg(5) float arg3, @OriginalArg(7) int arg4, @OriginalArg(8) float arg5, @OriginalArg(10) int arg6) {
		@Pc(13) int local13 = (int) ((float) 128 * arg2 - 1.0F);
		@Pc(22) int local22 = local13 & 0xFF;
		@Pc(30) int local30 = (int) (arg3 * (float) 128 - 1.0F);
		@Pc(34) int local34 = local30 & 0xFF;
		@Pc(42) int local42 = (int) ((float) 16 * arg5 - 1.0F);
		@Pc(46) int local46 = local42 & 0xFF;
		@Pc(51) float local51 = (float) arg6 * arg5;
		@Pc(54) int local54 = (int) local51;
		@Pc(58) int local58 = local54 + 1;
		@Pc(64) float local64 = (float) -local54 + local51;
		@Pc(69) float local69 = 1.0F - local64;
		@Pc(73) int local73 = local54 & local46;
		@Pc(77) float local77 = Static237.method3234(local64);
		@Pc(81) int local81 = local58 & local46;
		@Pc(86) int local86 = this.anIntArray133[local73];
		@Pc(91) int local91 = this.anIntArray133[local81];
		for (@Pc(93) int local93 = 0; local93 < 128; local93++) {
			@Pc(100) float local100 = arg3 * (float) local93;
			@Pc(103) int local103 = (int) local100;
			@Pc(107) int local107 = local103 + 1;
			@Pc(112) float local112 = local100 - (float) local103;
			@Pc(116) float local116 = 1.0F - local112;
			@Pc(120) float local120 = Static237.method3234(local112);
			@Pc(124) int local124 = local107 & local34;
			@Pc(128) int local128 = local103 & local34;
			@Pc(135) int local135 = this.anIntArray133[local86 + local128];
			@Pc(142) int local142 = this.anIntArray133[local124 + local86];
			@Pc(150) int local150 = this.anIntArray133[local128 + local91];
			@Pc(157) int local157 = this.anIntArray133[local91 + local124];
			for (@Pc(159) int local159 = 0; local159 < 128; local159++) {
				@Pc(166) float local166 = arg2 * (float) local159;
				@Pc(169) int local169 = (int) local166;
				@Pc(173) int local173 = local169 + 1;
				@Pc(178) float local178 = local166 - (float) local169;
				@Pc(183) float local183 = 1.0F - local178;
				@Pc(187) float local187 = Static237.method3234(local178);
				@Pc(191) int local191 = local169 & local22;
				@Pc(195) int local195 = local173 & local22;
				arg1[arg4++] = arg0 * Static98.method1708(local77, Static98.method1708(local120, Static98.method1708(local187, Static417.method5227(local112, local64, local178, this.anIntArray133[local195 + local157] & 0x7), Static417.method5227(local112, local64, local183, this.anIntArray133[local157 + local191] & 0x7)), Static98.method1708(local187, Static417.method5227(local116, local64, local178, this.anIntArray133[local150 + local195] & 0x7), Static417.method5227(local116, local64, local183, this.anIntArray133[local191 + local150] & 0x7))), Static98.method1708(local120, Static98.method1708(local187, Static417.method5227(local112, local69, local178, this.anIntArray133[local142 + local195] & 0x7), Static417.method5227(local112, local69, local183, this.anIntArray133[local191 + local142] & 0x7)), Static98.method1708(local187, Static417.method5227(local116, local69, local178, this.anIntArray133[local195 + local135] & 0x7), Static417.method5227(local116, local69, local183, this.anIntArray133[local135 + local191] & 0x7))));
			}
		}
	}
}
