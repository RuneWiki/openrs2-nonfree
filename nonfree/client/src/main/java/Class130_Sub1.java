import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lf")
public final class Class130_Sub1 extends Class130 {

	@OriginalMember(owner = "client!lf", name = "l", descriptor = "[I")
	private final int[] anIntArray331 = new int[512];

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(I)V")
	public Class130_Sub1(@OriginalArg(0) int arg0) {
		@Pc(13) Random local13 = new Random((long) arg0);
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			this.anIntArray331[local15] = this.anIntArray331[local15 + 256] = local15;
		}
		for (@Pc(37) int local37 = 0; local37 < 256; local37++) {
			@Pc(44) int local44 = local13.nextInt() & 0xFF;
			@Pc(49) int local49 = this.anIntArray331[local44];
			this.anIntArray331[local44] = this.anIntArray331[local44 + 256] = this.anIntArray331[local37];
			this.anIntArray331[local37] = this.anIntArray331[local37 + 256] = local49;
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "([FFIIFIIIFIF)V")
	@Override
	public void method4620(@OriginalArg(0) float[] arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3, @OriginalArg(8) float arg4, @OriginalArg(9) int arg5, @OriginalArg(10) float arg6) {
		@Pc(13) int local13 = (int) (arg4 * (float) 128 - 1.0F);
		@Pc(17) int local17 = local13 & 0xFF;
		@Pc(25) int local25 = (int) (arg1 * (float) 128 - 1.0F);
		@Pc(29) int local29 = local25 & 0xFF;
		@Pc(37) int local37 = (int) ((float) 16 * arg3 - 1.0F);
		@Pc(41) int local41 = local37 & 0xFF;
		@Pc(46) float local46 = (float) arg2 * arg3;
		@Pc(49) int local49 = (int) local46;
		@Pc(53) int local53 = local49 + 1;
		@Pc(59) float local59 = (float) -local49 + local46;
		@Pc(63) float local63 = 1.0F - local59;
		@Pc(67) int local67 = local49 & local41;
		@Pc(71) int local71 = local53 & local41;
		@Pc(75) float local75 = Static346.method5121(local59);
		@Pc(80) int local80 = this.anIntArray331[local67];
		@Pc(85) int local85 = this.anIntArray331[local71];
		for (@Pc(103) int local103 = 0; local103 < 128; local103++) {
			@Pc(110) float local110 = (float) local103 * arg1;
			@Pc(113) int local113 = (int) local110;
			@Pc(117) int local117 = local113 + 1;
			@Pc(122) float local122 = local110 - (float) local113;
			@Pc(127) float local127 = 1.0F - local122;
			@Pc(131) int local131 = local113 & local29;
			@Pc(135) float local135 = Static346.method5121(local122);
			@Pc(139) int local139 = local117 & local29;
			@Pc(146) int local146 = this.anIntArray331[local131 + local80];
			@Pc(153) int local153 = this.anIntArray331[local139 + local80];
			@Pc(160) int local160 = this.anIntArray331[local85 + local131];
			@Pc(168) int local168 = this.anIntArray331[local139 + local85];
			for (@Pc(170) int local170 = 0; local170 < 128; local170++) {
				@Pc(177) float local177 = arg4 * (float) local170;
				@Pc(180) int local180 = (int) local177;
				@Pc(184) int local184 = local180 + 1;
				@Pc(190) float local190 = (float) -local180 + local177;
				@Pc(194) float local194 = 1.0F - local190;
				@Pc(198) float local198 = Static346.method5121(local190);
				@Pc(202) int local202 = local180 & local17;
				@Pc(206) int local206 = local184 & local17;
				arg0[arg5++] = arg6 * Static554.method7509(Static554.method7509(Static554.method7509(Static374.method5443(local122, local59, this.anIntArray331[local206 + local168] & 0x7, local190), local198, Static374.method5443(local122, local59, this.anIntArray331[local202 + local168] & 0x7, local194)), local135, Static554.method7509(Static374.method5443(local127, local59, this.anIntArray331[local206 + local160] & 0x7, local190), local198, Static374.method5443(local127, local59, this.anIntArray331[local202 + local160] & 0x7, local194))), local75, Static554.method7509(Static554.method7509(Static374.method5443(local122, local63, this.anIntArray331[local206 + local153] & 0x7, local190), local198, Static374.method5443(local122, local63, this.anIntArray331[local153 + local202] & 0x7, local194)), local135, Static554.method7509(Static374.method5443(local127, local63, this.anIntArray331[local146 + local206] & 0x7, local190), local198, Static374.method5443(local127, local63, this.anIntArray331[local146 + local202] & 0x7, local194))));
			}
		}
	}
}
