import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nq")
public final class Class6_Sub8_Sub25 extends Class6_Sub8 {

	@OriginalMember(owner = "client!nq", name = "D", descriptor = "I")
	private int anInt7095 = 4096;

	@OriginalMember(owner = "client!nq", name = "K", descriptor = "I")
	private int anInt7100 = 4096;

	@OriginalMember(owner = "client!nq", name = "F", descriptor = "I")
	private int anInt7098 = 4096;

	@OriginalMember(owner = "client!nq", name = "H", descriptor = "I")
	private int anInt7101 = 409;

	@OriginalMember(owner = "client!nq", name = "J", descriptor = "[I")
	private final int[] anIntArray447 = new int[3];

	@OriginalMember(owner = "client!nq", name = "<init>", descriptor = "()V")
	public Class6_Sub8_Sub25() {
		super(1, false);
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(ILclient!jc;I)V")
	@Override
	public void method8929(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub15 arg1) {
		if (arg0 == 0) {
			this.anInt7101 = arg1.method3018();
		} else if (arg0 == 1) {
			this.anInt7095 = arg1.method3018();
		} else if (arg0 == 2) {
			this.anInt7098 = arg1.method3018();
		} else if (arg0 == 3) {
			this.anInt7100 = arg1.method3018();
		} else if (arg0 == 4) {
			@Pc(73) int local73 = arg1.method2987();
			this.anIntArray447[0] = (local73 & 0xFF0000) << 4;
			this.anIntArray447[1] = local73 >> 4 & 0xFF0;
			this.anIntArray447[2] = local73 >> 12 & 0x0;
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8934(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass140_41.method3749(arg0);
		if (super.aClass140_41.aBoolean331) {
			@Pc(21) int[][] local21 = this.method8928(0, arg0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static83.anInt1268; local47++) {
				@Pc(53) int local53 = local25[local47];
				@Pc(61) int local61 = local53 - this.anIntArray447[0];
				if (local61 < 0) {
					local61 = -local61;
				}
				if (local61 > this.anInt7101) {
					local37[local47] = local53;
					local41[local47] = local29[local47];
					local45[local47] = local33[local47];
				} else {
					@Pc(98) int local98 = local29[local47];
					local61 = local98 - this.anIntArray447[1];
					if (local61 < 0) {
						local61 = -local61;
					}
					if (this.anInt7101 < local61) {
						local37[local47] = local53;
						local41[local47] = local98;
						local45[local47] = local33[local47];
					} else {
						@Pc(141) int local141 = local33[local47];
						local61 = local141 - this.anIntArray447[2];
						if (local61 < 0) {
							local61 = -local61;
						}
						if (this.anInt7101 < local61) {
							local37[local47] = local53;
							local41[local47] = local98;
							local45[local47] = local141;
						} else {
							local37[local47] = local53 * this.anInt7100 >> 12;
							local41[local47] = local98 * this.anInt7098 >> 12;
							local45[local47] = local141 * this.anInt7095 >> 12;
						}
					}
				}
			}
		}
		return local11;
	}
}
