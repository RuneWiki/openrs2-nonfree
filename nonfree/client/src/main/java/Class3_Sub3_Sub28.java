import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pj")
public final class Class3_Sub3_Sub28 extends Class3_Sub3 {

	@OriginalMember(owner = "client!pj", name = "H", descriptor = "I")
	private int anInt4780 = 4096;

	@OriginalMember(owner = "client!pj", name = "M", descriptor = "I")
	private int anInt4782 = 4096;

	@OriginalMember(owner = "client!pj", name = "R", descriptor = "I")
	private int anInt4787 = 4096;

	@OriginalMember(owner = "client!pj", name = "<init>", descriptor = "()V")
	public Class3_Sub3_Sub28() {
		super(1, false);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lclient!fb;ZI)V")
	@Override
	public void method5731(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4787 = arg0.method3649();
		} else if (arg1 == 1) {
			this.anInt4780 = arg0.method3649();
		} else if (arg1 == 2) {
			this.anInt4782 = arg0.method3649();
		}
	}

	@OriginalMember(owner = "client!pj", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method5734(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass84_41.method2091(arg0);
		if (super.aClass84_41.aBoolean144) {
			@Pc(26) int[][] local26 = this.method5729(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static131.anInt2755; local52++) {
				@Pc(58) int local58 = local30[local52];
				@Pc(62) int local62 = local38[local52];
				@Pc(66) int local66 = local34[local52];
				if (local58 == local62 && local62 == local66) {
					local42[local52] = local58 * this.anInt4787 >> 12;
					local46[local52] = this.anInt4780 * local62 >> 12;
					local50[local52] = this.anInt4782 * local66 >> 12;
				} else {
					local42[local52] = this.anInt4787;
					local46[local52] = this.anInt4780;
					local50[local52] = this.anInt4782;
				}
			}
		}
		return local16;
	}
}
