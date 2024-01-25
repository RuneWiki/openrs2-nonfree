import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nn")
public final class Class5_Sub3_Sub24 extends Class5_Sub3 {

	@OriginalMember(owner = "client!nn", name = "M", descriptor = "I")
	private int anInt4312 = 4096;

	@OriginalMember(owner = "client!nn", name = "Q", descriptor = "I")
	private int anInt4315 = 4096;

	@OriginalMember(owner = "client!nn", name = "R", descriptor = "I")
	private int anInt4316 = 4096;

	static {
		new Class85(null, "Dieses System darf nicht missbraucht werden!", null, null);
	}

	@OriginalMember(owner = "client!nn", name = "<init>", descriptor = "()V")
	public Class5_Sub3_Sub24() {
		super(1, false);
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method6016(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass53_41.method969(arg0);
		if (super.aClass53_41.aBoolean83) {
			@Pc(21) int[][] local21 = this.method6023(0, arg0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static7.anInt129; local47++) {
				@Pc(53) int local53 = local25[local47];
				@Pc(57) int local57 = local33[local47];
				@Pc(61) int local61 = local29[local47];
				if (local57 == local53 && local61 == local57) {
					local37[local47] = this.anInt4312 * local53 >> 12;
					local41[local47] = local57 * this.anInt4316 >> 12;
					local45[local47] = this.anInt4315 * local61 >> 12;
				} else {
					local37[local47] = this.anInt4312;
					local41[local47] = this.anInt4316;
					local45[local47] = this.anInt4315;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(Lclient!rg;BI)V")
	@Override
	public void method6017(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4312 = arg0.method5106();
		} else if (arg1 == 1) {
			this.anInt4316 = arg0.method5106();
		} else if (arg1 == 2) {
			this.anInt4315 = arg0.method5106();
		}
	}
}
