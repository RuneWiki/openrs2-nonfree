import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mm")
public final class Class1_Sub5_Sub17 extends Class1_Sub5 {

	@OriginalMember(owner = "client!mm", name = "N", descriptor = "I")
	private int anInt3866 = 4096;

	@OriginalMember(owner = "client!mm", name = "T", descriptor = "I")
	private int anInt3872 = 4096;

	@OriginalMember(owner = "client!mm", name = "P", descriptor = "I")
	private int anInt3868 = 4096;

	@OriginalMember(owner = "client!mm", name = "<init>", descriptor = "()V")
	public Class1_Sub5_Sub17() {
		super(1, false);
	}

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5811(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass151_41.method4015(arg0);
		if (super.aClass151_41.aBoolean368) {
			@Pc(29) int[][] local29 = this.method5807(arg0, 0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[2];
			for (@Pc(55) int local55 = 0; local55 < Static75.anInt1566; local55++) {
				@Pc(61) int local61 = local33[local55];
				@Pc(65) int local65 = local41[local55];
				@Pc(69) int local69 = local37[local55];
				if (local65 == local61 && local65 == local69) {
					local45[local55] = local61 * this.anInt3868 >> 12;
					local49[local55] = local65 * this.anInt3866 >> 12;
					local53[local55] = local69 * this.anInt3872 >> 12;
				} else {
					local45[local55] = this.anInt3868;
					local49[local55] = this.anInt3866;
					local53[local55] = this.anInt3872;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lclient!nj;II)V")
	@Override
	public void method5814(@OriginalArg(0) Class1_Sub21 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3868 = arg0.method5715();
		} else if (arg1 == 1) {
			this.anInt3866 = arg0.method5715();
		} else if (arg1 == 2) {
			this.anInt3872 = arg0.method5715();
		}
	}
}
