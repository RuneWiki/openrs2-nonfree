import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
public final class Class3_Sub1_Sub37 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ub", name = "J", descriptor = "I")
	private int anInt8316 = 4096;

	@OriginalMember(owner = "client!ub", name = "K", descriptor = "I")
	private int anInt8317 = 409;

	@OriginalMember(owner = "client!ub", name = "M", descriptor = "[I")
	private final int[] anIntArray633 = new int[3];

	@OriginalMember(owner = "client!ub", name = "I", descriptor = "I")
	private int anInt8315 = 4096;

	@OriginalMember(owner = "client!ub", name = "O", descriptor = "I")
	private int anInt8319 = 4096;

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub37() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method7773(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass144_41.method3782(arg0);
		if (super.aClass144_41.aBoolean326) {
			@Pc(21) int[][] local21 = this.method7766(0, arg0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static206.anInt4182; local47++) {
				@Pc(53) int local53 = local25[local47];
				@Pc(61) int local61 = local53 - this.anIntArray633[0];
				if (local61 < 0) {
					local61 = -local61;
				}
				if (this.anInt8317 < local61) {
					local37[local47] = local53;
					local41[local47] = local29[local47];
					local45[local47] = local33[local47];
				} else {
					@Pc(95) int local95 = local29[local47];
					local61 = local95 - this.anIntArray633[1];
					if (local61 < 0) {
						local61 = -local61;
					}
					if (local61 > this.anInt8317) {
						local37[local47] = local53;
						local41[local47] = local95;
						local45[local47] = local33[local47];
					} else {
						@Pc(139) int local139 = local33[local47];
						local61 = local139 - this.anIntArray633[2];
						if (local61 < 0) {
							local61 = -local61;
						}
						if (local61 > this.anInt8317) {
							local37[local47] = local53;
							local41[local47] = local95;
							local45[local47] = local139;
						} else {
							local37[local47] = local53 * this.anInt8315 >> 12;
							local41[local47] = this.anInt8319 * local95 >> 12;
							local45[local47] = local139 * this.anInt8316 >> 12;
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!qh;II)V")
	@Override
	public void method7761(@OriginalArg(0) Class3_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt8317 = arg0.method3109();
		} else if (arg1 == 1) {
			this.anInt8316 = arg0.method3109();
		} else if (arg1 == 2) {
			this.anInt8319 = arg0.method3109();
		} else if (arg1 == 3) {
			this.anInt8315 = arg0.method3109();
		} else if (arg1 == 4) {
			@Pc(59) int local59 = arg0.method3126();
			this.anIntArray633[2] = local59 >> 12 & 0x0;
			this.anIntArray633[0] = (local59 & 0xFF0000) << 4;
			this.anIntArray633[1] = local59 >> 4 & 0xFF0;
		}
	}
}
