import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class Class11_Sub2_Sub15 extends Class11_Sub2 {

	@OriginalMember(owner = "client!jc", name = "I", descriptor = "I")
	private int anInt2589 = 4096;

	@OriginalMember(owner = "client!jc", name = "J", descriptor = "I")
	private int anInt2590 = 4096;

	@OriginalMember(owner = "client!jc", name = "F", descriptor = "I")
	private int anInt2587 = 4096;

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "()V")
	public Class11_Sub2_Sub15() {
		super(1, false);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!kh;BI)V")
	@Override
	public void method5711(@OriginalArg(0) Class11_Sub25 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2590 = arg0.method5187();
		} else if (arg1 == 1) {
			this.anInt2589 = arg0.method5187();
		} else if (arg1 == 2) {
			this.anInt2587 = arg0.method5187();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5709(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass63_41.method1118(arg0);
		if (super.aClass63_41.aBoolean85) {
			@Pc(26) int[][] local26 = this.method5715(arg0, 0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local11[0];
			@Pc(46) int[] local46 = local11[1];
			@Pc(50) int[] local50 = local11[2];
			for (@Pc(52) int local52 = 0; local52 < Static339.anInt6549; local52++) {
				@Pc(58) int local58 = local30[local52];
				@Pc(62) int local62 = local38[local52];
				@Pc(66) int local66 = local34[local52];
				if (local62 == local58 && local62 == local66) {
					local42[local52] = local58 * this.anInt2590 >> 12;
					local46[local52] = this.anInt2589 * local62 >> 12;
					local50[local52] = local66 * this.anInt2587 >> 12;
				} else {
					local42[local52] = this.anInt2590;
					local46[local52] = this.anInt2589;
					local50[local52] = this.anInt2587;
				}
			}
		}
		return local11;
	}
}
