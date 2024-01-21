import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mg")
public final class Class1_Sub2_Sub26 extends Class1_Sub2 {

	@OriginalMember(owner = "client!mg", name = "cb", descriptor = "[I")
	private int[] anIntArray363;

	@OriginalMember(owner = "client!mg", name = "eb", descriptor = "[[I")
	private int[][] anIntArrayArray24;

	@OriginalMember(owner = "client!mg", name = "mb", descriptor = "[I")
	private int[] anIntArray364;

	@OriginalMember(owner = "client!mg", name = "kb", descriptor = "I")
	private int anInt2703;

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(ZI)[I")
	private int[] method1814(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray363;
		} else if (arg0 >= this.anIntArrayArray24.length) {
			return this.anIntArray364;
		} else {
			return this.anIntArrayArray24[arg0];
		}
	}

	@OriginalMember(owner = "client!mg", name = "d", descriptor = "(I)V")
	@Override
	public void method3125() {
		if (this.anIntArrayArray24 == null) {
			this.anIntArrayArray24 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray24.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt2703 == 2) {
			this.method1819();
		}
		Static142.method2472();
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lclient!jg;II)V")
	@Override
	public void method3120(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		this.anInt2703 = arg0.method861();
		this.anIntArrayArray24 = new int[arg0.method861()][2];
		for (@Pc(29) int local29 = 0; local29 < this.anIntArrayArray24.length; local29++) {
			this.anIntArrayArray24[local29][0] = arg0.method878();
			this.anIntArrayArray24[local29][1] = arg0.method878();
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3126(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass5_39.method168(arg0);
		if (super.aClass5_39.aBoolean16) {
			@Pc(27) int[] local27 = this.method3130(0, arg0);
			@Pc(30) int local30 = this.anInt2703;
			@Pc(52) int local52;
			@Pc(50) int local50;
			@Pc(87) int[] local87;
			@Pc(92) int[] local92;
			@Pc(101) int local101;
			@Pc(105) int local105;
			@Pc(109) int local109;
			if (local30 == 2) {
				for (local30 = 0; local30 < Static110.anInt2825; local30++) {
					local50 = local27[local30];
					for (local52 = 1; this.anIntArrayArray24.length - 1 > local52 && local50 >= this.anIntArrayArray24[local52][0]; local52++) {
					}
					local87 = this.anIntArrayArray24[local52 - 1];
					local92 = this.anIntArrayArray24[local52];
					local101 = this.method1814(local52 - 2)[1];
					local105 = local87[1];
					local109 = local92[1];
					@Pc(118) int local118 = this.method1814(local52 + 1)[1];
					@Pc(136) int local136 = (local50 - local87[0] << 12) / (local92[0] - local87[0]);
					@Pc(142) int local142 = local136 * local136 >> 12;
					@Pc(147) int local147 = local109 - local101;
					@Pc(159) int local159 = local105 + local118 - local109 - local101;
					@Pc(166) int local166 = local101 - local159 - local105;
					@Pc(176) int local176 = (local136 * local159 >> 12) * local142 >> 12;
					@Pc(182) int local182 = local142 * local166 >> 12;
					@Pc(188) int local188 = local136 * local147 >> 12;
					local17[local30] = local176 + local182 + local188 + local105;
				}
			} else if (local30 == 1) {
				for (local30 = 0; local30 < Static110.anInt2825; local30++) {
					local50 = local27[local30];
					for (local52 = 1; this.anIntArrayArray24.length - 1 > local52 && this.anIntArrayArray24[local52][0] <= local50; local52++) {
					}
					local87 = this.anIntArrayArray24[local52 - 1];
					local92 = this.anIntArrayArray24[local52];
					local101 = (local50 - local87[0] << 12) / (local92[0] - local87[0]);
					local105 = 4096 - Static110.anIntArray379[local101 >> 5 & 0xFF] >> 1;
					local109 = 4096 - local105;
					local17[local30] = local109 * local87[1] + local105 * local92[1] >> 12;
				}
			} else {
				for (local30 = 0; local30 < Static110.anInt2825; local30++) {
					local50 = local27[local30];
					for (local52 = 1; local52 < this.anIntArrayArray24.length - 1 && local50 >= this.anIntArrayArray24[local52][0]; local52++) {
					}
					local87 = this.anIntArrayArray24[local52 - 1];
					local92 = this.anIntArrayArray24[local52];
					local101 = (local50 - local87[0] << 12) / (local92[0] - local87[0]);
					local105 = 4096 - local101;
					local17[local30] = local101 * local92[1] + local105 * local87[1] >> 12;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!mg", name = "f", descriptor = "(I)V")
	private void method1819() {
		@Pc(4) int[] local4 = this.anIntArrayArray24[1];
		@Pc(9) int[] local9 = this.anIntArrayArray24[0];
		@Pc(22) int[] local22 = this.anIntArrayArray24[this.anIntArrayArray24.length - 2];
		@Pc(31) int[] local31 = this.anIntArrayArray24[this.anIntArrayArray24.length - 1];
		this.anIntArray364 = new int[] { local22[0] + local22[0] - local31[0], local22[1] - (local31[1] - local22[1]) };
		this.anIntArray363 = new int[] { local9[0] + local9[0] - local4[0], local9[1] - (-local9[1] + local4[1]) };
	}
}
