import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wba")
public final class Class3_Sub2_Sub38 extends Class3_Sub2 {

	@OriginalMember(owner = "client!wba", name = "z", descriptor = "I")
	private int anInt9973 = 4096;

	@OriginalMember(owner = "client!wba", name = "D", descriptor = "I")
	private int anInt9976 = 4096;

	@OriginalMember(owner = "client!wba", name = "H", descriptor = "I")
	private int anInt9980 = 4096;

	@OriginalMember(owner = "client!wba", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub38() {
		super(1, false);
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(Lclient!sl;IB)V")
	@Override
	public void method8600(@OriginalArg(0) Class3_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt9973 = arg0.method4221();
		} else if (arg1 == 1) {
			this.anInt9980 = arg0.method4221();
		} else if (arg1 == 2) {
			this.anInt9976 = arg0.method4221();
		}
	}

	@OriginalMember(owner = "client!wba", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8604(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass193_41.method4800(arg0);
		if (super.aClass193_41.aBoolean358) {
			@Pc(26) int[][] local26 = this.method8595(arg0, 0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static491.anInt8519; local52++) {
				@Pc(58) int local58 = local30[local52];
				@Pc(62) int local62 = local38[local52];
				@Pc(66) int local66 = local34[local52];
				if (local58 == local62 && local62 == local66) {
					local42[local52] = this.anInt9973 * local58 >> 12;
					local46[local52] = local62 * this.anInt9980 >> 12;
					local50[local52] = local66 * this.anInt9976 >> 12;
				} else {
					local42[local52] = this.anInt9973;
					local46[local52] = this.anInt9980;
					local50[local52] = this.anInt9976;
				}
			}
		}
		return local16;
	}
}
