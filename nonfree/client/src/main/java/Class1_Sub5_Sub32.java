import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public final class Class1_Sub5_Sub32 extends Class1_Sub5 {

	@OriginalMember(owner = "client!sd", name = "N", descriptor = "I")
	private int anInt3386;

	@OriginalMember(owner = "client!sd", name = "O", descriptor = "I")
	private int anInt3387;

	@OriginalMember(owner = "client!sd", name = "Z", descriptor = "I")
	private int anInt3393;

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!ka;IZ)V")
	@Override
	public void method3148(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3386 = arg0.method359();
		} else if (arg1 == 1) {
			this.anInt3393 = arg0.method359();
		} else if (arg1 == 2) {
			this.anInt3387 = arg0.method359();
		}
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3149(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass53_41.method1591(arg0);
		if (super.aClass53_41.aBoolean90) {
			@Pc(29) int[][] local29 = this.method3144(arg0, 0);
			@Pc(33) int[] local33 = local29[2];
			@Pc(37) int[] local37 = local29[0];
			@Pc(41) int[] local41 = local11[0];
			@Pc(45) int[] local45 = local29[1];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			for (@Pc(55) int local55 = 0; local55 < Static177.anInt4018; local55++) {
				@Pc(61) int local61 = local45[local55];
				@Pc(65) int local65 = local37[local55];
				@Pc(69) int local69 = local33[local55];
				if (local65 == local69 && local61 == local69) {
					local41[local55] = this.anInt3386 * local65 >> 12;
					local49[local55] = local69 * this.anInt3393 >> 12;
					local53[local55] = this.anInt3387 * local61 >> 12;
				} else {
					local41[local55] = this.anInt3386;
					local49[local55] = this.anInt3393;
					local53[local55] = this.anInt3387;
				}
			}
		}
		return local11;
	}
}
