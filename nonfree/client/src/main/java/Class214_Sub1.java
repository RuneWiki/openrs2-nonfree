import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mn")
public final class Class214_Sub1 extends Class214 {

	@OriginalMember(owner = "client!mn", name = "j", descriptor = "[I")
	private final int[] anIntArray458 = new int[512];

	@OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(I)V")
	public Class214_Sub1(@OriginalArg(0) int arg0) {
		@Pc(13) Random local13 = new Random((long) arg0);
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			this.anIntArray458[local15] = this.anIntArray458[local15 + 256] = local15;
		}
		for (@Pc(37) int local37 = 0; local37 < 256; local37++) {
			@Pc(44) int local44 = local13.nextInt() & 0xFF;
			@Pc(49) int local49 = this.anIntArray458[local44];
			this.anIntArray458[local44] = this.anIntArray458[local44 + 256] = this.anIntArray458[local37];
			this.anIntArray458[local37] = this.anIntArray458[local37 + 256] = local49;
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(II[FIFIFIFIF)V")
	@Override
	public void method5127(@OriginalArg(2) float[] arg0, @OriginalArg(4) float arg1, @OriginalArg(6) float arg2, @OriginalArg(7) int arg3, @OriginalArg(8) float arg4, @OriginalArg(9) int arg5, @OriginalArg(10) float arg6) {
		@Pc(13) int local13 = (int) ((float) 128 * arg6 - 1.0F);
		@Pc(17) int local17 = local13 & 0xFF;
		@Pc(25) int local25 = (int) ((float) 128 * arg2 - 1.0F);
		@Pc(29) int local29 = local25 & 0xFF;
		@Pc(37) int local37 = (int) ((float) 16 * arg1 - 1.0F);
		@Pc(41) int local41 = local37 & 0xFF;
		@Pc(46) float local46 = arg1 * (float) arg5;
		@Pc(49) int local49 = (int) local46;
		@Pc(69) int local69 = local49 + 1;
		@Pc(74) float local74 = local46 - (float) local49;
		@Pc(78) float local78 = 1.0F - local74;
		@Pc(82) int local82 = local69 & local41;
		@Pc(86) float local86 = Static200.method3625(local74);
		@Pc(90) int local90 = local49 & local41;
		@Pc(95) int local95 = this.anIntArray458[local90];
		@Pc(100) int local100 = this.anIntArray458[local82];
		for (@Pc(102) int local102 = 0; local102 < 128; local102++) {
			@Pc(109) float local109 = (float) local102 * arg2;
			@Pc(112) int local112 = (int) local109;
			@Pc(116) int local116 = local112 + 1;
			@Pc(121) float local121 = local109 - (float) local112;
			@Pc(126) float local126 = 1.0F - local121;
			@Pc(130) int local130 = local116 & local29;
			@Pc(134) float local134 = Static200.method3625(local121);
			@Pc(138) int local138 = local112 & local29;
			@Pc(145) int local145 = this.anIntArray458[local138 + local95];
			@Pc(152) int local152 = this.anIntArray458[local130 + local95];
			@Pc(159) int local159 = this.anIntArray458[local100 + local138];
			@Pc(166) int local166 = this.anIntArray458[local100 + local130];
			for (@Pc(168) int local168 = 0; local168 < 128; local168++) {
				@Pc(175) float local175 = (float) local168 * arg6;
				@Pc(178) int local178 = (int) local175;
				@Pc(182) int local182 = local178 + 1;
				@Pc(188) float local188 = (float) -local178 + local175;
				@Pc(192) float local192 = 1.0F - local188;
				@Pc(196) int local196 = local178 & local17;
				@Pc(200) int local200 = local182 & local17;
				@Pc(204) float local204 = Static200.method3625(local188);
				arg0[arg3++] = arg4 * Static81.method1764(local86, Static81.method1764(local134, Static81.method1764(local204, Static341.method5183(local192, local126, local78, this.anIntArray458[local145 + local196] & 0x7), Static341.method5183(local188, local126, local78, this.anIntArray458[local145 + local200] & 0x7)), Static81.method1764(local204, Static341.method5183(local192, local121, local78, this.anIntArray458[local152 + local196] & 0x7), Static341.method5183(local188, local121, local78, this.anIntArray458[local152 + local200] & 0x7))), Static81.method1764(local134, Static81.method1764(local204, Static341.method5183(local192, local126, local74, this.anIntArray458[local159 + local196] & 0x7), Static341.method5183(local188, local126, local74, this.anIntArray458[local159 + local200] & 0x7)), Static81.method1764(local204, Static341.method5183(local192, local121, local74, this.anIntArray458[local196 + local166] & 0x7), Static341.method5183(local188, local121, local74, this.anIntArray458[local166 + local200] & 0x7))));
			}
		}
	}
}
