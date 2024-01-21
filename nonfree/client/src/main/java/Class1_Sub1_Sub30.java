import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rh")
public final class Class1_Sub1_Sub30 extends Class1_Sub1 {

	@OriginalMember(owner = "client!rh", name = "V", descriptor = "I")
	private int anInt3433 = 4096;

	@OriginalMember(owner = "client!rh", name = "gb", descriptor = "I")
	private int anInt3441 = 4096;

	@OriginalMember(owner = "client!rh", name = "hb", descriptor = "I")
	private int anInt3442 = 4096;

	@OriginalMember(owner = "client!rh", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub30() {
		super(1, false);
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lclient!ka;BI)V")
	@Override
	public void method3390(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3441 = arg0.method3023();
		} else if (arg1 == 1) {
			this.anInt3433 = arg0.method3023();
		} else if (arg1 == 2) {
			this.anInt3442 = arg0.method3023();
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method3398(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass75_41.method2104(arg0);
		if (super.aClass75_41.aBoolean166) {
			@Pc(26) int[][] local26 = this.method3397(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[2];
			@Pc(50) int[] local50 = local16[1];
			for (@Pc(52) int local52 = 0; local52 < Static107.anInt2321; local52++) {
				@Pc(58) int local58 = local30[local52];
				@Pc(62) int local62 = local38[local52];
				@Pc(66) int local66 = local34[local52];
				if (local62 == local58 && local62 == local66) {
					local42[local52] = this.anInt3441 * local58 >> 12;
					local50[local52] = this.anInt3433 * local62 >> 12;
					local46[local52] = this.anInt3442 * local66 >> 12;
				} else {
					local42[local52] = this.anInt3441;
					local50[local52] = this.anInt3433;
					local46[local52] = this.anInt3442;
				}
			}
		}
		return local16;
	}
}
