import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public final class Class1_Sub1_Sub3 extends Class1_Sub1 {

	@OriginalMember(owner = "client!dd", name = "ib", descriptor = "I")
	private int anInt818 = 4096;

	@OriginalMember(owner = "client!dd", name = "hb", descriptor = "I")
	private int anInt817 = 0;

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub3() {
		super(1, false);
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3705(@OriginalArg(0) int arg0) {
		@Pc(7) int[] local7 = super.aClass37_41.method1168(arg0);
		if (super.aClass37_41.aBoolean131) {
			@Pc(27) int[] local27 = this.method3706(arg0, 0);
			for (@Pc(29) int local29 = 0; local29 < Static11.anInt294; local29++) {
				@Pc(35) int local35 = local27[local29];
				if (this.anInt817 > local35) {
					local7[local29] = this.anInt817;
				} else if (local35 <= this.anInt818) {
					local7[local29] = local35;
				} else {
					local7[local29] = this.anInt818;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lclient!vf;II)V")
	@Override
	public void method3711(@OriginalArg(0) Class1_Sub26 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt817 = arg0.method2964();
		} else if (arg1 == 1) {
			this.anInt818 = arg0.method2964();
		} else if (arg1 == 2) {
			super.aBoolean442 = arg0.method2945() == 1;
		}
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3704(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass71_41.method2050(arg0);
		if (super.aClass71_41.aBoolean221) {
			@Pc(26) int[][] local26 = this.method3713(arg0, 0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[2];
			@Pc(38) int[] local38 = local26[1];
			@Pc(42) int[] local42 = local11[1];
			@Pc(46) int[] local46 = local11[0];
			@Pc(50) int[] local50 = local11[2];
			for (@Pc(52) int local52 = 0; local52 < Static11.anInt294; local52++) {
				@Pc(58) int local58 = local30[local52];
				@Pc(62) int local62 = local38[local52];
				@Pc(66) int local66 = local34[local52];
				if (local58 < this.anInt817) {
					local46[local52] = this.anInt817;
				} else if (this.anInt818 < local58) {
					local46[local52] = this.anInt818;
				} else {
					local46[local52] = local58;
				}
				if (local62 < this.anInt817) {
					local42[local52] = this.anInt817;
				} else if (this.anInt818 < local62) {
					local42[local52] = this.anInt818;
				} else {
					local42[local52] = local62;
				}
				if (local66 < this.anInt817) {
					local50[local52] = this.anInt817;
				} else if (local66 <= this.anInt818) {
					local50[local52] = local66;
				} else {
					local50[local52] = this.anInt818;
				}
			}
		}
		return local11;
	}
}
