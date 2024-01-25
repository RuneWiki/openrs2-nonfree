import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public final class Class92_Sub1 extends Class92 {

	@OriginalMember(owner = "client!gb", name = "g", descriptor = "[I")
	private final int[] anIntArray181 = new int[512];

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(I)V")
	public Class92_Sub1(@OriginalArg(0) int arg0) {
		@Pc(13) Random local13 = new Random((long) arg0);
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			this.anIntArray181[local15] = this.anIntArray181[local15 + 256] = local15;
		}
		for (@Pc(35) int local35 = 0; local35 < 256; local35++) {
			@Pc(42) int local42 = local13.nextInt() & 0xFF;
			@Pc(47) int local47 = this.anIntArray181[local42];
			this.anIntArray181[local42] = this.anIntArray181[local42 + 256] = this.anIntArray181[local35];
			this.anIntArray181[local35] = this.anIntArray181[local35 + 256] = local47;
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IFIIIFB[FFIF)V")
	@Override
	public void method1755(@OriginalArg(1) float arg0, @OriginalArg(2) int arg1, @OriginalArg(5) float arg2, @OriginalArg(7) float[] arg3, @OriginalArg(8) float arg4, @OriginalArg(9) int arg5, @OriginalArg(10) float arg6) {
		@Pc(13) int local13 = (int) (arg0 * (float) 128 - 1.0F);
		@Pc(17) int local17 = local13 & 0xFF;
		@Pc(25) int local25 = (int) (arg6 * (float) 128 - 1.0F);
		@Pc(29) int local29 = local25 & 0xFF;
		@Pc(37) int local37 = (int) (arg4 * (float) 16 - 1.0F);
		@Pc(41) int local41 = local37 & 0xFF;
		@Pc(46) float local46 = arg4 * (float) arg5;
		@Pc(49) int local49 = (int) local46;
		@Pc(53) int local53 = local49 + 1;
		@Pc(59) float local59 = (float) -local49 + local46;
		@Pc(64) float local64 = 1.0F - local59;
		@Pc(68) int local68 = local53 & local41;
		@Pc(72) float local72 = Static438.method2164(local59);
		@Pc(76) int local76 = local49 & local41;
		@Pc(81) int local81 = this.anIntArray181[local76];
		@Pc(86) int local86 = this.anIntArray181[local68];
		for (@Pc(88) int local88 = 0; local88 < 128; local88++) {
			@Pc(103) float local103 = (float) local88 * arg6;
			@Pc(106) int local106 = (int) local103;
			@Pc(110) int local110 = local106 + 1;
			@Pc(115) float local115 = local103 - (float) local106;
			@Pc(119) float local119 = 1.0F - local115;
			@Pc(123) int local123 = local110 & local29;
			@Pc(127) float local127 = Static438.method2164(local115);
			@Pc(131) int local131 = local106 & local29;
			@Pc(138) int local138 = this.anIntArray181[local81 + local131];
			@Pc(145) int local145 = this.anIntArray181[local123 + local81];
			@Pc(152) int local152 = this.anIntArray181[local86 + local131];
			@Pc(159) int local159 = this.anIntArray181[local123 + local86];
			for (@Pc(161) int local161 = 0; local161 < 128; local161++) {
				@Pc(168) float local168 = (float) local161 * arg0;
				@Pc(171) int local171 = (int) local168;
				@Pc(175) int local175 = local171 + 1;
				@Pc(180) float local180 = local168 - (float) local171;
				@Pc(185) float local185 = 1.0F - local180;
				@Pc(189) int local189 = local171 & local17;
				@Pc(193) int local193 = local175 & local17;
				@Pc(197) float local197 = Static438.method2164(local180);
				arg3[arg1++] = arg2 * Static343.method4566(Static343.method4566(Static343.method4566(Static234.method3183(local59, local115, local180, this.anIntArray181[local193 + local159] & 0x7), local197, Static234.method3183(local59, local115, local185, this.anIntArray181[local159 + local189] & 0x7)), local127, Static343.method4566(Static234.method3183(local59, local119, local180, this.anIntArray181[local152 + local193] & 0x7), local197, Static234.method3183(local59, local119, local185, this.anIntArray181[local189 + local152] & 0x7))), local72, Static343.method4566(Static343.method4566(Static234.method3183(local64, local115, local180, this.anIntArray181[local145 + local193] & 0x7), local197, Static234.method3183(local64, local115, local185, this.anIntArray181[local189 + local145] & 0x7)), local127, Static343.method4566(Static234.method3183(local64, local119, local180, this.anIntArray181[local193 + local138] & 0x7), local197, Static234.method3183(local64, local119, local185, this.anIntArray181[local138 + local189] & 0x7))));
			}
		}
	}
}
