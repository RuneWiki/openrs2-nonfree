import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pa")
public final class Class5_Sub3_Sub26 extends Class5_Sub3 {

	@OriginalMember(owner = "client!pa", name = "T", descriptor = "I")
	private int anInt4816 = 1024;

	@OriginalMember(owner = "client!pa", name = "Q", descriptor = "I")
	private int anInt4814 = 2048;

	@OriginalMember(owner = "client!pa", name = "R", descriptor = "I")
	private int anInt4815 = 3072;

	@OriginalMember(owner = "client!pa", name = "<init>", descriptor = "()V")
	public Class5_Sub3_Sub26() {
		super(1, false);
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lclient!rg;BI)V")
	@Override
	public void method6017(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4816 = arg0.method5106();
		} else if (arg1 == 1) {
			this.anInt4815 = arg0.method5106();
		} else if (arg1 == 2) {
			super.aBoolean592 = arg0.method5115() == 1;
		}
	}

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "(I)V")
	@Override
	public void method6010() {
		this.anInt4814 = this.anInt4815 - this.anInt4816;
	}

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(IB)[I")
	@Override
	public int[] method6011(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass188_41.method5318(arg0);
		if (super.aClass188_41.aBoolean490) {
			@Pc(29) int[] local29 = this.method6020(0, arg0);
			for (@Pc(31) int local31 = 0; local31 < Static7.anInt129; local31++) {
				local17[local31] = (this.anInt4814 * local29[local31] >> 12) + this.anInt4816;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method6016(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass53_41.method969(arg0);
		if (super.aClass53_41.aBoolean83) {
			@Pc(26) int[][] local26 = this.method6023(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local11[0];
			@Pc(46) int[] local46 = local11[1];
			@Pc(50) int[] local50 = local11[2];
			for (@Pc(52) int local52 = 0; local52 < Static7.anInt129; local52++) {
				local42[local52] = this.anInt4816 + (this.anInt4814 * local30[local52] >> 12);
				local46[local52] = this.anInt4816 + (this.anInt4814 * local34[local52] >> 12);
				local50[local52] = this.anInt4816 + (this.anInt4814 * local38[local52] >> 12);
			}
		}
		return local11;
	}
}
