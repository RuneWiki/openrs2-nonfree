import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vn")
public final class Class1_Sub3_Sub38 extends Class1_Sub3 {

	@OriginalMember(owner = "client!vn", name = "O", descriptor = "I")
	private int anInt5472 = 4096;

	@OriginalMember(owner = "client!vn", name = "J", descriptor = "I")
	private int anInt5467 = 4096;

	@OriginalMember(owner = "client!vn", name = "U", descriptor = "I")
	private int anInt5476 = 409;

	@OriginalMember(owner = "client!vn", name = "Q", descriptor = "[I")
	private int[] anIntArray540 = new int[3];

	@OriginalMember(owner = "client!vn", name = "Y", descriptor = "I")
	private int anInt5480 = 4096;

	@OriginalMember(owner = "client!vn", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub38() {
		super(1, false);
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(Lclient!cg;II)V")
	@Override
	public void method4449(@OriginalArg(0) Class1_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5476 = arg0.method2691();
		} else if (arg1 == 1) {
			this.anInt5472 = arg0.method2691();
		} else if (arg1 == 2) {
			this.anInt5467 = arg0.method2691();
		} else if (arg1 == 3) {
			this.anInt5480 = arg0.method2691();
		} else if (arg1 == 4) {
			@Pc(72) int local72 = arg0.method2681();
			this.anIntArray540[2] = local72 >> 12 & 0x0;
			this.anIntArray540[1] = local72 >> 4 & 0xFF0;
			this.anIntArray540[0] = (local72 & 0xFF0000) << 4;
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4452(@OriginalArg(1) int arg0) {
		@Pc(7) int[][] local7 = this.aClass56_41.method1596(arg0);
		if (this.aClass56_41.aBoolean144) {
			@Pc(21) int[][] local21 = this.method4455(0, arg0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local7[1];
			@Pc(37) int[] local37 = local7[0];
			@Pc(41) int[] local41 = local21[2];
			@Pc(45) int[] local45 = local7[2];
			for (@Pc(47) int local47 = 0; local47 < Static227.anInt4511; local47++) {
				@Pc(54) int local54 = local25[local47];
				@Pc(62) int local62 = local54 - this.anIntArray540[0];
				if (local62 < 0) {
					local62 = -local62;
				}
				if (this.anInt5476 < local62) {
					local37[local47] = local54;
					local33[local47] = local29[local47];
					local45[local47] = local41[local47];
				} else {
					@Pc(100) int local100 = local29[local47];
					local62 = local100 - this.anIntArray540[1];
					if (local62 < 0) {
						local62 = -local62;
					}
					if (this.anInt5476 >= local62) {
						@Pc(146) int local146 = local41[local47];
						local62 = local146 - this.anIntArray540[2];
						if (local62 < 0) {
							local62 = -local62;
						}
						if (this.anInt5476 >= local62) {
							local37[local47] = this.anInt5480 * local54 >> 12;
							local33[local47] = this.anInt5467 * local100 >> 12;
							local45[local47] = this.anInt5472 * local146 >> 12;
						} else {
							local37[local47] = local54;
							local33[local47] = local100;
							local45[local47] = local146;
						}
					} else {
						local37[local47] = local54;
						local33[local47] = local100;
						local45[local47] = local41[local47];
					}
				}
			}
		}
		return local7;
	}
}
