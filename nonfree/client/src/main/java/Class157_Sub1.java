import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jt")
public final class Class157_Sub1 extends Class157 {

	@OriginalMember(owner = "client!jt", name = "e", descriptor = "[I")
	private final int[] anIntArray351 = new int[512];

	@OriginalMember(owner = "client!jt", name = "<init>", descriptor = "(I)V")
	public Class157_Sub1(@OriginalArg(0) int arg0) {
		@Pc(13) Random local13 = new Random((long) arg0);
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			this.anIntArray351[local15] = this.anIntArray351[local15 + 256] = local15;
		}
		for (@Pc(37) int local37 = 0; local37 < 256; local37++) {
			@Pc(44) int local44 = local13.nextInt() & 0xFF;
			@Pc(49) int local49 = this.anIntArray351[local44];
			this.anIntArray351[local44] = this.anIntArray351[local44 + 256] = this.anIntArray351[local37];
			this.anIntArray351[local37] = this.anIntArray351[local37 + 256] = local49;
		}
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(IIFFIIFIIF[F)V")
	@Override
	public void method4199(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3, @OriginalArg(6) float arg4, @OriginalArg(9) float arg5, @OriginalArg(10) float[] arg6) {
		@Pc(13) int local13 = (int) (arg4 * (float) 128 - 1.0F);
		@Pc(17) int local17 = local13 & 0xFF;
		@Pc(26) int local26 = (int) ((float) 128 * arg5 - (float) 1);
		@Pc(30) int local30 = local26 & 0xFF;
		@Pc(38) int local38 = (int) (arg2 * (float) 16 - 1.0F);
		@Pc(42) int local42 = local38 & 0xFF;
		@Pc(47) float local47 = arg2 * (float) arg3;
		@Pc(50) int local50 = (int) local47;
		@Pc(54) int local54 = local50 + 1;
		@Pc(60) float local60 = (float) -local50 + local47;
		@Pc(65) float local65 = 1.0F - local60;
		@Pc(69) int local69 = local54 & local42;
		@Pc(73) float local73 = Static271.method4829(local60);
		@Pc(77) int local77 = local50 & local42;
		@Pc(82) int local82 = this.anIntArray351[local77];
		@Pc(87) int local87 = this.anIntArray351[local69];
		for (@Pc(89) int local89 = 0; local89 < 128; local89++) {
			@Pc(96) float local96 = arg5 * (float) local89;
			@Pc(99) int local99 = (int) local96;
			@Pc(103) int local103 = local99 + 1;
			@Pc(108) float local108 = local96 - (float) local99;
			@Pc(112) float local112 = 1.0F - local108;
			@Pc(116) int local116 = local99 & local30;
			@Pc(120) int local120 = local103 & local30;
			@Pc(124) float local124 = Static271.method4829(local108);
			@Pc(131) int local131 = this.anIntArray351[local116 + local82];
			@Pc(138) int local138 = this.anIntArray351[local120 + local82];
			@Pc(145) int local145 = this.anIntArray351[local87 + local116];
			@Pc(152) int local152 = this.anIntArray351[local87 + local120];
			for (@Pc(154) int local154 = 0; local154 < 128; local154++) {
				@Pc(161) float local161 = (float) local154 * arg4;
				@Pc(164) int local164 = (int) local161;
				@Pc(168) int local168 = local164 + 1;
				@Pc(173) float local173 = local161 - (float) local164;
				@Pc(177) float local177 = 1.0F - local173;
				@Pc(181) float local181 = Static271.method4829(local173);
				@Pc(185) int local185 = local164 & local17;
				@Pc(189) int local189 = local168 & local17;
				arg6[arg0++] = arg1 * Static42.method1216(local73, Static42.method1216(local124, Static42.method1216(local181, Static153.method2820(local60, local173, this.anIntArray351[local189 + local152] & 0x7, local108), Static153.method2820(local60, local177, this.anIntArray351[local185 + local152] & 0x7, local108)), Static42.method1216(local181, Static153.method2820(local60, local173, this.anIntArray351[local189 + local145] & 0x7, local112), Static153.method2820(local60, local177, this.anIntArray351[local145 + local185] & 0x7, local112))), Static42.method1216(local124, Static42.method1216(local181, Static153.method2820(local65, local173, this.anIntArray351[local138 + local189] & 0x7, local108), Static153.method2820(local65, local177, this.anIntArray351[local185 + local138] & 0x7, local108)), Static42.method1216(local181, Static153.method2820(local65, local173, this.anIntArray351[local189 + local131] & 0x7, local112), Static153.method2820(local65, local177, this.anIntArray351[local131 + local185] & 0x7, local112))));
			}
		}
	}
}
