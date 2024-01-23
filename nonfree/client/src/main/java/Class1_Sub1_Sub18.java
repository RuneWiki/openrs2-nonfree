import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public final class Class1_Sub1_Sub18 extends Class1_Sub1 {

	@OriginalMember(owner = "client!lb", name = "jb", descriptor = "I")
	private int anInt2532 = 4096;

	@OriginalMember(owner = "client!lb", name = "fb", descriptor = "I")
	private int anInt2530 = 0;

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub18() {
		super(1, false);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method3735(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass75_41.method2410(arg0);
		if (super.aClass75_41.aBoolean134) {
			@Pc(26) int[][] local26 = this.method3737(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static157.anInt3431; local52++) {
				@Pc(58) int local58 = local30[local52];
				@Pc(62) int local62 = local34[local52];
				@Pc(66) int local66 = local38[local52];
				if (local58 < this.anInt2530) {
					local42[local52] = this.anInt2530;
				} else if (this.anInt2532 < local58) {
					local42[local52] = this.anInt2532;
				} else {
					local42[local52] = local58;
				}
				if (local62 < this.anInt2530) {
					local46[local52] = this.anInt2530;
				} else if (this.anInt2532 >= local62) {
					local46[local52] = local62;
				} else {
					local46[local52] = this.anInt2532;
				}
				if (this.anInt2530 > local66) {
					local50[local52] = this.anInt2530;
				} else if (this.anInt2532 < local66) {
					local50[local52] = this.anInt2532;
				} else {
					local50[local52] = local66;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method3729(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass17_41.method474(arg0);
		if (super.aClass17_41.aBoolean24) {
			@Pc(26) int[] local26 = this.method3733(arg0, 0);
			for (@Pc(28) int local28 = 0; local28 < Static157.anInt3431; local28++) {
				@Pc(34) int local34 = local26[local28];
				if (local34 < this.anInt2530) {
					local16[local28] = this.anInt2530;
				} else if (this.anInt2532 < local34) {
					local16[local28] = this.anInt2532;
				} else {
					local16[local28] = local34;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!k;BI)V")
	@Override
	public void method3738(@OriginalArg(0) Class1_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2530 = arg0.method3805();
		} else if (arg1 == 1) {
			this.anInt2532 = arg0.method3805();
		} else if (arg1 == 2) {
			super.aBoolean213 = arg0.method3793() == 1;
		}
	}
}
