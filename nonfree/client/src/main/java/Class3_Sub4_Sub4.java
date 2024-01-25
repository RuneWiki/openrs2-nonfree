import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bs")
public final class Class3_Sub4_Sub4 extends Class3_Sub4 {

	@OriginalMember(owner = "client!bs", name = "K", descriptor = "[I")
	private final int[] anIntArray68 = new int[3];

	@OriginalMember(owner = "client!bs", name = "L", descriptor = "I")
	private int anInt1059 = 4096;

	@OriginalMember(owner = "client!bs", name = "P", descriptor = "I")
	private int anInt1062 = 4096;

	@OriginalMember(owner = "client!bs", name = "T", descriptor = "I")
	private int anInt1065 = 4096;

	@OriginalMember(owner = "client!bs", name = "N", descriptor = "I")
	private int anInt1061 = 409;

	@OriginalMember(owner = "client!bs", name = "<init>", descriptor = "()V")
	public Class3_Sub4_Sub4() {
		super(1, false);
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5955(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass214_41.method5177(arg0);
		if (super.aClass214_41.aBoolean455) {
			@Pc(26) int[][] local26 = this.method5962(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static106.anInt2356; local52++) {
				@Pc(58) int local58 = local30[local52];
				@Pc(66) int local66 = local58 - this.anIntArray68[0];
				if (local66 < 0) {
					local66 = -local66;
				}
				if (local66 > this.anInt1061) {
					local42[local52] = local58;
					local46[local52] = local34[local52];
					local50[local52] = local38[local52];
				} else {
					@Pc(100) int local100 = local34[local52];
					local66 = local100 - this.anIntArray68[1];
					if (local66 < 0) {
						local66 = -local66;
					}
					if (local66 > this.anInt1061) {
						local42[local52] = local58;
						local46[local52] = local100;
						local50[local52] = local38[local52];
					} else {
						@Pc(137) int local137 = local38[local52];
						local66 = local137 - this.anIntArray68[2];
						if (local66 < 0) {
							local66 = -local66;
						}
						if (local66 > this.anInt1061) {
							local42[local52] = local58;
							local46[local52] = local100;
							local50[local52] = local137;
						} else {
							local42[local52] = local58 * this.anInt1065 >> 12;
							local46[local52] = this.anInt1062 * local100 >> 12;
							local50[local52] = local137 * this.anInt1059 >> 12;
						}
					}
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(IILclient!bt;)V")
	@Override
	public void method5958(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt1061 = arg1.method6004();
		} else if (arg0 == 1) {
			this.anInt1059 = arg1.method6004();
		} else if (arg0 == 2) {
			this.anInt1062 = arg1.method6004();
		} else if (arg0 == 3) {
			this.anInt1065 = arg1.method6004();
		} else if (arg0 == 4) {
			@Pc(58) int local58 = arg1.method6020();
			this.anIntArray68[2] = local58 >> 12 & 0x0;
			this.anIntArray68[0] = (local58 & 0xFF0000) << 4;
			this.anIntArray68[1] = local58 >> 4 & 0xFF0;
		}
	}
}
