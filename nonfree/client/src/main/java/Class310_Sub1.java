import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sia")
public final class Class310_Sub1 extends Class310 {

	@OriginalMember(owner = "client!sia", name = "i", descriptor = "[I")
	private final int[] anIntArray629 = new int[512];

	@OriginalMember(owner = "client!sia", name = "<init>", descriptor = "(I)V")
	public Class310_Sub1(@OriginalArg(0) int arg0) {
		@Pc(11) Random local11 = new Random((long) arg0);
		for (@Pc(13) int local13 = 0; local13 < 256; local13++) {
			this.anIntArray629[local13] = this.anIntArray629[local13 + 256] = local13;
		}
		for (@Pc(34) int local34 = 0; local34 < 256; local34++) {
			@Pc(40) int local40 = local11.nextInt() & 0xFF;
			@Pc(45) int local45 = this.anIntArray629[local40];
			this.anIntArray629[local40] = this.anIntArray629[local40 + 256] = this.anIntArray629[local34];
			this.anIntArray629[local34] = this.anIntArray629[local34 + 256] = local45;
		}
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(IBIFIFFFI[FI)V")
	@Override
	public void method7306(@OriginalArg(3) float arg0, @OriginalArg(5) float arg1, @OriginalArg(6) float arg2, @OriginalArg(7) float arg3, @OriginalArg(8) int arg4, @OriginalArg(9) float[] arg5, @OriginalArg(10) int arg6) {
		@Pc(13) int local13 = (int) (arg0 * (float) 128 - 1.0F);
		@Pc(17) int local17 = local13 & 0xFF;
		@Pc(25) int local25 = (int) ((float) 128 * arg1 - 1.0F);
		@Pc(29) int local29 = local25 & 0xFF;
		@Pc(37) int local37 = (int) (arg3 * (float) 16 - 1.0F);
		@Pc(41) int local41 = local37 & 0xFF;
		@Pc(46) float local46 = (float) arg6 * arg3;
		@Pc(49) int local49 = (int) local46;
		@Pc(53) int local53 = local49 + 1;
		@Pc(59) float local59 = (float) -local49 + local46;
		@Pc(70) float local70 = 1.0F - local59;
		@Pc(74) float local74 = Static91.method1883(local59);
		@Pc(78) int local78 = local49 & local41;
		@Pc(82) int local82 = local53 & local41;
		@Pc(87) int local87 = this.anIntArray629[local78];
		@Pc(92) int local92 = this.anIntArray629[local82];
		for (@Pc(94) int local94 = 0; local94 < 128; local94++) {
			@Pc(101) float local101 = (float) local94 * arg1;
			@Pc(104) int local104 = (int) local101;
			@Pc(108) int local108 = local104 + 1;
			@Pc(114) float local114 = (float) -local104 + local101;
			@Pc(118) float local118 = 1.0F - local114;
			@Pc(124) float local124 = Static91.method1883(local114);
			@Pc(128) int local128 = local108 & local29;
			@Pc(132) int local132 = local104 & local29;
			@Pc(139) int local139 = this.anIntArray629[local87 + local132];
			@Pc(146) int local146 = this.anIntArray629[local87 + local128];
			@Pc(154) int local154 = this.anIntArray629[local132 + local92];
			@Pc(161) int local161 = this.anIntArray629[local92 + local128];
			for (@Pc(163) int local163 = 0; local163 < 128; local163++) {
				@Pc(170) float local170 = arg0 * (float) local163;
				@Pc(173) int local173 = (int) local170;
				@Pc(177) int local177 = local173 + 1;
				@Pc(182) float local182 = local170 - (float) local173;
				@Pc(186) float local186 = 1.0F - local182;
				@Pc(190) int local190 = local177 & local17;
				@Pc(194) int local194 = local173 & local17;
				@Pc(198) float local198 = Static91.method1883(local182);
				arg5[arg4++] = Static362.method5390(Static362.method5390(Static362.method5390(Static126.method2266(local59, local114, this.anIntArray629[local161 + local190] & 0x7, local182), Static126.method2266(local59, local114, this.anIntArray629[local161 + local194] & 0x7, local186), local198), Static362.method5390(Static126.method2266(local59, local118, this.anIntArray629[local154 + local190] & 0x7, local182), Static126.method2266(local59, local118, this.anIntArray629[local194 + local154] & 0x7, local186), local198), local124), Static362.method5390(Static362.method5390(Static126.method2266(local70, local114, this.anIntArray629[local190 + local146] & 0x7, local182), Static126.method2266(local70, local114, this.anIntArray629[local194 + local146] & 0x7, local186), local198), Static362.method5390(Static126.method2266(local70, local118, this.anIntArray629[local190 + local139] & 0x7, local182), Static126.method2266(local70, local118, this.anIntArray629[local139 + local194] & 0x7, local186), local198), local124), local74) * arg2;
			}
		}
	}
}
