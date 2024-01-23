import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mh")
public final class Class2_Sub1_Sub24 extends Class2_Sub1 {

	@OriginalMember(owner = "client!mh", name = "U", descriptor = "I")
	private int anInt2950 = 4096;

	@OriginalMember(owner = "client!mh", name = "bb", descriptor = "I")
	private int anInt2952 = 4096;

	@OriginalMember(owner = "client!mh", name = "eb", descriptor = "I")
	private int anInt2954 = 4096;

	@OriginalMember(owner = "client!mh", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub24() {
		super(1, false);
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method3211(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass99_41.method3152(arg0);
		if (super.aClass99_41.aBoolean280) {
			@Pc(26) int[][] local26 = this.method3205(0, arg0);
			@Pc(30) int[] local30 = local26[1];
			@Pc(34) int[] local34 = local26[0];
			@Pc(38) int[] local38 = local16[1];
			@Pc(42) int[] local42 = local26[2];
			@Pc(46) int[] local46 = local16[0];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static62.anInt1675; local52++) {
				@Pc(58) int local58 = local34[local52];
				@Pc(62) int local62 = local42[local52];
				@Pc(66) int local66 = local30[local52];
				if (local62 == local58 && local62 == local66) {
					local46[local52] = local58 * this.anInt2950 >> 12;
					local38[local52] = local62 * this.anInt2954 >> 12;
					local50[local52] = local66 * this.anInt2952 >> 12;
				} else {
					local46[local52] = this.anInt2950;
					local38[local52] = this.anInt2954;
					local50[local52] = this.anInt2952;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lclient!ea;II)V")
	@Override
	public void method3204(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2950 = arg0.method163();
		} else if (arg1 == 1) {
			this.anInt2954 = arg0.method163();
		} else if (arg1 == 2) {
			this.anInt2952 = arg0.method163();
		}
	}
}
