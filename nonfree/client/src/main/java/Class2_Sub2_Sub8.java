import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ge")
public final class Class2_Sub2_Sub8 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ge", name = "Y", descriptor = "I")
	private int anInt1400 = 409;

	@OriginalMember(owner = "client!ge", name = "S", descriptor = "I")
	private int anInt1395 = 4096;

	@OriginalMember(owner = "client!ge", name = "Z", descriptor = "I")
	private int anInt1401 = 4096;

	@OriginalMember(owner = "client!ge", name = "W", descriptor = "[I")
	private int[] anIntArray249 = new int[3];

	@OriginalMember(owner = "client!ge", name = "cb", descriptor = "I")
	private int anInt1403 = 4096;

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub8() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3960(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass51_41.method1700(arg0);
		if (super.aClass51_41.aBoolean82) {
			@Pc(26) int[][] local26 = this.method3952(0, arg0);
			@Pc(30) int[] local30 = local26[1];
			@Pc(34) int[] local34 = local16[1];
			@Pc(38) int[] local38 = local16[2];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local26[2];
			@Pc(50) int[] local50 = local26[0];
			for (@Pc(52) int local52 = 0; local52 < Static54.anInt953; local52++) {
				@Pc(58) int local58 = local50[local52];
				@Pc(66) int local66 = local58 - this.anIntArray249[0];
				if (local66 < 0) {
					local66 = -local66;
				}
				if (local66 > this.anInt1400) {
					local42[local52] = local58;
					local34[local52] = local30[local52];
					local38[local52] = local46[local52];
				} else {
					@Pc(97) int local97 = local30[local52];
					local66 = local97 - this.anIntArray249[1];
					if (local66 < 0) {
						local66 = -local66;
					}
					if (this.anInt1400 < local66) {
						local42[local52] = local58;
						local34[local52] = local97;
						local38[local52] = local46[local52];
					} else {
						@Pc(141) int local141 = local46[local52];
						local66 = local141 - this.anIntArray249[2];
						if (local66 < 0) {
							local66 = -local66;
						}
						if (this.anInt1400 < local66) {
							local42[local52] = local58;
							local34[local52] = local97;
							local38[local52] = local141;
						} else {
							local42[local52] = this.anInt1401 * local58 >> 12;
							local34[local52] = local97 * this.anInt1395 >> 12;
							local38[local52] = this.anInt1403 * local141 >> 12;
						}
					}
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(BLclient!nh;I)V")
	@Override
	public void method3957(@OriginalArg(1) Class2_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1400 = arg0.method2095();
		} else if (arg1 == 1) {
			this.anInt1403 = arg0.method2095();
		} else if (arg1 == 2) {
			this.anInt1395 = arg0.method2095();
		} else if (arg1 == 3) {
			this.anInt1401 = arg0.method2095();
		} else if (arg1 == 4) {
			@Pc(57) int local57 = arg0.method2091();
			this.anIntArray249[1] = local57 >> 4 & 0xFF0;
			this.anIntArray249[0] = (local57 & 0xFF0000) << 4;
			this.anIntArray249[2] = local57 >> 12 & 0x0;
		}
	}
}
