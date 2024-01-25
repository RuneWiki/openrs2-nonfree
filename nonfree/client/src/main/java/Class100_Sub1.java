import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fg")
public final class Class100_Sub1 extends Class100 {

	@OriginalMember(owner = "client!fg", name = "n", descriptor = "[I")
	private final int[] anIntArray134 = new int[512];

	@OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(I)V")
	public Class100_Sub1(@OriginalArg(0) int arg0) {
		@Pc(13) Random local13 = new Random((long) arg0);
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			this.anIntArray134[local15] = this.anIntArray134[local15 + 256] = local15;
		}
		for (@Pc(37) int local37 = 0; local37 < 256; local37++) {
			@Pc(44) int local44 = local13.nextInt() & 0xFF;
			@Pc(49) int local49 = this.anIntArray134[local44];
			this.anIntArray134[local44] = this.anIntArray134[local44 + 256] = this.anIntArray134[local37];
			this.anIntArray134[local37] = this.anIntArray134[local37 + 256] = local49;
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(FFIIFIIIFI[F)V")
	@Override
	public void method2694(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3, @OriginalArg(7) int arg4, @OriginalArg(8) float arg5, @OriginalArg(10) float[] arg6) {
		@Pc(13) int local13 = (int) ((float) 128 * arg1 - 1.0F);
		@Pc(17) int local17 = local13 & 0xFF;
		@Pc(26) int local26 = (int) ((float) -1 + arg5 * (float) 128);
		@Pc(30) int local30 = local26 & 0xFF;
		@Pc(38) int local38 = (int) ((float) 16 * arg3 - 1.0F);
		@Pc(42) int local42 = local38 & 0xFF;
		@Pc(47) float local47 = arg3 * (float) arg4;
		@Pc(50) int local50 = (int) local47;
		@Pc(54) int local54 = local50 + 1;
		@Pc(60) float local60 = (float) -local50 + local47;
		@Pc(65) float local65 = 1.0F - local60;
		@Pc(69) int local69 = local50 & local42;
		@Pc(73) int local73 = local54 & local42;
		@Pc(77) float local77 = Static264.method4447(local60);
		@Pc(82) int local82 = this.anIntArray134[local69];
		@Pc(87) int local87 = this.anIntArray134[local73];
		for (@Pc(89) int local89 = 0; local89 < 128; local89++) {
			@Pc(96) float local96 = (float) local89 * arg5;
			@Pc(99) int local99 = (int) local96;
			@Pc(103) int local103 = local99 + 1;
			@Pc(109) float local109 = (float) -local99 + local96;
			@Pc(114) float local114 = 1.0F - local109;
			@Pc(118) int local118 = local99 & local30;
			@Pc(122) float local122 = Static264.method4447(local109);
			@Pc(126) int local126 = local103 & local30;
			@Pc(133) int local133 = this.anIntArray134[local82 + local118];
			@Pc(140) int local140 = this.anIntArray134[local82 + local126];
			@Pc(147) int local147 = this.anIntArray134[local87 + local118];
			@Pc(154) int local154 = this.anIntArray134[local87 + local126];
			for (@Pc(156) int local156 = 0; local156 < 128; local156++) {
				@Pc(163) float local163 = (float) local156 * arg1;
				@Pc(166) int local166 = (int) local163;
				@Pc(170) int local170 = local166 + 1;
				@Pc(176) float local176 = (float) -local166 + local163;
				@Pc(180) float local180 = 1.0F - local176;
				@Pc(184) float local184 = Static264.method4447(local176);
				@Pc(188) int local188 = local166 & local17;
				@Pc(192) int local192 = local170 & local17;
				arg6[arg2++] = Static458.method6990(local77, Static458.method6990(local122, Static458.method6990(local184, Static149.method2823(this.anIntArray134[local154 + local192] & 0x7, local60, local176, local109), Static149.method2823(this.anIntArray134[local188 + local154] & 0x7, local60, local180, local109)), Static458.method6990(local184, Static149.method2823(this.anIntArray134[local147 + local192] & 0x7, local60, local176, local114), Static149.method2823(this.anIntArray134[local188 + local147] & 0x7, local60, local180, local114))), Static458.method6990(local122, Static458.method6990(local184, Static149.method2823(this.anIntArray134[local140 + local192] & 0x7, local65, local176, local109), Static149.method2823(this.anIntArray134[local140 + local188] & 0x7, local65, local180, local109)), Static458.method6990(local184, Static149.method2823(this.anIntArray134[local133 + local192] & 0x7, local65, local176, local114), Static149.method2823(this.anIntArray134[local133 + local188] & 0x7, local65, local180, local114)))) * arg0;
			}
		}
	}
}
