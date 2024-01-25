import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jr")
public final class Class4_Sub6_Sub14 extends Class4_Sub6 {

	@OriginalMember(owner = "client!jr", name = "K", descriptor = "[I")
	private final int[] anIntArray298 = new int[3];

	@OriginalMember(owner = "client!jr", name = "O", descriptor = "I")
	private int anInt3363 = 409;

	@OriginalMember(owner = "client!jr", name = "Q", descriptor = "I")
	private int anInt3364 = 4096;

	@OriginalMember(owner = "client!jr", name = "U", descriptor = "I")
	private int anInt3368 = 4096;

	@OriginalMember(owner = "client!jr", name = "Y", descriptor = "I")
	private int anInt3370 = 4096;

	@OriginalMember(owner = "client!jr", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub14() {
		super(1, false);
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(IILclient!lf;)V")
	@Override
	public void method5697(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt3363 = arg1.method3401();
		} else if (arg0 == 1) {
			this.anInt3370 = arg1.method3401();
		} else if (arg0 == 2) {
			this.anInt3364 = arg1.method3401();
		} else if (arg0 == 3) {
			this.anInt3368 = arg1.method3401();
		} else if (arg0 == 4) {
			@Pc(51) int local51 = arg1.method3442();
			this.anIntArray298[0] = (local51 & 0xFF0000) << 4;
			this.anIntArray298[1] = local51 >> 4 & 0xFF0;
			this.anIntArray298[2] = local51 >> 12 & 0x0;
		}
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5694(@OriginalArg(1) int arg0) {
		@Pc(18) int[][] local18 = super.aClass90_41.method2575(arg0);
		if (super.aClass90_41.aBoolean211) {
			@Pc(30) int[][] local30 = this.method5693(0, arg0);
			@Pc(34) int[] local34 = local30[0];
			@Pc(38) int[] local38 = local30[1];
			@Pc(42) int[] local42 = local30[2];
			@Pc(46) int[] local46 = local18[0];
			@Pc(50) int[] local50 = local18[1];
			@Pc(54) int[] local54 = local18[2];
			for (@Pc(56) int local56 = 0; local56 < Static31.anInt797; local56++) {
				@Pc(62) int local62 = local34[local56];
				@Pc(69) int local69 = local62 - this.anIntArray298[0];
				if (local69 < 0) {
					local69 = -local69;
				}
				if (local69 > this.anInt3363) {
					local46[local56] = local62;
					local50[local56] = local38[local56];
					local54[local56] = local42[local56];
				} else {
					@Pc(100) int local100 = local38[local56];
					local69 = local100 - this.anIntArray298[1];
					if (local69 < 0) {
						local69 = -local69;
					}
					if (this.anInt3363 < local69) {
						local46[local56] = local62;
						local50[local56] = local100;
						local54[local56] = local42[local56];
					} else {
						@Pc(137) int local137 = local42[local56];
						local69 = local137 - this.anIntArray298[2];
						if (local69 < 0) {
							local69 = -local69;
						}
						if (this.anInt3363 < local69) {
							local46[local56] = local62;
							local50[local56] = local100;
							local54[local56] = local137;
						} else {
							local46[local56] = local62 * this.anInt3368 >> 12;
							local50[local56] = local100 * this.anInt3364 >> 12;
							local54[local56] = this.anInt3370 * local137 >> 12;
						}
					}
				}
			}
		}
		return local18;
	}
}
