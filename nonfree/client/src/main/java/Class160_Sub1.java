import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mj")
public final class Class160_Sub1 extends Class160 {

	@OriginalMember(owner = "client!mj", name = "e", descriptor = "[I")
	private final int[] anIntArray319 = new int[512];

	@OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(I)V")
	public Class160_Sub1(@OriginalArg(0) int arg0) {
		@Pc(13) Random local13 = new Random((long) arg0);
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			this.anIntArray319[local15] = this.anIntArray319[local15 + 256] = local15;
		}
		for (@Pc(35) int local35 = 0; local35 < 256; local35++) {
			@Pc(42) int local42 = local13.nextInt() & 0xFF;
			@Pc(47) int local47 = this.anIntArray319[local42];
			this.anIntArray319[local42] = this.anIntArray319[local42 + 256] = this.anIntArray319[local35];
			this.anIntArray319[local35] = this.anIntArray319[local35 + 256] = local47;
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(FIF[FIFIIIIF)V")
	@Override
	public void method3658(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float[] arg2, @OriginalArg(5) float arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(10) float arg6) {
		@Pc(13) int local13 = (int) ((float) 128 * arg0 - 1.0F);
		@Pc(17) int local17 = local13 & 0xFF;
		@Pc(25) int local25 = (int) ((float) 128 * arg3 - 1.0F);
		@Pc(29) int local29 = local25 & 0xFF;
		@Pc(37) int local37 = (int) ((float) 16 * arg6 - 1.0F);
		@Pc(41) int local41 = local37 & 0xFF;
		@Pc(46) float local46 = (float) arg5 * arg6;
		@Pc(49) int local49 = (int) local46;
		@Pc(53) int local53 = local49 + 1;
		@Pc(58) float local58 = local46 - (float) local49;
		@Pc(62) float local62 = 1.0F - local58;
		@Pc(66) int local66 = local53 & local41;
		@Pc(70) float local70 = Static255.method3891(local58);
		@Pc(74) int local74 = local49 & local41;
		@Pc(79) int local79 = this.anIntArray319[local74];
		@Pc(84) int local84 = this.anIntArray319[local66];
		for (@Pc(86) int local86 = 0; local86 < 128; local86++) {
			@Pc(93) float local93 = (float) local86 * arg3;
			@Pc(96) int local96 = (int) local93;
			@Pc(100) int local100 = local96 + 1;
			@Pc(105) float local105 = local93 - (float) local96;
			@Pc(109) float local109 = 1.0F - local105;
			@Pc(113) int local113 = local96 & local29;
			@Pc(117) int local117 = local100 & local29;
			@Pc(121) float local121 = Static255.method3891(local105);
			@Pc(128) int local128 = this.anIntArray319[local79 + local113];
			@Pc(135) int local135 = this.anIntArray319[local79 + local117];
			@Pc(142) int local142 = this.anIntArray319[local84 + local113];
			@Pc(149) int local149 = this.anIntArray319[local117 + local84];
			for (@Pc(151) int local151 = 0; local151 < 128; local151++) {
				@Pc(158) float local158 = arg0 * (float) local151;
				@Pc(161) int local161 = (int) local158;
				@Pc(165) int local165 = local161 + 1;
				@Pc(170) float local170 = local158 - (float) local161;
				@Pc(175) float local175 = 1.0F - local170;
				@Pc(179) int local179 = local161 & local17;
				@Pc(183) float local183 = Static255.method3891(local170);
				@Pc(187) int local187 = local165 & local17;
				arg2[arg4++] = Static274.method4071(Static274.method4071(Static274.method4071(Static444.method6004(local175, local62, this.anIntArray319[local179 + local128] & 0x7, local109), Static444.method6004(local170, local62, this.anIntArray319[local187 + local128] & 0x7, local109), local183), Static274.method4071(Static444.method6004(local175, local62, this.anIntArray319[local179 + local135] & 0x7, local105), Static444.method6004(local170, local62, this.anIntArray319[local187 + local135] & 0x7, local105), local183), local121), Static274.method4071(Static274.method4071(Static444.method6004(local175, local58, this.anIntArray319[local142 + local179] & 0x7, local109), Static444.method6004(local170, local58, this.anIntArray319[local187 + local142] & 0x7, local109), local183), Static274.method4071(Static444.method6004(local175, local58, this.anIntArray319[local179 + local149] & 0x7, local105), Static444.method6004(local170, local58, this.anIntArray319[local149 + local187] & 0x7, local105), local183), local121), local70) * arg1;
			}
		}
	}
}
