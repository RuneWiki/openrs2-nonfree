import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cl")
public final class Class4_Sub2_Sub8 extends Class4_Sub2 {

	@OriginalMember(owner = "client!cl", name = "G", descriptor = "I")
	private int anInt1561 = 4096;

	@OriginalMember(owner = "client!cl", name = "I", descriptor = "I")
	private int anInt1563 = 4096;

	@OriginalMember(owner = "client!cl", name = "F", descriptor = "[I")
	private final int[] anIntArray106 = new int[3];

	@OriginalMember(owner = "client!cl", name = "K", descriptor = "I")
	private int anInt1565 = 4096;

	@OriginalMember(owner = "client!cl", name = "J", descriptor = "I")
	private int anInt1564 = 409;

	@OriginalMember(owner = "client!cl", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub8() {
		super(1, false);
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method8771(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass304_41.method6699(arg0);
		if (super.aClass304_41.aBoolean604) {
			@Pc(26) int[][] local26 = this.method8772(arg0, 0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static269.anInt4330; local52++) {
				@Pc(58) int local58 = local30[local52];
				@Pc(66) int local66 = local58 - this.anIntArray106[0];
				if (local66 < 0) {
					local66 = -local66;
				}
				if (local66 > this.anInt1564) {
					local42[local52] = local58;
					local46[local52] = local34[local52];
					local50[local52] = local38[local52];
				} else {
					@Pc(100) int local100 = local34[local52];
					local66 = local100 - this.anIntArray106[1];
					if (local66 < 0) {
						local66 = -local66;
					}
					if (this.anInt1564 < local66) {
						local42[local52] = local58;
						local46[local52] = local100;
						local50[local52] = local38[local52];
					} else {
						@Pc(144) int local144 = local38[local52];
						local66 = local144 - this.anIntArray106[2];
						if (local66 < 0) {
							local66 = -local66;
						}
						if (this.anInt1564 < local66) {
							local42[local52] = local58;
							local46[local52] = local100;
							local50[local52] = local144;
						} else {
							local42[local52] = local58 * this.anInt1565 >> 12;
							local46[local52] = this.anInt1563 * local100 >> 12;
							local50[local52] = this.anInt1561 * local144 >> 12;
						}
					}
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(BILclient!es;)V")
	@Override
	public void method8767(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt1564 = arg1.method8859();
		} else if (arg0 == 1) {
			this.anInt1561 = arg1.method8859();
		} else if (arg0 == 2) {
			this.anInt1563 = arg1.method8859();
		} else if (arg0 == 3) {
			this.anInt1565 = arg1.method8859();
		} else if (arg0 == 4) {
			@Pc(57) int local57 = arg1.method8827();
			this.anIntArray106[1] = local57 >> 4 & 0xFF0;
			this.anIntArray106[0] = (local57 & 0xFF0000) << 4;
			this.anIntArray106[2] = local57 >> 12 & 0x0;
		}
	}
}
