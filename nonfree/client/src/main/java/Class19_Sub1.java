import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rv")
public final class Class19_Sub1 extends Class19 {

	@OriginalMember(owner = "client!rv", name = "n", descriptor = "[I")
	private final int[] anIntArray606 = new int[512];

	@OriginalMember(owner = "client!rv", name = "<init>", descriptor = "(I)V")
	public Class19_Sub1(@OriginalArg(0) int arg0) {
		@Pc(13) Random local13 = new Random((long) arg0);
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			this.anIntArray606[local15] = this.anIntArray606[local15 + 256] = local15;
		}
		for (@Pc(37) int local37 = 0; local37 < 256; local37++) {
			@Pc(44) int local44 = local13.nextInt() & 0xFF;
			@Pc(49) int local49 = this.anIntArray606[local44];
			this.anIntArray606[local44] = this.anIntArray606[local44 + 256] = this.anIntArray606[local37];
			this.anIntArray606[local37] = this.anIntArray606[local37 + 256] = local49;
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(IIZIF[FFFIFI)V")
	@Override
	public void method6668(@OriginalArg(0) int arg0, @OriginalArg(4) float arg1, @OriginalArg(5) float[] arg2, @OriginalArg(6) float arg3, @OriginalArg(7) float arg4, @OriginalArg(8) int arg5, @OriginalArg(9) float arg6) {
		@Pc(13) int local13 = (int) ((float) 128 * arg4 - 1.0F);
		@Pc(17) int local17 = local13 & 0xFF;
		@Pc(30) int local30 = (int) (arg1 * (float) 128 - 1.0F);
		@Pc(34) int local34 = local30 & 0xFF;
		@Pc(42) int local42 = (int) ((float) 16 * arg3 - 1.0F);
		@Pc(46) int local46 = local42 & 0xFF;
		@Pc(51) float local51 = arg3 * (float) arg5;
		@Pc(54) int local54 = (int) local51;
		@Pc(58) int local58 = local54 + 1;
		@Pc(64) float local64 = (float) -local54 + local51;
		@Pc(68) float local68 = 1.0F - local64;
		@Pc(72) int local72 = local58 & local46;
		@Pc(76) float local76 = Static523.method7751(local64);
		@Pc(80) int local80 = local54 & local46;
		@Pc(85) int local85 = this.anIntArray606[local80];
		@Pc(90) int local90 = this.anIntArray606[local72];
		for (@Pc(92) int local92 = 0; local92 < 128; local92++) {
			@Pc(99) float local99 = arg1 * (float) local92;
			@Pc(102) int local102 = (int) local99;
			@Pc(106) int local106 = local102 + 1;
			@Pc(111) float local111 = local99 - (float) local102;
			@Pc(115) float local115 = 1.0F - local111;
			@Pc(119) int local119 = local106 & local34;
			@Pc(123) float local123 = Static523.method7751(local111);
			@Pc(127) int local127 = local102 & local34;
			@Pc(134) int local134 = this.anIntArray606[local85 + local127];
			@Pc(141) int local141 = this.anIntArray606[local85 + local119];
			@Pc(149) int local149 = this.anIntArray606[local127 + local90];
			@Pc(156) int local156 = this.anIntArray606[local90 + local119];
			for (@Pc(158) int local158 = 0; local158 < 128; local158++) {
				@Pc(165) float local165 = arg4 * (float) local158;
				@Pc(168) int local168 = (int) local165;
				@Pc(172) int local172 = local168 + 1;
				@Pc(177) float local177 = local165 - (float) local168;
				@Pc(182) float local182 = 1.0F - local177;
				@Pc(186) float local186 = Static523.method7751(local177);
				@Pc(190) int local190 = local172 & local17;
				@Pc(194) int local194 = local168 & local17;
				arg2[arg0++] = arg6 * Static436.method6644(Static436.method6644(Static436.method6644(Static460.method6601(local182, this.anIntArray606[local194 + local134] & 0x7, local68, local115), local186, Static460.method6601(local177, this.anIntArray606[local190 + local134] & 0x7, local68, local115)), local123, Static436.method6644(Static460.method6601(local182, this.anIntArray606[local141 + local194] & 0x7, local68, local111), local186, Static460.method6601(local177, this.anIntArray606[local190 + local141] & 0x7, local68, local111))), local76, Static436.method6644(Static436.method6644(Static460.method6601(local182, this.anIntArray606[local194 + local149] & 0x7, local64, local115), local186, Static460.method6601(local177, this.anIntArray606[local149 + local190] & 0x7, local64, local115)), local123, Static436.method6644(Static460.method6601(local182, this.anIntArray606[local194 + local156] & 0x7, local64, local111), local186, Static460.method6601(local177, this.anIntArray606[local190 + local156] & 0x7, local64, local111))));
			}
		}
	}
}
