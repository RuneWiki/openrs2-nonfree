import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dq")
public final class Class14_Sub3_Sub8 extends Class14_Sub3 {

	@OriginalMember(owner = "client!dq", name = "K", descriptor = "I")
	private int anInt1522 = 4096;

	@OriginalMember(owner = "client!dq", name = "M", descriptor = "I")
	private int anInt1524 = 4096;

	@OriginalMember(owner = "client!dq", name = "Q", descriptor = "I")
	private int anInt1528 = 4096;

	@OriginalMember(owner = "client!dq", name = "<init>", descriptor = "()V")
	public Class14_Sub3_Sub8() {
		super(1, false);
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5994(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass58_41.method1955(arg0);
		if (super.aClass58_41.aBoolean126) {
			@Pc(26) int[][] local26 = this.method5997(arg0, 0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static294.anInt5657; local52++) {
				@Pc(58) int local58 = local30[local52];
				@Pc(62) int local62 = local38[local52];
				@Pc(66) int local66 = local34[local52];
				if (local58 == local62 && local66 == local62) {
					local42[local52] = this.anInt1528 * local58 >> 12;
					local46[local52] = this.anInt1524 * local62 >> 12;
					local50[local52] = local66 * this.anInt1522 >> 12;
				} else {
					local42[local52] = this.anInt1528;
					local46[local52] = this.anInt1524;
					local50[local52] = this.anInt1522;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(Lclient!jg;II)V")
	@Override
	public void method6000(@OriginalArg(0) Class14_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1528 = arg0.method2498();
		} else if (arg1 == 1) {
			this.anInt1524 = arg0.method2498();
		} else if (arg1 == 2) {
			this.anInt1522 = arg0.method2498();
		}
	}
}
