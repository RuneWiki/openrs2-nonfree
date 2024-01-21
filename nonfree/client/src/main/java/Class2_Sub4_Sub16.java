import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jf")
public final class Class2_Sub4_Sub16 extends Class2_Sub4 {

	@OriginalMember(owner = "client!jf", name = "T", descriptor = "I")
	private int anInt2131 = 4096;

	@OriginalMember(owner = "client!jf", name = "U", descriptor = "I")
	private int anInt2132 = 4096;

	@OriginalMember(owner = "client!jf", name = "W", descriptor = "I")
	private int anInt2133 = 4096;

	@OriginalMember(owner = "client!jf", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub16() {
		super(1, false);
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IBLclient!kd;)V")
	@Override
	public void method3120(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt2133 = arg1.method1557();
		} else if (arg0 == 1) {
			this.anInt2132 = arg1.method1557();
		} else if (arg0 == 2) {
			this.anInt2131 = arg1.method1557();
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3122(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass99_41.method2748(arg0);
		if (super.aClass99_41.aBoolean176) {
			@Pc(26) int[][] local26 = this.method3130(arg0, 0);
			@Pc(30) int[] local30 = local26[1];
			@Pc(34) int[] local34 = local26[2];
			@Pc(38) int[] local38 = local16[0];
			@Pc(42) int[] local42 = local26[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static118.anInt2608; local52++) {
				@Pc(58) int local58 = local42[local52];
				@Pc(62) int local62 = local34[local52];
				@Pc(66) int local66 = local30[local52];
				if (local62 == local58 && local62 == local66) {
					local38[local52] = this.anInt2133 * local58 >> 12;
					local46[local52] = local62 * this.anInt2132 >> 12;
					local50[local52] = local66 * this.anInt2131 >> 12;
				} else {
					local38[local52] = this.anInt2133;
					local46[local52] = this.anInt2132;
					local50[local52] = this.anInt2131;
				}
			}
		}
		return local16;
	}
}
