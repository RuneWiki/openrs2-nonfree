import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public final class Class1_Sub4_Sub28 extends Class1_Sub4 {

	@OriginalMember(owner = "client!sd", name = "eb", descriptor = "I")
	private int anInt4037;

	@OriginalMember(owner = "client!sd", name = "kb", descriptor = "I")
	private int anInt4040;

	@OriginalMember(owner = "client!sd", name = "mb", descriptor = "I")
	private int anInt4042;

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method3214(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass35_38.method1569(arg0);
		if (super.aClass35_38.aBoolean89) {
			@Pc(26) int[][] local26 = this.method3217(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local16[0];
			@Pc(38) int[] local38 = local16[2];
			@Pc(42) int[] local42 = local16[1];
			@Pc(46) int[] local46 = local26[1];
			@Pc(50) int[] local50 = local26[2];
			for (@Pc(52) int local52 = 0; local52 < Static73.anInt1888; local52++) {
				@Pc(58) int local58 = local30[local52];
				@Pc(62) int local62 = local50[local52];
				@Pc(66) int local66 = local46[local52];
				if (local58 == local62 && local66 == local62) {
					local34[local52] = this.anInt4037 * local58 >> 12;
					local42[local52] = local62 * this.anInt4040 >> 12;
					local38[local52] = local66 * this.anInt4042 >> 12;
				} else {
					local34[local52] = this.anInt4037;
					local42[local52] = this.anInt4040;
					local38[local52] = this.anInt4042;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!hc;IZ)V")
	@Override
	public void method3205(@OriginalArg(0) Class1_Sub6 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt4037 = arg0.method546();
		} else if (arg1 == 1) {
			this.anInt4040 = arg0.method546();
		} else if (arg1 == 2) {
			this.anInt4042 = arg0.method546();
		}
	}
}
