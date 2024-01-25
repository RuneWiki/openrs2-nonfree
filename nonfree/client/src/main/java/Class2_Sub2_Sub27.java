import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pa")
public final class Class2_Sub2_Sub27 extends Class2_Sub2 {

	@OriginalMember(owner = "client!pa", name = "R", descriptor = "I")
	private int anInt4605 = 4096;

	@OriginalMember(owner = "client!pa", name = "T", descriptor = "I")
	private int anInt4606 = 4096;

	@OriginalMember(owner = "client!pa", name = "bb", descriptor = "I")
	private int anInt4609 = 409;

	@OriginalMember(owner = "client!pa", name = "cb", descriptor = "[I")
	private final int[] anIntArray365 = new int[3];

	@OriginalMember(owner = "client!pa", name = "Y", descriptor = "I")
	private int anInt4608 = 4096;

	@OriginalMember(owner = "client!pa", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub27() {
		super(1, false);
	}

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5884(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass88_41.method2632(arg0);
		if (super.aClass88_41.aBoolean238) {
			@Pc(29) int[][] local29 = this.method5887(arg0, 0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			for (@Pc(55) int local55 = 0; local55 < Static339.anInt6735; local55++) {
				@Pc(61) int local61 = local33[local55];
				@Pc(69) int local69 = local61 - this.anIntArray365[0];
				if (local69 < 0) {
					local69 = -local69;
				}
				if (this.anInt4609 < local69) {
					local45[local55] = local61;
					local49[local55] = local37[local55];
					local53[local55] = local41[local55];
				} else {
					@Pc(100) int local100 = local37[local55];
					local69 = local100 - this.anIntArray365[1];
					if (local69 < 0) {
						local69 = -local69;
					}
					if (local69 > this.anInt4609) {
						local45[local55] = local61;
						local49[local55] = local100;
						local53[local55] = local41[local55];
					} else {
						@Pc(141) int local141 = local41[local55];
						local69 = local141 - this.anIntArray365[2];
						if (local69 < 0) {
							local69 = -local69;
						}
						if (this.anInt4609 < local69) {
							local45[local55] = local61;
							local49[local55] = local100;
							local53[local55] = local141;
						} else {
							local45[local55] = local61 * this.anInt4605 >> 12;
							local49[local55] = local100 * this.anInt4606 >> 12;
							local53[local55] = this.anInt4608 * local141 >> 12;
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILclient!dg;I)V")
	@Override
	public void method5882(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub10 arg1) {
		if (arg0 == 0) {
			this.anInt4609 = arg1.method4464();
		} else if (arg0 == 1) {
			this.anInt4608 = arg1.method4464();
		} else if (arg0 == 2) {
			this.anInt4606 = arg1.method4464();
		} else if (arg0 == 3) {
			this.anInt4605 = arg1.method4464();
		} else if (arg0 == 4) {
			@Pc(62) int local62 = arg1.method4463();
			this.anIntArray365[0] = (local62 & 0xFF0000) << 4;
			this.anIntArray365[1] = local62 >> 4 & 0xFF0;
			this.anIntArray365[2] = local62 >> 12 & 0x0;
		}
	}
}
