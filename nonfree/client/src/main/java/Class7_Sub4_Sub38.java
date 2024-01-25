import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wf")
public final class Class7_Sub4_Sub38 extends Class7_Sub4 {

	@OriginalMember(owner = "client!wf", name = "L", descriptor = "I")
	private int anInt6593 = 0;

	@OriginalMember(owner = "client!wf", name = "M", descriptor = "I")
	private int anInt6594 = 4096;

	@OriginalMember(owner = "client!wf", name = "<init>", descriptor = "()V")
	public Class7_Sub4_Sub38() {
		super(1, false);
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lclient!ap;BI)V")
	@Override
	public void method5636(@OriginalArg(0) Class7_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6593 = arg0.method2764();
		} else if (arg1 == 1) {
			this.anInt6594 = arg0.method2764();
		} else if (arg1 == 2) {
			super.aBoolean481 = arg0.method2772() == 1;
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5628(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass219_41.method5708(arg0);
		if (super.aClass219_41.aBoolean495) {
			@Pc(29) int[] local29 = this.method5634(0, arg0);
			for (@Pc(31) int local31 = 0; local31 < Static201.anInt4174; local31++) {
				@Pc(37) int local37 = local29[local31];
				if (local37 < this.anInt6593) {
					local19[local31] = this.anInt6593;
				} else if (local37 > this.anInt6594) {
					local19[local31] = this.anInt6594;
				} else {
					local19[local31] = local37;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method5631(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass42_41.method1058(arg0);
		if (super.aClass42_41.aBoolean109) {
			@Pc(26) int[][] local26 = this.method5638(arg0, 0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static201.anInt4174; local52++) {
				@Pc(58) int local58 = local30[local52];
				@Pc(62) int local62 = local34[local52];
				@Pc(66) int local66 = local38[local52];
				if (this.anInt6593 > local58) {
					local42[local52] = this.anInt6593;
				} else if (local58 <= this.anInt6594) {
					local42[local52] = local58;
				} else {
					local42[local52] = this.anInt6594;
				}
				if (local62 < this.anInt6593) {
					local46[local52] = this.anInt6593;
				} else if (this.anInt6594 < local62) {
					local46[local52] = this.anInt6594;
				} else {
					local46[local52] = local62;
				}
				if (this.anInt6593 > local66) {
					local50[local52] = this.anInt6593;
				} else if (this.anInt6594 >= local66) {
					local50[local52] = local66;
				} else {
					local50[local52] = this.anInt6594;
				}
			}
		}
		return local16;
	}
}
