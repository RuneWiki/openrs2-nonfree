import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fv")
public final class Class87_Sub1 extends Class87 {

	@OriginalMember(owner = "client!fv", name = "o", descriptor = "[I")
	private final int[] anIntArray210 = new int[512];

	@OriginalMember(owner = "client!fv", name = "<init>", descriptor = "(I)V")
	public Class87_Sub1(@OriginalArg(0) int arg0) {
		@Pc(13) Random local13 = new Random((long) arg0);
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			this.anIntArray210[local15] = this.anIntArray210[local15 + 256] = local15;
		}
		for (@Pc(35) int local35 = 0; local35 < 256; local35++) {
			@Pc(42) int local42 = local13.nextInt() & 0xFF;
			@Pc(47) int local47 = this.anIntArray210[local42];
			this.anIntArray210[local42] = this.anIntArray210[local42 + 256] = this.anIntArray210[local35];
			this.anIntArray210[local35] = this.anIntArray210[local35 + 256] = local47;
		}
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(IIIIF[FFIIFF)V")
	@Override
	public void method2089(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) float arg2, @OriginalArg(5) float[] arg3, @OriginalArg(6) float arg4, @OriginalArg(9) float arg5, @OriginalArg(10) float arg6) {
		@Pc(13) int local13 = (int) (arg2 * (float) 128 - 1.0F);
		@Pc(17) int local17 = local13 & 0xFF;
		@Pc(25) int local25 = (int) ((float) 128 * arg5 - 1.0F);
		@Pc(29) int local29 = local25 & 0xFF;
		@Pc(37) int local37 = (int) (arg4 * (float) 16 - 1.0F);
		@Pc(41) int local41 = local37 & 0xFF;
		@Pc(46) float local46 = arg4 * (float) arg0;
		@Pc(49) int local49 = (int) local46;
		@Pc(53) int local53 = local49 + 1;
		@Pc(58) float local58 = local46 - (float) local49;
		@Pc(63) float local63 = 1.0F - local58;
		@Pc(72) float local72 = Static20.method456(local58);
		@Pc(76) int local76 = local49 & local41;
		@Pc(80) int local80 = local53 & local41;
		@Pc(85) int local85 = this.anIntArray210[local76];
		@Pc(90) int local90 = this.anIntArray210[local80];
		for (@Pc(92) int local92 = 0; local92 < 128; local92++) {
			@Pc(99) float local99 = arg5 * (float) local92;
			@Pc(102) int local102 = (int) local99;
			@Pc(106) int local106 = local102 + 1;
			@Pc(111) float local111 = local99 - (float) local102;
			@Pc(115) float local115 = 1.0F - local111;
			@Pc(119) float local119 = Static20.method456(local111);
			@Pc(123) int local123 = local102 & local29;
			@Pc(127) int local127 = local106 & local29;
			@Pc(134) int local134 = this.anIntArray210[local85 + local123];
			@Pc(142) int local142 = this.anIntArray210[local127 + local85];
			@Pc(149) int local149 = this.anIntArray210[local90 + local123];
			@Pc(156) int local156 = this.anIntArray210[local127 + local90];
			for (@Pc(158) int local158 = 0; local158 < 128; local158++) {
				@Pc(165) float local165 = arg2 * (float) local158;
				@Pc(168) int local168 = (int) local165;
				@Pc(172) int local172 = local168 + 1;
				@Pc(178) float local178 = (float) -local168 + local165;
				@Pc(183) float local183 = 1.0F - local178;
				@Pc(187) int local187 = local172 & local17;
				@Pc(191) int local191 = local168 & local17;
				@Pc(195) float local195 = Static20.method456(local178);
				arg3[arg1++] = arg6 * Static372.method2350(Static372.method2350(Static372.method2350(Static244.method5557(this.anIntArray210[local156 + local187] & 0x7, local111, local58, local178), Static244.method5557(this.anIntArray210[local156 + local191] & 0x7, local111, local58, local183), local195), Static372.method2350(Static244.method5557(this.anIntArray210[local149 + local187] & 0x7, local115, local58, local178), Static244.method5557(this.anIntArray210[local191 + local149] & 0x7, local115, local58, local183), local195), local119), Static372.method2350(Static372.method2350(Static244.method5557(this.anIntArray210[local142 + local187] & 0x7, local111, local63, local178), Static244.method5557(this.anIntArray210[local191 + local142] & 0x7, local111, local63, local183), local195), Static372.method2350(Static244.method5557(this.anIntArray210[local134 + local187] & 0x7, local115, local63, local178), Static244.method5557(this.anIntArray210[local134 + local191] & 0x7, local115, local63, local183), local195), local119), local72);
			}
		}
	}
}
