import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vc")
public final class Class4_Sub3_Sub36 extends Class4_Sub3 {

	@OriginalMember(owner = "client!vc", name = "cb", descriptor = "[[I")
	private int[][] anIntArrayArray37;

	@OriginalMember(owner = "client!vc", name = "pb", descriptor = "[I")
	private int[] anIntArray427;

	@OriginalMember(owner = "client!vc", name = "qb", descriptor = "[I")
	private int[] anIntArray428;

	@OriginalMember(owner = "client!vc", name = "ib", descriptor = "I")
	private int anInt3964;

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(II)[I")
	private int[] method3042(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray427;
		} else if (arg0 >= this.anIntArrayArray37.length) {
			return this.anIntArray428;
		} else {
			return this.anIntArrayArray37[arg0];
		}
	}

	@OriginalMember(owner = "client!vc", name = "f", descriptor = "(I)V")
	private void method3043() {
		@Pc(16) int[] local16 = this.anIntArrayArray37[0];
		@Pc(21) int[] local21 = this.anIntArrayArray37[1];
		@Pc(30) int[] local30 = this.anIntArrayArray37[this.anIntArrayArray37.length - 2];
		@Pc(39) int[] local39 = this.anIntArrayArray37[this.anIntArrayArray37.length - 1];
		this.anIntArray428 = new int[] { local30[0] + local30[0] - local39[0], local30[1] - local39[1] + local30[1] };
		this.anIntArray427 = new int[] { local16[0] + local16[0] - local21[0], local16[1] - (local21[1] - local16[1]) };
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILclient!h;I)V")
	@Override
	public void method3157(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub11 arg1) {
		if (arg0 != 0) {
			return;
		}
		this.anInt3964 = arg1.method1253();
		this.anIntArrayArray37 = new int[arg1.method1253()][2];
		for (@Pc(28) int local28 = 0; local28 < this.anIntArrayArray37.length; local28++) {
			this.anIntArrayArray37[local28][0] = arg1.method1252();
			this.anIntArrayArray37[local28][1] = arg1.method1252();
		}
	}

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "(B)V")
	@Override
	public void method3148() {
		if (this.anIntArrayArray37 == null) {
			this.anIntArrayArray37 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray37.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt3964 == 2) {
			this.method3043();
		}
		Static97.method1889();
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3161(@OriginalArg(0) int arg0) {
		@Pc(15) int[] local15 = super.aClass64_41.method2211(arg0);
		if (super.aClass64_41.aBoolean127) {
			@Pc(25) int[] local25 = this.method3149(arg0, 0);
			@Pc(28) int local28 = this.anInt3964;
			@Pc(46) int local46;
			@Pc(44) int local44;
			@Pc(86) int[] local86;
			@Pc(79) int[] local79;
			@Pc(95) int local95;
			@Pc(108) int local108;
			@Pc(99) int local99;
			if (local28 == 2) {
				for (local28 = 0; local28 < Static134.anInt3188; local28++) {
					local44 = local25[local28];
					for (local46 = 1; local46 < this.anIntArrayArray37.length - 1 && this.anIntArrayArray37[local46][0] <= local44; local46++) {
					}
					local79 = this.anIntArrayArray37[local46];
					local86 = this.anIntArrayArray37[local46 - 1];
					local95 = this.method3042(local46 - 2)[1];
					local99 = local79[1];
					@Pc(104) int local104 = local99 - local95;
					local108 = local86[1];
					@Pc(117) int local117 = this.method3042(local46 + 1)[1];
					@Pc(134) int local134 = (local44 - local86[0] << 12) / (local79[0] - local86[0]);
					@Pc(140) int local140 = local134 * local134 >> 12;
					@Pc(152) int local152 = local108 + local117 - local99 - local95;
					@Pc(162) int local162 = (local134 * local152 >> 12) * local140 >> 12;
					@Pc(169) int local169 = local95 - local108 - local152;
					@Pc(175) int local175 = local169 * local140 >> 12;
					@Pc(181) int local181 = local134 * local104 >> 12;
					local15[local28] = local108 + local175 + local162 + local181;
				}
			} else if (local28 == 1) {
				for (local28 = 0; local28 < Static134.anInt3188; local28++) {
					local44 = local25[local28];
					for (local46 = 1; this.anIntArrayArray37.length - 1 > local46 && this.anIntArrayArray37[local46][0] <= local44; local46++) {
					}
					local79 = this.anIntArrayArray37[local46];
					local86 = this.anIntArrayArray37[local46 - 1];
					local95 = (local44 - local86[0] << 12) / (local79[0] - local86[0]);
					local108 = 4096 - Static22.anIntArray59[local95 >> 5 & 0xFF] >> 1;
					local99 = 4096 - local108;
					local15[local28] = local99 * local86[1] + local108 * local79[1] >> 12;
				}
			} else {
				for (local28 = 0; local28 < Static134.anInt3188; local28++) {
					local44 = local25[local28];
					for (local46 = 1; this.anIntArrayArray37.length - 1 > local46 && this.anIntArrayArray37[local46][0] <= local44; local46++) {
					}
					local86 = this.anIntArrayArray37[local46 - 1];
					local79 = this.anIntArrayArray37[local46];
					local95 = (local44 - local86[0] << 12) / (local79[0] - local86[0]);
					local108 = 4096 - local95;
					local15[local28] = local86[1] * local108 + local79[1] * local95 >> 12;
				}
			}
		}
		return local15;
	}
}
