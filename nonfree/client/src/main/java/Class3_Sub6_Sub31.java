import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sr")
public final class Class3_Sub6_Sub31 extends Class3_Sub6 {

	@OriginalMember(owner = "client!sr", name = "D", descriptor = "I")
	private int anInt8052 = 4096;

	@OriginalMember(owner = "client!sr", name = "I", descriptor = "I")
	private int anInt8055 = 4096;

	@OriginalMember(owner = "client!sr", name = "E", descriptor = "[I")
	private final int[] anIntArray513 = new int[3];

	@OriginalMember(owner = "client!sr", name = "J", descriptor = "I")
	private int anInt8056 = 4096;

	@OriginalMember(owner = "client!sr", name = "F", descriptor = "I")
	private int anInt8053 = 409;

	@OriginalMember(owner = "client!sr", name = "<init>", descriptor = "()V")
	public Class3_Sub6_Sub31() {
		super(1, false);
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(ILclient!np;I)V")
	@Override
	public void method7771(@OriginalArg(1) Class3_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt8053 = arg0.method5198();
		} else if (arg1 == 1) {
			this.anInt8056 = arg0.method5198();
		} else if (arg1 == 2) {
			this.anInt8055 = arg0.method5198();
		} else if (arg1 == 3) {
			this.anInt8052 = arg0.method5198();
		} else if (arg1 == 4) {
			@Pc(58) int local58 = arg0.method5230();
			this.anIntArray513[0] = (local58 & 0xFF0000) << 4;
			this.anIntArray513[2] = local58 >> 12 & 0x0;
			this.anIntArray513[1] = local58 >> 4 & 0xFF0;
		}
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method7776(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass155_41.method3666(arg0);
		if (super.aClass155_41.aBoolean306) {
			@Pc(26) int[][] local26 = this.method7773(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local11[0];
			@Pc(46) int[] local46 = local11[1];
			@Pc(50) int[] local50 = local11[2];
			for (@Pc(52) int local52 = 0; local52 < Static521.anInt8383; local52++) {
				@Pc(58) int local58 = local30[local52];
				@Pc(66) int local66 = local58 - this.anIntArray513[0];
				if (local66 < 0) {
					local66 = -local66;
				}
				if (local66 > this.anInt8053) {
					local42[local52] = local58;
					local46[local52] = local34[local52];
					local50[local52] = local38[local52];
				} else {
					@Pc(101) int local101 = local34[local52];
					local66 = local101 - this.anIntArray513[1];
					if (local66 < 0) {
						local66 = -local66;
					}
					if (this.anInt8053 < local66) {
						local42[local52] = local58;
						local46[local52] = local101;
						local50[local52] = local38[local52];
					} else {
						@Pc(141) int local141 = local38[local52];
						local66 = local141 - this.anIntArray513[2];
						if (local66 < 0) {
							local66 = -local66;
						}
						if (this.anInt8053 < local66) {
							local42[local52] = local58;
							local46[local52] = local101;
							local50[local52] = local141;
						} else {
							local42[local52] = this.anInt8052 * local58 >> 12;
							local46[local52] = local101 * this.anInt8055 >> 12;
							local50[local52] = local141 * this.anInt8056 >> 12;
						}
					}
				}
			}
		}
		return local11;
	}
}
