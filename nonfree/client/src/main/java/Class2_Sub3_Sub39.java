import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wh")
public final class Class2_Sub3_Sub39 extends Class2_Sub3 {

	@OriginalMember(owner = "client!wh", name = "L", descriptor = "I")
	private int anInt6818 = 409;

	@OriginalMember(owner = "client!wh", name = "N", descriptor = "I")
	private int anInt6820 = 4096;

	@OriginalMember(owner = "client!wh", name = "Q", descriptor = "I")
	private int anInt6822 = 4096;

	@OriginalMember(owner = "client!wh", name = "O", descriptor = "[I")
	private final int[] anIntArray526 = new int[3];

	@OriginalMember(owner = "client!wh", name = "T", descriptor = "I")
	private int anInt6825 = 4096;

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub39() {
		super(1, false);
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method5702(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass90_41.method2391(arg0);
		if (super.aClass90_41.aBoolean257) {
			@Pc(29) int[][] local29 = this.method5707(arg0, 0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[2];
			for (@Pc(55) int local55 = 0; local55 < Static263.anInt5504; local55++) {
				@Pc(61) int local61 = local33[local55];
				@Pc(69) int local69 = local61 - this.anIntArray526[0];
				if (local69 < 0) {
					local69 = -local69;
				}
				if (this.anInt6818 < local69) {
					local45[local55] = local61;
					local49[local55] = local37[local55];
					local53[local55] = local41[local55];
				} else {
					@Pc(104) int local104 = local37[local55];
					local69 = local104 - this.anIntArray526[1];
					if (local69 < 0) {
						local69 = -local69;
					}
					if (local69 > this.anInt6818) {
						local45[local55] = local61;
						local49[local55] = local104;
						local53[local55] = local41[local55];
					} else {
						@Pc(148) int local148 = local41[local55];
						local69 = local148 - this.anIntArray526[2];
						if (local69 < 0) {
							local69 = -local69;
						}
						if (this.anInt6818 < local69) {
							local45[local55] = local61;
							local49[local55] = local104;
							local53[local55] = local148;
						} else {
							local45[local55] = this.anInt6822 * local61 >> 12;
							local49[local55] = this.anInt6820 * local104 >> 12;
							local53[local55] = local148 * this.anInt6825 >> 12;
						}
					}
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IILclient!ef;)V")
	@Override
	public void method5704(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub12 arg1) {
		if (arg0 == 0) {
			this.anInt6818 = arg1.method3104();
		} else if (arg0 == 1) {
			this.anInt6825 = arg1.method3104();
		} else if (arg0 == 2) {
			this.anInt6820 = arg1.method3104();
		} else if (arg0 == 3) {
			this.anInt6822 = arg1.method3104();
		} else if (arg0 == 4) {
			@Pc(59) int local59 = arg1.method3163();
			this.anIntArray526[2] = local59 >> 12 & 0x0;
			this.anIntArray526[0] = (local59 & 0xFF0000) << 4;
			this.anIntArray526[1] = local59 >> 4 & 0xFF0;
		}
	}
}
