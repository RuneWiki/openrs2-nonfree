import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nj")
public final class Class3_Sub9_Sub29 extends Class3_Sub9 {

	@OriginalMember(owner = "client!nj", name = "C", descriptor = "[I")
	private final int[] anIntArray568 = new int[3];

	@OriginalMember(owner = "client!nj", name = "I", descriptor = "I")
	private int anInt6441 = 409;

	@OriginalMember(owner = "client!nj", name = "E", descriptor = "I")
	private int anInt6438 = 4096;

	@OriginalMember(owner = "client!nj", name = "D", descriptor = "I")
	private int anInt6437 = 4096;

	@OriginalMember(owner = "client!nj", name = "J", descriptor = "I")
	private int anInt6442 = 4096;

	@OriginalMember(owner = "client!nj", name = "<init>", descriptor = "()V")
	public Class3_Sub9_Sub29() {
		super(1, false);
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method9168(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass348_41.method8552(arg0);
		if (super.aClass348_41.aBoolean748) {
			@Pc(21) int[][] local21 = this.method9167(0, arg0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static62.anInt1251; local47++) {
				@Pc(53) int local53 = local25[local47];
				@Pc(61) int local61 = local53 - this.anIntArray568[0];
				if (local61 < 0) {
					local61 = -local61;
				}
				if (this.anInt6441 < local61) {
					local37[local47] = local53;
					local41[local47] = local29[local47];
					local45[local47] = local33[local47];
				} else {
					@Pc(96) int local96 = local29[local47];
					local61 = local96 - this.anIntArray568[1];
					if (local61 < 0) {
						local61 = -local61;
					}
					if (local61 > this.anInt6441) {
						local37[local47] = local53;
						local41[local47] = local96;
						local45[local47] = local33[local47];
					} else {
						@Pc(135) int local135 = local33[local47];
						local61 = local135 - this.anIntArray568[2];
						if (local61 < 0) {
							local61 = -local61;
						}
						if (this.anInt6441 < local61) {
							local37[local47] = local53;
							local41[local47] = local96;
							local45[local47] = local135;
						} else {
							local37[local47] = local53 * this.anInt6438 >> 12;
							local41[local47] = local96 * this.anInt6442 >> 12;
							local45[local47] = this.anInt6437 * local135 >> 12;
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lclient!jp;IB)V")
	@Override
	public void method9166(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt6441 = arg0.method8593();
		} else if (arg1 == 1) {
			this.anInt6437 = arg0.method8593();
		} else if (arg1 == 2) {
			this.anInt6442 = arg0.method8593();
		} else if (arg1 == 3) {
			this.anInt6438 = arg0.method8593();
		} else if (arg1 == 4) {
			@Pc(63) int local63 = arg0.method8607();
			this.anIntArray568[2] = local63 >> 12 & 0x0;
			this.anIntArray568[1] = local63 >> 4 & 0xFF0;
			this.anIntArray568[0] = (local63 & 0xFF0000) << 4;
		}
	}
}
