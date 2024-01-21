import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!te")
public final class Class1_Sub1_Sub36 extends Class1_Sub1 {

	@OriginalMember(owner = "client!te", name = "R", descriptor = "I")
	private int anInt3886;

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IILclient!ce;)V")
	@Override
	public void method3011(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt3886 = arg1.method1642();
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3008(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass80_41.method2742(arg0);
		if (super.aClass80_41.aBoolean288) {
			@Pc(30) int[] local30 = this.method3012(0, arg0 - 1 & Static93.anInt2716);
			@Pc(36) int[] local36 = this.method3012(0, arg0);
			@Pc(46) int[] local46 = this.method3012(0, Static93.anInt2716 & arg0 + 1);
			for (@Pc(48) int local48 = 0; local48 < Static65.anInt1933; local48++) {
				@Pc(62) int local62 = this.anInt3886 * (local46[local48] - local30[local48]);
				@Pc(81) int local81 = (local36[local48 + 1 & Static64.anInt1922] - local36[Static64.anInt1922 & local48 - 1]) * this.anInt3886;
				@Pc(85) int local85 = local81 >> 12;
				@Pc(89) int local89 = local62 >> 12;
				@Pc(95) int local95 = local89 * local89 >> 12;
				@Pc(101) int local101 = local85 * local85 >> 12;
				@Pc(115) int local115 = (int) (Math.sqrt((double) ((local101 + local95 + 4096) / 4096)) * 4096.0D);
				@Pc(123) int local123 = local115 == 0 ? 0 : 16777216 / local115;
				local11[local48] = 4096 - local123;
			}
		}
		return local11;
	}
}
