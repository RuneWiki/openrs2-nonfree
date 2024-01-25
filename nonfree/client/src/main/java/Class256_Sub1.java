import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pf")
public final class Class256_Sub1 extends Class256 {

	@OriginalMember(owner = "client!pf", name = "m", descriptor = "[I")
	private final int[] anIntArray528 = new int[512];

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(I)V")
	public Class256_Sub1(@OriginalArg(0) int arg0) {
		@Pc(11) Random local11 = new Random((long) arg0);
		for (@Pc(13) int local13 = 0; local13 < 256; local13++) {
			this.anIntArray528[local13] = this.anIntArray528[local13 + 256] = local13;
		}
		for (@Pc(34) int local34 = 0; local34 < 256; local34++) {
			@Pc(40) int local40 = local11.nextInt() & 0xFF;
			@Pc(45) int local45 = this.anIntArray528[local40];
			this.anIntArray528[local40] = this.anIntArray528[local40 + 256] = this.anIntArray528[local34];
			this.anIntArray528[local34] = this.anIntArray528[local34 + 256] = local45;
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(FIII[FIFFBFI)V")
	@Override
	public void method6433(@OriginalArg(0) float arg0, @OriginalArg(2) int arg1, @OriginalArg(4) float[] arg2, @OriginalArg(5) int arg3, @OriginalArg(6) float arg4, @OriginalArg(7) float arg5, @OriginalArg(9) float arg6) {
		@Pc(13) int local13 = (int) ((float) 128 * arg0 - 1.0F);
		@Pc(17) int local17 = local13 & 0xFF;
		@Pc(25) int local25 = (int) (arg4 * (float) 128 - 1.0F);
		@Pc(29) int local29 = local25 & 0xFF;
		@Pc(37) int local37 = (int) ((float) 16 * arg6 - 1.0F);
		@Pc(41) int local41 = local37 & 0xFF;
		@Pc(46) float local46 = (float) arg3 * arg6;
		@Pc(49) int local49 = (int) local46;
		@Pc(57) int local57 = local49 + 1;
		@Pc(62) float local62 = local46 - (float) local49;
		@Pc(67) float local67 = 1.0F - local62;
		@Pc(71) int local71 = local49 & local41;
		@Pc(75) int local75 = local57 & local41;
		@Pc(79) float local79 = Static172.method3186(local62);
		@Pc(84) int local84 = this.anIntArray528[local71];
		@Pc(89) int local89 = this.anIntArray528[local75];
		for (@Pc(91) int local91 = 0; local91 < 128; local91++) {
			@Pc(98) float local98 = (float) local91 * arg4;
			@Pc(101) int local101 = (int) local98;
			@Pc(105) int local105 = local101 + 1;
			@Pc(111) float local111 = (float) -local101 + local98;
			@Pc(115) float local115 = 1.0F - local111;
			@Pc(119) int local119 = local105 & local29;
			@Pc(123) int local123 = local101 & local29;
			@Pc(127) float local127 = Static172.method3186(local111);
			@Pc(135) int local135 = this.anIntArray528[local123 + local84];
			@Pc(142) int local142 = this.anIntArray528[local119 + local84];
			@Pc(149) int local149 = this.anIntArray528[local89 + local123];
			@Pc(156) int local156 = this.anIntArray528[local89 + local119];
			for (@Pc(158) int local158 = 0; local158 < 128; local158++) {
				@Pc(165) float local165 = (float) local158 * arg0;
				@Pc(168) int local168 = (int) local165;
				@Pc(172) int local172 = local168 + 1;
				@Pc(178) float local178 = (float) -local168 + local165;
				@Pc(182) float local182 = 1.0F - local178;
				@Pc(186) float local186 = Static172.method3186(local178);
				@Pc(190) int local190 = local168 & local17;
				@Pc(194) int local194 = local172 & local17;
				arg2[arg1++] = arg5 * Static427.method6423(Static427.method6423(Static427.method6423(Static268.method4323(local62, this.anIntArray528[local156 + local194] & 0x7, local178, local111), local186, Static268.method4323(local62, this.anIntArray528[local190 + local156] & 0x7, local182, local111)), local127, Static427.method6423(Static268.method4323(local62, this.anIntArray528[local149 + local194] & 0x7, local178, local115), local186, Static268.method4323(local62, this.anIntArray528[local149 + local190] & 0x7, local182, local115))), local79, Static427.method6423(Static427.method6423(Static268.method4323(local67, this.anIntArray528[local142 + local194] & 0x7, local178, local111), local186, Static268.method4323(local67, this.anIntArray528[local142 + local190] & 0x7, local182, local111)), local127, Static427.method6423(Static268.method4323(local67, this.anIntArray528[local135 + local194] & 0x7, local178, local115), local186, Static268.method4323(local67, this.anIntArray528[local135 + local190] & 0x7, local182, local115))));
			}
		}
	}
}
