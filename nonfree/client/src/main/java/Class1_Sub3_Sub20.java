import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!le")
public final class Class1_Sub3_Sub20 extends Class1_Sub3 {

	@OriginalMember(owner = "client!le", name = "M", descriptor = "I")
	private int anInt4102 = 3072;

	@OriginalMember(owner = "client!le", name = "P", descriptor = "I")
	private int anInt4105 = 1024;

	@OriginalMember(owner = "client!le", name = "I", descriptor = "I")
	private int anInt4099 = 2048;

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub20() {
		super(1, false);
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6083(@OriginalArg(1) int arg0) {
		@Pc(17) int[][] local17 = super.aClass20_41.method474(arg0);
		if (super.aClass20_41.aBoolean14) {
			@Pc(27) int[][] local27 = this.method6072(0, arg0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			@Pc(43) int[] local43 = local17[0];
			@Pc(47) int[] local47 = local17[1];
			@Pc(51) int[] local51 = local17[2];
			for (@Pc(53) int local53 = 0; local53 < Static347.anInt5974; local53++) {
				local43[local53] = this.anInt4105 + (local31[local53] * this.anInt4099 >> 12);
				local47[local53] = (this.anInt4099 * local35[local53] >> 12) + this.anInt4105;
				local51[local53] = (this.anInt4099 * local39[local53] >> 12) + this.anInt4105;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Lclient!lh;II)V")
	@Override
	public void method6079(@OriginalArg(0) Class1_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4105 = arg0.method4093();
		} else if (arg1 == 1) {
			this.anInt4102 = arg0.method4093();
		} else if (arg1 == 2) {
			super.aBoolean494 = arg0.method4130() == 1;
		}
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6084(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass172_41.method3962(arg0);
		if (super.aClass172_41.aBoolean327) {
			@Pc(27) int[] local27 = this.method6076(0, arg0);
			for (@Pc(29) int local29 = 0; local29 < Static347.anInt5974; local29++) {
				local17[local29] = this.anInt4105 + (local27[local29] * this.anInt4099 >> 12);
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!le", name = "d", descriptor = "(I)V")
	@Override
	public void method6074() {
		this.anInt4099 = this.anInt4102 - this.anInt4105;
	}
}
