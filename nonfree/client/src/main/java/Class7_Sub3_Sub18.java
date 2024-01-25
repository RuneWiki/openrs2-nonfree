import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kf")
public final class Class7_Sub3_Sub18 extends Class7_Sub3 {

	@OriginalMember(owner = "client!kf", name = "E", descriptor = "[I")
	private final int[] anIntArray326 = new int[3];

	@OriginalMember(owner = "client!kf", name = "J", descriptor = "I")
	private int anInt3676 = 4096;

	@OriginalMember(owner = "client!kf", name = "M", descriptor = "I")
	private int anInt3678 = 4096;

	@OriginalMember(owner = "client!kf", name = "F", descriptor = "I")
	private int anInt3672 = 409;

	@OriginalMember(owner = "client!kf", name = "O", descriptor = "I")
	private int anInt3679 = 4096;

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "()V")
	public Class7_Sub3_Sub18() {
		super(1, false);
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method5596(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass235_41.method4862(arg0);
		if (super.aClass235_41.aBoolean402) {
			@Pc(26) int[][] local26 = this.method5597(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static58.anInt1052; local52++) {
				@Pc(58) int local58 = local30[local52];
				@Pc(66) int local66 = local58 - this.anIntArray326[0];
				if (local66 < 0) {
					local66 = -local66;
				}
				if (local66 > this.anInt3672) {
					local42[local52] = local58;
					local46[local52] = local34[local52];
					local50[local52] = local38[local52];
				} else {
					@Pc(104) int local104 = local34[local52];
					local66 = local104 - this.anIntArray326[1];
					if (local66 < 0) {
						local66 = -local66;
					}
					if (this.anInt3672 < local66) {
						local42[local52] = local58;
						local46[local52] = local104;
						local50[local52] = local38[local52];
					} else {
						@Pc(148) int local148 = local38[local52];
						local66 = local148 - this.anIntArray326[2];
						if (local66 < 0) {
							local66 = -local66;
						}
						if (this.anInt3672 < local66) {
							local42[local52] = local58;
							local46[local52] = local104;
							local50[local52] = local148;
						} else {
							local42[local52] = local58 * this.anInt3679 >> 12;
							local46[local52] = local104 * this.anInt3676 >> 12;
							local50[local52] = this.anInt3678 * local148 >> 12;
						}
					}
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IZLclient!gk;)V")
	@Override
	public void method5599(@OriginalArg(0) int arg0, @OriginalArg(2) Class7_Sub14 arg1) {
		if (arg0 == 0) {
			this.anInt3672 = arg1.method3943();
		} else if (arg0 == 1) {
			this.anInt3678 = arg1.method3943();
		} else if (arg0 == 2) {
			this.anInt3676 = arg1.method3943();
		} else if (arg0 == 3) {
			this.anInt3679 = arg1.method3943();
		} else if (arg0 == 4) {
			@Pc(63) int local63 = arg1.method3975();
			this.anIntArray326[1] = local63 >> 4 & 0xFF0;
			this.anIntArray326[2] = local63 >> 12 & 0x0;
			this.anIntArray326[0] = (local63 & 0xFF0000) << 4;
		}
	}
}
