import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ft")
public final class Class43_Sub1 extends Class43 {

	@OriginalMember(owner = "client!ft", name = "e", descriptor = "[I")
	private final int[] anIntArray209 = new int[512];

	@OriginalMember(owner = "client!ft", name = "<init>", descriptor = "(I)V")
	public Class43_Sub1(@OriginalArg(0) int arg0) {
		@Pc(13) Random local13 = new Random((long) arg0);
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			this.anIntArray209[local15] = this.anIntArray209[local15 + 256] = local15;
		}
		for (@Pc(37) int local37 = 0; local37 < 256; local37++) {
			@Pc(44) int local44 = local13.nextInt() & 0xFF;
			@Pc(49) int local49 = this.anIntArray209[local44];
			this.anIntArray209[local44] = this.anIntArray209[local44 + 256] = this.anIntArray209[local37];
			this.anIntArray209[local37] = this.anIntArray209[local37 + 256] = local49;
		}
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(IZFFIIIF[FFI)V")
	@Override
	public void method2107(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3, @OriginalArg(7) float arg4, @OriginalArg(8) float[] arg5, @OriginalArg(9) float arg6) {
		@Pc(13) int local13 = (int) ((float) 128 * arg4 - 1.0F);
		@Pc(17) int local17 = local13 & 0xFF;
		@Pc(25) int local25 = (int) ((float) 128 * arg2 - 1.0F);
		@Pc(29) int local29 = local25 & 0xFF;
		@Pc(37) int local37 = (int) (arg1 * (float) 16 - 1.0F);
		@Pc(41) int local41 = local37 & 0xFF;
		@Pc(54) float local54 = (float) arg3 * arg1;
		@Pc(57) int local57 = (int) local54;
		@Pc(61) int local61 = local57 + 1;
		@Pc(67) float local67 = (float) -local57 + local54;
		@Pc(71) float local71 = 1.0F - local67;
		@Pc(75) int local75 = local61 & local41;
		@Pc(79) float local79 = Static548.method7163(local67);
		@Pc(83) int local83 = local57 & local41;
		@Pc(88) int local88 = this.anIntArray209[local83];
		@Pc(93) int local93 = this.anIntArray209[local75];
		for (@Pc(95) int local95 = 0; local95 < 128; local95++) {
			@Pc(102) float local102 = arg2 * (float) local95;
			@Pc(105) int local105 = (int) local102;
			@Pc(109) int local109 = local105 + 1;
			@Pc(114) float local114 = local102 - (float) local105;
			@Pc(118) float local118 = 1.0F - local114;
			@Pc(122) int local122 = local105 & local29;
			@Pc(126) int local126 = local109 & local29;
			@Pc(134) float local134 = Static548.method7163(local114);
			@Pc(142) int local142 = this.anIntArray209[local122 + local88];
			@Pc(149) int local149 = this.anIntArray209[local88 + local126];
			@Pc(156) int local156 = this.anIntArray209[local93 + local122];
			@Pc(164) int local164 = this.anIntArray209[local126 + local93];
			for (@Pc(166) int local166 = 0; local166 < 128; local166++) {
				@Pc(173) float local173 = (float) local166 * arg4;
				@Pc(176) int local176 = (int) local173;
				@Pc(180) int local180 = local176 + 1;
				@Pc(186) float local186 = (float) -local176 + local173;
				@Pc(190) float local190 = 1.0F - local186;
				@Pc(194) float local194 = Static548.method7163(local186);
				@Pc(198) int local198 = local176 & local17;
				@Pc(202) int local202 = local180 & local17;
				arg5[arg0++] = arg6 * Static183.method2349(local79, Static183.method2349(local134, Static183.method2349(local194, Static397.method5454(local114, local186, this.anIntArray209[local164 + local202] & 0x7, local67), Static397.method5454(local114, local190, this.anIntArray209[local198 + local164] & 0x7, local67)), Static183.method2349(local194, Static397.method5454(local118, local186, this.anIntArray209[local202 + local156] & 0x7, local67), Static397.method5454(local118, local190, this.anIntArray209[local198 + local156] & 0x7, local67))), Static183.method2349(local134, Static183.method2349(local194, Static397.method5454(local114, local186, this.anIntArray209[local202 + local149] & 0x7, local71), Static397.method5454(local114, local190, this.anIntArray209[local149 + local198] & 0x7, local71)), Static183.method2349(local194, Static397.method5454(local118, local186, this.anIntArray209[local202 + local142] & 0x7, local71), Static397.method5454(local118, local190, this.anIntArray209[local198 + local142] & 0x7, local71))));
			}
		}
	}
}
