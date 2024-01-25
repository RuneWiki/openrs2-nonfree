import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mt")
public final class Class5_Sub2_Sub24 extends Class5_Sub2 {

	@OriginalMember(owner = "client!mt", name = "H", descriptor = "[I")
	private final int[] anIntArray385 = new int[3];

	@OriginalMember(owner = "client!mt", name = "G", descriptor = "I")
	private int anInt6810 = 4096;

	@OriginalMember(owner = "client!mt", name = "J", descriptor = "I")
	private int anInt6812 = 409;

	@OriginalMember(owner = "client!mt", name = "I", descriptor = "I")
	private int anInt6811 = 4096;

	@OriginalMember(owner = "client!mt", name = "M", descriptor = "I")
	private int anInt6815 = 4096;

	@OriginalMember(owner = "client!mt", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub24() {
		super(1, false);
	}

	@OriginalMember(owner = "client!mt", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8943(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass180_41.method4548(arg0);
		if (super.aClass180_41.aBoolean464) {
			@Pc(29) int[][] local29 = this.method8952(0, arg0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[2];
			for (@Pc(55) int local55 = 0; local55 < Static195.anInt3759; local55++) {
				@Pc(61) int local61 = local33[local55];
				@Pc(69) int local69 = local61 - this.anIntArray385[0];
				if (local69 < 0) {
					local69 = -local69;
				}
				if (this.anInt6812 < local69) {
					local45[local55] = local61;
					local49[local55] = local37[local55];
					local53[local55] = local41[local55];
				} else {
					@Pc(103) int local103 = local37[local55];
					local69 = local103 - this.anIntArray385[1];
					if (local69 < 0) {
						local69 = -local69;
					}
					if (this.anInt6812 < local69) {
						local45[local55] = local61;
						local49[local55] = local103;
						local53[local55] = local41[local55];
					} else {
						@Pc(140) int local140 = local41[local55];
						local69 = local140 - this.anIntArray385[2];
						if (local69 < 0) {
							local69 = -local69;
						}
						if (local69 > this.anInt6812) {
							local45[local55] = local61;
							local49[local55] = local103;
							local53[local55] = local140;
						} else {
							local45[local55] = this.anInt6811 * local61 >> 12;
							local49[local55] = local103 * this.anInt6815 >> 12;
							local53[local55] = this.anInt6810 * local140 >> 12;
						}
					}
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(Lclient!mc;II)V")
	@Override
	public void method8944(@OriginalArg(0) Class5_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt6812 = arg0.method7860();
		} else if (arg1 == 1) {
			this.anInt6810 = arg0.method7860();
		} else if (arg1 == 2) {
			this.anInt6815 = arg0.method7860();
		} else if (arg1 == 3) {
			this.anInt6811 = arg0.method7860();
		} else if (arg1 == 4) {
			@Pc(62) int local62 = arg0.method7807();
			this.anIntArray385[0] = (local62 & 0xFF0000) << 4;
			this.anIntArray385[1] = local62 >> 4 & 0xFF0;
			this.anIntArray385[2] = local62 >> 12 & 0x0;
		}
	}
}
