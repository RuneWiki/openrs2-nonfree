import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!te")
public final class Class1_Sub1_Sub33 extends Class1_Sub1 {

	@OriginalMember(owner = "client!te", name = "V", descriptor = "[I")
	private final int[] anIntArray348 = new int[3];

	@OriginalMember(owner = "client!te", name = "X", descriptor = "I")
	private int anInt4042 = 4096;

	@OriginalMember(owner = "client!te", name = "S", descriptor = "I")
	private int anInt4039 = 409;

	@OriginalMember(owner = "client!te", name = "Z", descriptor = "I")
	private int anInt4044 = 4096;

	@OriginalMember(owner = "client!te", name = "T", descriptor = "I")
	private int anInt4040 = 4096;

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub33() {
		super(1, false);
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!fj;IB)V")
	@Override
	public void method3573(@OriginalArg(0) Class1_Sub7 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt4039 = arg0.method2765();
		} else if (arg1 == 1) {
			this.anInt4044 = arg0.method2765();
		} else if (arg1 == 2) {
			this.anInt4040 = arg0.method2765();
		} else if (arg1 == 3) {
			this.anInt4042 = arg0.method2765();
		} else if (arg1 == 4) {
			@Pc(62) int local62 = arg0.method2745();
			this.anIntArray348[2] = local62 >> 12 & 0x0;
			this.anIntArray348[0] = (local62 & 0xFF0000) << 4;
			this.anIntArray348[1] = local62 >> 4 & 0xFF0;
		}
	}

	@OriginalMember(owner = "client!te", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method3576(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass33_41.method1274(arg0);
		if (super.aClass33_41.aBoolean80) {
			@Pc(26) int[][] local26 = this.method3579(arg0, 0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[2];
			@Pc(38) int[] local38 = local11[0];
			@Pc(42) int[] local42 = local26[1];
			@Pc(46) int[] local46 = local11[2];
			@Pc(50) int[] local50 = local11[1];
			for (@Pc(52) int local52 = 0; local52 < Static115.anInt2578; local52++) {
				@Pc(58) int local58 = local30[local52];
				@Pc(66) int local66 = local58 - this.anIntArray348[0];
				if (local66 < 0) {
					local66 = -local66;
				}
				if (this.anInt4039 < local66) {
					local38[local52] = local58;
					local50[local52] = local42[local52];
					local46[local52] = local34[local52];
				} else {
					@Pc(104) int local104 = local42[local52];
					local66 = local104 - this.anIntArray348[1];
					if (local66 < 0) {
						local66 = -local66;
					}
					if (local66 > this.anInt4039) {
						local38[local52] = local58;
						local50[local52] = local104;
						local46[local52] = local34[local52];
					} else {
						@Pc(140) int local140 = local34[local52];
						local66 = local140 - this.anIntArray348[2];
						if (local66 < 0) {
							local66 = -local66;
						}
						if (local66 > this.anInt4039) {
							local38[local52] = local58;
							local50[local52] = local104;
							local46[local52] = local140;
						} else {
							local38[local52] = local58 * this.anInt4042 >> 12;
							local50[local52] = this.anInt4040 * local104 >> 12;
							local46[local52] = local140 * this.anInt4044 >> 12;
						}
					}
				}
			}
		}
		return local11;
	}
}
