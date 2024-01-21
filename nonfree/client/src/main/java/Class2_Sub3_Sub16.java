import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kh")
public final class Class2_Sub3_Sub16 extends Class2_Sub3 {

	@OriginalMember(owner = "client!kh", name = "Q", descriptor = "I")
	private int anInt1920;

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(BILclient!ja;)V")
	@Override
	public void method3013(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub13 arg1) {
		if (arg0 == 0) {
			this.anInt1920 = arg1.method2933();
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3016(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass51_41.method1730(arg0);
		if (super.aClass51_41.aBoolean89) {
			@Pc(30) int[] local30 = this.method3011(Static134.anInt2915 & arg0 - 1, 0);
			@Pc(36) int[] local36 = this.method3011(arg0, 0);
			@Pc(46) int[] local46 = this.method3011(Static134.anInt2915 & arg0 + 1, 0);
			for (@Pc(48) int local48 = 0; local48 < Static53.anInt1184; local48++) {
				@Pc(62) int local62 = (local46[local48] - local30[local48]) * this.anInt1920;
				@Pc(66) int local66 = local62 >> 12;
				@Pc(86) int local86 = (local36[Static27.anInt588 & local48 + 1] - local36[Static27.anInt588 & local48 - 1]) * this.anInt1920;
				@Pc(90) int local90 = local86 >> 12;
				@Pc(96) int local96 = local90 * local90 >> 12;
				@Pc(102) int local102 = local66 * local66 >> 12;
				@Pc(115) int local115 = (int) (Math.sqrt((double) ((local102 + local96 + 4096) / 4096)) * 4096.0D);
				@Pc(123) int local123 = local115 == 0 ? 0 : 16777216 / local115;
				local11[local48] = 4096 - local123;
			}
		}
		return local11;
	}
}
