import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aa")
public final class Class2_Sub1_Sub1 extends Class2_Sub1 {

	@OriginalMember(owner = "client!aa", name = "S", descriptor = "Z")
	private boolean aBoolean7 = true;

	@OriginalMember(owner = "client!aa", name = "V", descriptor = "I")
	private int anInt67 = 4096;

	@OriginalMember(owner = "client!aa", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub1() {
		super(1, false);
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method3211(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass99_41.method3152(arg0);
		if (super.aClass99_41.aBoolean280) {
			@Pc(25) int[] local25 = this.method3203(Static195.anInt4423 & arg0 - 1, 0);
			@Pc(31) int[] local31 = this.method3203(arg0, 0);
			@Pc(41) int[] local41 = this.method3203(arg0 + 1 & Static195.anInt4423, 0);
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[2];
			@Pc(53) int[] local53 = local11[1];
			for (@Pc(55) int local55 = 0; local55 < Static62.anInt1675; local55++) {
				@Pc(69) int local69 = (local41[local55] - local25[local55]) * this.anInt67;
				@Pc(89) int local89 = (local31[local55 + 1 & Static41.anInt1259] - local31[local55 - 1 & Static41.anInt1259]) * this.anInt67;
				@Pc(93) int local93 = local89 >> 12;
				@Pc(97) int local97 = local69 >> 12;
				@Pc(103) int local103 = local93 * local93 >> 12;
				@Pc(109) int local109 = local97 * local97 >> 12;
				@Pc(124) int local124 = (int) (Math.sqrt((double) ((float) (local103 + local109 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(135) int local135;
				@Pc(131) int local131;
				@Pc(133) int local133;
				if (local124 == 0) {
					local131 = 0;
					local133 = 0;
					local135 = 0;
				} else {
					local131 = local69 / local124;
					local133 = 16777216 / local124;
					local135 = local89 / local124;
				}
				if (this.aBoolean7) {
					local133 = (local133 >> 1) + 2048;
					local135 = (local135 >> 1) + 2048;
					local131 = (local131 >> 1) + 2048;
				}
				local45[local55] = local135;
				local53[local55] = local131;
				local49[local55] = local133;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lclient!ea;II)V")
	@Override
	public void method3204(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt67 = arg0.method163();
		} else if (arg1 == 1) {
			this.aBoolean7 = arg0.method209() == 1;
		}
	}
}
