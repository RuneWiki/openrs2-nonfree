import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sl")
public final class Class6_Sub1_Sub32 extends Class6_Sub1 {

	@OriginalMember(owner = "client!sl", name = "L", descriptor = "I")
	private int anInt5469 = 4096;

	@OriginalMember(owner = "client!sl", name = "M", descriptor = "I")
	private int anInt5470 = 4096;

	@OriginalMember(owner = "client!sl", name = "N", descriptor = "I")
	private int anInt5471 = 4096;

	@OriginalMember(owner = "client!sl", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub32() {
		super(1, false);
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(BLclient!ec;I)V")
	@Override
	public void method5617(@OriginalArg(1) Class6_Sub10 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5471 = arg0.method4021();
		} else if (arg1 == 1) {
			this.anInt5469 = arg0.method4021();
		} else if (arg1 == 2) {
			this.anInt5470 = arg0.method4021();
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method5608(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass220_41.method5816(arg0);
		if (super.aClass220_41.aBoolean429) {
			@Pc(26) int[][] local26 = this.method5618(arg0, 0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local11[0];
			@Pc(46) int[] local46 = local11[1];
			@Pc(50) int[] local50 = local11[2];
			for (@Pc(52) int local52 = 0; local52 < Static299.anInt5659; local52++) {
				@Pc(58) int local58 = local30[local52];
				@Pc(62) int local62 = local38[local52];
				@Pc(66) int local66 = local34[local52];
				if (local62 == local58 && local62 == local66) {
					local42[local52] = this.anInt5471 * local58 >> 12;
					local46[local52] = this.anInt5469 * local62 >> 12;
					local50[local52] = this.anInt5470 * local66 >> 12;
				} else {
					local42[local52] = this.anInt5471;
					local46[local52] = this.anInt5469;
					local50[local52] = this.anInt5470;
				}
			}
		}
		return local11;
	}
}
