import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gi")
public final class Class1_Sub1_Sub10 extends Class1_Sub1 {

	@OriginalMember(owner = "client!gi", name = "ab", descriptor = "I")
	private int anInt1675 = 4096;

	@OriginalMember(owner = "client!gi", name = "U", descriptor = "I")
	private int anInt1671 = 409;

	@OriginalMember(owner = "client!gi", name = "Y", descriptor = "[I")
	private int[] anIntArray153 = new int[3];

	@OriginalMember(owner = "client!gi", name = "hb", descriptor = "I")
	private int anInt1677 = 4096;

	@OriginalMember(owner = "client!gi", name = "jb", descriptor = "I")
	private int anInt1678 = 4096;

	@OriginalMember(owner = "client!gi", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub10() {
		super(1, false);
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lclient!vf;II)V")
	@Override
	public void method3711(@OriginalArg(0) Class1_Sub26 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt1671 = arg0.method2964();
		} else if (arg1 == 1) {
			this.anInt1675 = arg0.method2964();
		} else if (arg1 == 2) {
			this.anInt1678 = arg0.method2964();
		} else if (arg1 == 3) {
			this.anInt1677 = arg0.method2964();
		} else if (arg1 == 4) {
			@Pc(59) int local59 = arg0.method2937();
			this.anIntArray153[1] = local59 >> 4 & 0xFF0;
			this.anIntArray153[2] = local59 >> 12 & 0x0;
			this.anIntArray153[0] = (local59 & 0xFF0000) << 4;
		}
	}

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3704(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass71_41.method2050(arg0);
		if (super.aClass71_41.aBoolean221) {
			@Pc(26) int[][] local26 = this.method3713(arg0, 0);
			@Pc(30) int[] local30 = local26[1];
			@Pc(34) int[] local34 = local26[0];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local16[1];
			@Pc(46) int[] local46 = local16[0];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static11.anInt294; local52++) {
				@Pc(58) int local58 = local34[local52];
				@Pc(66) int local66 = local58 - this.anIntArray153[0];
				if (local66 < 0) {
					local66 = -local66;
				}
				if (local66 > this.anInt1671) {
					local46[local52] = local58;
					local42[local52] = local30[local52];
					local50[local52] = local38[local52];
				} else {
					@Pc(101) int local101 = local30[local52];
					local66 = local101 - this.anIntArray153[1];
					if (local66 < 0) {
						local66 = -local66;
					}
					if (this.anInt1671 < local66) {
						local46[local52] = local58;
						local42[local52] = local101;
						local50[local52] = local38[local52];
					} else {
						@Pc(140) int local140 = local38[local52];
						local66 = local140 - this.anIntArray153[2];
						if (local66 < 0) {
							local66 = -local66;
						}
						if (local66 > this.anInt1671) {
							local46[local52] = local58;
							local42[local52] = local101;
							local50[local52] = local140;
						} else {
							local46[local52] = local58 * this.anInt1677 >> 12;
							local42[local52] = this.anInt1678 * local101 >> 12;
							local50[local52] = local140 * this.anInt1675 >> 12;
						}
					}
				}
			}
		}
		return local16;
	}
}
