import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kga")
public final class Class53_Sub1 extends Class53 {

	@OriginalMember(owner = "client!kga", name = "o", descriptor = "[I")
	private final int[] anIntArray269 = new int[512];

	@OriginalMember(owner = "client!kga", name = "<init>", descriptor = "(I)V")
	public Class53_Sub1(@OriginalArg(0) int arg0) {
		@Pc(13) Random local13 = new Random((long) arg0);
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			this.anIntArray269[local15] = this.anIntArray269[local15 + 256] = local15;
		}
		for (@Pc(37) int local37 = 0; local37 < 256; local37++) {
			@Pc(44) int local44 = local13.nextInt() & 0xFF;
			@Pc(49) int local49 = this.anIntArray269[local44];
			this.anIntArray269[local44] = this.anIntArray269[local44 + 256] = this.anIntArray269[local37];
			this.anIntArray269[local37] = this.anIntArray269[local37 + 256] = local49;
		}
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(IIFIFIFF[FII)V")
	@Override
	public void method5030(@OriginalArg(2) float arg0, @OriginalArg(3) int arg1, @OriginalArg(4) float arg2, @OriginalArg(5) int arg3, @OriginalArg(6) float arg4, @OriginalArg(7) float arg5, @OriginalArg(8) float[] arg6) {
		@Pc(14) int local14 = (int) ((float) 128 * arg4 - (float) 1);
		@Pc(18) int local18 = local14 & 0xFF;
		@Pc(26) int local26 = (int) (arg5 * (float) 128 - 1.0F);
		@Pc(30) int local30 = local26 & 0xFF;
		@Pc(38) int local38 = (int) ((float) 16 * arg0 - 1.0F);
		@Pc(42) int local42 = local38 & 0xFF;
		@Pc(47) float local47 = (float) arg1 * arg0;
		@Pc(50) int local50 = (int) local47;
		@Pc(54) int local54 = local50 + 1;
		@Pc(59) float local59 = local47 - (float) local50;
		@Pc(63) float local63 = 1.0F - local59;
		@Pc(67) int local67 = local50 & local42;
		@Pc(71) int local71 = local54 & local42;
		@Pc(75) float local75 = Static532.method7553(local59);
		@Pc(80) int local80 = this.anIntArray269[local67];
		@Pc(85) int local85 = this.anIntArray269[local71];
		for (@Pc(87) int local87 = 0; local87 < 128; local87++) {
			@Pc(94) float local94 = (float) local87 * arg5;
			@Pc(97) int local97 = (int) local94;
			@Pc(101) int local101 = local97 + 1;
			@Pc(107) float local107 = (float) -local97 + local94;
			@Pc(112) float local112 = 1.0F - local107;
			@Pc(118) float local118 = Static532.method7553(local107);
			@Pc(122) int local122 = local101 & local30;
			@Pc(126) int local126 = local97 & local30;
			@Pc(133) int local133 = this.anIntArray269[local80 + local126];
			@Pc(140) int local140 = this.anIntArray269[local80 + local122];
			@Pc(148) int local148 = this.anIntArray269[local126 + local85];
			@Pc(155) int local155 = this.anIntArray269[local85 + local122];
			for (@Pc(157) int local157 = 0; local157 < 128; local157++) {
				@Pc(164) float local164 = arg4 * (float) local157;
				@Pc(167) int local167 = (int) local164;
				@Pc(171) int local171 = local167 + 1;
				@Pc(176) float local176 = local164 - (float) local167;
				@Pc(181) float local181 = 1.0F - local176;
				@Pc(185) float local185 = Static532.method7553(local176);
				@Pc(189) int local189 = local167 & local18;
				@Pc(193) int local193 = local171 & local18;
				arg6[arg3++] = Static78.method2281(Static78.method2281(Static78.method2281(Static334.method5545(local181, this.anIntArray269[local133 + local189] & 0x7, local112, local63), Static334.method5545(local176, this.anIntArray269[local133 + local193] & 0x7, local112, local63), local185), Static78.method2281(Static334.method5545(local181, this.anIntArray269[local140 + local189] & 0x7, local107, local63), Static334.method5545(local176, this.anIntArray269[local193 + local140] & 0x7, local107, local63), local185), local118), Static78.method2281(Static78.method2281(Static334.method5545(local181, this.anIntArray269[local189 + local148] & 0x7, local112, local59), Static334.method5545(local176, this.anIntArray269[local148 + local193] & 0x7, local112, local59), local185), Static78.method2281(Static334.method5545(local181, this.anIntArray269[local155 + local189] & 0x7, local107, local59), Static334.method5545(local176, this.anIntArray269[local193 + local155] & 0x7, local107, local59), local185), local118), local75) * arg2;
			}
		}
	}
}
