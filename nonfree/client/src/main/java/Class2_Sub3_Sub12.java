import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ih")
public final class Class2_Sub3_Sub12 extends Class2_Sub3 {

	@OriginalMember(owner = "client!ih", name = "ob", descriptor = "[I")
	private int[] anIntArray192;

	@OriginalMember(owner = "client!ih", name = "pb", descriptor = "[I")
	private int[] anIntArray193;

	@OriginalMember(owner = "client!ih", name = "ub", descriptor = "[[I")
	private int[][] anIntArrayArray16;

	@OriginalMember(owner = "client!ih", name = "tb", descriptor = "I")
	private int anInt2018;

	@OriginalMember(owner = "client!ih", name = "d", descriptor = "(Z)V")
	private void method1404() {
		@Pc(12) int[] local12 = this.anIntArrayArray16[1];
		@Pc(21) int[] local21 = this.anIntArrayArray16[this.anIntArrayArray16.length - 2];
		@Pc(30) int[] local30 = this.anIntArrayArray16[this.anIntArrayArray16.length - 1];
		@Pc(35) int[] local35 = this.anIntArrayArray16[0];
		this.anIntArray193 = new int[] { local35[0] + local35[0] - local12[0], -local12[1] - -local35[1] + local35[1] };
		this.anIntArray192 = new int[] { local21[0] + local21[0] - local30[0], -local30[1] + local21[1] + local21[1] };
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method2889(@OriginalArg(1) int arg0) {
		@Pc(15) int[] local15 = super.aClass33_39.method1306(arg0);
		if (super.aClass33_39.aBoolean93) {
			@Pc(25) int[] local25 = this.method2901(0, arg0);
			@Pc(28) int local28 = this.anInt2018;
			@Pc(46) int local46;
			@Pc(44) int local44;
			@Pc(77) int[] local77;
			@Pc(82) int[] local82;
			@Pc(91) int local91;
			@Pc(95) int local95;
			@Pc(99) int local99;
			if (local28 == 2) {
				for (local28 = 0; local28 < Static54.anInt1423; local28++) {
					local44 = local25[local28];
					for (local46 = 1; local46 < this.anIntArrayArray16.length - 1 && this.anIntArrayArray16[local46][0] <= local44; local46++) {
					}
					local77 = this.anIntArrayArray16[local46 - 1];
					local82 = this.anIntArrayArray16[local46];
					local91 = this.method1405(local46 - 2)[1];
					local95 = local77[1];
					local99 = local82[1];
					@Pc(108) int local108 = this.method1405(local46 + 1)[1];
					@Pc(117) int local117 = local95 + local108 - local91 - local99;
					@Pc(134) int local134 = (local44 - local77[0] << 12) / (local82[0] - local77[0]);
					@Pc(140) int local140 = local99 - local91;
					@Pc(146) int local146 = local134 * local140 >> 12;
					@Pc(154) int local154 = local91 - local117 - local95;
					@Pc(160) int local160 = local134 * local134 >> 12;
					@Pc(170) int local170 = (local117 * local134 >> 12) * local160 >> 12;
					@Pc(176) int local176 = local160 * local154 >> 12;
					local15[local28] = local95 + local146 + local170 + local176;
				}
			} else if (local28 == 1) {
				for (local28 = 0; local28 < Static54.anInt1423; local28++) {
					local44 = local25[local28];
					for (local46 = 1; this.anIntArrayArray16.length - 1 > local46 && this.anIntArrayArray16[local46][0] <= local44; local46++) {
					}
					local82 = this.anIntArrayArray16[local46];
					local77 = this.anIntArrayArray16[local46 - 1];
					local91 = (local44 - local77[0] << 12) / (local82[0] - local77[0]);
					local95 = 4096 - Static31.anIntArray368[local91 >> 5 & 0xFF] >> 1;
					local99 = 4096 - local95;
					local15[local28] = local95 * local82[1] + local99 * local77[1] >> 12;
				}
			} else {
				for (local28 = 0; local28 < Static54.anInt1423; local28++) {
					local44 = local25[local28];
					for (local46 = 1; local46 < this.anIntArrayArray16.length - 1 && local44 >= this.anIntArrayArray16[local46][0]; local46++) {
					}
					local82 = this.anIntArrayArray16[local46];
					local77 = this.anIntArrayArray16[local46 - 1];
					local91 = (local44 - local77[0] << 12) / (local82[0] - local77[0]);
					local95 = 4096 - local91;
					local15[local28] = local95 * local77[1] + local91 * local82[1] >> 12;
				}
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "(Z)V")
	@Override
	public void method2892() {
		if (this.anIntArrayArray16 == null) {
			this.anIntArrayArray16 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray16.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt2018 == 2) {
			this.method1404();
		}
		Static150.method2329();
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IBLclient!ab;)V")
	@Override
	public void method2904(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub2 arg1) {
		if (arg0 != 0) {
			return;
		}
		this.anInt2018 = arg1.method1698();
		this.anIntArrayArray16 = new int[arg1.method1698()][2];
		for (@Pc(29) int local29 = 0; local29 < this.anIntArrayArray16.length; local29++) {
			this.anIntArrayArray16[local29][0] = arg1.method1680();
			this.anIntArrayArray16[local29][1] = arg1.method1680();
		}
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(BI)[I")
	private int[] method1405(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray193;
		} else if (arg0 >= this.anIntArrayArray16.length) {
			return this.anIntArray192;
		} else {
			return this.anIntArrayArray16[arg0];
		}
	}
}
