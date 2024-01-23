import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kg")
public final class Class2_Sub1_Sub18 extends Class2_Sub1 {

	@OriginalMember(owner = "client!kg", name = "Q", descriptor = "I")
	private int anInt2480 = 4096;

	@OriginalMember(owner = "client!kg", name = "Z", descriptor = "I")
	private int anInt2486 = 0;

	@OriginalMember(owner = "client!kg", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub18() {
		super(1, false);
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3201(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass73_41.method2249(arg0);
		if (super.aClass73_41.aBoolean188) {
			@Pc(27) int[] local27 = this.method3203(arg0, 0);
			for (@Pc(29) int local29 = 0; local29 < Static62.anInt1675; local29++) {
				@Pc(35) int local35 = local27[local29];
				if (this.anInt2486 > local35) {
					local17[local29] = this.anInt2486;
				} else if (this.anInt2480 >= local35) {
					local17[local29] = local35;
				} else {
					local17[local29] = this.anInt2480;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method3211(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass99_41.method3152(arg0);
		if (super.aClass99_41.aBoolean280) {
			@Pc(26) int[][] local26 = this.method3205(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[2];
			@Pc(38) int[] local38 = local26[1];
			@Pc(42) int[] local42 = local11[1];
			@Pc(46) int[] local46 = local11[2];
			@Pc(50) int[] local50 = local11[0];
			for (@Pc(52) int local52 = 0; local52 < Static62.anInt1675; local52++) {
				@Pc(58) int local58 = local30[local52];
				@Pc(62) int local62 = local38[local52];
				@Pc(66) int local66 = local34[local52];
				if (local58 < this.anInt2486) {
					local50[local52] = this.anInt2486;
				} else if (this.anInt2480 >= local58) {
					local50[local52] = local58;
				} else {
					local50[local52] = this.anInt2480;
				}
				if (this.anInt2486 > local62) {
					local42[local52] = this.anInt2486;
				} else if (this.anInt2480 < local62) {
					local42[local52] = this.anInt2480;
				} else {
					local42[local52] = local62;
				}
				if (local66 < this.anInt2486) {
					local46[local52] = this.anInt2486;
				} else if (local66 > this.anInt2480) {
					local46[local52] = this.anInt2480;
				} else {
					local46[local52] = local66;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lclient!ea;II)V")
	@Override
	public void method3204(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2486 = arg0.method163();
		} else if (arg1 == 1) {
			this.anInt2480 = arg0.method163();
		} else if (arg1 == 2) {
			super.aBoolean286 = arg0.method209() == 1;
		}
	}
}
