import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cb")
public final class Class3_Sub5_Sub2 extends Class3_Sub5 {

	@OriginalMember(owner = "client!cb", name = "P", descriptor = "I")
	private int anInt500;

	@OriginalMember(owner = "client!cb", name = "Y", descriptor = "I")
	private int anInt505;

	@OriginalMember(owner = "client!cb", name = "db", descriptor = "I")
	private int anInt506;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IILclient!mb;)V")
	@Override
	public void method3169(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub17 arg1) {
		if (arg0 == 0) {
			this.anInt505 = arg1.method2111();
		} else if (arg0 == 1) {
			this.anInt506 = arg1.method2111();
		} else if (arg0 == 2) {
			this.anInt500 = arg1.method2111();
		}
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3172(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass89_41.method2876(arg0);
		if (super.aClass89_41.aBoolean160) {
			@Pc(26) int[][] local26 = this.method3163(0, arg0);
			@Pc(30) int[] local30 = local26[2];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local11[0];
			@Pc(42) int[] local42 = local26[0];
			@Pc(46) int[] local46 = local11[1];
			@Pc(50) int[] local50 = local11[2];
			for (@Pc(52) int local52 = 0; local52 < Static104.anInt2195; local52++) {
				@Pc(58) int local58 = local42[local52];
				@Pc(62) int local62 = local34[local52];
				@Pc(66) int local66 = local30[local52];
				if (local58 == local66 && local66 == local62) {
					local38[local52] = this.anInt505 * local58 >> 12;
					local46[local52] = this.anInt506 * local66 >> 12;
					local50[local52] = local62 * this.anInt500 >> 12;
				} else {
					local38[local52] = this.anInt505;
					local46[local52] = this.anInt506;
					local50[local52] = this.anInt500;
				}
			}
		}
		return local11;
	}
}
