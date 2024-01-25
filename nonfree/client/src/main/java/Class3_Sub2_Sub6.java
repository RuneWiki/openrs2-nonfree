import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fa")
public final class Class3_Sub2_Sub6 extends Class3_Sub2 {

	@OriginalMember(owner = "client!fa", name = "z", descriptor = "I")
	private int anInt2837 = 4096;

	@OriginalMember(owner = "client!fa", name = "D", descriptor = "I")
	private int anInt2840 = 4096;

	@OriginalMember(owner = "client!fa", name = "A", descriptor = "I")
	private int anInt2838 = 4096;

	@OriginalMember(owner = "client!fa", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub6() {
		super(1, false);
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8711(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass115_41.method2722(arg0);
		if (super.aClass115_41.aBoolean233) {
			@Pc(26) int[][] local26 = this.method8718(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static30.anInt908; local52++) {
				@Pc(58) int local58 = local30[local52];
				@Pc(62) int local62 = local38[local52];
				@Pc(66) int local66 = local34[local52];
				if (local58 == local62 && local62 == local66) {
					local42[local52] = local58 * this.anInt2840 >> 12;
					local46[local52] = this.anInt2837 * local62 >> 12;
					local50[local52] = local66 * this.anInt2838 >> 12;
				} else {
					local42[local52] = this.anInt2840;
					local46[local52] = this.anInt2837;
					local50[local52] = this.anInt2838;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lclient!fca;II)V")
	@Override
	public void method8709(@OriginalArg(0) Class3_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt2840 = arg0.method4858();
		} else if (arg1 == 1) {
			this.anInt2837 = arg0.method4858();
		} else if (arg1 == 2) {
			this.anInt2838 = arg0.method4858();
		}
	}
}
