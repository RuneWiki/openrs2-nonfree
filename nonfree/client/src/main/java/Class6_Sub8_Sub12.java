import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hu")
public final class Class6_Sub8_Sub12 extends Class6_Sub8 {

	@OriginalMember(owner = "client!hu", name = "D", descriptor = "I")
	private int anInt4629 = 4096;

	@OriginalMember(owner = "client!hu", name = "G", descriptor = "I")
	private int anInt4627 = 4096;

	@OriginalMember(owner = "client!hu", name = "F", descriptor = "I")
	private int anInt4630 = 4096;

	@OriginalMember(owner = "client!hu", name = "<init>", descriptor = "()V")
	public Class6_Sub8_Sub12() {
		super(1, false);
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8934(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass140_41.method3749(arg0);
		if (super.aClass140_41.aBoolean331) {
			@Pc(29) int[][] local29 = this.method8928(0, arg0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			for (@Pc(55) int local55 = 0; local55 < Static83.anInt1268; local55++) {
				@Pc(61) int local61 = local33[local55];
				@Pc(65) int local65 = local41[local55];
				@Pc(69) int local69 = local37[local55];
				if (local65 == local61 && local65 == local69) {
					local45[local55] = local61 * this.anInt4629 >> 12;
					local49[local55] = local65 * this.anInt4627 >> 12;
					local53[local55] = local69 * this.anInt4630 >> 12;
				} else {
					local45[local55] = this.anInt4629;
					local49[local55] = this.anInt4627;
					local53[local55] = this.anInt4630;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(ILclient!jc;I)V")
	@Override
	public void method8929(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub15 arg1) {
		if (arg0 == 0) {
			this.anInt4629 = arg1.method3018();
		} else if (arg0 == 1) {
			this.anInt4627 = arg1.method3018();
		} else if (arg0 == 2) {
			this.anInt4630 = arg1.method3018();
		}
	}
}
