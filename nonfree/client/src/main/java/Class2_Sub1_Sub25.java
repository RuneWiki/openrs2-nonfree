import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nf")
public final class Class2_Sub1_Sub25 extends Class2_Sub1 {

	@OriginalMember(owner = "client!nf", name = "Q", descriptor = "I")
	private int anInt2628;

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lclient!me;IB)V")
	@Override
	public void method2799(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt2628 = arg0.method1397();
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method2801(@OriginalArg(1) int arg0) {
		@Pc(12) int[] local12 = super.aClass81_39.method2606(arg0);
		if (super.aClass81_39.aBoolean153) {
			@Pc(30) int[] local30 = this.method2796(0, Static180.anInt4192 & arg0 - 1);
			@Pc(36) int[] local36 = this.method2796(0, arg0);
			@Pc(46) int[] local46 = this.method2796(0, arg0 + 1 & Static180.anInt4192);
			for (@Pc(48) int local48 = 0; local48 < Static120.anInt2812; local48++) {
				@Pc(61) int local61 = (local46[local48] - local30[local48]) * this.anInt2628;
				@Pc(81) int local81 = this.anInt2628 * (local36[Static49.anInt1370 & local48 + 1] - local36[Static49.anInt1370 & local48 - 1]);
				@Pc(85) int local85 = local81 >> 12;
				@Pc(89) int local89 = local61 >> 12;
				@Pc(95) int local95 = local85 * local85 >> 12;
				@Pc(101) int local101 = local89 * local89 >> 12;
				@Pc(115) int local115 = (int) (Math.sqrt((double) ((local95 + local101 + 4096) / 4096)) * 4096.0D);
				@Pc(123) int local123 = local115 == 0 ? 0 : 16777216 / local115;
				local12[local48] = 4096 - local123;
			}
		}
		return local12;
	}
}
