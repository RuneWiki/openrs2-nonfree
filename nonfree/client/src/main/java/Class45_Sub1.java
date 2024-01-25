import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fa")
public final class Class45_Sub1 extends Class45 {

	@OriginalMember(owner = "client!fa", name = "q", descriptor = "[I")
	private final int[] anIntArray132 = new int[512];

	@OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(I)V")
	public Class45_Sub1(@OriginalArg(0) int arg0) {
		@Pc(13) Random local13 = new Random((long) arg0);
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			this.anIntArray132[local15] = this.anIntArray132[local15 + 256] = local15;
		}
		for (@Pc(35) int local35 = 0; local35 < 256; local35++) {
			@Pc(42) int local42 = local13.nextInt() & 0xFF;
			@Pc(47) int local47 = this.anIntArray132[local42];
			this.anIntArray132[local42] = this.anIntArray132[local42 + 256] = this.anIntArray132[local35];
			this.anIntArray132[local35] = this.anIntArray132[local35 + 256] = local47;
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIFBIIFI[FFF)V")
	@Override
	public void method1836(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(6) float arg3, @OriginalArg(8) float[] arg4, @OriginalArg(9) float arg5, @OriginalArg(10) float arg6) {
		@Pc(13) int local13 = (int) (arg5 * (float) 128 - 1.0F);
		@Pc(25) int local25 = local13 & 0xFF;
		@Pc(33) int local33 = (int) ((float) 128 * arg2 - 1.0F);
		@Pc(37) int local37 = local33 & 0xFF;
		@Pc(45) int local45 = (int) ((float) 16 * arg3 - 1.0F);
		@Pc(49) int local49 = local45 & 0xFF;
		@Pc(54) float local54 = (float) arg0 * arg3;
		@Pc(57) int local57 = (int) local54;
		@Pc(61) int local61 = local57 + 1;
		@Pc(66) float local66 = local54 - (float) local57;
		@Pc(71) float local71 = 1.0F - local66;
		@Pc(75) int local75 = local61 & local49;
		@Pc(79) int local79 = local57 & local49;
		@Pc(83) float local83 = Static257.method3943(local66);
		@Pc(88) int local88 = this.anIntArray132[local79];
		@Pc(93) int local93 = this.anIntArray132[local75];
		for (@Pc(95) int local95 = 0; local95 < 128; local95++) {
			@Pc(102) float local102 = (float) local95 * arg2;
			@Pc(105) int local105 = (int) local102;
			@Pc(109) int local109 = local105 + 1;
			@Pc(114) float local114 = local102 - (float) local105;
			@Pc(118) float local118 = 1.0F - local114;
			@Pc(122) int local122 = local105 & local37;
			@Pc(126) float local126 = Static257.method3943(local114);
			@Pc(130) int local130 = local109 & local37;
			@Pc(138) int local138 = this.anIntArray132[local122 + local88];
			@Pc(146) int local146 = this.anIntArray132[local130 + local88];
			@Pc(153) int local153 = this.anIntArray132[local93 + local122];
			@Pc(160) int local160 = this.anIntArray132[local93 + local130];
			for (@Pc(162) int local162 = 0; local162 < 128; local162++) {
				@Pc(169) float local169 = arg5 * (float) local162;
				@Pc(172) int local172 = (int) local169;
				@Pc(176) int local176 = local172 + 1;
				@Pc(182) float local182 = (float) -local172 + local169;
				@Pc(186) float local186 = 1.0F - local182;
				@Pc(190) int local190 = local176 & local25;
				@Pc(194) int local194 = local172 & local25;
				@Pc(198) float local198 = Static257.method3943(local182);
				arg4[arg1++] = arg6 * Static65.method1838(Static65.method1838(Static65.method1838(Static53.method1206(local182, this.anIntArray132[local190 + local160] & 0x7, local66, local114), local198, Static53.method1206(local186, this.anIntArray132[local194 + local160] & 0x7, local66, local114)), local126, Static65.method1838(Static53.method1206(local182, this.anIntArray132[local153 + local190] & 0x7, local66, local118), local198, Static53.method1206(local186, this.anIntArray132[local194 + local153] & 0x7, local66, local118))), local83, Static65.method1838(Static65.method1838(Static53.method1206(local182, this.anIntArray132[local190 + local146] & 0x7, local71, local114), local198, Static53.method1206(local186, this.anIntArray132[local146 + local194] & 0x7, local71, local114)), local126, Static65.method1838(Static53.method1206(local182, this.anIntArray132[local138 + local190] & 0x7, local71, local118), local198, Static53.method1206(local186, this.anIntArray132[local194 + local138] & 0x7, local71, local118))));
			}
		}
	}
}
