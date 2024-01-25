import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dw")
public final class Class79_Sub1 extends Class79 {

	@OriginalMember(owner = "client!dw", name = "k", descriptor = "[I")
	private final int[] anIntArray183 = new int[512];

	@OriginalMember(owner = "client!dw", name = "<init>", descriptor = "(I)V")
	public Class79_Sub1(@OriginalArg(0) int arg0) {
		@Pc(13) Random local13 = new Random((long) arg0);
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			this.anIntArray183[local15] = this.anIntArray183[local15 + 256] = local15;
		}
		for (@Pc(35) int local35 = 0; local35 < 256; local35++) {
			@Pc(42) int local42 = local13.nextInt() & 0xFF;
			@Pc(47) int local47 = this.anIntArray183[local42];
			this.anIntArray183[local42] = this.anIntArray183[local42 + 256] = this.anIntArray183[local35];
			this.anIntArray183[local35] = this.anIntArray183[local35 + 256] = local47;
		}
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(IFIBIFIFFI[F)V")
	@Override
	public void method2175(@OriginalArg(1) float arg0, @OriginalArg(4) int arg1, @OriginalArg(5) float arg2, @OriginalArg(7) float arg3, @OriginalArg(8) float arg4, @OriginalArg(9) int arg5, @OriginalArg(10) float[] arg6) {
		@Pc(13) int local13 = (int) ((float) 128 * arg0 - 1.0F);
		@Pc(17) int local17 = local13 & 0xFF;
		@Pc(25) int local25 = (int) ((float) 128 * arg4 - 1.0F);
		@Pc(29) int local29 = local25 & 0xFF;
		@Pc(37) int local37 = (int) ((float) 16 * arg3 - 1.0F);
		@Pc(41) int local41 = local37 & 0xFF;
		@Pc(46) float local46 = arg3 * (float) arg5;
		@Pc(49) int local49 = (int) local46;
		@Pc(53) int local53 = local49 + 1;
		@Pc(59) float local59 = (float) -local49 + local46;
		@Pc(64) float local64 = 1.0F - local59;
		@Pc(68) int local68 = local49 & local41;
		@Pc(72) float local72 = Static340.method5373(local59);
		@Pc(76) int local76 = local53 & local41;
		@Pc(87) int local87 = this.anIntArray183[local68];
		@Pc(92) int local92 = this.anIntArray183[local76];
		for (@Pc(94) int local94 = 0; local94 < 128; local94++) {
			@Pc(101) float local101 = arg4 * (float) local94;
			@Pc(104) int local104 = (int) local101;
			@Pc(108) int local108 = local104 + 1;
			@Pc(114) float local114 = (float) -local104 + local101;
			@Pc(119) float local119 = 1.0F - local114;
			@Pc(123) int local123 = local108 & local29;
			@Pc(127) int local127 = local104 & local29;
			@Pc(131) float local131 = Static340.method5373(local114);
			@Pc(138) int local138 = this.anIntArray183[local87 + local127];
			@Pc(146) int local146 = this.anIntArray183[local123 + local87];
			@Pc(153) int local153 = this.anIntArray183[local92 + local127];
			@Pc(160) int local160 = this.anIntArray183[local92 + local123];
			for (@Pc(162) int local162 = 0; local162 < 128; local162++) {
				@Pc(169) float local169 = (float) local162 * arg0;
				@Pc(172) int local172 = (int) local169;
				@Pc(176) int local176 = local172 + 1;
				@Pc(181) float local181 = local169 - (float) local172;
				@Pc(186) float local186 = 1.0F - local181;
				@Pc(190) int local190 = local176 & local17;
				@Pc(196) float local196 = Static340.method5373(local181);
				@Pc(200) int local200 = local172 & local17;
				arg6[arg1++] = Static373.method5924(Static373.method5924(Static373.method5924(Static301.method4870(local186, this.anIntArray183[local200 + local138] & 0x7, local64, local119), Static301.method4870(local181, this.anIntArray183[local138 + local190] & 0x7, local64, local119), local196), Static373.method5924(Static301.method4870(local186, this.anIntArray183[local146 + local200] & 0x7, local64, local114), Static301.method4870(local181, this.anIntArray183[local146 + local190] & 0x7, local64, local114), local196), local131), Static373.method5924(Static373.method5924(Static301.method4870(local186, this.anIntArray183[local200 + local153] & 0x7, local59, local119), Static301.method4870(local181, this.anIntArray183[local190 + local153] & 0x7, local59, local119), local196), Static373.method5924(Static301.method4870(local186, this.anIntArray183[local200 + local160] & 0x7, local59, local114), Static301.method4870(local181, this.anIntArray183[local160 + local190] & 0x7, local59, local114), local196), local131), local72) * arg2;
			}
		}
	}
}
