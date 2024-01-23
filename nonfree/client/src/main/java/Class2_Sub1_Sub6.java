import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!di")
public final class Class2_Sub1_Sub6 extends Class2_Sub1 {

	@OriginalMember(owner = "client!di", name = "T", descriptor = "I")
	private int anInt1057 = 4096;

	@OriginalMember(owner = "client!di", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub6() {
		super(1, true);
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3201(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass73_41.method2249(arg0);
		if (super.aClass73_41.aBoolean188) {
			@Pc(30) int[] local30 = this.method3203(Static195.anInt4423 & arg0 - 1, 0);
			@Pc(36) int[] local36 = this.method3203(arg0, 0);
			@Pc(46) int[] local46 = this.method3203(arg0 + 1 & Static195.anInt4423, 0);
			for (@Pc(48) int local48 = 0; local48 < Static62.anInt1675; local48++) {
				@Pc(62) int local62 = this.anInt1057 * (local46[local48] - local30[local48]);
				@Pc(81) int local81 = (local36[local48 + 1 & Static41.anInt1259] - local36[Static41.anInt1259 & local48 - 1]) * this.anInt1057;
				@Pc(85) int local85 = local81 >> 12;
				@Pc(89) int local89 = local62 >> 12;
				@Pc(95) int local95 = local85 * local85 >> 12;
				@Pc(101) int local101 = local89 * local89 >> 12;
				@Pc(116) int local116 = (int) (Math.sqrt((double) ((float) (local95 + local101 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(127) int local127 = local116 == 0 ? 0 : 16777216 / local116;
				local16[local48] = 4096 - local127;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(Lclient!ea;II)V")
	@Override
	public void method3204(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1057 = arg0.method163();
		}
	}
}
