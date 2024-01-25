import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ja")
public final class Class5_Sub3_Sub14 extends Class5_Sub3 {

	@OriginalMember(owner = "client!ja", name = "P", descriptor = "Z")
	private boolean aBoolean216 = true;

	@OriginalMember(owner = "client!ja", name = "Y", descriptor = "I")
	private int anInt2849 = 4096;

	@OriginalMember(owner = "client!ja", name = "<init>", descriptor = "()V")
	public Class5_Sub3_Sub14() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method6016(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass53_41.method969(arg0);
		if (super.aClass53_41.aBoolean83) {
			@Pc(25) int[] local25 = this.method6020(0, Static221.anInt4359 & arg0 - 1);
			@Pc(31) int[] local31 = this.method6020(0, arg0);
			@Pc(41) int[] local41 = this.method6020(0, Static221.anInt4359 & arg0 + 1);
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			for (@Pc(55) int local55 = 0; local55 < Static7.anInt129; local55++) {
				@Pc(69) int local69 = (local41[local55] - local25[local55]) * this.anInt2849;
				@Pc(89) int local89 = this.anInt2849 * (local31[local55 + 1 & Static177.anInt3515] - local31[Static177.anInt3515 & local55 - 1]);
				@Pc(93) int local93 = local89 >> 12;
				@Pc(97) int local97 = local69 >> 12;
				@Pc(103) int local103 = local93 * local93 >> 12;
				@Pc(109) int local109 = local97 * local97 >> 12;
				@Pc(123) int local123 = (int) (Math.sqrt((double) ((float) (local103 + local109 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(134) int local134;
				@Pc(132) int local132;
				@Pc(130) int local130;
				if (local123 == 0) {
					local130 = 0;
					local132 = 0;
					local134 = 0;
				} else {
					local134 = local89 / local123;
					local130 = 16777216 / local123;
					local132 = local69 / local123;
				}
				if (this.aBoolean216) {
					local132 = (local132 >> 1) + 2048;
					local134 = (local134 >> 1) + 2048;
					local130 = (local130 >> 1) + 2048;
				}
				local45[local55] = local134;
				local49[local55] = local132;
				local53[local55] = local130;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lclient!rg;BI)V")
	@Override
	public void method6017(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2849 = arg0.method5106();
		} else if (arg1 == 1) {
			this.aBoolean216 = arg0.method5115() == 1;
		}
	}
}
