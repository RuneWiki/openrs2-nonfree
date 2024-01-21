import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ad")
public final class Class2_Sub2_Sub1 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ad", name = "U", descriptor = "I")
	private int anInt137 = 4096;

	@OriginalMember(owner = "client!ad", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub1() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3562(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass57_41.method2569(arg0);
		if (super.aClass57_41.aBoolean122) {
			@Pc(30) int[] local30 = this.method3569(arg0 - 1 & Static53.anInt1668, 0);
			@Pc(36) int[] local36 = this.method3569(arg0, 0);
			@Pc(46) int[] local46 = this.method3569(arg0 + 1 & Static53.anInt1668, 0);
			for (@Pc(48) int local48 = 0; local48 < Static106.anInt3045; local48++) {
				@Pc(62) int local62 = this.anInt137 * (local46[local48] - local30[local48]);
				@Pc(82) int local82 = (local36[Static96.anInt3099 & local48 + 1] - local36[local48 - 1 & Static96.anInt3099]) * this.anInt137;
				@Pc(86) int local86 = local82 >> 12;
				@Pc(92) int local92 = local86 * local86 >> 12;
				@Pc(96) int local96 = local62 >> 12;
				@Pc(102) int local102 = local96 * local96 >> 12;
				@Pc(116) int local116 = (int) (Math.sqrt((double) ((float) (local102 + local92 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(127) int local127 = local116 == 0 ? 0 : 16777216 / local116;
				local16[local48] = 4096 - local127;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IILclient!og;)V")
	@Override
	public void method3565(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt137 = arg1.method234();
		}
	}
}
