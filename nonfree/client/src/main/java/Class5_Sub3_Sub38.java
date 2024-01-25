import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vd")
public final class Class5_Sub3_Sub38 extends Class5_Sub3 {

	@OriginalMember(owner = "client!vd", name = "M", descriptor = "I")
	private int anInt6464 = 4096;

	@OriginalMember(owner = "client!vd", name = "O", descriptor = "[I")
	private final int[] anIntArray600 = new int[3];

	@OriginalMember(owner = "client!vd", name = "T", descriptor = "I")
	private int anInt6468 = 409;

	@OriginalMember(owner = "client!vd", name = "U", descriptor = "I")
	private int anInt6469 = 4096;

	@OriginalMember(owner = "client!vd", name = "Q", descriptor = "I")
	private int anInt6465 = 4096;

	@OriginalMember(owner = "client!vd", name = "<init>", descriptor = "()V")
	public Class5_Sub3_Sub38() {
		super(1, false);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lclient!rg;BI)V")
	@Override
	public void method6017(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6468 = arg0.method5106();
		} else if (arg1 == 1) {
			this.anInt6469 = arg0.method5106();
		} else if (arg1 == 2) {
			this.anInt6465 = arg0.method5106();
		} else if (arg1 == 3) {
			this.anInt6464 = arg0.method5106();
		} else if (arg1 == 4) {
			@Pc(67) int local67 = arg0.method5072();
			this.anIntArray600[2] = local67 >> 12 & 0x0;
			this.anIntArray600[0] = (local67 & 0xFF0000) << 4;
			this.anIntArray600[1] = local67 >> 4 & 0xFF0;
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method6016(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass53_41.method969(arg0);
		if (super.aClass53_41.aBoolean83) {
			@Pc(21) int[][] local21 = this.method6023(0, arg0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static7.anInt129; local47++) {
				@Pc(53) int local53 = local25[local47];
				@Pc(61) int local61 = local53 - this.anIntArray600[0];
				if (local61 < 0) {
					local61 = -local61;
				}
				if (local61 > this.anInt6468) {
					local37[local47] = local53;
					local41[local47] = local29[local47];
					local45[local47] = local33[local47];
				} else {
					@Pc(92) int local92 = local29[local47];
					local61 = local92 - this.anIntArray600[1];
					if (local61 < 0) {
						local61 = -local61;
					}
					if (this.anInt6468 < local61) {
						local37[local47] = local53;
						local41[local47] = local92;
						local45[local47] = local33[local47];
					} else {
						@Pc(132) int local132 = local33[local47];
						local61 = local132 - this.anIntArray600[2];
						if (local61 < 0) {
							local61 = -local61;
						}
						if (this.anInt6468 < local61) {
							local37[local47] = local53;
							local41[local47] = local92;
							local45[local47] = local132;
						} else {
							local37[local47] = local53 * this.anInt6464 >> 12;
							local41[local47] = local92 * this.anInt6465 >> 12;
							local45[local47] = local132 * this.anInt6469 >> 12;
						}
					}
				}
			}
		}
		return local11;
	}
}
