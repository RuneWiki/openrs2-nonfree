import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sq")
public final class Class4_Sub4_Sub33 extends Class4_Sub4 {

	@OriginalMember(owner = "client!sq", name = "P", descriptor = "I")
	private int anInt5999 = 4096;

	@OriginalMember(owner = "client!sq", name = "X", descriptor = "[I")
	private final int[] anIntArray491 = new int[3];

	@OriginalMember(owner = "client!sq", name = "W", descriptor = "I")
	private int anInt6004 = 409;

	@OriginalMember(owner = "client!sq", name = "T", descriptor = "I")
	private int anInt6001 = 4096;

	@OriginalMember(owner = "client!sq", name = "N", descriptor = "I")
	private int anInt5997 = 4096;

	@OriginalMember(owner = "client!sq", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub33() {
		super(1, false);
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IBLclient!tq;)V")
	@Override
	public void method5387(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt6004 = arg1.method2404();
		} else if (arg0 == 1) {
			this.anInt5997 = arg1.method2404();
		} else if (arg0 == 2) {
			this.anInt5999 = arg1.method2404();
		} else if (arg0 == 3) {
			this.anInt6001 = arg1.method2404();
		} else if (arg0 == 4) {
			@Pc(58) int local58 = arg1.method2402();
			this.anIntArray491[1] = local58 >> 4 & 0xFF0;
			this.anIntArray491[0] = (local58 & 0xFF0000) << 4;
			this.anIntArray491[2] = local58 >> 12 & 0x0;
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method5383(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass160_41.method4316(arg0);
		if (super.aClass160_41.aBoolean441) {
			@Pc(26) int[][] local26 = this.method5384(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static124.anInt3576; local52++) {
				@Pc(58) int local58 = local30[local52];
				@Pc(66) int local66 = local58 - this.anIntArray491[0];
				if (local66 < 0) {
					local66 = -local66;
				}
				if (this.anInt6004 < local66) {
					local42[local52] = local58;
					local46[local52] = local34[local52];
					local50[local52] = local38[local52];
				} else {
					@Pc(101) int local101 = local34[local52];
					local66 = local101 - this.anIntArray491[1];
					if (local66 < 0) {
						local66 = -local66;
					}
					if (local66 > this.anInt6004) {
						local42[local52] = local58;
						local46[local52] = local101;
						local50[local52] = local38[local52];
					} else {
						@Pc(140) int local140 = local38[local52];
						local66 = local140 - this.anIntArray491[2];
						if (local66 < 0) {
							local66 = -local66;
						}
						if (this.anInt6004 < local66) {
							local42[local52] = local58;
							local46[local52] = local101;
							local50[local52] = local140;
						} else {
							local42[local52] = local58 * this.anInt6001 >> 12;
							local46[local52] = local101 * this.anInt5999 >> 12;
							local50[local52] = this.anInt5997 * local140 >> 12;
						}
					}
				}
			}
		}
		return local16;
	}
}
