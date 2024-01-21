import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!m")
public final class Class3_Sub2_Sub18 extends Class3_Sub2 {

	@OriginalMember(owner = "client!m", name = "T", descriptor = "[I")
	private int[] anIntArray221;

	@OriginalMember(owner = "client!m", name = "U", descriptor = "[[I")
	private int[][] anIntArrayArray20;

	@OriginalMember(owner = "client!m", name = "ab", descriptor = "[I")
	private int[] anIntArray223;

	@OriginalMember(owner = "client!m", name = "db", descriptor = "I")
	private int anInt2133;

	@OriginalMember(owner = "client!m", name = "f", descriptor = "(I)V")
	private void method1658() {
		@Pc(8) int[] local8 = this.anIntArrayArray20[1];
		@Pc(17) int[] local17 = this.anIntArrayArray20[this.anIntArrayArray20.length - 2];
		@Pc(22) int[] local22 = this.anIntArrayArray20[0];
		@Pc(31) int[] local31 = this.anIntArrayArray20[this.anIntArrayArray20.length - 1];
		this.anIntArray223 = new int[] { local17[0] + local17[0] - local31[0], local17[1] + -local31[1] + local17[1] };
		this.anIntArray221 = new int[] { local22[0] + local22[0] - local8[0], local22[1] + -local8[1] + local22[1] };
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(IB)[I")
	@Override
	public int[] method2797(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass46_39.method1416(arg0);
		if (super.aClass46_39.aBoolean117) {
			@Pc(27) int[] local27 = this.method2787(arg0, 0);
			@Pc(30) int local30 = this.anInt2133;
			@Pc(50) int local50;
			@Pc(48) int local48;
			@Pc(81) int[] local81;
			@Pc(86) int[] local86;
			@Pc(95) int local95;
			@Pc(103) int local103;
			@Pc(99) int local99;
			if (local30 == 2) {
				for (local30 = 0; local30 < Static86.anInt1942; local30++) {
					local48 = local27[local30];
					for (local50 = 1; this.anIntArrayArray20.length - 1 > local50 && this.anIntArrayArray20[local50][0] <= local48; local50++) {
					}
					local81 = this.anIntArrayArray20[local50 - 1];
					local86 = this.anIntArrayArray20[local50];
					local95 = this.method1661(local50 - 2)[1];
					local99 = local86[1];
					local103 = local81[1];
					@Pc(112) int local112 = this.method1661(local50 + 1)[1];
					@Pc(122) int local122 = local103 + local112 - local99 - local95;
					@Pc(140) int local140 = (local48 - local81[0] << 12) / (local86[0] - local81[0]);
					@Pc(147) int local147 = local95 - local122 - local103;
					@Pc(153) int local153 = local140 * local140 >> 12;
					@Pc(157) int local157 = local99 - local95;
					@Pc(169) int local169 = (local140 * local122 >> 12) * local153 >> 12;
					@Pc(175) int local175 = local147 * local153 >> 12;
					@Pc(181) int local181 = local140 * local157 >> 12;
					local17[local30] = local103 + local181 + local169 + local175;
				}
			} else if (local30 == 1) {
				for (local30 = 0; local30 < Static86.anInt1942; local30++) {
					local48 = local27[local30];
					for (local50 = 1; this.anIntArrayArray20.length - 1 > local50 && this.anIntArrayArray20[local50][0] <= local48; local50++) {
					}
					local81 = this.anIntArrayArray20[local50 - 1];
					local86 = this.anIntArrayArray20[local50];
					local95 = (local48 - local81[0] << 12) / (local86[0] - local81[0]);
					local103 = 4096 - Static82.anIntArray188[local95 >> 5 & 0xFF] >> 1;
					local99 = 4096 - local103;
					local17[local30] = local86[1] * local103 + local81[1] * local99 >> 12;
				}
			} else {
				for (local30 = 0; local30 < Static86.anInt1942; local30++) {
					local48 = local27[local30];
					for (local50 = 1; local50 < this.anIntArrayArray20.length - 1 && local48 >= this.anIntArrayArray20[local50][0]; local50++) {
					}
					local81 = this.anIntArrayArray20[local50 - 1];
					local86 = this.anIntArrayArray20[local50];
					local95 = (local48 - local81[0] << 12) / (local86[0] - local81[0]);
					local103 = 4096 - local95;
					local17[local30] = local103 * local81[1] + local86[1] * local95 >> 12;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!m", name = "d", descriptor = "(I)V")
	@Override
	public void method2786() {
		if (this.anIntArrayArray20 == null) {
			this.anIntArrayArray20 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray20.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt2133 == 2) {
			this.method1658();
		}
		Static82.method1413();
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IZ)[I")
	private int[] method1661(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray221;
		} else if (this.anIntArrayArray20.length <= arg0) {
			return this.anIntArray223;
		} else {
			return this.anIntArrayArray20[arg0];
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Lclient!ff;BI)V")
	@Override
	public void method2789(@OriginalArg(0) Class3_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		this.anInt2133 = arg0.method1354();
		this.anIntArrayArray20 = new int[arg0.method1354()][2];
		for (@Pc(28) int local28 = 0; local28 < this.anIntArrayArray20.length; local28++) {
			this.anIntArrayArray20[local28][0] = arg0.method1359();
			this.anIntArrayArray20[local28][1] = arg0.method1359();
		}
	}
}
