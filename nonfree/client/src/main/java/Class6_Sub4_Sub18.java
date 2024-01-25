import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!il")
public final class Class6_Sub4_Sub18 extends Class6_Sub4 {

	@OriginalMember(owner = "client!il", name = "F", descriptor = "I")
	private int anInt4226 = 4096;

	@OriginalMember(owner = "client!il", name = "G", descriptor = "I")
	private int anInt4227 = 4096;

	@OriginalMember(owner = "client!il", name = "B", descriptor = "I")
	private int anInt4223 = 409;

	@OriginalMember(owner = "client!il", name = "D", descriptor = "[I")
	private final int[] anIntArray270 = new int[3];

	@OriginalMember(owner = "client!il", name = "J", descriptor = "I")
	private int anInt4230 = 4096;

	@OriginalMember(owner = "client!il", name = "<init>", descriptor = "()V")
	public Class6_Sub4_Sub18() {
		super(1, false);
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method7757(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass27_41.method911(arg0);
		if (super.aClass27_41.aBoolean54) {
			@Pc(29) int[][] local29 = this.method7747(arg0, 0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			for (@Pc(55) int local55 = 0; local55 < Static408.anInt7209; local55++) {
				@Pc(61) int local61 = local33[local55];
				@Pc(69) int local69 = local61 - this.anIntArray270[0];
				if (local69 < 0) {
					local69 = -local69;
				}
				if (local69 > this.anInt4223) {
					local45[local55] = local61;
					local49[local55] = local37[local55];
					local53[local55] = local41[local55];
				} else {
					@Pc(103) int local103 = local37[local55];
					local69 = local103 - this.anIntArray270[1];
					if (local69 < 0) {
						local69 = -local69;
					}
					if (local69 > this.anInt4223) {
						local45[local55] = local61;
						local49[local55] = local103;
						local53[local55] = local41[local55];
					} else {
						@Pc(140) int local140 = local41[local55];
						local69 = local140 - this.anIntArray270[2];
						if (local69 < 0) {
							local69 = -local69;
						}
						if (local69 > this.anInt4223) {
							local45[local55] = local61;
							local49[local55] = local103;
							local53[local55] = local140;
						} else {
							local45[local55] = this.anInt4230 * local61 >> 12;
							local49[local55] = local103 * this.anInt4227 >> 12;
							local53[local55] = local140 * this.anInt4226 >> 12;
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IILclient!ji;)V")
	@Override
	public void method7750(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub21 arg1) {
		if (arg0 == 0) {
			this.anInt4223 = arg1.method6003();
		} else if (arg0 == 1) {
			this.anInt4226 = arg1.method6003();
		} else if (arg0 == 2) {
			this.anInt4227 = arg1.method6003();
		} else if (arg0 == 3) {
			this.anInt4230 = arg1.method6003();
		} else if (arg0 == 4) {
			@Pc(61) int local61 = arg1.method6031();
			this.anIntArray270[0] = (local61 & 0xFF0000) << 4;
			this.anIntArray270[1] = local61 >> 4 & 0xFF0;
			this.anIntArray270[2] = local61 >> 12 & 0x0;
		}
	}
}
