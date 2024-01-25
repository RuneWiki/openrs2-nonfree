import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!so")
public final class Class126_Sub1 extends Class126 {

	@OriginalMember(owner = "client!so", name = "h", descriptor = "[I")
	private final int[] anIntArray765 = new int[512];

	@OriginalMember(owner = "client!so", name = "<init>", descriptor = "(I)V")
	public Class126_Sub1(@OriginalArg(0) int arg0) {
		@Pc(11) Random local11 = new Random((long) arg0);
		for (@Pc(13) int local13 = 0; local13 < 256; local13++) {
			this.anIntArray765[local13] = this.anIntArray765[local13 + 256] = local13;
		}
		for (@Pc(32) int local32 = 0; local32 < 256; local32++) {
			@Pc(38) int local38 = local11.nextInt() & 0xFF;
			@Pc(43) int local43 = this.anIntArray765[local38];
			this.anIntArray765[local38] = this.anIntArray765[local38 + 256] = this.anIntArray765[local32];
			this.anIntArray765[local32] = this.anIntArray765[local32 + 256] = local43;
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(FIFIIFIIF[FI)V")
	@Override
	public void method7898(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float arg4, @OriginalArg(8) float arg5, @OriginalArg(9) float[] arg6) {
		@Pc(13) int local13 = (int) (arg0 * (float) 128 - 1.0F);
		@Pc(17) int local17 = local13 & 0xFF;
		@Pc(25) int local25 = (int) (arg4 * (float) 128 - 1.0F);
		@Pc(29) int local29 = local25 & 0xFF;
		@Pc(37) int local37 = (int) ((float) 16 * arg1 - 1.0F);
		@Pc(41) int local41 = local37 & 0xFF;
		@Pc(46) float local46 = arg1 * (float) arg2;
		@Pc(49) int local49 = (int) local46;
		@Pc(53) int local53 = local49 + 1;
		@Pc(58) float local58 = local46 - (float) local49;
		@Pc(63) float local63 = 1.0F - local58;
		@Pc(67) float local67 = Static82.method1584(local58);
		@Pc(71) int local71 = local53 & local41;
		@Pc(75) int local75 = local49 & local41;
		@Pc(86) int local86 = this.anIntArray765[local75];
		@Pc(91) int local91 = this.anIntArray765[local71];
		for (@Pc(93) int local93 = 0; local93 < 128; local93++) {
			@Pc(100) float local100 = arg4 * (float) local93;
			@Pc(103) int local103 = (int) local100;
			@Pc(107) int local107 = local103 + 1;
			@Pc(113) float local113 = (float) -local103 + local100;
			@Pc(117) float local117 = 1.0F - local113;
			@Pc(121) int local121 = local107 & local29;
			@Pc(125) float local125 = Static82.method1584(local113);
			@Pc(129) int local129 = local103 & local29;
			@Pc(136) int local136 = this.anIntArray765[local86 + local129];
			@Pc(144) int local144 = this.anIntArray765[local121 + local86];
			@Pc(152) int local152 = this.anIntArray765[local129 + local91];
			@Pc(159) int local159 = this.anIntArray765[local121 + local91];
			for (@Pc(161) int local161 = 0; local161 < 128; local161++) {
				@Pc(168) float local168 = (float) local161 * arg0;
				@Pc(171) int local171 = (int) local168;
				@Pc(175) int local175 = local171 + 1;
				@Pc(181) float local181 = (float) -local171 + local168;
				@Pc(186) float local186 = 1.0F - local181;
				@Pc(190) int local190 = local171 & local17;
				@Pc(194) float local194 = Static82.method1584(local181);
				@Pc(198) int local198 = local175 & local17;
				arg6[arg3++] = arg5 * Static476.method6895(Static476.method6895(Static476.method6895(Static609.method8657(local117, local186, local63, this.anIntArray765[local136 + local190] & 0x7), local194, Static609.method8657(local117, local181, local63, this.anIntArray765[local136 + local198] & 0x7)), local125, Static476.method6895(Static609.method8657(local113, local186, local63, this.anIntArray765[local190 + local144] & 0x7), local194, Static609.method8657(local113, local181, local63, this.anIntArray765[local144 + local198] & 0x7))), local67, Static476.method6895(Static476.method6895(Static609.method8657(local117, local186, local58, this.anIntArray765[local190 + local152] & 0x7), local194, Static609.method8657(local117, local181, local58, this.anIntArray765[local198 + local152] & 0x7)), local125, Static476.method6895(Static609.method8657(local113, local186, local58, this.anIntArray765[local159 + local190] & 0x7), local194, Static609.method8657(local113, local181, local58, this.anIntArray765[local198 + local159] & 0x7))));
			}
		}
	}
}
