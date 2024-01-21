import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nf")
public final class Class2_Sub1_Sub23 extends Class2_Sub1 {

	@OriginalMember(owner = "client!nf", name = "eb", descriptor = "[I")
	private int[] anIntArray415;

	@OriginalMember(owner = "client!nf", name = "ib", descriptor = "[[I")
	private int[][] anIntArrayArray21;

	@OriginalMember(owner = "client!nf", name = "nb", descriptor = "[I")
	private int[] anIntArray417;

	@OriginalMember(owner = "client!nf", name = "ob", descriptor = "I")
	private int anInt2649;

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(Z)V")
	@Override
	public void method2992() {
		if (this.anIntArrayArray21 == null) {
			this.anIntArrayArray21 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray21.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt2649 == 2) {
			this.method1883();
		}
		Static128.method2196();
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(BLclient!oa;I)V")
	@Override
	public void method2987(@OriginalArg(1) Class2_Sub18 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		this.anInt2649 = arg0.method2387();
		this.anIntArrayArray21 = new int[arg0.method2387()][2];
		for (@Pc(17) int local17 = 0; local17 < this.anIntArrayArray21.length; local17++) {
			this.anIntArrayArray21[local17][0] = arg0.method2353();
			this.anIntArrayArray21[local17][1] = arg0.method2353();
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method2986(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass3_39.method62(arg0);
		if (super.aClass3_39.aBoolean5) {
			@Pc(23) int[] local23 = this.method2980(0, arg0);
			@Pc(26) int local26 = this.anInt2649;
			@Pc(46) int local46;
			@Pc(44) int local44;
			@Pc(77) int[] local77;
			@Pc(82) int[] local82;
			@Pc(91) int local91;
			@Pc(95) int local95;
			@Pc(99) int local99;
			if (local26 == 2) {
				for (local26 = 0; local26 < Static129.anInt3118; local26++) {
					local44 = local23[local26];
					for (local46 = 1; this.anIntArrayArray21.length - 1 > local46 && local44 >= this.anIntArrayArray21[local46][0]; local46++) {
					}
					local77 = this.anIntArrayArray21[local46 - 1];
					local82 = this.anIntArrayArray21[local46];
					local91 = this.method1882(local46 - 2)[1];
					local95 = local77[1];
					local99 = local82[1];
					@Pc(108) int local108 = this.method1882(local46 + 1)[1];
					@Pc(117) int local117 = local95 + local108 - local99 - local91;
					@Pc(136) int local136 = (local44 - local77[0] << 12) / (local82[0] - local77[0]);
					@Pc(142) int local142 = local136 * local136 >> 12;
					@Pc(150) int local150 = local91 - local117 - local95;
					@Pc(160) int local160 = local142 * (local117 * local136 >> 12) >> 12;
					@Pc(164) int local164 = local99 - local91;
					@Pc(170) int local170 = local136 * local164 >> 12;
					@Pc(176) int local176 = local142 * local150 >> 12;
					local11[local26] = local95 + local176 + local160 + local170;
				}
			} else if (local26 == 1) {
				for (local26 = 0; local26 < Static129.anInt3118; local26++) {
					local44 = local23[local26];
					for (local46 = 1; local46 < this.anIntArrayArray21.length - 1 && this.anIntArrayArray21[local46][0] <= local44; local46++) {
					}
					local77 = this.anIntArrayArray21[local46 - 1];
					local82 = this.anIntArrayArray21[local46];
					local91 = (local44 - local77[0] << 12) / (local82[0] - local77[0]);
					local95 = 4096 - Static108.anIntArray424[local91 >> 5 & 0xFF] >> 1;
					local99 = 4096 - local95;
					local11[local26] = local95 * local82[1] + local77[1] * local99 >> 12;
				}
			} else {
				for (local26 = 0; local26 < Static129.anInt3118; local26++) {
					local44 = local23[local26];
					for (local46 = 1; local46 < this.anIntArrayArray21.length - 1 && this.anIntArrayArray21[local46][0] <= local44; local46++) {
					}
					local77 = this.anIntArrayArray21[local46 - 1];
					local82 = this.anIntArrayArray21[local46];
					local91 = (local44 - local77[0] << 12) / (local82[0] - local77[0]);
					local95 = 4096 - local91;
					local11[local26] = local91 * local82[1] + local95 * local77[1] >> 12;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(BI)[I")
	private int[] method1882(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray417;
		} else if (this.anIntArrayArray21.length <= arg0) {
			return this.anIntArray415;
		} else {
			return this.anIntArrayArray21[arg0];
		}
	}

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(B)V")
	private void method1883() {
		@Pc(16) int[] local16 = this.anIntArrayArray21[0];
		@Pc(21) int[] local21 = this.anIntArrayArray21[1];
		@Pc(30) int[] local30 = this.anIntArrayArray21[this.anIntArrayArray21.length - 2];
		@Pc(39) int[] local39 = this.anIntArrayArray21[this.anIntArrayArray21.length - 1];
		this.anIntArray415 = new int[] { local30[0] + local30[0] - local39[0], local30[1] + -local39[1] + local30[1] };
		this.anIntArray417 = new int[] { local16[0] + local16[0] - local21[0], local16[1] + -local21[1] + local16[1] };
	}
}
