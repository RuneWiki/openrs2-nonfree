import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gh")
public final class Class104_Sub1 extends Class104 {

	@OriginalMember(owner = "client!gh", name = "m", descriptor = "[I")
	private final int[] anIntArray273 = new int[512];

	@OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(I)V")
	public Class104_Sub1(@OriginalArg(0) int arg0) {
		@Pc(11) Random local11 = new Random((long) arg0);
		for (@Pc(13) int local13 = 0; local13 < 256; local13++) {
			this.anIntArray273[local13] = this.anIntArray273[local13 + 256] = local13;
		}
		for (@Pc(34) int local34 = 0; local34 < 256; local34++) {
			@Pc(40) int local40 = local11.nextInt() & 0xFF;
			@Pc(45) int local45 = this.anIntArray273[local40];
			this.anIntArray273[local40] = this.anIntArray273[local40 + 256] = this.anIntArray273[local34];
			this.anIntArray273[local34] = this.anIntArray273[local34 + 256] = local45;
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "([FIFIIIIZFFF)V")
	@Override
	public void method3136(@OriginalArg(0) float[] arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(8) float arg4, @OriginalArg(9) float arg5, @OriginalArg(10) float arg6) {
		@Pc(13) int local13 = (int) (arg6 * (float) 128 - 1.0F);
		@Pc(17) int local17 = local13 & 0xFF;
		@Pc(25) int local25 = (int) (arg5 * (float) 128 - 1.0F);
		@Pc(29) int local29 = local25 & 0xFF;
		@Pc(37) int local37 = (int) ((float) 16 * arg1 - 1.0F);
		@Pc(41) int local41 = local37 & 0xFF;
		@Pc(46) float local46 = (float) arg3 * arg1;
		@Pc(49) int local49 = (int) local46;
		@Pc(53) int local53 = local49 + 1;
		@Pc(59) float local59 = (float) -local49 + local46;
		@Pc(63) float local63 = 1.0F - local59;
		@Pc(67) float local67 = Static80.method2004(local59);
		@Pc(71) int local71 = local53 & local41;
		@Pc(75) int local75 = local49 & local41;
		@Pc(80) int local80 = this.anIntArray273[local75];
		@Pc(85) int local85 = this.anIntArray273[local71];
		for (@Pc(87) int local87 = 0; local87 < 128; local87++) {
			@Pc(99) float local99 = (float) local87 * arg5;
			@Pc(102) int local102 = (int) local99;
			@Pc(106) int local106 = local102 + 1;
			@Pc(111) float local111 = local99 - (float) local102;
			@Pc(115) float local115 = 1.0F - local111;
			@Pc(119) int local119 = local102 & local29;
			@Pc(123) float local123 = Static80.method2004(local111);
			@Pc(127) int local127 = local106 & local29;
			@Pc(134) int local134 = this.anIntArray273[local80 + local119];
			@Pc(142) int local142 = this.anIntArray273[local127 + local80];
			@Pc(149) int local149 = this.anIntArray273[local119 + local85];
			@Pc(156) int local156 = this.anIntArray273[local127 + local85];
			for (@Pc(158) int local158 = 0; local158 < 128; local158++) {
				@Pc(165) float local165 = (float) local158 * arg6;
				@Pc(168) int local168 = (int) local165;
				@Pc(172) int local172 = local168 + 1;
				@Pc(178) float local178 = (float) -local168 + local165;
				@Pc(182) float local182 = 1.0F - local178;
				@Pc(186) int local186 = local168 & local17;
				@Pc(190) float local190 = Static80.method2004(local178);
				@Pc(194) int local194 = local172 & local17;
				arg0[arg2++] = arg4 * Static388.method5857(Static388.method5857(Static388.method5857(Static416.method6209(local111, local59, this.anIntArray273[local156 + local194] & 0x7, local178), local190, Static416.method6209(local111, local59, this.anIntArray273[local156 + local186] & 0x7, local182)), local123, Static388.method5857(Static416.method6209(local115, local59, this.anIntArray273[local194 + local149] & 0x7, local178), local190, Static416.method6209(local115, local59, this.anIntArray273[local186 + local149] & 0x7, local182))), local67, Static388.method5857(Static388.method5857(Static416.method6209(local111, local63, this.anIntArray273[local194 + local142] & 0x7, local178), local190, Static416.method6209(local111, local63, this.anIntArray273[local186 + local142] & 0x7, local182)), local123, Static388.method5857(Static416.method6209(local115, local63, this.anIntArray273[local194 + local134] & 0x7, local178), local190, Static416.method6209(local115, local63, this.anIntArray273[local134 + local186] & 0x7, local182))));
			}
		}
	}
}
