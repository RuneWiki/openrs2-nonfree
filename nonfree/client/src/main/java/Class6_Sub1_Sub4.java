import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public final class Class6_Sub1_Sub4 extends Class6_Sub1 {

	@OriginalMember(owner = "client!dd", name = "G", descriptor = "I")
	private int anInt2082 = 409;

	@OriginalMember(owner = "client!dd", name = "H", descriptor = "[I")
	private final int[] anIntArray147 = new int[3];

	@OriginalMember(owner = "client!dd", name = "P", descriptor = "I")
	private int anInt2090 = 4096;

	@OriginalMember(owner = "client!dd", name = "L", descriptor = "I")
	private int anInt2086 = 4096;

	@OriginalMember(owner = "client!dd", name = "N", descriptor = "I")
	private int anInt2088 = 4096;

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub4() {
		super(1, false);
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILclient!iaa;Z)V")
	@Override
	public void method8167(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub26 arg1) {
		if (arg0 == 0) {
			this.anInt2082 = arg1.method4999();
		} else if (arg0 == 1) {
			this.anInt2090 = arg1.method4999();
		} else if (arg0 == 2) {
			this.anInt2088 = arg1.method4999();
		} else if (arg0 == 3) {
			this.anInt2086 = arg1.method4999();
		} else if (arg0 == 4) {
			@Pc(59) int local59 = arg1.method4949();
			this.anIntArray147[0] = (local59 & 0xFF0000) << 4;
			this.anIntArray147[1] = local59 >> 4 & 0xFF0;
			this.anIntArray147[2] = local59 >> 12 & 0x0;
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8158(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass184_41.method4578(arg0);
		if (super.aClass184_41.aBoolean402) {
			@Pc(26) int[][] local26 = this.method8162(arg0, 0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static289.anInt5549; local52++) {
				@Pc(58) int local58 = local30[local52];
				@Pc(66) int local66 = local58 - this.anIntArray147[0];
				if (local66 < 0) {
					local66 = -local66;
				}
				if (local66 > this.anInt2082) {
					local42[local52] = local58;
					local46[local52] = local34[local52];
					local50[local52] = local38[local52];
				} else {
					@Pc(104) int local104 = local34[local52];
					local66 = local104 - this.anIntArray147[1];
					if (local66 < 0) {
						local66 = -local66;
					}
					if (local66 > this.anInt2082) {
						local42[local52] = local58;
						local46[local52] = local104;
						local50[local52] = local38[local52];
					} else {
						@Pc(145) int local145 = local38[local52];
						local66 = local145 - this.anIntArray147[2];
						if (local66 < 0) {
							local66 = -local66;
						}
						if (local66 > this.anInt2082) {
							local42[local52] = local58;
							local46[local52] = local104;
							local50[local52] = local145;
						} else {
							local42[local52] = this.anInt2086 * local58 >> 12;
							local46[local52] = local104 * this.anInt2088 >> 12;
							local50[local52] = local145 * this.anInt2090 >> 12;
						}
					}
				}
			}
		}
		return local16;
	}
}
