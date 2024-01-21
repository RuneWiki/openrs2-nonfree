import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rg")
public final class Class1_Sub2_Sub33 extends Class1_Sub2 {

	@OriginalMember(owner = "client!rg", name = "bb", descriptor = "I")
	private int anInt3639;

	@OriginalMember(owner = "client!rg", name = "nb", descriptor = "I")
	private int anInt3644;

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lclient!jg;II)V")
	@Override
	public void method3120(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3644 = arg0.method878();
		} else if (arg1 == 1) {
			this.anInt3639 = arg0.method878();
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3126(@OriginalArg(1) int arg0) {
		@Pc(12) int[] local12 = super.aClass5_39.method168(arg0);
		if (super.aClass5_39.aBoolean16) {
			@Pc(22) int[] local22 = this.method3130(0, arg0);
			for (@Pc(24) int local24 = 0; local24 < Static110.anInt2825; local24++) {
				@Pc(30) int local30 = local22[local24];
				local12[local24] = local30 >= this.anInt3644 && local30 <= this.anInt3639 ? 4096 : 0;
			}
		}
		return local12;
	}
}
