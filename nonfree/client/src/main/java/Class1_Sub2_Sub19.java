import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!k")
public final class Class1_Sub2_Sub19 extends Class1_Sub2 {

	@OriginalMember(owner = "client!k", name = "fb", descriptor = "I")
	private int anInt2233;

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Lclient!jg;II)V")
	@Override
	public void method3120(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2233 = arg0.method878();
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3126(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass5_39.method168(arg0);
		if (super.aClass5_39.aBoolean16) {
			@Pc(30) int[] local30 = this.method3130(0, arg0 - 1 & Static64.anInt1680);
			@Pc(36) int[] local36 = this.method3130(0, arg0);
			@Pc(46) int[] local46 = this.method3130(0, Static64.anInt1680 & arg0 + 1);
			for (@Pc(48) int local48 = 0; local48 < Static110.anInt2825; local48++) {
				@Pc(62) int local62 = (local46[local48] - local30[local48]) * this.anInt2233;
				@Pc(82) int local82 = (local36[local48 + 1 & Static99.anInt2523] - local36[local48 - 1 & Static99.anInt2523]) * this.anInt2233;
				@Pc(86) int local86 = local82 >> 12;
				@Pc(90) int local90 = local62 >> 12;
				@Pc(96) int local96 = local86 * local86 >> 12;
				@Pc(102) int local102 = local90 * local90 >> 12;
				@Pc(115) int local115 = (int) (Math.sqrt((double) ((local102 + local96 + 4096) / 4096)) * 4096.0D);
				@Pc(123) int local123 = local115 == 0 ? 0 : 16777216 / local115;
				local16[local48] = 4096 - local123;
			}
		}
		return local16;
	}
}
