import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vf")
public final class Class3_Sub3_Sub35 extends Class3_Sub3 {

	@OriginalMember(owner = "client!vf", name = "P", descriptor = "I")
	private int anInt6399 = 4096;

	@OriginalMember(owner = "client!vf", name = "H", descriptor = "I")
	private int anInt6395 = 4096;

	@OriginalMember(owner = "client!vf", name = "T", descriptor = "I")
	private int anInt6403 = 4096;

	@OriginalMember(owner = "client!vf", name = "O", descriptor = "[I")
	private final int[] anIntArray531 = new int[3];

	@OriginalMember(owner = "client!vf", name = "W", descriptor = "I")
	private int anInt6405 = 409;

	@OriginalMember(owner = "client!vf", name = "<init>", descriptor = "()V")
	public Class3_Sub3_Sub35() {
		super(1, false);
	}

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method5734(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass84_41.method2091(arg0);
		if (super.aClass84_41.aBoolean144) {
			@Pc(21) int[][] local21 = this.method5729(0, arg0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static131.anInt2755; local47++) {
				@Pc(53) int local53 = local25[local47];
				@Pc(61) int local61 = local53 - this.anIntArray531[0];
				if (local61 < 0) {
					local61 = -local61;
				}
				if (local61 > this.anInt6405) {
					local37[local47] = local53;
					local41[local47] = local29[local47];
					local45[local47] = local33[local47];
				} else {
					@Pc(96) int local96 = local29[local47];
					local61 = local96 - this.anIntArray531[1];
					if (local61 < 0) {
						local61 = -local61;
					}
					if (this.anInt6405 < local61) {
						local37[local47] = local53;
						local41[local47] = local96;
						local45[local47] = local33[local47];
					} else {
						@Pc(137) int local137 = local33[local47];
						local61 = local137 - this.anIntArray531[2];
						if (local61 < 0) {
							local61 = -local61;
						}
						if (this.anInt6405 < local61) {
							local37[local47] = local53;
							local41[local47] = local96;
							local45[local47] = local137;
						} else {
							local37[local47] = this.anInt6399 * local53 >> 12;
							local41[local47] = local96 * this.anInt6403 >> 12;
							local45[local47] = this.anInt6395 * local137 >> 12;
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lclient!fb;ZI)V")
	@Override
	public void method5731(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6405 = arg0.method3649();
		} else if (arg1 == 1) {
			this.anInt6395 = arg0.method3649();
		} else if (arg1 == 2) {
			this.anInt6403 = arg0.method3649();
		} else if (arg1 == 3) {
			this.anInt6399 = arg0.method3649();
		} else if (arg1 == 4) {
			@Pc(60) int local60 = arg0.method3659();
			this.anIntArray531[1] = local60 >> 4 & 0xFF0;
			this.anIntArray531[2] = local60 >> 12 & 0x0;
			this.anIntArray531[0] = (local60 & 0xFF0000) << 4;
		}
	}
}
