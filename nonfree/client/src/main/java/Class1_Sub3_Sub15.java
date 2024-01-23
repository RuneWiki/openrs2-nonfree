import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hj")
public final class Class1_Sub3_Sub15 extends Class1_Sub3 {

	@OriginalMember(owner = "client!hj", name = "Q", descriptor = "Z")
	private boolean aBoolean163 = true;

	@OriginalMember(owner = "client!hj", name = "V", descriptor = "I")
	private int anInt2370 = 4096;

	@OriginalMember(owner = "client!hj", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub15() {
		super(1, false);
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4452(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = this.aClass56_41.method1596(arg0);
		if (this.aClass56_41.aBoolean144) {
			@Pc(25) int[] local25 = this.method4450(0, Static202.anInt4099 & arg0 - 1);
			@Pc(31) int[] local31 = this.method4450(0, arg0);
			@Pc(41) int[] local41 = this.method4450(0, arg0 + 1 & Static202.anInt4099);
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			for (@Pc(55) int local55 = 0; local55 < Static227.anInt4511; local55++) {
				@Pc(69) int local69 = this.anInt2370 * (local41[local55] - local25[local55]);
				@Pc(89) int local89 = (local31[local55 + 1 & Static229.anInt4527] - local31[Static229.anInt4527 & local55 - 1]) * this.anInt2370;
				@Pc(93) int local93 = local89 >> 12;
				@Pc(97) int local97 = local69 >> 12;
				@Pc(103) int local103 = local97 * local97 >> 12;
				@Pc(109) int local109 = local93 * local93 >> 12;
				@Pc(123) int local123 = (int) (Math.sqrt((double) ((float) (local109 + local103 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(136) int local136;
				@Pc(140) int local140;
				@Pc(132) int local132;
				if (local123 == 0) {
					local136 = 0;
					local140 = 0;
					local132 = 0;
				} else {
					local132 = 16777216 / local123;
					local136 = local89 / local123;
					local140 = local69 / local123;
				}
				if (this.aBoolean163) {
					local140 = (local140 >> 1) + 2048;
					local136 = (local136 >> 1) + 2048;
					local132 = (local132 >> 1) + 2048;
				}
				local45[local55] = local136;
				local49[local55] = local140;
				local53[local55] = local132;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lclient!cg;II)V")
	@Override
	public void method4449(@OriginalArg(0) Class1_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2370 = arg0.method2691();
		} else if (arg1 == 1) {
			this.aBoolean163 = arg0.method2690() == 1;
		}
	}
}
