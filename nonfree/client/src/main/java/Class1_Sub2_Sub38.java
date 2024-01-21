import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!v")
public final class Class1_Sub2_Sub38 extends Class1_Sub2 {

	@OriginalMember(owner = "client!v", name = "X", descriptor = "I")
	private int anInt4393;

	@OriginalMember(owner = "client!v", name = "fb", descriptor = "I")
	private int anInt4400;

	@OriginalMember(owner = "client!v", name = "ib", descriptor = "I")
	private int anInt4402;

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3391(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass19_41.method1028(arg0);
		if (super.aClass19_41.aBoolean54) {
			@Pc(26) int[][] local26 = this.method3390(arg0, 0);
			@Pc(30) int[] local30 = local26[2];
			@Pc(34) int[] local34 = local26[0];
			@Pc(38) int[] local38 = local26[1];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static22.anInt596; local52++) {
				@Pc(58) int local58 = local34[local52];
				@Pc(62) int local62 = local38[local52];
				@Pc(66) int local66 = local30[local52];
				if (local58 == local66 && local66 == local62) {
					local42[local52] = local58 * this.anInt4393 >> 12;
					local46[local52] = this.anInt4402 * local66 >> 12;
					local50[local52] = this.anInt4400 * local62 >> 12;
				} else {
					local42[local52] = this.anInt4393;
					local46[local52] = this.anInt4402;
					local50[local52] = this.anInt4400;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IILclient!fa;)V")
	@Override
	public void method3393(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub9 arg1) {
		if (arg0 == 0) {
			this.anInt4393 = arg1.method1280();
		} else if (arg0 == 1) {
			this.anInt4402 = arg1.method1280();
		} else if (arg0 == 2) {
			this.anInt4400 = arg1.method1280();
		}
	}
}
