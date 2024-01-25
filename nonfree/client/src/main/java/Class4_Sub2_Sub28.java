import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!taa")
public final class Class4_Sub2_Sub28 extends Class4_Sub2 {

	@OriginalMember(owner = "client!taa", name = "F", descriptor = "Z")
	private boolean aBoolean676 = true;

	@OriginalMember(owner = "client!taa", name = "E", descriptor = "Z")
	private boolean aBoolean675 = true;

	@OriginalMember(owner = "client!taa", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub28() {
		super(1, false);
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(BILclient!es;)V")
	@Override
	public void method8767(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.aBoolean676 = arg1.method8865() == 1;
		} else if (arg0 == 1) {
			this.aBoolean675 = arg1.method8865() == 1;
		} else if (arg0 == 2) {
			super.aBoolean793 = arg1.method8865() == 1;
		}
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8765(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass271_41.method6067(arg0);
		if (super.aClass271_41.aBoolean534) {
			@Pc(28) int[] local28 = this.method8768(0, this.aBoolean675 ? Static489.anInt7677 - arg0 : arg0);
			if (this.aBoolean676) {
				for (@Pc(33) int local33 = 0; local33 < Static269.anInt4330; local33++) {
					local11[local33] = local28[Static215.anInt3481 - local33];
				}
			} else {
				Static685.method6466(local28, 0, local11, 0, Static269.anInt4330);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method8771(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass304_41.method6699(arg0);
		if (super.aClass304_41.aBoolean604) {
			@Pc(34) int[][] local34 = this.method8772(this.aBoolean675 ? Static489.anInt7677 - arg0 : arg0, 0);
			@Pc(38) int[] local38 = local34[0];
			@Pc(42) int[] local42 = local34[1];
			@Pc(46) int[] local46 = local34[2];
			@Pc(50) int[] local50 = local11[0];
			@Pc(54) int[] local54 = local11[1];
			@Pc(58) int[] local58 = local11[2];
			@Pc(63) int local63;
			if (this.aBoolean676) {
				for (local63 = 0; local63 < Static269.anInt4330; local63++) {
					local50[local63] = local38[Static215.anInt3481 - local63];
					local54[local63] = local42[Static215.anInt3481 - local63];
					local58[local63] = local46[Static215.anInt3481 - local63];
				}
			} else {
				for (local63 = 0; local63 < Static269.anInt4330; local63++) {
					local50[local63] = local38[local63];
					local54[local63] = local42[local63];
					local58[local63] = local46[local63];
				}
			}
		}
		return local11;
	}
}
