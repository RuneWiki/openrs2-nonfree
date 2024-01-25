import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public final class Class185_Sub1 extends Class185 {

	@OriginalMember(owner = "client!la", name = "i", descriptor = "[I")
	private final int[] anIntArray377 = new int[512];

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "(I)V")
	public Class185_Sub1(@OriginalArg(0) int arg0) {
		@Pc(13) Random local13 = new Random((long) arg0);
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			this.anIntArray377[local15] = this.anIntArray377[local15 + 256] = local15;
		}
		for (@Pc(37) int local37 = 0; local37 < 256; local37++) {
			@Pc(44) int local44 = local13.nextInt() & 0xFF;
			@Pc(49) int local49 = this.anIntArray377[local44];
			this.anIntArray377[local44] = this.anIntArray377[local44 + 256] = this.anIntArray377[local37];
			this.anIntArray377[local37] = this.anIntArray377[local37 + 256] = local49;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIFFIFIFII[F)V")
	@Override
	public void method5469(@OriginalArg(2) float arg0, @OriginalArg(3) float arg1, @OriginalArg(4) int arg2, @OriginalArg(5) float arg3, @OriginalArg(7) float arg4, @OriginalArg(9) int arg5, @OriginalArg(10) float[] arg6) {
		@Pc(13) int local13 = (int) (arg0 * (float) 128 - 1.0F);
		@Pc(17) int local17 = local13 & 0xFF;
		@Pc(25) int local25 = (int) ((float) 128 * arg4 - 1.0F);
		@Pc(29) int local29 = local25 & 0xFF;
		@Pc(37) int local37 = (int) ((float) 16 * arg1 - 1.0F);
		@Pc(41) int local41 = local37 & 0xFF;
		@Pc(46) float local46 = (float) arg5 * arg1;
		@Pc(49) int local49 = (int) local46;
		@Pc(53) int local53 = local49 + 1;
		@Pc(58) float local58 = local46 - (float) local49;
		@Pc(63) float local63 = (float) 1 - local58;
		@Pc(67) float local67 = Static118.method2908(local58);
		@Pc(71) int local71 = local53 & local41;
		@Pc(75) int local75 = local49 & local41;
		@Pc(80) int local80 = this.anIntArray377[local75];
		@Pc(85) int local85 = this.anIntArray377[local71];
		for (@Pc(87) int local87 = 0; local87 < 128; local87++) {
			@Pc(94) float local94 = arg4 * (float) local87;
			@Pc(97) int local97 = (int) local94;
			@Pc(101) int local101 = local97 + 1;
			@Pc(107) float local107 = (float) -local97 + local94;
			@Pc(112) float local112 = 1.0F - local107;
			@Pc(118) float local118 = Static118.method2908(local107);
			@Pc(122) int local122 = local97 & local29;
			@Pc(126) int local126 = local101 & local29;
			@Pc(133) int local133 = this.anIntArray377[local80 + local122];
			@Pc(140) int local140 = this.anIntArray377[local80 + local126];
			@Pc(147) int local147 = this.anIntArray377[local122 + local85];
			@Pc(155) int local155 = this.anIntArray377[local126 + local85];
			for (@Pc(157) int local157 = 0; local157 < 128; local157++) {
				@Pc(164) float local164 = arg0 * (float) local157;
				@Pc(167) int local167 = (int) local164;
				@Pc(171) int local171 = local167 + 1;
				@Pc(176) float local176 = local164 - (float) local167;
				@Pc(180) float local180 = 1.0F - local176;
				@Pc(184) int local184 = local167 & local17;
				@Pc(188) int local188 = local171 & local17;
				@Pc(194) float local194 = Static118.method2908(local176);
				arg6[arg2++] = arg3 * Static72.method1659(Static72.method1659(Static72.method1659(Static603.method6069(local112, this.anIntArray377[local133 + local184] & 0x7, local63, local180), Static603.method6069(local112, this.anIntArray377[local188 + local133] & 0x7, local63, local176), local194), Static72.method1659(Static603.method6069(local107, this.anIntArray377[local184 + local140] & 0x7, local63, local180), Static603.method6069(local107, this.anIntArray377[local140 + local188] & 0x7, local63, local176), local194), local118), Static72.method1659(Static72.method1659(Static603.method6069(local112, this.anIntArray377[local147 + local184] & 0x7, local58, local180), Static603.method6069(local112, this.anIntArray377[local147 + local188] & 0x7, local58, local176), local194), Static72.method1659(Static603.method6069(local107, this.anIntArray377[local155 + local184] & 0x7, local58, local180), Static603.method6069(local107, this.anIntArray377[local155 + local188] & 0x7, local58, local176), local194), local118), local67);
			}
		}
	}
}
