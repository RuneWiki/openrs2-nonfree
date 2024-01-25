import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public final class Class6_Sub1_Sub14 extends Class6_Sub1 {

	@OriginalMember(owner = "client!he", name = "J", descriptor = "I")
	private int anInt4531 = 4096;

	@OriginalMember(owner = "client!he", name = "N", descriptor = "[I")
	private final int[] anIntArray201 = new int[3];

	@OriginalMember(owner = "client!he", name = "G", descriptor = "I")
	private int anInt4529 = 409;

	@OriginalMember(owner = "client!he", name = "H", descriptor = "I")
	private int anInt4530 = 4096;

	@OriginalMember(owner = "client!he", name = "Q", descriptor = "I")
	private int anInt4536 = 4096;

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub14() {
		super(1, false);
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8728(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass239_41.method6263(arg0);
		if (super.aClass239_41.aBoolean585) {
			@Pc(21) int[][] local21 = this.method8725(arg0, 0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static53.anInt1787; local47++) {
				@Pc(53) int local53 = local25[local47];
				@Pc(61) int local61 = local53 - this.anIntArray201[0];
				if (local61 < 0) {
					local61 = -local61;
				}
				if (this.anInt4529 < local61) {
					local37[local47] = local53;
					local41[local47] = local29[local47];
					local45[local47] = local33[local47];
				} else {
					@Pc(95) int local95 = local29[local47];
					local61 = local95 - this.anIntArray201[1];
					if (local61 < 0) {
						local61 = -local61;
					}
					if (this.anInt4529 < local61) {
						local37[local47] = local53;
						local41[local47] = local95;
						local45[local47] = local33[local47];
					} else {
						@Pc(135) int local135 = local33[local47];
						local61 = local135 - this.anIntArray201[2];
						if (local61 < 0) {
							local61 = -local61;
						}
						if (local61 > this.anInt4529) {
							local37[local47] = local53;
							local41[local47] = local95;
							local45[local47] = local135;
						} else {
							local37[local47] = local53 * this.anInt4530 >> 12;
							local41[local47] = local95 * this.anInt4531 >> 12;
							local45[local47] = this.anInt4536 * local135 >> 12;
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ILclient!ji;B)V")
	@Override
	public void method8722(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt4529 = arg1.method8220();
		} else if (arg0 == 1) {
			this.anInt4536 = arg1.method8220();
		} else if (arg0 == 2) {
			this.anInt4531 = arg1.method8220();
		} else if (arg0 == 3) {
			this.anInt4530 = arg1.method8220();
		} else if (arg0 == 4) {
			@Pc(53) int local53 = arg1.method8203();
			this.anIntArray201[0] = (local53 & 0xFF0000) << 4;
			this.anIntArray201[2] = local53 >> 12 & 0x0;
			this.anIntArray201[1] = local53 >> 4 & 0xFF0;
		}
	}
}
