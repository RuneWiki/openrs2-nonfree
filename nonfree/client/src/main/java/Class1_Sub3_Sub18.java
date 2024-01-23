import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ie")
public final class Class1_Sub3_Sub18 extends Class1_Sub3 {

	@OriginalMember(owner = "client!ie", name = "U", descriptor = "I")
	private int anInt2548 = 4096;

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub18() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4453(@OriginalArg(1) int arg0) {
		@Pc(22) int[] local22 = this.aClass122_41.method3152(arg0);
		if (this.aClass122_41.aBoolean297) {
			@Pc(37) int[] local37 = this.method4450(0, arg0 - 1 & Static202.anInt4099);
			@Pc(43) int[] local43 = this.method4450(0, arg0);
			@Pc(53) int[] local53 = this.method4450(0, Static202.anInt4099 & arg0 + 1);
			for (@Pc(55) int local55 = 0; local55 < Static227.anInt4511; local55++) {
				@Pc(70) int local70 = (local53[local55] - local37[local55]) * this.anInt2548;
				@Pc(89) int local89 = (local43[local55 + 1 & Static229.anInt4527] - local43[local55 - 1 & Static229.anInt4527]) * this.anInt2548;
				@Pc(93) int local93 = local89 >> 12;
				@Pc(97) int local97 = local70 >> 12;
				@Pc(103) int local103 = local93 * local93 >> 12;
				@Pc(109) int local109 = local97 * local97 >> 12;
				@Pc(124) int local124 = (int) (Math.sqrt((double) ((float) (local103 + local109 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(133) int local133 = local124 == 0 ? 0 : 16777216 / local124;
				local22[local55] = 4096 - local133;
			}
		}
		return local22;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!cg;II)V")
	@Override
	public void method4449(@OriginalArg(0) Class1_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2548 = arg0.method2691();
		}
	}
}
