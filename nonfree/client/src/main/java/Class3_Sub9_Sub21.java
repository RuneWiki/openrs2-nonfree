import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!is")
public final class Class3_Sub9_Sub21 extends Class3_Sub9 {

	@OriginalMember(owner = "client!is", name = "C", descriptor = "I")
	private int anInt4649 = 0;

	@OriginalMember(owner = "client!is", name = "G", descriptor = "I")
	private int anInt4652 = 4096;

	@OriginalMember(owner = "client!is", name = "<init>", descriptor = "()V")
	public Class3_Sub9_Sub21() {
		super(1, false);
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(Lclient!jp;IB)V")
	@Override
	public void method9166(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt4649 = arg0.method8593();
		} else if (arg1 == 1) {
			this.anInt4652 = arg0.method8593();
		} else if (arg1 == 2) {
			super.aBoolean804 = arg0.method8632() == 1;
		}
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method9168(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass348_41.method8552(arg0);
		if (super.aClass348_41.aBoolean748) {
			@Pc(26) int[][] local26 = this.method9167(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local11[0];
			@Pc(46) int[] local46 = local11[1];
			@Pc(50) int[] local50 = local11[2];
			for (@Pc(52) int local52 = 0; local52 < Static62.anInt1251; local52++) {
				@Pc(58) int local58 = local30[local52];
				@Pc(62) int local62 = local34[local52];
				@Pc(66) int local66 = local38[local52];
				if (local58 < this.anInt4649) {
					local42[local52] = this.anInt4649;
				} else if (local58 <= this.anInt4652) {
					local42[local52] = local58;
				} else {
					local42[local52] = this.anInt4652;
				}
				if (local62 < this.anInt4649) {
					local46[local52] = this.anInt4649;
				} else if (this.anInt4652 < local62) {
					local46[local52] = this.anInt4652;
				} else {
					local46[local52] = local62;
				}
				if (this.anInt4649 > local66) {
					local50[local52] = this.anInt4649;
				} else if (this.anInt4652 < local66) {
					local50[local52] = this.anInt4652;
				} else {
					local50[local52] = local66;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method9165(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass113_41.method3239(arg0);
		if (super.aClass113_41.aBoolean275) {
			@Pc(27) int[] local27 = this.method9162(arg0, 0);
			for (@Pc(29) int local29 = 0; local29 < Static62.anInt1251; local29++) {
				@Pc(35) int local35 = local27[local29];
				if (this.anInt4649 > local35) {
					local11[local29] = this.anInt4649;
				} else if (local35 > this.anInt4652) {
					local11[local29] = this.anInt4652;
				} else {
					local11[local29] = local35;
				}
			}
		}
		return local11;
	}
}
