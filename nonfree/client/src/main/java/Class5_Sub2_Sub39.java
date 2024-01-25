import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wn")
public final class Class5_Sub2_Sub39 extends Class5_Sub2 {

	@OriginalMember(owner = "client!wn", name = "F", descriptor = "I")
	private int anInt10762 = 4096;

	@OriginalMember(owner = "client!wn", name = "H", descriptor = "I")
	private int anInt10764 = 4096;

	@OriginalMember(owner = "client!wn", name = "J", descriptor = "I")
	private int anInt10766 = 4096;

	@OriginalMember(owner = "client!wn", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub39() {
		super(1, false);
	}

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "(II)[[I")
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
				@Pc(65) int local65 = local41[local55];
				@Pc(69) int local69 = local37[local55];
				if (local65 == local61 && local65 == local69) {
					local45[local55] = this.anInt10764 * local61 >> 12;
					local49[local55] = this.anInt10762 * local65 >> 12;
					local53[local55] = local69 * this.anInt10766 >> 12;
				} else {
					local45[local55] = this.anInt10764;
					local49[local55] = this.anInt10762;
					local53[local55] = this.anInt10766;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(Lclient!mc;II)V")
	@Override
	public void method8944(@OriginalArg(0) Class5_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt10764 = arg0.method7860();
		} else if (arg1 == 1) {
			this.anInt10762 = arg0.method7860();
		} else if (arg1 == 2) {
			this.anInt10766 = arg0.method7860();
		}
	}
}
