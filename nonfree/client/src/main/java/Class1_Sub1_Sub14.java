import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class Class1_Sub1_Sub14 extends Class1_Sub1 {

	@OriginalMember(owner = "client!jc", name = "F", descriptor = "I")
	private int anInt4378 = 4096;

	@OriginalMember(owner = "client!jc", name = "I", descriptor = "I")
	private int anInt4381 = 4096;

	@OriginalMember(owner = "client!jc", name = "C", descriptor = "I")
	private int anInt4376 = 4096;

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub14() {
		super(1, false);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method7705(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass46_41.method856(arg0);
		if (super.aClass46_41.aBoolean76) {
			@Pc(26) int[][] local26 = this.method7700(arg0, 0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local11[0];
			@Pc(46) int[] local46 = local11[1];
			@Pc(50) int[] local50 = local11[2];
			for (@Pc(52) int local52 = 0; local52 < Static279.anInt4906; local52++) {
				@Pc(58) int local58 = local30[local52];
				@Pc(62) int local62 = local38[local52];
				@Pc(66) int local66 = local34[local52];
				if (local62 == local58 && local66 == local62) {
					local42[local52] = local58 * this.anInt4378 >> 12;
					local46[local52] = this.anInt4376 * local62 >> 12;
					local50[local52] = this.anInt4381 * local66 >> 12;
				} else {
					local42[local52] = this.anInt4378;
					local46[local52] = this.anInt4376;
					local50[local52] = this.anInt4381;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILclient!mo;I)V")
	@Override
	public void method7708(@OriginalArg(1) Class1_Sub35 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4378 = arg0.method5771();
		} else if (arg1 == 1) {
			this.anInt4376 = arg0.method5771();
		} else if (arg1 == 2) {
			this.anInt4381 = arg0.method5771();
		}
	}
}
